
<h2 title="Class TurtleGraphics" class="title">Class TurtleGraphics</h2>
</div>
<div class="contentContainer">
<ul class="inheritance">
<li>java.lang.Object</li>
<li>
<ul class="inheritance">
<li>java.awt.Component</li>
<li>
<ul class="inheritance">
<li>java.awt.Container</li>
<li>
<ul class="inheritance">
<li>javax.swing.JComponent</li>
<li>
<ul class="inheritance">
<li>javax.swing.JPanel</li>
<li>
<ul class="inheritance">
<li>uk.ac.leedsbeckett.oop.TurtleGraphics</li>
</ul>
</li>
</ul>
</li>
</ul>
</li>
</ul>
</li>
</ul>
</li>
</ul>
<div class="description">
<ul class="blockList">
<li class="blockList">
<dl>
<dt>All Implemented Interfaces:</dt>
<dd>java.awt.image.ImageObserver, java.awt.MenuContainer, java.io.Serializable, javax.accessibility.Accessible</dd>
</dl>
<hr>
<br>
<pre>public class <span class="typeNameLabel">TurtleGraphics</span>
extends javax.swing.JPanel</pre>
<div class="block"><h1>TurtleGraphics</h1>
 extended JPanel with simple drawing commands and a visual representation of a turtle to perform "turtle graphics" drawing operations.
 the jar file should be added to your build path.
 right click on your project, select "Build Path-Add External Archive" and add jar file.
 It will appear in your project explorer under "referenced libraries", inside the jar will be TurtleGraphics.class
 Don't forget to look at the inherited methods from JPanel and above, which will also be if use.</div>
<dl>
<dt><span class="simpleTagLabel">Since:</span></dt>
<dd>12/2018</dd>
<dt><span class="simpleTagLabel">Version:</span></dt>
<dd>1.5 Mar 2020
 All software has bugs, if you find one please report to author. Ensure you have the latest version
 V1.3 adds setPanelSize() to resize the turtle area
 V1.4 adds getBufferedImage()
 *V1.5 adds setBufferdImage()
 V1.6 adds reset() to make resetting the turtle very, very easy.
<h2> example code </h2>
 <pre>
package whateverMyPackageIs;

import uk.ac.leedsbeckett.oop.TurtleGraphics;

import javax.swing.JFrame;

public class MainClass {

        public static void main(String[] args) 
        {
                TurtleGraphics gp = new TurtleGraphics();
                JFrame MainFrame = new JFrame();
                MainFrame.add(gp);
                MainFrame.setSize(640, 480);
                MainFrame.setVisible(true);;
                gp.about();

        }

}
</pre></dd>
<dt><span class="simpleTagLabel">Author:</span></dt>
<dd>Duncan Mullier</dd>
<dt><span class="seeLabel">See Also:</span></dt>
<dd><a href="../../../../serialized-form.html#uk.ac.leedsbeckett.oop.TurtleGraphics">Serialized Form</a></dd>
</dl>
</li>
</ul>
</div>
<div class="summary">
<ul class="blockList">
<li class="blockList">
<!-- ======== NESTED CLASS SUMMARY ======== -->
<ul class="blockList">
<li class="blockList"><a name="nested.class.summary">
<!--   -->
</a>
<h3>Nested Class Summary</h3>
<ul class="blockList">
<li class="blockList"><a name="nested.classes.inherited.from.class.javax.swing.JPanel">
<!--   -->
</a>
<h3>Nested classes/interfaces inherited from class&nbsp;javax.swing.JPanel</h3>
<code>javax.swing.JPanel.AccessibleJPanel</code></li>
</ul>
<ul class="blockList">
<li class="blockList"><a name="nested.classes.inherited.from.class.javax.swing.JComponent">
<!--   -->
</a>
<h3>Nested classes/interfaces inherited from class&nbsp;javax.swing.JComponent</h3>
<code>javax.swing.JComponent.AccessibleJComponent</code></li>
</ul>
<ul class="blockList">
<li class="blockList"><a name="nested.classes.inherited.from.class.java.awt.Container">
<!--   -->
</a>
<h3>Nested classes/interfaces inherited from class&nbsp;java.awt.Container</h3>
<code>java.awt.Container.AccessibleAWTContainer</code></li>
</ul>
<ul class="blockList">
<li class="blockList"><a name="nested.classes.inherited.from.class.java.awt.Component">
<!--   -->
</a>
<h3>Nested classes/interfaces inherited from class&nbsp;java.awt.Component</h3>
<code>java.awt.Component.AccessibleAWTComponent, java.awt.Component.BaselineResizeBehavior, java.awt.Component.BltBufferStrategy, java.awt.Component.FlipBufferStrategy</code></li>
</ul>
</li>
</ul>
<!-- =========== FIELD SUMMARY =========== -->
<ul class="blockList">
<li class="blockList"><a name="field.summary">
<!--   -->
</a>
<h3>Field Summary</h3>
<table class="memberSummary" border="0" cellpadding="3" cellspacing="0" summary="Field Summary table, listing fields, and an explanation">
<caption><span>Fields</span><span class="tabEnd">&nbsp;</span></caption>
<tr>
<th class="colFirst" scope="col">Modifier and Type</th>
<th class="colLast" scope="col">Field and Description</th>
</tr>
<tr class="altColor">
<td class="colFirst"><code>protected int</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#direction">direction</a></span></code>
<div class="block">direction the turtle is pointing in in degrees</div>
</td>
</tr>
<tr class="rowColor">
<td class="colFirst"><code>protected java.awt.Color</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#PenColour">PenColour</a></span></code>
<div class="block">Colour of the pen the turtle draws with (A Java Color)</div>
</td>
</tr>
<tr class="altColor">
<td class="colFirst"><code>protected boolean</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#penDown">penDown</a></span></code>
<div class="block">a moving turtle will draw if this is true and not if it is false (set by penDown and PenUp methods)</div>
</td>
</tr>
<tr class="rowColor">
<td class="colFirst"><code>protected int</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#sleepPeriod">sleepPeriod</a></span></code>
<div class="block">delay for turtle animation</div>
</td>
</tr>
<tr class="altColor">
<td class="colFirst"><code>protected int</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#xPos">xPos</a></span></code>
<div class="block">x position of the turtle on the screen</div>
</td>
</tr>
<tr class="rowColor">
<td class="colFirst"><code>protected int</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#yPos">yPos</a></span></code>
<div class="block">y position of the turtle on the screen</div>
</td>
</tr>
</table>
<ul class="blockList">
<li class="blockList"><a name="fields.inherited.from.class.javax.swing.JComponent">
<!--   -->
</a>
<h3>Fields inherited from class&nbsp;javax.swing.JComponent</h3>
<code>listenerList, TOOL_TIP_TEXT_KEY, ui, UNDEFINED_CONDITION, WHEN_ANCESTOR_OF_FOCUSED_COMPONENT, WHEN_FOCUSED, WHEN_IN_FOCUSED_WINDOW</code></li>
</ul>
<ul class="blockList">
<li class="blockList"><a name="fields.inherited.from.class.java.awt.Component">
<!--   -->
</a>
<h3>Fields inherited from class&nbsp;java.awt.Component</h3>
<code>accessibleContext, BOTTOM_ALIGNMENT, CENTER_ALIGNMENT, LEFT_ALIGNMENT, RIGHT_ALIGNMENT, TOP_ALIGNMENT</code></li>
</ul>
<ul class="blockList">
<li class="blockList"><a name="fields.inherited.from.class.java.awt.image.ImageObserver">
<!--   -->
</a>
<h3>Fields inherited from interface&nbsp;java.awt.image.ImageObserver</h3>
<code>ABORT, ALLBITS, ERROR, FRAMEBITS, HEIGHT, PROPERTIES, SOMEBITS, WIDTH</code></li>
</ul>
</li>
</ul>
<!-- ======== CONSTRUCTOR SUMMARY ======== -->
<ul class="blockList">
<li class="blockList"><a name="constructor.summary">
<!--   -->
</a>
<h3>Constructor Summary</h3>
<table class="memberSummary" border="0" cellpadding="3" cellspacing="0" summary="Constructor Summary table, listing constructors, and an explanation">
<caption><span>Constructors</span><span class="tabEnd">&nbsp;</span></caption>
<tr>
<th class="colOne" scope="col">Constructor and Description</th>
</tr>
<tr class="altColor">
<td class="colOne"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#TurtleGraphics--">TurtleGraphics</a></span>()</code>
<div class="block">Constructor.</div>
</td>
</tr>
</table>
</li>
</ul>
<!-- ========== METHOD SUMMARY =========== -->
<ul class="blockList">
<li class="blockList"><a name="method.summary">
<!--   -->
</a>
<h3>Method Summary</h3>
<table class="memberSummary" border="0" cellpadding="3" cellspacing="0" summary="Method Summary table, listing methods, and an explanation">
<caption><span id="t0" class="activeTableTab"><span>All Methods</span><span class="tabEnd">&nbsp;</span></span><span id="t2" class="tableTab"><span><a href="javascript:show(2);">Instance Methods</a></span><span class="tabEnd">&nbsp;</span></span><span id="t4" class="tableTab"><span><a href="javascript:show(8);">Concrete Methods</a></span><span class="tabEnd">&nbsp;</span></span></caption>
<tr>
<th class="colFirst" scope="col">Modifier and Type</th>
<th class="colLast" scope="col">Method and Description</th>
</tr>
<tr id="i0" class="altColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#about--">about</a></span>()</code>
<div class="block">draws a simple graphic on the canvas and reports the version number of this class</div>
</td>
</tr>
<tr id="i1" class="rowColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#circle-int-">circle</a></span>(int&nbsp;radius)</code>
<div class="block">unimplemented circle command</div>
</td>
</tr>
<tr id="i2" class="altColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#clear--">clear</a></span>()</code>
<div class="block">Clears the image contents with the current background colour.</div>
</td>
</tr>
<tr id="i3" class="rowColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#drawLine-java.awt.Color-int-int-int-int-">drawLine</a></span>(java.awt.Color&nbsp;color,
        int&nbsp;x1,
        int&nbsp;y1,
        int&nbsp;x2,
        int&nbsp;y2)</code>
<div class="block">draws a line directly on the panel without affecting the turtle</div>
</td>
</tr>
<tr id="i4" class="altColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#forward-int-">forward</a></span>(int&nbsp;distance)</code>
<div class="block">move the turtle (in the direction it is pointing) by {distance} pixels.</div>
</td>
</tr>
<tr id="i5" class="rowColor">
<td class="colFirst"><code>java.awt.Color</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#getBackground_Col--">getBackground_Col</a></span>()</code>
<div class="block">gets the background colour used by clear() to fill the panel.</div>
</td>
</tr>
<tr id="i6" class="altColor">
<td class="colFirst"><code>java.awt.image.BufferedImage</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#getBufferedImage--">getBufferedImage</a></span>()</code>
<div class="block">return a BufferedImage of he display, so that it can be saved</div>
</td>
</tr>
<tr id="i7" class="rowColor">
<td class="colFirst"><code>int</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#getDirection--">getDirection</a></span>()</code>
<div class="block">getDirection gets the direction the turtle is pointing in.</div>
</td>
</tr>
<tr id="i8" class="altColor">
<td class="colFirst"><code>java.awt.Graphics</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#getGraphicsConext--">getGraphicsConext</a></span>()</code>
<div class="block">returns the graphicsContext of the Turtle display so you can drw on it using the normal Java drawing methods</div>
</td>
</tr>
<tr id="i9" class="rowColor">
<td class="colFirst"><code>java.awt.Graphics</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#getGraphicsContext--">getGraphicsContext</a></span>()</code>
<div class="block">returns the graphicsContext (same as above but spelt correctly) of the Turtle display so you can drw on it using the normal Java drawing methods</div>
</td>
</tr>
<tr id="i10" class="altColor">
<td class="colFirst"><code>java.awt.Color</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#getPenColour--">getPenColour</a></span>()</code>
<div class="block">getPenColour returns the colour that the turtle draws in</div>
</td>
</tr>
<tr id="i11" class="rowColor">
<td class="colFirst"><code>int</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#getxPos--">getxPos</a></span>()</code>
<div class="block">get the x position of the turtle</div>
</td>
</tr>
<tr id="i12" class="altColor">
<td class="colFirst"><code>int</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#getyPos--">getyPos</a></span>()</code>
<div class="block">get the y position of the turtle</div>
</td>
</tr>
<tr id="i13" class="rowColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#paint-java.awt.Graphics-">paint</a></span>(java.awt.Graphics&nbsp;g)</code>
<div class="block">overridden paint method to handle image updating (do not call directly, use repaint();)</div>
</td>
</tr>
<tr id="i14" class="altColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#penDown--">penDown</a></span>()</code>
<div class="block">puts pen down so a line will be drawn when the turtle is moved</div>
</td>
</tr>
<tr id="i15" class="rowColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#penUp--">penUp</a></span>()</code>
<div class="block">puts pen up so a line will not be drawn when turtle is moved</div>
</td>
</tr>
<tr id="i16" class="altColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#reset--">reset</a></span>()</code>
<div class="block">reset() moves turtle to initial position</div>
</td>
</tr>
<tr id="i17" class="rowColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#setBackground_Col-java.awt.Color-">setBackground_Col</a></span>(java.awt.Color&nbsp;background_Col)</code>
<div class="block">sets the background colour used by clear() to fill the panel.</div>
</td>
</tr>
<tr id="i18" class="altColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#setBufferedImage-java.awt.image.BufferedImage-">setBufferedImage</a></span>(java.awt.image.BufferedImage&nbsp;newImage)</code>
<div class="block">sets the background image to be the passed in BufferedImage</div>
</td>
</tr>
<tr id="i19" class="rowColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#setPanelSize-int-int-">setPanelSize</a></span>(int&nbsp;xSize,
            int&nbsp;ySize)</code>
<div class="block">Resize the turtle area, current display will be lost.</div>
</td>
</tr>
<tr id="i20" class="altColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#setPenColour-java.awt.Color-">setPenColour</a></span>(java.awt.Color&nbsp;col)</code>
<div class="block">setPenColour sets the colour that the turtle will draw in</div>
</td>
</tr>
<tr id="i21" class="rowColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#setPreferredSize-int-int-">setPreferredSize</a></span>(int&nbsp;width,
                int&nbsp;height)</code>&nbsp;</td>
</tr>
<tr id="i22" class="altColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#setTurtleImage-java.lang.String-">setTurtleImage</a></span>(java.lang.String&nbsp;filename)</code>
<div class="block">Replace the standard turtle image with given image
 give full path or store in application directory
 don't make the image too big, have background of the image transparent and it should be pointing right (90 degrees)
 best to make the image have a transparent background(Google it).</div>
</td>
</tr>
<tr id="i23" class="rowColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#setTurtleSpeed-int-">setTurtleSpeed</a></span>(int&nbsp;speed)</code>
<div class="block">sets the speed of the turtle's movement.</div>
</td>
</tr>
<tr id="i24" class="altColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#setxPos-int-">setxPos</a></span>(int&nbsp;xPos)</code>
<div class="block">manually set the x position of the turtle (i.e.</div>
</td>
</tr>
<tr id="i25" class="rowColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#setyPos-int-">setyPos</a></span>(int&nbsp;yPos)</code>
<div class="block">manually set the y position of the turtle (i.e.</div>
</td>
</tr>
<tr id="i26" class="altColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#turnLeft--">turnLeft</a></span>()</code>
<div class="block">turtle is rotated 90 degrees to the left.</div>
</td>
</tr>
<tr id="i27" class="rowColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#turnLeft-int-">turnLeft</a></span>(int&nbsp;amount)</code>
<div class="block">turtle is rotated 90 degrees to the right by amount degrees.</div>
</td>
</tr>
<tr id="i28" class="altColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#turnRight--">turnRight</a></span>()</code>
<div class="block">turtle is rotated 90 degrees to the right.</div>
</td>
</tr>
<tr id="i29" class="rowColor">
<td class="colFirst"><code>void</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../../../../uk/ac/leedsbeckett/oop/TurtleGraphics.html#turnRight-int-">turnRight</a></span>(int&nbsp;amount)</code>
<div class="block">turtle is rotated 90 degrees to the right by amount degrees.</div>
</td>
</tr>
</table>
<ul class="blockList">
<li class="blockList"><a name="methods.inherited.from.class.javax.swing.JPanel">
<!--   -->
</a>
<h3>Methods inherited from class&nbsp;javax.swing.JPanel</h3>
<code>getAccessibleContext, getUI, getUIClassID, paramString, setUI, updateUI</code></li>
</ul>
<ul class="blockList">
<li class="blockList"><a name="methods.inherited.from.class.javax.swing.JComponent">
<!--   -->
</a>
<h3>Methods inherited from class&nbsp;javax.swing.JComponent</h3>
<code>addAncestorListener, addNotify, addVetoableChangeListener, computeVisibleRect, contains, createToolTip, disable, enable, firePropertyChange, firePropertyChange, firePropertyChange, fireVetoableChange, getActionForKeyStroke, getActionMap, getAlignmentX, getAlignmentY, getAncestorListeners, getAutoscrolls, getBaseline, getBaselineResizeBehavior, getBorder, getBounds, getClientProperty, getComponentGraphics, getComponentPopupMenu, getConditionForKeyStroke, getDebugGraphicsOptions, getDefaultLocale, getFontMetrics, getGraphics, getHeight, getInheritsPopupMenu, getInputMap, getInputMap, getInputVerifier, getInsets, getInsets, getListeners, getLocation, getMaximumSize, getMinimumSize, getNextFocusableComponent, getPopupLocation, getPreferredSize, getRegisteredKeyStrokes, getRootPane, getSize, getToolTipLocation, getToolTipText, getToolTipText, getTopLevelAncestor, getTransferHandler, getVerifyInputWhenFocusTarget, getVetoableChangeListeners, getVisibleRect, getWidth, getX, getY, grabFocus, hide, isDoubleBuffered, isLightweightComponent, isManagingFocus, isOpaque, isOptimizedDrawingEnabled, isPaintingForPrint, isPaintingOrigin, isPaintingTile, isRequestFocusEnabled, isValidateRoot, paintBorder, paintChildren, paintComponent, paintImmediately, paintImmediately, print, printAll, printBorder, printChildren, printComponent, processComponentKeyEvent, processKeyBinding, processKeyEvent, processMouseEvent, processMouseMotionEvent, putClientProperty, registerKeyboardAction, registerKeyboardAction, removeAncestorListener, removeNotify, removeVetoableChangeListener, repaint, repaint, requestDefaultFocus, requestFocus, requestFocus, requestFocusInWindow, requestFocusInWindow, resetKeyboardActions, reshape, revalidate, scrollRectToVisible, setActionMap, setAlignmentX, setAlignmentY, setAutoscrolls, setBackground, setBorder, setComponentPopupMenu, setDebugGraphicsOptions, setDefaultLocale, setDoubleBuffered, setEnabled, setFocusTraversalKeys, setFont, setForeground, setInheritsPopupMenu, setInputMap, setInputVerifier, setMaximumSize, setMinimumSize, setNextFocusableComponent, setOpaque, setPreferredSize, setRequestFocusEnabled, setToolTipText, setTransferHandler, setUI, setVerifyInputWhenFocusTarget, setVisible, unregisterKeyboardAction, update</code></li>
</ul>
<ul class="blockList">
<li class="blockList"><a name="methods.inherited.from.class.java.awt.Container">
<!--   -->
</a>
<h3>Methods inherited from class&nbsp;java.awt.Container</h3>
<code>add, add, add, add, add, addContainerListener, addImpl, addPropertyChangeListener, addPropertyChangeListener, applyComponentOrientation, areFocusTraversalKeysSet, countComponents, deliverEvent, doLayout, findComponentAt, findComponentAt, getComponent, getComponentAt, getComponentAt, getComponentCount, getComponents, getComponentZOrder, getContainerListeners, getFocusTraversalKeys, getFocusTraversalPolicy, getLayout, getMousePosition, insets, invalidate, isAncestorOf, isFocusCycleRoot, isFocusCycleRoot, isFocusTraversalPolicyProvider, isFocusTraversalPolicySet, layout, list, list, locate, minimumSize, paintComponents, preferredSize, printComponents, processContainerEvent, processEvent, remove, remove, removeAll, removeContainerListener, setComponentZOrder, setFocusCycleRoot, setFocusTraversalPolicy, setFocusTraversalPolicyProvider, setLayout, transferFocusDownCycle, validate, validateTree</code></li>
</ul>
<ul class="blockList">
<li class="blockList"><a name="methods.inherited.from.class.java.awt.Component">
<!--   -->
</a>
<h3>Methods inherited from class&nbsp;java.awt.Component</h3>
<code>action, add, addComponentListener, addFocusListener, addHierarchyBoundsListener, addHierarchyListener, addInputMethodListener, addKeyListener, addMouseListener, addMouseMotionListener, addMouseWheelListener, bounds, checkImage, checkImage, coalesceEvents, contains, createImage, createImage, createVolatileImage, createVolatileImage, disableEvents, dispatchEvent, enable, enableEvents, enableInputMethods, firePropertyChange, firePropertyChange, firePropertyChange, firePropertyChange, firePropertyChange, firePropertyChange, getBackground, getBounds, getColorModel, getComponentListeners, getComponentOrientation, getCursor, getDropTarget, getFocusCycleRootAncestor, getFocusListeners, getFocusTraversalKeysEnabled, getFont, getForeground, getGraphicsConfiguration, getHierarchyBoundsListeners, getHierarchyListeners, getIgnoreRepaint, getInputContext, getInputMethodListeners, getInputMethodRequests, getKeyListeners, getLocale, getLocation, getLocationOnScreen, getMouseListeners, getMouseMotionListeners, getMousePosition, getMouseWheelListeners, getName, getParent, getPeer, getPropertyChangeListeners, getPropertyChangeListeners, getSize, getToolkit, getTreeLock, gotFocus, handleEvent, hasFocus, imageUpdate, inside, isBackgroundSet, isCursorSet, isDisplayable, isEnabled, isFocusable, isFocusOwner, isFocusTraversable, isFontSet, isForegroundSet, isLightweight, isMaximumSizeSet, isMinimumSizeSet, isPreferredSizeSet, isShowing, isValid, isVisible, keyDown, keyUp, list, list, list, location, lostFocus, mouseDown, mouseDrag, mouseEnter, mouseExit, mouseMove, mouseUp, move, nextFocus, paintAll, postEvent, prepareImage, prepareImage, processComponentEvent, processFocusEvent, processHierarchyBoundsEvent, processHierarchyEvent, processInputMethodEvent, processMouseWheelEvent, remove, removeComponentListener, removeFocusListener, removeHierarchyBoundsListener, removeHierarchyListener, removeInputMethodListener, removeKeyListener, removeMouseListener, removeMouseMotionListener, removeMouseWheelListener, removePropertyChangeListener, removePropertyChangeListener, repaint, repaint, repaint, resize, resize, setBounds, setBounds, setComponentOrientation, setCursor, setDropTarget, setFocusable, setFocusTraversalKeysEnabled, setIgnoreRepaint, setLocale, setLocation, setLocation, setName, setSize, setSize, show, show, size, toString, transferFocus, transferFocusBackward, transferFocusUpCycle</code></li>
</ul>
<ul class="blockList">
<li class="blockList"><a name="methods.inherited.from.class.java.lang.Object">
<!--   -->
</a>
<h3>Methods inherited from class&nbsp;java.lang.Object</h3>
<code>clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait</code></li>
</ul>
</li>
</ul>
</li>
</ul>
</div>
<div class="details">
<ul class="blockList">
<li class="blockList">
<!-- ============ FIELD DETAIL =========== -->
<ul class="blockList">
<li class="blockList"><a name="field.detail">
<!--   -->
</a>
<h3>Field Detail</h3>
<a name="PenColour">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>PenColour</h4>
<pre>protected&nbsp;java.awt.Color PenColour</pre>
<div class="block">Colour of the pen the turtle draws with (A Java Color)</div>
</li>
</ul>
<a name="penDown">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>penDown</h4>
<pre>protected&nbsp;boolean penDown</pre>
<div class="block">a moving turtle will draw if this is true and not if it is false (set by penDown and PenUp methods)</div>
</li>
</ul>
<a name="xPos">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>xPos</h4>
<pre>protected&nbsp;int xPos</pre>
<div class="block">x position of the turtle on the screen</div>
</li>
</ul>
<a name="yPos">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>yPos</h4>
<pre>protected&nbsp;int yPos</pre>
<div class="block">y position of the turtle on the screen</div>
</li>
</ul>
<a name="direction">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>direction</h4>
<pre>protected&nbsp;int direction</pre>
<div class="block">direction the turtle is pointing in in degrees</div>
</li>
</ul>
<a name="sleepPeriod">
<!--   -->
</a>
<ul class="blockListLast">
<li class="blockList">
<h4>sleepPeriod</h4>
<pre>protected&nbsp;int sleepPeriod</pre>
<div class="block">delay for turtle animation</div>
</li>
</ul>
</li>
</ul>
<!-- ========= CONSTRUCTOR DETAIL ======== -->
<ul class="blockList">
<li class="blockList"><a name="constructor.detail">
<!--   -->
</a>
<h3>Constructor Detail</h3>
<a name="TurtleGraphics--">
<!--   -->
</a>
<ul class="blockListLast">
<li class="blockList">
<h4>TurtleGraphics</h4>
<pre>public&nbsp;TurtleGraphics()</pre>
<div class="block">Constructor.
 Create a panel with pen set to the middle and turtle pointing down the screen
 The pen is up.</div>
</li>
</ul>
</li>
</ul>
<!-- ============ METHOD DETAIL ========== -->
<ul class="blockList">
<li class="blockList"><a name="method.detail">
<!--   -->
</a>
<h3>Method Detail</h3>
<a name="getGraphicsConext--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>getGraphicsConext</h4>
<pre>public&nbsp;java.awt.Graphics&nbsp;getGraphicsConext()</pre>
<div class="block">returns the graphicsContext of the Turtle display so you can drw on it using the normal Java drawing methods</div>
<dl>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>graphics context</dd>
</dl>
</li>
</ul>
<a name="getGraphicsContext--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>getGraphicsContext</h4>
<pre>public&nbsp;java.awt.Graphics&nbsp;getGraphicsContext()</pre>
<div class="block">returns the graphicsContext (same as above but spelt correctly) of the Turtle display so you can drw on it using the normal Java drawing methods</div>
<dl>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>graphics context</dd>
</dl>
</li>
</ul>
<a name="getBufferedImage--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>getBufferedImage</h4>
<pre>public&nbsp;java.awt.image.BufferedImage&nbsp;getBufferedImage()</pre>
<div class="block">return a BufferedImage of he display, so that it can be saved</div>
<dl>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>BufferedImage of display</dd>
</dl>
</li>
</ul>
<a name="setBufferedImage-java.awt.image.BufferedImage-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>setBufferedImage</h4>
<pre>public&nbsp;void&nbsp;setBufferedImage(java.awt.image.BufferedImage&nbsp;newImage)</pre>
<div class="block">sets the background image to be the passed in BufferedImage</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>newImage</code> - saved BufferedImage</dd>
</dl>
</li>
</ul>
<a name="getPenColour--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>getPenColour</h4>
<pre>public&nbsp;java.awt.Color&nbsp;getPenColour()</pre>
<div class="block">getPenColour returns the colour that the turtle draws in</div>
<dl>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>Color pencolour</dd>
</dl>
</li>
</ul>
<a name="setPenColour-java.awt.Color-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>setPenColour</h4>
<pre>public&nbsp;void&nbsp;setPenColour(java.awt.Color&nbsp;col)</pre>
<div class="block">setPenColour sets the colour that the turtle will draw in</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>col</code> - Java Color</dd>
</dl>
</li>
</ul>
<a name="getDirection--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>getDirection</h4>
<pre>public&nbsp;int&nbsp;getDirection()</pre>
<div class="block">getDirection gets the direction the turtle is pointing in.</div>
<dl>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>direction in degrees</dd>
</dl>
</li>
</ul>
<a name="drawLine-java.awt.Color-int-int-int-int-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>drawLine</h4>
<pre>public&nbsp;void&nbsp;drawLine(java.awt.Color&nbsp;color,
                     int&nbsp;x1,
                     int&nbsp;y1,
                     int&nbsp;x2,
                     int&nbsp;y2)</pre>
<div class="block">draws a line directly on the panel without affecting the turtle</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>color</code> - colour to draw in</dd>
<dd><code>x1</code> - xpos of start of line</dd>
<dd><code>y1</code> - ypos of start of line</dd>
<dd><code>x2</code> - xpos of end of line</dd>
<dd><code>y2</code> - ypos of end of line</dd>
</dl>
</li>
</ul>
<a name="getBackground_Col--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>getBackground_Col</h4>
<pre>public&nbsp;java.awt.Color&nbsp;getBackground_Col()</pre>
<div class="block">gets the background colour used by clear() to fill the panel.</div>
<dl>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>the background_Col used when clear() is called.</dd>
</dl>
</li>
</ul>
<a name="setBackground_Col-java.awt.Color-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>setBackground_Col</h4>
<pre>public&nbsp;void&nbsp;setBackground_Col(java.awt.Color&nbsp;background_Col)</pre>
<div class="block">sets the background colour used by clear() to fill the panel.</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>background_Col</code> - the background_Col to set (used when clear() is called.).</dd>
</dl>
</li>
</ul>
<a name="getxPos--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>getxPos</h4>
<pre>public&nbsp;int&nbsp;getxPos()</pre>
<div class="block">get the x position of the turtle</div>
<dl>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>the xPos</dd>
</dl>
</li>
</ul>
<a name="setxPos-int-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>setxPos</h4>
<pre>public&nbsp;void&nbsp;setxPos(int&nbsp;xPos)</pre>
<div class="block">manually set the x position of the turtle (i.e. lift the turtle up and drop it).</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>xPos</code> - the xPos to set</dd>
</dl>
</li>
</ul>
<a name="getyPos--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>getyPos</h4>
<pre>public&nbsp;int&nbsp;getyPos()</pre>
<div class="block">get the y position of the turtle</div>
<dl>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>the yPos</dd>
</dl>
</li>
</ul>
<a name="setyPos-int-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>setyPos</h4>
<pre>public&nbsp;void&nbsp;setyPos(int&nbsp;yPos)</pre>
<div class="block">manually set the y position of the turtle (i.e. lift the turtle up and drop it).</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>yPos</code> - the yPos to set</dd>
</dl>
</li>
</ul>
<a name="about--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>about</h4>
<pre>public&nbsp;void&nbsp;about()</pre>
<div class="block">draws a simple graphic on the canvas and reports the version number of this class</div>
</li>
</ul>
<a name="setTurtleSpeed-int-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>setTurtleSpeed</h4>
<pre>public&nbsp;void&nbsp;setTurtleSpeed(int&nbsp;speed)</pre>
<div class="block">sets the speed of the turtle's movement.</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>speed</code> - 0 is fastest 1 for each microsecond of delay</dd>
</dl>
</li>
</ul>
<a name="penDown--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>penDown</h4>
<pre>public&nbsp;void&nbsp;penDown()</pre>
<div class="block">puts pen down so a line will be drawn when the turtle is moved</div>
</li>
</ul>
<a name="penUp--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>penUp</h4>
<pre>public&nbsp;void&nbsp;penUp()</pre>
<div class="block">puts pen up so a line will not be drawn when turtle is moved</div>
</li>
</ul>
<a name="turnRight--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>turnRight</h4>
<pre>public&nbsp;void&nbsp;turnRight()</pre>
<div class="block">turtle is rotated 90 degrees to the right. i.e. if it is facing upwards (north) before it will facing right (east) after</div>
</li>
</ul>
<a name="turnRight-int-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>turnRight</h4>
<pre>public&nbsp;void&nbsp;turnRight(int&nbsp;amount)</pre>
<div class="block">turtle is rotated 90 degrees to the right by amount degrees. i.e. it will rotate right by amount degrees        
 The turtle will wrap around if it goes beyond 360</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>amount</code> - degrees to rotate</dd>
</dl>
</li>
</ul>
<a name="turnLeft--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>turnLeft</h4>
<pre>public&nbsp;void&nbsp;turnLeft()</pre>
<div class="block">turtle is rotated 90 degrees to the left. i.e. if it is facing upwards (north) before it will facing left (west) after</div>
</li>
</ul>
<a name="turnLeft-int-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>turnLeft</h4>
<pre>public&nbsp;void&nbsp;turnLeft(int&nbsp;amount)</pre>
<div class="block">turtle is rotated 90 degrees to the right by amount degrees. i.e. it will rotate right by amount degrees        
 The turtle will wrap around if it goes beyond 360</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>amount</code> - degrees to rotate</dd>
</dl>
</li>
</ul>
<a name="forward-int-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>forward</h4>
<pre>public&nbsp;void&nbsp;forward(int&nbsp;distance)</pre>
<div class="block">move the turtle (in the direction it is pointing) by {distance} pixels. A line will be drawn if the pen is down, not if it is up</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>distance</code> - in pixels to move</dd>
</dl>
</li>
</ul>
<a name="clear--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>clear</h4>
<pre>public&nbsp;void&nbsp;clear()</pre>
<div class="block">Clears the image contents with the current background colour.</div>
</li>
</ul>
<a name="circle-int-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>circle</h4>
<pre>public&nbsp;void&nbsp;circle(int&nbsp;radius)</pre>
<div class="block">unimplemented circle command</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>radius</code> - radius of the circle to draw</dd>
</dl>
</li>
</ul>
<a name="paint-java.awt.Graphics-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>paint</h4>
<pre>public&nbsp;void&nbsp;paint(java.awt.Graphics&nbsp;g)</pre>
<div class="block">overridden paint method to handle image updating (do not call directly, use repaint();)</div>
<dl>
<dt><span class="overrideSpecifyLabel">Overrides:</span></dt>
<dd><code>paint</code>&nbsp;in class&nbsp;<code>javax.swing.JComponent</code></dd>
</dl>
</li>
</ul>
<a name="setPreferredSize-int-int-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>setPreferredSize</h4>
<pre>public&nbsp;void&nbsp;setPreferredSize(int&nbsp;width,
                             int&nbsp;height)</pre>
</li>
</ul>
<a name="setTurtleImage-java.lang.String-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>setTurtleImage</h4>
<pre>public&nbsp;void&nbsp;setTurtleImage(java.lang.String&nbsp;filename)</pre>
<div class="block">Replace the standard turtle image with given image
 give full path or store in application directory
 don't make the image too big, have background of the image transparent and it should be pointing right (90 degrees)
 best to make the image have a transparent background(Google it).</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>filename</code> - file or path to save the to</dd>
</dl>
</li>
</ul>
<a name="setPanelSize-int-int-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>setPanelSize</h4>
<pre>public&nbsp;void&nbsp;setPanelSize(int&nbsp;xSize,
                         int&nbsp;ySize)</pre>
<div class="block">Resize the turtle area, current display will be lost.</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>xSize</code> - width of panel</dd>
<dd><code>ySize</code> - height of panel</dd>
</dl>
</li>
</ul>
<a name="reset--">
<!--   -->
</a>
<ul class="blockListLast">
<li class="blockList">
<h4>reset</h4>
<pre>public&nbsp;void&nbsp;reset()</pre>
<div class="block">reset() moves turtle to initial position</div>
</li>
</ul>
</li>
</ul>
</li>
</ul>
</div>
</div>
<!-- ========= END OF CLASS DATA ========= -->
<!-- ======= START OF BOTTOM NAVBAR ====== -->
<div class="bottomNav"><a name="navbar.bottom">
<!--   -->
</a>
<div class="skipNav"><a href="#skip.navbar.bottom" title="Skip navigation links">Skip navigation links</a></div>
<a name="navbar.bottom.firstrow">
<!--   -->
</a>
<ul class="navList" title="Navigation">
<li><a href="../../../../uk/ac/leedsbeckett/oop/package-summary.html">Package</a></li>
<li class="navBarCell1Rev">Class</li>
<li><a href="class-use/TurtleGraphics.html">Use</a></li>
<li><a href="package-tree.html">Tree</a></li>
<li><a href="../../../../deprecated-list.html">Deprecated</a></li>
<li><a href="../../../../index-files/index-1.html">Index</a></li>
<li><a href="../../../../help-doc.html">Help</a></li>
</ul>
</div>
<div class="subNav">
<ul class="navList">
<li>Prev&nbsp;Class</li>
<li>Next&nbsp;Class</li>
</ul>
<ul class="navList">
<li><a href="../../../../index.html?uk/ac/leedsbeckett/oop/TurtleGraphics.html" target="_top">Frames</a></li>
<li><a href="TurtleGraphics.html" target="_top">No&nbsp;Frames</a></li>
</ul>
<ul class="navList" id="allclasses_navbar_bottom">
<li><a href="../../../../allclasses-noframe.html">All&nbsp;Classes</a></li>
</ul>
<div>
<script type="text/javascript"><!--
  allClassesLink = document.getElementById("allclasses_navbar_bottom");
  if(window==top) {
    allClassesLink.style.display = "block";
  }
  else {
    allClassesLink.style.display = "none";
  }
  //-->
</script>
</div>
<div>
<ul class="subNavList">
<li>Summary:&nbsp;</li>
<li><a href="#nested.classes.inherited.from.class.javax.swing.JPanel">Nested</a>&nbsp;|&nbsp;</li>
<li><a href="#field.summary">Field</a>&nbsp;|&nbsp;</li>
<li><a href="#constructor.summary">Constr</a>&nbsp;|&nbsp;</li>
<li><a href="#method.summary">Method</a></li>
</ul>
<ul class="subNavList">
<li>Detail:&nbsp;</li>
<li><a href="#field.detail">Field</a>&nbsp;|&nbsp;</li>
<li><a href="#constructor.detail">Constr</a>&nbsp;|&nbsp;</li>
<li><a href="#method.detail">Method</a></li>
</ul>
</div>
<a name="skip.navbar.bottom">
<!--   -->
</a></div>
<!-- ======== END OF BOTTOM NAVBAR ======= -->
</body>
</html>

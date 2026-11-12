package io.sentry.android.replay.viewhierarchy;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.SentryReplayModifiers;
import io.sentry.android.replay.util.ComposeTextLayout;
import io.sentry.android.replay.util.NodesKt;
import io.sentry.android.replay.util.TextAttributes;
import io.sentry.android.replay.util.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\b2\u0006\u0010\u0015\u001a\u00020\rH\u0002J\u001c\u0010\u0016\u001a\u00020\r*\u00020\b2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J$\u0010\u0017\u001a\u00020\u0018*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ComposeViewHierarchyNode;", "", "()V", "_rootCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "fromComposeNode", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "node", "Landroidx/compose/ui/node/LayoutNode;", "parent", "distance", "", "isComposeRoot", "", "options", "Lio/sentry/SentryOptions;", "fromView", "view", "Landroid/view/View;", "getProxyClassName", "", "isImage", "shouldMask", "traverse", "", "parentNode", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@TargetApi(26)
@SourceDebugExtension({"SMAP\nComposeViewHierarchyNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewHierarchyNode.kt\nio/sentry/android/replay/viewhierarchy/ComposeViewHierarchyNode\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,214:1\n652#2:215\n*S KotlinDebug\n*F\n+ 1 ComposeViewHierarchyNode.kt\nio/sentry/android/replay/viewhierarchy/ComposeViewHierarchyNode\n*L\n103#1:215\n*E\n"})
public final class ComposeViewHierarchyNode {

    @NotNull
    public static final ComposeViewHierarchyNode INSTANCE = new ComposeViewHierarchyNode();

    @Nullable
    private static LayoutCoordinates _rootCoordinates;

    private ComposeViewHierarchyNode() {
    }

    private final ViewHierarchyNode fromComposeNode(LayoutNode node, ViewHierarchyNode parent, int distance, boolean isComposeRoot, SentryOptions options) {
        TextLayoutInput layoutInput;
        TextStyle style;
        AccessibilityAction accessibilityAction;
        Function1 function1;
        if (!node.isPlaced() || !node.isAttached()) {
            return null;
        }
        if (isComposeRoot) {
            _rootCoordinates = LayoutCoordinatesKt.findRootCoordinates(node.getCoordinates());
        }
        SemanticsConfiguration collapsedSemantics$ui_release = node.getCollapsedSemantics$ui_release();
        Rect rectBoundsInWindow = NodesKt.boundsInWindow(node.getCoordinates(), _rootCoordinates);
        boolean z = !node.getOuterCoordinator$ui_release().isTransparent() && (collapsedSemantics$ui_release == null || !collapsedSemantics$ui_release.contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) && rectBoundsInWindow.height() > 0 && rectBoundsInWindow.width() > 0;
        boolean z2 = collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.contains(SemanticsActions.INSTANCE.getSetText());
        if ((collapsedSemantics$ui_release == null || !collapsedSemantics$ui_release.contains(SemanticsProperties.INSTANCE.getText())) && !z2) {
            Painter painterFindPainter = NodesKt.findPainter(node);
            if (painterFindPainter == null) {
                return new ViewHierarchyNode.GenericViewHierarchyNode(rectBoundsInWindow.left, rectBoundsInWindow.top, node.getWidth(), node.getHeight(), parent != null ? parent.getElevation() : 0.0f, distance, parent, z && shouldMask(node, false, options), false, z, rectBoundsInWindow);
            }
            boolean z3 = z && shouldMask(node, true, options);
            if (parent != null) {
                parent.setImportantForCaptureToAncestors(true);
            }
            return new ViewHierarchyNode.ImageViewHierarchyNode(rectBoundsInWindow.left, rectBoundsInWindow.top, node.getWidth(), node.getHeight(), parent != null ? parent.getElevation() : 0.0f, distance, parent, z3 && NodesKt.isMaskable(painterFindPainter), true, z, rectBoundsInWindow);
        }
        boolean z4 = z && shouldMask(node, false, options);
        if (parent != null) {
            parent.setImportantForCaptureToAncestors(true);
        }
        ArrayList arrayList = new ArrayList();
        if (collapsedSemantics$ui_release != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(collapsedSemantics$ui_release, SemanticsActions.INSTANCE.getGetTextLayoutResult())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
        }
        TextAttributes textAttributesFindTextAttributes = NodesKt.findTextAttributes(node);
        Color color = textAttributesFindTextAttributes.getColor();
        boolean hasFillModifier = textAttributesFindTextAttributes.getHasFillModifier();
        TextLayoutResult textLayoutResult = (TextLayoutResult) CollectionsKt___CollectionsKt.firstOrNull((List) arrayList);
        Color color2 = (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null || (style = layoutInput.getStyle()) == null) ? null : Color.box-impl(style.getColor-0d7_KjU());
        if (color2 == null || color2.unbox-impl() != Color.Companion.getUnspecified-0d7_KjU()) {
            color = color2;
        }
        return new ViewHierarchyNode.TextViewHierarchyNode((!(true ^ arrayList.isEmpty()) || z2) ? null : new ComposeTextLayout((TextLayoutResult) CollectionsKt___CollectionsKt.first((List) arrayList), hasFillModifier), color != null ? Integer.valueOf(ViewsKt.toOpaque(ColorKt.toArgb-8_81llA(color.unbox-impl()))) : null, 0, 0, rectBoundsInWindow.left, rectBoundsInWindow.top, node.getWidth(), node.getHeight(), parent != null ? parent.getElevation() : 0.0f, distance, parent, z4, true, z, rectBoundsInWindow, 12, null);
    }

    private final String getProxyClassName(LayoutNode layoutNode, boolean z) {
        SemanticsConfiguration collapsedSemantics$ui_release;
        if (z) {
            return "android.widget.ImageView";
        }
        SemanticsConfiguration collapsedSemantics$ui_release2 = layoutNode.getCollapsedSemantics$ui_release();
        return ((collapsedSemantics$ui_release2 == null || !collapsedSemantics$ui_release2.contains(SemanticsProperties.INSTANCE.getText())) && ((collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release()) == null || !collapsedSemantics$ui_release.contains(SemanticsActions.INSTANCE.getSetText()))) ? "android.view.View" : "android.widget.TextView";
    }

    private final boolean shouldMask(LayoutNode layoutNode, boolean z, SentryOptions sentryOptions) {
        SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        String str = collapsedSemantics$ui_release != null ? (String) SemanticsConfigurationKt.getOrNull(collapsedSemantics$ui_release, SentryReplayModifiers.INSTANCE.getSentryPrivacy()) : null;
        if (Intrinsics.areEqual(str, "unmask")) {
            return false;
        }
        if (Intrinsics.areEqual(str, "mask")) {
            return true;
        }
        String proxyClassName = getProxyClassName(layoutNode, z);
        if (sentryOptions.getExperimental().a().l().contains(proxyClassName)) {
            return false;
        }
        return sentryOptions.getExperimental().a().e().contains(proxyClassName);
    }

    private final void traverse(LayoutNode layoutNode, ViewHierarchyNode viewHierarchyNode, boolean z, SentryOptions sentryOptions) {
        List children$ui_release = layoutNode.getChildren$ui_release();
        if (children$ui_release.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(children$ui_release.size());
        int size = children$ui_release.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = (LayoutNode) children$ui_release.get(i);
            ViewHierarchyNode viewHierarchyNodeFromComposeNode = fromComposeNode(layoutNode2, viewHierarchyNode, i, z, sentryOptions);
            if (viewHierarchyNodeFromComposeNode != null) {
                arrayList.add(viewHierarchyNodeFromComposeNode);
                traverse(layoutNode2, viewHierarchyNodeFromComposeNode, false, sentryOptions);
            }
        }
        viewHierarchyNode.setChildren(arrayList);
    }

    public final boolean fromView(@NotNull View view, @Nullable ViewHierarchyNode parent, @NotNull SentryOptions options) {
        LayoutNode root;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(options, "options");
        String name = view.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "view::class.java.name");
        if (!StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) "AndroidComposeView", false, 2, (Object) null) || parent == null) {
            return false;
        }
        try {
            Owner owner = view instanceof Owner ? (Owner) view : null;
            if (owner != null && (root = owner.getRoot()) != null) {
                traverse(root, parent, true, options);
                return true;
            }
            return false;
        } catch (Throwable th) {
            options.getLogger().b(SentryLevel.ERROR, th, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
            return false;
        }
    }
}

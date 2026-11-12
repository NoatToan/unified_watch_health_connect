package kotlin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ch.qos.logback.core.CoreConstants;
import h5.e0;
import java.util.HashMap;
import p002j6.a;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R3\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR3\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007`\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0012"}, d2 = {"Li5/w0;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ljava/util/HashMap;", "Lj6/a;", "Lh5/e0;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "getHolderToLayoutNode", "()Ljava/util/HashMap;", "holderToLayoutNode", "b", "getLayoutNodeToHolder", "layoutNodeToHolder", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w0 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final HashMap<a, e0> holderToLayoutNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final HashMap<e0, a> layoutNodeToHolder;

    public w0(Context context) {
        super(context);
        setClipChildren(false);
        this.holderToLayoutNode = new HashMap<>();
        this.layoutNodeToHolder = new HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<a, e0> getHolderToLayoutNode() {
        return this.holderToLayoutNode;
    }

    public final HashMap<e0, a> getLayoutNodeToHolder() {
        return this.layoutNodeToHolder;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void onDescendantInvalidated(View view2, View view3) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        for (a aVar : this.holderToLayoutNode.keySet()) {
            aVar.layout(aVar.getLeft(), aVar.getTop(), aVar.getRight(), aVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        int i16;
        if (!(View.MeasureSpec.getMode(i14) == 1073741824)) {
            e5.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i15) == 1073741824)) {
            e5.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i14), View.MeasureSpec.getSize(i15));
        for (a aVar : this.holderToLayoutNode.keySet()) {
            int i17 = aVar.f97159x;
            if (i17 != Integer.MIN_VALUE && (i16 = aVar.f97160y) != Integer.MIN_VALUE) {
                aVar.measure(i17, i16);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            e0 e0Var = this.holderToLayoutNode.get(childAt);
            if (childAt.isLayoutRequested() && e0Var != null) {
                e0.j0(e0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

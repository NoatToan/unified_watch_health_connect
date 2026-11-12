package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.m1;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00028\u0000\"\n\b\u0000\u0010\u001c*\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/v;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/v;)V", "Landroid/animation/LayoutTransition;", "transition", "", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "a", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f7123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7124d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/FragmentContainerView$a;", "", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f7125a = new a();

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, v vVar) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        vVar.getClass();
        this.f7121a = new ArrayList();
        this.f7122b = new ArrayList();
        this.f7124d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e8.a.f63440b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id3 = getId();
        Fragment fragmentF = vVar.F(id3);
        if (classAttribute != null && fragmentF == null) {
            if (id3 == -1) {
                vb.h.z(am.j.m("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            Fragment fragmentInstantiate = vVar.P().instantiate(context.getClassLoader(), classAttribute);
            fragmentInstantiate.getClass();
            fragmentInstantiate.mFragmentId = id3;
            fragmentInstantiate.mContainerId = id3;
            fragmentInstantiate.mTag = string;
            fragmentInstantiate.mFragmentManager = vVar;
            fragmentInstantiate.mHost = vVar.f7393x;
            fragmentInstantiate.onInflate(context, attributeSet, (Bundle) null);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(vVar);
            aVar.f7250r = true;
            aVar.b(this, fragmentInstantiate, string);
            aVar.f();
        }
        vVar.Y(this);
    }

    public final void a(View view2) {
        if (this.f7122b.contains(view2)) {
            this.f7121a.add(view2);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view2, int i14, ViewGroup.LayoutParams layoutParams) {
        view2.getClass();
        Object tag = view2.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view2, i14, layoutParams);
        } else {
            n23.j.t("Views added to a FragmentContainerView must be associated with a Fragment. View ", view2, " is not associated with a Fragment.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        m1 m1VarK;
        windowInsets.getClass();
        m1 m1VarG = m1.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f7123c;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f7125a;
            onApplyWindowInsetsListener.getClass();
            aVar.getClass();
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            m1VarK = m1.g(null, windowInsetsOnApplyWindowInsets);
        } else {
            m1VarK = androidx.core.view.s0.k(this, m1VarG);
        }
        if (!m1VarK.f6508a.s()) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                androidx.core.view.s0.d(getChildAt(i14), m1VarK);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.f7124d) {
            Iterator it = this.f7121a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view2, long j8) {
        canvas.getClass();
        view2.getClass();
        if (this.f7124d) {
            ArrayList arrayList = this.f7121a;
            if (!arrayList.isEmpty() && arrayList.contains(view2)) {
                return false;
            }
        }
        return super.drawChild(canvas, view2, j8);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view2) {
        view2.getClass();
        this.f7122b.remove(view2);
        if (this.f7121a.remove(view2)) {
            this.f7124d = true;
        }
        super.endViewTransition(view2);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) v.H(this).F(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view2) {
        view2.getClass();
        a(view2);
        super.removeView(view2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i14) {
        View childAt = getChildAt(i14);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i14);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view2) {
        view2.getClass();
        a(view2);
        super.removeViewInLayout(view2);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i14, int i15) {
        int i16 = i14 + i15;
        for (int i17 = i14; i17 < i16; i17++) {
            View childAt = getChildAt(i17);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i14, i15);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i14, int i15) {
        int i16 = i14 + i15;
        for (int i17 = i14; i17 < i16; i17++) {
            View childAt = getChildAt(i17);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i14, i15);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f7124d = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        this.f7123c = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view2) {
        view2.getClass();
        if (view2.getParent() == this) {
            this.f7122b.add(view2);
        }
        super.startViewTransition(view2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        context.getClass();
        this.f7121a = new ArrayList();
        this.f7122b = new ArrayList();
        this.f7124d = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i14) {
        String str;
        super(context, attributeSet, i14);
        context.getClass();
        this.f7121a = new ArrayList();
        this.f7122b = new ArrayList();
        this.f7124d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e8.a.f63440b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = Action.CLASS_ATTRIBUTE;
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + CoreConstants.DOUBLE_QUOTE_CHAR);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }
}

package p004k6;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.g1;
import androidx.core.view.l1;
import androidx.core.view.m1;
import androidx.core.view.s0;
import androidx.core.view.z;
import c7.e;
import ch.qos.logback.core.CoreConstants;
import e23.p;
import java.util.List;
import java.util.WeakHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.c2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk6/t;", "Li5/a;", "Lk6/v;", "Landroidx/core/view/z;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/Window;", "window", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t extends kotlin.a implements v, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window f103098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f103099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f103100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f103101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f103102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f103103f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"k6/t$a", "Landroidx/core/view/l1$b;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends l1.b {
        public a() {
            super(1);
        }

        @Override // androidx.core.view.l1.b
        public final m1 onProgress(m1 m1Var, List<l1> list) {
            t tVar = t.this;
            if (!tVar.f103101d) {
                View childAt = tVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, tVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, tVar.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    return m1Var.f6508a.r(iMax, iMax2, iMax3, iMax4);
                }
            }
            return m1Var;
        }

        @Override // androidx.core.view.l1.b
        public final l1.a onStart(l1 l1Var, l1.a aVar) {
            t tVar = t.this;
            if (!tVar.f103101d) {
                View childAt = tVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, tVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, tVar.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    e eVarC = e.c(iMax, iMax2, iMax3, iMax4);
                    e eVar = aVar.f6473a;
                    int i14 = eVarC.f25190a;
                    int i15 = eVarC.f25191b;
                    int i16 = eVarC.f25192c;
                    int i17 = eVarC.f25193d;
                    return new l1.a(m1.e(eVar, i14, i15, i16, i17), m1.e(aVar.f6474b, eVarC.f25190a, i15, i16, i17));
                }
            }
            return aVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends w implements p<m, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f103106b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i14) {
            super(2);
            this.f103106b = i14;
        }

        @Override // e23.p
        public final Unit invoke(m mVar, Integer num) {
            num.intValue();
            int iT = p0.t(this.f103106b | 1);
            t.this.Content(mVar, iT);
            return Unit.INSTANCE;
        }
    }

    public t(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.f103098a = window;
        r.f103092a.getClass();
        this.f103099b = p0.n(r.f103093b);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(this, this);
        s0.t(this, new a());
    }

    @Override // kotlin.a
    public final void Content(m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1735448596);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            ((p) this.f103099b.getF182175a()).invoke(o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(i14);
        }
    }

    @Override // kotlin.a
    /* JADX INFO: renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    public final boolean getF103103f() {
        return this.f103103f;
    }

    @Override // p004k6.v
    /* JADX INFO: renamed from: getWindow, reason: from getter */
    public final Window getF103098a() {
        return this.f103098a;
    }

    @Override // kotlin.a
    public final void internalOnLayout$ui(boolean z14, int i14, int i15, int i16, int i17) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i18 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i19 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    @Override // kotlin.a
    public final void internalOnMeasure$ui(int i14, int i15) {
        int iA;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.internalOnMeasure$ui(i14, i15);
            return;
        }
        int size = View.MeasureSpec.getSize(i14);
        int size2 = View.MeasureSpec.getSize(i15);
        int mode = View.MeasureSpec.getMode(i15);
        Window window = this.f103098a;
        if (mode != Integer.MIN_VALUE || this.f103100c || window.getAttributes().height != -2) {
            iA = size2;
        } else if (this.f103101d) {
            int i16 = Build.VERSION.SDK_INT;
            if (i16 < 30) {
                iA = n.f103088a.a(window);
            } else if (i16 < 32) {
                iA = p.f103090a.a(window);
            } else {
                iA = size2;
            }
        } else {
            iA = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i17 = size - paddingRight;
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = iA - paddingBottom;
        int i19 = i18 >= 0 ? i18 : 0;
        int mode2 = View.MeasureSpec.getMode(i14);
        if (mode2 != 0) {
            i14 = View.MeasureSpec.makeMeasureSpec(i17, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i15 = View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE);
        }
        childAt.measure(i14, i15);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.f103101d || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.f103100c) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.core.view.z
    public final m1 onApplyWindowInsets(View view2, m1 m1Var) {
        if (!this.f103101d) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return m1Var.f6508a.r(iMax, iMax2, iMax3, iMax4);
            }
        }
        return m1Var;
    }
}

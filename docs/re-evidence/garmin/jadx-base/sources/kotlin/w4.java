package kotlin;

import android.os.Looper;
import android.view.View;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import h0.r0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.o;
import z3.e;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li5/w4;", "Lp3/o;", "Landroidx/lifecycle/k0;", "", "Li5/m;", "owner", "original", "<init>", "(Li5/m;Lp3/o;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w4 implements o, k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f91634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f91635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f91636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f91637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p<? super m, ? super Integer, p005kotlin.Unit> f91638e;

    @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li5/s1;", "composeViewContext", "", "invoke", "(Li5/s1;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements l<s1, p005kotlin.Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<m, Integer, p005kotlin.Unit> f91640b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super m, ? super Integer, p005kotlin.Unit> pVar) {
            super(1);
            this.f91640b = pVar;
        }

        @Override // e23.l
        public final p005kotlin.Unit invoke(s1 s1Var) {
            s1 s1Var2 = s1Var;
            w4 w4Var = w4.this;
            if (!w4Var.f91636c) {
                n0 n0Var = s1Var2.f91445c;
                View view2 = s1Var2.f91443a;
                b0 f158016a = n0Var.getF158016a();
                p<m, Integer, p005kotlin.Unit> pVar = this.f91640b;
                w4Var.f91638e = pVar;
                if (w4Var.f91637d == null) {
                    if (s.g(Looper.myLooper(), view2.getHandler().getLooper())) {
                        w4Var.f91637d = f158016a;
                        f158016a.a(w4Var);
                    } else {
                        view2.post(new r0(13, w4Var, f158016a));
                    }
                } else if (f158016a.getF7973d().a(b0.b.CREATED)) {
                    w4Var.f91635b.r(new e(-1723985096, true, new v4(w4Var, s1Var2, pVar)));
                }
            }
            return p005kotlin.Unit.INSTANCE;
        }
    }

    public w4(m mVar, o oVar) {
        this.f91634a = mVar;
        this.f91635b = oVar;
        q1.f91396a.getClass();
        this.f91638e = q1.f91397b;
    }

    @Override // p3.o
    public final void dispose() {
        if (!this.f91636c) {
            this.f91636c = true;
            this.f91634a.getView().setTag(R.id.wrapped_composition_tag, null);
            b0 b0Var = this.f91637d;
            if (b0Var != null) {
                b0Var.d(this);
            }
            this.f91637d = null;
        }
        this.f91635b.dispose();
    }

    @Override // androidx.lifecycle.k0
    public final void onStateChanged(n0 n0Var, b0.a aVar) {
        if (aVar == b0.a.ON_DESTROY) {
            dispose();
        } else {
            if (aVar != b0.a.ON_CREATE || this.f91636c) {
                return;
            }
            r(this.f91638e);
        }
    }

    @Override // p3.o
    public final void r(p<? super m, ? super Integer, p005kotlin.Unit> pVar) {
        this.f91634a.setOnReadyForComposition(new a(pVar));
    }
}

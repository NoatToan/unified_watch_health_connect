package tb0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import y80.b0;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltb0/w;", "Landroidx/lifecycle/u1;", "Lzb0/u0;", "deviceEnum", "", "productDisplayName", "applicationKey", "Ly80/b0;", "deviceStorageRepo", "<init>", "(Lzb0/u0;Ljava/lang/String;Ljava/lang/String;Ly80/b0;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f163717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f163718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f163719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f163720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f163721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f163722f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ltb0/u;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.tutorials.PairAnimationLegacyViewModel$tutorialState$1", f = "PairAnimationLegacyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<r53.j<? super u>, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return w.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super u> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            w wVar = w.this;
            wVar.getClass();
            ge1.b.T(v1.a(wVar), null, null, new v(wVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    public w(u0 u0Var, String str, String str2, b0 b0Var) {
        u0Var.getClass();
        b0Var.getClass();
        this.f163717a = u0Var;
        this.f163718b = str;
        this.f163719c = str2;
        this.f163720d = b0Var;
        p2 p2VarA = q2.a(new u(true, false, null, 6, null));
        this.f163721e = p2VarA;
        this.f163722f = r53.s.K(new r53.v(new a(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), new u(true, false, null, 6, null));
    }
}

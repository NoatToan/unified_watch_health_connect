package oe;

import android.app.Activity;
import e23.p;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;
import r53.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Loe/k;", "Loe/g;", "Loe/n;", "windowMetricsCalculator", "Lpe/a;", "windowBackend", "Lle/d;", "windowSdkExtensions", "<init>", "(Loe/n;Lpe/a;Lle/d;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f131233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pe.a f131234c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Loe/l;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", f = "WindowInfoTrackerImpl.kt", l = {62}, m = "invokeSuspend")
    public static final class a extends v13.i implements p<t<? super l>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f131235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f131236b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f131238d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f131238d = activity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = k.this.new a(this.f131238d, dVar);
            aVar.f131236b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(t<? super l> tVar, t13.d<? super Unit> dVar) {
            return ((a) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f131235a;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.f131236b;
                h hVar = new h(tVar, 1);
                k kVar = k.this;
                kVar.f131234c.a(this.f131238d, new bv2.g(1), hVar);
                j jVar = new j(0, kVar, hVar);
                this.f131235a = 1;
                if (q53.r.a(tVar, jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public k(n nVar, pe.a aVar, le.d dVar) {
        nVar.getClass();
        aVar.getClass();
        dVar.getClass();
        this.f131233b = nVar;
        this.f131234c = aVar;
    }

    @Override // oe.g
    public final r53.i<l> a(Activity activity) {
        r53.b bVarF = s.f(new a(activity, null));
        x53.c cVar = s0.f129406a;
        return s.A(bVarF, u53.o.f168762a);
    }
}

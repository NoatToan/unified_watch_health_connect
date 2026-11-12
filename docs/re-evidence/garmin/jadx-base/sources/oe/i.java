package oe;

import android.content.Context;
import e23.p;
import mt0.s1;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Loe/l;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {52}, m = "invokeSuspend")
public final class i extends v13.i implements p<t<? super l>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f131227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f131228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f131229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, Context context, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f131228c = kVar;
        this.f131229d = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f131228c, this.f131229d, dVar);
        iVar.f131227b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super l> tVar, t13.d<? super Unit> dVar) {
        return ((i) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131226a;
        if (i14 == 0) {
            r.b(obj);
            t tVar = (t) this.f131227b;
            h hVar = new h(tVar, 0);
            k kVar = this.f131228c;
            kVar.f131234c.a(this.f131229d, new bv2.g(1), hVar);
            s1 s1Var = new s1(29, kVar, hVar);
            this.f131226a = 1;
            if (q53.r.a(tVar, s1Var, this) == aVar) {
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

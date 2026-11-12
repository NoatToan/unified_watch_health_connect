package tb0;

import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import y80.l0;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.tutorials.PairAnimationLegacyViewModel$loadTutorials$1", f = "PairAnimationLegacyViewModel.kt", l = {40}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f163714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f163715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f163716c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f163716c = wVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(this.f163716c, dVar);
        vVar.f163715b = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        boolean z14;
        Object value;
        Object obj2;
        Object value2;
        u uVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f163714a;
        w wVar = this.f163716c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2Var = wVar.f163721e;
                do {
                    value2 = p2Var.getValue();
                    uVar = (u) value2;
                } while (!p2Var.b(value2, new u(true, uVar.f163712b, uVar.f163713c)));
                int i15 = o13.q.f128596b;
                y80.b0 b0Var = wVar.f163720d;
                u0 u0Var = wVar.f163717a;
                String str = wVar.f163718b;
                String str2 = wVar.f163719c;
                this.f163715b = null;
                this.f163714a = 1;
                b0Var.getClass();
                x53.c cVar = s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new l0(b0Var, u0Var, str2, str, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            hv.a aVar2 = (hv.a) obj;
            int i16 = o13.q.f128596b;
            bVar = aVar2;
        } catch (Throwable th3) {
            int i17 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        boolean z15 = bVar instanceof o13.q.b;
        if (z15) {
            z14 = true;
        } else {
            if ((z15 ? null : bVar) == null) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        wVar.getClass();
        p2 p2Var2 = wVar.f163721e;
        do {
            value = p2Var2.getValue();
            u uVar2 = (u) value;
            obj2 = z15 ? null : bVar;
            uVar2.getClass();
        } while (!p2Var2.b(value, new u(false, z14, (hv.a) obj2)));
        return Unit.INSTANCE;
    }
}

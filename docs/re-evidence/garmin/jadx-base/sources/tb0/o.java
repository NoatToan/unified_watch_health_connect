package tb0;

import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import y80.f0;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.tutorials.GestureAnimationLegacyViewModel$loadTutorials$1", f = "GestureAnimationLegacyViewModel.kt", l = {63}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f163665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f163666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f163667c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f163667c = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f163667c, dVar);
        oVar.f163666b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        boolean z14;
        Object value;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f163665a;
        n nVar = this.f163667c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2Var = nVar.f163657j;
                do {
                    value3 = p2Var.getValue();
                } while (!p2Var.b(value3, nVar.f163656i));
                int i15 = o13.q.f128596b;
                y80.b0 b0Var = nVar.f163651d;
                u0 u0Var = nVar.f163649b;
                String str = nVar.f163650c;
                boolean zBooleanValue = ((Boolean) nVar.f163655h.getValue()).booleanValue();
                this.f163666b = null;
                this.f163665a = 1;
                b0Var.getClass();
                x53.c cVar = s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new f0(b0Var, u0Var, str, zBooleanValue, null), this);
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
        nVar.f163653f = (hv.a) (z15 ? null : bVar);
        p2 p2Var2 = nVar.f163657j;
        do {
            value = p2Var2.getValue();
        } while (!p2Var2.b(value, t.a(nVar.f163656i, z14, (hv.a) (z15 ? null : bVar), 0, 56)));
        hv.a aVar3 = nVar.f163653f;
        if (aVar3 != null && aVar3.f85745d <= 1) {
            p2 p2Var3 = nVar.f163659l;
            do {
                value2 = p2Var3.getValue();
            } while (!p2Var3.b(value2, ub0.m.VIEW_TUTORIALS));
        }
        return Unit.INSTANCE;
    }
}

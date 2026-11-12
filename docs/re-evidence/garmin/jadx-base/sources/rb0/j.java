package rb0;

import android.graphics.drawable.Drawable;
import e23.p;
import o13.q;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import y80.m0;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.sync.legacy_devices.LegacySyncAnimationViewModel$loadTutorials$1", f = "LegacySyncAnimationViewModel.kt", l = {37}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f151580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f151581c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f151581c = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f151581c, dVar);
        jVar.f151580b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object value;
        boolean z14;
        u0 u0Var;
        jt2.a aVar;
        int i14;
        Drawable drawable;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f151579a;
        i iVar = this.f151581c;
        try {
            if (i15 == 0) {
                r.b(obj);
                int i16 = q.f128596b;
                y80.b0 b0Var = iVar.f151568b;
                u0 u0Var2 = iVar.f151567a;
                this.f151580b = null;
                this.f151579a = 1;
                b0Var.getClass();
                x53.c cVar = s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new m0(b0Var, u0Var2, null), this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            bVar = (hv.a) obj;
            int i17 = q.f128596b;
        } catch (Throwable th3) {
            int i18 = q.f128596b;
            bVar = new q.b(th3);
        }
        hv.a aVar3 = (hv.a) (bVar instanceof q.b ? null : bVar);
        p2 p2Var = iVar.f151569c;
        do {
            value = p2Var.getValue();
            i.a aVar4 = (i.a) value;
            z14 = aVar3 == null;
            u0Var = iVar.f151567a;
            aVar = aVar4.f151574d;
            i14 = aVar4.f151575e;
            drawable = aVar4.f151576f;
            u0Var.getClass();
        } while (!p2Var.b(value, new i.a(false, z14, aVar3, aVar, i14, drawable, u0Var)));
        return Unit.INSTANCE;
    }
}

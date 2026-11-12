package vk2;

import e23.p;
import o13.r;
import o53.b0;
import o53.s;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lrs2/c;", "<anonymous>", "(Lo53/b0;)Lrs2/c;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.background.SyncStartListener$await$2", f = "SyncStartListener.kt", l = {137}, m = "invokeSuspend")
public final class i extends v13.i implements p<b0, t13.d<? super rs2.c>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f178683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f178684b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f178684b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f178684b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super rs2.c> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f178683a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        s sVar = this.f178684b.f178676h;
        this.f178683a = 1;
        Object objC = sVar.C(this);
        return objC == aVar ? aVar : objC;
    }
}

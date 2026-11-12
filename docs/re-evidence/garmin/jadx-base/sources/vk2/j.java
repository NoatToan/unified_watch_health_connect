package vk2;

import e23.p;
import o13.r;
import o53.b0;
import o53.m0;
import o53.s;
import ok2.a0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.background.SyncStartListener$refreshConnectionsIfNeeded$1", f = "SyncStartListener.kt", l = {124}, m = "invokeSuspend")
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f178685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f178686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f178687c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, String str, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f178686b = gVar;
        this.f178687c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f178686b, this.f178687c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f178685a;
        g gVar = this.f178686b;
        if (i14 == 0) {
            r.b(obj);
            long j8 = gVar.f178673e;
            this.f178685a = 1;
            if (m0.b(j8, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        s sVar = gVar.f178676h;
        a0 a0Var = gVar.f178671c;
        if (sVar.isActive()) {
            yk2.a aVar2 = (yk2.a) a0Var.g();
            String str = this.f178687c;
            if (aVar2.c(str) == null) {
                a0Var.getClass();
                a0Var.g().e(str);
            }
        }
        return Unit.INSTANCE;
    }
}

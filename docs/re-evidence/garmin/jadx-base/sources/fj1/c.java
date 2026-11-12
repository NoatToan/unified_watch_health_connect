package fj1;

import c83.a0;
import e23.l;
import gj1.h;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lgj1/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.network.PrimaryDeviceRepo$getDeviceDetails$2", f = "PrimaryDeviceRepo.kt", l = {31}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<h>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f71832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f71833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, long j8, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f71832b = bVar;
        this.f71833c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f71832b, this.f71833c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<h>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71831a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<h>> i0VarB = this.f71832b.f71829a.b(this.f71833c);
        this.f71831a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

package ky;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.calendar.repo.CalendarRepo$sendCalendarWorkoutToDeviceAsync$2", f = "CalendarRepo.kt", l = {30}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<d<? super a0<String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f107165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f107166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy.b f107167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, long j8, dy.b bVar, d<? super c> dVar) {
        super(1, dVar);
        this.f107165b = aVar;
        this.f107166c = j8;
        this.f107167d = bVar;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new c(this.f107165b, this.f107166c, this.f107167d, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super a0<String>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f107164a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<String>> i0VarA = this.f107165b.f107160a.a(this.f107166c, this.f107167d);
        this.f107164a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

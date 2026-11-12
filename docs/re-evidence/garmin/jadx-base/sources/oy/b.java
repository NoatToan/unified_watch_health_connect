package oy;

import c83.a0;
import e23.l;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lny/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.calories.data.repository.CaloriesRepositoryImpl$getDailyCalories$2", f = "CaloriesRepositoryImpl.kt", l = {21}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<ny.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f134354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f134355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f134356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f134357d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, DateTime dateTime, DateTime dateTime2, t13.d<? super b> dVar2) {
        super(1, dVar2);
        this.f134355b = dVar;
        this.f134356c = dateTime;
        this.f134357d = dateTime2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f134355b, this.f134356c, this.f134357d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<ny.b>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f134354a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        my.a aVar2 = this.f134355b.f134362a;
        fz0.c cVarB = fz0.d.b(this.f134356c);
        fz0.c cVarB2 = fz0.d.b(this.f134357d);
        this.f134354a = 1;
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        Object objA = aVar2.a(cVarB, cVarB2, fz0.d.b(dateTimeNow), this);
        return objA == aVar ? aVar : objA;
    }
}

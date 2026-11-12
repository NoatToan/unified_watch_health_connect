package oy;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lny/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.calories.data.repository.CaloriesRepositoryImpl$getWeeklyCalories$2", f = "CaloriesRepositoryImpl.kt", l = {27}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<List<? extends ny.e>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f134358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f134359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f134360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f134361d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, DateTime dateTime, int i14, t13.d<? super c> dVar2) {
        super(1, dVar2);
        this.f134359b = dVar;
        this.f134360c = dateTime;
        this.f134361d = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f134359b, this.f134360c, this.f134361d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends ny.e>>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f134358a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        my.a aVar2 = this.f134359b.f134362a;
        fz0.c cVarB = fz0.d.b(this.f134360c);
        this.f134358a = 1;
        Object objB = aVar2.b(cVarB, this.f134361d, this);
        return objB == aVar ? aVar : objB;
    }
}

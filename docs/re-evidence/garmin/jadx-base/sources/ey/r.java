package ey;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lxx/f;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarViewModel$updateCalendarUserPref$1", f = "GCMCalendarViewModel.kt", l = {25}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.l<t13.d<? super v2<? extends xx.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f67115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f67116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.f f67117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, String str, xx.f fVar, t13.d<? super r> dVar) {
        super(1, dVar);
        this.f67115b = sVar;
        this.f67116c = str;
        this.f67117d = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r(this.f67115b, this.f67116c, this.f67117d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends xx.f>> dVar) {
        return ((r) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67114a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        zx.f fVar = this.f67115b.f67118a;
        this.f67114a = 1;
        fVar.getClass();
        Object objJ = f0.J(fVar, new zx.l(fVar, this.f67116c, this.f67117d, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}

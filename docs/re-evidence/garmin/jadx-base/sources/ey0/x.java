package ey0;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import java.util.List;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.repository.MultiDayActivitiesRepository$getMultiDayActivityTimelineSummaries$2", f = "MultiDayActivitiesRepository.kt", l = {StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends ActivityListItemDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f67254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f67255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f67256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oy0.i f67257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f67258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f67259g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(g0 g0Var, String str, String str2, oy0.i iVar, int i14, int i15, t13.d<? super x> dVar) {
        super(1, dVar);
        this.f67254b = g0Var;
        this.f67255c = str;
        this.f67256d = str2;
        this.f67257e = iVar;
        this.f67258f = i14;
        this.f67259g = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new x(this.f67254b, this.f67255c, this.f67256d, this.f67257e, this.f67258f, this.f67259g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends ActivityListItemDTO>>> dVar) {
        return ((x) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67253a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        dy0.a aVar2 = (dy0.a) this.f67254b.f67175b.getValue();
        String str = this.f67257e.f134418b;
        this.f67253a = 1;
        Object objA = aVar2.a(this.f67255c, this.f67256d, str, this.f67258f, this.f67259g, this);
        return objA == aVar ? aVar : objA;
    }
}

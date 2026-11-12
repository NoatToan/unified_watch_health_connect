package hg0;

import c83.a0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.network.eventsearch.activity.ActivityRepo$getActivities$2", f = "ActivityRepo.kt", l = {47}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<List<? extends ActivityListItemDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f83659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f83660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f83661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f83662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f83663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f83664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f83665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f83666i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, String str, String str2, String str3, String str4, int i14, String str5, String str6, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f83659b = bVar;
        this.f83660c = str;
        this.f83661d = str2;
        this.f83662e = str3;
        this.f83663f = str4;
        this.f83664g = i14;
        this.f83665h = str5;
        this.f83666i = str6;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f83659b, this.f83660c, this.f83661d, this.f83662e, this.f83663f, this.f83664g, this.f83665h, this.f83666i, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends ActivityListItemDTO>>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f83658a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<ActivityListItemDTO>>> i0VarB = this.f83659b.f83653a.b(this.f83660c, this.f83661d, this.f83662e, this.f83663f, this.f83664g, false, this.f83665h, this.f83666i);
        this.f83658a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

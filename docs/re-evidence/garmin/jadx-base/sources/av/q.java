package av;

import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/badges/service/model/s;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.service.retrofit.BadgesRepo$getBadgeEarnRecordsAsync$2", f = "BadgesRepo.kt", l = {156}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.badges.service.model.s>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f13121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f13124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13126g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g gVar, String str, int i14, boolean z14, int i15, int i16, t13.d<? super q> dVar) {
        super(1, dVar);
        this.f13121b = gVar;
        this.f13122c = str;
        this.f13123d = i14;
        this.f13124e = z14;
        this.f13125f = i15;
        this.f13126g = i16;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q(this.f13121b, this.f13122c, this.f13123d, this.f13124e, this.f13125f, this.f13126g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.badges.service.model.s>>> dVar) {
        return ((q) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13120a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<List<com.garmin.android.apps.connectmobile.badges.service.model.s>>> i0VarI = this.f13121b.f13084a.i(this.f13122c, this.f13123d, this.f13124e, this.f13125f, this.f13126g);
        this.f13120a = 1;
        Object objAwait = i0VarI.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

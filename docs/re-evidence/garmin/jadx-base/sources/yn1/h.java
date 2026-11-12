package yn1;

import o13.m;
import o13.t;
import o53.b0;
import o53.e2;
import o53.s0;
import p005kotlin.Metadata;
import ya0.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lyn1/h;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lcom/garmin/android/apps/connectmobile/smartscale/model/a;", "Lo53/b0;", "", "inviteId", "Lcom/garmin/android/apps/connectmobile/smartscale/model/f;", "userInfo", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", "userInfoListener", "<init>", "(JLcom/garmin/android/apps/connectmobile/smartscale/model/f;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends com.garmin.android.library.backgroundtaskmanagement.b<com.garmin.android.apps.connectmobile.smartscale.model.a> implements b0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f198193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.smartscale.model.f f198194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f198195n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e2 f198196o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wn1.t f198197p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j8, com.garmin.android.apps.connectmobile.smartscale.model.f fVar, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        fVar.getClass();
        this.f198193l = j8;
        this.f198194m = fVar;
        b(new g(this));
        this.f198195n = m.b(new j(11));
        this.f198196o = ge1.b.h();
        this.f198197p = wn1.t.a.b(wn1.t.f186332a);
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        return s0.f129406a.plus(this.f198196o);
    }

    public /* synthetic */ h(long j8, com.garmin.android.apps.connectmobile.smartscale.model.f fVar, com.garmin.android.library.backgroundtaskmanagement.b.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, fVar, (i14 & 4) != 0 ? null : aVar);
    }
}

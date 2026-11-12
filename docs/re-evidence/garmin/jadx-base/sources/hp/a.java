package hp;

import c22.j0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import jr.q;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhp/a;", "Lr70/a;", "Lyz1/d;", "status", "Lin/a;", "activity", "Ljr/q;", "sectionConfig", "<init>", "(Lyz1/d;Lin/a;Ljr/q;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r70.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f84886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final in.a f84887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f84888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o70.b f84889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DateTime f84890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f84891f;

    public a(yz1.d dVar, in.a aVar, q qVar) {
        dVar.getClass();
        aVar.getClass();
        qVar.getClass();
        this.f84886a = dVar;
        this.f84887b = aVar;
        this.f84888c = qVar;
        this.f84889d = o70.b.ACTIVITY;
        ActivityListItemDTO activityListItemDTO = aVar.f94388a;
        DateTime dateTimeN = j0.N(activityListItemDTO.f29259e, false);
        this.f84890e = dateTimeN == null ? new DateTime() : dateTimeN;
        this.f84891f = String.valueOf(activityListItemDTO.f29250b);
    }

    @Override // r70.s
    public final String a() {
        return this.f84889d.a();
    }

    @Override // r70.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getF84890e() {
        return this.f84890e;
    }

    @Override // r70.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF84891f() {
        return this.f84891f;
    }

    @Override // r70.a
    /* JADX INFO: renamed from: e, reason: from getter */
    public final o70.b getF84889d() {
        return this.f84889d;
    }
}

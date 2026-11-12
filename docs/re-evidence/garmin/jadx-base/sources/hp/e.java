package hp;

import g22.k;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhp/e;", "Lr70/a;", "Lyz1/d;", "status", "Lpb2/a$d;", "activity", "<init>", "(Lyz1/d;Lpb2/a$d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements r70.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pb2.a.d f84923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o70.b f84924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f84925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f84926d;

    public e(yz1.d dVar, pb2.a.d dVar2) {
        DateTime dateTimeNow;
        dVar.getClass();
        dVar2.getClass();
        this.f84923a = dVar2;
        this.f84924b = o70.b.PENDING_ACTIVITIES;
        LocalDateTime localDateTime = dVar2.f136897e;
        if (localDateTime != null) {
            dateTimeNow = k.x(localDateTime);
        } else {
            dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
        }
        this.f84925c = dateTimeNow;
        this.f84926d = dVar2.f136893a;
    }

    @Override // r70.s
    public final String a() {
        return this.f84924b.a();
    }

    @Override // r70.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getF84925c() {
        return this.f84925c;
    }

    @Override // r70.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF84926d() {
        return this.f84926d;
    }

    @Override // r70.a
    /* JADX INFO: renamed from: e, reason: from getter */
    public final o70.b getF84924b() {
        return this.f84924b;
    }
}

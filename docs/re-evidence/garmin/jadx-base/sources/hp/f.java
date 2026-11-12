package hp;

import c22.j0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import sn.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhp/f;", "Lr70/a;", "Lyz1/d;", "status", "Lsn/h;", "activity", "<init>", "(Lyz1/d;Lsn/h;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements r70.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f84927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f84928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o70.b f84929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTime f84930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f84931e;

    public f(yz1.d dVar, h hVar) {
        dVar.getClass();
        hVar.getClass();
        this.f84927a = dVar;
        this.f84928b = hVar;
        this.f84929c = o70.b.HEALTH_SNAPSHOT;
        DateTime dateTimeN = j0.N(hVar.getStartTimestampLocal(), false);
        this.f84930d = dateTimeN == null ? new DateTime() : dateTimeN;
        this.f84931e = hVar.d();
    }

    @Override // r70.s
    public final String a() {
        return this.f84929c.a();
    }

    @Override // r70.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getF84930d() {
        return this.f84930d;
    }

    @Override // r70.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF84931e() {
        return this.f84931e;
    }

    @Override // r70.a
    /* JADX INFO: renamed from: e, reason: from getter */
    public final o70.b getF84929c() {
        return this.f84929c;
    }
}

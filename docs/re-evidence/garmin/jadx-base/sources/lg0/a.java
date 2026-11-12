package lg0;

import fg0.l;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import yz1.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llg0/a;", "Lr70/a;", "Lyz1/d;", "status", "Lfg0/l;", "eventDataItem", "<init>", "(Lyz1/d;Lfg0/l;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r70.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f112156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f112157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o70.b f112158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTime f112159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f112160e;

    public a(d dVar, l lVar) {
        dVar.getClass();
        lVar.getClass();
        this.f112156a = dVar;
        this.f112157b = lVar;
        this.f112158c = o70.b.EVENT;
        DateTime dateTimeH = lVar.getEvent().h();
        this.f112159d = dateTimeH == null ? new DateTime() : dateTimeH;
        this.f112160e = lVar.getEvent().getShareableEventUuid();
    }

    @Override // r70.s
    public final String a() {
        return this.f112158c.a();
    }

    @Override // r70.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getF112159d() {
        return this.f112159d;
    }

    @Override // r70.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF112160e() {
        return this.f112160e;
    }

    @Override // r70.a
    /* JADX INFO: renamed from: e, reason: from getter */
    public final o70.b getF112158c() {
        return this.f112158c;
    }
}

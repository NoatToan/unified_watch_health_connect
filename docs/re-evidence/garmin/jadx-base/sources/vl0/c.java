package vl0;

import g22.k;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import yz1.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvl0/c;", "Lr70/a;", "Lyz1/d;", "status", "Lsl0/a;", "scoreCard", "<init>", "(Lyz1/d;Lsl0/a;)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements r70.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f178692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sl0.a f178693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o70.b f178694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTime f178695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f178696e;

    public c(d dVar, sl0.a aVar) {
        dVar.getClass();
        aVar.getClass();
        this.f178692a = dVar;
        this.f178693b = aVar;
        this.f178694c = o70.b.GOLF_SCORE_CARD;
        DateTime dateTimeQ = k.q(aVar.getStartTime(), "yyyy-MM-dd'T'HH:mm:ss.SSSZ", null);
        this.f178695d = dateTimeQ == null ? new DateTime() : dateTimeQ;
        this.f178696e = String.valueOf(aVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String());
    }

    @Override // r70.s
    public final String a() {
        return this.f178694c.a();
    }

    @Override // r70.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getF178695d() {
        return this.f178695d;
    }

    @Override // r70.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF178696e() {
        return this.f178696e;
    }

    @Override // r70.a
    /* JADX INFO: renamed from: e, reason: from getter */
    public final o70.b getF178694c() {
        return this.f178694c;
    }
}

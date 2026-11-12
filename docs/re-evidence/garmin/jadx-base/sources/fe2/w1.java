package fe2;

/* JADX INFO: loaded from: classes11.dex */
public final class w1 {
    public static final ae2.a a(ae2.o.b bVar) {
        if (bVar.equals(ae2.o.b.h.f2960d) || bVar.equals(ae2.o.b.i.f2961d) || bVar.equals(ae2.o.b.n.f2966d)) {
            return new ae2.a.e();
        }
        if (bVar.equals(ae2.o.b.k.f2963d)) {
            return new ae2.a.c();
        }
        return bVar.equals(ae2.o.b.j.f2962d) ? new ae2.a.b() : new ae2.a.b();
    }

    public static final v1 b(ae2.h0 h0Var) {
        v1.b bVar;
        String nickname;
        ae2.e0.a aVar;
        ae2.n0.a type;
        h0Var.getClass();
        String sessionId = h0Var.getSessionId();
        String token = h0Var.getToken();
        String url = h0Var.getUrl();
        ae2.n0 subscriber = h0Var.getSubscriber();
        if (subscriber == null || (type = subscriber.getType()) == null) {
            bVar = null;
            nickname = null;
        } else {
            if (type.equals(ae2.n0.a.C0045a.f2942c)) {
                bVar = v1.b.a.f70975a;
            } else if (type.equals(ae2.n0.a.d.f2944c)) {
                bVar = v1.b.c.f70977a;
            } else if (type.equals(ae2.n0.a.f.f2946c)) {
                bVar = v1.b.f.f70980a;
            } else if (type.equals(ae2.n0.a.c.f2943c)) {
                bVar = v1.b.C1451b.f70976a;
            } else if (type.equals(ae2.n0.a.e.f2945c)) {
                bVar = v1.b.e.f70979a;
            } else {
                if (!type.equals(ae2.n0.a.g.f2947c)) {
                    lc.u0.r();
                    return null;
                }
                bVar = v1.b.g.f70981a;
            }
            nickname = null;
        }
        ae2.e0 publisher = h0Var.getPublisher();
        String identifier = publisher != null ? publisher.getIdentifier() : nickname;
        ae2.e0 publisher2 = h0Var.getPublisher();
        String str = (publisher2 == null || (aVar = publisher2.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String()) == null) ? nickname : aVar.f2837a;
        ae2.e0 publisher3 = h0Var.getPublisher();
        if (publisher3 != null) {
            nickname = publisher3.getNickname();
        }
        return new v1(sessionId, token, url, bVar, new v1.a(identifier, str, nickname), h0Var.getStart(), h0Var.getCom.google.android.exoplayer2.text.ttml.TtmlNode.END java.lang.String());
    }

    public static final ae2.o.b c(xd2.g1.a aVar) {
        if (aVar instanceof xd2.g1.a.c) {
            return ae2.o.b.j.f2962d;
        }
        if (aVar instanceof xd2.g1.a.d) {
            return ae2.o.b.k.f2963d;
        }
        if (aVar instanceof xd2.g1.a.e) {
            return ae2.o.b.l.f2964d;
        }
        if ((aVar instanceof xd2.g1.a.f) || (aVar instanceof xd2.g1.a.b) || aVar == null) {
            return null;
        }
        lc.u0.r();
        return null;
    }
}

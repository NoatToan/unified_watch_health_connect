package rb2;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/h;", "Lvh/a;", "Lrb2/a$f;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h implements vh.a<a.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f151729a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151730b = p13.x.k("factor", TtmlNode.ATTR_ID, Action.KEY_ATTRIBUTE);

    private h() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, a.f fVar) {
        a.f fVar2 = fVar;
        gVar.getClass();
        zVar.getClass();
        fVar2.getClass();
        gVar.v1("factor");
        vh.c.f178275j.a(gVar, zVar, fVar2.f151688a);
        gVar.v1(TtmlNode.ATTR_ID);
        vh.c.f178276k.a(gVar, zVar, fVar2.f151689b);
        gVar.v1(Action.KEY_ATTRIBUTE);
        vh.c.f178274i.a(gVar, zVar, fVar2.f151690c);
    }

    @Override // vh.a
    public final a.f b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Double dB = null;
        Integer numB = null;
        String strB = null;
        while (true) {
            int iS1 = fVar.S1(f151730b);
            if (iS1 == 0) {
                dB = vh.c.f178275j.b(fVar, zVar);
            } else if (iS1 == 1) {
                numB = vh.c.f178276k.b(fVar, zVar);
            } else {
                if (iS1 != 2) {
                    return new a.f(dB, numB, strB);
                }
                strB = vh.c.f178274i.b(fVar, zVar);
            }
        }
    }
}

package av0;

import ak0.z;
import c.q;
import e23.l;
import e23.p;
import kotlin.m3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13152a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f13153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f13154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f13155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o13.h f13159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f13160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f13161j;

    public /* synthetic */ b(m3 m3Var, fj2.f fVar, l lVar, l lVar2, p1 p1Var, p1 p1Var2, p pVar, p1 p1Var3, p1 p1Var4) {
        this.f13156e = m3Var;
        this.f13157f = fVar;
        this.f13158g = lVar;
        this.f13159h = lVar2;
        this.f13153b = p1Var;
        this.f13154c = p1Var2;
        this.f13160i = pVar;
        this.f13155d = p1Var3;
        this.f13161j = p1Var4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f13152a) {
            case 0:
                pu0.i iVar = (pu0.i) this.f13156e;
                b.g gVar = (b.g) this.f13157f;
                q qVar = (q) this.f13158g;
                e23.a aVar = (e23.a) this.f13159h;
                pu0.b bVar = (pu0.b) this.f13160i;
                gv0.d dVar = (gv0.d) this.f13161j;
                String str = iVar.f141261b;
                this.f13153b.setValue(str == null ? "" : str);
                if (str == null) {
                    str = "";
                }
                e eVar = new e(bVar, dVar, 1);
                p1 p1Var = this.f13154c;
                this.f13155d.setValue(Boolean.valueOf(!h.c(gVar, str, qVar, eVar, new z(p1Var, 11), new z(p1Var, 12), aVar)));
                break;
            default:
                m3 m3Var = (m3) this.f13156e;
                fj2.f fVar = (fj2.f) this.f13157f;
                l lVar = (l) this.f13158g;
                l lVar2 = (l) this.f13159h;
                p pVar = (p) this.f13160i;
                p1 p1Var2 = (p1) this.f13161j;
                this.f13153b.setValue(Boolean.TRUE);
                if (m3Var != null) {
                    m3Var.hide();
                }
                if (s.g(fVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String(), cj2.a.EnumC0424a.ADDRESS.f27745a)) {
                    if (lVar != null) {
                        String str2 = fVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                        if (str2 == null) {
                            str2 = "";
                        }
                        lVar.invoke(str2);
                    }
                    lVar2.invoke(Boolean.FALSE);
                } else {
                    String str3 = (String) this.f13154c.getF182175a();
                    String str4 = fVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                    if (str3 != null && str4 != null && pVar != null) {
                        pVar.invoke(str3, str4);
                    }
                }
                String text = fVar.getText();
                String str5 = text != null ? text : "";
                p1 p1Var3 = this.f13155d;
                p1Var3.setValue(str5);
                p1Var2.setValue((String) p1Var3.getF182175a());
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(pu0.i iVar, b.g gVar, q qVar, e23.a aVar, p1 p1Var, pu0.b bVar, gv0.d dVar, p1 p1Var2, p1 p1Var3) {
        this.f13156e = iVar;
        this.f13157f = gVar;
        this.f13158g = qVar;
        this.f13159h = aVar;
        this.f13153b = p1Var;
        this.f13160i = bVar;
        this.f13161j = dVar;
        this.f13154c = p1Var2;
        this.f13155d = p1Var3;
    }
}

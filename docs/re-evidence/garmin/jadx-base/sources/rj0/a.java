package rj0;

import c80.q;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import qj0.k;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\rB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lrj0/a;", "", "", "imageUrlPath", "title", "subtitle", "", "Lrj0/c;", "features", "Lpj0/a;", "legal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lpj0/a;)V", "a", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2890a f152957f = new C2890a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<c> f152961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pj0.a f152962e;

    public a(String str, String str2, String str3, List<c> list, pj0.a aVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        aVar.getClass();
        this.f152958a = str;
        this.f152959b = str2;
        this.f152960c = str3;
        this.f152961d = list;
        this.f152962e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f152958a.equals(aVar.f152958a) && this.f152959b.equals(aVar.f152959b) && this.f152960c.equals(aVar.f152960c) && this.f152961d.equals(aVar.f152961d) && this.f152962e.equals(aVar.f152962e);
    }

    public final int hashCode() {
        return this.f152962e.hashCode() + u0.b(wr.g.j(wr.g.j(this.f152958a.hashCode() * 31, 31, this.f152959b), 31, this.f152960c), 31, this.f152961d);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("GCPlusEducationContent(imageUrlPath=", this.f152958a, ", title=", this.f152959b, ", subtitle=");
        e0.o(this.f152960c, ", features=", ", legal=", sbI, this.f152961d);
        sbI.append(this.f152962e);
        sbI.append(")");
        return sbI.toString();
    }

    /* JADX INFO: renamed from: rj0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrj0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2890a {
        public /* synthetic */ C2890a(j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:115:0x022c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:27:0x0086  */
        /* JADX WARN: Code duplicated, block: B:89:0x0229  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v15, types: [rj0.g] */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r11v10 */
        /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* JADX WARN: Type inference failed for: r21v1, types: [rj0.a] */
        /* JADX WARN: Type inference failed for: r5v15 */
        /* JADX WARN: Type inference failed for: r5v5, types: [rj0.f] */
        /* JADX WARN: Type inference failed for: r5v6 */
        public static a a(qj0.a aVar) {
            c cVar;
            ?? r14;
            String str;
            String str2;
            g gVar;
            ?? r15;
            ?? fVar;
            Object dVar;
            Object next;
            aVar.getClass();
            String imageAndroid = aVar.getImageAndroid();
            String str3 = "Missing image URL";
            if (imageAndroid == null) {
                a2 a2Var = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "GCPlusEducationContent", "Missing image URL");
                return null;
            }
            String title = aVar.getTitle();
            String str4 = "Missing title";
            if (title == null) {
                a2 a2Var2 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "GCPlusEducationContent", "Missing title");
                return null;
            }
            c cVar2 = null;
            String subtitle = aVar.getSubtitle();
            String str5 = "Missing subtitle";
            if (subtitle == null) {
                a2 a2Var3 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var3, "GCPlusEducationContent", "Missing subtitle");
                return null;
            }
            List<qj0.b<qj0.c>> listA = aVar.a();
            if (listA != null) {
                if (listA.isEmpty()) {
                    listA = null;
                }
                if (listA != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        qj0.b bVar = (qj0.b) it.next();
                        c.a aVar2 = c.f152974g;
                        qj0.c cVar3 = (qj0.c) bVar.a();
                        aVar2.getClass();
                        cVar3.getClass();
                        String id3 = cVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                        if (id3 != null) {
                            q.f25532b.getClass();
                            q qVarA = q.a.a(id3);
                            if (qVarA == null) {
                                a2 a2Var4 = a2.SUBSCRIPTIONS;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var4, "GCPlusFeatureEducationContent", "Missing feature type");
                            } else {
                                String title2 = cVar3.getTitle();
                                if (title2 == null) {
                                    a2 a2Var5 = a2.SUBSCRIPTIONS;
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var5, "GCPlusFeatureEducationContent", str4);
                                } else {
                                    String subtitle2 = cVar3.getSubtitle();
                                    if (subtitle2 == null) {
                                        a2 a2Var6 = a2.SUBSCRIPTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var6, "GCPlusFeatureEducationContent", str5);
                                    } else {
                                        String imageAndroid2 = cVar3.getImageAndroid();
                                        if (imageAndroid2 == null) {
                                            a2 a2Var7 = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.f(a2Var7, "GCPlusFeatureEducationContent", "Missing list row image URL");
                                        } else {
                                            List<qj0.b<qj0.d>> listC = cVar3.c();
                                            if (listC != null) {
                                                if (listC.isEmpty()) {
                                                    r14 = listC;
                                                    r14 = cVar2;
                                                }
                                                if (r14 != 0) {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    for (qj0.b bVar2 : r14) {
                                                        d.a aVar3 = d.f152981e;
                                                        qj0.d dVar2 = (qj0.d) bVar2.a();
                                                        aVar3.getClass();
                                                        dVar2.getClass();
                                                        String title3 = dVar2.getTitle();
                                                        c cVar4 = cVar2;
                                                        if (title3 == null) {
                                                            a2 a2Var8 = a2.SUBSCRIPTIONS;
                                                            i2.f36769a.getClass();
                                                            i2.a.f(a2Var8, "GCPlusFeatureEducationPageContent", str4);
                                                            str = imageAndroid;
                                                        } else {
                                                            str = imageAndroid;
                                                            String description = dVar2.getDescription();
                                                            if (description == null) {
                                                                a2 a2Var9 = a2.SUBSCRIPTIONS;
                                                                i2.f36769a.getClass();
                                                                i2.a.f(a2Var9, "GCPlusFeatureEducationPageContent", "Missing description");
                                                            } else {
                                                                qj0.b<qj0.f> bVarB = dVar2.b();
                                                                if (bVarB != null) {
                                                                    g.a aVar4 = g.f152992c;
                                                                    qj0.f fVarA = bVarB.a();
                                                                    aVar4.getClass();
                                                                    fVarA.getClass();
                                                                    str2 = subtitle;
                                                                    String imageAndroid3 = fVarA.getImageAndroid();
                                                                    if (imageAndroid3 == null) {
                                                                        a2 a2Var10 = a2.SUBSCRIPTIONS;
                                                                        i2.f36769a.getClass();
                                                                        i2.a.f(a2Var10, "GCPlusMediaContent", str3);
                                                                        r15 = cVar4;
                                                                    } else {
                                                                        gVar = new g(imageAndroid3, fVarA.getLottieImage());
                                                                    }
                                                                    if (r15 != 0) {
                                                                        r15 = gVar;
                                                                        qj0.b<qj0.e> bVarC = dVar2.c();
                                                                        if (bVarC != null) {
                                                                            f.a aVar5 = f.f152988d;
                                                                            qj0.e eVarA = bVarC.a();
                                                                            aVar5.getClass();
                                                                            eVarA.getClass();
                                                                            String title4 = eVarA.getTitle();
                                                                            if (title4 == null) {
                                                                                a2 a2Var11 = a2.SUBSCRIPTIONS;
                                                                                i2.f36769a.getClass();
                                                                                i2.a.f(a2Var11, "GCPlusLinkContent", str4);
                                                                                str4 = str4;
                                                                                fVar = cVar4;
                                                                            } else {
                                                                                b.a aVar6 = b.f152963a;
                                                                                String value = eVarA.getValue();
                                                                                aVar6.getClass();
                                                                                Iterator it3 = b.f152973k.iterator();
                                                                                while (true) {
                                                                                    if (!it3.hasNext()) {
                                                                                        str4 = str4;
                                                                                        next = cVar4;
                                                                                        break;
                                                                                    }
                                                                                    next = it3.next();
                                                                                    str4 = str4;
                                                                                    if (s.g(((b) next).name(), value)) {
                                                                                        break;
                                                                                    }
                                                                                    str4 = str4;
                                                                                }
                                                                                b bVar3 = (b) next;
                                                                                if (bVar3 == null) {
                                                                                    a2 a2Var12 = a2.SUBSCRIPTIONS;
                                                                                    String strN = fb1.c.n("Unknown destination ", eVarA.getValue());
                                                                                    i2.f36769a.getClass();
                                                                                    i2.a.f(a2Var12, "GCPlusLinkContent", strN);
                                                                                    fVar = cVar4;
                                                                                } else {
                                                                                    List<e> listA2 = eVarA.a();
                                                                                    if (listA2 == null) {
                                                                                        listA2 = j0.f134944a;
                                                                                    }
                                                                                    fVar = new f(title4, bVar3, listA2);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str4 = str4;
                                                                            fVar = cVar4;
                                                                        }
                                                                        dVar = new d(title3, description, r15, fVar);
                                                                    }
                                                                } else {
                                                                    str3 = str3;
                                                                    str2 = subtitle;
                                                                    str5 = str5;
                                                                }
                                                                r15 = gVar;
                                                                a2 a2Var13 = a2.SUBSCRIPTIONS;
                                                                i2.f36769a.getClass();
                                                                i2.a.f(a2Var13, "GCPlusFeatureEducationPageContent", "Missing media");
                                                                dVar = cVar4;
                                                            }
                                                            if (dVar != null) {
                                                                arrayList2.add(dVar);
                                                            }
                                                            cVar2 = cVar4;
                                                            imageAndroid = str;
                                                            subtitle = str2;
                                                            str5 = str5;
                                                            str3 = str3;
                                                            str4 = str4;
                                                        }
                                                        str2 = subtitle;
                                                        str5 = str5;
                                                        dVar = cVar4;
                                                        if (dVar != null) {
                                                            arrayList2.add(dVar);
                                                        }
                                                        cVar2 = cVar4;
                                                        imageAndroid = str;
                                                        subtitle = str2;
                                                        str5 = str5;
                                                        str3 = str3;
                                                        str4 = str4;
                                                    }
                                                    str3 = str3;
                                                    imageAndroid = imageAndroid;
                                                    subtitle = subtitle;
                                                    str4 = str4;
                                                    cVar2 = cVar2;
                                                    str5 = str5;
                                                    cVar = new c(qVarA, title2, cVar3.getVersion(), subtitle2, imageAndroid2, arrayList2);
                                                }
                                            }
                                            a2 a2Var14 = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.f(a2Var14, "GCPlusFeatureEducationContent", "Missing pages");
                                        }
                                    }
                                }
                                str3 = str3;
                                imageAndroid = imageAndroid;
                                subtitle = subtitle;
                                str4 = str4;
                                cVar = cVar2;
                                cVar2 = cVar;
                                str5 = str5;
                            }
                            cVar = cVar2;
                        } else {
                            a2 a2Var15 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var15, "GCPlusFeatureEducationContent", "Missing feature type");
                            cVar = cVar2;
                        }
                        if (cVar != null) {
                            arrayList.add(cVar);
                        }
                        cVar2 = cVar2;
                        imageAndroid = imageAndroid;
                        subtitle = subtitle;
                        str5 = str5;
                        str3 = str3;
                        str4 = str4;
                    }
                    String str6 = imageAndroid;
                    String str7 = subtitle;
                    ?? r24 = cVar2;
                    qj0.b<k> bVarC2 = aVar.c();
                    if (bVarC2 == null) {
                        a2 a2Var16 = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var16, "GCPlusEducationContent", "Missing legal object");
                        return r24;
                    }
                    pj0.a.C2615a c2615a = pj0.a.f137875c;
                    k kVarA = bVarC2.a();
                    c2615a.getClass();
                    pj0.a aVarA = pj0.a.C2615a.a(kVarA);
                    if (aVarA != null) {
                        return new a(str6, title, str7, arrayList, aVarA);
                    }
                    a2 a2Var17 = a2.SUBSCRIPTIONS;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var17, "GCPlusEducationContent", "Missing legal object");
                    return r24;
                }
            }
            a2 a2Var18 = a2.SUBSCRIPTIONS;
            i2.f36769a.getClass();
            i2.a.f(a2Var18, "GCPlusEducationContent", "Missing features");
            return null;
        }

        private C2890a() {
        }
    }
}

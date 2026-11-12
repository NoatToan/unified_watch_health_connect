package uj0;

import c80.q;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qj0.h;
import qj0.k;
import qj0.l;
import v.e0;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0013B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Luj0/a;", "", "", "title", "headerTitle", "headerSubtitle", "", "Luj0/c;", "plans", "featuresTitle", "Luj0/b;", "features", "cta", "Lpj0/a;", "legal", "", "isTrial", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lpj0/a;Z)V", "a", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C3190a f171465j = new C3190a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f171468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<c> f171469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f171470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<b> f171471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f171472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pj0.a f171473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f171474i;

    public a(String str, String str2, String str3, List<c> list, String str4, List<b> list2, String str5, pj0.a aVar, boolean z14) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        str4.getClass();
        list2.getClass();
        str5.getClass();
        aVar.getClass();
        this.f171466a = str;
        this.f171467b = str2;
        this.f171468c = str3;
        this.f171469d = list;
        this.f171470e = str4;
        this.f171471f = list2;
        this.f171472g = str5;
        this.f171473h = aVar;
        this.f171474i = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f171466a.equals(aVar.f171466a) && this.f171467b.equals(aVar.f171467b) && this.f171468c.equals(aVar.f171468c) && this.f171469d.equals(aVar.f171469d) && this.f171470e.equals(aVar.f171470e) && this.f171471f.equals(aVar.f171471f) && this.f171472g.equals(aVar.f171472g) && this.f171473h.equals(aVar.f171473h) && this.f171474i == aVar.f171474i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f171474i) + ((this.f171473h.hashCode() + g.j(u0.b(g.j(u0.b(g.j(g.j(this.f171466a.hashCode() * 31, 31, this.f171467b), 31, this.f171468c), 31, this.f171469d), 31, this.f171470e), 31, this.f171471f), 31, this.f171472g)) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("GCPlusPlanSelectionContent(title=", this.f171466a, ", headerTitle=", this.f171467b, ", headerSubtitle=");
        e0.o(this.f171468c, ", plans=", ", featuresTitle=", sbI, this.f171469d);
        e0.o(this.f171470e, ", features=", ", cta=", sbI, this.f171471f);
        sbI.append(this.f171472g);
        sbI.append(", legal=");
        sbI.append(this.f171473h);
        sbI.append(", isTrial=");
        return hb.a.k(sbI, this.f171474i, ")");
    }

    /* JADX INFO: renamed from: uj0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luj0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3190a {
        public /* synthetic */ C3190a(j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:79:0x00c0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x005d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x0169 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x00f4 A[SYNTHETIC] */
        public static a a(h hVar) {
            b bVar;
            c cVar;
            hVar.getClass();
            String title = hVar.getTitle();
            if (title == null) {
                a2 a2Var = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "GCPlusPlanSelectionContent", "Missing title");
                return null;
            }
            String headerTitle = hVar.getHeaderTitle();
            if (headerTitle == null) {
                a2 a2Var2 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "GCPlusPlanSelectionContent", "Missing header title");
                return null;
            }
            String headerSubtitle = hVar.getHeaderSubtitle();
            if (headerSubtitle == null) {
                a2 a2Var3 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var3, "GCPlusPlanSelectionContent", "Missing header subtitle");
                return null;
            }
            List<qj0.b<l>> listG = hVar.g();
            if (listG == null) {
                a2 a2Var4 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var4, "GCPlusPlanSelectionContent", "Missing plans");
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                qj0.b bVar2 = (qj0.b) it.next();
                c.a aVar = c.f171480f;
                l lVar = (l) bVar2.a();
                aVar.getClass();
                lVar.getClass();
                String id3 = lVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                if (id3 == null) {
                    a2 a2Var5 = a2.SUBSCRIPTIONS;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var5, "GCPlusSubscriptionPlanContent", "Missing id");
                } else {
                    String type = lVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
                    if (type == null) {
                        a2 a2Var6 = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var6, "GCPlusSubscriptionPlanContent", "Missing type");
                    } else {
                        String title2 = lVar.getTitle();
                        if (title2 == null) {
                            a2 a2Var7 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var7, "GCPlusSubscriptionPlanContent", "Missing title");
                        } else {
                            cVar = new c(id3, type, lVar.getCom.nimbusds.jose.HeaderParameterNames.AUTHENTICATION_TAG java.lang.String(), title2, lVar.getDetail());
                        }
                        if (cVar != null) {
                            arrayList.add(cVar);
                        }
                    }
                }
                cVar = null;
                if (cVar != null) {
                    arrayList.add(cVar);
                }
            }
            String featuresTitle = hVar.getFeaturesTitle();
            if (featuresTitle == null) {
                a2 a2Var8 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var8, "GCPlusPlanSelectionContent", "Missing features title");
                return null;
            }
            List<qj0.b<qj0.j>> listB = hVar.b();
            if (listB == null) {
                a2 a2Var9 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var9, "GCPlusPlanSelectionContent", "Missing features");
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it3 = listB.iterator();
            while (it3.hasNext()) {
                qj0.b bVar3 = (qj0.b) it3.next();
                b.a aVar2 = b.f171475e;
                qj0.j jVar = (qj0.j) bVar3.a();
                aVar2.getClass();
                jVar.getClass();
                String id4 = jVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                if (id4 == null) {
                    a2 a2Var10 = a2.SUBSCRIPTIONS;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var10, "GCPlusPlanSelectionFeatureContent", "Missing id");
                } else {
                    q.f25532b.getClass();
                    q qVarA = q.a.a(id4);
                    if (qVarA == null) {
                        a2 a2Var11 = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var11, "GCPlusPlanSelectionFeatureContent", "Missing type");
                    } else {
                        String name = jVar.getName();
                        if (name == null) {
                            a2 a2Var12 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var12, "GCPlusPlanSelectionFeatureContent", "Missing name");
                        } else {
                            String caption = jVar.getCaption();
                            if (caption == null) {
                                a2 a2Var13 = a2.SUBSCRIPTIONS;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var13, "GCPlusPlanSelectionFeatureContent", "Missing caption");
                            } else {
                                bVar = new b(qVarA, name, caption, jVar.getVersion());
                            }
                            if (bVar != null) {
                                arrayList2.add(bVar);
                            }
                        }
                    }
                }
                bVar = null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            String cta = hVar.getCta();
            if (cta == null) {
                a2 a2Var14 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var14, "GCPlusPlanSelectionContent", "Missing cta");
                return null;
            }
            qj0.b<k> bVarF = hVar.f();
            if (bVarF == null) {
                a2 a2Var15 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var15, "GCPlusPlanSelectionContent", "Missing legal");
                return null;
            }
            pj0.a.C2615a c2615a = pj0.a.f137875c;
            k kVarA = bVarF.a();
            c2615a.getClass();
            pj0.a aVarA = pj0.a.C2615a.a(kVarA);
            if (aVarA == null) {
                a2 a2Var16 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var16, "GCPlusPlanSelectionContent", "Missing legal");
                return null;
            }
            Boolean isTrial = hVar.getIsTrial();
            if (isTrial != null) {
                return new a(title, headerTitle, headerSubtitle, arrayList, featuresTitle, arrayList2, cta, aVarA, isTrial.booleanValue());
            }
            a2 a2Var17 = a2.SUBSCRIPTIONS;
            i2.f36769a.getClass();
            i2.a.f(a2Var17, "GCPlusPlanSelectionContent", "Missing isTrial");
            return null;
        }

        private C3190a() {
        }
    }
}

package tj0;

import c80.q;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import qj0.k;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0010BK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ltj0/a;", "", "", "Ltj0/b;", "features", "Lpj0/a;", "legal", "", "prompt", "promptYearly", "promptMonthly", "cta", "", "isTrial", "<init>", "(Ljava/util/List;Lpj0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "a", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C3097a f165107h = new C3097a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f165108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pj0.a f165109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f165110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f165111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f165112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f165113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165114g;

    public a(List<b> list, pj0.a aVar, String str, String str2, String str3, String str4, boolean z14) {
        list.getClass();
        aVar.getClass();
        str4.getClass();
        this.f165108a = list;
        this.f165109b = aVar;
        this.f165110c = str;
        this.f165111d = str2;
        this.f165112e = str3;
        this.f165113f = str4;
        this.f165114g = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f165108a.equals(aVar.f165108a) && this.f165109b.equals(aVar.f165109b) && s.g(this.f165110c, aVar.f165110c) && s.g(this.f165111d, aVar.f165111d) && s.g(this.f165112e, aVar.f165112e) && this.f165113f.equals(aVar.f165113f) && this.f165114g == aVar.f165114g;
    }

    public final int hashCode() {
        int iHashCode = (this.f165109b.hashCode() + (this.f165108a.hashCode() * 31)) * 31;
        String str = this.f165110c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f165111d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f165112e;
        return Boolean.hashCode(this.f165114g) + g.j((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f165113f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GCPlusPaywallContent(features=");
        sb3.append(this.f165108a);
        sb3.append(", legal=");
        sb3.append(this.f165109b);
        sb3.append(", prompt=");
        sn.a.t(sb3, this.f165110c, ", promptYearly=", this.f165111d, ", promptMonthly=");
        sn.a.t(sb3, this.f165112e, ", cta=", this.f165113f, ", isTrial=");
        return hb.a.k(sb3, this.f165114g, ")");
    }

    /* JADX INFO: renamed from: tj0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltj0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3097a {
        public /* synthetic */ C3097a(j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:55:0x00cd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x0013 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
        public static a a(qj0.g gVar) {
            ?? arrayList;
            b bVar;
            gVar.getClass();
            List<qj0.b<qj0.j>> listB = gVar.b();
            if (listB != null) {
                arrayList = new ArrayList();
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    qj0.b bVar2 = (qj0.b) it.next();
                    b.a aVar = b.f165115h;
                    qj0.j jVar = (qj0.j) bVar2.a();
                    aVar.getClass();
                    jVar.getClass();
                    String id3 = jVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                    if (id3 == null) {
                        a2 a2Var = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var, "GCPlusPaywallFeatureContent", "Missing id");
                    } else {
                        q.f25532b.getClass();
                        q qVarA = q.a.a(id3);
                        if (qVarA == null) {
                            a2 a2Var2 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var2, "GCPlusPaywallFeatureContent", "Missing type");
                        } else {
                            String name = jVar.getName();
                            if (name == null) {
                                a2 a2Var3 = a2.SUBSCRIPTIONS;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var3, "GCPlusPaywallFeatureContent", "Missing name");
                            } else {
                                String title = jVar.getTitle();
                                if (title == null) {
                                    a2 a2Var4 = a2.SUBSCRIPTIONS;
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var4, "GCPlusPaywallFeatureContent", "Missing title");
                                } else {
                                    String subtitle = jVar.getSubtitle();
                                    if (subtitle == null) {
                                        a2 a2Var5 = a2.SUBSCRIPTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var5, "GCPlusPaywallFeatureContent", "Missing subtitle");
                                    } else {
                                        String caption = jVar.getCaption();
                                        if (caption == null) {
                                            a2 a2Var6 = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.f(a2Var6, "GCPlusPaywallFeatureContent", "Missing caption");
                                        } else {
                                            String imageAndroid = jVar.getImageAndroid();
                                            if (imageAndroid == null && (imageAndroid = jVar.getImage()) == null) {
                                                a2 a2Var7 = a2.SUBSCRIPTIONS;
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var7, "GCPlusPaywallFeatureContent", "Missing image url");
                                            } else {
                                                bVar = new b(qVarA, name, title, subtitle, caption, jVar.getVersion(), imageAndroid);
                                            }
                                            if (bVar != null) {
                                                arrayList.add(bVar);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    bVar = null;
                    if (bVar != null) {
                        arrayList.add(bVar);
                    }
                }
            } else {
                arrayList = j0.f134944a;
            }
            ?? r14 = arrayList;
            qj0.b<k> bVarC = gVar.c();
            if (bVarC == null) {
                a2 a2Var8 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var8, "GCPlusPaywallContent", "Missing legal object");
                return null;
            }
            pj0.a.C2615a c2615a = pj0.a.f137875c;
            k kVarA = bVarC.a();
            c2615a.getClass();
            pj0.a aVarA = pj0.a.C2615a.a(kVarA);
            if (aVarA == null) {
                a2 a2Var9 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var9, "GCPlusPaywallContent", "Missing legal object");
                return null;
            }
            String cta = gVar.getCta();
            if (cta == null) {
                a2 a2Var10 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var10, "GCPlusPaywallContent", "Missing cta");
                return null;
            }
            Boolean isTrial = gVar.getIsTrial();
            if (isTrial != null) {
                return new a(r14, aVarA, gVar.getPrompt(), gVar.getPromptYearly(), gVar.getPromptMonthly(), cta, isTrial.booleanValue());
            }
            a2 a2Var11 = a2.SUBSCRIPTIONS;
            i2.f36769a.getClass();
            i2.a.f(a2Var11, "GCPlusPaywallContent", "Missing isTrial");
            return null;
        }

        private C3097a() {
        }
    }
}

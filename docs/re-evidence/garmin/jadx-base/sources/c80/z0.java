package c80;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018BÉ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000f\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000f\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R*\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00103\u001a\u0004\b;\u00105R*\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\b=\u00105R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010'\u001a\u0004\b?\u0010)¨\u0006@"}, d2 = {"Lc80/z0;", "", "", TtmlNode.ATTR_ID, NotificationConstants.KEY_DATA_MIME_TYPE, "title", TtmlNode.TAG_BODY, "cta", "dismissLabel", "", "locations", "Lc80/x0;", "target", "", "priority", "", "conditions", "Lc80/a1;", "resources", "behaviors", "additionalTextFields", "tags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lc80/x0;Ljava/lang/Integer;Ljava/util/Map;Lc80/a1;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getType", "c", "getTitle", "d", "getBody", JWKParameterNames.RSA_EXPONENT, "getCta", "f", "getDismissLabel", "g", "Ljava/util/List;", "getLocations", "()Ljava/util/List;", "h", "Lc80/x0;", "getTarget", "()Lc80/x0;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "getPriority", "()Ljava/lang/Integer;", "j", "Ljava/util/Map;", "getConditions", "()Ljava/util/Map;", JWKParameterNames.OCT_KEY_VALUE, "Lc80/a1;", "getResources", "()Lc80/a1;", "l", "getBehaviors", "m", "getAdditionalTextFields", JWKParameterNames.RSA_MODULUS, "getTags", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("campaignGuid")
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.TAG_BODY)
    private final String body;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cta")
    private final String cta;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dismissLabel")
    private final String dismissLabel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locations")
    private final List<String> locations;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("target")
    private final x0 target;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("priority")
    private final Integer priority;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("conditions")
    private final Map<String, String> conditions;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resources")
    private final a1 resources;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("behaviors")
    private final Map<String, String> behaviors;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("additionalTextFields")
    private final Map<String, String> additionalTextFields;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tags")
    private final List<String> tags;

    static {
        new a(null);
    }

    public z0(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, x0 x0Var, Integer num, Map<String, String> map, a1 a1Var, Map<String, String> map2, Map<String, String> map3, List<String> list2) {
        this.id = str;
        this.type = str2;
        this.title = str3;
        this.body = str4;
        this.cta = str5;
        this.dismissLabel = str6;
        this.locations = list;
        this.target = x0Var;
        this.priority = num;
        this.conditions = map;
        this.resources = a1Var;
        this.behaviors = map2;
        this.additionalTextFields = map3;
        this.tags = list2;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0287  */
    /* JADX WARN: Code duplicated, block: B:127:0x028c  */
    /* JADX WARN: Code duplicated, block: B:135:0x02af  */
    /* JADX WARN: Code duplicated, block: B:61:0x0140  */
    /* JADX WARN: Failed to find 'out' block for switch in B:78:0x018c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.StringBuilder] */
    public final y0 a() {
        Object next;
        ?? arrayList;
        t0.b bVar;
        n0 n0Var;
        k0 k0Var;
        w0 w0Var;
        String strB;
        List<String> list;
        Set setG1;
        w0 c0Var;
        Object next2;
        String strC;
        Object next3;
        Object next4;
        if (this.id == null) {
            a2 a2Var = a2.PROMOTIONS;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "PromotionDTO", "Promo missing id");
            return null;
        }
        p0.a aVar = p0.f25523b;
        String str = this.type;
        aVar.getClass();
        Iterator it = p0.f25530i.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((p0) next).f25531a, str));
        p0 p0Var = (p0) next;
        if (p0Var == null) {
            a2 a2Var2 = a2.PROMOTIONS;
            String str2 = "Promo " + this.id + " has unknown type: " + p0Var;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "PromotionDTO", str2);
            return null;
        }
        List<String> list2 = this.locations;
        if (list2 != null) {
            arrayList = new ArrayList();
            for (String str3 : list2) {
                s0.f25561b.getClass();
                str3.getClass();
                Iterator it3 = s0.E.iterator();
                do {
                    if (!it3.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it3.next();
                } while (!p005kotlin.jvm.internal.s.g(((s0) next4).f25584a, str3));
                s0 s0Var = (s0) next4;
                if (s0Var != null) {
                    arrayList.add(s0Var);
                }
            }
        } else {
            arrayList = p13.j0.f134944a;
        }
        ?? r14 = arrayList;
        if (r14.isEmpty()) {
            a2 a2Var3 = a2.PROMOTIONS;
            String str4 = "Promo " + this.id + " has no known locations: " + r14;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "PromotionDTO", str4);
            return null;
        }
        n0 n0Var2 = new n0(this.conditions);
        k0 k0Var2 = new k0(this.behaviors);
        t0.a aVar2 = t0.f25589d;
        a1 a1Var = this.resources;
        aVar2.getClass();
        if (a1Var == null || (strC = a1Var.getImage()) == null) {
            bVar = null;
        } else {
            if (d53.w.J(strC)) {
                strC = null;
            }
            if (strC != null) {
                t0.b.f25593c.getClass();
                Uri uri = Uri.parse(strC);
                String path = uri.getPath();
                if (path == null) {
                    bVar = null;
                } else {
                    i0.a aVar3 = i0.f25384b;
                    String queryParameter = uri.getQueryParameter("backgroundStyle");
                    aVar3.getClass();
                    Iterator it4 = i0.f25389g.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it4.next();
                    } while (!d53.u.q(((i0) next3).f25390a, queryParameter, true));
                    i0 i0Var = (i0) next3;
                    if (i0Var == null) {
                        i0Var = i0.MASK;
                    }
                    bVar = new t0.b(path, i0Var);
                }
            } else {
                bVar = null;
            }
        }
        t0 t0Var = new t0(bVar, a1Var != null ? a1Var.getIcon() : null, a1Var != null ? a1Var.getIconPrerendered() : null);
        String str5 = this.id;
        Map<String, String> map = this.additionalTextFields;
        String str6 = map != null ? map.get("Overline") : null;
        String str7 = this.title;
        String str8 = this.body;
        String str9 = this.cta;
        String str10 = this.dismissLabel;
        Integer num = this.priority;
        w0.a aVar4 = w0.f25630a;
        x0 x0Var = this.target;
        aVar4.getClass();
        String strB2 = x0Var != null ? x0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() : null;
        if (strB2 != null) {
            switch (strB2.hashCode()) {
                case -794188357:
                    n0Var = n0Var2;
                    k0Var = k0Var2;
                    if (strB2.equals("appLink")) {
                        c0.f25313c.getClass();
                        x0Var.getClass();
                        String strC2 = x0Var.getValue();
                        if (strC2 != null) {
                            c0Var = new c0(strC2);
                            w0Var = c0Var;
                        } else {
                            a2 a2Var4 = a2.PROMOTIONS;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var4, "PromoAppLinkTarget", "Missing value");
                        }
                    } else {
                        a2 a2Var5 = a2.PROMOTIONS;
                        if (x0Var != null) {
                            strB = x0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
                        } else {
                            strB = null;
                        }
                        String strN = fb1.c.n("Invalid target type ", strB);
                        i2.f36769a.getClass();
                        i2.a.f(a2Var5, "PromoTarget", strN);
                    }
                    w0Var = null;
                    break;
                case 96801:
                    n0Var = n0Var2;
                    if (strB2.equals("app")) {
                        d0.f25323d.getClass();
                        x0Var.getClass();
                        String strC3 = x0Var.getValue();
                        if (strC3 != null) {
                            d0.b.f25326b.getClass();
                            Iterator it5 = d0.b.f25346x.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    next2 = it5.next();
                                    k0Var = k0Var2;
                                    if (!p005kotlin.jvm.internal.s.g(((d0.b) next2).f25347a, strC3)) {
                                        k0Var2 = k0Var;
                                    }
                                } else {
                                    k0Var = k0Var2;
                                    next2 = null;
                                }
                            }
                            d0.b bVar2 = (d0.b) next2;
                            if (bVar2 != null) {
                                Map<String, String> mapA = x0Var.a();
                                if (mapA == null) {
                                    mapA = p13.k0.f134949a;
                                    mapA.getClass();
                                }
                                c0Var = new d0(bVar2, mapA);
                                w0Var = c0Var;
                            } else {
                                a2 a2Var6 = a2.PROMOTIONS;
                                String strConcat = "Invalid destination ".concat(strC3);
                                i2.f36769a.getClass();
                                i2.a.f(a2Var6, "PromoAppTarget", strConcat);
                            }
                        } else {
                            a2 a2Var7 = a2.PROMOTIONS;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var7, "PromoAppTarget", "Missing value");
                            k0Var = k0Var2;
                        }
                        break;
                    }
                    w0Var = null;
                    break;
                case 3321850:
                    n0Var = n0Var2;
                    if (strB2.equals("link")) {
                        r0.f25556c.getClass();
                        x0Var.getClass();
                        String strC4 = x0Var.getValue();
                        if (strC4 == null) {
                            a2 a2Var8 = a2.PROMOTIONS;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var8, "PromoLinkTarget", "Missing value");
                            k0Var = k0Var2;
                            w0Var = null;
                        } else {
                            c0Var = new r0(strC4);
                            k0Var = k0Var2;
                            w0Var = c0Var;
                        }
                    }
                    break;
                case 3387192:
                    if (strB2.equals("none")) {
                        c0Var = a0.f25291b;
                        n0Var = n0Var2;
                        k0Var = k0Var2;
                        w0Var = c0Var;
                    } else {
                        n0Var = n0Var2;
                    }
                    break;
                default:
                    n0Var = n0Var2;
                    break;
            }
            list = this.tags;
            if (list != null || (setG1 = p13.h0.g1(list)) == null) {
                setG1 = p13.l0.f134950a;
            }
            return new y0(str5, p0Var, str6, str7, str8, str9, str10, r14, num, n0Var, k0Var, t0Var, w0Var, setG1);
        }
        n0Var = n0Var2;
        k0Var = k0Var2;
        a2 a2Var9 = a2.PROMOTIONS;
        if (x0Var != null) {
            strB = x0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
        } else {
            strB = null;
        }
        String strN2 = fb1.c.n("Invalid target type ", strB);
        i2.f36769a.getClass();
        i2.a.f(a2Var9, "PromoTarget", strN2);
        w0Var = null;
        list = this.tags;
        if (list != null) {
            setG1 = p13.l0.f134950a;
        } else {
            setG1 = p13.l0.f134950a;
        }
        return new y0(str5, p0Var, str6, str7, str8, str9, str10, r14, num, n0Var, k0Var, t0Var, w0Var, setG1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return p005kotlin.jvm.internal.s.g(this.id, z0Var.id) && p005kotlin.jvm.internal.s.g(this.type, z0Var.type) && p005kotlin.jvm.internal.s.g(this.title, z0Var.title) && p005kotlin.jvm.internal.s.g(this.body, z0Var.body) && p005kotlin.jvm.internal.s.g(this.cta, z0Var.cta) && p005kotlin.jvm.internal.s.g(this.dismissLabel, z0Var.dismissLabel) && p005kotlin.jvm.internal.s.g(this.locations, z0Var.locations) && p005kotlin.jvm.internal.s.g(this.target, z0Var.target) && p005kotlin.jvm.internal.s.g(this.priority, z0Var.priority) && p005kotlin.jvm.internal.s.g(this.conditions, z0Var.conditions) && p005kotlin.jvm.internal.s.g(this.resources, z0Var.resources) && p005kotlin.jvm.internal.s.g(this.behaviors, z0Var.behaviors) && p005kotlin.jvm.internal.s.g(this.additionalTextFields, z0Var.additionalTextFields) && p005kotlin.jvm.internal.s.g(this.tags, z0Var.tags);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.body;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cta;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dismissLabel;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.locations;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        x0 x0Var = this.target;
        int iHashCode8 = (iHashCode7 + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        Integer num = this.priority;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, String> map = this.conditions;
        int iHashCode10 = (iHashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        a1 a1Var = this.resources;
        int iHashCode11 = (iHashCode10 + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        Map<String, String> map2 = this.behaviors;
        int iHashCode12 = (iHashCode11 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.additionalTextFields;
        int iHashCode13 = (iHashCode12 + (map3 == null ? 0 : map3.hashCode())) * 31;
        List<String> list2 = this.tags;
        return iHashCode13 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.type;
        String str3 = this.title;
        String str4 = this.body;
        String str5 = this.cta;
        String str6 = this.dismissLabel;
        List<String> list = this.locations;
        x0 x0Var = this.target;
        Integer num = this.priority;
        Map<String, String> map = this.conditions;
        a1 a1Var = this.resources;
        Map<String, String> map2 = this.behaviors;
        Map<String, String> map3 = this.additionalTextFields;
        List<String> list2 = this.tags;
        StringBuilder sbI = p6.b.i("PromotionDTO(id=", str, ", type=", str2, ", title=");
        sn.a.t(sbI, str3, ", body=", str4, ", cta=");
        sn.a.t(sbI, str5, ", dismissLabel=", str6, ", locations=");
        sbI.append(list);
        sbI.append(", target=");
        sbI.append(x0Var);
        sbI.append(", priority=");
        sbI.append(num);
        sbI.append(", conditions=");
        sbI.append(map);
        sbI.append(", resources=");
        sbI.append(a1Var);
        sbI.append(", behaviors=");
        sbI.append(map2);
        sbI.append(", additionalTextFields=");
        sbI.append(map3);
        sbI.append(", tags=");
        sbI.append(list2);
        sbI.append(")");
        return sbI.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lc80/z0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "OVERLINE_TEXT_KEY", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

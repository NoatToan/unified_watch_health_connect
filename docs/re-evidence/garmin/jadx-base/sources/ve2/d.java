package ve2;

import java.util.Collection;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lve2/d;", "", "Lve2/e;", "environment", "", "customerGUID", "customerName", "customerImageURL", "Lve2/a;", "connectData", "Ldd2/a;", "credentials", "", "isSystemAcctManaged", "Lve2/k;", "mfaTokenData", "<init>", "(Lve2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lve2/a;Ldd2/a;ZLve2/k;)V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f177690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f177691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f177692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f177693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ve2.a f177694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public dd2.a f177695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f177696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f177697h;

    static {
        new a(null);
    }

    public /* synthetic */ d(e eVar, String str, String str2, String str3, ve2.a aVar, dd2.a aVar2, boolean z14, k kVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(eVar, str, str2, str3, aVar, aVar2, (i14 & 64) != 0 ? true : z14, (i14 & 128) != 0 ? null : kVar);
    }

    public static JSONObject a(d dVar) throws JSONException {
        JSONObject jSONObject;
        dVar.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(a.EnumC3323a.ENVIRONMENT.f177703a, dVar.f177690a.name());
        jSONObject2.put(a.EnumC3323a.CUSTOMER_GUID.f177703a, dVar.f177691b);
        jSONObject2.put(a.EnumC3323a.CUSTOMER_NAME.f177703a, dVar.f177692c);
        String str = dVar.f177693d;
        if (str != null) {
            jSONObject2.put(a.EnumC3323a.CUSTOMER_IMAGE_URL.f177703a, str);
        }
        ve2.a aVar = dVar.f177694e;
        if (aVar != null) {
            String str2 = ve2.a.C3321a.EnumC3322a.ROOT.f177687a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(ve2.a.C3321a.EnumC3322a.USER_PROFILE_ID.f177687a, aVar.f177677a);
            jSONObject3.put(ve2.a.C3321a.EnumC3322a.USER_DISPLAY_NAME_ID.f177687a, aVar.f177678b);
            jSONObject3.put(ve2.a.C3321a.EnumC3322a.USER_HAS_MB_TESTER_ROLE.f177687a, aVar.f177679c);
            jSONObject3.put(ve2.a.C3321a.EnumC3322a.USER_ROLES.f177687a, new JSONArray((Collection) aVar.f177680d));
            jSONObject2.put(str2, jSONObject3);
        }
        dd2.a aVar2 = dVar.f177695f;
        if (aVar2 != null) {
            String str3 = dd2.a.C1262a.EnumC1263a.ROOT.f59209a;
            if (aVar2.f59204a == null && aVar2.f59205b == null && aVar2.f59206c == null) {
                jSONObject = null;
            } else {
                jSONObject = new JSONObject();
                sc2.j jVar = aVar2.f59204a;
                if (jVar != null) {
                    String str4 = sc2.j.a.EnumC2993a.ROOT.f158520a;
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(sc2.j.a.EnumC2993a.USER_TOKEN.f158520a, jVar.f158514a);
                    jSONObject4.put(sc2.j.a.EnumC2993a.USER_SECRET.f158520a, jVar.f158515b);
                    jSONObject.put(str4, jSONObject4);
                }
                sc2.o oVar = aVar2.f59205b;
                if (oVar != null) {
                    String str5 = sc2.o.b.a.ROOT.f158553a;
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put(sc2.o.b.a.ACCESS_TOKEN.f158553a, oVar.f158544a);
                    jSONObject5.put(sc2.o.b.a.ACCESS_TOKEN_EXPIRE_DATE_UTC.f158553a, oVar.f158545b);
                    jSONObject5.put(sc2.o.b.a.REFRESH_TOKEN.f158553a, oVar.f158546c);
                    jSONObject.put(str5, jSONObject5);
                }
                sc2.m mVar = aVar2.f59206c;
                if (mVar != null) {
                    String str6 = sc2.m.b.a.ROOT.f158539a;
                    JSONObject jSONObject6 = new JSONObject();
                    Set<String> set = mVar.f158527a;
                    if (set != null) {
                        jSONObject6.put(sc2.m.b.a.SCOPES.f158539a, new JSONArray((Collection) set));
                    }
                    jSONObject6.put(sc2.m.b.a.ACCESS_TOKEN.f158539a, mVar.f158528b);
                    jSONObject6.put(sc2.m.b.a.REFRESH_TOKEN.f158539a, mVar.f158529c);
                    jSONObject6.put(sc2.m.b.a.ACCESS_TOKEN_EXPIRE_DATE_UTC.f158539a, mVar.f158530d);
                    jSONObject6.put(sc2.m.b.a.REFRESH_TOKEN_EXPIRE_DATE_UTC.f158539a, mVar.f158531e);
                    jSONObject.put(str6, jSONObject6);
                }
            }
            jSONObject2.put(str3, jSONObject);
        }
        k kVar = dVar.f177697h;
        if (kVar != null) {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put(k.a.EnumC3324a.TOKEN_VAL.f177759a, kVar.f177753a);
            jSONObject7.put(k.a.EnumC3324a.TOKEN_EXPIRY_UTC.f177759a, kVar.f177754b);
            jSONObject2.put(k.a.EnumC3324a.ROOT.f177759a, jSONObject7);
        }
        return jSONObject2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f177690a == dVar.f177690a && p005kotlin.jvm.internal.s.g(this.f177691b, dVar.f177691b) && p005kotlin.jvm.internal.s.g(this.f177692c, dVar.f177692c) && p005kotlin.jvm.internal.s.g(this.f177693d, dVar.f177693d) && p005kotlin.jvm.internal.s.g(this.f177694e, dVar.f177694e) && p005kotlin.jvm.internal.s.g(this.f177695f, dVar.f177695f) && this.f177696g == dVar.f177696g && p005kotlin.jvm.internal.s.g(this.f177697h, dVar.f177697h);
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(this.f177690a.hashCode() * 31, 31, this.f177691b), 31, this.f177692c);
        String str = this.f177693d;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        ve2.a aVar = this.f177694e;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        dd2.a aVar2 = this.f177695f;
        int iG = q6.f.g((iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.f177696g);
        k kVar = this.f177697h;
        return iG + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() throws JSONException {
        return "isSystemAcctManaged -> " + this.f177696g + "\n\n" + a(this).toString(4);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lve2/d$a;", "", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: ve2.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lve2/d$a$a;", "", "", "keyName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum EnumC3323a {
            ENVIRONMENT("environment"),
            CUSTOMER_GUID("customerGUID"),
            CUSTOMER_NAME("customerName"),
            CUSTOMER_IMAGE_URL("customerImageURL");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f177703a;

            EnumC3323a(String str) {
                this.f177703a = str;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public d(e eVar, String str, String str2, String str3, ve2.a aVar, dd2.a aVar2, boolean z14, k kVar) {
        eVar.getClass();
        str.getClass();
        str2.getClass();
        this.f177690a = eVar;
        this.f177691b = str;
        this.f177692c = str2;
        this.f177693d = str3;
        this.f177694e = aVar;
        this.f177695f = aVar2;
        this.f177696g = z14;
        this.f177697h = kVar;
    }
}

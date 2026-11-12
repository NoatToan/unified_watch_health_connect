package te2;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lte2/g2;", "", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g2 f164047a = new g2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o13.t f164048b = o13.m.b(new ta0.g(11));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static SharedPreferences f164049c;

    private g2() {
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01bf A[PHI: r8
      0x01bf: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String) binds: [B:34:0x00dc, B:56:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static ve2.d a() {
        ve2.a aVar;
        Object aVar2;
        Object jVar;
        sc2.m mVar;
        sc2.j jVar2;
        sc2.o oVar;
        sc2.o oVar2;
        Set setG1;
        SharedPreferences sharedPreferences = f164049c;
        Set setG2 = null;
        if (sharedPreferences == null) {
            p005kotlin.jvm.internal.s.m("prefs");
            throw null;
        }
        String string = sharedPreferences.getString("signedin.account", null);
        if (string == null) {
            return null;
        }
        SharedPreferences sharedPreferences2 = f164049c;
        if (sharedPreferences2 == null) {
            p005kotlin.jvm.internal.s.m("prefs");
            throw null;
        }
        t0 t0Var = new t0(!sharedPreferences2.contains("is.signin.fallback"), string);
        JSONObject jSONObject = new JSONObject(t0Var.f164303b);
        String strOptString = jSONObject.optString(ve2.d.a.EnumC3323a.CUSTOMER_GUID.f177703a, "");
        String string2 = jSONObject.getString(ve2.d.a.EnumC3323a.ENVIRONMENT.f177703a);
        string2.getClass();
        ve2.e eVarValueOf = ve2.e.valueOf(string2);
        strOptString.getClass();
        String string3 = jSONObject.getString(ve2.d.a.EnumC3323a.CUSTOMER_NAME.f177703a);
        string3.getClass();
        String strOptString2 = jSONObject.optString(ve2.d.a.EnumC3323a.CUSTOMER_IMAGE_URL.f177703a);
        String str = (strOptString2 == null || d53.w.J(strOptString2)) ^ true ? strOptString2 : null;
        ve2.a.f177676e.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(ve2.a.C3321a.EnumC3322a.ROOT.f177687a);
        if (jSONObjectOptJSONObject != null) {
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(ve2.a.C3321a.EnumC3322a.USER_ROLES.f177687a);
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i14 = 0; i14 < length; i14++) {
                    String string4 = jSONArrayOptJSONArray.getString(i14);
                    string4.getClass();
                    arrayList.add(string4);
                }
                setG2 = p13.h0.g1(arrayList);
            }
            long jOptLong = jSONObjectOptJSONObject.optLong(ve2.a.C3321a.EnumC3322a.USER_PROFILE_ID.f177687a, 0L);
            String strOptString3 = jSONObjectOptJSONObject.optString(ve2.a.C3321a.EnumC3322a.USER_DISPLAY_NAME_ID.f177687a, "");
            strOptString3.getClass();
            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean(ve2.a.C3321a.EnumC3322a.USER_HAS_MB_TESTER_ROLE.f177687a, false);
            if (setG2 == null) {
                setG2 = p13.l0.f134950a;
            }
            aVar = new ve2.a(jOptLong, strOptString3, zOptBoolean, setG2);
        } else {
            setG2 = null;
            aVar = null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(dd2.a.C1262a.EnumC1263a.ROOT.f59209a);
        if (jSONObjectOptJSONObject2 != null) {
            sc2.j.f158513c.getClass();
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(sc2.j.a.EnumC2993a.ROOT.f158520a);
            if (jSONObjectOptJSONObject3 != null) {
                String strOptString4 = jSONObjectOptJSONObject3.optString(sc2.j.a.EnumC2993a.USER_TOKEN.f158520a, "");
                strOptString4.getClass();
                String strOptString5 = jSONObjectOptJSONObject3.optString(sc2.j.a.EnumC2993a.USER_SECRET.f158520a, "");
                strOptString5.getClass();
                jVar = new sc2.j(strOptString4, strOptString5);
            } else {
                jVar = setG2;
            }
            sc2.m.f158526f.getClass();
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject(sc2.m.b.a.ROOT.f158539a);
            if (jSONObjectOptJSONObject4 != null) {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray(sc2.m.b.a.SCOPES.f158539a);
                if (jSONArrayOptJSONArray2 != null) {
                    int length2 = jSONArrayOptJSONArray2.length();
                    ArrayList arrayList2 = new ArrayList(length2);
                    for (int i15 = 0; i15 < length2; i15++) {
                        String string5 = jSONArrayOptJSONArray2.getString(i15);
                        string5.getClass();
                        arrayList2.add(string5);
                    }
                    setG1 = p13.h0.g1(arrayList2);
                } else {
                    setG1 = setG2;
                }
                String strOptString6 = jSONObjectOptJSONObject4.optString(sc2.m.b.a.ACCESS_TOKEN.f158539a, "");
                strOptString6.getClass();
                String strOptString7 = jSONObjectOptJSONObject4.optString(sc2.m.b.a.REFRESH_TOKEN.f158539a, "");
                strOptString7.getClass();
                mVar = new sc2.m(setG1, strOptString6, strOptString7, jSONObjectOptJSONObject4.optLong(sc2.m.b.a.ACCESS_TOKEN_EXPIRE_DATE_UTC.f158539a, 0L), jSONObjectOptJSONObject4.optLong(sc2.m.b.a.REFRESH_TOKEN_EXPIRE_DATE_UTC.f158539a, 0L));
            } else {
                mVar = setG2;
            }
            sc2.o.f158543e.getClass();
            JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject2.optJSONObject(sc2.o.b.a.ROOT.f158553a);
            if (jSONObjectOptJSONObject5 != null) {
                String strOptString8 = jSONObjectOptJSONObject5.optString(sc2.o.b.a.ACCESS_TOKEN.f158553a, "");
                strOptString8.getClass();
                long jOptLong2 = jSONObjectOptJSONObject5.optLong(sc2.o.b.a.ACCESS_TOKEN_EXPIRE_DATE_UTC.f158553a, 0L);
                String strOptString9 = jSONObjectOptJSONObject5.optString(sc2.o.b.a.REFRESH_TOKEN.f158553a, "");
                strOptString9.getClass();
                jVar2 = jVar;
                oVar2 = new sc2.o(strOptString8, jOptLong2, strOptString9, strOptString);
            } else {
                jVar2 = jVar;
                oVar = setG2;
            }
            if (jVar2 == 0 && oVar == 0 && mVar == 0) {
                aVar2 = setG2;
            } else {
                strOptString = strOptString;
                oVar = oVar2;
                aVar2 = new dd2.a(jVar2, oVar, mVar);
            }
        } else {
            aVar2 = setG2;
        }
        ve2.k.f177752c.getClass();
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject(ve2.k.a.EnumC3324a.ROOT.f177759a);
        return new ve2.d(eVarValueOf, strOptString, string3, str, aVar, aVar2, t0Var.f164302a, jSONObjectOptJSONObject6 != null ? new ve2.k(jSONObjectOptJSONObject6.optString(ve2.k.a.EnumC3324a.TOKEN_VAL.f177759a, ""), Long.valueOf(jSONObjectOptJSONObject6.optLong(ve2.k.a.EnumC3324a.TOKEN_EXPIRY_UTC.f177759a, 0L))) : setG2);
    }

    @SuppressLint({"ApplySharedPref"})
    public static ve2.d b() {
        ve2.d dVarA = a();
        SharedPreferences sharedPreferences = f164049c;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("signedin.account").remove("is.signin.fallback").remove("user.age.status.response").commit();
            return dVarA;
        }
        p005kotlin.jvm.internal.s.m("prefs");
        throw null;
    }

    @SuppressLint({"ApplySharedPref"})
    public static void c(ve2.d dVar) {
        dVar.getClass();
        JSONObject jSONObjectA = ve2.d.a(dVar);
        SharedPreferences sharedPreferences = f164049c;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("signedin.account", jSONObjectA.toString()).commit();
        } else {
            p005kotlin.jvm.internal.s.m("prefs");
            throw null;
        }
    }
}

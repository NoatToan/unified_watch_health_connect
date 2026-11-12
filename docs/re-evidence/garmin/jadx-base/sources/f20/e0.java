package f20;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p13.h0;
import p13.u0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lf20/e0;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f68384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f68385b;

    static {
        new a(null);
    }

    public e0(Context context) {
        String str;
        ArrayList arrayList;
        List listN0;
        ArrayList arrayList2;
        context.getClass();
        ArrayList arrayList3 = null;
        Object obj = null;
        arrayList3 = null;
        arrayList3 = null;
        try {
            InputStream inputStreamOpen = context.getAssets().open("phone_number_prefixes.json");
            inputStreamOpen.getClass();
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            str = new String(bArr, d53.c.f57666b);
        } catch (IOException e4) {
            e4.getMessage();
            str = null;
        }
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                arrayList = new ArrayList(length);
                for (int i14 = 0; i14 < length; i14++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i14);
                    String string = jSONObject.getString("code");
                    String string2 = jSONObject.getString("prefix");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("regional_codes");
                    if (jSONArrayOptJSONArray != null) {
                        int length2 = jSONArrayOptJSONArray.length();
                        arrayList2 = new ArrayList(length2);
                        for (int i15 = 0; i15 < length2; i15++) {
                            arrayList2.add(jSONArrayOptJSONArray.getString(i15));
                        }
                    } else {
                        arrayList2 = null;
                    }
                    c22.b0 b0Var = c22.b0.f23008a;
                    string.getClass();
                    b0Var.getClass();
                    String strA = c22.b0.a(string, false);
                    string2.getClass();
                    arrayList.add(new c0(string, strA, string2, arrayList2));
                }
            } catch (JSONException e14) {
                e14.getMessage();
                arrayList = null;
            }
            if (arrayList != null && (listN0 = h0.N0(arrayList, new f0())) != null) {
                ArrayList arrayList4 = new ArrayList();
                String strA2 = hb2.e.a(context);
                strA2.getClass();
                Locale locale = Locale.getDefault();
                locale.getClass();
                String upperCase = strA2.toUpperCase(locale);
                upperCase.getClass();
                for (Object obj2 : listN0) {
                    if (p005kotlin.jvm.internal.s.g(((c0) obj2).f68360a, upperCase)) {
                        obj = obj2;
                        break;
                    }
                }
                c0 c0Var = (c0) obj;
                if (c0Var != null) {
                    arrayList4.add(c0Var);
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : listN0) {
                    if (!p005kotlin.jvm.internal.s.g(((c0) obj3).f68360a, upperCase)) {
                        arrayList5.add(obj3);
                    }
                }
                arrayList4.addAll(arrayList5);
                arrayList3 = arrayList4;
            }
        }
        if (arrayList3 == null) {
            kg.f.n("Prefixes asset file missing or malformed, please fix!");
            throw null;
        }
        this.f68384a = arrayList3;
        for (Object obj4 : arrayList3) {
            if (p005kotlin.jvm.internal.s.g(((c0) obj4).f68360a, Locale.US.getCountry())) {
                o13.p pVar = new o13.p("+1", obj4);
                for (Object obj5 : this.f68384a) {
                    if (p005kotlin.jvm.internal.s.g(((c0) obj5).f68360a, Locale.UK.getCountry())) {
                        this.f68385b = u0.e(pVar, new o13.p("+44", obj5));
                        return;
                    }
                }
                n23.j.s("Collection contains no element matching the predicate.");
                throw null;
            }
        }
        n23.j.s("Collection contains no element matching the predicate.");
        throw null;
    }

    public static boolean b(String str, String str2) {
        return d53.u.y(str2, str, false) && !d53.w.J(d53.w.O(str2, str));
    }

    public final boolean a(String str) {
        str.getClass();
        ArrayList arrayList = this.f68384a;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (b(((c0) it.next()).f68362c, str)) {
                return true;
            }
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lf20/e0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "COUNTRY_INFO_ASSETS_FILE_NAME", "FIELD_COUNTRY_CODE", "FIELD_PREFIX", "FIELD_REGIONAL_CODES", "PREFIX_US", "PREFIX_UK", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

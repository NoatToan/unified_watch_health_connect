package defpackage;

import android.text.TextUtils;
import com.alipay.sdk.m.u.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class of {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44272b;
    public a d;
    public String[] e;

    public static String[] a(String str) {
        ArrayList arrayList = new ArrayList();
        int iIndexOf = str.indexOf(40);
        int iLastIndexOf = str.lastIndexOf(41);
        if (iIndexOf == -1 || iLastIndexOf == -1 || iLastIndexOf <= iIndexOf) {
            return null;
        }
        for (String str2 : str.substring(iIndexOf + 1, iLastIndexOf).split("' *, *'", -1)) {
            arrayList.add(str2.trim().replaceAll("'", "").replaceAll("\"", ""));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void e(of ofVar) {
        String[] strArrC = ofVar.c();
        if (strArrC.length == 3 && TextUtils.equals("tid", strArrC[0])) {
            ok okVarA = ok.a(ol.e().c());
            if (TextUtils.isEmpty(strArrC[1]) || TextUtils.isEmpty(strArrC[2])) {
                return;
            }
            okVarA.c(strArrC[1], strArrC[2]);
        }
    }

    public String[] c() {
        return this.e;
    }

    public of(String str, a aVar) {
        this.f44272b = str;
        this.d = aVar;
    }

    public static List<of> c(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            String[] strArrE = e(jSONObject.optString("name", ""));
            for (int i = 0; i < strArrE.length; i++) {
                a aVarA = a.a(strArrE[i]);
                if (aVarA != a.None) {
                    of ofVar = new of(strArrE[i], aVarA);
                    ofVar.e = a(strArrE[i]);
                    arrayList.add(ofVar);
                }
            }
        }
        return arrayList;
    }

    public static String[] e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(";");
    }

    public a e() {
        return this.d;
    }
}

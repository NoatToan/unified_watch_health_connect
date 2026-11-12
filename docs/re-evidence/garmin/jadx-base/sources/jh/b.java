package jh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f98745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f98746b;

    public b(String str, a aVar) {
        this.f98745a = aVar;
    }

    public static ArrayList a(JSONObject jSONObject) {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("name", "");
            String[] strArrSplit = !TextUtils.isEmpty(strOptString) ? strOptString.split(";") : null;
            for (int i14 = 0; i14 < strArrSplit.length; i14++) {
                String str = strArrSplit[i14];
                a aVar = a.None;
                if (!TextUtils.isEmpty(str)) {
                    for (a aVar2 : a.values()) {
                        if (str.startsWith(aVar2.f98744a)) {
                            aVar = aVar2;
                            break;
                        }
                    }
                }
                if (aVar != a.None) {
                    b bVar = new b(strArrSplit[i14], aVar);
                    String str2 = strArrSplit[i14];
                    ArrayList arrayList2 = new ArrayList();
                    int iIndexOf = str2.indexOf(40);
                    int iLastIndexOf = str2.lastIndexOf(41);
                    if (iIndexOf == -1 || iLastIndexOf == -1 || iLastIndexOf <= iIndexOf) {
                        strArr = null;
                    } else {
                        String[] strArrSplit2 = str2.substring(iIndexOf + 1, iLastIndexOf).split("' *, *'", -1);
                        for (String str3 : strArrSplit2) {
                            arrayList2.add(str3.trim().replaceAll("'", "").replaceAll("\"", ""));
                        }
                        strArr = (String[]) arrayList2.toArray(new String[0]);
                    }
                    bVar.f98746b = strArr;
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public static void b(b bVar) {
        String[] strArr = bVar.f98746b;
        if (strArr.length == 3 && TextUtils.equals("tid", strArr[0])) {
            mh.a aVarA = mh.a.a(lh.b.b().f112390a);
            if (TextUtils.isEmpty(strArr[1]) || TextUtils.isEmpty(strArr[2])) {
                return;
            }
            aVarA.b(strArr[1], strArr[2]);
        }
    }

    public b(String str) {
    }
}

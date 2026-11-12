package com.alipay.sdk.protocol;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f5863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5864b;
    public String[] c;

    public b(String str, a aVar) {
        this.f5864b = str;
        this.f5863a = aVar;
    }

    public static List<b> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        String[] strArrE = e(jSONObject.optString("name", ""));
        for (int i = 0; i < strArrE.length; i++) {
            a aVarA = a.a(strArrE[i]);
            if (aVarA != a.None) {
                b bVar = new b(strArrE[i], aVarA);
                bVar.c = c(strArrE[i]);
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public static void b(b bVar) {
        String[] strArrF = bVar.f();
        if (strArrF.length == 3 && TextUtils.equals("tid", strArrF[0])) {
            com.alipay.sdk.tid.a aVarA = com.alipay.sdk.tid.a.a(com.alipay.sdk.sys.b.a().c());
            if (TextUtils.isEmpty(strArrF[1]) || TextUtils.isEmpty(strArrF[2])) {
                return;
            }
            aVarA.c(strArrF[1], strArrF[2]);
        }
    }

    public static String[] c(String str) {
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

    public static String[] e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(";");
    }

    public a d() {
        return this.f5863a;
    }

    public String[] f() {
        return this.c;
    }
}

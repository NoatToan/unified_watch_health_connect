package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<b1> f13504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13506c;
    private String d;

    public void a() {
        if (!"_default_config_tag".equals(this.f13506c)) {
            a(this.f13504a, this.f13506c, this.f13505b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (b1 b1Var : this.f13504a) {
            String strC = b1Var.c();
            if (TextUtils.isEmpty(strC) || "oper".equals(strC)) {
                arrayList4.add(b1Var);
            } else if ("maint".equals(strC)) {
                arrayList.add(b1Var);
            } else if ("preins".equals(strC)) {
                arrayList2.add(b1Var);
            } else if ("diffprivacy".equals(strC)) {
                arrayList3.add(b1Var);
            }
        }
        a(arrayList4, "oper", "_default_config_tag");
        a(arrayList, "maint", "_default_config_tag");
        a(arrayList2, "preins", "_default_config_tag");
        a(arrayList3, "diffprivacy", "_default_config_tag");
    }

    private void a(List<b1> list, String str, String str2) {
        if (!list.isEmpty()) {
            int size = list.size() / 500;
            for (int i = 0; i < size + 1; i++) {
                int i2 = i * 500;
                List<b1> listSubList = list.subList(i2, Math.min(list.size(), i2 + 500));
                String strReplace = UUID.randomUUID().toString().replace(Constants.LINK, "");
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jB = a1.b(str2, str);
                ArrayList arrayList = new ArrayList();
                for (b1 b1Var : listSubList) {
                    if (!c0.a(b1Var.b(), jCurrentTimeMillis, 86400000 * jB)) {
                        arrayList.add(b1Var);
                    }
                }
                if (arrayList.size() > 0) {
                    new l0(str2, str, this.d, arrayList, strReplace).a();
                } else {
                    v.e("hmsSdk", "No data to report handler");
                }
            }
        }
    }

    public u(List<b1> list, String str, String str2, String str3) {
        this.f13504a = list;
        this.f13505b = str;
        this.f13506c = str2;
        this.d = str3;
    }
}

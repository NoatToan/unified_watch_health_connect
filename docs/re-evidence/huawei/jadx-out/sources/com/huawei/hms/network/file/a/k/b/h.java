package com.huawei.hms.network.file.a.k.b;

import com.huawei.hms.network.embedded.g4;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<a> f15706b = new ArrayList();

    public String a() {
        String str;
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append(this.f15705a);
        sb.append(g4.k);
        for (a aVar : this.f15706b) {
            if (aVar.f15697c != null) {
                sb.append("PRIMARY KEY (");
                for (String str2 : aVar.f15697c) {
                    sb.append(str2);
                    sb.append(",");
                }
                sb.deleteCharAt(sb.length() - 1);
                str = Constants.RIGHT_BRACKET_ONLY;
            } else {
                sb.append(aVar.f15695a);
                sb.append(" ");
                sb.append(aVar.f15696b);
                if (aVar.d) {
                    sb.append(" PRIMARY KEY");
                }
                if (aVar.e) {
                    str = " unique";
                }
                sb.append(",");
            }
            sb.append(str);
            sb.append(",");
        }
        if (sb.toString().endsWith(",")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(g4.l);
        return sb.toString();
    }

    public h a(a aVar) {
        this.f15706b.add(aVar);
        return this;
    }

    public h(String str) {
        this.f15705a = str;
    }
}

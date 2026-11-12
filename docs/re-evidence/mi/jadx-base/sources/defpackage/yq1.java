package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class yq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rz0 f40417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f40418b;
    public Map<String, g4q> c;

    public synchronized void a(g4q g4qVar) {
        try {
            String strB = g4qVar.b();
            if (TextUtils.isEmpty(this.f40418b)) {
                this.f40418b = strB;
            } else {
                this.f40418b += "____" + strB;
            }
            b01.g("local_tv_ids", this.f40418b);
            if (this.c == null) {
                this.c = new HashMap();
            }
            this.c.put(g4qVar.b(), g4qVar);
            b01.g("airkan_tv_data" + strB, g4qVar.g());
        } catch (Throwable th) {
            throw th;
        }
    }

    public rz0 b() {
        return this.f40417a;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f40418b = str;
        String[] strArrSplit = str.split("____");
        this.c = new HashMap();
        for (String str2 : strArrSplit) {
            String strD = b01.d("airkan_tv_data" + str2);
            ycm.b("Info: id: " + str2 + ", json: " + strD);
            g4q g4qVarA = g4q.a(strD);
            this.c.put(g4qVarA.b(), g4qVarA);
        }
    }

    public void d() {
        b01.g("local_keypair", this.f40417a.f());
    }

    public void e(rz0 rz0Var) {
        this.f40417a = rz0Var;
    }
}

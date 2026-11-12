package com.alipay.security.mobile.module.d;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f5930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.alipay.security.mobile.module.http.v2.a f5931b;

    public b(String str, com.alipay.security.mobile.module.http.v2.a aVar) {
        this.f5930a = null;
        this.f5931b = null;
        this.f5930a = new File(str);
        this.f5931b = aVar;
    }

    public static String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "id");
            jSONObject.put("error", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public final void b() {
        new Thread(new c(this)).start();
    }

    public final synchronized void d() {
        try {
            File file = this.f5930a;
            if (file == null) {
                return;
            }
            if (file.exists() && this.f5930a.isDirectory() && this.f5930a.list().length != 0) {
                ArrayList arrayList = new ArrayList();
                for (String str : this.f5930a.list()) {
                    arrayList.add(str);
                }
                Collections.sort(arrayList);
                String str2 = (String) arrayList.get(arrayList.size() - 1);
                int size = arrayList.size();
                if (str2.equals(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log")) {
                    if (arrayList.size() < 2) {
                        return;
                    }
                    str2 = (String) arrayList.get(arrayList.size() - 2);
                    size--;
                }
                if (!this.f5931b.a(a(com.alipay.security.mobile.module.a.b.a(this.f5930a.getAbsolutePath(), str2)))) {
                    size--;
                }
                for (int i = 0; i < size; i++) {
                    new File(this.f5930a, (String) arrayList.get(i)).delete();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

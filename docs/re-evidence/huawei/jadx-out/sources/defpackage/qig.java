package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes43.dex */
public class qig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, Integer> f46268b = new ConcurrentHashMap<>();
    private int d;

    public qig(Context context, String str) {
        int iGlGetUniformLocation;
        String strD = qiq.d(str);
        qij qijVar = new qij();
        qijVar.a(qih.b(context, str));
        String str2 = strD + File.separator + qijVar.d();
        String str3 = strD + File.separator + qijVar.c();
        qid.e("Material", "vertexFile=" + str2 + " fragmentFile=" + str3);
        this.d = qik.a(context, str2, str3);
        for (Map.Entry<String, String> entry : qijVar.b().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.equals("attribute")) {
                iGlGetUniformLocation = GLES20.glGetAttribLocation(this.d, key);
            } else {
                iGlGetUniformLocation = value.equals("uniform") ? GLES20.glGetUniformLocation(this.d, key) : -1;
            }
            this.f46268b.put(key, Integer.valueOf(iGlGetUniformLocation));
        }
        qijVar.e();
    }

    public int c(String str) {
        Integer num = this.f46268b.get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public int e() {
        return this.d;
    }

    public void b() {
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.f46268b;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
            this.f46268b = null;
        }
    }
}

package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class rus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f32930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f32931b;
    public String c;

    public rus(Map<String, String> map) {
        if (map == null) {
            return;
        }
        for (String str : map.keySet()) {
            if (TextUtils.equals(str, "resultStatus")) {
                this.f32930a = map.get(str);
            } else if (TextUtils.equals(str, "result")) {
                this.f32931b = map.get(str);
            } else if (TextUtils.equals(str, "memo")) {
                this.c = map.get(str);
            }
        }
    }

    public String a() {
        return this.f32930a;
    }

    public String toString() {
        return "resultStatus={" + this.f32930a + "};memo={" + this.c + "};result={" + this.f32931b + "}";
    }
}

package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class r1p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f32085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f32086b;
    public Map<String, Object> c;
    public Map<String, String> d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f32087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f32088b;
        public Map<String, Object> c = new HashMap();
        public Map<String, String> d = new HashMap();

        public b a(String str, Object obj) {
            this.c.put(str, obj);
            return this;
        }

        public r1p b() {
            z5i.c(!TextUtils.isEmpty(this.f32087a), "host cannot be null");
            z5i.c(!TextUtils.isEmpty(this.f32088b), "path cannot be null");
            r1p r1pVar = new r1p();
            r1pVar.f32085a = this.f32087a;
            r1pVar.f32086b = this.f32088b;
            r1pVar.c = this.c;
            r1pVar.d = this.d;
            return r1pVar;
        }

        public b c(String str) {
            this.f32087a = str;
            return this;
        }

        public b d(String str) {
            this.f32088b = str;
            return this;
        }
    }

    public Map<String, String> e() {
        return this.d;
    }

    public Map<String, Object> f() {
        return this.c;
    }

    public String g() {
        return this.f32085a + this.f32086b;
    }

    public r1p() {
    }
}

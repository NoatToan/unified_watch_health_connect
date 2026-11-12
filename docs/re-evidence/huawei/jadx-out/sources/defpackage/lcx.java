package defpackage;

import android.text.TextUtils;
import com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lcx<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f39925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OnRequestCallBack<T> f39926c;
    private final boolean d;
    private final Map<String, Object> e;
    private final String i;

    private lcx(a<T> aVar) {
        this.i = ((a) aVar).f;
        this.f39926c = ((a) aVar).d;
        this.f39924a = ((a) aVar).e;
        this.e = ((a) aVar).f39928b;
        this.f39925b = ((a) aVar).f39927a;
        this.d = ((a) aVar).f39929c;
    }

    public Map<String, Object> b() {
        return this.f39925b;
    }

    public String e() {
        return this.f39924a;
    }

    public String d() {
        return this.i;
    }

    public Map<String, Object> c() {
        return this.e;
    }

    public OnRequestCallBack<T> a() {
        return this.f39926c;
    }

    public boolean i() {
        return this.d;
    }

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, Object> f39927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, Object> f39928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f39929c;
        private OnRequestCallBack<T> d;
        private String e;
        private String f;

        public a(String str) {
            this.f = str;
        }

        public a<T> c(OnRequestCallBack<T> onRequestCallBack) {
            this.d = onRequestCallBack;
            return this;
        }

        public a<T> b(String str) {
            this.e = str;
            return this;
        }

        public a<T> b(Map<String, Object> map) {
            this.f39928b = map;
            return this;
        }

        public a<T> e(Map<String, Object> map) {
            this.f39927a = map;
            return this;
        }

        public a<T> b(boolean z) {
            this.f39929c = z;
            return this;
        }

        public lcx<T> e() {
            if (TextUtils.isEmpty(this.f)) {
                throw new IllegalArgumentException("the url is empty");
            }
            if (this.d == null) {
                throw new IllegalArgumentException("the OnRequestCallBack is null");
            }
            if (this.f39928b == null) {
                this.f39928b = new HashMap(10);
            }
            if (this.f39927a == null) {
                this.f39927a = new HashMap(10);
            }
            if (TextUtils.isEmpty(this.e)) {
                this.e = "GET";
            }
            return new lcx<>(this);
        }
    }
}

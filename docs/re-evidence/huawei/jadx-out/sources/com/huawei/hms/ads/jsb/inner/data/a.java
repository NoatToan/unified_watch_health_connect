package com.huawei.hms.ads.jsb.inner.data;

import android.location.Location;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f12823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f12824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f12825c;
    private Integer d;
    private Location e;
    private String f;
    private boolean g = false;
    private String h;

    public String h() {
        return this.f;
    }

    public Location g() {
        return this.e;
    }

    public Integer f() {
        return this.d;
    }

    public Integer e() {
        return this.f12825c;
    }

    public Integer d() {
        return this.f12824b;
    }

    public List<Integer> c() {
        return this.f12823a;
    }

    public String b() {
        return this.h;
    }

    public boolean a() {
        return this.g;
    }

    /* JADX INFO: renamed from: com.huawei.hms.ads.jsb.inner.data.a$a, reason: collision with other inner class name */
    public static final class C0095a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<Integer> f12826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f12827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f12828c;
        private Integer d;
        private Location e;
        private String f;

        public C0095a c(Integer num) {
            this.d = num;
            return this;
        }

        public C0095a b(Integer num) {
            this.f12828c = num;
            return this;
        }

        public a a() {
            a aVar = new a();
            aVar.f12823a = this.f12826a;
            aVar.f12824b = this.f12827b;
            aVar.f12825c = this.f12828c;
            aVar.d = this.d;
            aVar.e = this.e;
            aVar.f = this.f;
            return aVar;
        }

        public C0095a a(List<Integer> list) {
            this.f12826a = list;
            return this;
        }

        public C0095a a(String str) {
            this.f = str;
            return this;
        }

        public C0095a a(Integer num) {
            this.f12827b = num;
            return this;
        }

        public C0095a a(Location location) {
            this.e = location;
            return this;
        }
    }

    public void a(boolean z) {
        this.g = z;
    }

    public void a(String str) {
        this.h = str;
    }
}

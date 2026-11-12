package defpackage;

import com.huawei.wearengine.device.Device;

/* JADX INFO: loaded from: classes46.dex */
public class ykj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Device f53584b;
    private String d;
    private String e;

    protected ykj(d dVar) {
        this.f53584b = dVar.f53585c;
        this.e = dVar.d;
        this.d = dVar.e;
    }

    public static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Device f53585c;
        private String d;
        private String e;

        public d c(Device device) {
            this.f53585c = device;
            return this;
        }

        public d e(String str) {
            this.d = str;
            return this;
        }

        public d a(String str) {
            this.e = str;
            return this;
        }

        public ykj d() {
            return new ykj(this);
        }
    }

    public Device b() {
        return this.f53584b;
    }

    public String e() {
        return this.e;
    }

    public String a() {
        return this.d;
    }
}

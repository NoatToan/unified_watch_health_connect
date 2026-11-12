package defpackage;

import com.huawei.health.device.util.EventBus;

/* JADX INFO: loaded from: classes7.dex */
public class drb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private dom f32218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private doq.c f32219c;
    private EventBus.d d;
    private efx e;
    private int f;
    private String g;
    private int h;

    public drb() {
        this.h = -1;
    }

    public EventBus.d d() {
        return this.d;
    }

    public int h() {
        return this.f;
    }

    public efx e() {
        return this.e;
    }

    public doq.c a() {
        return this.f32219c;
    }

    public String c() {
        return this.f32217a;
    }

    public String g() {
        return this.g;
    }

    public dom b() {
        return this.f32218b;
    }

    public int i() {
        return this.h;
    }

    public String toString() {
        return "EventBusBean {mEvent = " + this.d + ", mType = " + this.f + ", mDevice = " + this.e + ", mDeviceSsid = " + this.f32217a + ", mProductId = " + this.g + ", mDeviceVersion = " + this.f32218b + ", mUnitType = " + this.h + '}';
    }

    private drb(a aVar) {
        this.h = -1;
        this.d = aVar.f32221b;
        this.f = aVar.f;
        this.e = aVar.d;
        this.f32219c = aVar.f32220a;
        this.f32217a = aVar.f32222c;
        this.g = aVar.h;
        this.f32218b = aVar.e;
        this.h = aVar.j;
    }

    public a j() {
        return new a().a(this.d).b(this.f).b(this.e).d(this.f32219c).e(this.f32217a).b(this.g).b(this.f32218b).d(this.h);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private doq.c f32220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private EventBus.d f32221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32222c;
        private efx d;
        private dom e;
        private int f;
        private String h;
        private int j;

        public a a(EventBus.d dVar) {
            this.f32221b = dVar;
            return this;
        }

        public a b(int i) {
            this.f = i;
            return this;
        }

        public a b(efx efxVar) {
            this.d = efxVar;
            return this;
        }

        public a d(doq.c cVar) {
            this.f32220a = cVar;
            return this;
        }

        public a e(String str) {
            this.f32222c = str;
            return this;
        }

        public a b(String str) {
            this.h = str;
            return this;
        }

        public a b(dom domVar) {
            this.e = domVar;
            return this;
        }

        public a d(int i) {
            this.j = i;
            return this;
        }

        public drb a() {
            return new drb(this);
        }
    }
}

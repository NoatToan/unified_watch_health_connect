package defpackage;

import android.location.Location;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class iyl extends iys {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<GpsPoint> f38208c;
    private int f;
    private int[] h;
    private int i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38207a = -1;
    private c e = new c();

    @Override // defpackage.iys
    public void e(gdm gdmVar) {
        super.e(gdmVar);
        gcl gclVarA = gdmVar.a();
        if (gclVarA == null) {
            LogUtil.a("Track_RouteCalculate", "no route draw cpPoint");
        } else {
            this.f38208c = gclVarA.c();
            this.i = gclVarA.b();
        }
    }

    @Override // defpackage.iys
    public boolean d(Map<Long, double[]> map, int i) {
        return i();
    }

    @Override // defpackage.iys
    public Object a() {
        if (this.h == null) {
            return null;
        }
        c cVar = new c();
        cVar.b(this.h);
        cVar.a(this.f);
        cVar.c(this.f38207a);
        cVar.c(c());
        cVar.a(i());
        return cVar;
    }

    @Override // defpackage.iys
    public void a(Location location) {
        if (njy.e(this.f38208c)) {
            return;
        }
        int size = this.f38208c.size();
        if (j() || this.h.length != size) {
            this.h = new int[size];
        }
        this.f = 0;
        jpg jpgVar = new jpg(location.getLatitude(), location.getLongitude());
        if (TextUtils.equals(AMapLocation.COORD_TYPE_GCJ02, this.f38221b)) {
            jpgVar = izy.e(jpgVar);
        }
        for (int i = 0; i < size; i++) {
            if (izt.a(izt.b(this.f38208c.get(i)), jpgVar) < 60.0f) {
                this.h[i] = 1;
                this.f = 1;
            }
        }
        this.f38207a = d();
    }

    @Override // defpackage.iys
    public void e(Object obj) {
        if (obj instanceof int[]) {
            this.h = (int[]) obj;
            this.f38207a = d();
        }
    }

    @Override // defpackage.iys
    public void e() {
        super.e();
        List<GpsPoint> list = this.f38208c;
        if (list != null) {
            list.clear();
        }
    }

    private boolean i() {
        return this.f38207a >= this.i;
    }

    private float c() {
        if (h()) {
            return 0.0f;
        }
        if (njy.e(this.f38208c)) {
            LogUtil.a("Track_RouteCalculate", "cpPoint size is Empty");
            return 0.0f;
        }
        return (this.f38207a * 100.0f) / this.f38208c.size();
    }

    private int d() {
        if (j()) {
            return 0;
        }
        int i = 0;
        for (int i2 : this.h) {
            if (i2 == 1) {
                i++;
            }
        }
        return i;
    }

    private boolean j() {
        int[] iArr = this.h;
        return iArr == null || iArr.length == 0;
    }

    private boolean h() {
        return njy.e(this.f38208c);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f38209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f38210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f38211c;
        private int[] d;
        private boolean e;

        public int[] d() {
            return this.d;
        }

        public void b(int[] iArr) {
            this.d = iArr;
        }

        public int a() {
            return this.f38211c;
        }

        public void a(int i) {
            this.f38211c = i;
        }

        public float e() {
            return this.f38210b;
        }

        public void c(float f) {
            this.f38210b = f;
        }

        public int b() {
            return this.f38209a;
        }

        public void c(int i) {
            this.f38209a = i;
        }

        public boolean c() {
            return this.e;
        }

        public void a(boolean z) {
            this.e = z;
        }
    }
}

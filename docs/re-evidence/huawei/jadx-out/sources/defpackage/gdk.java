package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import health.compact.a.GRSManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class gdk implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("distanceType")
    private int f34929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(JsbMapKeyNames.H5_LOC_LON)
    private double f34930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("pageIndex")
    private int f34931c;

    @SerializedName("cityId")
    private String d;

    @SerializedName(JsbMapKeyNames.H5_LOC_LAT)
    private double e;

    @SerializedName("pathFlag")
    private int f;

    @SerializedName("pathLabel")
    private int g;

    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private int h;

    @SerializedName("pathTheme")
    private int i;

    @SerializedName("pathClass")
    private List<Integer> j;

    @SerializedName("pathType")
    private int k;

    @SerializedName("sortType")
    private int o;

    public gdk() {
    }

    private gdk(d dVar) {
        this.f34930b = dVar.f34932a;
        this.e = dVar.d;
        this.d = dVar.f34934c;
        this.j = dVar.f;
        this.i = dVar.i;
        this.f = dVar.j;
        this.k = dVar.k;
        this.g = dVar.h;
        this.o = dVar.l;
        this.f34929a = dVar.e;
        this.f34931c = dVar.f34933b;
        this.h = dVar.g;
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f34932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f34933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f34934c;
        private double d;
        private int e;
        private List<Integer> f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;

        public d c(double d) {
            this.f34932a = d;
            return this;
        }

        public d d(double d) {
            this.d = d;
            return this;
        }

        public d b(String str) {
            this.f34934c = str;
            return this;
        }

        public d c(List<Integer> list) {
            this.f = list;
            return this;
        }

        public d e(int i) {
            this.i = i;
            return this;
        }

        public d a(int i) {
            this.j = i;
            return this;
        }

        public d i(int i) {
            this.k = i;
            return this;
        }

        public d f(int i) {
            this.l = i;
            return this;
        }

        public d b(int i) {
            this.e = i;
            return this;
        }

        public d c(int i) {
            this.f34933b = i;
            return this;
        }

        public d d(int i) {
            this.g = i;
            return this;
        }

        public gdk a() {
            return new gdk(this);
        }
    }

    public void c(double d2) {
        this.f34930b = d2;
    }

    public void b(double d2) {
        this.e = d2;
    }

    public String e() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public List<Integer> a() {
        return this.j;
    }

    public void e(List<Integer> list) {
        this.j = list;
    }

    public void i(int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(i));
        this.j = arrayList;
    }

    public int i() {
        return this.i;
    }

    public void d(int i) {
        this.i = i;
    }

    public int d() {
        return this.f;
    }

    public void a(int i) {
        this.f = i;
    }

    public int f() {
        return this.k;
    }

    public void g(int i) {
        this.k = i;
    }

    public int c() {
        return this.f34929a;
    }

    public void e(int i) {
        this.f34929a = i;
    }

    public int g() {
        return this.o;
    }

    public void f(int i) {
        this.o = i;
    }

    public int b() {
        return this.f34931c;
    }

    public void c(int i) {
        this.f34931c = i;
    }

    public void b(int i) {
        this.h = i;
    }

    public boolean h() {
        return this.i == 0 && this.k == 0 && this.f34929a == 0 && this.f34931c == 1;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataAnalyse/app/getHotPaths";
    }

    public String toString() {
        return "GetHotPathsReq{longitude=" + this.f34930b + ", latitude=" + this.e + ", cityId='" + this.d + "', pathClass=" + this.j + ", pathTheme=" + this.i + ", pathFlag=" + this.f + ", pathType=" + this.k + ", pathLabel=" + this.g + ", sortType=" + this.o + ", distanceType=" + this.f34929a + ", pageIndex=" + this.f34931c + ", pageSize=" + this.h + '}';
    }
}

package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.ui.main.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class vqt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f51487a;
    private int aa;
    private int ab;
    private String ac;
    private int ad;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f51489c;
    private float e;
    private int f;
    private int g;
    private List<RelativeSportData> h;
    private int i;
    private long j;
    private int l;
    private Map<String, String> m;
    private long n;
    private long o;
    private boolean p;
    private RelativeSportData r;
    private String t;
    private String u;
    private String v;
    private long z;
    private int y = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51488b = 0;
    private int k = 0;
    private int s = 0;
    private String x = "";
    private String w = "";
    private String q = "";
    private String d = "";

    public float e() {
        return this.f51489c;
    }

    public long j() {
        return this.o;
    }

    public float d() {
        return this.e;
    }

    public int m() {
        return this.ab;
    }

    public int c() {
        return this.i;
    }

    public long o() {
        return this.z;
    }

    public long g() {
        return this.n;
    }

    public int i() {
        return this.k;
    }

    public int n() {
        return this.ad;
    }

    public void f(int i) {
        this.ad = i;
    }

    public String x() {
        return this.t;
    }

    public void b(String str) {
        this.t = str;
    }

    public List<RelativeSportData> s() {
        return this.h;
    }

    public Drawable a(Context context) {
        return vrg.e(context, this.ab, Integer.toString(this.l));
    }

    public int c(Context context) {
        return vrg.c(context, this.ab);
    }

    public int l() {
        int iA = vqo.a(this.g, this.u);
        if (this.y == 2) {
            return R.drawable.ic_sporthistory_add;
        }
        if (iA == 4) {
            return R.drawable.ic_sporthistory_bracelet;
        }
        if (iA == 5) {
            return R.drawable.ic_sporthistory_watch;
        }
        if (iA == 6) {
            return R.drawable.ic_sporthistory_headphones;
        }
        if (iA == 7) {
            return R.drawable.ic_tv;
        }
        int i = this.aa;
        if (i == 199) {
            return R.drawable.ic_sporthistory_else;
        }
        if (i != 200) {
            switch (i) {
                case 1:
                    return R.drawable.ic_health_history_autotrack;
                case 2:
                    return R.drawable.ic_sporthistory_huawei_wear;
                case 3:
                case 4:
                    return R.drawable.ic_sporthistory_bracelet;
                case 5:
                    return R.drawable.ic_sporthistory_watch;
                case 6:
                    return R.drawable.ic_sporthistory_headphones;
                case 7:
                    return R.drawable.ic_tv;
                default:
                    return 0;
            }
        }
        return R.drawable.ic_sporthistory_nike;
    }

    public int q() {
        return this.f;
    }

    public void j(int i) {
        this.f = i;
    }

    public int b() {
        return this.f51488b;
    }

    public RelativeSportData h() {
        return this.r;
    }

    public String f() {
        return this.q;
    }

    public void d(String str) {
        if ("0".equals(str)) {
            this.q = ExifInterface.LONGITUDE_EAST;
        } else {
            this.q = str;
        }
    }

    public long a() {
        return this.j;
    }

    public void e(long j) {
        this.j = j;
    }

    public void d(float f, int i) {
        this.f51489c = f;
        this.i = i;
    }

    public float k() {
        return this.f51487a;
    }

    public void d(long j) {
        this.o = j;
    }

    public void d(float f) {
        this.e = f;
    }

    public void i(int i) {
        this.ab = i;
    }

    public void h(int i) {
        this.aa = i;
    }

    public int z() {
        return this.aa;
    }

    public void c(int i) {
        this.g = i;
    }

    public int p() {
        return this.g;
    }

    public void e(String str) {
        this.u = str;
    }

    public int ac() {
        return vqo.a(this.g, this.u);
    }

    public void c(long j) {
        this.z = j;
    }

    public void b(long j) {
        this.n = j;
    }

    public void a(int i) {
        this.y = i;
    }

    public int aa() {
        return this.y;
    }

    public void b(int i) {
        this.f51488b = i;
    }

    public void e(float f) {
        this.f51487a = f;
    }

    public void e(int i) {
        this.k = i;
    }

    public void d(RelativeSportData relativeSportData) {
        this.r = relativeSportData;
    }

    public void a(List<RelativeSportData> list) {
        this.h = list;
    }

    public void c(boolean z) {
        this.p = z;
    }

    public boolean w() {
        return this.p;
    }

    public void d(int i) {
        this.s = i;
    }

    public String y() {
        return this.x;
    }

    public void f(String str) {
        this.x = str;
    }

    public String ad() {
        return this.w;
    }

    public void h(String str) {
        this.w = str;
    }

    public String u() {
        return this.v;
    }

    public void g(String str) {
        this.v = str;
    }

    public String t() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }

    public int v() {
        return this.l;
    }

    public void g(int i) {
        this.l = i;
    }

    public void c(String str) {
        this.ac = str;
    }

    public void a(String str, String str2) {
        if (this.m == null) {
            this.m = new HashMap();
        }
        this.m.put(str, str2);
    }

    public String r() {
        if (CollectionUtils.c(this.m) || !this.m.containsKey("packageName")) {
            return "";
        }
        return this.m.get("packageName");
    }
}

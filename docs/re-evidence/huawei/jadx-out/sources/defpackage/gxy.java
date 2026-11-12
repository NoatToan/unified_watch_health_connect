package defpackage;

import android.graphics.Bitmap;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class gxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mIsBackground")
    private boolean f36209a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mImagePath")
    private String f36211c;

    @SerializedName("mPackageName")
    private String d;

    @SerializedName("mCustomizeVideoPath")
    private String e;

    @SerializedName("mShareType")
    private int f;

    @SerializedName("mRequestShareBiMap")
    private Map<String, Object> g;

    @SerializedName("mPresetBackgroundList")
    private List<Integer> h;

    @SerializedName("mTabTitle")
    private String k;

    @SerializedName("mTrackType")
    private int l;

    @SerializedName("mWatermarkData")
    private gyd m;

    @SerializedName("mUri")
    private String n;

    @SerializedName("watermarkInfos")
    private List<gxz> o;

    @SerializedName("mSportType")
    private int i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mIsEditable")
    private boolean f36210b = true;

    @SerializedName("mPreviewBitmap")
    private Bitmap j = null;

    public int i() {
        return this.l;
    }

    public void a(int i) {
        this.l = i;
    }

    public void d(String str) {
        this.k = str;
    }

    public String f() {
        return this.k;
    }

    public void d(List<gxz> list) {
        this.o = list;
    }

    public List<gxz> o() {
        return this.o;
    }

    public List<Integer> n() {
        return this.h;
    }

    public void a(List<Integer> list) {
        this.h = list;
    }

    public int g() {
        return this.f;
    }

    public void b(int i) {
        this.f = i;
    }

    public boolean m() {
        return this.f36210b;
    }

    public void e(boolean z) {
        this.f36210b = z;
    }

    public Bitmap d() {
        return this.j;
    }

    public void a(Bitmap bitmap) {
        this.j = bitmap;
    }

    public void c(String str) {
        this.e = str;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.f36211c;
    }

    public void e(String str) {
        this.f36211c = str;
    }

    public Map<String, Object> e() {
        return this.g;
    }

    public void d(Map<String, Object> map) {
        this.g = map;
    }

    public int h() {
        return this.i;
    }

    public void c(int i) {
        this.i = i;
    }

    public void c(gyd gydVar) {
        this.m = gydVar;
    }

    public gyd k() {
        return this.m;
    }

    public boolean l() {
        return this.f36209a;
    }

    public void t() {
        Bitmap bitmapD = d();
        if (bitmapD != null && !bitmapD.isRecycled()) {
            bitmapD.recycle();
        }
        a((Bitmap) null);
    }

    public String j() {
        return this.n;
    }

    public String a() {
        return this.d;
    }
}

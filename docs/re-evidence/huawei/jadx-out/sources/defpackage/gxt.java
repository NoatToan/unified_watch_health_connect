package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.socialshare.model.SaveBitampCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.bridgeimpl.ShareImpl;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class gxt implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("imagePath")
    private String f36205a;

    @SerializedName("thumbImage")
    private Bitmap aa;

    @SerializedName("shareTextContent")
    private String ab;

    @SerializedName("shareUrlContent")
    private String ac;

    @SerializedName(Constants.ACTIVITY_SHARE_TYPE)
    private int ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("imageNum")
    private int f36206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("imageUriList")
    private ArrayList<Uri> f36207c;

    @SerializedName("editContents")
    private ArrayList<gxy> e;

    @SerializedName("isNeedPrint")
    private boolean g;

    @SerializedName("isNeedSavePdf")
    private boolean i;

    @SerializedName("inSampleSize")
    private int j;

    @SerializedName("mFileUri")
    private Uri k;

    @SerializedName("isSharePicCompress")
    private boolean m;

    @SerializedName("mFilePath")
    private String n;

    @SerializedName("requestShareBiMap")
    private Map<String, Object> q;

    @SerializedName("mVideoPath")
    private String r;

    @SerializedName("mVideoUri")
    private Uri t;

    @SerializedName("saveBitampCallback")
    private SaveBitampCallback u;

    @SerializedName("sharePicContent")
    private Bitmap v;

    @SerializedName("shareFrom")
    private int w;

    @SerializedName("sharePicUrl")
    private String x;

    @SerializedName("saveFileImages")
    private ArrayList<String> y;

    @SerializedName("shareTitleContent")
    private String z;

    @SerializedName(ShareImpl.COLUMN_IS_SHARE_FAMILY)
    private boolean h = true;

    @SerializedName("requestShareModule")
    private String s = AnalyticsValue.SHARE_1140001.value();

    @SerializedName("defaultPreviewIndex")
    private int d = 0;

    @SerializedName("isShowTab")
    private boolean o = false;

    @SerializedName("mShareSportData")
    private HashMap<String, String> p = new HashMap<>();

    @SerializedName("isNeedWatermark")
    private boolean f = true;

    @SerializedName("isShowUserinfoButton")
    private boolean l = true;

    public gxt(int i) {
        this.ad = i;
    }

    public int aa() {
        return this.w;
    }

    public boolean f() {
        return this.f;
    }

    public void e(boolean z) {
        this.f = z;
    }

    public boolean ac() {
        return this.i;
    }

    public void d(boolean z) {
        this.i = z;
    }

    public boolean ab() {
        return this.g;
    }

    public void a(boolean z) {
        this.g = z;
    }

    public final void d(int i) {
        this.w = i;
    }

    public String g() {
        return this.f36205a;
    }

    public final void c(String str) {
        this.f36205a = str;
    }

    public ArrayList<String> n() {
        return this.y;
    }

    public void e(ArrayList<String> arrayList) {
        this.y = arrayList;
    }

    public int b() {
        return this.f36206b;
    }

    public final void c(int i) {
        this.f36206b = i;
    }

    public ArrayList<Uri> j() {
        ArrayList<Uri> arrayList = this.f36207c;
        return arrayList == null ? new ArrayList<>(0) : arrayList;
    }

    public final void d(ArrayList<Uri> arrayList) {
        this.f36207c = arrayList;
    }

    public int h() {
        return this.j;
    }

    public final void a(int i) {
        this.j = i;
    }

    public boolean ad() {
        return this.m;
    }

    public final void f(boolean z) {
        this.m = z;
    }

    public int u() {
        return this.ad;
    }

    public void e(int i) {
        this.ad = i;
    }

    public boolean i() {
        return this.h;
    }

    public void b(boolean z) {
        this.h = z;
    }

    public String q() {
        return this.ab;
    }

    public final void b(String str) {
        this.ab = str;
    }

    public String p() {
        return this.z;
    }

    public final void e(String str) {
        this.z = str;
    }

    public String v() {
        return this.ac;
    }

    public final void f(String str) {
        this.ac = str;
    }

    public Bitmap r() {
        return this.v;
    }

    public final void d(Bitmap bitmap) {
        this.v = bitmap;
    }

    public String t() {
        return this.x;
    }

    public String o() {
        return this.s;
    }

    public final void d(String str) {
        this.s = str;
    }

    public SaveBitampCallback l() {
        return this.u;
    }

    public void c(SaveBitampCallback saveBitampCallback) {
        this.u = saveBitampCallback;
    }

    public Map<String, Object> m() {
        return this.q;
    }

    public final void c(Map<String, Object> map) {
        this.q = map;
    }

    public ArrayList<gxy> e() {
        ArrayList<gxy> arrayList = this.e;
        return arrayList == null ? new ArrayList<>(0) : arrayList;
    }

    public final void b(ArrayList<gxy> arrayList) {
        this.e = arrayList;
    }

    public void d(gxy gxyVar) {
        if (this.e == null) {
            this.e = new ArrayList<>(3);
        }
        this.e.add(gxyVar);
    }

    public int d() {
        return this.d;
    }

    public final void b(int i) {
        this.d = i;
    }

    public final void c(boolean z) {
        this.o = z;
    }

    public boolean k() {
        return this.o;
    }

    public final void h(String str) {
        this.r = str;
    }

    public String x() {
        return this.r;
    }

    public final void c(Uri uri) {
        this.t = uri;
    }

    public Uri y() {
        return this.t;
    }

    public String a() {
        return this.n;
    }

    public void a(String str) {
        this.n = str;
    }

    public Uri c() {
        return this.k;
    }

    public HashMap<String, String> s() {
        return this.p;
    }

    public final void b(HashMap<String, String> map) {
        this.p = map;
    }

    public Bitmap w() {
        return this.aa;
    }

    public void b(Bitmap bitmap) {
        this.aa = bitmap;
    }

    public void j(boolean z) {
        this.l = z;
    }

    public boolean z() {
        return this.l;
    }

    public String toString() {
        return "shareType = " + this.ad;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            LogUtil.e("ShareContent", "clone CloneNotSupportedException");
            gxt gxtVar = new gxt(this.ad);
            gxtVar.b(this.d);
            gxtVar.d(this.v);
            gxtVar.d(this.s);
            gxtVar.b(this.e);
            gxtVar.c(this.f36206b);
            gxtVar.c(this.f36205a);
            gxtVar.e(this.y);
            gxtVar.d(this.f36207c);
            gxtVar.a(this.j);
            gxtVar.c(this.o);
            gxtVar.f(this.m);
            gxtVar.b(this.ab);
            gxtVar.b(this.p);
            gxtVar.e(this.z);
            gxtVar.f(this.ac);
            gxtVar.h(this.r);
            gxtVar.c(this.t);
            gxtVar.d(this.w);
            gxtVar.c(this.q);
            gxtVar.j(this.l);
            return gxtVar;
        }
    }

    public void ag() {
        Bitmap bitmapR = r();
        if (bitmapR != null && !bitmapR.isRecycled()) {
            bitmapR.recycle();
        }
        d((Bitmap) null);
        ArrayList<gxy> arrayListE = e();
        if (CollectionUtils.isEmpty(arrayListE)) {
            return;
        }
        for (gxy gxyVar : arrayListE) {
            if (gxyVar != null) {
                gxyVar.t();
            }
        }
        b((ArrayList<gxy>) null);
    }
}

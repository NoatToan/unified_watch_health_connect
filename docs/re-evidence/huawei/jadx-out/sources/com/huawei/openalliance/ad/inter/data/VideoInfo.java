package com.huawei.openalliance.ad.inter.data;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.Scheme;
import com.huawei.openalliance.ad.dk;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.ai;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.du;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class VideoInfo implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19209c;
    private int d;
    private String e;
    private int f;
    private String g;
    private int h;
    private String i;
    private int j;
    private String k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private Float s;
    private boolean t;
    private boolean u;
    private float v;
    private int w;
    private String x;
    private int y;
    private String z;

    public int a() {
        return 209715200;
    }

    public void k(int i) {
        this.y = i;
    }

    public String k() {
        return this.z;
    }

    public void j(int i) {
        this.w = i;
    }

    public int j() {
        return this.y;
    }

    public boolean isCheckSha256() {
        return this.m;
    }

    public boolean isBackFromFullScreen() {
        return this.o;
    }

    public void i(int i) {
        this.f = i;
    }

    public String i() {
        return this.x;
    }

    public void h(String str) {
        this.z = str;
    }

    public void h(int i) {
        if (i == 1) {
            this.r = 1;
        } else {
            this.r = 0;
        }
    }

    public int h() {
        return this.w;
    }

    public Float getVideoRatio() {
        return this.s;
    }

    public int getVideoPlayMode() {
        return this.l;
    }

    public int getVideoFileSize() {
        return this.d;
    }

    public int getVideoDuration() {
        return this.f19209c;
    }

    public String getVideoDownloadUrl() {
        return this.f19207a;
    }

    public String getVideoAutoPlayWithSound() {
        return this.g;
    }

    public String getVideoAutoPlay() {
        return this.e;
    }

    public int getTimeBeforeVideoAutoPlay() {
        hw.b("VideoInfo", "getTimeBeforeVideoAutoPlay, custom exposure type: %s", Integer.valueOf(this.w));
        int i = this.w;
        if (i == 2 || i == 1) {
            return 0;
        }
        return this.h;
    }

    public String getSoundSwitch() {
        return this.k;
    }

    public String getSha256() {
        return this.i;
    }

    public int getDownloadNetwork() {
        return this.r;
    }

    public int getAutoStopPlayAreaRatio() {
        return this.q;
    }

    public int getAutoPlayNetwork() {
        return this.f;
    }

    public int getAutoPlayAreaRatio() {
        return this.p;
    }

    public void g(String str) {
        this.x = str;
    }

    public void g(int i) {
        this.q = i;
    }

    public String g() {
        return this.f19208b;
    }

    public boolean f() {
        return this.u;
    }

    public void f(String str) {
        this.f19208b = str;
    }

    public void f(int i) {
        this.p = i;
    }

    public boolean e() {
        return this.t;
    }

    public void e(boolean z) {
        this.u = z;
    }

    public void e(String str) {
        this.k = str;
    }

    public void e(int i) {
        this.j = i;
    }

    public void d(boolean z) {
        this.t = z;
    }

    public void d(String str) {
        this.i = str;
    }

    public void d(int i) {
        this.l = i;
    }

    public float d() {
        return this.v;
    }

    public boolean c() {
        return this.n;
    }

    public void c(boolean z) {
        this.o = z;
    }

    public void c(String str) {
        this.g = str;
    }

    public void c(int i) {
        this.h = i;
    }

    public boolean b(Context context) {
        String strC;
        dn dnVarA;
        String strE;
        int i = this.l;
        if (2 == i || 3 == i || this.u) {
            return true;
        }
        if (TextUtils.isEmpty(this.f19207a)) {
            return false;
        }
        String str = this.f19207a;
        if (str != null && str.startsWith(Scheme.CONTENT.toString())) {
            return true;
        }
        if (this.f19207a.startsWith("http")) {
            dn dnVarA2 = dk.a(context, "normal");
            strC = dnVarA2.c(dnVarA2.e(this.f19207a));
            if (dg.b(strC)) {
                dnVarA = dk.a(context, Constants.TPLATE_CACHE);
                strE = dnVarA.e(this.f19207a);
                strC = dnVarA.c(strE);
            }
        } else if (dn.i(this.f19207a)) {
            strC = dk.a(context, "normal").c(this.f19207a);
            if (!ai.d(new File(strC))) {
                dnVarA = dk.a(context, Constants.TPLATE_CACHE);
                strE = this.f19207a;
                strC = dnVarA.c(strE);
            }
        } else {
            strC = this.f19207a;
        }
        return 1 == this.l && du.a(context, strC, (long) a(), this.f19208b) && (!this.m || du.a(context, strC, this.i));
    }

    public void b(boolean z) {
        this.n = z;
    }

    public void b(String str) {
        this.e = str;
    }

    public void b(int i) {
        this.d = i;
    }

    public int b() {
        return this.j;
    }

    public boolean a(Context context) {
        int i = this.l;
        if (2 == i || this.u) {
            return true;
        }
        return 1 == i && du.a(context, this.f19207a, (long) a());
    }

    public void a(boolean z) {
        this.m = z;
    }

    public void a(String str) {
        this.f19207a = str;
    }

    public void a(Float f) {
        Float fValueOf;
        if (f == null) {
            fValueOf = null;
        } else {
            if (f.floatValue() > 0.0f) {
                this.s = f;
                return;
            }
            fValueOf = Float.valueOf(1.7777778f);
        }
        this.s = fValueOf;
    }

    public void a(int i) {
        this.f19209c = i;
    }

    public void a(float f) {
        if (f <= 0.0f) {
            this.v = 3.5f;
        } else {
            this.v = f;
        }
    }

    public VideoInfo(PlacementMediaFile placementMediaFile) {
        this.e = "y";
        this.g = "n";
        this.h = 200;
        this.j = 0;
        this.k = "n";
        this.l = 1;
        this.n = true;
        this.o = false;
        this.p = 100;
        this.q = 90;
        this.r = 0;
        this.t = true;
        this.u = false;
        this.w = 0;
        this.x = Boolean.FALSE.toString();
        this.y = 0;
        if (placementMediaFile != null) {
            this.f19208b = placementMediaFile.getUrl();
            this.m = placementMediaFile.getCheckSha256() == 0;
            this.i = placementMediaFile.getSha256();
        }
    }

    public VideoInfo(com.huawei.openalliance.ad.beans.metadata.VideoInfo videoInfo) {
        this.e = "y";
        this.g = "n";
        this.h = 200;
        this.j = 0;
        this.k = "n";
        this.l = 1;
        this.n = true;
        this.o = false;
        this.p = 100;
        this.q = 90;
        this.r = 0;
        this.t = true;
        this.u = false;
        this.w = 0;
        this.x = Boolean.FALSE.toString();
        this.y = 0;
        if (videoInfo != null) {
            this.f19207a = videoInfo.a();
            this.f19208b = videoInfo.a();
            this.f19209c = videoInfo.b();
            this.d = videoInfo.c();
            if (TextUtils.equals(videoInfo.d(), "y") || TextUtils.equals(videoInfo.d(), "a")) {
                this.e = "y";
            } else {
                this.e = "n";
            }
            this.g = videoInfo.e();
            this.h = videoInfo.f();
            this.i = videoInfo.g();
            this.l = videoInfo.h();
            this.k = this.g;
            this.m = videoInfo.i() == 0;
            if (videoInfo.j() != null) {
                this.p = videoInfo.j().intValue();
            }
            if (videoInfo.k() != null) {
                this.q = videoInfo.k().intValue();
            }
            h(videoInfo.l());
            if (TextUtils.equals(videoInfo.d(), "a")) {
                this.f = 1;
            } else {
                this.f = 0;
            }
            a(videoInfo.m());
            this.t = "y".equalsIgnoreCase(videoInfo.n());
            a(videoInfo.o());
        }
    }

    public VideoInfo() {
        this.e = "y";
        this.g = "n";
        this.h = 200;
        this.j = 0;
        this.k = "n";
        this.l = 1;
        this.n = true;
        this.o = false;
        this.p = 100;
        this.q = 90;
        this.r = 0;
        this.t = true;
        this.u = false;
        this.w = 0;
        this.x = Boolean.FALSE.toString();
        this.y = 0;
    }
}

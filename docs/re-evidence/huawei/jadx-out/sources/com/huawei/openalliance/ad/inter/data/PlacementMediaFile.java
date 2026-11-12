package com.huawei.openalliance.ad.inter.data;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.MediaFile;
import com.huawei.openalliance.ad.utils.du;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class PlacementMediaFile implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f19193c;
    private int d;
    private int e;
    private String f;
    private String g;
    private int h;
    private int i;
    private int j;
    private long k;
    private String l;
    private int m;

    public int a() {
        return 209715200;
    }

    public boolean isVideo() {
        return "video/mp4".equals(this.f19191a);
    }

    public boolean isValid(Context context) {
        return du.a(context, this.f19192b, (long) a());
    }

    public int getWidth() {
        return this.d;
    }

    public String getUrl() {
        return this.f19192b;
    }

    public String getSoundSwitch() {
        return this.g;
    }

    public String getSha256() {
        return this.f;
    }

    public int getPlayMode() {
        return this.j;
    }

    public String getMime() {
        return this.f19191a;
    }

    public int getHeight() {
        return this.e;
    }

    public long getFileSize() {
        return this.f19193c;
    }

    public long getDuration() {
        return this.k;
    }

    public int getDownloadNetwork() {
        return this.i;
    }

    public int getCheckSha256() {
        return this.h;
    }

    public Float d() {
        int i;
        int i2 = this.d;
        if (i2 <= 0 || (i = this.e) <= 0) {
            return null;
        }
        return Float.valueOf(i2 / i);
    }

    public int c() {
        return this.m;
    }

    public void b(String str) {
        this.l = str;
    }

    public String b() {
        return this.l;
    }

    public boolean a(Context context) {
        if (du.a(context, this.l, a(), this.f19192b)) {
            return 1 == this.h || du.a(context, this.l, this.f);
        }
        return false;
    }

    public void a(String str) {
        this.g = str;
    }

    public void a(int i) {
        this.m = i;
    }

    public PlacementMediaFile(MediaFile mediaFile, long j) {
        this.d = 0;
        this.e = 0;
        this.g = "y";
        this.i = 0;
        this.m = 0;
        this.f19191a = mediaFile.a();
        this.f19192b = mediaFile.e();
        this.f19193c = mediaFile.d();
        this.h = mediaFile.g();
        this.i = mediaFile.h();
        this.d = mediaFile.b();
        this.e = mediaFile.c();
        this.f = mediaFile.f();
        this.j = mediaFile.i();
        this.k = j;
    }

    public PlacementMediaFile() {
        this.d = 0;
        this.e = 0;
        this.g = "y";
        this.i = 0;
        this.m = 0;
    }
}

package com.huawei.openalliance.ad;

import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public class hg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageInfo f18869b;
    private VideoInfo f;
    private AppInfo g;
    private String h;
    private VideoConfiguration l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f18868a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18870c = 0;
    private String d = "n";
    private boolean e = false;
    private boolean i = false;
    private int j = 0;
    private String k = Boolean.FALSE.toString();
    private String m = "y";
    private String n = "n";

    public String k() {
        return this.n;
    }

    public String j() {
        return this.m;
    }

    public VideoConfiguration i() {
        return this.l;
    }

    public String h() {
        return this.k;
    }

    public String g() {
        return this.f18868a;
    }

    public void f(String str) {
        this.n = str;
    }

    public String f() {
        return this.h;
    }

    public boolean e() {
        return this.e;
    }

    public void e(String str) {
        this.m = str;
    }

    public void d(String str) {
        this.k = str;
    }

    public String d() {
        return this.d;
    }

    public void c(String str) {
        this.f18868a = str;
    }

    public int c() {
        return this.f18870c;
    }

    public void b(boolean z) {
        this.i = z;
    }

    public void b(String str) {
        this.h = str;
    }

    public ImageInfo b() {
        return this.f18869b;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public void a(String str) {
        this.d = str;
    }

    public void a(AppInfo appInfo) {
        this.g = appInfo;
    }

    public void a(VideoInfo videoInfo) {
        this.f = videoInfo;
    }

    public void a(ImageInfo imageInfo) {
        this.f18869b = imageInfo;
    }

    public void a(VideoConfiguration videoConfiguration) {
        this.l = videoConfiguration;
    }

    public void a(int i) {
        this.f18870c = i;
    }

    public VideoInfo a() {
        return this.f;
    }
}

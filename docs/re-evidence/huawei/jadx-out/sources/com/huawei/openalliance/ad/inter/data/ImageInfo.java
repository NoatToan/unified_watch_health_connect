package com.huawei.openalliance.ad.inter.data;

import android.content.Context;
import com.huawei.openalliance.ad.utils.du;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class ImageInfo implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19181c;
    private int d;
    private int e;
    private String f;
    private boolean g;
    private String h;

    public int a() {
        return 52428800;
    }

    public boolean isCheckSha256() {
        return this.g;
    }

    public int getWidth() {
        return this.f19181c;
    }

    public String getUrl() {
        return this.f19179a;
    }

    public String getSha256() {
        return this.f;
    }

    public String getOriginalUrl() {
        return this.f19180b;
    }

    public String getImageType() {
        return this.h;
    }

    public int getHeight() {
        return this.d;
    }

    public int getFileSize() {
        return this.e;
    }

    public void d(String str) {
        this.f19180b = str;
    }

    public void c(String str) {
        this.f19179a = str;
    }

    public void c(int i) {
        this.e = i;
    }

    public boolean b(Context context) {
        if (du.a(context, this.f19179a, a(), this.f19180b)) {
            return !this.g || du.a(context, this.f19179a, this.f);
        }
        return false;
    }

    public void b(String str) {
        this.f = str;
    }

    public void b(int i) {
        this.f19181c = i;
    }

    public boolean a(Context context) {
        return du.a(context, this.f19179a, a());
    }

    public void a(boolean z) {
        this.g = z;
    }

    public void a(String str) {
        this.h = str;
    }

    public void a(int i) {
        this.d = i;
    }

    public ImageInfo(com.huawei.openalliance.ad.beans.metadata.ImageInfo imageInfo) {
        this.f19181c = 0;
        this.d = 0;
        if (imageInfo != null) {
            this.f19179a = imageInfo.c();
            this.f19180b = imageInfo.c();
            this.f19181c = imageInfo.d();
            this.d = imageInfo.e();
            this.f = imageInfo.a();
            this.h = imageInfo.b();
            this.e = imageInfo.f();
            this.g = imageInfo.g() == 0;
        }
    }

    public ImageInfo() {
        this.f19181c = 0;
        this.d = 0;
    }
}

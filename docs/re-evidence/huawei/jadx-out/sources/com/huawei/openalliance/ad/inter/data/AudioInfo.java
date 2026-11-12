package com.huawei.openalliance.ad.inter.data;

import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class AudioInfo implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19173c;
    private String d;
    private String e;

    public String getUrl() {
        return this.f19171a;
    }

    public String getSha256() {
        return this.d;
    }

    public String getMime() {
        return this.e;
    }

    public int getFileSize() {
        return this.f19173c;
    }

    public int getDuration() {
        return this.f19172b;
    }

    public void c(String str) {
        this.e = str;
    }

    public void b(String str) {
        this.d = str;
    }

    public void b(int i) {
        this.f19173c = i;
    }

    public void a(String str) {
        this.f19171a = str;
    }

    public void a(int i) {
        this.f19172b = i;
    }

    public AudioInfo(com.huawei.openalliance.ad.beans.metadata.AudioInfo audioInfo) {
        if (audioInfo != null) {
            this.f19171a = audioInfo.a();
            this.f19172b = audioInfo.b();
            this.f19173c = audioInfo.c();
            this.d = audioInfo.d();
            this.e = audioInfo.e();
        }
    }

    public AudioInfo() {
    }
}

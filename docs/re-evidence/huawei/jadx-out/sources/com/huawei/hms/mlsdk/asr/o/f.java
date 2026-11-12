package com.huawei.hms.mlsdk.asr.o;

import com.huawei.hms.mlsdk.asr.engine.cloud.vo.RttSegment;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes34.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14408b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f14409c = false;
    private ArrayList<RttSegment> d;
    private ArrayList<RttSegment> e;

    public final void a(String str) {
        this.f14407a = str;
    }

    public final void b(boolean z) {
        this.f14409c = z;
    }

    public final String c() {
        return this.f14407a;
    }

    public final ArrayList<RttSegment> d() {
        return this.d;
    }

    public final boolean e() {
        return this.f14409c;
    }

    public final boolean a() {
        return this.f14408b;
    }

    public final void b(ArrayList<RttSegment> arrayList) {
        this.d = arrayList;
    }

    public final void a(boolean z) {
        this.f14408b = z;
    }

    public final ArrayList<RttSegment> b() {
        return this.e;
    }

    public final void a(ArrayList<RttSegment> arrayList) {
        this.e = arrayList;
    }
}

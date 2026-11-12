package com.huawei.openalliance.ad;

import com.iab.omid.library.huawei.adsession.media.Position;
import com.iab.omid.library.huawei.adsession.media.VastProperties;

/* JADX INFO: loaded from: classes12.dex */
public class my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f19655a = mi.a("com.iab.omid.library.huawei.adsession.media.VastProperties");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19656b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19657c;
    private final VastProperties d;
    private final mx e;
    private Float f;

    public VastProperties b() {
        return this.d;
    }

    public static boolean a() {
        return f19655a;
    }

    public static my a(float f, boolean z, mx mxVar) {
        Position positionA;
        return new my(f, z, mxVar, (mxVar == null || !a() || (positionA = mx.a(mxVar)) == null) ? null : VastProperties.createVastPropertiesForSkippableMedia(f, z, positionA));
    }

    private my(float f, boolean z, mx mxVar, VastProperties vastProperties) {
        this.f = Float.valueOf(0.0f);
        this.f = Float.valueOf(f);
        this.f19657c = z;
        this.e = mxVar;
        this.d = vastProperties;
    }
}

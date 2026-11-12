package com.xmlywind.sdk.videoAd;

import com.xmlywind.sdk.common.utils.m;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class e extends com.xmlywind.sdk.base.common.e implements Serializable, Comparable<e> {
    private static final long serialVersionUID = 0;
    private final float a;

    public e(com.xmlywind.sdk.base.common.a aVar, float f) {
        this(com.xmlywind.sdk.base.common.e.a.QUARTILE_EVENT, aVar, f);
    }

    public e(com.xmlywind.sdk.base.common.e.a aVar, com.xmlywind.sdk.base.common.a aVar2, float f) {
        super(aVar, null, null, aVar2, null);
        m.a.a(f >= 0.0f);
        this.a = f;
    }

    private float p() {
        return this.a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        return Double.compare(p(), eVar.p());
    }

    public String toString() {
        return String.format(Locale.US, "%2f: %s", Float.valueOf(this.a), j());
    }
}

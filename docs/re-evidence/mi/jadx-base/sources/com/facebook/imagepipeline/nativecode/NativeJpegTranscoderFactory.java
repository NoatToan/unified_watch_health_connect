package com.facebook.imagepipeline.nativecode;

import defpackage.l4d;
import defpackage.pv5;
import defpackage.w07;
import defpackage.x5d;
import defpackage.y5d;

/* JADX INFO: loaded from: classes4.dex */
@w07
public class NativeJpegTranscoderFactory implements y5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7125b;

    @w07
    public NativeJpegTranscoderFactory(int i, boolean z) {
        this.f7124a = i;
        this.f7125b = z;
    }

    @Override // defpackage.y5d
    @w07
    public x5d createImageTranscoder(l4d l4dVar, boolean z) {
        if (l4dVar != pv5.f30818a) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.f7124a, this.f7125b);
    }
}

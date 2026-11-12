package com.airbnb.lottie.compose;

import f5.f2;
import g6.n;
import h4.r;
import n4.g;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\f\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Lh4/r;", "", "width", "height", "lottieSize", "(Lh4/r;II)Lh4/r;", "Ln4/g;", "Lf5/f2;", "scale", "Lg6/m;", "times-UQTWf7w", "(JJ)J", "times", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LottieAnimationSizeNodeKt {
    public static final r lottieSize(r rVar, int i14, int i15) {
        rVar.getClass();
        return rVar.then(new LottieAnimationSizeElement(i14, i15));
    }

    /* JADX INFO: renamed from: times-UQTWf7w, reason: not valid java name */
    private static final long m11timesUQTWf7w(long j8, long j14) {
        float fG = g.g(j8);
        int i14 = f2.f68942b;
        return n.a((int) (Float.intBitsToFloat((int) (j14 >> 32)) * fG), (int) (Float.intBitsToFloat((int) (j14 & 4294967295L)) * g.d(j8)));
    }
}

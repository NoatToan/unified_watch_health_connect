package androidx.media3.exoplayer;

import i3.e5;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f8965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8966l;

    public final String toString() {
        int i14 = this.f8955a;
        int i15 = this.f8956b;
        int i16 = this.f8957c;
        int i17 = this.f8958d;
        int i18 = this.f8959e;
        int i19 = this.f8960f;
        int i24 = this.f8961g;
        int i25 = this.f8962h;
        int i26 = this.f8963i;
        int i27 = this.f8964j;
        long j8 = this.f8965k;
        int i28 = this.f8966l;
        int i29 = fa.z.f70071a;
        Locale locale = Locale.US;
        StringBuilder sbJ = e5.j(i14, i15, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        ds.e0.m(i16, i17, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", sbJ);
        ds.e0.m(i18, i19, "\n skippedOutputBuffers=", "\n droppedBuffers=", sbJ);
        ds.e0.m(i24, i25, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", sbJ);
        ds.e0.m(i26, i27, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", sbJ);
        sbJ.append(j8);
        sbJ.append("\n videoFrameProcessingOffsetCount=");
        sbJ.append(i28);
        sbJ.append("\n}");
        return sbJ.toString();
    }
}

package defpackage;

import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.OpusUtil;

/* JADX INFO: loaded from: classes46.dex */
public class yti {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53856c;
    private int d;
    private int e;

    public yti() {
        this.d = OpusUtil.SAMPLE_RATE;
        this.f53856c = 4000;
        this.e = 14000;
        this.f53855b = AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
    }

    public yti(int i, int i2, int i3, int i4) {
        this.d = i;
        this.f53856c = i2;
        this.e = i3;
        this.f53855b = i4;
    }

    public int e() {
        return this.f53856c;
    }

    public int a() {
        return this.e;
    }

    public int c() {
        return this.f53855b;
    }

    public int d() {
        return this.d;
    }

    public String toString() {
        return "Parameters{sampleRateInHz=" + this.d + ", bandwidth=" + this.f53856c + ", lowFrequency=" + this.e + ", midFrequency=" + this.f53855b + '}';
    }
}

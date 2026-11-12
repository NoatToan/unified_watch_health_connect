package g1;

import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class h0 extends x implements f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f74714c = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaCodecInfo.VideoCapabilities f74715b;

    public h0(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f74799a.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f74715b = videoCapabilities;
    }

    @Override // g1.f0
    public final Range<Integer> a(int i14) {
        try {
            return this.f74715b.getSupportedWidthsFor(i14);
        } catch (Throwable th3) {
            if (th3 instanceof IllegalArgumentException) {
                throw th3;
            }
            throw new IllegalArgumentException(th3);
        }
    }

    @Override // g1.f0
    public final Range<Integer> c() {
        return this.f74715b.getBitrateRange();
    }

    @Override // g1.f0
    public final boolean d(int i14, int i15) {
        return this.f74715b.isSizeSupported(i14, i15);
    }

    @Override // g1.f0
    public final Range<Integer> e(int i14) {
        try {
            return this.f74715b.getSupportedHeightsFor(i14);
        } catch (Throwable th3) {
            if (th3 instanceof IllegalArgumentException) {
                throw th3;
            }
            throw new IllegalArgumentException(th3);
        }
    }

    @Override // g1.f0
    public final Range<Integer> f() {
        return this.f74715b.getSupportedWidths();
    }

    @Override // g1.f0
    public final Range<Integer> g() {
        return this.f74715b.getSupportedHeights();
    }

    @Override // g1.f0
    public final boolean h() {
        return true;
    }

    @Override // g1.f0
    public final int i() {
        return this.f74715b.getHeightAlignment();
    }

    @Override // g1.f0
    public final int j() {
        return this.f74715b.getWidthAlignment();
    }
}

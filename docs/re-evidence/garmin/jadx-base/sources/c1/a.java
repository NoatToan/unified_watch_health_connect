package c1;

import am.j;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k7.h;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<Integer> f22434a = Collections.unmodifiableList(Arrays.asList(Integer.valueOf(DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND), Integer.valueOf(OpusUtil.SAMPLE_RATE), 44100, 24000, 22050, Integer.valueOf(AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND), 12000, 11025, 8000, 4800));

    public abstract int a();

    public abstract int b();

    public final int c() {
        int iA = a();
        int iE = e();
        h.b(iE > 0, "Invalid channel count: " + iE);
        if (iA == 2) {
            return iE * 2;
        }
        if (iA == 3) {
            return iE;
        }
        if (iA != 4) {
            if (iA == 21) {
                return iE * 3;
            }
            if (iA != 22) {
                vb.h.s(j.h(iA, "Invalid audio encoding: "));
                return 0;
            }
        }
        return iE * 4;
    }

    public abstract int d();

    public abstract int e();
}

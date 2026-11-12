package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import androidx.media3.common.q;
import androidx.media3.common.x;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import java.util.List;
import o4.s;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f9279a;

    public static final class a {
        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int a(boolean z14) {
            List supportedPerformancePoints;
            try {
                q.b bVar = new q.b();
                bVar.f8411m = x.n(MimeTypes.VIDEO_H264);
                q qVarA = bVar.a();
                String str = qVarA.f8386n;
                if (str != null) {
                    List<d> listE = MediaCodecUtil.e(str, z14, false);
                    String strB = MediaCodecUtil.b(qVarA);
                    ImmutableList immutableListBuild = ImmutableList.builder().addAll((Iterable) listE).addAll((Iterable) (strB == null ? ImmutableList.of() : MediaCodecUtil.e(strB, z14, false))).build();
                    for (int i14 = 0; i14 < immutableListBuild.size(); i14++) {
                        if (((d) immutableListBuild.get(i14)).f9273d != null && ((d) immutableListBuild.get(i14)).f9273d.getVideoCapabilities() != null && (supportedPerformancePoints = ((d) immutableListBuild.get(i14)).f9273d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            s.w();
                            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointC = s.c();
                            for (int i15 = 0; i15 < supportedPerformancePoints.size(); i15++) {
                                if (s.e(supportedPerformancePoints.get(i15)).covers(performancePointC)) {
                                    return 2;
                                }
                            }
                            return 1;
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return 0;
        }
    }

    private e() {
    }
}

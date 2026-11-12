package yb;

import androidx.media3.common.q;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e implements n.a {
    @Override // yb.n.a
    public final boolean a(q qVar) {
        String str = qVar.f8386n;
        return Objects.equals(str, MimeTypes.TEXT_SSA) || Objects.equals(str, MimeTypes.TEXT_VTT) || Objects.equals(str, MimeTypes.APPLICATION_MP4VTT) || Objects.equals(str, MimeTypes.APPLICATION_SUBRIP) || Objects.equals(str, MimeTypes.APPLICATION_TX3G) || Objects.equals(str, MimeTypes.APPLICATION_PGS) || Objects.equals(str, MimeTypes.APPLICATION_DVBSUBS) || Objects.equals(str, MimeTypes.APPLICATION_TTML);
    }

    @Override // yb.n.a
    public final int b(q qVar) {
        String str = qVar.f8386n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        vb.h.s(fb1.c.n("Unsupported MIME type: ", str));
        return 0;
    }

    @Override // yb.n.a
    public final n c(q qVar) {
        String str = qVar.f8386n;
        List<byte[]> list = qVar.f8389q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new ac.a(list);
                case "application/pgs":
                    return new bc.a();
                case "application/x-mp4-vtt":
                    return new gc.a();
                case "text/vtt":
                    return new gc.f();
                case "application/x-quicktime-tx3g":
                    return new fc.a(list);
                case "text/x-ssa":
                    return new cc.b(list);
                case "application/x-subrip":
                    return new dc.a();
                case "application/ttml+xml":
                    return new ec.d();
            }
        }
        vb.h.s(fb1.c.n("Unsupported MIME type: ", str));
        return null;
    }
}

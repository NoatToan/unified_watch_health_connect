package qa;

import androidx.media3.common.q;
import com.google.android.exoplayer2.util.MimeTypes;
import pb.g;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2713a f143829a = new C2713a();

    /* JADX INFO: renamed from: qa.a$a, reason: collision with other inner class name */
    public class C2713a implements a {
        @Override // qa.a
        public final boolean a(q qVar) {
            String str = qVar.f8386n;
            return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || MimeTypes.APPLICATION_ICY.equals(str) || MimeTypes.APPLICATION_AIT.equals(str);
        }

        @Override // qa.a
        public final kb.b b(q qVar) {
            String str = qVar.f8386n;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new lb.b();
                    case "application/x-icy":
                        return new ob.a();
                    case "application/id3":
                        return new g();
                    case "application/x-emsg":
                        return new mb.b();
                    case "application/x-scte35":
                        return new rb.c();
                }
            }
            h.s(fb1.c.n("Attempted to create decoder for unsupported MIME type: ", str));
            return null;
        }
    }

    boolean a(q qVar);

    kb.b b(q qVar);
}

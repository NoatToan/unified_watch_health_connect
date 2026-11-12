package defpackage;

import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes4.dex */
public interface uoo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uoo f35974a = new a();

    public class a implements uoo {
        @Override // defpackage.uoo
        public boolean a(Format format) {
            String str = format.l;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
        }

        @Override // defpackage.uoo
        public too b(Format format) {
            String str = format.l;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new u67(format.n);
                    case "application/pgs":
                        return new cth();
                    case "application/x-mp4-vtt":
                        return new g9g();
                    case "text/vtt":
                        return new rcr();
                    case "application/x-quicktime-tx3g":
                        return new k4q(format.n);
                    case "text/x-ssa":
                        return new i8o(format.n);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new bs3(str, format.D, 16000L);
                    case "application/cea-708":
                        return new ds3(format.D, format.n);
                    case "application/x-subrip":
                        return new sno();
                    case "application/ttml+xml":
                        return new y3q();
                }
            }
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    }

    boolean a(Format format);

    too b(Format format);
}

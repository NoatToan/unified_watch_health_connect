package defpackage;

import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes4.dex */
public interface jtf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jtf f23121a = new a();

    public class a implements jtf {
        @Override // defpackage.jtf
        public boolean a(Format format) {
            String str = format.l;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // defpackage.jtf
        public itf b(Format format) {
            String str = format.l;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new ig1();
                    case "application/x-icy":
                        return new x1d();
                    case "application/id3":
                        return new z1d();
                    case "application/x-emsg":
                        return new td8();
                    case "application/x-scte35":
                        return new d7n();
                }
            }
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    }

    boolean a(Format format);

    itf b(Format format);
}

package bb;

import android.util.Base64;
import androidx.media3.common.ParserException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f17244a;

        public a(String str, String[] strArr, int i14) {
            this.f17244a = strArr;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f17245a;

        public b(boolean z14, int i14, int i15, int i16) {
            this.f17245a = z14;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f17250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f17251f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f17252g;

        public c(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, boolean z14, byte[] bArr) {
            this.f17246a = i15;
            this.f17247b = i16;
            this.f17248c = i17;
            this.f17249d = i18;
            this.f17250e = i24;
            this.f17251f = i25;
            this.f17252g = bArr;
        }
    }

    private o0() {
    }

    public static androidx.media3.common.w a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < list.size(); i14++) {
            String str = list.get(i14);
            int i15 = fa.z.f70071a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                fa.k.g("Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(nb.a.b(new fa.r(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e4) {
                    fa.k.h("Failed to parse vorbis picture", e4);
                }
            } else {
                arrayList.add(new sb.a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.w(arrayList);
    }

    public static a b(fa.r rVar, boolean z14, boolean z15) throws ParserException {
        if (z14) {
            c(3, rVar, false);
        }
        String strS = rVar.s((int) rVar.l(), StandardCharsets.UTF_8);
        int length = strS.length();
        long jL = rVar.l();
        String[] strArr = new String[(int) jL];
        int length2 = length + 15;
        for (int i14 = 0; i14 < jL; i14++) {
            String strS2 = rVar.s((int) rVar.l(), StandardCharsets.UTF_8);
            strArr[i14] = strS2;
            length2 = length2 + 4 + strS2.length();
        }
        if (z15 && (rVar.u() & 1) == 0) {
            throw ParserException.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new a(strS, strArr, length2 + 1);
    }

    public static boolean c(int i14, fa.r rVar, boolean z14) throws ParserException {
        if (rVar.a() < 7) {
            if (z14) {
                return false;
            }
            throw ParserException.createForMalformedContainer("too short header: " + rVar.a(), null);
        }
        if (rVar.u() != i14) {
            if (z14) {
                return false;
            }
            throw ParserException.createForMalformedContainer("expected header type " + Integer.toHexString(i14), null);
        }
        if (rVar.u() == 118 && rVar.u() == 111 && rVar.u() == 114 && rVar.u() == 98 && rVar.u() == 105 && rVar.u() == 115) {
            return true;
        }
        if (z14) {
            return false;
        }
        throw ParserException.createForMalformedContainer("expected characters 'vorbis'", null);
    }
}

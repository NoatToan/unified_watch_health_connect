package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes4.dex */
public final class q0l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30964b;
    public final Uri c;

    public q0l(long j, int i, Uri uri) {
        this.f30963a = j;
        this.f30964b = i;
        this.c = uri;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    public static ImmutableList<q0l> a(String str) throws ParserException {
        byte b2;
        ImmutableList.a aVar = new ImmutableList.a();
        String[] strArrM0 = wlq.M0(str, ",");
        int length = strArrM0.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            String str2 = strArrM0[i2];
            String[] strArrM1 = wlq.M0(str2, ";");
            int length2 = strArrM1.length;
            Uri uri = null;
            int i3 = i;
            int i4 = -1;
            long j = -9223372036854775807L;
            while (i3 < length2) {
                String str3 = strArrM1[i3];
                try {
                    String[] strArrN0 = wlq.N0(str3, "=");
                    String str4 = strArrN0[i];
                    String str5 = strArrN0[1];
                    int iHashCode = str4.hashCode();
                    String[] strArr = strArrM0;
                    int i5 = length;
                    if (iHashCode != 113759) {
                        if (iHashCode != 116079) {
                            if (iHashCode == 1524180539 && str4.equals("rtptime")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                        } else if (str4.equals("url")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                    } else if (str4.equals("seq")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    if (b2 == 0) {
                        uri = Uri.parse(str5);
                    } else if (b2 == 1) {
                        i4 = Integer.parseInt(str5);
                    } else {
                        if (b2 != 2) {
                            throw new ParserException();
                        }
                        j = Long.parseLong(str5);
                    }
                    i3++;
                    strArrM0 = strArr;
                    length = i5;
                    i = 0;
                } catch (Exception e) {
                    throw new ParserException(str3, e);
                }
            }
            String[] strArr2 = strArrM0;
            int i6 = length;
            if (uri == null || uri.getScheme() == null || (i4 == -1 && j == -9223372036854775807L)) {
                throw new ParserException(str2);
            }
            aVar.a(new q0l(j, i4, uri));
            i2++;
            strArrM0 = strArr2;
            length = i6;
            i = 0;
        }
        return aVar.k();
    }
}

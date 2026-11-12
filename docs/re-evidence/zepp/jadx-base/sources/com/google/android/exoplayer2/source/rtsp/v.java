package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes3.dex */
final class v {
    public final long a;
    public final int b;
    public final Uri c;

    private v(long rtpTimestamp, int sequenceNumber, Uri uri) {
        this.a = rtpTimestamp;
        this.b = sequenceNumber;
        this.c = uri;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    public static ImmutableList<v> a(String rtpInfoString) throws ParserException {
        byte b;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        String[] strArrSplit = Util.split(rtpInfoString, ",");
        int length = strArrSplit.length;
        char c = 0;
        int i = 0;
        while (i < length) {
            String str = strArrSplit[i];
            String[] strArrSplit2 = Util.split(str, ";");
            int length2 = strArrSplit2.length;
            long j = C.TIME_UNSET;
            int i2 = 0;
            Uri uri = null;
            int i3 = -1;
            while (i2 < length2) {
                String str2 = strArrSplit2[i2];
                try {
                    String[] strArrSplitAtFirst = Util.splitAtFirst(str2, SearchCriteria.EQ);
                    String str3 = strArrSplitAtFirst[c];
                    String str4 = strArrSplitAtFirst[1];
                    int iHashCode = str3.hashCode();
                    String[] strArr = strArrSplit;
                    int i4 = length;
                    if (iHashCode != 113759) {
                        if (iHashCode != 116079) {
                            if (iHashCode == 1524180539 && str3.equals("rtptime")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (str3.equals("url")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (str3.equals("seq")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        uri = Uri.parse(str4);
                    } else if (b == 1) {
                        i3 = Integer.parseInt(str4);
                    } else {
                        if (b != 2) {
                            throw ParserException.createForMalformedManifest(str3, null);
                        }
                        j = Long.parseLong(str4);
                    }
                    i2++;
                    strArrSplit = strArr;
                    length = i4;
                    c = 0;
                } catch (Exception e) {
                    throw ParserException.createForMalformedManifest(str2, e);
                }
            }
            String[] strArr2 = strArrSplit;
            int i5 = length;
            if (uri == null || uri.getScheme() == null || (i3 == -1 && j == C.TIME_UNSET)) {
                throw ParserException.createForMalformedManifest(str, null);
            }
            builder.add(new v(j, i3, uri));
            i++;
            strArrSplit = strArr2;
            length = i5;
            c = 0;
        }
        return builder.build();
    }
}

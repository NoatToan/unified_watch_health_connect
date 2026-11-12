package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class RtpUtils {
    private static final String a = "rtp://0.0.0.0";

    private RtpUtils() {
    }

    public static DataSpec getIncomingRtpDataSpec(int portNumber) {
        return new DataSpec(Uri.parse(Util.formatInvariant("%s:%d", a, Integer.valueOf(portNumber))));
    }
}

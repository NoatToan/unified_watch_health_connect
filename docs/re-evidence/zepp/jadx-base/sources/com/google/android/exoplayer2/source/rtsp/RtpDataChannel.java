package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public interface RtpDataChannel extends DataSource {

    public interface Factory {
        RtpDataChannel createAndOpenDataChannel(int trackId) throws IOException;

        @Nullable
        Factory createFallbackDataChannelFactory();
    }

    String a();

    @Nullable
    RtspMessageChannel.InterleavedBinaryDataListener b();

    int getLocalPort();
}

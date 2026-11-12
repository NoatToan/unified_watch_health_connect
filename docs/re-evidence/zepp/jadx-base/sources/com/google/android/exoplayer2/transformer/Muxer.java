package com.google.android.exoplayer2.transformer;

import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
interface Muxer {

    public interface Factory {
        Muxer create(ParcelFileDescriptor parcelFileDescriptor, String outputMimeType) throws IOException;

        Muxer create(String path, String outputMimeType) throws IOException;

        boolean supportsOutputMimeType(String mimeType);
    }

    void a(boolean forCancellation);

    boolean b(@Nullable String mimeType);

    void c(int trackIndex, ByteBuffer data, boolean isKeyFrame, long presentationTimeUs);

    int d(Format format);
}

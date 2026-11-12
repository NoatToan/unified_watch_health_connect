package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b {
    public static int a(TrackOutput _this, DataReader dataReader, int i, boolean z) throws IOException {
        return _this.sampleData(dataReader, i, z, 0);
    }

    public static void b(TrackOutput _this, ParsableByteArray parsableByteArray, int i) {
        _this.sampleData(parsableByteArray, i, 0);
    }
}

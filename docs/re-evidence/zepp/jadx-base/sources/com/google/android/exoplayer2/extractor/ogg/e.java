package com.google.android.exoplayer2.extractor.ogg;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
interface e {
    @Nullable
    SeekMap a();

    void b(long targetGranule);

    long read(ExtractorInput input) throws IOException;
}

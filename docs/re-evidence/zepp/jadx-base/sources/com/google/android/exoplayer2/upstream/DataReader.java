package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface DataReader {
    int read(byte[] buffer, int offset, int length) throws IOException;
}

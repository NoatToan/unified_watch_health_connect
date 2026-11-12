package com.xiaomi.continuity.jni;

/* JADX INFO: loaded from: classes7.dex */
public class NInputReader extends NObject {
    public native int read();

    public native int read(byte[] bArr, int i, int i2);

    public native long skip(long j);
}

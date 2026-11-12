package com.huami.http;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0000\u001a\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¨\u0006\u000b"}, d2 = {"", "", "charsetName", "decompressToStringForZlib", "decompressForGzip", "bytesToDecompress", "decompressForZlib", "Ljava/io/Closeable;", "closeable", "", "closeQuietly", "httpkit_release"}, k = 2, mv = {1, 5, 1})
public final class ByteArrayKtxKt {
    public static final void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                Result.Companion companion = Result.Companion;
                closeable.close();
                Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    @Nullable
    public static final String decompressForGzip(@NotNull byte[] bArr, @Nullable String str) {
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        Object objM3845constructorimpl;
        int length = bArr.length;
        try {
            Result.Companion companion = Result.Companion;
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream, length);
                try {
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr2 = new byte[length];
                    while (true) {
                        int i = gZIPInputStream.read(bArr2);
                        if (i == -1) {
                            break;
                        }
                        sb.append(new String(bArr2, 0, i, Charset.forName(str)));
                    }
                    objM3845constructorimpl = Result.m3845constructorimpl(sb.toString());
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
            } catch (Throwable th2) {
                th = th2;
                gZIPInputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            gZIPInputStream = null;
            byteArrayInputStream = null;
        }
        closeQuietly(gZIPInputStream);
        closeQuietly(byteArrayInputStream);
        return (String) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    public static /* synthetic */ String decompressForGzip$default(byte[] bArr, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "UTF-8";
        }
        return decompressForGzip(bArr, str);
    }

    @Nullable
    public static final byte[] decompressForZlib(@NotNull byte[] bArr) {
        Inflater inflater = new Inflater();
        int length = bArr.length;
        int i = 0;
        inflater.setInput(bArr, 0, length);
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = null;
        try {
            Result.Companion companion = Result.Companion;
            while (!inflater.needsInput()) {
                byte[] bArr3 = new byte[length];
                int iInflate = inflater.inflate(bArr3);
                if (iInflate > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        arrayList.add(Byte.valueOf(bArr3[i2]));
                        if (i3 >= iInflate) {
                            break;
                        }
                        i2 = i3;
                    }
                }
            }
            int size = arrayList.size();
            bArr2 = new byte[size];
            int i4 = size - 1;
            if (i4 >= 0) {
                while (true) {
                    int i5 = i + 1;
                    bArr2[i] = ((Number) arrayList.get(i)).byteValue();
                    if (i5 > i4) {
                        break;
                    }
                    i = i5;
                }
            }
            Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        inflater.end();
        return bArr2;
    }

    @Nullable
    public static final String decompressToStringForZlib(@NotNull byte[] bArr, @Nullable String str) {
        Object objM3845constructorimpl;
        byte[] bArrDecompressForZlib = decompressForZlib(bArr);
        try {
            Result.Companion companion = Result.Companion;
            if (bArrDecompressForZlib == null) {
                Intrinsics.throwNpe();
            }
            objM3845constructorimpl = Result.m3845constructorimpl(new String(bArrDecompressForZlib, 0, bArrDecompressForZlib.length, Charset.forName(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (String) objM3845constructorimpl;
    }

    public static /* synthetic */ String decompressToStringForZlib$default(byte[] bArr, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "UTF-8";
        }
        return decompressToStringForZlib(bArr, str);
    }
}

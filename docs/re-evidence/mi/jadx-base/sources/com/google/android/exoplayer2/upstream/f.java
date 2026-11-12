package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.ParserException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8433a;

    public f() {
        this(-1);
    }

    @Override // com.google.android.exoplayer2.upstream.h
    public long a(h.a aVar) {
        IOException iOException = aVar.c;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource.CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException)) {
            return -9223372036854775807L;
        }
        return Math.min((aVar.d - 1) * 1000, 5000);
    }

    @Override // com.google.android.exoplayer2.upstream.h
    public long c(h.a aVar) {
        IOException iOException = aVar.c;
        if (!(iOException instanceof HttpDataSource.InvalidResponseCodeException)) {
            return -9223372036854775807L;
        }
        int i = ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode;
        return (i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) ? 60000L : -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.upstream.h
    public int e(int i) {
        int i2 = this.f8433a;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        }
        return i2;
    }

    public f(int i) {
        this.f8433a = i;
    }
}

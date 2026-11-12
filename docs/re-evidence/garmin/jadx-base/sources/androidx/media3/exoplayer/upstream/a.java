package androidx.media3.exoplayer.upstream;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9716a;

    public a(int i14) {
        this.f9716a = i14;
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public final b.C0129b a(b.a aVar, b.c cVar) {
        IOException iOException = cVar.f9723a;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return null;
        }
        int i14 = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode;
        if (i14 != 403 && i14 != 404 && i14 != 410 && i14 != 416 && i14 != 500 && i14 != 503) {
            return null;
        }
        if (aVar.f9717a - aVar.f9718b > 1) {
            return new b.C0129b(1, 300000L);
        }
        if (aVar.f9719c - aVar.f9720d > 1) {
            return new b.C0129b(2, 60000L);
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public final long b(b.c cVar) {
        IOException iOException = cVar.f9723a;
        return ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.isCausedByPositionOutOfRange(iOException)) ? C.TIME_UNSET : Math.min((cVar.f9724b - 1) * 1000, 5000);
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public final int getMinimumLoadableRetryCount(int i14) {
        int i15 = this.f9716a;
        if (i15 == -1) {
            return i14 == 7 ? 6 : 3;
        }
        return i15;
    }

    public a() {
        this(-1);
    }
}

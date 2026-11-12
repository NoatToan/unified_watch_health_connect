package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.t;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class PreloadException extends Exception {
    public final t mediaItem;

    public PreloadException(t tVar, String str, Throwable th3) {
        super(str, th3);
        this.mediaItem = tVar;
    }

    public boolean errorInfoEquals(PreloadException preloadException) {
        if (this == preloadException) {
            return true;
        }
        if (preloadException != null) {
            Throwable cause = getCause();
            Throwable cause2 = preloadException.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!Objects.equals(cause.getMessage(), cause2.getMessage()) || !cause.getClass().equals(cause2.getClass())) {
                return false;
            }
            if (Objects.equals(this.mediaItem, preloadException.mediaItem) && Objects.equals(getMessage(), preloadException.getMessage())) {
                return true;
            }
        }
        return false;
    }
}

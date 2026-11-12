package androidx.webkit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes21.dex */
public abstract class WebResourceErrorCompat {

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface NetErrorCode {
    }

    public abstract CharSequence getDescription();

    public abstract int getErrorCode();
}

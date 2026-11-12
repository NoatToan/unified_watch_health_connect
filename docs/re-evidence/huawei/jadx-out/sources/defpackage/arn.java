package defpackage;

import com.google.common.util.concurrent.ElementTypesAreNonnullByDefault;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public class arn extends RuntimeException {
    private static final long serialVersionUID = 0;

    protected arn() {
    }

    public arn(@CheckForNull Throwable th) {
        super(th);
    }
}

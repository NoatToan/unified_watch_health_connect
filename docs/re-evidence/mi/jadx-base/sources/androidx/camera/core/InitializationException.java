package androidx.camera.core;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class InitializationException extends Exception {
    public InitializationException(String str) {
        super(str);
    }

    public InitializationException(String str, Throwable th) {
        super(str, th);
    }

    public InitializationException(Throwable th) {
        super(th);
    }
}

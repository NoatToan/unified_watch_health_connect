package androidx.health.platform.client.impl.ipc;

import androidx.annotation.RestrictTo;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ApiVersionException extends ExecutionException {
    private final int mMinVersion;
    private final int mRemoteVersion;

    public ApiVersionException(int i, int i2) {
        super("Version requirements for calling the method was not met, remoteVersion: " + i + ", minVersion: " + i2);
        this.mRemoteVersion = i;
        this.mMinVersion = i2;
    }

    public int getMinVersion() {
        return this.mMinVersion;
    }

    public int getRemoteVersion() {
        return this.mRemoteVersion;
    }
}

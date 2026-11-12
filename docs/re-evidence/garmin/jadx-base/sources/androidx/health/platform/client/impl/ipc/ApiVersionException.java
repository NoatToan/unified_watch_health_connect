package androidx.health.platform.client.impl.ipc;

import java.util.concurrent.ExecutionException;
import tn.k;

/* JADX INFO: loaded from: classes.dex */
public class ApiVersionException extends ExecutionException {
    private final int mMinVersion;
    private final int mRemoteVersion;

    public ApiVersionException(int i14, int i15) {
        super(k.e(i14, i15, "Version requirements for calling the method was not met, remoteVersion: ", ", minVersion: "));
        this.mRemoteVersion = i14;
        this.mMinVersion = i15;
    }

    public int getMinVersion() {
        return this.mMinVersion;
    }

    public int getRemoteVersion() {
        return this.mRemoteVersion;
    }
}

package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class CameraCaptureFailure {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reason f1711a;

    public enum Reason {
        ERROR
    }

    public CameraCaptureFailure(Reason reason) {
        this.f1711a = reason;
    }

    public Reason a() {
        return this.f1711a;
    }
}

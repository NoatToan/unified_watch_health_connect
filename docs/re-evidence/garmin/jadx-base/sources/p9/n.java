package p9;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f136448a;

    public n(IBinder iBinder) {
        this.f136448a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f136448a;
    }
}

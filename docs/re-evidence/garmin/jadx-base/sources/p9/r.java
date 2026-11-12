package p9;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f136450a;

    public r(IBinder iBinder) {
        this.f136450a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f136450a;
    }
}

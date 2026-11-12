package p9;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f136453a;

    public x(IBinder iBinder) {
        this.f136453a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f136453a;
    }
}

package p9;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f136449a;

    public p(IBinder iBinder) {
        this.f136449a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f136449a;
    }
}

package p9;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f136442a;

    public f(IBinder iBinder) {
        this.f136442a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f136442a;
    }
}

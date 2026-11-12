package p9;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f136451a;

    public t(IBinder iBinder) {
        this.f136451a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f136451a;
    }
}

package p9;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f136437a;

    public a(IBinder iBinder) {
        this.f136437a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f136437a;
    }
}

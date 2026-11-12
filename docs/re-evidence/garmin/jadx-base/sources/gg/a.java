package gg;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes7.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: gg.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1557a extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f77097a = 0;

        /* JADX INFO: renamed from: gg.a$a$a, reason: collision with other inner class name */
        public static class C1558a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f77098a;

            public C1558a(IBinder iBinder) {
                this.f77098a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f77098a;
            }
        }
    }
}

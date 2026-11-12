package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RestrictTo;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface f0d extends IInterface {
    public static final String t3 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace(Typography.dollar, '.');

    public static abstract class a extends Binder implements f0d {

        /* JADX INFO: renamed from: f0d$a$a, reason: collision with other inner class name */
        public static class C0931a implements f0d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f17258a;

            public C0931a(IBinder iBinder) {
                this.f17258a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17258a;
            }
        }

        public static f0d s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f0d.t3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f0d)) ? new C0931a(iBinder) : (f0d) iInterfaceQueryLocalInterface;
        }
    }
}

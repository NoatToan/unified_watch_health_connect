package b;

import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.huawei.harmonyos.interwork.base.ability.IAbilityConnection;
import com.huawei.harmonyos.interwork.base.bundle.ElementName;
import java.util.HashSet;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends a.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f864b = new HashSet();
    public static Handler e;
    public final IAbilityConnection d;

    public a(IAbilityConnection iAbilityConnection) {
        this.d = iAbilityConnection;
    }

    public final /* synthetic */ void a(ElementName elementName, IBinder iBinder, int i) {
        this.d.onAbilityConnectDone(elementName, iBinder, i);
    }

    public final void b(final ElementName elementName, final IBinder iBinder, final int i) {
        Handler handler = e;
        if (handler == null) {
            Log.e("DefKitLib_Connection", "invalid handler when connect done.");
        } else {
            handler.post(new Runnable() { // from class: cn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1815c.a(elementName, iBinder, i);
                }
            });
        }
    }

    @Override // a.b, android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("harmonyos.abilityshell.DistributedConnection");
            b(parcel.readInt() != 0 ? ElementName.CREATOR.createFromParcel(parcel) : null, parcel.readStrongBinder(), parcel.readInt());
            return true;
        }
        if (i == 2) {
            parcel.enforceInterface("harmonyos.abilityshell.DistributedConnection");
            b(parcel.readInt() != 0 ? ElementName.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            return true;
        }
        if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel2.writeString("harmonyos.abilityshell.DistributedConnection");
        return true;
    }

    public final /* synthetic */ void a(ElementName elementName, int i) {
        this.d.onAbilityDisconnectDone(elementName, i);
    }

    public final void b(final ElementName elementName, final int i) {
        Handler handler = e;
        if (handler == null) {
            Log.e("DefKitLib_Connection", "invalid handler when disconnect.");
        } else {
            handler.post(new Runnable() { // from class: co
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a(elementName, i);
                }
            });
        }
    }
}

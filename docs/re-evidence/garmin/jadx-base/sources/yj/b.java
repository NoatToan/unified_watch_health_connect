package yj;

import android.os.IBinder;
import android.os.IInterface;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f197463a;

    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN(-1),
        ACQUIRE_CHANNEL_PRIVATE_NETWORK(1),
        ACQUIRE_CHANNEL_PREDEFINED_NETWORK(2),
        /* JADX INFO: Fake field, exist only in values array */
        ACQUIRE_CHANNEL_FROM_ADAPTER_PREDEFINED_NETWORK(3),
        /* JADX INFO: Fake field, exist only in values array */
        ACQUIRE_CHANNEL_FROM_ADAPTER_PRIVATE_NETWORK(4);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f197467a;

        static {
            values();
        }

        a(int i14) {
            this.f197467a = i14;
        }
    }

    public b(IBinder iBinder) {
        e c3702a;
        int i14 = e.a.f197472a;
        if (iBinder == null) {
            c3702a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelProviderAidl");
            c3702a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) ? new e.a.C3702a(iBinder) : (e) iInterfaceQueryLocalInterface;
        }
        this.f197463a = c3702a;
        if (c3702a != null) {
            return;
        }
        h.s("The given service does not seem to be an ANT channel pool which communicates over AIDL.");
        throw null;
    }
}

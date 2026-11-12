package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.xiaomi.continuity.ServiceName;
import com.xiaomi.continuity.channel.ChannelConfirmOptions;
import com.xiaomi.continuity.channel.ClientChannelOptions;
import com.xiaomi.continuity.channel.ClientChannelOptionsV2;
import com.xiaomi.continuity.channel.ServerChannelOptions;
import com.xiaomi.continuity.channel.b;
import com.xiaomi.continuity.netbus.LinkAddress;

/* JADX INFO: loaded from: classes7.dex */
public interface mqc extends IInterface {

    public static abstract class a extends Binder implements mqc {

        /* JADX INFO: renamed from: mqc$a$a, reason: collision with other inner class name */
        public static class C1037a implements mqc {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static mqc f27098b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f27099a;

            public C1037a(IBinder iBinder) {
                this.f27099a = iBinder;
            }

            @Override // defpackage.mqc
            public int D4(ServiceName serviceName) {
                int iD4;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.continuity.IContinuityConnectionManager");
                    if (serviceName != null) {
                        parcelObtain.writeInt(1);
                        serviceName.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f27099a.transact(2, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                        iD4 = parcelObtain2.readInt();
                    } else {
                        iD4 = a.h4().D4(serviceName);
                    }
                    return iD4;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.mqc
            public Bundle E3(int i, int i2) {
                Bundle bundleE3;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.continuity.IContinuityConnectionManager");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.f27099a.transact(9, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                        bundleE3 = parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        bundleE3 = a.h4().E3(i, i2);
                    }
                    return bundleE3;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.mqc
            public int F1(int i, byte[] bArr, Bundle bundle, ayc aycVar) {
                int iF1;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.continuity.IContinuityConnectionManager");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(aycVar != null ? aycVar.asBinder() : null);
                    if (this.f27099a.transact(7, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                        iF1 = parcelObtain2.readInt();
                    } else {
                        iF1 = a.h4().F1(i, bArr, bundle, aycVar);
                    }
                    return iF1;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.mqc
            public int G3(String str, String str2, ServiceName serviceName, ClientChannelOptions clientChannelOptions, b bVar) {
                int iG3;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.continuity.IContinuityConnectionManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (serviceName != null) {
                        parcelObtain.writeInt(1);
                        serviceName.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (clientChannelOptions != null) {
                        parcelObtain.writeInt(1);
                        clientChannelOptions.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (this.f27099a.transact(3, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                        iG3 = parcelObtain2.readInt();
                    } else {
                        iG3 = a.h4().G3(str, str2, serviceName, clientChannelOptions, bVar);
                    }
                    return iG3;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.mqc
            public void J0(ServiceName serviceName, int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.continuity.IContinuityConnectionManager");
                    if (serviceName != null) {
                        parcelObtain.writeInt(1);
                        serviceName.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    if (this.f27099a.transact(14, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().J0(serviceName, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.mqc
            public void P3(int i, int i2, ChannelConfirmOptions channelConfirmOptions) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.continuity.IContinuityConnectionManager");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (channelConfirmOptions != null) {
                        parcelObtain.writeInt(1);
                        channelConfirmOptions.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f27099a.transact(15, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().P3(i, i2, channelConfirmOptions);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.mqc
            public void Q1(int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.continuity.IContinuityConnectionManager");
                    parcelObtain.writeInt(i);
                    if (this.f27099a.transact(6, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().Q1(i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.mqc
            public int U0(String str, ServiceName serviceName, ServerChannelOptions serverChannelOptions, b bVar) {
                int iU0;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.continuity.IContinuityConnectionManager");
                    parcelObtain.writeString(str);
                    if (serviceName != null) {
                        parcelObtain.writeInt(1);
                        serviceName.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (serverChannelOptions != null) {
                        parcelObtain.writeInt(1);
                        serverChannelOptions.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (this.f27099a.transact(1, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                        iU0 = parcelObtain2.readInt();
                    } else {
                        iU0 = a.h4().U0(str, serviceName, serverChannelOptions, bVar);
                    }
                    return iU0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.mqc
            public void V2(int i, int i2, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.continuity.IContinuityConnectionManager");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    if (this.f27099a.transact(13, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().V2(i, i2, str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27099a;
            }

            @Override // defpackage.mqc
            public int b5(String str, String str2, ServiceName serviceName, ClientChannelOptionsV2 clientChannelOptionsV2, b bVar) {
                int iB5;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.continuity.IContinuityConnectionManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (serviceName != null) {
                        parcelObtain.writeInt(1);
                        serviceName.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (clientChannelOptionsV2 != null) {
                        parcelObtain.writeInt(1);
                        clientChannelOptionsV2.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (this.f27099a.transact(11, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                        iB5 = parcelObtain2.readInt();
                    } else {
                        iB5 = a.h4().b5(str, str2, serviceName, clientChannelOptionsV2, bVar);
                    }
                    return iB5;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.mqc
            public int g0(String str, LinkAddress linkAddress, ServiceName serviceName, ClientChannelOptionsV2 clientChannelOptionsV2, b bVar) {
                int iG0;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.continuity.IContinuityConnectionManager");
                    parcelObtain.writeString(str);
                    if (linkAddress != null) {
                        parcelObtain.writeInt(1);
                        linkAddress.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (serviceName != null) {
                        parcelObtain.writeInt(1);
                        serviceName.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (clientChannelOptionsV2 != null) {
                        parcelObtain.writeInt(1);
                        clientChannelOptionsV2.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (this.f27099a.transact(12, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                        iG0 = parcelObtain2.readInt();
                    } else {
                        iG0 = a.h4().g0(str, linkAddress, serviceName, clientChannelOptionsV2, bVar);
                    }
                    return iG0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.mqc
            public int i4(String str, LinkAddress linkAddress, ServiceName serviceName, ClientChannelOptions clientChannelOptions, b bVar) {
                int iI4;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.continuity.IContinuityConnectionManager");
                    parcelObtain.writeString(str);
                    if (linkAddress != null) {
                        parcelObtain.writeInt(1);
                        linkAddress.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (serviceName != null) {
                        parcelObtain.writeInt(1);
                        serviceName.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (clientChannelOptions != null) {
                        parcelObtain.writeInt(1);
                        clientChannelOptions.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (this.f27099a.transact(4, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                        iI4 = parcelObtain2.readInt();
                    } else {
                        iI4 = a.h4().i4(str, linkAddress, serviceName, clientChannelOptions, bVar);
                    }
                    return iI4;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.mqc
            public String m0() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.continuity.IContinuityConnectionManager");
                    if (this.f27099a.transact(10, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = a.h4().m0();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.mqc
            public void w3(int i, int i2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.continuity.IContinuityConnectionManager");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.f27099a.transact(8, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().w3(i, i2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.mqc
            public void z2(int i, int i2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.continuity.IContinuityConnectionManager");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.f27099a.transact(5, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().z2(i, i2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static mqc h4() {
            return C1037a.f27098b;
        }

        public static mqc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.continuity.IContinuityConnectionManager");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof mqc)) ? new C1037a(iBinder) : (mqc) iInterfaceQueryLocalInterface;
        }
    }

    int D4(ServiceName serviceName);

    Bundle E3(int i, int i2);

    int F1(int i, byte[] bArr, Bundle bundle, ayc aycVar);

    int G3(String str, String str2, ServiceName serviceName, ClientChannelOptions clientChannelOptions, b bVar);

    void J0(ServiceName serviceName, int i);

    void P3(int i, int i2, ChannelConfirmOptions channelConfirmOptions);

    void Q1(int i);

    int U0(String str, ServiceName serviceName, ServerChannelOptions serverChannelOptions, b bVar);

    void V2(int i, int i2, String str);

    int b5(String str, String str2, ServiceName serviceName, ClientChannelOptionsV2 clientChannelOptionsV2, b bVar);

    int g0(String str, LinkAddress linkAddress, ServiceName serviceName, ClientChannelOptionsV2 clientChannelOptionsV2, b bVar);

    int i4(String str, LinkAddress linkAddress, ServiceName serviceName, ClientChannelOptions clientChannelOptions, b bVar);

    String m0();

    void w3(int i, int i2);

    void z2(int i, int i2);
}

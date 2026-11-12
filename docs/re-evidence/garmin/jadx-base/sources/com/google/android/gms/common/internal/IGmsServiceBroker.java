package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.protobuf.a;

/* JADX INFO: loaded from: classes14.dex */
public interface IGmsServiceBroker extends IInterface {

    public static abstract class Stub extends Binder implements IGmsServiceBroker {
        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @Override // android.os.IInterface
        @KeepForSdk
        public IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:64:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:65:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
        @Override // android.os.Binder
        public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            IGmsCallbacks zzyVar;
            if (i14 <= 0 || i14 > 16777215) {
                return super.onTransact(i14, parcel, parcel2, i15);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzyVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                zzyVar = iInterfaceQueryLocalInterface instanceof IGmsCallbacks ? (IGmsCallbacks) iInterfaceQueryLocalInterface : new zzy(strongBinder);
            }
            if (i14 == 46) {
                getService(zzyVar, parcel.readInt() != 0 ? GetServiceRequest.CREATOR.createFromParcel(parcel) : null);
                Preconditions.checkNotNull(parcel2);
                parcel2.writeNoException();
                return true;
            }
            if (i14 == 47) {
                if (parcel.readInt() != 0) {
                    zzai.CREATOR.createFromParcel(parcel);
                }
                a.m();
                return false;
            }
            parcel.readInt();
            if (i14 != 4) {
                parcel.readString();
                if (i14 == 1) {
                    parcel.readString();
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                } else if (i14 == 2 || i14 == 23 || i14 == 25 || i14 == 27) {
                    if (parcel.readInt() != 0) {
                    }
                } else if (i14 == 30) {
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                } else if (i14 == 34) {
                    parcel.readString();
                } else if (i14 != 41 && i14 != 43 && i14 != 37 && i14 != 38) {
                    switch (i14) {
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                            if (parcel.readInt() != 0) {
                            }
                            break;
                        case 9:
                            parcel.readString();
                            parcel.createStringArray();
                            parcel.readString();
                            parcel.readStrongBinder();
                            parcel.readString();
                            if (parcel.readInt() != 0) {
                            }
                            break;
                        case 10:
                            parcel.readString();
                            parcel.createStringArray();
                            break;
                        case 19:
                            parcel.readStrongBinder();
                            if (parcel.readInt() != 0) {
                            }
                            break;
                        case 20:
                            parcel.createStringArray();
                            parcel.readString();
                            if (parcel.readInt() != 0) {
                            }
                            break;
                    }
                } else if (parcel.readInt() != 0) {
                }
            }
            a.m();
            return false;
        }
    }

    @KeepForSdk
    void getService(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest);
}

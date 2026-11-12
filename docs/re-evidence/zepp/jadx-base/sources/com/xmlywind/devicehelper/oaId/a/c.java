package com.xmlywind.devicehelper.oaId.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.xmlywind.logger.SigmobLog;

/* JADX INFO: loaded from: classes22.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {

        /* JADX INFO: renamed from: com.xmlywind.devicehelper.oaId.a.c$a$a, reason: collision with other inner class name */
        public static class C1058a implements c {
            private IBinder a;

            public C1058a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.xmlywind.devicehelper.oaId.a.c
            public String a() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken(com.alipay.sdk.m.q0.a.AbstractBinderC0091a.a);
                        this.a.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (Exception e) {
                        SigmobLog.e(e.getMessage());
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        string = null;
                    }
                    return string;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // com.xmlywind.devicehelper.oaId.a.c
            public String a(String str) {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken(com.alipay.sdk.m.q0.a.AbstractBinderC0091a.a);
                        this.a.transact(4, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (Exception e) {
                        SigmobLog.e(e.getMessage());
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        string = null;
                    }
                    return string;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xmlywind.devicehelper.oaId.a.c
            public String b() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken(com.alipay.sdk.m.q0.a.AbstractBinderC0091a.a);
                        this.a.transact(2, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (Exception e) {
                        SigmobLog.e(e.getMessage());
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        string = null;
                    }
                    return string;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // com.xmlywind.devicehelper.oaId.a.c
            public String b(String str) {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken(com.alipay.sdk.m.q0.a.AbstractBinderC0091a.a);
                        this.a.transact(5, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (Exception e) {
                        SigmobLog.e(e.getMessage());
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        string = null;
                    }
                    return string;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // com.xmlywind.devicehelper.oaId.a.c
            public boolean c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                boolean z = false;
                try {
                    parcelObtain.writeInterfaceToken(com.alipay.sdk.m.q0.a.AbstractBinderC0091a.a);
                    this.a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable unused) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
                return z;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String strA;
            if (i == 1) {
                parcel.enforceInterface(com.alipay.sdk.m.q0.a.AbstractBinderC0091a.a);
                strA = a();
            } else if (i == 2) {
                parcel.enforceInterface(com.alipay.sdk.m.q0.a.AbstractBinderC0091a.a);
                strA = b();
            } else {
                if (i == 3) {
                    parcel.enforceInterface(com.alipay.sdk.m.q0.a.AbstractBinderC0091a.a);
                    boolean zC = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(zC ? 1 : 0);
                    return true;
                }
                if (i == 4) {
                    parcel.enforceInterface(com.alipay.sdk.m.q0.a.AbstractBinderC0091a.a);
                    strA = a(parcel.readString());
                } else {
                    if (i != 5) {
                        if (i != 1598968902) {
                            return super.onTransact(i, parcel, parcel2, i2);
                        }
                        parcel2.writeString(com.alipay.sdk.m.q0.a.AbstractBinderC0091a.a);
                        return true;
                    }
                    parcel.enforceInterface(com.alipay.sdk.m.q0.a.AbstractBinderC0091a.a);
                    strA = b(parcel.readString());
                }
            }
            parcel2.writeNoException();
            parcel2.writeString(strA);
            return true;
        }
    }

    String a();

    String a(String str);

    String b();

    String b(String str);

    boolean c();
}

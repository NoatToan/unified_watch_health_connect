package com.huawei.hms.ads.uiengine;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.ads.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes10.dex */
public interface IRemoteCreator extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hms.ads.uiengine.IRemoteCreator";

    void bindData(IObjectWrapper iObjectWrapper, String str);

    void destroyView(IObjectWrapper iObjectWrapper);

    e getUiEngineUtil();

    String getVersion();

    IObjectWrapper newBannerTemplateView(Bundle bundle);

    IObjectWrapper newHwPPSRouterParser(Bundle bundle);

    IObjectWrapper newInterstitialTemplateView(Bundle bundle);

    IObjectWrapper newNativeTemplateView(Bundle bundle, c cVar);

    IRemoteViewDelegate newRemoteViewDelegate(IObjectWrapper iObjectWrapper, String str, Bundle bundle);

    IObjectWrapper newRewardTemplateView(Bundle bundle, d dVar);

    IObjectWrapper newSplashTemplateView(Bundle bundle, ISplashApi iSplashApi);

    void setGlobalUtil(IGlobalUtil iGlobalUtil);

    void setSdkInfo(int i, int i2, Bundle bundle);

    public static abstract class a extends Binder implements IRemoteCreator {

        /* JADX INFO: renamed from: com.huawei.hms.ads.uiengine.IRemoteCreator$a$a, reason: collision with other inner class name */
        static class C0101a implements IRemoteCreator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static IRemoteCreator f12845a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f12846b;

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public void setSdkInfo(int i, int i2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCreator.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f12846b.transact(11, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.a().setSdkInfo(i, i2, bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public void setGlobalUtil(IGlobalUtil iGlobalUtil) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCreator.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iGlobalUtil != null ? iGlobalUtil.asBinder() : null);
                    if (this.f12846b.transact(2, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.a().setGlobalUtil(iGlobalUtil);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public IObjectWrapper newSplashTemplateView(Bundle bundle, ISplashApi iSplashApi) {
                IObjectWrapper iObjectWrapperAsInterface;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCreator.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iSplashApi != null ? iSplashApi.asBinder() : null);
                    if (this.f12846b.transact(3, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                        iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelObtain2.readStrongBinder());
                    } else {
                        iObjectWrapperAsInterface = a.a().newSplashTemplateView(bundle, iSplashApi);
                    }
                    return iObjectWrapperAsInterface;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public IObjectWrapper newRewardTemplateView(Bundle bundle, d dVar) {
                IObjectWrapper iObjectWrapperAsInterface;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCreator.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (this.f12846b.transact(10, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                        iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelObtain2.readStrongBinder());
                    } else {
                        iObjectWrapperAsInterface = a.a().newRewardTemplateView(bundle, dVar);
                    }
                    return iObjectWrapperAsInterface;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public IRemoteViewDelegate newRemoteViewDelegate(IObjectWrapper iObjectWrapper, String str, Bundle bundle) {
                IRemoteViewDelegate iRemoteViewDelegateA;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCreator.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f12846b.transact(7, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                        iRemoteViewDelegateA = IRemoteViewDelegate.a.a(parcelObtain2.readStrongBinder());
                    } else {
                        iRemoteViewDelegateA = a.a().newRemoteViewDelegate(iObjectWrapper, str, bundle);
                    }
                    return iRemoteViewDelegateA;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public IObjectWrapper newNativeTemplateView(Bundle bundle, c cVar) {
                IObjectWrapper iObjectWrapperAsInterface;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCreator.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    if (this.f12846b.transact(4, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                        iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelObtain2.readStrongBinder());
                    } else {
                        iObjectWrapperAsInterface = a.a().newNativeTemplateView(bundle, cVar);
                    }
                    return iObjectWrapperAsInterface;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public IObjectWrapper newInterstitialTemplateView(Bundle bundle) {
                IObjectWrapper iObjectWrapperAsInterface;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCreator.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f12846b.transact(12, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                        iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelObtain2.readStrongBinder());
                    } else {
                        iObjectWrapperAsInterface = a.a().newInterstitialTemplateView(bundle);
                    }
                    return iObjectWrapperAsInterface;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public IObjectWrapper newHwPPSRouterParser(Bundle bundle) {
                IObjectWrapper iObjectWrapperAsInterface;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCreator.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f12846b.transact(13, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                        iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelObtain2.readStrongBinder());
                    } else {
                        iObjectWrapperAsInterface = a.a().newHwPPSRouterParser(bundle);
                    }
                    return iObjectWrapperAsInterface;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public IObjectWrapper newBannerTemplateView(Bundle bundle) {
                IObjectWrapper iObjectWrapperAsInterface;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCreator.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f12846b.transact(5, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                        iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelObtain2.readStrongBinder());
                    } else {
                        iObjectWrapperAsInterface = a.a().newBannerTemplateView(bundle);
                    }
                    return iObjectWrapperAsInterface;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public String getVersion() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCreator.DESCRIPTOR);
                    if (this.f12846b.transact(1, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = a.a().getVersion();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public e getUiEngineUtil() {
                e eVarA;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCreator.DESCRIPTOR);
                    if (this.f12846b.transact(9, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                        eVarA = e.a.a(parcelObtain2.readStrongBinder());
                    } else {
                        eVarA = a.a().getUiEngineUtil();
                    }
                    return eVarA;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public void destroyView(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCreator.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    if (this.f12846b.transact(8, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.a().destroyView(iObjectWrapper);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.IRemoteCreator
            public void bindData(IObjectWrapper iObjectWrapper, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCreator.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    parcelObtain.writeString(str);
                    if (this.f12846b.transact(6, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.a().bindData(iObjectWrapper, str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12846b;
            }

            C0101a(IBinder iBinder) {
                this.f12846b = iBinder;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(IRemoteCreator.DESCRIPTOR);
                        String version = getVersion();
                        parcel2.writeNoException();
                        parcel2.writeString(version);
                        return true;
                    case 2:
                        parcel.enforceInterface(IRemoteCreator.DESCRIPTOR);
                        setGlobalUtil(IGlobalUtil.a.a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(IRemoteCreator.DESCRIPTOR);
                        IObjectWrapper iObjectWrapperNewSplashTemplateView = newSplashTemplateView(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, ISplashApi.a.a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(iObjectWrapperNewSplashTemplateView != null ? iObjectWrapperNewSplashTemplateView.asBinder() : null);
                        return true;
                    case 4:
                        parcel.enforceInterface(IRemoteCreator.DESCRIPTOR);
                        IObjectWrapper iObjectWrapperNewNativeTemplateView = newNativeTemplateView(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, c.a.a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(iObjectWrapperNewNativeTemplateView != null ? iObjectWrapperNewNativeTemplateView.asBinder() : null);
                        return true;
                    case 5:
                        parcel.enforceInterface(IRemoteCreator.DESCRIPTOR);
                        IObjectWrapper iObjectWrapperNewBannerTemplateView = newBannerTemplateView(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(iObjectWrapperNewBannerTemplateView != null ? iObjectWrapperNewBannerTemplateView.asBinder() : null);
                        return true;
                    case 6:
                        parcel.enforceInterface(IRemoteCreator.DESCRIPTOR);
                        bindData(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(IRemoteCreator.DESCRIPTOR);
                        IRemoteViewDelegate iRemoteViewDelegateNewRemoteViewDelegate = newRemoteViewDelegate(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(iRemoteViewDelegateNewRemoteViewDelegate != null ? iRemoteViewDelegateNewRemoteViewDelegate.asBinder() : null);
                        return true;
                    case 8:
                        parcel.enforceInterface(IRemoteCreator.DESCRIPTOR);
                        destroyView(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface(IRemoteCreator.DESCRIPTOR);
                        e uiEngineUtil = getUiEngineUtil();
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(uiEngineUtil != null ? uiEngineUtil.asBinder() : null);
                        return true;
                    case 10:
                        parcel.enforceInterface(IRemoteCreator.DESCRIPTOR);
                        IObjectWrapper iObjectWrapperNewRewardTemplateView = newRewardTemplateView(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, d.a.a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(iObjectWrapperNewRewardTemplateView != null ? iObjectWrapperNewRewardTemplateView.asBinder() : null);
                        return true;
                    case 11:
                        parcel.enforceInterface(IRemoteCreator.DESCRIPTOR);
                        setSdkInfo(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface(IRemoteCreator.DESCRIPTOR);
                        IObjectWrapper iObjectWrapperNewInterstitialTemplateView = newInterstitialTemplateView(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(iObjectWrapperNewInterstitialTemplateView != null ? iObjectWrapperNewInterstitialTemplateView.asBinder() : null);
                        return true;
                    case 13:
                        parcel.enforceInterface(IRemoteCreator.DESCRIPTOR);
                        IObjectWrapper iObjectWrapperNewHwPPSRouterParser = newHwPPSRouterParser(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(iObjectWrapperNewHwPPSRouterParser != null ? iObjectWrapperNewHwPPSRouterParser.asBinder() : null);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString(IRemoteCreator.DESCRIPTOR);
            return true;
        }

        public static IRemoteCreator a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IRemoteCreator.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemoteCreator)) ? new C0101a(iBinder) : (IRemoteCreator) iInterfaceQueryLocalInterface;
        }

        public static IRemoteCreator a() {
            return C0101a.f12845a;
        }
    }
}

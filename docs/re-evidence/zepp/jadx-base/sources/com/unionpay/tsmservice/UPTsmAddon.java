package com.unionpay.tsmservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.unionpay.tsmservice.data.ApplyActivityStyle;
import com.unionpay.tsmservice.data.Constant;
import com.unionpay.tsmservice.data.ResultCode;
import com.unionpay.tsmservice.request.BleKeyExchangeRequestParams;
import com.unionpay.tsmservice.request.CheckBinRequestParams;
import com.unionpay.tsmservice.request.EncryptDataRequestParams;
import com.unionpay.tsmservice.request.ExchangeKeyRequestParams;
import com.unionpay.tsmservice.request.ExecuteCmdRequestParams;
import com.unionpay.tsmservice.request.GetActiveCodeRequestParams;
import com.unionpay.tsmservice.request.GetEncryptDataRequestParams;
import com.unionpay.tsmservice.request.GetUniteAppListRequestParams;
import com.unionpay.tsmservice.request.InitRequestParams;
import com.unionpay.tsmservice.request.OpenUniteCardApplyActivityRequestParams;
import com.unionpay.tsmservice.request.OpenUniteCardApplyActivityWithRiskInfoRequestParams;
import com.unionpay.tsmservice.request.RequestParams;
import com.unionpay.tsmservice.request.SafetyKeyboardRequestParams;
import com.unionpay.tsmservice.request.UniteAppDeleteRequestParams;
import com.unionpay.tsmservice.request.UniteAppDownloadRequestParams;
import com.unionpay.tsmservice.request.UniteCardActiveRequestParams;
import com.unionpay.tsmservice.result.AppDownloadApplyResult;
import com.unionpay.tsmservice.result.BleKeyExchangeResult;
import com.unionpay.tsmservice.result.CheckBinCodeResult;
import com.unionpay.tsmservice.result.ECashTopUpResult;
import com.unionpay.tsmservice.result.EncryptDataResult;
import com.unionpay.tsmservice.result.GetAccountBalanceResult;
import com.unionpay.tsmservice.result.GetAccountInfoResult;
import com.unionpay.tsmservice.result.GetActivityApplyDeleteResult;
import com.unionpay.tsmservice.result.GetActivityUniteApplyResult;
import com.unionpay.tsmservice.result.GetAppDetailResult;
import com.unionpay.tsmservice.result.GetAppListResult;
import com.unionpay.tsmservice.result.GetAssociatedAppResult;
import com.unionpay.tsmservice.result.GetCardInfoResult;
import com.unionpay.tsmservice.result.GetDefaultCardResult;
import com.unionpay.tsmservice.result.GetEncryptDataResult;
import com.unionpay.tsmservice.result.GetSMSAuthCodeResult;
import com.unionpay.tsmservice.result.GetSeAppListResult;
import com.unionpay.tsmservice.result.GetSeIdResult;
import com.unionpay.tsmservice.result.GetSupportedCardTypeListResult;
import com.unionpay.tsmservice.result.GetTransElementsResult;
import com.unionpay.tsmservice.result.GetTransRecordResult;
import com.unionpay.tsmservice.result.GetUniteAppListResult;
import com.unionpay.tsmservice.result.InitResult;
import com.unionpay.tsmservice.result.OpenChannelResult;
import com.unionpay.tsmservice.result.SendApduResult;
import com.unionpay.tsmservice.result.UniteCardActiveResult;
import com.unionpay.tsmservice.utils.IUPJniInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class UPTsmAddon {
    private static final String U = "UPTsmAddon";
    private static final String V = "com.unionpay.tsmservice.UPTsmBleUniteService";
    private static final String W = "com.unionpay.tsmbleuniteservice";
    private static final int X = 0;
    private static final int Y = 1;
    private static UPTsmAddon Z;
    private static CopyOnWriteArrayList<UPTsmConnectionListener> a0;
    private final Handler.Callback R;
    private final Handler S;
    private final Handler T;
    private Context a;
    private ServiceConnection b = null;
    private ITsmService c = null;
    private boolean d = false;
    private HashMap<String, ITsmCallback> e = new HashMap<>();
    private HashMap<String, ITsmCallback> f = new HashMap<>();
    private HashMap<String, ITsmCallback> g = new HashMap<>();
    private HashMap<String, ITsmCallback> h = new HashMap<>();
    private HashMap<String, ITsmCallback> i = new HashMap<>();
    private HashMap<String, ITsmCallback> j = new HashMap<>();
    private HashMap<String, ITsmCallback> k = new HashMap<>();
    private HashMap<String, ITsmCallback> l = new HashMap<>();
    private HashMap<String, ITsmCallback> m = new HashMap<>();
    private HashMap<String, ITsmCallback> n = new HashMap<>();
    private HashMap<String, ITsmCallback> o = new HashMap<>();
    private HashMap<String, ITsmCallback> p = new HashMap<>();
    private HashMap<String, ITsmCallback> q = new HashMap<>();
    private HashMap<String, ITsmCallback> r = new HashMap<>();
    private HashMap<String, ITsmCallback> s = new HashMap<>();
    private HashMap<String, ITsmCallback> t = new HashMap<>();
    private HashMap<String, ITsmCallback> u = new HashMap<>();
    private HashMap<String, ITsmCallback> v = new HashMap<>();
    private HashMap<String, ITsmCallback> w = new HashMap<>();
    private HashMap<String, ITsmCallback> x = new HashMap<>();
    private HashMap<String, ITsmCallback> y = new HashMap<>();
    private HashMap<String, ITsmCallback> z = new HashMap<>();
    private HashMap<String, ITsmCallback> A = new HashMap<>();
    private HashMap<String, ITsmCallback> B = new HashMap<>();
    private HashMap<String, ITsmCallback> C = new HashMap<>();
    private HashMap<String, ITsmCallback> D = new HashMap<>();
    private HashMap<String, ITsmCallback> E = new HashMap<>();
    private HashMap<String, ITsmCallback> F = new HashMap<>();
    private HashMap<String, ITsmCallback> G = new HashMap<>();
    private HashMap<String, ITsmCallback> H = new HashMap<>();
    private HashMap<String, ITsmCallback> I = new HashMap<>();
    private HashMap<String, ITsmActivityCallback> J = new HashMap<>();
    private HashMap<String, ITsmActivityCallback> K = new HashMap<>();
    private HashMap<String, ITsmActivityCallback> L = new HashMap<>();
    private HashMap<String, ITsmActivityCallback> M = new HashMap<>();
    private final int N = 90;
    private final int O = 65;
    private final int P = 50;
    private final int Q = 35;

    public class TsmActivityCallback extends ITsmActivityCallback.Stub {
        private int c;

        public TsmActivityCallback(int i) {
            this.c = i;
        }

        @Override // com.unionpay.tsmservice.ITsmActivityCallback
        public void StartActivity(String str, String str2, Bundle bundle) throws RemoteException {
            UPTsmAddon uPTsmAddon = UPTsmAddon.this;
            uPTsmAddon.r((ITsmActivityCallback) uPTsmAddon.n(this.c).get(UPTsmAddon.this.p()), str, str2, bundle);
        }
    }

    public class TsmCallback extends ITsmCallback.Stub {
        private int d;

        public TsmCallback(int i) {
            this.d = i;
        }

        private Bundle a(int i, Bundle bundle) {
            Log.i(Constant.ADDON_LOG_TAG, "=====getCallbackDecryptResultData");
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("errorCode");
            byte[] bArrDecode = Base64.decode(IUPJniInterface.adM(bundle.getString("result")), 0);
            bundle2.putString("errorCode", string);
            Parcel parcelObtain = Parcel.obtain();
            if (bArrDecode != null && bArrDecode.length != 0) {
                parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
                parcelObtain.setDataPosition(0);
            }
            if (parcelObtain.dataSize() == 0) {
                parcelObtain.recycle();
                return bundle2;
            }
            if (i == 42) {
                bundle2.putParcelable("result", (GetEncryptDataResult) parcelObtain.readParcelable(GetEncryptDataResult.class.getClassLoader()));
            } else if (i == 1037) {
                bundle2.putParcelable("result", (GetSupportedCardTypeListResult) parcelObtain.readParcelable(GetSupportedCardTypeListResult.class.getClassLoader()));
            } else if (i == 1014) {
                bundle2.putParcelable("result", (GetSeAppListResult) parcelObtain.readParcelable(GetSeAppListResult.class.getClassLoader()));
            } else if (i == 1015) {
                bundle2.putParcelable("result", (GetDefaultCardResult) parcelObtain.readParcelable(GetDefaultCardResult.class.getClassLoader()));
            } else if (i == 1023) {
                bundle2.putParcelable("result", (EncryptDataResult) parcelObtain.readParcelable(EncryptDataResult.class.getClassLoader()));
            } else if (i == 1024) {
                bundle2.putParcelable("result", (GetCardInfoResult) parcelObtain.readParcelable(GetCardInfoResult.class.getClassLoader()));
            } else if (i == 1027) {
                Log.i(Constant.ADDON_LOG_TAG, "====CALLBACK_BLE_KEY_EXCHANGE");
                BleKeyExchangeResult bleKeyExchangeResult = (BleKeyExchangeResult) parcelObtain.readParcelable(BleKeyExchangeResult.class.getClassLoader());
                Log.i(Constant.ADDON_LOG_TAG, "====CALLBACK_BLE_KEY_EXCHANGE");
                bundle2.putParcelable("result", bleKeyExchangeResult);
            } else {
                if (i != 1028) {
                    switch (i) {
                        case 1000:
                            bundle2.putParcelable("result", (InitResult) parcelObtain.readParcelable(InitResult.class.getClassLoader()));
                            break;
                        case 1001:
                            bundle2.putParcelable("result", (GetAssociatedAppResult) parcelObtain.readParcelable(GetAssociatedAppResult.class.getClassLoader()));
                            break;
                        case 1002:
                            bundle2.putParcelable("result", (GetTransElementsResult) parcelObtain.readParcelable(GetTransElementsResult.class.getClassLoader()));
                            break;
                        case 1003:
                            bundle2.putParcelable("result", (GetSMSAuthCodeResult) parcelObtain.readParcelable(GetSMSAuthCodeResult.class.getClassLoader()));
                            break;
                        case 1004:
                            bundle2.putParcelable("result", (GetAccountInfoResult) parcelObtain.readParcelable(GetAccountInfoResult.class.getClassLoader()));
                            break;
                        case 1005:
                            bundle2.putParcelable("result", (GetAccountBalanceResult) parcelObtain.readParcelable(GetAccountBalanceResult.class.getClassLoader()));
                            break;
                        case 1006:
                            bundle2.putParcelable("result", (AppDownloadApplyResult) parcelObtain.readParcelable(AppDownloadApplyResult.class.getClassLoader()));
                            break;
                        default:
                            switch (i) {
                                case 1009:
                                    bundle2.putParcelable("result", (GetAppListResult) parcelObtain.readParcelable(GetAppListResult.class.getClassLoader()));
                                    break;
                                case 1010:
                                    bundle2.putParcelable("result", (GetAppDetailResult) parcelObtain.readParcelable(GetAppDetailResult.class.getClassLoader()));
                                    break;
                                case 1011:
                                    bundle2.putParcelable("result", (OpenChannelResult) parcelObtain.readParcelable(OpenChannelResult.class.getClassLoader()));
                                    break;
                                case 1012:
                                    bundle2.putParcelable("result", (SendApduResult) parcelObtain.readParcelable(SendApduResult.class.getClassLoader()));
                                    break;
                                default:
                                    switch (i) {
                                        case 1017:
                                            bundle2.putParcelable("result", (GetTransRecordResult) parcelObtain.readParcelable(GetTransRecordResult.class.getClassLoader()));
                                            break;
                                        case 1018:
                                            bundle2.putParcelable("result", (ECashTopUpResult) parcelObtain.readParcelable(ECashTopUpResult.class.getClassLoader()));
                                            break;
                                        case 1019:
                                            bundle2.putParcelable("result", (GetSeIdResult) parcelObtain.readParcelable(GetSeIdResult.class.getClassLoader()));
                                            break;
                                        default:
                                            switch (i) {
                                                case 1030:
                                                    bundle2.putParcelable("result", (CheckBinCodeResult) parcelObtain.readParcelable(CheckBinCodeResult.class.getClassLoader()));
                                                    break;
                                                case 1031:
                                                    bundle2.putParcelable("result", (GetActivityUniteApplyResult) parcelObtain.readParcelable(GetActivityUniteApplyResult.class.getClassLoader()));
                                                    Log.i(Constant.ADDON_LOG_TAG, "1031");
                                                    break;
                                                case 1032:
                                                    bundle2.putParcelable("result", (GetUniteAppListResult) parcelObtain.readParcelable(GetUniteAppListResult.class.getClassLoader()));
                                                    break;
                                                case 1033:
                                                    bundle2.putParcelable("result", (GetSMSAuthCodeResult) parcelObtain.readParcelable(GetSMSAuthCodeResult.class.getClassLoader()));
                                                    break;
                                                case 1034:
                                                    bundle2.putParcelable("result", (UniteCardActiveResult) parcelObtain.readParcelable(UniteCardActiveResult.class.getClassLoader()));
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    parcelObtain.recycle();
                    return bundle;
                }
                bundle2.putParcelable("result", (GetActivityApplyDeleteResult) parcelObtain.readParcelable(GetActivityApplyDeleteResult.class.getClassLoader()));
                Log.i(Constant.ADDON_LOG_TAG, "1028");
            }
            bundle = bundle2;
            parcelObtain.recycle();
            return bundle;
        }

        @Override // com.unionpay.tsmservice.ITsmCallback
        public void onError(String str, String str2) throws RemoteException {
            Log.e(UPTsmAddon.U, "errorCode:" + str + ", errorDesc:" + str2);
            Bundle bundle = new Bundle();
            bundle.putString("errorCode", str);
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString(Constant.KEY_ERROR_DESC, str2);
            UPTsmAddon uPTsmAddon = UPTsmAddon.this;
            uPTsmAddon.s((ITsmCallback) uPTsmAddon.o(this.d).get(UPTsmAddon.this.p()), bundle);
            UPTsmAddon.this.o(this.d).remove(UPTsmAddon.this.p());
        }

        @Override // com.unionpay.tsmservice.ITsmCallback
        public void onResult(Bundle bundle) throws RemoteException {
            new Bundle();
            Bundle bundleA = a(this.d, bundle);
            UPTsmAddon uPTsmAddon = UPTsmAddon.this;
            uPTsmAddon.s((ITsmCallback) uPTsmAddon.o(this.d).get(UPTsmAddon.this.p()), bundleA);
            UPTsmAddon.this.o(this.d).remove(UPTsmAddon.this.p());
        }
    }

    public interface UPTsmConnectionListener {
        void onTsmConnected();

        void onTsmDisconnected();
    }

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                UPTsmAddon.this.x();
                return true;
            }
            if (i != 1) {
                return false;
            }
            UPTsmAddon.this.y();
            return true;
        }
    }

    public class b extends Handler {
        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            int iIntValue = ((Integer) message.obj).intValue();
            ITsmCallback iTsmCallback = (ITsmCallback) UPTsmAddon.this.o(i).get(UPTsmAddon.this.p());
            if (iTsmCallback == null || iIntValue != iTsmCallback.hashCode()) {
                return;
            }
            UPTsmAddon.this.s(iTsmCallback, UPTsmAddon.this.m());
            UPTsmAddon.this.o(i).remove(UPTsmAddon.this.p());
        }
    }

    public class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            UPTsmAddon.this.d = true;
            UPTsmAddon.this.c = ITsmService.Stub.asInterface(iBinder);
            UPTsmAddon.this.S.sendEmptyMessage(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            UPTsmAddon.this.d = false;
            UPTsmAddon.this.c = null;
            UPTsmAddon.this.S.sendEmptyMessage(1);
        }
    }

    static {
        try {
            System.loadLibrary("uptsmaddon");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
        Z = null;
        a0 = null;
    }

    private UPTsmAddon(Context context) {
        this.a = null;
        a aVar = new a();
        this.R = aVar;
        this.S = new Handler(Looper.getMainLooper(), aVar);
        this.T = new b();
        this.a = context;
        if (!IUPJniInterface.aiJNIE(context)) {
            throw new RuntimeException();
        }
    }

    public static UPTsmAddon getInstance(Context context) {
        if (context == null) {
            return null;
        }
        if (Z == null) {
            Z = new UPTsmAddon(context.getApplicationContext());
        }
        if (a0 == null) {
            a0 = new CopyOnWriteArrayList<>();
        }
        return Z;
    }

    private boolean l() {
        if (this.b == null) {
            this.b = new c();
        }
        if (this.d) {
            return true;
        }
        Intent intent = new Intent(V);
        intent.setPackage(W);
        return this.a.bindService(intent, this.b, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle m() {
        Bundle bundle = new Bundle();
        bundle.putString("errorCode", ResultCode.ERROR_INTERFACE_CALL_OVERTIME);
        bundle.putString(Constant.KEY_ERROR_DESC, "调用超时，请确认网络或者蓝牙状态");
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, ITsmActivityCallback> n(int i) {
        if (i == 1028) {
            return this.L;
        }
        if (i == 1029) {
            return this.M;
        }
        if (i == 1031) {
            return this.K;
        }
        if (i != 1039) {
            return null;
        }
        return this.J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, ITsmCallback> o(int i) {
        if (i == 42) {
            return this.I;
        }
        if (i == 1037) {
            return this.f;
        }
        switch (i) {
            case 1000:
                return this.e;
            case 1001:
                return this.h;
            case 1002:
                return this.n;
            case 1003:
                return this.q;
            case 1004:
                return this.v;
            case 1005:
                return this.w;
            case 1006:
                return this.o;
            default:
                switch (i) {
                    case 1009:
                        return this.j;
                    case 1010:
                        return this.m;
                    case 1011:
                        return this.x;
                    case 1012:
                        return this.y;
                    default:
                        switch (i) {
                            case 1014:
                                return this.i;
                            case 1015:
                                return this.B;
                            case 1016:
                                return this.A;
                            case 1017:
                                return this.u;
                            case 1018:
                                return this.t;
                            case 1019:
                                return this.C;
                            default:
                                switch (i) {
                                    case 1022:
                                        return this.p;
                                    case 1023:
                                        return this.E;
                                    case 1024:
                                        return this.D;
                                    default:
                                        switch (i) {
                                            case 1026:
                                                return this.l;
                                            case 1027:
                                                return this.F;
                                            case 1028:
                                                return this.G;
                                            default:
                                                switch (i) {
                                                    case 1030:
                                                        return this.g;
                                                    case 1031:
                                                        return this.H;
                                                    case 1032:
                                                        return this.k;
                                                    case 1033:
                                                        return this.r;
                                                    case 1034:
                                                        return this.s;
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String p() {
        return this.a.getPackageName();
    }

    private boolean q() {
        PackageInfo packageInfo;
        try {
            Context context = this.a;
            if (context != null && (packageInfo = context.getPackageManager().getPackageInfo(W, 0)) != null && packageInfo.versionCode >= 7) {
                Log.i("bletest", "can apply card with risk info");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(ITsmActivityCallback iTsmActivityCallback, String str, String str2, Bundle bundle) {
        if (iTsmActivityCallback != null) {
            try {
                iTsmActivityCallback.StartActivity(str, str2, bundle);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(ITsmCallback iTsmCallback, Bundle bundle) {
        if (iTsmCallback == null || bundle == null) {
            return;
        }
        try {
            String string = bundle.getString("errorCode");
            if ("10000".equals(string) || ResultCode.FAKE_ERROR_DUPLICATE_ACTIVE.equals(string)) {
                iTsmCallback.onResult(bundle);
            } else {
                iTsmCallback.onError(string, bundle.getString(Constant.KEY_ERROR_DESC));
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private void t(int i, RequestParams requestParams, ITsmCallback iTsmCallback) throws RemoteException {
        new SessionKeyReExchange(Z, i, requestParams, iTsmCallback).reGetPubKey();
    }

    private void u(int i, RequestParams requestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) throws RemoteException {
        new SessionKeyReExchange(Z, i, requestParams, iTsmCallback, iTsmProgressCallback).reGetPubKey();
    }

    private void v(int i, SafetyKeyboardRequestParams safetyKeyboardRequestParams, int i2, OnSafetyKeyboardCallback onSafetyKeyboardCallback, Context context) throws RemoteException {
        new SessionKeyReExchange(Z, i, safetyKeyboardRequestParams, i2, onSafetyKeyboardCallback, context).reGetPubKey();
    }

    private void w(int i, Object obj, ITsmCallback iTsmCallback) throws RemoteException {
        new SessionKeyReExchange(Z, i, obj, iTsmCallback).reGetPubKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        CopyOnWriteArrayList<UPTsmConnectionListener> copyOnWriteArrayList = a0;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        for (UPTsmConnectionListener uPTsmConnectionListener : a0) {
            if (uPTsmConnectionListener != null) {
                uPTsmConnectionListener.onTsmConnected();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        CopyOnWriteArrayList<UPTsmConnectionListener> copyOnWriteArrayList = a0;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        for (UPTsmConnectionListener uPTsmConnectionListener : a0) {
            if (uPTsmConnectionListener != null) {
                uPTsmConnectionListener.onTsmDisconnected();
            }
        }
    }

    private void z() {
        ServiceConnection serviceConnection = this.b;
        if (serviceConnection == null || !this.d) {
            return;
        }
        this.a.unbindService(serviceConnection);
        this.d = false;
    }

    public int UniteAppDownload(UniteAppDownloadRequestParams uniteAppDownloadRequestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) throws RemoteException {
        int iUniteAppDownload = -3;
        if (uniteAppDownloadRequestParams == null || iTsmCallback == null || iTsmProgressCallback == null) {
            return -3;
        }
        UniteAppDownloadRequestParams uniteAppDownloadRequestParams2 = new UniteAppDownloadRequestParams();
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            u(34, uniteAppDownloadRequestParams, iTsmCallback, iTsmProgressCallback);
            return 0;
        }
        String mPanId = uniteAppDownloadRequestParams.getMPanId();
        if (!TextUtils.isEmpty(mPanId)) {
            uniteAppDownloadRequestParams2.setMPanId(IUPJniInterface.aeM(mPanId));
            iUniteAppDownload = this.c.uniteAppDownload(uniteAppDownloadRequestParams2, iTsmCallback, iTsmProgressCallback);
            if (-2 == iUniteAppDownload) {
                u(34, uniteAppDownloadRequestParams, iTsmCallback, iTsmProgressCallback);
                return 0;
            }
        }
        return iUniteAppDownload;
    }

    public void addConnectionListener(UPTsmConnectionListener uPTsmConnectionListener) {
        if (uPTsmConnectionListener != null) {
            a0.add(uPTsmConnectionListener);
        }
    }

    public boolean bind() {
        return l();
    }

    public int bleKeyExchange(BleKeyExchangeRequestParams bleKeyExchangeRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        Log.i(Constant.ADDON_LOG_TAG, "=====进入addon bleKeyExchange");
        if (bleKeyExchangeRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        BleKeyExchangeRequestParams bleKeyExchangeRequestParams2 = new BleKeyExchangeRequestParams();
        this.F.put(p(), iTsmCallback);
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            t(29, bleKeyExchangeRequestParams, iTsmCallback);
            return 0;
        }
        AppID appID = bleKeyExchangeRequestParams.getAppID();
        if (appID != null) {
            String appAid = appID.getAppAid();
            String appVersion = appID.getAppVersion();
            if (!TextUtils.isEmpty(appAid) && !TextUtils.isEmpty(appVersion)) {
                bleKeyExchangeRequestParams.setAppID(new AppID(IUPJniInterface.aeM(appAid), IUPJniInterface.aeM(appVersion)));
            }
        }
        Log.i(Constant.ADDON_LOG_TAG, "=====准备进入mITsmService bleKeyExchange");
        bleKeyExchangeRequestParams2.setAppID(bleKeyExchangeRequestParams.getAppID());
        int iBleKeyExchange = this.c.bleKeyExchange(bleKeyExchangeRequestParams2, new TsmCallback(1027));
        Message message = new Message();
        message.what = 1027;
        message.obj = Integer.valueOf(iTsmCallback.hashCode());
        this.T.sendMessageDelayed(message, 50000L);
        if (-2 != iBleKeyExchange) {
            return iBleKeyExchange;
        }
        bleKeyExchangeRequestParams.setAppID(appID);
        t(29, bleKeyExchangeRequestParams, iTsmCallback);
        return 0;
    }

    public int checkBinCode(CheckBinRequestParams checkBinRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        CheckBinRequestParams checkBinRequestParams2 = new CheckBinRequestParams();
        if (checkBinRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        Log.i(Constant.ADDON_LOG_TAG, "===进入checkbincode");
        this.g.put(p(), iTsmCallback);
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            t(32, checkBinRequestParams, iTsmCallback);
            return 0;
        }
        if (!TextUtils.isEmpty(checkBinRequestParams.getSPan())) {
            checkBinRequestParams2.setSPan(IUPJniInterface.aeM(checkBinRequestParams.getSPan()));
            checkBinRequestParams.setSPan(IUPJniInterface.aeM(checkBinRequestParams.getSPan()));
        }
        int iCheckBinCode = this.c.checkBinCode(checkBinRequestParams2, new TsmCallback(1030));
        Message message = new Message();
        message.what = 1030;
        message.obj = Integer.valueOf(iTsmCallback.hashCode());
        this.T.sendMessageDelayed(message, 90000L);
        if (-2 != iCheckBinCode) {
            return iCheckBinCode;
        }
        t(32, checkBinRequestParams, iTsmCallback);
        return 0;
    }

    public synchronized int clearEncryptData(int i) throws RemoteException {
        if (i < 2000 || i > 2001) {
            return -3;
        }
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            v(43, null, i, null, null);
            return 0;
        }
        try {
            int iClearEncryptData = this.c.clearEncryptData(i);
            if (-2 != iClearEncryptData) {
                return iClearEncryptData;
            }
            v(43, null, i, null, null);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RemoteException();
        }
    }

    public int encryptData(EncryptDataRequestParams encryptDataRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        EncryptDataRequestParams encryptDataRequestParams2 = new EncryptDataRequestParams();
        if (encryptDataRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        this.E.put(p(), iTsmCallback);
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            t(26, encryptDataRequestParams, iTsmCallback);
            return 0;
        }
        ArrayList arrayList = (ArrayList) encryptDataRequestParams.getData();
        if (arrayList != null) {
            int size = arrayList.size();
            if (size == 0) {
                return -3;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < size; i++) {
                String str = (String) arrayList.get(i);
                if (!TextUtils.isEmpty(str)) {
                    arrayList2.add(IUPJniInterface.aeM(str));
                }
            }
            encryptDataRequestParams.setData(arrayList2);
        }
        encryptDataRequestParams2.setData(encryptDataRequestParams.getData());
        int iEncryptData = this.c.encryptData(encryptDataRequestParams2, new TsmCallback(1023));
        Message message = new Message();
        message.what = 1023;
        message.obj = Integer.valueOf(iTsmCallback.hashCode());
        this.T.sendMessageDelayed(message, 35000L);
        if (-2 != iEncryptData) {
            return iEncryptData;
        }
        encryptDataRequestParams.setData(arrayList);
        t(26, encryptDataRequestParams, iTsmCallback);
        return 0;
    }

    public int exchangeKey(ExchangeKeyRequestParams exchangeKeyRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        if (exchangeKeyRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        ITsmService iTsmService = this.c;
        if (iTsmService != null) {
            return iTsmService.exchangeKey(exchangeKeyRequestParams, iTsmCallback);
        }
        return -1;
    }

    public synchronized int executeCmd(ExecuteCmdRequestParams executeCmdRequestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) throws RemoteException {
        if (executeCmdRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        ExecuteCmdRequestParams executeCmdRequestParams2 = new ExecuteCmdRequestParams();
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            u(28, executeCmdRequestParams, iTsmCallback, iTsmProgressCallback);
            return 0;
        }
        String ssid = executeCmdRequestParams.getSsid();
        String sign = executeCmdRequestParams.getSign();
        if (!TextUtils.isEmpty(ssid)) {
            executeCmdRequestParams2.setSsid(IUPJniInterface.aeM(ssid));
        }
        if (!TextUtils.isEmpty(sign)) {
            executeCmdRequestParams2.setSign(IUPJniInterface.aeM(sign));
        }
        try {
            int iExecuteCmd = this.c.executeCmd(executeCmdRequestParams2, iTsmCallback, iTsmProgressCallback);
            if (-2 != iExecuteCmd) {
                return iExecuteCmd;
            }
            u(28, executeCmdRequestParams, iTsmCallback, iTsmProgressCallback);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RemoteException();
        }
    }

    public int getActiveCode(GetActiveCodeRequestParams getActiveCodeRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int activeCode = -3;
        if (getActiveCodeRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        GetActiveCodeRequestParams getActiveCodeRequestParams2 = new GetActiveCodeRequestParams();
        this.r.put(p(), iTsmCallback);
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            t(37, getActiveCodeRequestParams, iTsmCallback);
            return 0;
        }
        String mPanId = getActiveCodeRequestParams.getMPanId();
        String activeType = getActiveCodeRequestParams.getActiveType();
        if (!TextUtils.isEmpty(mPanId)) {
            getActiveCodeRequestParams2.setMPanId(IUPJniInterface.aeM(mPanId));
            if (!TextUtils.isEmpty(activeType)) {
                getActiveCodeRequestParams2.setActiveType(IUPJniInterface.aeM(activeType));
                activeCode = this.c.getActiveCode(getActiveCodeRequestParams2, new TsmCallback(1033));
                Message message = new Message();
                message.what = 1033;
                message.obj = Integer.valueOf(iTsmCallback.hashCode());
                this.T.sendMessageDelayed(message, 50000L);
                if (-2 == activeCode) {
                    t(37, getActiveCodeRequestParams, iTsmCallback);
                    return 0;
                }
            }
        }
        return activeCode;
    }

    public int getCardInfo(String[] strArr, ITsmCallback iTsmCallback) throws RemoteException {
        int length = strArr.length;
        if (length == 0) {
            return -3;
        }
        int i = 0;
        while (i < length && strArr[i] == null) {
            i++;
        }
        this.D.put(p(), iTsmCallback);
        if (i == length) {
            return -3;
        }
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            w(13, strArr, iTsmCallback);
            return 0;
        }
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr[i2] == null) {
                strArr2[i2] = strArr[i2];
            } else {
                strArr2[i2] = IUPJniInterface.aeM(strArr[i2]);
            }
        }
        int cardInfo = this.c.getCardInfo(strArr2, new TsmCallback(1024));
        Message message = new Message();
        message.what = 1024;
        message.obj = Integer.valueOf(iTsmCallback.hashCode());
        this.T.sendMessageDelayed(message, 65000L);
        if (-2 != cardInfo) {
            return cardInfo;
        }
        w(13, strArr, iTsmCallback);
        return 0;
    }

    public Context getContext() {
        return this.a;
    }

    public int getDefaultCard(ITsmCallback iTsmCallback) throws RemoteException {
        if (iTsmCallback == null) {
            return -3;
        }
        this.B.put(p(), iTsmCallback);
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            t(20, null, iTsmCallback);
            return 0;
        }
        int defaultCard = this.c.getDefaultCard(new TsmCallback(1015));
        Log.i(Constant.ADDON_LOG_TAG, "获取默认卡addon");
        Message message = new Message();
        message.what = 1015;
        message.obj = Integer.valueOf(iTsmCallback.hashCode());
        this.T.sendMessageDelayed(message, 35000L);
        if (-2 != defaultCard) {
            return defaultCard;
        }
        t(20, null, iTsmCallback);
        return 0;
    }

    public synchronized int getEncryptData(GetEncryptDataRequestParams getEncryptDataRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        if (iTsmCallback == null || getEncryptDataRequestParams == null) {
            return -3;
        }
        int type = getEncryptDataRequestParams.getType();
        String pan = getEncryptDataRequestParams.getPan();
        if (type >= 2000 && type <= 2001) {
            if (type == 2000 && TextUtils.isEmpty(pan)) {
                return -3;
            }
            if (this.c == null) {
                return -1;
            }
            if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
                t(42, getEncryptDataRequestParams, iTsmCallback);
                return 0;
            }
            GetEncryptDataRequestParams getEncryptDataRequestParams2 = new GetEncryptDataRequestParams();
            if (type == 2000) {
                getEncryptDataRequestParams2.setPan(IUPJniInterface.aeM(pan));
            }
            getEncryptDataRequestParams2.setType(type);
            this.I.put(p(), iTsmCallback);
            try {
                int encryptData = this.c.getEncryptData(getEncryptDataRequestParams2, new TsmCallback(42));
                if (encryptData != 0) {
                    this.I.remove(p());
                }
                if (-2 != encryptData) {
                    return encryptData;
                }
                t(42, getEncryptDataRequestParams, iTsmCallback);
                return 0;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RemoteException();
            }
        }
        return -3;
    }

    public int getListenerCount() {
        CopyOnWriteArrayList<UPTsmConnectionListener> copyOnWriteArrayList = a0;
        if (copyOnWriteArrayList != null) {
            return copyOnWriteArrayList.size();
        }
        return 0;
    }

    public int getPubKey(ITsmCallback iTsmCallback) throws RemoteException {
        if (iTsmCallback == null) {
            return -3;
        }
        ITsmService iTsmService = this.c;
        if (iTsmService != null) {
            return iTsmService.getPubKey(iTsmCallback);
        }
        return -1;
    }

    public int getSupportedCardTypeList(ITsmCallback iTsmCallback) throws RemoteException {
        Log.i(Constant.ADDON_LOG_TAG, "===进入getSupportedCardTypeList");
        this.f.put(p(), iTsmCallback);
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            t(39, null, iTsmCallback);
            return 0;
        }
        int supportedCardTypeList = this.c.getSupportedCardTypeList(new TsmCallback(1037));
        Message message = new Message();
        message.what = 1037;
        message.obj = Integer.valueOf(iTsmCallback.hashCode());
        this.T.sendMessageDelayed(message, 50000L);
        if (-2 != supportedCardTypeList) {
            return supportedCardTypeList;
        }
        t(39, null, iTsmCallback);
        return 0;
    }

    public int getUniteAppList(GetUniteAppListRequestParams getUniteAppListRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        if (getUniteAppListRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        GetUniteAppListRequestParams getUniteAppListRequestParams2 = new GetUniteAppListRequestParams();
        this.k.put(p(), iTsmCallback);
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            t(35, getUniteAppListRequestParams, iTsmCallback);
            return 0;
        }
        String[] status = getUniteAppListRequestParams.getStatus();
        if (status != null) {
            int length = status.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                if (!TextUtils.isEmpty(status[i])) {
                    strArr[i] = IUPJniInterface.aeM(status[i]);
                }
            }
            getUniteAppListRequestParams2.setStatus(strArr);
        } else {
            getUniteAppListRequestParams2.setStatus(new String[0]);
        }
        int uniteAppList = this.c.getUniteAppList(getUniteAppListRequestParams2, new TsmCallback(1032));
        Message message = new Message();
        message.what = 1032;
        message.obj = Integer.valueOf(iTsmCallback.hashCode());
        this.T.sendMessageDelayed(message, 65000L);
        if (-2 != uniteAppList) {
            return uniteAppList;
        }
        t(35, getUniteAppListRequestParams, iTsmCallback);
        return 0;
    }

    public synchronized int hideKeyboard() throws RemoteException {
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            v(44, null, 0, null, null);
            return 0;
        }
        try {
            int iHideKeyboard = this.c.hideKeyboard();
            if (-2 != iHideKeyboard) {
                return iHideKeyboard;
            }
            v(44, null, 0, null, null);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RemoteException();
        }
    }

    public int init(InitRequestParams initRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        InitRequestParams initRequestParams2 = new InitRequestParams();
        if (initRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        Log.i(Constant.ADDON_LOG_TAG, "===进入Addon  init");
        this.e.put(p(), iTsmCallback);
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            t(27, initRequestParams, iTsmCallback);
            return 0;
        }
        Log.i(Constant.ADDON_LOG_TAG, "===下一步进入Stub  init");
        initRequestParams2.setType(initRequestParams.getType());
        int iInit = this.c.init(initRequestParams2, new TsmCallback(1000));
        Message message = new Message();
        message.what = 1000;
        message.obj = Integer.valueOf(iTsmCallback.hashCode());
        this.T.sendMessageDelayed(message, 90000L);
        if (-2 != iInit) {
            return iInit;
        }
        t(27, initRequestParams, iTsmCallback);
        return 0;
    }

    public boolean isConnected() {
        return this.d;
    }

    public int openUniteCardApplyActivity(OpenUniteCardApplyActivityWithRiskInfoRequestParams openUniteCardApplyActivityWithRiskInfoRequestParams, Context context, ITsmCallback iTsmCallback) throws RemoteException {
        if (openUniteCardApplyActivityWithRiskInfoRequestParams == null) {
            return -3;
        }
        if (this.c == null) {
            return -1;
        }
        this.H.put(p(), iTsmCallback);
        this.K.put(p(), new TsmActivityListener(context));
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            t(33, openUniteCardApplyActivityWithRiskInfoRequestParams, null);
            return 0;
        }
        String span = openUniteCardApplyActivityWithRiskInfoRequestParams.getSpan();
        String tCUrl = openUniteCardApplyActivityWithRiskInfoRequestParams.getTCUrl();
        String bankName = openUniteCardApplyActivityWithRiskInfoRequestParams.getBankName();
        String cardType = openUniteCardApplyActivityWithRiskInfoRequestParams.getCardType();
        int captureMethod = openUniteCardApplyActivityWithRiskInfoRequestParams.getCaptureMethod();
        String chntUsrId = openUniteCardApplyActivityWithRiskInfoRequestParams.getChntUsrId();
        String fullDeviceNumber = openUniteCardApplyActivityWithRiskInfoRequestParams.getFullDeviceNumber();
        ApplyActivityStyle applyActivityStyle = openUniteCardApplyActivityWithRiskInfoRequestParams.getmApplyActivityStyle();
        OpenUniteCardApplyActivityRequestParams openUniteCardApplyActivityRequestParams = new OpenUniteCardApplyActivityRequestParams();
        OpenUniteCardApplyActivityWithRiskInfoRequestParams openUniteCardApplyActivityWithRiskInfoRequestParams2 = new OpenUniteCardApplyActivityWithRiskInfoRequestParams();
        if (span == null || TextUtils.isEmpty(span)) {
            return -3;
        }
        openUniteCardApplyActivityRequestParams.setSpan(IUPJniInterface.aeM(span));
        openUniteCardApplyActivityWithRiskInfoRequestParams2.setSpan(IUPJniInterface.aeM(span));
        if (tCUrl == null || TextUtils.isEmpty(tCUrl)) {
            return -3;
        }
        openUniteCardApplyActivityRequestParams.setTCUrl(IUPJniInterface.aeM(tCUrl));
        openUniteCardApplyActivityWithRiskInfoRequestParams2.setTCUrl(IUPJniInterface.aeM(tCUrl));
        if (bankName == null || TextUtils.isEmpty(bankName)) {
            return -3;
        }
        openUniteCardApplyActivityRequestParams.setBankName(IUPJniInterface.aeM(bankName));
        openUniteCardApplyActivityWithRiskInfoRequestParams2.setBankName(IUPJniInterface.aeM(bankName));
        if (cardType == null || TextUtils.isEmpty(cardType)) {
            return -3;
        }
        openUniteCardApplyActivityRequestParams.setCardType(IUPJniInterface.aeM(cardType));
        openUniteCardApplyActivityWithRiskInfoRequestParams2.setCardType(IUPJniInterface.aeM(cardType));
        if (applyActivityStyle != null) {
            openUniteCardApplyActivityRequestParams.setmApplyActivityStyle(applyActivityStyle);
            openUniteCardApplyActivityWithRiskInfoRequestParams2.setmApplyActivityStyle(applyActivityStyle);
        }
        openUniteCardApplyActivityWithRiskInfoRequestParams2.setCaptureMethod(captureMethod);
        if (!TextUtils.isEmpty(chntUsrId)) {
            openUniteCardApplyActivityWithRiskInfoRequestParams2.setChntUsrId(IUPJniInterface.aeM(chntUsrId));
        }
        if (!TextUtils.isEmpty(fullDeviceNumber)) {
            openUniteCardApplyActivityWithRiskInfoRequestParams2.setFullDeviceNumber(IUPJniInterface.aeM(fullDeviceNumber));
        }
        int iOpenUniteCardApplyActivity = !q() ? this.c.openUniteCardApplyActivity(openUniteCardApplyActivityRequestParams, new TsmActivityCallback(1031), new TsmCallback(1031)) : this.c.openUniteCardApplyActivityWithRiskInfo(openUniteCardApplyActivityWithRiskInfoRequestParams2, new TsmActivityCallback(1031), new TsmCallback(1031));
        if (-2 != iOpenUniteCardApplyActivity) {
            return iOpenUniteCardApplyActivity;
        }
        t(33, openUniteCardApplyActivityWithRiskInfoRequestParams, null);
        return 0;
    }

    public void removeConnectionListener(UPTsmConnectionListener uPTsmConnectionListener) {
        if (uPTsmConnectionListener != null) {
            a0.remove(uPTsmConnectionListener);
        }
    }

    public int setDefaultCard(String str, ITsmCallback iTsmCallback) throws RemoteException {
        if (TextUtils.isEmpty(str)) {
            return -3;
        }
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            w(14, str, iTsmCallback);
            return 0;
        }
        int defaultCard = this.c.setDefaultCard(IUPJniInterface.aeM(str), iTsmCallback);
        Message message = new Message();
        message.what = 1016;
        message.obj = Integer.valueOf(iTsmCallback.hashCode());
        this.T.sendMessageDelayed(message, 35000L);
        if (-2 != defaultCard) {
            return defaultCard;
        }
        w(14, str, iTsmCallback);
        return 0;
    }

    public synchronized int setSafetyKeyboardBitmap(SafetyKeyboardRequestParams safetyKeyboardRequestParams) throws RemoteException {
        if (safetyKeyboardRequestParams == null) {
            return -3;
        }
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            t(40, safetyKeyboardRequestParams, null);
            return 0;
        }
        try {
            int safetyKeyboardBitmap = this.c.setSafetyKeyboardBitmap(safetyKeyboardRequestParams);
            if (-2 != safetyKeyboardBitmap) {
                return safetyKeyboardBitmap;
            }
            t(40, safetyKeyboardRequestParams, null);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RemoteException();
        }
    }

    public synchronized int showSafetyKeyboard(SafetyKeyboardRequestParams safetyKeyboardRequestParams, int i, OnSafetyKeyboardCallback onSafetyKeyboardCallback, Context context) throws RemoteException {
        if (safetyKeyboardRequestParams == null || i < 2000 || i > 2001) {
            return -3;
        }
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            v(41, safetyKeyboardRequestParams, i, onSafetyKeyboardCallback, context);
            return 0;
        }
        this.J.put(p(), new TsmActivityListener(context));
        try {
            int iShowSafetyKeyboard = this.c.showSafetyKeyboard(safetyKeyboardRequestParams, i, onSafetyKeyboardCallback, new TsmActivityCallback(Constant.CALLBACK_SHOW_SAFETYKEYBOARD));
            if (iShowSafetyKeyboard != 0) {
                this.J.remove(p());
            }
            if (-2 != iShowSafetyKeyboard) {
                return iShowSafetyKeyboard;
            }
            v(41, safetyKeyboardRequestParams, i, onSafetyKeyboardCallback, context);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RemoteException();
        }
    }

    public void unbind() throws RemoteException {
        Log.i(Constant.ADDON_LOG_TAG, "开始解绑蓝牙服务");
        ITsmService iTsmService = this.c;
        if (iTsmService != null) {
            iTsmService.unbindBleService();
        }
        z();
    }

    public int uniteAppDelete(UniteAppDeleteRequestParams uniteAppDeleteRequestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) throws RemoteException {
        int iUniteAppDelete = -3;
        if (uniteAppDeleteRequestParams == null || iTsmCallback == null || iTsmProgressCallback == null) {
            return -3;
        }
        UniteAppDeleteRequestParams uniteAppDeleteRequestParams2 = new UniteAppDeleteRequestParams();
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            u(36, uniteAppDeleteRequestParams, iTsmCallback, iTsmProgressCallback);
            return 0;
        }
        String mPanId = uniteAppDeleteRequestParams.getMPanId();
        if (!TextUtils.isEmpty(mPanId)) {
            uniteAppDeleteRequestParams2.setMPanId(IUPJniInterface.aeM(mPanId));
            iUniteAppDelete = this.c.uniteAppDelete(uniteAppDeleteRequestParams2, iTsmCallback, iTsmProgressCallback);
            if (-2 == iUniteAppDelete) {
                u(36, uniteAppDeleteRequestParams, iTsmCallback, iTsmProgressCallback);
                return 0;
            }
        }
        return iUniteAppDelete;
    }

    public int uniteCardActive(UniteCardActiveRequestParams uniteCardActiveRequestParams, ITsmCallback iTsmCallback) throws RemoteException {
        int iUniteCardActive = -3;
        if (uniteCardActiveRequestParams == null || iTsmCallback == null) {
            return -3;
        }
        UniteCardActiveRequestParams uniteCardActiveRequestParams2 = new UniteCardActiveRequestParams();
        this.s.put(p(), iTsmCallback);
        if (this.c == null) {
            return -1;
        }
        if (!IUPJniInterface.acSKV(this.a.getPackageName())) {
            t(38, uniteCardActiveRequestParams, iTsmCallback);
            return 0;
        }
        String mPanId = uniteCardActiveRequestParams.getMPanId();
        String activeCode = uniteCardActiveRequestParams.getActiveCode();
        if (!TextUtils.isEmpty(mPanId)) {
            uniteCardActiveRequestParams2.setMPanId(IUPJniInterface.aeM(mPanId));
            if (!TextUtils.isEmpty(activeCode)) {
                uniteCardActiveRequestParams2.setActiveCode(IUPJniInterface.aeM(activeCode));
                iUniteCardActive = this.c.uniteCardActive(uniteCardActiveRequestParams2, new TsmCallback(1034));
                Message message = new Message();
                message.what = 1034;
                message.obj = Integer.valueOf(iTsmCallback.hashCode());
                this.T.sendMessageDelayed(message, 50000L);
                if (-2 == iUniteCardActive) {
                    t(38, uniteCardActiveRequestParams, iTsmCallback);
                    return 0;
                }
            }
        }
        return iUniteCardActive;
    }
}

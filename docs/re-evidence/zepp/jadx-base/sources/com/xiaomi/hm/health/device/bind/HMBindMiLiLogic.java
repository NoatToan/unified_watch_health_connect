package com.xiaomi.hm.health.device.bind;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.HMConfig;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMAmazfitDevice;
import com.xiaomi.hm.health.bt.device.HMBMDevice;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMBoltClassicDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;
import com.xiaomi.hm.health.bt.scan.AdvData;
import com.xiaomi.hm.health.bt.scan.BleScanCenter;
import com.xiaomi.hm.health.bt.scan.BleScanOption;
import com.xiaomi.hm.health.bt.scan.DeviceInfoScanner;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.amazfit_watch.HMSelectWatchActivityNew;
import com.xiaomi.hm.health.device.bind.HMBindMiLiLogic;
import com.xiaomi.hm.health.device.bind.analytic.BindAnalytic;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import com.xiaomi.hm.health.device.bind.analytic.events.AuthSuccess;
import com.xiaomi.hm.health.device.bind.analytic.events.BindEvent;
import com.xiaomi.hm.health.device.bind.analytic.events.BindFail;
import com.xiaomi.hm.health.device.bind.analytic.events.BindStart;
import com.xiaomi.hm.health.device.bind.analytic.events.Confirm;
import com.xiaomi.hm.health.device.bind.analytic.events.ConnectSuccess;
import com.xiaomi.hm.health.device.bind.analytic.events.GetDeviceInfoSuccess;
import com.xiaomi.hm.health.device.bind.analytic.events.QuerySuccess;
import com.xiaomi.hm.health.device.bind.analytic.events.ScanSuccess;
import com.xiaomi.hm.health.device.bind.analytic.events.SetTimeSuccess;
import com.xiaomi.hm.health.device.bind.analytic.events.WaitConfirm;
import com.xiaomi.hm.health.device.callback.MyAuthCallback;
import com.xiaomi.hm.health.device.classic_scan.TreadmillClassicScanCenter;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.device.webapi.device.HMWebBindInfo;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import defpackage.no2;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONObject;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes20.dex */
public class HMBindMiLiLogic extends HMBindBaseLogic {
    private static final int C = 0;
    private static final int D = 1;
    private static final int E = -1;
    private static final int F = -2;
    private static final int G = 20000;
    private static final int H = 10000;
    private static final int I = 5;
    private boolean A;
    private IHMAuthCallback B;
    private BleScanOption l;
    private BleScanOption m;
    private BleScanOption n;
    private AdvData o;
    private int p;
    private final ArrayList<String> q;
    private final HashMap<String, AdvData> r;
    private BluetoothDevice s;
    private HMDeviceSource t;
    private int u;
    private final int v;
    private WeakReference<AppCompatActivity> w;
    private final SupportNameApi x;
    private final BroadcastReceiver y;
    private String z;

    public interface IBindMiliListener extends HMBindBaseLogic.IBindListener {
        void onBindDenied();

        void onBindMiLiKnock(HMDeviceSource hMDeviceSource);

        void onBindMiLiKnockSuccess(HMDeviceSource hMDeviceSource);
    }

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                if (intExtra == 10 || intExtra == 13) {
                    HMBindMiLiLogic.this.analytic(new BindFail(ConstantKt.STAGE_CONNECT, ConstantKt.CONNECT_FAIL_REASON_BLUETOOTH_OFF));
                }
            }
        }
    }

    public class b extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ AtomicReference a;

        public b(AtomicReference atomicReference) {
            this.a = atomicReference;
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            super.onCancel(i);
            this.a.set(HMBindBaseLogic.BindError.NET_ERROR);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            super.onCompleted();
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            super.onError(th);
            this.a.set(HMBindBaseLogic.BindError.NET_ERROR);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            this.a.set(HMBindBaseLogic.BindError.NET_ERROR);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            int i;
            if (!webResponse.success()) {
                this.a.set(HMBindBaseLogic.BindError.NET_ERROR);
                return;
            }
            String strX0 = null;
            try {
                JSONObject jSONObject = new JSONObject(webResponse.data);
                i = jSONObject.getInt("status");
                try {
                    strX0 = jSONObject.getString("nickname");
                } catch (Exception e) {
                    e = e;
                    HMLog.d(HMBindMiLiLogic.this.z, e.toString(), new Object[0]);
                }
            } catch (Exception e2) {
                e = e2;
                i = 0;
            }
            if (!TextUtils.isEmpty(strX0) && strX0.length() > 5) {
                strX0 = HMBindMiLiLogic.this.x0(strX0);
            }
            if (i == -2) {
                this.a.set(HMBindMiLiLogic.this.r.size() > 1 ? HMBindBaseLogic.BindError.MORE_DEVICES : HMBindBaseLogic.BindError.HAS_BOUND.setNickName(strX0));
            } else if (i == -1) {
                this.a.set(HMBindBaseLogic.BindError.HAS_DEVICE);
            } else if (i != 1) {
                this.a.set(HMBindBaseLogic.BindError.NET_ERROR);
            }
        }
    }

    public class c extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ BluetoothDevice a;

        public c(BluetoothDevice bluetoothDevice) {
            this.a = bluetoothDevice;
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            super.onCancel(i);
            HMBindMiLiLogic.this.handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
            HMBindMiLiLogic.this.analytic(new BindFail(ConstantKt.STAGE_QUERY, ConstantKt.QUERY_FAIL_ON_CANCEL + i));
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            super.onCompleted();
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            super.onError(th);
            HMBindMiLiLogic.this.handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
            HMBindMiLiLogic.this.analytic(new BindFail(ConstantKt.STAGE_QUERY, ConstantKt.QUERY_FAIL_ON_FAILURE + th.toString()));
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            HMBindMiLiLogic.this.handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
            StringBuilder sb = new StringBuilder();
            if (hMHttpResponseData != null) {
                sb.append("code: ");
                sb.append(hMHttpResponseData.getStatusCode());
                sb.append("response: ");
                sb.append(hMHttpResponseData.getResponseString());
            }
            HMBindMiLiLogic.this.analytic(new BindFail(ConstantKt.STAGE_QUERY, ConstantKt.QUERY_FAIL_ON_ERROR + ((Object) sb)));
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            int i;
            if (!webResponse.success()) {
                HMBindMiLiLogic.this.analytic(new BindFail(ConstantKt.STAGE_QUERY, ConstantKt.QUERY_FAIL_RESPONSE_CODE + webResponse.code));
                HMBindMiLiLogic.this.handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
                return;
            }
            String strX0 = null;
            try {
                JSONObject jSONObject = new JSONObject(webResponse.data);
                i = jSONObject.getInt("status");
                try {
                    strX0 = jSONObject.getString("nickname");
                } catch (Exception e) {
                    e = e;
                    HMLog.d(HMBindMiLiLogic.this.z, e.toString(), new Object[0]);
                }
            } catch (Exception e2) {
                e = e2;
                i = 0;
            }
            if (!TextUtils.isEmpty(strX0) && strX0.length() > 5) {
                strX0 = HMBindMiLiLogic.this.x0(strX0);
            }
            if (i != 1) {
                HMBindMiLiLogic.this.analytic(new BindFail(ConstantKt.STAGE_QUERY, ConstantKt.QUERY_FAIL_STATUS_CODE + i));
            }
            if (i == -2) {
                HMDeviceSource hMDeviceSourceNameToSource = HMMiLiProDevice.nameToSource(GattUtils.getBluetoothDeviceName(HMBindMiLiLogic.this.s));
                if (HMDeviceSource.MILI_PRO != hMDeviceSourceNameToSource && !HMDeviceConfig.hasFeatureResetOnDevice(hMDeviceSourceNameToSource)) {
                    HMBindMiLiLogic hMBindMiLiLogic = HMBindMiLiLogic.this;
                    hMBindMiLiLogic.handleBindFailed(hMBindMiLiLogic.r.size() > 1 ? HMBindBaseLogic.BindError.MORE_DEVICES : HMBindBaseLogic.BindError.HAS_BOUND.setNickName(strX0));
                    return;
                } else if (HMBindMiLiLogic.this.G0(hMDeviceSourceNameToSource)) {
                    HMBindMiLiLogic.this.A0(this.a, hMDeviceSourceNameToSource);
                    return;
                } else {
                    HMBindMiLiLogic.this.handleBindFailed(HMBindBaseLogic.BindError.NEED_RESET.setDeviceSource(hMDeviceSourceNameToSource));
                    return;
                }
            }
            if (i == -1) {
                HMBindMiLiLogic.this.handleBindFailed(HMBindBaseLogic.BindError.HAS_DEVICE);
                return;
            }
            if (i != 1) {
                HMBindMiLiLogic.this.handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
                return;
            }
            if (HMBindMiLiLogic.this.mHasStop.get()) {
                return;
            }
            HMBindMiLiLogic.this.analytic(new QuerySuccess());
            HMBindMiLiLogic.this.mBleDevice = new HMMiLiProDevice(HMBindMiLiLogic.this.mContext, this.a);
            HMBindMiLiLogic hMBindMiLiLogic2 = HMBindMiLiLogic.this;
            hMBindMiLiLogic2.mBleDevice.setConnectionCallback(hMBindMiLiLogic2);
            HMBindMiLiLogic.this.mBleDevice.setAutoReconnect(false);
            HMBindMiLiLogic hMBindMiLiLogic3 = HMBindMiLiLogic.this;
            ((HMBaseBleDevice) hMBindMiLiLogic3.mBleDevice).setTinkerAuthCallback(hMBindMiLiLogic3);
            HMBindMiLiLogic hMBindMiLiLogic4 = HMBindMiLiLogic.this;
            hMBindMiLiLogic4.mBleDevice.setAuthCallback(hMBindMiLiLogic4.B);
            HMBindMiLiLogic hMBindMiLiLogic5 = HMBindMiLiLogic.this;
            hMBindMiLiLogic5.mBleDevice.setAuthInfo(new AuthInfo(hMBindMiLiLogic5.randomKey(), true));
            HMBindMiLiLogic.this.mBleDevice.create(true);
        }
    }

    public class d extends MyAuthCallback {
        public d() {
        }

        @Override // com.xiaomi.hm.health.device.callback.MyAuthCallback, com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback
        public void onAuthentication(HMAuthState hMAuthState) {
            if (hMAuthState.getInternalState() == 65) {
                ((IBindMiliListener) HMBindMiLiLogic.this.mListener).onBindDenied();
                return;
            }
            int state = hMAuthState.getState();
            if (state == 1) {
                HMBindMiLiLogic.this.handleBindFailed(HMBindBaseLogic.BindError.AUTH_FAILED);
                return;
            }
            if (state == 2) {
                HMBindMiLiLogic hMBindMiLiLogic = HMBindMiLiLogic.this;
                hMBindMiLiLogic.y0(hMBindMiLiLogic.t);
                return;
            }
            if (state == 3) {
                HMBindMiLiLogic hMBindMiLiLogic2 = HMBindMiLiLogic.this;
                hMBindMiLiLogic2.z0(hMBindMiLiLogic2.t);
            } else if (state == 4) {
                HMBindMiLiLogic.this.handleBindFailed(HMBindBaseLogic.BindError.AUTH_DENY);
            } else if (state == 10) {
                HMBindMiLiLogic.this.handleBindFailed(HMBindBaseLogic.BindError.SPORT_ON_GOING);
            } else {
                if (state != 11) {
                    return;
                }
                HMBindMiLiLogic.this.handleBindFailed(HMBindBaseLogic.BindError.USING_BY_OTHER_GUY);
            }
        }
    }

    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            a = iArr;
            try {
                iArr[Status.GATT_DISCONNECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Status.DISCOVERY_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Status.GATT_CONNECT_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Status.INIT_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Status.INIT_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Status.AUTH_PROTOCOL_SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[Status.SET_TIME_SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[Status.GET_DEVICE_INFO_SUCCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public HMBindMiLiLogic(Context context, int i, int i2) {
        super(context, i == 18 ? HMDeviceType.TREADMILL : HMDeviceType.MILI);
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = 20000;
        this.q = new ArrayList<>();
        this.r = new HashMap<>();
        this.s = null;
        this.t = null;
        this.x = this.supportNameApiLazy.getValue();
        this.y = new a();
        this.z = "HMBindMiliLogic";
        this.A = true;
        this.B = new d();
        this.z += hashCode();
        this.u = i;
        this.v = i2;
        if (GlobalConfig.get().isBuildMidong()) {
            C0(i);
        } else {
            D0(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(BluetoothDevice bluetoothDevice, final HMDeviceSource hMDeviceSource) {
        DeviceInfoScanner.scan(this.mContext, bluetoothDevice, new DeviceInfoScanner.IDeviceInfoScanCallback() { // from class: jo2
            @Override // com.xiaomi.hm.health.bt.scan.DeviceInfoScanner.IDeviceInfoScanCallback
            public final void onDeviceInfoObtained(ArrayList arrayList, DeviceInfo deviceInfo) {
                this.a.R0(hMDeviceSource, arrayList, deviceInfo);
            }
        });
    }

    private void B0() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.mContext.registerReceiver(this.y, intentFilter);
    }

    private void C0(int i) {
        switch (i) {
            case 6:
                m0(HMDeviceSource.OTHER_BM);
                break;
            case 7:
                m0(HMDeviceSource.MILI_DTH, HMDeviceSource.MILI_DTH_W);
                m0(HMDeviceSource.MILI_TONLESAP, HMDeviceSource.MILI_TONLESAP_O, HMDeviceSource.MILI_TONLESAP_OL);
                break;
            case 8:
                m0(HMDeviceSource.MILI_PYH);
                break;
            case 10:
                m0(HMDeviceSource.MILI_PEYTO, HMDeviceSource.MILI_PEYTO_L);
                break;
            case 11:
                HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_KESTREL;
                HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_KESTREL_L;
                HMDeviceSource hMDeviceSource3 = HMDeviceSource.MILI_ONYX;
                HMDeviceSource hMDeviceSource4 = HMDeviceSource.MILI_ONYX_W;
                HMDeviceSource hMDeviceSource5 = HMDeviceSource.MILI_CORSICA;
                HMDeviceSource hMDeviceSource6 = HMDeviceSource.MILI_CORSICA_W;
                HMDeviceSource hMDeviceSource7 = HMDeviceSource.MILI_OSPREY;
                HMDeviceSource hMDeviceSource8 = HMDeviceSource.MILI_OSPREY_W;
                HMDeviceSource hMDeviceSource9 = HMDeviceSource.MILI_OSPREY_C;
                HMDeviceSource hMDeviceSource10 = HMDeviceSource.MILI_LISBON;
                HMDeviceSource hMDeviceSource11 = HMDeviceSource.MILI_LISBON_W;
                HMDeviceSource hMDeviceSource12 = HMDeviceSource.MILI_LINCS;
                HMDeviceSource hMDeviceSource13 = HMDeviceSource.MILI_LINCS_W;
                HMDeviceSource hMDeviceSource14 = HMDeviceSource.MILI_NEWTON;
                HMDeviceSource hMDeviceSource15 = HMDeviceSource.MILI_NEWTON_W;
                HMDeviceSource hMDeviceSource16 = HMDeviceSource.MILI_PRAGUE;
                HMDeviceSource hMDeviceSource17 = HMDeviceSource.MILI_PRAGUE_W;
                HMDeviceSource hMDeviceSource18 = HMDeviceSource.MILI_VOLGA;
                HMDeviceSource hMDeviceSource19 = HMDeviceSource.MILI_VOLGA_W;
                HMDeviceSource hMDeviceSource20 = HMDeviceSource.MILI_HAMBURG;
                HMDeviceSource hMDeviceSource21 = HMDeviceSource.MILI_BONN;
                HMDeviceSource hMDeviceSource22 = HMDeviceSource.MILI_HAMBURG_W;
                HMDeviceSource hMDeviceSource23 = HMDeviceSource.MILI_BONN_W;
                HMDeviceSource hMDeviceSource24 = HMDeviceSource.MILI_MADRID;
                HMDeviceSource hMDeviceSource25 = HMDeviceSource.MILI_MADRID_W;
                HMDeviceSource hMDeviceSource26 = HMDeviceSource.MILI_ZURICH;
                HMDeviceSource hMDeviceSource27 = HMDeviceSource.MILI_ZURICH_W;
                HMDeviceSource hMDeviceSource28 = HMDeviceSource.MILI_VERONA;
                HMDeviceSource hMDeviceSource29 = HMDeviceSource.MILI_VERONA_W;
                HMDeviceSource hMDeviceSource30 = HMDeviceSource.MILI_BLED;
                HMDeviceSource hMDeviceSource31 = HMDeviceSource.MILI_BLED_PRO;
                HMDeviceSource hMDeviceSource32 = HMDeviceSource.MILI_BLED_PRO_W;
                HMDeviceSource hMDeviceSource33 = HMDeviceSource.MILI_CANNES;
                HMDeviceSource hMDeviceSource34 = HMDeviceSource.MILI_CANNES_W;
                HMDeviceSource hMDeviceSource35 = HMDeviceSource.MILI_SOFIA;
                HMDeviceSource hMDeviceSource36 = HMDeviceSource.MILI_SOFIA_W;
                HMDeviceSource hMDeviceSource37 = HMDeviceSource.MILI_LISBON_WL;
                HMDeviceSource hMDeviceSource38 = HMDeviceSource.MILI_NEWTON_WL;
                m0(HMDeviceSource.MILI_FALCON_DISNEY, HMDeviceSource.MILI_FALCON, HMDeviceSource.MILI_FALCON_L, HMDeviceSource.MILI_HAWK, hMDeviceSource, hMDeviceSource2, HMDeviceSource.MILI_HAWK_SWK, hMDeviceSource3, hMDeviceSource4, hMDeviceSource5, hMDeviceSource6, hMDeviceSource7, hMDeviceSource8, hMDeviceSource9, hMDeviceSource10, hMDeviceSource11, hMDeviceSource12, hMDeviceSource13, hMDeviceSource14, hMDeviceSource15, hMDeviceSource16, hMDeviceSource17, hMDeviceSource18, hMDeviceSource19, hMDeviceSource20, hMDeviceSource21, hMDeviceSource22, hMDeviceSource23, hMDeviceSource24, hMDeviceSource25, HMDeviceSource.MILI_VIENNA, HMDeviceSource.MILI_VIENNA_W, HMDeviceSource.MILI_ANDES, HMDeviceSource.MILI_ANDES_W, HMDeviceSource.MILI_TEIDE, HMDeviceSource.MILI_TEIDE_W, hMDeviceSource26, hMDeviceSource27, hMDeviceSource28, hMDeviceSource29, hMDeviceSource30, hMDeviceSource31, hMDeviceSource31, hMDeviceSource32, hMDeviceSource33, hMDeviceSource34, hMDeviceSource35, hMDeviceSource36, HMDeviceSource.MILI_PROVENCE, HMDeviceSource.MILI_PROVENCE_W, HMDeviceSource.MILI_PROVENCE_W_NFC, hMDeviceSource37, hMDeviceSource38, HMDeviceSource.MILI_LEIDEN, HMDeviceSource.MILI_LEIDEN_W, HMDeviceSource.MILI_FLORENCE, HMDeviceSource.MILI_FLORENCE_W, HMDeviceSource.MILI_BERLIN, HMDeviceSource.MILI_BERLIN_W, HMDeviceSource.MILI_LILLE, HMDeviceSource.MILI_LILLE_W);
                a1(hMDeviceSource, hMDeviceSource2, hMDeviceSource3, hMDeviceSource4, hMDeviceSource5, hMDeviceSource6, hMDeviceSource7, hMDeviceSource8, hMDeviceSource9, hMDeviceSource10, hMDeviceSource11, hMDeviceSource12, hMDeviceSource13, hMDeviceSource14, hMDeviceSource15, hMDeviceSource16, hMDeviceSource17, hMDeviceSource18, hMDeviceSource19, hMDeviceSource20, hMDeviceSource21, hMDeviceSource22, hMDeviceSource23, hMDeviceSource24, hMDeviceSource25, hMDeviceSource26, hMDeviceSource27, hMDeviceSource28, hMDeviceSource29, hMDeviceSource30, hMDeviceSource31, hMDeviceSource31, hMDeviceSource32, hMDeviceSource33, hMDeviceSource34, hMDeviceSource35, hMDeviceSource36, hMDeviceSource37, hMDeviceSource38);
                break;
            case 12:
                m0(HMDeviceSource.MILI_KESTREL);
                break;
            case 18:
                m0(HMDeviceSource.OTHER_BOLT);
                break;
            case 19:
                m0(HMDeviceSource.MILI_VULTURE);
                m0(HMDeviceSource.MILI_BLANC);
                m0(HMDeviceSource.MILI_BLANC_W);
                break;
            case 21:
                m0(HMDeviceSource.MILI_VENICE);
                m0(HMDeviceSource.MILI_VENICE_W);
                break;
            case 22:
                m0(HMDeviceSource.MILI_ANETO);
                break;
            case 23:
                m0(HMDeviceSource.MILI_LONDON);
                break;
            case 26:
                m0(HMDeviceSource.MILI_TOKYO);
                m0(HMDeviceSource.MILI_OSAKA);
                m0(HMDeviceSource.MILI_OSAKA_W);
                break;
            case 27:
                m0(HMDeviceSource.MILI_COMO, HMDeviceSource.MILI_COMO_L, HMDeviceSource.MILI_COMO_W, HMDeviceSource.MILI_COMO_WL, HMDeviceSource.MILI_NESS, HMDeviceSource.MILI_NESS_W, HMDeviceSource.MILI_DAX);
                break;
        }
        HMLog.i(this.z, "support devices:" + Arrays.toString(this.q.toArray()), new Object[0]);
    }

    private void D0(int i) {
        if (i == 6) {
            m0(HMDeviceSource.OTHER_BM);
        } else if (i == 7) {
            m0(HMDeviceSource.MILI_DTH, HMDeviceSource.MILI_DTH_W);
        } else if (i == 8) {
            m0(HMDeviceSource.MILI_PYH);
        } else if (i != 10) {
            this.q.addAll(HMMiLiDevice.getSupportDeviceNames());
            this.q.addAll(HMMiLiProDevice.getSupportDeviceNames());
            a1(HMDeviceSource.MILI_PEYTO, HMDeviceSource.MILI_DTH, HMDeviceSource.MILI_DTH_W, HMDeviceSource.MILI_TONLESAP, HMDeviceSource.MILI_PYH, HMDeviceSource.MILI_FALCON, HMDeviceSource.MILI_FALCON_L, HMDeviceSource.MILI_HAWK, HMDeviceSource.MILI_KESTREL, HMDeviceSource.MILI_KESTREL_L, HMDeviceSource.WATCH_EVEREST_2S);
            a1(HMDeviceSource.MILI_ATHENS);
            if (HMConfig.Channel.isInner()) {
                this.q.addAll(HMAmazfitDevice.getSupportDeviceNames());
            } else {
                a1(HMDeviceSource.MILI_QINLING);
            }
        } else {
            m0(HMDeviceSource.MILI_PEYTO, HMDeviceSource.MILI_PEYTO_L);
        }
        HMLog.i(HMBindBaseLogic.TAG, "support devices:" + Arrays.toString(this.q.toArray()), new Object[0]);
    }

    private boolean E0(String str) {
        Iterator<String> it2 = ConfigHelperKt.getDeviceConfig(HMDeviceSource.OTHER_BOLT).getBtNames().iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(str, it2.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean F0(DeviceInfo deviceInfo) {
        int firmwareVersion = deviceInfo.getFirmwareVersion();
        if (deviceInfo.isMiLiChongqing()) {
            return firmwareVersion >= 17235968;
        }
        return (deviceInfo.isMiLiWuhan() || deviceInfo.isMiLiHankou()) && firmwareVersion >= 33685546;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G0(HMDeviceSource hMDeviceSource) {
        return hMDeviceSource == HMDeviceSource.MILI_WUHAN || hMDeviceSource == HMDeviceSource.MILI_CHONGQING;
    }

    private void H0(HMDeviceSource hMDeviceSource, final BluetoothDevice bluetoothDevice, final HMDeviceSource hMDeviceSource2) {
        if (HMPersonInfo.getInstance().getUserInfo().getAge() < 14 && hMDeviceSource == HMDeviceSource.MILI_FALCON_DISNEY) {
            Observable.fromCallable(no2.a).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: fo2
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.S0(bluetoothDevice, hMDeviceSource2, (Boolean) obj);
                }
            }, new Action1() { // from class: do2
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.T0((Throwable) obj);
                }
            });
        } else {
            HMLog.i(this.z, "Does not meet the authorization conditions of falcon version", new Object[0]);
            r0(bluetoothDevice, hMDeviceSource2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String I0() {
        return "no need record";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object J0() throws Exception {
        this.x.init();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(Object obj) {
        this.l = new BleScanOption.Builder().scanTimeout(this.p).needConnectedDevices(false).filterUUID(HMBaseProfile.UUID_SERVICE_MILI_SERVICE).setFilter(this.x).callback(this).build();
        analytic(new BindStart("", HMDeviceSource.MILI, 3, true));
        BleScanCenter.getInstance().startScan(this.l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String L0() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M0(Throwable th) {
        HMLog.error(HMBindBaseLogic.TAG, "", th, new Function0() { // from class: bo2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMBindMiLiLogic.L0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(BluetoothDevice bluetoothDevice, ArrayList arrayList, DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getDeviceSource().getType() != HMDeviceType.MILI) {
            handleBindFailed(HMBindBaseLogic.BindError.UNKNOW_DEVICE_TYPE);
            HMLog.i(this.z, "not support device : " + bluetoothDevice, new Object[0]);
            return;
        }
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        this.t = deviceSource;
        if (deviceSource == HMDeviceSource.MILI_FALCON_DISNEY) {
            H0(deviceSource, bluetoothDevice, deviceSource);
        } else {
            r0(bluetoothDevice, deviceSource);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String O0(Exception exc) {
        return "createDeviceByDeviceSource: " + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(HMDeviceSource hMDeviceSource) {
        HMBindBaseLogic.IBindListener iBindListener = this.mListener;
        if (iBindListener != null) {
            ((IBindMiliListener) iBindListener).onBindMiLiKnock(hMDeviceSource);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(HMDeviceSource hMDeviceSource) {
        HMBindBaseLogic.IBindListener iBindListener = this.mListener;
        if (iBindListener != null) {
            ((IBindMiliListener) iBindListener).onBindMiLiKnockSuccess(hMDeviceSource);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(HMDeviceSource hMDeviceSource, ArrayList arrayList, DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getDeviceSource().getType() != HMDeviceType.MILI) {
            handleBindFailed(HMBindBaseLogic.BindError.UNKNOW_DEVICE_TYPE);
        } else {
            handleBindFailed(HMBindBaseLogic.BindError.NEED_RESET.setDeviceSource(hMDeviceSource).setCouldResetOnDevice(F0(deviceInfo)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(BluetoothDevice bluetoothDevice, HMDeviceSource hMDeviceSource, Boolean bool) {
        HMLog.i(this.z, "Parental authorization status:state->" + bool, new Object[0]);
        if (bool.booleanValue()) {
            c1();
        } else {
            r0(bluetoothDevice, hMDeviceSource);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(Throwable th) {
        handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0(AppCompatActivity appCompatActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        d1();
        appCompatActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V0(DialogInterface dialogInterface, int i) {
        WebHelper.launch(HMServerDef.getUrl(HMAccountWebAPI.URL_MINOR_AUTHORIZATION_IMPROPER), true);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String W0(BluetoothDevice bluetoothDevice, HMDeviceSource hMDeviceSource) {
        StringBuilder sb = new StringBuilder();
        sb.append("TAG_BIND startBindMili, mac: ");
        sb.append(bluetoothDevice == null ? null : bluetoothDevice.getAddress());
        sb.append(", source: ");
        sb.append(hMDeviceSource);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String X0() {
        return "unregisterReceiver failed";
    }

    @Nullable
    private HMDeviceSource Y0(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return HMBindBaseLogic.deviceUtilsApiLazy.getValue().nameToDeviceSource(str);
    }

    private HMBindBaseLogic.BindError Z0(BluetoothDevice bluetoothDevice, String str, int i) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_AMAZFIT;
        HMWebBindInfo hMWebBindInfoCreateQueryInfo = HMWebBindInfo.createQueryInfo(hMDeviceSource.getType().getValue(), hMDeviceSource.getValue(), bluetoothDevice.getAddress());
        hMWebBindInfoCreateQueryInfo.setDeviceId(str);
        hMWebBindInfoCreateQueryInfo.setUidCrc(i);
        AtomicReference atomicReference = new AtomicReference();
        HMDeviceWebAPI.bindDevice(hMWebBindInfoCreateQueryInfo, new b(atomicReference), true);
        return (HMBindBaseLogic.BindError) atomicReference.get();
    }

    private void a1(HMDeviceSource... hMDeviceSourceArr) {
        removeNames(this.q, hMDeviceSourceArr);
    }

    public static void addNames(List<String> list, HMDeviceSource... hMDeviceSourceArr) {
        for (HMDeviceSource hMDeviceSource : hMDeviceSourceArr) {
            list.addAll(ConfigHelperKt.getDeviceConfig(hMDeviceSource).getBtNames());
        }
    }

    private void b1() {
        HMBaseDevice hMBaseDevice = this.mBleDevice;
        if (hMBaseDevice instanceof HMBaseBleDevice) {
            ((HMBaseBleDevice) hMBaseDevice).setTinkerAuthCallback(null);
        }
        if (HMBindBaseLogic.getBleDevice() instanceof HMBaseBleDevice) {
            ((HMBaseBleDevice) HMBindBaseLogic.getBleDevice()).setTinkerAuthCallback(null);
        }
    }

    private void c1() {
        final AppCompatActivity appCompatActivity = this.w.get();
        if (appCompatActivity == null) {
            return;
        }
        new AlertDialogFragment.Builder(this.mContext).setCancelable(false).setTitle(R.string.parental_authorization_title).setMessage(this.mContext.getString(R.string.parental_authorization_content)).setNegativeButton(R.string.parental_authorization_back, new DialogInterface.OnClickListener() { // from class: zn2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.U0(appCompatActivity, dialogInterface, i);
            }
        }).setPositiveButton(R.string.gdpr_status_button2, new DialogInterface.OnClickListener() { // from class: ho2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HMBindMiLiLogic.V0(dialogInterface, i);
            }
        }).show(appCompatActivity.getSupportFragmentManager());
    }

    private void d1() {
        AppCompatActivity appCompatActivity = this.w.get();
        if (appCompatActivity != null) {
            Intent intent = new Intent(appCompatActivity, (Class<?>) HMSelectWatchActivityNew.class);
            intent.addFlags(536870912);
            intent.addFlags(67108864);
            appCompatActivity.startActivity(intent);
        }
    }

    private void e1(BleScanOption bleScanOption) {
        if (this.u == 18) {
            TreadmillClassicScanCenter.getInstance().stopScan(bleScanOption);
        } else {
            BleScanCenter.getInstance().stopScan(bleScanOption);
        }
    }

    public static void initDefaultMiliDevices(List<String> list) {
        addNames(list, HMDeviceSource.MILI_TEMPO, HMDeviceSource.MILI_BEATS, HMDeviceSource.MILI_BEATS_P, HMDeviceSource.MILI_BEATS_W, HMDeviceSource.MILI_NFC, HMDeviceSource.MILI_ROCKY, HMDeviceSource.MILI_AMAZFIT, HMDeviceSource.MILI_YORK, HMDeviceSource.MILI_BARI, HMDeviceSource.MILI_BARI_NFC, HMDeviceSource.MILI_BARI_W);
    }

    public static void initWithMiSeriesDevices(List<String> list) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_QINLING;
        addNames(list, HMDeviceSource.MILI, HMDeviceSource.MILI_1A, HMDeviceSource.MILI_1S, HMDeviceSource.MILI_PRO, HMDeviceSource.MILI_ROCKY, HMDeviceSource.MILI_NFC, hMDeviceSource, HMDeviceSource.MILI_TEMPO, HMDeviceSource.MILI_PRO_I, HMDeviceSource.MILI_WUHAN, HMDeviceSource.MILI_BEATS, HMDeviceSource.MILI_CHONGQING, HMDeviceSource.MILI_BEATS_P, HMDeviceSource.MILI_BEATS_W, HMDeviceSource.MILI_CINCO, HMDeviceSource.MILI_RIO, HMDeviceSource.MILI_AMAZFIT, HMDeviceSource.MILI_YORK, HMDeviceSource.MILI_BARI, HMDeviceSource.MILI_BARI_NFC, HMDeviceSource.MILI_BARI_W);
        if (GlobalConfig.get().isBuildInner()) {
            return;
        }
        removeNames(list, hMDeviceSource);
    }

    private void m0(HMDeviceSource... hMDeviceSourceArr) {
        addNames(this.q, hMDeviceSourceArr);
    }

    private void n0(String str) {
        if (this.u != 18) {
            this.n = new BleScanOption.Builder().callback(this).scanTimeout(30000).needConnectedDevices(false).filterAddress(str).build();
            BleScanCenter.getInstance().startScan(this.n);
        } else {
            this.n = new BleScanOption.Builder().callback(this).scanTimeout(30000).needConnectedDevices(false).filterAddress(str).build();
            TreadmillClassicScanCenter.getInstance().startScan(this.n);
        }
    }

    private void o0() {
        int i = this.u;
        if (i == 18) {
            this.l = new BleScanOption.Builder().scanTimeout(this.p).needConnectedDevices(false).filterNames(this.q).callback(this).build();
            TreadmillClassicScanCenter.getInstance().startScan(this.l);
        } else if (i == 0) {
            Observable.fromCallable(new Callable() { // from class: mo2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.J0();
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: eo2
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.K0(obj);
                }
            }, new Action1() { // from class: go2
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    HMBindMiLiLogic.M0((Throwable) obj);
                }
            });
        } else {
            this.l = new BleScanOption.Builder().scanTimeout(this.p).needConnectedDevices(false).filterUUID(HMBaseProfile.UUID_SERVICE_MILI_SERVICE).filterNames(this.q).callback(this).build();
            BleScanCenter.getInstance().startScan(this.l);
        }
    }

    private void p0(AdvData advData) {
        final BluetoothDevice bluetoothDevice = advData.device;
        String deviceName = advData.getDeviceName();
        HMLog.i(this.z, "scaned device size:" + this.r.size(), new Object[0]);
        if (TextUtils.isEmpty(deviceName) || HMMiLiProDevice.nameToSource(deviceName) == HMDeviceSource.MILI_FALCON) {
            DeviceInfoScanner.scan(this.mContext, bluetoothDevice, new DeviceInfoScanner.IDeviceInfoScanCallback() { // from class: io2
                @Override // com.xiaomi.hm.health.bt.scan.DeviceInfoScanner.IDeviceInfoScanCallback
                public final void onDeviceInfoObtained(ArrayList arrayList, DeviceInfo deviceInfo) {
                    this.a.N0(bluetoothDevice, arrayList, deviceInfo);
                }
            });
            return;
        }
        HMDeviceSource hMDeviceSourceNameToSource = HMMiLiProDevice.nameToSource(deviceName);
        this.t = hMDeviceSourceNameToSource;
        if (hMDeviceSourceNameToSource == null || hMDeviceSourceNameToSource == HMDeviceSource.VDEVICE) {
            this.t = HMMiLiDevice.nameToSource(deviceName);
        }
        HMDeviceSource hMDeviceSource = this.t;
        if (hMDeviceSource == null || hMDeviceSource == HMDeviceSource.VDEVICE) {
            this.t = HMBMDevice.nameToSource(deviceName);
        }
        HMDeviceSource hMDeviceSource2 = this.t;
        if (hMDeviceSource2 == null || hMDeviceSource2 == HMDeviceSource.VDEVICE) {
            this.t = HMAmazfitDevice.nameToSource(deviceName);
        }
        if (E0(deviceName)) {
            this.t = HMDeviceSource.OTHER_BOLT;
        }
        HMDeviceSource hMDeviceSource3 = this.t;
        if (hMDeviceSource3 != null && hMDeviceSource3 != HMDeviceSource.VDEVICE) {
            r0(bluetoothDevice, hMDeviceSource3);
            return;
        }
        handleBindFailed(HMBindBaseLogic.BindError.UNKNOW_DEVICE_TYPE);
        analytic(new BindFail(ConstantKt.STAGE_QUERY, ConstantKt.QUERY_FAIL_UNKNOWN_DEVICE_TYPE));
        HMLog.i(this.z, "not support device : " + bluetoothDevice, new Object[0]);
    }

    private void q0(BluetoothDevice bluetoothDevice, HMDeviceSource hMDeviceSource) {
        HMDeviceWebAPI.bindDevice(new HMWebBindInfo(hMDeviceSource.getType().getValue(), hMDeviceSource.getValue(), bluetoothDevice.getAddress()), new c(bluetoothDevice), false);
    }

    private void r0(BluetoothDevice bluetoothDevice, HMDeviceSource hMDeviceSource) {
        try {
            HMLog.i(this.z, "createDeviceByDeviceSource device:" + bluetoothDevice + ",source:" + hMDeviceSource, new Object[0]);
            this.s = bluetoothDevice;
            if (hMDeviceSource == HMDeviceSource.OTHER_BOLT) {
                u0(bluetoothDevice);
            } else if (hMDeviceSource == HMDeviceSource.OTHER_BM) {
                t0(bluetoothDevice);
            } else if (hMDeviceSource == HMDeviceSource.MILI_AMAZFIT) {
                s0(bluetoothDevice);
            } else if (HMDeviceConfig.hasFeaturePro(hMDeviceSource)) {
                q0(bluetoothDevice, hMDeviceSource);
            } else {
                v0(bluetoothDevice);
            }
        } catch (Exception e2) {
            HMLog.error(HMBindBaseLogic.TAG, new Function0() { // from class: po2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMBindMiLiLogic.O0(e2);
                }
            });
            handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
        }
    }

    public static void removeNames(List<String> list, HMDeviceSource... hMDeviceSourceArr) {
        for (HMDeviceSource hMDeviceSource : hMDeviceSourceArr) {
            list.removeAll(ConfigHelperKt.getDeviceConfig(hMDeviceSource).getBtNames());
        }
    }

    private void s0(BluetoothDevice bluetoothDevice) {
        HMAmazfitDevice hMAmazfitDevice = new HMAmazfitDevice(this.mContext, bluetoothDevice);
        hMAmazfitDevice.setAuthCallback(this.B);
        hMAmazfitDevice.setConnectionCallback(this);
        hMAmazfitDevice.setAutoReconnect(false);
        hMAmazfitDevice.setAuthInfo(new AuthInfo(this.mUserInfo));
        hMAmazfitDevice.create(true);
        this.mBleDevice = hMAmazfitDevice;
    }

    private void t0(BluetoothDevice bluetoothDevice) {
        HMBMDevice hMBMDevice = new HMBMDevice(this.mContext, bluetoothDevice);
        hMBMDevice.setConnectionCallback(this);
        hMBMDevice.setAutoReconnect(false);
        hMBMDevice.setAuthCallback(this.B);
        hMBMDevice.setAuthInfo(new AuthInfo(randomKey(), true));
        hMBMDevice.create(true);
        this.mBleDevice = hMBMDevice;
    }

    private void u0(BluetoothDevice bluetoothDevice) {
        HMBoltClassicDevice hMBoltClassicDevice = new HMBoltClassicDevice(this.mContext, bluetoothDevice);
        hMBoltClassicDevice.setConnectionCallback(this);
        hMBoltClassicDevice.setAutoReconnect(false);
        hMBoltClassicDevice.setAuthCallback(this.B);
        AuthInfo authInfo = new AuthInfo(randomKey(), true);
        UserInfoExt userInfoExt = HMBindBaseLogic.deviceUtilsApiLazy.getValue().toUserInfoExt(HMPersonInfo.getInstance().getUserInfo());
        authInfo.setUserInfo(new UserInfo((int) userInfoExt.getUid(), userInfoExt.getGender().getValue(), (byte) userInfoExt.getAge(), (byte) userInfoExt.getHeight(), (byte) userInfoExt.getWeight(), userInfoExt.getAlias().getBytes(Charset.defaultCharset())));
        hMBoltClassicDevice.setAuthInfo(authInfo);
        hMBoltClassicDevice.create(true);
        this.mBleDevice = hMBoltClassicDevice;
    }

    private void v0(BluetoothDevice bluetoothDevice) {
        HMMiLiDevice hMMiLiDevice = new HMMiLiDevice(this.mContext, bluetoothDevice);
        hMMiLiDevice.setAuthCallback(this.B);
        hMMiLiDevice.setConnectionCallback(this);
        hMMiLiDevice.setAutoReconnect(false);
        hMMiLiDevice.setAuthInfo(new AuthInfo(this.mUserInfo));
        hMMiLiDevice.create(true);
        this.mBleDevice = hMMiLiDevice;
    }

    private void w0() {
        if (this.u == 18) {
            this.m = new BleScanOption.Builder().scanTimeout(60000 - this.p).needConnectedDevices(false).filterNames(this.q).callback(this).build();
            TreadmillClassicScanCenter.getInstance().startScan(this.m);
        } else {
            this.m = new BleScanOption.Builder().scanTimeout(60000 - this.p).needConnectedDevices(false).filterUUID(HMBaseProfile.UUID_SERVICE_MILI_SERVICE).setFilter(this.x).callback(this).build();
            BleScanCenter.getInstance().startScan(this.m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String x0(String str) {
        HMLog.d(this.z, "nickName:" + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char c2 = charArray[i2];
            if (i >= 10) {
                sb.append("***");
                break;
            }
            i += c2 <= 255 ? 1 : 2;
            sb.append(c2);
        }
        HMLog.d(this.z, "limitNickName:" + sb.toString(), new Object[0]);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(final HMDeviceSource hMDeviceSource) {
        analytic(new WaitConfirm());
        this.mHandler.post(new Runnable() { // from class: lo2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.P0(hMDeviceSource);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(final HMDeviceSource hMDeviceSource) {
        analytic(new Confirm());
        this.mHandler.post(new Runnable() { // from class: ko2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Q0(hMDeviceSource);
            }
        });
    }

    public void analytic(BindEvent bindEvent) {
        if (this.A) {
            BindAnalytic.record(bindEvent);
        } else {
            HMLog.error(HMBindBaseLogic.TAG, new Function0() { // from class: ao2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMBindMiLiLogic.I0();
                }
            });
        }
    }

    public BluetoothDevice getBluetoothDevice() {
        return this.s;
    }

    public HMDeviceSource getDeviceSource() {
        return this.t;
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public void handleBindSuccess(HMBaseDevice hMBaseDevice, Device device) {
        super.handleBindSuccess(hMBaseDevice, device);
        HMBindBaseLogic.deviceManagerApiLazy.getValue().unbindDevice(HMDeviceType.SENSORHUB);
    }

    public void improve() {
        this.p += 10000;
    }

    @Override // com.xiaomi.hm.health.bt.profile.auth.TinkerAuthCallback
    public void onAuthFail(@NonNull HMBaseBleDevice hMBaseBleDevice, @NonNull AuthResult authResult) {
        super.onAuthFail(hMBaseBleDevice, authResult);
        analytic(BindAnalytic.parseAuthError(authResult.getAuthError()));
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.ife.IHMConnectionCallback
    public void onConnectionStatusChanged(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
        HMBaseDevice hMBaseDevice = this.mBleDevice;
        if ((hMBaseDevice instanceof HMAmazfitDevice) && Status.INIT_SUCCESS == status) {
            HMAmazfitDevice hMAmazfitDevice = (HMAmazfitDevice) hMBaseDevice;
            int uidCrcSync = hMAmazfitDevice.getUidCrcSync();
            DeviceInfo deviceInfoSync = hMAmazfitDevice.getDeviceInfoSync();
            HMBindBaseLogic.BindError bindErrorZ0 = deviceInfoSync == null ? HMBindBaseLogic.BindError.DISCONNECTED : Z0(bluetoothDevice, deviceInfoSync.getDeviceID(), uidCrcSync);
            if (bindErrorZ0 != null) {
                handleBindFailed(bindErrorZ0);
                this.mBleDevice.destroy();
                return;
            }
        }
        switch (e.a[status.ordinal()]) {
            case 1:
                analytic(new BindFail(ConstantKt.STAGE_CONNECT, ConstantKt.CONNECT_FAIL_REASON_DISCONNECT));
                break;
            case 2:
                analytic(new BindFail(ConstantKt.STAGE_CONNECT, ConstantKt.CONNECT_FAIL_REASON_DISCOVER_SERVICE_FAIL, status.getValue()));
                break;
            case 3:
                analytic(new BindFail(ConstantKt.STAGE_CONNECT, "connect_fail", status.getValue()));
                break;
            case 4:
                analytic(new BindFail(ConstantKt.STAGE_CONNECT, ConstantKt.CONNECT_FAIL_REASON_INIT_FAIL));
                break;
            case 5:
                analytic(new ConnectSuccess());
                break;
            case 6:
                analytic(new AuthSuccess());
                break;
            case 7:
                analytic(new SetTimeSuccess());
                break;
            case 8:
                analytic(GetDeviceInfoSuccess.newInstance(this.mBleDevice));
                break;
        }
        super.onConnectionStatusChanged(bluetoothDevice, hMDeviceType, status);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanError(BleScanOption bleScanOption) {
        HMLog.d(this.z, "onScanError:" + bleScanOption, new Object[0]);
        handleBindFailed(HMBindBaseLogic.BindError.SCAN_ERROR);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanStart(BleScanOption bleScanOption) {
        HMLog.d(this.z, "onScanStart:" + bleScanOption, new Object[0]);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanStop(BleScanOption bleScanOption) {
        HMLog.i(this.z, "onScanStop:<" + bleScanOption + SearchCriteria.GT + this.o, new Object[0]);
        if (this.mHasStop.get()) {
            return;
        }
        if (bleScanOption == this.n) {
            HMLog.i(this.z, "onScanStop mAddressScanOption", new Object[0]);
            AdvData advData = this.o;
            if (advData != null) {
                analytic(ScanSuccess.newInstance(advData));
                r0(this.o.device, this.t);
                return;
            } else {
                handleBindFailed(HMBindBaseLogic.BindError.NO_DEVICE);
                analytic(new BindFail(ConstantKt.STAGE_SCAN));
                return;
            }
        }
        if (bleScanOption == this.l) {
            AdvData advData2 = this.o;
            if (advData2 == null || advData2.rssi < -60) {
                w0();
                return;
            }
        } else if (this.o == null) {
            handleBindFailed(HMBindBaseLogic.BindError.NO_DEVICE);
            analytic(new BindFail(ConstantKt.STAGE_SCAN));
            return;
        }
        analytic(ScanSuccess.newInstance(this.o));
        p0(this.o);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanedDevice(AdvData advData, BleScanOption bleScanOption) {
        BleScanOption bleScanOption2;
        BleScanOption bleScanOption3;
        String str = SearchCriteria.LT + advData.rssi + " " + advData.device + " " + advData.getDeviceName() + SearchCriteria.GT;
        HMLog.d(this.z, "onScanedDevice : " + str, new Object[0]);
        if (bleScanOption == this.n) {
            HMLog.i(this.z, "onScanedDevice mAddressScanOption", new Object[0]);
            this.o = advData;
            e1(this.n);
            return;
        }
        int i = advData.rssi;
        if (i > 0) {
            HMLog.i(this.z, "drop as rssi > 0 : " + str, new Object[0]);
            return;
        }
        if (i < -90) {
            HMLog.i(this.z, "drop as rssi < -90 : " + str, new Object[0]);
            return;
        }
        if (i != 0 && !advData.isGeneralDiscoverableMode() && !advData.isLimitedDiscoverableMode()) {
            HMLog.i(this.z, "drop connected adv data : " + str, new Object[0]);
            return;
        }
        String address = advData.device.getAddress();
        if (exist(address)) {
            HMLog.i(this.z, "return as bound : " + address, new Object[0]);
            return;
        }
        this.r.put(address, advData);
        HMLog.i(this.z, "scanedDevices size : " + this.r.size(), new Object[0]);
        AdvData advData2 = this.o;
        if (advData2 == null || advData2.rssi < i) {
            this.o = advData;
        }
        if (i >= -45 && bleScanOption == (bleScanOption3 = this.l)) {
            e1(bleScanOption3);
        }
        if (i < -60 || bleScanOption != (bleScanOption2 = this.m)) {
            return;
        }
        e1(bleScanOption2);
    }

    public void setNeedAnalytic(boolean z) {
        this.A = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void startBind(HMBindBaseLogic.IBindListener iBindListener, final BluetoothDevice bluetoothDevice, final HMDeviceSource hMDeviceSource) {
        super.startBind(iBindListener);
        HMLog.info(this.z, new Function0() { // from class: oo2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMBindMiLiLogic.W0(bluetoothDevice, hMDeviceSource);
            }
        });
        if (iBindListener instanceof AppCompatActivity) {
            this.w = new WeakReference<>((AppCompatActivity) iBindListener);
        }
        b1();
        this.r.clear();
        this.t = null;
        B0();
        if (bluetoothDevice != null && hMDeviceSource != null && hMDeviceSource != HMDeviceSource.VDEVICE) {
            this.t = hMDeviceSource;
            n0(bluetoothDevice.getAddress());
            analytic(new BindStart(bluetoothDevice.getAddress(), hMDeviceSource, this.v, true));
        } else {
            if (bluetoothDevice == null) {
                o0();
                return;
            }
            AdvData advData = new AdvData();
            advData.rssi = 0;
            advData.device = bluetoothDevice;
            this.r.put(bluetoothDevice.getAddress(), advData);
            analytic(new BindStart(bluetoothDevice.getAddress(), BindAnalytic.parseDeviceSource(GattUtils.getBluetoothDeviceName(bluetoothDevice)), 0, true));
            p0(advData);
        }
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public void stopBind() {
        super.stopBind();
        b1();
        destroyBleDevice();
        DeviceInfoScanner.destoryProfile();
        BleScanOption bleScanOption = this.l;
        if (bleScanOption != null) {
            e1(bleScanOption);
        }
        BleScanOption bleScanOption2 = this.m;
        if (bleScanOption2 != null) {
            e1(bleScanOption2);
        }
        BleScanOption bleScanOption3 = this.n;
        if (bleScanOption3 != null) {
            e1(bleScanOption3);
        }
        this.o = null;
        this.mHandler.removeCallbacksAndMessages(null);
        this.r.clear();
        this.t = null;
        try {
            this.mContext.unregisterReceiver(this.y);
        } catch (Exception unused) {
            HMLog.error(HMBindBaseLogic.TAG, new Function0() { // from class: co2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMBindMiLiLogic.X0();
                }
            });
        }
    }
}

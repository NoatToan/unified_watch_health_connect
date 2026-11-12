package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.MenstruationModule;
import com.huami.bluetooth.profile.channel.module.connect.ConnectModule;
import com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule;
import com.huami.bluetooth.profile.channel.module.health.HeartHealthApi;
import com.huami.bluetooth.profile.channel.module.obsolete.ObsoleteModule;
import com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule;
import com.huami.bluetooth.profile.channel.module.openapp.entities.ActivityData;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.screenlock.ScreenLockAndPassword;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.profile.ecf.data.HidStatus;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.model.HMAutoBacklightInfo;
import com.xiaomi.hm.health.bt.model.HMCardSwitchTime;
import com.xiaomi.hm.health.bt.model.HMCardTSResponse;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertApp;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.dfu.DfuState;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstrualNotifiedData;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstrualPeriodData;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationConfig;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.bt.profile.nfc.ApduRequest;
import com.xiaomi.hm.health.bt.profile.nfc.ApduResponse;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardConfig;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardIdent;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardStatus;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardType;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCStatus;
import com.xiaomi.hm.health.bt.profile.nfc.PasswordInteractionResponse;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.IHMFirstbeatDataCallback;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeItem;
import com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule;
import com.xiaomi.hm.health.bt.profile.weather.ExtensionInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMForecastWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMRealtimeAqi;
import com.xiaomi.hm.health.bt.profile.weather.HMRealtimeWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMSunriseSunsetInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMWindAndHumidityInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public class ne extends me implements zbt, oht, wl, bj, xo {
    public static final HashMap<String, qd> h0 = new a();
    public static final UUID i0 = tet.C(22);
    public x7t U;
    public igt V;
    public gm W;
    public aj X;
    public HMCallback<q1t> Y;
    public HMCallback<bht> Z;
    public lht a0;
    public kks b0;
    public k7 c0;
    public wm d0;
    public gn e0;
    public final Object f0;
    public ket g0;

    public class a extends HashMap<String, qd> {
        public a() {
            putAll(op.b().b());
        }
    }

    public class b implements IHMDataCallback<List<udt>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HMCallback f27830a;

        public b(HMCallback hMCallback) {
            this.f27830a = hMCallback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onStop(List<udt> list, HMDeviceError hMDeviceError) {
            this.f27830a.onFinish(new ArrayList(list));
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onProgress(Progress progress) {
            this.f27830a.onProgress(progress);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onStart() {
            this.f27830a.onStart();
        }
    }

    public class c implements IHMDataCallback<List<Spo2Data>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HMCallback f27832a;

        public c(HMCallback hMCallback) {
            this.f27832a = hMCallback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onStop(List<Spo2Data> list, HMDeviceError hMDeviceError) {
            this.f27832a.onFinish(list);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onProgress(Progress progress) {
            this.f27832a.onProgress(progress);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onStart() {
            this.f27832a.onStart();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class d<T> implements IHMDataCallback<List<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HMCallback f27834a;

        public d(HMCallback hMCallback) {
            this.f27834a = hMCallback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onStop(List<T> list, HMDeviceError hMDeviceError) {
            this.f27834a.sendOnDataMessage(list);
            this.f27834a.sendOnFinishMessage(hMDeviceError.isErrorNone());
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onProgress(Progress progress) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onStart() {
            this.f27834a.sendOnStartMessage();
        }
    }

    public class e implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HMCallback f27836a;

        public e(HMCallback hMCallback) {
            this.f27836a = hMCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke2(Boolean bool) {
            this.f27836a.onFinish(bool);
            return null;
        }
    }

    public class f implements IHMDataCallback<List<ActivityData>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HMCallback f27838a;

        public f(HMCallback hMCallback) {
            this.f27838a = hMCallback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onStop(List<ActivityData> list, HMDeviceError hMDeviceError) {
            this.f27838a.sendOnDataMessage(list);
            this.f27838a.sendOnFinishMessage(hMDeviceError.isErrorNone());
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onProgress(Progress progress) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onStart() {
            this.f27838a.sendOnStartMessage();
        }
    }

    public ne(Context context, String str) {
        super(context, str);
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = new Object();
        this.g0 = null;
    }

    public static /* synthetic */ Unit F3(HMCallback hMCallback, Integer num) {
        t5t.d("HMMiLiProDevice", "writeActivityData response code: " + num);
        hMCallback.sendOnFinishMessage(num);
        return null;
    }

    public static /* synthetic */ String H4(boolean z) {
        return "device not connect when set time unit: " + z;
    }

    public static /* synthetic */ String U4() {
        return "notify failed, The device is disconnected";
    }

    public static /* synthetic */ String W4() {
        return "notify failed, NotificationApi is null.";
    }

    public static /* synthetic */ String a5() {
        return "protocol version not support logo request";
    }

    public static /* synthetic */ String c5() {
        return "setDeviceNotificationListener failed, NotificationApi is null.";
    }

    public static /* synthetic */ String f2(Exception exc) {
        return "checkNotificationApi exception: " + exc;
    }

    public static /* synthetic */ String g2(boolean z, boolean z2) {
        return "set time unit: " + z + ", result: " + z2;
    }

    public static /* synthetic */ Unit h2(HMCallback hMCallback, Boolean bool) {
        hMCallback.onFinish(bool);
        return null;
    }

    public static /* synthetic */ Unit i2(HMCallback hMCallback, Integer num) {
        t5t.d("HMMiLiProDevice", "open app module version: " + num);
        hMCallback.onFinish(num.intValue() > 1);
        return null;
    }

    public void A2(final HMLiftWristConfig hMLiftWristConfig, final HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: i9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f20919a.q2(hMCallback, hMLiftWristConfig);
            }
        });
    }

    public boolean A3(boolean z, String str) {
        g4s g4sVarO = O();
        Feature featureA = g4sVarO == null ? null : g4sVarO.A();
        if ((featureA == null || !featureA.hasSw(19)) && !g0()) {
            return V() && this.U.W1(z, str);
        }
        return W3(z, str);
    }

    public yus A4() {
        return this.U;
    }

    public void B2(final HMSedentaryConfig hMSedentaryConfig, final HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: v9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f36648a.r2(hMCallback, hMSedentaryConfig);
            }
        });
    }

    public synchronized boolean B3(byte[] bArr, int i) {
        t5t.d("HMMiLiProDevice", "send piece data");
        return this.U.O0(bArr, i);
    }

    public void B4(final HMCallback<ket> hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: tat
            @Override // java.lang.Runnable
            public final void run() {
                this.f34525a.Q4(hMCallback);
            }
        });
    }

    public void C2(final HMTarget hMTarget, final HMCallback<Boolean> hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: oat
            @Override // java.lang.Runnable
            public final void run() {
                this.f28944a.s2(hMCallback, hMTarget);
            }
        });
    }

    public final int C3() {
        k7 k7VarX1 = X1();
        if (k7VarX1 == null || !k7VarX1.b()) {
            return 0;
        }
        try {
            return k7VarX1.b(false).getCode();
        } catch (Exception e2) {
            t5t.d("HMMiLiProDevice", "Query State failed:" + e2.toString());
            return 0;
        } finally {
            k7VarX1.deInit();
        }
    }

    public boolean C4(boolean z) {
        if (V()) {
            return e1().enableOsa(z);
        }
        return false;
    }

    @Override // defpackage.n1t
    public void D0(final xd xdVar, jys jysVar) {
        mv mvVar = new mv(jysVar, new Function1() { // from class: g9t
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f18762a.j2(xdVar, (Boolean) obj);
            }
        });
        g4s g4sVarO = O();
        if (g4sVarO == null) {
            t5t.d("HMMiLiProDevice", "device info is null!!!");
            jysVar.a(0);
            jysVar.onFwStop(false);
        } else {
            if (!g4sVarO.A().hasBase(3)) {
                if (HMDeviceFeature.hasFeatureResumeDfu(g4sVarO)) {
                    z(new zft(this.u, xdVar, mvVar));
                    return;
                } else {
                    z(new jht(this.u, xdVar, mvVar));
                    return;
                }
            }
            k7 k7VarX1 = X1();
            if (k7VarX1 == null) {
                return;
            }
            if (xdVar.j() == nv.BACKGROUND) {
                s(new qm(k7VarX1, xdVar, mvVar));
            } else {
                z(new qm(k7VarX1, xdVar, mvVar));
            }
        }
    }

    public void D2(final HMMusicControl hMMusicControl, final HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: m9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f25930a.t2(hMCallback, hMMusicControl);
            }
        });
    }

    public final int D3(g4s g4sVar) {
        boolean zHasFeatureResumeDfu = HMDeviceFeature.hasFeatureResumeDfu(g4sVar);
        a6t oftVar = zHasFeatureResumeDfu ? new oft(this.U) : new lbs(this.U);
        if (!oftVar.init()) {
            return 0;
        }
        int iQ = zHasFeatureResumeDfu ? ((oft) oftVar).q() : ((lbs) oftVar).o();
        oftVar.deInit();
        return iQ;
    }

    public final String D4() {
        BluetoothGattService bluetoothGattServiceP = this.U.p(a6t.UUID_SERVICE_MILI_SERVICE);
        if (bluetoothGattServiceP == null) {
            t5t.d("HMMiLiProDevice", "getProperties service null");
            return null;
        }
        BluetoothGattCharacteristic characteristic = bluetoothGattServiceP.getCharacteristic(i0);
        if (characteristic != null) {
            return tet.w(characteristic.getProperties());
        }
        t5t.d("HMMiLiProDevice", "getProperties characteristic null");
        return null;
    }

    public void E2(SportCommand sportCommand, r6t r6tVar, HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        aj ajVar = this.X;
        if (ajVar != null) {
            ajVar.a(sportCommand, r6tVar);
        } else {
            hMCallback.sendOnStartMessage();
            hMCallback.sendOnFinishMessage(false);
        }
    }

    public HMCardTSResponse<Boolean> E3(HMCardSwitchTime hMCardSwitchTime) {
        gm gmVar;
        if (!V() || hMCardSwitchTime == null || (gmVar = this.W) == null) {
            return null;
        }
        return gmVar.b(hMCardSwitchTime);
    }

    public void E4(final HMCallback<UserInfoExt> hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: r9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f32344a.T4(hMCallback);
            }
        });
    }

    @Override // defpackage.n1t
    public boolean F0(int i, int i2) {
        return true;
    }

    public void F2(SportConfig sportConfig, IHMSportListener iHMSportListener, HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        aj ajVar = this.X;
        if (ajVar != null) {
            ajVar.a(sportConfig, iHMSportListener);
        } else {
            hMCallback.sendOnStartMessage();
            hMCallback.sendOnFinishMessage(false);
        }
    }

    public boolean F4(boolean z) {
        return V() && this.U.t2(z);
    }

    public void G2(e7 e7Var) {
        R1();
        wm wmVar = this.d0;
        if (wmVar != null) {
            wmVar.a(e7Var);
        } else {
            le.c("HMMiLiProDevice", new Function0() { // from class: eat
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ne.c5();
                }
            });
        }
    }

    public x7t G3(Context context, BluetoothDevice bluetoothDevice) {
        x7t x7tVar = new x7t(context, bluetoothDevice, this);
        x7tVar.A(this);
        return x7tVar;
    }

    public ArrayList<HMReminderInfo> G4() {
        if (!V()) {
            return null;
        }
        if (!F(EventReminderModule.class)) {
            return this.U.B2();
        }
        EventReminderModule eventReminderModule = (EventReminderModule) y(EventReminderModule.class);
        if (eventReminderModule != null) {
            return eventReminderModule.queryEventItemsSync();
        }
        return null;
    }

    public void H2(final qos qosVar, final HMCallback hMCallback) {
        s(new Runnable() { // from class: uat
            @Override // java.lang.Runnable
            public final void run() {
                this.f35579a.u2(hMCallback, qosVar);
            }
        });
    }

    public void H3(final int i, final HMCallback<Boolean> hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: dat
            @Override // java.lang.Runnable
            public final void run() {
                this.f15323a.o2(hMCallback, i);
            }
        });
    }

    public <T> void I2(f1<List<T>> f1Var, HMCallback<List<T>> hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        f1Var.a(d1());
        z(new a5(this.U, f1Var, T.b(new d(hMCallback))));
    }

    public final /* synthetic */ void I3(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.U.j2(z));
    }

    public final /* synthetic */ void I4(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.U.G1((byte) 0));
    }

    @Override // defpackage.n1t
    public Future J0(Calendar calendar, zos zosVar) {
        g4s g4sVarO = O();
        if (g4sVarO == null) {
            return null;
        }
        return E(c1().a(calendar, P(), g4sVarO.A(), zosVar));
    }

    public void J2(final fn fnVar, final HMCallback<Boolean> hMCallback) {
        R1();
        s(new Runnable() { // from class: z9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f41058a.v2(hMCallback, fnVar);
            }
        });
    }

    public final /* synthetic */ void J3(HMCallback hMCallback, boolean z, int i) {
        if (I(hMCallback)) {
            return;
        }
        MenstruationModule menstruationModule = (MenstruationModule) y(MenstruationModule.class);
        hMCallback.sendOnFinishMessage(menstruationModule != null ? menstruationModule.setMenstruationOvulationSync(z, i) : false);
    }

    public SportTypeConfig J4() {
        tss tssVarC2;
        if (!V() || (tssVarC2 = this.U.C2()) == null || !tssVarC2.d()) {
            return null;
        }
        List<SportTypeItem> listA = SportTypeConfig.INSTANCE.a(tssVarC2.b());
        if (listA.isEmpty()) {
            return null;
        }
        return new SportTypeConfig(listA, O().A().hasSw(13), O().A().hasSw(14));
    }

    public void K2(ArrayList<ActivityData> arrayList, final HMCallback<Integer> hMCallback) {
        if (!F(OpenAppModule.class)) {
            t5t.d("HMMiLiProDevice", "not support OpenAppModule");
            return;
        }
        OpenAppModule openAppModule = (OpenAppModule) y(OpenAppModule.class);
        hMCallback.sendOnStartMessage();
        if (openAppModule != null) {
            openAppModule.writeActivityData(arrayList, new Function1() { // from class: k9t
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ne.F3(hMCallback, (Integer) obj);
                }
            });
        } else {
            t5t.d("HMMiLiProDevice", "openAppModule is null.");
            hMCallback.sendOnFinishMessage(false);
        }
    }

    public void K3(SportCommand sportCommand, r6t r6tVar, HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        aj ajVar = this.X;
        if (ajVar != null) {
            ajVar.b(sportCommand, r6tVar);
        } else {
            hMCallback.sendOnStartMessage();
            hMCallback.sendOnFinishMessage(false);
        }
    }

    public final /* synthetic */ void K4(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.U.G1((byte) 1));
    }

    public void L2(Calendar calendar, byte b2, HMCallback<List<Spo2Data>> hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        g4s g4sVarO = O();
        z(c1().a(calendar, b2, g4sVarO != null ? g4sVarO.A().hasSw(25) : false, new c(hMCallback)));
    }

    public void L3(SportConfig sportConfig, IHMSportListener iHMSportListener, HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        sportConfig.setNeedDeviceClock(false);
        this.X.a(sportConfig, iHMSportListener);
    }

    public boolean L4(boolean z) {
        if (V()) {
            return this.U.x2(z);
        }
        return false;
    }

    public void M2(Calendar calendar, int i, HMCallback<HmGdspRawData> hMCallback) {
        t5t.d("HMMiLiProDevice", "同步Raw数据");
        z(new ob(this).a(calendar, i, T.a(hMCallback, i)));
    }

    public void M3(Calendar calendar, HMCallback<ArrayList<udt>> hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        z(c1().b(calendar, new b(hMCallback)));
    }

    public List<Integer> M4() {
        return V() ? this.U.D2() : new ArrayList();
    }

    public void N2(Calendar calendar, c0t c0tVar) {
        if (V()) {
            z(c1().a(calendar, c0tVar));
        } else {
            c0tVar.a();
            c0tVar.a(false);
        }
    }

    public void N3(Calendar calendar, ki kiVar) {
        if (V()) {
            z(c1().a(calendar, true, kiVar));
        } else {
            kiVar.onPressureStart();
            kiVar.onPressureStop(false);
        }
    }

    public final /* synthetic */ void N4(HMCallback hMCallback) {
        if (!V()) {
            hMCallback.sendOnFinishMessage((Object) null);
        } else {
            MenstruationModule menstruationModule = (MenstruationModule) y(MenstruationModule.class);
            hMCallback.sendOnFinishMessage(menstruationModule != null ? menstruationModule.syncSettingDataSync() : null);
        }
    }

    public void O2(Calendar calendar, Calendar calendar2, IHMFirstbeatDataCallback iHMFirstbeatDataCallback) {
        t5t.d("HMMiLiProDevice", "sync firstbeat data");
        if (V()) {
            z(new com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.b(this.U, calendar, calendar2, iHMFirstbeatDataCallback));
        } else {
            iHMFirstbeatDataCallback.onStart();
            iHMFirstbeatDataCallback.onFinish(false);
        }
    }

    public void O3(final boolean z, final int i, final HMCallback hMCallback) {
        s(new Runnable() { // from class: s9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f33439a.J3(hMCallback, z, i);
            }
        });
    }

    public boolean O4(boolean z) {
        return V() && this.w.A().hasSw(3) && e1().enablePressure(z);
    }

    public void P2(Calendar calendar, ki kiVar) {
        if (V()) {
            z(c1().a(calendar, false, kiVar));
        } else {
            kiVar.onPressureStart();
            kiVar.onPressureStop(false);
        }
    }

    public void P3(final boolean z, final HMCallback<Boolean> hMCallback) {
        s(new Runnable() { // from class: j9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f22568a.y2(hMCallback, z);
            }
        });
    }

    public final boolean P4() {
        String strD4 = D4();
        t5t.d("HMMiLiProDevice", "properties: " + strD4);
        boolean z = true;
        if (strD4 != null && strD4.contains("READ")) {
            y0(h2.PAIRING);
            BluetoothGattService bluetoothGattServiceP = this.U.p(a6t.UUID_SERVICE_MILI_SERVICE);
            if (bluetoothGattServiceP == null) {
                y0(h2.PAIR_FAIL);
                t5t.d("HMMiLiProDevice", "invokePair service null");
                return false;
            }
            BluetoothGattCharacteristic characteristic = bluetoothGattServiceP.getCharacteristic(i0);
            if (characteristic == null) {
                y0(h2.PAIR_FAIL);
                t5t.d("HMMiLiProDevice", "invokePair characteristic null");
                return false;
            }
            z = this.U.S0(characteristic) != null;
            y0(z ? h2.PAIRED : h2.PAIR_FAIL);
        }
        return z;
    }

    public <T> void Q2(Calendar calendar, yg<T> ygVar) {
        t5t.d("HMMiLiProDevice", "同步Raw数据");
        z(new ob(this).a(calendar, ygVar.getF33603a(), T.a(ygVar)));
    }

    public final boolean Q3(HMLanguage hMLanguage) {
        SettingsModule settingsModule = (SettingsModule) y(SettingsModule.class);
        if (settingsModule == null) {
            t5t.d("HMMiLiProDevice", "setLanguageSyncByWatchSetting settingsModule null");
            return false;
        }
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        es esVar = new es();
        esVar.setGroupVersion(settingsModule.getVersionOrDefault());
        esVar.setLanguage(new EnumData(hMLanguage.getLanguage()));
        map.put(SettingsGroupType.LANGUAGE, esVar);
        return settingsModule.writeSettingSync(map);
    }

    public final /* synthetic */ void Q4(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        ket ketVarX4 = x4();
        if (ketVarX4 != null) {
            this.g0 = ketVarX4;
        }
        hMCallback.sendOnDataMessage(ketVarX4);
        hMCallback.sendOnFinishMessage(ketVarX4 != null);
    }

    public final void R1() {
        try {
            if (this.d0 == null) {
                this.d0 = dn.f15704a.a(this.U);
            }
        } catch (Exception e2) {
            le.c("HMMiLiProDevice", new Function0() { // from class: jat
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ne.f2(e2);
                }
            });
        }
    }

    public void R2(final kk kkVar, final HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: p9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f30156a.w2(hMCallback, kkVar);
            }
        });
    }

    public boolean R3(SportTypeConfig sportTypeConfig) {
        if (V()) {
            return l3(sportTypeConfig);
        }
        return false;
    }

    public boolean R4(final boolean z) {
        if (!V()) {
            le.b("HMMiLiProDevice", new Function0() { // from class: t9t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ne.H4(z);
                }
            });
            return false;
        }
        final boolean zZ2 = this.U.z2(z);
        le.c("HMMiLiProDevice", new Function0() { // from class: u9t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ne.g2(z, zZ2);
            }
        });
        return zZ2;
    }

    @Override // defpackage.n1t
    public void S0(boolean z) {
        if (P4()) {
            super.S0(z);
        } else {
            P0(wt.INIT_FAILED);
        }
    }

    public final void S1() {
        k7 k7VarX1 = X1();
        if (k7VarX1 != null) {
            t5t.d("HMMiLiProDevice", "clear DfuApi");
            k7VarX1.clear();
        }
    }

    public void S2(Function1<MenstrualNotifiedData, Unit> function1) {
        MenstruationModule menstruationModule = (MenstruationModule) y(MenstruationModule.class);
        if (menstruationModule != null) {
            menstruationModule.setMenstrualPeriodDataChangeListener(function1);
        }
    }

    public boolean S3(String str) {
        gm gmVar = this.W;
        if (gmVar == null) {
            return false;
        }
        return gmVar.a(str);
    }

    public boolean S4() {
        gm gmVar;
        if (V() && (gmVar = this.W) != null) {
            return gmVar.b();
        }
        return false;
    }

    public final HeartHealthApi T1() {
        g4s g4sVarO = O();
        Feature featureA = g4sVarO != null ? g4sVarO.A() : new Feature();
        zr zrVarB1 = this.U.b1();
        return zrVarB1 instanceof cs ? new ch(zrVarB1) : new hg(this.U.f(), f1(), featureA);
    }

    public final /* synthetic */ void T2(Function1 function1, MenstrualPeriodData[] menstrualPeriodDataArr) {
        if (!V()) {
            function1.invoke2(Boolean.FALSE);
            return;
        }
        MenstruationModule menstruationModule = (MenstruationModule) y(MenstruationModule.class);
        if (menstruationModule != null) {
            function1.invoke2(Boolean.valueOf(menstruationModule.setPeriodDataSync(menstrualPeriodDataArr)));
        } else {
            function1.invoke2(Boolean.FALSE);
        }
    }

    public final boolean T3(ArrayList<HMForecastWeatherInfo> arrayList) {
        synchronized (this.f0) {
            try {
                if (!V()) {
                    return false;
                }
                wss wssVar = new wss(this.U);
                if (!wssVar.init()) {
                    return false;
                }
                boolean zI = wssVar.i(arrayList);
                wssVar.deInit();
                return zI;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void T4(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        cj cjVarE5 = e5();
        UserInfoExt userInfo = cjVarE5 != null ? cjVarE5.getUserInfo(P()) : null;
        hMCallback.sendOnDataMessage(userInfo);
        hMCallback.sendOnFinishMessage(userInfo != null);
    }

    public HMNFCStatus U1() {
        gm gmVar;
        if (V() && (gmVar = this.W) != null) {
            return gmVar.disconnect();
        }
        return null;
    }

    public void U2(final LogoResponse logoResponse, final HMCallback<Boolean> hMCallback) {
        R1();
        s(new Runnable() { // from class: rat
            @Override // java.lang.Runnable
            public final void run() {
                this.f32365a.x2(hMCallback, logoResponse);
            }
        });
    }

    public boolean U3(List<ews> list) {
        return m8.f25860a.a(this).a(list);
    }

    public ArrayList<AlarmClockExt> V1() {
        if (this.J.a(15)) {
            List<AlarmClockExt> listA = this.J.a();
            if (listA != null) {
                return new ArrayList<>(listA);
            }
            return null;
        }
        ArrayList<AlarmClockExt> arrayListD2 = V() ? this.U.d2() : null;
        t5t.d("HMMiLiProDevice", "getAlarmsSync: " + (arrayListD2 != null ? new JSONArray((Collection) arrayListD2).toString() : AbstractJsonLexerKt.NULL));
        return arrayListD2;
    }

    public final /* synthetic */ void V2(yh yhVar, int i, long j, yd ydVar) {
        boolean zA;
        if (!V()) {
            yhVar.onFwStop(false);
            return;
        }
        k7 k7VarX1 = X1();
        if (k7VarX1 == null) {
            yhVar.onFwStop(false);
            return;
        }
        k7VarX1.b();
        p7 p7Var = new p7();
        try {
            k7VarX1.c(true);
            zA = p7Var.a(k7VarX1, k7VarX1.j(), i, j, ydVar, yhVar);
        } catch (Exception e2) {
            t5t.d("HMMiLiProDevice", "invokeUpgrade exception: " + e2.toString());
            zA = false;
        }
        k7VarX1.c(false);
        k7VarX1.deInit();
        X2(zA, ydVar);
        yhVar.onFwStop(zA);
    }

    public boolean V3(xct xctVar) {
        if (!V()) {
            return false;
        }
        try {
            kh khVarA = u6.f35440a.a(this.U, this);
            if (khVarA == null) {
                return false;
            }
            return khVarA.a(xctVar);
        } catch (Exception e2) {
            t5t.d("HMMiLiProDevice", "Auth exception:" + e2.toString());
            return false;
        }
    }

    public final /* synthetic */ void V4(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.U.a2((byte) 4));
    }

    public boolean W1() {
        gm gmVar = this.W;
        if (gmVar == null) {
            return false;
        }
        return gmVar.e();
    }

    public void W2(final boolean z, final int i, final HMCallback hMCallback) {
        s(new Runnable() { // from class: y9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f39970a.z2(hMCallback, z, i);
            }
        });
    }

    public final boolean W3(boolean z, String str) {
        SettingsModule settingsModule = (SettingsModule) y(SettingsModule.class);
        if (settingsModule == null) {
            return false;
        }
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        ScreenLockAndPassword screenLockAndPassword = new ScreenLockAndPassword();
        screenLockAndPassword.setSwitch(Boolean.valueOf(z));
        screenLockAndPassword.setPassword(new StringData(str));
        map.put(SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD, screenLockAndPassword);
        return settingsModule.writeSettingSync(map);
    }

    public k7 X1() {
        String str;
        if (this.c0 == null) {
            str = "DfuApi is null";
        } else {
            str = "DfuApi:" + this.c0.hashCode();
        }
        t5t.d("HMMiLiProDevice", str);
        return this.c0;
    }

    public final void X2(boolean z, yd ydVar) {
        if (z && z3(ydVar)) {
            v0(this.u.Z0());
        }
    }

    public UpgradeStatus X3() {
        k7 k7VarX1;
        if (V() && (k7VarX1 = X1()) != null && k7VarX1.b()) {
            try {
                return k7VarX1.b(false).getUpgradeStatus();
            } catch (Exception e2) {
                t5t.d("HMMiLiProDevice", "getDfuV5UpgradeStatus: " + e2.toString());
                return UpgradeStatus.IDLE;
            } finally {
                k7VarX1.deInit();
            }
        }
        return UpgradeStatus.IDLE;
    }

    public final /* synthetic */ void X4(HMCallback hMCallback) {
        Progress progress = new Progress();
        k7 k7VarX1 = X1();
        if (k7VarX1 == null) {
            hMCallback.sendOnFinishMessage(false);
            return;
        }
        k7VarX1.b();
        while (true) {
            try {
                UpgradeStatueResponse upgradeStatueResponseB = k7VarX1.b(true);
                if (upgradeStatueResponseB.getUpgradeStatus() != UpgradeStatus.IN_UPGRADING) {
                    break;
                }
                progress.total = upgradeStatueResponseB.getFirmwareSize();
                progress.progress = upgradeStatueResponseB.getFirmwareUpgradedSize();
                hMCallback.sendOnProgressMessage(progress);
                try {
                    Thread.sleep(5000L);
                } catch (Exception unused) {
                }
            } catch (Exception e2) {
                t5t.d("HMMiLiProDevice", "query: " + e2);
            }
        }
        t5t.d("HMMiLiProDevice", "升级成功，刷新下版本号");
        try {
            g4s g4sVarZ0 = V() ? this.u.Z0() : null;
            if (g4sVarZ0 != null) {
                v0(g4sVarZ0);
            }
        } catch (Exception e3) {
            t5t.d("HMMiLiProDevice", "registerUpgradeCallback refreshDeviceInfo: " + e3);
        }
        hMCallback.sendOnFinishMessage(true);
        k7VarX1.deInit();
    }

    @Override // defpackage.me, defpackage.n1t, defpackage.kd
    public void Y() {
        super.Y();
        igt igtVar = this.V;
        if (igtVar != null) {
            igtVar.g();
        }
        x7t x7tVar = this.U;
        if (x7tVar != null) {
            x7tVar.o();
        }
    }

    public DfuState Y1() {
        g4s g4sVarO;
        if (!V() || (g4sVarO = O()) == null) {
            return new DfuState();
        }
        return new DfuState(g4sVarO.A().hasBase(3) ? C3() : D3(g4sVarO));
    }

    public void Y2(final MenstrualPeriodData[] menstrualPeriodDataArr, final Function1<Boolean, Unit> function1) {
        s(new Runnable() { // from class: iat
            @Override // java.lang.Runnable
            public final void run() {
                this.f20957a.T2(function1, menstrualPeriodDataArr);
            }
        });
    }

    public void Y3(final int i, final HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: f9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f17580a.l2(i, hMCallback);
            }
        });
    }

    public final /* synthetic */ void Y4() {
        ycs ycsVarD0 = d0();
        t5t.d("HMMiLiProDevice", "WAKE_UP step:" + ycsVarD0);
        if (ycsVarD0 != null) {
            l(ycsVarD0);
        }
    }

    public HMCardTSResponse<Boolean> Z1(HMCardSwitchTime hMCardSwitchTime) {
        gm gmVar;
        if (!V() || hMCardSwitchTime == null || (gmVar = this.W) == null) {
            return null;
        }
        return gmVar.a(hMCardSwitchTime);
    }

    public boolean Z2(byte b2) {
        synchronized (this.f0) {
            try {
                if (b2 < 0) {
                    return false;
                }
                if (!V()) {
                    return false;
                }
                dj djVarA = bx.a(this.U);
                if (!djVarA.init()) {
                    return false;
                }
                boolean zA = djVarA.a(b2);
                djVarA.deInit();
                return zA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void Z3(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.U.m2(z));
    }

    public final /* synthetic */ void Z4(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        fos fosVar = this.Q;
        hMCallback.sendOnFinishMessage(fosVar != null && fosVar.a());
    }

    @Override // defpackage.xo
    public void a(ap apVar) {
    }

    public HMCardTSResponse<List<HMCardSwitchTime>> a2(String str, int i) {
        gm gmVar;
        if (!V() || TextUtils.isEmpty(str) || (gmVar = this.W) == null) {
            return null;
        }
        return gmVar.a(str, i);
    }

    public boolean a3(HidStatus hidStatus) {
        return this.U.I1(hidStatus);
    }

    public void a4(Calendar calendar, HMCallback<List<ActivityData>> hMCallback) {
        z(new ob(this).a(calendar, new f(hMCallback)));
    }

    @Override // defpackage.wl
    public void b(@NotNull zl zlVar) {
    }

    public ApduResponse b2(ApduRequest apduRequest) {
        if (this.W != null && V()) {
            return apduRequest.getType() == HMNFCCardType.MASTERCARD ? this.W.a(apduRequest.getData(), apduRequest.getDataLen()) : this.W.a(apduRequest.getData(), apduRequest.getDataLen(), apduRequest.isEncrypt());
        }
        return null;
    }

    public boolean b3(@NotNull StandAlertConfig standAlertConfig) {
        if (V()) {
            return this.U.J1(standAlertConfig);
        }
        return false;
    }

    public void b4(final boolean z, final HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: x9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f38901a.I3(hMCallback, z);
            }
        });
    }

    public void b5(final HMCallback<Integer> hMCallback) {
        s(new Runnable() { // from class: q9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f31267a.X4(hMCallback);
            }
        });
    }

    @Override // defpackage.ta
    public void c(@NotNull HMCallback<?> hMCallback) {
        o4(hMCallback);
    }

    public ApduResponse c2(byte[] bArr) {
        gm gmVar = this.W;
        if (gmVar == null) {
            return null;
        }
        return gmVar.a(bArr);
    }

    public boolean c3(HMAccessInfo hMAccessInfo) {
        gm gmVar;
        if (V() && (gmVar = this.W) != null) {
            return gmVar.a(hMAccessInfo);
        }
        return false;
    }

    public boolean c4(List<ews> list) {
        return V() && this.U.R1(this.w == null ? new Feature() : this.w.A(), list);
    }

    public HMNFCCardStatus d2(HMNFCCardConfig hMNFCCardConfig) {
        gm gmVar;
        if (V() && (gmVar = this.W) != null) {
            return gmVar.a(hMNFCCardConfig);
        }
        return null;
    }

    public boolean d3(HMAidInfo hMAidInfo) {
        gm gmVar;
        if (!V() || hMAidInfo == null || (gmVar = this.W) == null) {
            return false;
        }
        return gmVar.a(hMAidInfo);
    }

    public DialVersion d4() {
        return this.U.l2();
    }

    public void d5(HMCallback<q1t> hMCallback) {
        this.Y = hMCallback;
    }

    public HMNFCStatus e2(w1t w1tVar) {
        gm gmVar;
        if (V() && (gmVar = this.W) != null) {
            return gmVar.a(w1tVar);
        }
        return null;
    }

    public boolean e3(HMAutoBacklightInfo hMAutoBacklightInfo) {
        t5t.d("HMMiLiProDevice", "AutoBackLightInfo: " + hMAutoBacklightInfo);
        if (!V() || hMAutoBacklightInfo == null) {
            return false;
        }
        return this.U.K1(hMAutoBacklightInfo);
    }

    public final /* synthetic */ void e4(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(w4(z));
    }

    public final cj e5() {
        if (!V()) {
            t5t.d("HMMiLiProDevice", "return userProfile for not connected.");
            return this.b0;
        }
        if (this.b0.n() == null) {
            t5t.d("HMMiLiProDevice", "return UserInfoModule");
            return (cj) y(UserInfoModule.class);
        }
        t5t.d("HMMiLiProDevice", "return userProfile");
        return this.b0;
    }

    public boolean f3(HMHrReminder hMHrReminder) {
        if (!V() || hMHrReminder == null) {
            return false;
        }
        return e1().setHrReminder(hMHrReminder);
    }

    public void f4(final boolean z, final HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: fat
            @Override // java.lang.Runnable
            public final void run() {
                this.f17617a.Z3(hMCallback, z);
            }
        });
    }

    public void f5(final HMCallback<Boolean> hMCallback) {
        if (!F(OpenAppModule.class)) {
            t5t.d("HMMiLiProDevice", "not support OpenAppModule");
            hMCallback.onFinish(false);
            return;
        }
        OpenAppModule openAppModule = (OpenAppModule) y(OpenAppModule.class);
        if (openAppModule != null) {
            openAppModule.queryVersion(new Function1() { // from class: qat
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ne.i2(hMCallback, (Integer) obj);
                }
            });
        } else {
            t5t.d("HMMiLiProDevice", "openAppModule is null.");
            hMCallback.onFinish(false);
        }
    }

    @Override // defpackage.me
    public synchronized kvs g1() {
        if (H(34)) {
            return new xg(this.U, this);
        }
        return new kvs(this.U, this);
    }

    public boolean g3(HMLanguage hMLanguage) {
        boolean zL1;
        com.xiaomi.hm.health.bt.profile.base.a aVarB1;
        if (!V()) {
            return false;
        }
        if (this.w.k0().getIsContainLanguageGroup()) {
            zL1 = Q3(hMLanguage);
        } else {
            zL1 = this.w.k0().getIsContainLanguageFeature() ? this.U.L1(hMLanguage) : this.U.U1(hMLanguage.getLang());
        }
        if (zL1 && (aVarB1 = this.U.B1(this.w.I())) != null) {
            this.w.D(aVarB1);
        }
        return zL1;
    }

    public boolean g4(List<HMReminderInfo> list) {
        g4s g4sVarO;
        if (list == null || list.size() == 0 || !V() || (g4sVarO = O()) == null) {
            return false;
        }
        boolean zN1 = true;
        if (F(EventReminderModule.class)) {
            EventReminderModule eventReminderModule = (EventReminderModule) y(EventReminderModule.class);
            return eventReminderModule != null && eventReminderModule.handleAmbiguousOperationsSync((HMReminderInfo[]) list.toArray(new HMReminderInfo[list.size()]));
        }
        int i = !g4sVarO.y() ? 1 : 0;
        Iterator<HMReminderInfo> it = list.iterator();
        while (it.hasNext()) {
            zN1 &= this.U.N1(it.next(), i);
        }
        return zN1;
    }

    public PasswordInteractionResponse g5() {
        gm gmVar = this.W;
        if (gmVar == null) {
            return null;
        }
        return gmVar.c();
    }

    public boolean h3(HMLiftWristConfig hMLiftWristConfig) {
        g4s g4sVarO = O();
        Feature featureA = g4sVarO == null ? null : g4sVarO.A();
        if (featureA != null && featureA.hasSw(19)) {
            return i3(hMLiftWristConfig, null);
        }
        if (g4sVarO == null) {
            return false;
        }
        qd qdVarI = g4sVarO.I();
        return (qdVarI == qd.Z || qdVarI == qd.b0 || qdVarI == qd.f0 || qdVarI == qd.c0 || qdVarI == qd.a0) ? this.U.v2(hMLiftWristConfig.isEnable()) : this.U.M1(hMLiftWristConfig);
    }

    public ArrayList<HMLanguage> h4() {
        g4s g4sVarZ0;
        if (V() && (g4sVarZ0 = this.U.Z0()) != null) {
            return new ArrayList<>(g4sVarZ0.k0().a());
        }
        return null;
    }

    public void h5(final HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: w9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f37747a.Z4(hMCallback);
            }
        });
    }

    @Override // defpackage.oht
    public void i(bht bhtVar) {
        HMCallback<bht> hMCallback = this.Z;
        if (hMCallback != null) {
            hMCallback.sendOnDataMessage(bhtVar);
        }
    }

    public final boolean i3(HMLiftWristConfig hMLiftWristConfig, Integer num) {
        SettingsModule settingsModule = (SettingsModule) y(SettingsModule.class);
        int i = 0;
        if (settingsModule == null) {
            return false;
        }
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        j8 j8Var = new j8();
        j8Var.setGroupVersion(settingsModule.getVersionOrDefault());
        if (hMLiftWristConfig != null) {
            if (hMLiftWristConfig.isAllDay()) {
                i = 2;
            } else if (hMLiftWristConfig.isEnable()) {
                i = 1;
            }
            EnumData enumData = new EnumData(i);
            Time time = new Time(hMLiftWristConfig.getStartHour(), hMLiftWristConfig.getStartMinutes());
            Time time2 = new Time(hMLiftWristConfig.getStopHour(), hMLiftWristConfig.getStopMinutes());
            j8Var.setScreenOnByTurningWristMode(enumData);
            j8Var.setScreenOnByTurningWristBeginTime(time);
            j8Var.setScreenOnByTurningWristEndTime(time2);
        }
        if (num != null) {
            j8Var.setScreenOnByTurningWristActiveSpeed(new EnumData(num.intValue()));
        }
        map.put(SettingsGroupType.DISPLAY, j8Var);
        return settingsModule.writeSettingSync(map);
    }

    public final /* synthetic */ void i4(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.U.r2(z));
    }

    public boolean i5() {
        return this.W != null && V() && this.W.f();
    }

    @Override // defpackage.me, defpackage.n1t
    public void j0() {
        ConnectModule connectModule;
        S1();
        g4s g4sVarO = O();
        gm gmVarA = hm.f20224a.a(this.U);
        this.W = gmVarA;
        if (gmVarA != null) {
            gmVarA.a(this);
        }
        this.X = nt.f28342a.a(this.U, this);
        if (g4sVarO != null) {
            if (HMDeviceFeature.hasFeatureAlarmSync(g4sVarO.I())) {
                this.g0 = x4();
                t5t.d("HMMiLiProDevice", "settings:" + this.g0);
            }
            if (z3t.f(this.U)) {
                z3t z3tVar = new z3t(this.U, Q());
                z3tVar.c(this);
                z3tVar.e();
            }
            if (lht.c(this.U)) {
                lht lhtVar = new lht(this.U);
                this.a0 = lhtVar;
                lhtVar.b(this);
                this.a0.init();
            }
            fos fosVar = this.Q;
            if (fosVar != null) {
                fosVar.f();
            }
            if (F(ConnectModule.class) && (connectModule = (ConnectModule) y(ConnectModule.class)) != null) {
                connectModule.registerEventListener(Q(), this);
            }
            this.d0 = dn.f15704a.a(this.U);
            this.e0 = new gn(this.U);
        }
        super.j0();
    }

    @Override // defpackage.me
    public boolean j1(ivs ivsVar) {
        qd qdVarI;
        if (!V()) {
            t5t.d("HMMiLiProDevice", "alertSync return as no connection!!!");
            return false;
        }
        if (ivsVar.h() == fd.ALERT_FIND && F(ObsoleteModule.class)) {
            ObsoleteModule obsoleteModule = (ObsoleteModule) y(ObsoleteModule.class);
            if (obsoleteModule == null) {
                return false;
            }
            return obsoleteModule.getObsoleteApi().a(new byte[]{3});
        }
        g4s g4sVarO = O();
        boolean z = g4sVarO != null && ((qdVarI = g4sVarO.I()) == qd.c0 || qdVarI == qd.Z || qdVarI == qd.b0 || qdVarI == qd.a0 || qdVarI == qd.f0);
        if (ivsVar.h() == fd.ALERT_LOVE && !z) {
            ivsVar = new ivs(HMAlertApp.CARE, ivsVar.j(), ivsVar.g());
        }
        boolean z2 = !z || g4sVarO.U() >= ProfileUtils.getVersionCodeFromVersionName("V1.0.1.63");
        fos fosVar = this.Q;
        return fosVar != null && fosVar.d(ivsVar, z2, H(26));
    }

    public final /* synthetic */ Unit j2(xd xdVar, Boolean bool) {
        if (xdVar.f() != xd.a.CONTINUE || xdVar.e().e() || !bool.booleanValue()) {
            X2(bool.booleanValue(), xdVar.h());
        }
        return Unit.INSTANCE;
    }

    public boolean j3(HMTarget hMTarget) {
        if (V()) {
            return this.U.P1(hMTarget);
        }
        return false;
    }

    public void j4(final boolean z, final HMCallback hMCallback) {
        s(new Runnable() { // from class: bat
            @Override // java.lang.Runnable
            public final void run() {
                this.f4000a.e4(hMCallback, z);
            }
        });
    }

    public boolean j5() {
        gm gmVar = this.W;
        if (gmVar == null) {
            return false;
        }
        return gmVar.a();
    }

    @Override // defpackage.n1t
    public void k0() {
        aj ajVar = this.X;
        if (ajVar != null) {
            ajVar.a();
        }
        fos fosVar = this.Q;
        if (fosVar != null) {
            fosVar.e();
        }
        super.k0();
    }

    public igt k2(x7t x7tVar) {
        return new igt(x7tVar, this);
    }

    public boolean k3(UserInfoExt userInfoExt) {
        cj cjVarE5;
        return V() && (cjVarE5 = e5()) != null && cjVarE5.setUserInfo(userInfoExt);
    }

    public Boolean k4() {
        if (V()) {
            return this.U.s2();
        }
        return null;
    }

    public final /* synthetic */ void l2(int i, HMCallback hMCallback) {
        t5t.d("HMMiLiProDevice", "setStepTarget to ProDevice--->" + i);
        hMCallback.sendOnStartMessage();
        cj cjVarE5 = e5();
        hMCallback.sendOnFinishMessage(cjVarE5 != null && cjVarE5.setGoal(i));
    }

    public synchronized boolean l3(SportTypeConfig sportTypeConfig) {
        return B3(sportTypeConfig.toCommand(), 9);
    }

    public final /* synthetic */ void l4(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.U.a2(z ? (byte) 1 : (byte) 0));
    }

    public void m2(final long j, final int i, final yd ydVar, final yh yhVar) {
        s(new Runnable() { // from class: hat
            @Override // java.lang.Runnable
            public final void run() {
                this.f19894a.V2(yhVar, i, j, ydVar);
            }
        });
    }

    public boolean m3(ExtensionInfo extensionInfo) {
        synchronized (this.f0) {
            try {
                if (!V()) {
                    return false;
                }
                wss wssVar = new wss(this.U);
                if (!wssVar.init()) {
                    return false;
                }
                boolean zB = wssVar.b(extensionInfo);
                wssVar.deInit();
                return zB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m4(final boolean z, final HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: n9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f27692a.i4(hMCallback, z);
            }
        });
    }

    @Override // defpackage.me, defpackage.kd
    public <T> T n(Class<T> cls) {
        if (cls != HealthModule.class) {
            return (T) super.n(cls);
        }
        if (this.U == null) {
            return null;
        }
        return (T) new HealthModule(T1());
    }

    public void n2(final long j, final long j2, final HMCallback<Boolean> hMCallback) {
        s(new Runnable() { // from class: h9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f19845a.p2(hMCallback, j, j2);
            }
        });
    }

    public final boolean n3(HMRealtimeAqi hMRealtimeAqi) {
        synchronized (this.f0) {
            try {
                if (!V()) {
                    return false;
                }
                wss wssVar = new wss(this.U);
                if (!wssVar.init()) {
                    return false;
                }
                boolean zC = wssVar.c(hMRealtimeAqi);
                wssVar.deInit();
                return zC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public HMNFCCardInfo n4() {
        gm gmVar;
        if (V() && (gmVar = this.W) != null) {
            return gmVar.d();
        }
        return null;
    }

    public final /* synthetic */ void o2(HMCallback hMCallback, int i) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.U.q2(i));
    }

    public final boolean o3(HMRealtimeWeatherInfo hMRealtimeWeatherInfo) {
        synchronized (this.f0) {
            try {
                if (!V()) {
                    return false;
                }
                wss wssVar = new wss(this.U);
                if (!wssVar.init()) {
                    return false;
                }
                boolean zD = wssVar.d(hMRealtimeWeatherInfo);
                wssVar.deInit();
                return zD;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o4(final HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: lat
            @Override // java.lang.Runnable
            public final void run() {
                this.f24842a.I4(hMCallback);
            }
        });
    }

    public final /* synthetic */ void p2(HMCallback hMCallback, long j, long j2) {
        if (I(hMCallback)) {
            return;
        }
        hMCallback.sendOnFinishMessage(this.U.H1(j, j2));
    }

    public boolean p3(HMSunriseSunsetInfo hMSunriseSunsetInfo) {
        t5t.d("HMMiLiProDevice", "rsInfo: " + hMSunriseSunsetInfo);
        synchronized (this.f0) {
            try {
                if (!V()) {
                    return false;
                }
                wss wssVar = new wss(this.U);
                if (!wssVar.init()) {
                    return false;
                }
                boolean zF = wssVar.f(hMSunriseSunsetInfo);
                wssVar.deInit();
                return zF;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void p4(HMCallback hMCallback, boolean z) {
        if (I(hMCallback)) {
            return;
        }
        MenstruationModule menstruationModule = (MenstruationModule) y(MenstruationModule.class);
        hMCallback.sendOnFinishMessage(menstruationModule != null ? menstruationModule.switchMenstruationDeviceNotifySync(z) : false);
    }

    @Override // defpackage.n1t
    public yus q0(Context context, BluetoothDevice bluetoothDevice) {
        x7t x7tVarG3 = G3(context, bluetoothDevice);
        this.U = x7tVarG3;
        this.V = k2(x7tVarG3);
        this.Q = new fos(this.U);
        this.b0 = new kks(this.U);
        this.c0 = new pm(this.U);
        return this.U;
    }

    public final /* synthetic */ void q2(HMCallback hMCallback, HMLiftWristConfig hMLiftWristConfig) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(h3(hMLiftWristConfig));
    }

    public final boolean q3(HMWindAndHumidityInfo hMWindAndHumidityInfo) {
        synchronized (this.f0) {
            try {
                if (!V()) {
                    return false;
                }
                wss wssVar = new wss(this.U);
                if (!wssVar.init()) {
                    return false;
                }
                boolean zG = wssVar.g(hMWindAndHumidityInfo);
                wssVar.deInit();
                return zG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q4(final boolean z, final HMCallback hMCallback) {
        s(new Runnable() { // from class: cat
            @Override // java.lang.Runnable
            public final void run() {
                this.f5142a.p4(hMCallback, z);
            }
        });
    }

    public final /* synthetic */ void r2(HMCallback hMCallback, HMSedentaryConfig hMSedentaryConfig) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.U.O1(hMSedentaryConfig));
    }

    public boolean r3(qos qosVar) {
        t5t.d("HMMiLiProDevice", "vibrateInfo: " + qosVar);
        r5 r5VarA = t5.a(this);
        if (r5VarA == null) {
            return false;
        }
        return r5VarA.setCustomVibrate(qosVar);
    }

    public boolean r4(boolean z) {
        return V() && this.U.f2(z);
    }

    @Override // defpackage.n1t
    public AuthResult s0(xct xctVar, dts dtsVar) {
        if (!xctVar.g()) {
            return new AuthResult(0, rm.u);
        }
        try {
            kh khVarA = u6.f35440a.a(this.U, this);
            return khVarA == null ? new AuthResult(4, y.NO_AUTH_IMPL) : khVarA.a(xctVar, dtsVar);
        } catch (Exception e2) {
            t5t.d("HMMiLiProDevice", "Auth exception:" + e2.toString());
            return new AuthResult(4, y.AUTH_EXCEPTION);
        }
    }

    public final /* synthetic */ void s2(HMCallback hMCallback, HMTarget hMTarget) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(j3(hMTarget));
    }

    public boolean s3(fd fdVar, boolean z) {
        if (V()) {
            return this.U.T1(fdVar, z);
        }
        return false;
    }

    public Boolean s4() {
        if (V()) {
            return this.U.A2();
        }
        return null;
    }

    public final /* synthetic */ void t2(HMCallback hMCallback, HMMusicControl hMMusicControl) {
        hMCallback.sendOnStartMessage();
        wl wlVarA = xl.f39223a.a(this);
        if (wlVarA == null) {
            hMCallback.sendOnFinishMessage(false);
        } else {
            hMCallback.sendOnFinishMessage(wlVarA.a(hMMusicControl));
        }
    }

    public final boolean t3(String str) {
        synchronized (this.f0) {
            try {
                if (!V()) {
                    return false;
                }
                wss wssVar = new wss(this.U);
                if (!wssVar.init()) {
                    return false;
                }
                boolean zH = wssVar.h(str);
                wssVar.deInit();
                return zH;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t4(final HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: e9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f16435a.K4(hMCallback);
            }
        });
    }

    public final /* synthetic */ void u2(HMCallback hMCallback, qos qosVar) {
        hMCallback.sendOnStartMessage();
        qosVar.c = true;
        boolean zR3 = r3(qosVar);
        qosVar.c = false;
        t5t.d("HMMiLiProDevice", "testRet: " + zR3);
        hMCallback.sendOnFinishMessage(r3(qosVar));
    }

    public boolean u3(ArrayList<Integer> arrayList) {
        boolean zV1 = this.U.V1(arrayList);
        t5t.d("HMMiLiProDevice", "deleteDials result: " + zV1);
        return V() && zV1;
    }

    public final /* synthetic */ void u4(HMCallback hMCallback, boolean z) {
        if (I(hMCallback)) {
            return;
        }
        MenstruationModule menstruationModule = (MenstruationModule) y(MenstruationModule.class);
        hMCallback.sendOnFinishMessage(menstruationModule != null ? menstruationModule.switchSmartPredictSync(z) : false);
    }

    public final /* synthetic */ void v2(final HMCallback hMCallback, fn fnVar) {
        hMCallback.sendOnStartMessage();
        if (!V()) {
            le.c("HMMiLiProDevice", new Function0() { // from class: kat
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ne.U4();
                }
            });
            hMCallback.onFinish(false);
            return;
        }
        wm wmVar = this.d0;
        if (wmVar != null) {
            wmVar.a(fnVar, new Function1() { // from class: nat
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ne.h2(hMCallback, (Boolean) obj);
                }
            });
        } else {
            le.c("HMMiLiProDevice", new Function0() { // from class: mat
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ne.W4();
                }
            });
            hMCallback.onFinish(false);
        }
    }

    public boolean v3(List<AlarmClockExt> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        if (this.J.a(15)) {
            return this.J.a(list);
        }
        boolean z = true;
        for (AlarmClockExt alarmClockExt : list) {
            boolean zS1 = this.U.S1(alarmClockExt);
            t5t.d("HMMiLiProDevice", "setAlarmSync alarm:" + alarmClockExt + ",ret:" + zS1);
            z = zS1;
        }
        return z;
    }

    public void v4(final boolean z, final HMCallback hMCallback) {
        s(new Runnable() { // from class: l9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f24812a.u4(hMCallback, z);
            }
        });
    }

    public final /* synthetic */ void w2(HMCallback hMCallback, kk kkVar) {
        boolean zX3;
        hMCallback.sendOnStartMessage();
        g4s g4sVarO = O();
        Feature featureA = g4sVarO == null ? null : g4sVarO.A();
        if (featureA == null || !featureA.hasSw(19)) {
            cj cjVarE5 = e5();
            zX3 = cjVarE5 != null && cjVarE5.setLocation(kkVar);
        } else {
            zX3 = x3(kkVar);
        }
        hMCallback.sendOnFinishMessage(zX3);
    }

    public boolean w3(List<HMNFCCardIdent> list, HMNFCCardType hMNFCCardType) {
        return this.W != null && V() && this.W.a(list, hMNFCCardType);
    }

    public boolean w4(boolean z) {
        return V() && this.U.o2(z);
    }

    public final /* synthetic */ void x2(HMCallback hMCallback, LogoResponse logoResponse) {
        hMCallback.sendOnStartMessage();
        wm wmVar = this.d0;
        if (wmVar instanceof bn) {
            ((bn) wmVar).a(logoResponse, new e(hMCallback));
        } else {
            le.c("HMMiLiProDevice", new Function0() { // from class: gat
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ne.a5();
                }
            });
            hMCallback.onFinish(false);
        }
    }

    public final boolean x3(kk kkVar) {
        SettingsModule settingsModule = (SettingsModule) y(SettingsModule.class);
        if (settingsModule == null) {
            return false;
        }
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        xw xwVar = new xw();
        xwVar.setGroupVersion(settingsModule.getVersionOrDefault());
        if (!kkVar.d().equals(kk.b.WRIST) && !kkVar.d().equals(kk.b.CHEST)) {
            return false;
        }
        xwVar.setWearingWay(new EnumData(kkVar.a().a()));
        map.put(SettingsGroupType.WEARING, xwVar);
        return settingsModule.writeSettingSync(map);
    }

    public final ket x4() {
        try {
            return this.U.e2();
        } catch (Exception e2) {
            t5t.m("HMMiLiProDevice", "getPeytoSettingSync exception:" + e2.getMessage());
            return null;
        }
    }

    public final /* synthetic */ void y2(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        zr zrVarB1 = this.U.b1();
        if (zrVarB1 == null) {
            hMCallback.sendOnFinishMessage(false);
        } else {
            hMCallback.sendOnFinishMessage(zrVarB1.d(z));
        }
    }

    public boolean y3(Function0<HMWeatherInfo> function0) {
        boolean zN3;
        boolean zT3;
        boolean zO3;
        boolean zM3;
        boolean zQ3;
        HMWeatherInfo hMWeatherInfoInvoke = function0.invoke();
        if (hMWeatherInfoInvoke == null) {
            return false;
        }
        String cityInfo = hMWeatherInfoInvoke.getCityInfo();
        boolean zP3 = true;
        boolean zT4 = !TextUtils.isEmpty(cityInfo) ? t3(cityInfo) : true;
        t5t.d("HMMiLiProDevice", "setCity: " + zT4);
        boolean zZ2 = Z2(hMWeatherInfoInvoke.getTempUnit());
        t5t.d("HMMiLiProDevice", "tempUnit: " + ((int) hMWeatherInfoInvoke.getTempUnit()) + ", ret: " + zZ2);
        boolean z = zT4 & zZ2;
        HMRealtimeAqi aqiInfo = hMWeatherInfoInvoke.getAqiInfo();
        if (aqiInfo != null) {
            zN3 = n3(aqiInfo);
            z &= zN3;
        } else {
            zN3 = true;
        }
        t5t.d("HMMiLiProDevice", "setAqi: " + zN3);
        ArrayList<HMForecastWeatherInfo> forecastInfo = hMWeatherInfoInvoke.getForecastInfo();
        if (forecastInfo == null || forecastInfo.size() <= 0) {
            zT3 = true;
        } else {
            zT3 = T3(forecastInfo);
            z &= zT3;
        }
        t5t.d("HMMiLiProDevice", "forecast ret: " + zT3);
        HMRealtimeWeatherInfo realtimeInfo = hMWeatherInfoInvoke.getRealtimeInfo();
        if (realtimeInfo != null) {
            zO3 = o3(realtimeInfo);
            z &= zO3;
        } else {
            zO3 = true;
        }
        t5t.d("HMMiLiProDevice", "realtimeRet: " + zO3);
        ExtensionInfo extensionInfo = hMWeatherInfoInvoke.getExtensionInfo();
        if (extensionInfo != null) {
            zM3 = m3(extensionInfo);
            z &= zM3;
        } else {
            zM3 = true;
        }
        t5t.d("HMMiLiProDevice", "extensionInfoRet: " + zM3);
        HMWindAndHumidityInfo windAndHumidityInfo = hMWeatherInfoInvoke.getWindAndHumidityInfo();
        if (windAndHumidityInfo != null) {
            zQ3 = q3(windAndHumidityInfo);
            z &= zQ3;
        } else {
            zQ3 = true;
        }
        t5t.d("HMMiLiProDevice", "windAndHumidityRet: " + zQ3);
        HMSunriseSunsetInfo sunriseSunsetInfo = hMWeatherInfoInvoke.getSunriseSunsetInfo();
        if (sunriseSunsetInfo != null) {
            zP3 = p3(sunriseSunsetInfo);
            z &= zP3;
        }
        t5t.d("HMMiLiProDevice", "sunriseSunsetRet: " + zP3);
        return z;
    }

    public void y4(final HMCallback<MenstruationConfig> hMCallback) {
        s(new Runnable() { // from class: pat
            @Override // java.lang.Runnable
            public final void run() {
                this.f30180a.N4(hMCallback);
            }
        });
    }

    public final /* synthetic */ void z2(HMCallback hMCallback, boolean z, int i) {
        if (I(hMCallback)) {
            return;
        }
        MenstruationModule menstruationModule = (MenstruationModule) y(MenstruationModule.class);
        hMCallback.sendOnFinishMessage(menstruationModule != null ? menstruationModule.setMenstruationNotifySync(z, i) : false);
    }

    public final boolean z3(yd ydVar) {
        if (ydVar == yd.FIRMWARE_BATCH) {
            return V();
        }
        return ydVar == yd.FIRMWARE_GPS || ydVar == yd.FONT || ydVar == yd.FONT_LATIN || ydVar == yd.RESOURCE || ydVar == yd.RESOURCE_COMPRESS || ydVar == yd.RESOURCE_BASE;
    }

    public boolean z4(boolean z) {
        if (V()) {
            return e1().setSleepAssistantEnable(z);
        }
        return false;
    }

    @Override // defpackage.wl
    public void a(@NotNull zl zlVar) {
    }

    @Override // defpackage.xo
    public void b(final HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: sat
            @Override // java.lang.Runnable
            public final void run() {
                this.f33473a.V4(hMCallback);
            }
        });
    }

    @Override // defpackage.zbt
    public void a(q1t q1tVar) {
        t5t.d("HMMiLiProDevice", "HMLFEvent:" + q1tVar);
        HMCallback<q1t> hMCallback = this.Y;
        if (hMCallback != null) {
            hMCallback.sendOnDataMessage(q1tVar);
        }
        if (q1tVar.c() == ik.WAKE_UP) {
            s(new Runnable() { // from class: aat
                @Override // java.lang.Runnable
                public final void run() {
                    this.f844a.Y4();
                }
            });
        }
    }

    @Override // defpackage.bj
    public void b(int i) {
        t5t.d("HMMiLiProDevice", "On trade:" + i);
        if (this.Y != null) {
            this.Y.sendOnDataMessage(new q1t(sd.MILI, ik.NFC_TRADE));
        }
    }

    @Override // defpackage.ta
    public void a(@NotNull HMCallback<?> hMCallback) {
        t4(hMCallback);
    }

    @Override // defpackage.wl
    public boolean a(@NotNull HMMusicControl hMMusicControl) {
        return new vfs(this.U).a(hMMusicControl);
    }

    @Override // defpackage.xo
    public void a(final boolean z, final HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: o9t
            @Override // java.lang.Runnable
            public final void run() {
                this.f28905a.l4(hMCallback, z);
            }
        });
    }
}

package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.model.statistic.BaseEarbudStatistic;
import com.xiaomi.hm.health.bt.model.statistic.EarbudStatistic;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.HmEarbudDfuTask;
import com.xiaomi.hm.health.bt.profile.dfu.HmVoiceType;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.earbud.model.CurrentMusicState;
import com.xiaomi.hm.health.bt.profile.earbud.model.MusicControlCmd;
import com.xiaomi.hm.health.bt.profile.earbud.model.MusicInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.MusicPlayInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import com.xiaomi.hm.health.bt.proxy.ProxyContainer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class HmEarbudDevice extends HmBaseEarbudDevice {
    private static final int T = 4;
    private static final int U = 5;
    private static final String V = "HmEarbudDevice";
    private static final String W = "rest_time";
    private static final String X = "tomato_time";
    private static final String Y = "_pre";
    private static final String Z = "_";
    private HmBaseEarbudDevice H;
    private IHMConnectionCallback I;
    private IHMAuthCallback J;
    private HMCallback<BatteryInfo> K;
    private OnEarbudLRConnectChangeListener L;
    private AtomicBoolean M;
    private AtomicBoolean N;
    private AtomicBoolean O;
    private AtomicBoolean P;
    private AtomicBoolean Q;
    private HmBaseEarbudDevice.c R;
    private static final HashMap<String, HMDeviceSource> S = new a();
    private static Set<HmEarbudDfuTask> m0 = Collections.synchronizedSet(new HashSet());

    public interface OnEarbudLRConnectChangeListener {
        void onChange(boolean isConnect);
    }

    public class a extends HashMap<String, HMDeviceSource> {
        public a() {
            putAll(ProxyContainer.getProxy().getEarbudNames());
        }
    }

    public class b implements HmEarbudDfuTask.MusicControlCallBack {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.HmEarbudDfuTask.MusicControlCallBack
        public void playMusic() {
            HmEarbudDevice.this.musicControlSync(MusicControlCmd.PLAY);
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.HmEarbudDfuTask.MusicControlCallBack
        public boolean stopMusic() {
            CurrentMusicState currentMusicStateSync = HmEarbudDevice.this.getCurrentMusicStateSync(HmVoiceType.NOISE);
            if (currentMusicStateSync == null || !currentMusicStateSync.isPlay()) {
                return false;
            }
            return HmEarbudDevice.this.musicControlSync(MusicControlCmd.PAUSE);
        }
    }

    public HmEarbudDevice(Context context, BluetoothDevice device) {
        super(context, new HMBaseBleDevice.e(device, false));
        this.M = new AtomicBoolean(false);
        this.N = new AtomicBoolean(false);
        this.O = new AtomicBoolean(false);
        this.P = new AtomicBoolean(true);
        this.Q = new AtomicBoolean(false);
        this.R = new HmBaseEarbudDevice.c() { // from class: com.xiaomi.hm.health.bt.device.d
            @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice.c
            public final void onEvent(HMLFEvent hMLFEvent) {
                this.a.N2(hMLFEvent);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A2() {
        if (F0()) {
            this.M.set(true);
            OnEarbudLRConnectChangeListener onEarbudLRConnectChangeListener = this.L;
            if (onEarbudLRConnectChangeListener != null) {
                onEarbudLRConnectChangeListener.onChange(true);
                return;
            }
            return;
        }
        q2();
        this.M.set(false);
        OnEarbudLRConnectChangeListener onEarbudLRConnectChangeListener2 = this.L;
        if (onEarbudLRConnectChangeListener2 != null) {
            onEarbudLRConnectChangeListener2.onChange(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B2(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
        if (isConnected() && !this.N.get()) {
            r2();
        }
        if (isAllConnected()) {
            p2();
        }
        IHMConnectionCallback iHMConnectionCallback = this.I;
        if (iHMConnectionCallback != null) {
            iHMConnectionCallback.onConnectionStatusChanged(bluetoothDevice, hMDeviceType, status);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean C2(int i) throws Exception {
        return Boolean.valueOf(super.D0(i, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean D2(int i) throws Exception {
        return Boolean.valueOf(super.deleteMusicSync(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean E2(int i) throws Exception {
        return Boolean.valueOf(this.H.deleteMusicSync(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int F2(String str, String str2) {
        try {
            return (int) (Long.parseLong(str) - Long.parseLong(str2));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int G2(String str, String str2) {
        try {
            return (int) (Long.parseLong(str) - Long.parseLong(str2));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H2(HMCallback hMCallback) {
        hMCallback.onStart();
        hMCallback.onFinish(getEarbudStatisticSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I2(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
        if (isAllConnected()) {
            p2();
        }
        IHMConnectionCallback iHMConnectionCallback = this.I;
        if (iHMConnectionCallback != null) {
            iHMConnectionCallback.onConnectionStatusChanged(bluetoothDevice, hMDeviceType, status);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean J2(MusicControlCmd musicControlCmd) throws Exception {
        return Boolean.valueOf(super.p1(musicControlCmd, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean K2(MusicControlCmd musicControlCmd) throws Exception {
        return Boolean.valueOf(super.musicControlSync(musicControlCmd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean L2(MusicControlCmd musicControlCmd) throws Exception {
        return Boolean.valueOf(this.H.musicControlSync(musicControlCmd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M2(HMLFEvent hMLFEvent) {
        this.y.leftLinkToRight();
        if (hMLFEvent.getExtra().length > 1) {
            Debug.fi(V, "disconnect reason:" + ((int) hMLFEvent.getExtra()[1]));
        }
        OnEarbudLRConnectChangeListener onEarbudLRConnectChangeListener = this.L;
        if (onEarbudLRConnectChangeListener != null) {
            onEarbudLRConnectChangeListener.onChange(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N2(final HMLFEvent hMLFEvent) {
        HMCallback<HMLFEvent> hMCallback = this.z;
        if (hMCallback != null) {
            hMCallback.sendOnDataMessage(hMLFEvent);
        }
        if (hMLFEvent.getLfType() != LfType.EARBUD_STATUS || hMLFEvent.getExtra() == null) {
            return;
        }
        Debug.fi(V, "on lfEvent:" + hMLFEvent.toString());
        int iBytesToInt = GattUtils.bytesToInt(hMLFEvent.getExtra(), 0, 1);
        if (iBytesToInt == 4) {
            this.M.set(true);
            OnEarbudLRConnectChangeListener onEarbudLRConnectChangeListener = this.L;
            if (onEarbudLRConnectChangeListener != null) {
                onEarbudLRConnectChangeListener.onChange(true);
                return;
            }
            return;
        }
        if (iBytesToInt != 5) {
            return;
        }
        this.M.set(false);
        if (isAllConnected()) {
            runOnDeviceOnlyThread(new Runnable() { // from class: r54
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.M2(hMLFEvent);
                }
            });
        } else {
            Debug.fi(V, "ignore connect left and right by device not connect");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean O2(List list) throws Exception {
        return Boolean.valueOf(super.setAlarmSync(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean P2(List list) throws Exception {
        return Boolean.valueOf(super.setAlarmSync(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean Q2(List list) throws Exception {
        return Boolean.valueOf(this.H.setAlarmSync(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean R2(boolean z) throws Exception {
        return Boolean.valueOf(super.setIsNoPhoneModeSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean S2(boolean z) throws Exception {
        return Boolean.valueOf(super.setIsNoPhoneModeSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean T2(boolean z) throws Exception {
        return Boolean.valueOf(this.H.setIsNoPhoneModeSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean U2(boolean z) throws Exception {
        return Boolean.valueOf(super.setIsSleepNotDisturbSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean V2(boolean z) throws Exception {
        return Boolean.valueOf(super.setIsSleepNotDisturbSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean W2(boolean z) throws Exception {
        return Boolean.valueOf(this.H.setIsSleepNotDisturbSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean X2(int i) throws Exception {
        return Boolean.valueOf(super.r1(i, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean Y2(int i) throws Exception {
        return Boolean.valueOf(super.setMusicPlayTimeSync(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean Z2(int i) throws Exception {
        return Boolean.valueOf(this.H.setMusicPlayTimeSync(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean a3(int i, int i2) throws Exception {
        return Boolean.valueOf(super.s1(i, i2, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean b3(int i, int i2) throws Exception {
        return Boolean.valueOf(super.setRestModeSync(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean c3(int i, int i2) throws Exception {
        return Boolean.valueOf(this.H.setRestModeSync(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean d3(boolean z) throws Exception {
        return Boolean.valueOf(super.t1(z, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean e3(boolean z) throws Exception {
        return Boolean.valueOf(super.setSmartPlaySync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean f3(boolean z) throws Exception {
        return Boolean.valueOf(this.H.setSmartPlaySync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean g3(int i, int i2, int i3) throws Exception {
        return Boolean.valueOf(super.u1(i, i2, i3, false));
    }

    public static List<String> getSupportDeviceNames() {
        return new ArrayList(S.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean h3(int i, int i2, int i3) throws Exception {
        return Boolean.valueOf(super.setTomatoModeSync(i, i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean i3(int i, int i2, int i3) throws Exception {
        return Boolean.valueOf(this.H.setTomatoModeSync(i, i2, i3));
    }

    public static boolean isSupportDeviceName(String deviceName) {
        return (TextUtils.isEmpty(deviceName) || S.get(deviceName) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean j3(short s) throws Exception {
        return Boolean.valueOf(super.v1(s, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean k3(short s) throws Exception {
        return Boolean.valueOf(super.setVolumeSync(s));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l3(short s) throws Exception {
        return Boolean.valueOf(this.H.setVolumeSync(s));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m3(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, Boolean bool) {
        atomicBoolean.set(atomicBoolean.get() && bool.booleanValue());
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean n3(HmVoiceType hmVoiceType, int i) throws Exception {
        return Boolean.valueOf(super.w1(hmVoiceType, i, false));
    }

    public static HMDeviceSource nameToSource(String deviceName) {
        return S.get(deviceName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean o3(HmVoiceType hmVoiceType, int i) throws Exception {
        return Boolean.valueOf(super.switchMusicSync(hmVoiceType, i));
    }

    private void p2() {
        runOnDeviceMultiThread(new Runnable() { // from class: b54
            @Override // java.lang.Runnable
            public final void run() {
                this.a.A2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean p3(HmVoiceType hmVoiceType, int i) throws Exception {
        return Boolean.valueOf(this.H.switchMusicSync(hmVoiceType, i));
    }

    private void q2() {
        Debug.fi(V, "device is not connect left and right, check music state");
        HmVoiceType hmVoiceType = HmVoiceType.NOISE;
        CurrentMusicState currentMusicStateSync = getCurrentMusicStateSync(hmVoiceType);
        Debug.fi(V, "get music state, result:" + currentMusicStateSync);
        if (currentMusicStateSync != null && currentMusicStateSync.isPlay()) {
            Debug.fi(V, "sync music state, result:" + switchMusicSync(hmVoiceType, currentMusicStateSync.getMusicId()));
        }
        o1();
    }

    private void q3() {
        Debug.fi(V, "earbud left right connect status:" + this.M.get() + " send command only main device:" + this.Q.get());
    }

    private void r2() {
        this.H.create(this.O.get());
        this.N.set(true);
    }

    private void r3(int minute) {
        Map<String, Integer> mapS2 = s2(false);
        mapS2.put(System.currentTimeMillis() + "", Integer.valueOf(minute));
        u2().edit().putString(W, new JSONObject(mapS2).toString()).apply();
    }

    private Map<String, Integer> s2(boolean isPre) {
        long j;
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: s54
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HmEarbudDevice.F2((String) obj, (String) obj2);
            }
        });
        try {
            SharedPreferences sharedPreferencesU2 = u2();
            StringBuilder sb = new StringBuilder();
            sb.append(W);
            sb.append(isPre ? Y : "");
            String string = sharedPreferencesU2.getString(sb.toString(), "");
            if (TextUtils.isEmpty(string)) {
                j = 0;
            } else {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                j = 0;
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    long j2 = Long.parseLong(next);
                    treeMap.put(next, Integer.valueOf(jSONObject.optInt(next, 0)));
                    j = j2;
                }
            }
            if (!isPre && j != 0 && !DateUtils.isToday(j)) {
                u2().edit().putString("rest_time_pre", string).apply();
                u2().edit().putString(W, "").apply();
                treeMap.clear();
            }
        } catch (Exception e) {
            Debug.e(V, "parse cache rest time error", e);
        }
        return treeMap;
    }

    private void s3(int tomatoTime, int restTime) {
        Map<String, String> mapT2 = t2(false);
        mapT2.put(System.currentTimeMillis() + "", tomatoTime + "_" + restTime);
        u2().edit().putString(X, new JSONObject(mapT2).toString()).apply();
    }

    private Map<String, String> t2(boolean isPre) {
        long j;
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: t54
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HmEarbudDevice.G2((String) obj, (String) obj2);
            }
        });
        try {
            SharedPreferences sharedPreferencesU2 = u2();
            StringBuilder sb = new StringBuilder();
            sb.append(X);
            sb.append(isPre ? Y : "");
            String string = sharedPreferencesU2.getString(sb.toString(), "");
            if (TextUtils.isEmpty(string)) {
                j = 0;
            } else {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                j = 0;
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    long j2 = Long.parseLong(next);
                    String strOptString = jSONObject.optString(next, "");
                    if (!TextUtils.isEmpty(strOptString) && strOptString.contains("_")) {
                        treeMap.put(next, strOptString);
                    }
                    j = j2;
                }
            }
            if (!isPre && j != 0 && !DateUtils.isToday(j)) {
                u2().edit().putString("tomato_time_pre", string).apply();
                u2().edit().putString(X, "").apply();
                treeMap.clear();
                return new HashMap();
            }
        } catch (Exception e) {
            Debug.e(V, "parse cache rest time error", e);
        }
        return treeMap;
    }

    private boolean t3(@NonNull List<HmBaseEarbudDevice.a<Boolean>> callables) {
        if (callables.isEmpty()) {
            return true;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final CountDownLatch countDownLatch = new CountDownLatch(callables.size());
        try {
            Iterator<HmBaseEarbudDevice.a<Boolean>> it2 = callables.iterator();
            while (it2.hasNext()) {
                it2.next().a(new HmBaseEarbudDevice.b() { // from class: com.xiaomi.hm.health.bt.device.c
                    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice.b
                    public final void onResult(Object obj) {
                        HmEarbudDevice.m3(atomicBoolean, countDownLatch, (Boolean) obj);
                    }
                });
            }
            countDownLatch.await(10L, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return atomicBoolean.get();
    }

    private SharedPreferences u2() {
        return getContext().getSharedPreferences(getDeviceInfo().getDeviceID(), 0);
    }

    private Pair<Long, List<Integer>> v2() {
        long j;
        s2(false);
        Map<String, Integer> mapS2 = s2(true);
        if (mapS2.size() > 0) {
            try {
                j = Long.parseLong(mapS2.keySet().iterator().next());
            } catch (Exception e) {
                e.printStackTrace();
                j = 0;
            }
        } else {
            j = 0;
        }
        return new Pair<>(Long.valueOf(j), new ArrayList(s2(true).values()));
    }

    private Pair<Long, List<Integer>> w2() {
        t2(false);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (Map.Entry<String, String> entry : t2(true).entrySet()) {
            if (j <= 0) {
                try {
                    j = Long.parseLong(entry.getKey());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            String[] strArrSplit = entry.getValue().split("_");
            if (strArrSplit.length == 2) {
                int i = Integer.parseInt(strArrSplit[0]);
                int i2 = Integer.parseInt(strArrSplit[1]);
                arrayList.add(Integer.valueOf(i));
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return new Pair<>(Long.valueOf(j), arrayList);
    }

    private void x2() {
        if (this.H == null) {
            String strA = this.b.a();
            this.H = new HmBaseEarbudDevice(this.mContext, GattUtils.getRemoteDevice(strA.substring(0, strA.length() - 2).concat("02")));
        }
        this.H.setAutoReconnect(isAutoReconnect());
        this.H.setAuthCallback(this.J);
        this.H.setAuthInfo(getAuthInfo());
        this.H.setBatteryChangedCallback(this.K);
        this.H.q1(this.R);
        this.H.setConnectionCallback(new IHMConnectionCallback() { // from class: f44
            @Override // com.xiaomi.hm.health.bt.ife.IHMConnectionCallback
            public final void onConnectionStatusChanged(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
                this.a.I2(bluetoothDevice, hMDeviceType, status);
            }
        });
        if (this.P.get()) {
            r2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y2(HMCallback hMCallback, HMAlertModeExt hMAlertModeExt) {
        hMCallback.sendOnStartMessage();
        if (hMAlertModeExt.getMode() == HMAlertMode.ALERT_LOVE) {
            hMAlertModeExt.setMode(HMAlertMode.ALERT_FIND);
        } else if (hMAlertModeExt.getMode() == HMAlertMode.ALERT_EMAIL) {
            hMAlertModeExt.setMode(HMAlertMode.ALERT_THIRD_APP);
        }
        boolean zAlertSync = isConnected() && alertSync(hMAlertModeExt);
        if (this.N.get() && this.H.isConnected()) {
            zAlertSync |= this.H.alertSync(hMAlertModeExt);
        }
        hMCallback.sendOnFinishMessage(zAlertSync);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2(HMCallback hMCallback, short s, short s2, byte b2) {
        hMCallback.sendOnStartMessage();
        boolean zC0 = isConnected() && C0(s, s2, b2);
        if (this.N.get() && this.H.isConnected()) {
            zC0 |= this.H.C0(s, s2, b2);
        }
        hMCallback.sendOnFinishMessage(zC0);
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice
    public void alert(final HMAlertModeExt mode, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: p54
            @Override // java.lang.Runnable
            public final void run() {
                this.a.y2(callback, mode);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean callNonConnected(HMCallback callback) {
        return super.callNonConnected(callback) || !this.N.get() || this.H.callNonConnected(callback);
    }

    public void cancelDownloadMusic() {
        Iterator<HmEarbudDfuTask> it2 = m0.iterator();
        while (it2.hasNext()) {
            it2.next().cancelTask();
        }
        m0.clear();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void create(boolean forceDirectly) {
        this.O.set(forceDirectly);
        super.setConnectionCallback(new IHMConnectionCallback() { // from class: q44
            @Override // com.xiaomi.hm.health.bt.ife.IHMConnectionCallback
            public final void onConnectionStatusChanged(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
                this.a.B2(bluetoothDevice, hMDeviceType, status);
            }
        });
        super.create(forceDirectly);
        x2();
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice
    public boolean deleteMusicSync(final int musicId) {
        if (!isAllConnected()) {
            return false;
        }
        q3();
        ArrayList arrayList = new ArrayList();
        if (this.Q.get() && this.M.get()) {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: u54
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.C2(musicId);
                }
            }));
        } else {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: h44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.D2(musicId);
                }
            }));
            arrayList.add(this.H.generateDeviceCallable(new Callable() { // from class: k44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.E2(musicId);
                }
            }));
        }
        return t3(arrayList);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void destroy() {
        if (this.N.get()) {
            this.H.destroy();
        }
        super.destroy();
    }

    public void getEarbudStatistic(final HMCallback<EarbudStatistic> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceOnlyThread(new Runnable() { // from class: m54
            @Override // java.lang.Runnable
            public final void run() {
                this.a.H2(callback);
            }
        });
    }

    public EarbudStatistic getEarbudStatisticSync() {
        int i;
        if (!isAllConnected()) {
            Debug.fi(V, "设备未连接");
            return null;
        }
        BatteryInfo batteryInfo = getRightDevice().getBatteryInfo();
        if (batteryInfo == null) {
            Debug.fi(V, "未获取右耳电量");
            return null;
        }
        MusicPlayInfo musicPlayInfoSync = getMusicPlayInfoSync();
        Debug.fi(V, "统计播放时间:" + musicPlayInfoSync);
        if (musicPlayInfoSync == null) {
            return null;
        }
        List<MusicInfo> musicListSync = getMusicListSync(HmVoiceType.NOISE);
        StringBuilder sb = new StringBuilder();
        sb.append("统计音律列表:");
        sb.append(musicListSync == null ? "" : TextUtils.join(",", musicListSync));
        Debug.fi(V, sb.toString());
        if (musicListSync == null || musicListSync.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<MusicInfo> it2 = musicListSync.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().getMusicId()));
        }
        Pair<Long, List<Integer>> pairV2 = v2();
        Pair<Long, List<Integer>> pairW2 = w2();
        int i2 = 0;
        ArrayList<AlarmClockExt> alarmsSync = getAlarmsSync();
        if (alarmsSync == null || alarmsSync.size() <= 0) {
            i = 0;
        } else {
            for (AlarmClockExt alarmClockExt : alarmsSync) {
                if (alarmClockExt.isEnable() && alarmClockExt.isVisible()) {
                    i2++;
                }
            }
            i = i2;
        }
        BaseEarbudStatistic baseEarbudStatistic = new BaseEarbudStatistic(((Long) pairV2.first).longValue(), ((List) pairV2.second).size(), (List) pairV2.second, ((Long) pairW2.first).longValue(), ((List) pairW2.second).size() / 2, (List) pairW2.second, getSmartPlaySync() ? -1 : getMusicPlayTimeSync(), arrayList, musicPlayInfoSync.getTime(), musicPlayInfoSync.getInfo(), batteryInfo.toJsonString());
        baseEarbudStatistic.setAlarmsCount(i);
        return new EarbudStatistic(baseEarbudStatistic);
    }

    public HmBaseEarbudDevice getRightDevice() {
        return this.H;
    }

    public boolean isAllConnected() {
        return isConnected() && this.N.get() && this.H.isConnected();
    }

    public boolean isRightConnect() {
        return this.N.get() && this.H.isConnected();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean isSyncingData() {
        HmBaseEarbudDevice hmBaseEarbudDevice;
        return super.isSyncingData() || ((hmBaseEarbudDevice = this.H) != null && hmBaseEarbudDevice.isSyncingData());
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice
    public boolean musicControlSync(final MusicControlCmd musicCmd) {
        if (!isAllConnected()) {
            return false;
        }
        q3();
        ArrayList arrayList = new ArrayList();
        if (this.Q.get() && this.M.get()) {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: v44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.J2(musicCmd);
                }
            }));
        } else {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: w44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.K2(musicCmd);
                }
            }));
            arrayList.add(this.H.generateDeviceCallable(new Callable() { // from class: x44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.L2(musicCmd);
                }
            }));
        }
        return t3(arrayList);
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice, com.xiaomi.hm.health.bt.profile.slre.ILFEventListener
    public void onLFEvent(HMLFEvent event) {
        this.R.onEvent(event);
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean reset() {
        boolean z = false;
        if (isAllConnected() && this.M.get() && super.reset(false)) {
            z = true;
        }
        if (z) {
            u2().edit().clear().apply();
        }
        return z;
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice
    public boolean setAlarmSync(final List<AlarmClockExt> clocks) {
        if (!isAllConnected()) {
            return false;
        }
        q3();
        ArrayList arrayList = new ArrayList();
        if (this.Q.get() && this.M.get()) {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: z44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.O2(clocks);
                }
            }));
        } else {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: y44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.P2(clocks);
                }
            }));
            arrayList.add(this.H.generateDeviceCallable(new Callable() { // from class: a54
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.Q2(clocks);
                }
            }));
        }
        return t3(arrayList);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setAuthCallback(IHMAuthCallback callback) {
        this.J = callback;
        super.setAuthCallback(callback);
        if (this.N.get()) {
            this.H.setAuthCallback(callback);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setAuthInfo(AuthInfo info) {
        super.setAuthInfo(info);
        if (this.N.get()) {
            this.H.setAuthInfo(info);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setAutoReconnect(boolean autoReconnect) {
        super.setAutoReconnect(autoReconnect);
        if (this.N.get()) {
            this.H.setAutoReconnect(autoReconnect);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setBatteryChangedCallback(HMCallback<BatteryInfo> callback) {
        this.K = callback;
        super.setBatteryChangedCallback(callback);
        if (this.N.get()) {
            this.H.setBatteryChangedCallback(callback);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setConnectionCallback(IHMConnectionCallback connectionCallback) {
        this.I = connectionCallback;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean setDateTimeSync(Calendar calendar) {
        return isAllConnected() && super.setDateTimeSync(calendar) && this.N.get() && this.H.setDateTimeSync(calendar);
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice
    public boolean setIsNoPhoneModeSync(final boolean isNoPhoneMode) {
        if (!isAllConnected()) {
            return false;
        }
        q3();
        ArrayList arrayList = new ArrayList();
        if (this.Q.get() && this.M.get()) {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: n54
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.R2(isNoPhoneMode);
                }
            }));
        } else {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: o54
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.S2(isNoPhoneMode);
                }
            }));
            arrayList.add(this.H.generateDeviceCallable(new Callable() { // from class: i54
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.T2(isNoPhoneMode);
                }
            }));
        }
        return t3(arrayList);
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice
    public boolean setIsSleepNotDisturbSync(final boolean isSleepNotDisturb) {
        if (!isAllConnected()) {
            return false;
        }
        q3();
        ArrayList arrayList = new ArrayList();
        if (this.Q.get() && this.M.get()) {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: j54
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.U2(isSleepNotDisturb);
                }
            }));
        } else {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: k54
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.V2(isSleepNotDisturb);
                }
            }));
            arrayList.add(this.H.generateDeviceCallable(new Callable() { // from class: h54
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.W2(isSleepNotDisturb);
                }
            }));
        }
        return t3(arrayList);
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice
    public boolean setMusicPlayTimeSync(final int minute) {
        if (!isAllConnected()) {
            return false;
        }
        q3();
        ArrayList arrayList = new ArrayList();
        if (this.Q.get() && this.M.get()) {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: g44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.X2(minute);
                }
            }));
        } else {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: i44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.Y2(minute);
                }
            }));
            arrayList.add(this.H.generateDeviceCallable(new Callable() { // from class: j44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.Z2(minute);
                }
            }));
        }
        return t3(arrayList);
    }

    public void setOnEarbudLRConnectChangeListener(OnEarbudLRConnectChangeListener listener) {
        this.L = listener;
        if (listener != null) {
            listener.onChange(this.M.get());
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice
    public boolean setRestModeSync(final int minute, final int status) {
        if (!isAllConnected()) {
            return false;
        }
        q3();
        ArrayList arrayList = new ArrayList();
        if (this.Q.get() && this.M.get()) {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: l44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.a3(minute, status);
                }
            }));
        } else {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: m44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.b3(minute, status);
                }
            }));
            arrayList.add(this.H.generateDeviceCallable(new Callable() { // from class: n44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.c3(minute, status);
                }
            }));
        }
        boolean zT3 = t3(arrayList);
        if (zT3 && status == 2) {
            r3(minute);
        }
        return zT3;
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice
    public boolean setSmartPlaySync(final boolean isSmartPlay) {
        if (!isAllConnected()) {
            return false;
        }
        q3();
        ArrayList arrayList = new ArrayList();
        if (this.Q.get() && this.M.get()) {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: g54
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.d3(isSmartPlay);
                }
            }));
        } else {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: l54
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.e3(isSmartPlay);
                }
            }));
            arrayList.add(this.H.generateDeviceCallable(new Callable() { // from class: f54
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.f3(isSmartPlay);
                }
            }));
        }
        return t3(arrayList);
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice
    public boolean setTomatoModeSync(final int totalMinute, final int restMinute, final int status) {
        if (!isAllConnected()) {
            return false;
        }
        q3();
        ArrayList arrayList = new ArrayList();
        if (this.Q.get() && this.M.get()) {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: r44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.g3(totalMinute, restMinute, status);
                }
            }));
        } else {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: p44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.h3(totalMinute, restMinute, status);
                }
            }));
            arrayList.add(this.H.generateDeviceCallable(new Callable() { // from class: o44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.i3(totalMinute, restMinute, status);
                }
            }));
        }
        boolean zT3 = t3(arrayList);
        if (zT3 && status == 2) {
            s3(totalMinute, restMinute);
        }
        return zT3;
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice
    public boolean setUserInfoSync(UserInfoExt infoExt) {
        return isAllConnected() && super.setUserInfoSync(infoExt) && this.N.get() && this.H.setUserInfoSync(infoExt);
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice
    public boolean setVolumeSync(final short volume) {
        if (!isAllConnected()) {
            return false;
        }
        q3();
        ArrayList arrayList = new ArrayList();
        if (this.Q.get() && this.M.get()) {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: e54
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.j3(volume);
                }
            }));
        } else {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: d54
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.k3(volume);
                }
            }));
            arrayList.add(this.H.generateDeviceCallable(new Callable() { // from class: c54
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.l3(volume);
                }
            }));
        }
        return t3(arrayList);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void startSyncData(Calendar calendar, IHMActivityDataCallback callback) {
        cancelDownloadMusic();
        if (isConnected() || !this.N.get()) {
            super.startSyncData(calendar, callback);
        } else {
            this.H.startSyncData(calendar, callback);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice
    public void stopSyncData() {
        super.stopSyncData();
        if (this.N.get()) {
            this.H.stopSyncData();
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice
    public boolean switchMusicSync(final HmVoiceType voiceType, final int musicId) {
        if (!isAllConnected()) {
            return false;
        }
        q3();
        ArrayList arrayList = new ArrayList();
        if (this.Q.get() && this.M.get()) {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: s44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.n3(voiceType, musicId);
                }
            }));
        } else {
            arrayList.add(generateDeviceCallable(new Callable() { // from class: u44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.o3(voiceType, musicId);
                }
            }));
            arrayList.add(this.H.generateDeviceCallable(new Callable() { // from class: t44
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.p3(voiceType, musicId);
                }
            }));
        }
        return t3(arrayList);
    }

    @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void updateFwUpgrade(HMFirmwareInfo firmwareInfo, IHMFirmwareUpgradeCallback callback) {
        Debug.fi(V, "start earbud update fw:" + firmwareInfo);
        if (!isAllConnected()) {
            Debug.fi(V, "device is not connected");
            callback.onFwStart(0);
            callback.onFwStop(false);
            return;
        }
        if (getDeviceInfo() == null) {
            Debug.fi(V, "device info is null!!!");
            callback.onFwStart(0);
            callback.onFwStop(false);
            return;
        }
        cancelDownloadMusic();
        Debug.fi(V, "cancle download music task success");
        if (firmwareInfo.getFwType() != HMFirmwareType.FIRMWARE_VOICE) {
            runOnDeviceOnlyThread(new HmEarbudDfuTask(this.y, this.H.y, firmwareInfo, callback, new b()));
            Debug.fi(V, "start update fw success");
        } else {
            HmEarbudDfuTask hmEarbudDfuTask = new HmEarbudDfuTask(this.y, this.H.y, firmwareInfo, callback);
            m0.add(hmEarbudDfuTask);
            runOnDeviceOnlyThread(hmEarbudDfuTask);
            Debug.fi(V, "start download music success");
        }
    }

    public void alert(final short time, final short offsetTime, final byte num, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: q54
            @Override // java.lang.Runnable
            public final void run() {
                this.a.z2(callback, time, offsetTime, num);
            }
        });
    }

    public void create(boolean forceDirectly, boolean connectTogether) {
        this.P.set(connectTogether);
        create(forceDirectly);
    }

    public HmEarbudDevice(Context context, String deviceAddress) {
        this(context, GattUtils.getRemoteDevice(deviceAddress));
    }

    public HmEarbudDevice(Context context, BluetoothDevice leftDevice, BluetoothDevice rightDevice) {
        this(context, leftDevice);
        this.H = new HmBaseEarbudDevice(context, new HMBaseBleDevice.e(rightDevice, false));
    }
}

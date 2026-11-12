package com.huami.watch.companion.update;

import android.content.Context;
import android.text.TextUtils;
import com.huami.passport.AccountManager;
import com.huami.util.net.NetUtil;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.ota.cloud.RomInfo;
import com.huami.watch.ota.cloud.RomInfoApi;
import com.huami.watch.util.Log;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/* JADX INFO: loaded from: classes16.dex */
public class RomUpgradeHelper {
    private static final String f = "RomUpgradeHelper";
    private static RomUpgradeHelper g;
    private Context a;
    private RomInfoApi b;
    private String d;
    private String c = "";
    private boolean e = false;

    public class a implements ObservableOnSubscribe<Boolean> {
        public a() {
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<Boolean> observableEmitter) throws Exception {
            RomUpgradeHelper romUpgradeHelper = RomUpgradeHelper.this;
            observableEmitter.onNext(Boolean.valueOf((romUpgradeHelper.f(romUpgradeHelper.a) && RomUpgradeHelper.this.g()) ? RomUpgradeHelper.this.e() : false));
        }
    }

    private RomUpgradeHelper(Context context) {
        this.a = context;
        this.b = new RomInfoApi(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        boolean z;
        RomInfo romInfo = new RomInfo();
        if (this.b.getRomInfo(romInfo) == 0) {
            z = true;
            String firmwareVersion = romInfo.getFirmwareVersion();
            this.c = firmwareVersion;
            if (firmwareVersion == null) {
                this.c = "";
            }
            this.d = romInfo.getChangeLog();
        } else {
            z = false;
        }
        Log.d(f, "" + romInfo, new Object[0]);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(Context context) {
        return NetUtil.INSTANCE.networkInfo().isNetworkConnect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        try {
            String currentUid = AccountManager.getDefault(this.a).getCurrentUid();
            if (currentUid.isEmpty()) {
                Log.d(f, "user is not login", new Object[0]);
                return false;
            }
            Device currentDevice = DeviceManager.getManager(this.a).getCurrentDevice();
            if (currentDevice == null || !currentDevice.isConnected()) {
                Log.d(f, "get current device null, please connect watch first", new Object[0]);
                return false;
            }
            String strModelNumber = currentDevice.info().modelNumber();
            String strBuildNumber = currentDevice.info().buildNumber();
            if (strModelNumber.equals("") || strBuildNumber.equals("")) {
                this.e = false;
                Log.d(f, "please connect to watch for update", new Object[0]);
                return false;
            }
            this.e = true;
            this.b.setCurrentSysInfo(strBuildNumber, strModelNumber, "ALL");
            this.b.setOverSeaUser(Account.isOversea(this.a));
            this.b.setAppTokens(Cloud.getToken().getAccessToken());
            Log.d(f, "userid " + currentUid + " check update romVersion: " + strBuildNumber + " watchVersion: " + strModelNumber + "oversea:" + Account.isOversea(this.a), new Object[0]);
            this.b.setCurrentUid(currentUid);
            this.b.setSerialNum(currentDevice.getSN());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static RomUpgradeHelper getHelper(Context context) {
        if (g == null && context != null) {
            g = new RomUpgradeHelper(context.getApplicationContext());
        }
        return g;
    }

    public void checkRomNeedUpgradeAsync(Observer<Boolean> observer) {
        Observable observableObserveOn = Observable.create(new a()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        if (observer != null) {
            observableObserveOn.subscribe(observer);
        } else {
            observableObserveOn.subscribe();
        }
    }

    public String getLastRomUpdateVersion() {
        return this.c;
    }

    public String getUpdateInfo() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public boolean isNeedUpdateWhenConnected() {
        return !this.e;
    }

    public void setLastRomUpdateVersionEmpty() {
        this.c = "";
    }
}

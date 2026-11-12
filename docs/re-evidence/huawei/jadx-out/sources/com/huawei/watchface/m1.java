package com.huawei.watchface;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import com.huawei.watchface.utils.constants.WatchFaceConstant;

/* JADX INFO: loaded from: classes20.dex */
public class m1 extends ContentObserver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f30299c = new Object();
    public static final String d = "content://" + WatchFaceConstant.f30621b + "/childmode_status";
    public static m1 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OperateWatchFaceCallback f30300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f30301b;

    public m1(Handler handler) {
        super(handler);
        this.f30301b = false;
    }

    public static m1 b() {
        m1 m1Var;
        synchronized (f30299c) {
            if (e == null) {
                e = new m1(null);
            }
            m1Var = e;
        }
        return m1Var;
    }

    public void a(OperateWatchFaceCallback operateWatchFaceCallback) {
        this.f30300a = operateWatchFaceCallback;
    }

    public boolean c() {
        return this.f30301b;
    }

    public final void d() {
        try {
            String strValueOf = String.valueOf(Settings.Secure.getInt(Environment.getApplicationContext().getContentResolver(), Constants.PATH_CHILDMODE_STATUS));
            HwLog.i("HealthBalanceContentObserver", "notifyHealthChildStatusChange status:" + strValueOf);
            OperateWatchFaceCallback operateWatchFaceCallback = this.f30300a;
            if (operateWatchFaceCallback != null) {
                operateWatchFaceCallback.transmitHealthChildStatusChange(strValueOf);
            }
            e4.a((Context) Environment.getApplicationContext(), true);
        } catch (Settings.SettingNotFoundException e2) {
            HwLog.e("HealthBalanceContentObserver", "checkHealthChildStatus SettingNotFoundException: " + HwLog.printException((Exception) e2));
        } catch (Exception e3) {
            HwLog.e("HealthBalanceContentObserver", "checkHealthChildStatus Exception: " + HwLog.printException(e3));
        }
    }

    public void e() {
        Application applicationContext = Environment.getApplicationContext();
        if (applicationContext == null) {
            HwLog.i("HealthBalanceContentObserver", "registerHealthBalanceObserver: application is null.");
            return;
        }
        ContentResolver contentResolver = applicationContext.getContentResolver();
        if (contentResolver == null) {
            HwLog.i("HealthBalanceContentObserver", "registerHealthBalanceObserver: contentResolver is null.");
            return;
        }
        try {
            contentResolver.registerContentObserver(Uri.parse(d), false, this);
            this.f30301b = true;
            HwLog.i("HealthBalanceContentObserver", "registerHealthBalanceObserver success");
        } catch (SecurityException e2) {
            HwLog.e("HealthBalanceContentObserver", "registerContentObserver SecurityException: " + HwLog.printException((Exception) e2));
        } catch (Exception e3) {
            HwLog.e("HealthBalanceContentObserver", "registerContentObserver Exception: " + HwLog.printException(e3));
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        HwLog.i("HealthBalanceContentObserver", "onChange: ");
        d();
    }

    public int a() {
        try {
            int i = Settings.Secure.getInt(Environment.getApplicationContext().getContentResolver(), Constants.PATH_CHILDMODE_STATUS);
            HwLog.i("HealthBalanceContentObserver", "getHealthChildStatus status:" + i);
            return i;
        } catch (Settings.SettingNotFoundException e2) {
            HwLog.e("HealthBalanceContentObserver", "getHealthChildStatus SettingNotFoundException: " + HwLog.printException((Exception) e2));
            return 0;
        } catch (Exception e3) {
            HwLog.e("HealthBalanceContentObserver", "getHealthChildStatus Exception: " + HwLog.printException(e3));
            return 0;
        }
    }
}

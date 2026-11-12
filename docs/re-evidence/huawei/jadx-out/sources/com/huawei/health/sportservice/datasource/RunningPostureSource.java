package com.huawei.health.sportservice.datasource;

import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.gzv;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 3, name = ComponentName.RUNNING_POSTURE_SOURCE)
public class RunningPostureSource extends BaseSource implements SportLifecycle, IBaseResponseCallback {
    private static final String TAG = "SportService_RunningPostureSource";
    private gzv mRunningPosture;

    private float getFloatValue(float f) {
        if (f == 0.0f) {
            return -1.0f;
        }
        return f;
    }

    private int getIntegerValue(int i, float f) {
        return i == 0 ? (int) f : i;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        this.mRunningPosture = new gzv();
        BaseSportManager.getInstance().setParas(SportParamsType.DEVICE_CALLBACK_AW70, this);
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected void updateSourceData() {
        if (this.mRunningPosture == null) {
            LogUtil.a(TAG, "updateSourceData runningPosture == null");
        } else {
            BaseSportManager.getInstance().updateSourceData(getLogTag(), "RUNNING_POSTURE_DATA", this.mRunningPosture);
        }
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected String getLogTag() {
        return TAG;
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected void generateData(Object obj) {
        if (obj instanceof gzv) {
            gzv gzvVar = new gzv();
            this.mRunningPosture = gzvVar;
            updateRunningPosture((gzv) obj, gzvVar);
            updateSourceData();
        }
    }

    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
    /* JADX INFO: renamed from: onResponse */
    public void a(int i, Object obj) {
        if (i == 0) {
            generateData(obj);
        }
    }

    private void updateRunningPosture(gzv gzvVar, gzv gzvVar2) {
        LogUtil.a(TAG, "updateRunningPosture", gzvVar.toString());
        if (gzvVar2 == null) {
            LogUtil.a(TAG, "updateRunningPosture runningPosture == null");
            return;
        }
        if (gzvVar.k() != -1.0f) {
            gzvVar2.h(getIntegerValue(gzvVar.k()));
        }
        if (gzvVar.n() != -1.0f) {
            gzvVar2.b(getFloatValue(gzvVar.n()));
        }
        if (gzvVar.l() != -1.0f) {
            gzvVar2.i(getIntegerValue(gzvVar.l()));
        }
        if (gzvVar.t() != -1.0f) {
            gzvVar2.a(getFloatValue(gzvVar.t()));
        }
        if (gzvVar.q() != -1.0f) {
            gzvVar2.e(getFloatValue(gzvVar.q()));
        }
        if (gzvVar.o() != -1.0f) {
            gzvVar2.c(getFloatValue(gzvVar.o()));
        }
        if (gzvVar.f() != -1.0f) {
            gzvVar2.d(getFloatValue(gzvVar.f()));
        }
        updateFootParams(gzvVar, gzvVar2);
        LogUtil.a(TAG, "updateRunningPosture done", gzvVar2.toString());
    }

    private void updateFootParams(gzv gzvVar, gzv gzvVar2) {
        if (gzvVar.b() != -101) {
            gzvVar2.c(getIntegerValue(gzvVar.b(), -101.0f));
        }
        if (gzvVar.e() != -1) {
            gzvVar2.e(getIntegerValue(gzvVar.e()));
        }
        if (gzvVar.h() != -1) {
            gzvVar2.a(gzvVar.h());
        }
        if (gzvVar.a() != -1) {
            gzvVar2.d(getIntegerValue(gzvVar.a()));
        }
        if (gzvVar.d() != -1) {
            gzvVar2.b(getIntegerValue(gzvVar.d()));
        }
        if (gzvVar.c() != -1) {
            gzvVar2.a(getIntegerValue(gzvVar.c()));
        }
        if (gzvVar.j() != -1) {
            gzvVar2.g(getIntegerValue(gzvVar.j()));
        }
        if (gzvVar.i() != -1) {
            gzvVar2.j(getIntegerValue(gzvVar.i()));
        }
        if (gzvVar.m() != -1) {
            gzvVar2.f(getIntegerValue(gzvVar.m()));
        }
        refreshVerticalRatio(gzvVar2);
    }

    private void refreshVerticalRatio(gzv gzvVar) {
        int iM = gzvVar.m();
        float fT = gzvVar.t();
        if (iM <= 0 || fT <= 0.0f) {
            return;
        }
        gzvVar.e(getFloatValue(new BigDecimal((fT / iM) * 100.0f).setScale(1, 1).floatValue()));
    }

    private int getIntegerValue(int i) {
        return getIntegerValue(i, -1.0f);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        this.mRunningPosture = null;
    }
}

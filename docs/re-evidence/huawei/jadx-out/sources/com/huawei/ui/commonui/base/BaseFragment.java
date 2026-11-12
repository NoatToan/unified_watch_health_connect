package com.huawei.ui.commonui.base;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.google.gson.Gson;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.lmc;
import defpackage.lme;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qrs;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes16.dex */
public class BaseFragment extends Fragment {
    private static final int DEFAULT_SIZE = 4;
    private static final String TAG = "BaseFragment";
    private static final int TIME_INTERVAL = 500;
    private static lmf sBiAnalyticsUtil = lmf.d();
    private boolean mIsResume = false;
    private boolean mIsVisibleToUser;
    private long mStartTime;

    public int getResPosId() {
        return 0;
    }

    public void initViewTahiti() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (qrs.t()) {
            initViewTahiti();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        calculateAndBiExposureTime();
        if (getUserVisibleHint() && this.mIsResume) {
            this.mIsResume = false;
            sBiAnalyticsUtil.b(getClass().getSimpleName(), new LinkedHashMap<>(4));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        startExposureTime();
        if (!getUserVisibleHint() || this.mIsResume) {
            return;
        }
        this.mIsResume = true;
        sBiAnalyticsUtil.e(getClass().getSimpleName(), new LinkedHashMap<>(4));
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        calculateExposureTime(z);
        if (z) {
            if (this.mIsResume) {
                return;
            }
            this.mIsResume = true;
            sBiAnalyticsUtil.e(getClass().getSimpleName(), new LinkedHashMap<>(4));
            return;
        }
        if (this.mIsResume) {
            this.mIsResume = false;
            sBiAnalyticsUtil.b(getClass().getSimpleName(), new LinkedHashMap<>(4));
        }
    }

    private void calculateExposureTime(boolean z) {
        this.mIsVisibleToUser = z;
        if (z) {
            startExposureTime();
        } else {
            calculateAndBiExposureTime();
        }
    }

    private void calculateAndBiExposureTime() {
        if (this.mStartTime > 0) {
            final long jCurrentTimeMillis = System.currentTimeMillis() - this.mStartTime;
            final String simpleName = TextUtils.isEmpty(getInnerFragmentSimpleName()) ? getClass().getSimpleName() : getInnerFragmentSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append(simpleName);
            sb.append(getResPosId() == 0 ? "" : Integer.valueOf(getResPosId()));
            final String string = sb.toString();
            LogUtil.a(TAG, string + " exposureTime: " + jCurrentTimeMillis + " ms");
            HandlerCenter.a().d(new Runnable() { // from class: qjd
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.m1664x7cffa0bd(string, simpleName, jCurrentTimeMillis);
                }
            }, 500L);
            this.mStartTime = 0L;
        }
    }

    /* JADX INFO: renamed from: lambda$calculateAndBiExposureTime$0$com-huawei-ui-commonui-base-BaseFragment, reason: not valid java name */
    public /* synthetic */ void m1664x7cffa0bd(String str, String str2, long j) {
        setBiExposureTime(new lme(lmc.a(str), lmc.b(str), str2, j, HealthRecycleView.f23815c));
    }

    private void setBiExposureTime(lme lmeVar) {
        if (!lmc.d(lmeVar.a())) {
            clearExposureInfoList(lmeVar.a());
            return;
        }
        LogUtil.a(TAG, "setBiExposureTime: ", new Gson().toJson(lmeVar));
        lmc.a(lmeVar);
        clearExposureInfoList(lmeVar.a());
    }

    private void clearExposureInfoList(String str) {
        if (!"SportEntranceFragment".equals(str) && njy.b(HealthRecycleView.f23815c)) {
            HealthRecycleView.f23815c.clear();
        }
    }

    private void startExposureTime() {
        if (this.mIsVisibleToUser) {
            this.mStartTime = System.currentTimeMillis();
        }
    }

    public String getInnerFragmentSimpleName() {
        return "";
    }
}

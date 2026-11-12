package com.huawei.indoorequip.viewmodel;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.magnet.RealTimeDynamicChartView;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseRealTimeDynamicChartViewModel {
    protected float mCurrentSpeed;
    protected RealTimeDynamicChartView mRealTimeDynamicChartView;

    public void setDefaultOrdinateY() {
    }

    public void updateConfiguration(Context context) {
    }

    public BaseRealTimeDynamicChartViewModel(RealTimeDynamicChartView realTimeDynamicChartView) {
        this.mRealTimeDynamicChartView = realTimeDynamicChartView;
        setDefaultOrdinateY();
    }

    public void pushNewData(int i) {
        RealTimeDynamicChartView realTimeDynamicChartView = this.mRealTimeDynamicChartView;
        if (realTimeDynamicChartView != null) {
            realTimeDynamicChartView.c(i);
        }
    }

    public void pushNewData(float f) {
        RealTimeDynamicChartView realTimeDynamicChartView = this.mRealTimeDynamicChartView;
        if (realTimeDynamicChartView != null) {
            realTimeDynamicChartView.c(f);
        }
    }

    public void pushNewData(float f, float f2) {
        this.mCurrentSpeed = f2;
        pushNewData(f);
    }

    public void pushNewData(int i, float f) {
        this.mCurrentSpeed = f;
        pushNewData(i);
    }

    public void setNormalTextSize() {
        RealTimeDynamicChartView realTimeDynamicChartView = this.mRealTimeDynamicChartView;
        if (realTimeDynamicChartView != null) {
            realTimeDynamicChartView.setNormalTextSize();
        }
    }

    public void setSmallTextSize() {
        RealTimeDynamicChartView realTimeDynamicChartView = this.mRealTimeDynamicChartView;
        if (realTimeDynamicChartView != null) {
            realTimeDynamicChartView.setSmallTextSize();
        }
    }

    public void setScale(float f) {
        RealTimeDynamicChartView realTimeDynamicChartView = this.mRealTimeDynamicChartView;
        if (realTimeDynamicChartView != null) {
            realTimeDynamicChartView.setScale(f);
        }
    }

    public int getTitleTextLength() {
        RealTimeDynamicChartView realTimeDynamicChartView = this.mRealTimeDynamicChartView;
        if (realTimeDynamicChartView != null) {
            return realTimeDynamicChartView.getTitleLength();
        }
        return 0;
    }

    public void setOrdinateY(int i, int i2) {
        RealTimeDynamicChartView realTimeDynamicChartView = this.mRealTimeDynamicChartView;
        if (realTimeDynamicChartView != null) {
            realTimeDynamicChartView.setOrdinateY(i, i2);
        }
    }

    protected void setChartViewTitle(String str, String str2) {
        setChartViewTitle(str, str2, R.string.IDS_motiontrack_history_all_unit);
    }

    protected void setChartViewTitle(String str, String str2, int i) {
        if (this.mRealTimeDynamicChartView != null) {
            this.mRealTimeDynamicChartView.setTitle(BaseApplication.b().getString(i, str2, str));
        }
    }
}

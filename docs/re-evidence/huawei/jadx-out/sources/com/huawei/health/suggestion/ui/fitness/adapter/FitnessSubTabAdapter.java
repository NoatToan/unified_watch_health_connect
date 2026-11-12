package com.huawei.health.suggestion.ui.fitness.adapter;

import androidx.fragment.app.FragmentTransaction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.subtab.HealthSubTabListener;
import defpackage.xfz;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessSubTabAdapter implements HealthSubTabListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FitnessOnSelectPositionListener f9280b;

    public interface FitnessOnSelectPositionListener {
        void selectedPosition(int i, int i2, Object obj);
    }

    @Override // com.huawei.ui.commonui.subtab.HealthSubTabListener, com.huawei.uikit.hwsubtab.widget.HwSubTabListener
    public void onSubTabReselected(xfz xfzVar, FragmentTransaction fragmentTransaction) {
        LogUtil.d("FitnessSubTabAdapter", "onSubTabReselected:  ==> ");
        FitnessOnSelectPositionListener fitnessOnSelectPositionListener = this.f9280b;
        if (fitnessOnSelectPositionListener != null) {
            fitnessOnSelectPositionListener.selectedPosition(xfzVar.c(), xfzVar.i(), xfzVar.g());
        }
    }

    @Override // com.huawei.ui.commonui.subtab.HealthSubTabListener, com.huawei.uikit.hwsubtab.widget.HwSubTabListener
    public void onSubTabSelected(xfz xfzVar, FragmentTransaction fragmentTransaction) {
        LogUtil.d("FitnessSubTabAdapter", "onSubTabSelected:  ==> ");
        FitnessOnSelectPositionListener fitnessOnSelectPositionListener = this.f9280b;
        if (fitnessOnSelectPositionListener != null) {
            fitnessOnSelectPositionListener.selectedPosition(xfzVar.c(), xfzVar.i(), xfzVar.g());
        }
    }

    @Override // com.huawei.ui.commonui.subtab.HealthSubTabListener, com.huawei.uikit.hwsubtab.widget.HwSubTabListener
    public void onSubTabUnselected(xfz xfzVar, FragmentTransaction fragmentTransaction) {
        LogUtil.d("FitnessSubTabAdapter", "onSubTabUnselected:  ==> ");
    }
}

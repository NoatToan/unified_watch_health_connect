package com.xiaomi.fitness.base;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.xiaomi.fitness.baseui.view.BaseFragment;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseDataChartChildFragment extends BaseFragment {
    public static void switchFragment(int i, Class cls, String str, Bundle bundle, FragmentManager fragmentManager) {
        k kVarO = fragmentManager.o();
        BaseDataChartChildFragment baseDataChartChildFragment = (BaseDataChartChildFragment) fragmentManager.l0(str);
        if (baseDataChartChildFragment != null) {
            kVarO.F(baseDataChartChildFragment);
            baseDataChartChildFragment.setArguments(bundle);
            kVarO.m();
        } else {
            try {
                BaseDataChartChildFragment baseDataChartChildFragment2 = (BaseDataChartChildFragment) cls.newInstance();
                baseDataChartChildFragment2.setArguments(bundle);
                kVarO.x(i, baseDataChartChildFragment2, str);
            } catch (Fragment.InstantiationException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
            kVarO.m();
        }
    }
}

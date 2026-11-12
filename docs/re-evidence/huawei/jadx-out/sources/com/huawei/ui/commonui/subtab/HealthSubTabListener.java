package com.huawei.ui.commonui.subtab;

import androidx.fragment.app.FragmentTransaction;
import com.huawei.uikit.hwsubtab.widget.HwSubTabListener;
import defpackage.xfz;

/* JADX INFO: loaded from: classes16.dex */
public interface HealthSubTabListener extends HwSubTabListener {
    @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabListener
    void onSubTabReselected(xfz xfzVar, FragmentTransaction fragmentTransaction);

    @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabListener
    void onSubTabSelected(xfz xfzVar, FragmentTransaction fragmentTransaction);

    @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabListener
    void onSubTabUnselected(xfz xfzVar, FragmentTransaction fragmentTransaction);
}

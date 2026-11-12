package com.huawei.uikit.hwsubtab.widget;

import androidx.fragment.app.FragmentTransaction;
import defpackage.xfz;

/* JADX INFO: loaded from: classes20.dex */
public interface HwSubTabListener {
    void onSubTabReselected(xfz xfzVar, FragmentTransaction fragmentTransaction);

    void onSubTabSelected(xfz xfzVar, FragmentTransaction fragmentTransaction);

    void onSubTabUnselected(xfz xfzVar, FragmentTransaction fragmentTransaction);
}

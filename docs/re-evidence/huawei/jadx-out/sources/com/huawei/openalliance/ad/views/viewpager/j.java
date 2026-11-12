package com.huawei.openalliance.ad.views.viewpager;

import android.view.View;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes12.dex */
class j implements Serializable, Comparator<View> {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(View view, View view2) {
        i iVar = (i) view.getLayoutParams();
        i iVar2 = (i) view2.getLayoutParams();
        if (iVar.f21384b != iVar2.f21384b) {
            return iVar.f21384b ? 1 : -1;
        }
        return iVar.f - iVar2.f;
    }

    j() {
    }
}

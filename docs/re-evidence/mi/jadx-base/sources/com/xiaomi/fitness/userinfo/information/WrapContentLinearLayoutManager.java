package com.xiaomi.fitness.userinfo.information;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes10.dex */
public class WrapContentLinearLayoutManager extends LinearLayoutManager {
    public WrapContentLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.z zVar) {
        try {
            super.onLayoutChildren(uVar, zVar);
        } catch (IndexOutOfBoundsException unused) {
            Logger.e("TAG", "RecyclerView index out of bounds exception");
        }
    }

    public WrapContentLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

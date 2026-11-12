package com.huawei.health.suggestion.ui.fitness.helper;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqf;

/* JADX INFO: loaded from: classes9.dex */
public class RecyclerHolder extends RecyclerView.ViewHolder {
    private final SparseArray<View> d;

    public RecyclerHolder(View view) {
        super(view);
        this.d = new SparseArray<>(10);
    }

    public <V extends View> V e(int i) {
        V v = (V) this.d.get(i);
        if (v != null) {
            return v;
        }
        V v2 = (V) this.itemView.findViewById(i);
        this.d.put(i, v2);
        return v2;
    }

    public RecyclerHolder b(int i, String str) {
        HealthTextView healthTextView = (HealthTextView) e(i);
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
        return this;
    }

    public RecyclerHolder a(int i, int i2) {
        View viewE = e(i);
        if (viewE != null) {
            viewE.setVisibility(i2);
        }
        return this;
    }

    public RecyclerHolder c(int i, String str, int i2) {
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("http")) {
                qqf.c(str, (ImageView) e(i), i2);
                return this;
            }
            d(i, str);
        }
        return this;
    }

    private RecyclerHolder d(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            qqf.c(str, (ImageView) e(i));
        }
        return this;
    }

    public RecyclerHolder d(int i, View.OnClickListener onClickListener) {
        View viewE = e(i);
        if (viewE != null) {
            viewE.setOnClickListener(onClickListener);
        }
        return this;
    }

    public RecyclerHolder e(int i, int i2) {
        View viewE = e(i);
        if (viewE != null) {
            viewE.setVisibility(i2);
        }
        return this;
    }
}

package com.xiaomi.hm.health.adapter;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public class MyViewHolder extends RecyclerView.ViewHolder {
    private SparseArray<View> a;

    public MyViewHolder(View view) {
        super(view);
        this.a = new SparseArray<>();
    }

    public View getItemView() {
        return this.itemView;
    }

    public <T extends View> T getView(int i) {
        T t = (T) this.a.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.itemView.findViewById(i);
        this.a.put(i, t2);
        return t2;
    }

    public void setChecked(@IdRes int i, boolean z) {
        ((CompoundButton) getView(i)).setChecked(z);
    }

    public void setImageDrawable(@IdRes int i, Drawable drawable) {
        ((ImageView) getView(i)).setImageDrawable(drawable);
    }

    public void setOnClickedListener(@Nullable View.OnClickListener onClickListener) {
        this.itemView.setOnClickListener(onClickListener);
    }

    public void setText(@IdRes int i, CharSequence charSequence) {
        ((TextView) getView(i)).setText(charSequence);
    }

    public void setText(@IdRes int i, @StringRes int i2) {
        ((TextView) getView(i)).setText(i2);
    }
}

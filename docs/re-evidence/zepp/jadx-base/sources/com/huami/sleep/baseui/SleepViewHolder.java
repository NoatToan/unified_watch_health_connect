package com.huami.sleep.baseui;

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

/* JADX INFO: loaded from: classes13.dex */
public class SleepViewHolder extends RecyclerView.ViewHolder {
    private SparseArray<View> a;

    public SleepViewHolder(View itemView) {
        super(itemView);
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

    public void setChecked(@IdRes int id, boolean checked) {
        ((CompoundButton) getView(id)).setChecked(checked);
    }

    public void setImageDrawable(@IdRes int id, Drawable res) {
        ((ImageView) getView(id)).setImageDrawable(res);
    }

    public void setOnClickedListener(@Nullable View.OnClickListener listener) {
        this.itemView.setOnClickListener(listener);
    }

    public void setText(@IdRes int viewId, CharSequence text) {
        ((TextView) getView(viewId)).setText(text);
    }

    public void setText(@IdRes int id, @StringRes int text) {
        ((TextView) getView(id)).setText(text);
    }
}

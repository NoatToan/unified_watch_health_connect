package com.huami.bodymeasurements.common.business.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public class BaseViewHolder<T> extends RecyclerView.ViewHolder {
    private static final String d = "BaseViewHolder";
    private SparseArray<View> a;
    private View b;
    private Context c;

    public BaseViewHolder(View view) {
        super(view);
        this.b = view;
        this.a = new SparseArray<>();
        this.c = view.getContext();
    }

    public static BaseViewHolder get(Context context, View view, ViewGroup viewGroup, int i, int i2) {
        return view == null ? new BaseViewHolder(context, LayoutInflater.from(context).inflate(i, viewGroup, false), viewGroup, i2) : (BaseViewHolder) view.getTag();
    }

    public View getItemView() {
        return this.b;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Landroid/view/View;>(I)TT; */
    public View getView(int i) {
        View view = this.a.get(i);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.b.findViewById(i);
        this.a.put(i, viewFindViewById);
        return viewFindViewById;
    }

    public BaseViewHolder setImageResource(int i, int i2) {
        ((ImageView) getView(i)).setImageResource(i2);
        return this;
    }

    public BaseViewHolder setText(int i, CharSequence charSequence) {
        ((TextView) getView(i)).setText(charSequence);
        return this;
    }

    public BaseViewHolder setTextColor(int i, @ColorRes int i2) {
        ((TextView) getView(i)).setTextColor(ContextCompat.getColor(this.c, i2));
        return this;
    }

    public BaseViewHolder setText(int i, @StringRes int i2) {
        return setText(i, this.c.getString(i2));
    }

    private BaseViewHolder(Context context, View view, ViewGroup viewGroup, int i) {
        super(view);
        this.c = context;
        this.b = this.itemView;
        this.a = new SparseArray<>();
        this.b.setTag(this);
    }
}

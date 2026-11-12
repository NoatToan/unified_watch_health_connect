package com.huawei.ui.commonui.adapter;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqf;

/* JADX INFO: loaded from: classes16.dex */
public class RecyclerHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<View> f23275c;

    public RecyclerHolder(View view) {
        super(view);
        this.f23275c = new SparseArray<>(10);
    }

    public <V extends View> V d(int i) {
        V v = (V) this.f23275c.get(i);
        if (v != null) {
            return v;
        }
        V v2 = (V) this.itemView.findViewById(i);
        this.f23275c.put(i, v2);
        return v2;
    }

    public RecyclerHolder a(int i, CharSequence charSequence) {
        HealthTextView healthTextView = (HealthTextView) d(i);
        if (healthTextView != null) {
            healthTextView.setText(charSequence);
        }
        return this;
    }

    public RecyclerHolder d(int i, int i2) {
        HealthTextView healthTextView = (HealthTextView) d(i);
        if (healthTextView != null) {
            healthTextView.setTextColor(i2);
        }
        return this;
    }

    public RecyclerHolder a(int i, String str) {
        HealthTextView healthTextView = (HealthTextView) d(i);
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
        return this;
    }

    public RecyclerHolder b(int i, int i2) {
        HealthTextView healthTextView = (HealthTextView) d(i);
        if (healthTextView != null) {
            try {
                healthTextView.setText(healthTextView.getContext().getResources().getString(i2));
                return this;
            } catch (Resources.NotFoundException unused) {
                healthTextView.setText("");
            }
        }
        return this;
    }

    public RecyclerHolder c(int i, int i2) {
        ImageView imageView = (ImageView) d(i);
        if (imageView != null) {
            imageView.setImageResource(i2);
        }
        return this;
    }

    public RecyclerHolder a(int i, Drawable drawable) {
        ImageView imageView;
        if (drawable != null && (imageView = (ImageView) d(i)) != null) {
            imageView.setImageDrawable(drawable);
        }
        return this;
    }

    public RecyclerHolder a(int i, Bitmap bitmap) {
        ImageView imageView;
        if (bitmap != null && (imageView = (ImageView) d(i)) != null) {
            imageView.setImageBitmap(bitmap);
        }
        return this;
    }

    public RecyclerHolder d(int i, String str, int i2) {
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("http")) {
                qqf.c(str, (ImageView) d(i), i2);
                return this;
            }
            d(i, str);
        }
        return this;
    }

    private RecyclerHolder d(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            qqf.c(str, (ImageView) d(i));
        }
        return this;
    }

    public RecyclerHolder e(int i, View.OnClickListener onClickListener) {
        View viewD = d(i);
        if (viewD != null && onClickListener != null) {
            viewD.setOnClickListener(onClickListener);
        }
        return this;
    }

    public RecyclerHolder e(int i, View.OnLongClickListener onLongClickListener) {
        View viewD = d(i);
        if (viewD != null && onLongClickListener != null) {
            viewD.setOnLongClickListener(onLongClickListener);
        }
        return this;
    }

    public RecyclerHolder c(int i, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        CompoundButton compoundButton = (CompoundButton) d(i);
        if (compoundButton != null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        }
        return this;
    }

    public RecyclerHolder e(int i, int i2) {
        if (d(i) != null) {
            d(i).setVisibility(i2);
        }
        return this;
    }

    public RecyclerHolder a(int i, boolean z) {
        CompoundButton compoundButton = (CompoundButton) d(i);
        if (compoundButton != null) {
            compoundButton.setChecked(z);
        }
        return this;
    }

    public RecyclerHolder e(int i, Drawable drawable) {
        View viewD = d(i);
        if (viewD != null) {
            viewD.setBackground(drawable);
        }
        return this;
    }
}

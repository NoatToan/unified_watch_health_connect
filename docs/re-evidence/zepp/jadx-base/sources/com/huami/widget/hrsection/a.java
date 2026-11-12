package com.huami.widget.hrsection;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceSpanUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
class a extends RecyclerView.Adapter<b> {
    private List<HeartRateSectionItem> a = new ArrayList();

    private static int a(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    private static int d(Context context, float f) {
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull b bVar, int i) {
        Context context = bVar.itemView.getContext();
        HeartRateSectionItem heartRateSectionItem = this.a.get(i);
        bVar.b.setText(heartRateSectionItem.name);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicWidth(a(context, 8.0f));
        shapeDrawable.setIntrinsicHeight(a(context, 8.0f));
        shapeDrawable.getPaint().setColor(heartRateSectionItem.color);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        bVar.b.setCompoundDrawablesRelativeWithIntrinsicBounds(shapeDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        bVar.a.setText(TypefaceSpanUtils.getStyledDigitsSpannableStringBuilder(heartRateSectionItem.time, context, Font.KM, Integer.valueOf(d(context, 24.0f)), Integer.valueOf(ContextCompat.getColor(context, R.color.hr_black70))));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hr_section_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.a.size();
    }

    public void setDataList(List<HeartRateSectionItem> list) {
        if (list != null) {
            this.a.clear();
            this.a.addAll(list);
        }
    }
}

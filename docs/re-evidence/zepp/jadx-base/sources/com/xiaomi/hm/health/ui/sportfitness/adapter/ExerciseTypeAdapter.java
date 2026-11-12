package com.xiaomi.hm.health.ui.sportfitness.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.ui.sportfitness.manager.ExerciseTypeChooseManager;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ExerciseTypeAdapter extends BaseAdapter {
    private static final String i = "ExerciseTypeAdapter";
    private int[] a;
    private int[] b;
    private Context c;
    private int d = 0;
    private ColorStateList e;
    private ColorStateList f;
    private ExerciseTypeChooseManager g;
    private List<Integer> h;

    public class a {
        public ImageView a;
        public TextView b;

        public a() {
        }
    }

    public ExerciseTypeAdapter(Context context) {
        this.c = context;
        ExerciseTypeChooseManager exerciseTypeChooseManager = ExerciseTypeChooseManager.getInstance();
        this.g = exerciseTypeChooseManager;
        int[][] iArrFilterExerciseType = exerciseTypeChooseManager.filterExerciseType(false);
        this.a = iArrFilterExerciseType[0];
        this.b = iArrFilterExerciseType[1];
        this.h = this.g.getIndexTypeList();
        this.e = ContextCompat.getColorStateList(context, R.color.theme_sporting_orange_zepp);
        this.f = ContextCompat.getColorStateList(context, R.color.s2);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b.length;
    }

    public int getExerTypeByDefIndex() {
        return this.h.get(this.d).intValue();
    }

    @Override // android.widget.Adapter
    public Object getItem(int position) {
        return this.c.getResources().getString(this.b[position]);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    public int getSelectIndex() {
        return this.d;
    }

    public int[] getTypeTitles() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewInflate;
        a aVar;
        if (convertView == null) {
            aVar = new a();
            viewInflate = View.inflate(this.c, R.layout.layout_exercise_choose_type_item, null);
            aVar.a = (ImageView) viewInflate.findViewById(R.id.sport_type_img);
            aVar.b = (TextView) viewInflate.findViewById(R.id.sport_type_txt);
            viewInflate.setTag(aVar);
        } else {
            viewInflate = convertView;
            aVar = (a) convertView.getTag();
        }
        Drawable drawable = ContextCompat.getDrawable(this.c, this.a[position]);
        Drawable drawable2 = ContextCompat.getDrawable(this.c, R.drawable.shape_sport_bg);
        aVar.a.setScaleType(ImageView.ScaleType.CENTER);
        aVar.a.setImageDrawable(drawable);
        TintUtils.tintDrawable(aVar.a, ContextCompat.getColor(this.c, R.color.s38));
        ColorStateList colorStateList = this.d == position ? this.e : this.f;
        aVar.a.setBackground(TintUtils.tintDrawable(drawable2, colorStateList));
        aVar.b.setTextColor(colorStateList);
        aVar.b.setText(this.b[position]);
        return viewInflate;
    }

    public boolean setDefIndexByExerType(int type) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.h.size()) {
                i2 = -1;
                break;
            }
            if (type == this.h.get(i2).intValue()) {
                break;
            }
            i2++;
        }
        setSelectIndex(i2 < 0 ? 0 : i2);
        return i2 >= 0;
    }

    public void setSelectIndex(int index) {
        this.d = index;
    }
}

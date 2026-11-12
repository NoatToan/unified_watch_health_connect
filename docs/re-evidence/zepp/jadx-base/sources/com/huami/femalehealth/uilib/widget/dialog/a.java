package com.huami.femalehealth.uilib.widget.dialog;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.femalehealth.uilib.R;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.WheelViewAdapter;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
class a implements WheelViewAdapter {
    private List<String> a;
    private Context b;
    private WheelView c;
    private int d;
    private int e;
    private int f;
    private float g;
    private float h;

    /* JADX INFO: renamed from: com.huami.femalehealth.uilib.widget.dialog.a$a, reason: collision with other inner class name */
    public class C0422a {
        public TextView a;

        public C0422a(View view) {
            this.a = (TextView) view.findViewById(R.id.content_txt);
        }
    }

    public a(Context context, WheelView wheelView, List<String> list) {
        this.b = context;
        this.a = list;
        this.c = wheelView;
        this.d = ContextCompat.getColor(context, R.color.fh_btn_main_color);
        this.e = ContextCompat.getColor(context, R.color.fh_999999);
        this.f = ContextCompat.getColor(context, R.color.fh_88999999);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.fh_font_size_12);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.fh_font_size_20);
    }

    @NotNull
    public String a() {
        return this.a.get(this.c.getRealCurrentItem());
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getBASE_BUNDLE() {
        return 0;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getEmptyItem(View view, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getInitLoopBase() {
        return 0;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getItem(int i, View view, ViewGroup viewGroup) {
        C0422a c0422a;
        if (view == null) {
            view = View.inflate(this.b, R.layout.fh_wheel_item_miui, null);
            c0422a = new C0422a(view);
            c0422a.a.getLayoutParams().height = this.b.getResources().getDimensionPixelSize(R.dimen.fh_distance_verify_item_height);
            view.setTag(c0422a);
        } else {
            c0422a = (C0422a) view.getTag();
        }
        TextView textView = c0422a.a;
        int realCurrentItem = this.c.getRealCurrentItem();
        if (i == realCurrentItem) {
            textView.setTextColor(this.d);
            textView.setTextSize(0, this.g);
        } else if (i == realCurrentItem - 1 || i == realCurrentItem + 1) {
            textView.setTextColor(this.e);
            textView.setTextSize(0, this.h);
        } else {
            textView.setTextColor(this.f);
            textView.setTextSize(0, this.h);
        }
        textView.setText(this.a.get(i));
        return view;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getItemsCount() {
        List<String> list = this.a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public boolean isNeedLoop() {
        return false;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}

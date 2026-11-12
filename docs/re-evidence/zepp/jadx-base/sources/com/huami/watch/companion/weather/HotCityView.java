package com.huami.watch.companion.weather;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class HotCityView extends TableLayout {
    private Context a;
    private String[] b;
    private final int c;
    private onItemClickListener d;

    public class a implements View.OnClickListener {
        private String a;
        private int b;

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (HotCityView.this.d != null) {
                HotCityView.this.d.onItemClick(this.a, this.b);
            }
        }
    }

    public interface onItemClickListener {
        void onItemClick(String str, int i);
    }

    public HotCityView(Context context) {
        super(context);
        this.c = 3;
        this.a = context;
    }

    private void b() {
        String[] strArr = this.b;
        if (strArr == null) {
            return;
        }
        int iCeil = (int) Math.ceil(strArr.length / 3);
        for (int i = 0; i < iCeil; i++) {
            TableRow tableRow = new TableRow(this.a);
            tableRow.setLayoutParams(new TableLayout.LayoutParams(-1, -2));
            tableRow.setPadding(0, dip2px(this.a, 6.0f), dip2px(this.a, 8.0f), dip2px(this.a, 6.0f));
            for (int i2 = 0; i2 < 3; i2++) {
                LinearLayout linearLayout = new LinearLayout(this.a);
                linearLayout.setLayoutParams(new TableRow.LayoutParams(-1, -1, 1.0f));
                if (i2 == 0) {
                    linearLayout.setGravity(3);
                } else if (i2 == 2) {
                    linearLayout.setGravity(5);
                } else {
                    linearLayout.setGravity(17);
                }
                TextView textView = new TextView(this.a);
                textView.setLayoutParams(new TableRow.LayoutParams(dip2px(this.a, 90.0f), dip2px(this.a, 28.0f)));
                textView.setGravity(17);
                textView.setTextColor(getColorStateList(R.drawable.hot_city_text_color_selector));
                textView.setBackgroundResource(R.drawable.border_weather_city_hot);
                int i3 = (i * 3) + i2;
                textView.setText(this.b[i3]);
                textView.setTag(this.b[i3]);
                textView.setClickable(true);
                textView.setOnClickListener(new a(this.b[i3], i3));
                linearLayout.addView(textView);
                tableRow.addView(linearLayout);
            }
            addView(tableRow);
        }
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public ColorStateList getColorStateList(int i) {
        return getResources().getColorStateList(i);
    }

    public void setCitys(String[] strArr) {
        if (strArr == null) {
            return;
        }
        this.b = strArr;
        b();
    }

    public void setOnItemClickListener(onItemClickListener onitemclicklistener) {
        this.d = onitemclicklistener;
    }

    public HotCityView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 3;
        this.a = context;
    }
}

package com.huawei.ui.main.stories.history.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.vrg;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class SportArrayAdapter extends ArrayAdapter<String> {
    private final List<Integer> e;

    public SportArrayAdapter(Context context, int i, String[] strArr, List<Integer> list) {
        super(context, i, strArr);
        this.e = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sport_spinner, viewGroup, false);
        ((LinearLayout) viewInflate.findViewById(R.id.sport_spinner_content)).setLayoutParams(new LinearLayout.LayoutParams(-2, (int) getContext().getResources().getDimension(R.dimen.health_common_48dp)));
        d(i, viewInflate);
        return viewInflate;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sport_spinner, viewGroup, false);
        HealthTextView healthTextViewD = d(i, viewInflate);
        healthTextViewD.setTextSize(0, getContext().getResources().getDimension(R.dimen.emui_text_size_button1));
        healthTextViewD.setTypeface(Typeface.create("emui_text_font_family_regular", 0));
        e(i, viewInflate);
        return viewInflate;
    }

    private void e(int i, View view) {
        ImageView imageView = (ImageView) view.findViewById(R.id.sport_icon);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.sport_icon_bg);
        view.findViewById(R.id.sport_icon_layout).setVisibility(0);
        if (i == 0) {
            imageView2.setVisibility(0);
            e(imageView2, R.drawable.ic_health_list_all);
        } else {
            b(imageView, this.e.get(i).intValue(), imageView2);
        }
    }

    private void b(ImageView imageView, int i, ImageView imageView2) {
        Context contextB = BaseApplication.b();
        int iC = vrg.c(contextB, i);
        Drawable drawableB = vrg.b(contextB, i);
        if (i == 512) {
            imageView.setVisibility(8);
            c(imageView2, drawableB);
        } else {
            imageView.setVisibility(0);
            c(imageView, drawableB);
            imageView2.setBackground(qqf.c(getContext().getDrawable(R.drawable.spinner_icon_shape), iC));
        }
    }

    private HealthTextView d(int i, View view) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.sport_text);
        healthTextView.setText(getItem(i));
        return healthTextView;
    }

    private void e(ImageView imageView, int i) {
        Context contextB = BaseApplication.b();
        if (LanguageUtil.ba(contextB)) {
            BitmapDrawable bitmapDrawableE = qqz.e(contextB, ContextCompat.getDrawable(contextB, i));
            if (bitmapDrawableE != null) {
                imageView.setImageDrawable(bitmapDrawableE);
                return;
            }
            return;
        }
        imageView.setImageResource(i);
    }

    private void c(ImageView imageView, Drawable drawable) {
        Context contextB = BaseApplication.b();
        if (LanguageUtil.ba(contextB)) {
            BitmapDrawable bitmapDrawableE = qqz.e(contextB, drawable);
            if (bitmapDrawableE != null) {
                imageView.setImageDrawable(bitmapDrawableE);
                return;
            }
            return;
        }
        imageView.setImageDrawable(drawable);
    }
}

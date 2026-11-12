package com.huawei.phoneservice.faq.base.widget;

import android.app.ActionBar;
import android.content.res.ColorStateList;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.phoneservice.faq.base.R;

/* JADX INFO: loaded from: classes13.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static float f21602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f21603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ColorStateList f21604c;
    private static CharSequence d;
    private static Boolean e;

    private static void a(ActionBar actionBar) {
        View customView = actionBar.getCustomView();
        if (customView == null || customView.getTag() == null) {
            return;
        }
        TextView textView = (TextView) d(customView, R.id.title);
        ColorStateList colorStateList = f21604c;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        float f = f21602a;
        if (f != 0.0f) {
            textView.setTextSize(0, f);
        }
    }

    public static void d(ActionBar actionBar, CharSequence charSequence) {
        d = charSequence;
        View customView = actionBar.getCustomView();
        if (customView == null || customView.getTag() == null) {
            return;
        }
        ((TextView) d(customView, R.id.title)).setText(d);
    }

    public static void e(ActionBar actionBar, boolean z) {
        actionBar.setHomeButtonEnabled(e() && z);
    }

    public static void d(ActionBar actionBar, boolean z, View.OnClickListener onClickListener) {
        actionBar.setDisplayHomeAsUpEnabled(e() && z);
        View customView = e() ? actionBar.getCustomView() : d(actionBar);
        if (customView != null && customView.getTag() != null) {
            View viewD = d(customView, R.id.btn_start);
            viewD.setOnClickListener(onClickListener);
            viewD.setVisibility(z ? 0 : 8);
        }
        f21603b = z;
    }

    public static boolean e() {
        synchronized (c.class) {
            if (e == null) {
                e = Boolean.valueOf(b("com.huawei.android.app.ActionBarEx") && b("huawei.com.android.internal.app.HwActionBarImpl"));
            }
        }
        return e.booleanValue();
    }

    private static boolean b(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static void c(ActionBar actionBar, TextView textView) {
        f21604c = textView.getTextColors();
        f21602a = textView.getTextSize();
        a(actionBar);
    }

    private static View d(ActionBar actionBar) {
        View customView = actionBar.getCustomView();
        if (customView != null) {
            return customView;
        }
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayShowCustomEnabled(true);
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(-1, -1);
        View viewInflate = LayoutInflater.from(actionBar.getThemedContext()).inflate(R.layout.faq_base_sdk_actionbar_layout, (ViewGroup) new LinearLayout(actionBar.getThemedContext()), false);
        actionBar.setCustomView(viewInflate, layoutParams);
        TextView textView = (TextView) d(viewInflate, R.id.title);
        CharSequence title = d;
        if (title == null) {
            title = actionBar.getTitle();
        }
        textView.setText(title);
        a(actionBar);
        d(viewInflate, R.id.btn_start).setVisibility(f21603b ? 0 : 8);
        return viewInflate;
    }

    protected static <T extends View> T d(View view, int i) {
        SparseArray sparseArray = (SparseArray) view.getTag();
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            view.setTag(sparseArray);
        }
        T t = (T) sparseArray.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) view.findViewById(i);
        sparseArray.put(i, t2);
        return t2;
    }
}

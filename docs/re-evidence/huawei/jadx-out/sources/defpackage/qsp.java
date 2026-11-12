package defpackage;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes.dex */
public class qsp {
    public static <T extends View> T a(View view, int i) {
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i);
    }

    public static <T extends View> T a(Activity activity, int i) {
        if (activity == null) {
            return null;
        }
        return (T) activity.findViewById(i);
    }

    public static void c(View view, int i) {
        if (view == null) {
            LogUtil.j("ViewUtils", "setVisibility view is null");
        } else {
            view.setVisibility(i);
        }
    }

    public static void c(View view, Drawable drawable) {
        if (view == null) {
            LogUtil.j("ViewUtils", "setBackground view is null");
        } else {
            view.setBackground(drawable);
        }
    }

    public static void e(ImageView imageView, int i) {
        if (imageView == null) {
            LogUtil.j("ViewUtils", "setSrc view is null");
        } else {
            imageView.setImageResource(i);
        }
    }

    public static void a(ImageView imageView, Drawable drawable) {
        if (imageView == null) {
            LogUtil.j("ViewUtils", "setImageDrawable view is null");
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    public static void b(View view, int i) {
        if (view == null) {
            LogUtil.j("ViewUtils", "setBackground view is null");
        } else {
            view.setBackgroundColor(i);
        }
    }

    public static void e(View view, int i) {
        if (view == null) {
            LogUtil.j("ViewUtils", "setCardBackgroundColor view is null");
        } else {
            view.setBackgroundResource(i);
        }
    }

    public static void b(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            LogUtil.j("ViewUtils", "setOnClickListener view is null");
        } else {
            view.setOnClickListener(onClickListener);
        }
    }

    public static void e(View view, final OnClickSectionListener onClickSectionListener, final String str) {
        if (view == null || onClickSectionListener == null) {
            LogUtil.j("ViewUtils", "setOnSectionClickListener view or listener is null");
        } else {
            view.setOnClickListener(new View.OnClickListener() { // from class: qsp.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    onClickSectionListener.onClick(str);
                }
            });
        }
    }

    public static void e(TextView textView, int i) {
        if (textView == null) {
            LogUtil.j("ViewUtils", "setText view is null");
        } else {
            textView.setText(i);
        }
    }

    public static void b(TextView textView, CharSequence charSequence) {
        a(textView, charSequence, false);
    }

    public static void a(TextView textView, Drawable drawable) {
        if (textView == null) {
            LogUtil.j("ViewUtils", "setTextBackground view is null");
        } else {
            textView.setBackground(drawable);
        }
    }

    public static void c(TextView textView, int i) {
        if (textView == null) {
            LogUtil.j("ViewUtils", "setTextColor view is null");
        } else {
            textView.setTextColor(i);
        }
    }

    public static void b(TextView textView, Typeface typeface) {
        if (textView == null) {
            LogUtil.j("ViewUtils", "setTypeface view is null");
        } else {
            textView.setTypeface(typeface);
        }
    }

    public static void a(TextView textView, CharSequence charSequence, boolean z) {
        if (textView == null) {
            LogUtil.j("ViewUtils", "setText view is null");
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (z) {
                textView.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (z) {
                textView.setVisibility(0);
            }
        }
    }

    public static void b(TextView textView, CharSequence charSequence, boolean z) {
        if (textView == null) {
            LogUtil.j("ViewUtils", "setText view is null");
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (z) {
                textView.setVisibility(4);
            }
        } else {
            textView.setText(charSequence);
            if (z) {
                textView.setVisibility(0);
            }
        }
    }

    public static void b(TextView textView, float f) {
        c(textView, f, 1);
    }

    public static void c(TextView textView, float f, int i) {
        if (textView == null || f < 0.0f) {
            LogUtil.j("ViewUtils", "setTextSize param is invalid");
        } else {
            textView.setTextSize(i, f);
        }
    }

    public static void c(View view, float f) {
        if (view == null) {
            LogUtil.j("ViewUtils", "setAlpha view is null");
        } else {
            view.setAlpha(f);
        }
    }

    public static void e(HealthSubHeader healthSubHeader, String str) {
        if (healthSubHeader != null) {
            healthSubHeader.setHeadTitleText(str);
        }
    }

    public static void d(HealthSubHeader healthSubHeader, int i, String str, int i2, int i3) {
        healthSubHeader.setVisibility(i);
        healthSubHeader.setHeadTitleText(str);
        healthSubHeader.setMoreTextVisibility(i2);
        healthSubHeader.setSubHeaderBackgroundColor(0);
        healthSubHeader.setRightArrayVisibility(i3);
    }

    public static void c(HealthTextView healthTextView, Drawable drawable) {
        if (healthTextView == null || drawable == null) {
            LogUtil.j("ViewUtils", "setCompoundDrawablesRelative view is null");
        } else {
            healthTextView.setCompoundDrawablesRelative(drawable, null, null, null);
        }
    }

    public static void b(ViewGroup viewGroup, boolean z) {
        if (viewGroup == null) {
            LogUtil.j("ViewUtils", "setAnimateParentHierarchy view is null");
            return;
        }
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.setAnimateParentHierarchy(z);
        }
    }

    public static void a(HealthTextView healthTextView, boolean z) {
        if (healthTextView == null) {
            return;
        }
        healthTextView.setSplittable(z);
    }

    public static void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver = view != null ? view.getViewTreeObserver() : null;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void b(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver = view != null ? view.getViewTreeObserver() : null;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void a(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        if (view == null) {
            ReleaseLogUtil.d("ViewUtils", "addOnScrollChangedListener view is null");
        } else if (view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            ReleaseLogUtil.d("ViewUtils", "addOnScrollChangedListener observer is null or killed");
        } else {
            view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
        }
    }

    public static void c(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        if (view == null) {
            ReleaseLogUtil.d("ViewUtils", "removeOnScrollChangedListener view is null");
        } else if (view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            ReleaseLogUtil.d("ViewUtils", "removeOnScrollChangedListener observer is null or killed");
        } else {
            view.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        }
    }

    public static boolean e(TextView textView) {
        if (textView == null) {
            LogUtil.e("ViewUtils", "text is null");
            return false;
        }
        TextPaint paint = textView.getPaint();
        paint.setTextSize(textView.getTextSize());
        return ((int) paint.measureText(textView.getText().toString())) > textView.getWidth();
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("，")) {
            return str;
        }
        return str.split("，")[0].trim() + System.lineSeparator() + str.split("，")[1].trim();
    }
}

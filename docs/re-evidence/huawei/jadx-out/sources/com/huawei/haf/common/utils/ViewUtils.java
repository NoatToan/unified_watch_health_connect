package com.huawei.haf.common.utils;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ViewUtils {
    private ViewUtils() {
    }

    public static void c(Activity activity) {
        if (activity == null) {
            return;
        }
        if (!activity.isFinishing() || !activity.isDestroyed()) {
            LogUtil.e("HAF_ViewUtils", "removeAllViews, activity not finish or destroy");
            return;
        }
        int iE = e(activity.findViewById(R.id.content), true);
        if (iE > 0) {
            LogUtil.b("HAF_ViewUtils", "removeAllViews, num=", Integer.valueOf(iE), ", ", activity.getClass().getName());
        }
    }

    public static int e(View view, boolean z) {
        if (view == null) {
            return 0;
        }
        if (z) {
            c(view, false);
        }
        if (!(view instanceof ViewGroup) || (view instanceof AdapterView)) {
            return 0;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            childCount += e(viewGroup.getChildAt(i), z);
        }
        try {
            viewGroup.removeAllViews();
        } catch (Exception e) {
            LogUtil.e("HAF_ViewUtils", "removeAllViews ", viewGroup.getClass().getName(), ", ex=", LogUtil.c(e));
        }
        return childCount;
    }

    public static void c(View view, boolean z) {
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background != null) {
            background.setCallback(null);
        }
        view.setBackground(null);
        if (view instanceof ImageView) {
            e((ImageView) view, z);
        }
    }

    private static void e(ImageView imageView, boolean z) {
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.setCallback(null);
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            imageView.setImageBitmap(null);
            if (!z || bitmap == null) {
                return;
            }
            bitmap.recycle();
            return;
        }
        imageView.setImageDrawable(null);
    }

    public static void e(Activity activity) {
        int iA;
        if (activity == null) {
            return;
        }
        if (!activity.isFinishing() || !activity.isDestroyed()) {
            LogUtil.e("HAF_ViewUtils", "removeAllFragments, activity not finish or destroy");
            return;
        }
        if ((activity instanceof FragmentActivity) && (iA = a(((FragmentActivity) activity).getSupportFragmentManager(), 1)) > 0) {
            LogUtil.b("HAF_ViewUtils", "removeAllFragments new, num=", Integer.valueOf(iA), ", ", activity.getClass().getName());
        }
        int iB = b(activity.getFragmentManager(), 1);
        if (iB > 1) {
            LogUtil.b("HAF_ViewUtils", "removeAllFragments old, num=", Integer.valueOf(iB), ", ", activity.getClass().getName());
        }
    }

    private static int a(FragmentManager fragmentManager, int i) {
        List<Fragment> fragments = fragmentManager.getFragments();
        if (fragments.isEmpty()) {
            return 0;
        }
        int size = fragments.size();
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        for (Fragment fragment : fragments) {
            size += a(fragment.getChildFragmentManager(), i + 1);
            fragmentTransactionBeginTransaction.remove(fragment);
            LogUtil.c("HAF_ViewUtils", "removeFragments new, layer=", Integer.valueOf(i), ", ", fragment);
        }
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        return size;
    }

    private static int b(android.app.FragmentManager fragmentManager, int i) {
        List<android.app.Fragment> fragments = fragmentManager.getFragments();
        if (fragments.isEmpty()) {
            return 0;
        }
        int size = fragments.size();
        android.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        for (android.app.Fragment fragment : fragments) {
            fragmentTransactionBeginTransaction.remove(fragment);
            LogUtil.c("HAF_ViewUtils", "removeFragments old, layer=", Integer.valueOf(i), ", ", fragment);
        }
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        return size;
    }
}

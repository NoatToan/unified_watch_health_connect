package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.xiaomi.fitness.baseui.common.CommonBaseActivity;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class dih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile dih f15565a;

    public static dih a() {
        if (f15565a == null) {
            synchronized (dih.class) {
                try {
                    if (f15565a == null) {
                        f15565a = new dih();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15565a;
    }

    public static boolean j(Context context) {
        if (context == null) {
            return true;
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        return activity.isFinishing() || activity.isDestroyed();
    }

    public Intent b(Context context, FragmentParams fragmentParams, boolean z) {
        Intent intent = new Intent();
        intent.setClass(context, CommonBaseActivity.class);
        if (z) {
            intent.putExtra("fragment_param", (Parcelable) fragmentParams);
        } else {
            intent.putExtra("fragment_param", (Serializable) fragmentParams);
        }
        return intent;
    }

    public void c(Context context, Class cls, Bundle bundle, ActivityOptions activityOptions) {
        if (j(context)) {
            return;
        }
        Intent intent = new Intent();
        intent.setClass(context, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (activityOptions != null) {
            context.startActivity(intent, activityOptions.toBundle());
        } else {
            context.startActivity(intent);
        }
    }

    public void d(Context context, int i, FragmentParams fragmentParams, boolean z) {
        if (j(context)) {
            return;
        }
        Intent intent = new Intent();
        intent.setClass(context, CommonBaseActivity.class);
        k(intent, i);
        if (z) {
            intent.putExtra("fragment_param", (Parcelable) fragmentParams);
        } else {
            intent.putExtra("fragment_param", (Serializable) fragmentParams);
        }
        context.startActivity(intent);
    }

    public void e(Context context, FragmentParams fragmentParams) {
        f(context, fragmentParams, true);
    }

    public void f(Context context, FragmentParams fragmentParams, boolean z) {
        if (j(context)) {
            return;
        }
        context.startActivity(b(context, fragmentParams, z));
    }

    public void g(Context context, FragmentParams fragmentParams, boolean z, ActivityOptions activityOptions) {
        if (j(context)) {
            return;
        }
        Intent intentB = b(context, fragmentParams, z);
        if (activityOptions != null) {
            context.startActivity(intentB, activityOptions.toBundle());
        } else {
            context.startActivity(intentB);
        }
    }

    public void h(Activity activity, FragmentParams fragmentParams, int i) {
        i(activity, fragmentParams, i, true);
    }

    public void i(Activity activity, FragmentParams fragmentParams, int i, boolean z) {
        if (j(activity)) {
            return;
        }
        Intent intent = new Intent();
        intent.setClass(activity, CommonBaseActivity.class);
        if (z) {
            intent.putExtra("fragment_param", (Parcelable) fragmentParams);
        } else {
            intent.putExtra("fragment_param", (Serializable) fragmentParams);
        }
        activity.startActivityForResult(intent, i);
    }

    public final void k(Intent intent, int i) {
        if (i < 0) {
            return;
        }
        intent.setFlags(i);
    }
}

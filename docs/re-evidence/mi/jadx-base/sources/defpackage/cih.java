package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.nfc.common.CommonBaseActivity;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class cih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile cih f5375a;

    public static cih a() {
        if (f5375a == null) {
            synchronized (cih.class) {
                try {
                    if (f5375a == null) {
                        f5375a = new cih();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5375a;
    }

    public static boolean e(Context context) {
        if (context == null) {
            return true;
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        return activity.isFinishing() || activity.isDestroyed();
    }

    public void b(Context context, FragmentParams fragmentParams, boolean z) {
        if (e(context)) {
            return;
        }
        Intent intent = new Intent();
        intent.setClass(context, CommonBaseActivity.class);
        if (z) {
            intent.putExtra("fragment_param", (Parcelable) fragmentParams);
        } else {
            intent.putExtra("fragment_param", (Serializable) fragmentParams);
        }
        context.startActivity(intent);
    }

    public void c(Activity activity, FragmentParams fragmentParams, int i) {
        d(activity, fragmentParams, i, true);
    }

    public void d(Activity activity, FragmentParams fragmentParams, int i, boolean z) {
        if (e(activity)) {
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
}

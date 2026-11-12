package ohos.ace.plugin.abilityaccessctrl;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes46.dex */
public class AbilityAccessCtrl {
    private static final String LOG_TAG = "AbilityAccessCtrl";
    private Context mContext;

    protected native void nativeInit();

    public AbilityAccessCtrl(Context context) {
        this.mContext = context;
        nativeInit();
    }

    public boolean checkPermission(String str) {
        Log.i(LOG_TAG, "AbilityAccessCtrl: check from java");
        if (this.mContext.getPackageManager().checkPermission(str, this.mContext.getPackageName()) == 0) {
            Log.i(LOG_TAG, "AbilityAccessCtrl: has permission");
            return true;
        }
        Log.i(LOG_TAG, "AbilityAccessCtrl: not has permission");
        return false;
    }

    public void requestPermissions(String[] strArr) {
        Log.i(LOG_TAG, "AbilityAccessCtrl: request from java");
        Log.i(LOG_TAG, "AbilityAccessCtrl: request  " + strArr.length);
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        Fragment fragment = getFragment(activity);
        if (fragment != null) {
            Log.i(LOG_TAG, "AbilityAccessCtrl: fragment request");
            fragment.requestPermissions(strArr, 1);
        } else {
            Log.i(LOG_TAG, "AbilityAccessCtrl: curActivity request");
            activity.requestPermissions(strArr, 1);
        }
    }

    private Activity getActivity() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(objInvoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
        return null;
    }

    private Fragment getFragment(Activity activity) {
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        try {
            if (!(activity instanceof FragmentActivity) || (supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null) {
                return null;
            }
            for (Fragment fragment : fragments) {
                if (fragment != null && fragment.getUserVisibleHint()) {
                    return fragment;
                }
            }
            return null;
        } catch (NoClassDefFoundError unused) {
            Log.w(LOG_TAG, "FragmentActivity no class define found");
            return null;
        }
    }
}

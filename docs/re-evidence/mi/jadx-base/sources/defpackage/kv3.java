package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.log.Logger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class kv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile kv3 f24322a;

    public static kv3 a() {
        if (f24322a == null) {
            synchronized (kv3.class) {
                try {
                    if (f24322a == null) {
                        f24322a = new kv3();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f24322a;
    }

    public BaseFragment b(@NotNull Intent intent) {
        return c(d(intent));
    }

    public BaseFragment c(FragmentParams fragmentParams) {
        BaseFragment baseFragment;
        String className = fragmentParams.getClassName();
        Logger logger = Logger.INSTANCE;
        Logger.i("target fragment " + className, new Object[0]);
        if (TextUtils.isEmpty(className)) {
            throw new IllegalArgumentException("class name is empty");
        }
        try {
            baseFragment = (BaseFragment) Class.forName(className).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
            baseFragment = null;
        }
        if (baseFragment == null) {
            return null;
        }
        Bundle bundle = fragmentParams.getBundle();
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.setClassLoader(getClass().getClassLoader());
        baseFragment.setArguments(bundle);
        return baseFragment;
    }

    public FragmentParams d(@NotNull Intent intent) {
        return (FragmentParams) intent.getParcelableExtra("fragment_param");
    }
}

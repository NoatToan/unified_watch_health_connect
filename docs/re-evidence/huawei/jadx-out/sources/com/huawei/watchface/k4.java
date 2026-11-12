package com.huawei.watchface;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.DensityUtil;

/* JADX INFO: loaded from: classes20.dex */
public abstract class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f30269a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Toast f30270b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f30271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f30272b;

        public a(CharSequence charSequence, int i) {
            this.f30271a = charSequence;
            this.f30272b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            k4.b(this.f30271a, this.f30272b);
        }
    }

    public static void a(CharSequence charSequence, int i) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b(charSequence, i);
        } else {
            f30269a.post(new a(charSequence, i));
        }
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(str, 0);
    }

    public static void b(CharSequence charSequence, int i) {
        Toast toast = f30270b;
        if (toast != null) {
            toast.cancel();
        }
        Context contextC = Environment.c();
        if (contextC != null) {
            Toast toastMakeText = Toast.makeText(contextC, charSequence, i);
            f30270b = toastMakeText;
            toastMakeText.show();
        }
    }

    public static void a(int i, int i2) {
        a(DensityUtil.getStringById(i), i2);
    }

    public static void a(int i) {
        a(i, 0);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(str, 1);
    }
}

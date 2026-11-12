package com.huawei.watchface;

import android.Manifest;
import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public class j3 {
    public static j3 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f30253a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f30254b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f30255c = new ArrayList();

    public j3() {
        b();
    }

    public static j3 a() {
        j3 j3Var;
        synchronized (j3.class) {
            if (d == null) {
                d = new j3();
            }
            j3Var = d;
        }
        return j3Var;
    }

    public final void b() {
        synchronized (this) {
            for (Field field : Manifest.permission.class.getFields()) {
                try {
                    String str = (String) field.get("");
                    if (str != null) {
                        this.f30254b.add(str);
                    }
                } catch (IllegalAccessException e) {
                    HwLog.e("PermissionsManager", "Could not access the field:" + HwLog.printException((Exception) e));
                }
            }
        }
    }

    public boolean a(Context context, String str) {
        int iCheckSelfPermission;
        synchronized (this) {
            if (context == null) {
                return false;
            }
            if (!this.f30254b.contains(str)) {
                return true;
            }
            if (CommonUtils.isAndroid13()) {
                iCheckSelfPermission = ContextCompat.checkSelfPermission(context, str);
            } else {
                iCheckSelfPermission = PermissionChecker.checkSelfPermission(context, str);
            }
            return iCheckSelfPermission == 0;
        }
    }

    public void a(String[] strArr, int[] iArr) {
        synchronized (this) {
            int iMin = Math.min(strArr.length, iArr.length);
            Iterator it = this.f30255c.iterator();
            while (it.hasNext()) {
                j1.a(((WeakReference) it.next()).get());
                it.remove();
            }
            for (int i = 0; i < iMin; i++) {
                this.f30253a.remove(strArr[i]);
            }
        }
    }
}

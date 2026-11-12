package defpackage;

import com.huawei.ui.commonui.base.BaseActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class hzi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<WeakReference<BaseActivity>> f37378b = new ArrayList(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, List<WeakReference<BaseActivity>>> f37379c = new HashMap(10);

    public static void b(WeakReference<BaseActivity> weakReference) {
        f37378b.add(weakReference);
    }
}

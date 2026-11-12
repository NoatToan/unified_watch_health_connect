package defpackage;

import android.content.Context;
import com.huawei.hwidauth.c.j;
import com.huawei.hwidauth.c.k;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class nnk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadPoolExecutor f43317a = new nnt(1, 2, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), "Picker-Oauth-Pool");
    private static final nnk d = new nnk();

    private nnk() {
    }

    public static nnk a() {
        return d;
    }

    public void b(Context context, String str, k kVar, j jVar) {
        new nne(context, str, kVar, jVar).executeOnExecutor(f43317a, kVar);
    }
}

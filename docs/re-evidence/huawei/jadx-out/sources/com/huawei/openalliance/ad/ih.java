package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public class ih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f18956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gk f18957b;

    public long d() {
        return this.f18957b.aV();
    }

    public long c() {
        return ((long) this.f18957b.aN()) * 1048576;
    }

    public String b() {
        File file = this.f18956a;
        if (file == null) {
            return null;
        }
        return file.getPath();
    }

    public void a(long j) {
        this.f18957b.c(j);
    }

    public File a() {
        return this.f18956a;
    }

    public ih(Context context, String str) {
        File file = new File(com.huawei.openalliance.ad.utils.ab.i(context).getCacheDir(), File.separator + Constants.PPS_ROOT_PATH + File.separator + str + "_diskcache");
        this.f18956a = file;
        if (!file.exists() && !this.f18956a.mkdirs()) {
            hw.d("CacheConfig", "Create cache dir failed");
        }
        this.f18957b = fp.b(context);
    }
}

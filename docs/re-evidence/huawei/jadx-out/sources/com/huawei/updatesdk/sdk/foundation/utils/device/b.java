package com.huawei.updatesdk.sdk.foundation.utils.device;

import android.content.Context;
import com.huawei.updatesdk.sdk.foundation.utils.f;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public class b extends com.huawei.updatesdk.sdk.service.storekit.bean.b {
    private String abis_;
    private String deviceFeatures_;
    private int dpi_;
    private String preferLan_;

    /* JADX INFO: renamed from: com.huawei.updatesdk.sdk.foundation.utils.device.b$b, reason: collision with other inner class name */
    public static class C0291b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f29903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f29904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set<String> f29905c;
        private String[] d;
        private boolean e;

        public b a() {
            b bVar = new b();
            bVar.abis_ = f.a(c.k(), ",");
            bVar.dpi_ = Integer.parseInt(c.e(this.f29903a));
            bVar.preferLan_ = b();
            if (this.f29904b) {
                bVar.deviceFeatures_ = c.a(this.f29903a);
            }
            return bVar;
        }

        public C0291b a(boolean z) {
            this.f29904b = z;
            return this;
        }

        private String b() {
            ArrayList arrayList = new ArrayList(c.c(this.f29903a));
            Set<String> set = this.f29905c;
            if (set != null) {
                for (String str : set) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            }
            return this.e ? f.a(c.a(arrayList, this.d), ",") : f.a(arrayList, ",");
        }

        public C0291b(Context context) {
            this.f29903a = context;
        }
    }

    private b() {
    }
}

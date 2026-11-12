package com.huawei.openalliance.ad.net.http;

import android.content.Context;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.z;
import java.net.InetAddress;
import java.util.List;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes12.dex */
public class l implements Dns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Dns f19705a = Dns.SYSTEM;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f19707c;

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String str) {
        hw.b("OkHttpDNS", "lookup for :" + dg.h(str) + ",useHuaweiDNS:" + this.f19706b);
        if (this.f19706b && z.a()) {
            List<InetAddress> listA = z.a(this.f19707c, str);
            if (!listA.isEmpty()) {
                return listA;
            }
        }
        return f19705a.lookup(str);
    }

    public l(Context context, boolean z) {
        this.f19707c = context;
        this.f19706b = z;
    }
}

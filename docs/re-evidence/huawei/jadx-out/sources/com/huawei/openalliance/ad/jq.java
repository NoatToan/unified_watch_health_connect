package com.huawei.openalliance.ad;

import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class jq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static jq f19377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f19378b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f19379c = new byte[0];
    private final Map<String, Set<a>> d = new HashMap();

    /* JADX INFO: loaded from: classes.dex */
    public interface a {
        void a(String str, Intent intent);
    }

    public void b(String str, a aVar) {
        if (TextUtils.isEmpty(str) || aVar == null) {
            return;
        }
        synchronized (this.f19379c) {
            Set<a> set = this.d.get(str);
            if (set != null) {
                set.remove(aVar);
                if (set.isEmpty()) {
                    this.d.remove(str);
                }
            }
        }
    }

    public void a(String str, a aVar) {
        if (TextUtils.isEmpty(str) || aVar == null) {
            return;
        }
        synchronized (this.f19379c) {
            Set<a> hashSet = this.d.get(str);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                this.d.put(str, hashSet);
            }
            hashSet.add(aVar);
        }
    }

    public void a(final String str, final Intent intent) {
        synchronized (this.f19379c) {
            Set<a> set = this.d.get(str);
            if (set != null) {
                for (final a aVar : set) {
                    if (aVar != null) {
                        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.jq.1
                            @Override // java.lang.Runnable
                            public void run() {
                                aVar.a(str, intent);
                            }
                        });
                    }
                }
            }
        }
    }

    public static jq a() {
        jq jqVar;
        synchronized (f19378b) {
            if (f19377a == null) {
                f19377a = new jq();
            }
            jqVar = f19377a;
        }
        return jqVar;
    }

    private jq() {
    }
}

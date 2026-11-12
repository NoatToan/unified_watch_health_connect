package com.huawei.openalliance.ad;

import android.view.View;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.js;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class jr<V extends js> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ContentRecord f19383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected rc f19384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private V f19385c;
    private Map<String, Boolean> d = new HashMap();
    private String e;

    public String g() {
        V v = this.f19385c;
        if (v instanceof View) {
            return vv.b((View) v);
        }
        return null;
    }

    protected String f() {
        return com.huawei.openalliance.ad.utils.dk.a(d());
    }

    public void e() {
        Map<String, Boolean> map = this.d;
        if (map == null) {
            return;
        }
        map.clear();
    }

    public V d() {
        return this.f19385c;
    }

    public void b(long j) {
        ContentRecord contentRecord = this.f19383a;
        if (contentRecord == null) {
            hw.b("BasePresenter", "contentRecord is null");
        } else if (contentRecord.l() != null && this.f19383a.l().equals(this.e)) {
            hw.b("BasePresenter", "Duplicate escalation videoTime event for %s", this.f19383a.l());
        } else {
            this.f19384b.a(j);
            this.e = this.f19383a.l();
        }
    }

    public void a(String str) {
        ContentRecord contentRecord = this.f19383a;
        if (contentRecord == null) {
            return;
        }
        contentRecord.c(str);
        this.f19384b.a(this.f19383a);
        e();
    }

    public void a(V v) {
        this.f19385c = v;
    }

    public void a(long j, long j2) {
        String str;
        ContentRecord contentRecord = this.f19383a;
        if (contentRecord == null || !contentRecord.aO()) {
            return;
        }
        if (j >= j2) {
            str = "complete";
            if (b("complete")) {
                return;
            } else {
                this.f19384b.u();
            }
        } else {
            long j3 = j2 / 4;
            if (j > 3 * j3) {
                str = "thirdQuartile";
                if (b("thirdQuartile")) {
                    return;
                } else {
                    this.f19384b.s();
                }
            } else if (j > j2 / 2) {
                str = "midpoint";
                if (b("midpoint")) {
                    return;
                } else {
                    this.f19384b.r();
                }
            } else if (j > j3) {
                str = "firstQuartile";
                if (b("firstQuartile")) {
                    return;
                } else {
                    this.f19384b.q();
                }
            } else {
                if (j <= 0) {
                    return;
                }
                str = "start";
                if (b("start")) {
                    return;
                } else {
                    this.f19384b.t();
                }
            }
        }
        this.d.put(str, true);
    }

    public void a(long j, int i, int i2, int i3) {
        pb pbVar = new pb();
        pbVar.b(Integer.valueOf(i2));
        pbVar.a(Integer.valueOf(i3));
        this.f19384b.a(j, i, pbVar);
    }

    public void a(long j) {
        ContentRecord contentRecord = this.f19383a;
        if (contentRecord == null) {
            return;
        }
        contentRecord.h(j);
        this.f19384b.a(this.f19383a);
    }

    private boolean b(String str) {
        return this.d.containsKey(str) && this.d.get(str).booleanValue();
    }
}

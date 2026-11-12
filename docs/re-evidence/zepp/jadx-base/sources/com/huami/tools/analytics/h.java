package com.huami.tools.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.tools.analytics.internal.function.Function;
import com.huami.tools.analytics.internal.utils.Const;
import com.huami.tools.analytics.internal.utils.DefaultClock;
import com.huami.tools.analytics.internal.utils.JavaUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
class h implements Tracker {
    private final String a;
    private final Context b;
    private final String c;
    private final l d;
    private final boolean e;
    private e f;
    private a0 g;
    private q h;
    private q i;
    private Map<String, Long> j = new HashMap();

    public h(@NonNull Context context, boolean z, @NonNull String str, l lVar) {
        this.b = context;
        this.e = z;
        this.c = str;
        this.d = lVar;
        StringBuilder sb = new StringBuilder();
        sb.append(Const.LOG_TAG_PREFIX);
        sb.append(z ? "AnonymousTracker" : "IdentifiedTracker");
        this.a = sb.toString();
    }

    private HuamiAnalytics a() {
        return HuamiAnalytics.get();
    }

    public void b() {
        f anonymousDbApi = this.e ? new DbApis.AnonymousDbApi() : new DbApis.IdentifiedDbApi();
        anonymousDbApi.init(this.b);
        this.f = new e(this.b, this.d, this.e);
        this.g = new a0(a().k(), false, this.e, this.c);
        this.h = new n(a().j(), anonymousDbApi, this.f);
        this.i = new z(new g(a().n(), TimeUnit.SECONDS.toMillis(15L), this.e), anonymousDbApi, this.f, this.g, this.e);
    }

    public void c() {
        this.i.a(null);
    }

    @Override // com.huami.tools.analytics.Tracker
    public void enableAutoTrackPage(boolean z) {
        HuamiAnalytics huamiAnalytics = HuamiAnalytics.get();
        if (z) {
            huamiAnalytics.e(this);
        } else {
            huamiAnalytics.q(this);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return JavaUtils.equals(this.c, hVar.c) && this.e == hVar.e;
    }

    @Override // com.huami.tools.analytics.Tracker
    @NonNull
    public String getOriginalUploadHost() {
        return "https://app-analytics.huami.com/";
    }

    public int hashCode() {
        return (this.c + this.e).hashCode();
    }

    @Override // com.huami.tools.analytics.Tracker
    public void record(HitEvent hitEvent) {
        if (!a().isEnabled()) {
            p.b().v(this.a, "统计功能未开启，不记录打点事件");
            return;
        }
        if (hitEvent == null) {
            p.b().v(this.a, "记录事件时没有传事件过来，什么也不做");
        } else if (!(hitEvent instanceof Event)) {
            p.b().v(this.a, "不是通过EventBuilders生成的事件，直接忽略，什么也不做");
        } else {
            this.h.a((Event) hitEvent);
        }
    }

    @Override // com.huami.tools.analytics.Tracker
    public void recordPageEnd(@NonNull String str) {
        recordPageEnd(str, null);
    }

    @Override // com.huami.tools.analytics.Tracker
    public void recordPageStart(@NonNull String str) {
        if (!a().isEnabled()) {
            p.b().v(this.a, "统计功能未开启，不记录页面开始事件");
            return;
        }
        if (this.j.containsKey(str)) {
            return;
        }
        this.j.put(str, Long.valueOf(DefaultClock.get().currentTimeMillis()));
        p.b().v(this.a, "记录页面访问开始：" + str);
    }

    @Override // com.huami.tools.analytics.Tracker
    public void setDebug(boolean z) {
        a0 a0Var = this.g;
        if (a0Var != null) {
            a0Var.f(z);
        }
    }

    @Override // com.huami.tools.analytics.Tracker
    public void setRegion(String str) {
    }

    @Override // com.huami.tools.analytics.Tracker
    public void setUid(String str) {
        if (this.e) {
            p.b().d(this.a, "匿名追踪器不保存用户id");
        } else {
            this.f.b(str);
        }
    }

    @Override // com.huami.tools.analytics.Tracker
    public void setUploadHostMapper(@NonNull Function<String, String> function) {
        a0 a0Var = this.g;
        if (a0Var != null) {
            a0Var.g(function);
        }
    }

    @Override // com.huami.tools.analytics.Tracker
    public void recordPageEnd(@NonNull String str, @Nullable Map<String, String> map) {
        if (!a().isEnabled()) {
            p.b().v(this.a, "统计功能未开启，不记录页面结束事件");
            return;
        }
        Long l = this.j.get(str);
        if (l != null) {
            this.j.remove(str);
            long jCurrentTimeMillis = DefaultClock.get().currentTimeMillis();
            long jLongValue = jCurrentTimeMillis - l.longValue();
            if (a.d(str, l, jCurrentTimeMillis)) {
                record((Event) EventBuilders.b().b(jLongValue).c(str).setExtras(map).build());
                p.b().v(this.a, "记录页面访问结束：" + str);
            }
        }
    }
}

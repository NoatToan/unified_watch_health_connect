package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public abstract class dr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f18638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f18639b;

    public interface a {
        void a(AppInfo appInfo);

        void b(AppInfo appInfo);

        void c(AppInfo appInfo);
    }

    public abstract void a(AppInfo appInfo, ContentRecord contentRecord, long j);

    protected void c(AppInfo appInfo) {
        a aVar = this.f18639b;
        if (aVar != null) {
            aVar.c(appInfo);
        }
    }

    protected void b(AppInfo appInfo) {
        a aVar = this.f18639b;
        if (aVar != null) {
            aVar.b(appInfo);
        }
    }

    protected void a(AppInfo appInfo) {
        a aVar = this.f18639b;
        if (aVar != null) {
            aVar.a(appInfo);
        }
    }

    public void a(a aVar) {
        this.f18639b = aVar;
    }

    public Context a() {
        return this.f18638a;
    }

    public dr(Context context) {
        this.f18638a = context;
    }
}

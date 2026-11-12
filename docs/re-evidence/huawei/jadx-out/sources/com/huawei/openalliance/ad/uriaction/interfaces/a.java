package com.huawei.openalliance.ad.uriaction.interfaces;

import android.content.Context;
import com.huawei.openalliance.ad.constant.NativeSdkCallbackMethods;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.gr;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f20323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ContentRecord f20324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected HandleUrlCallBack f20325c;
    private a f;
    private String e = null;
    protected int d = 0;

    public abstract boolean a();

    public void c(String str) {
        this.e = str;
    }

    public String c() {
        a aVar;
        String str = this.e;
        return (str != null || (aVar = this.f) == null) ? str : aVar.c();
    }

    public boolean b() {
        a aVar = this.f;
        if (aVar != null) {
            return aVar.a();
        }
        return false;
    }

    public void b(int i) {
        this.d = i;
    }

    public void a(boolean z) {
        if (this.f20325c == null) {
            return;
        }
        gr grVar = new gr();
        grVar.b("clickActionType", this.d);
        grVar.b(NativeSdkCallbackMethods.HANDLE_URL_RESULT, z);
        this.f20325c.a(grVar.a());
    }

    public void a(a aVar) {
        this.f = aVar;
    }

    public void a(HandleUrlCallBack handleUrlCallBack) {
        this.f20325c = handleUrlCallBack;
    }

    public a(Context context, ContentRecord contentRecord) {
        this.f20323a = context;
        this.f20324b = contentRecord;
    }

    public a() {
    }
}

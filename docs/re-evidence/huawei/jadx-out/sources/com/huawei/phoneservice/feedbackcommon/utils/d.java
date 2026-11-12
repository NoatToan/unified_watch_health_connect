package com.huawei.phoneservice.feedbackcommon.utils;

import android.content.Context;
import com.huawei.hms.framework.network.restclient.hwhttp.Submit;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest;
import com.huawei.phoneservice.feedbackcommon.entity.FeedbackZipBean;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected WeakReference<Submit> f21900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected WeakReference<com.huawei.hms.network.httpclient.Submit<ResponseBody>> f21901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected WeakReference<BaseSdkUpdateRequest> f21902c;
    protected Context e;
    protected boolean d = false;
    protected List<FeedbackZipBean> f = new ArrayList(20);
    protected CancelInterface g = new b();

    class b implements CancelInterface {
        @Override // com.huawei.phoneservice.feedbackcommon.utils.CancelInterface
        public void isCancel(boolean z) {
            if (z) {
                WeakReference<Submit> weakReference = d.this.f21900a;
                if (weakReference != null && weakReference.get() != null) {
                    d.this.f21900a.get().cancel();
                    d.this.f21900a.clear();
                    d.this.f21900a = null;
                }
                WeakReference<com.huawei.hms.network.httpclient.Submit<ResponseBody>> weakReference2 = d.this.f21901b;
                if (weakReference2 != null && weakReference2.get() != null) {
                    d.this.f21901b.get().cancel();
                    d.this.f21901b.clear();
                    d.this.f21901b = null;
                }
                WeakReference<BaseSdkUpdateRequest> weakReference3 = d.this.f21902c;
                if (weakReference3 == null || weakReference3.get() == null) {
                    return;
                }
                com.huawei.phoneservice.faq.base.util.i.a().unregisterUpdateListener(d.this.f21902c.get());
                d.this.f21902c.clear();
                d.this.f21902c = null;
            }
        }

        b() {
        }
    }

    public CancelInterface a() {
        return this.g;
    }
}

package com.huawei.openalliance.ad.views.feedback;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.openalliance.ad.activity.AdComplainActivity;
import com.huawei.openalliance.ad.beans.feedback.AdditionalContext;
import com.huawei.openalliance.ad.beans.feedback.ComplainAddInfo;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<g> f21206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ContentRecord f21207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<FeedbackInfo> f21208c;
    private List<FeedbackInfo> d;
    private FeedbackInfo e;
    private Context f;
    private f g;

    public boolean f() {
        hw.b("FeedbackPresenter", "click complain");
        if (this.e == null) {
            return false;
        }
        try {
            Intent intent = new Intent(this.f, (Class<?>) AdComplainActivity.class);
            intent.putExtra(MapKeyNames.COMPLAIN_H5_TITLE, this.e.getLabel());
            AdComplainActivity.a(this.g);
            if (!(this.f instanceof Activity)) {
                intent.addFlags(268435456);
            }
            dk.a(this.f, intent);
            g();
            return true;
        } catch (Throwable th) {
            hw.c("FeedbackPresenter", "start ac failed: %s", th.getClass().getSimpleName());
            return true;
        }
    }

    public String e() {
        ContentRecord contentRecord = this.f21207b;
        return contentRecord != null ? contentRecord.be() : "";
    }

    public boolean d() {
        ContentRecord contentRecord = this.f21207b;
        if (contentRecord != null) {
            return contentRecord.bf();
        }
        return false;
    }

    public FeedbackInfo c() {
        return this.e;
    }

    public List<FeedbackInfo> b() {
        return this.d;
    }

    public boolean a(Context context) {
        ContentRecord contentRecord = this.f21207b;
        if (contentRecord == null) {
            return false;
        }
        return as.a(context, contentRecord);
    }

    public void a(Context context, ContentRecord contentRecord, h hVar) {
        List<FeedbackInfo> list;
        this.f = context.getApplicationContext();
        if (contentRecord == null || bm.a(contentRecord.aN())) {
            return;
        }
        this.f21207b = contentRecord;
        this.g = new a(context, contentRecord, hVar);
        List<FeedbackInfo> listAN = this.f21207b.aN();
        this.d = new ArrayList();
        this.f21208c = new ArrayList();
        for (FeedbackInfo feedbackInfo : listAN) {
            if (feedbackInfo != null) {
                int type = feedbackInfo.getType();
                if (type == 1) {
                    list = this.d;
                } else if (type == 2) {
                    list = this.f21208c;
                } else if (type != 3) {
                    hw.a("FeedbackPresenter", "invalid feedback type");
                } else {
                    this.e = feedbackInfo;
                }
                list.add(feedbackInfo);
            }
        }
        g gVar = this.f21206a.get();
        if (gVar != null) {
            gVar.c();
        }
    }

    public List<FeedbackInfo> a() {
        return this.f21208c;
    }

    private void g() {
        AdditionalContext additionalContextA;
        ComplainAddInfo complainAddInfoA = this.g.a();
        if (complainAddInfoA == null || (additionalContextA = complainAddInfoA.a()) == null) {
            return;
        }
        hw.b("FeedbackPresenter", "add info: %s", additionalContextA.toString());
    }

    public d(g gVar) {
        this.f21206a = new WeakReference<>(gVar);
    }
}

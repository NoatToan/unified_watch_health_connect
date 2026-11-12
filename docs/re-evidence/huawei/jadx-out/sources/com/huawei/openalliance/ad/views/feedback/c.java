package com.huawei.openalliance.ad.views.feedback;

import android.content.Context;
import android.view.View;
import com.huawei.hms.ads.AdFeedbackListener;

/* JADX INFO: loaded from: classes12.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f21203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdFeedbackListener f21204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdFeedbackListener f21205c;
    private Context d = null;

    public Context d() {
        return this.d;
    }

    public AdFeedbackListener c() {
        return this.f21205c;
    }

    public void b(AdFeedbackListener adFeedbackListener) {
        this.f21205c = adFeedbackListener;
    }

    public AdFeedbackListener b() {
        return this.f21204b;
    }

    public void a(AdFeedbackListener adFeedbackListener) {
        this.f21204b = adFeedbackListener;
    }

    public void a(View view) {
        this.f21203a = view;
    }

    public void a(Context context) {
        this.d = context;
    }

    public View a() {
        return this.f21203a;
    }
}

package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes33.dex */
public class DialogRedirectImpl extends DialogRedirect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f13054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Intent f13056c;

    DialogRedirectImpl(Intent intent, Activity activity, int i) {
        this.f13056c = intent;
        this.f13054a = activity;
        this.f13055b = i;
    }

    @Override // com.huawei.hms.common.internal.DialogRedirect
    public final void redirect() {
        Activity activity;
        Intent intent = this.f13056c;
        if (intent == null || (activity = this.f13054a) == null) {
            return;
        }
        activity.startActivityForResult(intent, this.f13055b);
    }
}

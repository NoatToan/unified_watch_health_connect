package com.garmin.android.apps.connectmobile.activities.deeplink;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import ch.qos.logback.core.CoreConstants;
import en.n;
import hb2.g;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/deeplink/e;", "Lnl0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"QueryPermissionsNeeded"})
public abstract class e implements nl0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29013a;

    public e(Context context) {
        context.getClass();
        this.f29013a = context;
    }

    public abstract Intent a();

    @Override // nl0.a
    public final void execute() {
        g.a aVar = g.a.GARMIN_PILOT;
        Context context = this.f29013a;
        if (!g.b(context, aVar)) {
            AppPromoPopupActivity.a.c(AppPromoPopupActivity.f29002e, context, n.GARMIN_PILOT, 60);
            return;
        }
        Intent intentA = a();
        if (intentA != null) {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intentA, 0);
            listQueryIntentActivities.getClass();
            if (listQueryIntentActivities.isEmpty()) {
                return;
            }
            context.startActivity(intentA);
        }
    }
}

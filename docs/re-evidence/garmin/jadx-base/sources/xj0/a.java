package xj0;

import android.content.Context;
import android.content.Intent;
import c80.q;
import com.garmin.android.apps.connectmobile.gcplus.presentation.feedback.GCPlusFeedbackActivity;
import com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeActivity;
import p005kotlin.Metadata;
import ub1.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxj0/a;", "Lub1/g;", "<init>", "()V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements g {
    @Override // ub1.g
    public final Intent a(Context context) {
        context.getClass();
        return GCPlusHomeActivity.a.a(GCPlusHomeActivity.f35323e, context, GCPlusHomeActivity.b.c.f35330a, 2);
    }

    @Override // ub1.g
    public final Intent b(Context context) {
        context.getClass();
        return GCPlusHomeActivity.a.a(GCPlusHomeActivity.f35323e, context, GCPlusHomeActivity.b.d.f35331a, 2);
    }

    @Override // ub1.g
    public final Intent c(Context context) {
        context.getClass();
        return GCPlusHomeActivity.a.a(GCPlusHomeActivity.f35323e, context, null, 4);
    }

    @Override // ub1.g
    public final Intent d(Context context) {
        context.getClass();
        return GCPlusHomeActivity.a.a(GCPlusHomeActivity.f35323e, context, GCPlusHomeActivity.b.C0609b.f35329a, 2);
    }

    @Override // ub1.g
    public final Intent e(Context context, boolean z14) {
        context.getClass();
        GCPlusFeedbackActivity.f35317b.getClass();
        Intent intent = new Intent(context, (Class<?>) GCPlusFeedbackActivity.class);
        intent.putExtra("FROM_SETTINGS", z14);
        return intent;
    }

    @Override // ub1.g
    public final Intent f(Context context, String str) {
        context.getClass();
        return GCPlusHomeActivity.a.a(GCPlusHomeActivity.f35323e, context, new GCPlusHomeActivity.b.a(str), 2);
    }

    @Override // ub1.g
    public final Intent g(Context context, q qVar, boolean z14) {
        context.getClass();
        GCPlusHomeActivity.f35323e.getClass();
        Intent intent = new Intent(context, (Class<?>) GCPlusHomeActivity.class);
        intent.putExtra("EXTRA_DESTINATION", new GCPlusHomeActivity.b.e(z14, qVar));
        return intent;
    }
}

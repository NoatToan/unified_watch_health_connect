package com.garmin.android.apps.connectmobile.personalizedinsights.presentation.consent;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dev.PersonalizedInsightsDevMenuActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import f12.l;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q92.x;
import v92.e0;
import z10.y0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/personalizedinsights/presentation/consent/PersonalizedInsightsConsentActivity;", "Lz10/y0;", "<init>", "()V", "a", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PersonalizedInsightsConsentActivity extends y0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f40319t = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h91.b f40320r;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40321a;

        static {
            int[] iArr = new int[h91.b.values().length];
            try {
                iArr[h91.b.DASHBOARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h91.b.DEV_MENU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f40321a = iArr;
        }
    }

    @Override // z10.y0
    public final x[] Aa() {
        return new x[]{x.DI_CONNECT_UPLOAD, x.DI_CONNECT_AI};
    }

    @Override // z10.y0
    public final void Ba() {
        sn.a.o(l.f68084a, true);
        h91.b bVar = this.f40320r;
        if (bVar == null) {
            s.m(FirebaseAnalytics.Param.DESTINATION);
            throw null;
        }
        int i14 = b.f40321a[bVar.ordinal()];
        if (i14 == 1) {
            finish();
        } else {
            if (i14 != 2) {
                u0.r();
                return;
            }
            PersonalizedInsightsDevMenuActivity.f40322b.getClass();
            startActivity(new Intent(this, (Class<?>) PersonalizedInsightsDevMenuActivity.class));
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final e0 oa() {
        return e0.ASK_FOR_DEVICE_UPLOAD_OPTIONAL;
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void wa(Intent intent) {
        Object serializableExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("DESTINATION", h91.b.class);
        } else {
            Object serializableExtra2 = intent.getSerializableExtra("DESTINATION");
            if (!(serializableExtra2 instanceof h91.b)) {
                serializableExtra2 = null;
            }
            serializableExtra = (h91.b) serializableExtra2;
        }
        h91.b bVar = (h91.b) serializableExtra;
        if (bVar == null) {
            bVar = h91.b.DASHBOARD;
        }
        this.f40320r = bVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/personalizedinsights/presentation/consent/PersonalizedInsightsConsentActivity$a;", "", "<init>", "()V", "", "EXTRA_DESTINATION", "Ljava/lang/String;", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, h91.b bVar) {
            context.getClass();
            bVar.getClass();
            Intent intent = new Intent(context, (Class<?>) PersonalizedInsightsConsentActivity.class);
            intent.putExtra("DESTINATION", bVar);
            return intent;
        }

        private a() {
        }
    }
}

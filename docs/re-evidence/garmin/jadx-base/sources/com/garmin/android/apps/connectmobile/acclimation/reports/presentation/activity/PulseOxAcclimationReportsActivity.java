package com.garmin.android.apps.connectmobile.acclimation.reports.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import b.j;
import com.garmin.android.apps.connectmobile.d;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import sl.b;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/acclimation/reports/presentation/activity/PulseOxAcclimationReportsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PulseOxAcclimationReportsActivity extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f28764a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.a(this);
        initComposeScreen(new e(-1356939902, true, new b(this, 0)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/acclimation/reports/presentation/activity/PulseOxAcclimationReportsActivity$a;", "", "<init>", "()V", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, DateTime dateTime) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) PulseOxAcclimationReportsActivity.class);
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse("connect://dailyPulseOxAcclimationReport"));
            intent.putExtra("extra.date.time", dateTime);
            context.startActivity(intent);
        }

        private a() {
        }
    }
}

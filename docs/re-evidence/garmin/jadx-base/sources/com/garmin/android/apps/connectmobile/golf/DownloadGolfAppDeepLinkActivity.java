package com.garmin.android.apps.connectmobile.golf;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.c;
import hb2.g;
import nl0.b;
import nl0.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/golf/DownloadGolfAppDeepLinkActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DownloadGolfAppDeepLinkActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35745a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        Intent intent = getIntent();
        long longExtra = intent.getLongExtra("scorecardId", -1L);
        String str = "";
        String strValueOf = longExtra > 0 ? String.valueOf(longExtra) : "";
        String stringExtra2 = intent.getStringExtra("action");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (intent.hasExtra("score_type") && (stringExtra = intent.getStringExtra("score_type")) != null) {
            str = stringExtra;
        }
        b bVar = new b(this, true, stringExtra2, strValueOf, str, String.valueOf(intent.getIntExtra("type_score", -1)));
        if (g.b(this, g.a.GARMIN_GOLF)) {
            bVar.a().execute();
        } else {
            new k(this, true, bVar.b(stringExtra2)).execute();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/golf/DownloadGolfAppDeepLinkActivity$a;", "", "<init>", "()V", "", "SCORECARD_ID", "Ljava/lang/String;", "ACTION", "SCORE_TYPE", "TYPE_SCORE", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

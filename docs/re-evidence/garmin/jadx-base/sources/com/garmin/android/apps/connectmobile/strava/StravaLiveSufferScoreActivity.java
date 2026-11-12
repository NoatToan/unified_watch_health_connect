package com.garmin.android.apps.connectmobile.strava;

import android.os.Bundle;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/strava/StravaLiveSufferScoreActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "Landroid/view/View;", "view", "", "onClickDownloadFromCIQ", "(Landroid/view/View;)V", "a", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StravaLiveSufferScoreActivity extends com.garmin.android.apps.connectmobile.c {
    static {
        new a(null);
    }

    public final void onClickDownloadFromCIQ(View view2) {
        Object obj = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        obj.getClass();
        startActivity(((fr1.i) KoinJavaComponent.get$default(fr1.i.class, null, null, 6, null)).c(this, ((f12.b) obj).D() ? "6b53eedd-bf67-4c18-a2d6-af1d59518357" : "25224c65-0599-4f67-9f69-8604aa97c330"));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.strava_live_suffer_score);
        initActionBar(true, R.string.strava_live_suffer_score_title);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/strava/StravaLiveSufferScoreActivity$a;", "", "<init>", "()V", "", "CIQ_APP_ID_TEST", "Ljava/lang/String;", "CIQ_APP_ID_PROD", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

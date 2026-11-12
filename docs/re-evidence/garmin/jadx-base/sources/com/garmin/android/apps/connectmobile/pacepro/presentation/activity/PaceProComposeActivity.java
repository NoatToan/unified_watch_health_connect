package com.garmin.android.apps.connectmobile.pacepro.presentation.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.m;
import b.j;
import com.garmin.android.apps.connectmobile.d;
import com.garmin.android.apps.connectmobile.l2;
import p005kotlin.Metadata;
import x41.b;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pacepro/presentation/activity/PaceProComposeActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class PaceProComposeActivity extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39792a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.a(this);
        initComposeScreen(new e(-1240037371, true, new b(this, 0)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pacepro/presentation/activity/PaceProComposeActivity$a;", "", "<init>", "()V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(m mVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar) {
            Intent intent = new Intent(mVar, (Class<?>) PaceProComposeActivity.class);
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse("connect://viewPacePro"));
            Bundle bundle = new Bundle();
            bundle.putParcelable("paceband_summary_key", bVar);
            bundle.putBoolean("should_return_to_pace_pro_list_key", false);
            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
            return intent;
        }

        private a() {
        }
    }
}

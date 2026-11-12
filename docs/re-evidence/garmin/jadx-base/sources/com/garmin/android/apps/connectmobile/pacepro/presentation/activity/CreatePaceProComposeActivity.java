package com.garmin.android.apps.connectmobile.pacepro.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.courses.model.e;
import com.garmin.android.apps.connectmobile.l2;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pacepro/presentation/activity/CreatePaceProComposeActivity;", "Lcom/garmin/android/apps/connectmobile/pacepro/presentation/activity/PaceProComposeActivity;", "<init>", "()V", "a", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CreatePaceProComposeActivity extends PaceProComposeActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39791b = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pacepro/presentation/activity/CreatePaceProComposeActivity$a;", "", "<init>", "()V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, e eVar, String str, boolean z14) {
            eVar.getClass();
            Intent intent = new Intent(context, (Class<?>) CreatePaceProComposeActivity.class);
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse("connect://createPacePro"));
            Bundle bundle = new Bundle();
            bundle.putString("course_id_key", eVar.courseId);
            bundle.putDouble("distance_in_meters_key", eVar.q());
            bundle.putString("event_name_key", str);
            bundle.putBoolean("event_distance_match_course_key", z14);
            bundle.putBoolean("should_return_to_pace_pro_list_key", false);
            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
            return intent;
        }

        private a() {
        }
    }
}

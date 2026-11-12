package com.garmin.android.apps.connectmobile.onboarding.education;

import android.os.Bundle;
import b31.f;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.d;
import ew0.u;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z3.e;
import zb0.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/education/VoiceAssistantEducationalActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VoiceAssistantEducationalActivity extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39694a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, new l22.a(this).getString(R.string.lbl_phone_assistant));
        Bundle extras = getIntent().getExtras();
        long j8 = extras != null ? extras.getLong("EXTRA_DEVICE_UNIT_ID", 0L) : 0L;
        Bundle extras2 = getIntent().getExtras();
        String string = extras2 != null ? extras2.getString("EXTRA_DEVICE_PRODUCT_NUMBER") : null;
        boolean zN = u0.n(string, u0.f203832w2);
        boolean zN2 = u0.n(string, u0.f203826v2);
        if (j8 > 0) {
            ((f) KoinJavaComponent.get$default(f.class, null, null, 6, null)).a(j8, e31.a.OPENED_VOICE_ASSISTANT_SETUP_PAGE);
        }
        initComposeScreen(new e(657670757, true, new u(1, zN2, zN)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/education/VoiceAssistantEducationalActivity$a;", "", "<init>", "()V", "", "VENU_2_PLUS_HOW_TO_SETUP_URL", "Ljava/lang/String;", "D2_AIR_HOW_TO_SETUP_URL", "DEFAULT_SETUP_URL", "EXTRA_DEVICE_UNIT_ID", "EXTRA_DEVICE_PRODUCT_NUMBER", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

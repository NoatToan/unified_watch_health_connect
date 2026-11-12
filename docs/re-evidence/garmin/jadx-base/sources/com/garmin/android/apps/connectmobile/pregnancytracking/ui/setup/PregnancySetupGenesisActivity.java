package com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/setup/PregnancySetupGenesisActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PregnancySetupGenesisActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40944a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_pregnancy_get_started);
        initActionBar(R.string.mct_setup, 2);
        View viewFindViewById = findViewById(R.id.pregnancy_setup_get_started_image);
        viewFindViewById.getClass();
        ((LottieAnimationView) viewFindViewById).setAnimation(R.raw.art_mct_baby_announcement);
        View viewFindViewById2 = findViewById(R.id.genesis_button);
        viewFindViewById2.getClass();
        ((AppCompatButton) viewFindViewById2).setOnClickListener(new oq.a(this, 8));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/setup/PregnancySetupGenesisActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

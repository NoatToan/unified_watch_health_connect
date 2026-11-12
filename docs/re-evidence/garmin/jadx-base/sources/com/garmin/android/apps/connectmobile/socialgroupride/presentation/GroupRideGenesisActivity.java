package com.garmin.android.apps.connectmobile.socialgroupride.presentation;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vo1.b;
import z3.e;
import zo1.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/socialgroupride/presentation/GroupRideGenesisActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupRideGenesisActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f44734a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        initActionBar(true, R.string.lbl_group_ride);
        Intent intent = getIntent();
        long j8 = -1;
        if (intent != null && (extras = intent.getExtras()) != null) {
            j8 = extras.getLong("GCM_deviceUnitID", -1L);
        }
        long j14 = j8;
        if (j14 < 1) {
            finish();
            return;
        }
        b bVar = (b) KoinJavaComponent.get$default(b.class, null, null, 6, null);
        bVar.c();
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new e(1065108811, true, new w(bVar, this, j14, 0)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/socialgroupride/presentation/GroupRideGenesisActivity$a;", "", "<init>", "()V", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

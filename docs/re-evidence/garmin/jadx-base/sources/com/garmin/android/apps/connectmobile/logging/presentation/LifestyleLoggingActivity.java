package com.garmin.android.apps.connectmobile.logging.presentation;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import b63.o;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.r0;
import java.io.Serializable;
import li0.y;
import o82.g;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import tv0.d;
import z10.l0;
import z3.e;
import zd1.b;
import zd1.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/logging/presentation/LifestyleLoggingActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LifestyleLoggingActivity extends r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f38686e = 0;

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        return "LIFESTYLE_LOGGING";
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.DATA_CONSENT;
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g gVar;
        Object serializable;
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        ca("LIFESTYLE_LOGGING");
        b bVar = b.f204223a;
        Intent intent = getIntent();
        intent.getClass();
        bVar.getClass();
        o oVarA = b.a(intent);
        c cVar = c.f204224a;
        Intent intent2 = getIntent();
        intent2.getClass();
        cVar.getClass();
        Bundle extras = intent2.getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras.getSerializable("EXTRA_INITIAL_INTERVAL_TYPE", g.class);
            } else {
                Serializable serializable2 = extras.getSerializable("EXTRA_INITIAL_INTERVAL_TYPE");
                if (!(serializable2 instanceof g)) {
                    serializable2 = null;
                }
                serializable = (g) serializable2;
            }
            gVar = (g) serializable;
        } else {
            gVar = null;
        }
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new e(-1654944224, true, new y(oVarA, gVar, this, getIntent().getBooleanExtra("OPEN_LIFESTYLE_LOGGING_REMINDERS", false), 18)));
        ((d) KoinJavaComponent.get$default(d.class, null, null, 6, null)).c();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/logging/presentation/LifestyleLoggingActivity$a;", "", "<init>", "()V", "", "OPEN_LIFESTYLE_LOGGING_REMINDERS", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z10.p3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/MCTSetupActivity;", "Lz10/p3;", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/d$b;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MCTSetupActivity extends p3 implements d.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39100c = new a(null);

    @Override // z10.p3
    public final Fragment ca() {
        Intent intent = getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("DETAILS_KEY", true) : true;
        Intent intent2 = getIntent();
        boolean booleanExtra2 = intent2 != null ? intent2.getBooleanExtra("FROM_STOP_TRACKING_KEY", false) : false;
        d.f39132l.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("DETAILS_KEY", booleanExtra);
        bundle.putBoolean("FROM_STOP_TRACKING_KEY", booleanExtra2);
        d dVar = new d();
        dVar.setArguments(bundle);
        return dVar;
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.mct_setup);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.b
    public final void g(int i14, String str) {
        updateActionBar(str, i14);
    }

    @Override // z10.p3
    public final boolean ia() {
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/MCTSetupActivity$a;", "", "<init>", "()V", "", "DETAILS_KEY", "Ljava/lang/String;", "FROM_STOP_TRACKING_KEY", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, int i14) {
            boolean z14 = (i14 & 2) != 0;
            boolean z15 = (i14 & 4) == 0;
            aVar.getClass();
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) MCTSetupActivity.class);
            intent.putExtra("DETAILS_KEY", z14);
            intent.putExtra("FROM_STOP_TRACKING_KEY", z15);
            return intent;
        }

        private a() {
        }
    }
}

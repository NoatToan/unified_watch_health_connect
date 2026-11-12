package com.garmin.android.apps.connectmobile;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/d;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lkotlin/Function0;", FirebaseAnalytics.Param.CONTENT, "initComposeScreen", "(Le23/p;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d extends c {
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initComposeScreen$lambda$0(e23.p pVar, p3.m mVar, int i14) {
        if (mVar.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            pVar.invoke(mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    public void initComposeScreen(e23.p<? super p3.m, ? super Integer, Unit> content) {
        content.getClass();
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(-839792703, true, new a3.d(content, 7)));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composable_container);
    }
}

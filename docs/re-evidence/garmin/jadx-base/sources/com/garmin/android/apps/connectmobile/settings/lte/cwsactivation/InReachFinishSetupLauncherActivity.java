package com.garmin.android.apps.connectmobile.settings.lte.cwsactivation;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import g.h;
import i.c;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import ri1.b;
import zd0.u1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/lte/cwsactivation/InReachFinishSetupLauncherActivity;", "Li/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InReachFinishSetupLauncherActivity extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f43503d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f43504a = m.b(new b(0));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f43505b = m.b(new b(1));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.c<Intent> f43506c = registerForActivityResult(new h(), new jp.a(this, 25));

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.f43506c.a(u1.d((u1) this.f43504a.getValue(), this), null);
        } catch (Exception e4) {
            String strN = fb1.c.n("Failed to launch SOS info update flow: ", e4.getMessage());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "InReachFinishSetupLauncherActivity", strN);
            finish();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/lte/cwsactivation/InReachFinishSetupLauncherActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

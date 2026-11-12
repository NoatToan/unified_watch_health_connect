package com.garmin.androiddynamicsettings.app.features.wifi.presenter;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.presentationlayer.b;
import hi2.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zh2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/wifi/presenter/TestNetworkActivity;", "Lcom/garmin/androiddynamicsettings/app/presentationlayer/b;", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TestNetworkActivity extends b {
    static {
        new a(null);
    }

    public TestNetworkActivity() {
        new d("TestNetworkActivity", null, 2, null);
    }

    @Override // com.garmin.androiddynamicsettings.app.presentationlayer.b, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((wh2.a) getIntent().getParcelableExtra("networkKey")) == null) {
            throw new IllegalStateException("network must be provided");
        }
        setContentView(R.layout.dsl_test_network);
        e.f204807a.getClass();
        ((uc0.d) e.a()).h();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/wifi/presenter/TestNetworkActivity$a;", "", "<init>", "()V", "", "networkKey", "Ljava/lang/String;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

package com.garmin.androiddynamicsettings.app.features.wifi.presenter;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.presentationlayer.b;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import uc0.d;
import zh2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/wifi/presenter/AddNetworkListActivity;", "Lcom/garmin/androiddynamicsettings/app/presentationlayer/b;", "", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AddNetworkListActivity extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f50663l;

    static {
        new a(null);
    }

    public AddNetworkListActivity() {
        mh2.b.f118531a.getClass();
        int i14 = mh2.b.f118532b;
        mh2.b.f118532b = i14 + 1;
        this.f50663l = i14;
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == this.f50663l && i15 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.garmin.androiddynamicsettings.app.presentationlayer.b, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dsl_add_network_list);
        e.f204807a.getClass();
        ((d) e.a()).h();
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/wifi/presenter/AddNetworkListActivity$a;", "", "<init>", "()V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

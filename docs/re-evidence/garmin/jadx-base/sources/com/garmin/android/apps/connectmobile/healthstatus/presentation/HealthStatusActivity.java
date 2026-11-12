package com.garmin.android.apps.connectmobile.healthstatus.presentation;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.d;
import p005kotlin.Metadata;
import z3.e;
import zd1.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/healthstatus/presentation/HealthStatusActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HealthStatusActivity extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f36640a = 0;

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b bVar = b.f204223a;
        Intent intent = getIntent();
        intent.getClass();
        bVar.getClass();
        initComposeScreen(new e(115127086, true, new qn0.b(b.a(intent))));
    }
}

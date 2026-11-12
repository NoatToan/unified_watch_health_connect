package com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout;

import am.i1;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.d;
import d62.h;
import java.util.List;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import sd2.f;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\nX\u008a\u0084\u0002²\u0006\u0010\u0010\n\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/doworkout/StartWorkoutCapableDeviceSelectionActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Ld62/h;", "viewModel", "", "Lzd0/k$a;", "deviceItems", "selectedDevice", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StartWorkoutCapableDeviceSelectionActivity extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48554a = new a(null);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f48555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f48556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f48557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f48558d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f48555a = gVar;
            this.f48556b = qualifier;
            this.f48557c = aVar;
            this.f48558d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, d62.h] */
        @Override // e23.a
        public final h invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f48555a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f48557c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(h.class), f189591b, null, defaultViewModelCreationExtras, this.f48556b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f48558d, 4, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        List parcelableArrayListExtra;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            if (intent != null) {
                parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_devices", f.class);
            } else {
                parcelableArrayListExtra = null;
            }
        } else if (intent != null) {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_devices");
        } else {
            parcelableArrayListExtra = null;
        }
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = j0.f134944a;
        }
        initComposeScreen(new e(1905356752, true, new i1(m.a(n.NONE, new b(this, null, null, new ad.b(parcelableArrayListExtra, 4))), getIntent().getBooleanExtra("extra_is_multi_device", false), this, 9)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/doworkout/StartWorkoutCapableDeviceSelectionActivity$a;", "", "<init>", "()V", "", "EXTRA_DEVICES", "Ljava/lang/String;", "EXTRA_IS_MULTI_DEVICE", "EXTRA_SEND_TO_DEVICE", "EXTRA_SELECTED_DEVICE_UNIT_ID", "", "REQUEST_CODE", "I", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

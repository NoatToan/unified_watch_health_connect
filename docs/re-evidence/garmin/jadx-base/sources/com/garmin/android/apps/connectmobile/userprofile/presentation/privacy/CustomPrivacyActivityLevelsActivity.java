package com.garmin.android.apps.connectmobile.userprofile.presentation.privacy;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.core.view.j;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import b.s;
import com.garmin.android.apps.connectmobile.R;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import u12.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/CustomPrivacyActivityLevelsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CustomPrivacyActivityLevelsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f47102a = m.a(n.NONE, new c(this, null, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nj1.b f47103b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/presentation/privacy/CustomPrivacyActivityLevelsActivity$b", "Lb/s;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            CustomPrivacyActivityLevelsActivity customPrivacyActivityLevelsActivity = CustomPrivacyActivityLevelsActivity.this;
            customPrivacyActivityLevelsActivity.ca();
            customPrivacyActivityLevelsActivity.finish();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f47105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f47106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f47107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f47108d;

        public c(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f47105a = gVar;
            this.f47106b = qualifier;
            this.f47107c = aVar;
            this.f47108d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f47105a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f47107c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.class), f189591b, null, defaultViewModelCreationExtras, this.f47106b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f47108d, 4, null);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final void ca() {
        nj1.b bVar = (nj1.b) ((com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b) this.f47102a.getValue()).f47154h.d();
        nj1.b bVar2 = this.f47103b;
        if (bVar2 == null || p005kotlin.jvm.internal.s.g(bVar, bVar2)) {
            setResult(0, null);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("GCM_extra_privacy_type", bVar);
        setResult(-1, intent);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_simple_frame_layout);
        initActionBar(true, R.string.privacy_custom_levels);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_extra_privacy_type", nj1.b.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_extra_privacy_type");
                if (!(parcelable2 instanceof nj1.b)) {
                    parcelable2 = null;
                }
                parcelable = (nj1.b) parcelable2;
            }
            nj1.b bVar = (nj1.b) parcelable;
            if (bVar != null) {
                this.f47103b = bVar;
                ((com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b) this.f47102a.getValue()).x4(bVar);
            }
        }
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        h hVar = new h();
        hVar.setArguments(new Bundle());
        aVarB.l(R.id.content_frame_layout, hVar, null);
        aVarB.e();
        getOnBackPressedDispatcher().b(new b(), this);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ca();
        finish();
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/CustomPrivacyActivityLevelsActivity$a;", "", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

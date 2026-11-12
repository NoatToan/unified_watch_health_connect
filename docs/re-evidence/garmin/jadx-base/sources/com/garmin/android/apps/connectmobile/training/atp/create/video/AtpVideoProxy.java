package com.garmin.android.apps.connectmobile.training.atp.create.video;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import wt1.u;
import xw1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/video/AtpVideoProxy;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AtpVideoProxy extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f45312d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f45313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f45314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f45315c = new b();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/create/video/AtpVideoProxy$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lxw1/o;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<o> {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            AtpVideoProxy atpVideoProxy = AtpVideoProxy.this;
            g1.b(atpVideoProxy, cVar);
            atpVideoProxy.hideProgressOverlay();
            com.garmin.android.apps.connectmobile.training.atp.create.video.a.C0871a c0871a = com.garmin.android.apps.connectmobile.training.atp.create.video.a.f45334d;
            o oVar = atpVideoProxy.f45314b;
            c0871a.getClass();
            Intent intentA = com.garmin.android.apps.connectmobile.training.atp.create.video.a.C0871a.a(atpVideoProxy, oVar);
            if (intentA != null) {
                atpVideoProxy.startActivity(intentA);
            }
            atpVideoProxy.finish();
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, o oVar) {
            o oVar2 = oVar;
            eVar.getClass();
            oVar2.getClass();
            AtpVideoProxy.this.f45314b = oVar2;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_simple_recycler_view_layout);
        initActionBar(true);
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("VIDEO_ID_EXTRA") : null;
        if (string != null) {
            showProgressOverlay();
            this.f45313a = ((u) KoinJavaComponent.get$default(u.class, null, null, 6, null)).x(string, this.f45315c);
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "AtpVideoProxy", "Missing required video id parameter");
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        com.garmin.android.library.backgroundtaskmanagement.c.f50123c.b(Long.valueOf(this.f45313a));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/video/AtpVideoProxy$a;", "", "<init>", "()V", "", "VIDEO_ID_EXTRA", "Ljava/lang/String;", "TAG", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

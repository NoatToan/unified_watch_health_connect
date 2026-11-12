package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import mz1.i1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/SendToDeviceActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lry1/a;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SendToDeviceActivity extends com.garmin.android.apps.connectmobile.c implements ry1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f45711b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f45712a = new w1(s0.f105811a.b(i1.class), new d(this), new c(this), new e(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f45713a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f45713a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f45713a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45713a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f45714a;

        public c(b.g gVar) {
            this.f45714a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45714a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f45715a;

        public d(b.g gVar) {
            this.f45715a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45715a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f45717b;

        public e(e23.a aVar, b.g gVar) {
            this.f45716a = aVar;
            this.f45717b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45716a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45717b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // ry1.a
    public final void g(int i14, String str) {
        updateActionBar(str, 2);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        fg0.k kVar;
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_send_to_device);
        initActionBar(true, getString(R.string.lbl_send_to_device));
        f.f45956e.getClass();
        f fVar = new f();
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.fragment_container, fVar, "SendToDeviceFragment");
        aVar.d("SendToDeviceFragment");
        aVar.e();
        w1 w1Var = this.f45712a;
        i1 i1Var = (i1) w1Var.getValue();
        Bundle extras = getIntent().getExtras();
        com.garmin.android.apps.connectmobile.courses.model.e eVar = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = (Parcelable) extras.getParcelable("GCM_extra_event", fg0.k.class);
            } else {
                Parcelable parcelable3 = extras.getParcelable("GCM_extra_event");
                if (!(parcelable3 instanceof fg0.k)) {
                    parcelable3 = null;
                }
                parcelable2 = (fg0.k) parcelable3;
            }
            kVar = (fg0.k) parcelable2;
        } else {
            kVar = null;
        }
        ((y0) i1Var.f121789d.getValue()).j(kVar);
        i1 i1Var2 = (i1) w1Var.getValue();
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras2.getParcelable("GCM_extra_course", com.garmin.android.apps.connectmobile.courses.model.e.class);
            } else {
                Parcelable parcelable4 = extras2.getParcelable("GCM_extra_course");
                parcelable = (com.garmin.android.apps.connectmobile.courses.model.e) (parcelable4 instanceof com.garmin.android.apps.connectmobile.courses.model.e ? parcelable4 : null);
            }
            eVar = (com.garmin.android.apps.connectmobile.courses.model.e) parcelable;
        }
        i1Var2.f121790e = eVar;
        ((androidx.lifecycle.s0) ((i1) w1Var.getValue()).f121792g.getValue()).f(this, new b(new tn2.t(this, 10)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/SendToDeviceActivity$a;", "", "<init>", "()V", "", "EVENT_SENT_DIALOG_KEY", "Ljava/lang/String;", "", "EVENT_SENT_DIALOG_DISMISS_TIME", "I", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

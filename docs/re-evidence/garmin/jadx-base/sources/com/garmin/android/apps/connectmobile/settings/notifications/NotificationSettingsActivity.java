package com.garmin.android.apps.connectmobile.settings.notifications;

import aj1.o;
import aj1.p;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.gncs.GNCSOptOutSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.notifications.model.NotificationPreferencesDTO;
import e23.l;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/notifications/NotificationSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/settings/notifications/c$b;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NotificationSettingsActivity extends com.garmin.android.apps.connectmobile.c implements com.garmin.android.apps.connectmobile.settings.notifications.c.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f43568b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f43569a = new w1(s0.f105811a.b(p.class), new e(this), new d(this), new f(null, this));

    public interface b {
        com.garmin.android.apps.connectmobile.settings.notifications.model.a E();
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43570a;

        public c(l lVar) {
            lVar.getClass();
            this.f43570a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43570a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43570a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43571a;

        public d(g gVar) {
            this.f43571a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43571a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43572a;

        public e(g gVar) {
            this.f43572a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43572a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f43574b;

        public f(e23.a aVar, g gVar) {
            this.f43573a = aVar;
            this.f43574b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43573a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43574b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static Unit ca(Intent intent, com.garmin.android.apps.connectmobile.settings.notifications.model.a aVar, NotificationSettingsActivity notificationSettingsActivity, boolean z14) {
        if (z14) {
            NotificationPreferencesDTO notificationPreferencesDTO = aVar.f43659a;
            intent.putExtra("GCM_extra_push_notification_enabled", notificationPreferencesDTO != null ? Boolean.valueOf(notificationPreferencesDTO.N0) : null);
            notificationSettingsActivity.setResult(-1, intent);
            super.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.notifications.c.b
    public final void F0() {
        com.garmin.android.apps.connectmobile.settings.notifications.b.f43597f1.getClass();
        com.garmin.android.apps.connectmobile.settings.notifications.b bVar = new com.garmin.android.apps.connectmobile.settings.notifications.b();
        Bundle bundle = new Bundle();
        bundle.putSerializable("EXTRA_SCROLL_TO_ITEM", null);
        bVar.setArguments(bundle);
        da(bVar);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.notifications.c.b
    public final void U3() {
        com.garmin.android.apps.connectmobile.settings.notifications.a.Q0.getClass();
        da(new com.garmin.android.apps.connectmobile.settings.notifications.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void da(androidx.preference.b bVar) {
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        String strX3 = ((aj1.d) bVar).x3();
        aVarB.l(R.id.content_frame_layout, bVar, strX3);
        aVarB.d(strX3);
        aVarB.e();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.notifications.c.b
    public final void h0() {
        GNCSOptOutSettingsActivity.f35738a.getClass();
        startActivity(new Intent(this, (Class<?>) GNCSOptOutSettingsActivity.class));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        NotificationPreferencesDTO notificationPreferencesDTO;
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        n0 n0VarF = supportFragmentManager.F(R.id.content_frame_layout);
        if (!(n0VarF instanceof b)) {
            super.onBackPressed();
            return;
        }
        w1 w1Var = this.f43569a;
        com.garmin.android.apps.connectmobile.settings.notifications.model.a aVar = ((p) w1Var.getValue()).f3483d;
        com.garmin.android.apps.connectmobile.settings.notifications.model.a aVarE = ((b) n0VarF).E();
        Intent intent = new Intent();
        Boolean boolValueOf = null;
        if (aVar != null && aVarE != null && !aVarE.equals(aVar)) {
            m.a(null, new o(aVarE, (p) w1Var.getValue(), null), 3).f(this, new c(new a4.a(intent, 2, aVarE, this)));
            return;
        }
        if (aVarE != null && (notificationPreferencesDTO = aVarE.f43659a) != null) {
            boolValueOf = Boolean.valueOf(notificationPreferencesDTO.N0);
        }
        intent.putExtra("GCM_extra_push_notification_enabled", boolValueOf);
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Fragment cVar;
        Object serializable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_simple_frame_layout);
        initActionBar(true, R.string.device_screen_notifications);
        ((p) this.f43569a.getValue()).y4().f(this, new c(new a03.f(this, 10)));
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.b(new a61.h(supportFragmentManager, this, 1));
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("VIEW_EMAIL_SETTINGS", false)) {
            com.garmin.android.apps.connectmobile.settings.notifications.a.Q0.getClass();
            cVar = new com.garmin.android.apps.connectmobile.settings.notifications.a();
        } else if (extras == null || !extras.getBoolean("VIEW_PUSH_NOTIFICATION_SETTINGS", false)) {
            com.garmin.android.apps.connectmobile.settings.notifications.c.f43626b.getClass();
            cVar = new com.garmin.android.apps.connectmobile.settings.notifications.c();
        } else {
            com.garmin.android.apps.connectmobile.settings.notifications.b.a aVar = com.garmin.android.apps.connectmobile.settings.notifications.b.f43597f1;
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras.getSerializable("EXTRA_SCROLL_TO_ITEM", cj1.a.class);
            } else {
                Object serializable2 = extras.getSerializable("EXTRA_SCROLL_TO_ITEM");
                if (!(serializable2 instanceof cj1.a)) {
                    serializable2 = null;
                }
                serializable = (cj1.a) serializable2;
            }
            aVar.getClass();
            com.garmin.android.apps.connectmobile.settings.notifications.b bVar = new com.garmin.android.apps.connectmobile.settings.notifications.b();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("EXTRA_SCROLL_TO_ITEM", (cj1.a) serializable);
            bVar.setArguments(bundle2);
            cVar = bVar;
        }
        getSupportFragmentManager().a0(1, null);
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
        aVar2.j(R.id.content_frame_layout, cVar, null, 1);
        aVar2.e();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/notifications/NotificationSettingsActivity$a;", "", "<init>", "()V", "", "VIEW_EMAIL_SETTINGS", "Ljava/lang/String;", "VIEW_PUSH_NOTIFICATION_SETTINGS", "EXTRA_SCROLL_TO_ITEM", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

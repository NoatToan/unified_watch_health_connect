package com.garmin.android.apps.connectmobile.settings.notification;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.d;
import com.garmin.android.apps.connectmobile.settings.notification.NotificationOffActivity;
import e23.p;
import g.h;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.x3;
import sd2.f;
import v13.e;
import v13.i;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/notification/NotificationOffActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "", "hasNotificationOn", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NotificationOffActivity extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f43557e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f43558a = (d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43559b = m.a(n.NONE, new c(this, null, null, new zi1.b(this, 0)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.c<Intent> f43560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.c<Intent> f43561d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.settings.notification.NotificationOffActivity$onCreate$1$1$1", f = "NotificationOffActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f43563b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x3<Boolean> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f43563b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return NotificationOffActivity.this.new b(this.f43563b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = NotificationOffActivity.f43557e;
            if (s.g(this.f43563b.getF182175a(), Boolean.TRUE)) {
                NotificationOffActivity notificationOffActivity = NotificationOffActivity.this;
                Intent intentI = notificationOffActivity.f43558a.I(notificationOffActivity, (f) ((zi1.e) notificationOffActivity.f43559b.getValue()).f204859a.f150540a.getValue());
                if (intentI != null) {
                    notificationOffActivity.f43561d.a(intentI, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<zi1.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f43565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f43566c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f43567d;

        public c(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f43564a = gVar;
            this.f43565b = qualifier;
            this.f43566c = aVar;
            this.f43567d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, zi1.e] */
        @Override // e23.a
        public final zi1.e invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f43564a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f43566c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(zi1.e.class), f189591b, null, defaultViewModelCreationExtras, this.f43565b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f43567d, 4, null);
        }
    }

    public NotificationOffActivity() {
        final int i14 = 0;
        this.f43560c = registerForActivityResult(new h(), new f.b(this) { // from class: zi1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationOffActivity f204854b;

            {
                this.f204854b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i15 = i14;
                NotificationOffActivity notificationOffActivity = this.f204854b;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        NotificationOffActivity.a aVar2 = NotificationOffActivity.f43557e;
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        if (intent != null ? intent.getBooleanExtra("GCM_extra_push_notification_enabled", false) : false) {
                            notificationOffActivity.finish();
                        }
                        break;
                    default:
                        NotificationOffActivity.a aVar3 = NotificationOffActivity.f43557e;
                        aVar.getClass();
                        notificationOffActivity.finish();
                        break;
                }
            }
        });
        final int i15 = 1;
        this.f43561d = registerForActivityResult(new h(), new f.b(this) { // from class: zi1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationOffActivity f204854b;

            {
                this.f204854b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i16 = i15;
                NotificationOffActivity notificationOffActivity = this.f204854b;
                f.a aVar = (f.a) obj;
                switch (i16) {
                    case 0:
                        NotificationOffActivity.a aVar2 = NotificationOffActivity.f43557e;
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        if (intent != null ? intent.getBooleanExtra("GCM_extra_push_notification_enabled", false) : false) {
                            notificationOffActivity.finish();
                        }
                        break;
                    default:
                        NotificationOffActivity.a aVar3 = NotificationOffActivity.f43557e;
                        aVar.getClass();
                        notificationOffActivity.finish();
                        break;
                }
            }
        });
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("GCM_deviceDisplayName") : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        initComposeScreen(new z3.e(-896459444, true, new zi1.a(0, this, stringExtra)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/notification/NotificationOffActivity$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

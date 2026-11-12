package com.garmin.android.apps.connectmobile.settings.autodetect;

import a61.i;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.consent.ConsentActivity;
import com.garmin.android.apps.connectmobile.d;
import e23.p;
import g.h;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.x3;
import q92.x;
import v13.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/autodetect/DeviceAutoDetectActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "", "hasConsent", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceAutoDetectActivity extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f41730c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41731a = m.a(n.NONE, new c(this, null, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.c<Intent> f41732b = registerForActivityResult(new h(), new i(this, 29));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.settings.autodetect.DeviceAutoDetectActivity$onCreate$1$1$1", f = "DeviceAutoDetectActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f41734b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x3<Boolean> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f41734b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return DeviceAutoDetectActivity.this.new b(this.f41734b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = DeviceAutoDetectActivity.f41730c;
            x3<Boolean> x3Var = this.f41734b;
            boolean zG = s.g(x3Var.getF182175a(), Boolean.TRUE);
            DeviceAutoDetectActivity deviceAutoDetectActivity = DeviceAutoDetectActivity.this;
            if (zG) {
                deviceAutoDetectActivity.setResult(-1);
                deviceAutoDetectActivity.finish();
            } else if (s.g(x3Var.getF182175a(), Boolean.FALSE)) {
                deviceAutoDetectActivity.f41732b.a(ConsentActivity.a.b(ConsentActivity.f32155r, deviceAutoDetectActivity, x.DI_CONNECT_AUTO_ACTIVITY_DETECTION, false, null, 24), null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<jg1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f41735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f41736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f41737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f41738d;

        public c(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f41735a = gVar;
            this.f41736b = qualifier;
            this.f41737c = aVar;
            this.f41738d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, jg1.c] */
        @Override // e23.a
        public final jg1.c invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f41735a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f41737c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(jg1.c.class), f189591b, null, defaultViewModelCreationExtras, this.f41736b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f41738d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initComposeScreen(new z3.e(-1454855145, true, new ik1.c(this, 11)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/autodetect/DeviceAutoDetectActivity$a;", "", "<init>", "()V", "", "EXTRA_DEVICE_UNIT_ID", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

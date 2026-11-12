package com.garmin.android.apps.connectmobile.settings.thirdparty.details;

import am.j;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import c32.k;
import c62.m1;
import ca0.d4;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import hk1.w;
import jk1.f;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.x3;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/thirdparty/details/ThirdPartyConnectActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Ljk1/e;", "uiState", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ThirdPartyConnectActivity extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43974c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f43975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f43976b = m.b(new d4(15));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.details.ThirdPartyConnectActivity$onCreate$2$1$1", f = "ThirdPartyConnectActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<jk1.e> f43978b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x3<jk1.e> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f43978b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return ThirdPartyConnectActivity.this.new b(this.f43978b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = ThirdPartyConnectActivity.f43974c;
            x3<jk1.e> x3Var = this.f43978b;
            if (x3Var.getF182175a().f99394h) {
                String str = x3Var.getF182175a().f99395i;
                ThirdPartyConnectActivity thirdPartyConnectActivity = ThirdPartyConnectActivity.this;
                thirdPartyConnectActivity.getClass();
                Uri uri = Uri.parse(str);
                a2 a2Var = a2.SETTINGS;
                String strJ = j.j(uri, "redirectBackToThirdPartyApp to ");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "ThirdPartyConnectActivity", strJ);
                g22.a.c(thirdPartyConnectActivity, uri);
                thirdPartyConnectActivity.finish();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        super.onCreate(bundle);
        Intent intent = getIntent();
        Parcelable parcelable2 = null;
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("oauth_data", w.class);
            } else {
                Parcelable parcelable3 = extras.getParcelable("oauth_data");
                parcelable = (w) (parcelable3 instanceof w ? parcelable3 : null);
            }
            parcelable2 = (w) parcelable;
            if (parcelable2 == null) {
                return;
            }
            if (!(parcelable2 instanceof w.a)) {
                Unit unit = Unit.INSTANCE;
            } else if (((w.a) parcelable2).f84207a == null) {
                return;
            }
        }
        this.f43975a = (f) GetViewModelKt.resolveViewModel$default(s0.f105811a.b(f.class), getF189591b(), null, getDefaultViewModelCreationExtras(), null, AndroidKoinScopeExtKt.getKoinScope(this), new k(parcelable2, 16), 4, null);
        initComposeScreen(new z3.e(1518236596, true, new m1(this, 11)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/thirdparty/details/ThirdPartyConnectActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "OAUTH_DATA", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Activity activity, w wVar) {
            Intent intent = new Intent(activity, (Class<?>) ThirdPartyConnectActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("oauth_data", wVar);
            intent.putExtras(bundle);
            return intent;
        }

        private a() {
        }
    }
}

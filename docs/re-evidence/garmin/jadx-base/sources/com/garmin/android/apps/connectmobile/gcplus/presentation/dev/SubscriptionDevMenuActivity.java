package com.garmin.android.apps.connectmobile.gcplus.presentation.dev;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import g.h;
import k23.d;
import o13.m;
import o13.n;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s0;
import tr2.y;
import yj0.f;
import z3.e;
import zd0.u1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/dev/SubscriptionDevMenuActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SubscriptionDevMenuActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f35309d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f35310a = (u1) AndroidKoinScopeExtKt.getKoinScope(this).get((d<?>) s0.f105811a.b(u1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f35311b = m.a(n.NONE, new c(this, null, null, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.c<Intent> f35312c = registerForActivityResult(new h(), new y(this, 16));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements p<String, String, Unit> {
        public b(Object obj) {
            super(2, obj, SubscriptionDevMenuActivity.class, "launchPurchaseFlow", "launchPurchaseFlow(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // e23.p
        public final Unit invoke(String str, String str2) {
            String str3 = str;
            str3.getClass();
            SubscriptionDevMenuActivity subscriptionDevMenuActivity = (SubscriptionDevMenuActivity) this.receiver;
            int i14 = SubscriptionDevMenuActivity.f35309d;
            subscriptionDevMenuActivity.getClass();
            ge1.b.T(f0.w(subscriptionDevMenuActivity), null, null, new yj0.b(subscriptionDevMenuActivity, str3, str2, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f35313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f35314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f35315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f35316d;

        public c(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f35313a = gVar;
            this.f35314b = qualifier;
            this.f35315c = aVar;
            this.f35316d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, yj0.f] */
        @Override // e23.a
        public final f invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f35313a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f35315c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(f.class), f189591b, null, defaultViewModelCreationExtras, this.f35314b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f35316d, 4, null);
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_composable_container);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new e(1176142446, true, new yj0.a(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/dev/SubscriptionDevMenuActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

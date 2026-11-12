package com.garmin.android.apps.connectmobile.presentation.dev;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import wb1.l;
import wb1.o;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/presentation/dev/PromotionsDevMenuActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PromotionsDevMenuActivity extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f41027b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41028a = m.a(n.NONE, new b(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f41029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f41030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f41031c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f41032d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f41029a = gVar;
            this.f41030b = qualifier;
            this.f41031c = aVar;
            this.f41032d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, wb1.o] */
        @Override // e23.a
        public final o invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f41029a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f41031c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(o.class), viewModelStore, null, defaultViewModelCreationExtras, this.f41030b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f41032d, 4, null);
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_composable_container);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new e(1627968472, true, new l(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/presentation/dev/PromotionsDevMenuActivity$a;", "", "<init>", "()V", "", "PROMO_CONDITIONS_ROUTE", "Ljava/lang/String;", "PROMO_MANAGE_CACHE_ROUTE", "PROMO_LIST_ROUTE", "MENU_ITEM_MANAGE_CACHE", "MENU_ITEM_OVERRIDE_PROMO_CONDITIONS", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

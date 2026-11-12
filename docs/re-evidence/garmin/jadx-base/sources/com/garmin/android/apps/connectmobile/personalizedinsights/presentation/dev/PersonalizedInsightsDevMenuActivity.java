package com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dev;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import j91.f;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s0;
import p13.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/personalizedinsights/presentation/dev/PersonalizedInsightsDevMenuActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PersonalizedInsightsDevMenuActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40322b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f40323a = new w1(s0.f105811a.b(f.class), new d(this), new c(this), new e(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements e23.a<Unit> {
        public b(Object obj) {
            super(0, obj, f.class, "refreshSupportedLanguages", "refreshSupportedLanguages()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((f) this.receiver).f97886b.f(l0.f134950a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f40324a;

        public c(g gVar) {
            this.f40324a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40324a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f40325a;

        public d(g gVar) {
            this.f40325a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40325a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f40327b;

        public e(e23.a aVar, g gVar) {
            this.f40326a = aVar;
            this.f40327b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40326a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40327b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final f ca() {
        return (f) this.f40323a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_composable_container);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(847804057, true, new j91.a(this, 0)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/personalizedinsights/presentation/dev/PersonalizedInsightsDevMenuActivity$a;", "", "<init>", "()V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

package com.garmin.android.apps.connectmobile.gcplus.presentation.feedback;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import b.j;
import com.garmin.android.apps.connectmobile.c;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import zj0.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/feedback/GCPlusFeedbackActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCPlusFeedbackActivity extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f35317b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35318a = m.a(n.NONE, new b(this, null, null, new zj0.a(this, 0)));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f35319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f35320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f35321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f35322d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f35319a = gVar;
            this.f35320b = qualifier;
            this.f35321c = aVar;
            this.f35322d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, zj0.e] */
        @Override // e23.a
        public final e invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f35319a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f35321c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(e.class), viewModelStore, null, defaultViewModelCreationExtras, this.f35320b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f35322d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        j.a(this);
        super.onCreate(bundle);
        c.j.a(this, new z3.e(1897082537, true, new zj0.b(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/feedback/GCPlusFeedbackActivity$a;", "", "<init>", "()V", "", "FROM_SETTINGS_EXTRA", "Ljava/lang/String;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

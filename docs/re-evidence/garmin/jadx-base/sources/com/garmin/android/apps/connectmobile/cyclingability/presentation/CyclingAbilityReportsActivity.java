package com.garmin.android.apps.connectmobile.cyclingability.presentation;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import c62.m1;
import c70.i;
import com.garmin.android.apps.connectmobile.d;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/cyclingability/presentation/CyclingAbilityReportsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "gcm-cycling-ability_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CyclingAbilityReportsActivity extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33114b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33115a = m.a(n.NONE, new a(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f33116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f33117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f33118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f33119d;

        public a(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f33116a = gVar;
            this.f33117b = qualifier;
            this.f33118c = aVar;
            this.f33119d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, c70.i] */
        @Override // e23.a
        public final i invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f33116a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f33118c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(i.class), f189591b, null, defaultViewModelCreationExtras, this.f33117b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f33119d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initComposeScreen(new e(559316471, true, new m1(this, 1)));
    }
}

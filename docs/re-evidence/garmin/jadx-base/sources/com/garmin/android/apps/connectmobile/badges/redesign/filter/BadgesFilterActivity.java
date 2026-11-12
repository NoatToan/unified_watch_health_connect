package com.garmin.android.apps.connectmobile.badges.redesign.filter;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.badges.service.model.d;
import fw.p;
import o13.h;
import o13.l;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import uu.q;
import uu.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/filter/BadgesFilterActivity;", "Ld10/a;", "Lvu/b;", "Lcom/garmin/android/apps/connectmobile/badges/redesign/filter/b$a;", "<init>", "()V", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BadgesFilterActivity extends d10.a<vu.b> implements com.garmin.android.apps.connectmobile.badges.redesign.filter.b.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30466d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vu.b f30467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vu.b f30468b = new vu.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<q> f30469c = KoinJavaComponent.inject$default(q.class, null, null, 6, null);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30470a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30470a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f30471a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f30471a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f30471a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30471a.invoke(obj);
        }
    }

    @Override // d10.c
    public final void N3() {
        vu.b bVar = this.f30468b;
        bVar.f180212a = null;
        bVar.f180213b = null;
    }

    @Override // d10.b
    public final Object O() {
        return this.f30468b;
    }

    @Override // d10.a
    public final Fragment ca() {
        com.garmin.android.apps.connectmobile.badges.redesign.filter.b.f30476e.getClass();
        return new com.garmin.android.apps.connectmobile.badges.redesign.filter.b();
    }

    @Override // d10.c
    public final void d2() {
        vu.b bVar = this.f30467a;
        vu.b bVar2 = this.f30468b;
        if (bVar == null || !bVar2.equals(bVar)) {
            Intent intent = new Intent();
            intent.putExtra("GCM_badges_filter_data", bVar2);
            setResult(-1, intent);
        }
        finish();
    }

    @Override // d10.c
    public final boolean g8() {
        return this.f30468b.b();
    }

    @Override // d10.a, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_badges_filter_data", vu.b.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_badges_filter_data");
                if (!(parcelable2 instanceof vu.b)) {
                    parcelable2 = null;
                }
                parcelable = (vu.b) parcelable2;
            }
            this.f30467a = (vu.b) parcelable;
        }
        vu.b bVar = this.f30467a;
        if (bVar != null) {
            d[] dVarArr = bVar.f180212a;
            vu.b bVar2 = this.f30468b;
            bVar2.f180212a = dVarArr;
            bVar.getClass();
            bVar2.f180213b = bVar.f180213b;
        }
        q value = this.f30469c.getValue();
        value.getClass();
        xy2.b.K(value, new t(value, null)).f(this, new c(new uo1.a(this, 28)));
    }

    @Override // com.garmin.android.apps.connectmobile.badges.redesign.filter.b.a
    public final void q1() {
        com.garmin.android.apps.connectmobile.badges.redesign.filter.c.f30478c.getClass();
        da(new com.garmin.android.apps.connectmobile.badges.redesign.filter.c());
    }

    @Override // com.garmin.android.apps.connectmobile.badges.redesign.filter.b.a
    public final void z3() {
        com.garmin.android.apps.connectmobile.badges.redesign.filter.a.f30472c.getClass();
        da(new com.garmin.android.apps.connectmobile.badges.redesign.filter.a());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/filter/BadgesFilterActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import fw.p;
import gb1.l;
import o13.h;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import z10.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/base/PregnancyGenesisActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PregnancyGenesisActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40516b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f40517a = new w1(s0.f105811a.b(l.class), new e(this), new d(this), new f(null, this));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40518a;

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
            f40518a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f40519a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f40519a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f40519a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40519a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f40520a;

        public d(g gVar) {
            this.f40520a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40520a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f40521a;

        public e(g gVar) {
            this.f40521a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40521a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f40523b;

        public f(e23.a aVar, g gVar) {
            this.f40522a = aVar;
            this.f40523b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40522a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40523b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.HEALTH_STATS;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        w1 w1Var = this.f40517a;
        ((androidx.lifecycle.s0) ((l) w1Var.getValue()).f76686d.getValue()).f(this, new c(new g12.f(this, 10)));
        ((l) w1Var.getValue()).A4();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/base/PregnancyGenesisActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "SHOULD_SHOW_READY_DIALOG_KEY", "OPEN_TO_REPORTS_KEY", "FROM_INCOMPLETE_SETUP_KEY", "OPEN_TO_TIPS_KEY", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, boolean z14, boolean z15, DateTime dateTime, boolean z16, boolean z17, int i14) {
            if ((i14 & 2) != 0) {
                z14 = false;
            }
            if ((i14 & 4) != 0) {
                z15 = false;
            }
            if ((i14 & 8) != 0) {
                dateTime = null;
            }
            if ((i14 & 32) != 0) {
                z16 = false;
            }
            if ((i14 & 64) != 0) {
                z17 = false;
            }
            aVar.getClass();
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) PregnancyGenesisActivity.class);
            intent.putExtra("extra.date.time", dateTime);
            intent.putExtra("SHOULD_SHOW_READY_DIALOG_KEY", z14);
            intent.putExtra("GCM_extra_top_navigation", z15);
            intent.putExtra("OPEN_TO_REPORTS_KEY", false);
            intent.putExtra("FROM_INCOMPLETE_SETUP_KEY", z16);
            intent.putExtra("OPEN_TO_TIPS_KEY", z17);
            return intent;
        }

        private a() {
        }
    }
}

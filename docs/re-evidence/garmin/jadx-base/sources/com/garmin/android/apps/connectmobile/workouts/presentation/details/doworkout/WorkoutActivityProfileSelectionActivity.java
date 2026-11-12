package com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout;

import a11.g0;
import a42.z;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import b82.k;
import c42.c0;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import cq0.p;
import d62.i;
import d62.j;
import d62.o;
import d62.t;
import e23.l;
import e23.r;
import java.util.ArrayList;
import java.util.List;
import o4.d0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/doworkout/WorkoutActivityProfileSelectionActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "b", "Ld62/t;", "viewModel", "Ld62/b;", "uiState", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkoutActivityProfileSelectionActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f48559a = new b(null);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r<Boolean, d0, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f48560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f48561b;

        public a(j jVar, e23.a<Unit> aVar) {
            this.f48560a = jVar;
            this.f48561b = aVar;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, d0 d0Var, m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            m mVar2 = mVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 48) == 0) {
                iIntValue |= mVar2.l(j8) ? 32 : 16;
            }
            if (mVar2.n(iIntValue & 1, (iIntValue & 145) != 144)) {
                x1 x1Var = n.f135158a;
                b82.c.b(null, null, f.c(-457906259, new c0(29, this.f48560a, this.f48561b), mVar2), null, j8, mVar2, ((iIntValue << 9) & 57344) | 384, 11);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r<Boolean, d0, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f48562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f48563b;

        public c(i iVar, e23.a<Unit> aVar) {
            this.f48562a = iVar;
            this.f48563b = aVar;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, d0 d0Var, m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            m mVar2 = mVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 48) == 0) {
                iIntValue |= mVar2.l(j8) ? 32 : 16;
            }
            int i14 = 1;
            if (mVar2.n(iIntValue & 1, (iIntValue & 145) != 144)) {
                x1 x1Var = n.f135158a;
                b82.c.b(null, null, f.c(-530531783, new d62.m(this.f48562a, this.f48563b, i14), mVar2), null, j8, mVar2, ((iIntValue << 9) & 57344) | 384, 11);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48564a;

        static {
            int[] iArr = new int[d62.d.values().length];
            try {
                iArr[d62.d.PARENT_PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d62.d.CHILD_PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f48564a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f48565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f48566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f48567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f48568d;

        public e(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f48565a = gVar;
            this.f48566b = qualifier;
            this.f48567c = aVar;
            this.f48568d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, d62.t] */
        @Override // e23.a
        public final t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f48565a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f48567c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(t.class), viewModelStore, null, defaultViewModelCreationExtras, this.f48566b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f48568d, 4, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x0112  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public final void da(String str, String str2, u4.d dVar, boolean z14, e23.a<Unit> aVar, m mVar, int i14, int i15) {
        int i16;
        String str3;
        e23.a<Unit> aVar2;
        int i17;
        boolean z15;
        o0 o0Var;
        p2 p2VarI0;
        String str4;
        z3.e eVarC;
        z3.e eVarC2;
        int i18;
        int i19;
        int i24;
        o0 o0VarE = mVar.E(-1886705017);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i25 = i15 & 2;
        if (i25 == 0) {
            if ((i14 & 48) == 0) {
                str3 = str2;
                i16 |= o0VarE.B(str3) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if (o0VarE.B(dVar)) {
                    i24 = 256;
                } else {
                    i24 = 128;
                }
                i16 |= i24;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.h(z14)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i16 |= i19;
            }
            if ((i14 & 24576) == 0) {
                aVar2 = aVar;
                if (o0VarE.r(aVar2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
            } else {
                aVar2 = aVar;
            }
            i17 = 1;
            if ((i16 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i16 & 1, z15)) {
                if (i25 != 0) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                x1 x1Var = n.f135158a;
                eVarC = f.c(-841089318, new k(dVar, i17), o0VarE);
                eVarC2 = f.c(-1046817246, new an1.i(z14, 13), o0VarE);
                if (str4 != null || str4.length() == 0) {
                    o0Var = o0VarE;
                    str3 = str4;
                    o0Var.C(1408699480);
                    l72.p2.f111205a.g(str, null, null, eVarC, eVarC2, false, false, aVar, o0Var, (i16 & 14) | 27648 | ((i16 << 12) & 234881024), 230);
                    o0Var.g0(false);
                } else {
                    o0VarE.C(1408952905);
                    l72.p2.f111205a.h(str, str4, null, null, null, false, false, eVarC, eVarC2, null, aVar2, o0VarE, (i16 & 14) | 113246208 | (i16 & 112), (i16 >> 12) & 14, 636);
                    str3 = str4;
                    o0Var = o0VarE;
                    o0Var.g0(false);
                }
            } else {
                o0Var = o0VarE;
                o0Var.e();
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new o(this, str, str3, dVar, z14, aVar, i14, i15, 0);
            }
        }
        i16 |= 48;
        str3 = str2;
        if ((i14 & 384) == 0) {
            if (o0VarE.B(dVar)) {
                i24 = 256;
            } else {
                i24 = 128;
            }
            i16 |= i24;
        }
        if ((i14 & 3072) == 0) {
            if (o0VarE.h(z14)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i16 |= i19;
        }
        if ((i14 & 24576) == 0) {
            aVar2 = aVar;
            if (o0VarE.r(aVar2)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i16 |= i18;
        } else {
            aVar2 = aVar;
        }
        i17 = 1;
        if ((i16 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i16 & 1, z15)) {
            if (i25 != 0) {
                str4 = null;
            } else {
                str4 = str3;
            }
            x1 x1Var2 = n.f135158a;
            eVarC = f.c(-841089318, new k(dVar, i17), o0VarE);
            eVarC2 = f.c(-1046817246, new an1.i(z14, 13), o0VarE);
            if (str4 != null) {
                o0Var = o0VarE;
                str3 = str4;
                o0Var.C(1408699480);
                l72.p2.f111205a.g(str, null, null, eVarC, eVarC2, false, false, aVar, o0Var, (i16 & 14) | 27648 | ((i16 << 12) & 234881024), 230);
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                str3 = str4;
                o0Var.C(1408699480);
                l72.p2.f111205a.g(str, null, null, eVarC, eVarC2, false, false, aVar, o0Var, (i16 & 14) | 27648 | ((i16 << 12) & 234881024), 230);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, str, str3, dVar, z14, aVar, i14, i15, 0);
        }
    }

    public final void ea(i iVar, j jVar, l<? super j, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar3;
        o0 o0VarE = mVar.E(-1861579675);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(jVar == null ? -1 : jVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            aVar3 = aVar2;
            i15 |= o0VarE.r(aVar3) ? 16384 : 8192;
        } else {
            aVar3 = aVar2;
        }
        if ((196608 & i14) == 0) {
            i15 |= (262144 & i14) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 131072 : 65536;
        }
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            z02.d.a(false, f.c(-262270998, new d62.m(iVar, aVar, i16), o0VarE), null, null, null, f.c(1297313774, new z(jVar, aVar3, iVar, this, lVar), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(this, iVar, jVar, lVar, aVar, aVar2, i14);
        }
    }

    public final void fa(List<i> list, i iVar, String str, l<? super i, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        int i15;
        i iVar2;
        String str2;
        l<? super i, Unit> lVar2;
        e23.a<Unit> aVar3;
        o0 o0VarE = mVar.E(383935729);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            iVar2 = iVar;
            i15 |= o0VarE.r(iVar2) ? 32 : 16;
        } else {
            iVar2 = iVar;
        }
        if ((i14 & 384) == 0) {
            str2 = str;
            i15 |= o0VarE.B(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i14 & 3072) == 0) {
            lVar2 = lVar;
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        } else {
            lVar2 = lVar;
        }
        if ((i14 & 24576) == 0) {
            aVar3 = aVar;
            i15 |= o0VarE.r(aVar3) ? 16384 : 8192;
        } else {
            aVar3 = aVar;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= (2097152 & i14) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            z02.d.a(false, f.c(-1573479754, new p(aVar2, 11), o0VarE), null, null, null, f.c(-1797296198, new a42.c(iVar2, aVar3, str2, list, this, lVar2), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(this, list, iVar, str, lVar, aVar, aVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayListExtra;
        super.onCreate(bundle);
        Intent intent = getIntent();
        f48559a.getClass();
        long longExtra = intent != null ? intent.getLongExtra("extra_selected_device_unit_id", -1L) : -1L;
        Intent intent2 = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            if (intent2 != null) {
                parcelableArrayListExtra = intent2.getParcelableArrayListExtra("extra_profiles", i.class);
            } else {
                parcelableArrayListExtra = null;
            }
        } else if (intent2 != null) {
            parcelableArrayListExtra = intent2.getParcelableArrayListExtra("extra_profiles");
        } else {
            parcelableArrayListExtra = null;
        }
        String stringExtra = getIntent().getStringExtra("extra_workout_name");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            initComposeScreen(new z3.e(1579884672, true, new d62.p(this, stringExtra, o13.m.a(o13.n.NONE, new e(this, null, null, new d62.n(0, parcelableArrayListExtra))), longExtra, 0)));
            return;
        }
        displayFailedMessage();
        setResult(0);
        finish();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/doworkout/WorkoutActivityProfileSelectionActivity$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REQUEST_CODE", "I", "EXTRA_SELECTED_DEVICE_UNIT_ID", "EXTRA_PROFILES", "EXTRA_SELECTED_PROFILE", "EXTRA_WORKOUT_NAME", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}

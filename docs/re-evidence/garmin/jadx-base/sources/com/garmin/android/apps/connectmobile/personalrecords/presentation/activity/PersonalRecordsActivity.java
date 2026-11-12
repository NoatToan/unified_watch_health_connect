package com.garmin.android.apps.connectmobile.personalrecords.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.d;
import gl1.m;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import q91.g;
import ro0.h;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/personalrecords/presentation/activity/PersonalRecordsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PersonalRecordsActivity extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40337b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ba1.d f40338a;

    @Override // android.app.Activity
    public final void finish() {
        ba1.d dVar = this.f40338a;
        if (dVar == null) {
            s.m("personalRecordsViewModel");
            throw null;
        }
        if (dVar.D) {
            setResult(-1);
        }
        super.finish();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g gVar;
        q91.d dVar;
        Long lValueOf;
        Object serializable;
        Object serializable2;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            gVar = g.STEPS;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = extras.getSerializable("extra_selected_sport_type", g.class);
            } else {
                Object serializable3 = extras.getSerializable("extra_selected_sport_type");
                if (!(serializable3 instanceof g)) {
                    serializable3 = null;
                }
                serializable2 = (g) serializable3;
            }
            gVar = (g) serializable2;
            if (gVar == null) {
                gVar = g.STEPS;
            }
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras2.getSerializable("extra_personal_record_type", q91.d.class);
            } else {
                Object serializable4 = extras2.getSerializable("extra_personal_record_type");
                if (!(serializable4 instanceof q91.d)) {
                    serializable4 = null;
                }
                serializable = (q91.d) serializable4;
            }
            dVar = (q91.d) serializable;
        } else {
            dVar = null;
        }
        Bundle extras3 = getIntent().getExtras();
        if (extras3 != null) {
            long j8 = extras3.getLong("extra_activity_id_to_highlight", -1L);
            lValueOf = Long.valueOf(j8);
            if (j8 == -1) {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        ba1.d dVar2 = (ba1.d) GetViewModelKt.resolveViewModel$default(s0.f105811a.b(ba1.d.class), getViewModelStore(), null, getDefaultViewModelCreationExtras(), null, AndroidKoinScopeExtKt.getKoinScope(this), new m(2, lValueOf), 4, null);
        this.f40338a = dVar2;
        if (dVar != null) {
            if (dVar2 == null) {
                s.m("personalRecordsViewModel");
                throw null;
            }
            dVar2.C4(dVar, new h(28));
        }
        initComposeScreen(new e(-806644179, true, new s91.a(this, gVar, dVar, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/personalrecords/presentation/activity/PersonalRecordsActivity$a;", "", "<init>", "()V", "", "EXTRA_SELECTED_SPORT_TYPE", "Ljava/lang/String;", "EXTRA_PERSONAL_RECORD_TYPE", "EXTRA_ACTIVITY_ID_TO_HIGHLIGHT", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, g gVar, q91.d dVar, Long l14) {
            Intent intentD = sn.a.d(context, context, PersonalRecordsActivity.class);
            if (gVar == null) {
                gVar = null;
            }
            intentD.putExtra("extra_selected_sport_type", (Parcelable) gVar);
            if (dVar == null) {
                dVar = null;
            }
            intentD.putExtra("extra_personal_record_type", (Parcelable) dVar);
            intentD.putExtra("extra_activity_id_to_highlight", l14);
            return intentD;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, g gVar, q91.d dVar, Long l14, int i14) {
            if ((i14 & 2) != 0) {
                gVar = null;
            }
            if ((i14 & 4) != 0) {
                dVar = null;
            }
            if ((i14 & 8) != 0) {
                l14 = null;
            }
            aVar.getClass();
            return a(context, gVar, dVar, l14);
        }

        private a() {
        }
    }
}

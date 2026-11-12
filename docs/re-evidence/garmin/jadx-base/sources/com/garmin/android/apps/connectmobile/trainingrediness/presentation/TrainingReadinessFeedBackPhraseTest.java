package com.garmin.android.apps.connectmobile.trainingrediness.presentation;

import android.os.Bundle;
import c2.x2;
import com.garmin.android.apps.connectmobile.d;
import com.nimbusds.jose.shaded.gson.internal.a;
import d92.b;
import h4.r;
import i3.v5;
import l72.p2;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.x1;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/trainingrediness/presentation/TrainingReadinessFeedBackPhraseTest;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "gcm-training-readiness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrainingReadinessFeedBackPhraseTest extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f46487a = 0;

    public final void da(String str, String str2, m mVar, int i14) {
        int i15;
        o0 o0VarK = a.k(str, str2, mVar, 2060489617);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarK.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarK.B(str2) ? 32 : 16;
        }
        if (o0VarK.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int i16 = i15;
            p2.f111205a.h(str, str2, null, x2.f(r.S, 1.0f), null, false, false, null, null, null, null, o0VarK, (i16 & 14) | 3072 | (i16 & 112), 0, 2036);
            b.f58623a.getClass();
            v5.a(0.0f, 0, 3, b.a(o0VarK).j().c(), null, o0VarK);
        } else {
            o0VarK.e();
        }
        p3.p2 p2VarI0 = o0VarK.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s70.n(this, str, str2, i14, 28);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        boolean z14 = extras != null ? extras.getBoolean("TR_Phrase_Feedback", true) : true;
        initComposeScreen(new e(1041699221, true, new sz1.n("TR Feedback Phrases ".concat(z14 ? "Long" : "Short"), this, z14, 0)));
    }
}

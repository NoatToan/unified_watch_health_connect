package com.garmin.android.apps.connectmobile.activities.reports;

import am.x0;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.d;
import g.h;
import hl1.j;
import i3.d6;
import np.c;
import o82.g;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/reports/ActivityReportsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivityReportsActivity extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29758a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        Object serializableExtra2;
        Object serializableExtra3;
        Object serializableExtra4;
        g gVar;
        super.onCreate(bundle);
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("GCM_extra_activity_type", x0.class) : null;
        } else {
            Object serializableExtra5 = intent != null ? intent.getSerializableExtra("GCM_extra_activity_type") : null;
            if (!(serializableExtra5 instanceof x0)) {
                serializableExtra5 = null;
            }
            serializableExtra = (x0) serializableExtra5;
        }
        x0 x0Var = (x0) serializableExtra;
        if (x0Var == null) {
            return;
        }
        Intent intent2 = getIntent();
        if (i14 >= 33) {
            serializableExtra2 = intent2 != null ? intent2.getSerializableExtra("EXTRA_INITIAL_SELECTED_ACTIVITY", x0.class) : null;
        } else {
            Object serializableExtra6 = intent2 != null ? intent2.getSerializableExtra("EXTRA_INITIAL_SELECTED_ACTIVITY") : null;
            if (!(serializableExtra6 instanceof x0)) {
                serializableExtra6 = null;
            }
            serializableExtra2 = (x0) serializableExtra6;
        }
        x0 x0Var2 = (x0) serializableExtra2;
        Intent intent3 = getIntent();
        if (i14 >= 33) {
            serializableExtra3 = intent3 != null ? intent3.getSerializableExtra("initialTab", Integer.class) : null;
        } else {
            Object serializableExtra7 = intent3 != null ? intent3.getSerializableExtra("initialTab") : null;
            if (!(serializableExtra7 instanceof Integer)) {
                serializableExtra7 = null;
            }
            serializableExtra3 = (Integer) serializableExtra7;
        }
        Integer num = (Integer) serializableExtra3;
        Intent intent4 = getIntent();
        if (i14 >= 33) {
            serializableExtra4 = intent4 != null ? intent4.getSerializableExtra("EXTRA_START_DATE", DateTime.class) : null;
        } else {
            Object serializableExtra8 = intent4 != null ? intent4.getSerializableExtra("EXTRA_START_DATE") : null;
            if (!(serializableExtra8 instanceof DateTime)) {
                serializableExtra8 = null;
            }
            serializableExtra4 = (DateTime) serializableExtra8;
        }
        DateTime dateTime = (DateTime) serializableExtra4;
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue == 0) {
            gVar = g.f130851d;
        } else if (iIntValue != 1) {
            gVar = iIntValue != 2 ? g.f130851d : g.f130859l;
        } else {
            gVar = g.f130853f;
        }
        c cVar = (c) GetViewModelKt.resolveViewModel$default(s0.f105811a.b(c.class), getF189591b(), null, getDefaultViewModelCreationExtras(), null, AndroidKoinScopeExtKt.getKoinScope(this), new d6(x0Var, 22, x0Var2, gVar), 4, null);
        initComposeScreen(new e(1575477500, true, new j(gVar, dateTime, cVar, this, registerForActivityResult(new h(), new jp.a(cVar, 0)), (am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null), 12)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/reports/ActivityReportsActivity$a;", "", "<init>", "()V", "", "EXTRA_START_DATE", "Ljava/lang/String;", "EXTRA_INITIAL_SELECTED_ACTIVITY_TYPE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(a aVar, Context context, x0 x0Var, x0 x0Var2, DateTime dateTime, Integer num, int i14) {
            if ((i14 & 4) != 0) {
                x0Var2 = null;
            }
            if ((i14 & 8) != 0) {
                dateTime = null;
            }
            if ((i14 & 16) != 0) {
                num = null;
            }
            aVar.getClass();
            context.getClass();
            x0Var.getClass();
            Intent intent = new Intent(context, (Class<?>) ActivityReportsActivity.class);
            intent.putExtra("GCM_extra_activity_type", (Parcelable) x0Var);
            if (x0Var2 != null) {
                intent.putExtra("EXTRA_INITIAL_SELECTED_ACTIVITY", (Parcelable) x0Var2);
            }
            if (dateTime != null) {
                intent.putExtra("EXTRA_START_DATE", dateTime);
            }
            if (num != null) {
                intent.putExtra("initialTab", num.intValue());
            }
            context.startActivity(intent);
        }

        private a() {
        }
    }
}

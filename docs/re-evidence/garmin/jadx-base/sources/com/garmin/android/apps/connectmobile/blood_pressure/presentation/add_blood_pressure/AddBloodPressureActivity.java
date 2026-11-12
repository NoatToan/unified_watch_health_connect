package com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import ng1.c1;
import oe2.f;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p92.o;
import q92.v;
import q92.x;
import qh1.j;
import rw.i;
import z10.p3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/blood_pressure/presentation/add_blood_pressure/AddBloodPressureActivity;", "Lz10/p3;", "<init>", "()V", "a", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AddBloodPressureActivity extends p3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30909d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DateTime f30910e = new DateTime(1990, 1, 1, 1, 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f30911c = new w1(s0.f105811a.b(i.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f30912a;

        public b(g gVar) {
            this.f30912a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f30912a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f30913a;

        public c(g gVar) {
            this.f30913a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f30913a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f30914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f30915b;

        public d(e23.a aVar, g gVar) {
            this.f30914a = aVar;
            this.f30915b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f30914a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f30915b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static void ka(AddBloodPressureActivity addBloodPressureActivity) {
        super.onBackPressed();
    }

    @Override // z10.p3
    public final Fragment ca() {
        long longExtra = getIntent().getLongExtra("extra.date.time", f30910e.getMillis());
        com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.f30916d.getClass();
        com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a aVar = new com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a();
        Bundle bundle = new Bundle();
        bundle.putLong("extra.date.time", longExtra);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.lbl_add_reading);
        string.getClass();
        return string;
    }

    @Override // z10.p3
    public final boolean ia() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z10.p3, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        String notes;
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        pw.a aVar = (pw.a) ((i) this.f30911c.getValue()).f154817c.d();
        if (aVar != null && ((aVar.getSystolic() != null || aVar.getDiastolic() != null || aVar.getPulse() != null || ((notes = aVar.getNotes()) != null && !w.J(notes))) && getSupportFragmentManager().M() == 0)) {
            o oVar = o.f136619a;
            x xVar = x.DI_CONNECT_UPLOAD;
            oVar.getClass();
            v vVarN = o.n(xVar);
            if (vVarN != null && vVarN.b()) {
                f.e(new e.a(this).setTitle(getString(R.string.message_common_confirm_leaving_screen)).setPositiveButton(R.string.lbl_common_continue, new c1(this, 28)).setNegativeButton(R.string.lbl_cancel, new j(9)).show(), 1.3f);
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/blood_pressure/presentation/add_blood_pressure/AddBloodPressureActivity$a;", "", "<init>", "()V", "", "REQUEST_CODE_ADD_BLOOD_PRESSURE", "I", "VALUES_EDITED", "VALUES_NOT_EDITED", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, DateTime dateTime) {
            Intent intentD = sn.a.d(context, context, AddBloodPressureActivity.class);
            if (dateTime != null) {
                intentD.putExtra("extra.date.time", dateTime.getMillis());
            }
            context.startActivity(intentD);
        }

        private a() {
        }
    }
}

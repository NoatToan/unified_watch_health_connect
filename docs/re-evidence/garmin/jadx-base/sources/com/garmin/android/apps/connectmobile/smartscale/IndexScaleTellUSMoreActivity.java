package com.garmin.android.apps.connectmobile.smartscale;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.appcompat.app.e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import c22.u1;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import vu1.k;
import wn1.g;
import wn1.j0;
import z10.p3;
import zb0.c1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/smartscale/IndexScaleTellUSMoreActivity;", "Lz10/p3;", "Lzb0/c1$b;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IndexScaleTellUSMoreActivity extends p3 implements c1.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f44359h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f44360i = "IndexScaleTellUSMoreActivity";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f44361c = new w1(s0.f105811a.b(g.class), new c(this), new b(this), new d(null, this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f44363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f44364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f44365g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f44366a;

        public b(b.g gVar) {
            this.f44366a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f44366a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f44367a;

        public c(b.g gVar) {
            this.f44367a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f44367a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f44369b;

        public d(e23.a aVar, b.g gVar) {
            this.f44368a = aVar;
            this.f44369b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f44368a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f44369b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // zb0.c1.b
    public final void O3(String str) {
        if (this.f44362d) {
            this.f44363e = str;
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText(R.string.msg_error_retrieving_user_profile_data));
        if (str != null && str.length() != 0) {
            spannableStringBuilder.append((CharSequence) "<p>").append((CharSequence) str).append((CharSequence) "</p>");
        }
        String string = spannableStringBuilder.toString();
        string.getClass();
        new e.a(this).setTitle("").setMessage(Html.fromHtml(string)).setPositiveButton(R.string.lbl_try_again, new k(8)).setNegativeButton(android.R.string.cancel, new wn1.e(this, 1)).show();
    }

    @Override // zb0.c1.b
    public final void c5() {
        if (this.f44362d) {
            this.f44365g = Boolean.TRUE;
            return;
        }
        if (!ka().f186221d) {
            l.f68084a.getClass();
            int iY4 = l.a.a().y4();
            if (iY4 > 0) {
                l.a.a().r3(iY4 - 1);
            }
            ((j0) KoinJavaComponent.get$default(j0.class, null, null, 6, null)).b(this);
            finish();
            return;
        }
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40568e.getClass();
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.a.b(currentFocus);
        }
        com.garmin.android.apps.connectmobile.devices.model.l lVar = ka().f186222e;
        if (lVar != null) {
            ((j0) KoinJavaComponent.get$default(j0.class, null, null, 6, null)).a(this, lVar);
        }
        setResult(-1);
        finish();
    }

    @Override // z10.p3
    public final Fragment ca() {
        return new c1();
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.tell_us_more_page_title);
        string.getClass();
        return string;
    }

    @Override // z10.p3
    public final String ea() {
        return da();
    }

    @Override // z10.p3
    public final void ga() {
        Parcelable parcelable;
        com.garmin.android.apps.connectmobile.devices.model.l lVar;
        Parcelable parcelable2;
        Bundle extras = getIntent().getExtras();
        ka().f186221d = extras != null ? extras.getBoolean("extra_primary_flow", false) : false;
        com.garmin.android.apps.connectmobile.smartscale.model.b bVar = null;
        if (!ka().f186221d) {
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) extras.getParcelable("GCM_extra_device_invite", com.garmin.android.apps.connectmobile.smartscale.model.b.class);
                } else {
                    Parcelable parcelable3 = extras.getParcelable("GCM_extra_device_invite");
                    parcelable = (com.garmin.android.apps.connectmobile.smartscale.model.b) (parcelable3 instanceof com.garmin.android.apps.connectmobile.smartscale.model.b ? parcelable3 : null);
                }
                bVar = (com.garmin.android.apps.connectmobile.smartscale.model.b) parcelable;
            }
            if (bVar != null) {
                ka().f186218a = bVar.d();
                g gVarKa = ka();
                Long deviceInviteID = bVar.getDeviceInviteID();
                gVarKa.f186219b = deviceInviteID != null ? deviceInviteID.longValue() : -1L;
                ka().f186220c = bVar.getPartNumberPartial();
                return;
            }
            return;
        }
        ka().f186218a = extras != null ? extras.getLong("GCM_deviceUnitID", -1L) : -1L;
        ka().f186219b = extras != null ? extras.getLong("GCM_inviteID", -1L) : -1L;
        g gVarKa2 = ka();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = (Parcelable) extras.getParcelable("GCM_deviceDTO", com.garmin.android.apps.connectmobile.devices.model.l.class);
            } else {
                Parcelable parcelable4 = extras.getParcelable("GCM_deviceDTO");
                if (!(parcelable4 instanceof com.garmin.android.apps.connectmobile.devices.model.l)) {
                    parcelable4 = null;
                }
                parcelable2 = (com.garmin.android.apps.connectmobile.devices.model.l) parcelable4;
            }
            lVar = (com.garmin.android.apps.connectmobile.devices.model.l) parcelable2;
        } else {
            lVar = null;
        }
        gVarKa2.f186222e = lVar;
        g gVarKa3 = ka();
        com.garmin.android.apps.connectmobile.devices.model.l lVar2 = ka().f186222e;
        gVarKa3.f186220c = lVar2 != null ? lVar2.getDevicePartNumber() : null;
    }

    public final g ka() {
        return (g) this.f44361c.getValue();
    }

    public final void la() {
        e eVarCreate = new e.a(this).create();
        eVarCreate.setCancelable(false);
        eVarCreate.setCanceledOnTouchOutside(false);
        eVarCreate.setTitle("");
        eVarCreate.h(getText(R.string.smart_scale_device_setup_abandon_setup_message_a));
        eVarCreate.g(-2, getText(R.string.lbl_cancel), new wn1.e(this, 2));
        eVarCreate.g(-1, getText(R.string.lbl_resume), new k(9));
        eVarCreate.show();
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (ka().f186221d) {
            new e.a(this).setMessage(R.string.smart_scale_device_setup_abandon_setup_message_a).setPositiveButton(R.string.lbl_resume, new k(6)).setNegativeButton(R.string.lbl_cancel, new wn1.e(this, 0)).setCancelable(false).show();
        } else {
            la();
        }
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        if (ka().f186221d) {
            onBackPressed();
            return true;
        }
        la();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f44362d = true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        String strA;
        super.onResume();
        this.f44362d = false;
        String str = this.f44363e;
        if (str != null) {
            O3(str);
            this.f44363e = null;
            return;
        }
        String str2 = this.f44364f;
        if (str2 != null) {
            v7(str2);
            this.f44364f = null;
            return;
        }
        if (this.f44365g != null) {
            this.f44365g = null;
            c5();
        }
        if (!ka().f186221d || (strA = u1.a(ka().f186218a)) == null || ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).f(strA)) {
            return;
        }
        e.a aVar = new e.a(this);
        aVar.setTitle(R.string.smart_scale_waiting_for_device_title);
        aVar.setMessage(R.string.smart_scale_waiting_for_device_message_a);
        aVar.setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null);
        aVar.create().show();
    }

    @Override // zb0.c1.b
    public final void v7(String str) {
        if (!this.f44362d) {
            View currentFocus = getCurrentFocus();
            if (currentFocus != null) {
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40568e.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.a.b(currentFocus);
            }
            e.a aVar = new e.a(this);
            if (str == null) {
                str = getString(R.string.txt_something_went_wrong_try_again);
                str.getClass();
            }
            aVar.setMessage(str).setPositiveButton(R.string.lbl_ok, new k(7)).show();
            str = null;
        }
        this.f44364f = str;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/smartscale/IndexScaleTellUSMoreActivity$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "EXTRA_PRIMARY_FLOW", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

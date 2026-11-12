package com.garmin.android.apps.connectmobile.contacts.edit;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.e;
import androidx.core.view.j;
import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactMethodActivity;
import com.garmin.android.apps.connectmobile.g3;
import d53.w;
import f20.c0;
import f20.e0;
import f20.i;
import fw.p;
import i20.m;
import i20.n;
import i20.r;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m20.p0;
import oe2.f;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/edit/EditContactMethodActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditContactMethodActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f32519d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f32520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f32521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f32522c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32523a;

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
            f32523a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i20.n] */
    /* JADX WARN: Type inference failed for: r0v1, types: [i20.n] */
    public EditContactMethodActivity() {
        final int i14 = 0;
        this.f32521b = new z0(this) { // from class: i20.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditContactMethodActivity f87176b;

            {
                this.f87176b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                boolean zD;
                List<l20.c> listR;
                List<l20.c> listZ;
                int i15 = i14;
                final int i16 = 1;
                final EditContactMethodActivity editContactMethodActivity = this.f87176b;
                final int i17 = 0;
                switch (i15) {
                    case 0:
                        l lVar = (l) obj;
                        EditContactMethodActivity.a aVar = EditContactMethodActivity.f32519d;
                        lVar.getClass();
                        if (lVar instanceof l.a) {
                            editContactMethodActivity.ca();
                            return;
                        }
                        if (lVar instanceof l.c) {
                            editContactMethodActivity.setTitle(editContactMethodActivity.getString(R.string.lbl_country_region));
                            androidx.fragment.app.v supportFragmentManager = editContactMethodActivity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                            com.garmin.android.apps.connectmobile.contacts.edit.d.f32562b.getClass();
                            aVar2.l(R.id.fragment_container, new com.garmin.android.apps.connectmobile.contacts.edit.d(), "SelectPhonePrefixFragment");
                            aVar2.d(null);
                            aVar2.e();
                            return;
                        }
                        if (lVar instanceof l.b) {
                            editContactMethodActivity.setTitle(editContactMethodActivity.getString(R.string.lbl_label));
                            androidx.fragment.app.v supportFragmentManager2 = editContactMethodActivity.getSupportFragmentManager();
                            supportFragmentManager2.getClass();
                            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager2);
                            com.garmin.android.apps.connectmobile.contacts.edit.c.f32554b.getClass();
                            aVar3.l(R.id.fragment_container, new com.garmin.android.apps.connectmobile.contacts.edit.c(), "SelectLabelFragment");
                            aVar3.d("SelectLabelFragment");
                            aVar3.e();
                            return;
                        }
                        if (!(lVar instanceof l.d)) {
                            u0.r();
                            return;
                        }
                        r rVar = editContactMethodActivity.f32520a;
                        if (rVar == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        if (!rVar.f87193j) {
                            String str = rVar.f87191h;
                            String strGa = editContactMethodActivity.ga();
                            if (p005kotlin.jvm.internal.s.g(str, strGa != null ? strGa : "")) {
                                r rVar2 = editContactMethodActivity.f32520a;
                                if (rVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("viewModel");
                                    throw null;
                                }
                                if (!p005kotlin.jvm.internal.s.g(rVar2.f87184a, editContactMethodActivity.ha())) {
                                    editContactMethodActivity.ea(str);
                                    return;
                                } else {
                                    editContactMethodActivity.setResult(0);
                                    editContactMethodActivity.finish();
                                    return;
                                }
                            }
                            l20.a aVarFa = editContactMethodActivity.fa();
                            if (aVarFa != null && (listR = aVarFa.r()) != null && !listR.isEmpty()) {
                                Iterator<T> it = listR.iterator();
                                while (it.hasNext()) {
                                    if (p005kotlin.jvm.internal.s.g(((l20.c) it.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), str)) {
                                        new androidx.appcompat.app.e.a(editContactMethodActivity).setMessage(editContactMethodActivity.getString(R.string.lbl_duplicate_email_message)).setTitle(R.string.lbl_duplicate_email_title).setCancelable(false).setPositiveButton(editContactMethodActivity.getString(android.R.string.ok), new m(editContactMethodActivity, 5)).create().show();
                                        editContactMethodActivity.setResult(0);
                                        return;
                                    }
                                }
                            }
                            com.garmin.android.apps.connectmobile.contacts.i.f32732a.getClass();
                            if (str != null) {
                                zD = com.garmin.android.apps.connectmobile.contacts.i.f32735d.d(str);
                            } else {
                                com.garmin.android.apps.connectmobile.contacts.i.f32733b.debug("Entered email id is null");
                                zD = false;
                            }
                            if (zD) {
                                editContactMethodActivity.ea(str);
                                return;
                            } else {
                                editContactMethodActivity.da();
                                editContactMethodActivity.setResult(0);
                                return;
                            }
                        }
                        c0 c0Var = rVar.f87190g;
                        String str2 = c0Var != null ? c0Var.f68362c : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        final String strG = tn.k.g(str2, rVar.f87191h);
                        String strGa2 = editContactMethodActivity.ga();
                        if (strG.equals(strGa2 != null ? strGa2 : "")) {
                            r rVar3 = editContactMethodActivity.f32520a;
                            if (rVar3 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            if (!p005kotlin.jvm.internal.s.g(rVar3.f87184a, editContactMethodActivity.ha())) {
                                editContactMethodActivity.ea(strG);
                                return;
                            } else {
                                editContactMethodActivity.setResult(0);
                                editContactMethodActivity.finish();
                                return;
                            }
                        }
                        l20.a aVarFa2 = editContactMethodActivity.fa();
                        if (aVarFa2 != null && (listZ = aVarFa2.z()) != null && !listZ.isEmpty()) {
                            Iterator<T> it3 = listZ.iterator();
                            while (it3.hasNext()) {
                                if (p005kotlin.jvm.internal.s.g(((l20.c) it3.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), strG)) {
                                    new androidx.appcompat.app.e.a(editContactMethodActivity).setMessage(editContactMethodActivity.getString(R.string.lbl_duplicate_phone_number_message)).setTitle(R.string.lbl_duplicate_phone_number_title).setCancelable(false).setPositiveButton(editContactMethodActivity.getString(android.R.string.ok), new m(editContactMethodActivity, 2)).create().show();
                                    editContactMethodActivity.setResult(0);
                                    return;
                                }
                            }
                        }
                        if (com.garmin.android.apps.connectmobile.contacts.b.e()) {
                            Intent intent = editContactMethodActivity.getIntent();
                            if (p005kotlin.jvm.internal.s.g(intent != null ? Boolean.valueOf(intent.getBooleanExtra("EXTRA_HAS_MESSENGER_ASSOCIATED", false)) : null, Boolean.TRUE)) {
                                editContactMethodActivity.ia(new e23.a() { // from class: i20.o
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i18 = i17;
                                        String str3 = strG;
                                        EditContactMethodActivity editContactMethodActivity2 = editContactMethodActivity;
                                        switch (i18) {
                                            case 0:
                                                EditContactMethodActivity.a aVar4 = EditContactMethodActivity.f32519d;
                                                l20.a aVarFa3 = editContactMethodActivity2.fa();
                                                if (aVarFa3 == null) {
                                                    return null;
                                                }
                                                r rVar4 = editContactMethodActivity2.f32520a;
                                                if (rVar4 != null) {
                                                    rVar4.x4(str3, aVarFa3);
                                                    return Unit.INSTANCE;
                                                }
                                                p005kotlin.jvm.internal.s.m("viewModel");
                                                throw null;
                                            default:
                                                EditContactMethodActivity.a aVar5 = EditContactMethodActivity.f32519d;
                                                l20.a aVarFa4 = editContactMethodActivity2.fa();
                                                if (aVarFa4 == null) {
                                                    return null;
                                                }
                                                r rVar5 = editContactMethodActivity2.f32520a;
                                                if (rVar5 != null) {
                                                    rVar5.x4(str3, aVarFa4);
                                                    return Unit.INSTANCE;
                                                }
                                                p005kotlin.jvm.internal.s.m("viewModel");
                                                throw null;
                                        }
                                    }
                                });
                                return;
                            }
                            l20.a aVarFa3 = editContactMethodActivity.fa();
                            if (aVarFa3 != null) {
                                r rVar4 = editContactMethodActivity.f32520a;
                                if (rVar4 != null) {
                                    rVar4.x4(strG, aVarFa3);
                                    return;
                                } else {
                                    p005kotlin.jvm.internal.s.m("viewModel");
                                    throw null;
                                }
                            }
                            return;
                        }
                        com.garmin.android.apps.connectmobile.contacts.i.f32732a.getClass();
                        if (!com.garmin.android.apps.connectmobile.contacts.i.a.a(strG)) {
                            new androidx.appcompat.app.e.a(editContactMethodActivity).setMessage(editContactMethodActivity.getString(R.string.phone_number_validation_message, "7", "15")).setCancelable(false).setPositiveButton(editContactMethodActivity.getString(android.R.string.ok), new m(editContactMethodActivity, 4)).create().show();
                            editContactMethodActivity.setResult(0);
                            return;
                        }
                        Intent intent2 = editContactMethodActivity.getIntent();
                        Boolean boolValueOf = intent2 != null ? Boolean.valueOf(intent2.getBooleanExtra("EXTRA_HAS_MESSENGER_ASSOCIATED", false)) : null;
                        Boolean bool = Boolean.TRUE;
                        if (p005kotlin.jvm.internal.s.g(boolValueOf, bool)) {
                            editContactMethodActivity.ia(new e23.a() { // from class: i20.o
                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = i16;
                                    String str3 = strG;
                                    EditContactMethodActivity editContactMethodActivity2 = editContactMethodActivity;
                                    switch (i18) {
                                        case 0:
                                            EditContactMethodActivity.a aVar4 = EditContactMethodActivity.f32519d;
                                            l20.a aVarFa4 = editContactMethodActivity2.fa();
                                            if (aVarFa4 == null) {
                                                return null;
                                            }
                                            r rVar5 = editContactMethodActivity2.f32520a;
                                            if (rVar5 != null) {
                                                rVar5.x4(str3, aVarFa4);
                                                return Unit.INSTANCE;
                                            }
                                            p005kotlin.jvm.internal.s.m("viewModel");
                                            throw null;
                                        default:
                                            EditContactMethodActivity.a aVar5 = EditContactMethodActivity.f32519d;
                                            l20.a aVarFa5 = editContactMethodActivity2.fa();
                                            if (aVarFa5 == null) {
                                                return null;
                                            }
                                            r rVar6 = editContactMethodActivity2.f32520a;
                                            if (rVar6 != null) {
                                                rVar6.x4(str3, aVarFa5);
                                                return Unit.INSTANCE;
                                            }
                                            p005kotlin.jvm.internal.s.m("viewModel");
                                            throw null;
                                    }
                                }
                            });
                        }
                        Intent intent3 = editContactMethodActivity.getIntent();
                        if (p005kotlin.jvm.internal.s.g(intent3 != null ? Boolean.valueOf(intent3.getBooleanExtra("EXTRA_IS_EMERGENCY_CALLING_NUMBER", false)) : null, bool)) {
                            new androidx.appcompat.app.e.a(editContactMethodActivity).setTitle(R.string.lbl_update_phone_number_question).setMessage(R.string.msg_update_emergency_calling_phone_number).setCancelable(false).setPositiveButton(R.string.lbl_update, new hg1.g(6, editContactMethodActivity, strG)).setNegativeButton(R.string.lbl_cancel, new m(editContactMethodActivity, 3)).create().show();
                            return;
                        } else {
                            editContactMethodActivity.ea(strG);
                            return;
                        }
                    default:
                        g3 g3Var = (g3) obj;
                        EditContactMethodActivity.a aVar4 = EditContactMethodActivity.f32519d;
                        g3Var.getClass();
                        int i18 = EditContactMethodActivity.b.f32523a[g3Var.f35300a.ordinal()];
                        if (i18 == 1) {
                            editContactMethodActivity.showProgressOverlay();
                            return;
                        }
                        if (i18 != 2) {
                            if (i18 == 3) {
                                editContactMethodActivity.hideProgressOverlay();
                                return;
                            } else {
                                u0.r();
                                return;
                            }
                        }
                        editContactMethodActivity.hideProgressOverlay();
                        o13.p pVar = (o13.p) g3Var.f35301b;
                        if (pVar != null) {
                            p0 p0Var = (p0) pVar.f128594a;
                            Boolean valid = p0Var.getValid();
                            Boolean bool2 = Boolean.TRUE;
                            if (!p005kotlin.jvm.internal.s.g(valid, bool2) || !p005kotlin.jvm.internal.s.g(p0Var.getCanReceiveText(), bool2)) {
                                r rVar5 = editContactMethodActivity.f32520a;
                                if (rVar5 == null) {
                                    p005kotlin.jvm.internal.s.m("viewModel");
                                    throw null;
                                }
                                if (rVar5.f87192i) {
                                    editContactMethodActivity.da();
                                    return;
                                } else {
                                    rVar5.f87192i = true;
                                    editContactMethodActivity.ca();
                                    return;
                                }
                            }
                            r rVar6 = editContactMethodActivity.f32520a;
                            if (rVar6 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            rVar6.f87192i = false;
                            String phoneNumber = p0Var.getPhoneNumber();
                            if (phoneNumber == null) {
                                phoneNumber = "";
                            }
                            String phoneUuid = p0Var.getPhoneUuid();
                            String str3 = phoneUuid != null ? phoneUuid : "";
                            Intent intent4 = new Intent();
                            String strGa3 = editContactMethodActivity.ga();
                            if (strGa3 != null) {
                                intent4.putExtra("EXTRA_PHONE_NUMBER_OR_EMAIL", strGa3);
                            }
                            r rVar7 = editContactMethodActivity.f32520a;
                            if (rVar7 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            if (!d53.w.J(rVar7.f87191h)) {
                                intent4.putExtra("EXTRA_RESULT", phoneNumber);
                            }
                            intent4.putExtra("RESULT_PHONE_UUID", str3);
                            intent4.putExtra("RESULT_PHONE_ISVALID", true);
                            r rVar8 = editContactMethodActivity.f32520a;
                            if (rVar8 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            intent4.putExtra("EXTRA_LABEL", rVar8.f87184a);
                            editContactMethodActivity.setResult(-1, intent4);
                            editContactMethodActivity.finish();
                            return;
                        }
                        return;
                }
            }
        };
        final int i15 = 1;
        this.f32522c = new z0(this) { // from class: i20.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditContactMethodActivity f87176b;

            {
                this.f87176b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                boolean zD;
                List<l20.c> listR;
                List<l20.c> listZ;
                int i16 = i15;
                final int i17 = 1;
                final EditContactMethodActivity editContactMethodActivity = this.f87176b;
                final int i18 = 0;
                switch (i16) {
                    case 0:
                        l lVar = (l) obj;
                        EditContactMethodActivity.a aVar = EditContactMethodActivity.f32519d;
                        lVar.getClass();
                        if (lVar instanceof l.a) {
                            editContactMethodActivity.ca();
                            return;
                        }
                        if (lVar instanceof l.c) {
                            editContactMethodActivity.setTitle(editContactMethodActivity.getString(R.string.lbl_country_region));
                            androidx.fragment.app.v supportFragmentManager = editContactMethodActivity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                            com.garmin.android.apps.connectmobile.contacts.edit.d.f32562b.getClass();
                            aVar2.l(R.id.fragment_container, new com.garmin.android.apps.connectmobile.contacts.edit.d(), "SelectPhonePrefixFragment");
                            aVar2.d(null);
                            aVar2.e();
                            return;
                        }
                        if (lVar instanceof l.b) {
                            editContactMethodActivity.setTitle(editContactMethodActivity.getString(R.string.lbl_label));
                            androidx.fragment.app.v supportFragmentManager2 = editContactMethodActivity.getSupportFragmentManager();
                            supportFragmentManager2.getClass();
                            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager2);
                            com.garmin.android.apps.connectmobile.contacts.edit.c.f32554b.getClass();
                            aVar3.l(R.id.fragment_container, new com.garmin.android.apps.connectmobile.contacts.edit.c(), "SelectLabelFragment");
                            aVar3.d("SelectLabelFragment");
                            aVar3.e();
                            return;
                        }
                        if (!(lVar instanceof l.d)) {
                            u0.r();
                            return;
                        }
                        r rVar = editContactMethodActivity.f32520a;
                        if (rVar == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        if (!rVar.f87193j) {
                            String str = rVar.f87191h;
                            String strGa = editContactMethodActivity.ga();
                            if (p005kotlin.jvm.internal.s.g(str, strGa != null ? strGa : "")) {
                                r rVar2 = editContactMethodActivity.f32520a;
                                if (rVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("viewModel");
                                    throw null;
                                }
                                if (!p005kotlin.jvm.internal.s.g(rVar2.f87184a, editContactMethodActivity.ha())) {
                                    editContactMethodActivity.ea(str);
                                    return;
                                } else {
                                    editContactMethodActivity.setResult(0);
                                    editContactMethodActivity.finish();
                                    return;
                                }
                            }
                            l20.a aVarFa = editContactMethodActivity.fa();
                            if (aVarFa != null && (listR = aVarFa.r()) != null && !listR.isEmpty()) {
                                Iterator<T> it = listR.iterator();
                                while (it.hasNext()) {
                                    if (p005kotlin.jvm.internal.s.g(((l20.c) it.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), str)) {
                                        new androidx.appcompat.app.e.a(editContactMethodActivity).setMessage(editContactMethodActivity.getString(R.string.lbl_duplicate_email_message)).setTitle(R.string.lbl_duplicate_email_title).setCancelable(false).setPositiveButton(editContactMethodActivity.getString(android.R.string.ok), new m(editContactMethodActivity, 5)).create().show();
                                        editContactMethodActivity.setResult(0);
                                        return;
                                    }
                                }
                            }
                            com.garmin.android.apps.connectmobile.contacts.i.f32732a.getClass();
                            if (str != null) {
                                zD = com.garmin.android.apps.connectmobile.contacts.i.f32735d.d(str);
                            } else {
                                com.garmin.android.apps.connectmobile.contacts.i.f32733b.debug("Entered email id is null");
                                zD = false;
                            }
                            if (zD) {
                                editContactMethodActivity.ea(str);
                                return;
                            } else {
                                editContactMethodActivity.da();
                                editContactMethodActivity.setResult(0);
                                return;
                            }
                        }
                        c0 c0Var = rVar.f87190g;
                        String str2 = c0Var != null ? c0Var.f68362c : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        final String strG = tn.k.g(str2, rVar.f87191h);
                        String strGa2 = editContactMethodActivity.ga();
                        if (strG.equals(strGa2 != null ? strGa2 : "")) {
                            r rVar3 = editContactMethodActivity.f32520a;
                            if (rVar3 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            if (!p005kotlin.jvm.internal.s.g(rVar3.f87184a, editContactMethodActivity.ha())) {
                                editContactMethodActivity.ea(strG);
                                return;
                            } else {
                                editContactMethodActivity.setResult(0);
                                editContactMethodActivity.finish();
                                return;
                            }
                        }
                        l20.a aVarFa2 = editContactMethodActivity.fa();
                        if (aVarFa2 != null && (listZ = aVarFa2.z()) != null && !listZ.isEmpty()) {
                            Iterator<T> it3 = listZ.iterator();
                            while (it3.hasNext()) {
                                if (p005kotlin.jvm.internal.s.g(((l20.c) it3.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), strG)) {
                                    new androidx.appcompat.app.e.a(editContactMethodActivity).setMessage(editContactMethodActivity.getString(R.string.lbl_duplicate_phone_number_message)).setTitle(R.string.lbl_duplicate_phone_number_title).setCancelable(false).setPositiveButton(editContactMethodActivity.getString(android.R.string.ok), new m(editContactMethodActivity, 2)).create().show();
                                    editContactMethodActivity.setResult(0);
                                    return;
                                }
                            }
                        }
                        if (com.garmin.android.apps.connectmobile.contacts.b.e()) {
                            Intent intent = editContactMethodActivity.getIntent();
                            if (p005kotlin.jvm.internal.s.g(intent != null ? Boolean.valueOf(intent.getBooleanExtra("EXTRA_HAS_MESSENGER_ASSOCIATED", false)) : null, Boolean.TRUE)) {
                                editContactMethodActivity.ia(new e23.a() { // from class: i20.o
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i19 = i18;
                                        String str3 = strG;
                                        EditContactMethodActivity editContactMethodActivity2 = editContactMethodActivity;
                                        switch (i19) {
                                            case 0:
                                                EditContactMethodActivity.a aVar4 = EditContactMethodActivity.f32519d;
                                                l20.a aVarFa4 = editContactMethodActivity2.fa();
                                                if (aVarFa4 == null) {
                                                    return null;
                                                }
                                                r rVar5 = editContactMethodActivity2.f32520a;
                                                if (rVar5 != null) {
                                                    rVar5.x4(str3, aVarFa4);
                                                    return Unit.INSTANCE;
                                                }
                                                p005kotlin.jvm.internal.s.m("viewModel");
                                                throw null;
                                            default:
                                                EditContactMethodActivity.a aVar5 = EditContactMethodActivity.f32519d;
                                                l20.a aVarFa5 = editContactMethodActivity2.fa();
                                                if (aVarFa5 == null) {
                                                    return null;
                                                }
                                                r rVar6 = editContactMethodActivity2.f32520a;
                                                if (rVar6 != null) {
                                                    rVar6.x4(str3, aVarFa5);
                                                    return Unit.INSTANCE;
                                                }
                                                p005kotlin.jvm.internal.s.m("viewModel");
                                                throw null;
                                        }
                                    }
                                });
                                return;
                            }
                            l20.a aVarFa3 = editContactMethodActivity.fa();
                            if (aVarFa3 != null) {
                                r rVar4 = editContactMethodActivity.f32520a;
                                if (rVar4 != null) {
                                    rVar4.x4(strG, aVarFa3);
                                    return;
                                } else {
                                    p005kotlin.jvm.internal.s.m("viewModel");
                                    throw null;
                                }
                            }
                            return;
                        }
                        com.garmin.android.apps.connectmobile.contacts.i.f32732a.getClass();
                        if (!com.garmin.android.apps.connectmobile.contacts.i.a.a(strG)) {
                            new androidx.appcompat.app.e.a(editContactMethodActivity).setMessage(editContactMethodActivity.getString(R.string.phone_number_validation_message, "7", "15")).setCancelable(false).setPositiveButton(editContactMethodActivity.getString(android.R.string.ok), new m(editContactMethodActivity, 4)).create().show();
                            editContactMethodActivity.setResult(0);
                            return;
                        }
                        Intent intent2 = editContactMethodActivity.getIntent();
                        Boolean boolValueOf = intent2 != null ? Boolean.valueOf(intent2.getBooleanExtra("EXTRA_HAS_MESSENGER_ASSOCIATED", false)) : null;
                        Boolean bool = Boolean.TRUE;
                        if (p005kotlin.jvm.internal.s.g(boolValueOf, bool)) {
                            editContactMethodActivity.ia(new e23.a() { // from class: i20.o
                                @Override // e23.a
                                public final Object invoke() {
                                    int i19 = i17;
                                    String str3 = strG;
                                    EditContactMethodActivity editContactMethodActivity2 = editContactMethodActivity;
                                    switch (i19) {
                                        case 0:
                                            EditContactMethodActivity.a aVar4 = EditContactMethodActivity.f32519d;
                                            l20.a aVarFa4 = editContactMethodActivity2.fa();
                                            if (aVarFa4 == null) {
                                                return null;
                                            }
                                            r rVar5 = editContactMethodActivity2.f32520a;
                                            if (rVar5 != null) {
                                                rVar5.x4(str3, aVarFa4);
                                                return Unit.INSTANCE;
                                            }
                                            p005kotlin.jvm.internal.s.m("viewModel");
                                            throw null;
                                        default:
                                            EditContactMethodActivity.a aVar5 = EditContactMethodActivity.f32519d;
                                            l20.a aVarFa5 = editContactMethodActivity2.fa();
                                            if (aVarFa5 == null) {
                                                return null;
                                            }
                                            r rVar6 = editContactMethodActivity2.f32520a;
                                            if (rVar6 != null) {
                                                rVar6.x4(str3, aVarFa5);
                                                return Unit.INSTANCE;
                                            }
                                            p005kotlin.jvm.internal.s.m("viewModel");
                                            throw null;
                                    }
                                }
                            });
                        }
                        Intent intent3 = editContactMethodActivity.getIntent();
                        if (p005kotlin.jvm.internal.s.g(intent3 != null ? Boolean.valueOf(intent3.getBooleanExtra("EXTRA_IS_EMERGENCY_CALLING_NUMBER", false)) : null, bool)) {
                            new androidx.appcompat.app.e.a(editContactMethodActivity).setTitle(R.string.lbl_update_phone_number_question).setMessage(R.string.msg_update_emergency_calling_phone_number).setCancelable(false).setPositiveButton(R.string.lbl_update, new hg1.g(6, editContactMethodActivity, strG)).setNegativeButton(R.string.lbl_cancel, new m(editContactMethodActivity, 3)).create().show();
                            return;
                        } else {
                            editContactMethodActivity.ea(strG);
                            return;
                        }
                    default:
                        g3 g3Var = (g3) obj;
                        EditContactMethodActivity.a aVar4 = EditContactMethodActivity.f32519d;
                        g3Var.getClass();
                        int i19 = EditContactMethodActivity.b.f32523a[g3Var.f35300a.ordinal()];
                        if (i19 == 1) {
                            editContactMethodActivity.showProgressOverlay();
                            return;
                        }
                        if (i19 != 2) {
                            if (i19 == 3) {
                                editContactMethodActivity.hideProgressOverlay();
                                return;
                            } else {
                                u0.r();
                                return;
                            }
                        }
                        editContactMethodActivity.hideProgressOverlay();
                        o13.p pVar = (o13.p) g3Var.f35301b;
                        if (pVar != null) {
                            p0 p0Var = (p0) pVar.f128594a;
                            Boolean valid = p0Var.getValid();
                            Boolean bool2 = Boolean.TRUE;
                            if (!p005kotlin.jvm.internal.s.g(valid, bool2) || !p005kotlin.jvm.internal.s.g(p0Var.getCanReceiveText(), bool2)) {
                                r rVar5 = editContactMethodActivity.f32520a;
                                if (rVar5 == null) {
                                    p005kotlin.jvm.internal.s.m("viewModel");
                                    throw null;
                                }
                                if (rVar5.f87192i) {
                                    editContactMethodActivity.da();
                                    return;
                                } else {
                                    rVar5.f87192i = true;
                                    editContactMethodActivity.ca();
                                    return;
                                }
                            }
                            r rVar6 = editContactMethodActivity.f32520a;
                            if (rVar6 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            rVar6.f87192i = false;
                            String phoneNumber = p0Var.getPhoneNumber();
                            if (phoneNumber == null) {
                                phoneNumber = "";
                            }
                            String phoneUuid = p0Var.getPhoneUuid();
                            String str3 = phoneUuid != null ? phoneUuid : "";
                            Intent intent4 = new Intent();
                            String strGa3 = editContactMethodActivity.ga();
                            if (strGa3 != null) {
                                intent4.putExtra("EXTRA_PHONE_NUMBER_OR_EMAIL", strGa3);
                            }
                            r rVar7 = editContactMethodActivity.f32520a;
                            if (rVar7 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            if (!d53.w.J(rVar7.f87191h)) {
                                intent4.putExtra("EXTRA_RESULT", phoneNumber);
                            }
                            intent4.putExtra("RESULT_PHONE_UUID", str3);
                            intent4.putExtra("RESULT_PHONE_ISVALID", true);
                            r rVar8 = editContactMethodActivity.f32520a;
                            if (rVar8 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            intent4.putExtra("EXTRA_LABEL", rVar8.f87184a);
                            editContactMethodActivity.setResult(-1, intent4);
                            editContactMethodActivity.finish();
                            return;
                        }
                        return;
                }
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final void ca() {
        r rVar;
        String string;
        if (fa() != null) {
            Intent intent = getIntent();
            if (intent != null ? intent.getBooleanExtra("EXTRA_SHOW_CONTACT_NAME", false) : false) {
                l20.a aVarFa = fa();
                aVarFa.getClass();
                string = aVarFa.j();
            } else {
                rVar = this.f32520a;
                if (rVar != null) {
                    s.m("viewModel");
                    throw null;
                }
                if (rVar.f87193j) {
                    string = getString(R.string.lbl_phone_number);
                } else {
                    string = getString(R.string.lbl_email);
                }
            }
        } else {
            rVar = this.f32520a;
            if (rVar != null) {
                s.m("viewModel");
                throw null;
            }
            if (rVar.f87193j) {
                string = getString(R.string.lbl_phone_number);
            } else {
                string = getString(R.string.lbl_email);
            }
        }
        setTitle(string);
        if (getSupportFragmentManager().G("SelectPhonePrefixFragment") != null || getSupportFragmentManager().G("SelectLabelFragment") != null) {
            getSupportFragmentManager().Z();
            return;
        }
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        com.garmin.android.apps.connectmobile.contacts.edit.b.f32541c.getClass();
        aVarB.l(R.id.fragment_container, new com.garmin.android.apps.connectmobile.contacts.edit.b(), null);
        aVarB.e();
    }

    public final void da() {
        e eVarCreate = new e.a(this).setMessage(R.string.discard_unsaved_changes).setPositiveButton(R.string.lbl_common_continue, new m(this, 0)).setNegativeButton(R.string.lbl_cancel, new i(21)).setCancelable(false).create();
        eVarCreate.getClass();
        eVarCreate.show();
        f.e(eVarCreate, 1.3f);
    }

    public final void ea(String str) {
        Intent intent = new Intent();
        String strGa = ga();
        if (strGa != null) {
            intent.putExtra("EXTRA_PHONE_NUMBER_OR_EMAIL", strGa);
        }
        r rVar = this.f32520a;
        if (rVar == null) {
            s.m("viewModel");
            throw null;
        }
        if (!w.J(rVar.f87191h)) {
            intent.putExtra("EXTRA_RESULT", str);
        }
        r rVar2 = this.f32520a;
        if (rVar2 == null) {
            s.m("viewModel");
            throw null;
        }
        intent.putExtra("EXTRA_LABEL", rVar2.f87184a);
        setResult(-1, intent);
        finish();
    }

    public final l20.a fa() {
        Parcelable parcelable;
        Intent intent = getIntent();
        if (intent == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("extra_contact_key", l20.a.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_contact_key");
            parcelable = (l20.a) (parcelableExtra instanceof l20.a ? parcelableExtra : null);
        }
        return (l20.a) parcelable;
    }

    public final String ga() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getStringExtra("EXTRA_PHONE_NUMBER_OR_EMAIL");
        }
        return null;
    }

    public final l20.d ha() {
        Serializable serializableExtra;
        Intent intent = getIntent();
        l20.d dVar = null;
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializableExtra = intent.getSerializableExtra("EXTRA_LABEL", l20.d.class);
            } else {
                Serializable serializableExtra2 = intent.getSerializableExtra("EXTRA_LABEL");
                serializableExtra = (l20.d) (serializableExtra2 instanceof l20.d ? serializableExtra2 : null);
            }
            dVar = (l20.d) serializableExtra;
        }
        dVar.getClass();
        return dVar;
    }

    public final void ia(e23.a<Unit> aVar) {
        Intent intent = getIntent();
        if (s.g(intent != null ? Boolean.valueOf(intent.getBooleanExtra("EXTRA_HAS_MESSENGER_ASSOCIATED", false)) : null, Boolean.TRUE)) {
            new e.a(this).setTitle(R.string.lbl_change_phone_number_question).setMessage(R.string.lbl_change_phone_number_message).setCancelable(false).setPositiveButton(R.string.lbl_save, new c32.a(aVar, 4)).setNegativeButton(R.string.lbl_cancel, new m(this, 1)).create().show();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_edit_contact_method);
        initActionBar(true);
        r rVar = (r) new x1(this, new i20.s(new e0(this), ga(), ha())).b(s0.f105811a.b(r.class));
        this.f32520a = rVar;
        rVar.f87185b.f(this, this.f32521b);
        if (com.garmin.android.apps.connectmobile.contacts.b.e()) {
            r rVar2 = this.f32520a;
            if (rVar2 == null) {
                s.m("viewModel");
                throw null;
            }
            if (rVar2.f87193j) {
                rVar2.f87186c.f(this, this.f32522c);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        getOnBackPressedDispatcher().d();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/edit/EditContactMethodActivity$a;", "", "<init>", "()V", "", "EXTRA_PHONE_NUMBER_OR_EMAIL", "Ljava/lang/String;", "EXTRA_RESULT", "EXTRA_IS_EMERGENCY_CALLING_NUMBER", "EXTRA_HAS_MESSENGER_ASSOCIATED", "EXTRA_LABEL", "EXTRA_SHOW_CONTACT_NAME", "RESULT_PHONE_UUID", "RESULT_PHONE_ISVALID", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(com.garmin.android.apps.connectmobile.c cVar, l20.a aVar, String str, Boolean bool, l20.d dVar, Boolean bool2, boolean z14) {
            aVar.getClass();
            dVar.getClass();
            Intent intent = new Intent(cVar, (Class<?>) EditContactMethodActivity.class);
            intent.putExtra("EXTRA_PHONE_NUMBER_OR_EMAIL", str);
            intent.putExtra("EXTRA_IS_EMERGENCY_CALLING_NUMBER", bool);
            intent.putExtra("EXTRA_HAS_MESSENGER_ASSOCIATED", bool2);
            intent.putExtra("EXTRA_LABEL", dVar);
            intent.putExtra("extra_contact_key", aVar);
            intent.putExtra("EXTRA_SHOW_CONTACT_NAME", z14);
            return intent;
        }

        public static /* synthetic */ Intent b(a aVar, com.garmin.android.apps.connectmobile.c cVar, l20.a aVar2, String str, Boolean bool, l20.d dVar, Boolean bool2, int i14) {
            if ((i14 & 32) != 0) {
                bool2 = Boolean.FALSE;
            }
            Boolean bool3 = bool2;
            boolean z14 = (i14 & 64) == 0;
            aVar.getClass();
            return a(cVar, aVar2, str, bool, dVar, bool3, z14);
        }

        private a() {
        }
    }
}

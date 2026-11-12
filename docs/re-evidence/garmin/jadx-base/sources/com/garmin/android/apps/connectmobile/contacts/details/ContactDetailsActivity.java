package com.garmin.android.apps.connectmobile.contacts.details;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.contacts.details.ContactDetailsActivity;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.q1;
import d53.w;
import e23.l;
import ew1.h1;
import f20.e0;
import f20.z;
import fw.p;
import g2.m1;
import g20.i;
import java.util.ArrayList;
import o13.e;
import o13.h;
import o13.m;
import o13.t;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import r22.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/details/ContactDetailsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContactDetailsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f32429g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f32430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f32432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.c<Intent> f32434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<Intent> f32435f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32436a;

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
            f32436a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f32437a;

        public c(l lVar) {
            lVar.getClass();
            this.f32437a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f32437a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32437a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f32438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f32439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f32440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f32441d;

        public d(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f32438a = gVar;
            this.f32439b = qualifier;
            this.f32440c = aVar;
            this.f32441d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, g20.i] */
        @Override // e23.a
        public final i invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f32438a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f32440c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(i.class), viewModelStore, null, defaultViewModelCreationExtras, this.f32439b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f32441d, 4, null);
        }
    }

    public ContactDetailsActivity() {
        final int i14 = 0;
        this.f32430a = m.b(new e23.a(this) { // from class: g20.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactDetailsActivity f75323b;

            {
                this.f75323b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i15 = i14;
                ContactDetailsActivity contactDetailsActivity = this.f75323b;
                switch (i15) {
                    case 0:
                        ContactDetailsActivity.a aVar = ContactDetailsActivity.f32429g;
                        Bundle extras = contactDetailsActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                if (!(parcelable2 instanceof hl.a)) {
                                    parcelable2 = null;
                                }
                                parcelable = (hl.a) parcelable2;
                            }
                            hl.a aVar2 = (hl.a) parcelable;
                            if (aVar2 != null) {
                                return aVar2;
                            }
                        }
                        return hl.a.c.f84256b;
                    case 1:
                        ContactDetailsActivity.a aVar3 = ContactDetailsActivity.f32429g;
                        return ParametersHolderKt.parametersOf((hl.a) contactDetailsActivity.f32430a.getValue());
                    default:
                        ContactDetailsActivity.a aVar4 = ContactDetailsActivity.f32429g;
                        return new e0(contactDetailsActivity);
                }
            }
        });
        final int i15 = 1;
        this.f32431b = m.a(o13.n.NONE, new d(this, null, null, new e23.a(this) { // from class: g20.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactDetailsActivity f75323b;

            {
                this.f75323b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i16 = i15;
                ContactDetailsActivity contactDetailsActivity = this.f75323b;
                switch (i16) {
                    case 0:
                        ContactDetailsActivity.a aVar = ContactDetailsActivity.f32429g;
                        Bundle extras = contactDetailsActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                if (!(parcelable2 instanceof hl.a)) {
                                    parcelable2 = null;
                                }
                                parcelable = (hl.a) parcelable2;
                            }
                            hl.a aVar2 = (hl.a) parcelable;
                            if (aVar2 != null) {
                                return aVar2;
                            }
                        }
                        return hl.a.c.f84256b;
                    case 1:
                        ContactDetailsActivity.a aVar3 = ContactDetailsActivity.f32429g;
                        return ParametersHolderKt.parametersOf((hl.a) contactDetailsActivity.f32430a.getValue());
                    default:
                        ContactDetailsActivity.a aVar4 = ContactDetailsActivity.f32429g;
                        return new e0(contactDetailsActivity);
                }
            }
        }));
        final int i16 = 2;
        this.f32432c = m.b(new e23.a(this) { // from class: g20.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactDetailsActivity f75323b;

            {
                this.f75323b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i17 = i16;
                ContactDetailsActivity contactDetailsActivity = this.f75323b;
                switch (i17) {
                    case 0:
                        ContactDetailsActivity.a aVar = ContactDetailsActivity.f32429g;
                        Bundle extras = contactDetailsActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                if (!(parcelable2 instanceof hl.a)) {
                                    parcelable2 = null;
                                }
                                parcelable = (hl.a) parcelable2;
                            }
                            hl.a aVar2 = (hl.a) parcelable;
                            if (aVar2 != null) {
                                return aVar2;
                            }
                        }
                        return hl.a.c.f84256b;
                    case 1:
                        ContactDetailsActivity.a aVar3 = ContactDetailsActivity.f32429g;
                        return ParametersHolderKt.parametersOf((hl.a) contactDetailsActivity.f32430a.getValue());
                    default:
                        ContactDetailsActivity.a aVar4 = ContactDetailsActivity.f32429g;
                        return new e0(contactDetailsActivity);
                }
            }
        });
        final int i17 = 0;
        this.f32434e = registerForActivityResult(new g.h(), new f.b(this) { // from class: g20.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactDetailsActivity f75325b;

            {
                this.f75325b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                l20.a aVar;
                Parcelable parcelable;
                f20.p pVar;
                Parcelable parcelable2;
                int i18 = i17;
                ContactDetailsActivity contactDetailsActivity = this.f75325b;
                f.a aVar2 = (f.a) obj;
                switch (i18) {
                    case 0:
                        ContactDetailsActivity.a aVar3 = ContactDetailsActivity.f32429g;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            contactDetailsActivity.setResult(-1);
                            Intent intent = aVar2.f67586b;
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent.getParcelableExtra("extra_contact_key", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("extra_contact_key");
                                    if (!(parcelableExtra instanceof l20.a)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (l20.a) parcelableExtra;
                                }
                                aVar = (l20.a) parcelable;
                            } else {
                                aVar = null;
                            }
                            if (aVar == null) {
                                contactDetailsActivity.finish();
                            } else {
                                contactDetailsActivity.ca().B4(aVar);
                            }
                            l20.a aVar4 = contactDetailsActivity.ca().f75340d;
                            if (aVar4 == null) {
                                s.m("initialContactDTO");
                                throw null;
                            }
                            if (ge1.b.Q(aVar4)) {
                                if (aVar == null || !ge1.b.Q(aVar)) {
                                    q0.b bVar = q0.f149800b;
                                    View viewFindViewById = contactDetailsActivity.findViewById(R.id.recycler_view);
                                    viewFindViewById.getClass();
                                    bVar.getClass();
                                    q0.b.a(viewFindViewById, R.string.assistance_contact_removed_toast_message, 0).show();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        ContactDetailsActivity.a aVar5 = ContactDetailsActivity.f32429g;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            Intent intent2 = aVar2.f67586b;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable2 = (Parcelable) intent2.getParcelableExtra("extra_key_selected_item", f20.p.class);
                                } else {
                                    Parcelable parcelableExtra2 = intent2.getParcelableExtra("extra_key_selected_item");
                                    if (!(parcelableExtra2 instanceof f20.p)) {
                                        parcelableExtra2 = null;
                                    }
                                    parcelable2 = (f20.p) parcelableExtra2;
                                }
                                pVar = (f20.p) parcelable2;
                            } else {
                                pVar = null;
                            }
                            if (pVar != null) {
                                ((z) KoinJavaComponent.get$default(z.class, null, null, 6, null)).e(contactDetailsActivity, pVar.f68420a, pVar.f68421b, pVar.f68422c);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        final int i18 = 1;
        this.f32435f = registerForActivityResult(new g.h(), new f.b(this) { // from class: g20.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactDetailsActivity f75325b;

            {
                this.f75325b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                l20.a aVar;
                Parcelable parcelable;
                f20.p pVar;
                Parcelable parcelable2;
                int i19 = i18;
                ContactDetailsActivity contactDetailsActivity = this.f75325b;
                f.a aVar2 = (f.a) obj;
                switch (i19) {
                    case 0:
                        ContactDetailsActivity.a aVar3 = ContactDetailsActivity.f32429g;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            contactDetailsActivity.setResult(-1);
                            Intent intent = aVar2.f67586b;
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent.getParcelableExtra("extra_contact_key", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("extra_contact_key");
                                    if (!(parcelableExtra instanceof l20.a)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (l20.a) parcelableExtra;
                                }
                                aVar = (l20.a) parcelable;
                            } else {
                                aVar = null;
                            }
                            if (aVar == null) {
                                contactDetailsActivity.finish();
                            } else {
                                contactDetailsActivity.ca().B4(aVar);
                            }
                            l20.a aVar4 = contactDetailsActivity.ca().f75340d;
                            if (aVar4 == null) {
                                s.m("initialContactDTO");
                                throw null;
                            }
                            if (ge1.b.Q(aVar4)) {
                                if (aVar == null || !ge1.b.Q(aVar)) {
                                    q0.b bVar = q0.f149800b;
                                    View viewFindViewById = contactDetailsActivity.findViewById(R.id.recycler_view);
                                    viewFindViewById.getClass();
                                    bVar.getClass();
                                    q0.b.a(viewFindViewById, R.string.assistance_contact_removed_toast_message, 0).show();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        ContactDetailsActivity.a aVar5 = ContactDetailsActivity.f32429g;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            Intent intent2 = aVar2.f67586b;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable2 = (Parcelable) intent2.getParcelableExtra("extra_key_selected_item", f20.p.class);
                                } else {
                                    Parcelable parcelableExtra2 = intent2.getParcelableExtra("extra_key_selected_item");
                                    if (!(parcelableExtra2 instanceof f20.p)) {
                                        parcelableExtra2 = null;
                                    }
                                    parcelable2 = (f20.p) parcelableExtra2;
                                }
                                pVar = (f20.p) parcelable2;
                            } else {
                                pVar = null;
                            }
                            if (pVar != null) {
                                ((z) KoinJavaComponent.get$default(z.class, null, null, 6, null)).e(contactDetailsActivity, pVar.f68420a, pVar.f68421b, pVar.f68422c);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final i ca() {
        return (i) this.f32431b.getValue();
    }

    public final void da(com.garmin.android.apps.connectmobile.contacts.details.b bVar, String str) {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.content_frame, bVar, str);
        aVar.d(str);
        aVar.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    @e
    public final void onBackPressed() {
        g20.n nVar = (g20.n) ca().f75347k.d();
        l20.a aVar = nVar != null ? nVar.f75368i : null;
        i iVarCa = ca();
        int i14 = iVarCa.f75342f;
        if (i14 == 1 || i14 == 2) {
            l20.a aVar2 = iVarCa.f75340d;
            if (aVar2 == null) {
                s.m("initialContactDTO");
                throw null;
            }
            l20.a aVar3 = iVarCa.f75341e;
            if (aVar3 == null) {
                s.m("contactDTO");
                throw null;
            }
            if (!aVar2.equals(aVar3)) {
                new androidx.appcompat.app.e.a(this).setMessage(getString(R.string.message_common_confirm_leaving_screen)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.lbl_yes, new h1(this, 5)).show();
                return;
            }
        }
        if (aVar != null) {
            setResult(-1, new Intent().putExtra("RESULT_CONTACT_DTO", aVar));
        }
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_recycler_view_with_banner);
        Intent intent = getIntent();
        Parcelable parcelable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra_contact_key") : null;
            parcelable = (l20.a) (parcelableExtra instanceof l20.a ? parcelableExtra : null);
        } else if (intent != null) {
            parcelable = (Parcelable) intent.getParcelableExtra("extra_contact_key", l20.a.class);
        }
        l20.a aVar = (l20.a) parcelable;
        if (getIntent() == null || aVar == null) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "ContactDetailsActivity", "No contact DTO received! Could not display activity!");
            finish();
            return;
        }
        int intExtra = getIntent().getIntExtra("extra_view_mode_key", 0);
        int intExtra2 = getIntent().getIntExtra("extra_max_nr_emails_or_numbers_to_select", 0);
        this.f32433d = getIntent().getIntExtra("extra_max_contact_limit", 0);
        final int i14 = 0;
        ca().f75347k.f(this, new c(new l(this) { // from class: g20.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactDetailsActivity f75327b;

            {
                this.f75327b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                l20.a aVar3;
                ArrayList arrayListM;
                String str;
                int i15 = i14;
                ContactDetailsActivity contactDetailsActivity = this.f75327b;
                switch (i15) {
                    case 0:
                        t tVar = contactDetailsActivity.f32430a;
                        n nVar = (n) obj;
                        ContactDetailsActivity.a aVar4 = ContactDetailsActivity.f32429g;
                        boolean z14 = nVar.f75361b;
                        l20.a aVar5 = nVar.f75368i;
                        if (z14) {
                            u20.e.u6(R.string.live_track_title_max_emails_reached, R.string.live_track_max_emails_reached).g(contactDetailsActivity.getSupportFragmentManager());
                        } else if (nVar.f75362c) {
                            u20.e.v6(contactDetailsActivity.getString(R.string.live_event_sharing_recipient_limit), contactDetailsActivity.getString(R.string.live_event_sharing_recipient_limit_desc, Integer.valueOf(contactDetailsActivity.f32433d))).g(contactDetailsActivity.getSupportFragmentManager());
                        } else if (nVar.f75365f) {
                            String str2 = nVar.f75366g;
                            f.c<Intent> cVar = contactDetailsActivity.f32434e;
                            if (str2 != null) {
                                EditContactActivity.a aVar6 = EditContactActivity.f32500n;
                                hl.a aVar7 = (hl.a) tVar.getValue();
                                aVar6.getClass();
                                aVar5.getClass();
                                aVar7.getClass();
                                Intent intentA = EditContactActivity.a.a(aVar6, contactDetailsActivity, aVar5, null, 4);
                                intentA.putExtra("EXTRA_CONTACT_METHOD_EDIT_IMMEDIATELY", str2);
                                intentA.putExtra("GCM_extra_screen_access_role", aVar7);
                                cVar.a(intentA, null);
                            } else {
                                EditContactActivity.a aVar8 = EditContactActivity.f32500n;
                                hl.a aVar9 = (hl.a) tVar.getValue();
                                aVar8.getClass();
                                aVar5.getClass();
                                aVar9.getClass();
                                Intent intent2 = new Intent(contactDetailsActivity, (Class<?>) EditContactActivity.class);
                                intent2.putExtra("extra_contact_key", aVar5);
                                intent2.putExtra("GCM_extra_screen_access_role", aVar9);
                                cVar.a(intent2, null);
                            }
                        } else if (nVar.f75367h) {
                            n nVar2 = (n) contactDetailsActivity.ca().f75347k.d();
                            l20.g gVar = (nVar2 == null || (aVar3 = nVar2.f75368i) == null || (arrayListM = aVar3.M()) == null) ? null : (l20.g) h0.K0(arrayListM);
                            if (gVar != null) {
                                f20.p pVarN = com.garmin.android.apps.connectmobile.contacts.b.n(gVar);
                                ((z) KoinJavaComponent.get$default(z.class, null, null, 6, null)).e(contactDetailsActivity, pVarN.f68420a, pVarN.f68421b, pVarN.f68422c);
                            } else {
                                q1.b bVar = q1.f41066b;
                                String string = contactDetailsActivity.getString(R.string.contact_management_title_multiple_profiles);
                                string.getClass();
                                String string2 = contactDetailsActivity.getString(R.string.contact_management_message_multiple_profiles);
                                string2.getClass();
                                en0.n nVar3 = new en0.n(contactDetailsActivity, 21);
                                bVar.getClass();
                                q1 q1VarC = q1.b.c(string, string2, R.string.lbl_yes, R.string.lbl_cancel, nVar3);
                                v supportFragmentManager = contactDetailsActivity.getSupportFragmentManager();
                                supportFragmentManager.getClass();
                                q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
                            }
                        } else if (nVar.f75364e) {
                            if (aVar5 != null) {
                                contactDetailsActivity.setResult(-1, new Intent().putExtra("RESULT_CONTACT_DTO", aVar5));
                            }
                            contactDetailsActivity.finish();
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        ContactDetailsActivity.a aVar10 = ContactDetailsActivity.f32429g;
                        int i16 = ContactDetailsActivity.b.f32436a[g3Var.f35300a.ordinal()];
                        if (i16 == 1) {
                            contactDetailsActivity.showProgressOverlay();
                        } else if (i16 != 2) {
                            contactDetailsActivity.hideProgressOverlay();
                            Integer num = g3Var.f35304e;
                            if (num != null && num.intValue() == 403 && (str = g3Var.f35302c) != null && w.z(str, "ManagedChildAccountForbiddenException", false)) {
                                g.a(contactDetailsActivity);
                            } else {
                                ei0.q0.b(contactDetailsActivity);
                            }
                        } else {
                            contactDetailsActivity.hideProgressOverlay();
                            contactDetailsActivity.setResult(-1);
                            contactDetailsActivity.finish();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i15 = 1;
        ca().f75349m.f(this, new c(new l(this) { // from class: g20.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactDetailsActivity f75327b;

            {
                this.f75327b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                l20.a aVar3;
                ArrayList arrayListM;
                String str;
                int i16 = i15;
                ContactDetailsActivity contactDetailsActivity = this.f75327b;
                switch (i16) {
                    case 0:
                        t tVar = contactDetailsActivity.f32430a;
                        n nVar = (n) obj;
                        ContactDetailsActivity.a aVar4 = ContactDetailsActivity.f32429g;
                        boolean z14 = nVar.f75361b;
                        l20.a aVar5 = nVar.f75368i;
                        if (z14) {
                            u20.e.u6(R.string.live_track_title_max_emails_reached, R.string.live_track_max_emails_reached).g(contactDetailsActivity.getSupportFragmentManager());
                        } else if (nVar.f75362c) {
                            u20.e.v6(contactDetailsActivity.getString(R.string.live_event_sharing_recipient_limit), contactDetailsActivity.getString(R.string.live_event_sharing_recipient_limit_desc, Integer.valueOf(contactDetailsActivity.f32433d))).g(contactDetailsActivity.getSupportFragmentManager());
                        } else if (nVar.f75365f) {
                            String str2 = nVar.f75366g;
                            f.c<Intent> cVar = contactDetailsActivity.f32434e;
                            if (str2 != null) {
                                EditContactActivity.a aVar6 = EditContactActivity.f32500n;
                                hl.a aVar7 = (hl.a) tVar.getValue();
                                aVar6.getClass();
                                aVar5.getClass();
                                aVar7.getClass();
                                Intent intentA = EditContactActivity.a.a(aVar6, contactDetailsActivity, aVar5, null, 4);
                                intentA.putExtra("EXTRA_CONTACT_METHOD_EDIT_IMMEDIATELY", str2);
                                intentA.putExtra("GCM_extra_screen_access_role", aVar7);
                                cVar.a(intentA, null);
                            } else {
                                EditContactActivity.a aVar8 = EditContactActivity.f32500n;
                                hl.a aVar9 = (hl.a) tVar.getValue();
                                aVar8.getClass();
                                aVar5.getClass();
                                aVar9.getClass();
                                Intent intent2 = new Intent(contactDetailsActivity, (Class<?>) EditContactActivity.class);
                                intent2.putExtra("extra_contact_key", aVar5);
                                intent2.putExtra("GCM_extra_screen_access_role", aVar9);
                                cVar.a(intent2, null);
                            }
                        } else if (nVar.f75367h) {
                            n nVar2 = (n) contactDetailsActivity.ca().f75347k.d();
                            l20.g gVar = (nVar2 == null || (aVar3 = nVar2.f75368i) == null || (arrayListM = aVar3.M()) == null) ? null : (l20.g) h0.K0(arrayListM);
                            if (gVar != null) {
                                f20.p pVarN = com.garmin.android.apps.connectmobile.contacts.b.n(gVar);
                                ((z) KoinJavaComponent.get$default(z.class, null, null, 6, null)).e(contactDetailsActivity, pVarN.f68420a, pVarN.f68421b, pVarN.f68422c);
                            } else {
                                q1.b bVar = q1.f41066b;
                                String string = contactDetailsActivity.getString(R.string.contact_management_title_multiple_profiles);
                                string.getClass();
                                String string2 = contactDetailsActivity.getString(R.string.contact_management_message_multiple_profiles);
                                string2.getClass();
                                en0.n nVar3 = new en0.n(contactDetailsActivity, 21);
                                bVar.getClass();
                                q1 q1VarC = q1.b.c(string, string2, R.string.lbl_yes, R.string.lbl_cancel, nVar3);
                                v supportFragmentManager = contactDetailsActivity.getSupportFragmentManager();
                                supportFragmentManager.getClass();
                                q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
                            }
                        } else if (nVar.f75364e) {
                            if (aVar5 != null) {
                                contactDetailsActivity.setResult(-1, new Intent().putExtra("RESULT_CONTACT_DTO", aVar5));
                            }
                            contactDetailsActivity.finish();
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        ContactDetailsActivity.a aVar10 = ContactDetailsActivity.f32429g;
                        int i17 = ContactDetailsActivity.b.f32436a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            contactDetailsActivity.showProgressOverlay();
                        } else if (i17 != 2) {
                            contactDetailsActivity.hideProgressOverlay();
                            Integer num = g3Var.f35304e;
                            if (num != null && num.intValue() == 403 && (str = g3Var.f35302c) != null && w.z(str, "ManagedChildAccountForbiddenException", false)) {
                                g.a(contactDetailsActivity);
                            } else {
                                ei0.q0.b(contactDetailsActivity);
                            }
                        } else {
                            contactDetailsActivity.hideProgressOverlay();
                            contactDetailsActivity.setResult(-1);
                            contactDetailsActivity.finish();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        ca().f75351o.f(this, new c(new m1(1, this, aVar)));
        i iVarCa = ca();
        e0 e0Var = (e0) this.f32432c.getValue();
        iVarCa.getClass();
        e0Var.getClass();
        y0<String> y0Var = iVarCa.f75350n;
        if (intExtra == 1 || intExtra == 2) {
            y0Var.m("LiveTrackLiveEventShareContactDetailsFragment");
        } else if (intExtra != 3) {
            y0Var.m("ContactDetailsFragment");
        } else {
            y0Var.m("EmergencyContactDetailsFragment");
        }
        iVarCa.f75340d = aVar;
        iVarCa.f75341e = aVar;
        iVarCa.f75342f = intExtra;
        iVarCa.f75343g = intExtra2;
        iVarCa.f75344h = e0Var;
        iVarCa.f75346j.m(new g20.n(iVarCa.y4(aVar), false, false, false, false, false, null, false, aVar, 254, null));
        String string = getString(R.string.contact_management_title_contacts);
        string.getClass();
        initActionBar(true, string);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/details/ContactDetailsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_CONTACT_KEY", "EXTRA_VIEW_MODE_KEY", "EXTRA_MAX_CONTACT_LIMIT", "EXTRA_MAX_NR_EMAILS_OR_NUMBERS_TO_SELECT", "", "DISPLAY_MODE_FULL_DETAILS", "I", "DISPLAY_MODE_SELECT_EMAIL_FOR_LIVE_TRACK", "DISPLAY_MODE_SELECT_PHONE_NUMBER_FOR_LIVE_EVENT_SHARING", "DISPLAY_MODE_EMERGENCY_CONTACT_DETAILS", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, l20.a aVar, int i14, int i15, int i16, hl.a aVar2) {
            context.getClass();
            aVar.getClass();
            aVar2.getClass();
            Intent intent = new Intent(context, (Class<?>) ContactDetailsActivity.class);
            intent.putExtra("extra_contact_key", aVar);
            intent.putExtra("extra_view_mode_key", i14);
            intent.putExtra("extra_max_contact_limit", i15);
            intent.putExtra("extra_max_nr_emails_or_numbers_to_select", i16);
            intent.putExtra("GCM_extra_screen_access_role", aVar2);
            return intent;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, l20.a aVar2, hl.a aVar3, int i14) {
            int i15 = (i14 & 4) != 0 ? 0 : 3;
            if ((i14 & 32) != 0) {
                aVar3 = hl.a.c.f84256b;
            }
            aVar.getClass();
            return a(context, aVar2, i15, 0, 0, aVar3);
        }

        private a() {
        }
    }
}

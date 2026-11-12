package com.garmin.android.apps.connectmobile.contacts;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import com.garmin.android.apps.connectmobile.contacts.details.ContactDetailsActivity;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactActivity;
import com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactSendRequestActivity;
import com.google.android.material.snackbar.Snackbar;
import e23.l;
import f20.e0;
import f20.j;
import f20.k;
import f20.o;
import f20.v;
import fw.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l20.r;
import o13.m;
import o13.t;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import p3.a2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/ContactActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/contacts/h$a;", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContactActivity extends com.garmin.android.apps.connectmobile.c implements h.a {
    public static final a T = new a(null);
    public final com.garmin.android.apps.connectmobile.userprofile.model.g A;
    public final a2 B;
    public final f.c<Intent> C;
    public final f.c<Intent> D;
    public final f.c<Intent> E;
    public final f.c<Intent> F;
    public final f.c<Intent> I;
    public final a4.b P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f32287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32288b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0 f32290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r f32293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f32294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f32296j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f32297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f32298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f32299m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RecyclerView f32300n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f32301o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ComposeView f32302p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f32303q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f32304r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AppCompatButton f32305t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AppCompatButton f32306v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f32307w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FrameLayout f32308x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f32309y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32289c = 50;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f32310z = s3.b();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32311a;

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
            f32311a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f32312a;

        public c(l lVar) {
            lVar.getClass();
            this.f32312a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f32312a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32312a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<com.garmin.android.apps.connectmobile.contacts.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f32313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f32314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f32315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f32316d;

        public d(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f32313a = gVar;
            this.f32314b = qualifier;
            this.f32315c = aVar;
            this.f32316d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.contacts.d] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.contacts.d invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f32313a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f32315c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.apps.connectmobile.contacts.d.class), viewModelStore, null, defaultViewModelCreationExtras, this.f32314b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f32316d, 4, null);
        }
    }

    public ContactActivity() {
        final int i14 = 0;
        this.f32287a = m.b(new e23.a(this) { // from class: f20.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactActivity f68403b;

            {
                this.f68403b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i15 = i14;
                ContactActivity contactActivity = this.f68403b;
                switch (i15) {
                    case 0:
                        ContactActivity.a aVar = ContactActivity.T;
                        Bundle extras = contactActivity.getIntent().getExtras();
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
                    default:
                        ContactActivity.a aVar3 = ContactActivity.T;
                        return ParametersHolderKt.parametersOf(contactActivity.ia());
                }
            }
        });
        final int i15 = 1;
        this.f32296j = m.a(o13.n.NONE, new d(this, null, null, new e23.a(this) { // from class: f20.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactActivity f68403b;

            {
                this.f68403b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i16 = i15;
                ContactActivity contactActivity = this.f68403b;
                switch (i16) {
                    case 0:
                        ContactActivity.a aVar = ContactActivity.T;
                        Bundle extras = contactActivity.getIntent().getExtras();
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
                    default:
                        ContactActivity.a aVar3 = ContactActivity.T;
                        return ParametersHolderKt.parametersOf(contactActivity.ia());
                }
            }
        }));
        f12.l.f68084a.getClass();
        this.A = f12.l.a.a().W0();
        this.B = new a2(0);
        final int i16 = 4;
        this.C = registerForActivityResult(new g.h(), new f.b(this) { // from class: f20.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactActivity f68351b;

            {
                this.f68351b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // f.b
            public final void a(Object obj) {
                Parcelable parcelable;
                boolean z14;
                l20.a aVar;
                Parcelable parcelable2;
                Parcelable parcelable3;
                int i17 = i16;
                boolean z15 = false;
                l20.a aVar2 = null;
                ContactActivity contactActivity = this.f68351b;
                f.a aVar3 = (f.a) obj;
                switch (i17) {
                    case 0:
                        ContactActivity.a aVar4 = ContactActivity.T;
                        aVar3.getClass();
                        Intent intent = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            boolean z16 = intent != null && intent.getBooleanExtra("HAS_MADE_SMS_OPT_IN_REQUEST", false);
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent.getParcelableExtra("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("RESULT_CONTACT_DTO");
                                    parcelable = (l20.a) (parcelableExtra instanceof l20.a ? parcelableExtra : null);
                                }
                                l20.a aVar5 = (l20.a) parcelable;
                                if (aVar5 != null) {
                                    List<l20.c> listZ = aVar5.z();
                                    if (listZ != null) {
                                        Iterator<T> it = listZ.iterator();
                                        z14 = false;
                                        while (it.hasNext()) {
                                            if (p005kotlin.jvm.internal.s.g(((l20.c) it.next()).getIsLiveEventSharingDefault(), Boolean.TRUE)) {
                                                z14 = true;
                                            }
                                        }
                                    } else {
                                        z14 = false;
                                    }
                                    contactActivity.fa(aVar5, z14, z16, false);
                                }
                            }
                        }
                        break;
                    case 1:
                        ContactActivity.a aVar6 = ContactActivity.T;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            Intent intent2 = aVar3.f67586b;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable2 = (Parcelable) intent2.getParcelableExtra("extra_contact_key", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra2 = intent2.getParcelableExtra("extra_contact_key");
                                    if (!(parcelableExtra2 instanceof l20.a)) {
                                        parcelableExtra2 = null;
                                    }
                                    parcelable2 = (l20.a) parcelableExtra2;
                                }
                                aVar = (l20.a) parcelable2;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                com.garmin.android.apps.connectmobile.contacts.d dVarGa = contactActivity.ga();
                                dVarGa.getClass();
                                ge1.b.T(v1.a(dVarGa), null, null, new com.garmin.android.apps.connectmobile.contacts.e(dVarGa, aVar, null), 3);
                            }
                        }
                        break;
                    case 2:
                        ContactActivity.a aVar7 = ContactActivity.T;
                        aVar3.getClass();
                        Intent intent3 = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            if (intent3 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable3 = (Parcelable) intent3.getParcelableExtra("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra3 = intent3.getParcelableExtra("RESULT_CONTACT_DTO");
                                    parcelable3 = (l20.a) (parcelableExtra3 instanceof l20.a ? parcelableExtra3 : null);
                                }
                                aVar2 = (l20.a) parcelable3;
                            }
                            boolean z17 = intent3 != null && intent3.getBooleanExtra("IS_CONTACT_UPDATED", false);
                            if (intent3 != null && intent3.getBooleanExtra("HAS_MADE_SMS_OPT_IN_REQUEST", false)) {
                                z15 = true;
                            }
                            if (z17) {
                                contactActivity.ga().x4();
                            }
                            if (z15 && aVar2 != null) {
                                contactActivity.fa(aVar2, true, z17, z15);
                                break;
                            }
                        }
                        break;
                    case 3:
                        ContactActivity.a aVar8 = ContactActivity.T;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            contactActivity.ga().x4();
                        }
                        break;
                    default:
                        ContactActivity.a aVar9 = ContactActivity.T;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            contactActivity.ga().x4();
                        }
                        break;
                }
            }
        });
        final int i17 = 0;
        this.D = registerForActivityResult(new g.h(), new f.b(this) { // from class: f20.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactActivity f68351b;

            {
                this.f68351b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // f.b
            public final void a(Object obj) {
                Parcelable parcelable;
                boolean z14;
                l20.a aVar;
                Parcelable parcelable2;
                Parcelable parcelable3;
                int i18 = i17;
                boolean z15 = false;
                l20.a aVar2 = null;
                ContactActivity contactActivity = this.f68351b;
                f.a aVar3 = (f.a) obj;
                switch (i18) {
                    case 0:
                        ContactActivity.a aVar4 = ContactActivity.T;
                        aVar3.getClass();
                        Intent intent = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            boolean z16 = intent != null && intent.getBooleanExtra("HAS_MADE_SMS_OPT_IN_REQUEST", false);
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent.getParcelableExtra("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("RESULT_CONTACT_DTO");
                                    parcelable = (l20.a) (parcelableExtra instanceof l20.a ? parcelableExtra : null);
                                }
                                l20.a aVar5 = (l20.a) parcelable;
                                if (aVar5 != null) {
                                    List<l20.c> listZ = aVar5.z();
                                    if (listZ != null) {
                                        Iterator<T> it = listZ.iterator();
                                        z14 = false;
                                        while (it.hasNext()) {
                                            if (p005kotlin.jvm.internal.s.g(((l20.c) it.next()).getIsLiveEventSharingDefault(), Boolean.TRUE)) {
                                                z14 = true;
                                            }
                                        }
                                    } else {
                                        z14 = false;
                                    }
                                    contactActivity.fa(aVar5, z14, z16, false);
                                }
                            }
                        }
                        break;
                    case 1:
                        ContactActivity.a aVar6 = ContactActivity.T;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            Intent intent2 = aVar3.f67586b;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable2 = (Parcelable) intent2.getParcelableExtra("extra_contact_key", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra2 = intent2.getParcelableExtra("extra_contact_key");
                                    if (!(parcelableExtra2 instanceof l20.a)) {
                                        parcelableExtra2 = null;
                                    }
                                    parcelable2 = (l20.a) parcelableExtra2;
                                }
                                aVar = (l20.a) parcelable2;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                com.garmin.android.apps.connectmobile.contacts.d dVarGa = contactActivity.ga();
                                dVarGa.getClass();
                                ge1.b.T(v1.a(dVarGa), null, null, new com.garmin.android.apps.connectmobile.contacts.e(dVarGa, aVar, null), 3);
                            }
                        }
                        break;
                    case 2:
                        ContactActivity.a aVar7 = ContactActivity.T;
                        aVar3.getClass();
                        Intent intent3 = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            if (intent3 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable3 = (Parcelable) intent3.getParcelableExtra("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra3 = intent3.getParcelableExtra("RESULT_CONTACT_DTO");
                                    parcelable3 = (l20.a) (parcelableExtra3 instanceof l20.a ? parcelableExtra3 : null);
                                }
                                aVar2 = (l20.a) parcelable3;
                            }
                            boolean z17 = intent3 != null && intent3.getBooleanExtra("IS_CONTACT_UPDATED", false);
                            if (intent3 != null && intent3.getBooleanExtra("HAS_MADE_SMS_OPT_IN_REQUEST", false)) {
                                z15 = true;
                            }
                            if (z17) {
                                contactActivity.ga().x4();
                            }
                            if (z15 && aVar2 != null) {
                                contactActivity.fa(aVar2, true, z17, z15);
                                break;
                            }
                        }
                        break;
                    case 3:
                        ContactActivity.a aVar8 = ContactActivity.T;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            contactActivity.ga().x4();
                        }
                        break;
                    default:
                        ContactActivity.a aVar9 = ContactActivity.T;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            contactActivity.ga().x4();
                        }
                        break;
                }
            }
        });
        final int i18 = 1;
        this.E = registerForActivityResult(new g.h(), new f.b(this) { // from class: f20.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactActivity f68351b;

            {
                this.f68351b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // f.b
            public final void a(Object obj) {
                Parcelable parcelable;
                boolean z14;
                l20.a aVar;
                Parcelable parcelable2;
                Parcelable parcelable3;
                int i19 = i18;
                boolean z15 = false;
                l20.a aVar2 = null;
                ContactActivity contactActivity = this.f68351b;
                f.a aVar3 = (f.a) obj;
                switch (i19) {
                    case 0:
                        ContactActivity.a aVar4 = ContactActivity.T;
                        aVar3.getClass();
                        Intent intent = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            boolean z16 = intent != null && intent.getBooleanExtra("HAS_MADE_SMS_OPT_IN_REQUEST", false);
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent.getParcelableExtra("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("RESULT_CONTACT_DTO");
                                    parcelable = (l20.a) (parcelableExtra instanceof l20.a ? parcelableExtra : null);
                                }
                                l20.a aVar5 = (l20.a) parcelable;
                                if (aVar5 != null) {
                                    List<l20.c> listZ = aVar5.z();
                                    if (listZ != null) {
                                        Iterator<T> it = listZ.iterator();
                                        z14 = false;
                                        while (it.hasNext()) {
                                            if (p005kotlin.jvm.internal.s.g(((l20.c) it.next()).getIsLiveEventSharingDefault(), Boolean.TRUE)) {
                                                z14 = true;
                                            }
                                        }
                                    } else {
                                        z14 = false;
                                    }
                                    contactActivity.fa(aVar5, z14, z16, false);
                                }
                            }
                        }
                        break;
                    case 1:
                        ContactActivity.a aVar6 = ContactActivity.T;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            Intent intent2 = aVar3.f67586b;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable2 = (Parcelable) intent2.getParcelableExtra("extra_contact_key", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra2 = intent2.getParcelableExtra("extra_contact_key");
                                    if (!(parcelableExtra2 instanceof l20.a)) {
                                        parcelableExtra2 = null;
                                    }
                                    parcelable2 = (l20.a) parcelableExtra2;
                                }
                                aVar = (l20.a) parcelable2;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                com.garmin.android.apps.connectmobile.contacts.d dVarGa = contactActivity.ga();
                                dVarGa.getClass();
                                ge1.b.T(v1.a(dVarGa), null, null, new com.garmin.android.apps.connectmobile.contacts.e(dVarGa, aVar, null), 3);
                            }
                        }
                        break;
                    case 2:
                        ContactActivity.a aVar7 = ContactActivity.T;
                        aVar3.getClass();
                        Intent intent3 = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            if (intent3 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable3 = (Parcelable) intent3.getParcelableExtra("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra3 = intent3.getParcelableExtra("RESULT_CONTACT_DTO");
                                    parcelable3 = (l20.a) (parcelableExtra3 instanceof l20.a ? parcelableExtra3 : null);
                                }
                                aVar2 = (l20.a) parcelable3;
                            }
                            boolean z17 = intent3 != null && intent3.getBooleanExtra("IS_CONTACT_UPDATED", false);
                            if (intent3 != null && intent3.getBooleanExtra("HAS_MADE_SMS_OPT_IN_REQUEST", false)) {
                                z15 = true;
                            }
                            if (z17) {
                                contactActivity.ga().x4();
                            }
                            if (z15 && aVar2 != null) {
                                contactActivity.fa(aVar2, true, z17, z15);
                                break;
                            }
                        }
                        break;
                    case 3:
                        ContactActivity.a aVar8 = ContactActivity.T;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            contactActivity.ga().x4();
                        }
                        break;
                    default:
                        ContactActivity.a aVar9 = ContactActivity.T;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            contactActivity.ga().x4();
                        }
                        break;
                }
            }
        });
        final int i19 = 2;
        this.F = registerForActivityResult(new g.h(), new f.b(this) { // from class: f20.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactActivity f68351b;

            {
                this.f68351b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // f.b
            public final void a(Object obj) {
                Parcelable parcelable;
                boolean z14;
                l20.a aVar;
                Parcelable parcelable2;
                Parcelable parcelable3;
                int i110 = i19;
                boolean z15 = false;
                l20.a aVar2 = null;
                ContactActivity contactActivity = this.f68351b;
                f.a aVar3 = (f.a) obj;
                switch (i110) {
                    case 0:
                        ContactActivity.a aVar4 = ContactActivity.T;
                        aVar3.getClass();
                        Intent intent = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            boolean z16 = intent != null && intent.getBooleanExtra("HAS_MADE_SMS_OPT_IN_REQUEST", false);
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent.getParcelableExtra("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("RESULT_CONTACT_DTO");
                                    parcelable = (l20.a) (parcelableExtra instanceof l20.a ? parcelableExtra : null);
                                }
                                l20.a aVar5 = (l20.a) parcelable;
                                if (aVar5 != null) {
                                    List<l20.c> listZ = aVar5.z();
                                    if (listZ != null) {
                                        Iterator<T> it = listZ.iterator();
                                        z14 = false;
                                        while (it.hasNext()) {
                                            if (p005kotlin.jvm.internal.s.g(((l20.c) it.next()).getIsLiveEventSharingDefault(), Boolean.TRUE)) {
                                                z14 = true;
                                            }
                                        }
                                    } else {
                                        z14 = false;
                                    }
                                    contactActivity.fa(aVar5, z14, z16, false);
                                }
                            }
                        }
                        break;
                    case 1:
                        ContactActivity.a aVar6 = ContactActivity.T;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            Intent intent2 = aVar3.f67586b;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable2 = (Parcelable) intent2.getParcelableExtra("extra_contact_key", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra2 = intent2.getParcelableExtra("extra_contact_key");
                                    if (!(parcelableExtra2 instanceof l20.a)) {
                                        parcelableExtra2 = null;
                                    }
                                    parcelable2 = (l20.a) parcelableExtra2;
                                }
                                aVar = (l20.a) parcelable2;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                com.garmin.android.apps.connectmobile.contacts.d dVarGa = contactActivity.ga();
                                dVarGa.getClass();
                                ge1.b.T(v1.a(dVarGa), null, null, new com.garmin.android.apps.connectmobile.contacts.e(dVarGa, aVar, null), 3);
                            }
                        }
                        break;
                    case 2:
                        ContactActivity.a aVar7 = ContactActivity.T;
                        aVar3.getClass();
                        Intent intent3 = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            if (intent3 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable3 = (Parcelable) intent3.getParcelableExtra("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra3 = intent3.getParcelableExtra("RESULT_CONTACT_DTO");
                                    parcelable3 = (l20.a) (parcelableExtra3 instanceof l20.a ? parcelableExtra3 : null);
                                }
                                aVar2 = (l20.a) parcelable3;
                            }
                            boolean z17 = intent3 != null && intent3.getBooleanExtra("IS_CONTACT_UPDATED", false);
                            if (intent3 != null && intent3.getBooleanExtra("HAS_MADE_SMS_OPT_IN_REQUEST", false)) {
                                z15 = true;
                            }
                            if (z17) {
                                contactActivity.ga().x4();
                            }
                            if (z15 && aVar2 != null) {
                                contactActivity.fa(aVar2, true, z17, z15);
                                break;
                            }
                        }
                        break;
                    case 3:
                        ContactActivity.a aVar8 = ContactActivity.T;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            contactActivity.ga().x4();
                        }
                        break;
                    default:
                        ContactActivity.a aVar9 = ContactActivity.T;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            contactActivity.ga().x4();
                        }
                        break;
                }
            }
        });
        final int i24 = 3;
        this.I = registerForActivityResult(new g.h(), new f.b(this) { // from class: f20.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactActivity f68351b;

            {
                this.f68351b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // f.b
            public final void a(Object obj) {
                Parcelable parcelable;
                boolean z14;
                l20.a aVar;
                Parcelable parcelable2;
                Parcelable parcelable3;
                int i110 = i24;
                boolean z15 = false;
                l20.a aVar2 = null;
                ContactActivity contactActivity = this.f68351b;
                f.a aVar3 = (f.a) obj;
                switch (i110) {
                    case 0:
                        ContactActivity.a aVar4 = ContactActivity.T;
                        aVar3.getClass();
                        Intent intent = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            boolean z16 = intent != null && intent.getBooleanExtra("HAS_MADE_SMS_OPT_IN_REQUEST", false);
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent.getParcelableExtra("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("RESULT_CONTACT_DTO");
                                    parcelable = (l20.a) (parcelableExtra instanceof l20.a ? parcelableExtra : null);
                                }
                                l20.a aVar5 = (l20.a) parcelable;
                                if (aVar5 != null) {
                                    List<l20.c> listZ = aVar5.z();
                                    if (listZ != null) {
                                        Iterator<T> it = listZ.iterator();
                                        z14 = false;
                                        while (it.hasNext()) {
                                            if (p005kotlin.jvm.internal.s.g(((l20.c) it.next()).getIsLiveEventSharingDefault(), Boolean.TRUE)) {
                                                z14 = true;
                                            }
                                        }
                                    } else {
                                        z14 = false;
                                    }
                                    contactActivity.fa(aVar5, z14, z16, false);
                                }
                            }
                        }
                        break;
                    case 1:
                        ContactActivity.a aVar6 = ContactActivity.T;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            Intent intent2 = aVar3.f67586b;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable2 = (Parcelable) intent2.getParcelableExtra("extra_contact_key", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra2 = intent2.getParcelableExtra("extra_contact_key");
                                    if (!(parcelableExtra2 instanceof l20.a)) {
                                        parcelableExtra2 = null;
                                    }
                                    parcelable2 = (l20.a) parcelableExtra2;
                                }
                                aVar = (l20.a) parcelable2;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                com.garmin.android.apps.connectmobile.contacts.d dVarGa = contactActivity.ga();
                                dVarGa.getClass();
                                ge1.b.T(v1.a(dVarGa), null, null, new com.garmin.android.apps.connectmobile.contacts.e(dVarGa, aVar, null), 3);
                            }
                        }
                        break;
                    case 2:
                        ContactActivity.a aVar7 = ContactActivity.T;
                        aVar3.getClass();
                        Intent intent3 = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            if (intent3 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable3 = (Parcelable) intent3.getParcelableExtra("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra3 = intent3.getParcelableExtra("RESULT_CONTACT_DTO");
                                    parcelable3 = (l20.a) (parcelableExtra3 instanceof l20.a ? parcelableExtra3 : null);
                                }
                                aVar2 = (l20.a) parcelable3;
                            }
                            boolean z17 = intent3 != null && intent3.getBooleanExtra("IS_CONTACT_UPDATED", false);
                            if (intent3 != null && intent3.getBooleanExtra("HAS_MADE_SMS_OPT_IN_REQUEST", false)) {
                                z15 = true;
                            }
                            if (z17) {
                                contactActivity.ga().x4();
                            }
                            if (z15 && aVar2 != null) {
                                contactActivity.fa(aVar2, true, z17, z15);
                                break;
                            }
                        }
                        break;
                    case 3:
                        ContactActivity.a aVar8 = ContactActivity.T;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            contactActivity.ga().x4();
                        }
                        break;
                    default:
                        ContactActivity.a aVar9 = ContactActivity.T;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            contactActivity.ga().x4();
                        }
                        break;
                }
            }
        });
        this.P = new a4.b(this, 20);
    }

    @Override // com.garmin.android.apps.connectmobile.contacts.h.a
    public final void B(o oVar, CheckBox checkBox) {
        Object next;
        oVar.getClass();
        r rVar = this.f32293g;
        List<l20.a> listF = rVar != null ? rVar.f() : null;
        if (listF == null) {
            listF = j0.f134944a;
        }
        l20.a aVarC = com.garmin.android.apps.connectmobile.contacts.b.c(oVar.f68406b, oVar.f68418n, h0.d1(listF));
        if (aVarC == null) {
            com.garmin.android.apps.connectmobile.contacts.d dVarGa = ga();
            long j8 = oVar.f68405a;
            ArrayList arrayList = dVarGa.f32401p;
            if (arrayList == null) {
                s.m("phoneContacts");
                throw null;
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((l20.n) next).f109027a != j8);
            l20.n nVar = (l20.n) next;
            aVarC = nVar != null ? com.garmin.android.apps.connectmobile.contacts.b.m(nVar, 3) : null;
        }
        if ((aVarC != null ? aVarC.getContactId() : null) != null) {
            la(aVarC, true);
            return;
        }
        com.garmin.android.apps.connectmobile.contacts.d dVarGa2 = ga();
        dVarGa2.getClass();
        if (aVarC == null) {
            return;
        }
        ge1.b.T(v1.a(dVarGa2), null, null, new e(dVarGa2, aVarC, null), 3);
    }

    public final void ca() {
        if (getCallingActivity() == null) {
            getOnBackPressedDispatcher().d();
            return;
        }
        Intent intentPutExtra = new Intent().putExtra("RESULT_EXTRA_USER_CONTACTS_DTO", this.f32293g);
        intentPutExtra.getClass();
        setResult(-1, intentPutExtra);
        getOnBackPressedDispatcher().d();
    }

    public final void da() {
        if (this.f32292f >= 50) {
            u20.e.v6(getString(R.string.contact_management_title_max_reached), getString(R.string.contact_management_livetrack_max_reched, Integer.valueOf(this.f32289c))).g(getSupportFragmentManager());
        } else {
            this.I.a(EditContactActivity.a.a(EditContactActivity.f32500n, this, null, ia(), 2), null);
        }
    }

    public final void ea(final Integer num) {
        new androidx.appcompat.app.e.a(this).setTitle(getString(R.string.lbl_admin_cannot_be_removed)).setMessage(getString(R.string.msg_remove_admin_error)).setPositiveButton(R.string.lbl_ok, new ag0.d(21, this, num)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: f20.h
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ContactActivity.a aVar = ContactActivity.T;
                this.f68392a.ka(num);
            }
        }).show();
    }

    public final void fa(l20.a aVar, boolean z14, boolean z15, boolean z16) {
        Intent intent = new Intent();
        intent.putExtra("RESULT_CONTACT_DTO", aVar);
        intent.putExtra("ADD_REMOVE_CONTACT", z14);
        intent.putExtra("RESULT_EXTRA_USER_CONTACTS_DTO", this.f32293g);
        intent.putExtra("IS_CONTACT_UPDATED", z15);
        intent.putExtra("HAS_MADE_SMS_OPT_IN_REQUEST", z16);
        setResult(-1, intent);
        finish();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final com.garmin.android.apps.connectmobile.contacts.d ga() {
        return (com.garmin.android.apps.connectmobile.contacts.d) this.f32296j.getValue();
    }

    public final String ha() {
        int i14 = this.f32288b;
        if (i14 == 1) {
            String string = getString(R.string.add_assistance_contact);
            string.getClass();
            return string;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                String string2 = getString(R.string.contact_management_title_contacts);
                string2.getClass();
                return string2;
            }
            String string3 = getString(R.string.livetrack_add_recipient);
            string3.getClass();
            return string3;
        }
        if (this.f32291e == 0) {
            String string4 = getString(R.string.live_track_add_recipients);
            string4.getClass();
            return string4;
        }
        String string5 = getString(R.string.live_track_edit_recipients);
        string5.getClass();
        return string5;
    }

    public final hl.a ia() {
        return (hl.a) this.f32287a.getValue();
    }

    public final String ja() {
        int i14 = this.f32288b;
        if (i14 == 1 || i14 == 2) {
            String string = getString(R.string.num_of_num_added, String.valueOf(this.f32291e), String.valueOf(this.f32289c));
            string.getClass();
            return string;
        }
        if (i14 == 3) {
            return "";
        }
        String string2 = getString(R.string.contact_management_subtitle_add_contacts, String.valueOf(this.f32292f), String.valueOf(this.f32289c));
        string2.getClass();
        return string2;
    }

    public final void ka(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            h hVar = this.f32299m;
            if (hVar != null) {
                hVar.notifyItemChanged(iIntValue);
            } else {
                s.m("adapter");
                throw null;
            }
        }
    }

    public final void la(final l20.a aVar, boolean z14) {
        if (aVar != null) {
            int i14 = this.f32288b;
            if (i14 == 1) {
                if (this.f32291e >= this.f32289c) {
                    u20.e.u6(R.string.incident_assistance_contact_limit_reached, R.string.incident_assistance_contact_limit_reached_message).g(getSupportFragmentManager());
                    return;
                }
                List<l20.c> listZ = aVar.z();
                if (listZ != null && !listZ.isEmpty()) {
                    this.F.a(EmergencyContactSendRequestActivity.a.b(EmergencyContactSendRequestActivity.f32570v, this, aVar, j0.f134944a, false, false, ia(), 48), null);
                    return;
                }
                c22.f fVar = c22.f.f23050a;
                String string = getString(R.string.add_phone_number_alert_title);
                String string2 = getString(R.string.add_phone_number_alert_message);
                final int i15 = 0;
                o13.p pVar = new o13.p(getString(R.string.add_number_alert_button), new e23.p(this) { // from class: f20.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ContactActivity f68400b;

                    {
                        this.f68400b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i16 = i15;
                        DialogInterface dialogInterface = (DialogInterface) obj;
                        ((Integer) obj2).getClass();
                        ContactActivity.a aVar2 = ContactActivity.T;
                        switch (i16) {
                            case 0:
                                dialogInterface.getClass();
                                dialogInterface.dismiss();
                                ContactActivity contactActivity = this.f68400b;
                                f.c<Intent> cVar = contactActivity.E;
                                EditContactActivity.a aVar3 = EditContactActivity.f32500n;
                                hl.a aVarIa = contactActivity.ia();
                                aVar3.getClass();
                                l20.a aVar4 = aVar;
                                aVar4.getClass();
                                aVarIa.getClass();
                                Intent intentA = EditContactActivity.a.a(aVar3, contactActivity, aVar4, null, 4);
                                intentA.putExtra("EXTRA_CREATE_NEW_PHONE_NUMBER", true);
                                intentA.putExtra("GCM_extra_screen_access_role", aVarIa);
                                cVar.a(intentA, null);
                                break;
                            default:
                                dialogInterface.getClass();
                                dialogInterface.dismiss();
                                ContactActivity contactActivity2 = this.f68400b;
                                contactActivity2.F.a(EmergencyContactSendRequestActivity.a.b(EmergencyContactSendRequestActivity.f32570v, contactActivity2, aVar, j0.f134944a, false, false, contactActivity2.ia(), 48), null);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                final int i16 = 1;
                c22.f.d(fVar, this, string, string2, pVar, new o13.p(getString(R.string.not_now_lbl), new e23.p(this) { // from class: f20.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ContactActivity f68400b;

                    {
                        this.f68400b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i17 = i16;
                        DialogInterface dialogInterface = (DialogInterface) obj;
                        ((Integer) obj2).getClass();
                        ContactActivity.a aVar2 = ContactActivity.T;
                        switch (i17) {
                            case 0:
                                dialogInterface.getClass();
                                dialogInterface.dismiss();
                                ContactActivity contactActivity = this.f68400b;
                                f.c<Intent> cVar = contactActivity.E;
                                EditContactActivity.a aVar3 = EditContactActivity.f32500n;
                                hl.a aVarIa = contactActivity.ia();
                                aVar3.getClass();
                                l20.a aVar4 = aVar;
                                aVar4.getClass();
                                aVarIa.getClass();
                                Intent intentA = EditContactActivity.a.a(aVar3, contactActivity, aVar4, null, 4);
                                intentA.putExtra("EXTRA_CREATE_NEW_PHONE_NUMBER", true);
                                intentA.putExtra("GCM_extra_screen_access_role", aVarIa);
                                cVar.a(intentA, null);
                                break;
                            default:
                                dialogInterface.getClass();
                                dialogInterface.dismiss();
                                ContactActivity contactActivity2 = this.f68400b;
                                contactActivity2.F.a(EmergencyContactSendRequestActivity.a.b(EmergencyContactSendRequestActivity.f32570v, contactActivity2, aVar, j0.f134944a, false, false, contactActivity2.ia(), 48), null);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), null, false, 96).show();
                return;
            }
            if (i14 != 2) {
                if (i14 != 3) {
                    if (z14) {
                        this.C.a(ContactDetailsActivity.a.b(ContactDetailsActivity.f32429g, this, aVar, ia(), 28), null);
                        return;
                    } else {
                        ga().z4();
                        return;
                    }
                }
                Intent intent = new Intent();
                intent.putExtra("GCM_RESULT_EXTRA_CONTACT_ID", aVar.getContactId());
                setResult(-1, intent);
                finish();
                return;
            }
            if (this.f32291e >= this.f32289c) {
                u20.e.v6(getString(R.string.contact_management_title_max_reached), getString(R.string.contact_management_livetrack_max_reched, Integer.valueOf(this.f32289c))).g(getSupportFragmentManager());
                return;
            }
            List<l20.c> listZ2 = aVar.z();
            if (listZ2 == null || !(!listZ2.isEmpty())) {
                u20.e.u6(R.string.lbl_phone_number, R.string.live_event_sharing_missing_phone_digits).g(getSupportFragmentManager());
                return;
            }
            ContactDetailsActivity.a aVar2 = ContactDetailsActivity.f32429g;
            int i17 = this.f32289c;
            r rVar = this.f32293g;
            List<l20.a> listF = rVar != null ? rVar.f() : null;
            int iA = 0;
            if (listF != null) {
                Iterator<T> it = listF.iterator();
                while (it.hasNext()) {
                    iA += com.garmin.android.apps.connectmobile.contacts.b.a((l20.a) it.next());
                }
            }
            hl.a aVarIa = ia();
            aVar2.getClass();
            this.D.a(ContactDetailsActivity.a.a(this, aVar, 2, i17, i17 - iA, aVarIa), null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    @o13.e
    public final void onBackPressed() {
        super.onBackPressed();
        com.garmin.android.apps.connectmobile.contacts.d dVarGa = ga();
        y0<com.garmin.android.apps.connectmobile.contacts.d.b> y0Var = dVarGa.f32397l;
        if (!dVarGa.f32396k) {
            y0Var.j(new com.garmin.android.apps.connectmobile.contacts.d.b(false, false, null, null, null, 0, 0, false, false, false, false, false, false, null, false, true, false, null, dVarGa.f32389d, 229375, null));
            return;
        }
        String strD = ((v) KoinJavaComponent.get$default(v.class, null, null, 6, null)).d();
        ((v) KoinJavaComponent.get$default(v.class, null, null, 6, null)).b();
        y0Var.j(new com.garmin.android.apps.connectmobile.contacts.d.b(false, false, null, null, null, 0, 0, false, false, false, false, false, false, null, false, true, true, strD, dVarGa.f32389d, 32767, null));
        dVarGa.f32396k = false;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i14;
        String str;
        Integer contactLimit;
        Bundle extras;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.select_contact_list_activity);
        ga().f32398m.f(this, new c(new j(this, 0)));
        this.f32290d = new e0(this);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("KEY_CONTACTS_EXTRA", r.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("KEY_CONTACTS_EXTRA");
                if (!(parcelable2 instanceof r)) {
                    parcelable2 = null;
                }
                parcelable = (r) parcelable2;
            }
            this.f32293g = (r) parcelable;
            this.f32288b = extras.getInt("KEY_SELECTION_MODE_EXTRA", 0);
            this.f32289c = extras.getInt("KEY_CONTACTS_LIMIT", 50);
            extras.getBoolean("IS_FROM_SAFETY_WIZARD", false);
            this.f32294h = extras.getBoolean("EXTRA_STARTED_AFTER_MIGRATION", false);
            this.f32295i = extras.getBoolean("EXTRA_STARTED_AS_PART_OF_MIGRATION", false);
            this.f32309y = extras.getBoolean("KEY_HIDE_ONLY_PHONE_NUMBER_CONTACTS", false);
        }
        View viewFindViewById = findViewById(R.id.recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f32300n = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = this.f32300n;
        if (recyclerView2 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView2.setHasFixedSize(true);
        androidx.recyclerview.widget.s sVar = new androidx.recyclerview.widget.s(new f20.n(a7.b.getColor(this, R.color.gcm_surface_danger_action), a7.b.getColor(this, R.color.palette_white_alpha_5), this, getResources(), R.string.lbl_remove, R.dimen.andfont_body_1));
        RecyclerView recyclerView3 = this.f32300n;
        if (recyclerView3 == null) {
            s.m("recyclerView");
            throw null;
        }
        sVar.e(recyclerView3);
        View viewFindViewById2 = findViewById(R.id.no_contact_list_container);
        viewFindViewById2.getClass();
        this.f32301o = viewFindViewById2;
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.icon_select_contact);
        viewFindViewById3.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById3;
        this.f32302p = composeView;
        f20.a.f68344a.getClass();
        composeView.setContent(f20.a.f68346c);
        View view2 = this.f32301o;
        if (view2 == null) {
            s.m("noContactListView");
            throw null;
        }
        View viewFindViewById4 = view2.findViewById(R.id.title_select_contact);
        viewFindViewById4.getClass();
        this.f32303q = (TextView) viewFindViewById4;
        View view3 = this.f32301o;
        if (view3 == null) {
            s.m("noContactListView");
            throw null;
        }
        View viewFindViewById5 = view3.findViewById(R.id.description_select_contact);
        viewFindViewById5.getClass();
        this.f32304r = (TextView) viewFindViewById5;
        View view4 = this.f32301o;
        if (view4 == null) {
            s.m("noContactListView");
            throw null;
        }
        View viewFindViewById6 = view4.findViewById(R.id.button_select_contact);
        viewFindViewById6.getClass();
        this.f32305t = (AppCompatButton) viewFindViewById6;
        View view5 = this.f32301o;
        if (view5 == null) {
            s.m("noContactListView");
            throw null;
        }
        View viewFindViewById7 = view5.findViewById(R.id.button_select_contact_2);
        viewFindViewById7.getClass();
        this.f32306v = (AppCompatButton) viewFindViewById7;
        int i15 = this.f32288b;
        if (i15 != 1) {
            i14 = i15 != 3 ? R.string.contacts : R.string.livetrack_add_recipient;
        } else {
            i14 = R.string.add_assistance_contact;
        }
        initActionBar(i14, 2);
        boolean z14 = this.f32310z;
        if (z14) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "PageViewChildContacts");
        } else {
            int i16 = this.f32288b;
            if (i16 == 3 || i16 == 1) {
                setSubtitle(R.string.num_of_num_added, Integer.valueOf(Math.min(this.f32291e, 3)), 3);
            } else {
                setSubtitle(R.string.num_of_num_added, Integer.valueOf(Math.min(this.f32291e, 50)), 50);
            }
        }
        View viewFindViewById8 = findViewById(R.id.title_view);
        viewFindViewById8.getClass();
        this.f32297k = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.details_view);
        viewFindViewById9.getClass();
        this.f32298l = (TextView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.button_layout);
        viewFindViewById10.getClass();
        this.f32307w = viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.button_create_contact);
        viewFindViewById11.getClass();
        ((AppCompatButton) viewFindViewById11).setOnClickListener(new k(this, 5));
        View view6 = this.f32307w;
        if (view6 == null) {
            s.m("bottomButtonContainer");
            throw null;
        }
        view6.setVisibility(!z14 ? 0 : 8);
        int i17 = this.f32288b;
        if (i17 == 1) {
            TextView textView = this.f32297k;
            if (textView == null) {
                s.m("titleTextView");
                throw null;
            }
            textView.setVisibility(0);
            TextView textView2 = this.f32298l;
            if (textView2 == null) {
                s.m("descriptionTextView");
                throw null;
            }
            textView2.setVisibility(0);
        } else if (i17 == 3) {
            TextView textView3 = this.f32297k;
            if (textView3 == null) {
                s.m("titleTextView");
                throw null;
            }
            textView3.setText(getString(R.string.livetrack_select_recipient));
            TextView textView4 = this.f32297k;
            if (textView4 == null) {
                s.m("titleTextView");
                throw null;
            }
            textView4.setVisibility(0);
        }
        View viewFindViewById12 = findViewById(R.id.widget_switch_button);
        viewFindViewById12.getClass();
        FrameLayout frameLayout = (FrameLayout) viewFindViewById12;
        this.f32308x = frameLayout;
        frameLayout.setVisibility(z14 ? 8 : 0);
        ComposeView composeView2 = new ComposeView(this, null, 0, 6, null);
        composeView2.setContent(new z3.e(-1869590272, true, new f20.c(this, 3)));
        FrameLayout frameLayout2 = this.f32308x;
        if (frameLayout2 == null) {
            s.m("switchButton");
            throw null;
        }
        frameLayout2.addView(composeView2);
        com.garmin.android.apps.connectmobile.contacts.d dVarGa = ga();
        r rVar = this.f32293g;
        int iIntValue = (rVar == null || (contactLimit = rVar.getContactLimit()) == null) ? 50 : contactLimit.intValue();
        int i18 = this.f32288b;
        e0 e0Var = this.f32290d;
        if (e0Var == null) {
            s.m("phonePrefixProvider");
            throw null;
        }
        boolean z15 = this.f32295i;
        boolean z16 = this.f32309y;
        dVarGa.getClass();
        dVarGa.f32390e = z16;
        dVarGa.f32389d = rVar;
        List<l20.a> listF = rVar != null ? rVar.f() : null;
        dVarGa.f32391f = listF;
        dVarGa.f32393h = i18;
        dVarGa.f32392g = iIntValue > 0 ? iIntValue : 50;
        dVarGa.f32394i = z15;
        dVarGa.f32395j = e0Var;
        if (listF == null || listF.isEmpty()) {
            dVarGa.x4();
        } else {
            dVarGa.z4();
        }
        ga().f32400o.f(this, this.P);
        if ((ia() instanceof hl.a.b) && this.f32288b == 0) {
            ComposeView composeView3 = (ComposeView) findViewById(R.id.managed_account_notice);
            hl.a aVarIa = ia();
            hl.a.b bVar = aVarIa instanceof hl.a.b ? (hl.a.b) aVarIa : null;
            if (bVar == null || (str = bVar.f84253c) == null) {
                return;
            }
            composeView3.getClass();
            composeView3.setVisibility(0);
            composeView3.setContent(new z3.e(205757379, true, new f20.g(bVar, str, 1)));
        }
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (i14 != 1) {
            super.onRequestPermissionsResult(i14, strArr, iArr);
            return;
        }
        j22.b.f96736a.getClass();
        if (j22.b.E(iArr)) {
            ga().A4();
            return;
        }
        RecyclerView recyclerView = this.f32300n;
        if (recyclerView == null) {
            s.m("recyclerView");
            throw null;
        }
        Snackbar action = Snackbar.make(recyclerView, j22.b.g(j22.a.f96717f), 0).setAction(R.string.lbl_settings, new k(this, 4));
        action.getClass();
        v22.c.a(action);
        action.show();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/ContactActivity$a;", "", "<init>", "()V", "", "DEFAULT_CONTACT_VIEW_MODE", "I", "SELECTION_MODE_EMERGENCY_CONTACT", "SELECTION_MODE_LIVE_EVENT_SHARING_PHONE", "SELECTION_MODE_LIVE_TRACK", "REQUEST_CODE_PERM_READ_CONTACTS", "", "EXTRA_STARTED_AS_PART_OF_MIGRATION", "Ljava/lang/String;", "EXTRA_STARTED_AFTER_MIGRATION", "KEY_HIDE_ONLY_PHONE_NUMBER_CONTACTS", "KEY_CONTACTS_LIMIT", "KEY_CONTACTS_EXTRA", "KEY_SELECTION_MODE_EXTRA", "RESULT_EXTRA_USER_CONTACTS_DTO", "IS_FROM_SAFETY_WIZARD", "ADD_REMOVE_CONTACT", "RESULT_CONTACT_DTO", "IS_CONTACT_UPDATED", "HAS_MADE_SMS_OPT_IN_REQUEST", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, boolean z14, int i14, r rVar, int i15, boolean z15, hl.a aVar2, int i16) {
            if ((i16 & 2) != 0) {
                z14 = false;
            }
            if ((i16 & 8) != 0) {
                rVar = null;
            }
            if ((i16 & 32) != 0) {
                z15 = false;
            }
            if ((i16 & 64) != 0) {
                aVar2 = hl.a.c.f84256b;
            }
            aVar.getClass();
            aVar2.getClass();
            Intent intent = new Intent(context, (Class<?>) ContactActivity.class);
            intent.putExtra("IS_FROM_SAFETY_WIZARD", z14);
            intent.putExtra("KEY_CONTACTS_EXTRA", rVar);
            intent.putExtra("KEY_SELECTION_MODE_EXTRA", i14);
            intent.putExtra("KEY_CONTACTS_LIMIT", i15);
            intent.putExtra("KEY_HIDE_ONLY_PHONE_NUMBER_CONTACTS", z15);
            intent.putExtra("GCM_extra_screen_access_role", aVar2);
            return intent;
        }

        private a() {
        }
    }
}

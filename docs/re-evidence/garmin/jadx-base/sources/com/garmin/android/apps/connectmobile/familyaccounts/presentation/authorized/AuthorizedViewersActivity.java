package com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.RecyclerView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.k0;
import e23.p;
import ei0.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import o13.r;
import o13.t;
import o53.b0;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.t0;
import p13.y;
import rg0.q;
import rg0.s;
import rg0.u;
import rg0.x;
import ue0.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/AuthorizedViewersActivity;", "Lcom/garmin/android/apps/connectmobile/k0;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AuthorizedViewersActivity extends k0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f34974m = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f34975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f34976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f34977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ve0.b f34978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f34979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f.c<Intent> f34980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f.c<Intent> f34981k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f34982l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity$onCreate$1$1", f = "AuthorizedViewersActivity.kt", l = {111}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34983a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return AuthorizedViewersActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f34983a;
            AuthorizedViewersActivity authorizedViewersActivity = AuthorizedViewersActivity.this;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = AuthorizedViewersActivity.f34974m;
                h hVarIa = authorizedViewersActivity.ia();
                this.f34983a = 1;
                obj = hVarIa.B4(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            List<ue0.j> list = (List) obj;
            if (list.size() >= authorizedViewersActivity.f34978h.d().e()) {
                tg0.a.f164490a.getClass();
                tg0.a.C3085a.b(authorizedViewersActivity).show();
            } else {
                int iA = t0.a(y.r(list, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (ue0.j jVar : list) {
                    Long inviteeUserId = jVar.getInviteeUserId();
                    linkedHashMap.put(new Long(inviteeUserId != null ? inviteeUserId.longValue() : -1L), jVar.getStatus());
                }
                HashMap map = new HashMap(linkedHashMap);
                f.c<Intent> cVar = authorizedViewersActivity.f34980j;
                InviteAuthorizedUserActivity.a aVar3 = InviteAuthorizedUserActivity.f34996q;
                hl.a aVarHa = authorizedViewersActivity.ha();
                aVar3.getClass();
                aVarHa.getClass();
                Intent intent = new Intent(authorizedViewersActivity, (Class<?>) InviteAuthorizedUserActivity.class);
                intent.putExtra("invitesKey", map);
                intent.putExtra("GCM_extra_screen_access_role", aVarHa);
                cVar.a(intent, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/AuthorizedViewersActivity$c", "Lei0/u0$b;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements u0.b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity$onCreate$2$onFollowingSelected$1", f = "AuthorizedViewersActivity.kt", l = {129, 133, 137, 141, 146}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f34986a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0.a f34987b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AuthorizedViewersActivity f34988c;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity$c$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0595a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f34989a;

                static {
                    int[] iArr = new int[u0.a.EnumC1362a.values().length];
                    try {
                        iArr[u0.a.EnumC1362a.IssuedInvite.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[u0.a.EnumC1362a.ReceivedInvite.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[u0.a.EnumC1362a.Child.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[u0.a.EnumC1362a.AdminGuardian.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f34989a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(u0.a aVar, AuthorizedViewersActivity authorizedViewersActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f34987b = aVar;
                this.f34988c = authorizedViewersActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f34987b, this.f34988c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
            
                if (r13 == r0) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
            
                if (r13 == r0) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
            
                if (r13 == r0) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
            
                if (r13 == r0) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x00b6, code lost:
            
                if (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity.fa(r8, r13, r12) == r0) goto L57;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                ue0.d dVar;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f34986a;
                AuthorizedViewersActivity authorizedViewersActivity = this.f34988c;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        dVar = (ue0.j) obj;
                        if (dVar == null) {
                            return Unit.INSTANCE;
                        }
                    } else if (i14 == 2) {
                        r.b(obj);
                        dVar = (n) obj;
                        if (dVar == null) {
                            return Unit.INSTANCE;
                        }
                    } else if (i14 == 3) {
                        r.b(obj);
                        dVar = (ue0.l) obj;
                        if (dVar == null) {
                            return Unit.INSTANCE;
                        }
                    } else if (i14 == 4) {
                        r.b(obj);
                        dVar = (ue0.l) obj;
                        if (dVar == null) {
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (i14 != 5) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                r.b(obj);
                u0.a aVar2 = this.f34987b;
                u0.a.EnumC1362a enumC1362a = aVar2.f64340k;
                long j8 = aVar2.f64330a;
                int i15 = enumC1362a == null ? -1 : C0595a.f34989a[enumC1362a.ordinal()];
                if (i15 == -1) {
                    vb.h.z("Invite type cannot be null");
                    return null;
                }
                if (i15 == 1) {
                    a aVar3 = AuthorizedViewersActivity.f34974m;
                    h hVarIa = authorizedViewersActivity.ia();
                    this.f34986a = 1;
                    obj = hVarIa.A4(j8, this);
                } else if (i15 == 2) {
                    a aVar4 = AuthorizedViewersActivity.f34974m;
                    h hVarIa2 = authorizedViewersActivity.ia();
                    this.f34986a = 2;
                    obj = hVarIa2.D4(j8, this);
                } else if (i15 == 3) {
                    a aVar5 = AuthorizedViewersActivity.f34974m;
                    h hVarIa3 = authorizedViewersActivity.ia();
                    this.f34986a = 3;
                    obj = hVarIa3.C4(j8, this);
                } else {
                    if (i15 != 4) {
                        lc.u0.r();
                        return null;
                    }
                    a aVar6 = AuthorizedViewersActivity.f34974m;
                    h hVarIa4 = authorizedViewersActivity.ia();
                    this.f34986a = 4;
                    obj = hVarIa4.z4(j8, this);
                }
                return aVar;
                this.f34986a = 5;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity$onCreate$2$onPositiveButtonPressed$1", f = "AuthorizedViewersActivity.kt", l = {153}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f34990a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthorizedViewersActivity f34991b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ u0.a f34992c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AuthorizedViewersActivity authorizedViewersActivity, u0.a aVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f34991b = authorizedViewersActivity;
                this.f34992c = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f34991b, this.f34992c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f34990a;
                AuthorizedViewersActivity authorizedViewersActivity = this.f34991b;
                if (i14 == 0) {
                    r.b(obj);
                    a aVar2 = AuthorizedViewersActivity.f34974m;
                    h hVarIa = authorizedViewersActivity.ia();
                    this.f34990a = 1;
                    obj = hVarIa.E4(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (((n) obj2).getStatus() == ue0.c.ACCEPTED) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.size() >= authorizedViewersActivity.f34978h.d().d()) {
                    tg0.a.f164490a.getClass();
                    tg0.a.C3085a.a(authorizedViewersActivity).show();
                } else {
                    long j8 = this.f34992c.f64330a;
                    androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(authorizedViewersActivity);
                    aVar3.setTitle(authorizedViewersActivity.getString(R.string.authorized_viewer_agreement));
                    aVar3.setMessage(authorizedViewersActivity.getString(R.string.msg_as_authorized_viewer_agreement_details));
                    aVar3.setPositiveButton(authorizedViewersActivity.getString(R.string.lbl_agree), new jr2.e(authorizedViewersActivity, j8, 3));
                    aVar3.setNegativeButton(authorizedViewersActivity.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null);
                    aVar3.create().show();
                }
                return Unit.INSTANCE;
            }
        }

        public c() {
        }

        @Override // ei0.u0.b
        public final void a(u0.a aVar) throws Throwable {
            ge1.b.W(t13.h.f161748a, new b(AuthorizedViewersActivity.this, aVar, null));
        }

        @Override // ei0.u0.b
        public final void b(u0.a aVar) {
            long j8 = aVar.f64330a;
            a aVar2 = AuthorizedViewersActivity.f34974m;
            AuthorizedViewersActivity authorizedViewersActivity = AuthorizedViewersActivity.this;
            authorizedViewersActivity.getClass();
            ht.a.f85464a.getClass();
            ht.a.a(null, "AuthorizedViewersInviteDeclined");
            h hVarIa = authorizedViewersActivity.ia();
            hVarIa.f35094j = ge1.b.T(v1.a(hVarIa), hVarIa.f35088d.f22991c, null, new x(hVarIa, j8, hVarIa.f35094j, null), 2);
        }

        @Override // ei0.u0.b
        public final void c(u0.a aVar) throws Throwable {
            ge1.b.W(t13.h.f161748a, new a(aVar, AuthorizedViewersActivity.this, null));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f34993a;

        public d(b.g gVar) {
            this.f34993a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f34993a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f34994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f34995b;

        public e(e23.a aVar, b.g gVar) {
            this.f34994a = aVar;
            this.f34995b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f34994a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f34995b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public AuthorizedViewersActivity() {
        final int i14 = 0;
        this.f34975e = o13.m.b(new e23.a(this) { // from class: rg0.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthorizedViewersActivity f152597b;

            {
                this.f152597b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i15 = i14;
                AuthorizedViewersActivity authorizedViewersActivity = this.f152597b;
                switch (i15) {
                    case 0:
                        AuthorizedViewersActivity.a aVar = AuthorizedViewersActivity.f34974m;
                        return (RecyclerView) authorizedViewersActivity.findViewById(R.id.recycler_view);
                    case 1:
                        AuthorizedViewersActivity.a aVar2 = AuthorizedViewersActivity.f34974m;
                        Bundle extras = authorizedViewersActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                            }
                            hl.a aVar3 = (hl.a) parcelable;
                            if (aVar3 != null) {
                                return aVar3;
                            }
                        }
                        return hl.a.c.f84256b;
                    case 2:
                        AuthorizedViewersActivity.a aVar4 = AuthorizedViewersActivity.f34974m;
                        hl.a aVarHa = authorizedViewersActivity.ha();
                        hl.a.b bVar = aVarHa instanceof hl.a.b ? (hl.a.b) aVarHa : null;
                        if (bVar != null) {
                            return Long.valueOf(bVar.f84252b);
                        }
                        return null;
                    default:
                        AuthorizedViewersActivity.a aVar5 = AuthorizedViewersActivity.f34974m;
                        return new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h.a(authorizedViewersActivity.ha());
                }
            }
        });
        final int i15 = 1;
        this.f34976f = o13.m.b(new e23.a(this) { // from class: rg0.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthorizedViewersActivity f152597b;

            {
                this.f152597b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i16 = i15;
                AuthorizedViewersActivity authorizedViewersActivity = this.f152597b;
                switch (i16) {
                    case 0:
                        AuthorizedViewersActivity.a aVar = AuthorizedViewersActivity.f34974m;
                        return (RecyclerView) authorizedViewersActivity.findViewById(R.id.recycler_view);
                    case 1:
                        AuthorizedViewersActivity.a aVar2 = AuthorizedViewersActivity.f34974m;
                        Bundle extras = authorizedViewersActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                            }
                            hl.a aVar3 = (hl.a) parcelable;
                            if (aVar3 != null) {
                                return aVar3;
                            }
                        }
                        return hl.a.c.f84256b;
                    case 2:
                        AuthorizedViewersActivity.a aVar4 = AuthorizedViewersActivity.f34974m;
                        hl.a aVarHa = authorizedViewersActivity.ha();
                        hl.a.b bVar = aVarHa instanceof hl.a.b ? (hl.a.b) aVarHa : null;
                        if (bVar != null) {
                            return Long.valueOf(bVar.f84252b);
                        }
                        return null;
                    default:
                        AuthorizedViewersActivity.a aVar5 = AuthorizedViewersActivity.f34974m;
                        return new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h.a(authorizedViewersActivity.ha());
                }
            }
        });
        final int i16 = 2;
        o13.m.b(new e23.a(this) { // from class: rg0.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthorizedViewersActivity f152597b;

            {
                this.f152597b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i17 = i16;
                AuthorizedViewersActivity authorizedViewersActivity = this.f152597b;
                switch (i17) {
                    case 0:
                        AuthorizedViewersActivity.a aVar = AuthorizedViewersActivity.f34974m;
                        return (RecyclerView) authorizedViewersActivity.findViewById(R.id.recycler_view);
                    case 1:
                        AuthorizedViewersActivity.a aVar2 = AuthorizedViewersActivity.f34974m;
                        Bundle extras = authorizedViewersActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                            }
                            hl.a aVar3 = (hl.a) parcelable;
                            if (aVar3 != null) {
                                return aVar3;
                            }
                        }
                        return hl.a.c.f84256b;
                    case 2:
                        AuthorizedViewersActivity.a aVar4 = AuthorizedViewersActivity.f34974m;
                        hl.a aVarHa = authorizedViewersActivity.ha();
                        hl.a.b bVar = aVarHa instanceof hl.a.b ? (hl.a.b) aVarHa : null;
                        if (bVar != null) {
                            return Long.valueOf(bVar.f84252b);
                        }
                        return null;
                    default:
                        AuthorizedViewersActivity.a aVar5 = AuthorizedViewersActivity.f34974m;
                        return new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h.a(authorizedViewersActivity.ha());
                }
            }
        });
        final int i17 = 3;
        this.f34977g = new w1(s0.f105811a.b(h.class), new d(this), new e23.a(this) { // from class: rg0.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthorizedViewersActivity f152597b;

            {
                this.f152597b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i18 = i17;
                AuthorizedViewersActivity authorizedViewersActivity = this.f152597b;
                switch (i18) {
                    case 0:
                        AuthorizedViewersActivity.a aVar = AuthorizedViewersActivity.f34974m;
                        return (RecyclerView) authorizedViewersActivity.findViewById(R.id.recycler_view);
                    case 1:
                        AuthorizedViewersActivity.a aVar2 = AuthorizedViewersActivity.f34974m;
                        Bundle extras = authorizedViewersActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                            }
                            hl.a aVar3 = (hl.a) parcelable;
                            if (aVar3 != null) {
                                return aVar3;
                            }
                        }
                        return hl.a.c.f84256b;
                    case 2:
                        AuthorizedViewersActivity.a aVar4 = AuthorizedViewersActivity.f34974m;
                        hl.a aVarHa = authorizedViewersActivity.ha();
                        hl.a.b bVar = aVarHa instanceof hl.a.b ? (hl.a.b) aVarHa : null;
                        if (bVar != null) {
                            return Long.valueOf(bVar.f84252b);
                        }
                        return null;
                    default:
                        AuthorizedViewersActivity.a aVar5 = AuthorizedViewersActivity.f34974m;
                        return new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h.a(authorizedViewersActivity.ha());
                }
            }
        }, new e(null, this));
        this.f34978h = (ve0.b) KoinJavaComponent.get$default(ve0.b.class, null, null, 6, null);
        final int i18 = 0;
        this.f34980j = registerForActivityResult(new g.h(), new f.b(this) { // from class: rg0.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthorizedViewersActivity f152599b;

            {
                this.f152599b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Object serializableExtra;
                Intent intent2;
                Object serializableExtra2;
                int i19 = i18;
                AuthorizedViewersActivity authorizedViewersActivity = this.f152599b;
                f.a aVar = (f.a) obj;
                switch (i19) {
                    case 0:
                        AuthorizedViewersActivity.a aVar2 = AuthorizedViewersActivity.f34974m;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializableExtra = intent.getSerializableExtra("inviteResult", ue0.j.class);
                            } else {
                                Object serializableExtra3 = intent.getSerializableExtra("inviteResult");
                                if (!(serializableExtra3 instanceof ue0.j)) {
                                    serializableExtra3 = null;
                                }
                                serializableExtra = (ue0.j) serializableExtra3;
                            }
                            ue0.j jVar = (ue0.j) serializableExtra;
                            if (jVar != null) {
                                com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h hVarIa = authorizedViewersActivity.ia();
                                ge1.b.T(v1.a(hVarIa), null, null, new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.k(hVarIa, jVar, null), 3);
                                break;
                            }
                        }
                        break;
                    default:
                        AuthorizedViewersActivity.a aVar3 = AuthorizedViewersActivity.f34974m;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent2 = aVar.f67586b) != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializableExtra2 = intent2.getSerializableExtra("removedInviteKey", com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a.class);
                            } else {
                                Object serializableExtra4 = intent2.getSerializableExtra("removedInviteKey");
                                if (!(serializableExtra4 instanceof com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a)) {
                                    serializableExtra4 = null;
                                }
                                serializableExtra2 = (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a) serializableExtra4;
                            }
                            com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a aVar4 = (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a) serializableExtra2;
                            if (aVar4 != null) {
                                com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h hVarIa2 = authorizedViewersActivity.ia();
                                ge1.b.T(v1.a(hVarIa2), null, null, new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.l(hVarIa2, aVar4, null), 3);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final int i19 = 1;
        this.f34981k = registerForActivityResult(new g.h(), new f.b(this) { // from class: rg0.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthorizedViewersActivity f152599b;

            {
                this.f152599b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Object serializableExtra;
                Intent intent2;
                Object serializableExtra2;
                int i110 = i19;
                AuthorizedViewersActivity authorizedViewersActivity = this.f152599b;
                f.a aVar = (f.a) obj;
                switch (i110) {
                    case 0:
                        AuthorizedViewersActivity.a aVar2 = AuthorizedViewersActivity.f34974m;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializableExtra = intent.getSerializableExtra("inviteResult", ue0.j.class);
                            } else {
                                Object serializableExtra3 = intent.getSerializableExtra("inviteResult");
                                if (!(serializableExtra3 instanceof ue0.j)) {
                                    serializableExtra3 = null;
                                }
                                serializableExtra = (ue0.j) serializableExtra3;
                            }
                            ue0.j jVar = (ue0.j) serializableExtra;
                            if (jVar != null) {
                                com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h hVarIa = authorizedViewersActivity.ia();
                                ge1.b.T(v1.a(hVarIa), null, null, new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.k(hVarIa, jVar, null), 3);
                                break;
                            }
                        }
                        break;
                    default:
                        AuthorizedViewersActivity.a aVar3 = AuthorizedViewersActivity.f34974m;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent2 = aVar.f67586b) != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializableExtra2 = intent2.getSerializableExtra("removedInviteKey", com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a.class);
                            } else {
                                Object serializableExtra4 = intent2.getSerializableExtra("removedInviteKey");
                                if (!(serializableExtra4 instanceof com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a)) {
                                    serializableExtra4 = null;
                                }
                                serializableExtra2 = (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a) serializableExtra4;
                            }
                            com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a aVar4 = (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a) serializableExtra2;
                            if (aVar4 != null) {
                                com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h hVarIa2 = authorizedViewersActivity.ia();
                                ge1.b.T(v1.a(hVarIa2), null, null, new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.l(hVarIa2, aVar4, null), 3);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.f34982l = s3.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object fa(AuthorizedViewersActivity authorizedViewersActivity, ue0.d dVar, v13.c cVar) {
        q qVar;
        authorizedViewersActivity.getClass();
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f152603d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f152603d = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(authorizedViewersActivity, cVar);
            }
        } else {
            qVar = new q(authorizedViewersActivity, cVar);
        }
        Object objF4 = qVar.f152601b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f152603d;
        if (i15 == 0) {
            r.b(objF4);
            h hVarIa = authorizedViewersActivity.ia();
            Long userId = dVar.getUserId();
            qVar.f152600a = dVar;
            qVar.f152603d = 1;
            objF4 = hVarIa.F4(userId, qVar);
            if (objF4 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = qVar.f152600a;
            r.b(objF4);
        }
        f.c<Intent> cVar2 = authorizedViewersActivity.f34981k;
        AuthorizedViewerDetailActivity.a aVar2 = AuthorizedViewerDetailActivity.f34963c;
        hl.a aVarHa = authorizedViewersActivity.ha();
        aVar2.getClass();
        dVar.getClass();
        aVarHa.getClass();
        com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a aVar3 = new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a(dVar, (com.garmin.android.apps.connectmobile.userprofile.model.l) objF4);
        Intent intent = new Intent(authorizedViewersActivity, (Class<?>) AuthorizedViewerDetailActivity.class);
        intent.putExtra("userDataKey", aVar3);
        intent.putExtra("GCM_extra_screen_access_role", aVarHa);
        cVar2.a(intent, null);
        return Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.k0
    public final void da() {
        ia().G4();
    }

    public final RecyclerView ga() {
        Object value = this.f34975e.getValue();
        value.getClass();
        return (RecyclerView) value;
    }

    public final hl.a ha() {
        return (hl.a) this.f34976f.getValue();
    }

    public final h ia() {
        return (h) this.f34977g.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (ia().f35104v.get()) {
            setResult(-1);
        }
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_recycler_view_layout);
        initActionBar(true, getString(R.string.authorized_viewers));
        if (bundle == null) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "AuthorizedViewersFeatureOpened");
        }
        ComposeView composeView = (ComposeView) findViewById(R.id.managed_account_notice);
        hl.a aVarHa = ha();
        hl.a.b bVar = aVarHa instanceof hl.a.b ? (hl.a.b) aVarHa : null;
        if (bVar != null && (str = bVar.f84253c) != null) {
            composeView.getClass();
            composeView.setVisibility(0);
            composeView.setContent(new z3.e(1368854761, true, new f20.g(bVar, str, 3)));
        }
        this.f34979i = new g(this, ga(), new r22.a(this, 9), new c(), ha());
        ge1.b.T(f0.w(this), null, null, new rg0.r(this, null), 3);
        ge1.b.T(f0.w(this), null, null, new s(this, null), 3);
        ge1.b.T(f0.w(this), null, null, new rg0.t(this, null), 3);
        ge1.b.T(f0.w(this), null, null, new u(this, null), 3);
        if (ia().f35098n.getValue() == null) {
            ia().G4();
        }
        if (s3.b()) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "PageViewChildAuthorizedViewers");
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (this.f34982l) {
            return false;
        }
        hl.a aVarHa = ha();
        if (aVarHa instanceof hl.a.b) {
            return false;
        }
        if (aVarHa instanceof hl.a.c) {
            getMenuInflater().inflate(R.menu.menu_help, menu);
            return super.onCreateOptionsMenu(menu);
        }
        lc.u0.r();
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        if (ia().f35104v.get()) {
            setResult(-1);
        }
        return super.onNavigateUp();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.ACCOUNT_ACCESS, null, null, 12);
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/AuthorizedViewersActivity$a;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context) {
            hl.a.c cVar = hl.a.c.f84256b;
            aVar.getClass();
            context.getClass();
            cVar.getClass();
            Intent intent = new Intent(context, (Class<?>) AuthorizedViewersActivity.class);
            intent.putExtra("GCM_extra_screen_access_role", cVar);
            return intent;
        }

        private a() {
        }
    }
}

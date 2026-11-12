package com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.InviteAuthorizedUserActivity;
import com.garmin.android.apps.connectmobile.z1;
import d53.w;
import e23.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import lc.u0;
import o13.r;
import o13.t;
import o53.b0;
import o53.c2;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p3.p1;
import p3.x3;
import r53.p2;
import rg0.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0013²\u0006\u0014\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\u0014\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/InviteAuthorizedUserActivity;", "Lqg0/a;", "<init>", "()V", "a", "", "Lid1/c$e;", "displayModels", "Lhi0/a;", "selectedFollowing", "", "isPullToRefreshing", "showNoFriendView", "sendRequestEnabled", "", "queryWordCount", "Lfw/m;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/m$b;", "followingsResource", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InviteAuthorizedUserActivity extends qg0.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f34996q = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w1 f34997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ve0.b f34998k = (ve0.b) KoinJavaComponent.get$default(ve0.b.class, null, null, 6, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f34999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c2 f35000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35001n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f35002o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f.c<Intent> f35003p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.InviteAuthorizedUserActivity$onCreate$1$1$1$1", f = "InviteAuthorizedUserActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<fw.m<m.b>> f35005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f35006c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f35007d;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f35008a;

            static {
                int[] iArr = new int[fw.p.values().length];
                try {
                    iArr[fw.p.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fw.p.LOADING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[fw.p.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f35008a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x3<fw.m<m.b>> x3Var, p1<Boolean> p1Var, p1<Boolean> p1Var2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f35005b = x3Var;
            this.f35006c = p1Var;
            this.f35007d = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return InviteAuthorizedUserActivity.this.new b(this.f35005b, this.f35006c, this.f35007d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            m.b bVar;
            List<hi0.a> list;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = InviteAuthorizedUserActivity.f34996q;
            x3<fw.m<m.b>> x3Var = this.f35005b;
            fw.m<m.b> f182175a = x3Var.getF182175a();
            fw.p pVar = f182175a != null ? f182175a.f73769b : null;
            int i14 = pVar == null ? -1 : a.f35008a[pVar.ordinal()];
            if (i14 != -1) {
                p1<Boolean> p1Var = this.f35006c;
                InviteAuthorizedUserActivity inviteAuthorizedUserActivity = InviteAuthorizedUserActivity.this;
                if (i14 == 1) {
                    Boolean bool = Boolean.FALSE;
                    p1Var.setValue(bool);
                    inviteAuthorizedUserActivity.hideProgressOverlay();
                    fw.m<m.b> f182175a2 = x3Var.getF182175a();
                    p1<Boolean> p1Var2 = this.f35007d;
                    if (f182175a2 == null || (bVar = f182175a2.f73770c) == null || (list = bVar.f35165a) == null || !list.isEmpty()) {
                        p1Var2.setValue(bool);
                        inviteAuthorizedUserActivity.fa().f144664a.k(null, Boolean.TRUE);
                    } else {
                        if (!inviteAuthorizedUserActivity.f35002o) {
                            inviteAuthorizedUserActivity.f35002o = true;
                            ht.a.f85464a.getClass();
                            ht.a.a(null, "AuthorizedViewersNoConnectionsShown");
                        }
                        p1Var2.setValue(Boolean.TRUE);
                        inviteAuthorizedUserActivity.fa().f144664a.k(null, bool);
                    }
                } else if (i14 != 2) {
                    if (i14 != 3) {
                        u0.r();
                        return null;
                    }
                    p1Var.setValue(Boolean.FALSE);
                    inviteAuthorizedUserActivity.hideProgressOverlay();
                    inviteAuthorizedUserActivity.displayFailedMessage();
                } else if (!p1Var.getF182175a().booleanValue()) {
                    inviteAuthorizedUserActivity.showProgressOverlay();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.InviteAuthorizedUserActivity$onCreate$1$1$2$1", f = "InviteAuthorizedUserActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<hi0.a> f35009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f35010b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x3<hi0.a> x3Var, p1<Boolean> p1Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f35009a = x3Var;
            this.f35010b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f35009a, this.f35010b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = InviteAuthorizedUserActivity.f34996q;
            this.f35010b.setValue(Boolean.valueOf(this.f35009a.getF182175a() != null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.InviteAuthorizedUserActivity$onQueryTextChange$1", f = "InviteAuthorizedUserActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f35012b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f35012b = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return InviteAuthorizedUserActivity.this.new d(this.f35012b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = InviteAuthorizedUserActivity.f34996q;
            m mVarHa = InviteAuthorizedUserActivity.this.ha();
            ArrayList arrayList = mVarHa.f35159h;
            ReentrantLock reentrantLock = mVarHa.f35160i;
            reentrantLock.lock();
            try {
                p2 p2Var = mVarHa.f35158g;
                String str = this.f35012b;
                p2Var.k(null, str == null ? "" : str);
                if (str == null || str.length() == 0) {
                    mVarHa.z4(h0.b1(arrayList));
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        String str2 = ((ei0.u0.a) obj2).f64332c;
                        Locale locale = Locale.ROOT;
                        String lowerCase = str2.toLowerCase(locale);
                        lowerCase.getClass();
                        String lowerCase2 = str.toLowerCase(locale);
                        lowerCase2.getClass();
                        if (w.z(lowerCase, lowerCase2, false)) {
                            arrayList2.add(obj2);
                        }
                    }
                    mVarHa.z4(arrayList2);
                    Unit unit = Unit.INSTANCE;
                }
                reentrantLock.unlock();
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f35013a;

        public e(b.g gVar) {
            this.f35013a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f35013a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f35014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f35015b;

        public f(e23.a aVar, b.g gVar) {
            this.f35014a = aVar;
            this.f35015b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f35014a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f35015b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public InviteAuthorizedUserActivity() {
        final int i14 = 0;
        this.f34997j = new w1(s0.f105811a.b(m.class), new e(this), new e23.a(this) { // from class: rg0.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteAuthorizedUserActivity f152569b;

            {
                this.f152569b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                HashMap map;
                Object serializable;
                int i15 = i14;
                InviteAuthorizedUserActivity inviteAuthorizedUserActivity = this.f152569b;
                switch (i15) {
                    case 0:
                        InviteAuthorizedUserActivity.a aVar = InviteAuthorizedUserActivity.f34996q;
                        Bundle extras = inviteAuthorizedUserActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = extras.getSerializable("invitesKey", HashMap.class);
                            } else {
                                Object serializable2 = extras.getSerializable("invitesKey");
                                if (!(serializable2 instanceof HashMap)) {
                                    serializable2 = null;
                                }
                                serializable = (HashMap) serializable2;
                            }
                            map = (HashMap) serializable;
                        } else {
                            map = null;
                        }
                        HashMap map2 = map != null ? map : null;
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        return new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.m.c(map2);
                    default:
                        InviteAuthorizedUserActivity.a aVar2 = InviteAuthorizedUserActivity.f34996q;
                        return (ComposeView) inviteAuthorizedUserActivity.findViewById(R.id.friends_compose_view);
                }
            }
        }, new f(null, this));
        final int i15 = 1;
        this.f34999l = o13.m.b(new e23.a(this) { // from class: rg0.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteAuthorizedUserActivity f152569b;

            {
                this.f152569b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                HashMap map;
                Object serializable;
                int i16 = i15;
                InviteAuthorizedUserActivity inviteAuthorizedUserActivity = this.f152569b;
                switch (i16) {
                    case 0:
                        InviteAuthorizedUserActivity.a aVar = InviteAuthorizedUserActivity.f34996q;
                        Bundle extras = inviteAuthorizedUserActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = extras.getSerializable("invitesKey", HashMap.class);
                            } else {
                                Object serializable2 = extras.getSerializable("invitesKey");
                                if (!(serializable2 instanceof HashMap)) {
                                    serializable2 = null;
                                }
                                serializable = (HashMap) serializable2;
                            }
                            map = (HashMap) serializable;
                        } else {
                            map = null;
                        }
                        HashMap map2 = map != null ? map : null;
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        return new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.m.c(map2);
                    default:
                        InviteAuthorizedUserActivity.a aVar2 = InviteAuthorizedUserActivity.f34996q;
                        return (ComposeView) inviteAuthorizedUserActivity.findViewById(R.id.friends_compose_view);
                }
            }
        });
        final int i16 = 0;
        this.f35003p = registerForActivityResult(new g.h(), new f.b(this) { // from class: rg0.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteAuthorizedUserActivity f152573b;

            {
                this.f152573b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i17 = i16;
                InviteAuthorizedUserActivity inviteAuthorizedUserActivity = this.f152573b;
                f.a aVar = (f.a) obj;
                switch (i17) {
                    case 0:
                        InviteAuthorizedUserActivity.a aVar2 = InviteAuthorizedUserActivity.f34996q;
                        aVar.getClass();
                        int i18 = aVar.f67585a;
                        if (i18 != 0) {
                            inviteAuthorizedUserActivity.setResult(i18, aVar.f67586b);
                            inviteAuthorizedUserActivity.finish();
                            break;
                        }
                        break;
                    default:
                        InviteAuthorizedUserActivity.a aVar3 = InviteAuthorizedUserActivity.f34996q;
                        aVar.getClass();
                        inviteAuthorizedUserActivity.ha().x4();
                        break;
                }
            }
        });
        final int i17 = 1;
        registerForActivityResult(new g.h(), new f.b(this) { // from class: rg0.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteAuthorizedUserActivity f152573b;

            {
                this.f152573b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i18 = i17;
                InviteAuthorizedUserActivity inviteAuthorizedUserActivity = this.f152573b;
                f.a aVar = (f.a) obj;
                switch (i18) {
                    case 0:
                        InviteAuthorizedUserActivity.a aVar2 = InviteAuthorizedUserActivity.f34996q;
                        aVar.getClass();
                        int i19 = aVar.f67585a;
                        if (i19 != 0) {
                            inviteAuthorizedUserActivity.setResult(i19, aVar.f67586b);
                            inviteAuthorizedUserActivity.finish();
                            break;
                        }
                        break;
                    default:
                        InviteAuthorizedUserActivity.a aVar3 = InviteAuthorizedUserActivity.f34996q;
                        aVar.getClass();
                        inviteAuthorizedUserActivity.ha().x4();
                        break;
                }
            }
        });
    }

    @Override // com.garmin.android.apps.connectmobile.k0
    public final void da() {
        if (this.f35001n) {
            ca();
        } else {
            ha().x4();
        }
    }

    @Override // qg0.a
    public final void ga() {
        this.f35001n = false;
        c2 c2Var = this.f35000m;
        if (c2Var != null) {
            c2Var.c(null);
        }
        m mVarHa = ha();
        ReentrantLock reentrantLock = mVarHa.f35160i;
        reentrantLock.lock();
        try {
            mVarHa.z4(h0.b1(mVarHa.f35159h));
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final m ha() {
        return (m) this.f34997j.getValue();
    }

    @Override // qg0.a, androidx.appcompat.widget.SearchView.m
    public final boolean l5(String str) {
        this.f35001n = true;
        c2 c2Var = this.f35000m;
        if (c2Var != null) {
            c2Var.c(null);
        }
        this.f35000m = ge1.b.T(f0.w(this), null, null, new d(str, null), 3);
        return true;
    }

    @Override // qg0.a, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_invite_authorized_viewer);
        ea(false);
        initActionBar(true, R.string.add_authorized_viewer);
        setTitleMaxLines(z1.DEFAULT_TITLE_MAX_LINE);
        this.f35002o = bundle != null ? bundle.getBoolean("loggedEmptyStateKey") : false;
        Object value = this.f34999l.getValue();
        value.getClass();
        ((ComposeView) value).setContent(new z3.e(614174270, true, new l0(this, 0)));
        ha().x4();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("loggedEmptyStateKey", this.f35002o);
        super.onSaveInstanceState(bundle);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/InviteAuthorizedUserActivity$a;", "", "<init>", "()V", "", "INVITE_RESULT_KEY", "Ljava/lang/String;", "INVITES_KEY", "LOGGED_EMPTY_STATE_KEY", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

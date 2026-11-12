package com.garmin.android.library.mobileauth.ui.mfa;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag;
import java.net.URI;
import java.util.Set;
import lc.u0;
import o13.p;
import o13.r;
import o53.b0;
import o53.c0;
import o53.f0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import re2.g0;
import re2.l0;
import sc2.q;
import u53.o;
import v13.i;
import vb.h;
import xe2.i0;
import ze2.l;
import ze2.m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/mfa/a;", "Lcom/garmin/android/library/mobileauth/ui/a;", "", "Lsc2/g;", "systemType", "<init>", "(Lsc2/g;)V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a extends com.garmin.android.library.mobileauth.ui.a implements com.garmin.android.library.mobileauth.ui.b {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sc2.g f50493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f50494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public sc2.f f50495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f50496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Logger f50497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public URI f50498r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1007a.EnumC1008a f50499t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f50500v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AlertDialog f50501w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ve2.d f50502x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ve2.e f50503y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p<? extends sc2.a, String> f50504z;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f50511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f50512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f50513d;

        static {
            int[] iArr = new int[C1007a.EnumC1008a.values().length];
            try {
                iArr[C1007a.EnumC1008a.f50505b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1007a.EnumC1008a.f50506c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C1007a.EnumC1008a.f50507d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f50510a = iArr;
            int[] iArr2 = new int[i0.values().length];
            try {
                iArr2[i0.MFA_FLOW_NO_USER_INTERACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[i0.MFA_FLOW_WEB.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f50511b = iArr2;
            int[] iArr3 = new int[q.values().length];
            try {
                iArr3[q.OAUTH2_IT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[q.OAUTH1_GC.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[q.OAUTH2_DI.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f50512c = iArr3;
            int[] iArr4 = new int[sc2.g.values().length];
            try {
                iArr4[sc2.g.PORTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[sc2.g.CAS.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f50513d = iArr4;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.AbstractMFAFlowActivity$onBackPressed$1", f = "AbstractMFAFlowActivity.kt", l = {156}, m = "invokeSuspend")
    public static final class c extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50514a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50514a;
            if (i14 == 0) {
                r.b(obj);
                this.f50514a = 1;
                if (a.this.fa(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.AbstractMFAFlowActivity$onBackPressed$2$1", f = "AbstractMFAFlowActivity.kt", l = {164}, m = "invokeSuspend")
    public static final class d extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50516a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50516a;
            if (i14 == 0) {
                r.b(obj);
                this.f50516a = 1;
                if (a.this.fa(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.AbstractMFAFlowActivity$onCreate$1", f = "AbstractMFAFlowActivity.kt", l = {84}, m = "invokeSuspend")
    public static final class e extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50518a;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50518a;
            if (i14 == 0) {
                r.b(obj);
                l lVar = l.NO_NETWORK_CONNECTION;
                this.f50518a = 1;
                if (a.ha(a.this, lVar, this, 5) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.AbstractMFAFlowActivity$onCreate$2", f = "AbstractMFAFlowActivity.kt", l = {88}, m = "invokeSuspend")
    public static final class f extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50520a;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50520a;
            if (i14 == 0) {
                r.b(obj);
                this.f50520a = 1;
                int i15 = a.A;
                a aVar = a.this;
                aVar.getClass();
                x53.c cVar = s0.f129406a;
                Object objE0 = ge1.b.e0(o.f168762a, new ze2.a(aVar, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.AbstractMFAFlowActivity$onCreate$3$1", f = "AbstractMFAFlowActivity.kt", l = {119, 121, 123, 127}, m = "invokeSuspend")
    public static final class g extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f50522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f50524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f50525d;

        public g(t13.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            g gVar = a.this.new g(dVar);
            gVar.f50525d = obj;
            return gVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x009c  */
        /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
        
            if (r11 == r0) goto L36;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            b0 b0Var;
            b0 b0Var2;
            a aVar;
            int i14;
            Object objE0;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f50524c;
            a aVar3 = a.this;
            int i16 = 0;
            int i17 = 1;
            if (i15 == 0) {
                r.b(obj);
                b0 b0Var3 = (b0) this.f50525d;
                re2.b bVar = re2.b.f152215a;
                this.f50525d = b0Var3;
                this.f50523b = 1;
                this.f50524c = 1;
                bVar.getClass();
                Object objY = re2.b.y(false, this);
                if (objY != aVar2) {
                    b0Var = b0Var3;
                    obj = objY;
                }
                return aVar2;
            }
            if (i15 == 1) {
                i17 = this.f50523b;
                b0Var = (b0) this.f50525d;
                r.b(obj);
            } else if (i15 == 2) {
                i16 = this.f50523b;
                b0Var = (b0) this.f50525d;
                r.b(obj);
                if (i16 != 0) {
                    this.f50525d = null;
                    this.f50522a = null;
                    this.f50524c = 4;
                    int i18 = a.A;
                    aVar3.getClass();
                    x53.c cVar = s0.f129406a;
                    objE0 = ge1.b.e0(o.f168762a, new com.garmin.android.library.mobileauth.ui.mfa.b(aVar3, null), this);
                    if (objE0 != aVar2) {
                        objE0 = Unit.INSTANCE;
                    }
                }
            } else if (i15 == 3) {
                i14 = this.f50523b;
                aVar = this.f50522a;
                b0Var2 = (b0) this.f50525d;
                r.b(obj);
                obj.getClass();
                aVar.getClass();
                aVar.f50502x = (ve2.d) obj;
                i16 = i14;
                b0Var = b0Var2;
                if (i16 != 0 && c0.g(b0Var)) {
                    this.f50525d = null;
                    this.f50522a = null;
                    this.f50524c = 4;
                    int i19 = a.A;
                    aVar3.getClass();
                    x53.c cVar2 = s0.f129406a;
                    objE0 = ge1.b.e0(o.f168762a, new com.garmin.android.library.mobileauth.ui.mfa.b(aVar3, null), this);
                    if (objE0 != aVar2) {
                        objE0 = Unit.INSTANCE;
                    }
                }
            } else {
                if (i15 != 4) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            if (((Boolean) obj).booleanValue()) {
                re2.b bVar2 = re2.b.f152215a;
                this.f50525d = b0Var;
                this.f50522a = aVar3;
                this.f50523b = i17;
                this.f50524c = 3;
                bVar2.getClass();
                obj = re2.b.j(this);
                if (obj != aVar2) {
                    b0Var2 = b0Var;
                    aVar = aVar3;
                    i14 = i17;
                    obj.getClass();
                    aVar.getClass();
                    aVar.f50502x = (ve2.d) obj;
                    i16 = i14;
                    b0Var = b0Var2;
                    if (i16 != 0) {
                        this.f50525d = null;
                        this.f50522a = null;
                        this.f50524c = 4;
                        int i110 = a.A;
                        aVar3.getClass();
                        x53.c cVar3 = s0.f129406a;
                        objE0 = ge1.b.e0(o.f168762a, new com.garmin.android.library.mobileauth.ui.mfa.b(aVar3, null), this);
                        if (objE0 != aVar2) {
                            objE0 = Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
            } else {
                l lVar = l.NO_USER_SIGNED_IN;
                this.f50525d = b0Var;
                this.f50523b = 0;
                this.f50524c = 2;
                if (a.ha(aVar3, lVar, this, 5) != aVar2) {
                    if (i16 != 0) {
                        this.f50525d = null;
                        this.f50522a = null;
                        this.f50524c = 4;
                        int i111 = a.A;
                        aVar3.getClass();
                        x53.c cVar4 = s0.f129406a;
                        objE0 = ge1.b.e0(o.f168762a, new com.garmin.android.library.mobileauth.ui.mfa.b(aVar3, null), this);
                        if (objE0 != aVar2) {
                            objE0 = Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            return aVar2;
        }
    }

    static {
        new C1007a(null);
    }

    public a(sc2.g gVar) {
        gVar.getClass();
        this.f50493m = gVar;
        this.f50494n = -1;
        l0 l0Var = l0.f152316a;
        String str = gVar.f158504a + "FlowActivity";
        l0Var.getClass();
        Logger logger = LoggerFactory.getLogger("MA#MFA#".concat(str));
        logger.getClass();
        this.f50497q = logger;
    }

    public static final Object W9(a aVar, String str, URI uri, i iVar) throws Throwable {
        aVar.getClass();
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(o.f168762a, new ze2.e(aVar, str, uri, null), iVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    public static /* synthetic */ Object ha(a aVar, l lVar, i iVar, int i14) {
        return aVar.ga((i14 & 1) != 0 ? "" : "onPortalSessionExpired", lVar, null, iVar);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void B0() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void D3() {
    }

    public void F1() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final Object K6(i iVar) {
        return Boolean.FALSE;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final Object L7(v13.c cVar) {
        return null;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void N8() {
    }

    public void R4() {
    }

    public final void X9(String str) {
        this.f50497q.debug("exchangeTicketForTokens");
        da(C1007a.EnumC1008a.f50507d);
        sc2.f fVar = this.f50495o;
        fVar.getClass();
        sc2.h hVar = new sc2.h(fVar.f158499b, str);
        sc2.f fVar2 = this.f50495o;
        fVar2.getClass();
        int i14 = b.f50512c[fVar2.f158500c.ordinal()];
        if (i14 == 1) {
            androidx.lifecycle.i0 i0VarW = f0.w(this);
            x53.c cVar = s0.f129406a;
            ge1.b.T(i0VarW, x53.b.f189152a, null, new ze2.i(this, hVar, null), 2);
        } else if (i14 == 2) {
            androidx.lifecycle.i0 i0VarW2 = f0.w(this);
            x53.c cVar2 = s0.f129406a;
            ge1.b.T(i0VarW2, x53.b.f189152a, null, new ze2.h(this, hVar, null), 2);
        } else {
            if (i14 != 3) {
                u0.r();
                return;
            }
            androidx.lifecycle.i0 i0VarW3 = f0.w(this);
            x53.c cVar3 = s0.f129406a;
            ge1.b.T(i0VarW3, x53.b.f189152a, null, new ze2.g(this, hVar, null), 2);
        }
    }

    public void Y3(WebView webView, String str, String str2) {
        str2.getClass();
        T9();
        ea("onWebViewPageFinishedLoading", str);
    }

    public abstract Object Y9(URI uri, String str, p pVar, i iVar);

    public final ve2.d Z9() {
        ve2.d dVar = this.f50502x;
        if (dVar != null) {
            return dVar;
        }
        s.m("classScopedGarminAccount");
        throw null;
    }

    public abstract String aa();

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void b4() {
    }

    public final ve2.e ba() {
        ve2.e eVar = this.f50503y;
        if (eVar != null) {
            return eVar;
        }
        s.m("environment");
        throw null;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final Set<Integer> c1() {
        return this.f50421j;
    }

    public abstract String ca();

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final boolean d7() {
        return false;
    }

    public final void da(C1007a.EnumC1008a enumC1008a) {
        Fragment mVar;
        i0 i0Var = enumC1008a.f50509a;
        int i14 = b.f50511b[i0Var.ordinal()];
        if (i14 == 1) {
            mVar = new m();
        } else if (i14 != 2) {
            com.airbnb.lottie.animation.keyframe.a.z("unknown fragment type [", i0Var.name(), "]", this.f50497q);
            mVar = null;
        } else {
            int i15 = b.f50513d[this.f50493m.ordinal()];
            if (i15 == 1) {
                com.garmin.android.library.mobileauth.ui.mfa.e.a aVar = com.garmin.android.library.mobileauth.ui.mfa.e.f50535e;
                sc2.f fVar = this.f50495o;
                fVar.getClass();
                String str = fVar.f158498a;
                boolean z14 = this.f50496p;
                String strName = ba().name();
                aVar.getClass();
                strName.getClass();
                mVar = new com.garmin.android.library.mobileauth.ui.mfa.e();
                Bundle bundle = new Bundle(3);
                bundle.putString("login.token", str);
                bundle.putBoolean("permanent.mfa", z14);
                bundle.putString("environment", strName);
                mVar.setArguments(bundle);
            } else {
                if (i15 != 2) {
                    u0.r();
                    return;
                }
                com.garmin.android.library.mobileauth.ui.mfa.d.a aVar2 = com.garmin.android.library.mobileauth.ui.mfa.d.f50534a;
                sc2.f fVar2 = this.f50495o;
                fVar2.getClass();
                String str2 = fVar2.f158498a;
                boolean z15 = this.f50496p;
                String strCa = ca();
                aVar2.getClass();
                mVar = new com.garmin.android.library.mobileauth.ui.mfa.d();
                Bundle bundle2 = new Bundle(2);
                bundle2.putString("loginToken", str2);
                bundle2.putString("service", strCa);
                bundle2.putBoolean("permanentMFA", z15);
                mVar.setArguments(bundle2);
            }
        }
        if (mVar != null) {
            U9(mVar, i0Var.name(), i0Var);
            this.f50499t = enumC1008a;
        }
    }

    public final void ea(String str, String str2) {
        this.f50497q.debug(str + ": " + str2);
    }

    public final Object fa(i iVar) throws Throwable {
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(o.f168762a, new ze2.c(this, null), iVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    public final Object ga(String str, l lVar, String str2, i iVar) throws Throwable {
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(o.f168762a, new ze2.d(this, lVar, str2, str, null), iVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    public final Object ia(int i14, Intent intent, i iVar) throws Throwable {
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(o.f168762a, new ze2.f(this, i14, intent, null), iVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void j3(bf2.b bVar) {
        bVar.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void k3(com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a enumC1005a, String str) {
        enumC1005a.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void n6(int i14) {
        this.f50494n = i14;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void n7(WebView webView, String str, String str2) {
        str2.getClass();
        V9();
        ea("onWebViewPageStartedLoading", str);
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void o0(com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a enumC1005a) {
        enumC1005a.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void o1(boolean z14) {
    }

    @Override // b.g, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onBackPressed() {
        C1007a.EnumC1008a enumC1008a = this.f50499t;
        int i14 = enumC1008a == null ? -1 : b.f50510a[enumC1008a.ordinal()];
        if (i14 == -1 || i14 == 1) {
            androidx.lifecycle.i0 i0VarW = f0.w(this);
            x53.c cVar = s0.f129406a;
            ge1.b.T(i0VarW, o.f168762a, null, new c(null), 2);
        } else {
            if (i14 != 2) {
                if (i14 == 3) {
                    return;
                }
                u0.r();
                return;
            }
            Fragment fragmentG = getSupportFragmentManager().G("MFA_FLOW_WEB");
            if (fragmentG == null || ((MobileAuthAbstractWebFrag) fragmentG).onBackPressedHandled$mobile_auth_release()) {
                return;
            }
            androidx.lifecycle.i0 i0VarW2 = f0.w(this);
            x53.c cVar2 = s0.f129406a;
            ge1.b.T(i0VarW2, o.f168762a, null, new d(null), 2);
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.a, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l0 l0Var = l0.f152316a;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        l0Var.getClass();
        if (!l0.e(applicationContext)) {
            androidx.lifecycle.i0 i0VarW = f0.w(this);
            x53.c cVar = s0.f129406a;
            ge1.b.T(i0VarW, o.f168762a, null, new e(null), 2);
            return;
        }
        if (!g0.a(this)) {
            androidx.lifecycle.i0 i0VarW2 = f0.w(this);
            x53.c cVar2 = s0.f129406a;
            ge1.b.T(i0VarW2, o.f168762a, null, new f(null), 2);
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            kg.f.n("must be called with either 'buildIntent' or 'buildAutoLoginURIIntent'");
            return;
        }
        String string = extras.getString("environment.enum.name");
        string.getClass();
        ve2.e eVarValueOf = ve2.e.valueOf(string);
        eVarValueOf.getClass();
        this.f50503y = eVarValueOf;
        String string2 = extras.getString("credential.type.enum.name");
        string2.getClass();
        sc2.a aVarValueOf = sc2.a.valueOf(string2);
        String string3 = extras.getString("credential.access.token");
        string3.getClass();
        this.f50504z = new p<>(aVarValueOf, string3);
        this.f50496p = extras.getBoolean("permanent.mfa", false);
        if (extras.containsKey("auto.login.uri")) {
            this.f50498r = new URI(extras.getString("auto.login.uri"));
        }
        if (extras.containsKey("auto.login.sso.portal.client.id")) {
            this.f50500v = extras.getString("auto.login.sso.portal.client.id");
        }
        re2.b.f152215a.getClass();
        if (re2.b.m().K) {
            getWindow().setFlags(8192, 8192);
        }
        androidx.lifecycle.i0 i0VarW3 = f0.w(this);
        x53.c cVar3 = s0.f129406a;
        ge1.b.T(i0VarW3, x53.b.f189152a, null, new g(null), 2);
    }

    @Override // com.garmin.android.library.mobileauth.ui.a, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f50497q.debug("onPause");
        AlertDialog alertDialog = this.f50501w;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.f50501w = null;
    }

    @Override // com.garmin.android.library.mobileauth.ui.a, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f50497q.debug("onResume");
    }

    @Override // com.garmin.android.library.mobileauth.ui.a, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.f50497q.debug("onStop");
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void p1() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void p9(WebView webView, String str, String str2) {
        str2.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    /* JADX INFO: renamed from: r9 */
    public final ve2.s getF50349r() {
        return null;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void s1() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void t2() {
    }

    public void t5() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    /* JADX INFO: renamed from: u7, reason: from getter */
    public final int getF50494n() {
        return this.f50494n;
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void w2() {
    }

    public void w6(sc2.h hVar) {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void y0() {
    }

    @Override // com.garmin.android.library.mobileauth.ui.b
    public final void y1() {
    }

    /* JADX INFO: renamed from: com.garmin.android.library.mobileauth.ui.mfa.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/mfa/a$a;", "", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1007a {

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
        	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
        	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
        	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
         */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX INFO: renamed from: com.garmin.android.library.mobileauth.ui.mfa.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/mfa/a$a$a;", "", "Lxe2/i0;", "associatedFragmentType", "<init>", "(Ljava/lang/String;ILxe2/i0;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class EnumC1008a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final EnumC1008a f50505b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final EnumC1008a f50506c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final EnumC1008a f50507d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ EnumC1008a[] f50508e;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final i0 f50509a;

            static {
                i0 i0Var = i0.MFA_FLOW_NO_USER_INTERACTION;
                EnumC1008a enumC1008a = new EnumC1008a("STEP_1", 0, i0Var);
                f50505b = enumC1008a;
                EnumC1008a enumC1008a2 = new EnumC1008a("STEP_2", 1, i0.MFA_FLOW_WEB);
                f50506c = enumC1008a2;
                EnumC1008a enumC1008a3 = new EnumC1008a("STEP_3", 2, i0Var);
                f50507d = enumC1008a3;
                f50508e = new EnumC1008a[]{enumC1008a, enumC1008a2, enumC1008a3};
            }

            private EnumC1008a(String str, int i14, i0 i0Var) {
                super(str, i14);
                this.f50509a = i0Var;
            }

            public static EnumC1008a valueOf(String str) {
                return (EnumC1008a) Enum.valueOf(EnumC1008a.class, str);
            }

            public static EnumC1008a[] values() {
                return (EnumC1008a[]) f50508e.clone();
            }
        }

        public /* synthetic */ C1007a(j jVar) {
            this();
        }

        private C1007a() {
        }
    }
}

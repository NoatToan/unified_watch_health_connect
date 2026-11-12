package com.garmin.android.apps.connectmobile.consent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.h1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.consent.DataConsentActivity;
import e23.p;
import f12.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import o13.m;
import o13.n;
import o13.r;
import o13.t;
import o53.b0;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import q92.x;
import r53.j;
import r53.p2;
import r53.s;
import v13.i;
import vb.h;
import z10.a2;
import z10.l0;
import z10.o1;
import z10.p1;
import z10.s1;
import z10.t1;
import z10.u1;
import z10.v1;
import z10.x1;
import z10.z1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/DataConsentActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DataConsentActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f32169h = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32172c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f32174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<Intent> f32175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.c<Intent> f32176g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f32170a = m.b(new p1(this, 0));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f32171b = m.b(new p1(this, 1));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f32173d = m.a(n.NONE, new d(this, null, null, null));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.consent.DataConsentActivity$onCreate$1", f = "DataConsentActivity.kt", l = {73}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32177a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Set<String> f32179c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.consent.DataConsentActivity$onCreate$1$1", f = "DataConsentActivity.kt", l = {74}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f32180a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DataConsentActivity f32181b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Set<String> f32182c;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.consent.DataConsentActivity$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0522a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ DataConsentActivity f32183a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Set<String> f32184b;

                public C0522a(DataConsentActivity dataConsentActivity, Set<String> set) {
                    this.f32183a = dataConsentActivity;
                    this.f32184b = set;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    a2 a2Var = (a2) obj;
                    if (a2Var == null) {
                        return Unit.INSTANCE;
                    }
                    DataConsentActivity dataConsentActivity = this.f32183a;
                    f.c<Intent> cVar = dataConsentActivity.f32175f;
                    f.c<Intent> cVar2 = dataConsentActivity.f32176g;
                    hl.a aVarDa = dataConsentActivity.da();
                    List<x> list = e.f32282a;
                    cVar.getClass();
                    cVar2.getClass();
                    aVarDa.getClass();
                    Set<String> set = this.f32184b;
                    set.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int i14 = 0;
                    linkedHashMap.put(com.garmin.android.apps.connectmobile.consent.d.f32265g, new t1(cVar2, dataConsentActivity, aVarDa, i14));
                    hl.a.c cVar3 = hl.a.c.f84256b;
                    if (aVarDa.equals(cVar3)) {
                        linkedHashMap.put(com.garmin.android.apps.connectmobile.consent.d.f32266h, new u1(dataConsentActivity, cVar, i14));
                    }
                    if (a2Var.f200884b) {
                        linkedHashMap.put(com.garmin.android.apps.connectmobile.consent.d.f32267i, new t1(cVar, dataConsentActivity, aVarDa, 1));
                    }
                    int i15 = 2;
                    if (a2Var.f200885c) {
                        linkedHashMap.put(com.garmin.android.apps.connectmobile.consent.d.f32268j, new t1(cVar, dataConsentActivity, aVarDa, i15));
                    }
                    int i16 = 3;
                    if (a2Var.f200883a) {
                        linkedHashMap.put(com.garmin.android.apps.connectmobile.consent.d.f32269k, new t1(cVar, dataConsentActivity, aVarDa, i16));
                    }
                    if (!set.contains("ROLE_USER_MANAGED_ACCOUNTS_CHILD") && aVarDa.equals(cVar3)) {
                        linkedHashMap.put(com.garmin.android.apps.connectmobile.consent.d.f32270l, new u1(cVar, dataConsentActivity));
                        linkedHashMap.put(com.garmin.android.apps.connectmobile.consent.d.f32271m, new u1(dataConsentActivity, cVar, i15));
                    }
                    linkedHashMap.put(com.garmin.android.apps.connectmobile.consent.d.f32272n, new t1(aVarDa, cVar, dataConsentActivity));
                    if (!set.contains("ROLE_USER_MANAGED_ACCOUNTS_CHILD") && aVarDa.equals(cVar3)) {
                        linkedHashMap.put(com.garmin.android.apps.connectmobile.consent.d.f32273o, new u1(dataConsentActivity, cVar, i16));
                    }
                    if (a2Var.f200886d) {
                        linkedHashMap.put(com.garmin.android.apps.connectmobile.consent.d.f32274p, new t1(cVar, dataConsentActivity, aVarDa, 5));
                    }
                    TreeMap treeMap = new TreeMap(new v1());
                    treeMap.putAll(linkedHashMap);
                    z1 z1VarEa = dataConsentActivity.ea();
                    hl.a aVarDa2 = dataConsentActivity.da();
                    z1VarEa.getClass();
                    aVarDa2.getClass();
                    p2 p2Var = z1VarEa.f201346g;
                    while (true) {
                        Object value = p2Var.getValue();
                        TreeMap treeMap2 = treeMap;
                        if (p2Var.b(value, s1.a((s1) value, false, false, false, false, treeMap2, null, 47))) {
                            break;
                        }
                        treeMap = treeMap2;
                    }
                    ge1.b.T(androidx.lifecycle.v1.a(z1VarEa), null, null, new x1(z1VarEa, null), 3);
                    if (aVarDa2 instanceof hl.a.b) {
                        z1VarEa.x4(((hl.a.b) aVarDa2).f84252b);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DataConsentActivity dataConsentActivity, Set<String> set, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f32181b = dataConsentActivity;
                this.f32182c = set;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f32181b, this.f32182c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.consent.DataConsentActivity$b$a for r6v1 'this'  t13.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    u13.a r0 = u13.a.COROUTINE_SUSPENDED
                    int r1 = r6.f32180a
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L14
                    if (r1 == r3) goto L10
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r7)
                    return r2
                L10:
                    o13.r.b(r7)
                    goto L37
                L14:
                    o13.r.b(r7)
                    com.garmin.android.apps.connectmobile.consent.DataConsentActivity$a r7 = com.garmin.android.apps.connectmobile.consent.DataConsentActivity.f32169h
                    com.garmin.android.apps.connectmobile.consent.DataConsentActivity r7 = r6.f32181b
                    z10.z1 r1 = r7.ea()
                    r53.p2 r1 = r1.f201345f
                    r53.b2 r1 = r53.s.d(r1)
                    com.garmin.android.apps.connectmobile.consent.DataConsentActivity$b$a$a r4 = new com.garmin.android.apps.connectmobile.consent.DataConsentActivity$b$a$a
                    java.util.Set<java.lang.String> r5 = r6.f32182c
                    r4.<init>(r7, r5)
                    r6.f32180a = r3
                    r53.o2<T> r7 = r1.f150540a
                    java.lang.Object r7 = r7.collect(r4, r6)
                    if (r7 != r0) goto L37
                    return r0
                L37:
                    o2.c.f()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.consent.DataConsentActivity.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set<String> set, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f32179c = set;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return DataConsentActivity.this.new b(this.f32179c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f32177a;
            if (i14 == 0) {
                r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.RESUMED;
                Set<String> set = this.f32179c;
                DataConsentActivity dataConsentActivity = DataConsentActivity.this;
                a aVar2 = new a(dataConsentActivity, set, null);
                this.f32177a = 1;
                if (h1.b(dataConsentActivity, bVar, aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.consent.DataConsentActivity$onCreate$2", f = "DataConsentActivity.kt", l = {87}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32185a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.consent.DataConsentActivity$onCreate$2$1", f = "DataConsentActivity.kt", l = {88}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f32187a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DataConsentActivity f32188b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.consent.DataConsentActivity$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0523a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ DataConsentActivity f32189a;

                public C0523a(DataConsentActivity dataConsentActivity) {
                    this.f32189a = dataConsentActivity;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    T next;
                    e23.a aVar;
                    s1 s1Var = (s1) obj;
                    if (!s1Var.f201239a) {
                        DataConsentActivity dataConsentActivity = this.f32189a;
                        if (!dataConsentActivity.f32172c) {
                            com.garmin.android.apps.connectmobile.consent.d dVar2 = (com.garmin.android.apps.connectmobile.consent.d) dataConsentActivity.f32171b.getValue();
                            if (dVar2 == null) {
                                return Unit.INSTANCE;
                            }
                            dataConsentActivity.f32172c = true;
                            Iterator<T> it = s1Var.f201243e.entrySet().iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (((Map.Entry) next).getKey() != dVar2);
                            Map.Entry entry = (Map.Entry) next;
                            if (entry == null || (aVar = (e23.a) entry.getValue()) == null) {
                                return Unit.INSTANCE;
                            }
                            aVar.invoke();
                            Unit unit = Unit.INSTANCE;
                            dataConsentActivity.finish();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DataConsentActivity dataConsentActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f32188b = dataConsentActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f32188b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.consent.DataConsentActivity$c$a for r5v1 'this'  t13.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    u13.a r0 = u13.a.COROUTINE_SUSPENDED
                    int r1 = r5.f32187a
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L14
                    if (r1 == r3) goto L10
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r6)
                    return r2
                L10:
                    o13.r.b(r6)
                    goto L35
                L14:
                    o13.r.b(r6)
                    com.garmin.android.apps.connectmobile.consent.DataConsentActivity$a r6 = com.garmin.android.apps.connectmobile.consent.DataConsentActivity.f32169h
                    com.garmin.android.apps.connectmobile.consent.DataConsentActivity r6 = r5.f32188b
                    z10.z1 r1 = r6.ea()
                    r53.p2 r1 = r1.f201346g
                    r53.b2 r1 = r53.s.d(r1)
                    com.garmin.android.apps.connectmobile.consent.DataConsentActivity$c$a$a r4 = new com.garmin.android.apps.connectmobile.consent.DataConsentActivity$c$a$a
                    r4.<init>(r6)
                    r5.f32187a = r3
                    r53.o2<T> r6 = r1.f150540a
                    java.lang.Object r6 = r6.collect(r4, r5)
                    if (r6 != r0) goto L35
                    return r0
                L35:
                    o2.c.f()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.consent.DataConsentActivity.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return DataConsentActivity.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f32185a;
            if (i14 == 0) {
                r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.RESUMED;
                DataConsentActivity dataConsentActivity = DataConsentActivity.this;
                a aVar2 = new a(dataConsentActivity, null);
                this.f32185a = 1;
                if (h1.b(dataConsentActivity, bVar, aVar2, this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<z1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f32190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f32191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f32192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f32193d;

        public d(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f32190a = gVar;
            this.f32191b = qualifier;
            this.f32192c = aVar;
            this.f32193d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, z10.z1] */
        @Override // e23.a
        public final z1 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f32190a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f32192c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(z1.class), viewModelStore, null, defaultViewModelCreationExtras, this.f32191b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f32193d, 4, null);
        }
    }

    public DataConsentActivity() {
        l.f68084a.getClass();
        this.f32174e = l.a.a();
        final int i14 = 0;
        this.f32175f = registerForActivityResult(new g.h(), new f.b(this) { // from class: z10.q1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DataConsentActivity f201217b;

            {
                this.f201217b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i15 = i14;
                DataConsentActivity dataConsentActivity = this.f201217b;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        DataConsentActivity.a aVar2 = DataConsentActivity.f32169h;
                        aVar.getClass();
                        boolean zIsEmpty = ((s1) r53.s.d(dataConsentActivity.ea().f201346g).f150540a.getValue()).f201244f.isEmpty();
                        if ((dataConsentActivity.da() instanceof hl.a.b) && !zIsEmpty) {
                            z1 z1VarEa = dataConsentActivity.ea();
                            hl.a aVarDa = dataConsentActivity.da();
                            aVarDa.getClass();
                            z1VarEa.x4(((hl.a.b) aVarDa).f84252b);
                            break;
                        }
                        break;
                    default:
                        DataConsentActivity.a aVar3 = DataConsentActivity.f32169h;
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        d1 d1Var = d1.f200951a;
                        if (intent != null ? intent.getBooleanExtra("extra_data_deletion_dialog", false) : false) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("extra_data_deletion_dialog", true);
                            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                            com.garmin.android.apps.connectmobile.navigation.b.a.c(dataConsentActivity, bundle, 67108864);
                        }
                        if (dataConsentActivity.da() instanceof hl.a.b) {
                            z1 z1VarEa2 = dataConsentActivity.ea();
                            hl.a aVarDa2 = dataConsentActivity.da();
                            aVarDa2.getClass();
                            z1VarEa2.x4(((hl.a.b) aVarDa2).f84252b);
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        this.f32176g = registerForActivityResult(new g.h(), new f.b(this) { // from class: z10.q1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DataConsentActivity f201217b;

            {
                this.f201217b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i16 = i15;
                DataConsentActivity dataConsentActivity = this.f201217b;
                f.a aVar = (f.a) obj;
                switch (i16) {
                    case 0:
                        DataConsentActivity.a aVar2 = DataConsentActivity.f32169h;
                        aVar.getClass();
                        boolean zIsEmpty = ((s1) r53.s.d(dataConsentActivity.ea().f201346g).f150540a.getValue()).f201244f.isEmpty();
                        if ((dataConsentActivity.da() instanceof hl.a.b) && !zIsEmpty) {
                            z1 z1VarEa = dataConsentActivity.ea();
                            hl.a aVarDa = dataConsentActivity.da();
                            aVarDa.getClass();
                            z1VarEa.x4(((hl.a.b) aVarDa).f84252b);
                            break;
                        }
                        break;
                    default:
                        DataConsentActivity.a aVar3 = DataConsentActivity.f32169h;
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        d1 d1Var = d1.f200951a;
                        if (intent != null ? intent.getBooleanExtra("extra_data_deletion_dialog", false) : false) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("extra_data_deletion_dialog", true);
                            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                            com.garmin.android.apps.connectmobile.navigation.b.a.c(dataConsentActivity, bundle, 67108864);
                        }
                        if (dataConsentActivity.da() instanceof hl.a.b) {
                            z1 z1VarEa2 = dataConsentActivity.ea();
                            hl.a aVarDa2 = dataConsentActivity.da();
                            aVarDa2.getClass();
                            z1VarEa2.x4(((hl.a.b) aVarDa2).f84252b);
                        }
                        break;
                }
            }
        });
    }

    public final hl.a da() {
        return (hl.a) this.f32170a.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final z1 ea() {
        return (z1) this.f32173d.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.DATA_CONSENT;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent();
        intent.putExtra("hasChildIncompleteConsentsKey", !((s1) s.d(ea().f201346g).f150540a.getValue()).f201244f.isEmpty());
        setResult(-1, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object value;
        super.onCreate(bundle);
        Set<String> setN = this.f32174e.N();
        z1 z1VarEa = ea();
        boolean z14 = ((com.garmin.android.apps.connectmobile.consent.d) this.f32171b.getValue()) != null;
        p2 p2Var = z1VarEa.f201346g;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, s1.a((s1) value, false, z14, false, false, null, null, 61)));
        z1 z1VarEa2 = ea();
        hl.a aVarDa = da();
        z1VarEa2.getClass();
        aVarDa.getClass();
        ge1.b.T(androidx.lifecycle.v1.a(z1VarEa2), null, null, new z10.y1(aVarDa, z1VarEa2, null), 3);
        ge1.b.T(f0.w(this), null, null, new b(setN, null), 3);
        ge1.b.T(f0.w(this), null, null, new c(null), 3);
        initComposeScreen(new z3.e(-1349560176, true, new o1(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/DataConsentActivity$a;", "", "<init>", "()V", "", "EXTRA_DIRECT_CONSENT_TYPE", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, hl.a aVar) {
            context.getClass();
            aVar.getClass();
            Intent intent = new Intent(context, (Class<?>) DataConsentActivity.class);
            intent.putExtra("GCM_extra_screen_access_role", aVar);
            return intent;
        }

        public static void b(a aVar, Context context) {
            hl.a.c cVar = hl.a.c.f84256b;
            aVar.getClass();
            context.getClass();
            cVar.getClass();
            Intent intent = new Intent(context, (Class<?>) DataConsentActivity.class);
            intent.putExtra("GCM_extra_screen_access_role", cVar);
            context.startActivity(intent);
        }

        private a() {
        }
    }
}

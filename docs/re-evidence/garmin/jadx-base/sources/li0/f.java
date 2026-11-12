package li0;

import android.app.Activity;
import android.content.Context;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.follow.exception.FollowerOverLimitException;
import com.garmin.android.apps.connectmobile.follow.exception.FollowingOverLimitException;
import com.garmin.android.apps.connectmobile.follow.exception.FollowingRequestOverLimitException;
import com.garmin.android.apps.connectmobile.follow.exception.ManagedChildAccountForbiddenException;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001:\u0002\n\u000bB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lli0/f;", "", "Lo53/b0;", "coroutineScope", "", "Lki0/a$b$a;", "hideOnSituation", "showOnSituation", "<init>", "(Lo53/b0;Ljava/util/List;Ljava/util/List;)V", "b", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f112657g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f112658h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LinkedHashSet f112659i = new LinkedHashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.b0 f112660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ki0.a.b.EnumC2007a> f112661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<ki0.a.b.EnumC2007a> f112662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q0 f112663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ei0.d f112664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0 f112665f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lli0/f$b;", "", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e23.a<Unit> f112666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e23.a<Unit> f112667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g12.k f112668c;
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.ui.FollowAction$blockUser$alertDialogBuilder$1$1", f = "FollowAction.kt", l = {372, 375, 380, 381}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f112669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f112670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f112671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f112672d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f112673e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ d0 f112675g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Context f112676h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d0 d0Var, Context context, t13.d<? super c> dVar) {
            super(1, dVar);
            this.f112675g = d0Var;
            this.f112676h = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return f.this.new c(this.f112675g, this.f112676h, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
        
            if (li0.f.b(r3, r11, r2, r10) == r0) goto L48;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            int i14;
            v2 v2Var;
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f112673e;
            d0 d0Var = this.f112675g;
            f fVar = f.this;
            if (i15 == 0) {
                o13.r.b(obj);
                ei0.d dVar = fVar.f112664e;
                String str2 = d0Var != null ? d0Var.f112650c : null;
                this.f112673e = 1;
                obj = dVar.m3(str2, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                o13.r.b(obj);
            } else if (i15 == 2) {
                v2Var = (v2) this.f112671c;
                o13.r.b(obj);
                v2.a aVar2 = (v2.a) v2Var;
                String strI = lc.u0.i(aVar2.f47384b, "Block failed (", "): ", aVar2.f47385c);
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "FollowItemViewAction", strI);
            } else if (i15 == 3) {
                i14 = this.f112672d;
                d0Var = (d0) this.f112671c;
                fVar = this.f112670b;
                obj2 = this.f112669a;
                o13.r.b(obj);
                if (d0Var != null) {
                    str = d0Var.f112650c;
                } else {
                    str = null;
                }
                ki0.a.b.EnumC2007a enumC2007a = ki0.a.b.EnumC2007a.BLOCK_USER;
                this.f112669a = obj2;
                this.f112670b = null;
                this.f112671c = null;
                this.f112672d = i14;
                this.f112673e = 4;
            } else {
                if (i15 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            v2 v2Var2 = (v2) obj;
            if (v2Var2 instanceof v2.a) {
                this.f112669a = obj;
                this.f112670b = fVar;
                this.f112671c = v2Var2;
                this.f112672d = 0;
                this.f112673e = 2;
                if (f.c(fVar, this.f112676h, this) != aVar) {
                    v2Var = v2Var2;
                    v2.a aVar4 = (v2.a) v2Var;
                    String strI2 = lc.u0.i(aVar4.f47384b, "Block failed (", "): ", aVar4.f47385c);
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.f(a2Var2, "FollowItemViewAction", strI2);
                    return Unit.INSTANCE;
                }
            } else {
                if (!(v2Var2 instanceof v2.b)) {
                    lc.u0.r();
                    return null;
                }
                l0 l0VarB = m0.b(fVar.f112665f, d0Var != null ? e0.e(d0Var) : null, m0.a.BLOCK);
                String str3 = d0Var != null ? d0Var.f112650c : null;
                this.f112669a = obj;
                this.f112670b = fVar;
                this.f112671c = d0Var;
                this.f112672d = 0;
                this.f112673e = 3;
                if (f.a(fVar, str3, l0VarB, this) != aVar) {
                    obj2 = obj;
                    i14 = 0;
                    if (d0Var != null) {
                        str = d0Var.f112650c;
                    } else {
                        str = null;
                    }
                    ki0.a.b.EnumC2007a enumC2007a2 = ki0.a.b.EnumC2007a.BLOCK_USER;
                    this.f112669a = obj2;
                    this.f112670b = null;
                    this.f112671c = null;
                    this.f112672d = i14;
                    this.f112673e = 4;
                }
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.ui.FollowAction$dismissSuggestion$1", f = "FollowAction.kt", l = {228, 229, 234, 238}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f112677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f112678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d0 f112679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Context f112680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public v2.a f112681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f112682f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f112683g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f112684h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ d0 f112686j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Context f112687k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d0 d0Var, Context context, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f112686j = d0Var;
            this.f112687k = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = f.this.new d(this.f112686j, this.f112687k, dVar);
            dVar2.f112684h = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x008a  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:39:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:43:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:44:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            f fVar;
            d0 d0Var;
            Context context;
            v2 v2Var;
            l0 l0VarB;
            String str;
            Context context2;
            v2 v2Var2;
            Object obj2;
            LinkedHashSet linkedHashSet;
            v2 v2Var3;
            o53.b0 b0Var = (o53.b0) this.f112684h;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f112683g;
            int i15 = 0;
            if (i14 == 0) {
                o13.r.b(obj);
                l0 l0VarB2 = m0.b(f.this.f112665f, e0.e(this.f112686j), m0.a.DISMISS_SUGGESTION);
                f fVar2 = f.this;
                String str2 = this.f112686j.f112650c;
                this.f112684h = b0Var;
                this.f112683g = 1;
                if (f.a(fVar2, str2, l0VarB2, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 == 2) {
                    o13.r.b(obj);
                    fVar = f.this;
                    d0Var = this.f112686j;
                    context = this.f112687k;
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.a) {
                        l0VarB = m0.b(fVar.f112665f, e0.e(d0Var), m0.a.UNDISMISS_SUGGESTION);
                        str = d0Var.f112650c;
                        this.f112684h = b0Var;
                        this.f112677a = obj;
                        this.f112678b = fVar;
                        this.f112679c = d0Var;
                        this.f112680d = context;
                        this.f112681e = (v2.a) v2Var;
                        this.f112682f = 0;
                        this.f112683g = 3;
                        if (f.a(fVar, str, l0VarB, this) != aVar) {
                            context2 = context;
                            v2Var2 = v2Var;
                            obj2 = obj;
                            linkedHashSet = f.f112659i;
                            synchronized (linkedHashSet) {
                                linkedHashSet.remove(d0Var.f112650c);
                                this.f112684h = b0Var;
                                this.f112677a = obj2;
                                this.f112678b = v2Var2;
                                this.f112679c = null;
                                this.f112680d = null;
                                this.f112681e = null;
                                this.f112682f = i15;
                                this.f112683g = 4;
                                if (f.c(fVar, context2, this) != aVar) {
                                    v2Var3 = v2Var2;
                                }
                            }
                        }
                        return aVar;
                    }
                    if (!(v2Var instanceof v2.b)) {
                        lc.u0.r();
                        return null;
                    }
                    return Unit.INSTANCE;
                }
                if (i14 == 3) {
                    i15 = this.f112682f;
                    v2Var2 = this.f112681e;
                    context2 = this.f112680d;
                    d0Var = this.f112679c;
                    fVar = (f) this.f112678b;
                    obj2 = this.f112677a;
                    o13.r.b(obj);
                    linkedHashSet = f.f112659i;
                    synchronized (linkedHashSet) {
                        linkedHashSet.remove(d0Var.f112650c);
                    }
                    this.f112684h = b0Var;
                    this.f112677a = obj2;
                    this.f112678b = v2Var2;
                    this.f112679c = null;
                    this.f112680d = null;
                    this.f112681e = null;
                    this.f112682f = i15;
                    this.f112683g = 4;
                    if (f.c(fVar, context2, this) != aVar) {
                        v2Var3 = v2Var2;
                    }
                    return aVar;
                }
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var3 = (v2) this.f112678b;
                o13.r.b(obj);
            }
            v2.a aVar2 = (v2.a) v2Var3;
            String strI = lc.u0.i(aVar2.f47384b, "Dismiss suggestion failed (", "): ", aVar2.f47385c);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "FollowItemViewAction", strI);
            return Unit.INSTANCE;
            ei0.d dVar = f.this.f112664e;
            String str3 = this.f112686j.f112650c;
            this.f112684h = b0Var;
            this.f112683g = 2;
            obj = dVar.D(str3, false, this);
            if (obj != aVar) {
                fVar = f.this;
                d0Var = this.f112686j;
                context = this.f112687k;
                v2Var = (v2) obj;
                if (v2Var instanceof v2.a) {
                    l0VarB = m0.b(fVar.f112665f, e0.e(d0Var), m0.a.UNDISMISS_SUGGESTION);
                    str = d0Var.f112650c;
                    this.f112684h = b0Var;
                    this.f112677a = obj;
                    this.f112678b = fVar;
                    this.f112679c = d0Var;
                    this.f112680d = context;
                    this.f112681e = (v2.a) v2Var;
                    this.f112682f = 0;
                    this.f112683g = 3;
                    if (f.a(fVar, str, l0VarB, this) != aVar) {
                        context2 = context;
                        v2Var2 = v2Var;
                        obj2 = obj;
                        linkedHashSet = f.f112659i;
                        synchronized (linkedHashSet) {
                            linkedHashSet.remove(d0Var.f112650c);
                            this.f112684h = b0Var;
                            this.f112677a = obj2;
                            this.f112678b = v2Var2;
                            this.f112679c = null;
                            this.f112680d = null;
                            this.f112681e = null;
                            this.f112682f = i15;
                            this.f112683g = 4;
                            if (f.c(fVar, context2, this) != aVar) {
                                v2Var3 = v2Var2;
                                v2.a aVar4 = (v2.a) v2Var3;
                                String strI2 = lc.u0.i(aVar4.f47384b, "Dismiss suggestion failed (", "): ", aVar4.f47385c);
                                i2.a aVar5 = i2.f36769a;
                                a2 a2Var2 = a2.GENERAL;
                                aVar5.getClass();
                                i2.a.f(a2Var2, "FollowItemViewAction", strI2);
                            }
                        }
                    }
                } else if (!(v2Var instanceof v2.b)) {
                    lc.u0.r();
                    return null;
                }
                return Unit.INSTANCE;
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.ui.FollowAction$handleDismissSuggestion$1", f = "FollowAction.kt", l = {256}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112688a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f112690c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f112690c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new e(this.f112690c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f112688a;
            if (i14 == 0) {
                o13.r.b(obj);
                ki0.a.b.EnumC2007a enumC2007a = ki0.a.b.EnumC2007a.DISMISS_SUGGESTION;
                this.f112688a = 1;
                if (f.b(f.this, this.f112690c, enumC2007a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: li0.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.ui.FollowAction$launchLoadingScope$1", f = "FollowAction.kt", l = {572}, m = "invokeSuspend", v = 2)
    public static final class C2162f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f112692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<t13.d<? super Unit>, Object> f112693c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2162f(e23.l<? super Boolean, Unit> lVar, e23.l<? super t13.d<? super Unit>, ? extends Object> lVar2, t13.d<? super C2162f> dVar) {
            super(2, dVar);
            this.f112692b = lVar;
            this.f112693c = lVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2162f(this.f112692b, this.f112693c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2162f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f112691a;
            e23.l<Boolean, Unit> lVar = this.f112692b;
            if (i14 == 0) {
                o13.r.b(obj);
                if (lVar != null) {
                    lVar.invoke(Boolean.TRUE);
                }
                this.f112691a = 1;
                if (this.f112693c.invoke(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.ui.FollowAction$muteUser$alertDialogBuilder$1$1", f = "FollowAction.kt", l = {320, 323, 328}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f112694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f112695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public v2.a f112696c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f112697d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d0 f112699f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Context f112700g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(d0 d0Var, Context context, t13.d<? super g> dVar) {
            super(1, dVar);
            this.f112699f = d0Var;
            this.f112700g = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return f.this.new g(this.f112699f, this.f112700g, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
        
            if (li0.f.a(r3, r2, r1, r8) == r0) goto L39;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 v2Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f112697d;
            d0 d0Var = this.f112699f;
            f fVar = f.this;
            if (i14 == 0) {
                o13.r.b(obj);
                ei0.d dVar = fVar.f112664e;
                String str = d0Var != null ? d0Var.f112650c : null;
                this.f112697d = 1;
                obj = dVar.Z3(str, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                v2Var = this.f112696c;
                o13.r.b(obj);
                v2.a aVar2 = (v2.a) v2Var;
                String strI = lc.u0.i(aVar2.f47384b, "Mute failed (", "): ", aVar2.f47385c);
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "FollowItemViewAction", strI);
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            v2 v2Var2 = (v2) obj;
            if (v2Var2 instanceof v2.a) {
                this.f112694a = obj;
                this.f112695b = fVar;
                this.f112696c = (v2.a) v2Var2;
                this.f112697d = 2;
                if (f.c(fVar, this.f112700g, this) != aVar) {
                    v2Var = v2Var2;
                    v2.a aVar4 = (v2.a) v2Var;
                    String strI2 = lc.u0.i(aVar4.f47384b, "Mute failed (", "): ", aVar4.f47385c);
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.f(a2Var2, "FollowItemViewAction", strI2);
                    return Unit.INSTANCE;
                }
            } else {
                if (!(v2Var2 instanceof v2.b)) {
                    lc.u0.r();
                    return null;
                }
                l0 l0VarB = m0.b(fVar.f112665f, d0Var != null ? e0.e(d0Var) : null, m0.a.MUTE);
                String str2 = d0Var != null ? d0Var.f112650c : null;
                this.f112694a = obj;
                this.f112695b = null;
                this.f112696c = null;
                this.f112697d = 3;
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.ui.FollowAction$sendRequest$1", f = "FollowAction.kt", l = {115, 130, TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f112701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v2.b f112702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f f112703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f112704d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d0 f112706f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Context f112707g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(d0 d0Var, Context context, t13.d<? super h> dVar) {
            super(1, dVar);
            this.f112706f = d0Var;
            this.f112707g = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return f.this.new h(this.f112706f, this.f112707g, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:86:0x025a, code lost:
        
            if (li0.f.a(r4, r2, r1, r12) == r0) goto L87;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 v2Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f112704d;
            d0 d0Var = this.f112706f;
            f fVar = f.this;
            if (i14 == 0) {
                o13.r.b(obj);
                ei0.d dVar = fVar.f112664e;
                String str = d0Var != null ? d0Var.f112650c : null;
                this.f112704d = 1;
                obj = dVar.i0(str, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                v2Var = this.f112702b;
                o13.r.b(obj);
                v2.b bVar = (v2.b) v2Var;
                String str2 = "Send request failed: Can't convert response (" + bVar.f47387b + ": " + bVar.f47386a + ") to FollowRequestDTO";
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "FollowItemViewAction", str2);
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            v2 v2Var2 = (v2) obj;
            boolean z14 = v2Var2 instanceof v2.a;
            Context context = this.f112707g;
            if (!z14) {
                if (!(v2Var2 instanceof v2.b)) {
                    lc.u0.r();
                    return null;
                }
                v2.b bVar2 = (v2.b) v2Var2;
                T t7 = bVar2.f47386a;
                hi0.c cVar = t7 instanceof hi0.c ? (hi0.c) t7 : null;
                if (cVar == null) {
                    this.f112701a = obj;
                    this.f112702b = bVar2;
                    this.f112703c = fVar;
                    this.f112704d = 2;
                    if (f.c(fVar, context, this) != aVar) {
                        v2Var = v2Var2;
                        v2.b bVar3 = (v2.b) v2Var;
                        String str3 = "Send request failed: Can't convert response (" + bVar3.f47387b + ": " + bVar3.f47386a + ") to FollowRequestDTO";
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.f(a2Var2, "FollowItemViewAction", str3);
                    }
                } else {
                    m0 m0Var = fVar.f112665f;
                    l0 l0VarE = d0Var != null ? e0.e(d0Var) : null;
                    m0.a aVar4 = m0.a.SEND_REQUEST;
                    m0Var.getClass();
                    l0 l0VarA = m0.a(l0VarE, aVar4, cVar);
                    String str4 = d0Var != null ? d0Var.f112650c : null;
                    this.f112701a = obj;
                    this.f112702b = null;
                    this.f112703c = null;
                    this.f112704d = 3;
                }
                return aVar;
            }
            v2.a aVar5 = (v2.a) v2Var2;
            Exception exc = aVar5.f47383a;
            String str5 = d0Var != null ? d0Var.f112651d : null;
            if (str5 == null) {
                str5 = "";
            }
            boolean zH = fVar.h();
            context.getClass();
            exc.getClass();
            if (exc instanceof FollowingOverLimitException) {
                if (zH) {
                    Context contextA = ei0.q0.a(context);
                    if (contextA == null) {
                        contextA = context;
                    }
                    new androidx.appcompat.app.e.a(contextA).setTitle(R.string.follow_error_limit_reached_title).setMessage(context.getString(R.string.follow_error_limit_reached_description, String.format("%,d", Arrays.copyOf(new Object[]{1000}, 1)))).setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.connectiq.i(20)).show();
                } else {
                    bv.g gVar = (bv.g) KoinJavaComponent.get$default(bv.g.class, null, null, 6, null);
                    Context contextA2 = ei0.q0.a(context);
                    if (contextA2 == null) {
                        contextA2 = context;
                    }
                    new androidx.appcompat.app.e.a(contextA2).setTitle(R.string.follow_error_limit_reached_title).setMessage(context.getString(R.string.follow_error_limit_reached_description, String.format("%,d", Arrays.copyOf(new Object[]{1000}, 1)))).setPositiveButton(R.string.lbl_go_to_list, new ag0.d(20, gVar, context)).setNegativeButton(R.string.lbl_close, new com.garmin.android.apps.connectmobile.connectiq.i(19)).show();
                }
            } else if (exc instanceof FollowerOverLimitException) {
                Context contextA3 = ei0.q0.a(context);
                if (contextA3 == null) {
                    contextA3 = context;
                }
                new androidx.appcompat.app.e.a(contextA3).setTitle(R.string.follow_error_unable_to_follow_title).setMessage(context.getString(R.string.follow_error_unable_to_follow_description, str5, String.format("%,d", Arrays.copyOf(new Object[]{100000}, 1)))).setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.connectiq.i(18)).show();
            } else if (exc instanceof FollowingRequestOverLimitException) {
                Context contextA4 = ei0.q0.a(context);
                if (contextA4 == null) {
                    contextA4 = context;
                }
                new androidx.appcompat.app.e.a(contextA4).setTitle(R.string.follow_error_follow_request_limit_reached_title).setMessage(context.getString(R.string.follow_error_follow_request_limit_reached_description, String.format("%,d", Arrays.copyOf(new Object[]{10000}, 1)))).setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.connectiq.i(21)).show();
            } else if (exc instanceof ManagedChildAccountForbiddenException) {
                Context contextA5 = ei0.q0.a(context);
                if (contextA5 == null) {
                    contextA5 = context;
                }
                new androidx.appcompat.app.e.a(contextA5).setTitle(R.string.follow_error_unable_to_follow_title).setMessage(context.getString(R.string.follow_error_others_unable_to_follow_child)).setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.connectiq.i(22)).show();
            } else {
                ei0.q0.b(context);
            }
            String strI = lc.u0.i(aVar5.f47384b, "Send request failed (", "): ", aVar5.f47385c);
            i2.a aVar6 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar6.getClass();
            i2.a.f(a2Var3, "FollowItemViewAction", strI);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.ui.FollowAction$unblockUser$alertDialogBuilder$1$1", f = "FollowAction.kt", l = {192, 195, 201, 202}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f112708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f112709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f112710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f112711d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f112712e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ d0 f112714g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Context f112715h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(d0 d0Var, Context context, t13.d<? super i> dVar) {
            super(1, dVar);
            this.f112714g = d0Var;
            this.f112715h = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return f.this.new i(this.f112714g, this.f112715h, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
        
            if (li0.f.b(r3, r11, r2, r10) == r0) goto L48;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            int i14;
            v2 v2Var;
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f112712e;
            d0 d0Var = this.f112714g;
            f fVar = f.this;
            if (i15 == 0) {
                o13.r.b(obj);
                ei0.d dVar = fVar.f112664e;
                String str2 = d0Var != null ? d0Var.f112650c : null;
                this.f112712e = 1;
                obj = dVar.x2(str2, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                o13.r.b(obj);
            } else if (i15 == 2) {
                v2Var = (v2) this.f112710c;
                o13.r.b(obj);
                v2.a aVar2 = (v2.a) v2Var;
                String strI = lc.u0.i(aVar2.f47384b, "Unblock failed (", "): ", aVar2.f47385c);
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "FollowItemViewAction", strI);
            } else if (i15 == 3) {
                i14 = this.f112711d;
                d0Var = (d0) this.f112710c;
                fVar = this.f112709b;
                obj2 = this.f112708a;
                o13.r.b(obj);
                if (d0Var != null) {
                    str = d0Var.f112650c;
                } else {
                    str = null;
                }
                ki0.a.b.EnumC2007a enumC2007a = ki0.a.b.EnumC2007a.UNBLOCK_USER;
                this.f112708a = obj2;
                this.f112709b = null;
                this.f112710c = null;
                this.f112711d = i14;
                this.f112712e = 4;
            } else {
                if (i15 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            v2 v2Var2 = (v2) obj;
            if (v2Var2 instanceof v2.a) {
                this.f112708a = obj;
                this.f112709b = fVar;
                this.f112710c = v2Var2;
                this.f112711d = 0;
                this.f112712e = 2;
                if (f.c(fVar, this.f112715h, this) != aVar) {
                    v2Var = v2Var2;
                    v2.a aVar4 = (v2.a) v2Var;
                    String strI2 = lc.u0.i(aVar4.f47384b, "Unblock failed (", "): ", aVar4.f47385c);
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.f(a2Var2, "FollowItemViewAction", strI2);
                    return Unit.INSTANCE;
                }
            } else {
                if (!(v2Var2 instanceof v2.b)) {
                    lc.u0.r();
                    return null;
                }
                l0 l0VarB = m0.b(fVar.f112665f, d0Var != null ? e0.e(d0Var) : null, m0.a.UNBLOCK);
                String str3 = d0Var != null ? d0Var.f112650c : null;
                this.f112708a = obj;
                this.f112709b = fVar;
                this.f112710c = d0Var;
                this.f112711d = 0;
                this.f112712e = 3;
                if (f.a(fVar, str3, l0VarB, this) != aVar) {
                    obj2 = obj;
                    i14 = 0;
                    if (d0Var != null) {
                        str = d0Var.f112650c;
                    } else {
                        str = null;
                    }
                    ki0.a.b.EnumC2007a enumC2007a2 = ki0.a.b.EnumC2007a.UNBLOCK_USER;
                    this.f112708a = obj2;
                    this.f112709b = null;
                    this.f112710c = null;
                    this.f112711d = i14;
                    this.f112712e = 4;
                }
            }
            return aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(o53.b0 b0Var, List<? extends ki0.a.b.EnumC2007a> list, List<? extends ki0.a.b.EnumC2007a> list2) {
        b0Var.getClass();
        list.getClass();
        list2.getClass();
        this.f112660a = b0Var;
        this.f112661b = list;
        this.f112662c = list2;
        this.f112663d = (q0) KoinJavaComponent.get$default(q0.class, null, null, 6, null);
        this.f112664e = (ei0.d) KoinJavaComponent.get$default(ei0.d.class, null, null, 6, null);
        this.f112665f = m0.f112791a;
        yf0.b bVar = yf0.b.f196864a;
        kp2.a aVar = new kp2.a(this, 10);
        k23.d dVarB = p005kotlin.jvm.internal.s0.f105811a.b(ki0.a.class);
        bVar.getClass();
        ge1.b.T(b0Var, null, null, new yf0.a(dVarB, aVar, null), 3);
    }

    public static final Object a(f fVar, String str, l0 l0Var, t13.d dVar) throws Throwable {
        fVar.getClass();
        yf0.b bVar = yf0.b.f196864a;
        ki0.a.C2006a c2006a = new ki0.a.C2006a(str, l0Var);
        bVar.getClass();
        Object objEmit = yf0.b.f196865b.emit(c2006a, dVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objEmit != aVar) {
            objEmit = Unit.INSTANCE;
        }
        return objEmit == aVar ? objEmit : Unit.INSTANCE;
    }

    public static final Object b(f fVar, String str, ki0.a.b.EnumC2007a enumC2007a, v13.i iVar) throws Throwable {
        fVar.getClass();
        yf0.b bVar = yf0.b.f196864a;
        ki0.a.b bVar2 = new ki0.a.b(str, enumC2007a);
        bVar.getClass();
        Object objEmit = yf0.b.f196865b.emit(bVar2, iVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objEmit != aVar) {
            objEmit = Unit.INSTANCE;
        }
        return objEmit == aVar ? objEmit : Unit.INSTANCE;
    }

    public static final Object c(f fVar, Context context, t13.d dVar) throws Throwable {
        fVar.getClass();
        x53.c cVar = o53.s0.f129406a;
        Object objE0 = ge1.b.e0(u53.o.f168762a, new m(context, null), dVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    public final void d(Context context, d0 d0Var, e23.l<? super Boolean, Unit> lVar) {
        context.getClass();
        new androidx.appcompat.app.e.a(context).setTitle(R.string.social_block_this_user_title).setMessage(R.string.social_block_user_message).setPositiveButton(R.string.lbl_block, new li0.d(this, lVar, d0Var, context, 0)).setNegativeButton(R.string.lbl_cancel, new jm0.c(11)).create().show();
    }

    public final void e(Context context, d0 d0Var) {
        boolean zAdd;
        context.getClass();
        if ((d0Var != null ? d0Var.f112650c : null) == null) {
            return;
        }
        LinkedHashSet linkedHashSet = f112659i;
        synchronized (linkedHashSet) {
            zAdd = linkedHashSet.add(d0Var.f112650c);
        }
        if (zAdd) {
            ge1.b.T(this.f112660a, null, null, new d(d0Var, context, null), 3);
        }
    }

    public final void f(String str) {
        boolean zRemove;
        if (str == null) {
            return;
        }
        LinkedHashSet linkedHashSet = f112659i;
        synchronized (linkedHashSet) {
            zRemove = linkedHashSet.remove(str);
        }
        if (zRemove) {
            ge1.b.T(this.f112660a, null, null, new e(str, null), 3);
        }
    }

    public void g(Context context, d0 d0Var) {
        context.getClass();
    }

    public boolean h() {
        return this instanceof mi0.f.j;
    }

    public final void i(e23.l<? super Boolean, Unit> lVar, e23.l<? super t13.d<? super Unit>, ? extends Object> lVar2) {
        ge1.b.T(this.f112660a, null, null, new C2162f(lVar, lVar2, null), 3);
    }

    public final void j(Context context, d0 d0Var, e23.l<? super Boolean, Unit> lVar) {
        context.getClass();
        androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(context).setTitle(R.string.mute_this_user_title);
        String str = d0Var != null ? d0Var.f112651d : null;
        if (str == null) {
            str = "";
        }
        title.setMessage(context.getString(R.string.mute_connection_message, str)).setPositiveButton(R.string.lbl_mute, new li0.d(this, lVar, d0Var, context, 2)).setNegativeButton(R.string.lbl_cancel, new jm0.c(13)).create().show();
    }

    public final void k(Context context, d0 d0Var, e23.l<? super Boolean, Unit> lVar) {
        context.getClass();
        if (!s3.b()) {
            i(lVar, new h(d0Var, context, null));
            return;
        }
        Activity activityA = ei0.q0.a(context);
        if (activityA != null) {
            context = activityA;
        }
        new androidx.appcompat.app.e.a(context).setTitle(R.string.follow_error_unable_to_follow_title).setMessage(R.string.follow_error_child_unable_to_follow_others).setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.connectiq.i(17)).show();
    }

    public abstract void l(int i14, String str);

    public final void m(Context context, d0 d0Var, e23.l<? super Boolean, Unit> lVar) {
        context.getClass();
        new androidx.appcompat.app.e.a(context).setTitle(R.string.social_unblock_this_user_title).setMessage(R.string.social_unblock_user_message).setPositiveButton(R.string.lbl_unblock, new li0.d(this, lVar, d0Var, context, 1)).setNegativeButton(R.string.lbl_cancel, new jm0.c(12)).create().show();
    }

    public abstract void n(String str, l0 l0Var);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lli0/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DISMISS_COUNTDOWN", "J", "", "pendingDismissSuggestion", "Ljava/util/Set;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public f(o53.b0 b0Var, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(b0Var, (i14 & 2) != 0 ? p13.j0.f134944a : list, (i14 & 4) != 0 ? p13.j0.f134944a : list2);
    }
}

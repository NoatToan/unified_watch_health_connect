package ey1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.a4;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.e3;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import nx1.c0;
import o53.b0;
import o53.s0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.m0;
import p13.o0;
import p13.y;
import r53.a2;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ley1/a;", "Landroidx/lifecycle/u1;", "Llx1/a;", "stpRepo", "Lcom/garmin/android/apps/connectmobile/e3;", "trainingPlanDelegate", "Lk52/a;", "benchmarkFormatter", "<init>", "(Llx1/a;Lcom/garmin/android/apps/connectmobile/e3;Lk52/a;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {
    public static final /* synthetic */ int P = 0;
    public final b2 A;
    public final b2 B;
    public final b2 C;
    public final b2 D;
    public final b2 E;
    public final a2 F;
    public final b2 I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lx1.a f67269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3 f67270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bv.d f67271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f67272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f67273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f67274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f67275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f67276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f67277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f67278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f67279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nx1.b f67280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c0 f67281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final nx1.m f67282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final nx1.n f67283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nx1.p f67284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Long f67285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b2 f67286r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b2 f67287t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b2 f67288v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b2 f67289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b2 f67290x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b2 f67291y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b2 f67292z;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((mx1.a) t7).ordinal()), Integer.valueOf(((mx1.a) t14).ordinal()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((mx1.a) t7).ordinal()), Integer.valueOf(((mx1.a) t14).ordinal()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.SetupStrengthTrainingPlanViewModel$initWorkoutSteps$1", f = "SetupStrengthTrainingPlanViewModel.kt", l = {246, 250, 258}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f67293a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f67295c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f67295c = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new d(this.f67295c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
        
            if (r5.a(r14) == r0) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0133, code lost:
        
            if (r15 == r0) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x015f, code lost:
        
            if (r15 == r0) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0161, code lost:
        
            return r0;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            Object next;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f67293a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = a.this;
                b2 b2Var = aVar2.f67289w;
                c0 c0Var = aVar2.f67281m;
                b2 b2Var2 = aVar2.f67289w;
                if (p005kotlin.jvm.internal.s.g(((dy1.p) b2Var.f150540a.getValue()).f61599e, Boolean.TRUE)) {
                    list = (List) aVar2.D.f150540a.getValue();
                } else {
                    i53.c<dy1.d> cVar = ((dy1.c) aVar2.f67280l.f128200d.f150540a.getValue()).f61536b;
                    ArrayList arrayList = new ArrayList(y.r(cVar, 10));
                    for (dy1.d dVar : cVar) {
                        arrayList.add(new dy1.a(dVar.f61540a, dVar.f61541b));
                    }
                    list = arrayList;
                }
                mx1.f fVar = ((dy1.p) b2Var2.f150540a.getValue()).f61598d;
                if (fVar == null || !fVar.d()) {
                    mx1.f fVar2 = ((dy1.p) b2Var2.f150540a.getValue()).f61598d;
                    Context context = this.f67295c;
                    if (fVar2 == null || !fVar2.c()) {
                        l22.a aVar3 = new l22.a(context);
                        mx1.f fVar3 = ((dy1.p) b2Var2.f150540a.getValue()).f61598d;
                        if (fVar3 == null) {
                            fVar3 = mx1.g.f121403a;
                        }
                        this.f67293a = 3;
                        Object objE = c0Var.e(aVar3, c0Var.f128207a.o(fVar3.f121395a, list), false, this);
                        if (objE != u13.a.COROUTINE_SUSPENDED) {
                            objE = Unit.INSTANCE;
                        }
                    } else {
                        l22.a aVar4 = new l22.a(context);
                        List<dy1.k> list2 = (List) aVar2.f67292z.f150540a.getValue();
                        this.f67293a = 2;
                        c0Var.getClass();
                        ArrayList arrayList2 = new ArrayList(y.r(list2, 10));
                        for (dy1.k kVar : list2) {
                            String str = kVar.f61572a.f121366a;
                            i53.c<mx1.a> cVar2 = kVar.f61573b;
                            ArrayList arrayList3 = new ArrayList(y.r(cVar2, 10));
                            for (mx1.a aVar5 : cVar2) {
                                Iterator it = list.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (((dy1.a) next).f61526a != aVar5);
                                dy1.a aVar6 = (dy1.a) next;
                                arrayList3.add((aVar6 == null || !aVar6.f61527b) ? aVar5.f121356f : aVar5.f121355e);
                            }
                            arrayList2.add(new ix1.b(str, arrayList3));
                        }
                        Object objE2 = c0Var.e(aVar4, arrayList2, true, this);
                        if (objE2 != u13.a.COROUTINE_SUSPENDED) {
                            objE2 = Unit.INSTANCE;
                        }
                    }
                } else {
                    this.f67293a = 1;
                }
            } else {
                if (i14 != 1 && i14 != 2 && i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.SetupStrengthTrainingPlanViewModel$loadDataForRestartPlanIfNeeded$1", f = "SetupStrengthTrainingPlanViewModel.kt", l = {154, ModuleDescriptor.MODULE_VERSION, SyslogConstants.LOG_LOCAL4, 163, 164}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f67296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f67297b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f67299d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f67299d = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new e(this.f67299d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0064  */
        /* JADX WARN: Code duplicated, block: B:27:0x0076 A[PHI: r1
          0x0076: PHI (r1v5 boolean) = (r1v4 boolean), (r1v4 boolean), (r1v7 boolean) binds: [B:23:0x0062, B:25:0x0073, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:30:0x008c A[PHI: r1
          0x008c: PHI (r1v6 boolean) = (r1v5 boolean), (r1v8 boolean) binds: [B:28:0x0089, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r0) goto L32;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            l22.a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f67297b;
            a aVar3 = a.this;
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2Var = aVar3.f67273e;
                Boolean bool = Boolean.TRUE;
                this.f67297b = 1;
                p2Var.k(null, bool);
                if (Unit.INSTANCE != aVar2) {
                }
                return aVar2;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 == 2) {
                    o13.r.b(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    if (zBooleanValue) {
                        aVar = new l22.a(this.f67299d);
                        this.f67296a = zBooleanValue;
                        this.f67297b = 3;
                        if (a.x4(aVar3, aVar, this) != aVar2) {
                            aVar3.f67272d = zBooleanValue;
                            p2 p2Var2 = aVar3.f67274f;
                            Boolean boolValueOf = Boolean.valueOf(!zBooleanValue);
                            this.f67296a = zBooleanValue;
                            this.f67297b = 4;
                            p2Var2.k(null, boolValueOf);
                            if (Unit.INSTANCE != aVar2) {
                                p2 p2Var3 = aVar3.f67273e;
                                Boolean bool2 = Boolean.FALSE;
                                this.f67296a = zBooleanValue;
                                this.f67297b = 5;
                                p2Var3.k(null, bool2);
                            }
                        }
                    } else {
                        aVar3.f67272d = zBooleanValue;
                        p2 p2Var4 = aVar3.f67274f;
                        Boolean boolValueOf2 = Boolean.valueOf(!zBooleanValue);
                        this.f67296a = zBooleanValue;
                        this.f67297b = 4;
                        p2Var4.k(null, boolValueOf2);
                        if (Unit.INSTANCE != aVar2) {
                            p2 p2Var5 = aVar3.f67273e;
                            Boolean bool3 = Boolean.FALSE;
                            this.f67296a = zBooleanValue;
                            this.f67297b = 5;
                            p2Var5.k(null, bool3);
                        }
                    }
                    return aVar2;
                }
                if (i14 == 3) {
                    zBooleanValue = this.f67296a;
                    o13.r.b(obj);
                    aVar3.f67272d = zBooleanValue;
                    p2 p2Var6 = aVar3.f67274f;
                    Boolean boolValueOf3 = Boolean.valueOf(!zBooleanValue);
                    this.f67296a = zBooleanValue;
                    this.f67297b = 4;
                    p2Var6.k(null, boolValueOf3);
                    if (Unit.INSTANCE != aVar2) {
                        p2 p2Var7 = aVar3.f67273e;
                        Boolean bool4 = Boolean.FALSE;
                        this.f67296a = zBooleanValue;
                        this.f67297b = 5;
                        p2Var7.k(null, bool4);
                    }
                    return aVar2;
                }
                if (i14 == 4) {
                    zBooleanValue = this.f67296a;
                    o13.r.b(obj);
                    p2 p2Var8 = aVar3.f67273e;
                    Boolean bool5 = Boolean.FALSE;
                    this.f67296a = zBooleanValue;
                    this.f67297b = 5;
                    p2Var8.k(null, bool5);
                } else {
                    if (i14 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            }
            return Unit.INSTANCE;
            lx1.a aVar4 = aVar3.f67269a;
            String strB = aVar3.f67271c.b();
            Long l14 = aVar3.f67285q;
            this.f67297b = 2;
            obj = aVar4.k(strB, l14, this);
            if (obj != aVar2) {
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    aVar = new l22.a(this.f67299d);
                    this.f67296a = zBooleanValue;
                    this.f67297b = 3;
                    if (a.x4(aVar3, aVar, this) != aVar2) {
                        aVar3.f67272d = zBooleanValue;
                        p2 p2Var9 = aVar3.f67274f;
                        Boolean boolValueOf4 = Boolean.valueOf(!zBooleanValue);
                        this.f67296a = zBooleanValue;
                        this.f67297b = 4;
                        p2Var9.k(null, boolValueOf4);
                        if (Unit.INSTANCE != aVar2) {
                            p2 p2Var10 = aVar3.f67273e;
                            Boolean bool6 = Boolean.FALSE;
                            this.f67296a = zBooleanValue;
                            this.f67297b = 5;
                            p2Var10.k(null, bool6);
                        }
                    }
                } else {
                    aVar3.f67272d = zBooleanValue;
                    p2 p2Var11 = aVar3.f67274f;
                    Boolean boolValueOf5 = Boolean.valueOf(!zBooleanValue);
                    this.f67296a = zBooleanValue;
                    this.f67297b = 4;
                    p2Var11.k(null, boolValueOf5);
                    if (Unit.INSTANCE != aVar2) {
                        p2 p2Var12 = aVar3.f67273e;
                        Boolean bool7 = Boolean.FALSE;
                        this.f67296a = zBooleanValue;
                        this.f67297b = 5;
                        p2Var12.k(null, bool7);
                    }
                }
            }
            return aVar2;
        }
    }

    static {
        new C1397a(null);
    }

    public a(lx1.a aVar, e3 e3Var, k52.a aVar2) {
        aVar.getClass();
        e3Var.getClass();
        aVar2.getClass();
        this.f67269a = aVar;
        this.f67270b = e3Var;
        this.f67271c = (bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null);
        this.f67273e = q2.a(Boolean.TRUE);
        this.f67274f = q2.a(Boolean.FALSE);
        this.f67275g = q2.a(0);
        this.f67276h = q2.a(new dy1.p(null, null, null, null, null, null, null, null, null, null, 1023, null));
        a4.f22995c.getClass();
        List listB = a4.a.b();
        ArrayList arrayList = new ArrayList(y.r(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new dy1.q((a4) it.next(), null, null, false, 14, null));
        }
        p2 p2VarA = q2.a(i53.a.e(arrayList));
        this.f67277i = p2VarA;
        p2 p2VarA2 = q2.a(j53.l.b());
        this.f67278j = p2VarA2;
        p2 p2VarA3 = q2.a(Boolean.FALSE);
        this.f67279k = p2VarA3;
        nx1.b bVar = new nx1.b(this.f67269a, aVar2);
        this.f67280l = bVar;
        c0 c0Var = new c0(this.f67269a);
        this.f67281m = c0Var;
        nx1.m mVar = new nx1.m();
        this.f67282n = mVar;
        nx1.n nVar = new nx1.n();
        this.f67283o = nVar;
        nx1.p pVar = new nx1.p();
        this.f67284p = pVar;
        this.f67286r = r53.s.d(this.f67273e);
        this.f67287t = r53.s.d(this.f67274f);
        this.f67288v = r53.s.d(this.f67275g);
        this.f67289w = r53.s.d(this.f67276h);
        this.f67290x = bVar.f128200d;
        this.f67291y = mVar.f128246c;
        this.f67292z = mVar.f128247d;
        this.A = c0Var.f128213g;
        this.B = c0Var.f128215i;
        this.C = r53.s.d(p2VarA);
        this.D = r53.s.d(p2VarA2);
        this.E = nVar.f128249b;
        this.F = pVar.f128252b;
        this.I = r53.s.d(p2VarA3);
    }

    public static void B4(Activity activity, String str) {
        ht.a aVar = ht.a.f85464a;
        Bundle bundleA = h7.c.a(new o13.p("Screen", str));
        aVar.getClass();
        ht.a.a(bundleA, "STPExitSetUp");
        if (activity != null) {
            activity.setResult(2);
        }
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v18, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.ArrayList] */
    public static final Object x4(a aVar, l22.a aVar2, v13.c cVar) {
        ey1.d dVar;
        Object next;
        mx1.f fVarA;
        Object objD;
        ix1.h hVar;
        mx1.f fVar;
        Object next2;
        int i14;
        Object value;
        ArrayList arrayList;
        Object next3;
        b2 b2Var;
        Iterator it;
        Object next4;
        String string;
        ?? arrayList2;
        l22.a aVar3 = aVar2;
        b2 b2Var2 = aVar.A;
        c0 c0Var = aVar.f67281m;
        if (cVar instanceof ey1.d) {
            dVar = (ey1.d) cVar;
            int i15 = dVar.f67313f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                dVar.f67313f = i15 - Integer.MIN_VALUE;
            } else {
                dVar = new ey1.d(aVar, cVar);
            }
        } else {
            dVar = new ey1.d(aVar, cVar);
        }
        Object obj = dVar.f67311d;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i16 = dVar.f67313f;
        boolean z14 = true;
        if (i16 == 0) {
            o13.r.b(obj);
            ix1.h hVarF = aVar.f67269a.getF115270j();
            if (hVarF != null) {
                Iterator it3 = mx1.g.f121410h.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!((mx1.f) next).f121396b.equals(hVarF.getTrainingSubType()));
                mx1.f fVar2 = (mx1.f) next;
                if (fVar2 != null) {
                    mx1.e.a aVar5 = mx1.e.f121384d;
                    String trainingVersion = hVarF.getTrainingVersion();
                    aVar5.getClass();
                    Iterator it4 = mx1.e.f121391k.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                    } while (!p005kotlin.jvm.internal.s.g(((mx1.e) next2).f121392a, trainingVersion));
                    mx1.e eVar = (mx1.e) next2;
                    if (eVar == null) {
                        eVar = mx1.e.REP_5;
                    }
                    fVarA = mx1.f.a(fVar2, hVarF.g().size(), eVar, 231);
                } else {
                    fVarA = mx1.g.f121403a;
                }
                List<ix1.f> listG = hVarF.g();
                dVar.f67308a = aVar3;
                dVar.f67309b = hVarF;
                dVar.f67310c = fVarA;
                dVar.f67313f = 1;
                c0Var.getClass();
                if (fVarA.d()) {
                    objD = c0Var.c(listG, dVar);
                    if (objD != u13.a.COROUTINE_SUSPENDED) {
                        objD = Unit.INSTANCE;
                    }
                } else if (fVarA.c()) {
                    objD = c0Var.b(aVar3, listG, dVar);
                    if (objD != u13.a.COROUTINE_SUSPENDED) {
                        objD = Unit.INSTANCE;
                    }
                } else {
                    objD = c0Var.d(aVar3, fVarA, listG, dVar);
                    if (objD != u13.a.COROUTINE_SUSPENDED) {
                        objD = Unit.INSTANCE;
                    }
                }
                if (objD == aVar4) {
                    return aVar4;
                }
                hVar = hVarF;
                fVar = fVarA;
            }
            return Unit.INSTANCE;
        }
        if (i16 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mx1.f fVar3 = dVar.f67310c;
        hVar = dVar.f67309b;
        l22.a aVar6 = dVar.f67308a;
        o13.r.b(obj);
        fVar = fVar3;
        aVar3 = aVar6;
        Iterable iterable = (Iterable) b2Var2.f150540a.getValue();
        int i17 = 10;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            z14 = false;
            break;
        }
        Iterator it5 = iterable.iterator();
        loop9: while (true) {
            if (!it5.hasNext()) {
                z14 = false;
                break;
            }
            i53.c<dy1.u> cVar2 = ((dy1.v) it5.next()).f61642c;
            ArrayList arrayList3 = new ArrayList(y.r(cVar2, 10));
            Iterator<dy1.u> it6 = cVar2.iterator();
            while (it6.hasNext()) {
                arrayList3.add(it6.next().f61639a);
            }
            ArrayList arrayListS = y.s(arrayList3);
            if (!arrayListS.isEmpty()) {
                Iterator it7 = arrayListS.iterator();
                while (it7.hasNext()) {
                    if (d53.w.z(((dy1.h) it7.next()).f61556a, "barbell", true)) {
                        break loop9;
                    }
                }
            }
        }
        mx1.c cVar3 = fVar.d() ? null : z14 ? mx1.c.FULL_GYM : mx1.c.DUMBBELLS_ONLY;
        p2 p2Var = aVar.f67276h;
        while (true) {
            Object value2 = p2Var.getValue();
            dy1.p pVar = (dy1.p) value2;
            j53.j jVarB = j53.l.b();
            Boolean boolValueOf = Boolean.valueOf(hVar.getIncludeBenchmarkWeek());
            Boolean boolValueOf2 = fVar.d() ? null : Boolean.valueOf(hVar.getIncludeDeloadWeek());
            String name = hVar.getName();
            Iterable iterable2 = (Iterable) b2Var2.f150540a.getValue();
            ArrayList arrayList4 = new ArrayList(y.r(iterable2, i17));
            Iterator it8 = iterable2.iterator();
            while (it8.hasNext()) {
                dy1.v vVar = (dy1.v) it8.next();
                Iterator it9 = hVar.g().iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        b2Var = b2Var2;
                        hVar = hVar;
                        pVar = pVar;
                        it = it8;
                        next4 = null;
                        break;
                    }
                    next4 = it9.next();
                    List<ix1.i> listH = ((ix1.f) next4).h();
                    b2Var = b2Var2;
                    if (listH != null) {
                        arrayList2 = new ArrayList(y.r(listH, 10));
                        Iterator it10 = listH.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(((ix1.i) it10.next()).getBenchmark());
                        }
                    } else {
                        arrayList2 = 0;
                    }
                    if (arrayList2 == 0) {
                        arrayList2 = j0.f134944a;
                    }
                    Iterable iterable3 = (Iterable) arrayList2;
                    i53.c<dy1.u> cVar4 = vVar.f61642c;
                    it = it8;
                    ArrayList arrayList5 = new ArrayList(y.r(cVar4, 10));
                    Iterator<dy1.u> it11 = cVar4.iterator();
                    while (it11.hasNext()) {
                        arrayList5.add(it11.next().f61639a);
                    }
                    ArrayList arrayListS2 = y.s(arrayList5);
                    i17 = 10;
                    ArrayList arrayList6 = new ArrayList(y.r(arrayListS2, 10));
                    Iterator it12 = arrayListS2.iterator();
                    while (it12.hasNext()) {
                        arrayList6.add(((dy1.h) it12.next()).f61556a);
                    }
                    if (!h0.h0(iterable3, h0.g1(arrayList6)).isEmpty()) {
                        break;
                    }
                    pVar = pVar;
                    b2Var2 = b2Var;
                    hVar = hVar;
                    it8 = it;
                }
                ix1.f fVar4 = (ix1.f) next4;
                String str = vVar.f61640a.f121366a;
                if (fVar4 == null || (string = fVar4.getTrainingDayName()) == null) {
                    string = aVar3.getString(vVar.f61640a.f121368c);
                }
                com.nimbusds.jose.shaded.gson.internal.a.u(str, string, arrayList4);
                pVar = pVar;
                b2Var2 = b2Var;
                hVar = hVar;
                it8 = it;
            }
            b2 b2Var3 = b2Var2;
            ix1.h hVar2 = hVar;
            i53.c cVarE = i53.a.e(arrayList4);
            pVar.getClass();
            jVarB.getClass();
            cVarE.getClass();
            i14 = i17;
            if (p2Var.b(value2, new dy1.p(null, cVar3, jVarB, fVar, boolValueOf, boolValueOf2, null, null, name, cVarE))) {
                break;
            }
            i17 = i14;
            b2Var2 = b2Var3;
            hVar = hVar2;
        }
        p2 p2Var2 = aVar.f67277i;
        do {
            value = p2Var2.getValue();
            i53.c<dy1.q> cVar5 = (i53.c) value;
            arrayList = new ArrayList(y.r(cVar5, i14));
            for (dy1.q qVarA : cVar5) {
                Iterator it13 = ((Iterable) c0Var.f128214h.f150540a.getValue()).iterator();
                do {
                    if (!it13.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it13.next();
                } while (((dy1.q) next3).f61605a != qVarA.f61605a);
                dy1.q qVar = (dy1.q) next3;
                if (qVar != null) {
                    qVarA = dy1.q.a(qVarA, qVar.f61607c, null, false, 13);
                }
                arrayList.add(qVarA);
            }
        } while (!p2Var2.b(value, i53.a.e(arrayList)));
        aVar.Y4();
        return Unit.INSTANCE;
    }

    public final void A4() {
        Object next;
        Object value;
        Iterator it = ((Iterable) this.f67277i.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((dy1.q) next).f61607c == null);
        dy1.q qVar = (dy1.q) next;
        a4 a4Var = qVar != null ? qVar.f61605a : null;
        nx1.n nVar = this.f67283o;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        if (a4Var != null) {
            DateTimeZone dateTimeZone = DateTimeZone.UTC;
            DateTime dateTimeWithDayOfWeek = DateTime.now(dateTimeZone).withTimeAtStartOfDay().withDayOfWeek(a4Var.f23006b);
            if (dateTimeWithDayOfWeek.isBefore(DateTime.now(dateTimeZone).withTimeAtStartOfDay())) {
                dateTimeWithDayOfWeek = dateTimeWithDayOfWeek.plusWeeks(1);
            }
            while (arrayList.size() != 9) {
                arrayList.add(Long.valueOf(dateTimeWithDayOfWeek.getMillis()));
                dateTimeWithDayOfWeek = dateTimeWithDayOfWeek.plusWeeks(1);
            }
        }
        p2 p2Var = nVar.f128248a;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, i53.a.e(arrayList)));
        p2 p2Var2 = this.f67276h;
        Long l14 = ((dy1.p) p2Var2.getValue()).f61601g;
        b2 b2Var = this.E;
        if (l14 == null || !h0.R((Iterable) b2Var.f150540a.getValue(), ((dy1.p) p2Var2.getValue()).f61601g)) {
            S4((Long) h0.d0((List) b2Var.f150540a.getValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v8, types: [p13.j0] */
    public final void C4(mx1.b bVar, String str) {
        Object value;
        ArrayList arrayList;
        Object obj;
        dy1.u next;
        String str2;
        ?? arrayList2;
        i53.c<dy1.h> cVar;
        List listU;
        i53.c<dy1.h> cVar2;
        dy1.h hVar;
        bVar.getClass();
        str.getClass();
        c0 c0Var = this.f67281m;
        c0Var.getClass();
        p2 p2Var = c0Var.f128210d;
        do {
            value = p2Var.getValue();
            i53.c<dy1.v> cVar3 = (i53.c) value;
            int i14 = 10;
            arrayList = new ArrayList(y.r(cVar3, 10));
            for (dy1.v vVarA : cVar3) {
                if (vVarA.f61640a == bVar) {
                    Iterator<dy1.u> it = vVarA.f61642c.iterator();
                    while (true) {
                        obj = null;
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        i53.c<dy1.h> cVar4 = next.f61639a;
                        if (cVar4 == null || !cVar4.isEmpty()) {
                            Iterator<dy1.h> it3 = cVar4.iterator();
                            while (it3.hasNext()) {
                                if (p005kotlin.jvm.internal.s.g(it3.next().f61556a, str)) {
                                    break;
                                }
                            }
                        }
                    }
                    dy1.u uVar = next;
                    if (uVar == null || (cVar2 = uVar.f61639a) == null || (hVar = (dy1.h) h0.e0(0, cVar2)) == null || (str2 = hVar.f61556a) == null) {
                        str2 = "";
                    }
                    if (uVar == null || (cVar = uVar.f61639a) == null || (listU = h0.U(cVar, 1)) == null) {
                        arrayList2 = 0;
                    } else {
                        arrayList2 = new ArrayList(y.r(listU, i14));
                        Iterator it4 = listU.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(((dy1.h) it4.next()).f61556a);
                        }
                    }
                    if (arrayList2 == 0) {
                        arrayList2 = j0.f134944a;
                    }
                    List<kx1.a> listN = c0Var.f128207a.n(str2);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : listN) {
                        if (!h0.R(arrayList2, ((kx1.a) obj2).f107116a)) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(arrayList3);
                    for (Object obj3 : listN) {
                        if (p005kotlin.jvm.internal.s.g(((kx1.a) obj3).f107116a, str)) {
                            obj = obj3;
                            break;
                        }
                    }
                    kx1.a aVar = (kx1.a) obj;
                    vVarA = dy1.v.a(vVarA, null, null, null, aVar != null ? i53.a.e(h0.N0(h0.C0(p13.w.c(aVar), arrayList4), new nx1.q())) : i53.a.e(h0.N0(arrayList4, new nx1.r())), 15);
                }
                arrayList.add(vVarA);
                i14 = 10;
            }
        } while (!p2Var.b(value, i53.a.e(arrayList)));
    }

    public final Intent D4(Context context, String str) {
        dy1.h next;
        String str2;
        dy1.h next2;
        context.getClass();
        lx1.a aVar = this.f67269a;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVarH = aVar.getF115271k();
        if (cVarH == null) {
            return null;
        }
        b2 b2Var = this.B;
        Iterator<dy1.h> it = ((dy1.g) b2Var.f150540a.getValue()).f61555b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.f61558c);
        dy1.h hVar = next;
        if (hVar == null || (str2 = hVar.f61556a) == null) {
            str2 = "";
        }
        Iterator<dy1.h> it3 = ((dy1.g) b2Var.f150540a.getValue()).f61555b.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!p005kotlin.jvm.internal.s.g(next2.f61556a, str));
        dy1.h hVar2 = next2;
        i53.c<dy1.h> cVar = ((dy1.g) b2Var.f150540a.getValue()).f61555b;
        ArrayList arrayList = new ArrayList(y.r(cVar, 10));
        Iterator<dy1.h> it4 = cVar.iterator();
        while (it4.hasNext()) {
            arrayList.add(it4.next().f61556a);
        }
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF = cVarH.F();
        ArrayList arrayList2 = new ArrayList();
        for (com.garmin.android.apps.connectmobile.repcounting.model.d dVar : dVarArrF) {
            if (!h0.R(arrayList, dVar.f41106e) || p005kotlin.jvm.internal.s.g(dVar.f41106e, str)) {
                arrayList2.add(dVar);
            }
        }
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = new com.garmin.android.apps.connectmobile.repcounting.model.c((com.garmin.android.apps.connectmobile.repcounting.model.d[]) arrayList2.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
        String string = context.getString(R.string.strength_training_select_exercise);
        string.getClass();
        com.garmin.android.apps.connectmobile.repcounting.model.e eVar = new com.garmin.android.apps.connectmobile.repcounting.model.e();
        List listL = p13.x.l(hVar2 != null ? new kx1.a(hVar2.f61556a, hVar2.f61557b, hVar2.f61563h) : null);
        List<kx1.a> listN = aVar.n(str2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : listN) {
            if (!h0.R(arrayList, ((kx1.a) obj).f107116a)) {
                arrayList3.add(obj);
            }
        }
        ArrayList<kx1.a> arrayListC0 = h0.C0(listL, arrayList3);
        ArrayList arrayList4 = new ArrayList(y.r(arrayListC0, 10));
        for (kx1.a aVar2 : arrayListC0) {
            com.garmin.android.apps.connectmobile.repcounting.model.b bVar = new com.garmin.android.apps.connectmobile.repcounting.model.b();
            bVar.H(aVar2.f107117b);
            bVar.I(aVar2.f107116a);
            bVar.M();
            arrayList4.add(bVar);
        }
        eVar.h0((com.garmin.android.apps.connectmobile.repcounting.model.b[]) arrayList4.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.b[0]));
        eVar.k0("");
        Unit unit = Unit.INSTANCE;
        boolean z14 = str != null;
        String string2 = context.getString(R.string.strength_training_search_exercises);
        string2.getClass();
        return this.f67270b.y(context, string, cVar2, eVar, z14, string2);
    }

    public final void E4(mx1.h hVar) {
        dy1.v vVar;
        hVar.getClass();
        boolean z14 = hVar instanceof mx1.h.i;
        b2 b2Var = this.A;
        if (!z14) {
            if (!(hVar instanceof mx1.h.b) || (vVar = (dy1.v) h0.n0((List) b2Var.f150540a.getValue())) == null) {
                return;
            }
            K4(vVar.f61640a);
            return;
        }
        List list = (List) b2Var.f150540a.getValue();
        int i14 = ((mx1.h.i) hVar).f121434d;
        dy1.v vVar2 = (dy1.v) h0.e0(i14 - 2, list);
        if (vVar2 != null) {
            K4(vVar2.f61640a);
        }
        dy1.v vVar3 = (dy1.v) h0.e0(i14 - 1, (List) b2Var.f150540a.getValue());
        if (vVar3 != null) {
            K4(vVar3.f61640a);
        }
    }

    public final void F4(Context context) {
        context.getClass();
        b2 b2Var = this.f67289w;
        mx1.f fVar = ((dy1.p) b2Var.f150540a.getValue()).f61598d;
        p2 p2Var = this.f67276h;
        nx1.b bVar = this.f67280l;
        if (fVar == null || !fVar.c()) {
            l22.a aVar = new l22.a(context);
            mx1.f fVar2 = ((dy1.p) b2Var.f150540a.getValue()).f61598d;
            String str = fVar2 != null ? fVar2.f121395a : "";
            boolean z14 = am.j.z(f12.l.f68084a);
            boolean z15 = mx1.c.FULL_GYM == ((dy1.p) p2Var.getValue()).f61596b;
            bVar.getClass();
            bVar.b(aVar, bVar.f128197a.g(str), z14, z15);
        } else {
            l22.a aVar2 = new l22.a(context);
            Iterable iterable = (Iterable) this.f67292z.f150540a.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                d0.v(arrayList, ((dy1.k) it.next()).f61573b);
            }
            bVar.b(aVar2, h0.N0(arrayList, new b()), am.j.z(f12.l.f68084a), mx1.c.FULL_GYM == ((dy1.p) p2Var.getValue()).f61596b);
        }
        Y4();
    }

    public final void G4(Context context, dy1.u uVar) {
        Object next;
        Object value;
        String strC;
        ArrayList arrayList;
        context.getClass();
        uVar.getClass();
        c0 c0Var = this.f67281m;
        c0Var.getClass();
        Iterator it = ((Iterable) c0Var.f128213g.f150540a.getValue()).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            i53.c<dy1.u> cVar = ((dy1.v) next).f61642c;
            if (cVar == null || !cVar.isEmpty()) {
                Iterator<dy1.u> it3 = cVar.iterator();
                while (it3.hasNext()) {
                    if (it3.next().a().equals(uVar.a())) {
                        break loop0;
                    }
                }
            }
        }
        dy1.v vVar = (dy1.v) next;
        if (vVar != null) {
            Iterator<dy1.u> it4 = vVar.f61642c.iterator();
            int i14 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i14 = -1;
                    break;
                } else if (it4.next().a().equals(uVar.a())) {
                    break;
                } else {
                    i14++;
                }
            }
            p2 p2Var = c0Var.f128212f;
            do {
                value = p2Var.getValue();
                strC = vVar.c(i14, context);
                i53.c<dy1.h> cVar2 = uVar.f61639a;
                arrayList = new ArrayList(y.r(cVar2, 10));
                for (dy1.h hVar : cVar2) {
                    boolean z14 = !hVar.f61558c;
                    arrayList.add(dy1.h.a(hVar, null, null, z14, false, false, z14, null, 951));
                }
            } while (!p2Var.b(value, new dy1.g(strC, i53.a.e(arrayList))));
        }
    }

    public final void H4() {
        p2 p2Var;
        Object value;
        i53.c cVarE;
        String str;
        String str2;
        do {
            p2Var = this.f67278j;
            value = p2Var.getValue();
            b2 b2Var = this.f67289w;
            mx1.f fVar = ((dy1.p) b2Var.f150540a.getValue()).f61598d;
            nx1.b bVar = this.f67280l;
            String str3 = "";
            if (fVar == null || !fVar.c()) {
                mx1.f fVar2 = ((dy1.p) b2Var.f150540a.getValue()).f61598d;
                String str4 = fVar2 != null ? fVar2.f121395a : "";
                mx1.c cVar = ((dy1.p) b2Var.f150540a.getValue()).f61596b;
                if (cVar != null && (str = cVar.f121373a) != null) {
                    str3 = str;
                }
                bVar.getClass();
                cVarE = i53.a.e(nx1.b.a(str3, bVar.f128197a.g(str4)));
            } else {
                Iterable iterable = (Iterable) this.f67292z.f150540a.getValue();
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    d0.v(arrayList, ((dy1.k) it.next()).f61573b);
                }
                List listN0 = h0.N0(arrayList, new c());
                mx1.c cVar2 = ((dy1.p) b2Var.f150540a.getValue()).f61596b;
                if (cVar2 != null && (str2 = cVar2.f121373a) != null) {
                    str3 = str2;
                }
                bVar.getClass();
                cVarE = i53.a.e(nx1.b.a(str3, listN0));
            }
        } while (!p2Var.b(value, cVarE));
    }

    public final void I4(Context context) {
        context.getClass();
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new d(context, null), 2);
    }

    public final void J4(Context context) {
        context.getClass();
        if (this.f67272d || this.f67285q == null) {
            return;
        }
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new e(context, null), 2);
    }

    public final void K4(mx1.b bVar) {
        p2 p2Var;
        Object value;
        ArrayList arrayList;
        do {
            p2Var = this.f67277i;
            value = p2Var.getValue();
            i53.c<dy1.q> cVar = (i53.c) value;
            arrayList = new ArrayList(y.r(cVar, 10));
            for (dy1.q qVarA : cVar) {
                if (qVarA.f61607c == bVar) {
                    qVarA = dy1.q.a(qVarA, null, null, true, 3);
                }
                arrayList.add(qVarA);
            }
        } while (!p2Var.b(value, i53.a.e(arrayList)));
    }

    public final void L4(mx1.b bVar, int i14, int i15) {
        Object value;
        ArrayList arrayList;
        bVar.getClass();
        c0 c0Var = this.f67281m;
        c0Var.getClass();
        p2 p2Var = c0Var.f128210d;
        do {
            value = p2Var.getValue();
            i53.c<dy1.v> cVar = (i53.c) value;
            arrayList = new ArrayList(y.r(cVar, 10));
            for (dy1.v vVarA : cVar) {
                if (vVarA.f61640a == bVar) {
                    ArrayList arrayListD1 = h0.d1(vVarA.f61642c);
                    if (i14 >= 0 && i14 < arrayListD1.size() && i15 >= 0 && i15 < arrayListD1.size()) {
                        arrayListD1.add(i15, arrayListD1.remove(i14));
                    }
                    Unit unit = Unit.INSTANCE;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayListD1) {
                        if (hashSet.add(((dy1.u) obj).a())) {
                            arrayList2.add(obj);
                        }
                    }
                    vVarA = dy1.v.a(vVarA, null, i53.a.e(arrayList2), null, null, 27);
                }
                arrayList.add(vVarA);
            }
        } while (!p2Var.b(value, i53.a.e(arrayList)));
    }

    public final void M4(int i14, int i15) {
        Object value;
        ArrayList arrayList;
        nx1.m mVar = this.f67282n;
        b2 b2Var = mVar.f128247d;
        dy1.k kVar = (dy1.k) h0.e0(i14, (List) b2Var.f150540a.getValue());
        if (kVar != null) {
            mx1.b bVar = kVar.f61572a;
            p2 p2Var = mVar.f128245b;
            do {
                value = p2Var.getValue();
                i53.c<dy1.k> cVar = (i53.c) value;
                arrayList = new ArrayList(y.r(cVar, 10));
                for (dy1.k kVarA : cVar) {
                    if (bVar == kVarA.f61572a) {
                        kVarA = dy1.k.a(kVarA, j53.l.b());
                    }
                    arrayList.add(kVarA);
                }
            } while (!p2Var.b(value, i53.a.e(arrayList)));
        }
        dy1.k kVar2 = (dy1.k) h0.e0(i15, (List) b2Var.f150540a.getValue());
        if (kVar2 != null) {
            mVar.a(kVar2.f61572a);
        }
    }

    public final void N4() {
        p2 p2Var;
        Object value;
        ArrayList arrayList;
        do {
            p2Var = this.f67277i;
            value = p2Var.getValue();
            i53.c cVar = (i53.c) value;
            arrayList = new ArrayList(y.r(cVar, 10));
            Iterator<E> it = cVar.iterator();
            while (it.hasNext()) {
                arrayList.add(dy1.q.a((dy1.q) it.next(), null, null, true, 1));
            }
        } while (!p2Var.b(value, i53.a.e(arrayList)));
    }

    public final void O4(int i14) {
        Object value;
        ArrayList arrayList;
        dy1.v vVar;
        c0 c0Var = this.f67281m;
        p2 p2Var = c0Var.f128210d;
        do {
            value = p2Var.getValue();
            i53.c cVar = (i53.c) value;
            arrayList = new ArrayList(y.r(cVar, 10));
            int i15 = 0;
            for (Object obj : cVar) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    p13.x.q();
                    throw null;
                }
                dy1.v vVar2 = (dy1.v) obj;
                if (i15 == i14 && (vVar = (dy1.v) h0.e0(i14, (List) c0Var.f128208b.getValue())) != null) {
                    vVar2 = vVar;
                }
                arrayList.add(vVar2);
                i15 = i16;
            }
        } while (!p2Var.b(value, i53.a.e(arrayList)));
    }

    public final void P4(Boolean bool) {
        while (true) {
            p2 p2Var = this.f67276h;
            Object value = p2Var.getValue();
            Boolean bool2 = bool;
            if (p2Var.b(value, dy1.p.a((dy1.p) value, null, null, null, null, bool2, null, null, null, null, null, 1007))) {
                return;
            } else {
                bool = bool2;
            }
        }
    }

    public final void Q4(Boolean bool) {
        Object value;
        Object value2;
        p2 p2Var = this.f67276h;
        if (bool == null) {
            mx1.f fVar = ((dy1.p) p2Var.getValue()).f61598d;
            if (fVar == null || !fVar.d()) {
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, dy1.p.a((dy1.p) value, null, null, null, null, null, Boolean.TRUE, null, null, null, null, 991)));
            } else {
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, dy1.p.a((dy1.p) value2, null, null, null, null, null, null, null, null, null, null, 991)));
            }
        } else {
            while (true) {
                Object value3 = p2Var.getValue();
                Boolean bool2 = bool;
                if (p2Var.b(value3, dy1.p.a((dy1.p) value3, null, null, null, null, null, bool2, null, null, null, null, 991))) {
                    break;
                } else {
                    bool = bool2;
                }
            }
        }
        Z4();
    }

    public final void R4(int i14) {
        p2 p2Var;
        Object value;
        dy1.p pVar;
        mx1.f fVar;
        do {
            p2Var = this.f67276h;
            value = p2Var.getValue();
            pVar = (dy1.p) value;
            fVar = ((dy1.p) p2Var.getValue()).f61598d;
        } while (!p2Var.b(value, dy1.p.a(pVar, null, null, null, fVar != null ? mx1.f.a(fVar, i14, null, 247) : null, null, null, null, null, null, null, 1015)));
        Y4();
    }

    public final void S4(Long l14) {
        while (true) {
            p2 p2Var = this.f67276h;
            Object value = p2Var.getValue();
            Long l15 = l14;
            if (p2Var.b(value, dy1.p.a((dy1.p) value, null, null, null, null, null, null, l15, null, null, null, 959))) {
                Z4();
                return;
            }
            l14 = l15;
        }
    }

    public final void T4(mx1.e eVar) {
        p2 p2Var;
        Object value;
        dy1.p pVar;
        mx1.f fVar;
        do {
            p2Var = this.f67276h;
            value = p2Var.getValue();
            pVar = (dy1.p) value;
            fVar = ((dy1.p) p2Var.getValue()).f61598d;
        } while (!p2Var.b(value, dy1.p.a(pVar, null, null, null, fVar != null ? mx1.f.a(fVar, 0, eVar, 239) : null, null, null, null, null, null, null, 1015)));
    }

    public final void U4(mx1.c cVar) {
        while (true) {
            p2 p2Var = this.f67276h;
            Object value = p2Var.getValue();
            mx1.c cVar2 = cVar;
            if (p2Var.b(value, dy1.p.a((dy1.p) value, null, cVar2, null, null, null, null, null, null, null, null, 1021))) {
                return;
            } else {
                cVar = cVar2;
            }
        }
    }

    public final void V4(mx1.d dVar) {
        p2 p2Var;
        mx1.d dVar2;
        Object value;
        Object value2;
        Object value3;
        dy1.p pVar;
        mx1.f fVar;
        mx1.d dVar3;
        mx1.d dVar4;
        while (true) {
            p2Var = this.f67276h;
            Object value4 = p2Var.getValue();
            dVar2 = dVar;
            if (p2Var.b(value4, dy1.p.a((dy1.p) value4, dVar2, null, null, null, null, null, null, null, null, null, 1022))) {
                break;
            } else {
                dVar = dVar2;
            }
        }
        if (dVar2 == mx1.d.CUSTOM) {
            W4(mx1.g.f121409g);
            return;
        }
        mx1.d dVar5 = ((dy1.p) p2Var.getValue()).f61595a;
        if (h0.R(p13.x.k(mx1.d.INCREASE_MAX_STRENGTH, mx1.d.BUILD_MUSCLE_MASS), dVar5)) {
            do {
                value3 = p2Var.getValue();
                pVar = (dy1.p) value3;
                fVar = mx1.g.f121403a;
                dVar3 = ((dy1.p) p2Var.getValue()).f61595a;
                dVar4 = mx1.d.INCREASE_MAX_STRENGTH;
            } while (!p2Var.b(value3, dy1.p.a(pVar, null, null, i53.a.a(mx1.f.a(fVar, 0, dVar3 == dVar4 ? mx1.e.REP_5 : mx1.e.REP_10, 239), ((dy1.p) p2Var.getValue()).f61595a == dVar4 ? mx1.g.f121405c : mx1.g.f121406d, mx1.f.a(mx1.g.f121404b, 0, ((dy1.p) p2Var.getValue()).f61595a == dVar4 ? mx1.e.REP_5 : mx1.e.REP_10, 239)), null, null, null, null, null, null, null, 1019)));
            return;
        }
        if (dVar5 == mx1.d.GET_FIT) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, dy1.p.a((dy1.p) value2, null, null, i53.a.a(mx1.g.f121407e, mx1.g.f121408f), null, null, null, null, null, null, null, 1019)));
        } else {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, dy1.p.a((dy1.p) value, null, null, j53.l.b(), null, null, null, null, null, null, null, 1019)));
        }
    }

    public final void W4(mx1.f fVar) {
        fVar.getClass();
        while (true) {
            p2 p2Var = this.f67276h;
            Object value = p2Var.getValue();
            mx1.f fVar2 = fVar;
            if (p2Var.b(value, dy1.p.a((dy1.p) value, null, null, null, fVar2, null, null, null, null, null, null, 1015))) {
                Y4();
                return;
            }
            fVar = fVar2;
        }
    }

    public final void X4(mx1.b bVar, String str, boolean z14) {
        Object value;
        ArrayList arrayList;
        bVar.getClass();
        str.getClass();
        c0 c0Var = this.f67281m;
        c0Var.getClass();
        p2 p2Var = c0Var.f128210d;
        do {
            value = p2Var.getValue();
            i53.c<dy1.v> cVar = (i53.c) value;
            arrayList = new ArrayList(y.r(cVar, 10));
            for (dy1.v vVarA : cVar) {
                if (vVarA.f61640a == bVar) {
                    i53.c<dy1.h> cVar2 = vVarA.f61641b.f61639a;
                    ArrayList arrayList2 = new ArrayList(y.r(cVar2, 10));
                    for (dy1.h hVarA : cVar2) {
                        if (p005kotlin.jvm.internal.s.g(hVarA.f61556a, str)) {
                            hVarA = dy1.h.a(hVarA, null, null, false, false, z14, false, null, 991);
                        }
                        arrayList2.add(hVarA);
                    }
                    dy1.u uVar = new dy1.u(i53.a.e(arrayList2));
                    i53.c<dy1.u> cVar3 = vVarA.f61642c;
                    ArrayList arrayList3 = new ArrayList(y.r(cVar3, 10));
                    Iterator<dy1.u> it = cVar3.iterator();
                    while (it.hasNext()) {
                        i53.c<dy1.h> cVar4 = it.next().f61639a;
                        ArrayList arrayList4 = new ArrayList(y.r(cVar4, 10));
                        for (dy1.h hVarA2 : cVar4) {
                            if (p005kotlin.jvm.internal.s.g(hVarA2.f61556a, str)) {
                                hVarA2 = dy1.h.a(hVarA2, null, null, false, false, z14, false, null, 991);
                            }
                            arrayList4.add(hVarA2);
                        }
                        i53.c cVarE = i53.a.e(arrayList4);
                        cVarE.getClass();
                        arrayList3.add(new dy1.u(cVarE));
                    }
                    i53.c cVarE2 = i53.a.e(arrayList3);
                    i53.c<dy1.h> cVar5 = vVarA.f61643d.f61639a;
                    ArrayList arrayList5 = new ArrayList(y.r(cVar5, 10));
                    for (dy1.h hVarA3 : cVar5) {
                        if (p005kotlin.jvm.internal.s.g(hVarA3.f61556a, str)) {
                            hVarA3 = dy1.h.a(hVarA3, null, null, false, false, z14, false, null, 991);
                        }
                        arrayList5.add(hVarA3);
                    }
                    i53.c cVarE3 = i53.a.e(arrayList5);
                    cVarE3.getClass();
                    vVarA = dy1.v.a(vVarA, uVar, cVarE2, new dy1.u(cVarE3), null, 17);
                }
                arrayList.add(vVarA);
            }
        } while (!p2Var.b(value, i53.a.e(arrayList)));
    }

    public final void Y4() {
        p2 p2Var;
        Object value;
        mx1.f fVar = ((dy1.p) this.f67289w.f150540a.getValue()).f61598d;
        if (fVar != null) {
            do {
                p2Var = this.f67275g;
                value = p2Var.getValue();
                ((Number) value).intValue();
            } while (!p2Var.b(value, Integer.valueOf(new mx1.h.f(fVar, this.f67285q != null, y4()).f121424d)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z4() {
        p2 p2Var;
        Object value;
        dy1.p pVar;
        DateTime dateTimePlusWeeks;
        int i14;
        m0 m0Var;
        do {
            p2Var = this.f67276h;
            value = p2Var.getValue();
            pVar = (dy1.p) value;
            Long l14 = pVar.f61601g;
            DateTime dateTime = new DateTime(l14 != null ? l14.longValue() : 0L, DateTimeZone.UTC);
            mx1.f fVar = pVar.f61598d;
            DateTime dateTimePlusWeeks2 = dateTime.plusWeeks((fVar != null ? fVar.f121400f.f96796a : 0) - 1);
            Boolean bool = pVar.f61599e;
            Boolean bool2 = Boolean.TRUE;
            dateTimePlusWeeks = dateTimePlusWeeks2.plusWeeks(p005kotlin.jvm.internal.s.g(bool, bool2) ? 1 : 0).plusWeeks(p005kotlin.jvm.internal.s.g(pVar.f61600f, bool2) ? 1 : 0);
            b2 b2Var = this.C;
            List list = (List) b2Var.f150540a.getValue();
            list.getClass();
            Iterator it = h0.j1(list).iterator();
            Object obj = null;
            Object obj2 = null;
            while (true) {
                o0 o0Var = (o0) it;
                if (!o0Var.f134956a.hasNext()) {
                    break;
                }
                Object next = o0Var.next();
                dy1.q qVar = (dy1.q) ((m0) next).f134952b;
                qVar.getClass();
                if (qVar.f61607c != null) {
                    obj2 = next;
                }
            }
            m0 m0Var2 = (m0) obj2;
            i14 = m0Var2 != null ? m0Var2.f134951a : -1;
            List list2 = (List) b2Var.f150540a.getValue();
            list2.getClass();
            Iterator it3 = h0.j1(list2).iterator();
            while (true) {
                o0 o0Var2 = (o0) it3;
                if (!o0Var2.f134956a.hasNext()) {
                    break;
                }
                Object next2 = o0Var2.next();
                dy1.q qVar2 = (dy1.q) ((m0) next2).f134952b;
                qVar2.getClass();
                if (qVar2.f61607c != null) {
                    obj = next2;
                    break;
                }
            }
            m0Var = (m0) obj;
        } while (!p2Var.b(value, dy1.p.a(pVar, null, null, null, null, null, null, null, Long.valueOf(dateTimePlusWeeks.plusDays(i14 - (m0Var != null ? m0Var.f134951a : -1)).getMillis()), null, null, 895)));
    }

    public final void a5(a4 a4Var, mx1.b bVar) {
        p2 p2Var;
        Object value;
        ArrayList arrayList;
        a4Var.getClass();
        do {
            p2Var = this.f67277i;
            value = p2Var.getValue();
            i53.c<dy1.q> cVar = (i53.c) value;
            arrayList = new ArrayList(y.r(cVar, 10));
            for (dy1.q qVarA : cVar) {
                if (qVarA.f61605a == a4Var) {
                    qVarA = dy1.q.a(qVarA, null, bVar, false, 1);
                } else if (qVarA.f61607c == bVar) {
                    qVarA = dy1.q.a(qVarA, null, null, true, 1);
                } else if (qVarA.f61606b == bVar) {
                    qVarA = dy1.q.a(qVarA, null, null, false, 13);
                }
                arrayList.add(qVarA);
            }
        } while (!p2Var.b(value, i53.a.e(arrayList)));
    }

    public final boolean y4() {
        boolean z14 = ((dy1.p) this.f67276h.getValue()).f61596b == mx1.c.FULL_GYM;
        i53.c<dy1.d> cVar = ((dy1.c) this.f67280l.f128200d.f150540a.getValue()).f61536b;
        ArrayList<dy1.b> arrayList = new ArrayList(y.r(cVar, 10));
        for (dy1.d dVar : cVar) {
            arrayList.add(z14 ? dVar.f61542c : dVar.f61543d);
        }
        if (!arrayList.isEmpty()) {
            for (dy1.b bVar : arrayList) {
                if (bVar != null) {
                    Double d14 = bVar.f61533f;
                    if ((d14 != null ? d14.doubleValue() : 0.0d) > 0.0d) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final void z4(mx1.b bVar, String str, kx1.a aVar) {
        Object value;
        ArrayList arrayList;
        bVar.getClass();
        str.getClass();
        aVar.getClass();
        c0 c0Var = this.f67281m;
        c0Var.getClass();
        p2 p2Var = c0Var.f128210d;
        do {
            value = p2Var.getValue();
            i53.c<dy1.v> cVar = (i53.c) value;
            int i14 = 10;
            arrayList = new ArrayList(y.r(cVar, 10));
            for (dy1.v vVarA : cVar) {
                if (vVarA.f61640a == bVar) {
                    i53.c<dy1.u> cVar2 = vVarA.f61642c;
                    ArrayList arrayList2 = new ArrayList(y.r(cVar2, i14));
                    Iterator<dy1.u> it = cVar2.iterator();
                    while (it.hasNext()) {
                        i53.c<dy1.h> cVar3 = it.next().f61639a;
                        ArrayList arrayList3 = new ArrayList(y.r(cVar3, i14));
                        for (dy1.h hVarA : cVar3) {
                            if (p005kotlin.jvm.internal.s.g(hVarA.f61556a, str)) {
                                String str2 = aVar.f107116a;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                String str3 = aVar.f107117b;
                                String str4 = str3 == null ? "" : str3;
                                String str5 = aVar.f107118c;
                                hVarA = dy1.h.a(hVarA, str2, str4, false, false, false, false, str5 == null ? "" : str5, 892);
                            }
                            arrayList3.add(hVarA);
                        }
                        i53.c cVarE = i53.a.e(arrayList3);
                        cVarE.getClass();
                        arrayList2.add(new dy1.u(cVarE));
                        i14 = 10;
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (hashSet.add(((dy1.u) obj).a())) {
                            arrayList4.add(obj);
                        }
                    }
                    vVarA = dy1.v.a(vVarA, null, i53.a.e(arrayList4), null, null, 27);
                }
                arrayList.add(vVarA);
                i14 = 10;
            }
        } while (!p2Var.b(value, i53.a.e(arrayList)));
    }

    /* JADX INFO: renamed from: ey1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ley1/a$a;", "", "<init>", "()V", "", "GC5_DASHBOARD_REFRESH_DELAY", "J", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1397a {
        public /* synthetic */ C1397a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1397a() {
        }
    }
}

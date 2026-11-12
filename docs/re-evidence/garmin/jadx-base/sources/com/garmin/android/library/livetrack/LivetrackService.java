package com.garmin.android.library.livetrack;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.LongSparseArray;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.library.livetrack.data.LocalDatabase;
import e23.p;
import fe2.e2;
import fe2.j0;
import fe2.p1;
import fe2.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kd0.c6;
import kd0.e1;
import kd0.m5;
import o13.m;
import o13.r;
import o53.b0;
import o53.m1;
import o53.s0;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.w;
import t21.v0;
import u53.o;
import wd2.a2;
import wd2.e0;
import wd2.g2;
import wd2.h0;
import wd2.i0;
import wd2.i2;
import wd2.k0;
import wd2.l;
import wd2.l0;
import wd2.m0;
import wd2.t0;
import wd2.u0;
import wd2.y1;
import wd2.z1;
import xd2.a1;
import xd2.b1;
import xd2.g1;
import xd2.x0;
import xd2.z0;
import z6.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/library/livetrack/LivetrackService;", "Landroid/app/Service;", "Lo53/b0;", "<init>", "()V", "b", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LivetrackService extends Service implements b0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f50160k = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f50164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public de2.a f50165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a1 f50166f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q f50168h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f50161a = g8.i.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f50162b = i2.a("LivetrackService");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<com.garmin.android.library.livetrack.d> f50163c = new y0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LongSparseArray<p1> f50167g = new LongSparseArray<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w0<ge2.e> f50169i = new w0<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h0 f50170j = new h0(this, 0);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/livetrack/LivetrackService$b;", "Landroid/os/Binder;", "<init>", "(Lcom/garmin/android/library/livetrack/LivetrackService;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends Binder {
        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$livetrackSettingsObserver$1$1", f = "LivetrackService.kt", l = {96}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50172a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ge2.e f50174c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ge2.e eVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f50174c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return LivetrackService.this.new c(this.f50174c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50172a;
            if (i14 == 0) {
                r.b(obj);
                de2.a aVar2 = LivetrackService.this.f50165e;
                if (aVar2 == null) {
                    s.m("deviceManager");
                    throw null;
                }
                this.f50172a = 1;
                if (aVar2.r(this.f50174c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$startLivetrack$1", f = "LivetrackService.kt", l = {153, 157, 159}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f50175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50176b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e0 f50178d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l f50179e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e0 e0Var, l lVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f50178d = e0Var;
            this.f50179e = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return LivetrackService.this.new d(this.f50178d, this.f50179e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x008b  */
        /* JADX WARN: Code duplicated, block: B:29:0x0093  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:35:0x00be  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:38:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:44:0x00de  */
        /* JADX WARN: Code duplicated, block: B:46:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:48:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:75:0x0182  */
        /* JADX WARN: Code duplicated, block: B:77:0x0186  */
        /* JADX WARN: Code duplicated, block: B:79:0x018a  */
        /* JADX WARN: Code duplicated, block: B:81:0x018e  */
        /* JADX WARN: Code duplicated, block: B:84:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:86:0x01ae  */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x010e, code lost:
        
            if (r2 == r1) goto L51;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            long j8;
            Object objA;
            Throwable th3;
            long j14;
            a1 a1Var;
            de2.a aVar;
            l lVar;
            p1 bVar;
            Object objH;
            fe2.y0 y0Var;
            long j15;
            a1 a1Var2;
            de2.a aVar2;
            l lVar2;
            l lVar3;
            p1 p1Var;
            List<v1> listK;
            Object next;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50176b;
            e0 e0Var = this.f50178d;
            LivetrackService livetrackService = LivetrackService.this;
            if (i14 == 0) {
                r.b(obj);
                this.f50176b = 1;
                int i15 = LivetrackService.f50160k;
                if (livetrackService.d(this) != aVar3) {
                }
                return aVar3;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 == 2) {
                    j8 = this.f50175a;
                    r.b(obj);
                    objA = obj;
                    if (((Boolean) objA).booleanValue()) {
                        LongSparseArray<p1> longSparseArray = livetrackService.f50167g;
                        if (e0Var.f184436d) {
                            th3 = null;
                            y0Var = new fe2.y0(e0Var.f184435c, e0Var.f184437e, e0Var.f184438f, e0Var.f184439g, e0Var.f184441i);
                            j15 = e0Var.f184433a;
                            a1Var2 = livetrackService.f50166f;
                            if (a1Var2 != null) {
                                s.m("repository");
                                throw null;
                            }
                            aVar2 = livetrackService.f50165e;
                            if (aVar2 != null) {
                                s.m("deviceManager");
                                throw null;
                            }
                            lVar2 = livetrackService.f50164d;
                            if (lVar2 != null) {
                                s.m("applicationDelegate");
                                throw null;
                            }
                            bVar = new j0(j15, y0Var, a1Var2, aVar2, lVar2);
                        } else {
                            th3 = null;
                            j14 = e0Var.f184433a;
                            a1Var = livetrackService.f50166f;
                            if (a1Var != null) {
                                s.m("repository");
                                throw null;
                            }
                            aVar = livetrackService.f50165e;
                            if (aVar != null) {
                                s.m("deviceManager");
                                throw null;
                            }
                            lVar = livetrackService.f50164d;
                            if (lVar != null) {
                                s.m("applicationDelegate");
                                throw null;
                            }
                            bVar = new fe2.b(j14, a1Var, aVar, lVar, null, 16, null);
                        }
                        longSparseArray.put(j8, bVar);
                        p1 p1Var2 = livetrackService.f50167g.get(j8);
                        i iVar = e0Var.f184434b;
                        this.f50175a = j8;
                        this.f50176b = 3;
                        objH = p1Var2.h(iVar, this);
                    } else {
                        th3 = null;
                        livetrackService.f50163c.m(new com.garmin.android.library.livetrack.d.a(j8, com.garmin.android.library.livetrack.c.f.f50191a));
                    }
                    lVar3 = livetrackService.f50164d;
                    if (lVar3 != null) {
                        livetrackService.m(lVar3.f().e());
                        return Unit.INSTANCE;
                    }
                    s.m("applicationDelegate");
                    throw th3;
                }
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j16 = this.f50175a;
                r.b(obj);
                j8 = j16;
                th3 = null;
                objH = obj;
            }
            com.garmin.android.library.livetrack.d dVar = (com.garmin.android.library.livetrack.d) objH;
            Logger logger = livetrackService.f50162b;
            LongSparseArray<p1> longSparseArray2 = livetrackService.f50167g;
            logger.debug("Session result for " + j8 + " is " + dVar);
            if (!(dVar instanceof com.garmin.android.library.livetrack.d.c)) {
                longSparseArray2.remove(j8);
            }
            livetrackService.f50163c.m(dVar);
            if (longSparseArray2.size() != 0 && longSparseArray2.indexOfKey(j8) >= 0 && (p1Var = longSparseArray2.get(j8)) != null && (listK = p1Var.k()) != null) {
                Iterator<T> it = listK.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = th3;
                        break;
                    }
                    next = it.next();
                    v1.b bVar2 = ((v1) next).f70968d;
                    if (bVar2 != null && (bVar2 instanceof v1.b.e)) {
                        break;
                    }
                }
                if (((v1) next) != null) {
                    this.f50179e.b().a(com.garmin.android.library.livetrack.b.a.EVENT_LIVETRACK_STARTED_WITH_SMS_RECIPIENT);
                }
            }
            lVar3 = livetrackService.f50164d;
            if (lVar3 != null) {
                livetrackService.m(lVar3.f().e());
                return Unit.INSTANCE;
            }
            s.m("applicationDelegate");
            throw th3;
            j8 = e0Var.f184433a;
            ArrayList arrayList = new ArrayList();
            LongSparseArray<p1> longSparseArray3 = livetrackService.f50167g;
            int size = longSparseArray3.size();
            for (int i16 = 0; i16 < size; i16++) {
                longSparseArray3.keyAt(i16);
                arrayList.add(longSparseArray3.valueAt(i16));
            }
            l lVar4 = livetrackService.f50164d;
            if (lVar4 == null) {
                s.m("applicationDelegate");
                throw null;
            }
            m5 m5VarC = lVar4.c();
            de2.a aVar4 = livetrackService.f50165e;
            if (aVar4 == null) {
                s.m("deviceManager");
                throw null;
            }
            e2 e2Var = new e2(m5VarC, aVar4);
            this.f50175a = j8;
            this.f50176b = 2;
            objA = e2Var.a(e0Var, arrayList, this);
            if (objA != aVar3) {
                if (((Boolean) objA).booleanValue()) {
                    LongSparseArray<p1> longSparseArray4 = livetrackService.f50167g;
                    if (e0Var.f184436d) {
                        th3 = null;
                        y0Var = new fe2.y0(e0Var.f184435c, e0Var.f184437e, e0Var.f184438f, e0Var.f184439g, e0Var.f184441i);
                        j15 = e0Var.f184433a;
                        a1Var2 = livetrackService.f50166f;
                        if (a1Var2 != null) {
                            s.m("repository");
                            throw null;
                        }
                        aVar2 = livetrackService.f50165e;
                        if (aVar2 != null) {
                            s.m("deviceManager");
                            throw null;
                        }
                        lVar2 = livetrackService.f50164d;
                        if (lVar2 != null) {
                            s.m("applicationDelegate");
                            throw null;
                        }
                        bVar = new j0(j15, y0Var, a1Var2, aVar2, lVar2);
                    } else {
                        th3 = null;
                        j14 = e0Var.f184433a;
                        a1Var = livetrackService.f50166f;
                        if (a1Var != null) {
                            s.m("repository");
                            throw null;
                        }
                        aVar = livetrackService.f50165e;
                        if (aVar != null) {
                            s.m("deviceManager");
                            throw null;
                        }
                        lVar = livetrackService.f50164d;
                        if (lVar != null) {
                            s.m("applicationDelegate");
                            throw null;
                        }
                        bVar = new fe2.b(j14, a1Var, aVar, lVar, null, 16, null);
                    }
                    longSparseArray4.put(j8, bVar);
                    p1 p1Var3 = livetrackService.f50167g.get(j8);
                    i iVar2 = e0Var.f184434b;
                    this.f50175a = j8;
                    this.f50176b = 3;
                    objH = p1Var3.h(iVar2, this);
                } else {
                    th3 = null;
                    livetrackService.f50163c.m(new com.garmin.android.library.livetrack.d.a(j8, com.garmin.android.library.livetrack.c.f.f50191a));
                }
                lVar3 = livetrackService.f50164d;
                if (lVar3 != null) {
                    livetrackService.m(lVar3.f().e());
                    return Unit.INSTANCE;
                }
                s.m("applicationDelegate");
                throw th3;
            }
            return aVar3;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) throws Throwable {
        i0 i0Var;
        j jVar;
        wd2.a aVar;
        String str;
        Class cls;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i14 = i0Var.f184502f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i0Var.f184502f = i14 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object obj = i0Var.f184500d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = i0Var.f184502f;
        if (i15 == 0) {
            r.b(obj);
            l lVar = this.f50164d;
            if (lVar == null) {
                s.m("applicationDelegate");
                throw null;
            }
            e1 e1VarF = lVar.f();
            l lVar2 = this.f50164d;
            if (lVar2 == null) {
                s.m("applicationDelegate");
                throw null;
            }
            lVar2.e().getClass();
            int i16 = kd0.e2.a.f104041a[GCMSettingManager.k().f77335a.ordinal()];
            if (i16 != 1) {
                jVar = i16 != 2 ? j.b.c.f50233b : j.b.a.f50231b;
            } else {
                jVar = j.b.C0999b.f50232b;
            }
            String strN = fb1.c.n("https://", jVar.f50230a);
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            l0 l0Var = new l0(this, null);
            i0Var.f184497a = e1VarF;
            i0Var.f184498b = z0.class;
            i0Var.f184499c = strN;
            i0Var.f184502f = 1;
            Object objE0 = ge1.b.e0(bVar, l0Var, i0Var);
            if (objE0 == aVar2) {
                return aVar2;
            }
            aVar = e1VarF;
            obj = objE0;
            str = strN;
            cls = z0.class;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = i0Var.f184499c;
            cls = i0Var.f184498b;
            aVar = i0Var.f184497a;
            r.b(obj);
        }
        OkHttpClient okHttpClient = (OkHttpClient) obj;
        cls.getClass();
        str.getClass();
        okHttpClient.getClass();
        c83.b0.b bVar2 = new c83.b0.b();
        bVar2.b(str);
        bVar2.f25766a = okHttpClient;
        bVar2.a(e83.a.c());
        z0 z0Var = (z0) bVar2.c().b(cls);
        LocalDatabase.a aVar3 = LocalDatabase.f50198a;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        x0 x0Var = new x0(aVar3.a(applicationContext), b1.f190056a);
        k0 k0Var = new k0(aVar, this);
        l lVar3 = this.f50164d;
        if (lVar3 != null) {
            return new xd2.b(z0Var, x0Var, k0Var, lVar3, m.b(new w72.f(22)));
        }
        s.m("applicationDelegate");
        throw null;
    }

    public final Set<z1> b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LongSparseArray<p1> longSparseArray = this.f50167g;
        int size = longSparseArray.size();
        for (int i14 = 0; i14 < size; i14++) {
            longSparseArray.keyAt(i14);
            p1 p1VarValueAt = longSparseArray.valueAt(i14);
            if (!p1VarValueAt.getF70802n()) {
                p1VarValueAt = null;
            }
            if (p1VarValueAt != null) {
                linkedHashSet.add(xd2.a.a(p1VarValueAt));
            }
        }
        return linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(long j8, v13.c cVar) {
        m0 m0Var;
        p1 p1Var;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i14 = m0Var.f184529d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                m0Var.f184529d = i14 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(this, cVar);
            }
        } else {
            m0Var = new m0(this, cVar);
        }
        Object obj = m0Var.f184527b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = m0Var.f184529d;
        if (i15 == 0) {
            r.b(obj);
            p1 p1Var2 = this.f50167g.get(j8);
            if (p1Var2 == null) {
                return null;
            }
            a1 a1Var = this.f50166f;
            if (a1Var == null) {
                s.m("repository");
                throw null;
            }
            m0Var.f184526a = p1Var2;
            m0Var.f184529d = 1;
            Object objY = a1Var.y(j8, m0Var, true);
            if (objY == aVar) {
                return aVar;
            }
            obj = objY;
            p1Var = p1Var2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p1Var = m0Var.f184526a;
            r.b(obj);
        }
        g1 g1Var = (g1) obj;
        be2.f fVar = g1Var instanceof g1.b ? (be2.f) ((g1.b) g1Var).f190167a : null;
        this.f50162b.debug("Creator sharing errors: " + p1Var.q());
        return new a2(xd2.a.a(p1Var), fVar != null ? xd2.a.d(fVar) : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(v13.c cVar) throws Throwable {
        wd2.s0 s0Var;
        LivetrackService livetrackService;
        if (cVar instanceof wd2.s0) {
            s0Var = (wd2.s0) cVar;
            int i14 = s0Var.f184604d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s0Var.f184604d = i14 - Integer.MIN_VALUE;
            } else {
                s0Var = new wd2.s0(this, cVar);
            }
        } else {
            s0Var = new wd2.s0(this, cVar);
        }
        Object objA = s0Var.f184602b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s0Var.f184604d;
        if (i15 != 0) {
            if (i15 == 1) {
                r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                livetrackService = s0Var.f184601a;
                r.b(objA);
            }
            livetrackService.f50166f = (a1) objA;
            return Unit.INSTANCE;
        }
        r.b(objA);
        if (this.f50165e == null) {
            l lVar = this.f50164d;
            if (lVar == null) {
                s.m("applicationDelegate");
                throw null;
            }
            de2.a aVar2 = new de2.a(this, lVar.a(), new v0(this, 19));
            this.f50165e = aVar2;
            s0Var.f184604d = 1;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.garmin.livetrack.ACTION_ON_CANCEL_START_LIVE_TRACK_REQUEST_RECEIVED");
            de2.a.b bVar = aVar2.f59234g;
            Context context = aVar2.f59231d;
            i2.b(context, bVar, intentFilter);
            da2.d.c(context).f58886a.b(aVar2.f59236i);
            if (Unit.INSTANCE != aVar) {
            }
            return aVar;
        }
        return Unit.INSTANCE;
        if (this.f50166f == null) {
            s0Var.f184601a = this;
            s0Var.f184604d = 2;
            objA = a(s0Var);
            if (objA != aVar) {
                livetrackService = this;
                livetrackService.f50166f = (a1) objA;
            }
            return aVar;
        }
        return Unit.INSTANCE;
    }

    public final void e(long j8, boolean z14, e0 e0Var, l lVar) {
        p1 p1Var;
        lVar.getClass();
        this.f50164d = lVar;
        LongSparseArray<p1> longSparseArray = this.f50167g;
        if (!z14 || e0Var == null) {
            if (z14 || (p1Var = longSparseArray.get(j8)) == null || p1Var.a()) {
                return;
            }
            j(j8, i.a.f50228a);
            return;
        }
        String str = e0Var.f184437e;
        boolean z15 = str == null || str.length() == 0;
        long j14 = e0Var.f184433a;
        Logger logger = this.f50162b;
        if (!z15 && longSparseArray.indexOfKey(j14) < 0) {
            wr.g.v("Device ", j14, ": has session, app: no session.", logger);
            l lVar2 = this.f50164d;
            if (lVar2 != null) {
                i(e0Var, lVar2);
                return;
            } else {
                s.m("applicationDelegate");
                throw null;
            }
        }
        if (!z15 || longSparseArray.indexOfKey(j14) < 0) {
            return;
        }
        wr.g.v("Device ", j14, ": no session, app: has session.", logger);
        p1 p1Var2 = longSparseArray.get(j14);
        if (p1Var2 == null || p1Var2.a()) {
            return;
        }
        j(j14, i.a.f50228a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[PHI: r11
      0x0099: PHI (r11v4 long) = (r11v3 long), (r11v3 long), (r11v14 long) binds: [B:31:0x007a, B:35:0x0092, B:19:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac A[PHI: r11 r14
      0x00ac: PHI (r11v6 long) = (r11v4 long), (r11v15 long) binds: [B:42:0x00a9, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r14v10 java.lang.Object) = (r14v9 java.lang.Object), (r14v1 java.lang.Object) binds: [B:42:0x00a9, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ca, code lost:
    
        if (r11 == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j8, l lVar, v13.c cVar) {
        t0 t0Var;
        g1 g1Var;
        de2.a aVar;
        ge2.e eVarD;
        l lVar2;
        g2 g2Var;
        de2.a aVar2;
        Object objU;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i14 = t0Var.f184616d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t0Var.f184616d = i14 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(this, cVar);
            }
        } else {
            t0Var = new t0(this, cVar);
        }
        Object objY = t0Var.f184614b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = t0Var.f184616d;
        if (i15 == 0) {
            r.b(objY);
            this.f50164d = lVar;
            t0Var.f184613a = j8;
            t0Var.f184616d = 1;
            if (d(t0Var) != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            j8 = t0Var.f184613a;
            r.b(objY);
        } else {
            if (i15 == 2) {
                j8 = t0Var.f184613a;
                r.b(objY);
                g1Var = (g1) objY;
                if (g1Var instanceof g1.b) {
                    aVar = this.f50165e;
                    if (aVar != null) {
                        s.m("deviceManager");
                        throw null;
                    }
                    eVarD = xd2.a.d((be2.f) ((g1.b) g1Var).f190167a);
                    t0Var.f184613a = j8;
                    t0Var.f184616d = 3;
                    if (aVar.s(j8, eVarD, t0Var) != obj) {
                        lVar2 = this.f50164d;
                        if (lVar2 == null) {
                            s.m("applicationDelegate");
                            throw null;
                        }
                        c6 c6VarD = lVar2.d();
                        t0Var.f184613a = j8;
                        t0Var.f184616d = 4;
                        objY = c6VarD.a(true, t0Var);
                        if (objY != obj) {
                            g2Var = (g2) objY;
                            aVar2 = this.f50165e;
                            if (aVar2 != null) {
                                s.m("deviceManager");
                                throw null;
                            }
                            t0Var.f184613a = j8;
                            t0Var.f184616d = 5;
                            objU = aVar2.u(w.c(new Long(j8)), g2Var instanceof g2.b, t0Var);
                            if (objU != obj) {
                                objU = Unit.INSTANCE;
                            }
                        }
                    }
                } else {
                    lVar2 = this.f50164d;
                    if (lVar2 == null) {
                        s.m("applicationDelegate");
                        throw null;
                    }
                    c6 c6VarD2 = lVar2.d();
                    t0Var.f184613a = j8;
                    t0Var.f184616d = 4;
                    objY = c6VarD2.a(true, t0Var);
                    if (objY != obj) {
                        g2Var = (g2) objY;
                        aVar2 = this.f50165e;
                        if (aVar2 != null) {
                            s.m("deviceManager");
                            throw null;
                        }
                        t0Var.f184613a = j8;
                        t0Var.f184616d = 5;
                        objU = aVar2.u(w.c(new Long(j8)), g2Var instanceof g2.b, t0Var);
                        if (objU != obj) {
                            objU = Unit.INSTANCE;
                        }
                    }
                }
                return obj;
            }
            if (i15 == 3) {
                j8 = t0Var.f184613a;
                r.b(objY);
                lVar2 = this.f50164d;
                if (lVar2 == null) {
                    s.m("applicationDelegate");
                    throw null;
                }
                c6 c6VarD3 = lVar2.d();
                t0Var.f184613a = j8;
                t0Var.f184616d = 4;
                objY = c6VarD3.a(true, t0Var);
                if (objY != obj) {
                    g2Var = (g2) objY;
                    aVar2 = this.f50165e;
                    if (aVar2 != null) {
                        s.m("deviceManager");
                        throw null;
                    }
                    t0Var.f184613a = j8;
                    t0Var.f184616d = 5;
                    objU = aVar2.u(w.c(new Long(j8)), g2Var instanceof g2.b, t0Var);
                    if (objU != obj) {
                        objU = Unit.INSTANCE;
                    }
                }
                return obj;
            }
            if (i15 == 4) {
                j8 = t0Var.f184613a;
                r.b(objY);
                g2Var = (g2) objY;
                aVar2 = this.f50165e;
                if (aVar2 != null) {
                    s.m("deviceManager");
                    throw null;
                }
                t0Var.f184613a = j8;
                t0Var.f184616d = 5;
                objU = aVar2.u(w.c(new Long(j8)), g2Var instanceof g2.b, t0Var);
                if (objU != obj) {
                    objU = Unit.INSTANCE;
                }
            } else {
                if (i15 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objY);
            }
        }
        return Unit.INSTANCE;
        a1 a1Var = this.f50166f;
        if (a1Var == null) {
            s.m("repository");
            throw null;
        }
        t0Var.f184613a = j8;
        t0Var.f184616d = 2;
        objY = a1Var.y(j8, t0Var, true);
        if (objY != obj) {
            g1Var = (g1) objY;
            if (g1Var instanceof g1.b) {
                lVar2 = this.f50164d;
                if (lVar2 == null) {
                    s.m("applicationDelegate");
                    throw null;
                }
                c6 c6VarD4 = lVar2.d();
                t0Var.f184613a = j8;
                t0Var.f184616d = 4;
                objY = c6VarD4.a(true, t0Var);
                if (objY != obj) {
                    g2Var = (g2) objY;
                    aVar2 = this.f50165e;
                    if (aVar2 != null) {
                        s.m("deviceManager");
                        throw null;
                    }
                    t0Var.f184613a = j8;
                    t0Var.f184616d = 5;
                    objU = aVar2.u(w.c(new Long(j8)), g2Var instanceof g2.b, t0Var);
                    if (objU != obj) {
                        objU = Unit.INSTANCE;
                    }
                }
            } else {
                aVar = this.f50165e;
                if (aVar != null) {
                    s.m("deviceManager");
                    throw null;
                }
                eVarD = xd2.a.d((be2.f) ((g1.b) g1Var).f190167a);
                t0Var.f184613a = j8;
                t0Var.f184616d = 3;
                if (aVar.s(j8, eVarD, t0Var) != obj) {
                    lVar2 = this.f50164d;
                    if (lVar2 == null) {
                        s.m("applicationDelegate");
                        throw null;
                    }
                    c6 c6VarD5 = lVar2.d();
                    t0Var.f184613a = j8;
                    t0Var.f184616d = 4;
                    objY = c6VarD5.a(true, t0Var);
                    if (objY != obj) {
                        g2Var = (g2) objY;
                        aVar2 = this.f50165e;
                        if (aVar2 != null) {
                            s.m("deviceManager");
                            throw null;
                        }
                        t0Var.f184613a = j8;
                        t0Var.f184616d = 5;
                        objU = aVar2.u(w.c(new Long(j8)), g2Var instanceof g2.b, t0Var);
                        if (objU != obj) {
                            objU = Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(long j8, ge2.e eVar, l lVar, v13.c cVar) {
        u0 u0Var;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i14 = u0Var.f184629e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                u0Var.f184629e = i14 - Integer.MIN_VALUE;
            } else {
                u0Var = new u0(this, cVar);
            }
        } else {
            u0Var = new u0(this, cVar);
        }
        Object obj = u0Var.f184627c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = u0Var.f184629e;
        if (i15 == 0) {
            r.b(obj);
            this.f50164d = lVar;
            u0Var.f184626b = eVar;
            u0Var.f184625a = j8;
            u0Var.f184629e = 1;
            if (d(u0Var) != obj2) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8 = u0Var.f184625a;
        eVar = u0Var.f184626b;
        r.b(obj);
        a1 a1Var = this.f50166f;
        if (a1Var == null) {
            s.m("repository");
            throw null;
        }
        u0Var.f184626b = null;
        u0Var.f184625a = j8;
        u0Var.f184629e = 2;
        Object objI = a1Var.i(j8, eVar, u0Var);
        return objI == obj2 ? obj2 : objI;
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        x53.c cVar = s0.f129406a;
        return o.f168762a.plus(this.f50161a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(long j8, ge2.a aVar, l lVar, v13.c cVar) {
        wd2.v0 v0Var;
        if (cVar instanceof wd2.v0) {
            v0Var = (wd2.v0) cVar;
            int i14 = v0Var.f184642e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                v0Var.f184642e = i14 - Integer.MIN_VALUE;
            } else {
                v0Var = new wd2.v0(this, cVar);
            }
        } else {
            v0Var = new wd2.v0(this, cVar);
        }
        Object obj = v0Var.f184640c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = v0Var.f184642e;
        if (i15 == 0) {
            r.b(obj);
            this.f50164d = lVar;
            v0Var.f184639b = aVar;
            v0Var.f184638a = j8;
            v0Var.f184642e = 1;
            if (d(v0Var) != obj2) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8 = v0Var.f184638a;
        aVar = v0Var.f184639b;
        r.b(obj);
        a1 a1Var = this.f50166f;
        if (a1Var == null) {
            s.m("repository");
            throw null;
        }
        v0Var.f184639b = null;
        v0Var.f184638a = j8;
        v0Var.f184642e = 2;
        Object objD = a1Var.D(j8, aVar, v0Var);
        return objD == obj2 ? obj2 : objD;
    }

    public final void i(e0 e0Var, l lVar) {
        e0Var.getClass();
        lVar.getClass();
        wr.g.y("Start livetrack device driven ", e0Var.f184436d, this.f50162b);
        this.f50164d = lVar;
        ge1.b.T(this, null, null, new d(e0Var, lVar, null), 3);
    }

    public final void j(long j8, i iVar) {
        iVar.getClass();
        Logger logger = this.f50162b;
        wr.g.w("Stop livetrack for ", j8, logger);
        if (this.f50164d == null) {
            logger.error("App Delegate is not initialized, did you call startLivetrack()?");
        } else {
            ge1.b.T(this, null, null, new wd2.w0(this, j8, iVar, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (r9.q(r8, r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(l lVar, boolean z14, v13.c cVar) {
        wd2.y0 y0Var;
        boolean z15;
        de2.a aVar;
        if (cVar instanceof wd2.y0) {
            y0Var = (wd2.y0) cVar;
            int i14 = y0Var.f184680d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                y0Var.f184680d = i14 - Integer.MIN_VALUE;
            } else {
                y0Var = new wd2.y0(this, cVar);
            }
        } else {
            y0Var = new wd2.y0(this, cVar);
        }
        Object objN = y0Var.f184678b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = y0Var.f184680d;
        if (i15 == 0) {
            r.b(objN);
            this.f50164d = lVar;
            y0Var.f184677a = z14;
            y0Var.f184680d = 1;
            if (d(y0Var) != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            z14 = y0Var.f184677a;
            r.b(objN);
        } else if (i15 == 2) {
            z15 = y0Var.f184677a;
            r.b(objN);
            if (((Boolean) objN).booleanValue()) {
                return Boolean.FALSE;
            }
            aVar = this.f50165e;
            if (aVar != null) {
                s.m("deviceManager");
                throw null;
            }
            y0Var.f184677a = z15;
            y0Var.f184680d = 3;
        } else {
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objN);
        }
        return Boolean.TRUE;
        a1 a1Var = this.f50166f;
        if (a1Var == null) {
            s.m("repository");
            throw null;
        }
        y0Var.f184677a = z14;
        y0Var.f184680d = 2;
        objN = a1Var.n(z14, y0Var);
        if (objN != obj) {
            z15 = z14;
            if (((Boolean) objN).booleanValue()) {
                return Boolean.FALSE;
            }
            aVar = this.f50165e;
            if (aVar != null) {
                s.m("deviceManager");
                throw null;
            }
            y0Var.f184677a = z15;
            y0Var.f184680d = 3;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object l(long j8, ge2.a aVar, l lVar, v13.c cVar) {
        wd2.z0 z0Var;
        LivetrackService livetrackService;
        if (cVar instanceof wd2.z0) {
            z0Var = (wd2.z0) cVar;
            int i14 = z0Var.f184692c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                z0Var.f184692c = i14 - Integer.MIN_VALUE;
            } else {
                z0Var = new wd2.z0(this, cVar);
            }
        } else {
            z0Var = new wd2.z0(this, cVar);
        }
        wd2.z0 z0Var2 = z0Var;
        Object objH = z0Var2.f184690a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = z0Var2.f184692c;
        if (i15 == 0) {
            r.b(objH);
            z0Var2.f184692c = 1;
            livetrackService = this;
            objH = livetrackService.h(j8, aVar, lVar, z0Var2);
            if (objH == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objH);
            livetrackService = this;
        }
        if (!((Boolean) objH).booleanValue()) {
            w0<ge2.e> w0Var = livetrackService.f50169i;
            w0Var.m(w0Var.d());
        }
        return Unit.INSTANCE;
    }

    public final void m(y1 y1Var) {
        fe2.b bVar;
        j0 j0Var;
        String strG;
        q qVar;
        LongSparseArray<p1> longSparseArray = this.f50167g;
        int size = longSparseArray.size();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                bVar = null;
                break;
            }
            longSparseArray.keyAt(i15);
            p1 p1VarValueAt = longSparseArray.valueAt(i15);
            if (p1VarValueAt instanceof fe2.b) {
                bVar = (fe2.b) p1VarValueAt;
                break;
            }
            i15++;
        }
        int size2 = longSparseArray.size();
        while (true) {
            if (i14 >= size2) {
                j0Var = null;
                break;
            }
            longSparseArray.keyAt(i14);
            p1 p1VarValueAt2 = longSparseArray.valueAt(i14);
            if (p1VarValueAt2 instanceof j0) {
                j0Var = (j0) p1VarValueAt2;
                break;
            }
            i14++;
        }
        if (bVar == null || (strG = bVar.f70650r) == null) {
            if (j0Var != null) {
                strG = j0Var.f70805q;
            } else {
                l lVar = this.f50164d;
                if (lVar == null) {
                    s.m("applicationDelegate");
                    throw null;
                }
                strG = lVar.f().g();
            }
        }
        if ((bVar == null && j0Var == null) || (qVar = this.f50168h) == null) {
            return;
        }
        qVar.f202686h = y1Var.f184683c;
        qVar.f(strG);
        z6.o oVar = new z6.o();
        oVar.f202664e = q.e(strG);
        qVar.l(oVar);
        Object systemService = getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            notificationManager.notify(410606, qVar.c());
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new b();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f50162b.debug("onCreate");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f50162b.debug("onDestroy");
        de2.a aVar = this.f50165e;
        if (aVar != null) {
            Context context = aVar.f59231d;
            i2.c(context, aVar.f59234g);
            if (aVar.f59233f) {
                aVar.f59233f = false;
                i2.c(context, aVar.f59235h);
            }
            da2.d.c(context).f58886a.i(aVar.f59236i);
        }
        this.f50161a.c(null);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i14, int i15) {
        Parcelable parcelable;
        Logger logger = this.f50162b;
        logger.debug("onStartCommand");
        if (intent == null) {
            logger.debug("onStartCommand: intent is null");
            return super.onStartCommand(null, i14, i15);
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("EXTRA_SERVICE_NOTIFICATION_INFO", y1.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("EXTRA_SERVICE_NOTIFICATION_INFO");
            if (!(parcelableExtra instanceof y1)) {
                parcelableExtra = null;
            }
            parcelable = (y1) parcelableExtra;
        }
        y1 y1Var = (y1) parcelable;
        if (y1Var == null) {
            logger.error("onStartCommand: EXTRA_SERVICE_NOTIFICATION_INFO is missing, cannot start foreground!");
            return 1;
        }
        String str = y1Var.f184684d;
        String str2 = y1Var.f184685e;
        String str3 = y1Var.f184686f;
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, 3);
        notificationChannel.setDescription(str3);
        Object systemService = getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        q qVar = new q(this, str);
        qVar.g(y1Var.f184681a);
        qVar.N.icon = y1Var.f184682b;
        qVar.i(2, true);
        qVar.i(16, false);
        qVar.B = "service";
        qVar.f202691m = 2;
        qVar.E = 1;
        logger.debug("onStartCommand: starting foreground");
        if (i16 >= 29) {
            startForeground(410606, qVar.c(), 16);
        } else {
            startForeground(410606, qVar.c());
        }
        this.f50168h = qVar;
        return 1;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/library/livetrack/LivetrackService$a;", "", "<init>", "()V", "", "EXTRA_SERVICE_NOTIFICATION_INFO", "Ljava/lang/String;", "TAG", "", "NOTIFICATION_ID", "I", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

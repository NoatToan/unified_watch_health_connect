package oj0;

import android.content.Context;
import android.graphics.Bitmap;
import c22.p3;
import c22.s1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import i3.e5;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import lc.u0;
import o4.v0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p13.d0;
import p13.h0;
import z70.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Loj0/f;", "Lcom/garmin/android/apps/connectmobile/f0;", "Loj0/w;", "Lqj0/m;", "omtCmsApi", "Loj0/a;", "gcPlusApi", "Loj0/x;", "optimisticGrantApi", "Lz70/j0;", "userPreferenceApi", "La80/b;", "subscriptionPreferences", "<init>", "(Lqj0/m;Loj0/a;Loj0/x;Lz70/j0;La80/b;)V", "a", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements f0, w {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f132279m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0.m f132280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oj0.a f132281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f132282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0 f132283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a80.b f132284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f132285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z53.b f132286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f132287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z53.b f132288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public rj0.a f132289j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z53.b f132290k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o13.t f132291l;

    static {
        new a(null);
    }

    public f(qj0.m mVar, oj0.a aVar, x xVar, j0 j0Var, a80.b bVar) {
        mVar.getClass();
        aVar.getClass();
        xVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        this.f132280a = mVar;
        this.f132281b = aVar;
        this.f132282c = xVar;
        this.f132283d = j0Var;
        this.f132284e = bVar;
        this.f132286g = z53.c.a();
        this.f132288i = z53.c.a();
        this.f132290k = z53.c.a();
        this.f132291l = o13.m.b(new oe0.e(3));
    }

    public static final String b(f fVar) {
        fVar.getClass();
        s1 s1Var = s1.f23251a;
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
        s1Var.getClass();
        contextC.getClass();
        Locale localeA = hb2.h.a(contextC);
        localeA.getClass();
        return s1.a(localeA);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // oj0.w
    public final Object a(v13.c cVar) {
        u uVar;
        z53.b bVar;
        z53.b bVar2;
        z53.b bVar3;
        z53.b bVar4;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f132358d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f132358d = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object obj = uVar.f132356b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f132358d;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                bVar = this.f132286g;
                uVar.f132355a = bVar;
                uVar.f132358d = 1;
                if (bVar.c(uVar) != aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                bVar = uVar.f132355a;
                o13.r.b(obj);
            } else {
                if (i15 == 2) {
                    bVar2 = uVar.f132355a;
                    o13.r.b(obj);
                    try {
                        this.f132287h = null;
                        Unit unit = Unit.INSTANCE;
                        bVar2.e(null);
                        bVar3 = this.f132290k;
                        uVar.f132355a = bVar3;
                        uVar.f132358d = 3;
                        if (bVar3.c(uVar) != aVar) {
                            bVar4 = bVar3;
                        }
                        return aVar;
                    } catch (Throwable th3) {
                        bVar2.e(null);
                        throw th3;
                    }
                }
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar4 = uVar.f132355a;
                o13.r.b(obj);
            }
            try {
                this.f132289j = null;
                Unit unit2 = Unit.INSTANCE;
                return Unit.INSTANCE;
            } finally {
                bVar4.e(null);
            }
            this.f132285f = null;
            Unit unit3 = Unit.INSTANCE;
            bVar.e(null);
            bVar2 = this.f132288i;
            uVar.f132355a = bVar2;
            uVar.f132358d = 2;
            if (bVar2.c(uVar) != aVar) {
                this.f132287h = null;
                Unit unit4 = Unit.INSTANCE;
                bVar2.e(null);
                bVar3 = this.f132290k;
                uVar.f132355a = bVar3;
                uVar.f132358d = 3;
                if (bVar3.c(uVar) != aVar) {
                    bVar4 = bVar3;
                    this.f132289j = null;
                    Unit unit5 = Unit.INSTANCE;
                    return Unit.INSTANCE;
                }
            }
            return aVar;
        } catch (Throwable th4) {
            bVar.e(null);
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Context context, rj0.a aVar, v13.c cVar) {
        g gVar;
        Iterator it;
        int i14;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i15 = gVar.f132297f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                gVar.f132297f = i15 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.f132295d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = gVar.f132297f;
        if (i16 == 0) {
            o13.r.b(obj);
            List<rj0.c> list = aVar.f152961d;
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(((rj0.c) it3.next()).f152979e);
            }
            it = h0.b1(h0.f1(h0.D0(arrayList, aVar.f152958a))).iterator();
            i14 = 0;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = gVar.f132294c;
            it = gVar.f132293b;
            Context context2 = gVar.f132292a;
            o13.r.b(obj);
            i14 = i17;
            context = context2;
        }
        while (it.hasNext()) {
            String str = (String) it.next();
            gVar.f132292a = context;
            gVar.f132293b = it;
            gVar.f132294c = i14;
            gVar.f132297f = 1;
            if (k(context, str, gVar) == obj2) {
                return obj2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(List list, v13.c cVar) {
        h hVar;
        Iterator it;
        int i14;
        Context context;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i15 = hVar.f132303f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                hVar.f132303f = i15 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.f132301d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = hVar.f132303f;
        if (i16 == 0) {
            o13.r.b(obj);
            Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(((rj0.d) it3.next()).f152984c.f152993a);
            }
            it = arrayList.iterator();
            i14 = 0;
            context = contextC;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = hVar.f132300c;
            it = hVar.f132299b;
            context = hVar.f132298a;
            o13.r.b(obj);
        }
        while (it.hasNext()) {
            String str = (String) it.next();
            hVar.f132298a = context;
            hVar.f132299b = it;
            hVar.f132300c = i14;
            hVar.f132303f = 1;
            if (k(context, str, hVar) == obj2) {
                return obj2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(Context context, List list, v13.c cVar) {
        i iVar;
        Iterator it;
        int i14;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i15 = iVar.f132309f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                iVar.f132309f = i15 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj = iVar.f132307d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = iVar.f132309f;
        if (i16 == 0) {
            o13.r.b(obj);
            a2 a2Var = a2.SUBSCRIPTIONS;
            i2.f36769a.getClass();
            i2.a.k(a2Var, "GCPlusRepository", "fetchFeatureImagesIfMissing started");
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                d0.v(arrayList, ((tj0.a) it3.next()).f165108a);
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((tj0.b) it4.next()).f165122g);
            }
            it = h0.b1(h0.f1(arrayList2)).iterator();
            i14 = 0;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = iVar.f132306c;
            it = iVar.f132305b;
            Context context2 = iVar.f132304a;
            o13.r.b(obj);
            i14 = i17;
            context = context2;
        }
        while (it.hasNext()) {
            String str = (String) it.next();
            iVar.f132304a = context;
            iVar.f132305b = it;
            iVar.f132306c = i14;
            iVar.f132309f = 1;
            if (k(context, str, iVar) == obj2) {
                return obj2;
            }
        }
        a2 a2Var2 = a2.SUBSCRIPTIONS;
        i2.f36769a.getClass();
        i2.a.k(a2Var2, "GCPlusRepository", "fetchFeatureImagesIfMissing finished");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0097 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:36:0x0091, B:38:0x0097, B:40:0x00be, B:41:0x00c7, B:43:0x00cd, B:45:0x00e4, B:47:0x00ea, B:49:0x010b, B:51:0x010f, B:46:0x00e8, B:52:0x011e, B:54:0x0122, B:56:0x0132, B:57:0x0137), top: B:71:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00be A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:36:0x0091, B:38:0x0097, B:40:0x00be, B:41:0x00c7, B:43:0x00cd, B:45:0x00e4, B:47:0x00ea, B:49:0x010b, B:51:0x010f, B:46:0x00e8, B:52:0x011e, B:54:0x0122, B:56:0x0132, B:57:0x0137), top: B:71:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:36:0x0091, B:38:0x0097, B:40:0x00be, B:41:0x00c7, B:43:0x00cd, B:45:0x00e4, B:47:0x00ea, B:49:0x010b, B:51:0x010f, B:46:0x00e8, B:52:0x011e, B:54:0x0122, B:56:0x0132, B:57:0x0137), top: B:71:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e8 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:36:0x0091, B:38:0x0097, B:40:0x00be, B:41:0x00c7, B:43:0x00cd, B:45:0x00e4, B:47:0x00ea, B:49:0x010b, B:51:0x010f, B:46:0x00e8, B:52:0x011e, B:54:0x0122, B:56:0x0132, B:57:0x0137), top: B:71:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x010b A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:36:0x0091, B:38:0x0097, B:40:0x00be, B:41:0x00c7, B:43:0x00cd, B:45:0x00e4, B:47:0x00ea, B:49:0x010b, B:51:0x010f, B:46:0x00e8, B:52:0x011e, B:54:0x0122, B:56:0x0132, B:57:0x0137), top: B:71:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x010f A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:36:0x0091, B:38:0x0097, B:40:0x00be, B:41:0x00c7, B:43:0x00cd, B:45:0x00e4, B:47:0x00ea, B:49:0x010b, B:51:0x010f, B:46:0x00e8, B:52:0x011e, B:54:0x0122, B:56:0x0132, B:57:0x0137), top: B:71:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x011e A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:36:0x0091, B:38:0x0097, B:40:0x00be, B:41:0x00c7, B:43:0x00cd, B:45:0x00e4, B:47:0x00ea, B:49:0x010b, B:51:0x010f, B:46:0x00e8, B:52:0x011e, B:54:0x0122, B:56:0x0132, B:57:0x0137), top: B:71:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0122 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:36:0x0091, B:38:0x0097, B:40:0x00be, B:41:0x00c7, B:43:0x00cd, B:45:0x00e4, B:47:0x00ea, B:49:0x010b, B:51:0x010f, B:46:0x00e8, B:52:0x011e, B:54:0x0122, B:56:0x0132, B:57:0x0137), top: B:71:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0132 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:36:0x0091, B:38:0x0097, B:40:0x00be, B:41:0x00c7, B:43:0x00cd, B:45:0x00e4, B:47:0x00ea, B:49:0x010b, B:51:0x010f, B:46:0x00e8, B:52:0x011e, B:54:0x0122, B:56:0x0132, B:57:0x0137), top: B:71:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:62:0x013f A[Catch: all -> 0x0138, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0138, blocks: (B:62:0x013f, B:30:0x0073, B:32:0x0077), top: B:72:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015c, code lost:
    
        if (c(r5, r0, r1) == r2) goto L64;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x0097, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(v13.c cVar) throws Throwable {
        j jVar;
        z53.a aVar;
        int i14;
        rj0.a aVar2;
        z53.a aVar3;
        f fVar;
        z53.a aVar4;
        Throwable th3;
        v2 v2Var;
        rj0.a aVar5;
        List<qj0.b> listA;
        ?? arrayList;
        rj0.a aVarA;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i15 = jVar.f132317h;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                jVar.f132317h = i15 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object obj = jVar.f132315f;
        u13.a aVar6 = u13.a.COROUTINE_SUSPENDED;
        int i16 = jVar.f132317h;
        int i17 = 0;
        try {
            if (i16 == 0) {
                o13.r.b(obj);
                aVar = this.f132290k;
                jVar.f132310a = aVar;
                jVar.f132313d = 0;
                jVar.f132317h = 1;
                if (aVar.c(jVar) != aVar6) {
                    i14 = 0;
                }
                return aVar6;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = jVar.f132312c;
                    aVar4 = jVar.f132310a;
                    try {
                        o13.r.b(obj);
                        i2.f36769a.getClass();
                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusRepository", "Returning " + aVar2);
                        aVar4.e(null);
                        return aVar2;
                    } catch (Throwable th4) {
                        th3 = th4;
                        aVar4.e(null);
                        throw th3;
                    }
                }
                i17 = jVar.f132314e;
                i14 = jVar.f132313d;
                fVar = jVar.f132311b;
                aVar3 = jVar.f132310a;
                try {
                    o13.r.b(obj);
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        a2 a2Var = a2.SUBSCRIPTIONS;
                        String str = "About to parse " + ((v2.b) v2Var).f47386a;
                        i2.f36769a.getClass();
                        i2.a.k(a2Var, "GCPlusRepository", str);
                        listA = ((qj0.i) ((v2.b) v2Var).f47386a).a();
                        if (listA != null) {
                            arrayList = new ArrayList();
                            for (qj0.b bVar : listA) {
                                rj0.a.C2890a c2890a = rj0.a.f152957f;
                                qj0.a aVar7 = (qj0.a) bVar.a();
                                c2890a.getClass();
                                aVarA = rj0.a.C2890a.a(aVar7);
                                if (aVarA != null) {
                                    arrayList.add(aVarA);
                                }
                            }
                        } else {
                            arrayList = p13.j0.f134944a;
                        }
                        i2.f36769a.getClass();
                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusRepository", "Education content request succeeded; caching data " + arrayList);
                        if (arrayList.isEmpty()) {
                            fVar.f132289j = null;
                        } else {
                            fVar.f132289j = (rj0.a) h0.b0(arrayList);
                            aVar5 = (rj0.a) h0.b0(arrayList);
                        }
                        aVar2 = aVar5;
                        aVar = aVar3;
                        if (aVar2 != null) {
                            Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                            jVar.f132310a = aVar;
                            jVar.f132311b = null;
                            jVar.f132312c = aVar2;
                            jVar.f132313d = i14;
                            jVar.f132314e = i17;
                            jVar.f132317h = 3;
                        }
                        aVar4 = aVar;
                        i2.f36769a.getClass();
                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusRepository", "Returning " + aVar2);
                        aVar4.e(null);
                        return aVar2;
                    }
                    if (v2Var instanceof v2.a) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a2 a2Var2 = a2.SUBSCRIPTIONS;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var2, "GCPlusRepository", "Education content request failed; returning an empty list");
                    aVar5 = null;
                    aVar2 = aVar5;
                    aVar = aVar3;
                    if (aVar2 != null) {
                        Context contextC2 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                        jVar.f132310a = aVar;
                        jVar.f132311b = null;
                        jVar.f132312c = aVar2;
                        jVar.f132313d = i14;
                        jVar.f132314e = i17;
                        jVar.f132317h = 3;
                    }
                    aVar4 = aVar;
                    i2.f36769a.getClass();
                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusRepository", "Returning " + aVar2);
                    aVar4.e(null);
                    return aVar2;
                } catch (Throwable th5) {
                    th3 = th5;
                    aVar4 = aVar3;
                    aVar4.e(null);
                    throw th3;
                }
            }
            i14 = jVar.f132313d;
            z53.a aVar8 = jVar.f132310a;
            o13.r.b(obj);
            aVar = aVar8;
            rj0.a aVar9 = this.f132289j;
            if (aVar9 != null) {
                aVar2 = aVar9;
                if (aVar2 != null) {
                    Context contextC3 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                    jVar.f132310a = aVar;
                    jVar.f132311b = null;
                    jVar.f132312c = aVar2;
                    jVar.f132313d = i14;
                    jVar.f132314e = i17;
                    jVar.f132317h = 3;
                }
                aVar4 = aVar;
                i2.f36769a.getClass();
                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusRepository", "Returning " + aVar2);
                aVar4.e(null);
                return aVar2;
            }
            k kVar = new k(this, null);
            jVar.f132310a = aVar;
            jVar.f132311b = this;
            jVar.f132313d = i14;
            jVar.f132314e = 0;
            jVar.f132317h = 2;
            Object objJ = f0.J(this, kVar, jVar);
            if (objJ != aVar6) {
                aVar3 = aVar;
                obj = objJ;
                fVar = this;
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    a2 a2Var3 = a2.SUBSCRIPTIONS;
                    String str2 = "About to parse " + ((v2.b) v2Var).f47386a;
                    i2.f36769a.getClass();
                    i2.a.k(a2Var3, "GCPlusRepository", str2);
                    listA = ((qj0.i) ((v2.b) v2Var).f47386a).a();
                    if (listA != null) {
                        arrayList = new ArrayList();
                        while (r14.hasNext()) {
                            rj0.a.C2890a c2890a2 = rj0.a.f152957f;
                            qj0.a aVar10 = (qj0.a) bVar.a();
                            c2890a2.getClass();
                            aVarA = rj0.a.C2890a.a(aVar10);
                            if (aVarA != null) {
                                arrayList.add(aVarA);
                            }
                        }
                    } else {
                        arrayList = p13.j0.f134944a;
                    }
                    i2.f36769a.getClass();
                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusRepository", "Education content request succeeded; caching data " + arrayList);
                    if (arrayList.isEmpty()) {
                        fVar.f132289j = null;
                    } else {
                        fVar.f132289j = (rj0.a) h0.b0(arrayList);
                        aVar5 = (rj0.a) h0.b0(arrayList);
                    }
                    aVar2 = aVar5;
                    aVar = aVar3;
                    if (aVar2 != null) {
                        Context contextC4 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                        jVar.f132310a = aVar;
                        jVar.f132311b = null;
                        jVar.f132312c = aVar2;
                        jVar.f132313d = i14;
                        jVar.f132314e = i17;
                        jVar.f132317h = 3;
                    }
                    aVar4 = aVar;
                    i2.f36769a.getClass();
                    i2.a.b(a2.SUBSCRIPTIONS, "GCPlusRepository", "Returning " + aVar2);
                    aVar4.e(null);
                    return aVar2;
                }
                if (v2Var instanceof v2.a) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 a2Var4 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var4, "GCPlusRepository", "Education content request failed; returning an empty list");
                aVar5 = null;
                aVar2 = aVar5;
                aVar = aVar3;
                if (aVar2 != null) {
                    Context contextC5 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                    jVar.f132310a = aVar;
                    jVar.f132311b = null;
                    jVar.f132312c = aVar2;
                    jVar.f132313d = i14;
                    jVar.f132314e = i17;
                    jVar.f132317h = 3;
                }
                aVar4 = aVar;
                i2.f36769a.getClass();
                i2.a.b(a2.SUBSCRIPTIONS, "GCPlusRepository", "Returning " + aVar2);
                aVar4.e(null);
                return aVar2;
            }
            return aVar6;
        } catch (Throwable th6) {
            aVar4 = aVar;
            th3 = th6;
            aVar4.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, v13.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f132322c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f132322c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objJ = lVar.f132320a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f132322c;
        if (i15 == 0) {
            o13.r.b(objJ);
            a2 a2Var = a2.SUBSCRIPTIONS;
            String strN = fb1.c.n("Fetching image at ", str);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GCPlusRepository", strN);
            m mVar = new m(this, str, null);
            lVar.f132322c = 1;
            objJ = f0.J(this, mVar, lVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            a2 a2Var2 = a2.SUBSCRIPTIONS;
            T t7 = ((v2.b) v2Var).f47386a;
            String strF = e5.f(t7, "Image fetch Success; data ");
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "GCPlusRepository", strF);
            return (v0) t7;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        a2 a2Var3 = a2.SUBSCRIPTIONS;
        i2.f36769a.getClass();
        i2.a.f(a2Var3, "GCPlusRepository", "Image fetch request failed; returning null");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bc A[Catch: all -> 0x010d, TryCatch #2 {all -> 0x010d, blocks: (B:36:0x00b6, B:38:0x00bc, B:40:0x00e3, B:41:0x00ec, B:43:0x00f2, B:45:0x0109, B:49:0x0113, B:48:0x0111, B:51:0x0133, B:53:0x0137, B:55:0x0140, B:58:0x0160, B:59:0x0164, B:60:0x0165, B:61:0x016a, B:30:0x0089, B:32:0x0099), top: B:75:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3 A[Catch: all -> 0x010d, TryCatch #2 {all -> 0x010d, blocks: (B:36:0x00b6, B:38:0x00bc, B:40:0x00e3, B:41:0x00ec, B:43:0x00f2, B:45:0x0109, B:49:0x0113, B:48:0x0111, B:51:0x0133, B:53:0x0137, B:55:0x0140, B:58:0x0160, B:59:0x0164, B:60:0x0165, B:61:0x016a, B:30:0x0089, B:32:0x0099), top: B:75:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f2 A[Catch: all -> 0x010d, TryCatch #2 {all -> 0x010d, blocks: (B:36:0x00b6, B:38:0x00bc, B:40:0x00e3, B:41:0x00ec, B:43:0x00f2, B:45:0x0109, B:49:0x0113, B:48:0x0111, B:51:0x0133, B:53:0x0137, B:55:0x0140, B:58:0x0160, B:59:0x0164, B:60:0x0165, B:61:0x016a, B:30:0x0089, B:32:0x0099), top: B:75:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0111 A[Catch: all -> 0x010d, TryCatch #2 {all -> 0x010d, blocks: (B:36:0x00b6, B:38:0x00bc, B:40:0x00e3, B:41:0x00ec, B:43:0x00f2, B:45:0x0109, B:49:0x0113, B:48:0x0111, B:51:0x0133, B:53:0x0137, B:55:0x0140, B:58:0x0160, B:59:0x0164, B:60:0x0165, B:61:0x016a, B:30:0x0089, B:32:0x0099), top: B:75:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0133 A[Catch: all -> 0x010d, TryCatch #2 {all -> 0x010d, blocks: (B:36:0x00b6, B:38:0x00bc, B:40:0x00e3, B:41:0x00ec, B:43:0x00f2, B:45:0x0109, B:49:0x0113, B:48:0x0111, B:51:0x0133, B:53:0x0137, B:55:0x0140, B:58:0x0160, B:59:0x0164, B:60:0x0165, B:61:0x016a, B:30:0x0089, B:32:0x0099), top: B:75:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0137 A[Catch: all -> 0x010d, TryCatch #2 {all -> 0x010d, blocks: (B:36:0x00b6, B:38:0x00bc, B:40:0x00e3, B:41:0x00ec, B:43:0x00f2, B:45:0x0109, B:49:0x0113, B:48:0x0111, B:51:0x0133, B:53:0x0137, B:55:0x0140, B:58:0x0160, B:59:0x0164, B:60:0x0165, B:61:0x016a, B:30:0x0089, B:32:0x0099), top: B:75:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0140 A[Catch: all -> 0x010d, TRY_LEAVE, TryCatch #2 {all -> 0x010d, blocks: (B:36:0x00b6, B:38:0x00bc, B:40:0x00e3, B:41:0x00ec, B:43:0x00f2, B:45:0x0109, B:49:0x0113, B:48:0x0111, B:51:0x0133, B:53:0x0137, B:55:0x0140, B:58:0x0160, B:59:0x0164, B:60:0x0165, B:61:0x016a, B:30:0x0089, B:32:0x0099), top: B:75:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0160 A[Catch: all -> 0x010d, TRY_ENTER, TryCatch #2 {all -> 0x010d, blocks: (B:36:0x00b6, B:38:0x00bc, B:40:0x00e3, B:41:0x00ec, B:43:0x00f2, B:45:0x0109, B:49:0x0113, B:48:0x0111, B:51:0x0133, B:53:0x0137, B:55:0x0140, B:58:0x0160, B:59:0x0164, B:60:0x0165, B:61:0x016a, B:30:0x0089, B:32:0x0099), top: B:75:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0165 A[Catch: all -> 0x010d, TryCatch #2 {all -> 0x010d, blocks: (B:36:0x00b6, B:38:0x00bc, B:40:0x00e3, B:41:0x00ec, B:43:0x00f2, B:45:0x0109, B:49:0x0113, B:48:0x0111, B:51:0x0133, B:53:0x0137, B:55:0x0140, B:58:0x0160, B:59:0x0164, B:60:0x0165, B:61:0x016a, B:30:0x0089, B:32:0x0099), top: B:75:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017d, code lost:
    
        if (r0 == r5) goto L65;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00bc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x0140, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.garmin.android.apps.connectmobile.f0, java.lang.Object, oj0.f] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v2, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r3v20, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [oj0.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Context context, v13.c cVar) throws Throwable {
        n nVar;
        z53.a aVar;
        Context context2;
        int i14;
        ?? r14;
        int i15;
        ?? r15;
        v2 v2Var;
        List<qj0.b> listA;
        ?? arrayList;
        tj0.a aVarA;
        ?? r16;
        ?? r17 = "About to parse ";
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i16 = nVar.f132333h;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                nVar.f132333h = i16 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object obj = nVar.f132331f;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i17 = nVar.f132333h;
        int i18 = 0;
        try {
            try {
                if (i17 == 0) {
                    o13.r.b(obj);
                    nVar.f132326a = context;
                    aVar = this.f132286g;
                    nVar.f132327b = aVar;
                    nVar.f132329d = 0;
                    nVar.f132333h = 1;
                    if (aVar.c(nVar) != aVar2) {
                        context2 = context;
                        i14 = 0;
                    }
                    return aVar2;
                }
                if (i17 != 1) {
                    if (i17 == 2) {
                        i18 = nVar.f132330e;
                        int i19 = nVar.f132329d;
                        f fVar = (f) nVar.f132328c;
                        z53.a aVar3 = nVar.f132327b;
                        context2 = nVar.f132326a;
                        try {
                            o13.r.b(obj);
                            i15 = i19;
                            aVar = aVar3;
                            r15 = fVar;
                            v2Var = (v2) obj;
                            if (v2Var instanceof v2.b) {
                                if (v2Var instanceof v2.a) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (!(((v2.a) v2Var).f47383a instanceof CancellationException)) {
                                    throw ((v2.a) v2Var).f47383a;
                                }
                                a2 a2Var = a2.SUBSCRIPTIONS;
                                String str = "Paywall request failed: exception=" + ((v2.a) v2Var).f47383a;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var, "GCPlusRepository", str);
                                p13.j0 j0Var = p13.j0.f134944a;
                                aVar.e(null);
                                return j0Var;
                            }
                            a2 a2Var2 = a2.SUBSCRIPTIONS;
                            String str2 = "About to parse " + ((v2.b) v2Var).f47386a;
                            i2.f36769a.getClass();
                            i2.a.k(a2Var2, "GCPlusRepository", str2);
                            listA = ((qj0.i) ((v2.b) v2Var).f47386a).a();
                            if (listA != null) {
                                arrayList = new ArrayList();
                                for (qj0.b bVar : listA) {
                                    tj0.a.C3097a c3097a = tj0.a.f165107h;
                                    qj0.g gVar = (qj0.g) bVar.a();
                                    c3097a.getClass();
                                    aVarA = tj0.a.C3097a.a(gVar);
                                    if (aVarA != null) {
                                        arrayList.add(aVarA);
                                    }
                                }
                            } else {
                                arrayList = p13.j0.f134944a;
                            }
                            i2.f36769a.getClass();
                            i2.a.k(a2.SUBSCRIPTIONS, "GCPlusRepository", "Caching paywall data " + arrayList);
                            r15.f132285f = arrayList;
                            i14 = i15;
                            r14 = arrayList;
                            z53.a aVar4 = aVar;
                            nVar.f132326a = null;
                            nVar.f132327b = aVar4;
                            nVar.f132328c = r14;
                            nVar.f132329d = i14;
                            nVar.f132330e = i18;
                            nVar.f132333h = 3;
                            Object objF = f(context2, r14, nVar);
                            r16 = r14;
                            r17 = aVar4;
                        } catch (Throwable th3) {
                            th = th3;
                            r17 = aVar3;
                            r17.e(null);
                            throw th;
                        }
                    } else {
                        if (i17 != 3) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list = (List) nVar.f132328c;
                        z53.a aVar5 = nVar.f132327b;
                        o13.r.b(obj);
                        r16 = list;
                        r17 = aVar5;
                    }
                    a2 a2Var3 = a2.SUBSCRIPTIONS;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var3, "GCPlusRepository", "Returning " + r16);
                    i2.a.k(a2Var3, "GCPlusRepository", "fetchGCPlusPaywallContent finished");
                    r17.e(null);
                    return r16;
                }
                int i24 = nVar.f132329d;
                z53.a aVar6 = nVar.f132327b;
                context2 = nVar.f132326a;
                o13.r.b(obj);
                i14 = i24;
                aVar = aVar6;
                a2 a2Var4 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.k(a2Var4, "GCPlusRepository", "fetchGCPlusPaywallContent started");
                Object obj2 = this.f132285f;
                if (obj2 == null) {
                    o oVar = new o(this, null);
                    nVar.f132326a = context2;
                    nVar.f132327b = aVar;
                    nVar.f132328c = this;
                    nVar.f132329d = i14;
                    nVar.f132330e = 0;
                    nVar.f132333h = 2;
                    Object objJ = f0.J(this, oVar, nVar);
                    if (objJ != aVar2) {
                        i15 = i14;
                        obj = objJ;
                        r15 = this;
                        v2Var = (v2) obj;
                        if (v2Var instanceof v2.b) {
                            if (v2Var instanceof v2.a) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!(((v2.a) v2Var).f47383a instanceof CancellationException)) {
                                throw ((v2.a) v2Var).f47383a;
                            }
                            a2 a2Var5 = a2.SUBSCRIPTIONS;
                            String str3 = "Paywall request failed: exception=" + ((v2.a) v2Var).f47383a;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var5, "GCPlusRepository", str3);
                            p13.j0 j0Var2 = p13.j0.f134944a;
                            aVar.e(null);
                            return j0Var2;
                        }
                        a2 a2Var6 = a2.SUBSCRIPTIONS;
                        String str4 = "About to parse " + ((v2.b) v2Var).f47386a;
                        i2.f36769a.getClass();
                        i2.a.k(a2Var6, "GCPlusRepository", str4);
                        listA = ((qj0.i) ((v2.b) v2Var).f47386a).a();
                        if (listA != null) {
                            arrayList = new ArrayList();
                            while (r0.hasNext()) {
                                tj0.a.C3097a c3097a2 = tj0.a.f165107h;
                                qj0.g gVar2 = (qj0.g) bVar.a();
                                c3097a2.getClass();
                                aVarA = tj0.a.C3097a.a(gVar2);
                                if (aVarA != null) {
                                    arrayList.add(aVarA);
                                }
                            }
                        } else {
                            arrayList = p13.j0.f134944a;
                        }
                        i2.f36769a.getClass();
                        i2.a.k(a2.SUBSCRIPTIONS, "GCPlusRepository", "Caching paywall data " + arrayList);
                        r15.f132285f = arrayList;
                        i14 = i15;
                        r14 = arrayList;
                        z53.a aVar7 = aVar;
                        nVar.f132326a = null;
                        nVar.f132327b = aVar7;
                        nVar.f132328c = r14;
                        nVar.f132329d = i14;
                        nVar.f132330e = i18;
                        nVar.f132333h = 3;
                        Object objF2 = f(context2, r14, nVar);
                        r16 = r14;
                        r17 = aVar7;
                    }
                } else {
                    r14 = obj2;
                    z53.a aVar8 = aVar;
                    nVar.f132326a = null;
                    nVar.f132327b = aVar8;
                    nVar.f132328c = r14;
                    nVar.f132329d = i14;
                    nVar.f132330e = i18;
                    nVar.f132333h = 3;
                    Object objF3 = f(context2, r14, nVar);
                    r16 = r14;
                    r17 = aVar8;
                }
                return aVar2;
            } catch (Throwable th4) {
                th = th4;
                r17 = aVar;
                r17.e(null);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:29:0x0075, B:32:0x007d, B:34:0x00a4, B:35:0x00ad, B:37:0x00b3, B:39:0x00ca, B:42:0x00d3, B:41:0x00d0, B:43:0x00f2, B:45:0x00f6, B:47:0x00ff, B:48:0x011c, B:49:0x0120, B:50:0x0121, B:51:0x0126), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:29:0x0075, B:32:0x007d, B:34:0x00a4, B:35:0x00ad, B:37:0x00b3, B:39:0x00ca, B:42:0x00d3, B:41:0x00d0, B:43:0x00f2, B:45:0x00f6, B:47:0x00ff, B:48:0x011c, B:49:0x0120, B:50:0x0121, B:51:0x0126), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:29:0x0075, B:32:0x007d, B:34:0x00a4, B:35:0x00ad, B:37:0x00b3, B:39:0x00ca, B:42:0x00d3, B:41:0x00d0, B:43:0x00f2, B:45:0x00f6, B:47:0x00ff, B:48:0x011c, B:49:0x0120, B:50:0x0121, B:51:0x0126), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:29:0x0075, B:32:0x007d, B:34:0x00a4, B:35:0x00ad, B:37:0x00b3, B:39:0x00ca, B:42:0x00d3, B:41:0x00d0, B:43:0x00f2, B:45:0x00f6, B:47:0x00ff, B:48:0x011c, B:49:0x0120, B:50:0x0121, B:51:0x0126), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f2 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:29:0x0075, B:32:0x007d, B:34:0x00a4, B:35:0x00ad, B:37:0x00b3, B:39:0x00ca, B:42:0x00d3, B:41:0x00d0, B:43:0x00f2, B:45:0x00f6, B:47:0x00ff, B:48:0x011c, B:49:0x0120, B:50:0x0121, B:51:0x0126), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:29:0x0075, B:32:0x007d, B:34:0x00a4, B:35:0x00ad, B:37:0x00b3, B:39:0x00ca, B:42:0x00d3, B:41:0x00d0, B:43:0x00f2, B:45:0x00f6, B:47:0x00ff, B:48:0x011c, B:49:0x0120, B:50:0x0121, B:51:0x0126), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:29:0x0075, B:32:0x007d, B:34:0x00a4, B:35:0x00ad, B:37:0x00b3, B:39:0x00ca, B:42:0x00d3, B:41:0x00d0, B:43:0x00f2, B:45:0x00f6, B:47:0x00ff, B:48:0x011c, B:49:0x0120, B:50:0x0121, B:51:0x0126), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:48:0x011c A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:29:0x0075, B:32:0x007d, B:34:0x00a4, B:35:0x00ad, B:37:0x00b3, B:39:0x00ca, B:42:0x00d3, B:41:0x00d0, B:43:0x00f2, B:45:0x00f6, B:47:0x00ff, B:48:0x011c, B:49:0x0120, B:50:0x0121, B:51:0x0126), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0121 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:29:0x0075, B:32:0x007d, B:34:0x00a4, B:35:0x00ad, B:37:0x00b3, B:39:0x00ca, B:42:0x00d3, B:41:0x00d0, B:43:0x00f2, B:45:0x00f6, B:47:0x00ff, B:48:0x011c, B:49:0x0120, B:50:0x0121, B:51:0x0126), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x007d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00ff, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object j(v13.c cVar) throws Throwable {
        p pVar;
        z53.a aVar;
        int i14;
        z53.a aVar2;
        Throwable th3;
        Object obj;
        f fVar;
        Object obj2;
        v2 v2Var;
        List<qj0.b> listA;
        ArrayList arrayList;
        uj0.a aVarA;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i15 = pVar.f132341f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                pVar.f132341f = i15 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object obj3 = pVar.f132339d;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = pVar.f132341f;
        try {
            if (i16 == 0) {
                o13.r.b(obj3);
                aVar = this.f132288i;
                pVar.f132336a = aVar;
                i14 = 0;
                pVar.f132338c = 0;
                pVar.f132341f = 1;
                if (aVar.c(pVar) != aVar3) {
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fVar = pVar.f132337b;
                aVar2 = pVar.f132336a;
                try {
                    o13.r.b(obj3);
                    v2Var = (v2) obj3;
                    if (v2Var instanceof v2.b) {
                        a2 a2Var = a2.SUBSCRIPTIONS;
                        String str = "About to parse " + ((v2.b) v2Var).f47386a;
                        i2.f36769a.getClass();
                        i2.a.k(a2Var, "GCPlusRepository", str);
                        listA = ((qj0.i) ((v2.b) v2Var).f47386a).a();
                        if (listA != null) {
                            arrayList = new ArrayList();
                            for (qj0.b bVar : listA) {
                                uj0.a.C3190a c3190a = uj0.a.f171465j;
                                qj0.h hVar = (qj0.h) bVar.a();
                                c3190a.getClass();
                                aVarA = uj0.a.C3190a.a(hVar);
                                if (aVarA != null) {
                                    arrayList.add(aVarA);
                                }
                            }
                            obj = arrayList;
                        } else {
                            obj = p13.j0.f134944a;
                        }
                        i2.f36769a.getClass();
                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusRepository", "Plan selection request succeeded; caching data " + obj);
                        fVar.f132287h = obj;
                        aVar = aVar2;
                        aVar2 = aVar;
                        obj2 = obj;
                    } else {
                        if (v2Var instanceof v2.a) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!(((v2.a) v2Var).f47383a instanceof CancellationException)) {
                            throw ((v2.a) v2Var).f47383a;
                        }
                        a2 a2Var2 = a2.SUBSCRIPTIONS;
                        String str2 = "Plan selection request failed: exception=" + ((v2.a) v2Var).f47383a;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var2, "GCPlusRepository", str2);
                        obj2 = p13.j0.f134944a;
                    }
                    aVar2.e(null);
                    return obj2;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            i14 = pVar.f132338c;
            z53.a aVar4 = pVar.f132336a;
            o13.r.b(obj3);
            aVar = aVar4;
            obj = this.f132287h;
            if (obj == null) {
                q qVar = new q(this, null);
                pVar.f132336a = aVar;
                pVar.f132337b = this;
                pVar.f132338c = i14;
                pVar.f132341f = 2;
                Object objJ = f0.J(this, qVar, pVar);
                if (objJ != aVar3) {
                    aVar2 = aVar;
                    obj3 = objJ;
                    fVar = this;
                    v2Var = (v2) obj3;
                    if (v2Var instanceof v2.b) {
                        a2 a2Var3 = a2.SUBSCRIPTIONS;
                        String str3 = "About to parse " + ((v2.b) v2Var).f47386a;
                        i2.f36769a.getClass();
                        i2.a.k(a2Var3, "GCPlusRepository", str3);
                        listA = ((qj0.i) ((v2.b) v2Var).f47386a).a();
                        if (listA != null) {
                            arrayList = new ArrayList();
                            while (r9.hasNext()) {
                                uj0.a.C3190a c3190a2 = uj0.a.f171465j;
                                qj0.h hVar2 = (qj0.h) bVar.a();
                                c3190a2.getClass();
                                aVarA = uj0.a.C3190a.a(hVar2);
                                if (aVarA != null) {
                                    arrayList.add(aVarA);
                                }
                            }
                            obj = arrayList;
                        } else {
                            obj = p13.j0.f134944a;
                        }
                        i2.f36769a.getClass();
                        i2.a.b(a2.SUBSCRIPTIONS, "GCPlusRepository", "Plan selection request succeeded; caching data " + obj);
                        fVar.f132287h = obj;
                        aVar = aVar2;
                        aVar2 = aVar;
                        obj2 = obj;
                    } else {
                        if (v2Var instanceof v2.a) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!(((v2.a) v2Var).f47383a instanceof CancellationException)) {
                            throw ((v2.a) v2Var).f47383a;
                        }
                        a2 a2Var4 = a2.SUBSCRIPTIONS;
                        String str4 = "Plan selection request failed: exception=" + ((v2.a) v2Var).f47383a;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var4, "GCPlusRepository", str4);
                        obj2 = p13.j0.f134944a;
                    }
                }
                return aVar3;
            }
            aVar2 = aVar;
            obj2 = obj;
            aVar2.e(null);
            return obj2;
        } catch (Throwable th5) {
            aVar2 = aVar;
            th3 = th5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(Context context, String str, v13.c cVar) throws Throwable {
        r rVar;
        String str2;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f132348e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f132348e = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object objH = rVar.f132346c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f132348e;
        if (i15 == 0) {
            o13.r.b(objH);
            e.f132277a.getClass();
            str.getClass();
            context.getClass();
            if (e.f132278b.get(str) == null) {
                zp0.e eVar = zp0.e.f206587a;
                String strValueOf = String.valueOf(str.hashCode());
                eVar.getClass();
                strValueOf.getClass();
                if (!new File(context.getDir("subscription_images", 0), strValueOf).exists()) {
                    a2 a2Var = a2.SUBSCRIPTIONS;
                    String strConcat = "Fetching image for ".concat(str);
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "GCPlusRepository", strConcat);
                    d53.k kVar = new d53.k("xxhdpi");
                    if (l() <= 160) {
                        str2 = p3.MDPI.f23201a;
                    } else if (l() <= 240) {
                        str2 = p3.HDPI.f23201a;
                    } else if (l() <= 320) {
                        str2 = p3.XHDPI.f23201a;
                    } else {
                        str2 = l() <= 480 ? p3.XXHDPI.f23201a : p3.XXXHDPI.f23201a;
                    }
                    i2.a.b(a2Var, "GCPlusRepository", "Image scale " + str2);
                    String strF = kVar.f(str, str2);
                    gg1.v0.T.getClass();
                    String strConcat2 = gg1.v0.a.b().b().concat(strF);
                    rVar.f132344a = str;
                    rVar.f132345b = context;
                    rVar.f132348e = 1;
                    objH = h(strConcat2, rVar);
                    if (objH == obj) {
                        return obj;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        context = rVar.f132345b;
        str = rVar.f132344a;
        o13.r.b(objH);
        v0 v0Var = (v0) objH;
        if (v0Var == null) {
            return Unit.INSTANCE;
        }
        e.f132277a.getClass();
        str.getClass();
        context.getClass();
        Map<String, v0> map = e.f132278b;
        map.getClass();
        map.put(str, v0Var);
        zp0.e eVar2 = zp0.e.f206587a;
        Bitmap bitmapA = o4.g.a(v0Var);
        String strValueOf2 = String.valueOf(str.hashCode());
        eVar2.getClass();
        zp0.e.c(context, bitmapA, "subscription_images", strValueOf2);
        return Unit.INSTANCE;
    }

    public final int l() {
        return ((Number) this.f132291l.getValue()).intValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Loj0/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "GLOBAL_BADGES_KEY", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

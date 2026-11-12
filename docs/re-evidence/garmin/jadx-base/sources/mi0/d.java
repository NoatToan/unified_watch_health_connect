package mi0;

import android.content.Context;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import ei0.q0;
import hi0.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import li0.d0;
import o13.r;
import o53.b0;
import o53.j0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.w;
import p13.y;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendDiscoverListViewModel$getPhoneAndEmailList$1", f = "FriendDiscoverListViewModel.kt", l = {124, 139, 145, 157, 159}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f118748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0 f118749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f118750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f118751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f118752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f118753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mi0.c f118754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f118755h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lhi0/m;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendDiscoverListViewModel$getPhoneAndEmailList$1$emailDeferred$1", f = "FriendDiscoverListViewModel.kt", l = {137}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends m>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f118756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mi0.c f118757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<String> f118758c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mi0.c cVar, List<String> list, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f118757b = cVar;
            this.f118758c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f118757b, this.f118758c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends m>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f118756a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            ei0.d dVar = this.f118757b.f118709a;
            List listC = w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
            this.f118756a = 1;
            Object objS = dVar.S(this.f118758c, listC, this);
            return objS == aVar ? aVar : objS;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((d0) t7).f112651d, ((d0) t14).f112651d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lhi0/m;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendDiscoverListViewModel$getPhoneAndEmailList$1$phoneDeferred$1", f = "FriendDiscoverListViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super v2<? extends m>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f118759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mi0.c f118760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<String> f118761c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mi0.c cVar, List<String> list, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f118760b = cVar;
            this.f118761c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f118760b, this.f118761c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends m>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f118759a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            ei0.d dVar = this.f118760b.f118709a;
            List listC = w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
            this.f118759a = 1;
            Object objO4 = dVar.o4(this.f118761c, listC, this);
            return objO4 == aVar ? aVar : objO4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mi0.c cVar, Context context, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f118754g = cVar;
        this.f118755h = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f118754g, this.f118755h, dVar);
        dVar2.f118753f = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:50:0x0106  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:56:0x0120  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    /* JADX WARN: Code duplicated, block: B:60:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0142  */
    /* JADX WARN: Code duplicated, block: B:66:0x0147  */
    /* JADX WARN: Code duplicated, block: B:68:0x014b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0157  */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0161  */
    /* JADX WARN: Code duplicated, block: B:76:0x0172  */
    /* JADX WARN: Code duplicated, block: B:77:0x0177  */
    /* JADX WARN: Code duplicated, block: B:78:0x0178 A[PHI: r3 r7 r15
      0x0178: PHI (r3v13 int) = (r3v10 int), (r3v16 int) binds: [B:59:0x012c, B:77:0x0177] A[DONT_GENERATE, DONT_INLINE]
      0x0178: PHI (r7v5 boolean) = (r7v3 boolean), (r7v13 boolean) binds: [B:59:0x012c, B:77:0x0177] A[DONT_GENERATE, DONT_INLINE]
      0x0178: PHI (r15v6 java.util.List) = (r15v3 java.util.List), (r15v7 java.util.List) binds: [B:59:0x012c, B:77:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0189  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bd A[LOOP:1: B:86:0x01b7->B:88:0x01bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x01df  */
    /* JADX WARN: Code duplicated, block: B:98:0x0212 A[PHI: r1 r3
      0x0212: PHI (r1v16 int) = (r1v4 int), (r1v22 int) binds: [B:96:0x020f, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r3v17 boolean) = (r3v15 boolean), (r3v21 boolean) binds: [B:96:0x020f, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0228, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean zC;
        List arrayList;
        j0 j0VarJ;
        Object objC;
        boolean z14;
        int i14;
        List list;
        j0 j0Var;
        Object objAwait;
        List list2;
        v2 v2Var;
        List<hi0.l> listA;
        int i15;
        boolean z15;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        HashSet hashSet;
        ArrayList arrayList4;
        v2 v2Var2;
        List<hi0.l> listA2;
        b0 b0Var = (b0) this.f118753f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f118752e;
        int i17 = 1;
        mi0.c cVar = this.f118754g;
        if (i16 == 0) {
            r.b(obj);
            p2 p2Var = cVar.f118716h;
            Boolean bool = Boolean.TRUE;
            this.f118753f = b0Var;
            this.f118752e = 1;
            p2Var.k(null, bool);
            if (Unit.INSTANCE != aVar) {
            }
            return aVar;
        }
        if (i16 == 1) {
            r.b(obj);
        } else {
            if (i16 == 2) {
                i14 = this.f118751d;
                z14 = this.f118750c;
                j0Var = this.f118749b;
                list = this.f118748a;
                r.b(obj);
                objC = obj;
                v2Var = (v2) objC;
                if (v2Var != null) {
                    if (v2Var instanceof v2.b) {
                        listA = ((m) ((v2.b) v2Var).f47386a).a();
                        if (listA == null) {
                            listA = p13.j0.f134944a;
                        }
                        list.addAll(listA);
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        String str = mi0.c.f118708k;
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.f(a2Var, str, "Get emails failed");
                    }
                    arrayList = list;
                } else {
                    j0VarJ = j0Var;
                    arrayList = list;
                    i17 = i14;
                    zC = z14;
                    z14 = zC;
                    i14 = i17;
                    j0Var = j0VarJ;
                }
                if (j0Var != null) {
                    this.f118753f = b0Var;
                    this.f118748a = arrayList;
                    this.f118749b = null;
                    this.f118750c = z14;
                    this.f118751d = i14;
                    this.f118752e = 3;
                    objAwait = j0Var.await(this);
                    if (objAwait != aVar) {
                        list2 = arrayList;
                        v2Var2 = (v2) objAwait;
                        if (v2Var2 != null) {
                            arrayList = list2;
                            list2 = arrayList;
                        } else if (v2Var2 instanceof v2.b) {
                            listA2 = ((m) ((v2.b) v2Var2).f47386a).a();
                            if (listA2 == null) {
                                listA2 = p13.j0.f134944a;
                            }
                            list2.addAll(listA2);
                        } else {
                            if (v2Var2 instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            String str2 = mi0.c.f118708k;
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.f(a2Var2, str2, "Get phones failed");
                        }
                        i15 = i14;
                        z15 = z14;
                        arrayList2 = new ArrayList();
                        for (Object obj2 : list2) {
                            if (!s.g(((hi0.l) obj2).getDisplayName(), ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                                arrayList2.add(obj2);
                            }
                        }
                        arrayList3 = new ArrayList(y.r(arrayList2, 10));
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(q0.d((hi0.l) it.next()));
                        }
                        hashSet = new HashSet();
                        arrayList4 = new ArrayList();
                        for (Object obj3 : arrayList3) {
                            if (hashSet.add(((d0) obj3).f112650c)) {
                                arrayList4.add(obj3);
                            }
                        }
                        List listN0 = h0.N0(arrayList4, new b());
                        p2 p2Var2 = cVar.f118715g;
                        this.f118753f = null;
                        this.f118748a = null;
                        this.f118749b = null;
                        this.f118750c = z15;
                        this.f118751d = i15;
                        this.f118752e = 4;
                        p2Var2.setValue(listN0);
                        if (Unit.INSTANCE != aVar) {
                            p2 p2Var3 = cVar.f118716h;
                            Boolean bool2 = Boolean.FALSE;
                            this.f118753f = null;
                            this.f118748a = null;
                            this.f118749b = null;
                            this.f118750c = z15;
                            this.f118751d = i15;
                            this.f118752e = 5;
                            p2Var3.k(null, bool2);
                        }
                    }
                } else {
                    list2 = arrayList;
                    i15 = i14;
                    z15 = z14;
                    arrayList2 = new ArrayList();
                    while (r5.hasNext()) {
                        if (!s.g(((hi0.l) obj2).getDisplayName(), ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList3 = new ArrayList(y.r(arrayList2, 10));
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(q0.d((hi0.l) it.next()));
                    }
                    hashSet = new HashSet();
                    arrayList4 = new ArrayList();
                    while (r5.hasNext()) {
                        if (hashSet.add(((d0) obj3).f112650c)) {
                            arrayList4.add(obj3);
                        }
                    }
                    List listN1 = h0.N0(arrayList4, new b());
                    p2 p2Var4 = cVar.f118715g;
                    this.f118753f = null;
                    this.f118748a = null;
                    this.f118749b = null;
                    this.f118750c = z15;
                    this.f118751d = i15;
                    this.f118752e = 4;
                    p2Var4.setValue(listN1);
                    if (Unit.INSTANCE != aVar) {
                        p2 p2Var5 = cVar.f118716h;
                        Boolean bool3 = Boolean.FALSE;
                        this.f118753f = null;
                        this.f118748a = null;
                        this.f118749b = null;
                        this.f118750c = z15;
                        this.f118751d = i15;
                        this.f118752e = 5;
                        p2Var5.k(null, bool3);
                    }
                }
                return aVar;
            }
            if (i16 == 3) {
                int i18 = this.f118751d;
                boolean z16 = this.f118750c;
                list2 = this.f118748a;
                r.b(obj);
                z14 = z16;
                i14 = i18;
                objAwait = obj;
                v2Var2 = (v2) objAwait;
                if (v2Var2 != null) {
                    arrayList = list2;
                    list2 = arrayList;
                } else if (v2Var2 instanceof v2.b) {
                    listA2 = ((m) ((v2.b) v2Var2).f47386a).a();
                    if (listA2 == null) {
                        listA2 = p13.j0.f134944a;
                    }
                    list2.addAll(listA2);
                } else {
                    if (v2Var2 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String str3 = mi0.c.f118708k;
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.f(a2Var3, str3, "Get phones failed");
                }
                i15 = i14;
                z15 = z14;
                arrayList2 = new ArrayList();
                while (r5.hasNext()) {
                    if (!s.g(((hi0.l) obj2).getDisplayName(), ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList3 = new ArrayList(y.r(arrayList2, 10));
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(q0.d((hi0.l) it.next()));
                }
                hashSet = new HashSet();
                arrayList4 = new ArrayList();
                while (r5.hasNext()) {
                    if (hashSet.add(((d0) obj3).f112650c)) {
                        arrayList4.add(obj3);
                    }
                }
                List listN2 = h0.N0(arrayList4, new b());
                p2 p2Var6 = cVar.f118715g;
                this.f118753f = null;
                this.f118748a = null;
                this.f118749b = null;
                this.f118750c = z15;
                this.f118751d = i15;
                this.f118752e = 4;
                p2Var6.setValue(listN2);
                if (Unit.INSTANCE != aVar) {
                    p2 p2Var7 = cVar.f118716h;
                    Boolean bool4 = Boolean.FALSE;
                    this.f118753f = null;
                    this.f118748a = null;
                    this.f118749b = null;
                    this.f118750c = z15;
                    this.f118751d = i15;
                    this.f118752e = 5;
                    p2Var7.k(null, bool4);
                }
                return aVar;
            }
            if (i16 == 4) {
                i15 = this.f118751d;
                z15 = this.f118750c;
                r.b(obj);
                p2 p2Var8 = cVar.f118716h;
                Boolean bool5 = Boolean.FALSE;
                this.f118753f = null;
                this.f118748a = null;
                this.f118749b = null;
                this.f118750c = z15;
                this.f118751d = i15;
                this.f118752e = 5;
                p2Var8.k(null, bool5);
            } else {
                if (i16 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        }
        return Unit.INSTANCE;
        zC = ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("pnr_enabled");
        if (!((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f() && !((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).n()) {
            i17 = 0;
        }
        mi0.c.b bVar = mi0.c.b.f118719d;
        Context context = this.f118755h;
        List listX4 = mi0.c.x4(cVar, context, bVar);
        List listX5 = (!zC || i17 == 0) ? p13.j0.f134944a : mi0.c.x4(cVar, context, mi0.c.b.f118718c);
        arrayList = new ArrayList();
        j0 j0VarJ2 = !listX4.isEmpty() ? ge1.b.j(v1.a(cVar), null, null, new a(cVar, listX4, null), 3) : null;
        j0VarJ = !listX5.isEmpty() ? ge1.b.j(v1.a(cVar), null, null, new c(cVar, listX5, null), 3) : null;
        if (j0VarJ2 != null) {
            this.f118753f = b0Var;
            this.f118748a = arrayList;
            this.f118749b = j0VarJ;
            this.f118750c = zC;
            this.f118751d = i17;
            this.f118752e = 2;
            objC = j0VarJ2.C(this);
            if (objC != aVar) {
                z14 = zC;
                i14 = i17;
                list = arrayList;
                j0Var = j0VarJ;
                v2Var = (v2) objC;
                if (v2Var != null) {
                    if (v2Var instanceof v2.b) {
                        listA = ((m) ((v2.b) v2Var).f47386a).a();
                        if (listA == null) {
                            listA = p13.j0.f134944a;
                        }
                        list.addAll(listA);
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        String str4 = mi0.c.f118708k;
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var4 = a2.GENERAL;
                        aVar5.getClass();
                        i2.a.f(a2Var4, str4, "Get emails failed");
                    }
                    arrayList = list;
                } else {
                    j0VarJ = j0Var;
                    arrayList = list;
                    i17 = i14;
                    zC = z14;
                    z14 = zC;
                    i14 = i17;
                    j0Var = j0VarJ;
                }
                if (j0Var != null) {
                    this.f118753f = b0Var;
                    this.f118748a = arrayList;
                    this.f118749b = null;
                    this.f118750c = z14;
                    this.f118751d = i14;
                    this.f118752e = 3;
                    objAwait = j0Var.await(this);
                    if (objAwait != aVar) {
                        list2 = arrayList;
                        v2Var2 = (v2) objAwait;
                        if (v2Var2 != null) {
                            arrayList = list2;
                            list2 = arrayList;
                        } else if (v2Var2 instanceof v2.b) {
                            listA2 = ((m) ((v2.b) v2Var2).f47386a).a();
                            if (listA2 == null) {
                                listA2 = p13.j0.f134944a;
                            }
                            list2.addAll(listA2);
                        } else {
                            if (v2Var2 instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            String str5 = mi0.c.f118708k;
                            i2.a aVar6 = i2.f36769a;
                            a2 a2Var5 = a2.GENERAL;
                            aVar6.getClass();
                            i2.a.f(a2Var5, str5, "Get phones failed");
                        }
                        i15 = i14;
                        z15 = z14;
                        arrayList2 = new ArrayList();
                        while (r5.hasNext()) {
                            if (!s.g(((hi0.l) obj2).getDisplayName(), ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                                arrayList2.add(obj2);
                            }
                        }
                        arrayList3 = new ArrayList(y.r(arrayList2, 10));
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(q0.d((hi0.l) it.next()));
                        }
                        hashSet = new HashSet();
                        arrayList4 = new ArrayList();
                        while (r5.hasNext()) {
                            if (hashSet.add(((d0) obj3).f112650c)) {
                                arrayList4.add(obj3);
                            }
                        }
                        List listN3 = h0.N0(arrayList4, new b());
                        p2 p2Var9 = cVar.f118715g;
                        this.f118753f = null;
                        this.f118748a = null;
                        this.f118749b = null;
                        this.f118750c = z15;
                        this.f118751d = i15;
                        this.f118752e = 4;
                        p2Var9.setValue(listN3);
                        if (Unit.INSTANCE != aVar) {
                            p2 p2Var10 = cVar.f118716h;
                            Boolean bool6 = Boolean.FALSE;
                            this.f118753f = null;
                            this.f118748a = null;
                            this.f118749b = null;
                            this.f118750c = z15;
                            this.f118751d = i15;
                            this.f118752e = 5;
                            p2Var10.k(null, bool6);
                        }
                    }
                } else {
                    list2 = arrayList;
                    i15 = i14;
                    z15 = z14;
                    arrayList2 = new ArrayList();
                    while (r5.hasNext()) {
                        if (!s.g(((hi0.l) obj2).getDisplayName(), ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList3 = new ArrayList(y.r(arrayList2, 10));
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(q0.d((hi0.l) it.next()));
                    }
                    hashSet = new HashSet();
                    arrayList4 = new ArrayList();
                    while (r5.hasNext()) {
                        if (hashSet.add(((d0) obj3).f112650c)) {
                            arrayList4.add(obj3);
                        }
                    }
                    List listN4 = h0.N0(arrayList4, new b());
                    p2 p2Var11 = cVar.f118715g;
                    this.f118753f = null;
                    this.f118748a = null;
                    this.f118749b = null;
                    this.f118750c = z15;
                    this.f118751d = i15;
                    this.f118752e = 4;
                    p2Var11.setValue(listN4);
                    if (Unit.INSTANCE != aVar) {
                        p2 p2Var12 = cVar.f118716h;
                        Boolean bool7 = Boolean.FALSE;
                        this.f118753f = null;
                        this.f118748a = null;
                        this.f118749b = null;
                        this.f118750c = z15;
                        this.f118751d = i15;
                        this.f118752e = 5;
                        p2Var12.k(null, bool7);
                    }
                }
            }
        } else {
            z14 = zC;
            i14 = i17;
            j0Var = j0VarJ;
            if (j0Var != null) {
                this.f118753f = b0Var;
                this.f118748a = arrayList;
                this.f118749b = null;
                this.f118750c = z14;
                this.f118751d = i14;
                this.f118752e = 3;
                objAwait = j0Var.await(this);
                if (objAwait != aVar) {
                    list2 = arrayList;
                    v2Var2 = (v2) objAwait;
                    if (v2Var2 != null) {
                        arrayList = list2;
                        list2 = arrayList;
                    } else if (v2Var2 instanceof v2.b) {
                        listA2 = ((m) ((v2.b) v2Var2).f47386a).a();
                        if (listA2 == null) {
                            listA2 = p13.j0.f134944a;
                        }
                        list2.addAll(listA2);
                    } else {
                        if (v2Var2 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        String str6 = mi0.c.f118708k;
                        i2.a aVar7 = i2.f36769a;
                        a2 a2Var6 = a2.GENERAL;
                        aVar7.getClass();
                        i2.a.f(a2Var6, str6, "Get phones failed");
                    }
                    i15 = i14;
                    z15 = z14;
                    arrayList2 = new ArrayList();
                    while (r5.hasNext()) {
                        if (!s.g(((hi0.l) obj2).getDisplayName(), ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList3 = new ArrayList(y.r(arrayList2, 10));
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(q0.d((hi0.l) it.next()));
                    }
                    hashSet = new HashSet();
                    arrayList4 = new ArrayList();
                    while (r5.hasNext()) {
                        if (hashSet.add(((d0) obj3).f112650c)) {
                            arrayList4.add(obj3);
                        }
                    }
                    List listN5 = h0.N0(arrayList4, new b());
                    p2 p2Var13 = cVar.f118715g;
                    this.f118753f = null;
                    this.f118748a = null;
                    this.f118749b = null;
                    this.f118750c = z15;
                    this.f118751d = i15;
                    this.f118752e = 4;
                    p2Var13.setValue(listN5);
                    if (Unit.INSTANCE != aVar) {
                        p2 p2Var14 = cVar.f118716h;
                        Boolean bool8 = Boolean.FALSE;
                        this.f118753f = null;
                        this.f118748a = null;
                        this.f118749b = null;
                        this.f118750c = z15;
                        this.f118751d = i15;
                        this.f118752e = 5;
                        p2Var14.k(null, bool8);
                    }
                }
            } else {
                list2 = arrayList;
                i15 = i14;
                z15 = z14;
                arrayList2 = new ArrayList();
                while (r5.hasNext()) {
                    if (!s.g(((hi0.l) obj2).getDisplayName(), ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList3 = new ArrayList(y.r(arrayList2, 10));
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(q0.d((hi0.l) it.next()));
                }
                hashSet = new HashSet();
                arrayList4 = new ArrayList();
                while (r5.hasNext()) {
                    if (hashSet.add(((d0) obj3).f112650c)) {
                        arrayList4.add(obj3);
                    }
                }
                List listN6 = h0.N0(arrayList4, new b());
                p2 p2Var15 = cVar.f118715g;
                this.f118753f = null;
                this.f118748a = null;
                this.f118749b = null;
                this.f118750c = z15;
                this.f118751d = i15;
                this.f118752e = 4;
                p2Var15.setValue(listN6);
                if (Unit.INSTANCE != aVar) {
                    p2 p2Var16 = cVar.f118716h;
                    Boolean bool9 = Boolean.FALSE;
                    this.f118753f = null;
                    this.f118748a = null;
                    this.f118749b = null;
                    this.f118750c = z15;
                    this.f118751d = i15;
                    this.f118752e = 5;
                    p2Var16.k(null, bool9);
                }
            }
        }
        return aVar;
    }
}

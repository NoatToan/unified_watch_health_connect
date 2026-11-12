package zn2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lfo2/l0;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager$getAllCredentialAndRefreshCache$2", f = "NewUserDataManager.kt", l = {1715, 379, 383, 387}, m = "invokeSuspend", v = 2)
public final class c2 extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends fo2.l0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.a f205447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g1 f205448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f205449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f205450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f205451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f205452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f205453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f205454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f205455i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f205456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1 f205457k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(g1 g1Var, t13.d<? super c2> dVar) {
        super(2, dVar);
        this.f205457k = g1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c2(this.f205457k, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends fo2.l0>> dVar) {
        return ((c2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0151 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8 A[Catch: all -> 0x0110, TRY_LEAVE, TryCatch #0 {all -> 0x0110, blocks: (B:70:0x017c, B:72:0x0182, B:74:0x019b, B:77:0x01a4, B:78:0x01ad, B:80:0x01b3, B:82:0x01c1, B:84:0x01c7, B:87:0x01d1, B:88:0x01d5, B:91:0x01fe, B:61:0x0140, B:62:0x0151, B:64:0x0157, B:66:0x0164, B:68:0x016e, B:69:0x0172, B:39:0x00b8, B:40:0x00d2, B:42:0x00d8, B:47:0x00ea, B:48:0x00ee, B:50:0x00f4, B:52:0x0106, B:57:0x011b, B:28:0x008e, B:30:0x0094, B:32:0x009a, B:35:0x00a2, B:97:0x020b), top: B:102:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ea A[Catch: all -> 0x0110, TRY_ENTER, TryCatch #0 {all -> 0x0110, blocks: (B:70:0x017c, B:72:0x0182, B:74:0x019b, B:77:0x01a4, B:78:0x01ad, B:80:0x01b3, B:82:0x01c1, B:84:0x01c7, B:87:0x01d1, B:88:0x01d5, B:91:0x01fe, B:61:0x0140, B:62:0x0151, B:64:0x0157, B:66:0x0164, B:68:0x016e, B:69:0x0172, B:39:0x00b8, B:40:0x00d2, B:42:0x00d8, B:47:0x00ea, B:48:0x00ee, B:50:0x00f4, B:52:0x0106, B:57:0x011b, B:28:0x008e, B:30:0x0094, B:32:0x009a, B:35:0x00a2, B:97:0x020b), top: B:102:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4 A[Catch: all -> 0x0110, TryCatch #0 {all -> 0x0110, blocks: (B:70:0x017c, B:72:0x0182, B:74:0x019b, B:77:0x01a4, B:78:0x01ad, B:80:0x01b3, B:82:0x01c1, B:84:0x01c7, B:87:0x01d1, B:88:0x01d5, B:91:0x01fe, B:61:0x0140, B:62:0x0151, B:64:0x0157, B:66:0x0164, B:68:0x016e, B:69:0x0172, B:39:0x00b8, B:40:0x00d2, B:42:0x00d8, B:47:0x00ea, B:48:0x00ee, B:50:0x00f4, B:52:0x0106, B:57:0x011b, B:28:0x008e, B:30:0x0094, B:32:0x009a, B:35:0x00a2, B:97:0x020b), top: B:102:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0114 A[LOOP:4: B:48:0x00ee->B:56:0x0114, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x013b  */
    /* JADX WARN: Code duplicated, block: B:60:0x013d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0157 A[Catch: all -> 0x0110, TryCatch #0 {all -> 0x0110, blocks: (B:70:0x017c, B:72:0x0182, B:74:0x019b, B:77:0x01a4, B:78:0x01ad, B:80:0x01b3, B:82:0x01c1, B:84:0x01c7, B:87:0x01d1, B:88:0x01d5, B:91:0x01fe, B:61:0x0140, B:62:0x0151, B:64:0x0157, B:66:0x0164, B:68:0x016e, B:69:0x0172, B:39:0x00b8, B:40:0x00d2, B:42:0x00d8, B:47:0x00ea, B:48:0x00ee, B:50:0x00f4, B:52:0x0106, B:57:0x011b, B:28:0x008e, B:30:0x0094, B:32:0x009a, B:35:0x00a2, B:97:0x020b), top: B:102:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0182 A[Catch: all -> 0x0110, TryCatch #0 {all -> 0x0110, blocks: (B:70:0x017c, B:72:0x0182, B:74:0x019b, B:77:0x01a4, B:78:0x01ad, B:80:0x01b3, B:82:0x01c1, B:84:0x01c7, B:87:0x01d1, B:88:0x01d5, B:91:0x01fe, B:61:0x0140, B:62:0x0151, B:64:0x0157, B:66:0x0164, B:68:0x016e, B:69:0x0172, B:39:0x00b8, B:40:0x00d2, B:42:0x00d8, B:47:0x00ea, B:48:0x00ee, B:50:0x00f4, B:52:0x0106, B:57:0x011b, B:28:0x008e, B:30:0x0094, B:32:0x009a, B:35:0x00a2, B:97:0x020b), top: B:102:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:74:0x019b A[Catch: all -> 0x0110, TryCatch #0 {all -> 0x0110, blocks: (B:70:0x017c, B:72:0x0182, B:74:0x019b, B:77:0x01a4, B:78:0x01ad, B:80:0x01b3, B:82:0x01c1, B:84:0x01c7, B:87:0x01d1, B:88:0x01d5, B:91:0x01fe, B:61:0x0140, B:62:0x0151, B:64:0x0157, B:66:0x0164, B:68:0x016e, B:69:0x0172, B:39:0x00b8, B:40:0x00d2, B:42:0x00d8, B:47:0x00ea, B:48:0x00ee, B:50:0x00f4, B:52:0x0106, B:57:0x011b, B:28:0x008e, B:30:0x0094, B:32:0x009a, B:35:0x00a2, B:97:0x020b), top: B:102:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b3 A[Catch: all -> 0x0110, TryCatch #0 {all -> 0x0110, blocks: (B:70:0x017c, B:72:0x0182, B:74:0x019b, B:77:0x01a4, B:78:0x01ad, B:80:0x01b3, B:82:0x01c1, B:84:0x01c7, B:87:0x01d1, B:88:0x01d5, B:91:0x01fe, B:61:0x0140, B:62:0x0151, B:64:0x0157, B:66:0x0164, B:68:0x016e, B:69:0x0172, B:39:0x00b8, B:40:0x00d2, B:42:0x00d8, B:47:0x00ea, B:48:0x00ee, B:50:0x00f4, B:52:0x0106, B:57:0x011b, B:28:0x008e, B:30:0x0094, B:32:0x009a, B:35:0x00a2, B:97:0x020b), top: B:102:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fe A[Catch: all -> 0x0110, TRY_LEAVE, TryCatch #0 {all -> 0x0110, blocks: (B:70:0x017c, B:72:0x0182, B:74:0x019b, B:77:0x01a4, B:78:0x01ad, B:80:0x01b3, B:82:0x01c1, B:84:0x01c7, B:87:0x01d1, B:88:0x01d5, B:91:0x01fe, B:61:0x0140, B:62:0x0151, B:64:0x0157, B:66:0x0164, B:68:0x016e, B:69:0x0172, B:39:0x00b8, B:40:0x00d2, B:42:0x00d8, B:47:0x00ea, B:48:0x00ee, B:50:0x00f4, B:52:0x0106, B:57:0x011b, B:28:0x008e, B:30:0x0094, B:32:0x009a, B:35:0x00a2, B:97:0x020b), top: B:102:0x008e }] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        g1 g1Var;
        z53.a aVar;
        int i14;
        fo2.p credentials;
        String link;
        Object objT;
        int i15;
        int i16;
        List listJ;
        ArrayList arrayList;
        g1 g1Var2;
        Object objJ;
        int i17;
        g1 g1Var3;
        List list;
        fo2.s sVar;
        Iterator it;
        g1 g1Var4;
        List list2;
        p13.c.b bVar;
        List list3;
        g1 g1Var5;
        Iterator it3;
        int i18;
        int i19;
        int i24;
        qs2.a aVar2;
        qs2.a aVar3;
        co2.a aVar4;
        mo2.a aVar5;
        ArrayList arrayList2;
        Object objE0;
        fo2.i0<String, fo2.d> i0VarH;
        qs2.a aVarB;
        String strH;
        u13.a aVar6 = u13.a.COROUTINE_SUSPENDED;
        int i25 = this.f205456j;
        try {
            if (i25 == 0) {
                o13.r.b(obj);
                g1Var = this.f205457k;
                z53.b bVar2 = g1Var.f205538m;
                this.f205447a = bVar2;
                this.f205448b = g1Var;
                this.f205453g = 0;
                this.f205456j = 1;
                if (bVar2.c(this) != aVar6) {
                    aVar = bVar2;
                    i14 = 0;
                }
                return aVar6;
            }
            if (i25 == 1) {
                i14 = this.f205453g;
                g1Var = this.f205448b;
                z53.a aVar7 = this.f205447a;
                o13.r.b(obj);
                aVar = aVar7;
            } else {
                if (i25 == 2) {
                    i16 = this.f205454h;
                    int i26 = this.f205453g;
                    String str = this.f205449c;
                    g1Var = this.f205448b;
                    aVar = this.f205447a;
                    o13.r.b(obj);
                    link = str;
                    i15 = i26;
                    objT = obj;
                    ArrayList arrayListZ = p13.h0.Z((Iterable) objT);
                    ps2.w wVar = ps2.w.f140538a;
                    is2.b bVar3 = is2.b.FITPAY;
                    wVar.getClass();
                    listJ = ps2.w.j(bVar3);
                    arrayList = new ArrayList();
                    for (Object obj3 : arrayListZ) {
                        sVar = (fo2.s) obj3;
                        if (listJ != null && listJ.isEmpty()) {
                            g1Var4 = g1Var;
                            break;
                            break;
                        }
                        it = listJ.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                g1Var4 = g1Var;
                                break;
                            }
                            g1Var4 = g1Var;
                            if (((ps2.n) it.next()).f140511n == sVar.f73103c) {
                                arrayList.add(obj3);
                                break;
                            }
                            g1Var = g1Var4;
                        }
                        g1Var = g1Var4;
                    }
                    g1Var2 = g1Var;
                    u0 u0Var = u0.f205864a;
                    this.f205447a = aVar;
                    this.f205448b = g1Var2;
                    this.f205449c = null;
                    this.f205450d = arrayList;
                    this.f205451e = null;
                    this.f205453g = i15;
                    this.f205454h = i16;
                    this.f205456j = 3;
                    objJ = u0Var.j(link, p13.l0.f134950a, this);
                    if (objJ == aVar6) {
                        i17 = i15;
                        g1Var3 = g1Var2;
                        list = arrayList;
                        list2 = (List) objJ;
                        w13.c cVar = qs2.a.A;
                        ArrayList arrayList3 = new ArrayList();
                        cVar.getClass();
                        bVar = new p13.c.b();
                        while (bVar.hasNext()) {
                            Object next = bVar.next();
                            aVar2 = (qs2.a) next;
                            if (aVar2.f147396a != is2.b.FITPAY) {
                            }
                        }
                        Iterator it4 = arrayList3.iterator();
                        list3 = list;
                        g1Var5 = g1Var3;
                        it3 = it4;
                        i18 = i17;
                        i19 = i16;
                        i24 = 0;
                    }
                    return aVar6;
                }
                if (i25 == 3) {
                    i16 = this.f205454h;
                    i17 = this.f205453g;
                    list = this.f205450d;
                    g1Var3 = this.f205448b;
                    aVar = this.f205447a;
                    o13.r.b(obj);
                    objJ = obj;
                    list2 = (List) objJ;
                    w13.c cVar2 = qs2.a.A;
                    ArrayList arrayList4 = new ArrayList();
                    cVar2.getClass();
                    bVar = new p13.c.b();
                    while (bVar.hasNext()) {
                        Object next2 = bVar.next();
                        aVar2 = (qs2.a) next2;
                        if (aVar2.f147396a != is2.b.FITPAY && p13.u.z(aVar2.f147397b, qs2.e.TRANSIT)) {
                            arrayList4.add(next2);
                        }
                    }
                    Iterator it5 = arrayList4.iterator();
                    list3 = list;
                    g1Var5 = g1Var3;
                    it3 = it5;
                    i18 = i17;
                    i19 = i16;
                    i24 = 0;
                } else {
                    if (i25 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i24 = this.f205455i;
                    i19 = this.f205454h;
                    i18 = this.f205453g;
                    it3 = this.f205452f;
                    List list4 = this.f205451e;
                    list3 = this.f205450d;
                    g1Var5 = this.f205448b;
                    aVar = this.f205447a;
                    o13.r.b(obj);
                    list2 = list4;
                }
            }
            while (it3.hasNext()) {
                aVar3 = (qs2.a) it3.next();
                aVar4 = g1Var5.f205526a;
                aVar3.getClass();
                aVar4.getClass();
                if (yr2.e.a.f199139a[aVar3.ordinal()] == 5) {
                    aVar5 = new mo2.a(aVar4);
                } else {
                    aVar5 = null;
                }
                if (aVar5 != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj4 : list2) {
                        i0VarH = ((fo2.l0) obj4).h();
                        if (i0VarH != null || (strH = i0VarH.h()) == null) {
                            aVarB = null;
                        } else {
                            aVarB = aq2.k.b(strH);
                        }
                        if (aVarB == aVar3) {
                            arrayList2.add(obj4);
                        }
                    }
                    this.f205447a = aVar;
                    this.f205448b = g1Var5;
                    this.f205449c = null;
                    this.f205450d = list3;
                    this.f205451e = list2;
                    this.f205452f = it3;
                    this.f205453g = i18;
                    this.f205454h = i19;
                    this.f205455i = i24;
                    this.f205456j = 4;
                    x53.c cVar3 = o53.s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new mo2.b(arrayList2, aVar5, list3, null), this);
                    if (objE0 == u13.a.COROUTINE_SUSPENDED) {
                        objE0 = Unit.INSTANCE;
                    }
                    if (objE0 == aVar6) {
                        return aVar6;
                    }
                }
            }
            aVar.e(null);
            return list2;
            fo2.u uVar = g1Var.f205530e;
            if (uVar != null) {
                try {
                    fo2.m0 links = uVar.getLinks();
                    if (links != null && (credentials = links.getCredentials()) != null && (link = credentials.getLink()) != null) {
                        this.f205447a = aVar;
                        this.f205448b = g1Var;
                        this.f205449c = link;
                        this.f205453g = i14;
                        this.f205454h = 0;
                        this.f205456j = 2;
                        objT = g1Var.t(true, this);
                        if (objT != aVar6) {
                            i15 = i14;
                            i16 = 0;
                            ArrayList arrayListZ2 = p13.h0.Z((Iterable) objT);
                            ps2.w wVar2 = ps2.w.f140538a;
                            is2.b bVar4 = is2.b.FITPAY;
                            wVar2.getClass();
                            listJ = ps2.w.j(bVar4);
                            arrayList = new ArrayList();
                            while (r5.hasNext()) {
                                sVar = (fo2.s) obj3;
                                if (listJ != null) {
                                    it = listJ.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            g1Var4 = g1Var;
                                            break;
                                            break;
                                        }
                                        g1Var4 = g1Var;
                                        if (((ps2.n) it.next()).f140511n == sVar.f73103c) {
                                            arrayList.add(obj3);
                                            break;
                                            break;
                                        }
                                        g1Var = g1Var4;
                                    }
                                } else {
                                    it = listJ.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            g1Var4 = g1Var;
                                            break;
                                            break;
                                        }
                                        g1Var4 = g1Var;
                                        if (((ps2.n) it.next()).f140511n == sVar.f73103c) {
                                            arrayList.add(obj3);
                                            break;
                                            break;
                                        }
                                        g1Var = g1Var4;
                                    }
                                }
                                g1Var = g1Var4;
                            }
                            g1Var2 = g1Var;
                            u0 u0Var2 = u0.f205864a;
                            this.f205447a = aVar;
                            this.f205448b = g1Var2;
                            this.f205449c = null;
                            this.f205450d = arrayList;
                            this.f205451e = null;
                            this.f205453g = i15;
                            this.f205454h = i16;
                            this.f205456j = 3;
                            objJ = u0Var2.j(link, p13.l0.f134950a, this);
                            if (objJ == aVar6) {
                                i17 = i15;
                                g1Var3 = g1Var2;
                                list = arrayList;
                                list2 = (List) objJ;
                                w13.c cVar4 = qs2.a.A;
                                ArrayList arrayList5 = new ArrayList();
                                cVar4.getClass();
                                bVar = new p13.c.b();
                                while (bVar.hasNext()) {
                                    Object next3 = bVar.next();
                                    aVar2 = (qs2.a) next3;
                                    if (aVar2.f147396a != is2.b.FITPAY) {
                                    }
                                }
                                Iterator it6 = arrayList5.iterator();
                                list3 = list;
                                g1Var5 = g1Var3;
                                it3 = it6;
                                i18 = i17;
                                i19 = i16;
                                i24 = 0;
                                while (it3.hasNext()) {
                                    aVar3 = (qs2.a) it3.next();
                                    aVar4 = g1Var5.f205526a;
                                    aVar3.getClass();
                                    aVar4.getClass();
                                    if (yr2.e.a.f199139a[aVar3.ordinal()] == 5) {
                                        aVar5 = new mo2.a(aVar4);
                                    } else {
                                        aVar5 = null;
                                    }
                                    if (aVar5 != null) {
                                        arrayList2 = new ArrayList();
                                        while (r14.hasNext()) {
                                            i0VarH = ((fo2.l0) obj4).h();
                                            if (i0VarH != null) {
                                                aVarB = null;
                                            } else {
                                                aVarB = null;
                                            }
                                            if (aVarB == aVar3) {
                                                arrayList2.add(obj4);
                                            }
                                        }
                                        this.f205447a = aVar;
                                        this.f205448b = g1Var5;
                                        this.f205449c = null;
                                        this.f205450d = list3;
                                        this.f205451e = list2;
                                        this.f205452f = it3;
                                        this.f205453g = i18;
                                        this.f205454h = i19;
                                        this.f205455i = i24;
                                        this.f205456j = 4;
                                        x53.c cVar5 = o53.s0.f129406a;
                                        objE0 = ge1.b.e0(x53.b.f189152a, new mo2.b(arrayList2, aVar5, list3, null), this);
                                        if (objE0 == u13.a.COROUTINE_SUSPENDED) {
                                            objE0 = Unit.INSTANCE;
                                        }
                                        if (objE0 == aVar6) {
                                        }
                                    }
                                }
                                aVar.e(null);
                                return list2;
                            }
                        }
                        return aVar6;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj2 = null;
                    aVar.e(obj2);
                    throw th;
                }
            }
            p13.j0 j0Var = p13.j0.f134944a;
            aVar.e(null);
            return j0Var;
        } catch (Throwable th4) {
            th = th4;
            obj2 = null;
        }
    }
}

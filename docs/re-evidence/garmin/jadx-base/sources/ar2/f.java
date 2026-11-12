package ar2;

import e23.p;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p13.h0;
import p13.x;
import ps2.n;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.addcard.viewmodels.SelectOperatorViewModel$onOperatorClicked$1", f = "SelectOperatorViewModel.kt", l = {53, 56, 59, 61, 62, 94, 69, 71, 94, 75, 82, 94, 92, 94, 94}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Unit f12601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f12603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ms2.e f12604f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements e23.a<String> {
        public a(Object obj) {
            super(0, obj, e.class, "requireDeviceName", "requireDeviceName()Ljava/lang/String;", 0);
        }

        @Override // e23.a
        public final String invoke() {
            return ((e) this.receiver).A4();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, ms2.e eVar2, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f12603e = eVar;
        this.f12604f = eVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f12603e, this.f12604f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0202  */
    /* JADX WARN: Code duplicated, block: B:101:0x0204 A[Catch: all -> 0x0186, TRY_LEAVE, TryCatch #1 {all -> 0x0186, blocks: (B:93:0x01d1, B:88:0x01b4, B:90:0x01b8, B:98:0x01eb, B:74:0x016f, B:69:0x014d, B:71:0x0155, B:81:0x018a, B:83:0x0192, B:85:0x0198, B:101:0x0204, B:65:0x0144, B:108:0x0234, B:109:0x023b), top: B:132:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:104:0x021f A[PHI: r9
      0x021f: PHI (r9v17 ar2.f) = (r9v9 ar2.f), (r9v13 ar2.f), (r9v18 ar2.f) binds: [B:102:0x021b, B:99:0x0200, B:19:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x0233  */
    /* JADX WARN: Code duplicated, block: B:128:0x028c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:? A[LOOP:0: B:50:0x00ca->B:141:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd A[Catch: all -> 0x003c, TryCatch #5 {all -> 0x003c, blocks: (B:14:0x0038, B:24:0x0063, B:27:0x0071, B:31:0x0080, B:34:0x008a, B:35:0x0090, B:36:0x0095, B:37:0x0099, B:44:0x00b7, B:46:0x00bd, B:55:0x00ef, B:49:0x00c6, B:50:0x00ca, B:52:0x00d0), top: B:132:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6 A[Catch: all -> 0x003c, TryCatch #5 {all -> 0x003c, blocks: (B:14:0x0038, B:24:0x0063, B:27:0x0071, B:31:0x0080, B:34:0x008a, B:35:0x0090, B:36:0x0095, B:37:0x0099, B:44:0x00b7, B:46:0x00bd, B:55:0x00ef, B:49:0x00c6, B:50:0x00ca, B:52:0x00d0), top: B:132:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0 A[Catch: all -> 0x003c, TryCatch #5 {all -> 0x003c, blocks: (B:14:0x0038, B:24:0x0063, B:27:0x0071, B:31:0x0080, B:34:0x008a, B:35:0x0090, B:36:0x0095, B:37:0x0099, B:44:0x00b7, B:46:0x00bd, B:55:0x00ef, B:49:0x00c6, B:50:0x00ca, B:52:0x00d0), top: B:132:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0102 A[Catch: all -> 0x023c, TRY_ENTER, TryCatch #4 {all -> 0x023c, blocks: (B:61:0x0119, B:63:0x013a, B:58:0x0102, B:43:0x00b0, B:40:0x00a0), top: B:137:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Code duplicated, block: B:61:0x0119 A[Catch: all -> 0x023c, PHI: r13
      0x0119: PHI (r13v22 java.lang.Object) = (r13v21 java.lang.Object), (r13v0 java.lang.Object) binds: [B:59:0x0116, B:35:0x0090] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x023c, blocks: (B:61:0x0119, B:63:0x013a, B:58:0x0102, B:43:0x00b0, B:40:0x00a0), top: B:137:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x013a A[Catch: all -> 0x023c, TRY_LEAVE, TryCatch #4 {all -> 0x023c, blocks: (B:61:0x0119, B:63:0x013a, B:58:0x0102, B:43:0x00b0, B:40:0x00a0), top: B:137:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:68:0x014c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0155 A[Catch: all -> 0x0186, TryCatch #1 {all -> 0x0186, blocks: (B:93:0x01d1, B:88:0x01b4, B:90:0x01b8, B:98:0x01eb, B:74:0x016f, B:69:0x014d, B:71:0x0155, B:81:0x018a, B:83:0x0192, B:85:0x0198, B:101:0x0204, B:65:0x0144, B:108:0x0234, B:109:0x023b), top: B:132:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:73:0x016d  */
    /* JADX WARN: Code duplicated, block: B:74:0x016f A[Catch: all -> 0x0186, PHI: r9
      0x016f: PHI (r9v11 ar2.f) = (r9v9 ar2.f), (r9v12 ar2.f) binds: [B:72:0x016b, B:32:0x0083] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0186, blocks: (B:93:0x01d1, B:88:0x01b4, B:90:0x01b8, B:98:0x01eb, B:74:0x016f, B:69:0x014d, B:71:0x0155, B:81:0x018a, B:83:0x0192, B:85:0x0198, B:101:0x0204, B:65:0x0144, B:108:0x0234, B:109:0x023b), top: B:132:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0185 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x018a A[Catch: all -> 0x0186, TRY_ENTER, TryCatch #1 {all -> 0x0186, blocks: (B:93:0x01d1, B:88:0x01b4, B:90:0x01b8, B:98:0x01eb, B:74:0x016f, B:69:0x014d, B:71:0x0155, B:81:0x018a, B:83:0x0192, B:85:0x0198, B:101:0x0204, B:65:0x0144, B:108:0x0234, B:109:0x023b), top: B:132:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0192 A[Catch: all -> 0x0186, TryCatch #1 {all -> 0x0186, blocks: (B:93:0x01d1, B:88:0x01b4, B:90:0x01b8, B:98:0x01eb, B:74:0x016f, B:69:0x014d, B:71:0x0155, B:81:0x018a, B:83:0x0192, B:85:0x0198, B:101:0x0204, B:65:0x0144, B:108:0x0234, B:109:0x023b), top: B:132:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01b8 A[Catch: all -> 0x0186, TryCatch #1 {all -> 0x0186, blocks: (B:93:0x01d1, B:88:0x01b4, B:90:0x01b8, B:98:0x01eb, B:74:0x016f, B:69:0x014d, B:71:0x0155, B:81:0x018a, B:83:0x0192, B:85:0x0198, B:101:0x0204, B:65:0x0144, B:108:0x0234, B:109:0x023b), top: B:132:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d1 A[Catch: all -> 0x0186, PHI: r9
      0x01d1: PHI (r9v15 ar2.f) = (r9v13 ar2.f), (r9v16 ar2.f) binds: [B:91:0x01cd, B:25:0x0066] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0186, blocks: (B:93:0x01d1, B:88:0x01b4, B:90:0x01b8, B:98:0x01eb, B:74:0x016f, B:69:0x014d, B:71:0x0155, B:81:0x018a, B:83:0x0192, B:85:0x0198, B:101:0x0204, B:65:0x0144, B:108:0x0234, B:109:0x023b), top: B:132:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:98:0x01eb A[Catch: all -> 0x0186, TRY_ENTER, TryCatch #1 {all -> 0x0186, blocks: (B:93:0x01d1, B:88:0x01b4, B:90:0x01b8, B:98:0x01eb, B:74:0x016f, B:69:0x014d, B:71:0x0155, B:81:0x018a, B:83:0x0192, B:85:0x0198, B:101:0x0204, B:65:0x0144, B:108:0x0234, B:109:0x023b), top: B:132:0x000b }] */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0230, code lost:
    
        if (r10.x4(r13, r12) == r1) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x026d, code lost:
    
        if (r10.x4(r13, r12) == r1) goto L128;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th3;
        ar2.a.b.C0176b c0176b;
        ar2.a.b.h hVar;
        List<qs2.b> listZ3;
        wr2.d dVar;
        Iterator<T> it;
        qs2.b bVar;
        e.b.c cVar;
        ns2.a<? extends ms2.f> aVar;
        n nVarB;
        Object obj2;
        f fVar;
        ns2.a<? extends ms2.f> aVar2;
        e.b.C0179b c0179b;
        ms2.f fVar2;
        ar2.a.b.c cVar2;
        Unit unit;
        ar2.a.b.h hVar2;
        Unit unit2;
        dr2.a.InterfaceC1294a interfaceC1294a;
        e.b.a aVar3;
        ar2.a.b bVarA;
        Unit unit3;
        ar2.a.b.h hVar3;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12602d;
        ms2.e eVar = this.f12604f;
        e eVar2 = this.f12603e;
        try {
            try {
                switch (i14) {
                    case 0:
                        r.b(obj);
                        try {
                            ar2.a.b.h hVar4 = new ar2.a.b.h(true);
                            this.f12602d = 1;
                            if (eVar2.x4(hVar4, this) != aVar4) {
                                eVar.getClass();
                                listZ3 = eVar.Z3();
                                if (!listZ3.isEmpty()) {
                                    dr2.a aVar5 = eVar2.f12560a;
                                    long jB4 = eVar2.B4();
                                    this.f12602d = 3;
                                    aVar5.getClass();
                                    obj = dr2.a.b(jB4).j(eVar, this);
                                    if (obj != aVar4) {
                                        aVar = (ns2.a) obj;
                                        dr2.a aVar6 = eVar2.f12560a;
                                        long jB5 = eVar2.B4();
                                        this.f12599a = aVar;
                                        this.f12602d = 4;
                                        aVar6.getClass();
                                        nVarB = dr2.a.b(jB5);
                                        obj2 = nVarB.f140509l.get(eVar.getF206680a());
                                        if (obj2 != null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        fVar = this;
                                        obj = ((ms2.c) obj2).d(nVarB.f140498a.getUnitId(), eVar, aVar, fVar);
                                        if (obj == aVar4) {
                                            aVar2 = aVar;
                                            if (((Boolean) obj).booleanValue()) {
                                                if (aVar2.f127815a.size() == 1) {
                                                    c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                                    fVar.f12599a = null;
                                                    fVar.f12602d = 11;
                                                    if (eVar2.y4(c0179b, this) != aVar4) {
                                                        ar2.a.b.h hVar5 = new ar2.a.b.h(false);
                                                        fVar.f12599a = null;
                                                        fVar.f12600b = null;
                                                        fVar.f12602d = 12;
                                                    }
                                                } else {
                                                    c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                                    fVar.f12599a = null;
                                                    fVar.f12602d = 11;
                                                    if (eVar2.y4(c0179b, this) != aVar4) {
                                                        ar2.a.b.h hVar6 = new ar2.a.b.h(false);
                                                        fVar.f12599a = null;
                                                        fVar.f12600b = null;
                                                        fVar.f12602d = 12;
                                                    }
                                                }
                                                break;
                                            } else {
                                                cVar2 = new ar2.a.b.c(eVar.getF206682c(), eVar2.A4());
                                                fVar.f12599a = null;
                                                fVar.f12602d = 5;
                                                if (eVar2.x4(cVar2, this) != aVar4) {
                                                    unit = Unit.INSTANCE;
                                                    hVar2 = new ar2.a.b.h(false);
                                                    fVar.f12599a = null;
                                                    fVar.f12600b = unit;
                                                    fVar.f12602d = 6;
                                                    if (eVar2.x4(hVar2, this) != aVar4) {
                                                        return unit;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return aVar4;
                                }
                                dVar = wr2.d.f186837a;
                                if (listZ3.isEmpty()) {
                                    it = listZ3.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            bVar = (qs2.b) it.next();
                                            dVar.getClass();
                                            bVar.getClass();
                                            if (!x.k(qs2.b.UNAPPROVED, qs2.b.REMOTE_CONFIG_DISABLED).contains(bVar)) {
                                            }
                                        }
                                        dr2.a aVar7 = eVar2.f12560a;
                                        long jB6 = eVar2.B4();
                                        this.f12602d = 3;
                                        aVar7.getClass();
                                        obj = dr2.a.b(jB6).j(eVar, this);
                                        if (obj != aVar4) {
                                            aVar = (ns2.a) obj;
                                            dr2.a aVar8 = eVar2.f12560a;
                                            long jB7 = eVar2.B4();
                                            this.f12599a = aVar;
                                            this.f12602d = 4;
                                            aVar8.getClass();
                                            nVarB = dr2.a.b(jB7);
                                            obj2 = nVarB.f140509l.get(eVar.getF206680a());
                                            if (obj2 != null) {
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                            fVar = this;
                                            obj = ((ms2.c) obj2).d(nVarB.f140498a.getUnitId(), eVar, aVar, fVar);
                                            if (obj == aVar4) {
                                                aVar2 = aVar;
                                                if (((Boolean) obj).booleanValue()) {
                                                    cVar2 = new ar2.a.b.c(eVar.getF206682c(), eVar2.A4());
                                                    fVar.f12599a = null;
                                                    fVar.f12602d = 5;
                                                    if (eVar2.x4(cVar2, this) != aVar4) {
                                                        unit = Unit.INSTANCE;
                                                        hVar2 = new ar2.a.b.h(false);
                                                        fVar.f12599a = null;
                                                        fVar.f12600b = unit;
                                                        fVar.f12602d = 6;
                                                        if (eVar2.x4(hVar2, this) != aVar4) {
                                                            return unit;
                                                        }
                                                    }
                                                } else if (aVar2.f127815a.size() == 1 || eVar.getF205857h()) {
                                                    c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                                    fVar.f12599a = null;
                                                    fVar.f12602d = 11;
                                                    if (eVar2.y4(c0179b, this) != aVar4) {
                                                        ar2.a.b.h hVar7 = new ar2.a.b.h(false);
                                                        fVar.f12599a = null;
                                                        fVar.f12600b = null;
                                                        fVar.f12602d = 12;
                                                    }
                                                    break;
                                                } else {
                                                    fVar2 = (ms2.f) h0.I0(aVar2);
                                                    dr2.a aVar9 = eVar2.f12560a;
                                                    long jB8 = eVar2.B4();
                                                    fVar.f12599a = null;
                                                    fVar.f12600b = fVar2;
                                                    fVar.f12602d = 7;
                                                    obj = aVar9.c(fVar2, jB8, this);
                                                    if (obj != aVar4) {
                                                        interfaceC1294a = (dr2.a.InterfaceC1294a) obj;
                                                        if (interfaceC1294a != null) {
                                                            aVar3 = new e.b.a(fVar2, eVar2.B4());
                                                            fVar.f12599a = null;
                                                            fVar.f12600b = null;
                                                            fVar.f12602d = 10;
                                                            if (eVar2.y4(aVar3, this) == aVar4) {
                                                                ar2.a.b.h hVar8 = new ar2.a.b.h(false);
                                                                fVar.f12599a = null;
                                                                fVar.f12600b = null;
                                                                fVar.f12602d = 12;
                                                                break;
                                                            }
                                                        } else {
                                                            bVarA = com.garmin.feature.garminpay.ui.addcard.c.a(interfaceC1294a, new a(eVar2));
                                                            fVar.f12599a = null;
                                                            fVar.f12600b = null;
                                                            fVar.f12602d = 8;
                                                            if (eVar2.x4(bVarA, this) == aVar4) {
                                                                unit3 = Unit.INSTANCE;
                                                                hVar3 = new ar2.a.b.h(false);
                                                                fVar.f12599a = null;
                                                                fVar.f12600b = null;
                                                                fVar.f12601c = unit3;
                                                                fVar.f12602d = 9;
                                                                if (eVar2.x4(hVar3, this) == aVar4) {
                                                                    return unit3;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return aVar4;
                                    }
                                }
                                cVar = new e.b.c(eVar.getF206682c());
                                this.f12602d = 2;
                                if (eVar2.y4(cVar, this) != aVar4) {
                                    dr2.a aVar10 = eVar2.f12560a;
                                    long jB9 = eVar2.B4();
                                    this.f12602d = 3;
                                    aVar10.getClass();
                                    obj = dr2.a.b(jB9).j(eVar, this);
                                    if (obj != aVar4) {
                                        aVar = (ns2.a) obj;
                                        dr2.a aVar11 = eVar2.f12560a;
                                        long jB10 = eVar2.B4();
                                        this.f12599a = aVar;
                                        this.f12602d = 4;
                                        aVar11.getClass();
                                        nVarB = dr2.a.b(jB10);
                                        obj2 = nVarB.f140509l.get(eVar.getF206680a());
                                        if (obj2 != null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        fVar = this;
                                        obj = ((ms2.c) obj2).d(nVarB.f140498a.getUnitId(), eVar, aVar, fVar);
                                        if (obj == aVar4) {
                                            aVar2 = aVar;
                                            if (((Boolean) obj).booleanValue()) {
                                                if (aVar2.f127815a.size() == 1) {
                                                    c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                                    fVar.f12599a = null;
                                                    fVar.f12602d = 11;
                                                    if (eVar2.y4(c0179b, this) != aVar4) {
                                                        ar2.a.b.h hVar9 = new ar2.a.b.h(false);
                                                        fVar.f12599a = null;
                                                        fVar.f12600b = null;
                                                        fVar.f12602d = 12;
                                                    }
                                                } else {
                                                    c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                                    fVar.f12599a = null;
                                                    fVar.f12602d = 11;
                                                    if (eVar2.y4(c0179b, this) != aVar4) {
                                                        ar2.a.b.h hVar10 = new ar2.a.b.h(false);
                                                        fVar.f12599a = null;
                                                        fVar.f12600b = null;
                                                        fVar.f12602d = 12;
                                                    }
                                                }
                                                break;
                                            } else {
                                                cVar2 = new ar2.a.b.c(eVar.getF206682c(), eVar2.A4());
                                                fVar.f12599a = null;
                                                fVar.f12602d = 5;
                                                if (eVar2.x4(cVar2, this) != aVar4) {
                                                    unit = Unit.INSTANCE;
                                                    hVar2 = new ar2.a.b.h(false);
                                                    fVar.f12599a = null;
                                                    fVar.f12600b = unit;
                                                    fVar.f12602d = 6;
                                                    if (eVar2.x4(hVar2, this) != aVar4) {
                                                        return unit;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return aVar4;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            th3 = th;
                            try {
                                try {
                                    e.f12589h.f12592a.a().warn("[onOperatorClicked]", th3);
                                    c0176b = ar2.a.b.C0176b.f12566a;
                                    this.f12599a = null;
                                    this.f12600b = null;
                                    this.f12602d = 13;
                                    if (eVar2.x4(c0176b, this) != aVar4) {
                                        ar2.a.b.h hVar11 = new ar2.a.b.h(false);
                                        this.f12599a = null;
                                        this.f12602d = 14;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    hVar = new ar2.a.b.h(false);
                                    this.f12599a = th;
                                    this.f12600b = null;
                                    this.f12602d = 15;
                                    if (eVar2.x4(hVar, this) == aVar4) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                            break;
                        }
                        return aVar4;
                    case 1:
                        r.b(obj);
                        eVar.getClass();
                        listZ3 = eVar.Z3();
                        if (!listZ3.isEmpty()) {
                            dr2.a aVar12 = eVar2.f12560a;
                            long jB11 = eVar2.B4();
                            this.f12602d = 3;
                            aVar12.getClass();
                            obj = dr2.a.b(jB11).j(eVar, this);
                            if (obj != aVar4) {
                                aVar = (ns2.a) obj;
                                dr2.a aVar13 = eVar2.f12560a;
                                long jB12 = eVar2.B4();
                                this.f12599a = aVar;
                                this.f12602d = 4;
                                aVar13.getClass();
                                nVarB = dr2.a.b(jB12);
                                obj2 = nVarB.f140509l.get(eVar.getF206680a());
                                if (obj2 != null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                fVar = this;
                                obj = ((ms2.c) obj2).d(nVarB.f140498a.getUnitId(), eVar, aVar, fVar);
                                if (obj == aVar4) {
                                    aVar2 = aVar;
                                    if (((Boolean) obj).booleanValue()) {
                                        if (aVar2.f127815a.size() == 1) {
                                            c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                            fVar.f12599a = null;
                                            fVar.f12602d = 11;
                                            if (eVar2.y4(c0179b, this) != aVar4) {
                                                ar2.a.b.h hVar12 = new ar2.a.b.h(false);
                                                fVar.f12599a = null;
                                                fVar.f12600b = null;
                                                fVar.f12602d = 12;
                                            }
                                        } else {
                                            c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                            fVar.f12599a = null;
                                            fVar.f12602d = 11;
                                            if (eVar2.y4(c0179b, this) != aVar4) {
                                                ar2.a.b.h hVar13 = new ar2.a.b.h(false);
                                                fVar.f12599a = null;
                                                fVar.f12600b = null;
                                                fVar.f12602d = 12;
                                            }
                                        }
                                        break;
                                    } else {
                                        cVar2 = new ar2.a.b.c(eVar.getF206682c(), eVar2.A4());
                                        fVar.f12599a = null;
                                        fVar.f12602d = 5;
                                        if (eVar2.x4(cVar2, this) != aVar4) {
                                            unit = Unit.INSTANCE;
                                            hVar2 = new ar2.a.b.h(false);
                                            fVar.f12599a = null;
                                            fVar.f12600b = unit;
                                            fVar.f12602d = 6;
                                            if (eVar2.x4(hVar2, this) != aVar4) {
                                                return unit;
                                            }
                                        }
                                    }
                                }
                            }
                            return aVar4;
                        }
                        dVar = wr2.d.f186837a;
                        if (listZ3.isEmpty()) {
                            it = listZ3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    bVar = (qs2.b) it.next();
                                    dVar.getClass();
                                    bVar.getClass();
                                    if (!x.k(qs2.b.UNAPPROVED, qs2.b.REMOTE_CONFIG_DISABLED).contains(bVar)) {
                                    }
                                }
                                dr2.a aVar14 = eVar2.f12560a;
                                long jB13 = eVar2.B4();
                                this.f12602d = 3;
                                aVar14.getClass();
                                obj = dr2.a.b(jB13).j(eVar, this);
                                if (obj != aVar4) {
                                    aVar = (ns2.a) obj;
                                    dr2.a aVar15 = eVar2.f12560a;
                                    long jB14 = eVar2.B4();
                                    this.f12599a = aVar;
                                    this.f12602d = 4;
                                    aVar15.getClass();
                                    nVarB = dr2.a.b(jB14);
                                    obj2 = nVarB.f140509l.get(eVar.getF206680a());
                                    if (obj2 != null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    fVar = this;
                                    obj = ((ms2.c) obj2).d(nVarB.f140498a.getUnitId(), eVar, aVar, fVar);
                                    if (obj == aVar4) {
                                        aVar2 = aVar;
                                        if (((Boolean) obj).booleanValue()) {
                                            if (aVar2.f127815a.size() == 1) {
                                                c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                                fVar.f12599a = null;
                                                fVar.f12602d = 11;
                                                if (eVar2.y4(c0179b, this) != aVar4) {
                                                    ar2.a.b.h hVar14 = new ar2.a.b.h(false);
                                                    fVar.f12599a = null;
                                                    fVar.f12600b = null;
                                                    fVar.f12602d = 12;
                                                }
                                            } else {
                                                c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                                fVar.f12599a = null;
                                                fVar.f12602d = 11;
                                                if (eVar2.y4(c0179b, this) != aVar4) {
                                                    ar2.a.b.h hVar15 = new ar2.a.b.h(false);
                                                    fVar.f12599a = null;
                                                    fVar.f12600b = null;
                                                    fVar.f12602d = 12;
                                                }
                                            }
                                            break;
                                        } else {
                                            cVar2 = new ar2.a.b.c(eVar.getF206682c(), eVar2.A4());
                                            fVar.f12599a = null;
                                            fVar.f12602d = 5;
                                            if (eVar2.x4(cVar2, this) != aVar4) {
                                                unit = Unit.INSTANCE;
                                                hVar2 = new ar2.a.b.h(false);
                                                fVar.f12599a = null;
                                                fVar.f12600b = unit;
                                                fVar.f12602d = 6;
                                                if (eVar2.x4(hVar2, this) != aVar4) {
                                                    return unit;
                                                }
                                            }
                                        }
                                    }
                                }
                                return aVar4;
                            }
                        }
                        cVar = new e.b.c(eVar.getF206682c());
                        this.f12602d = 2;
                        if (eVar2.y4(cVar, this) != aVar4) {
                            dr2.a aVar16 = eVar2.f12560a;
                            long jB15 = eVar2.B4();
                            this.f12602d = 3;
                            aVar16.getClass();
                            obj = dr2.a.b(jB15).j(eVar, this);
                            if (obj != aVar4) {
                                aVar = (ns2.a) obj;
                                dr2.a aVar17 = eVar2.f12560a;
                                long jB16 = eVar2.B4();
                                this.f12599a = aVar;
                                this.f12602d = 4;
                                aVar17.getClass();
                                nVarB = dr2.a.b(jB16);
                                obj2 = nVarB.f140509l.get(eVar.getF206680a());
                                if (obj2 != null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                fVar = this;
                                obj = ((ms2.c) obj2).d(nVarB.f140498a.getUnitId(), eVar, aVar, fVar);
                                if (obj == aVar4) {
                                    aVar2 = aVar;
                                    if (((Boolean) obj).booleanValue()) {
                                        if (aVar2.f127815a.size() == 1) {
                                            c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                            fVar.f12599a = null;
                                            fVar.f12602d = 11;
                                            if (eVar2.y4(c0179b, this) != aVar4) {
                                                ar2.a.b.h hVar16 = new ar2.a.b.h(false);
                                                fVar.f12599a = null;
                                                fVar.f12600b = null;
                                                fVar.f12602d = 12;
                                            }
                                        } else {
                                            c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                            fVar.f12599a = null;
                                            fVar.f12602d = 11;
                                            if (eVar2.y4(c0179b, this) != aVar4) {
                                                ar2.a.b.h hVar17 = new ar2.a.b.h(false);
                                                fVar.f12599a = null;
                                                fVar.f12600b = null;
                                                fVar.f12602d = 12;
                                            }
                                        }
                                        break;
                                    } else {
                                        cVar2 = new ar2.a.b.c(eVar.getF206682c(), eVar2.A4());
                                        fVar.f12599a = null;
                                        fVar.f12602d = 5;
                                        if (eVar2.x4(cVar2, this) != aVar4) {
                                            unit = Unit.INSTANCE;
                                            hVar2 = new ar2.a.b.h(false);
                                            fVar.f12599a = null;
                                            fVar.f12600b = unit;
                                            fVar.f12602d = 6;
                                            if (eVar2.x4(hVar2, this) != aVar4) {
                                                return unit;
                                            }
                                        }
                                    }
                                }
                            }
                            return aVar4;
                        }
                        return aVar4;
                    case 2:
                        r.b(obj);
                        dr2.a aVar18 = eVar2.f12560a;
                        long jB17 = eVar2.B4();
                        this.f12602d = 3;
                        aVar18.getClass();
                        obj = dr2.a.b(jB17).j(eVar, this);
                        if (obj != aVar4) {
                            aVar = (ns2.a) obj;
                            dr2.a aVar19 = eVar2.f12560a;
                            long jB18 = eVar2.B4();
                            this.f12599a = aVar;
                            this.f12602d = 4;
                            aVar19.getClass();
                            nVarB = dr2.a.b(jB18);
                            obj2 = nVarB.f140509l.get(eVar.getF206680a());
                            if (obj2 != null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            fVar = this;
                            obj = ((ms2.c) obj2).d(nVarB.f140498a.getUnitId(), eVar, aVar, fVar);
                            if (obj == aVar4) {
                                aVar2 = aVar;
                                if (((Boolean) obj).booleanValue()) {
                                    if (aVar2.f127815a.size() == 1) {
                                        c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                        fVar.f12599a = null;
                                        fVar.f12602d = 11;
                                        if (eVar2.y4(c0179b, this) != aVar4) {
                                            ar2.a.b.h hVar18 = new ar2.a.b.h(false);
                                            fVar.f12599a = null;
                                            fVar.f12600b = null;
                                            fVar.f12602d = 12;
                                        }
                                    } else {
                                        c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                        fVar.f12599a = null;
                                        fVar.f12602d = 11;
                                        if (eVar2.y4(c0179b, this) != aVar4) {
                                            ar2.a.b.h hVar19 = new ar2.a.b.h(false);
                                            fVar.f12599a = null;
                                            fVar.f12600b = null;
                                            fVar.f12602d = 12;
                                        }
                                    }
                                    break;
                                } else {
                                    cVar2 = new ar2.a.b.c(eVar.getF206682c(), eVar2.A4());
                                    fVar.f12599a = null;
                                    fVar.f12602d = 5;
                                    if (eVar2.x4(cVar2, this) != aVar4) {
                                        unit = Unit.INSTANCE;
                                        hVar2 = new ar2.a.b.h(false);
                                        fVar.f12599a = null;
                                        fVar.f12600b = unit;
                                        fVar.f12602d = 6;
                                        if (eVar2.x4(hVar2, this) != aVar4) {
                                            return unit;
                                        }
                                    }
                                }
                            }
                        }
                        return aVar4;
                    case 3:
                        r.b(obj);
                        aVar = (ns2.a) obj;
                        dr2.a aVar110 = eVar2.f12560a;
                        long jB19 = eVar2.B4();
                        this.f12599a = aVar;
                        this.f12602d = 4;
                        aVar110.getClass();
                        nVarB = dr2.a.b(jB19);
                        obj2 = nVarB.f140509l.get(eVar.getF206680a());
                        if (obj2 != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        fVar = this;
                        obj = ((ms2.c) obj2).d(nVarB.f140498a.getUnitId(), eVar, aVar, fVar);
                        if (obj == aVar4) {
                            aVar2 = aVar;
                            if (((Boolean) obj).booleanValue()) {
                                if (aVar2.f127815a.size() == 1) {
                                    c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                    fVar.f12599a = null;
                                    fVar.f12602d = 11;
                                    if (eVar2.y4(c0179b, this) != aVar4) {
                                        ar2.a.b.h hVar110 = new ar2.a.b.h(false);
                                        fVar.f12599a = null;
                                        fVar.f12600b = null;
                                        fVar.f12602d = 12;
                                    }
                                } else {
                                    c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                    fVar.f12599a = null;
                                    fVar.f12602d = 11;
                                    if (eVar2.y4(c0179b, this) != aVar4) {
                                        ar2.a.b.h hVar111 = new ar2.a.b.h(false);
                                        fVar.f12599a = null;
                                        fVar.f12600b = null;
                                        fVar.f12602d = 12;
                                    }
                                }
                                break;
                            } else {
                                cVar2 = new ar2.a.b.c(eVar.getF206682c(), eVar2.A4());
                                fVar.f12599a = null;
                                fVar.f12602d = 5;
                                if (eVar2.x4(cVar2, this) != aVar4) {
                                    unit = Unit.INSTANCE;
                                    hVar2 = new ar2.a.b.h(false);
                                    fVar.f12599a = null;
                                    fVar.f12600b = unit;
                                    fVar.f12602d = 6;
                                    if (eVar2.x4(hVar2, this) != aVar4) {
                                        return unit;
                                    }
                                }
                            }
                        }
                        return aVar4;
                    case 4:
                        aVar2 = (ns2.a) this.f12599a;
                        r.b(obj);
                        fVar = this;
                        if (((Boolean) obj).booleanValue()) {
                            if (aVar2.f127815a.size() == 1) {
                                c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                fVar.f12599a = null;
                                fVar.f12602d = 11;
                                if (eVar2.y4(c0179b, this) != aVar4) {
                                    ar2.a.b.h hVar112 = new ar2.a.b.h(false);
                                    fVar.f12599a = null;
                                    fVar.f12600b = null;
                                    fVar.f12602d = 12;
                                }
                            } else {
                                c0179b = new e.b.C0179b(aVar2, eVar2.B4(), eVar2.A4());
                                fVar.f12599a = null;
                                fVar.f12602d = 11;
                                if (eVar2.y4(c0179b, this) != aVar4) {
                                    ar2.a.b.h hVar113 = new ar2.a.b.h(false);
                                    fVar.f12599a = null;
                                    fVar.f12600b = null;
                                    fVar.f12602d = 12;
                                }
                            }
                            break;
                        } else {
                            cVar2 = new ar2.a.b.c(eVar.getF206682c(), eVar2.A4());
                            fVar.f12599a = null;
                            fVar.f12602d = 5;
                            if (eVar2.x4(cVar2, this) != aVar4) {
                                unit = Unit.INSTANCE;
                                hVar2 = new ar2.a.b.h(false);
                                fVar.f12599a = null;
                                fVar.f12600b = unit;
                                fVar.f12602d = 6;
                                if (eVar2.x4(hVar2, this) != aVar4) {
                                    return unit;
                                }
                            }
                        }
                        return aVar4;
                    case 5:
                        r.b(obj);
                        fVar = this;
                        unit = Unit.INSTANCE;
                        hVar2 = new ar2.a.b.h(false);
                        fVar.f12599a = null;
                        fVar.f12600b = unit;
                        fVar.f12602d = 6;
                        if (eVar2.x4(hVar2, this) != aVar4) {
                            return aVar4;
                        }
                        return unit;
                    case 6:
                        unit2 = (Unit) this.f12600b;
                        r.b(obj);
                        return unit2;
                    case 7:
                        fVar2 = (ms2.f) this.f12600b;
                        r.b(obj);
                        fVar = this;
                        interfaceC1294a = (dr2.a.InterfaceC1294a) obj;
                        if (interfaceC1294a != null) {
                            aVar3 = new e.b.a(fVar2, eVar2.B4());
                            fVar.f12599a = null;
                            fVar.f12600b = null;
                            fVar.f12602d = 10;
                            if (eVar2.y4(aVar3, this) == aVar4) {
                                ar2.a.b.h hVar114 = new ar2.a.b.h(false);
                                fVar.f12599a = null;
                                fVar.f12600b = null;
                                fVar.f12602d = 12;
                                break;
                            }
                        } else {
                            bVarA = com.garmin.feature.garminpay.ui.addcard.c.a(interfaceC1294a, new a(eVar2));
                            fVar.f12599a = null;
                            fVar.f12600b = null;
                            fVar.f12602d = 8;
                            if (eVar2.x4(bVarA, this) == aVar4) {
                                unit3 = Unit.INSTANCE;
                                hVar3 = new ar2.a.b.h(false);
                                fVar.f12599a = null;
                                fVar.f12600b = null;
                                fVar.f12601c = unit3;
                                fVar.f12602d = 9;
                                if (eVar2.x4(hVar3, this) == aVar4) {
                                    return unit3;
                                }
                            }
                        }
                        return aVar4;
                    case 8:
                        r.b(obj);
                        fVar = this;
                        unit3 = Unit.INSTANCE;
                        hVar3 = new ar2.a.b.h(false);
                        fVar.f12599a = null;
                        fVar.f12600b = null;
                        fVar.f12601c = unit3;
                        fVar.f12602d = 9;
                        if (eVar2.x4(hVar3, this) == aVar4) {
                            return aVar4;
                        }
                        return unit3;
                    case 9:
                        unit2 = this.f12601c;
                        r.b(obj);
                        return unit2;
                    case 10:
                        r.b(obj);
                        fVar = this;
                        ar2.a.b.h hVar115 = new ar2.a.b.h(false);
                        fVar.f12599a = null;
                        fVar.f12600b = null;
                        fVar.f12602d = 12;
                        break;
                    case 11:
                        r.b(obj);
                        fVar = this;
                        ar2.a.b.h hVar116 = new ar2.a.b.h(false);
                        fVar.f12599a = null;
                        fVar.f12600b = null;
                        fVar.f12602d = 12;
                        break;
                    case 12:
                    case 14:
                        r.b(obj);
                        return Unit.INSTANCE;
                    case 13:
                        try {
                            r.b(obj);
                            this = this;
                            ar2.a.b.h hVar117 = new ar2.a.b.h(false);
                            this.f12599a = null;
                            this.f12602d = 14;
                        } catch (Throwable th7) {
                            th = th7;
                            this = this;
                            hVar = new ar2.a.b.h(false);
                            this.f12599a = th;
                            this.f12600b = null;
                            this.f12602d = 15;
                            if (eVar2.x4(hVar, this) == aVar4) {
                                throw th;
                            }
                        }
                        break;
                    case 15:
                        Throwable th8 = (Throwable) this.f12599a;
                        r.b(obj);
                        throw th8;
                    default:
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th3 = th10;
            e.f12589h.f12592a.a().warn("[onOperatorClicked]", th3);
            c0176b = ar2.a.b.C0176b.f12566a;
            this.f12599a = null;
            this.f12600b = null;
            this.f12602d = 13;
            if (eVar2.x4(c0176b, this) != aVar4) {
            }
            return aVar4;
        }
    }
}

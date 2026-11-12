package ug1;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import r53.p2;
import rd2.j;
import sg1.g;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.backup.vm.DeviceBackupViewModel$getBackupsForDevice$1", f = "DeviceBackupViewModel.kt", l = {44, 45, 47, 50, 52, 53}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f170667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2.b f170668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f170669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f170670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f170671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f170672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l22.b f170673g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j8, c cVar, l22.b bVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f170671e = j8;
        this.f170672f = cVar;
        this.f170673g = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f170671e, this.f170672f, this.f170673g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x0115  */
    /* JADX WARN: Code duplicated, block: B:50:0x0136  */
    /* JADX WARN: Code duplicated, block: B:53:0x0150  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0133, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0168, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.garmin.android.apps.connectmobile.v2$b, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String productDisplayName;
        String str;
        long j8;
        Object objF;
        String str2;
        v2 v2Var;
        long j14;
        ArrayList arrayListD1;
        Iterator it;
        boolean zHasNext;
        long j15;
        long j16;
        Object next;
        qg1.b bVar;
        String str3;
        v2 v2Var2;
        long j17;
        Long deviceId;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170670d;
        long j18 = this.f170671e;
        c cVar = this.f170672f;
        ?? r14 = 0;
        switch (i14) {
            case 0:
                r.b(obj);
                rd2.f.a().f152045a.getClass();
                sd2.f fVarI = j.i(j18, null);
                if (fVarI == null || (productDisplayName = fVarI.getProductDisplayName()) == null) {
                    productDisplayName = "";
                }
                long unitID = fVarI != null ? fVarI.getUnitID() : -1L;
                p2 p2Var = cVar.f170646c;
                sg1.d dVar = new sg1.d(true, false, j0.f134944a, productDisplayName);
                this.f170667a = productDisplayName;
                this.f170669c = unitID;
                this.f170670d = 1;
                p2Var.k(null, dVar);
                if (Unit.INSTANCE != aVar) {
                    str = productDisplayName;
                    j8 = unitID;
                    rg1.a aVar2 = cVar.f170644a;
                    this.f170667a = str;
                    this.f170669c = j8;
                    this.f170670d = 2;
                    objF = aVar2.f(j18, this);
                    if (objF != aVar) {
                        str2 = str;
                        v2Var = (v2) objF;
                        if (v2Var instanceof v2.b) {
                            p2 p2Var2 = cVar.f170646c;
                            sg1.d dVar2 = new sg1.d(false, true, j0.f134944a, str2);
                            this.f170667a = str2;
                            this.f170668b = null;
                            this.f170669c = j8;
                            this.f170670d = 5;
                            p2Var2.k(null, dVar2);
                            if (Unit.INSTANCE != aVar) {
                                j14 = j8;
                                p2 p2Var3 = cVar.f170654k;
                                a aVar3 = new a(j0.f134944a, str2, j14);
                                this.f170667a = null;
                                this.f170668b = null;
                                this.f170669c = j14;
                                this.f170670d = 6;
                                p2Var3.k(null, aVar3);
                            }
                        } else {
                            p2 p2Var4 = cVar.f170646c;
                            g gVar = g.f159217a;
                            v2.b bVar2 = (v2.b) v2Var;
                            List list = (List) bVar2.f47386a;
                            gVar.getClass();
                            l22.b bVar3 = this.f170673g;
                            bVar3.getClass();
                            list.getClass();
                            str2.getClass();
                            arrayListD1 = h0.d1(h0.N0(list, new sg1.e()));
                            it = arrayListD1.iterator();
                            while (true) {
                                zHasNext = it.hasNext();
                                j15 = j8;
                                j16 = this.f170671e;
                                if (zHasNext) {
                                    next = it.next();
                                    deviceId = ((qg1.b) next).getDeviceId();
                                    if (deviceId != null || deviceId.longValue() != j16) {
                                        j8 = j15;
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            bVar = (qg1.b) next;
                            if (bVar != null) {
                                arrayListD1.remove(bVar);
                                arrayListD1.add(0, bVar);
                            }
                            sg1.d dVar3 = new sg1.d(false, false, g.a(bVar3, arrayListD1, j16, true, false), str2);
                            this.f170667a = str2;
                            this.f170668b = bVar2;
                            this.f170669c = j15;
                            this.f170670d = 3;
                            r14 = 0;
                            p2Var4.k(null, dVar3);
                            if (Unit.INSTANCE != aVar) {
                                str3 = str2;
                                v2Var2 = v2Var;
                                j17 = j15;
                                p2 p2Var5 = cVar.f170654k;
                                a aVar4 = new a((List) ((v2.b) v2Var2).f47386a, str3, j17);
                                this.f170667a = r14;
                                this.f170668b = r14;
                                this.f170669c = j17;
                                this.f170670d = 4;
                                p2Var5.k(r14, aVar4);
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                j8 = this.f170669c;
                str = this.f170667a;
                r.b(obj);
                rg1.a aVar5 = cVar.f170644a;
                this.f170667a = str;
                this.f170669c = j8;
                this.f170670d = 2;
                objF = aVar5.f(j18, this);
                if (objF != aVar) {
                    str2 = str;
                    v2Var = (v2) objF;
                    if (v2Var instanceof v2.b) {
                        p2 p2Var6 = cVar.f170646c;
                        sg1.d dVar4 = new sg1.d(false, true, j0.f134944a, str2);
                        this.f170667a = str2;
                        this.f170668b = null;
                        this.f170669c = j8;
                        this.f170670d = 5;
                        p2Var6.k(null, dVar4);
                        if (Unit.INSTANCE != aVar) {
                            j14 = j8;
                            p2 p2Var7 = cVar.f170654k;
                            a aVar6 = new a(j0.f134944a, str2, j14);
                            this.f170667a = null;
                            this.f170668b = null;
                            this.f170669c = j14;
                            this.f170670d = 6;
                            p2Var7.k(null, aVar6);
                        }
                    } else {
                        p2 p2Var8 = cVar.f170646c;
                        g gVar2 = g.f159217a;
                        v2.b bVar4 = (v2.b) v2Var;
                        List list2 = (List) bVar4.f47386a;
                        gVar2.getClass();
                        l22.b bVar5 = this.f170673g;
                        bVar5.getClass();
                        list2.getClass();
                        str2.getClass();
                        arrayListD1 = h0.d1(h0.N0(list2, new sg1.e()));
                        it = arrayListD1.iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            j15 = j8;
                            j16 = this.f170671e;
                            if (zHasNext) {
                                next = it.next();
                                deviceId = ((qg1.b) next).getDeviceId();
                                if (deviceId != null) {
                                }
                                j8 = j15;
                            } else {
                                next = null;
                            }
                        }
                        bVar = (qg1.b) next;
                        if (bVar != null) {
                            arrayListD1.remove(bVar);
                            arrayListD1.add(0, bVar);
                        }
                        sg1.d dVar5 = new sg1.d(false, false, g.a(bVar5, arrayListD1, j16, true, false), str2);
                        this.f170667a = str2;
                        this.f170668b = bVar4;
                        this.f170669c = j15;
                        this.f170670d = 3;
                        r14 = 0;
                        p2Var8.k(null, dVar5);
                        if (Unit.INSTANCE != aVar) {
                            str3 = str2;
                            v2Var2 = v2Var;
                            j17 = j15;
                            p2 p2Var9 = cVar.f170654k;
                            a aVar7 = new a((List) ((v2.b) v2Var2).f47386a, str3, j17);
                            this.f170667a = r14;
                            this.f170668b = r14;
                            this.f170669c = j17;
                            this.f170670d = 4;
                            p2Var9.k(r14, aVar7);
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                long j19 = this.f170669c;
                str2 = this.f170667a;
                r.b(obj);
                j8 = j19;
                objF = obj;
                v2Var = (v2) objF;
                if (v2Var instanceof v2.b) {
                    p2 p2Var10 = cVar.f170646c;
                    g gVar3 = g.f159217a;
                    v2.b bVar6 = (v2.b) v2Var;
                    List list3 = (List) bVar6.f47386a;
                    gVar3.getClass();
                    l22.b bVar7 = this.f170673g;
                    bVar7.getClass();
                    list3.getClass();
                    str2.getClass();
                    arrayListD1 = h0.d1(h0.N0(list3, new sg1.e()));
                    it = arrayListD1.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        j15 = j8;
                        j16 = this.f170671e;
                        if (zHasNext) {
                            next = it.next();
                            deviceId = ((qg1.b) next).getDeviceId();
                            if (deviceId != null) {
                            }
                            j8 = j15;
                        } else {
                            next = null;
                        }
                    }
                    bVar = (qg1.b) next;
                    if (bVar != null) {
                        arrayListD1.remove(bVar);
                        arrayListD1.add(0, bVar);
                    }
                    sg1.d dVar6 = new sg1.d(false, false, g.a(bVar7, arrayListD1, j16, true, false), str2);
                    this.f170667a = str2;
                    this.f170668b = bVar6;
                    this.f170669c = j15;
                    this.f170670d = 3;
                    r14 = 0;
                    p2Var10.k(null, dVar6);
                    if (Unit.INSTANCE != aVar) {
                        str3 = str2;
                        v2Var2 = v2Var;
                        j17 = j15;
                        p2 p2Var11 = cVar.f170654k;
                        a aVar8 = new a((List) ((v2.b) v2Var2).f47386a, str3, j17);
                        this.f170667a = r14;
                        this.f170668b = r14;
                        this.f170669c = j17;
                        this.f170670d = 4;
                        p2Var11.k(r14, aVar8);
                    }
                    break;
                } else {
                    p2 p2Var12 = cVar.f170646c;
                    sg1.d dVar7 = new sg1.d(false, true, j0.f134944a, str2);
                    this.f170667a = str2;
                    this.f170668b = null;
                    this.f170669c = j8;
                    this.f170670d = 5;
                    p2Var12.k(null, dVar7);
                    if (Unit.INSTANCE != aVar) {
                        j14 = j8;
                        p2 p2Var13 = cVar.f170654k;
                        a aVar9 = new a(j0.f134944a, str2, j14);
                        this.f170667a = null;
                        this.f170668b = null;
                        this.f170669c = j14;
                        this.f170670d = 6;
                        p2Var13.k(null, aVar9);
                    }
                    break;
                }
                return aVar;
            case 3:
                j17 = this.f170669c;
                v2Var2 = this.f170668b;
                str3 = this.f170667a;
                r.b(obj);
                p2 p2Var14 = cVar.f170654k;
                a aVar10 = new a((List) ((v2.b) v2Var2).f47386a, str3, j17);
                this.f170667a = r14;
                this.f170668b = r14;
                this.f170669c = j17;
                this.f170670d = 4;
                p2Var14.k(r14, aVar10);
                break;
            case 4:
            case 6:
                r.b(obj);
                return Unit.INSTANCE;
            case 5:
                j14 = this.f170669c;
                str2 = this.f170667a;
                r.b(obj);
                p2 p2Var15 = cVar.f170654k;
                a aVar11 = new a(j0.f134944a, str2, j14);
                this.f170667a = null;
                this.f170668b = null;
                this.f170669c = j14;
                this.f170670d = 6;
                p2Var15.k(null, aVar11);
                break;
            default:
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

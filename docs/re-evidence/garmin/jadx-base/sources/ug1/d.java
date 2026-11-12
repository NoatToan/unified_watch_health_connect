package ug1;

import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import java.util.ArrayList;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.p2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.backup.vm.DeviceBackupViewModel$deleteBackup$1", f = "DeviceBackupViewModel.kt", l = {126, 127, 128, 130, 132, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f170658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sg1.d f170659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f170660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, sg1.d dVar, long j8, t13.d<? super d> dVar2) {
        super(2, dVar2);
        this.f170658b = cVar;
        this.f170659c = dVar;
        this.f170660d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f170658b, this.f170659c, this.f170660d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a A[PHI: r13
      0x006a: PHI (r13v7 java.lang.Object) = (r13v6 java.lang.Object), (r13v0 java.lang.Object) binds: [B:19:0x0066, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L41;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170657a;
        long j8 = this.f170660d;
        sg1.d dVar = this.f170659c;
        c cVar = this.f170658b;
        switch (i14) {
            case 0:
                r.b(obj);
                p2 p2Var = cVar.f170652i;
                sg1.a aVar2 = new sg1.a(true, false, false);
                this.f170657a = 1;
                p2Var.k(null, aVar2);
                if (Unit.INSTANCE != aVar) {
                    p2 p2Var2 = cVar.f170648e;
                    sg1.d dVar2 = new sg1.d(true, false, dVar.f159213c, "");
                    this.f170657a = 2;
                    p2Var2.k(null, dVar2);
                    if (Unit.INSTANCE != aVar) {
                        rg1.a aVar3 = cVar.f170644a;
                        this.f170657a = 3;
                        obj = aVar3.a(j8, this);
                        if (obj != aVar) {
                            if (!(((v2) obj) instanceof v2.b)) {
                                p2 p2Var3 = cVar.f170652i;
                                sg1.a aVar4 = new sg1.a(false, false, true);
                                this.f170657a = 4;
                                p2Var3.k(null, aVar4);
                                if (Unit.INSTANCE != aVar) {
                                    ArrayList arrayListD1 = h0.d1(dVar.f159213c);
                                    arrayList = new ArrayList();
                                    for (Object obj2 : arrayListD1) {
                                        if (((sg1.c) obj2).f159206d != j8) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    p2 p2Var4 = cVar.f170648e;
                                    sg1.d dVar3 = new sg1.d(false, false, arrayList, "");
                                    this.f170657a = 5;
                                    p2Var4.k(null, dVar3);
                                }
                            } else {
                                p2 p2Var5 = cVar.f170652i;
                                sg1.a aVar5 = new sg1.a(false, true, false);
                                this.f170657a = 6;
                                p2Var5.k(null, aVar5);
                                if (Unit.INSTANCE != aVar) {
                                    p2 p2Var6 = cVar.f170648e;
                                    sg1.d dVar4 = new sg1.d(false, true, dVar.f159213c, "");
                                    this.f170657a = 7;
                                    p2Var6.k(null, dVar4);
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                r.b(obj);
                p2 p2Var7 = cVar.f170648e;
                sg1.d dVar5 = new sg1.d(true, false, dVar.f159213c, "");
                this.f170657a = 2;
                p2Var7.k(null, dVar5);
                if (Unit.INSTANCE != aVar) {
                    rg1.a aVar6 = cVar.f170644a;
                    this.f170657a = 3;
                    obj = aVar6.a(j8, this);
                    if (obj != aVar) {
                        if (!(((v2) obj) instanceof v2.b)) {
                            p2 p2Var8 = cVar.f170652i;
                            sg1.a aVar7 = new sg1.a(false, false, true);
                            this.f170657a = 4;
                            p2Var8.k(null, aVar7);
                            if (Unit.INSTANCE != aVar) {
                                ArrayList arrayListD2 = h0.d1(dVar.f159213c);
                                arrayList = new ArrayList();
                                while (r13.hasNext()) {
                                    if (((sg1.c) obj2).f159206d != j8) {
                                        arrayList.add(obj2);
                                    }
                                }
                                p2 p2Var9 = cVar.f170648e;
                                sg1.d dVar6 = new sg1.d(false, false, arrayList, "");
                                this.f170657a = 5;
                                p2Var9.k(null, dVar6);
                            }
                        } else {
                            p2 p2Var10 = cVar.f170652i;
                            sg1.a aVar8 = new sg1.a(false, true, false);
                            this.f170657a = 6;
                            p2Var10.k(null, aVar8);
                            if (Unit.INSTANCE != aVar) {
                                p2 p2Var11 = cVar.f170648e;
                                sg1.d dVar7 = new sg1.d(false, true, dVar.f159213c, "");
                                this.f170657a = 7;
                                p2Var11.k(null, dVar7);
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                r.b(obj);
                rg1.a aVar9 = cVar.f170644a;
                this.f170657a = 3;
                obj = aVar9.a(j8, this);
                if (obj != aVar) {
                    if (!(((v2) obj) instanceof v2.b)) {
                        p2 p2Var12 = cVar.f170652i;
                        sg1.a aVar10 = new sg1.a(false, false, true);
                        this.f170657a = 4;
                        p2Var12.k(null, aVar10);
                        if (Unit.INSTANCE != aVar) {
                            ArrayList arrayListD3 = h0.d1(dVar.f159213c);
                            arrayList = new ArrayList();
                            while (r13.hasNext()) {
                                if (((sg1.c) obj2).f159206d != j8) {
                                    arrayList.add(obj2);
                                }
                            }
                            p2 p2Var13 = cVar.f170648e;
                            sg1.d dVar8 = new sg1.d(false, false, arrayList, "");
                            this.f170657a = 5;
                            p2Var13.k(null, dVar8);
                        }
                    } else {
                        p2 p2Var14 = cVar.f170652i;
                        sg1.a aVar11 = new sg1.a(false, true, false);
                        this.f170657a = 6;
                        p2Var14.k(null, aVar11);
                        if (Unit.INSTANCE != aVar) {
                            p2 p2Var15 = cVar.f170648e;
                            sg1.d dVar9 = new sg1.d(false, true, dVar.f159213c, "");
                            this.f170657a = 7;
                            p2Var15.k(null, dVar9);
                        }
                    }
                    break;
                }
                return aVar;
            case 3:
                r.b(obj);
                if (!(((v2) obj) instanceof v2.b)) {
                    p2 p2Var16 = cVar.f170652i;
                    sg1.a aVar12 = new sg1.a(false, true, false);
                    this.f170657a = 6;
                    p2Var16.k(null, aVar12);
                    if (Unit.INSTANCE != aVar) {
                        p2 p2Var17 = cVar.f170648e;
                        sg1.d dVar10 = new sg1.d(false, true, dVar.f159213c, "");
                        this.f170657a = 7;
                        p2Var17.k(null, dVar10);
                    }
                    break;
                } else {
                    p2 p2Var18 = cVar.f170652i;
                    sg1.a aVar13 = new sg1.a(false, false, true);
                    this.f170657a = 4;
                    p2Var18.k(null, aVar13);
                    if (Unit.INSTANCE != aVar) {
                        ArrayList arrayListD4 = h0.d1(dVar.f159213c);
                        arrayList = new ArrayList();
                        while (r13.hasNext()) {
                            if (((sg1.c) obj2).f159206d != j8) {
                                arrayList.add(obj2);
                            }
                        }
                        p2 p2Var19 = cVar.f170648e;
                        sg1.d dVar11 = new sg1.d(false, false, arrayList, "");
                        this.f170657a = 5;
                        p2Var19.k(null, dVar11);
                    }
                    break;
                }
                return aVar;
            case 4:
                r.b(obj);
                ArrayList arrayListD5 = h0.d1(dVar.f159213c);
                arrayList = new ArrayList();
                while (r13.hasNext()) {
                    if (((sg1.c) obj2).f159206d != j8) {
                        arrayList.add(obj2);
                    }
                }
                p2 p2Var110 = cVar.f170648e;
                sg1.d dVar12 = new sg1.d(false, false, arrayList, "");
                this.f170657a = 5;
                p2Var110.k(null, dVar12);
                break;
            case 5:
            case 7:
                r.b(obj);
                return Unit.INSTANCE;
            case 6:
                r.b(obj);
                p2 p2Var111 = cVar.f170648e;
                sg1.d dVar13 = new sg1.d(false, true, dVar.f159213c, "");
                this.f170657a = 7;
                p2Var111.k(null, dVar13);
                break;
            default:
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

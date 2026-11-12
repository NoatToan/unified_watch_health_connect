package ug1;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import rd2.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.backup.vm.DeviceBackupViewModel$applyBackup$1", f = "DeviceBackupViewModel.kt", l = {97, 98, 100, 108, 109, 111}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f170640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f170641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f170642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f170643e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, long j8, long j14, String str, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f170640b = cVar;
        this.f170641c = j8;
        this.f170642d = j14;
        this.f170643e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f170640b, this.f170641c, this.f170642d, this.f170643e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[PHI: r11 r13
      0x0055: PHI (r11v2 ug1.b) = (r11v1 ug1.b), (r11v3 ug1.b) binds: [B:15:0x0051, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r13v5 java.lang.Object) = (r13v4 java.lang.Object), (r13v0 java.lang.Object) binds: [B:15:0x0051, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:22:0x006d A[PHI: r11
      0x006d: PHI (r11v4 ug1.b) = (r11v2 ug1.b), (r11v5 ug1.b) binds: [B:20:0x006a, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab A[PHI: r11
      0x00ab: PHI (r11v6 ug1.b) = (r11v4 ug1.b), (r11v7 ug1.b) binds: [B:28:0x00a8, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L35;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        sd2.f fVarI;
        String productDisplayName;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170639a;
        c cVar = this.f170640b;
        switch (i14) {
            case 0:
                r.b(obj);
                p2 p2Var = cVar.f170650g;
                sg1.a aVar2 = new sg1.a(true, false, false);
                this.f170639a = 1;
                p2Var.k(null, aVar2);
                if (Unit.INSTANCE != aVar) {
                    rg1.a aVar3 = cVar.f170644a;
                    this.f170639a = 2;
                    bVar = this;
                    obj = aVar3.c(this.f170641c, this.f170642d, bVar);
                    if (obj != aVar) {
                        if (((v2) obj) instanceof v2.b) {
                            p2 p2Var2 = cVar.f170650g;
                            sg1.a aVar4 = new sg1.a(false, true, false);
                            bVar.f170639a = 6;
                            p2Var2.k(null, aVar4);
                        } else {
                            p2 p2Var3 = cVar.f170650g;
                            sg1.a aVar5 = new sg1.a(false, false, true);
                            bVar.f170639a = 3;
                            p2Var3.k(null, aVar5);
                            if (Unit.INSTANCE != aVar) {
                                rd2.f.a().f152045a.getClass();
                                fVarI = j.i(bVar.f170641c, null);
                                if (fVarI != null || (productDisplayName = fVarI.getProductDisplayName()) == null) {
                                    productDisplayName = "";
                                }
                                ht.a aVar6 = ht.a.f85464a;
                                Bundle bundleA = h7.c.a(new o13.p("deviceName", productDisplayName));
                                aVar6.getClass();
                                ht.a.a(bundleA, bVar.f170643e);
                                bVar.f170639a = 4;
                                if (m0.b(3000L, this) != aVar) {
                                    p2 p2Var4 = cVar.f170650g;
                                    sg1.a aVar7 = new sg1.a(false, false, false);
                                    bVar.f170639a = 5;
                                    p2Var4.k(null, aVar7);
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                r.b(obj);
                rg1.a aVar8 = cVar.f170644a;
                this.f170639a = 2;
                bVar = this;
                obj = aVar8.c(this.f170641c, this.f170642d, bVar);
                if (obj != aVar) {
                    if (((v2) obj) instanceof v2.b) {
                        p2 p2Var5 = cVar.f170650g;
                        sg1.a aVar9 = new sg1.a(false, true, false);
                        bVar.f170639a = 6;
                        p2Var5.k(null, aVar9);
                    } else {
                        p2 p2Var6 = cVar.f170650g;
                        sg1.a aVar10 = new sg1.a(false, false, true);
                        bVar.f170639a = 3;
                        p2Var6.k(null, aVar10);
                        if (Unit.INSTANCE != aVar) {
                            rd2.f.a().f152045a.getClass();
                            fVarI = j.i(bVar.f170641c, null);
                            if (fVarI != null) {
                                productDisplayName = "";
                            } else {
                                productDisplayName = "";
                            }
                            ht.a aVar11 = ht.a.f85464a;
                            Bundle bundleA2 = h7.c.a(new o13.p("deviceName", productDisplayName));
                            aVar11.getClass();
                            ht.a.a(bundleA2, bVar.f170643e);
                            bVar.f170639a = 4;
                            if (m0.b(3000L, this) != aVar) {
                                p2 p2Var7 = cVar.f170650g;
                                sg1.a aVar12 = new sg1.a(false, false, false);
                                bVar.f170639a = 5;
                                p2Var7.k(null, aVar12);
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                r.b(obj);
                bVar = this;
                if (((v2) obj) instanceof v2.b) {
                    p2 p2Var8 = cVar.f170650g;
                    sg1.a aVar13 = new sg1.a(false, false, true);
                    bVar.f170639a = 3;
                    p2Var8.k(null, aVar13);
                    if (Unit.INSTANCE != aVar) {
                        rd2.f.a().f152045a.getClass();
                        fVarI = j.i(bVar.f170641c, null);
                        if (fVarI != null) {
                            productDisplayName = "";
                        } else {
                            productDisplayName = "";
                        }
                        ht.a aVar14 = ht.a.f85464a;
                        Bundle bundleA3 = h7.c.a(new o13.p("deviceName", productDisplayName));
                        aVar14.getClass();
                        ht.a.a(bundleA3, bVar.f170643e);
                        bVar.f170639a = 4;
                        if (m0.b(3000L, this) != aVar) {
                            p2 p2Var9 = cVar.f170650g;
                            sg1.a aVar15 = new sg1.a(false, false, false);
                            bVar.f170639a = 5;
                            p2Var9.k(null, aVar15);
                        }
                    }
                    break;
                } else {
                    p2 p2Var10 = cVar.f170650g;
                    sg1.a aVar16 = new sg1.a(false, true, false);
                    bVar.f170639a = 6;
                    p2Var10.k(null, aVar16);
                    break;
                }
                return aVar;
            case 3:
                r.b(obj);
                bVar = this;
                rd2.f.a().f152045a.getClass();
                fVarI = j.i(bVar.f170641c, null);
                if (fVarI != null) {
                    productDisplayName = "";
                } else {
                    productDisplayName = "";
                }
                ht.a aVar17 = ht.a.f85464a;
                Bundle bundleA4 = h7.c.a(new o13.p("deviceName", productDisplayName));
                aVar17.getClass();
                ht.a.a(bundleA4, bVar.f170643e);
                bVar.f170639a = 4;
                if (m0.b(3000L, this) != aVar) {
                    p2 p2Var11 = cVar.f170650g;
                    sg1.a aVar18 = new sg1.a(false, false, false);
                    bVar.f170639a = 5;
                    p2Var11.k(null, aVar18);
                    break;
                }
                return aVar;
            case 4:
                r.b(obj);
                bVar = this;
                p2 p2Var12 = cVar.f170650g;
                sg1.a aVar19 = new sg1.a(false, false, false);
                bVar.f170639a = 5;
                p2Var12.k(null, aVar19);
                break;
            case 5:
            case 6:
                r.b(obj);
                return Unit.INSTANCE;
            default:
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

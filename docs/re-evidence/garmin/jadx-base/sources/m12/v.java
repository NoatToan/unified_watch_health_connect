package m12;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lm12/v;", "", "Lk12/a;", "usersRepo", "Lm12/r;", "profileDelegate", "Lei0/d;", "followRepo", "<init>", "(Lk12/a;Lm12/r;Lei0/d;)V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k12.a f115901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f115902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ei0.d f115903c;

    static {
        new a(null);
    }

    public v(k12.a aVar, r rVar, ei0.d dVar) {
        aVar.getClass();
        rVar.getClass();
        dVar.getClass();
        this.f115901a = aVar;
        this.f115902b = rVar;
        this.f115903c = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0122  */
    /* JADX WARN: Code duplicated, block: B:57:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x0135  */
    /* JADX WARN: Code duplicated, block: B:60:0x0149  */
    /* JADX WARN: Code duplicated, block: B:64:0x0153  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ae  */
    public final Object a(u uVar, v13.c cVar) {
        w wVar;
        int i14;
        Object obj;
        int i15;
        nj1.e eVar;
        int i16;
        u uVar2;
        int i17;
        Boolean bool;
        Boolean bool2;
        int i18;
        v2 v2Var;
        u uVar3 = uVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i19 = wVar.f115909f;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                wVar.f115909f = i19 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object objT = wVar.f115907d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i24 = wVar.f115909f;
        int i25 = 0;
        int i26 = 1;
        if (i24 != 0) {
            if (i24 == 1) {
                int i27 = wVar.f115906c;
                int i28 = wVar.f115905b;
                u uVar4 = wVar.f115904a;
                o13.r.b(objT);
                i15 = i27;
                uVar3 = uVar4;
                i14 = i28;
                obj = objT;
            } else {
                if (i24 == 2) {
                    i17 = wVar.f115906c;
                    i16 = wVar.f115905b;
                    uVar2 = wVar.f115904a;
                    o13.r.b(objT);
                    v2Var = (v2) objT;
                    if (v2Var instanceof v2.b) {
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.b(a2Var, "SaveProfileChangesUseCase", "UPDATE User Privacies SUCCESS");
                        i26 = i17;
                        uVar3 = uVar2;
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        String strF = b71.i.f("UPDATE User Privacies -> server call failed ", v2Var);
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.f(a2Var2, "SaveProfileChangesUseCase", strF);
                        i26 = i17;
                        uVar3 = uVar2;
                        i16 = 0;
                    }
                    bool = uVar3.f115899g;
                    if (bool == null && (bool2 = uVar3.f115898f) != null && !bool2.equals(bool)) {
                        boolean zBooleanValue = uVar3.f115899g.booleanValue();
                        wVar.f115904a = null;
                        wVar.f115905b = i16;
                        wVar.f115906c = i26;
                        wVar.f115909f = 3;
                        objT = this.f115903c.z0(zBooleanValue, wVar);
                        if (objT != aVar) {
                            i18 = i16;
                        }
                        return aVar;
                    }
                    i25 = i16;
                    return i25 != 0 ? x.c.f115912a : x.a.f115910a;
                }
                if (i24 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i18 = wVar.f115905b;
                o13.r.b(objT);
            }
            v2 v2Var2 = (v2) objT;
            if (v2Var2 instanceof v2.b) {
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var3, "SaveProfileChangesUseCase", "UPDATE Require Review Follower Request SUCCESS");
                i25 = i18;
            } else {
                if (!(v2Var2 instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String strH = f3.h(((v2.a) v2Var2).f47383a, "UPDATE Follower Auto Approve -> server call failed with status=[", "]");
                i2.a aVar5 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var4, "SaveProfileChangesUseCase", strH);
            }
            if (i25 != 0) {
            }
        }
        o13.r.b(objT);
        com.garmin.android.apps.connectmobile.userprofile.model.r rVar = uVar3.f115894b;
        com.garmin.android.apps.connectmobile.userprofile.model.r rVar2 = uVar3.f115895c;
        if (p005kotlin.jvm.internal.s.g(rVar, rVar2) && p005kotlin.jvm.internal.s.g(uVar3.f115896d, uVar3.f115897e) && p005kotlin.jvm.internal.s.g(uVar3.f115898f, uVar3.f115899g)) {
            return x.b.f115911a;
        }
        if (rVar == null || rVar2 == null || rVar.equals(rVar2)) {
            i14 = 1;
            i26 = 0;
            eVar = uVar3.f115896d;
            nj1.e eVar2 = uVar3.f115897e;
            if (eVar != null || eVar2 == null || ((eVar.equals(eVar2) && i26 == 0) || uVar3.f115900h)) {
                i16 = i14;
                bool = uVar3.f115899g;
                if (bool == null) {
                }
                i25 = i16;
                if (i25 != 0) {
                }
            }
            wVar.f115904a = uVar3;
            wVar.f115905b = i14;
            wVar.f115906c = i26;
            wVar.f115909f = 2;
            objT = this.f115902b.t(eVar2, wVar);
            if (objT != aVar) {
                uVar2 = uVar3;
                i17 = i26;
                i16 = i14;
                v2Var = (v2) objT;
                if (v2Var instanceof v2.b) {
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.b(a2Var5, "SaveProfileChangesUseCase", "UPDATE User Privacies SUCCESS");
                    i26 = i17;
                    uVar3 = uVar2;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String strF2 = b71.i.f("UPDATE User Privacies -> server call failed ", v2Var);
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var6 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.f(a2Var6, "SaveProfileChangesUseCase", strF2);
                    i26 = i17;
                    uVar3 = uVar2;
                    i16 = 0;
                }
                bool = uVar3.f115899g;
                if (bool == null) {
                }
                i25 = i16;
                if (i25 != 0) {
                }
            }
        } else {
            com.garmin.android.apps.connectmobile.userprofile.model.r rVarB = com.garmin.android.apps.connectmobile.userprofile.model.r.b(uVar3.f115895c, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151);
            if (TextUtils.isEmpty(rVarB.getFullName())) {
                rVarB.A(rVar.getFullName());
            }
            String str = uVar3.f115893a;
            wVar.f115904a = uVar3;
            wVar.f115905b = 1;
            wVar.f115906c = 0;
            wVar.f115909f = 1;
            Object objD = this.f115901a.d(str, rVarB, wVar);
            if (objD != aVar) {
                obj = objD;
                i15 = 0;
                i14 = 1;
            }
        }
        return aVar;
        v2 v2Var3 = (v2) obj;
        if (v2Var3 instanceof v2.a) {
            String strH2 = f3.h(((v2.a) v2Var3).f47383a, "UPDATE User Info Privacies -> server call failed with status=[", "]");
            i2.a aVar8 = i2.f36769a;
            a2 a2Var7 = a2.GENERAL;
            aVar8.getClass();
            i2.a.f(a2Var7, "SaveProfileChangesUseCase", strH2);
            i26 = i15;
            i14 = 0;
        }
        eVar = uVar3.f115896d;
        nj1.e eVar3 = uVar3.f115897e;
        if (eVar != null) {
        }
        i16 = i14;
        bool = uVar3.f115899g;
        if (bool == null) {
        }
        i25 = i16;
        if (i25 != 0) {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm12/v$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

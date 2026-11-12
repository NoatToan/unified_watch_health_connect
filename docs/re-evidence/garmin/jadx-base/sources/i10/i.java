package i10;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.userprofile.model.k;
import com.garmin.android.apps.connectmobile.userprofile.model.l;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.List;
import java.util.Map;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.w;
import p13.x;
import ym0.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengeDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connections.groups.challenges.GroupChallengesViewModel$getGroupChallengeDetails$1", f = "GroupChallengesViewModel.kt", l = {44, 45, 46, 58, 64}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<t0<g3<? extends GroupChallengeDTO>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GroupChallengeDTO f87064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f87065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f87066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f87067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f87068e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, String str, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f87067d = hVar;
        this.f87068e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f87067d, this.f87068e, dVar);
        iVar.f87066c = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends GroupChallengeDTO>> t0Var, t13.d<? super Unit> dVar) {
        return ((i) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf A[PHI: r3 r4
      0x00cf: PHI (r3v13 com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO) = 
      (r3v10 com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO)
      (r3v16 com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO)
     binds: [B:37:0x00cc, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r4v4 java.lang.Object) = (r4v2 java.lang.Object), (r4v11 java.lang.Object) binds: [B:37:0x00cc, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (r1.emit(r3, r19) == r2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011e, code lost:
    
        if (r1.emit(r3, r19) == r2) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        v2 v2Var;
        GroupChallengeDTO groupChallengeDTO;
        GroupChallengePlayerDTO groupChallengePlayerDTO;
        List<Integer> listC;
        Object objX4;
        String str;
        GroupChallengePlayerDTO groupChallengePlayerDTO2;
        Integer num;
        l lVar;
        GroupChallengePlayerDTO groupChallengePlayerDTO3;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        String str2;
        String str3;
        t0 t0Var = (t0) this.f87066c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f87065b;
        h hVar = this.f87067d;
        if (i14 == 0) {
            r.b(obj);
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f87066c = t0Var;
            this.f87065b = 1;
            if (t0Var.emit(g3VarC, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 == 2) {
                r.b(obj);
                objJ = obj;
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.a) {
                    v2.a aVar2 = (v2.a) v2Var;
                    g3 g3VarA = g3.a.a(g3.f35298f, aVar2.f47383a.toString(), aVar2.f47383a, null, aVar2.f47384b, 4);
                    this.f87066c = null;
                    this.f87065b = 3;
                } else {
                    if (v2Var instanceof v2.b) {
                        u0.r();
                        return null;
                    }
                    groupChallengeDTO = (GroupChallengeDTO) ((v2.b) v2Var).f47386a;
                    groupChallengePlayerDTO = groupChallengeDTO.f31529r;
                    if (groupChallengePlayerDTO != null || (str = groupChallengePlayerDTO.f31537a) == null) {
                        listC = j0.f134944a;
                    } else {
                        listC = w.c(new Integer(Integer.parseInt(str)));
                    }
                    List<? extends k> listK = x.k(k.PREMIUM_FRIEND, k.PREMIUM_THUMBNAIL);
                    this.f87066c = t0Var;
                    this.f87064a = groupChallengeDTO;
                    this.f87065b = 4;
                    objX4 = hVar.f87057a.x4(listC, listK, this);
                    if (objX4 != aVar) {
                        Map map = (Map) objX4;
                        groupChallengePlayerDTO2 = groupChallengeDTO.f31529r;
                        if (groupChallengePlayerDTO2 != null) {
                            num = null;
                        } else {
                            num = null;
                        }
                        lVar = (l) map.get(num);
                        if (lVar != null) {
                            profileImageUrls = lVar.getProfileImageUrls();
                            if (profileImageUrls != null) {
                                str2 = profileImageUrls.f46879h;
                            } else {
                                str2 = null;
                            }
                            groupChallengePlayerDTO3.f31548l = new b12.b(str2, null, null, null, null, 30, null);
                        }
                        g3.f35298f.getClass();
                        g3 g3VarD = g3.a.d(groupChallengeDTO);
                        this.f87066c = null;
                        this.f87064a = null;
                        this.f87065b = 5;
                    }
                }
                return aVar;
            }
            if (i14 != 3) {
                if (i14 == 4) {
                    groupChallengeDTO = this.f87064a;
                    r.b(obj);
                    objX4 = obj;
                    Map map2 = (Map) objX4;
                    groupChallengePlayerDTO2 = groupChallengeDTO.f31529r;
                    if (groupChallengePlayerDTO2 != null || (str3 = groupChallengePlayerDTO2.f31537a) == null) {
                        num = null;
                    } else {
                        num = new Integer(Integer.parseInt(str3));
                    }
                    lVar = (l) map2.get(num);
                    if (lVar != null && (groupChallengePlayerDTO3 = groupChallengeDTO.f31529r) != null) {
                        profileImageUrls = lVar.getProfileImageUrls();
                        if (profileImageUrls != null) {
                            str2 = profileImageUrls.f46879h;
                        } else {
                            str2 = null;
                        }
                        groupChallengePlayerDTO3.f31548l = new b12.b(str2, null, null, null, null, 30, null);
                    }
                    g3.f35298f.getClass();
                    g3 g3VarD2 = g3.a.d(groupChallengeDTO);
                    this.f87066c = null;
                    this.f87064a = null;
                    this.f87065b = 5;
                } else if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        ym0.a aVar3 = hVar.f87058b;
        this.f87066c = t0Var;
        this.f87065b = 2;
        aVar3.getClass();
        objJ = f0.J(aVar3, new v(aVar3, this.f87068e, null), this);
        if (objJ != aVar) {
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.a) {
                v2.a aVar4 = (v2.a) v2Var;
                g3 g3VarA2 = g3.a.a(g3.f35298f, aVar4.f47383a.toString(), aVar4.f47383a, null, aVar4.f47384b, 4);
                this.f87066c = null;
                this.f87065b = 3;
            } else {
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                groupChallengeDTO = (GroupChallengeDTO) ((v2.b) v2Var).f47386a;
                groupChallengePlayerDTO = groupChallengeDTO.f31529r;
                if (groupChallengePlayerDTO != null) {
                    listC = j0.f134944a;
                } else {
                    listC = j0.f134944a;
                }
                List<? extends k> listK2 = x.k(k.PREMIUM_FRIEND, k.PREMIUM_THUMBNAIL);
                this.f87066c = t0Var;
                this.f87064a = groupChallengeDTO;
                this.f87065b = 4;
                objX4 = hVar.f87057a.x4(listC, listK2, this);
                if (objX4 != aVar) {
                    Map map3 = (Map) objX4;
                    groupChallengePlayerDTO2 = groupChallengeDTO.f31529r;
                    if (groupChallengePlayerDTO2 != null) {
                        num = null;
                    } else {
                        num = null;
                    }
                    lVar = (l) map3.get(num);
                    if (lVar != null) {
                        profileImageUrls = lVar.getProfileImageUrls();
                        if (profileImageUrls != null) {
                            str2 = profileImageUrls.f46879h;
                        } else {
                            str2 = null;
                        }
                        groupChallengePlayerDTO3.f31548l = new b12.b(str2, null, null, null, null, 30, null);
                    }
                    g3.f35298f.getClass();
                    g3 g3VarD3 = g3.a.d(groupChallengeDTO);
                    this.f87066c = null;
                    this.f87064a = null;
                    this.f87065b = 5;
                }
            }
        }
        return aVar;
    }
}

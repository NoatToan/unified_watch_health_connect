package vm0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.connections.model.ConnectionDTO;
import com.garmin.android.apps.connectmobile.connections.model.ConnectionSearchResultDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.details.InvalidGroupIdException;
import com.garmin.android.apps.connectmobile.group.details.invite.InvalidSearchKeywordException;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;
import p13.y;
import ym0.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "Lvm0/e;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.invite.GroupInviteViewModel$userSearchByKeyword$1", f = "GroupInviteViewModel.kt", l = {191, 196, 200, 201, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 219, 221}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<t0<g3<? extends List<? extends e>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f178809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f178810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f178811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f178812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f178813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f178814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(k kVar, int i14, int i15, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f178812d = kVar;
        this.f178813e = i14;
        this.f178814f = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f178812d, this.f178813e, this.f178814f, dVar);
        sVar.f178811c = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends List<? extends e>>> t0Var, t13.d<? super Unit> dVar) {
        return ((s) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:104:0x020d  */
    /* JADX WARN: Code duplicated, block: B:110:0x021a  */
    /* JADX WARN: Code duplicated, block: B:112:0x021e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0223  */
    /* JADX WARN: Code duplicated, block: B:120:0x025d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0261  */
    /* JADX WARN: Code duplicated, block: B:127:0x0285  */
    /* JADX WARN: Code duplicated, block: B:134:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x012a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x015b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x01c5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7 A[PHI: r3
      0x00a7: PHI (r3v11 java.lang.Object) = (r3v10 java.lang.Object), (r3v16 java.lang.Object) binds: [B:28:0x00a3, B:9:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce A[LOOP:5: B:33:0x00c8->B:35:0x00ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f7 A[PHI: r3 r8
      0x00f7: PHI (r3v17 java.lang.Object) = (r3v12 java.lang.Object), (r3v25 java.lang.Object) binds: [B:37:0x00f3, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r8v11 java.lang.Object) = (r8v10 java.lang.Object), (r8v13 java.lang.Object) binds: [B:37:0x00f3, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0119  */
    /* JADX WARN: Code duplicated, block: B:44:0x0126  */
    /* JADX WARN: Code duplicated, block: B:47:0x0130  */
    /* JADX WARN: Code duplicated, block: B:55:0x0152  */
    /* JADX WARN: Code duplicated, block: B:58:0x0157  */
    /* JADX WARN: Code duplicated, block: B:61:0x0161  */
    /* JADX WARN: Code duplicated, block: B:69:0x0183  */
    /* JADX WARN: Code duplicated, block: B:72:0x018f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0199  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f1  */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x025a, code lost:
    
        if (r1.emit(r3, r22) == r2) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x027f, code lost:
    
        if (r1.emit(r3, r22) == r2) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a2, code lost:
    
        if (r1.emit(r3, r22) == r2) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r1.emit(r3, r22) == r2) goto L130;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        Object obj2;
        ArrayList arrayList;
        Iterator<T> it;
        Object objA;
        Map map;
        ArrayList arrayList2;
        String str;
        ArrayList arrayList3;
        wm0.a aVar;
        ArrayList arrayList4;
        wm0.a aVar2;
        ArrayList arrayList5;
        com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar;
        wm0.a aVar3;
        ArrayList arrayList6;
        wm0.c cVar;
        com.garmin.android.apps.connectmobile.userprofile.model.j jVar;
        String str2;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        Iterator it3;
        Object next;
        Long requestorId;
        Iterator it4;
        Object next2;
        Iterator it5;
        Object next3;
        Long inviteeId;
        Iterator it6;
        Object next4;
        Long inviteeId2;
        t0 t0Var = (t0) this.f178811c;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f178810b;
        k kVar = this.f178812d;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                if (kVar.f178777d == -1) {
                    g3 g3VarA = g3.a.a(g3.f35298f, null, new InvalidGroupIdException(), null, null, 13);
                    this.f178811c = null;
                    this.f178810b = 1;
                    break;
                } else {
                    String str3 = kVar.f178776c;
                    if (str3 != null && str3.length() >= 2) {
                        g3 g3VarC = g3.a.c(g3.f35298f);
                        this.f178811c = t0Var;
                        this.f178810b = 3;
                        if (t0Var.emit(g3VarC, this) != aVar4) {
                            ym0.a aVar5 = kVar.f178775b;
                            String str4 = kVar.f178776c;
                            str4.getClass();
                            this.f178811c = t0Var;
                            this.f178810b = 4;
                            aVar5.getClass();
                            objJ = f0.J(aVar5, new v0(aVar5, str4, this.f178813e, this.f178814f, true, null), this);
                            if (objJ != aVar4) {
                                obj2 = (v2) objJ;
                                if (obj2 instanceof v2.b) {
                                    if (!(obj2 instanceof v2.a)) {
                                        u0.r();
                                        return null;
                                    }
                                    g3 g3VarA2 = g3.a.a(g3.f35298f, ((v2.a) obj2).f47383a.toString(), null, null, null, 14);
                                    this.f178811c = null;
                                    this.f178809a = null;
                                    this.f178810b = 7;
                                } else {
                                    v2.b bVar2 = (v2.b) obj2;
                                    List<ConnectionDTO> listC = ((ConnectionSearchResultDTO) bVar2.f47386a).C();
                                    listC.getClass();
                                    arrayList = new ArrayList(y.r(listC, 10));
                                    it = listC.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((ConnectionDTO) it.next()).f31654a);
                                    }
                                    a22.i iVar = (a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null);
                                    List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listC2 = w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
                                    this.f178811c = t0Var;
                                    this.f178809a = bVar2;
                                    this.f178810b = 5;
                                    objA = iVar.a(arrayList, listC2, this);
                                    if (objA != aVar4) {
                                        map = (Map) objA;
                                        List<ConnectionDTO> listC3 = ((ConnectionSearchResultDTO) ((v2.b) obj2).f47386a).C();
                                        listC3.getClass();
                                        arrayList2 = new ArrayList(y.r(listC3, 10));
                                        for (ConnectionDTO connectionDTO : listC3) {
                                            str = connectionDTO.f31654a;
                                            arrayList3 = kVar.f178779f;
                                            if (arrayList3 != null) {
                                                it6 = arrayList3.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next4 = it6.next();
                                                        str.getClass();
                                                        long j8 = Long.parseLong(str);
                                                        inviteeId2 = ((wm0.a) next4).getInviteeId();
                                                        if (inviteeId2 == null && j8 == inviteeId2.longValue()) {
                                                        }
                                                    } else {
                                                        next4 = null;
                                                    }
                                                }
                                                aVar = (wm0.a) next4;
                                            } else {
                                                aVar = null;
                                            }
                                            arrayList4 = kVar.f178781h;
                                            if (arrayList4 != null) {
                                                it5 = arrayList4.iterator();
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        next3 = it5.next();
                                                        str.getClass();
                                                        long j14 = Long.parseLong(str);
                                                        inviteeId = ((wm0.a) next3).getInviteeId();
                                                        if (inviteeId == null && j14 == inviteeId.longValue()) {
                                                        }
                                                    } else {
                                                        next3 = null;
                                                    }
                                                }
                                                aVar2 = (wm0.a) next3;
                                            } else {
                                                aVar2 = null;
                                            }
                                            Long l14 = new Long(kVar.f178777d);
                                            arrayList5 = kVar.f178778e;
                                            if (arrayList5 != null) {
                                                it4 = arrayList5.iterator();
                                                do {
                                                    if (it4.hasNext()) {
                                                        next2 = it4.next();
                                                    } else {
                                                        next2 = null;
                                                    }
                                                    bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) next2;
                                                } while (!p005kotlin.jvm.internal.s.g(str, ((com.garmin.android.apps.connectmobile.connections.groups.services.model.b) next2).getUserProfileId()));
                                                bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) next2;
                                            } else {
                                                bVar = null;
                                            }
                                            if (aVar2 == null) {
                                                aVar3 = aVar;
                                            } else {
                                                aVar3 = aVar2;
                                            }
                                            arrayList6 = kVar.f178780g;
                                            if (arrayList6 != null) {
                                                it3 = arrayList6.iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        next = it3.next();
                                                        str.getClass();
                                                        long j15 = Long.parseLong(str);
                                                        requestorId = ((wm0.c) next).getRequestorId();
                                                        if (requestorId == null && j15 == requestorId.longValue()) {
                                                        }
                                                    } else {
                                                        next = null;
                                                    }
                                                }
                                                cVar = (wm0.c) next;
                                            } else {
                                                cVar = null;
                                            }
                                            if (map != null) {
                                                String str5 = connectionDTO.f31654a;
                                                str5.getClass();
                                                lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(Integer.valueOf(Integer.parseInt(str5)));
                                                if (lVar != null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (str2 = profileImageUrls.f46879h) == null) {
                                                    jVar = connectionDTO.f31669p;
                                                    if (jVar != null || (str2 = jVar.f46879h) == null) {
                                                        str2 = connectionDTO.f31659f;
                                                    }
                                                }
                                            } else {
                                                jVar = connectionDTO.f31669p;
                                                if (jVar != null) {
                                                    str2 = connectionDTO.f31659f;
                                                } else {
                                                    str2 = connectionDTO.f31659f;
                                                }
                                            }
                                            String str6 = str2;
                                            String str7 = connectionDTO.f31656c;
                                            int i15 = connectionDTO.f31667n;
                                            String str8 = connectionDTO.f31657d;
                                            String str9 = connectionDTO.f31654a;
                                            str9.getClass();
                                            arrayList2.add(new e(str6, str7, i15, str8, connectionDTO, bVar, aVar3, cVar, l14, Long.valueOf(Long.parseLong(str9)), connectionDTO.f31655b));
                                        }
                                        g3.f35298f.getClass();
                                        g3 g3VarD = g3.a.d(arrayList2);
                                        this.f178811c = null;
                                        this.f178809a = null;
                                        this.f178810b = 6;
                                    }
                                }
                            }
                        }
                    } else {
                        g3 g3VarA3 = g3.a.a(g3.f35298f, null, new InvalidSearchKeywordException(2), null, null, 13);
                        this.f178811c = null;
                        this.f178810b = 2;
                    }
                    break;
                }
                return aVar4;
            case 1:
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 2:
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 3:
                o13.r.b(obj);
                ym0.a aVar6 = kVar.f178775b;
                String str10 = kVar.f178776c;
                str10.getClass();
                this.f178811c = t0Var;
                this.f178810b = 4;
                aVar6.getClass();
                objJ = f0.J(aVar6, new v0(aVar6, str10, this.f178813e, this.f178814f, true, null), this);
                if (objJ != aVar4) {
                    obj2 = (v2) objJ;
                    if (obj2 instanceof v2.b) {
                        if (!(obj2 instanceof v2.a)) {
                            u0.r();
                            return null;
                        }
                        g3 g3VarA4 = g3.a.a(g3.f35298f, ((v2.a) obj2).f47383a.toString(), null, null, null, 14);
                        this.f178811c = null;
                        this.f178809a = null;
                        this.f178810b = 7;
                    } else {
                        v2.b bVar3 = (v2.b) obj2;
                        List<ConnectionDTO> listC4 = ((ConnectionSearchResultDTO) bVar3.f47386a).C();
                        listC4.getClass();
                        arrayList = new ArrayList(y.r(listC4, 10));
                        it = listC4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ConnectionDTO) it.next()).f31654a);
                        }
                        a22.i iVar2 = (a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null);
                        List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listC5 = w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
                        this.f178811c = t0Var;
                        this.f178809a = bVar3;
                        this.f178810b = 5;
                        objA = iVar2.a(arrayList, listC5, this);
                        if (objA != aVar4) {
                            map = (Map) objA;
                            List<ConnectionDTO> listC6 = ((ConnectionSearchResultDTO) ((v2.b) obj2).f47386a).C();
                            listC6.getClass();
                            arrayList2 = new ArrayList(y.r(listC6, 10));
                            while (r3.hasNext()) {
                                str = connectionDTO.f31654a;
                                arrayList3 = kVar.f178779f;
                                if (arrayList3 != null) {
                                    it6 = arrayList3.iterator();
                                    while (true) {
                                        if (it6.hasNext()) {
                                            next4 = it6.next();
                                            str.getClass();
                                            long j16 = Long.parseLong(str);
                                            inviteeId2 = ((wm0.a) next4).getInviteeId();
                                            if (inviteeId2 == null) {
                                            }
                                        } else {
                                            next4 = null;
                                        }
                                    }
                                    aVar = (wm0.a) next4;
                                } else {
                                    aVar = null;
                                }
                                arrayList4 = kVar.f178781h;
                                if (arrayList4 != null) {
                                    it5 = arrayList4.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            next3 = it5.next();
                                            str.getClass();
                                            long j17 = Long.parseLong(str);
                                            inviteeId = ((wm0.a) next3).getInviteeId();
                                            if (inviteeId == null) {
                                            }
                                        } else {
                                            next3 = null;
                                        }
                                    }
                                    aVar2 = (wm0.a) next3;
                                } else {
                                    aVar2 = null;
                                }
                                Long l15 = new Long(kVar.f178777d);
                                arrayList5 = kVar.f178778e;
                                if (arrayList5 != null) {
                                    it4 = arrayList5.iterator();
                                    do {
                                        if (it4.hasNext()) {
                                            next2 = it4.next();
                                        } else {
                                            next2 = null;
                                        }
                                        bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) next2;
                                    } while (!p005kotlin.jvm.internal.s.g(str, ((com.garmin.android.apps.connectmobile.connections.groups.services.model.b) next2).getUserProfileId()));
                                    bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) next2;
                                } else {
                                    bVar = null;
                                }
                                if (aVar2 == null) {
                                    aVar3 = aVar;
                                } else {
                                    aVar3 = aVar2;
                                }
                                arrayList6 = kVar.f178780g;
                                if (arrayList6 != null) {
                                    it3 = arrayList6.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            next = it3.next();
                                            str.getClass();
                                            long j18 = Long.parseLong(str);
                                            requestorId = ((wm0.c) next).getRequestorId();
                                            if (requestorId == null) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    cVar = (wm0.c) next;
                                } else {
                                    cVar = null;
                                }
                                if (map != null) {
                                    String str11 = connectionDTO.f31654a;
                                    str11.getClass();
                                    lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(Integer.valueOf(Integer.parseInt(str11)));
                                    if (lVar != null) {
                                        jVar = connectionDTO.f31669p;
                                        if (jVar != null) {
                                            str2 = connectionDTO.f31659f;
                                        } else {
                                            str2 = connectionDTO.f31659f;
                                        }
                                    } else {
                                        jVar = connectionDTO.f31669p;
                                        if (jVar != null) {
                                            str2 = connectionDTO.f31659f;
                                        } else {
                                            str2 = connectionDTO.f31659f;
                                        }
                                    }
                                } else {
                                    jVar = connectionDTO.f31669p;
                                    if (jVar != null) {
                                        str2 = connectionDTO.f31659f;
                                    } else {
                                        str2 = connectionDTO.f31659f;
                                    }
                                }
                                String str12 = str2;
                                String str13 = connectionDTO.f31656c;
                                int i16 = connectionDTO.f31667n;
                                String str14 = connectionDTO.f31657d;
                                String str15 = connectionDTO.f31654a;
                                str15.getClass();
                                arrayList2.add(new e(str12, str13, i16, str14, connectionDTO, bVar, aVar3, cVar, l15, Long.valueOf(Long.parseLong(str15)), connectionDTO.f31655b));
                            }
                            g3.f35298f.getClass();
                            g3 g3VarD2 = g3.a.d(arrayList2);
                            this.f178811c = null;
                            this.f178809a = null;
                            this.f178810b = 6;
                        }
                    }
                    break;
                }
                return aVar4;
            case 4:
                o13.r.b(obj);
                objJ = obj;
                obj2 = (v2) objJ;
                if (obj2 instanceof v2.b) {
                    v2.b bVar4 = (v2.b) obj2;
                    List<ConnectionDTO> listC7 = ((ConnectionSearchResultDTO) bVar4.f47386a).C();
                    listC7.getClass();
                    arrayList = new ArrayList(y.r(listC7, 10));
                    it = listC7.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ConnectionDTO) it.next()).f31654a);
                    }
                    a22.i iVar3 = (a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null);
                    List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listC8 = w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
                    this.f178811c = t0Var;
                    this.f178809a = bVar4;
                    this.f178810b = 5;
                    objA = iVar3.a(arrayList, listC8, this);
                    if (objA != aVar4) {
                        map = (Map) objA;
                        List<ConnectionDTO> listC9 = ((ConnectionSearchResultDTO) ((v2.b) obj2).f47386a).C();
                        listC9.getClass();
                        arrayList2 = new ArrayList(y.r(listC9, 10));
                        while (r3.hasNext()) {
                            str = connectionDTO.f31654a;
                            arrayList3 = kVar.f178779f;
                            if (arrayList3 != null) {
                                it6 = arrayList3.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        next4 = it6.next();
                                        str.getClass();
                                        long j19 = Long.parseLong(str);
                                        inviteeId2 = ((wm0.a) next4).getInviteeId();
                                        if (inviteeId2 == null) {
                                        }
                                    } else {
                                        next4 = null;
                                    }
                                }
                                aVar = (wm0.a) next4;
                            } else {
                                aVar = null;
                            }
                            arrayList4 = kVar.f178781h;
                            if (arrayList4 != null) {
                                it5 = arrayList4.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next3 = it5.next();
                                        str.getClass();
                                        long j110 = Long.parseLong(str);
                                        inviteeId = ((wm0.a) next3).getInviteeId();
                                        if (inviteeId == null) {
                                        }
                                    } else {
                                        next3 = null;
                                    }
                                }
                                aVar2 = (wm0.a) next3;
                            } else {
                                aVar2 = null;
                            }
                            Long l16 = new Long(kVar.f178777d);
                            arrayList5 = kVar.f178778e;
                            if (arrayList5 != null) {
                                it4 = arrayList5.iterator();
                                do {
                                    if (it4.hasNext()) {
                                        next2 = it4.next();
                                    } else {
                                        next2 = null;
                                    }
                                    bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) next2;
                                } while (!p005kotlin.jvm.internal.s.g(str, ((com.garmin.android.apps.connectmobile.connections.groups.services.model.b) next2).getUserProfileId()));
                                bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) next2;
                            } else {
                                bVar = null;
                            }
                            if (aVar2 == null) {
                                aVar3 = aVar;
                            } else {
                                aVar3 = aVar2;
                            }
                            arrayList6 = kVar.f178780g;
                            if (arrayList6 != null) {
                                it3 = arrayList6.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next = it3.next();
                                        str.getClass();
                                        long j111 = Long.parseLong(str);
                                        requestorId = ((wm0.c) next).getRequestorId();
                                        if (requestorId == null) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                cVar = (wm0.c) next;
                            } else {
                                cVar = null;
                            }
                            if (map != null) {
                                String str16 = connectionDTO.f31654a;
                                str16.getClass();
                                lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(Integer.valueOf(Integer.parseInt(str16)));
                                if (lVar != null) {
                                    jVar = connectionDTO.f31669p;
                                    if (jVar != null) {
                                        str2 = connectionDTO.f31659f;
                                    } else {
                                        str2 = connectionDTO.f31659f;
                                    }
                                } else {
                                    jVar = connectionDTO.f31669p;
                                    if (jVar != null) {
                                        str2 = connectionDTO.f31659f;
                                    } else {
                                        str2 = connectionDTO.f31659f;
                                    }
                                }
                            } else {
                                jVar = connectionDTO.f31669p;
                                if (jVar != null) {
                                    str2 = connectionDTO.f31659f;
                                } else {
                                    str2 = connectionDTO.f31659f;
                                }
                            }
                            String str17 = str2;
                            String str18 = connectionDTO.f31656c;
                            int i17 = connectionDTO.f31667n;
                            String str19 = connectionDTO.f31657d;
                            String str110 = connectionDTO.f31654a;
                            str110.getClass();
                            arrayList2.add(new e(str17, str18, i17, str19, connectionDTO, bVar, aVar3, cVar, l16, Long.valueOf(Long.parseLong(str110)), connectionDTO.f31655b));
                        }
                        g3.f35298f.getClass();
                        g3 g3VarD3 = g3.a.d(arrayList2);
                        this.f178811c = null;
                        this.f178809a = null;
                        this.f178810b = 6;
                    }
                    break;
                } else {
                    if (!(obj2 instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    g3 g3VarA5 = g3.a.a(g3.f35298f, ((v2.a) obj2).f47383a.toString(), null, null, null, 14);
                    this.f178811c = null;
                    this.f178809a = null;
                    this.f178810b = 7;
                    break;
                }
                return aVar4;
            case 5:
                obj2 = this.f178809a;
                o13.r.b(obj);
                objA = obj;
                map = (Map) objA;
                List<ConnectionDTO> listC10 = ((ConnectionSearchResultDTO) ((v2.b) obj2).f47386a).C();
                listC10.getClass();
                arrayList2 = new ArrayList(y.r(listC10, 10));
                while (r3.hasNext()) {
                    str = connectionDTO.f31654a;
                    arrayList3 = kVar.f178779f;
                    if (arrayList3 != null) {
                        it6 = arrayList3.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                next4 = it6.next();
                                str.getClass();
                                long j112 = Long.parseLong(str);
                                inviteeId2 = ((wm0.a) next4).getInviteeId();
                                if (inviteeId2 == null) {
                                }
                            } else {
                                next4 = null;
                            }
                        }
                        aVar = (wm0.a) next4;
                    } else {
                        aVar = null;
                    }
                    arrayList4 = kVar.f178781h;
                    if (arrayList4 != null) {
                        it5 = arrayList4.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                next3 = it5.next();
                                str.getClass();
                                long j113 = Long.parseLong(str);
                                inviteeId = ((wm0.a) next3).getInviteeId();
                                if (inviteeId == null) {
                                }
                            } else {
                                next3 = null;
                            }
                        }
                        aVar2 = (wm0.a) next3;
                    } else {
                        aVar2 = null;
                    }
                    Long l17 = new Long(kVar.f178777d);
                    arrayList5 = kVar.f178778e;
                    if (arrayList5 != null) {
                        it4 = arrayList5.iterator();
                        do {
                            if (it4.hasNext()) {
                                next2 = it4.next();
                            } else {
                                next2 = null;
                            }
                            bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) next2;
                        } while (!p005kotlin.jvm.internal.s.g(str, ((com.garmin.android.apps.connectmobile.connections.groups.services.model.b) next2).getUserProfileId()));
                        bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) next2;
                    } else {
                        bVar = null;
                    }
                    if (aVar2 == null) {
                        aVar3 = aVar;
                    } else {
                        aVar3 = aVar2;
                    }
                    arrayList6 = kVar.f178780g;
                    if (arrayList6 != null) {
                        it3 = arrayList6.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                str.getClass();
                                long j114 = Long.parseLong(str);
                                requestorId = ((wm0.c) next).getRequestorId();
                                if (requestorId == null) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        cVar = (wm0.c) next;
                    } else {
                        cVar = null;
                    }
                    if (map != null) {
                        String str111 = connectionDTO.f31654a;
                        str111.getClass();
                        lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(Integer.valueOf(Integer.parseInt(str111)));
                        if (lVar != null) {
                            jVar = connectionDTO.f31669p;
                            if (jVar != null) {
                                str2 = connectionDTO.f31659f;
                            } else {
                                str2 = connectionDTO.f31659f;
                            }
                        } else {
                            jVar = connectionDTO.f31669p;
                            if (jVar != null) {
                                str2 = connectionDTO.f31659f;
                            } else {
                                str2 = connectionDTO.f31659f;
                            }
                        }
                    } else {
                        jVar = connectionDTO.f31669p;
                        if (jVar != null) {
                            str2 = connectionDTO.f31659f;
                        } else {
                            str2 = connectionDTO.f31659f;
                        }
                    }
                    String str112 = str2;
                    String str113 = connectionDTO.f31656c;
                    int i18 = connectionDTO.f31667n;
                    String str114 = connectionDTO.f31657d;
                    String str115 = connectionDTO.f31654a;
                    str115.getClass();
                    arrayList2.add(new e(str112, str113, i18, str114, connectionDTO, bVar, aVar3, cVar, l17, Long.valueOf(Long.parseLong(str115)), connectionDTO.f31655b));
                }
                g3.f35298f.getClass();
                g3 g3VarD4 = g3.a.d(arrayList2);
                this.f178811c = null;
                this.f178809a = null;
                this.f178810b = 6;
                break;
            case 6:
            case 7:
                o13.r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

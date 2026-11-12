package mm0;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import c22.l2;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.feed.activity.exception.UnavailableReasonUnknownException;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.excpetion.GroupNotFoundException;
import com.garmin.android.apps.connectmobile.group.excpetion.GroupPrivacyException;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ym0.d0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lmm0/e;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f119504m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ym0.a f119505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a22.i f119506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GroupDetailsDTO f119507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<w> f119508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public wm0.c f119509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<List<uz0.b>> f119510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f119511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l2<GroupDetailsDTO> f119512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l2<GroupDetailsDTO> f119513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l2<GroupDetailsDTO> f119514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l2<GroupDetailsDTO> f119515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l2<Unit> f119516l;

    static {
        new a(null);
    }

    public e() {
        ym0.a.f197886f.getClass();
        this.f119505a = ym0.a.C3709a.a();
        a22.i.f537b.getClass();
        this.f119506b = a22.i.a.a();
        this.f119508d = new y0<>();
        this.f119510f = new y0<>();
        this.f119512h = new l2<>();
        this.f119513i = new l2<>();
        this.f119514j = new l2<>();
        this.f119515k = new l2<>();
        this.f119516l = new l2<>();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(e eVar, v2 v2Var, v13.c cVar) {
        k kVar;
        GroupDetailsDTO groupDetailsDTO;
        eVar.getClass();
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f119551d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f119551d = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(eVar, cVar);
            }
        } else {
            kVar = new k(eVar, cVar);
        }
        Object obj = kVar.f119549b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f119551d;
        if (i15 == 0) {
            o13.r.b(obj);
            if (!(v2Var instanceof v2.b)) {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                Integer num = ((v2.a) v2Var).f47384b;
                if (num != null && num.intValue() == 403) {
                    return g3.a.a(g3.f35298f, null, new GroupPrivacyException(), null, null, 13);
                }
                return (num != null && num.intValue() == 404) ? g3.a.a(g3.f35298f, null, new GroupNotFoundException(), null, null, 13) : g3.a.a(g3.f35298f, null, new UnavailableReasonUnknownException(), null, null, 13);
            }
            GroupDetailsDTO groupDetailsDTO2 = (GroupDetailsDTO) ((v2.b) v2Var).f47386a;
            if (jm0.d.b(eVar.f119507c) != jm0.d.b(groupDetailsDTO2)) {
                eVar.f119512h.j(groupDetailsDTO2);
            }
            if (eVar.f119507c != null) {
                eVar.f119513i.j(groupDetailsDTO2);
            }
            if (eVar.f119507c != null) {
                eVar.f119514j.j(groupDetailsDTO2);
            }
            if (eVar.f119507c != null) {
                eVar.f119515k.j(groupDetailsDTO2);
            }
            eVar.f119507c = groupDetailsDTO2;
            kVar.f119548a = groupDetailsDTO2;
            kVar.f119551d = 1;
            if (eVar.z4(groupDetailsDTO2, kVar) == obj2) {
                return obj2;
            }
            groupDetailsDTO = groupDetailsDTO2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            groupDetailsDTO = kVar.f119548a;
            o13.r.b(obj);
        }
        g3.f35298f.getClass();
        return g3.a.d(groupDetailsDTO);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object y4(e eVar, v2 v2Var, v13.c cVar) {
        n nVar;
        eVar.getClass();
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f119561d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f119561d = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(eVar, cVar);
            }
        } else {
            nVar = new n(eVar, cVar);
        }
        Object objD4 = nVar.f119559b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f119561d;
        if (i15 == 0) {
            o13.r.b(objD4);
            nVar.f119558a = eVar;
            nVar.f119561d = 1;
            objD4 = eVar.D4(v2Var, nVar);
            if (objD4 != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objD4);
                return objD4;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        eVar = nVar.f119558a;
        o13.r.b(objD4);
        nVar.f119558a = null;
        nVar.f119561d = 2;
        Object objE4 = eVar.E4((v2) objD4, nVar);
        return objE4 == aVar ? aVar : objE4;
    }

    public final androidx.lifecycle.j A4(String str) {
        str.getClass();
        return androidx.lifecycle.m.a(null, new j(this, str, null), 3);
    }

    public final long B4() {
        String str;
        GroupDetailsDTO groupDetailsDTO = this.f119507c;
        if (groupDetailsDTO == null || (str = groupDetailsDTO.f31558a) == null) {
            return -1L;
        }
        return Long.parseLong(str);
    }

    public final uz0.b C4() {
        List<uz0.b> listD = this.f119510f.d();
        Object obj = null;
        if (listD == null) {
            return null;
        }
        for (Object obj2 : listD) {
            Long groupId = ((uz0.b) obj2).getGroupId();
            String strValueOf = groupId != null ? String.valueOf(groupId.longValue()) : null;
            GroupDetailsDTO groupDetailsDTO = this.f119507c;
            if (p005kotlin.jvm.internal.s.g(strValueOf, groupDetailsDTO != null ? groupDetailsDTO.f31558a : null)) {
                obj = obj2;
                break;
            }
        }
        return (uz0.b) obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object D4(v2 v2Var, v13.c cVar) {
        p pVar;
        GroupDetailsDTO groupDetailsDTO;
        v2 v2Var2;
        ArrayList arrayList;
        List<String> list;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f119573g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f119573g = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objA = pVar.f119571e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f119573g;
        if (i15 == 0) {
            o13.r.b(objA);
            if (v2Var instanceof v2.b) {
                v2.b bVar = (v2.b) v2Var;
                groupDetailsDTO = (GroupDetailsDTO) bVar.f47386a;
                List<String> list2 = groupDetailsDTO.A;
                ArrayList arrayList2 = list2 != null ? new ArrayList(list2) : new ArrayList();
                List<String> list3 = groupDetailsDTO.B;
                if (list3 != null) {
                    List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listC = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL);
                    pVar.f119567a = bVar;
                    pVar.f119568b = groupDetailsDTO;
                    pVar.f119569c = arrayList2;
                    pVar.f119570d = list3;
                    pVar.f119573g = 1;
                    objA = this.f119506b.a(list3, listC, pVar);
                    if (objA == aVar) {
                        return aVar;
                    }
                    v2Var2 = v2Var;
                    arrayList = arrayList2;
                    list = list3;
                }
            }
            return v2Var;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list = pVar.f119570d;
        arrayList = pVar.f119569c;
        groupDetailsDTO = pVar.f119568b;
        v2Var2 = pVar.f119567a;
        o13.r.b(objA);
        Map map = (Map) objA;
        int i16 = 0;
        for (Object obj : list) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                p13.x.q();
                throw null;
            }
            String str = (String) obj;
            str.getClass();
            com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l(Integer.parseInt(str), map);
            arrayList.set(i16, (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null) ? null : profileImageUrls.f46877f);
            i16 = i17;
        }
        Unit unit = Unit.INSTANCE;
        groupDetailsDTO.A = arrayList;
        return v2Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object E4(v2 v2Var, v13.c cVar) {
        q qVar;
        GroupDetailsDTO groupDetailsDTO;
        GroupDTO.d dVar;
        GroupDetailsDTO groupDetailsDTO2;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f119579f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f119579f = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objJ = qVar.f119577d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f119579f;
        if (i15 == 0) {
            o13.r.b(objJ);
            if (!(v2Var instanceof v2.b)) {
                return v2Var;
            }
            v2.b bVar = (v2.b) v2Var;
            groupDetailsDTO = (GroupDetailsDTO) bVar.f47386a;
            GroupDTO.d dVar2 = groupDetailsDTO.f31568k;
            if (groupDetailsDTO.f31567j != GroupDTO.e.HIDDEN || dVar2 == (dVar = GroupDTO.d.INVITE)) {
                return v2Var;
            }
            groupDetailsDTO.f31568k = dVar;
            String string = groupDetailsDTO.f31558a.toString();
            qVar.f119574a = bVar;
            qVar.f119575b = groupDetailsDTO;
            qVar.f119576c = groupDetailsDTO;
            qVar.f119579f = 1;
            ym0.a aVar2 = this.f119505a;
            aVar2.getClass();
            objJ = f0.J(aVar2, new ym0.l(aVar2, string, groupDetailsDTO, null), qVar);
            if (objJ == aVar) {
                return aVar;
            }
            groupDetailsDTO2 = groupDetailsDTO;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            GroupDetailsDTO groupDetailsDTO3 = qVar.f119576c;
            groupDetailsDTO2 = qVar.f119575b;
            v2.b bVar2 = qVar.f119574a;
            o13.r.b(objJ);
            groupDetailsDTO = groupDetailsDTO3;
            v2Var = bVar2;
        }
        v2 v2Var2 = (v2) objJ;
        if (!(v2Var2 instanceof v2.a)) {
            this.f119516l.j(Unit.INSTANCE);
            return v2.b.a((v2.b) v2Var, groupDetailsDTO);
        }
        String str = "Failed to update group privacy to INVITE for groupId=" + groupDetailsDTO2.f31558a + ", error=" + ((v2.a) v2Var2).f47383a;
        i2.a aVar3 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar3.getClass();
        i2.a.f(a2Var, "GroupDetailViewModel", str);
        return v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object z4(GroupDetailsDTO groupDetailsDTO, v13.c cVar) {
        h hVar;
        GroupDetailsDTO groupDetailsDTO2;
        e eVar;
        wm0.c cVar2;
        GroupDTO.d dVar;
        w wVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f119530e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f119530e = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objC = hVar.f119528c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f119530e;
        if (i15 == 0) {
            o13.r.b(objC);
            if (groupDetailsDTO != null) {
                jm0.e eVar2 = jm0.e.f99565a;
                GroupDTO.c cVar3 = groupDetailsDTO.f31578w;
                cVar3.getClass();
                eVar2.getClass();
                if (!jm0.e.e(cVar3)) {
                    String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
                    String str = groupDetailsDTO.f31558a;
                    str.getClass();
                    long j8 = Long.parseLong(str);
                    hVar.f119526a = groupDetailsDTO;
                    hVar.f119527b = this;
                    hVar.f119530e = 1;
                    ym0.a aVar2 = this.f119505a;
                    aVar2.getClass();
                    objC = aVar2.C(new d0(aVar2, j8, userDisplayName, null), hVar);
                    if (objC == aVar) {
                        return aVar;
                    }
                    groupDetailsDTO2 = groupDetailsDTO;
                    eVar = this;
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        eVar = hVar.f119527b;
        groupDetailsDTO2 = hVar.f119526a;
        o13.r.b(objC);
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            cVar2 = (wm0.c) ((v2.b) v2Var).f47386a;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            cVar2 = null;
        }
        eVar.f119509e = cVar2;
        wm0.c cVar4 = this.f119509e;
        if (groupDetailsDTO2 == null || (dVar = groupDetailsDTO2.f31568k) == null) {
            dVar = GroupDTO.d.NOT_DEFINED;
        }
        boolean z14 = (cVar4 != null ? cVar4.getRequestStatus() : null) == wm0.d.REQUESTED;
        if (C4() != null) {
            wVar = w.BE_INVITED;
        } else if (dVar == GroupDTO.d.PUBLIC) {
            wVar = w.NOT_JOINED;
        } else {
            GroupDTO.d dVar2 = GroupDTO.d.PRIVATE;
            if (dVar == dVar2 && !z14) {
                wVar = w.REQUEST_TO_JOIN;
            } else if (dVar == dVar2 && z14) {
                wVar = w.REQUEST_SENT;
            } else {
                wVar = dVar == GroupDTO.d.INVITE ? w.BY_INVITATION_ONLY : w.UNKNOWN;
            }
        }
        this.f119508d.j(wVar);
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmm0/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

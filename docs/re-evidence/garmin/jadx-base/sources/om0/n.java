package om0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import ei0.p0;
import f12.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import li0.d0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.w;
import yc.h3;
import yc.i3;
import ym0.c0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lom0/n;", "Lyc/h3;", "", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "", "groupId", "", "supportOwner", "filterOutBlockedUsers", "orderByRelationship", "<init>", "(Ljava/lang/String;ZZZ)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends h3<Integer, com.garmin.android.apps.connectmobile.connections.groups.services.model.b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f132942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f132943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f132944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ym0.a f132945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ei0.d f132946g;

    static {
        new a(null);
    }

    public n(String str, boolean z14, boolean z15, boolean z16) {
        str.getClass();
        this.f132941b = str;
        this.f132942c = z14;
        this.f132943d = z15;
        this.f132944e = z16;
        ym0.a.f197886f.getClass();
        this.f132945f = ym0.a.C3709a.a();
        this.f132946g = (ei0.d) KoinJavaComponent.get$default(ei0.d.class, null, null, 6, null);
    }

    @Override // yc.h3
    public final Integer c(i3<Integer, com.garmin.android.apps.connectmobile.connections.groups.services.model.b> i3Var) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX WARN: Code duplicated, block: B:60:0x0161  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163  */
    /* JADX WARN: Code duplicated, block: B:65:0x0175  */
    /* JADX WARN: Code duplicated, block: B:74:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        o oVar;
        int i14;
        int i15;
        v2 v2Var;
        int i16;
        int i17;
        v2 v2Var2;
        Integer num;
        List list;
        Iterator it;
        hi0.a aVar2;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        String profileImageMedium;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i18 = oVar.f132952f;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                oVar.f132952f = i18 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objJ = oVar.f132950d;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i19 = oVar.f132952f;
        if (i19 == 0) {
            o13.r.b(objJ);
            Integer num2 = (Integer) aVar.a();
            int iIntValue = num2 != null ? num2.intValue() : 1;
            int i24 = aVar.f196007a;
            oVar.f132948b = iIntValue;
            oVar.f132949c = i24;
            oVar.f132952f = 1;
            ym0.a aVar4 = this.f132945f;
            aVar4.getClass();
            objJ = f0.J(aVar4, new c0(aVar4, this.f132941b, iIntValue, i24, this.f132942c, this.f132943d, this.f132944e, null), oVar);
            if (objJ != aVar3) {
                i14 = iIntValue;
                i15 = i24;
            }
            return aVar3;
        }
        if (i19 == 1) {
            i15 = oVar.f132949c;
            i14 = oVar.f132948b;
            o13.r.b(objJ);
        } else {
            if (i19 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i16 = oVar.f132949c;
            i17 = oVar.f132948b;
            v2Var = oVar.f132947a;
            o13.r.b(objJ);
        }
        v2Var2 = (v2) objJ;
        if (v2Var2 instanceof v2.b) {
            list = (List) ((v2.b) v2Var2).f47386a;
            for (com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar : (Iterable) ((v2.b) v2Var).f47386a) {
                it = list.iterator();
                do {
                    if (it.hasNext()) {
                        n23.j.s("Collection contains no element matching the predicate.");
                        return null;
                    }
                    aVar2 = (hi0.a) it.next();
                } while (!s.g(aVar2.getDisplayName(), bVar.getDisplayName()));
                profileImageUrls = aVar2.getProfileImageUrls();
                if (profileImageUrls != null || (profileImageMedium = profileImageUrls.f46879h) == null) {
                    profileImageMedium = bVar.getProfileImageMedium();
                }
                b12.b bVar2 = new b12.b(profileImageMedium, null, u.a(bVar.getUserLevel()), null, null, 26, null);
                d0 d0VarA = hi0.b.a(aVar2);
                bVar.f31628p = bVar2;
                bVar.f31627o = d0.b(d0VarA, bVar2, null, null, null, null, null, null, 510);
            }
        }
        v2.b bVar3 = (v2.b) v2Var;
        List list2 = (List) bVar3.f47386a;
        if (i17 == 1) {
            num = null;
        } else {
            num = new Integer(i17 - i16);
        }
        return new h3.b.c(list2, num, ((List) bVar3.f47386a).size() >= i16 ? new Integer(i17 + i16) : null);
        v2 v2Var3 = (v2) objJ;
        if (!(v2Var3 instanceof v2.b)) {
            if (v2Var3 instanceof v2.a) {
                return new h3.b.a(((v2.a) v2Var3).f47383a);
            }
            u0.r();
            return null;
        }
        v2.b bVar4 = (v2.b) v2Var3;
        Iterable iterable = (Iterable) bVar4.f47386a;
        ArrayList arrayList = new ArrayList();
        Iterator it3 = iterable.iterator();
        while (it3.hasNext()) {
            String userProfileId = ((com.garmin.android.apps.connectmobile.connections.groups.services.model.b) it3.next()).getUserProfileId();
            Integer num3 = userProfileId != null ? new Integer(Integer.parseInt(userProfileId)) : null;
            if (num3 != null) {
                arrayList.add(num3);
            }
        }
        List listC = w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
        oVar.f132947a = bVar4;
        oVar.f132948b = i14;
        oVar.f132949c = i15;
        oVar.f132952f = 2;
        Object objR0 = this.f132946g.r0(arrayList, listC, p0.f64292c, oVar);
        if (objR0 != aVar3) {
            v2Var = v2Var3;
            objJ = objR0;
            i16 = i15;
            i17 = i14;
            v2Var2 = (v2) objJ;
            if (v2Var2 instanceof v2.b) {
                list = (List) ((v2.b) v2Var2).f47386a;
                while (r5.hasNext()) {
                    it = list.iterator();
                    do {
                        if (it.hasNext()) {
                            n23.j.s("Collection contains no element matching the predicate.");
                            return null;
                        }
                        aVar2 = (hi0.a) it.next();
                    } while (!s.g(aVar2.getDisplayName(), bVar.getDisplayName()));
                    profileImageUrls = aVar2.getProfileImageUrls();
                    if (profileImageUrls != null) {
                        profileImageMedium = bVar.getProfileImageMedium();
                    } else {
                        profileImageMedium = bVar.getProfileImageMedium();
                    }
                    b12.b bVar5 = new b12.b(profileImageMedium, null, u.a(bVar.getUserLevel()), null, null, 26, null);
                    d0 d0VarA2 = hi0.b.a(aVar2);
                    bVar.f31628p = bVar5;
                    bVar.f31627o = d0.b(d0VarA2, bVar5, null, null, null, null, null, null, 510);
                }
            }
            v2.b bVar6 = (v2.b) v2Var;
            List list3 = (List) bVar6.f47386a;
            if (i17 == 1) {
                num = null;
            } else {
                num = new Integer(i17 - i16);
            }
            return new h3.b.c(list3, num, ((List) bVar6.f47386a).size() >= i16 ? new Integer(i17 + i16) : null);
        }
        return aVar3;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lom0/n$a;", "", "<init>", "()V", "", "PAGING_SIZE", "I", "START", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ n(String str, boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? false : z16);
    }
}

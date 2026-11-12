package sm0;

import a22.i;
import android.content.Context;
import androidx.room.a0;
import c22.t;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupAnnouncementDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.x;
import qm0.m;
import tn.k;
import vb.h;
import yc.h3;
import yc.i3;
import ym0.q;
import ym0.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lsm0/d;", "Lqm0/m;", "Lym0/a;", "groupRepo", "La22/i;", "userProfileRepo", "", "groupId", "Lum0/a;", "postFeedCache", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$c;", "membership", "<init>", "(Lym0/a;La22/i;JLum0/a;Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$c;)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends m {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ym0.a aVar, i iVar, long j8, um0.a aVar2, Context context, GroupDTO.c cVar) {
        super(aVar, iVar, j8, aVar2, context, cVar);
        aVar.getClass();
        iVar.getClass();
        aVar2.getClass();
        context.getClass();
        cVar.getClass();
    }

    @Override // yc.h3
    public final String c(i3<String, wg0.a> i3Var) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0140, code lost:
    
        if (r2 == r3) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yc.h3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(h3.a aVar, v13.c cVar) {
        e eVar;
        String str;
        int i14;
        int i15;
        List list;
        String str2;
        List list2;
        GroupAnnouncementDTO groupAnnouncementDTO;
        List list3;
        Object obj;
        Object objJ;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i16 = eVar.f160082g;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                eVar.f160082g = i16 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objI = eVar.f160080e;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i17 = eVar.f160082g;
        long j8 = this.f145514d;
        ym0.a aVar2 = this.f145512b;
        if (i17 == 0) {
            r.b(objI);
            str = (String) aVar.a();
            i14 = aVar.f196007a;
            um0.a aVar3 = this.f145515e;
            boolean z14 = aVar3.f171993d;
            List<wg0.a> list4 = aVar3.f171990a;
            if (z14 && f(str)) {
                List listB1 = h0.b1(list4);
                String strH = k.h("load, cachedNewsFeedItems=[", "]", listB1);
                i2.a aVar4 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var, "GroupAllFeedPagingSource", strH);
                aVar3.f171993d = false;
                if (!listB1.isEmpty()) {
                    return new h3.b.c(h0.b1(list4), null, aVar3.f171991b);
                }
            }
            String strE = t.e(i14, "load: cursor=[", str, "], limit=[", "]");
            i2.a aVar5 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var2, "GroupAllFeedPagingSource", strE);
            List arrayList = new ArrayList();
            if (str == null) {
                String strValueOf = String.valueOf(j8);
                eVar.f160076a = str;
                eVar.f160077b = arrayList;
                eVar.f160079d = i14;
                eVar.f160082g = 1;
                aVar2.getClass();
                Object objC = aVar2.C(new q(aVar2, strValueOf, null), eVar);
                if (objC != obj2) {
                    str2 = str;
                    objI = objC;
                    list2 = arrayList;
                }
            } else {
                i15 = i14;
                list = arrayList;
                String strValueOf2 = String.valueOf(j8);
                List listK = x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND, com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL);
                eVar.f160076a = null;
                eVar.f160077b = list;
                eVar.f160078c = null;
                eVar.f160079d = i15;
                eVar.f160082g = 3;
                aVar2.getClass();
                String str3 = str;
                obj = null;
                objJ = f0.J(aVar2, new u(aVar2, strValueOf2, i15, str3, listK, null), eVar);
            }
            return obj2;
        }
        if (i17 == 1) {
            i14 = eVar.f160079d;
            List list5 = eVar.f160077b;
            str2 = eVar.f160076a;
            r.b(objI);
            list2 = list5;
        } else if (i17 == 2) {
            i14 = eVar.f160079d;
            list2 = eVar.f160078c;
            list3 = eVar.f160077b;
            str2 = eVar.f160076a;
            r.b(objI);
            list2.add(objI);
            List list6 = list3;
            i15 = i14;
            list = list6;
            str = str2;
            String strValueOf3 = String.valueOf(j8);
            List listK2 = x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND, com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL);
            eVar.f160076a = null;
            eVar.f160077b = list;
            eVar.f160078c = null;
            eVar.f160079d = i15;
            eVar.f160082g = 3;
            aVar2.getClass();
            String str4 = str;
            obj = null;
            objJ = f0.J(aVar2, new u(aVar2, strValueOf3, i15, str4, listK2, null), eVar);
        } else {
            if (i17 != 3) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list7 = eVar.f160077b;
            r.b(objI);
            list = list7;
            objJ = objI;
            obj = null;
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                return new h3.b.C3657b();
            }
            String strH2 = a0.h("load: Error: result=[", v2Var, "]");
            i2.a aVar6 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar6.getClass();
            i2.a.b(a2Var3, "GroupAllFeedPagingSource", strH2);
            return new h3.b.a(((v2.a) v2Var).f47383a);
        }
        String strH3 = a0.h("load: Success: result=[", v2Var, "]");
        i2.a aVar7 = i2.f36769a;
        a2 a2Var4 = a2.GENERAL;
        aVar7.getClass();
        i2.a.b(a2Var4, "GroupAllFeedPagingSource", strH3);
        jo1.c cVar2 = (jo1.c) ((v2.b) v2Var).f47386a;
        list.addAll(h(cVar2));
        j(cVar2.getNextCursor(), cVar2.getDaysLimit(), list);
        return new h3.b.c(list, obj, cVar2.getNextCursor());
        v2 v2Var2 = (v2) objI;
        if (!(v2Var2 instanceof v2.b) || (groupAnnouncementDTO = (GroupAnnouncementDTO) ((v2.b) v2Var2).f47386a) == null || groupAnnouncementDTO.f31502a == null) {
            i15 = i14;
            list = list2;
            str = str2;
            String strValueOf4 = String.valueOf(j8);
            List listK3 = x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND, com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL);
            eVar.f160076a = null;
            eVar.f160077b = list;
            eVar.f160078c = null;
            eVar.f160079d = i15;
            eVar.f160082g = 3;
            aVar2.getClass();
            String str5 = str;
            obj = null;
            objJ = f0.J(aVar2, new u(aVar2, strValueOf4, i15, str5, listK3, null), eVar);
        } else {
            wg0.a aVarG = g(groupAnnouncementDTO);
            eVar.f160076a = str2;
            eVar.f160077b = list2;
            eVar.f160078c = list2;
            eVar.f160079d = i14;
            eVar.f160082g = 2;
            objI = i(aVarG, eVar);
            if (objI != obj2) {
                list3 = list2;
                list2.add(objI);
                List list8 = list3;
                i15 = i14;
                list = list8;
                str = str2;
                String strValueOf5 = String.valueOf(j8);
                List listK4 = x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND, com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL);
                eVar.f160076a = null;
                eVar.f160077b = list;
                eVar.f160078c = null;
                eVar.f160079d = i15;
                eVar.f160082g = 3;
                aVar2.getClass();
                String str6 = str;
                obj = null;
                objJ = f0.J(aVar2, new u(aVar2, strValueOf5, i15, str6, listK4, null), eVar);
            }
        }
        return obj2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsm0/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

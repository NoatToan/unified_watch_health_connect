package rm0;

import a22.i;
import android.content.Context;
import androidx.room.a0;
import c22.t;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lrm0/e;", "Lqm0/m;", "Lym0/a;", "groupRepo", "La22/i;", "userProfileRepo", "", "groupId", "Lum0/a;", "postFeedCache", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$c;", "membership", "<init>", "(Lym0/a;La22/i;JLum0/a;Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$c;)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends m {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ym0.a aVar, i iVar, long j8, um0.a aVar2, Context context, GroupDTO.c cVar) {
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
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) throws Throwable {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f153528c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f153528c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objJ = fVar.f153526a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f153528c;
        if (i15 == 0) {
            r.b(objJ);
            String str = (String) aVar.a();
            int i16 = aVar.f196007a;
            um0.a aVar3 = this.f145515e;
            boolean z14 = aVar3.f171993d;
            List<wg0.a> list = aVar3.f171990a;
            if (z14 && f(str)) {
                List listB1 = h0.b1(list);
                String strH = k.h("load, cachedNewsFeedItems=[", "]", listB1);
                i2.a aVar4 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var, "GroupActivityFeedPagingSource", strH);
                aVar3.f171993d = false;
                if (!listB1.isEmpty()) {
                    return new h3.b.c(h0.b1(list), null, aVar3.f171991b);
                }
            }
            String strE = t.e(i16, "load: cursor=[", str, "], limit=[", "]");
            i2.a aVar5 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var2, "GroupActivityFeedPagingSource", strE);
            String strValueOf = String.valueOf(this.f145514d);
            List listK = x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND, com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL);
            fVar.f153528c = 1;
            ym0.a aVar6 = this.f145512b;
            aVar6.getClass();
            objJ = f0.J(aVar6, new ym0.r(aVar6, strValueOf, i16, str, listK, null), fVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                return new h3.b.C3657b();
            }
            String strH2 = a0.h("load: Error: result=[", v2Var, "]");
            i2.a aVar7 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar7.getClass();
            i2.a.b(a2Var3, "GroupActivityFeedPagingSource", strH2);
            return new h3.b.a(((v2.a) v2Var).f47383a);
        }
        String strH3 = a0.h("load: Success: result=[", v2Var, "]");
        i2.a aVar8 = i2.f36769a;
        a2 a2Var4 = a2.GENERAL;
        aVar8.getClass();
        i2.a.b(a2Var4, "GroupActivityFeedPagingSource", strH3);
        jo1.c cVar2 = (jo1.c) ((v2.b) v2Var).f47386a;
        List<wg0.a> listH = h(cVar2);
        j(cVar2.getNextCursor(), cVar2.getDaysLimit(), listH);
        return new h3.b.c(listH, null, cVar2.getNextCursor());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrm0/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

package qm0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupAnnouncementDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.j0;
import yc.h3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lqm0/m;", "Lyc/h3;", "", "Lwg0/a;", "Lym0/a;", "groupRepo", "La22/i;", "userProfileRepo", "", "groupId", "Lum0/a;", "postFeedCache", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$c;", "membership", "<init>", "(Lym0/a;La22/i;JLum0/a;Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$c;)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class m extends h3<String, wg0.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym0.a f145512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a22.i f145513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f145514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final um0.a f145515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f145516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GroupDTO.c f145517g;

    static {
        new a(null);
    }

    public m(ym0.a aVar, a22.i iVar, long j8, um0.a aVar2, Context context, GroupDTO.c cVar) {
        aVar.getClass();
        iVar.getClass();
        aVar2.getClass();
        context.getClass();
        cVar.getClass();
        this.f145512b = aVar;
        this.f145513c = iVar;
        this.f145514d = j8;
        this.f145515e = aVar2;
        this.f145516f = context;
        this.f145517g = cVar;
    }

    public final boolean f(String str) {
        um0.a aVar = this.f145515e;
        String str2 = aVar.f171991b;
        if (str2 == null || str2.length() <= 0 || p005kotlin.jvm.internal.s.g(aVar.f171991b, str)) {
            return aVar.f171991b == null && str == null;
        }
        return true;
    }

    public final wg0.a g(GroupAnnouncementDTO groupAnnouncementDTO) {
        groupAnnouncementDTO.getClass();
        Context context = this.f145516f;
        context.getClass();
        GroupDTO.c cVar = this.f145517g;
        cVar.getClass();
        int i14 = (int) groupAnnouncementDTO.f31508g;
        String string = groupAnnouncementDTO.f31509h;
        if (string == null) {
            string = context.getString(R.string.lbl_announcement);
            string.getClass();
        }
        String str = string;
        DateTime dateTime = new DateTime(groupAnnouncementDTO.f31507f);
        DateTime dateTime2 = new DateTime(groupAnnouncementDTO.f31507f);
        String str2 = groupAnnouncementDTO.f31505d;
        DateTime dateTime3 = new DateTime(groupAnnouncementDTO.f31507f);
        String strP = xy2.b.p(context, dateTime3, dateTime3, false, false);
        DateTime dateTime4 = new DateTime(groupAnnouncementDTO.f31507f);
        return new wg0.a(null, null, null, Integer.valueOf(i14), "", str, dateTime, dateTime2, null, str2, false, false, false, false, null, null, false, null, null, null, cVar, false, groupAnnouncementDTO, strP, false, xy2.b.p(context, dateTime4, dateTime4, false, true), new b12.b(groupAnnouncementDTO.f31510i, null, null, null, null, 30, null), null, null, 422575367, null);
    }

    public final List<wg0.a> h(jo1.c cVar) throws Throwable {
        jo1.e eVarD;
        cVar.getClass();
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> mapG = cVar.g();
        List<jo1.a> listD = cVar.d();
        if (listD == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (jo1.a aVar : listD) {
            wg0.a aVarA = null;
            if (aVar.f()) {
                ActivityListItemDTO activityListItemDTOB = aVar.b();
                if (activityListItemDTOB != null) {
                    aVarA = wg0.j.b(activityListItemDTOB, this.f145516f, true, mapG, null, null, 24);
                }
            } else if (aVar.g() && (eVarD = aVar.d()) != null) {
                aVarA = wg0.j.a(eVarD, this.f145516f, this.f145517g, mapG);
            }
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(wg0.a aVar, v13.c cVar) {
        n nVar;
        String strValueOf;
        wg0.a aVar2;
        String str;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        String str2;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f145522e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f145522e = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object obj = nVar.f145520c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f145522e;
        if (i15 == 0) {
            o13.r.b(obj);
            Integer num = aVar.f185045d;
            if (num == null || (strValueOf = String.valueOf(num.intValue())) == null) {
                return aVar;
            }
            List<String> listC = p13.w.c(strValueOf);
            List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listC2 = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
            nVar.f145518a = aVar;
            nVar.f145519b = strValueOf;
            nVar.f145522e = 1;
            Object objA = this.f145513c.a(listC, listC2, nVar);
            if (objA == aVar3) {
                return aVar3;
            }
            aVar2 = aVar;
            str = strValueOf;
            obj = objA;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = nVar.f145519b;
            aVar2 = nVar.f145518a;
            o13.r.b(obj);
        }
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l(Integer.parseInt(str), (Map) obj);
        return wg0.a.b(aVar2, null, null, null, (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (str2 = profileImageUrls.f46879h) == null) ? aVar2.C : new b12.b(str2, null, null, null, null, 30, null), null, 469762047);
    }

    public final void j(String str, Integer num, List list) {
        list.getClass();
        um0.a aVar = this.f145515e;
        aVar.f171990a.addAll(list);
        aVar.f171991b = str;
        if (num != null) {
            aVar.f171992c = num.intValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lqm0/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "GROUP", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

package pt0;

import android.text.TextUtils;
import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.SocialChallengeDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.VivoKidAdHocChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import lc.u0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import yt0.c1;
import yt0.f1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpt0/e0;", "Landroidx/lifecycle/u1;", "Lyt0/f1;", "teamChallengeRepo", "<init>", "(Lyt0/f1;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f140657a;

    public e0(f1 f1Var) {
        f1Var.getClass();
        this.f140657a = f1Var;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:88:0x023f  */
    /* JADX WARN: Code duplicated, block: B:90:0x024b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0260  */
    /* JADX WARN: Code duplicated, block: B:97:0x0263  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [u13.a] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public static final Object x4(e0 e0Var, String str, int i14, int i15, v13.c cVar) {
        d0 d0Var;
        int i16;
        int i17;
        String str2;
        Long lValueOf;
        Map map;
        String winnerProfileUserId;
        String str3;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        String str4;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        e0Var.getClass();
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i18 = d0Var.f140651f;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                d0Var.f140651f = i18 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(e0Var, cVar);
            }
        } else {
            d0Var = new d0(e0Var, cVar);
        }
        Object objJ = d0Var.f140649d;
        ?? r14 = u13.a.COROUTINE_SUSPENDED;
        int i19 = d0Var.f140651f;
        DateTime dateTime = null;
        if (i19 == 0) {
            o13.r.b(objJ);
            f1 f1Var = e0Var.f140657a;
            d0Var.f140647b = i14;
            d0Var.f140648c = i15;
            d0Var.f140651f = 1;
            f1Var.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(f1Var, new c1(f1Var, str, i14, i15, null), d0Var);
            if (objJ != r14) {
                i16 = i14;
                i17 = i15;
            }
            return r14;
        }
        if (i19 == 1) {
            i17 = d0Var.f140648c;
            i16 = d0Var.f140647b;
            o13.r.b(objJ);
        } else {
            if (i19 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList = d0Var.f140646a;
            o13.r.b(objJ);
            r14 = arrayList;
        }
        map = (Map) objJ;
        for (com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var : r14) {
            winnerProfileUserId = a0Var.getWinnerProfileUserId();
            if (winnerProfileUserId != null) {
                lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l(Integer.parseInt(winnerProfileUserId), map);
                if (lVar != null || (profileImageUrls = lVar.getProfileImageUrls()) == null) {
                    str4 = null;
                } else {
                    str4 = profileImageUrls.f46877f;
                }
                str3 = str4;
            } else {
                str3 = null;
            }
            if (str3 != null) {
                a0Var.X = new b12.b(str3, null, null, null, null, 30, null);
            }
        }
        return r14;
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return p13.j0.f134944a;
            }
            u0.r();
            return null;
        }
        Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
        ArrayList arrayList2 = new ArrayList(p13.y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            SocialChallengeDTO socialChallengeDTO = (SocialChallengeDTO) it.next();
            com.garmin.android.apps.connectmobile.leaderboard.model.a0.Y.getClass();
            socialChallengeDTO.getClass();
            ArrayList arrayList3 = socialChallengeDTO.f38046h;
            int i24 = socialChallengeDTO.f38039a;
            String str5 = socialChallengeDTO.f38043e;
            String str6 = socialChallengeDTO.f38042d;
            int i25 = socialChallengeDTO.f38041c;
            int i26 = socialChallengeDTO.f38040b;
            DateTime dateTimeN = !TextUtils.isEmpty(socialChallengeDTO.f38044f) ? c22.j0.N(socialChallengeDTO.f38044f, false) : dateTime;
            DateTime dateTimeN2 = !TextUtils.isEmpty(socialChallengeDTO.f38045g) ? c22.j0.N(socialChallengeDTO.f38045g, false) : dateTime;
            int i27 = socialChallengeDTO.f38047i;
            ArrayList<AdHocChallengePlayerDTO> arrayList4 = socialChallengeDTO.f38048j;
            ArrayList arrayList5 = new ArrayList();
            for (AdHocChallengePlayerDTO adHocChallengePlayerDTO : arrayList4) {
                Iterator it3 = it;
                com.garmin.android.apps.connectmobile.leaderboard.model.b0.f38082f.getClass();
                adHocChallengePlayerDTO.getClass();
                int i28 = i27;
                try {
                    String str7 = adHocChallengePlayerDTO.f38007a;
                    lValueOf = str7 != null ? Long.valueOf(Long.parseLong(str7)) : null;
                } catch (Exception unused) {
                    lValueOf = null;
                }
                arrayList5.add(new com.garmin.android.apps.connectmobile.leaderboard.model.b0(lValueOf, adHocChallengePlayerDTO.f38014h, adHocChallengePlayerDTO.f38013g, Integer.valueOf((int) adHocChallengePlayerDTO.f38010d), null, 16, null));
                it = it3;
                i27 = i28;
                arrayList3 = arrayList3;
                i24 = i24;
            }
            Iterator it4 = it;
            int i29 = i27;
            ArrayList arrayList6 = arrayList3;
            int i30 = i24;
            Object objD0 = p13.h0.d0(socialChallengeDTO.f38048j);
            VivoKidAdHocChallengePlayerDTO vivoKidAdHocChallengePlayerDTO = objD0 instanceof VivoKidAdHocChallengePlayerDTO ? (VivoKidAdHocChallengePlayerDTO) objD0 : null;
            int i34 = vivoKidAdHocChallengePlayerDTO != null ? vivoKidAdHocChallengePlayerDTO.f38050p : -1;
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = arrayList6.iterator();
            while (it5.hasNext()) {
                String teamName = ((com.garmin.android.apps.connectmobile.leaderboard.model.j0) it5.next()).getTeamName();
                if (teamName != null) {
                    arrayList7.add(teamName);
                }
            }
            AdHocChallengePlayerDTO adHocChallengePlayerDTO2 = (AdHocChallengePlayerDTO) p13.h0.d0(socialChallengeDTO.f38048j);
            if (adHocChallengePlayerDTO2 == null || (profileImageUrl = adHocChallengePlayerDTO2.f38011e) == null) {
                com.garmin.android.apps.connectmobile.leaderboard.model.j0 j0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.j0) p13.h0.d0(arrayList6);
                if (j0Var != null) {
                    String profileImageUrl = j0Var.getProfileImageUrl();
                    str2 = profileImageUrl;
                } else {
                    str2 = null;
                }
            } else {
                str2 = profileImageUrl;
            }
            AdHocChallengePlayerDTO adHocChallengePlayerDTO3 = (AdHocChallengePlayerDTO) p13.h0.d0(socialChallengeDTO.f38048j);
            arrayList2.add(new com.garmin.android.apps.connectmobile.leaderboard.model.a0(str5, null, str6, Integer.valueOf(i30), Integer.valueOf(i25), Integer.valueOf(i26), dateTimeN, dateTimeN2, arrayList7, arrayList5, str2, adHocChallengePlayerDTO3 != null ? adHocChallengePlayerDTO3.f38007a : null, null, i34, Integer.valueOf(i29), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -28670, 1, null));
            it = it4;
            dateTime = null;
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            String winnerProfileUserId2 = ((com.garmin.android.apps.connectmobile.leaderboard.model.a0) it6.next()).getWinnerProfileUserId();
            if (winnerProfileUserId2 != null) {
                arrayList8.add(winnerProfileUserId2);
            }
        }
        a22.i iVar = (a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null);
        d0Var.f140646a = arrayList2;
        d0Var.f140647b = i16;
        d0Var.f140648c = i17;
        d0Var.f140651f = 2;
        a22.i.a aVar = a22.i.f537b;
        objJ = iVar.a(arrayList8, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, d0Var);
        if (objJ != r14) {
            r14 = arrayList2;
            map = (Map) objJ;
            while (r0.hasNext()) {
                winnerProfileUserId = a0Var.getWinnerProfileUserId();
                if (winnerProfileUserId != null) {
                    lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l(Integer.parseInt(winnerProfileUserId), map);
                    if (lVar != null) {
                        str4 = null;
                    } else {
                        str4 = null;
                    }
                    str3 = str4;
                } else {
                    str3 = null;
                }
                if (str3 != null) {
                    a0Var.X = new b12.b(str3, null, null, null, null, 30, null);
                }
            }
        }
        return r14;
    }
}

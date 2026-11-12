package hi0;

import do1.o;
import f12.u;
import li0.b0;
import li0.d0;
import li0.n0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:11:0x001c A[PHI: r0
      0x001c: PHI (r0v13 java.lang.String) = (r0v4 java.lang.String), (r0v6 java.lang.String), (r0v14 java.lang.String) binds: [B:16:0x0028, B:19:0x0030, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    public static final d0 a(a aVar) {
        String str;
        String str2;
        String strB;
        c receivedRequest;
        Integer numB;
        c sentRequest;
        Integer numB2;
        aVar.getClass();
        e followStatus = aVar.getFollowStatus();
        b0 b0VarA = followStatus != null ? f.a(followStatus) : null;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls = aVar.getProfileImageUrls();
        if (profileImageUrls == null || (str = profileImageUrls.f46878g) == null) {
            com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2 = aVar.getProfileImageUrls();
            str = profileImageUrls2 != null ? profileImageUrls2.f46879h : null;
            if (str != null) {
                str2 = str;
            } else {
                com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls3 = aVar.getProfileImageUrls();
                if (profileImageUrls3 != null) {
                    str = profileImageUrls3.f46880i;
                    str2 = str;
                } else {
                    str2 = null;
                }
            }
        } else {
            str2 = str;
        }
        Long userLevel = aVar.getUserLevel();
        b12.b bVar = new b12.b(str2, null, userLevel != null ? u.a((int) userLevel.longValue()) : null, null, null, 26, null);
        String displayName = aVar.getDisplayName();
        String fullName = aVar.getFullName();
        boolean zG = s.g(aVar.getDisplayName(), ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName());
        e followStatus2 = aVar.getFollowStatus();
        if (followStatus2 != null ? s.g(followStatus2.getBlocking(), Boolean.TRUE) : false) {
            strB = "";
        } else {
            e followStatus3 = aVar.getFollowStatus();
            if (followStatus3 != null ? s.g(followStatus3.getBlocked(), Boolean.TRUE) : false) {
                strB = "";
            } else if (b0VarA == b0.FOLLOW || b0VarA == b0.FOLLOW_BACK || b0VarA == b0.IDLE || b0VarA == b0.REQUEST_SENT) {
                String infoFullName = aVar.getFollowStatus().getInfoFullName();
                Integer infoCount = aVar.getFollowStatus().getInfoCount();
                strB = (infoFullName == null || infoCount == null) ? null : ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).b(infoCount.intValue(), infoFullName);
                if (strB == null) {
                    strB = aVar.getLocation();
                }
            } else {
                strB = aVar.getLocation();
            }
        }
        String str3 = strB;
        e followStatus4 = aVar.getFollowStatus();
        Long lValueOf = (followStatus4 == null || (sentRequest = followStatus4.getSentRequest()) == null || (numB2 = sentRequest.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) == null) ? null : Long.valueOf(numB2.intValue());
        e followStatus5 = aVar.getFollowStatus();
        Long lValueOf2 = (followStatus5 == null || (receivedRequest = followStatus5.getReceivedRequest()) == null || (numB = receivedRequest.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) == null) ? null : Long.valueOf(numB.intValue());
        e followStatus6 = aVar.getFollowStatus();
        e.b relationshipStatus = followStatus6 != null ? followStatus6.getRelationshipStatus() : null;
        e followStatus7 = aVar.getFollowStatus();
        Boolean blocking = followStatus7 != null ? followStatus7.getBlocking() : null;
        e followStatus8 = aVar.getFollowStatus();
        Boolean muting = followStatus8 != null ? followStatus8.getMuting() : null;
        e followStatus9 = aVar.getFollowStatus();
        return new d0(bVar, b0VarA, displayName, fullName, zG, str3, lValueOf, lValueOf2, new n0(relationshipStatus, blocking, muting, followStatus9 != null ? followStatus9.getFavorite() : null));
    }
}

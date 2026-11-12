package ei0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 {
    public static final Activity a(Context context) {
        context.getClass();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return a(baseContext);
    }

    public static final void b(Context context) {
        context.getClass();
        Toast.makeText(context, R.string.txt_error_occurred, 0).show();
    }

    public static final List<li0.d0> c(hi0.h hVar) {
        hVar.getClass();
        List<hi0.l> listD = hVar.d();
        if (listD == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(d((hi0.l) it.next()));
        }
        return p13.h0.b1(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0118  */
    public static final li0.d0 d(hi0.l lVar) {
        String strB;
        hi0.c receivedRequest;
        Integer num;
        hi0.c sentRequest;
        Integer num2;
        String fullName;
        Long count;
        hi0.c receivedRequest2;
        lVar.getClass();
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls = lVar.getProfileImageUrls();
        String str = profileImageUrls != null ? profileImageUrls.f46879h : null;
        Long userLevel = lVar.getUserLevel();
        b12.b bVar = new b12.b(str, null, userLevel != null ? f12.u.a((int) userLevel.longValue()) : null, null, null, 26, null);
        String displayName = lVar.getDisplayName();
        String fullName2 = lVar.getFullName();
        boolean zG = p005kotlin.jvm.internal.s.g(lVar.getDisplayName(), ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName());
        hi0.e followStatus = lVar.getFollowStatus();
        if (followStatus != null ? p005kotlin.jvm.internal.s.g(followStatus.getBlocking(), Boolean.TRUE) : false) {
            strB = "";
        } else {
            hi0.e followStatus2 = lVar.getFollowStatus();
            if (followStatus2 != null ? p005kotlin.jvm.internal.s.g(followStatus2.getBlocked(), Boolean.TRUE) : false) {
                strB = "";
            } else {
                do1.o oVar = (do1.o) KoinJavaComponent.get$default(do1.o.class, null, null, 6, null);
                l22.b bVar2 = oVar.f60607a;
                hi0.e followStatus3 = lVar.getFollowStatus();
                if (followStatus3 == null || (receivedRequest2 = followStatus3.getReceivedRequest()) == null || !receivedRequest2.equals(hi0.c.b.CREATED)) {
                    hi0.g info = lVar.getInfo();
                    if (info == null || (fullName = info.getFullName()) == null || (count = lVar.getInfo().getCount()) == null) {
                        strB = lVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION java.lang.String();
                    } else {
                        int iLongValue = (int) count.longValue();
                        hi0.l.b infoStatus = lVar.getInfoStatus();
                        int i14 = infoStatus == null ? -1 : do1.o.a.f60608a[infoStatus.ordinal()];
                        if (i14 == 1) {
                            strB = oVar.b(iLongValue, fullName);
                        } else if (i14 != 2) {
                            strB = lVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION java.lang.String();
                        } else if (iLongValue == 1) {
                            strB = bVar2.a(R.string.msg_both_follow_single_description, fullName);
                        } else if (iLongValue == 2) {
                            strB = bVar2.a(R.string.msg_both_follow_two_description, fullName);
                        } else {
                            strB = iLongValue > 2 ? bVar2.a(R.string.msg_both_follow_multiple_description, fullName, Integer.valueOf(iLongValue - 1)) : null;
                        }
                        if (strB == null) {
                            strB = lVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION java.lang.String();
                        }
                    }
                } else {
                    strB = bVar2.getString(R.string.msg_requested_to_you_description);
                }
            }
        }
        String str2 = strB;
        hi0.e followStatus4 = lVar.getFollowStatus();
        li0.b0 b0VarA = followStatus4 != null ? hi0.f.a(followStatus4) : null;
        hi0.e followStatus5 = lVar.getFollowStatus();
        Long lValueOf = (followStatus5 == null || (sentRequest = followStatus5.getSentRequest()) == null || (num2 = sentRequest.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) == null) ? null : Long.valueOf(num2.intValue());
        hi0.e followStatus6 = lVar.getFollowStatus();
        Long lValueOf2 = (followStatus6 == null || (receivedRequest = followStatus6.getReceivedRequest()) == null || (num = receivedRequest.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) == null) ? null : Long.valueOf(num.intValue());
        hi0.e followStatus7 = lVar.getFollowStatus();
        hi0.e.b relationshipStatus = followStatus7 != null ? followStatus7.getRelationshipStatus() : null;
        hi0.e followStatus8 = lVar.getFollowStatus();
        Boolean blocking = followStatus8 != null ? followStatus8.getBlocking() : null;
        hi0.e followStatus9 = lVar.getFollowStatus();
        Boolean muting = followStatus9 != null ? followStatus9.getMuting() : null;
        hi0.e followStatus10 = lVar.getFollowStatus();
        return new li0.d0(bVar, b0VarA, displayName, fullName2, zG, str2, lValueOf, lValueOf2, new li0.n0(relationshipStatus, blocking, muting, followStatus10 != null ? followStatus10.getFavorite() : null));
    }
}

package wg0;

import am.x0;
import am.z0;
import android.content.Context;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import fo1.m0;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o13.p;
import o53.f0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;
import ps.c1;
import ps.p0;
import ps.q;
import ps.z;

/* JADX INFO: loaded from: classes8.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:109:0x023d A[PHI: r0
      0x023d: PHI (r0v3 java.lang.String) = (r0v1 java.lang.String), (r0v5 java.lang.String) binds: [B:117:0x0253, B:107:0x023a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0119 A[PHI: r9
      0x0119: PHI (r9v8 java.lang.Object) = (r9v5 java.lang.Object), (r9v6 java.lang.Object), (r9v10 java.lang.Object) binds: [B:60:0x012a, B:62:0x0130, B:52:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final a a(jo1.e eVar, Context context, GroupDTO.c cVar, Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map) throws Throwable {
        String strG;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        Object objF;
        String str;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        b bVar;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar2;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar3;
        String fullName;
        String str2;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar4;
        String str3;
        String profileImageUrlMedium;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls3;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls4;
        eVar.getClass();
        context.getClass();
        cVar.getClass();
        Throwable th3 = null;
        vg0.a aVar = (vg0.a) KoinJavaComponent.get$default(vg0.a.class, null, null, 6, null);
        int userProfilePk = (int) eVar.getUserProfilePk();
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar5 = map != null ? map.get(Integer.valueOf(userProfilePk)) : null;
        String displayName = eVar.getDisplayName();
        mo1.d conversationDTO = eVar.getConversationDTO();
        if (conversationDTO == null || (strG = conversationDTO.getOwnerFullName()) == null) {
            String firstName = eVar.getFirstName();
            if (firstName == null) {
                firstName = "";
            }
            String lastName = eVar.getLastName();
            if (lastName == null) {
                lastName = "";
            }
            strG = e5.g(firstName, StringUtils.SPACE, lastName);
        }
        String str4 = strG;
        DateTime dateTime = new DateTime(eVar.getLastUpdatedDate());
        DateTime dateTime2 = new DateTime(eVar.getLastUpdatedDate());
        String body = eVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.TAG_BODY java.lang.String();
        l lVar6 = new l(null, h0.d1(eVar.t()), null, null, 0, 16, null);
        mo1.d conversationDTO2 = eVar.getConversationDTO();
        int numberOfComments = conversationDTO2 != null ? conversationDTO2.getNumberOfComments() : 0;
        mo1.d conversationDTO3 = eVar.getConversationDTO();
        int numberOfLikes = conversationDTO3 != null ? conversationDTO3.getNumberOfLikes() : 0;
        mo1.d conversationDTO4 = eVar.getConversationDTO();
        Long lValueOf = Long.valueOf(conversationDTO4 != null ? conversationDTO4.getConversationPK() : 0L);
        mo1.d conversationDTO5 = eVar.getConversationDTO();
        String uuid = conversationDTO5 != null ? conversationDTO5.getUuid() : null;
        mo1.e highlightedCommentDTO = eVar.getHighlightedCommentDTO();
        if (highlightedCommentDTO == null) {
            bVar = null;
            th3 = null;
        } else {
            List<mo1.a> listH = highlightedCommentDTO.h();
            CharSequence charSequenceG = (listH == null || !(listH.isEmpty() ^ true)) ? highlightedCommentDTO.getBody() : cs1.h.c(highlightedCommentDTO.h(), context, new i(aVar, context, 1));
            if (map != null) {
                lVar2 = map.get(Integer.valueOf((int) highlightedCommentDTO.getUserProfilePk()));
            }
            if (lVar != 0) {
                lVar = th3;
                com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls5 = lVar.getProfileImageUrls();
                if (profileImageUrls5 == null || (objF = profileImageUrls5.f46879h) == null) {
                    if (lVar != 0 || (profileImageUrls = lVar.getProfileImageUrls()) == null) {
                        objF = th3;
                    } else {
                        objF = profileImageUrls.f46873b;
                    }
                    if (objF == null || (objF = highlightedCommentDTO.getAuthorImageUrl()) != null) {
                        lVar = lVar2;
                        str = objF;
                    } else {
                        str = "";
                    }
                } else {
                    lVar = lVar2;
                    str = objF;
                }
            } else {
                if (lVar != 0) {
                    objF = th3;
                } else {
                    objF = th3;
                }
                if (objF == null) {
                    lVar = lVar2;
                    str = objF;
                } else {
                    lVar = lVar2;
                    str = objF;
                }
            }
            String strB = highlightedCommentDTO.getAuthorDisplayName();
            String strD = highlightedCommentDTO.getAuthorFullName();
            bVar = new b(strB, strD == null ? "" : strD, c(highlightedCommentDTO, context, false), c(highlightedCommentDTO, context, true), charSequenceG, highlightedCommentDTO.getUpdated(), new b12.b(str, null, null, null, null, 30, null), highlightedCommentDTO.getNumberOfLikes(), highlightedCommentDTO.getLikedByUser(), highlightedCommentDTO.getConversationCommentUuid());
        }
        mo1.d conversationDTO6 = eVar.getConversationDTO();
        boolean likedByUser = conversationDTO6 != null ? conversationDTO6.getLikedByUser() : false;
        ArrayList arrayList = new ArrayList();
        mo1.g conversationLikersDTO = eVar.getConversationLikersDTO();
        if (conversationLikersDTO != null) {
            int i14 = 0;
            for (Object obj : conversationLikersDTO.f()) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw th3;
                }
                int i16 = userProfilePk;
                long jLongValue = ((Number) obj).longValue();
                if (map != null) {
                    lVar4 = map.get(Integer.valueOf((int) jLongValue));
                } else {
                    lVar3 = th3;
                }
                if (lVar3 == 0 || (fullName = lVar3.getFullName()) == null) {
                    lVar3 = lVar4;
                    lVar3 = lVar4;
                    fullName = (String) h0.e0(i14, conversationLikersDTO.b());
                    if (fullName == null) {
                        fullName = "";
                    }
                }
                if ((lVar3 == 0 || (profileImageUrls2 = lVar3.getProfileImageUrls()) == null || (str2 = profileImageUrls2.f46877f) == null) && (str2 = (String) h0.e0(i14, conversationLikersDTO.d())) == null) {
                    str2 = "";
                }
                arrayList.add(new n(eVar.getDisplayName(), fullName, str2));
                i14 = i15;
                userProfilePk = i16;
            }
        }
        int i17 = userProfilePk;
        m mVar = new m(numberOfComments, numberOfLikes, lValueOf, uuid, bVar, likedByUser, false, arrayList, 64, null);
        DateTime dateTime3 = new DateTime(eVar.getLastUpdatedDate());
        String strP = xy2.b.p(context, dateTime3, dateTime3, false, false);
        DateTime dateTime4 = new DateTime(eVar.getLastUpdatedDate());
        String strP2 = xy2.b.p(context, dateTime4, dateTime4, false, true);
        if (lVar5 == null || (profileImageUrls4 = lVar5.getProfileImageUrls()) == null || (profileImageUrlMedium = profileImageUrls4.f46879h) == null) {
            Object obj2 = (lVar5 == null || (profileImageUrls3 = lVar5.getProfileImageUrls()) == null) ? th3 : profileImageUrls3.f46873b;
            if (obj2 == null) {
                profileImageUrlMedium = eVar.getProfileImageUrlMedium();
                if (profileImageUrlMedium == null) {
                    str3 = "";
                } else {
                    str3 = profileImageUrlMedium;
                }
            } else {
                str3 = obj2;
            }
        } else {
            str3 = profileImageUrlMedium;
        }
        return new a(null, null, null, Integer.valueOf(i17), displayName, str4, dateTime, dateTime2, null, body, false, false, false, false, null, null, false, lVar6, mVar, eVar, cVar, true, null, strP, false, strP2, new b12.b(str3, null, null, null, null, 30, null), null, null, 423755015, null);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:109:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:119:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:122:0x0305  */
    /* JADX WARN: Code duplicated, block: B:124:0x030d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0314  */
    /* JADX WARN: Code duplicated, block: B:131:0x0330  */
    /* JADX WARN: Code duplicated, block: B:133:0x033c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0344  */
    /* JADX WARN: Code duplicated, block: B:139:0x034e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0352  */
    /* JADX WARN: Code duplicated, block: B:143:0x0356  */
    /* JADX WARN: Code duplicated, block: B:147:0x036d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0395  */
    /* JADX WARN: Code duplicated, block: B:155:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:156:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:161:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:169:0x03d5 A[PHI: r1
      0x03d5: PHI (r1v7 java.lang.String) = (r1v2 java.lang.String), (r1v3 java.lang.String), (r1v9 java.lang.String) binds: [B:175:0x03e4, B:177:0x03e8, B:167:0x03d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:170:0x03d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x03da  */
    /* JADX WARN: Code duplicated, block: B:174:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:176:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:182:0x0405  */
    /* JADX WARN: Code duplicated, block: B:187:0x0419  */
    /* JADX WARN: Code duplicated, block: B:191:0x0317 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0358 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0414 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:? A[LOOP:2: B:180:0x03ff->B:200:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0121  */
    /* JADX WARN: Code duplicated, block: B:70:0x0202  */
    /* JADX WARN: Code duplicated, block: B:71:0x020a  */
    /* JADX WARN: Code duplicated, block: B:74:0x022d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0235  */
    /* JADX WARN: Code duplicated, block: B:77:0x0240  */
    /* JADX WARN: Code duplicated, block: B:79:0x0256  */
    /* JADX WARN: Code duplicated, block: B:81:0x025e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0263  */
    /* JADX WARN: Code duplicated, block: B:84:0x0277  */
    /* JADX WARN: Code duplicated, block: B:91:0x0285 A[PHI: r5
      0x0285: PHI (r5v8 java.lang.String) = (r5v4 java.lang.String), (r5v5 java.lang.String), (r5v10 java.lang.String) binds: [B:97:0x0295, B:99:0x0299, B:89:0x0282] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0288 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x028a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0294  */
    /* JADX WARN: Code duplicated, block: B:98:0x0297  */
    public static a b(ActivityListItemDTO activityListItemDTO, Context context, boolean z14, Map map, GroupDTO.c cVar, List list, int i14) {
        DateTime dateTime;
        boolean z15;
        boolean z16;
        d dVar;
        String str;
        g gVar;
        String str2;
        ConversationCommentDTO conversationCommentDTO;
        List<mo1.a> list2;
        String str3;
        DateTime dateTime2;
        CharSequence charSequenceC;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        String str4;
        String str5;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        b bVar;
        String str6;
        String str7;
        String str8;
        String str9;
        Boolean bool;
        boolean z17;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2;
        boolean z18;
        ArrayList<Integer> arrayList;
        boolean z19;
        ArrayList arrayList2;
        DateTime dateTimeN;
        String strP;
        String str10;
        boolean z24;
        DateTime dateTimeN2;
        String strP2;
        String str11;
        String str12;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls3;
        Iterator it;
        Object obj;
        Object next;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls4;
        ArrayList<com.garmin.android.apps.connectmobile.userprofile.model.l> arrayList3;
        ArrayList arrayList4;
        String displayName;
        String fullName;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls5;
        String str13;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar2;
        d dVar2;
        boolean z25 = (i14 & 2) != 0 ? false : z14;
        GroupDTO.c cVar2 = (i14 & 8) != 0 ? GroupDTO.c.NOT_DEFINED : cVar;
        List list3 = (i14 & 16) != 0 ? j0.f134944a : list;
        activityListItemDTO.getClass();
        context.getClass();
        cVar2.getClass();
        list3.getClass();
        vg0.a aVar = (vg0.a) KoinJavaComponent.get$default(vg0.a.class, null, null, 6, null);
        q qVarA = ss.c.a(activityListItemDTO);
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar3 = map != null ? (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(Integer.valueOf(activityListItemDTO.A)) : null;
        Long lValueOf = Long.valueOf(activityListItemDTO.f29250b);
        String strA = new mn.a(new l22.a(context)).a(activityListItemDTO.f29253c);
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar4 = lVar3;
        x0 x0Var = activityListItemDTO.f29265g;
        x0Var.getClass();
        Integer numValueOf = Integer.valueOf(activityListItemDTO.A);
        String str14 = activityListItemDTO.B;
        if (str14 == null) {
            str14 = "";
        }
        String str15 = activityListItemDTO.C;
        if (str15 == null) {
            str15 = "";
        }
        DateTime dateTimeN3 = c22.j0.N(activityListItemDTO.f29262f, true);
        List list4 = list3;
        DateTime dateTimeN4 = c22.j0.N(activityListItemDTO.f29259e, false);
        am.l lVarD = activityListItemDTO.D();
        String str16 = str15;
        String str17 = activityListItemDTO.f29256d;
        boolean z26 = activityListItemDTO.f29260e1;
        boolean z27 = activityListItemDTO.f29257d1;
        p0 p0Var = activityListItemDTO.f29268h;
        if (p0Var != null) {
            dateTime = dateTimeN4;
            boolean z28 = "race".equalsIgnoreCase(p0Var.getTypeKey());
            z15 = activityListItemDTO.f29274j1;
            List<aq.c> listA = aVar.a(context, qVarA);
            boolean z29 = z28;
            ArrayList arrayListD1 = h0.d1(f0.K(activityListItemDTO.Q0));
            if (!z0.X(activityListItemDTO.f29265g.f4358a) || z0.a0(activityListItemDTO.f29265g.f4358a)) {
                z16 = z15;
                dVar = null;
            } else {
                if (activityListItemDTO.f29298w) {
                    ps.m mVar = activityListItemDTO.f29300x;
                    if (mVar != null) {
                        c1 c1VarC = e.c(mVar);
                        p<com.garmin.android.library.mapsdkadapter.f, com.garmin.android.library.mapsdkadapter.f> pVarA = e.a(mVar);
                        z16 = z15;
                        x0 x0Var2 = activityListItemDTO.f29265g;
                        x0Var2.getClass();
                        dVar2 = new d(x0Var2, c1VarC, pVarA.f128594a, pVarA.f128595b, null, null, null, null, null, null, null, false, 4080, null);
                    }
                    z16 = z15;
                    dVar = null;
                } else {
                    z16 = z15;
                    if (activityListItemDTO.f29302y) {
                        ps.h hVar = activityListItemDTO.f29304z;
                        if (hVar != null) {
                            x0 x0Var3 = activityListItemDTO.f29265g;
                            x0Var3.getClass();
                            List<ps.i> listF = hVar.f();
                            double lowerLeftLat = hVar.getLowerLeftLat();
                            double lowerLeftLon = hVar.getLowerLeftLon();
                            com.garmin.android.library.mapsdkadapter.i.b bVar2 = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
                            dVar2 = new d(x0Var3, null, new com.garmin.android.library.mapsdkadapter.f(lowerLeftLat, lowerLeftLon, bVar2), new com.garmin.android.library.mapsdkadapter.f(hVar.getUpperRightLat(), hVar.getUpperRightLon(), bVar2), null, null, null, null, listF, null, null, false, 3826, null);
                        }
                    } else if (z0.b(x0.D, activityListItemDTO.f29265g.f4358a)) {
                        com.garmin.android.library.mapsdkadapter.f fVar = (Double.isNaN(activityListItemDTO.f29288q) || Double.isNaN(activityListItemDTO.f29290r)) ? null : new com.garmin.android.library.mapsdkadapter.f(activityListItemDTO.f29288q, activityListItemDTO.f29290r, com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                        com.garmin.android.library.mapsdkadapter.f fVar2 = (Double.isNaN(activityListItemDTO.f29293t) || Double.isNaN(activityListItemDTO.f29296v)) ? null : new com.garmin.android.library.mapsdkadapter.f(activityListItemDTO.f29293t, activityListItemDTO.f29296v, com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                        if (fVar != null || fVar2 != null) {
                            x0 x0Var4 = activityListItemDTO.f29265g;
                            x0Var4.getClass();
                            dVar = new d(x0Var4, null, fVar, fVar2, null, null, null, null, null, null, null, false, 4082, null);
                        }
                    }
                    dVar = null;
                }
                dVar = dVar2;
            }
            k kVarS = f0.s(activityListItemDTO.f29250b, activityListItemDTO.P0);
            str = activityListItemDTO.f29270h2;
            if (str != null) {
                gVar = new g(str);
            } else {
                gVar = null;
            }
            l lVar5 = new l(dVar, arrayListD1, kVarS, gVar, 0, 16, null);
            int i15 = activityListItemDTO.T0;
            int i16 = activityListItemDTO.S0;
            Long lValueOf2 = Long.valueOf(activityListItemDTO.f29266g1);
            str2 = activityListItemDTO.f29263f1;
            conversationCommentDTO = activityListItemDTO.R0;
            if (conversationCommentDTO == null) {
                str3 = str2;
                dateTime2 = dateTimeN3;
                bVar = null;
            } else {
                list2 = conversationCommentDTO.f44562q;
                list2.getClass();
                if (list2.isEmpty()) {
                    str3 = str2;
                    dateTime2 = dateTimeN3;
                    charSequenceC = conversationCommentDTO.f44555j;
                    if (charSequenceC == null) {
                        charSequenceC = "";
                    }
                } else {
                    List<mo1.a> list5 = conversationCommentDTO.f44562q;
                    list5.getClass();
                    str3 = str2;
                    dateTime2 = dateTimeN3;
                    charSequenceC = cs1.h.c(list5, context, new i(aVar, context, 0));
                }
                CharSequence charSequence = charSequenceC;
                if (map != null) {
                    String str18 = conversationCommentDTO.f44558m;
                    str18.getClass();
                    lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(Integer.valueOf(Integer.parseInt(str18)));
                } else {
                    lVar = null;
                }
                if (lVar != null || (profileImageUrls2 = lVar.getProfileImageUrls()) == null || (str4 = profileImageUrls2.f46879h) == null) {
                    if (lVar != null || (profileImageUrls = lVar.getProfileImageUrls()) == null) {
                        str4 = null;
                    } else {
                        str4 = profileImageUrls.f46873b;
                    }
                    if (str4 == null || (str4 = conversationCommentDTO.f44552g) != null) {
                        str5 = str4;
                    } else {
                        str5 = "";
                    }
                } else {
                    str5 = str4;
                }
                str6 = conversationCommentDTO.f44550e;
                if (str6 == null) {
                    str7 = "";
                } else {
                    str7 = str6;
                }
                str8 = conversationCommentDTO.f44551f;
                if (str8 == null) {
                    str9 = "";
                } else {
                    str9 = str8;
                }
                String strA2 = m0.a(conversationCommentDTO, context, false);
                String strA3 = m0.a(conversationCommentDTO, context, true);
                bool = conversationCommentDTO.f44559n;
                if (bool == null && bool.booleanValue()) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                b12.b bVar3 = new b12.b(str5, null, null, null, null, 30, null);
                int i17 = conversationCommentDTO.f44557l;
                boolean z34 = conversationCommentDTO.f44556k;
                String str19 = conversationCommentDTO.f44546a;
                str19.getClass();
                bVar = new b(str7, str9, strA2, strA3, charSequence, z17, bVar3, i17, z34, str19);
            }
            z18 = activityListItemDTO.V0;
            arrayList = activityListItemDTO.N1;
            if (arrayList != null) {
                arrayList3 = new ArrayList();
                for (Integer num : arrayList) {
                    if (map != null) {
                        lVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(num);
                    } else {
                        lVar2 = null;
                    }
                    if (lVar2 != null) {
                        arrayList3.add(lVar2);
                    }
                }
                arrayList4 = new ArrayList(y.r(arrayList3, 10));
                for (com.garmin.android.apps.connectmobile.userprofile.model.l lVar6 : arrayList3) {
                    displayName = lVar6.getDisplayName();
                    if (displayName == null) {
                        displayName = "";
                    }
                    fullName = lVar6.getFullName();
                    if (fullName == null) {
                        fullName = "";
                    }
                    profileImageUrls5 = lVar6.getProfileImageUrls();
                    boolean z35 = z18;
                    if (profileImageUrls5 == null) {
                        str13 = "";
                    } else {
                        str13 = profileImageUrls5.f46877f;
                        if (str13 == null) {
                            str13 = profileImageUrls5.f46874c;
                        }
                        if (str13 == null) {
                            str13 = "";
                        }
                    }
                    arrayList4.add(new n(displayName, fullName, str13));
                    z18 = z35;
                }
                z19 = z18;
                arrayList2 = new ArrayList(arrayList4);
            } else {
                z19 = z18;
                arrayList2 = new ArrayList();
            }
            m mVar2 = new m(i15, i16, lValueOf2, str3, bVar, z19, false, arrayList2, 64, null);
            dateTimeN = c22.j0.N(activityListItemDTO.f29259e, false);
            DateTime dateTimeN5 = c22.j0.N(activityListItemDTO.f29262f, true);
            if (dateTimeN != null || dateTimeN5 == null) {
                strP = "";
            } else {
                strP = xy2.b.p(context, dateTimeN5, dateTimeN, true, false);
            }
            str10 = activityListItemDTO.f29249a2;
            z.f140416b.getClass();
            if (z.a.a(str10) == z.PROCESSING) {
                z24 = true;
            } else {
                z24 = false;
            }
            dateTimeN2 = c22.j0.N(activityListItemDTO.f29259e, false);
            DateTime dateTimeN6 = c22.j0.N(activityListItemDTO.f29262f, true);
            if (dateTimeN2 != null || dateTimeN6 == null) {
                strP2 = "";
            } else {
                strP2 = xy2.b.p(context, dateTimeN6, dateTimeN2, true, true);
            }
            if (lVar4 != null || (profileImageUrls4 = lVar4.getProfileImageUrls()) == null || (str11 = profileImageUrls4.f46879h) == null) {
                if (lVar4 != null || (profileImageUrls3 = lVar4.getProfileImageUrls()) == null) {
                    str11 = null;
                } else {
                    str11 = profileImageUrls3.f46873b;
                }
                if (str11 == null || (str11 = activityListItemDTO.E) != null) {
                    str12 = str11;
                } else {
                    str12 = "";
                }
            } else {
                str12 = str11;
            }
            b12.b bVar4 = new b12.b(str12, null, null, null, null, 30, null);
            it = list4.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = null;
                    break;
                }
                next = it.next();
                if (s.g((String) next, activityListItemDTO.B)) {
                    obj = next;
                    break;
                }
            }
            return new a(lValueOf, strA, x0Var, numValueOf, str14, str16, dateTime2, dateTime, lVarD, str17, z26, z27, z29, z16, listA, qVarA, false, lVar5, mVar2, null, cVar2, z25, null, strP, z24, strP2, bVar4, Boolean.valueOf(obj != null), activityListItemDTO.f29261e2, 4784128, null);
        }
        dateTime = dateTimeN4;
        z15 = activityListItemDTO.f29274j1;
        List<aq.c> listA2 = aVar.a(context, qVarA);
        boolean z210 = z28;
        ArrayList arrayListD2 = h0.d1(f0.K(activityListItemDTO.Q0));
        if (z0.X(activityListItemDTO.f29265g.f4358a)) {
            z16 = z15;
            dVar = null;
        } else {
            z16 = z15;
            dVar = null;
        }
        k kVarS2 = f0.s(activityListItemDTO.f29250b, activityListItemDTO.P0);
        str = activityListItemDTO.f29270h2;
        if (str != null) {
            gVar = new g(str);
        } else {
            gVar = null;
        }
        l lVar7 = new l(dVar, arrayListD2, kVarS2, gVar, 0, 16, null);
        int i18 = activityListItemDTO.T0;
        int i19 = activityListItemDTO.S0;
        Long lValueOf3 = Long.valueOf(activityListItemDTO.f29266g1);
        str2 = activityListItemDTO.f29263f1;
        conversationCommentDTO = activityListItemDTO.R0;
        if (conversationCommentDTO == null) {
            str3 = str2;
            dateTime2 = dateTimeN3;
            bVar = null;
        } else {
            list2 = conversationCommentDTO.f44562q;
            list2.getClass();
            if (list2.isEmpty()) {
                List<mo1.a> list6 = conversationCommentDTO.f44562q;
                list6.getClass();
                str3 = str2;
                dateTime2 = dateTimeN3;
                charSequenceC = cs1.h.c(list6, context, new i(aVar, context, 0));
            } else {
                str3 = str2;
                dateTime2 = dateTimeN3;
                charSequenceC = conversationCommentDTO.f44555j;
                if (charSequenceC == null) {
                    charSequenceC = "";
                }
            }
            CharSequence charSequence2 = charSequenceC;
            if (map != null) {
                String str110 = conversationCommentDTO.f44558m;
                str110.getClass();
                lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(Integer.valueOf(Integer.parseInt(str110)));
            } else {
                lVar = null;
            }
            if (lVar != null) {
                if (lVar != null) {
                    str4 = null;
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    str5 = str4;
                } else {
                    str5 = str4;
                }
            } else {
                if (lVar != null) {
                    str4 = null;
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    str5 = str4;
                } else {
                    str5 = str4;
                }
            }
            str6 = conversationCommentDTO.f44550e;
            if (str6 == null) {
                str7 = "";
            } else {
                str7 = str6;
            }
            str8 = conversationCommentDTO.f44551f;
            if (str8 == null) {
                str9 = "";
            } else {
                str9 = str8;
            }
            String strA4 = m0.a(conversationCommentDTO, context, false);
            String strA5 = m0.a(conversationCommentDTO, context, true);
            bool = conversationCommentDTO.f44559n;
            if (bool == null) {
                z17 = false;
            } else {
                z17 = false;
            }
            b12.b bVar5 = new b12.b(str5, null, null, null, null, 30, null);
            int i110 = conversationCommentDTO.f44557l;
            boolean z36 = conversationCommentDTO.f44556k;
            String str111 = conversationCommentDTO.f44546a;
            str111.getClass();
            bVar = new b(str7, str9, strA4, strA5, charSequence2, z17, bVar5, i110, z36, str111);
        }
        z18 = activityListItemDTO.V0;
        arrayList = activityListItemDTO.N1;
        if (arrayList != null) {
            arrayList3 = new ArrayList();
            while (r4.hasNext()) {
                if (map != null) {
                    lVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(num);
                } else {
                    lVar2 = null;
                }
                if (lVar2 != null) {
                    arrayList3.add(lVar2);
                }
            }
            arrayList4 = new ArrayList(y.r(arrayList3, 10));
            while (r4.hasNext()) {
                displayName = lVar6.getDisplayName();
                if (displayName == null) {
                    displayName = "";
                }
                fullName = lVar6.getFullName();
                if (fullName == null) {
                    fullName = "";
                }
                profileImageUrls5 = lVar6.getProfileImageUrls();
                boolean z37 = z18;
                if (profileImageUrls5 == null) {
                    str13 = "";
                } else {
                    str13 = profileImageUrls5.f46877f;
                    if (str13 == null) {
                        str13 = profileImageUrls5.f46874c;
                    }
                    if (str13 == null) {
                        str13 = "";
                    }
                }
                arrayList4.add(new n(displayName, fullName, str13));
                z18 = z37;
            }
            z19 = z18;
            arrayList2 = new ArrayList(arrayList4);
        } else {
            z19 = z18;
            arrayList2 = new ArrayList();
        }
        m mVar3 = new m(i18, i19, lValueOf3, str3, bVar, z19, false, arrayList2, 64, null);
        dateTimeN = c22.j0.N(activityListItemDTO.f29259e, false);
        DateTime dateTimeN7 = c22.j0.N(activityListItemDTO.f29262f, true);
        if (dateTimeN != null) {
            strP = "";
        } else {
            strP = "";
        }
        str10 = activityListItemDTO.f29249a2;
        z.f140416b.getClass();
        if (z.a.a(str10) == z.PROCESSING) {
            z24 = true;
        } else {
            z24 = false;
        }
        dateTimeN2 = c22.j0.N(activityListItemDTO.f29259e, false);
        DateTime dateTimeN8 = c22.j0.N(activityListItemDTO.f29262f, true);
        if (dateTimeN2 != null) {
            strP2 = "";
        } else {
            strP2 = "";
        }
        if (lVar4 != null) {
            if (lVar4 != null) {
                str11 = null;
            } else {
                str11 = null;
            }
            if (str11 == null) {
                str12 = str11;
            } else {
                str12 = str11;
            }
        } else {
            if (lVar4 != null) {
                str11 = null;
            } else {
                str11 = null;
            }
            if (str11 == null) {
                str12 = str11;
            } else {
                str12 = str11;
            }
        }
        b12.b bVar6 = new b12.b(str12, null, null, null, null, 30, null);
        it = list4.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = null;
                break;
            }
            next = it.next();
            if (s.g((String) next, activityListItemDTO.B)) {
                obj = next;
                break;
            }
        }
        return new a(lValueOf, strA, x0Var, numValueOf, str14, str16, dateTime2, dateTime, lVarD, str17, z26, z27, z210, z16, listA2, qVarA, false, lVar7, mVar3, null, cVar2, z25, null, strP, z24, strP2, bVar6, Boolean.valueOf(obj != null), activityListItemDTO.f29261e2, 4784128, null);
    }

    public static final String c(mo1.e eVar, Context context, boolean z14) {
        if (eVar.getCreateDate().getTime() <= 0) {
            return "";
        }
        c22.j0 j0Var = c22.j0.f23099a;
        Long lValueOf = Long.valueOf(eVar.getCreateDate().getTime());
        j0Var.getClass();
        DateTime dateTimeB = c22.j0.B(lValueOf);
        return dateTimeB != null ? xy2.b.q(context, dateTimeB, z14, 12) : "";
    }

    public static final ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            arrayList2.add(new c(i14, (ps.j) obj));
            i14 = i15;
        }
        return arrayList2;
    }
}

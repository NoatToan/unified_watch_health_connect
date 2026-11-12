package xz0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.notifications.model.InboxRequestItem;
import com.garmin.android.apps.connectmobile.v2;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.y;
import sz0.a0;
import sz0.b0;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0001\u0011B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lxz0/h;", "Lyc/h3;", "", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem;", "Lsz0/a0;", "notificationsRepo", "Lre0/h;", "accountSharingService", "La22/i;", "userProfileRepo", "Lkotlin/Function0;", "Landroid/content/Context;", "requireContext", "Lxz0/c;", "cache", "<init>", "(Lsz0/a0;Lre0/h;La22/i;Le23/a;Lxz0/c;)V", "a", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends h3<String, InboxRequestItem<?>> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f192769g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f192770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re0.h f192771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a22.i f192772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.a<Context> f192773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f192774f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f192775a;

        static {
            int[] iArr = new int[ue0.c.values().length];
            try {
                iArr[ue0.c.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ue0.c.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f192775a = iArr;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(a0 a0Var, re0.h hVar, a22.i iVar, e23.a<? extends Context> aVar, c cVar) {
        a0Var.getClass();
        hVar.getClass();
        iVar.getClass();
        aVar.getClass();
        cVar.getClass();
        this.f192770b = a0Var;
        this.f192771c = hVar;
        this.f192772d = iVar;
        this.f192773e = aVar;
        this.f192774f = cVar;
    }

    @Override // yc.h3
    public final String c(i3<String, InboxRequestItem<?>> i3Var) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x027a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0292  */
    /* JADX WARN: Code duplicated, block: B:108:0x029a  */
    /* JADX WARN: Code duplicated, block: B:111:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:120:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:122:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:124:0x0303  */
    /* JADX WARN: Code duplicated, block: B:125:0x030d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0315  */
    /* JADX WARN: Code duplicated, block: B:130:0x031c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0323  */
    /* JADX WARN: Code duplicated, block: B:134:0x032b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0343  */
    /* JADX WARN: Code duplicated, block: B:140:0x034b  */
    /* JADX WARN: Code duplicated, block: B:143:0x035b  */
    /* JADX WARN: Code duplicated, block: B:149:0x0369  */
    /* JADX WARN: Code duplicated, block: B:151:0x0397  */
    /* JADX WARN: Code duplicated, block: B:153:0x03af  */
    /* JADX WARN: Code duplicated, block: B:155:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:156:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:158:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:162:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:165:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:169:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:172:0x0402  */
    /* JADX WARN: Code duplicated, block: B:178:0x0410  */
    /* JADX WARN: Code duplicated, block: B:181:0x0445  */
    /* JADX WARN: Code duplicated, block: B:184:0x045d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0461  */
    /* JADX WARN: Code duplicated, block: B:188:0x047b  */
    /* JADX WARN: Code duplicated, block: B:190:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x0115  */
    /* JADX WARN: Code duplicated, block: B:42:0x0130  */
    /* JADX WARN: Code duplicated, block: B:43:0x0132  */
    /* JADX WARN: Code duplicated, block: B:46:0x0141  */
    /* JADX WARN: Code duplicated, block: B:48:0x0145  */
    /* JADX WARN: Code duplicated, block: B:50:0x0148  */
    /* JADX WARN: Code duplicated, block: B:52:0x014b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0161  */
    /* JADX WARN: Code duplicated, block: B:56:0x0167  */
    /* JADX WARN: Code duplicated, block: B:57:0x0171  */
    /* JADX WARN: Code duplicated, block: B:59:0x0179  */
    /* JADX WARN: Code duplicated, block: B:62:0x0180  */
    /* JADX WARN: Code duplicated, block: B:63:0x0190  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x0236  */
    /* JADX WARN: Code duplicated, block: B:90:0x024c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0252  */
    /* JADX WARN: Code duplicated, block: B:93:0x025c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0264  */
    /* JADX WARN: Code duplicated, block: B:98:0x026b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0272  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
    
        if (r1 == r3) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v0, types: [xz0.h] */
    /* JADX WARN: Type inference failed for: r7v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    @Override // yc.h3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(h3.a aVar, v13.c cVar) {
        k kVar;
        String str;
        int i14;
        Context contextInvoke;
        List arrayList;
        List list;
        Context context;
        v2 v2Var;
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> mapD;
        List<uz0.d> listF;
        ?? arrayList2;
        vz0.b bVarB;
        int i15;
        uz0.m mVar;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        DateTime requestStartTime;
        String strQ;
        String fullName;
        InboxRequestItem followRequest;
        String profileImageUrlSmall;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        Long userId;
        Integer numValueOf;
        InboxRequestItem deviceInviteRequest;
        uz0.b bVar;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar2;
        DateTime createDate;
        String strQ2;
        String fullName2;
        String groupName;
        String profileImageUrlSmall2;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2;
        Long userProfileId;
        Integer numValueOf2;
        uz0.b bVar2;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar3;
        DateTime createDate2;
        String strQ3;
        String fullName3;
        String groupName2;
        String profileImageUrlSmall3;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls3;
        Long userProfileId2;
        Integer numValueOf3;
        com.garmin.android.apps.connectmobile.smartscale.model.b bVar3;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar4;
        Long inviteDate;
        String strQ4;
        String invitorName;
        String productDisplayName;
        String invitorProfilePicURL;
        String invitorProfilePicURL2;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls4;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls5;
        Long invitorID;
        Integer numValueOf4;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i16 = kVar.f192791g;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                kVar.f192791g = i16 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objF = kVar.f192789e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i17 = kVar.f192791g;
        int i18 = 2;
        int i19 = 1;
        c cVar2 = this.f192774f;
        if (i17 != 0) {
            if (i17 == 1) {
                i14 = kVar.f192788d;
                arrayList = kVar.f192787c;
                contextInvoke = kVar.f192786b;
                str = kVar.f192785a;
                o13.r.b(objF);
            } else {
                if (i17 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = kVar.f192787c;
                context = kVar.f192786b;
                o13.r.b(objF);
            }
            v2Var = (v2) objF;
            if (!(v2Var instanceof v2.b)) {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String strH = androidx.room.a0.h("load: Error: result=[", v2Var, "]");
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var, "InboxRequestPagingSource", strH);
                return new h3.b.a(((v2.a) v2Var).f47383a);
            }
            String strH2 = androidx.room.a0.h("load: Success: result=[", v2Var, "]");
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var2, "InboxRequestPagingSource", strH2);
            uz0.e eVar = (uz0.e) ((v2.b) v2Var).f47386a;
            mapD = eVar.d();
            listF = eVar.f();
            if (listF != null) {
                arrayList2 = new ArrayList(y.r(listF, 10));
                for (uz0.d dVar : listF) {
                    dVar.getClass();
                    context.getClass();
                    vz0.b.a aVar5 = vz0.b.f180871b;
                    Integer requestKey = dVar.getRequestKey();
                    aVar5.getClass();
                    bVarB = vz0.b.a.b(requestKey);
                    if (bVarB == null) {
                        i15 = -1;
                    } else {
                        i15 = l.a.f192792a[bVarB.ordinal()];
                    }
                    if (i15 == i19) {
                        Object objFromJson = new Gson().fromJson(dVar.getData(), (Class<Object>) uz0.m.class);
                        objFromJson.getClass();
                        mVar = (uz0.m) objFromJson;
                        if (mapD != null) {
                            userId = mVar.getUserId();
                            if (userId != null) {
                                numValueOf = Integer.valueOf((int) userId.longValue());
                            } else {
                                numValueOf = null;
                            }
                            lVar = mapD.get(numValueOf);
                        } else {
                            lVar = null;
                        }
                        requestStartTime = mVar.getRequestStartTime();
                        if (requestStartTime != null) {
                            strQ = xy2.b.q(context, requestStartTime, false, 28);
                        } else {
                            strQ = null;
                        }
                        fullName = mVar.getFullName();
                        if (fullName == null) {
                            fullName = mVar.getDisplayName();
                        }
                        String string = context.getString(R.string.follow_request_message, fullName);
                        string.getClass();
                        CharSequence charSequenceB = sz0.o.b(context, string, fullName != null ? fullName : "");
                        if (lVar != null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (profileImageUrlSmall = profileImageUrls.f46879h) == null) {
                            profileImageUrlSmall = mVar.getProfileImageUrlSmall();
                        }
                        followRequest = new InboxRequestItem.FollowRequest(bVarB, new b12.b(profileImageUrlSmall, null, null, null, null, 30, null), charSequenceB, mVar, new InboxRequestItem.ViewState(null, strQ, null, false, mVar.getRequestViewed(), 12, null));
                    } else if (i15 != i18) {
                        if (i15 == 3) {
                            Object objFromJson2 = new Gson().fromJson(dVar.getData(), (Class<Object>) uz0.b.class);
                            objFromJson2.getClass();
                            bVar2 = (uz0.b) objFromJson2;
                            if (mapD != null) {
                                userProfileId2 = bVar2.getUserProfileId();
                                if (userProfileId2 != null) {
                                    numValueOf3 = Integer.valueOf((int) userProfileId2.longValue());
                                } else {
                                    numValueOf3 = null;
                                }
                                lVar3 = mapD.get(numValueOf3);
                            } else {
                                lVar3 = null;
                            }
                            createDate2 = bVar2.getCreateDate();
                            if (createDate2 != null) {
                                strQ3 = xy2.b.q(context, createDate2, false, 28);
                            } else {
                                strQ3 = null;
                            }
                            fullName3 = bVar2.getFullName();
                            if (fullName3 == null) {
                                fullName3 = bVar2.getDisplayName();
                            }
                            String string2 = context.getString(R.string.pn_member_request, fullName3, bVar2.getGroupName());
                            string2.getClass();
                            if (fullName3 == null) {
                                fullName3 = "";
                            }
                            groupName2 = bVar2.getGroupName();
                            if (groupName2 == null) {
                                groupName2 = "";
                            }
                            CharSequence charSequenceB2 = sz0.o.b(context, string2, fullName3, groupName2);
                            if (lVar3 != null || (profileImageUrls3 = lVar3.getProfileImageUrls()) == null || (profileImageUrlSmall3 = profileImageUrls3.f46879h) == null) {
                                profileImageUrlSmall3 = bVar2.getProfileImageUrlSmall();
                            }
                            followRequest = new InboxRequestItem.InboxGroupInviteRequest(bVarB, new b12.b(profileImageUrlSmall3, null, null, null, null, 30, null), charSequenceB2, bVar2, new InboxRequestItem.ViewState(null, strQ3, null, false, bVar2.getRequestViewed(), 12, null));
                        } else {
                            if (i15 != 4) {
                                vb.h.s("Need implement transfer dto to request item by request key");
                                return null;
                            }
                            Object objFromJson3 = new Gson().fromJson(dVar.getData(), (Class<Object>) com.garmin.android.apps.connectmobile.smartscale.model.b.class);
                            objFromJson3.getClass();
                            bVar3 = (com.garmin.android.apps.connectmobile.smartscale.model.b) objFromJson3;
                            if (mapD != null) {
                                invitorID = bVar3.getInvitorID();
                                if (invitorID != null) {
                                    numValueOf4 = Integer.valueOf((int) invitorID.longValue());
                                } else {
                                    numValueOf4 = null;
                                }
                                lVar4 = mapD.get(numValueOf4);
                            } else {
                                lVar4 = null;
                            }
                            inviteDate = bVar3.getInviteDate();
                            if (inviteDate != null) {
                                strQ4 = xy2.b.q(context, new DateTime(inviteDate.longValue()), false, 28);
                            } else {
                                strQ4 = null;
                            }
                            String string3 = context.getString(R.string.msg_user_invitation_to_device, bVar3.getInvitorName(), bVar3.getProductDisplayName());
                            string3.getClass();
                            invitorName = bVar3.getInvitorName();
                            if (invitorName == null) {
                                invitorName = "";
                            }
                            productDisplayName = bVar3.getProductDisplayName();
                            if (productDisplayName == null) {
                                productDisplayName = "";
                            }
                            CharSequence charSequenceB3 = sz0.o.b(context, string3, invitorName, productDisplayName);
                            if (lVar4 != null || (profileImageUrls5 = lVar4.getProfileImageUrls()) == null || (invitorProfilePicURL = profileImageUrls5.f46879h) == null) {
                                invitorProfilePicURL = bVar3.getInvitorProfilePicURL();
                            }
                            bVar3.f44443p = new b12.b(invitorProfilePicURL, null, null, null, null, 30, null);
                            vz0.b bVar4 = vz0.b.DEVICE_INVITE;
                            if (lVar4 != null || (profileImageUrls4 = lVar4.getProfileImageUrls()) == null || (invitorProfilePicURL2 = profileImageUrls4.f46879h) == null) {
                                invitorProfilePicURL2 = bVar3.getInvitorProfilePicURL();
                            }
                            deviceInviteRequest = new InboxRequestItem.DeviceInviteRequest(bVar4, new b12.b(invitorProfilePicURL2, null, null, null, null, 30, null), charSequenceB3, bVar3, new InboxRequestItem.ViewState(null, strQ4, null, false, bVar3.getRequestViewed(), 12, null));
                        }
                        arrayList2.add(deviceInviteRequest);
                        i18 = 2;
                        i19 = 1;
                    } else {
                        Object objFromJson4 = new Gson().fromJson(dVar.getData(), (Class<Object>) uz0.b.class);
                        objFromJson4.getClass();
                        bVar = (uz0.b) objFromJson4;
                        if (mapD != null) {
                            userProfileId = bVar.getUserProfileId();
                            if (userProfileId != null) {
                                numValueOf2 = Integer.valueOf((int) userProfileId.longValue());
                            } else {
                                numValueOf2 = null;
                            }
                            lVar2 = mapD.get(numValueOf2);
                        } else {
                            lVar2 = null;
                        }
                        createDate = bVar.getCreateDate();
                        if (createDate != null) {
                            strQ2 = xy2.b.q(context, createDate, false, 28);
                        } else {
                            strQ2 = null;
                        }
                        fullName2 = bVar.getFullName();
                        if (fullName2 == null) {
                            fullName2 = bVar.getDisplayName();
                        }
                        String string4 = context.getString(R.string.pn_group_invite, fullName2, bVar.getGroupName());
                        string4.getClass();
                        if (fullName2 == null) {
                            fullName2 = "";
                        }
                        groupName = bVar.getGroupName();
                        if (groupName == null) {
                            groupName = "";
                        }
                        CharSequence charSequenceB4 = sz0.o.b(context, string4, fullName2, groupName);
                        if (lVar2 != null || (profileImageUrls2 = lVar2.getProfileImageUrls()) == null || (profileImageUrlSmall2 = profileImageUrls2.f46879h) == null) {
                            profileImageUrlSmall2 = bVar.getProfileImageUrlSmall();
                        }
                        followRequest = new InboxRequestItem.InboxGroupInviteRequest(bVarB, new b12.b(profileImageUrlSmall2, null, null, null, null, 30, null), charSequenceB4, bVar, new InboxRequestItem.ViewState(null, strQ2, null, false, bVar.getRequestViewed(), 12, null));
                    }
                    deviceInviteRequest = followRequest;
                    arrayList2.add(deviceInviteRequest);
                    i18 = 2;
                    i19 = 1;
                }
            } else {
                arrayList2 = j0.f134944a;
            }
            list.addAll((Collection) arrayList2);
            String nextCursor = eVar.getNextCursor();
            cVar2.f192758a.addAll(list);
            cVar2.f192759b = nextCursor;
            return new h3.b.c(list, null, nextCursor);
        }
        o13.r.b(objF);
        if (!cVar2.f192760c) {
            List listB1 = h0.b1(cVar2.f192758a);
            String strH3 = tn.k.h("cachedItems=[", "]", listB1);
            i2.a aVar6 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar6.getClass();
            i2.a.b(a2Var3, "InboxRequestPagingSource", strH3);
            cVar2.f192760c = true;
            if (!listB1.isEmpty()) {
                return new h3.b.c(listB1, null, cVar2.f192759b);
            }
        }
        str = (String) aVar.a();
        i14 = aVar.f196007a;
        String strE = c22.t.e(i14, "load: cursor=[", str, "], limit=[", "]");
        i2.a aVar7 = i2.f36769a;
        a2 a2Var4 = a2.GENERAL;
        aVar7.getClass();
        i2.a.b(a2Var4, "InboxRequestPagingSource", strE);
        contextInvoke = this.f192773e.invoke();
        arrayList = new ArrayList();
        if (str == null) {
            kVar.f192785a = str;
            kVar.f192786b = contextInvoke;
            kVar.f192787c = arrayList;
            kVar.f192788d = i14;
            kVar.f192791g = 1;
            objF = f(contextInvoke, kVar);
        } else {
            kVar.f192785a = null;
            kVar.f192786b = contextInvoke;
            kVar.f192787c = arrayList;
            kVar.f192788d = i14;
            kVar.f192791g = 2;
            a0 a0Var = this.f192770b;
            a0Var.getClass();
            objF = f0.J(a0Var, new b0(a0Var, i14, str, null), kVar);
            if (objF != aVar2) {
                list = arrayList;
                context = contextInvoke;
                v2Var = (v2) objF;
                if (!(v2Var instanceof v2.b)) {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    String strH4 = androidx.room.a0.h("load: Error: result=[", v2Var, "]");
                    i2.a aVar8 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar8.getClass();
                    i2.a.b(a2Var5, "InboxRequestPagingSource", strH4);
                    return new h3.b.a(((v2.a) v2Var).f47383a);
                }
                String strH5 = androidx.room.a0.h("load: Success: result=[", v2Var, "]");
                i2.a aVar9 = i2.f36769a;
                a2 a2Var6 = a2.GENERAL;
                aVar9.getClass();
                i2.a.b(a2Var6, "InboxRequestPagingSource", strH5);
                uz0.e eVar2 = (uz0.e) ((v2.b) v2Var).f47386a;
                mapD = eVar2.d();
                listF = eVar2.f();
                if (listF != null) {
                    arrayList2 = new ArrayList(y.r(listF, 10));
                    while (r6.hasNext()) {
                        dVar.getClass();
                        context.getClass();
                        vz0.b.a aVar10 = vz0.b.f180871b;
                        Integer requestKey2 = dVar.getRequestKey();
                        aVar10.getClass();
                        bVarB = vz0.b.a.b(requestKey2);
                        if (bVarB == null) {
                            i15 = -1;
                        } else {
                            i15 = l.a.f192792a[bVarB.ordinal()];
                        }
                        if (i15 == i19) {
                            Object objFromJson5 = new Gson().fromJson(dVar.getData(), (Class<Object>) uz0.m.class);
                            objFromJson5.getClass();
                            mVar = (uz0.m) objFromJson5;
                            if (mapD != null) {
                                userId = mVar.getUserId();
                                if (userId != null) {
                                    numValueOf = Integer.valueOf((int) userId.longValue());
                                } else {
                                    numValueOf = null;
                                }
                                lVar = mapD.get(numValueOf);
                            } else {
                                lVar = null;
                            }
                            requestStartTime = mVar.getRequestStartTime();
                            if (requestStartTime != null) {
                                strQ = xy2.b.q(context, requestStartTime, false, 28);
                            } else {
                                strQ = null;
                            }
                            fullName = mVar.getFullName();
                            if (fullName == null) {
                                fullName = mVar.getDisplayName();
                            }
                            String string5 = context.getString(R.string.follow_request_message, fullName);
                            string5.getClass();
                            CharSequence charSequenceB5 = sz0.o.b(context, string5, fullName != null ? fullName : "");
                            if (lVar != null) {
                                profileImageUrlSmall = mVar.getProfileImageUrlSmall();
                            } else {
                                profileImageUrlSmall = mVar.getProfileImageUrlSmall();
                            }
                            followRequest = new InboxRequestItem.FollowRequest(bVarB, new b12.b(profileImageUrlSmall, null, null, null, null, 30, null), charSequenceB5, mVar, new InboxRequestItem.ViewState(null, strQ, null, false, mVar.getRequestViewed(), 12, null));
                        } else if (i15 != i18) {
                            if (i15 == 3) {
                                Object objFromJson6 = new Gson().fromJson(dVar.getData(), (Class<Object>) uz0.b.class);
                                objFromJson6.getClass();
                                bVar2 = (uz0.b) objFromJson6;
                                if (mapD != null) {
                                    userProfileId2 = bVar2.getUserProfileId();
                                    if (userProfileId2 != null) {
                                        numValueOf3 = Integer.valueOf((int) userProfileId2.longValue());
                                    } else {
                                        numValueOf3 = null;
                                    }
                                    lVar3 = mapD.get(numValueOf3);
                                } else {
                                    lVar3 = null;
                                }
                                createDate2 = bVar2.getCreateDate();
                                if (createDate2 != null) {
                                    strQ3 = xy2.b.q(context, createDate2, false, 28);
                                } else {
                                    strQ3 = null;
                                }
                                fullName3 = bVar2.getFullName();
                                if (fullName3 == null) {
                                    fullName3 = bVar2.getDisplayName();
                                }
                                String string6 = context.getString(R.string.pn_member_request, fullName3, bVar2.getGroupName());
                                string6.getClass();
                                if (fullName3 == null) {
                                    fullName3 = "";
                                }
                                groupName2 = bVar2.getGroupName();
                                if (groupName2 == null) {
                                    groupName2 = "";
                                }
                                CharSequence charSequenceB6 = sz0.o.b(context, string6, fullName3, groupName2);
                                if (lVar3 != null) {
                                    profileImageUrlSmall3 = bVar2.getProfileImageUrlSmall();
                                } else {
                                    profileImageUrlSmall3 = bVar2.getProfileImageUrlSmall();
                                }
                                followRequest = new InboxRequestItem.InboxGroupInviteRequest(bVarB, new b12.b(profileImageUrlSmall3, null, null, null, null, 30, null), charSequenceB6, bVar2, new InboxRequestItem.ViewState(null, strQ3, null, false, bVar2.getRequestViewed(), 12, null));
                            } else {
                                if (i15 != 4) {
                                    vb.h.s("Need implement transfer dto to request item by request key");
                                    return null;
                                }
                                Object objFromJson7 = new Gson().fromJson(dVar.getData(), (Class<Object>) com.garmin.android.apps.connectmobile.smartscale.model.b.class);
                                objFromJson7.getClass();
                                bVar3 = (com.garmin.android.apps.connectmobile.smartscale.model.b) objFromJson7;
                                if (mapD != null) {
                                    invitorID = bVar3.getInvitorID();
                                    if (invitorID != null) {
                                        numValueOf4 = Integer.valueOf((int) invitorID.longValue());
                                    } else {
                                        numValueOf4 = null;
                                    }
                                    lVar4 = mapD.get(numValueOf4);
                                } else {
                                    lVar4 = null;
                                }
                                inviteDate = bVar3.getInviteDate();
                                if (inviteDate != null) {
                                    strQ4 = xy2.b.q(context, new DateTime(inviteDate.longValue()), false, 28);
                                } else {
                                    strQ4 = null;
                                }
                                String string7 = context.getString(R.string.msg_user_invitation_to_device, bVar3.getInvitorName(), bVar3.getProductDisplayName());
                                string7.getClass();
                                invitorName = bVar3.getInvitorName();
                                if (invitorName == null) {
                                    invitorName = "";
                                }
                                productDisplayName = bVar3.getProductDisplayName();
                                if (productDisplayName == null) {
                                    productDisplayName = "";
                                }
                                CharSequence charSequenceB7 = sz0.o.b(context, string7, invitorName, productDisplayName);
                                if (lVar4 != null) {
                                    invitorProfilePicURL = bVar3.getInvitorProfilePicURL();
                                } else {
                                    invitorProfilePicURL = bVar3.getInvitorProfilePicURL();
                                }
                                bVar3.f44443p = new b12.b(invitorProfilePicURL, null, null, null, null, 30, null);
                                vz0.b bVar5 = vz0.b.DEVICE_INVITE;
                                if (lVar4 != null) {
                                    invitorProfilePicURL2 = bVar3.getInvitorProfilePicURL();
                                } else {
                                    invitorProfilePicURL2 = bVar3.getInvitorProfilePicURL();
                                }
                                deviceInviteRequest = new InboxRequestItem.DeviceInviteRequest(bVar5, new b12.b(invitorProfilePicURL2, null, null, null, null, 30, null), charSequenceB7, bVar3, new InboxRequestItem.ViewState(null, strQ4, null, false, bVar3.getRequestViewed(), 12, null));
                            }
                            arrayList2.add(deviceInviteRequest);
                            i18 = 2;
                            i19 = 1;
                        } else {
                            Object objFromJson8 = new Gson().fromJson(dVar.getData(), (Class<Object>) uz0.b.class);
                            objFromJson8.getClass();
                            bVar = (uz0.b) objFromJson8;
                            if (mapD != null) {
                                userProfileId = bVar.getUserProfileId();
                                if (userProfileId != null) {
                                    numValueOf2 = Integer.valueOf((int) userProfileId.longValue());
                                } else {
                                    numValueOf2 = null;
                                }
                                lVar2 = mapD.get(numValueOf2);
                            } else {
                                lVar2 = null;
                            }
                            createDate = bVar.getCreateDate();
                            if (createDate != null) {
                                strQ2 = xy2.b.q(context, createDate, false, 28);
                            } else {
                                strQ2 = null;
                            }
                            fullName2 = bVar.getFullName();
                            if (fullName2 == null) {
                                fullName2 = bVar.getDisplayName();
                            }
                            String string8 = context.getString(R.string.pn_group_invite, fullName2, bVar.getGroupName());
                            string8.getClass();
                            if (fullName2 == null) {
                                fullName2 = "";
                            }
                            groupName = bVar.getGroupName();
                            if (groupName == null) {
                                groupName = "";
                            }
                            CharSequence charSequenceB8 = sz0.o.b(context, string8, fullName2, groupName);
                            if (lVar2 != null) {
                                profileImageUrlSmall2 = bVar.getProfileImageUrlSmall();
                            } else {
                                profileImageUrlSmall2 = bVar.getProfileImageUrlSmall();
                            }
                            followRequest = new InboxRequestItem.InboxGroupInviteRequest(bVarB, new b12.b(profileImageUrlSmall2, null, null, null, null, 30, null), charSequenceB8, bVar, new InboxRequestItem.ViewState(null, strQ2, null, false, bVar.getRequestViewed(), 12, null));
                        }
                        deviceInviteRequest = followRequest;
                        arrayList2.add(deviceInviteRequest);
                        i18 = 2;
                        i19 = 1;
                    }
                } else {
                    arrayList2 = j0.f134944a;
                }
                list.addAll((Collection) arrayList2);
                String nextCursor2 = eVar2.getNextCursor();
                cVar2.f192758a.addAll(list);
                cVar2.f192759b = nextCursor2;
                return new h3.b.c(list, null, nextCursor2);
            }
        }
        return aVar2;
        arrayList.addAll((List) objF);
        kVar.f192785a = null;
        kVar.f192786b = contextInvoke;
        kVar.f192787c = arrayList;
        kVar.f192788d = i14;
        kVar.f192791g = 2;
        a0 a0Var2 = this.f192770b;
        a0Var2.getClass();
        objF = f0.J(a0Var2, new b0(a0Var2, i14, str, null), kVar);
        if (objF != aVar2) {
            list = arrayList;
            context = contextInvoke;
            v2Var = (v2) objF;
            if (!(v2Var instanceof v2.b)) {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String strH6 = androidx.room.a0.h("load: Error: result=[", v2Var, "]");
                i2.a aVar11 = i2.f36769a;
                a2 a2Var7 = a2.GENERAL;
                aVar11.getClass();
                i2.a.b(a2Var7, "InboxRequestPagingSource", strH6);
                return new h3.b.a(((v2.a) v2Var).f47383a);
            }
            String strH7 = androidx.room.a0.h("load: Success: result=[", v2Var, "]");
            i2.a aVar12 = i2.f36769a;
            a2 a2Var8 = a2.GENERAL;
            aVar12.getClass();
            i2.a.b(a2Var8, "InboxRequestPagingSource", strH7);
            uz0.e eVar3 = (uz0.e) ((v2.b) v2Var).f47386a;
            mapD = eVar3.d();
            listF = eVar3.f();
            if (listF != null) {
                arrayList2 = new ArrayList(y.r(listF, 10));
                while (r6.hasNext()) {
                    dVar.getClass();
                    context.getClass();
                    vz0.b.a aVar13 = vz0.b.f180871b;
                    Integer requestKey3 = dVar.getRequestKey();
                    aVar13.getClass();
                    bVarB = vz0.b.a.b(requestKey3);
                    if (bVarB == null) {
                        i15 = -1;
                    } else {
                        i15 = l.a.f192792a[bVarB.ordinal()];
                    }
                    if (i15 == i19) {
                        Object objFromJson9 = new Gson().fromJson(dVar.getData(), (Class<Object>) uz0.m.class);
                        objFromJson9.getClass();
                        mVar = (uz0.m) objFromJson9;
                        if (mapD != null) {
                            userId = mVar.getUserId();
                            if (userId != null) {
                                numValueOf = Integer.valueOf((int) userId.longValue());
                            } else {
                                numValueOf = null;
                            }
                            lVar = mapD.get(numValueOf);
                        } else {
                            lVar = null;
                        }
                        requestStartTime = mVar.getRequestStartTime();
                        if (requestStartTime != null) {
                            strQ = xy2.b.q(context, requestStartTime, false, 28);
                        } else {
                            strQ = null;
                        }
                        fullName = mVar.getFullName();
                        if (fullName == null) {
                            fullName = mVar.getDisplayName();
                        }
                        String string9 = context.getString(R.string.follow_request_message, fullName);
                        string9.getClass();
                        CharSequence charSequenceB9 = sz0.o.b(context, string9, fullName != null ? fullName : "");
                        if (lVar != null) {
                            profileImageUrlSmall = mVar.getProfileImageUrlSmall();
                        } else {
                            profileImageUrlSmall = mVar.getProfileImageUrlSmall();
                        }
                        followRequest = new InboxRequestItem.FollowRequest(bVarB, new b12.b(profileImageUrlSmall, null, null, null, null, 30, null), charSequenceB9, mVar, new InboxRequestItem.ViewState(null, strQ, null, false, mVar.getRequestViewed(), 12, null));
                    } else if (i15 != i18) {
                        if (i15 == 3) {
                            Object objFromJson10 = new Gson().fromJson(dVar.getData(), (Class<Object>) uz0.b.class);
                            objFromJson10.getClass();
                            bVar2 = (uz0.b) objFromJson10;
                            if (mapD != null) {
                                userProfileId2 = bVar2.getUserProfileId();
                                if (userProfileId2 != null) {
                                    numValueOf3 = Integer.valueOf((int) userProfileId2.longValue());
                                } else {
                                    numValueOf3 = null;
                                }
                                lVar3 = mapD.get(numValueOf3);
                            } else {
                                lVar3 = null;
                            }
                            createDate2 = bVar2.getCreateDate();
                            if (createDate2 != null) {
                                strQ3 = xy2.b.q(context, createDate2, false, 28);
                            } else {
                                strQ3 = null;
                            }
                            fullName3 = bVar2.getFullName();
                            if (fullName3 == null) {
                                fullName3 = bVar2.getDisplayName();
                            }
                            String string10 = context.getString(R.string.pn_member_request, fullName3, bVar2.getGroupName());
                            string10.getClass();
                            if (fullName3 == null) {
                                fullName3 = "";
                            }
                            groupName2 = bVar2.getGroupName();
                            if (groupName2 == null) {
                                groupName2 = "";
                            }
                            CharSequence charSequenceB10 = sz0.o.b(context, string10, fullName3, groupName2);
                            if (lVar3 != null) {
                                profileImageUrlSmall3 = bVar2.getProfileImageUrlSmall();
                            } else {
                                profileImageUrlSmall3 = bVar2.getProfileImageUrlSmall();
                            }
                            followRequest = new InboxRequestItem.InboxGroupInviteRequest(bVarB, new b12.b(profileImageUrlSmall3, null, null, null, null, 30, null), charSequenceB10, bVar2, new InboxRequestItem.ViewState(null, strQ3, null, false, bVar2.getRequestViewed(), 12, null));
                        } else {
                            if (i15 != 4) {
                                vb.h.s("Need implement transfer dto to request item by request key");
                                return null;
                            }
                            Object objFromJson11 = new Gson().fromJson(dVar.getData(), (Class<Object>) com.garmin.android.apps.connectmobile.smartscale.model.b.class);
                            objFromJson11.getClass();
                            bVar3 = (com.garmin.android.apps.connectmobile.smartscale.model.b) objFromJson11;
                            if (mapD != null) {
                                invitorID = bVar3.getInvitorID();
                                if (invitorID != null) {
                                    numValueOf4 = Integer.valueOf((int) invitorID.longValue());
                                } else {
                                    numValueOf4 = null;
                                }
                                lVar4 = mapD.get(numValueOf4);
                            } else {
                                lVar4 = null;
                            }
                            inviteDate = bVar3.getInviteDate();
                            if (inviteDate != null) {
                                strQ4 = xy2.b.q(context, new DateTime(inviteDate.longValue()), false, 28);
                            } else {
                                strQ4 = null;
                            }
                            String string11 = context.getString(R.string.msg_user_invitation_to_device, bVar3.getInvitorName(), bVar3.getProductDisplayName());
                            string11.getClass();
                            invitorName = bVar3.getInvitorName();
                            if (invitorName == null) {
                                invitorName = "";
                            }
                            productDisplayName = bVar3.getProductDisplayName();
                            if (productDisplayName == null) {
                                productDisplayName = "";
                            }
                            CharSequence charSequenceB11 = sz0.o.b(context, string11, invitorName, productDisplayName);
                            if (lVar4 != null) {
                                invitorProfilePicURL = bVar3.getInvitorProfilePicURL();
                            } else {
                                invitorProfilePicURL = bVar3.getInvitorProfilePicURL();
                            }
                            bVar3.f44443p = new b12.b(invitorProfilePicURL, null, null, null, null, 30, null);
                            vz0.b bVar6 = vz0.b.DEVICE_INVITE;
                            if (lVar4 != null) {
                                invitorProfilePicURL2 = bVar3.getInvitorProfilePicURL();
                            } else {
                                invitorProfilePicURL2 = bVar3.getInvitorProfilePicURL();
                            }
                            deviceInviteRequest = new InboxRequestItem.DeviceInviteRequest(bVar6, new b12.b(invitorProfilePicURL2, null, null, null, null, 30, null), charSequenceB11, bVar3, new InboxRequestItem.ViewState(null, strQ4, null, false, bVar3.getRequestViewed(), 12, null));
                        }
                        arrayList2.add(deviceInviteRequest);
                        i18 = 2;
                        i19 = 1;
                    } else {
                        Object objFromJson12 = new Gson().fromJson(dVar.getData(), (Class<Object>) uz0.b.class);
                        objFromJson12.getClass();
                        bVar = (uz0.b) objFromJson12;
                        if (mapD != null) {
                            userProfileId = bVar.getUserProfileId();
                            if (userProfileId != null) {
                                numValueOf2 = Integer.valueOf((int) userProfileId.longValue());
                            } else {
                                numValueOf2 = null;
                            }
                            lVar2 = mapD.get(numValueOf2);
                        } else {
                            lVar2 = null;
                        }
                        createDate = bVar.getCreateDate();
                        if (createDate != null) {
                            strQ2 = xy2.b.q(context, createDate, false, 28);
                        } else {
                            strQ2 = null;
                        }
                        fullName2 = bVar.getFullName();
                        if (fullName2 == null) {
                            fullName2 = bVar.getDisplayName();
                        }
                        String string12 = context.getString(R.string.pn_group_invite, fullName2, bVar.getGroupName());
                        string12.getClass();
                        if (fullName2 == null) {
                            fullName2 = "";
                        }
                        groupName = bVar.getGroupName();
                        if (groupName == null) {
                            groupName = "";
                        }
                        CharSequence charSequenceB12 = sz0.o.b(context, string12, fullName2, groupName);
                        if (lVar2 != null) {
                            profileImageUrlSmall2 = bVar.getProfileImageUrlSmall();
                        } else {
                            profileImageUrlSmall2 = bVar.getProfileImageUrlSmall();
                        }
                        followRequest = new InboxRequestItem.InboxGroupInviteRequest(bVarB, new b12.b(profileImageUrlSmall2, null, null, null, null, 30, null), charSequenceB12, bVar, new InboxRequestItem.ViewState(null, strQ2, null, false, bVar.getRequestViewed(), 12, null));
                    }
                    deviceInviteRequest = followRequest;
                    arrayList2.add(deviceInviteRequest);
                    i18 = 2;
                    i19 = 1;
                }
            } else {
                arrayList2 = j0.f134944a;
            }
            list.addAll((Collection) arrayList2);
            String nextCursor3 = eVar3.getNextCursor();
            cVar2.f192758a.addAll(list);
            cVar2.f192759b = nextCursor3;
            return new h3.b.c(list, null, nextCursor3);
        }
        return aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Context context, v13.c cVar) {
        i iVar;
        List listD;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f192779d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f192779d = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objA = iVar.f192777b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f192779d;
        if (i15 == 0) {
            o13.r.b(objA);
            iVar.f192776a = context;
            iVar.f192779d = 1;
            objA = this.f192771c.a(iVar);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            context = iVar.f192776a;
            o13.r.b(objA);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        return (List) objA;
        v2 v2Var = (v2) objA;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return j0.f134944a;
            }
            u0.r();
            return null;
        }
        ue0.b bVar = (ue0.b) ((v2.b) v2Var).f47386a;
        if (bVar == null || (listD = bVar.d()) == null) {
            listD = j0.f134944a;
        }
        iVar.f192776a = null;
        iVar.f192779d = 2;
        objA = g(context, listD, iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Serializable g(Context context, List list, v13.c cVar) {
        j jVar;
        Context context2;
        InboxRequestItem.AuthorizedViewerInvites authorizedViewerInvites;
        boolean z14;
        String profileImageUrlSmall;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        List<ue0.n> list2 = list;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f192784e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f192784e = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objA = jVar.f192782c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f192784e;
        if (i15 == 0) {
            o13.r.b(objA);
            ArrayList arrayList = new ArrayList(y.r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((ue0.n) it.next()).getUserId()));
            }
            List<String> listB1 = h0.b1(h0.f1(arrayList));
            jVar.f192780a = context;
            jVar.f192781b = list2;
            jVar.f192784e = 1;
            a22.i.a aVar2 = a22.i.f537b;
            objA = this.f192772d.a(listB1, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, jVar);
            if (objA == aVar) {
                return aVar;
            }
            context2 = context;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = jVar.f192781b;
            context2 = jVar.f192780a;
            o13.r.b(objA);
        }
        Map map = (Map) objA;
        ArrayList arrayList2 = new ArrayList();
        for (ue0.n nVar : list2) {
            ue0.c status = nVar.getStatus();
            int i16 = status == null ? -1 : b.f192775a[status.ordinal()];
            if (i16 == -1) {
                authorizedViewerInvites = null;
            } else if (i16 != 1) {
                if (i16 != 2) {
                    u0.r();
                    return null;
                }
                authorizedViewerInvites = null;
            } else {
                Long userId = nVar.getUserId();
                com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(userId != null ? new Integer((int) userId.longValue()) : null);
                context2.getClass();
                String string = context2.getString(R.string.name_added_you_authorized_viewer, nVar.getFullName());
                string.getClass();
                String fullName = nVar.getFullName();
                if (fullName == null) {
                    fullName = "";
                }
                CharSequence charSequenceB = sz0.o.b(context2, string, fullName);
                ue0.c status2 = nVar.getStatus();
                int i17 = status2 == null ? -1 : l.a.f192793b[status2.ordinal()];
                if (i17 == -1) {
                    z14 = false;
                } else if (i17 != 1) {
                    if (i17 != 2) {
                        u0.r();
                        return null;
                    }
                    z14 = false;
                } else {
                    z14 = true;
                }
                DateTime inviteDate = nVar.getInviteDate();
                String strQ = inviteDate != null ? xy2.b.q(context2, inviteDate, false, 28) : null;
                vz0.b bVar = vz0.b.AUTHORIZED_VIEWER_INVITE;
                if (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (profileImageUrlSmall = profileImageUrls.f46880i) == null) {
                    profileImageUrlSmall = nVar.getProfileImageUrlSmall();
                }
                authorizedViewerInvites = new InboxRequestItem.AuthorizedViewerInvites(bVar, new b12.b(profileImageUrlSmall, null, null, null, null, 30, null), charSequenceB, nVar, new InboxRequestItem.ViewState(null, strQ, null, z14, Boolean.TRUE, 4, null));
            }
            if (authorizedViewerInvites != null) {
                arrayList2.add(authorizedViewerInvites);
            }
        }
        return arrayList2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxz0/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

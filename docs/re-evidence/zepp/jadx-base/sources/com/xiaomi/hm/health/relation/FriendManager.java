package com.xiaomi.hm.health.relation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.huami.mifit.analytics.Analytics;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.handler.IHMFileDownloadResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.relatives.FriendsAndFamilyInject;
import com.huami.relatives.event.EventCareSend;
import com.huami.relatives.event.EventFriendRemoved;
import com.huami.relatives.event.EventFriendSearch;
import com.huami.relatives.event.EventFriends;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Detail;
import com.xiaomi.hm.health.databases.model.DetailDao;
import com.xiaomi.hm.health.databases.model.Friend;
import com.xiaomi.hm.health.databases.model.FriendDao;
import com.xiaomi.hm.health.databases.model.FriendMessage;
import com.xiaomi.hm.health.databases.model.FriendMessageDao;
import com.xiaomi.hm.health.push.Type;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import com.xiaomi.hm.health.relation.event.EventAcceptInvite;
import com.xiaomi.hm.health.relation.event.EventAddFriend;
import com.xiaomi.hm.health.relation.event.EventDetailLoad;
import com.xiaomi.hm.health.relation.event.EventFriendLoad;
import com.xiaomi.hm.health.relation.event.EventFriendShareInvite;
import com.xiaomi.hm.health.relation.event.FriendMessagesEvent;
import com.xiaomi.hm.health.relation.message.CareMessage;
import com.xiaomi.hm.health.relation.message.FollowMessage;
import com.xiaomi.hm.health.relation.message.UnfollowMessage;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.greenrobot.greendao.query.WhereCondition;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
public class FriendManager {
    public static final String TAG = "friendManager";

    @SuppressLint({"StaticFieldLeak"})
    private static FriendManager g = null;
    private static Lazy<FriendsAndFamilyInject> h = KoinJavaComponent.inject(FriendsAndFamilyInject.class);
    private static final String i = "relation";
    private static final String j = "user_guide";
    private Context a;
    private Gson f = new Gson();
    private FriendMessageDao b = HMDaoManager.getInstance().getFriendMessageDao();
    private FriendDao c = HMDaoManager.getInstance().getFriendDao();
    private DetailDao d = HMDaoManager.getInstance().getDetailDao();
    private EventBus e = EventBus.getDefault();

    public interface DeleteMessageHandler {
        void onFailed();

        void onSuccess();
    }

    public interface TokenRequestHandler {
        void onFailed();

        void onSuccess(String str);
    }

    public class a implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ long a;

        public a(long j) {
            this.a = j;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            EventAddFriend eventAddFriend = new EventAddFriend();
            eventAddFriend.resultCode = -1;
            eventAddFriend.toUid = this.a;
            FriendManager.this.e.post(eventAddFriend);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            int iOptInt;
            try {
                iOptInt = new JSONObject(new String(hMHttpResponseData.getResponseBody())).optInt("code");
            } catch (JSONException unused) {
                iOptInt = -1;
            }
            EventAddFriend eventAddFriend = new EventAddFriend();
            eventAddFriend.resultCode = iOptInt;
            eventAddFriend.toUid = this.a;
            FriendManager.this.e.post(eventAddFriend);
        }
    }

    public class b implements IHMBasicHttpResponseHandler {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(EventFriendShareInvite eventFriendShareInvite) {
            return "亲友分享链接：" + eventFriendShareInvite.friendInviteShareUrl;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            try {
                String strOptString = new JSONObject(new String(hMHttpResponseData.getResponseBody())).optString("tinyurl");
                if (!TextUtils.isEmpty(strOptString) && !strOptString.startsWith("https://") && !strOptString.startsWith("http://")) {
                    strOptString = "https://" + strOptString;
                }
                final EventFriendShareInvite eventFriendShareInvite = new EventFriendShareInvite();
                eventFriendShareInvite.friendInviteShareUrl = strOptString;
                FriendManager.this.e.post(eventFriendShareInvite);
                HMLog.info(FriendManager.TAG, new Function0() { // from class: com.xiaomi.hm.health.relation.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FriendManager.b.b(eventFriendShareInvite);
                    }
                });
            } catch (JSONException e) {
                HMLog.i(FriendManager.TAG, e.toString(), new Object[0]);
            }
        }
    }

    public class c implements IHMBasicHttpResponseHandler {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d(Throwable th) {
            return "requestFollowers error:" + th.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String e(HMHttpResponseData hMHttpResponseData) {
            return "requestFollowers failed:" + hMHttpResponseData.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String f(Exception exc) {
            return "requestFollowers jsonParse failed:" + exc.getMessage();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(final Throwable th) {
            FriendManager.this.e.post(new FriendMessagesEvent(new ArrayList()));
            HMLog.warn(FriendManager.TAG, new Function0() { // from class: com.xiaomi.hm.health.relation.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FriendManager.c.d(th);
                }
            });
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(final HMHttpResponseData hMHttpResponseData) {
            FriendManager.this.e.post(new FriendMessagesEvent(new ArrayList()));
            HMLog.warn(FriendManager.TAG, new Function0() { // from class: com.xiaomi.hm.health.relation.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FriendManager.c.e(hMHttpResponseData);
                }
            });
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(new String(hMHttpResponseData.getResponseBody())).optJSONArray("items");
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    FriendManager.this.l(arrayList, jSONArrayOptJSONArray, i);
                }
                FriendManager.this.e.post(new FriendMessagesEvent(arrayList));
            } catch (Exception e) {
                FriendManager.this.e.post(new FriendMessagesEvent(new ArrayList()));
                HMLog.warn(FriendManager.TAG, new Function0() { // from class: com.xiaomi.hm.health.relation.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FriendManager.c.f(e);
                    }
                });
            }
        }
    }

    public class d implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ int f;
        public final /* synthetic */ boolean g;

        public d(boolean z, ArrayList arrayList, int i, boolean z2, boolean z3, int i2, boolean z4) {
            this.a = z;
            this.b = arrayList;
            this.c = i;
            this.d = z2;
            this.e = z3;
            this.f = i2;
            this.g = z4;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            if (this.d) {
                return;
            }
            List<Friend> localFriendList = FriendManager.this.getLocalFriendList(this.f, this.c);
            if (localFriendList != null && !localFriendList.isEmpty()) {
                this.b.addAll(localFriendList);
            }
            int i = !NetUtil.isNetworkConnected(FriendManager.this.a) ? -2 : -1;
            boolean z = this.g;
            if (!z) {
                z = this.b.size() >= this.c;
            }
            EventFriendLoad eventFriendLoad = new EventFriendLoad(i, this.a, z, this.e, this.b);
            FriendManager.this.e.post(eventFriendLoad);
            FriendManager.this.notifyService(eventFriendLoad);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            int i;
            try {
                JSONArray jSONArray = new JSONObject(new String(hMHttpResponseData.getResponseBody())).getJSONArray("data");
                if (jSONArray != null) {
                    if (this.a) {
                        FriendManager.this.c.deleteAll();
                    }
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        if (jSONObject != null) {
                            Friend friend = new Friend();
                            friend.uid = jSONObject.optString("uid");
                            friend.username = jSONObject.optString("username");
                            friend.step = Integer.valueOf(jSONObject.optInt("step"));
                            friend.sleepTime = Integer.valueOf(jSONObject.optInt("sleep"));
                            friend.weight = Integer.valueOf(FriendUtils.transformWeight(Double.valueOf(jSONObject.optDouble("w"))));
                            friend.icon = jSONObject.optString(SportAnalytics.ParamKey.PIC);
                            friend.careCountByMe = Integer.valueOf(jSONObject.optInt("slove"));
                            friend.careCountByHim = Integer.valueOf(jSONObject.optInt("rlove"));
                            friend.lastUpdateTime = Long.valueOf(((long) jSONObject.optInt("update_ts")) * 1000);
                            friend.remarkName = jSONObject.optString(WebAPI.PARAM_NICK_NAME);
                            friend.createTime = Long.valueOf(((long) jSONObject.optInt("addts")) * 1000);
                            friend.tz = Integer.valueOf(jSONObject.has("timeZone") ? jSONObject.optInt("timeZone") : -100);
                            FriendManager.this.c.insertOrReplace(friend);
                            List<FriendMessage> list = FriendManager.this.b.queryBuilder().where(FriendMessageDao.Properties.FromUid.eq(friend.uid), new WhereCondition[0]).list();
                            if (list != null && !list.isEmpty()) {
                                Iterator<FriendMessage> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    it2.next().setFromUsername(friend.getDisplayName());
                                }
                                FriendManager.this.b.updateInTx(list);
                            }
                            this.b.add(friend);
                        }
                    }
                }
                i = 0;
            } catch (JSONException unused) {
                i = -1;
            }
            boolean z = this.b.size() >= this.c;
            EventFriendLoad eventFriendLoad = this.d ? new EventFriendLoad(i, true, z, false, this.b) : new EventFriendLoad(i, this.a, z, this.e, this.b);
            FriendManager.this.e.post(eventFriendLoad);
            FriendManager.this.notifyService(eventFriendLoad);
        }
    }

    public class e implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;

        public e(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            FriendManager.this.m(this.a);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            FriendManager.this.m(this.a);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            String str = new String(hMHttpResponseData.getResponseBody());
            EventFriendSearch eventFriendSearch = new EventFriendSearch();
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("items");
                ArrayList arrayList = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (length == 1 && jSONObjectOptJSONObject == null) {
                        FriendManager.this.m(this.a);
                        return;
                    }
                    EventFriendSearch.Friend friend = new EventFriendSearch.Friend();
                    friend.code = jSONObjectOptJSONObject.optInt(RemarkActivity.INPUT_FRIEND);
                    friend.iconUrl = jSONObjectOptJSONObject.optString(SportAnalytics.ParamKey.PIC);
                    friend.userName = jSONObjectOptJSONObject.optString("username");
                    friend.uid = Long.valueOf(jSONObjectOptJSONObject.optString("uid")).longValue();
                    friend.token = this.b;
                    arrayList.add(friend);
                }
                eventFriendSearch.friends = arrayList;
                eventFriendSearch.type = this.a;
            } catch (JSONException e) {
                HMLog.w(FriendManager.TAG, e.getMessage(), new Object[0]);
            }
            FriendManager.this.e.post(eventFriendSearch);
        }
    }

    public class f extends IHMFileDownloadResponseHandler {
        public final /* synthetic */ DeleteMessageHandler b;

        public f(DeleteMessageHandler deleteMessageHandler) {
            this.b = deleteMessageHandler;
        }

        @Override // com.huami.network.base.handler.IHMFileDownloadResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData, File file) {
            this.b.onFailed();
        }

        @Override // com.huami.network.base.handler.IHMFileDownloadResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData, File file) {
            if (hMHttpResponseData.getStatusCode() == 200) {
                this.b.onSuccess();
            } else {
                this.b.onFailed();
            }
        }
    }

    public class g implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Context c;

        public g(String str, String str2, Context context) {
            this.a = str;
            this.b = str2;
            this.c = context;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            if (th != null) {
                th.printStackTrace();
            }
            CustomToast.makeText(this.c, R.string.relatives_friend_set_nick_name_failed, 1).show();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            HMLog.i(FriendManager.TAG, "Update user nick name", new Object[0]);
            Friend friendLoad = FriendManager.this.c.load(String.valueOf(this.a));
            friendLoad.remarkName = this.b;
            FriendManager.this.c.update(friendLoad);
            FriendManager.this.loadFriendList(0, 10, false, false, false, false);
            String displayName = this.b;
            if ("".equals(displayName)) {
                displayName = friendLoad.getDisplayName();
            }
            List<FriendMessage> list = FriendManager.this.b.queryBuilder().where(FriendMessageDao.Properties.FromUid.eq(friendLoad.uid), new WhereCondition[0]).list();
            if (list == null || list.isEmpty()) {
                return;
            }
            Iterator<FriendMessage> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().setFromUsername(displayName);
            }
            FriendManager.this.b.updateInTx(list);
        }
    }

    public class h implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ ActionType a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ long c;

        public h(ActionType actionType, Context context, long j) {
            this.a = actionType;
            this.b = context;
            this.c = j;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            if (this.a.isAccept()) {
                Analytics.event(this.b, "FFMessageAgree", ((FriendsAndFamilyInject) FriendManager.h.getValue()).getConstantExternal().getStatEventKeyNumber(), "1");
            } else {
                Analytics.event(this.b, "FFMessageRefuse", ((FriendsAndFamilyInject) FriendManager.h.getValue()).getConstantExternal().getStatEventKeyNumber(), "1");
            }
            EventAcceptInvite eventAcceptInvite = new EventAcceptInvite();
            eventAcceptInvite.code = -1;
            eventAcceptInvite.friend = null;
            eventAcceptInvite.fromUid = String.valueOf(this.c);
            eventAcceptInvite.accepted = this.a.isAccept();
            FriendManager.this.e.post(eventAcceptInvite);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            JSONArray jSONArrayOptJSONArray;
            if (this.a == ActionType.Accept) {
                Analytics.event(this.b, "FFMessageAgree", ((FriendsAndFamilyInject) FriendManager.h.getValue()).getConstantExternal().getStatEventKeyNumber(), "0");
            } else {
                Analytics.event(this.b, "FFMessageRefuse", ((FriendsAndFamilyInject) FriendManager.h.getValue()).getConstantExternal().getStatEventKeyNumber(), "0");
            }
            String str = new String(hMHttpResponseData.getResponseBody());
            int iOptInt = -1;
            Friend friend = null;
            try {
                JSONObject jSONObject = new JSONObject(str);
                iOptInt = jSONObject.optInt("code");
                if (iOptInt == 1 && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null && jSONArrayOptJSONArray.length() != 0) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
                    Friend friend2 = new Friend();
                    try {
                        friend2.uid = jSONObjectOptJSONObject.optString("uid");
                        friend2.username = jSONObjectOptJSONObject.optString("username");
                        friend2.step = Integer.valueOf(jSONObjectOptJSONObject.optInt("step"));
                        friend2.sleepTime = Integer.valueOf(jSONObjectOptJSONObject.optInt("sleep"));
                        friend2.icon = jSONObjectOptJSONObject.optString(SportAnalytics.ParamKey.PIC);
                        friend2.weight = Integer.valueOf(FriendUtils.transformWeight(Double.valueOf(jSONObjectOptJSONObject.optDouble("w"))));
                        friend2.careCountByHim = Integer.valueOf(jSONObjectOptJSONObject.optInt("rlove"));
                        friend2.careCountByMe = Integer.valueOf(jSONObjectOptJSONObject.optInt("slove"));
                        friend2.lastUpdateTime = Long.valueOf(((long) jSONObjectOptJSONObject.optInt("update_ts")) * 1000);
                        friend2.remarkName = jSONObjectOptJSONObject.optString(WebAPI.PARAM_NICK_NAME);
                        friend2.createTime = Long.valueOf(System.currentTimeMillis());
                        FriendManager.this.c.insertOrReplace(friend2);
                        friend = friend2;
                    } catch (JSONException e) {
                        e = e;
                        friend = friend2;
                        HMLog.w(FriendManager.TAG, e.toString(), new Object[0]);
                    }
                }
            } catch (JSONException e2) {
                e = e2;
            }
            EventAcceptInvite eventAcceptInvite = new EventAcceptInvite();
            eventAcceptInvite.code = iOptInt;
            eventAcceptInvite.fromUid = String.valueOf(this.c);
            eventAcceptInvite.friend = friend;
            eventAcceptInvite.accepted = this.a.isAccept();
            FriendManager.this.e.post(eventAcceptInvite);
        }
    }

    public class i implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;

        public i(Context context, String str, boolean z) {
            this.a = context;
            this.b = str;
            this.c = z;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            Analytics.event(this.a, "FFClickCare", ((FriendsAndFamilyInject) FriendManager.h.getValue()).getConstantExternal().getStatEventKeyNumber(), "1");
            EventCareSend eventCareSend = new EventCareSend();
            eventCareSend.success = false;
            eventCareSend.uid = this.b;
            FriendManager.this.e.post(eventCareSend);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            Analytics.event(this.a, "FFClickCare", ((FriendsAndFamilyInject) FriendManager.h.getValue()).getConstantExternal().getStatEventKeyNumber(), "0");
            String str = new String(hMHttpResponseData.getResponseBody());
            EventCareSend eventCareSend = new EventCareSend();
            eventCareSend.uid = this.b;
            try {
                int iOptInt = new JSONObject(str).optInt("code", -1);
                boolean z = true;
                if (iOptInt == 1 && this.c) {
                    CustomToast.makeText(FriendManager.this.a, R.string.relatives_friend_new_user_guide_ok_toast, 1).show();
                }
                if (iOptInt != 1) {
                    z = false;
                }
                eventCareSend.success = z;
            } catch (JSONException unused) {
                eventCareSend.success = false;
            }
            FriendManager.this.e.post(eventCareSend);
        }
    }

    public class j implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ String a;

        public j(String str) {
            this.a = str;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            EventDetailLoad eventDetailLoad = new EventDetailLoad();
            eventDetailLoad.uid = this.a;
            eventDetailLoad.success = false;
            FriendManager.this.e.post(eventDetailLoad);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            EventDetailLoad eventDetailLoad;
            boolean z;
            ArrayList arrayList;
            EventDetailLoad eventDetailLoad2;
            String str;
            String str2;
            int iOptInt;
            String str3;
            String str4;
            String str5 = "totalSleeptime";
            String str6 = "dt";
            String str7 = "date";
            String str8 = "step";
            String str9 = new String(hMHttpResponseData.getResponseBody());
            EventDetailLoad eventDetailLoad3 = new EventDetailLoad();
            eventDetailLoad3.uid = this.a;
            eventDetailLoad3.success = true;
            try {
                JSONObject jSONObject = new JSONObject(str9);
                boolean z2 = jSONObject.optInt("code", -1) == 1;
                eventDetailLoad3.success = z2;
                if (z2) {
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArray = jSONObject.getJSONArray("data");
                    if (jSONArray != null) {
                        eventDetailLoad2 = eventDetailLoad3;
                        try {
                            int length = jSONArray.length();
                            ArrayList arrayList3 = arrayList2;
                            int i = 0;
                            while (i < length) {
                                int i2 = length;
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                if (jSONObject2 == null) {
                                    str = str7;
                                    str3 = str6;
                                    str2 = str8;
                                    str4 = str5;
                                    arrayList3 = arrayList3;
                                } else {
                                    Detail detail = new Detail();
                                    detail.shallowSleep = Integer.valueOf(jSONObject2.optInt("shallowsleep"));
                                    detail.deepSleep = Integer.valueOf(jSONObject2.optInt("deepsleep"));
                                    detail.step = Integer.valueOf(jSONObject2.optInt(str8));
                                    str = str7;
                                    String str10 = str8;
                                    detail.createTime = Long.valueOf(((long) jSONObject2.optInt(str7)) * 1000);
                                    detail.uid = "" + this.a;
                                    detail.distance = Integer.valueOf(jSONObject2.optInt("distance"));
                                    detail.calorie = Integer.valueOf(jSONObject2.optInt("calorie"));
                                    detail.fallSleepTime = Long.valueOf(jSONObject2.optLong("startSleep"));
                                    detail.wakeTime = Long.valueOf(jSONObject2.optLong("sleepEndTime"));
                                    detail.tz = Integer.valueOf(jSONObject2.has("timeZone") ? jSONObject2.optInt("timeZone") : -100);
                                    detail.dt = Long.valueOf(jSONObject2.optLong(str6));
                                    detail.totalSleeptime = Long.valueOf(jSONObject2.optLong(str5));
                                    String str11 = str5;
                                    String str12 = str6;
                                    Detail detailUnique = FriendManager.this.d.queryBuilder().where(DetailDao.Properties.Uid.eq(detail.uid), DetailDao.Properties.CreateTime.eq(detail.createTime)).unique();
                                    if (detailUnique == null) {
                                        FriendManager.this.d.insert(detail);
                                        str4 = str11;
                                        str2 = str10;
                                        str3 = str12;
                                    } else {
                                        detailUnique.shallowSleep = Integer.valueOf(jSONObject2.optInt("shallowsleep"));
                                        detailUnique.deepSleep = Integer.valueOf(jSONObject2.optInt("deepsleep"));
                                        str2 = str10;
                                        detailUnique.step = Integer.valueOf(jSONObject2.optInt(str2));
                                        detailUnique.createTime = Long.valueOf(((long) jSONObject2.optInt(str)) * 1000);
                                        detailUnique.uid = "" + this.a;
                                        detailUnique.distance = Integer.valueOf(jSONObject2.optInt("distance"));
                                        detailUnique.calorie = Integer.valueOf(jSONObject2.optInt("calorie"));
                                        detailUnique.fallSleepTime = Long.valueOf(jSONObject2.optLong("startSleep"));
                                        detailUnique.wakeTime = Long.valueOf(jSONObject2.optLong("sleepEndTime"));
                                        if (jSONObject2.has("timeZone")) {
                                            str = str;
                                            iOptInt = jSONObject2.optInt("timeZone");
                                        } else {
                                            str = str;
                                            iOptInt = -100;
                                        }
                                        detailUnique.tz = Integer.valueOf(iOptInt);
                                        str3 = str12;
                                        detailUnique.dt = Long.valueOf(jSONObject2.optLong(str3));
                                        str4 = str11;
                                        detailUnique.totalSleeptime = Long.valueOf(jSONObject2.optLong(str4));
                                        FriendManager.this.d.update(detailUnique);
                                    }
                                    arrayList3.add(detail);
                                }
                                i++;
                                arrayList3 = arrayList3;
                                str5 = str4;
                                length = i2;
                                jSONArray = jSONArray;
                                str8 = str2;
                                str6 = str3;
                                str7 = str;
                            }
                            arrayList = arrayList3;
                        } catch (Exception unused) {
                            eventDetailLoad = eventDetailLoad2;
                            z = false;
                            eventDetailLoad.success = z;
                            FriendManager.this.e.post(eventDetailLoad);
                        }
                    } else {
                        arrayList = arrayList2;
                        eventDetailLoad2 = eventDetailLoad3;
                    }
                    Friend friendLoad = FriendManager.this.c.load("" + this.a);
                    friendLoad.lastDetailUpdateTime = friendLoad.lastUpdateTime;
                    FriendManager.this.c.update(friendLoad);
                    eventDetailLoad = eventDetailLoad2;
                    try {
                        eventDetailLoad.items = arrayList;
                    } catch (Exception unused2) {
                        z = false;
                        eventDetailLoad.success = z;
                    }
                } else {
                    eventDetailLoad = eventDetailLoad3;
                    z = false;
                    try {
                        eventDetailLoad.success = false;
                    } catch (Exception unused3) {
                        eventDetailLoad.success = z;
                    }
                }
            } catch (Exception unused4) {
                eventDetailLoad = eventDetailLoad3;
            }
            FriendManager.this.e.post(eventDetailLoad);
        }
    }

    public class k implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ String a;

        public k(String str) {
            this.a = str;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            EventFriendRemoved eventFriendRemoved = new EventFriendRemoved();
            eventFriendRemoved.code = -1;
            eventFriendRemoved.uid = this.a;
            FriendManager.this.e.post(eventFriendRemoved);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            String str = new String(hMHttpResponseData.getResponseBody());
            EventFriendRemoved eventFriendRemoved = new EventFriendRemoved();
            eventFriendRemoved.uid = this.a;
            try {
                int iOptInt = new JSONObject(str).optInt("code");
                eventFriendRemoved.code = iOptInt;
                if (iOptInt == 1) {
                    FriendManager.this.c.deleteByKey("" + this.a);
                    FriendManager.this.b.queryBuilder().where(FriendMessageDao.Properties.FromUid.eq(String.valueOf(this.a)), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
                }
            } catch (JSONException unused) {
                eventFriendRemoved.code = -1;
            }
            FriendManager.this.e.post(eventFriendRemoved);
        }
    }

    public class l extends IHMFileDownloadResponseHandler {
        public final /* synthetic */ TokenRequestHandler b;

        public l(TokenRequestHandler tokenRequestHandler) {
            this.b = tokenRequestHandler;
        }

        @Override // com.huami.network.base.handler.IHMFileDownloadResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(final Throwable th) {
            this.b.onFailed();
            HMLog.info(FriendManager.TAG, new Function0() { // from class: com.xiaomi.hm.health.relation.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Log.getStackTraceString(th);
                }
            });
        }

        @Override // com.huami.network.base.handler.IHMFileDownloadResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData, File file) {
            this.b.onFailed();
        }

        @Override // com.huami.network.base.handler.IHMFileDownloadResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData, File file) {
            if (hMHttpResponseData.isSuccess()) {
                try {
                    String strOptString = new JSONObject(hMHttpResponseData.getResponseString()).optString(WebAPI.PARAM_F_TOKEN);
                    if (TextUtils.isEmpty(strOptString)) {
                        onFailure(hMHttpResponseData, file);
                    } else {
                        this.b.onSuccess(strOptString);
                    }
                } catch (Exception e) {
                    onError(e);
                }
            }
        }
    }

    private FriendManager(Context context) {
        this.a = context;
    }

    public static FriendManager getInstance() {
        if (g == null) {
            synchronized (FriendManager.class) {
                if (g == null) {
                    g = new FriendManager(RelationExternalsKt.getFriendsAndFamilyInjectDelegate().getAppContext());
                }
            }
        }
        return g;
    }

    private void i(long j2) {
        this.c.deleteByKey(String.valueOf(j2));
        this.b.queryBuilder().where(FriendMessageDao.Properties.FromUid.eq(String.valueOf(j2)), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
        this.d.queryBuilder().where(DetailDao.Properties.Uid.eq(String.valueOf(j2)), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0012  */
    private void j(FriendMessage friendMessage, String str) {
        str.hashCode();
        switch (str) {
            case "follow":
                friendMessage.type = 1;
                friendMessage.status = 0;
                break;
            case "care":
                friendMessage.type = 0;
                friendMessage.status = 0;
                break;
            case "follow_reject":
                friendMessage.type = 2;
                friendMessage.status = 0;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    private void k(FriendMessage friendMessage, String str) {
        str.hashCode();
        switch (str) {
            case "black":
                friendMessage.type = 1;
                friendMessage.status = 4;
                break;
            case "follow_accept":
                friendMessage.type = 1;
                friendMessage.status = 3;
                break;
            case "follow_reject":
                friendMessage.type = 1;
                friendMessage.status = 2;
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(List<FriendMessage> list, JSONArray jSONArray, int i2) {
        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
        FriendMessage friendMessage = new FriendMessage();
        String strOptString = jSONObjectOptJSONObject.optString("optType");
        String strOptString2 = jSONObjectOptJSONObject.optString("msgType");
        friendMessage.type = 0;
        friendMessage.status = 0;
        if ((strOptString.isEmpty() && strOptString2.isEmpty()) || Type.UNFOLLOW_MESSAGE.equals(strOptString2) || OperationType.Accept.equals(strOptString2)) {
            return;
        }
        if (strOptString.isEmpty()) {
            j(friendMessage, strOptString2);
        } else {
            k(friendMessage, strOptString);
        }
        friendMessage.fromUid = jSONObjectOptJSONObject.optString("userId");
        friendMessage.count = Integer.valueOf(jSONObjectOptJSONObject.optInt("careCount"));
        friendMessage.fromUsername = jSONObjectOptJSONObject.optString("nickName");
        friendMessage.updateTime = Long.valueOf(jSONObjectOptJSONObject.optLong("timstamp") * 1000);
        friendMessage.icon = jSONObjectOptJSONObject.optString("iconUrl");
        list.add(friendMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i2) {
        EventFriendSearch eventFriendSearch = new EventFriendSearch();
        eventFriendSearch.type = i2;
        this.e.post(eventFriendSearch);
    }

    public void addAcceptMessage(FollowMessage followMessage) {
        Friend friend;
        if (!TextUtils.isEmpty(followMessage.data) && (friendLoad = this.c.load(String.valueOf(followMessage.fromUid))) == null) {
            try {
                JSONObject jSONObject = new JSONArray(followMessage.data).getJSONObject(0);
                friend = new Friend();
                try {
                    friend.uid = jSONObject.optString("uid");
                    friend.username = jSONObject.optString("username");
                    friend.step = Integer.valueOf(jSONObject.optInt("step"));
                    friend.sleepTime = Integer.valueOf(jSONObject.optInt("sleep"));
                    friend.icon = jSONObject.optString(SportAnalytics.ParamKey.PIC);
                    friend.weight = Integer.valueOf(FriendUtils.transformWeight(Double.valueOf(jSONObject.optDouble("w"))));
                    friend.careCountByHim = Integer.valueOf(jSONObject.optInt("rlove"));
                    friend.careCountByMe = Integer.valueOf(jSONObject.optInt("slove"));
                    friend.lastUpdateTime = Long.valueOf(jSONObject.optLong("update_ts") * 1000);
                    friend.remarkName = jSONObject.optString(WebAPI.PARAM_NICK_NAME);
                    friend.createTime = Long.valueOf(System.currentTimeMillis());
                } catch (JSONException e2) {
                    e = e2;
                    Friend friendLoad = friend;
                    HMLog.w(TAG, e.getMessage(), new Object[0]);
                    friend = friendLoad;
                }
            } catch (JSONException e3) {
                e = e3;
            }
            if (friend != null) {
                this.c.insertOrReplace(friend);
                FriendMessage friendMessageUnique = this.b.queryBuilder().where(FriendMessageDao.Properties.FromUid.eq("" + friend.uid), FriendMessageDao.Properties.Type.eq(3)).unique();
                if (friendMessageUnique != null) {
                    friendMessageUnique.status = 3;
                    friendMessageUnique.fromUid = "" + friend.uid;
                    friendMessageUnique.fromUsername = friend.username;
                    friendMessageUnique.count = 0;
                    friendMessageUnique.type = 3;
                    friendMessageUnique.updateTime = Long.valueOf(System.currentTimeMillis());
                    friendMessageUnique.icon = friend.icon;
                    this.b.update(friendMessageUnique);
                    return;
                }
                FriendMessage friendMessage = new FriendMessage();
                friendMessage.status = 3;
                friendMessage.fromUid = "" + friend.uid;
                friendMessage.fromUsername = friend.username;
                friendMessage.count = 0;
                friendMessage.type = 3;
                friendMessage.updateTime = Long.valueOf(System.currentTimeMillis());
                friendMessage.icon = friend.icon;
                this.b.insert(friendMessage);
            }
        }
    }

    public void addRefuseMessage(FollowMessage followMessage) {
        FriendMessage friendMessage = new FriendMessage();
        friendMessage.icon = followMessage.icon;
        friendMessage.type = 2;
        friendMessage.fromUid = "" + followMessage.fromUid;
        friendMessage.fromUsername = followMessage.fromUsername;
        friendMessage.status = 2;
        friendMessage.count = 0;
        friendMessage.updateTime = Long.valueOf(System.currentTimeMillis());
        FriendMessage friendMessageUnique = this.b.queryBuilder().where(FriendMessageDao.Properties.FromUid.eq(friendMessage.fromUid), FriendMessageDao.Properties.Type.eq(3)).unique();
        if (friendMessageUnique != null) {
            friendMessageUnique.status = 2;
            friendMessageUnique.fromUid = "" + followMessage.fromUid;
            friendMessageUnique.fromUsername = followMessage.fromUsername;
            friendMessageUnique.count = 0;
            friendMessageUnique.type = 2;
            friendMessageUnique.updateTime = Long.valueOf(System.currentTimeMillis());
            friendMessageUnique.icon = followMessage.icon;
            this.b.update(friendMessageUnique);
            return;
        }
        FriendMessage friendMessage2 = new FriendMessage();
        friendMessage2.status = 2;
        friendMessage2.fromUid = "" + followMessage.fromUid;
        friendMessage2.fromUsername = followMessage.fromUsername;
        friendMessage2.count = 0;
        friendMessage2.type = 2;
        friendMessage2.updateTime = Long.valueOf(System.currentTimeMillis());
        friendMessage2.icon = followMessage.icon;
        this.b.insert(friendMessage2);
    }

    public void addReuqestMessage(FollowMessage followMessage) {
        FriendMessage friendMessage = new FriendMessage();
        friendMessage.type = 1;
        friendMessage.icon = followMessage.icon;
        friendMessage.fromUid = "" + followMessage.fromUid;
        friendMessage.fromUsername = followMessage.fromUsername;
        friendMessage.status = 0;
        friendMessage.count = 0;
        friendMessage.updateTime = Long.valueOf(System.currentTimeMillis());
        FriendMessage friendMessageUnique = this.b.queryBuilder().where(FriendMessageDao.Properties.FromUid.eq(friendMessage.fromUid), FriendMessageDao.Properties.Type.eq(1)).unique();
        if (friendMessageUnique == null) {
            this.b.insert(friendMessage);
            return;
        }
        friendMessageUnique.type = 1;
        friendMessageUnique.icon = followMessage.icon;
        friendMessageUnique.fromUid = "" + followMessage.fromUid;
        friendMessageUnique.fromUsername = followMessage.fromUsername;
        friendMessageUnique.status = 0;
        friendMessageUnique.count = 0;
        friendMessageUnique.updateTime = friendMessage.updateTime;
        this.b.update(friendMessageUnique);
    }

    public void cleanData() {
        this.b.deleteAll();
        this.c.deleteAll();
        this.d.deleteAll();
        if (g != null) {
            g = null;
        }
    }

    public void clearFriendMessageTable() {
        this.b.deleteAll();
    }

    public void deleteHistoryMessage(String str, String str2, DeleteMessageHandler deleteMessageHandler) {
        WebAPI.deleteHistoryMessage(str, str2, new f(deleteMessageHandler));
    }

    public void deleteMessagefromUid(String str) {
        this.b.queryBuilder().where(FriendMessageDao.Properties.FromUid.eq(String.valueOf(str)), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    public void fetchFriendShareInviteLink(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        WebAPI.generateShareFriendInvite(str, str2, str3, new b());
    }

    public Friend getFriendByUid(long j2) {
        return this.c.load("" + j2);
    }

    public FriendMessage getFriendInvitMessageByUid(String str) {
        List<FriendMessage> list = this.b.queryBuilder().where(FriendMessageDao.Properties.FromUid.eq(str), FriendMessageDao.Properties.Type.eq(1)).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<Friend> getLocalFriendAllList() {
        List<Friend> listLoadAll = this.c.loadAll();
        if (listLoadAll == null || listLoadAll.isEmpty()) {
            return null;
        }
        return listLoadAll;
    }

    public Friend getLocalFriendByUid(long j2) {
        List<Friend> list = this.c.queryBuilder().where(FriendDao.Properties.Uid.eq(Long.valueOf(j2)), new WhereCondition[0]).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<Friend> getLocalFriendList(int i2, int i3) {
        return this.c.queryBuilder().orderDesc(FriendDao.Properties.CreateTime).offset(i2).limit(i3).list();
    }

    public FriendMessage getMessage(String str, int i2) {
        if (i2 == 1) {
            return getFriendInvitMessageByUid(str);
        }
        return this.b.queryBuilder().where(FriendMessageDao.Properties.FromUid.eq("" + str), FriendMessageDao.Properties.Type.eq(0)).unique();
    }

    public List<FriendMessage> getMessages() {
        return this.b.loadAll();
    }

    public void handleFriendInvited(Context context, long j2, ActionType actionType, String str) {
        WebAPI.acceptFirendInvited(j2, actionType, str, new h(actionType, context, j2));
    }

    public void loadDetailInfo(String str, boolean z) {
        if (z) {
            WebAPI.loadDetailInfo(str, 0L, new j(str));
            return;
        }
        List<Detail> list = this.d.queryBuilder().where(DetailDao.Properties.Uid.eq("" + str), new WhereCondition[0]).orderDesc(DetailDao.Properties.CreateTime).limit(30).list();
        if (list != null) {
            EventDetailLoad eventDetailLoad = new EventDetailLoad();
            eventDetailLoad.success = true;
            eventDetailLoad.uid = str;
            eventDetailLoad.items = list;
            this.e.post(eventDetailLoad);
        }
    }

    public void loadFriendList(int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        loadFriendList(i2, i3, z, z2, z3, z4, false);
    }

    public List<FriendMessage> loadMessageList(int i2, int i3) {
        return this.b.queryBuilder().offset(i2).limit(i3).orderDesc(FriendMessageDao.Properties.UpdateTime).list();
    }

    public void notifyService(EventFriendLoad eventFriendLoad) {
        try {
            this.e.post(new EventFriends(this.f.toJson(eventFriendLoad)));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean readUserGuideState(Context context) {
        return context.getSharedPreferences(i, 0).getBoolean(j, false);
    }

    public void removeFriend(String str) {
        WebAPI.removeFriend(str, new k(str));
    }

    public void requestMessages(int i2) {
        WebAPI.requestMessages(i2, new c());
    }

    public void requestTokenForQrCode(TokenRequestHandler tokenRequestHandler) {
        WebAPI.requestTokenForQrCode(new l(tokenRequestHandler));
    }

    public void searchFriend(long j2, String str, int i2) {
        WebAPI.searchUserByUid(j2, new e(i2, str));
    }

    public void sendCareToFriend(Context context, String str, boolean z) {
        Analytics.event(this.a, "SendCareToFriend");
        WebAPI.sendCareMessage(str, new i(context, str, z));
    }

    public void sendFriendInvited(Context context, long j2, String str) {
        WebAPI.sendFriendInvited(j2, str, new a(j2));
    }

    public void unfollowMessage(UnfollowMessage unfollowMessage) {
        i(unfollowMessage.fromUid);
    }

    public void updateCareCount(CareMessage careMessage) {
        FriendMessage friendMessageUnique = this.b.queryBuilder().where(FriendMessageDao.Properties.FromUid.eq("" + careMessage.fromUid), FriendMessageDao.Properties.Type.eq(0)).unique();
        HMLog.i(TAG, careMessage.toString(), new Object[0]);
        if (friendMessageUnique != null) {
            friendMessageUnique.fromUsername = careMessage.fromUsername;
            friendMessageUnique.updateTime = Long.valueOf(System.currentTimeMillis());
            friendMessageUnique.count = Integer.valueOf(friendMessageUnique.count.intValue() + 1);
            friendMessageUnique.status = 0;
            this.b.update(friendMessageUnique);
            return;
        }
        FriendMessage friendMessage = new FriendMessage();
        friendMessage.status = 0;
        friendMessage.fromUid = "" + careMessage.fromUid;
        friendMessage.fromUsername = careMessage.fromUsername;
        friendMessage.count = 1;
        friendMessage.type = 0;
        friendMessage.updateTime = Long.valueOf(System.currentTimeMillis());
        friendMessage.icon = careMessage.picUrl;
        this.b.save(friendMessage);
    }

    public void updateUserRemarkName(Context context, String str, String str2) {
        WebAPI.updateUserNickname(str, str2, new g(str, str2, context));
    }

    public void writeUserGuideState(Context context, boolean z) {
        Objects.requireNonNull(context, "context is null");
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(i, 0).edit();
        editorEdit.putBoolean(j, z);
        editorEdit.apply();
    }

    public void loadFriendList(int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int size;
        int size2;
        List<Friend> localFriendList;
        ArrayList arrayList = new ArrayList();
        if (z5) {
            size = i2;
        } else {
            if (!z && (localFriendList = getLocalFriendList(i2, i3)) != null && !localFriendList.isEmpty()) {
                arrayList.addAll(localFriendList);
            }
            if (z2 && (size2 = arrayList.size()) > 0) {
                EventFriendLoad eventFriendLoad = new EventFriendLoad(0, z, size2 >= i3, z4, arrayList);
                this.e.post(eventFriendLoad);
                notifyService(eventFriendLoad);
                return;
            }
            size = arrayList.size() + i2;
        }
        WebAPI.loadFriendList(size, i3, z3, new d(z, arrayList, i3, z5, z4, i2, z2));
    }
}

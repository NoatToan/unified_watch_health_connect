package com.xiaomi.hm.health.relation.cloud;

import android.text.TextUtils;
import com.google.firebase.perf.FirebasePerformance;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.callback.IHMGetTokenCallback;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.relation.ActionType;
import com.xiaomi.hm.health.relation.DifferenceManager;
import com.xiaomi.hm.health.relation.RelationExternalsKt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class WebAPI {
    public static final String PARAM_FRIEND_ID = "f_uid";
    public static final String PARAM_FROM_DATE = "from_date";
    public static final String PARAM_FROM_UID = "from_uid";
    public static final String PARAM_F_TOKEN = "fToken";
    public static final String PARAM_IS_REFRESH = "isRefresh";
    public static final String PARAM_LIMIT = "limit";
    public static final String PARAM_NICK_NAME = "nick";
    public static final String PARAM_OFFSET = "offset";
    public static final String PARAM_SEARCH_UID = "search_uid";
    public static final String PARAM_SHARE_INVITE_AVATAR = "avatar";
    public static final String PARAM_SHARE_INVITE_EXTENSION = "extension";
    public static final String PARAM_SHARE_INVITE_FROM = "from";
    public static final String PARAM_SHARE_INVITE_FROM_AMAZFIT = "amazfit_copy";
    public static final String PARAM_SHARE_INVITE_FROM_ZEPP = "zepp";
    public static final String PARAM_SHARE_INVITE_NICKNAME = "nickname";
    public static final String PARAM_SHARE_INVITE_UID = "uid";
    public static final String PARAM_STATUS = "status";
    public static final String PARAM_TO_UID = "to_uid";
    public static final String PUSH_TIME = "pushTime";
    private static final String a = "WebAPI";

    public class a implements IHMGetTokenCallback {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Support.RequestSupport c;
        public final /* synthetic */ IHMBasicHttpResponseHandler d;

        public a(String str, String str2, Support.RequestSupport requestSupport, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
            this.a = str;
            this.b = str2;
            this.c = requestSupport;
            this.d = iHMBasicHttpResponseHandler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(String str, Throwable th) {
            return "request failed, url: " + str + "message" + th.getMessage();
        }

        @Override // com.huami.network.hmnetwork.callback.IHMGetTokenCallback
        public void onError(final Throwable th) {
            final String str = this.b;
            HMLog.info(WebAPI.a, new Function0() { // from class: com.xiaomi.hm.health.relation.cloud.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WebAPI.a.b(str, th);
                }
            });
            this.d.onError(th);
        }

        @Override // com.huami.network.hmnetwork.callback.IHMGetTokenCallback
        public void onSuccess(Map<String, String> map) {
            HashSet hashSet = new HashSet();
            if (TextUtils.isEmpty(this.a)) {
                HMWebUtil.doSeparateRequest(this.b, map, (Map<String, Object>) new HashMap(), this.c, true, false, this.d, new HMHttpConfig[0]);
            } else {
                hashSet.add(this.a);
                hashSet.add("application/json");
                HMWebUtil.doSeparateRequest(this.b, map, (Set<Object>) hashSet, this.c, true, false, this.d, new HMHttpConfig[0]);
            }
        }
    }

    public class b implements IHMGetTokenCallback {
        public final /* synthetic */ String a;
        public final /* synthetic */ Set b;
        public final /* synthetic */ IHMBasicHttpResponseHandler c;

        public b(String str, Set set, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
            this.a = str;
            this.b = set;
            this.c = iHMBasicHttpResponseHandler;
        }

        @Override // com.huami.network.hmnetwork.callback.IHMGetTokenCallback
        public void onError(Throwable th) {
            HMLog.w(WebAPI.a, th.getMessage(), new Object[0]);
        }

        @Override // com.huami.network.hmnetwork.callback.IHMGetTokenCallback
        public void onSuccess(Map<String, String> map) {
            HMWebUtil.doSeparateRequest(this.a, map, (Set<Object>) this.b, Support.RequestSupport.POST, true, false, this.c, new HMHttpConfig[0]);
        }
    }

    private static void a(String str, String str2, String str3, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        String str4 = HMServerDef.getHost() + ClientRequestServer.API_TYPE_GENERATE_SHARE_INVITE;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PARAM_SHARE_INVITE_AVATAR, str);
            jSONObject.put("uid", str2);
            jSONObject.put("nickname", str3);
            JSONObject jSONObject2 = new JSONObject();
            String flavorProduction = RelationExternalsKt.getFriendsAndFamilyInjectDelegate().getFlavorProduction();
            byte b2 = -1;
            int iHashCode = flavorProduction.hashCode();
            if (iHashCode != -1074330848) {
                if (iHashCode == -892561268 && flavorProduction.equals("amazfit")) {
                    b2 = 1;
                }
            } else if (flavorProduction.equals("midong")) {
                b2 = 0;
            }
            if (b2 == 0) {
                jSONObject2.put("from", "zepp");
            } else if (b2 == 1) {
                jSONObject2.put("from", PARAM_SHARE_INVITE_FROM_AMAZFIT);
            }
            jSONObject.put("extension", jSONObject2);
            HashSet hashSet = new HashSet();
            hashSet.add(jSONObject.toString());
            hashSet.add("application/json");
            HMWebUtil.getSystemHeaderAsync(new b(str4, hashSet, iHMBasicHttpResponseHandler));
        } catch (JSONException e) {
            HMLog.w(a, e.getMessage(), new Object[0]);
        }
    }

    public static void acceptFirendInvited(long j, ActionType actionType, String str, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        String url = BasicServerDef.getUrl(ClientRequestServer.API_TYPE_ACCEPT_FRIEND_INVITE);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(PUSH_TIME, str);
        systemParams.put(PARAM_FROM_UID, j + "");
        systemParams.put("status", actionType.getActionValue());
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, iHMBasicHttpResponseHandler);
    }

    private static void b(String str, String str2, Support.RequestSupport requestSupport, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        HMWebUtil.getSystemHeaderAsync(new a(str2, str, requestSupport, iHMBasicHttpResponseHandler));
    }

    public static void deleteHistoryMessage(String str, String str2, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        String url = BasicServerDef.getUrl(String.format("friend/%s/message/%s", str, str2));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("optionType", FirebasePerformance.HttpMethod.DELETE);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        b(url, jSONObject.toString(), Support.RequestSupport.POST, iHMBasicHttpResponseHandler);
    }

    public static void generateShareFriendInvite(String str, String str2, String str3, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        if (DifferenceManager.isBuildMidong()) {
            a(str, str2, str3, iHMBasicHttpResponseHandler);
            return;
        }
        String str4 = HMServerDef.getHost() + ClientRequestServer.API_TYPE_GENERATE_SHARE_INVITE;
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(PARAM_SHARE_INVITE_AVATAR, str);
        systemParams.put("uid", str2);
        systemParams.put("nickname", str3);
        HMWebUtil.doRequest(str4, systemParams, Support.RequestSupport.POST, iHMBasicHttpResponseHandler);
    }

    public static void loadDetailInfo(String str, long j, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        String url = BasicServerDef.getUrl(ClientRequestServer.API_TYPE_LOAD_DETAIL);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(PARAM_FRIEND_ID, str + "");
        systemParams.put("from_date", (j / 1000) + "");
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, iHMBasicHttpResponseHandler);
    }

    public static void loadFriendList(long j, int i, boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        String url = BasicServerDef.getUrl(ClientRequestServer.API_TYPE_LOAD_FRIEND_LIST);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("limit", i + "");
        systemParams.put("offset", j + "");
        systemParams.put(PARAM_IS_REFRESH, Boolean.valueOf(z));
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, iHMBasicHttpResponseHandler);
    }

    public static void removeFriend(String str, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        String url = BasicServerDef.getUrl(ClientRequestServer.API_TYPE_REMOVE_FRIEND);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(PARAM_TO_UID, str + "");
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, iHMBasicHttpResponseHandler);
    }

    public static void requestMessages(int i, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        String url = BasicServerDef.getUrl(ClientRequestServer.API_TYPE_LOAD_FRIEND_CARE);
        HashMap map = new HashMap();
        map.put("limit", Integer.valueOf(i));
        map.put("userId", HMPersonInfo.getInstance().getUserInfo().getUserid());
        HMWebUtil.doRequest(url, map, Support.RequestSupport.GET, iHMBasicHttpResponseHandler);
    }

    public static void requestTokenForQrCode(IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        b(BasicServerDef.getUrl(ClientRequestServer.API_TYPE_QR_CODE_PARAMETERS), null, Support.RequestSupport.GET, iHMBasicHttpResponseHandler);
    }

    public static void searchUserByUid(long j, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        HMWebUtil.doRequest(HMServerDef.getHost() + "users/" + HMPersonInfo.getInstance().getUserInfo().getUserid() + "/search/" + j, HMWebUtil.getSystemParams(), Support.RequestSupport.GET, iHMBasicHttpResponseHandler);
    }

    public static void sendCareMessage(String str, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        String url = BasicServerDef.getUrl(ClientRequestServer.API_TYPE_SEND_CARE_NOTIFICATION);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(PARAM_TO_UID, str + "");
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, iHMBasicHttpResponseHandler);
    }

    public static void sendFriendInvited(long j, String str, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        String url = BasicServerDef.getUrl(ClientRequestServer.API_TYPE_SEND_FRIEND_INVITE_V2);
        HashMap map = new HashMap();
        map.put(PARAM_TO_UID, Long.valueOf(j));
        map.put(PARAM_F_TOKEN, str);
        HMWebUtil.doRequest(url, map, Support.RequestSupport.POST, iHMBasicHttpResponseHandler);
    }

    public static void updateUserNickname(String str, String str2, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        String url = BasicServerDef.getUrl(ClientRequestServer.API_TYPE_REMARK_USER);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(PARAM_TO_UID, str + "");
        systemParams.put(PARAM_NICK_NAME, str2);
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, iHMBasicHttpResponseHandler);
    }
}

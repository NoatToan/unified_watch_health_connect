package com.xiaomi.hm.health.relation;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.huami.lib.qrcode.result.IntentIntegrator;
import com.huami.lib.qrcode.result.IntentResult;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.relatives.UserCard;
import com.huami.relatives.event.EventFriendSearch;
import com.huami.tools.log.HMLog;
import com.huami.utils.easypermission.PermissionDialogFragmentCompat;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.relation.FriendActivity;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import com.xiaomi.hm.health.relation.utils.Utils;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class FriendActivity extends AppCompatActivity {

    public class a implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ FragmentActivity a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        public a(FragmentActivity fragmentActivity, String str, int i) {
            this.a = fragmentActivity;
            this.b = str;
            this.c = i;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            Utils.hideProgressDialog(this.a);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            Utils.hideProgressDialog(this.a);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            try {
                EventFriendSearch eventFriendSearch = new EventFriendSearch();
                JSONArray jSONArrayOptJSONArray = new JSONObject(new String(hMHttpResponseData.getResponseBody())).optJSONArray("items");
                ArrayList arrayList = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (length == 1 && jSONObjectOptJSONObject == null) {
                        Utils.hideProgressDialog(this.a);
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
                eventFriendSearch.type = this.c;
                FriendActivity.e(eventFriendSearch, this.a);
            } catch (Exception e) {
                Utils.hideProgressDialog(this.a);
                HMLog.warn(new Function0() { // from class: com.xiaomi.hm.health.relation.a
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return e.getMessage();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(EventFriendSearch eventFriendSearch, FragmentActivity fragmentActivity) {
        Utils.hideProgressDialog(fragmentActivity);
        if (!eventFriendSearch.hasData()) {
            IconToast.showError(fragmentActivity, R.string.relatives_friend_search_not_exist);
            return;
        }
        EventFriendSearch.Friend friend = eventFriendSearch.friends.get(0);
        long j = friend.uid;
        if (j > 0) {
            fragmentActivity.startActivity(SearchResultActivity.createIntent(fragmentActivity, j, friend.userName, friend.iconUrl, friend.token, friend.code == 1));
        } else {
            IconToast.showError(fragmentActivity, R.string.relatives_friend_search_not_exist);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Exception exc) {
        return "权限申请失败" + exc.getMessage();
    }

    private static void g(FragmentActivity fragmentActivity) {
        new PermissionDialogFragmentCompat.Builder().setMessage(fragmentActivity.getString(R.string.relatives_permision_tip)).create().show(fragmentActivity.getSupportFragmentManager(), "");
    }

    public static void scanQrCodeHandler(boolean z, FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        if (i == 49374) {
            if (i2 != -1) {
                if (i2 == 100) {
                    try {
                        g(fragmentActivity);
                        return;
                    } catch (Exception e) {
                        HMLog.error(new Function0() { // from class: db2
                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public final Object getA() {
                                return FriendActivity.f(e);
                            }
                        });
                        e.printStackTrace();
                        return;
                    }
                }
                return;
            }
            if (intent == null) {
                return;
            }
            UserCard userCard = null;
            try {
                IntentResult activityResult = IntentIntegrator.parseActivityResult(i, i2, intent);
                if (activityResult == null) {
                    return;
                }
                userCard = (UserCard) Utils.getGson().fromJson(activityResult.getContents(), UserCard.class);
            } catch (Exception e2) {
                HMLog.w("onActivityResult", e2.getMessage(), new Object[0]);
            }
            if (!NetUtil.isNetworkConnected(fragmentActivity)) {
                CustomToast.makeText(fragmentActivity, R.string.relatives_network_error, 0).show();
                return;
            }
            if (userCard == null || userCard.uid == 0 || userCard.token == null) {
                CustomToast.makeText(fragmentActivity, R.string.relatives_label_qrcode_error, 0).show();
                return;
            }
            Utils.showProgressDialog(fragmentActivity, R.string.relatives_data_loading);
            if (z) {
                FriendManager.getInstance().searchFriend(userCard.uid, userCard.token, 0);
            } else {
                searchFriend(fragmentActivity, userCard.uid, userCard.token, 0);
            }
        }
    }

    public static void searchFriend(FragmentActivity fragmentActivity, long j, String str, int i) {
        WebAPI.searchUserByUid(j, new a(fragmentActivity, str, i));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        scanQrCodeHandler(true, this, i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.relatives_activity_friend);
        getSupportFragmentManager().beginTransaction().replace(R.id.custom_content, new FriendFrag()).commit();
    }
}

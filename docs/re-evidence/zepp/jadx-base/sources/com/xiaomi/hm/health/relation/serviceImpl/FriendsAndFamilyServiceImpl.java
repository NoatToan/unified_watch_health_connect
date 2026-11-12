package com.xiaomi.hm.health.relation.serviceImpl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.relatives.FriendsAndFamilyService;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.databases.model.Friend;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.relation.AddFriendActivityNew;
import com.xiaomi.hm.health.relation.DetailActivity;
import com.xiaomi.hm.health.relation.FriendActivity;
import com.xiaomi.hm.health.relation.FriendFrag;
import com.xiaomi.hm.health.relation.FriendManager;
import com.xiaomi.hm.health.relation.FriendQRCodeActivity;
import com.xiaomi.hm.health.relation.R;
import com.xiaomi.hm.health.relation.RelationExternalsKt;
import com.xiaomi.hm.health.relation.UserQRCardActivity;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J.\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\f\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001eH\u0016J\u0010\u0010 \u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J8\u0010'\u001a\u00020\b2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001cH\u0016J\u0010\u0010(\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001eH\u0016J*\u0010,\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010.\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001e2\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0016¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/relation/serviceImpl/FriendsAndFamilyServiceImpl;", "Lcom/huami/relatives/FriendsAndFamilyService;", "Landroidx/fragment/app/FragmentActivity;", "activity", "", WebAPI.PARAM_SHARE_INVITE_AVATAR, "uid", "nickname", "", "a", "", WebAPI.PARAM_F_TOKEN, "", "type", "searchFriend", "cleanData", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "addFriendActivityNewIntent", "friendActivityIntent", "Landroidx/fragment/app/Fragment;", "fragment", "onSelectFriendFrag", "Ljava/lang/Class;", "friendActivityClass", "eventFriendSearchScanType", "obtainFriendFrag", "", "isFriendFrag", "Landroid/app/Activity;", "showQrCode", "shareFriendInvite", "offset", "count", "refresh", "hasMore", WebAPI.PARAM_IS_REFRESH, "errorTip", "requestFriendListData", "jumpToCaptureActivity", "requestCode", "resultCode", "data", "onCaptureActivityResult", "friendStr", "jumpToDetailActivity", "<init>", "()V", "relatives_release"}, k = 1, mv = {1, 5, 1})
public final class FriendsAndFamilyServiceImpl implements FriendsAndFamilyService {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("亲友详情页跳转失败:", this.a.getMessage());
        }
    }

    private final void a(final FragmentActivity activity, String avatar, String uid, final String nickname) {
        if (TextUtils.isEmpty(uid) || TextUtils.isEmpty(nickname)) {
            return;
        }
        WebAPI.generateShareFriendInvite(avatar, uid, nickname, new IHMBasicHttpResponseHandler() { // from class: com.xiaomi.hm.health.relation.serviceImpl.FriendsAndFamilyServiceImpl$fetchFriendShareInviteLink$1
            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@Nullable Throwable throwable) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@Nullable HMHttpResponseData item) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onSuccess(@Nullable HMHttpResponseData item) {
                try {
                    String strOptString = new JSONObject(new String(item.getResponseBody(), Charsets.UTF_8)).optString("tinyurl");
                    if (!TextUtils.isEmpty(strOptString) && !m.startsWith$default(strOptString, "https://", false, 2, null) && !m.startsWith$default(strOptString, "http://", false, 2, null)) {
                        strOptString = Intrinsics.stringPlus("https://", strOptString);
                    }
                    FriendFrag.INSTANCE.popUpFriendShareInviteDialog(activity, nickname, strOptString);
                } catch (Exception e) {
                    HMLog.i(FriendManager.TAG, e.toString(), new Object[0]);
                }
            }
        });
    }

    @Override // com.huami.relatives.FriendsAndFamilyService
    @NotNull
    public Intent addFriendActivityNewIntent(@NotNull Context context) {
        return new Intent(context, (Class<?>) AddFriendActivityNew.class);
    }

    @Override // com.huami.relatives.FriendsAndFamilyService
    public void cleanData() {
        FriendManager.getInstance().cleanData();
    }

    @Override // com.huami.relatives.FriendsAndFamilyService
    public int eventFriendSearchScanType() {
        return 0;
    }

    @Override // com.huami.relatives.FriendsAndFamilyService
    @NotNull
    public Class<?> friendActivityClass() {
        return FriendActivity.class;
    }

    @Override // com.huami.relatives.FriendsAndFamilyService
    @NotNull
    public Intent friendActivityIntent(@NotNull Context context) {
        return new Intent(context, (Class<?>) FriendActivity.class);
    }

    @Override // com.huami.relatives.FriendsAndFamilyService
    public boolean isFriendFrag(@NotNull Fragment fragment) {
        return fragment instanceof FriendFrag;
    }

    @Override // com.huami.relatives.FriendsAndFamilyService
    public void jumpToCaptureActivity(@NotNull Activity activity) {
        activity.startActivityForResult(new Intent(activity, (Class<?>) FriendQRCodeActivity.class), 49374);
    }

    @Override // com.huami.relatives.FriendsAndFamilyService
    public void jumpToDetailActivity(@NotNull Activity activity, @Nullable String friendStr) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            activity.startActivity(DetailActivity.createIntentFromService(activity, (Friend) new Gson().fromJson(friendStr, Friend.class)));
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(null, null, null, new a(thM3848exceptionOrNullimpl), 7, null);
        }
    }

    @Override // com.huami.relatives.FriendsAndFamilyService
    @NotNull
    public Fragment obtainFriendFrag() {
        return new FriendFrag();
    }

    @Override // com.huami.relatives.FriendsAndFamilyService
    public void onCaptureActivityResult(@NotNull FragmentActivity activity, int requestCode, int resultCode, @Nullable Intent data) {
        FriendActivity.scanQrCodeHandler(false, activity, requestCode, resultCode, data);
    }

    @Override // com.huami.relatives.FriendsAndFamilyService
    public void onSelectFriendFrag(@Nullable Fragment fragment) {
        FriendFrag friendFrag = fragment instanceof FriendFrag ? (FriendFrag) fragment : null;
        if (friendFrag == null) {
            return;
        }
        friendFrag.onSelect();
    }

    @Override // com.huami.relatives.FriendsAndFamilyService
    public void requestFriendListData(int offset, int count, boolean refresh, boolean hasMore, boolean isRefresh, boolean errorTip) {
        FriendManager.getInstance().loadFriendList(offset, count, refresh, hasMore, isRefresh, errorTip);
    }

    @Override // com.huami.relatives.FriendsAndFamilyService
    public void searchFriend(long uid, @NotNull String fToken, int type) {
        FriendManager.getInstance().searchFriend(uid, fToken, type);
    }

    @Override // com.huami.relatives.FriendsAndFamilyService
    public void shareFriendInvite(@NotNull FragmentActivity activity) {
        if (!NetUtil.isNetworkConnected(activity)) {
            CustomToast.makeText(activity, R.string.relatives_network_error, 0).show();
        } else {
            HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
            a(activity, hMPersonInfo.getUserInfo().getAvatar(), String.valueOf(AccountServiceExtKt.getValidUid(RelationExternalsKt.getAccountService())), hMPersonInfo.getUserInfo().getNickname());
        }
    }

    @Override // com.huami.relatives.FriendsAndFamilyService
    public void showQrCode(@NotNull Activity activity) {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        if (hMPersonInfo == null) {
            return;
        }
        activity.startActivity(UserQRCardActivity.createIntent(activity, AccountServiceExtKt.getValidUid(RelationExternalsKt.getAccountService()), hMPersonInfo.getUserInfo().getAvatar(), hMPersonInfo.getUserInfo().getNickname()));
    }
}

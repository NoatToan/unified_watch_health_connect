package com.xiaomi.fitness.active.pk.ui;

import android.app.Application;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.search.SearchContract;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.active.pk.ActivePkViewModel;
import com.xiaomi.fitness.active.pk.PkConstants;
import com.xiaomi.fitness.active.pk.net.model.UserInfo;
import com.xiaomi.fitness.active.pk.ui.SendingInvitationActivity;
import com.xiaomi.fitness.active.pk.ui.recyclerview.FriendRecommendedAdapter;
import com.xiaomi.fitness.active.pk.util.BusinessFailDealUtil;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ShareIntentExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainHelper;
import com.xiaomi.fitness.mine.export.IWebSyncImpl;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.av6;
import defpackage.bui;
import defpackage.cxi;
import defpackage.fni;
import defpackage.jyh;
import defpackage.o3r;
import defpackage.ozi;
import defpackage.wqi;
import defpackage.zii;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 [2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001[B\t\b\u0007¢\u0006\u0004\bZ\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J'\u0010\u0012\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u0006J'\u0010\u001d\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u0013J'\u0010\u001e\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u0006J/\u0010(\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b*\u0010\u0006J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010.H\u0014¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0004H\u0014¢\u0006\u0004\b2\u0010\u0006R\u0016\u00103\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010E\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010LR\"\u0010O\u001a\u00020N8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010V¨\u0006\\"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/SendingInvitationActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/active/pk/ActivePkViewModel;", "Ljyh;", "", Constants.KEY_REQUEST_DATA, "()V", "checkLogin", "checkNetwork", "setUpCharacter", "loadRecommendedFriendList", "addShareButtonListener", "setUpUi", "Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;", "userInfo", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/FriendRecommendedAdapter$FriendRecommendedViewHolder;", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/FriendRecommendedAdapter;", "itemViewHolder", "checkCloudSynchronization", "(Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;Lcom/xiaomi/fitness/active/pk/ui/recyclerview/FriendRecommendedAdapter$FriendRecommendedViewHolder;)V", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Lcom/xiaomi/fitness/mine/export/IWebSyncImpl;", "iWebSyncImpl", "", "showWebSyncDialogIfNeed", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/mine/export/IWebSyncImpl;Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;Lcom/xiaomi/fitness/active/pk/ui/recyclerview/FriendRecommendedAdapter$FriendRecommendedViewHolder;)Z", "showSyncWebDialog", "triggerSyncWithServer", "showSendingIndividualInvitationConfirmationDialog", "sendInvitation", "sharePkRequestLink", "showShareDialog", "showPickApproachOfSharingDialog", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "title", "desc", "", SearchContract.COLUMN_ICON_RESID, "sendUriToWechatWithCustomizedLayout", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "sharePkRequestWithNativeSharesheet", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "friendRecommendedAdapter", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/FriendRecommendedAdapter;", "Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetView;", "rainbowView", "Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetView;", "username", "Ljava/lang/String;", "Landroid/widget/Button;", "btnInviteFriends", "Landroid/widget/Button;", "getBtnInviteFriends", "()Landroid/widget/Button;", "setBtnInviteFriends", "(Landroid/widget/Button;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recommendedFriendsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/appcompat/widget/AppCompatImageView;", "characterView", "Landroidx/appcompat/widget/AppCompatImageView;", "getCharacterView", "()Landroidx/appcompat/widget/AppCompatImageView;", "setCharacterView", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "showRecommendedFriendSection", "Z", "isGlobalVersion", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "mAccountManager", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "getMAccountManager", "()Lcom/xiaomi/fitness/account/manager/AccountManager;", "setMAccountManager", "(Lcom/xiaomi/fitness/account/manager/AccountManager;)V", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SendingInvitationActivity extends Hilt_SendingInvitationActivity<ActivePkViewModel, jyh> {

    @NotNull
    public static final String TAG = "SendingInvitationActivity";
    public Button btnInviteFriends;
    public AppCompatImageView characterView;
    private FriendRecommendedAdapter friendRecommendedAdapter;
    private boolean isGlobalVersion;
    public AccountManager mAccountManager;

    @Nullable
    private ThreeTargetView rainbowView;

    @Nullable
    private RecyclerView recommendedFriendsRecyclerView;
    private boolean showRecommendedFriendSection = true;

    @Nullable
    private String username;

    public SendingInvitationActivity() {
        boolean z = true;
        if (!AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            z = false;
        }
        this.isGlobalVersion = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addShareButtonListener() {
        ((jyh) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: ptl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SendingInvitationActivity.addShareButtonListener$lambda$3(this.f30760a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addShareButtonListener$lambda$3(SendingInvitationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkLogin();
        this$0.checkCloudSynchronization(null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCloudSynchronization(final UserInfo userInfo, final FriendRecommendedAdapter.FriendRecommendedViewHolder itemViewHolder) {
        showWebSyncDialogIfNeed(this, new IWebSyncImpl() { // from class: com.xiaomi.fitness.active.pk.ui.SendingInvitationActivity.checkCloudSynchronization.1
            @Override // com.xiaomi.fitness.mine.export.IWebSyncImpl, com.xiaomi.fitness.mine.export.IWebSync
            public void onWebSyncAccepted() {
                UserInfo userInfo2 = userInfo;
                if (userInfo2 != null) {
                    this.showSendingIndividualInvitationConfirmationDialog(userInfo2, itemViewHolder);
                } else {
                    this.showShareDialog();
                }
            }
        }, userInfo, itemViewHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkLogin() {
        if (getMAccountManager().isLogin()) {
            return;
        }
        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkNetwork() {
        NetUtil netUtil = NetUtil.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        if (netUtil.getNetWorkAvailable(application)) {
            TextView noNetwork = ((jyh) getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(noNetwork, "noNetwork");
            ViewExtKt.gone(noNetwork);
            View networkConnected = ((jyh) getMBinding()).F;
            Intrinsics.checkNotNullExpressionValue(networkConnected, "networkConnected");
            ViewExtKt.visible(networkConnected);
            requestData();
            return;
        }
        ToastExtKt.toastShort(this, ozi.H);
        TextView noNetwork2 = ((jyh) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(noNetwork2, "noNetwork");
        ViewExtKt.visible(noNetwork2);
        View networkConnected2 = ((jyh) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(networkConnected2, "networkConnected");
        ViewExtKt.gone(networkConnected2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadRecommendedFriendList() {
        ((ActivePkViewModel) getMViewModel()).queryRecommendFriendsLiveData().observe(this, new SendingInvitationActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: htl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SendingInvitationActivity.loadRecommendedFriendList$lambda$2(this.f20442a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit loadRecommendedFriendList$lambda$2(final SendingInvitationActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "addRecommendedFriendListListener userInfoList=" + list);
        if (list == null || list.isEmpty()) {
            this$0.showRecommendedFriendSection = false;
            Logger.d(TAG, "loadRecommendedFriendList showRecommendedFriendSection = false");
            RecyclerView friendsRecommendedRecyclerView = ((jyh) this$0.getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(friendsRecommendedRecyclerView, "friendsRecommendedRecyclerView");
            ViewExtKt.gone(friendsRecommendedRecyclerView);
            TextView tvRecommendedFriends = ((jyh) this$0.getMBinding()).K;
            Intrinsics.checkNotNullExpressionValue(tvRecommendedFriends, "tvRecommendedFriends");
            ViewExtKt.gone(tvRecommendedFriends);
        } else {
            this$0.showRecommendedFriendSection = true;
            Logger.d(TAG, "loadRecommendedFriendList showRecommendedFriendSection = true");
            RecyclerView friendsRecommendedRecyclerView2 = ((jyh) this$0.getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(friendsRecommendedRecyclerView2, "friendsRecommendedRecyclerView");
            ViewExtKt.visible(friendsRecommendedRecyclerView2);
            TextView tvRecommendedFriends2 = ((jyh) this$0.getMBinding()).K;
            Intrinsics.checkNotNullExpressionValue(tvRecommendedFriends2, "tvRecommendedFriends");
            ViewExtKt.visible(tvRecommendedFriends2);
            this$0.friendRecommendedAdapter = new FriendRecommendedAdapter(list);
            FriendRecommendedAdapter.OnItemClickListener onItemClickListener = new FriendRecommendedAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.active.pk.ui.SendingInvitationActivity$loadRecommendedFriendList$1$onItemClickListenerImp$1
                @Override // com.xiaomi.fitness.active.pk.ui.recyclerview.FriendRecommendedAdapter.OnItemClickListener
                public void onClick(UserInfo userInfo, FriendRecommendedAdapter.FriendRecommendedViewHolder itemViewHolder) {
                    Intrinsics.checkNotNullParameter(userInfo, "userInfo");
                    Intrinsics.checkNotNullParameter(itemViewHolder, "itemViewHolder");
                    this.this$0.checkLogin();
                    this.this$0.checkCloudSynchronization(userInfo, itemViewHolder);
                }
            };
            FriendRecommendedAdapter friendRecommendedAdapter = this$0.friendRecommendedAdapter;
            FriendRecommendedAdapter friendRecommendedAdapter2 = null;
            if (friendRecommendedAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendRecommendedAdapter");
                friendRecommendedAdapter = null;
            }
            friendRecommendedAdapter.setOnItemClickListener(onItemClickListener);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this$0, 0, false);
            RecyclerView recyclerView = this$0.recommendedFriendsRecyclerView;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(linearLayoutManager);
            }
            RecyclerView recyclerView2 = this$0.recommendedFriendsRecyclerView;
            if (recyclerView2 != null) {
                FriendRecommendedAdapter friendRecommendedAdapter3 = this$0.friendRecommendedAdapter;
                if (friendRecommendedAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("friendRecommendedAdapter");
                } else {
                    friendRecommendedAdapter2 = friendRecommendedAdapter3;
                }
                recyclerView2.setAdapter(friendRecommendedAdapter2);
            }
        }
        int dp = ExtUtilsKt.getDp(this$0.showRecommendedFriendSection ? 0 : 20);
        ViewGroup.LayoutParams layoutParams = ((jyh) this$0.getMBinding()).H.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, dp, 0, 0);
        ((jyh) this$0.getMBinding()).H.setLayoutParams(marginLayoutParams);
        RelativeLayout pictures = ((jyh) this$0.getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(pictures, "pictures");
        ViewExtKt.visible(pictures);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(SendingInvitationActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ThreeTargetView threeTargetView = this$0.rainbowView;
        if (threeTargetView != null) {
            threeTargetView.y(list, true);
        }
        return Unit.INSTANCE;
    }

    private final void requestData() {
        loadRecommendedFriendList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void sendInvitation(final UserInfo userInfo, final FriendRecommendedAdapter.FriendRecommendedViewHolder itemViewHolder) {
        View view;
        if (itemViewHolder != null && (view = itemViewHolder.itemView) != null) {
            view.setClickable(false);
        }
        ((ActivePkViewModel) getMViewModel()).createInviteRecord(new Function1() { // from class: ktl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SendingInvitationActivity.sendInvitation$lambda$4(this.f24284a, userInfo, itemViewHolder, ((Long) obj).longValue());
            }
        }, new Function1() { // from class: ltl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SendingInvitationActivity.sendInvitation$lambda$5(itemViewHolder, (ApiException) obj);
            }
        }, userInfo != null ? Long.valueOf(userInfo.getUserId()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendInvitation$lambda$4(SendingInvitationActivity this$0, UserInfo userInfo, FriendRecommendedAdapter.FriendRecommendedViewHolder friendRecommendedViewHolder, long j) {
        Object objValueOf;
        TextView sentTv;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = ozi.Q;
        Object[] objArr = new Object[1];
        if (userInfo == null || (objValueOf = userInfo.getNickName()) == null) {
            objValueOf = Integer.valueOf(ozi.d0);
        }
        objArr[0] = objValueOf;
        String string = this$0.getString(i, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ToastExtKt.toastLong(this$0, string);
        if (friendRecommendedViewHolder != null && (sentTv = friendRecommendedViewHolder.getSentTv()) != null) {
            ViewExtKt.visible(sentTv);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendInvitation$lambda$5(FriendRecommendedAdapter.FriendRecommendedViewHolder friendRecommendedViewHolder, ApiException it) {
        View view;
        Intrinsics.checkNotNullParameter(it, "it");
        BusinessFailDealUtil.dealCreateInviteRecordFail$default(BusinessFailDealUtil.INSTANCE, null, it, 1, null);
        if (friendRecommendedViewHolder != null && (view = friendRecommendedViewHolder.itemView) != null) {
            view.setClickable(true);
        }
        return Unit.INSTANCE;
    }

    private final void sendUriToWechatWithCustomizedLayout(String uri, String title, String desc, int iconResId) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getApplication().getResources(), iconResId);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        o3r.i().z(uri, title, desc, byteArrayOutputStream.toByteArray());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setUpCharacter() {
        setCharacterView((AppCompatImageView) findViewById(wqi.h));
        ((ActivePkViewModel) getMViewModel()).getIsMaleLiveData().observe(this, new SendingInvitationActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: otl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SendingInvitationActivity.setUpCharacter$lambda$1(this.f29672a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUpCharacter$lambda$1(SendingInvitationActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getCharacterView().setBackgroundResource(bool.booleanValue() ? fni.f17958b : fni.f17957a);
        this$0.getCharacterView().bringToFront();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setUpUi() {
        setTitle(ozi.i);
        setBtnInviteFriends(((jyh) getMBinding()).A);
        String string = getString(ozi.l);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(ozi.U, string);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string2, string, 0, false, 6, (Object) null);
        int length = string.length() + iIndexOf$default;
        SpannableString spannableString = new SpannableString(string2);
        spannableString.setSpan(new ClickableSpan() { // from class: com.xiaomi.fitness.active.pk.ui.SendingInvitationActivity.setUpUi.1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                SendingInvitationActivity.this.startActivity(new Intent(SendingInvitationActivity.this, (Class<?>) PkRuleActivity.class));
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
                ds.setColor(ResourceExtKt.getResourceColor(SendingInvitationActivity.this, zii.f41317a));
                ds.setFakeBoldText(false);
            }
        }, iIndexOf$default, length, 17);
        ((jyh) getMBinding()).E.setMovementMethod(LinkMovementMethod.getInstance());
        ((jyh) getMBinding()).E.setText(spannableString);
        ((jyh) getMBinding()).E.setContentDescription(spannableString);
        this.recommendedFriendsRecyclerView = ((jyh) getMBinding()).D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void sharePkRequestLink() {
        ((ActivePkViewModel) getMViewModel()).createInviteRecord(new Function1() { // from class: ftl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SendingInvitationActivity.sharePkRequestLink$lambda$7(this.f18232a, ((Long) obj).longValue());
            }
        }, new Function1() { // from class: jtl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SendingInvitationActivity.sharePkRequestLink$lambda$8((ApiException) obj);
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sharePkRequestLink$lambda$7(final SendingInvitationActivity this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "Invitation Record Created successfully, and the invite_id is " + j);
        final String invitePkUrl = PkConstants.INSTANCE.getInvitePkUrl(j);
        final String string = this$0.getString(ozi.L);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        UserInfoManager.getAccountCoreInfo$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, new Function1() { // from class: qtl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SendingInvitationActivity.sharePkRequestLink$lambda$7$lambda$6(this.f31833a, invitePkUrl, string, (AccountCoreInfo) obj);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sharePkRequestLink$lambda$7$lambda$6(SendingInvitationActivity this$0, String shareLink, String title, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareLink, "$shareLink");
        Intrinsics.checkNotNullParameter(title, "$title");
        String userName = accountCoreInfo != null ? accountCoreInfo.getUserName() : null;
        this$0.username = userName;
        if (userName == null || StringsKt__StringsKt.isBlank(userName)) {
            this$0.username = this$0.getString(ozi.d0);
        }
        String string = this$0.getString(ozi.M, this$0.username);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.sendUriToWechatWithCustomizedLayout(shareLink, title, string, cxi.f14841a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sharePkRequestLink$lambda$8(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d(TAG, "Invitation Record Created failed, and the error code is is " + it.getErrorCode());
        BusinessFailDealUtil.dealCreateInviteRecordFail$default(BusinessFailDealUtil.INSTANCE, null, it, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void sharePkRequestWithNativeSharesheet() {
        ((ActivePkViewModel) getMViewModel()).createInviteRecord(new Function1() { // from class: rtl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SendingInvitationActivity.sharePkRequestWithNativeSharesheet$lambda$13(this.f32893a, ((Long) obj).longValue());
            }
        }, new Function1() { // from class: gtl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SendingInvitationActivity.sharePkRequestWithNativeSharesheet$lambda$14((ApiException) obj);
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sharePkRequestWithNativeSharesheet$lambda$13(SendingInvitationActivity this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "Invitation Record Sent successfully, and the invite_id is " + j);
        String invitePkUrl = PkConstants.INSTANCE.getInvitePkUrl(j);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/*");
        intent.putExtra("android.intent.extra.TEXT", invitePkUrl);
        Intent intentCreateChooser = Intent.createChooser(intent, this$0.getString(ozi.O));
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setType("text/*");
        ComponentName[] excludeComponentNameArray = ShareIntentExtKt.getExcludeComponentNameArray(intent2);
        if (Build.VERSION.SDK_INT >= 33) {
            intentCreateChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", excludeComponentNameArray);
        }
        this$0.startActivity(intentCreateChooser);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sharePkRequestWithNativeSharesheet$lambda$14(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d(TAG, "Invitation Record Sent failed., and the error code is is " + it.getErrorCode());
        BusinessFailDealUtil.dealCreateInviteRecordFail$default(BusinessFailDealUtil.INSTANCE, null, it, 1, null);
        return Unit.INSTANCE;
    }

    private final void showPickApproachOfSharingDialog() {
        View viewInflate = LayoutInflater.from(this).inflate(bui.n, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(wqi.D1);
        RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate.findViewById(wqi.Y);
        final CommonDialog commonDialogCreate = new CommonDialog.c("share pk request link").setCustomView(viewInflate).setDialogTitle(ozi.S).setNegativeText(ozi.f29844b).setCancelable(true).create();
        if (commonDialogCreate != null) {
            commonDialogCreate.showIfNeed(getSupportFragmentManager());
        }
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: mtl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SendingInvitationActivity.showPickApproachOfSharingDialog$lambda$9(commonDialogCreate, this, view);
            }
        });
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: ntl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SendingInvitationActivity.showPickApproachOfSharingDialog$lambda$10(commonDialogCreate, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPickApproachOfSharingDialog$lambda$10(CommonDialog commonDialog, SendingInvitationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
        if (o3r.i().p()) {
            this$0.sharePkRequestLink();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPickApproachOfSharingDialog$lambda$9(CommonDialog commonDialog, SendingInvitationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
        this$0.sharePkRequestWithNativeSharesheet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSendingIndividualInvitationConfirmationDialog(final UserInfo userInfo, final FriendRecommendedAdapter.FriendRecommendedViewHolder itemViewHolder) {
        String string;
        if (TextUtils.isEmpty(userInfo != null ? userInfo.getNickName() : null)) {
            string = getString(ozi.O);
        } else {
            int i = ozi.P;
            Object[] objArr = new Object[1];
            String nickName = userInfo != null ? userInfo.getNickName() : null;
            Intrinsics.checkNotNull(nickName);
            objArr[0] = nickName;
            string = getString(i, objArr);
        }
        Intrinsics.checkNotNull(string);
        CommonDialog commonDialogCreate = new CommonDialog.c("send_invitation_confirmation").setDialogDescriptionString(new DialogParams.DialogDescriptionString(string)).setPositiveText(ozi.c).setNegativeText(ozi.f29844b).setCancelable(false).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.active.pk.ui.SendingInvitationActivity.showSendingIndividualInvitationConfirmationDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    SendingInvitationActivity.this.sendInvitation(userInfo, itemViewHolder);
                }
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showShareDialog() {
        if (this.isGlobalVersion) {
            sharePkRequestWithNativeSharesheet();
        } else {
            showPickApproachOfSharingDialog();
        }
    }

    private final void showSyncWebDialog(final UserInfo userInfo, final FriendRecommendedAdapter.FriendRecommendedViewHolder itemViewHolder) {
        MainExtKt.getInstance(MainHelper.INSTANCE).showSyncWebDialog(this, new av6() { // from class: com.xiaomi.fitness.active.pk.ui.SendingInvitationActivity.showSyncWebDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    RegionPreference regionPreference = RegionPreference.INSTANCE;
                    regionPreference.setSyncWeb(which == -1);
                    regionPreference.setSettingSyncWeb(true);
                    return;
                }
                if (which != -1) {
                    return;
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
                RegionPreference regionPreference2 = RegionPreference.INSTANCE;
                regionPreference2.setSyncWeb(which == -1);
                regionPreference2.setSettingSyncWeb(true);
                SendingInvitationActivity.this.triggerSyncWithServer();
                UserInfo userInfo2 = userInfo;
                if (userInfo2 != null) {
                    SendingInvitationActivity.this.showSendingIndividualInvitationConfirmationDialog(userInfo2, itemViewHolder);
                } else {
                    SendingInvitationActivity.this.showShareDialog();
                }
            }
        });
    }

    private final boolean showWebSyncDialogIfNeed(FragmentActivity fragmentActivity, IWebSyncImpl iWebSyncImpl, UserInfo userInfo, FriendRecommendedAdapter.FriendRecommendedViewHolder itemViewHolder) {
        if (RegionPreference.INSTANCE.getSyncWeb()) {
            iWebSyncImpl.onWebSyncAccepted();
            return false;
        }
        showSyncWebDialog(userInfo, itemViewHolder);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerSyncWithServer() {
        FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), true, "cloud_sync_switch", null, 4, null);
    }

    @NotNull
    public final Button getBtnInviteFriends() {
        Button button = this.btnInviteFriends;
        if (button != null) {
            return button;
        }
        Intrinsics.throwUninitializedPropertyAccessException("btnInviteFriends");
        return null;
    }

    @NotNull
    public final AppCompatImageView getCharacterView() {
        AppCompatImageView appCompatImageView = this.characterView;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("characterView");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return bui.m;
    }

    @NotNull
    public final AccountManager getMAccountManager() {
        AccountManager accountManager = this.mAccountManager;
        if (accountManager != null) {
            return accountManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccountManager");
        return null;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        Resources resources = super.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Configuration configuration = new Configuration();
        if (!Locale.getDefault().getLanguage().equals("bo") || configuration.fontScale == 1.0f) {
            return resources;
        }
        configuration.fontScale = 1.0f;
        Resources resources2 = createConfigurationContext(configuration).getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        return resources2;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.active.pk.ui.Hilt_SendingInvitationActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpUi();
        setUpCharacter();
        this.rainbowView = (ThreeTargetView) findViewById(wqi.D0);
        ActivePkViewModel.getDefaultActiveGoalLiveData$default((ActivePkViewModel) getMViewModel(), 0L, false, 3, null).observe(this, new SendingInvitationActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: itl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SendingInvitationActivity.onCreate$lambda$0(this.f22080a, (List) obj);
            }
        }));
        addShareButtonListener();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        checkNetwork();
    }

    public final void setBtnInviteFriends(@NotNull Button button) {
        Intrinsics.checkNotNullParameter(button, "<set-?>");
        this.btnInviteFriends = button;
    }

    public final void setCharacterView(@NotNull AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "<set-?>");
        this.characterView = appCompatImageView;
    }

    public final void setMAccountManager(@NotNull AccountManager accountManager) {
        Intrinsics.checkNotNullParameter(accountManager, "<set-?>");
        this.mAccountManager = accountManager;
    }
}

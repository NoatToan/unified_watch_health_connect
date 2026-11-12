package com.xiaomi.fitness.relative.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.mi.health.qrcode.QRCodeExportKt;
import com.mi.health.search.SearchContract;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ShareIntentExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.relative.export.IRelativeCareAccessApi;
import com.xiaomi.fitness.relative.export.RelativeCareAccessExtKt;
import com.xiaomi.fitness.relative.export.RelativeResult;
import com.xiaomi.fitness.relative.server.RelativeShipRequest;
import com.xiaomi.fitness.relative.server.model.AccountUserInfo;
import com.xiaomi.fitness.relative.server.model.RelativeUserInfo;
import com.xiaomi.fitness.relative.ui.RelativeCareHomePageActivity;
import com.xiaomi.fitness.relative.ui.model.HomePageLayoutType;
import com.xiaomi.fitness.relative.ui.recycler.InviteRelativeApproachAdapter;
import com.xiaomi.fitness.relative.ui.recycler.RelativeListAdapter;
import com.xiaomi.fitness.relative.ui.recycler.ShareDataToFamilyAdapter;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.relative.ui.util.RelativeCareUtil;
import com.xiaomi.fitness.service.ServiceConnector;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import commi.health.message.center.export.IMessageCenter;
import commi.health.message.center.export.MessageCenterExtKt;
import defpackage.aoi;
import defpackage.ffk;
import defpackage.jxi;
import defpackage.o3r;
import defpackage.t0j;
import defpackage.vji;
import defpackage.wdk;
import defpackage.xui;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000©\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\r*\u0001w\b\u0007\u0018\u0000 \u0082\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0082\u0001B\n\b\u0007¢\u0006\u0005\b\u0081\u0001\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0006J\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010\u0006J/\u0010+\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010\u0006J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020%H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u0010\u0006J2\u00107\u001a\u00020\u00042!\u00106\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\u000402H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0004H\u0002¢\u0006\u0004\b9\u0010\u0006J\u001d\u0010<\u001a\u00020\u00042\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040:H\u0002¢\u0006\u0004\b<\u0010=J\u0019\u0010@\u001a\u00020\u00042\b\u0010?\u001a\u0004\u0018\u00010>H\u0014¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0004H\u0014¢\u0006\u0004\bB\u0010\u0006J\u000f\u0010C\u001a\u00020\u0004H\u0014¢\u0006\u0004\bC\u0010\u0006J\u000f\u0010D\u001a\u00020\u0004H\u0016¢\u0006\u0004\bD\u0010\u0006J\u0017\u0010F\u001a\u00020\u00042\u0006\u0010E\u001a\u00020>H\u0014¢\u0006\u0004\bF\u0010AJ)\u0010K\u001a\u00020\u00042\u0006\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020)2\b\u0010J\u001a\u0004\u0018\u00010IH\u0015¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\u00042\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010YR\u0016\u0010[\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010YR\u0016\u0010]\u001a\u00020\\8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010^R\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010mR\u0018\u0010o\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010dR\u0016\u0010r\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010pR\u0016\u0010s\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010pR\u0016\u0010t\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010v\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010uR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010|\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0014\u0010~\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010{R\u0015\u0010\u0080\u0001\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010{¨\u0006\u0083\u0001"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/RelativeCareHomePageActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/relative/ui/RelativeCareViewModel;", "Lwdk;", "", "setPageBgColor", "()V", "listenToConnectionStatus", "setStartViewBackIcon", "showTargetLayout", "setEndViewIcons", "switchToTargetLayout", "setRelativeListPageBackground", "setAddRelativePageBackground", "initAddRelativeViewAndAccountUsername", "goToRulesH5Page", "goToMyQrCodePage", "goToMessageNotificationPage", "goToAddRelativePage", "requestDataToSwitchLayout", "fallbackToAddRelativePage", "initRelativeListAdapter", "requestDataForRelativeList", "Lcom/xiaomi/fitness/relative/server/model/AccountUserInfo;", "userInfo", "goToShareDataPageDirectly", "(Lcom/xiaomi/fitness/relative/server/model/AccountUserInfo;)V", "requestDataForAddRelative", "Landroid/content/Context;", "context", "", "checkCameraHardware", "(Landroid/content/Context;)Z", "requestCameraPermission", "sendInvitationViaMessage", "sendInvitationViaLink", "sendInvitationViaWechat", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "title", "desc", "", SearchContract.COLUMN_ICON_RESID, "sendUriToWechatWithCustomizedLayout", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "goToScanQRCodeInvitationPage", "scanResult", "handleMyQRCodeScanResult", "(Ljava/lang/String;)V", "goToMiAccountEditPage", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "url", "shareFunction", "getThirdPartyInviteLinkAndShare", "(Lkotlin/jvm/functions/Function1;)V", "setLayoutManager", "Lkotlin/Function0;", "function", "checkRelativeListCountLimit", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, LifecycleConstantKt.ON_RESUME, "onBackPressed", "outState", "onSaveInstanceState", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/relative/server/RelativeShipRequest;", "relationshipRepository$delegate", "Lkotlin/Lazy;", "getRelationshipRepository", "()Lcom/xiaomi/fitness/relative/server/RelativeShipRequest;", "relationshipRepository", "Landroid/widget/ImageView;", "addOrMyQrCodeView", "Landroid/widget/ImageView;", "smallRedPoint", "notificationIcon", "Landroidx/constraintlayout/widget/ConstraintLayout;", "relativeListLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "addRelativeLayout", "Lcom/xiaomi/fitness/relative/ui/recycler/RelativeListAdapter;", "relativeListAdapter", "Lcom/xiaomi/fitness/relative/ui/recycler/RelativeListAdapter;", "isThirdPartyInvitation", "Z", "Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataToFamilyAdapter;", "shareDataToFamilyAdapter", "Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataToFamilyAdapter;", "Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter;", "inviteRelativeApproachAdapter", "Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "shareToFamilyRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "inviteRelativeApproachRecyclerView", "accountUsername", "Ljava/lang/String;", "shouldBeBackToRelativeList", "oneTrackInviteMethod", "origin", "homePageLayoutType", "I", "relativeCountInRelativeList", "com/xiaomi/fitness/relative/ui/RelativeCareHomePageActivity$serviceConnectionListener$1", "serviceConnectionListener", "Lcom/xiaomi/fitness/relative/ui/RelativeCareHomePageActivity$serviceConnectionListener$1;", "getColCountPerRow", "()I", "colCountPerRow", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RelativeCareHomePageActivity extends Hilt_RelativeCareHomePageActivity<RelativeCareViewModel, wdk> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_RELATIVE_COUNT_IN_RELATIVE_LIST = "relative_count_in_list";

    @NotNull
    public static final String KEY_SHOULD_BE_BACK_TO_RELATIVE_LIST = "key_should_be_back_to_relative_list";

    @NotNull
    public static final String QR_CODE_ID = "qr_code_id";

    @NotNull
    public static final String TAG = "RelativeCareHomePageActivity";

    @Nullable
    private String accountUsername;
    private ImageView addOrMyQrCodeView;
    private ConstraintLayout addRelativeLayout;

    @Nullable
    private InviteRelativeApproachAdapter inviteRelativeApproachAdapter;

    @Nullable
    private RecyclerView inviteRelativeApproachRecyclerView;
    private boolean isThirdPartyInvitation;
    private ImageView notificationIcon;
    private int relativeCountInRelativeList;

    @Nullable
    private RelativeListAdapter relativeListAdapter;
    private ConstraintLayout relativeListLayout;

    @Nullable
    private ShareDataToFamilyAdapter shareDataToFamilyAdapter;

    @Nullable
    private RecyclerView shareToFamilyRecyclerView;
    private boolean shouldBeBackToRelativeList;
    private ImageView smallRedPoint;

    /* JADX INFO: renamed from: relationshipRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy relationshipRepository = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rek
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RelativeCareHomePageActivity.relationshipRepository_delegate$lambda$0();
        }
    });

    @NotNull
    private String oneTrackInviteMethod = "";

    @NotNull
    private String origin = "";
    private int homePageLayoutType = 2;

    @NotNull
    private final RelativeCareHomePageActivity$serviceConnectionListener$1 serviceConnectionListener = new ServiceConnection() { // from class: com.xiaomi.fitness.relative.ui.RelativeCareHomePageActivity$serviceConnectionListener$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Logger.i(RelativeCareHomePageActivity.TAG, "onServiceConnected() called with: name = " + name + ", service = " + service);
            RelativeCareHomePageActivity.access$getMViewModel(this.this$0).getConnectionStatusLiveData().postValue(Boolean.TRUE);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            this.this$0.hideLoading();
            ToastExtKt.toastShort(this.this$0, t0j.g);
        }
    };

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/RelativeCareHomePageActivity$Companion;", "", "<init>", "()V", "TAG", "", "KEY_SHOULD_BE_BACK_TO_RELATIVE_LIST", "QR_CODE_ID", "KEY_RELATIVE_COUNT_IN_RELATIVE_LIST", "goToAddRelativePageWithClearTopFlagOrNewTask", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "homePageLayoutType", "", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void goToAddRelativePageWithClearTopFlagOrNewTask$default(Companion companion, Activity activity, int i, Bundle bundle, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                bundle = null;
            }
            companion.goToAddRelativePageWithClearTopFlagOrNewTask(activity, i, bundle);
        }

        public final void goToAddRelativePageWithClearTopFlagOrNewTask(@NotNull Activity activity, @HomePageLayoutType int homePageLayoutType, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = new Intent(activity, (Class<?>) RelativeCareHomePageActivity.class);
            intent.putExtra(RelativeCareConstants.KEY_HOME_PAGE_LAYOUT_TYPE, homePageLayoutType);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.setFlags(335544320);
            activity.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.ui.RelativeCareHomePageActivity$requestDataForAddRelative$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/xiaomi/fitness/relative/ui/RelativeCareHomePageActivity$requestDataForAddRelative$1", "Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter$OnItemClickListener;", "onClick", "", "itemViewHolder", "Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter$ItemViewHolder;", "Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter;", "iconId", "", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements InviteRelativeApproachAdapter.OnItemClickListener {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onClick$lambda$1(final RelativeCareHomePageActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.checkRelativeListCountLimit(new Function0() { // from class: tek
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RelativeCareHomePageActivity.AnonymousClass1.onClick$lambda$1$lambda$0(this$0);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onClick$lambda$1$lambda$0(RelativeCareHomePageActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.goToMiAccountEditPage();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onClick$lambda$3(final RelativeCareHomePageActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.checkRelativeListCountLimit(new Function0() { // from class: vek
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RelativeCareHomePageActivity.AnonymousClass1.onClick$lambda$3$lambda$2(this$0);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onClick$lambda$3$lambda$2(RelativeCareHomePageActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (this$0.checkCameraHardware(this$0)) {
                this$0.requestCameraPermission();
            } else {
                ToastExtKt.toastShort(this$0, t0j.K);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onClick$lambda$5(final RelativeCareHomePageActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.checkRelativeListCountLimit(new Function0() { // from class: bfk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RelativeCareHomePageActivity.AnonymousClass1.onClick$lambda$5$lambda$4(this$0);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onClick$lambda$5$lambda$4(RelativeCareHomePageActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (o3r.i().p()) {
                this$0.sendInvitationViaWechat();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onClick$lambda$7(final RelativeCareHomePageActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.checkRelativeListCountLimit(new Function0() { // from class: cfk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RelativeCareHomePageActivity.AnonymousClass1.onClick$lambda$7$lambda$6(this$0);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onClick$lambda$7$lambda$6(RelativeCareHomePageActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.sendInvitationViaLink();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onClick$lambda$9(final RelativeCareHomePageActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.checkRelativeListCountLimit(new Function0() { // from class: uek
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RelativeCareHomePageActivity.AnonymousClass1.onClick$lambda$9$lambda$8(this$0);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onClick$lambda$9$lambda$8(RelativeCareHomePageActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.sendInvitationViaMessage();
            return Unit.INSTANCE;
        }

        @Override // com.xiaomi.fitness.relative.ui.recycler.InviteRelativeApproachAdapter.OnItemClickListener
        public void onClick(InviteRelativeApproachAdapter.ItemViewHolder itemViewHolder, int iconId) {
            Intrinsics.checkNotNullParameter(itemViewHolder, "itemViewHolder");
            if (iconId == 0) {
                RelativeCareHomePageActivity.this.oneTrackInviteMethod = "wechat";
                RelativeCareUtil relativeCareUtil = RelativeCareUtil.INSTANCE;
                final RelativeCareHomePageActivity relativeCareHomePageActivity = RelativeCareHomePageActivity.this;
                relativeCareUtil.checkHealthCloudSynchronizationAndProceedIfNeed(relativeCareHomePageActivity, new Function0() { // from class: yek
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RelativeCareHomePageActivity.AnonymousClass1.onClick$lambda$5(relativeCareHomePageActivity);
                    }
                });
            } else if (iconId == 1) {
                RelativeCareHomePageActivity.this.oneTrackInviteMethod = "mi_id";
                RelativeCareUtil relativeCareUtil2 = RelativeCareUtil.INSTANCE;
                final RelativeCareHomePageActivity relativeCareHomePageActivity2 = RelativeCareHomePageActivity.this;
                relativeCareUtil2.checkHealthCloudSynchronizationAndProceedIfNeed(relativeCareHomePageActivity2, new Function0() { // from class: wek
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RelativeCareHomePageActivity.AnonymousClass1.onClick$lambda$1(relativeCareHomePageActivity2);
                    }
                });
            } else if (iconId == 2) {
                RelativeCareHomePageActivity.this.oneTrackInviteMethod = "message";
                RelativeCareUtil relativeCareUtil3 = RelativeCareUtil.INSTANCE;
                final RelativeCareHomePageActivity relativeCareHomePageActivity3 = RelativeCareHomePageActivity.this;
                relativeCareUtil3.checkHealthCloudSynchronizationAndProceedIfNeed(relativeCareHomePageActivity3, new Function0() { // from class: afk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RelativeCareHomePageActivity.AnonymousClass1.onClick$lambda$9(relativeCareHomePageActivity3);
                    }
                });
            } else if (iconId == 3) {
                RelativeCareHomePageActivity.this.oneTrackInviteMethod = "scan_QR";
                RelativeCareUtil relativeCareUtil4 = RelativeCareUtil.INSTANCE;
                final RelativeCareHomePageActivity relativeCareHomePageActivity4 = RelativeCareHomePageActivity.this;
                relativeCareUtil4.checkHealthCloudSynchronizationAndProceedIfNeed(relativeCareHomePageActivity4, new Function0() { // from class: xek
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RelativeCareHomePageActivity.AnonymousClass1.onClick$lambda$3(relativeCareHomePageActivity4);
                    }
                });
            } else if (iconId == 4) {
                RelativeCareHomePageActivity.this.oneTrackInviteMethod = "url";
                RelativeCareUtil relativeCareUtil5 = RelativeCareUtil.INSTANCE;
                final RelativeCareHomePageActivity relativeCareHomePageActivity5 = RelativeCareHomePageActivity.this;
                relativeCareUtil5.checkHealthCloudSynchronizationAndProceedIfNeed(relativeCareHomePageActivity5, new Function0() { // from class: zek
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RelativeCareHomePageActivity.AnonymousClass1.onClick$lambda$7(relativeCareHomePageActivity5);
                    }
                });
            }
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "initiate_invitation"), TuplesKt.to("method", RelativeCareHomePageActivity.this.oneTrackInviteMethod), TuplesKt.to("tip", "56.57.1.1.25019")));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ RelativeCareViewModel access$getMViewModel(RelativeCareHomePageActivity relativeCareHomePageActivity) {
        return (RelativeCareViewModel) relativeCareHomePageActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UnsupportedChromeOsCameraSystemFeature"})
    public final boolean checkCameraHardware(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkRelativeListCountLimit(Function0<Unit> function) {
        if (this.relativeCountInRelativeList >= 8) {
            ToastExtKt.toastShort(this, t0j.g0);
        } else {
            function.invoke();
        }
    }

    private final void fallbackToAddRelativePage() {
        this.homePageLayoutType = 1;
        switchToTargetLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getColCountPerRow() {
        Application application;
        if (!SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            UIUtils uIUtils = UIUtils.INSTANCE;
            if (!uIUtils.isTablet() || (application = getApplication()) == null || !uIUtils.isLandscape(application)) {
                return 5;
            }
        }
        return 7;
    }

    private final RelativeShipRequest getRelationshipRepository() {
        return (RelativeShipRequest) this.relationshipRepository.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getThirdPartyInviteLinkAndShare(final Function1<? super String, Unit> shareFunction) {
        ((RelativeCareViewModel) getMViewModel()).getUniqueInvitationIdLiveData().observe(this, new RelativeCareHomePageActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hek
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeCareHomePageActivity.getThirdPartyInviteLinkAndShare$lambda$23(this.f19981a, shareFunction, (RelativeResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getThirdPartyInviteLinkAndShare$lambda$23(RelativeCareHomePageActivity this$0, Function1 shareFunction, RelativeResult relativeResult) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareFunction, "$shareFunction");
        if (!relativeResult.isSuccess() || relativeResult.getData() == null) {
            Logger.i(TAG, "getThirdPartyInviteLinkAndShare uniqueIdResult failed.");
        } else {
            Logger.i(TAG, "getThirdPartyInviteLinkAndShare uniqueIdResult isSuccess, uniqueId=" + relativeResult.getData() + "&nickname=" + this$0.accountUsername);
            Logger.i(TAG, "getThirdPartyInviteLinkAndShare invitationResult isSuccess.");
            String strEncode = URLEncoder.encode(this$0.accountUsername, "utf-8");
            Logger.d(TAG, "encodedNickname=" + strEncode);
            shareFunction.invoke2(RelativeCareConstants.INSTANCE.getRelativeCareInvitationLinkUrlPrefix() + "&key_invite_link_id=" + relativeResult.getData() + "&nickname=" + strEncode);
        }
        return Unit.INSTANCE;
    }

    private final void goToAddRelativePage() {
        this.homePageLayoutType = 1;
        this.shouldBeBackToRelativeList = true;
        switchToTargetLayout();
    }

    private final void goToMessageNotificationPage() {
        MessageCenterExtKt.getINSTANCE(IMessageCenter.INSTANCE).gotoMessageCenterActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goToMiAccountEditPage() {
        startActivity(new Intent(this, (Class<?>) InputXiaomiAccountActivity.class));
    }

    private final void goToMyQrCodePage() {
        startActivity(new Intent(this, (Class<?>) MyQRCodeActivity.class));
    }

    private final void goToRulesH5Page() {
        WebViewUtilKt.startWebView$default(RelativeCareConstants.INSTANCE.getRelativeCareRuleUrl(), getString(t0j.n0), true, false, null, false, null, false, 248, null);
    }

    private final void goToScanQRCodeInvitationPage() {
        QRCodeExportKt.launchToQRCodeScan$default(this, null, null, true, true, new Intent(this, (Class<?>) MyQRCodeActivity.class), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goToShareDataPageDirectly(AccountUserInfo userInfo) {
        Logger.d(TAG, "goToShareDataPage running");
        Intent intent = new Intent(this, (Class<?>) DataAccessibleToTAActivity.class);
        intent.putExtra("key_relative_uid", userInfo.getUid());
        startActivity(intent);
    }

    private final void handleMyQRCodeScanResult(String scanResult) {
        Logger.i(TAG, "handleQRScanResult: " + scanResult);
        if (!StringsKt__StringsJVMKt.startsWith$default(scanResult, "com.mi.health://relativecare/qrcodeid/", false, 2, null)) {
            ToastExtKt.toastShort(this, t0j.common_not_support);
        }
        try {
            String strSubstring = scanResult.substring(38);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            long j = Long.parseLong(strSubstring);
            Intent intent = new Intent(this, (Class<?>) ConfirmUserInfoActivity.class);
            intent.putExtra(RelativeCareConstants.KEY_QR_CODE_ID, j);
            startActivity(intent);
        } catch (Exception e) {
            ToastExtKt.toastShort(this, t0j.common_not_support);
            Logger.i(TAG, "handleMyQRCodeScanResult failed. ErrorMsg=" + e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initAddRelativeViewAndAccountUsername() {
        this.shareToFamilyRecyclerView = ((wdk) getMBinding()).H;
        this.inviteRelativeApproachRecyclerView = ((wdk) getMBinding()).E;
        UserInfoManager.getAccountCoreInfo$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, new Function1() { // from class: kek
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeCareHomePageActivity.initAddRelativeViewAndAccountUsername$lambda$7(this.f23778a, (AccountCoreInfo) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initAddRelativeViewAndAccountUsername$lambda$7(RelativeCareHomePageActivity this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String userName = accountCoreInfo != null ? accountCoreInfo.getUserName() : null;
        this$0.accountUsername = userName;
        if (userName == null || StringsKt__StringsKt.isBlank(userName)) {
            this$0.accountUsername = accountCoreInfo != null ? accountCoreInfo.getUserId() : null;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRelativeListAdapter() {
        this.relativeListAdapter = new RelativeListAdapter(RelativeCareUtil.INSTANCE.isFoldableDeviceAndExpandedState());
        ((wdk) getMBinding()).G.setAdapter(this.relativeListAdapter);
        ((wdk) getMBinding()).G.setLayoutManager(new LinearLayoutManager(this));
    }

    private final void listenToConnectionStatus() {
        ServiceConnector.addServiceConnectListener$default(ServiceConnector.INSTANCE.getInstance(), this.serviceConnectionListener, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(RelativeCareHomePageActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.showTargetLayout();
            this$0.hideLoading();
        } else {
            this$0.showLoading(t0j.d, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeShipRequest relationshipRepository_delegate$lambda$0() {
        return RelativeShipRequest.INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestCameraPermission() {
        PermissionExtKt.permission(this, "android.permission.CAMERA", getString(t0j.i), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: sek
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeCareHomePageActivity.requestCameraPermission$lambda$16(this.f33566a, (PermissionBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCameraPermission$lambda$16(final RelativeCareHomePageActivity this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: fek
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeCareHomePageActivity.requestCameraPermission$lambda$16$lambda$13(this.f17708a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: gek
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeCareHomePageActivity.requestCameraPermission$lambda$16$lambda$15(this.f18895a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCameraPermission$lambda$16$lambda$13(RelativeCareHomePageActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.goToScanQRCodeInvitationPage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCameraPermission$lambda$16$lambda$15(final RelativeCareHomePageActivity this$0, final String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), it, this$0, null, null, null, new Function0() { // from class: ydk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RelativeCareHomePageActivity.requestCameraPermission$lambda$16$lambda$15$lambda$14(this.f40074a, it);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCameraPermission$lambda$16$lambda$15$lambda$14(RelativeCareHomePageActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        PermissionsUtil.INSTANCE.showSettingDialog(this$0, it, false, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestDataForAddRelative() {
        InviteRelativeApproachAdapter inviteRelativeApproachAdapter = new InviteRelativeApproachAdapter(false, 1, null);
        this.inviteRelativeApproachAdapter = inviteRelativeApproachAdapter;
        inviteRelativeApproachAdapter.showHeader(t0j.U);
        InviteRelativeApproachAdapter inviteRelativeApproachAdapter2 = this.inviteRelativeApproachAdapter;
        if (inviteRelativeApproachAdapter2 != null) {
            inviteRelativeApproachAdapter2.setOnItemClickListener(new AnonymousClass1());
        }
        setLayoutManager();
        RecyclerView recyclerView = this.inviteRelativeApproachRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.inviteRelativeApproachAdapter);
        }
        InviteRelativeApproachAdapter inviteRelativeApproachAdapter3 = this.inviteRelativeApproachAdapter;
        if (inviteRelativeApproachAdapter3 != null) {
            inviteRelativeApproachAdapter3.updateRecyclerView();
        }
        NetUtil netUtil = NetUtil.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        if (!netUtil.getNetWorkAvailable(application)) {
            RecyclerView relativeRecyclerView = ((wdk) getMBinding()).H;
            Intrinsics.checkNotNullExpressionValue(relativeRecyclerView, "relativeRecyclerView");
            ViewExtKt.gone(relativeRecyclerView);
        } else {
            RecyclerView relativeListRecycler = ((wdk) getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(relativeListRecycler, "relativeListRecycler");
            ViewExtKt.visible(relativeListRecycler);
            ((RelativeCareViewModel) getMViewModel()).getFamilyMembersLiveData().observe(this, new RelativeCareHomePageActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jek
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RelativeCareHomePageActivity.requestDataForAddRelative$lambda$11(this.f22708a, (RelativeResult) obj);
                }
            }));
            ((RelativeCareViewModel) getMViewModel()).showNewMsgDotEnableLiveData().observe(this, new RelativeCareHomePageActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lek
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RelativeCareHomePageActivity.requestDataForAddRelative$lambda$12(this.f24975a, (Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDataForAddRelative$lambda$11(RelativeCareHomePageActivity this$0, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (relativeResult.isSuccess()) {
            Collection collection = (Collection) relativeResult.getData();
            if (collection == null || collection.isEmpty()) {
                RecyclerView recyclerView = this$0.shareToFamilyRecyclerView;
                if (recyclerView != null) {
                    ViewExtKt.gone(recyclerView);
                }
                return Unit.INSTANCE;
            }
            RecyclerView recyclerView2 = this$0.shareToFamilyRecyclerView;
            if (recyclerView2 != null) {
                ViewExtKt.visible(recyclerView2);
            }
            Logger.i(TAG, "requestData getFamilyMembersLiveData success list=" + relativeResult.getData());
            ShareDataToFamilyAdapter shareDataToFamilyAdapter = new ShareDataToFamilyAdapter(false, 1, null);
            this$0.shareDataToFamilyAdapter = shareDataToFamilyAdapter;
            shareDataToFamilyAdapter.showHeader(t0j.u0);
            ShareDataToFamilyAdapter shareDataToFamilyAdapter2 = this$0.shareDataToFamilyAdapter;
            if (shareDataToFamilyAdapter2 != null) {
                shareDataToFamilyAdapter2.setOnItemClickListener(new RelativeCareHomePageActivity$requestDataForAddRelative$2$1(this$0));
            }
            RecyclerView recyclerView3 = this$0.shareToFamilyRecyclerView;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(this$0.shareDataToFamilyAdapter);
            }
            ShareDataToFamilyAdapter shareDataToFamilyAdapter3 = this$0.shareDataToFamilyAdapter;
            if (shareDataToFamilyAdapter3 != null) {
                shareDataToFamilyAdapter3.updateDataList((List) relativeResult.getData());
            }
        } else {
            Logger.i(TAG, "requestData getFamilyMembersLiveData failed errorCode=" + relativeResult.getErrorCode() + " errorMsg=" + relativeResult.getErrorMsg());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDataForAddRelative$lambda$12(RelativeCareHomePageActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ImageView imageView = this$0.smallRedPoint;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallRedPoint");
            imageView = null;
        }
        Intrinsics.checkNotNull(bool);
        ViewExtKt.setVisible(imageView, bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestDataForRelativeList() {
        RelativeListAdapter relativeListAdapter = this.relativeListAdapter;
        if (relativeListAdapter != null) {
            relativeListAdapter.setOnItemClickListener(new RelativeListAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.relative.ui.RelativeCareHomePageActivity.requestDataForRelativeList.1
                @Override // com.xiaomi.fitness.relative.ui.recycler.RelativeListAdapter.OnItemClickListener
                public void onClick(RelativeUserInfo userInfo) {
                    Intrinsics.checkNotNullParameter(userInfo, "userInfo");
                    WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                    String model = wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null;
                    Pair[] pairArr = new Pair[5];
                    pairArr[0] = TuplesKt.to("name", userInfo.getNote());
                    pairArr[1] = TuplesKt.to("device_model", model);
                    pairArr[2] = TuplesKt.to("user_id", MD5Util.MD5(String.valueOf(userInfo.getUid())));
                    RelativeListAdapter relativeListAdapter2 = RelativeCareHomePageActivity.this.relativeListAdapter;
                    pairArr[3] = TuplesKt.to("count", relativeListAdapter2 != null ? Integer.valueOf(relativeListAdapter2.getCount()) : null);
                    pairArr[4] = TuplesKt.to("tip", "56.54.1.1.25015");
                    OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
                    HealthPageExtKt.getInstance(IHealthPage.INSTANCE).gotoRelativeHealthFragment(RelativeCareHomePageActivity.this, userInfo.getUid(), userInfo.getNote(), RelativeCareHomePageActivity.this.origin);
                }
            });
        }
        ((RelativeCareViewModel) getMViewModel()).getRelativeList().observe(this, new RelativeCareHomePageActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dek
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeCareHomePageActivity.requestDataForRelativeList$lambda$9(this.f15450a, (RelativeResult) obj);
            }
        }));
        ((RelativeCareViewModel) getMViewModel()).showNewMsgDotEnableLiveData().observe(this, new RelativeCareHomePageActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: eek
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeCareHomePageActivity.requestDataForRelativeList$lambda$10(this.f16565a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDataForRelativeList$lambda$10(RelativeCareHomePageActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ImageView imageView = this$0.smallRedPoint;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallRedPoint");
            imageView = null;
        }
        Intrinsics.checkNotNull(bool);
        ViewExtKt.setVisible(imageView, bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDataForRelativeList$lambda$9(RelativeCareHomePageActivity this$0, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (relativeResult.isSuccess()) {
            Object obj = (List) relativeResult.getData();
            if (obj == null) {
                obj = AbstractJsonLexerKt.NULL;
            }
            Logger.i(TAG, "getRelativeList success list=" + obj);
            List list = (List) relativeResult.getData();
            this$0.relativeCountInRelativeList = list != null ? list.size() : 0;
            RelativeListAdapter relativeListAdapter = this$0.relativeListAdapter;
            if (relativeListAdapter != null) {
                List list2 = (List) relativeResult.getData();
                relativeListAdapter.updateDataList(list2 != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) list2) : null);
            }
        } else {
            Logger.i(TAG, "getRelativeList failed errorCode=" + relativeResult.getErrorCode());
            ToastExtKt.toastShort(this$0, t0j.a0);
            this$0.homePageLayoutType = 1;
            this$0.switchToTargetLayout();
        }
        return Unit.INSTANCE;
    }

    private final void requestDataToSwitchLayout() {
        getRelationshipRepository().getRelativeList().observe(this, new RelativeCareHomePageActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: oek
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeCareHomePageActivity.requestDataToSwitchLayout$lambda$8(this.f29077a, (RelativeResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDataToSwitchLayout$lambda$8(RelativeCareHomePageActivity this$0, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (relativeResult.isSuccess()) {
            Object obj = (List) relativeResult.getData();
            if (obj == null) {
                obj = AbstractJsonLexerKt.NULL;
            }
            Logger.i(TAG, "getRelativeList data=" + obj);
            Collection collection = (Collection) relativeResult.getData();
            this$0.homePageLayoutType = (collection == null || collection.isEmpty()) ? 1 : 0;
            this$0.switchToTargetLayout();
        } else {
            Logger.i(TAG, "getRelativeList failed. errorCode=" + relativeResult.getErrorCode() + " errorMsg=" + relativeResult.getErrorMsg());
            ToastExtKt.toastShort(this$0, t0j.e0);
            this$0.fallbackToAddRelativePage();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendInvitationViaLink() {
        getThirdPartyInviteLinkAndShare(new Function1() { // from class: aek
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeCareHomePageActivity.sendInvitationViaLink$lambda$21(this.f928a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendInvitationViaLink$lambda$21(RelativeCareHomePageActivity this$0, String url) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "url");
        String string = this$0.getString(t0j.q0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this$0.getString(t0j.r0, this$0.accountUsername, url);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this$0.getPackageManager();
        this$0.getApplication().getPackageName();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/*");
        Intent intent2 = new Intent();
        intent2.setAction("android.intent.action.SEND");
        intent2.setType("text/*");
        intent2.putExtra("android.intent.extra.TEXT", string2);
        Intent intentCreateChooser = Intent.createChooser(intent2, string);
        ComponentName[] excludeComponentNameArray = ShareIntentExtKt.getExcludeComponentNameArray(intent);
        if (Build.VERSION.SDK_INT >= 33) {
            intentCreateChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", excludeComponentNameArray);
        }
        this$0.startActivity(intentCreateChooser);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendInvitationViaMessage() {
        getThirdPartyInviteLinkAndShare(new Function1() { // from class: bek
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeCareHomePageActivity.sendInvitationViaMessage$lambda$18(this.f4125a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendInvitationViaMessage$lambda$18(RelativeCareHomePageActivity this$0, String url) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "url");
        String string = this$0.getString(t0j.r0, this$0.accountUsername, url);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("smsto:"));
        intent.putExtra("sms_body", string);
        if (this$0.getIntent().resolveActivity(this$0.getPackageManager()) != null) {
            this$0.startActivity(intent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendInvitationViaWechat() {
        getThirdPartyInviteLinkAndShare(new Function1() { // from class: qek
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeCareHomePageActivity.sendInvitationViaWechat$lambda$22(this.f31442a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendInvitationViaWechat$lambda$22(RelativeCareHomePageActivity this$0, String url) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "url");
        int i = t0j.P;
        String str = this$0.accountUsername;
        Intrinsics.checkNotNull(str);
        String string = this$0.getString(i, str);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this$0.getString(t0j.T, this$0.accountUsername);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this$0.sendUriToWechatWithCustomizedLayout(url, string2, string, jxi.f23222a);
        return Unit.INSTANCE;
    }

    private final void sendUriToWechatWithCustomizedLayout(String uri, String title, String desc, int iconResId) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getApplication().getResources(), iconResId);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        o3r.i().A(uri, title, desc, byteArrayOutputStream.toByteArray());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setAddRelativePageBackground() {
        ImageView imageView = this.addOrMyQrCodeView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addOrMyQrCodeView");
            imageView = null;
        }
        imageView.setContentDescription(getString(t0j.c0));
        ImageView imageView3 = this.addOrMyQrCodeView;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addOrMyQrCodeView");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: mek
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RelativeCareHomePageActivity.setAddRelativePageBackground$lambda$5(this.f26078a, view);
            }
        });
        String string = getString(t0j.q);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new UnderlineSpan(), 0, string.length(), 17);
        ((wdk) getMBinding()).C.setText(spannableString);
        ((wdk) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: nek
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RelativeCareHomePageActivity.setAddRelativePageBackground$lambda$6(this.f27860a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAddRelativePageBackground$lambda$5(RelativeCareHomePageActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goToMyQrCodePage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAddRelativePageBackground$lambda$6(RelativeCareHomePageActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goToRulesH5Page();
    }

    private final void setEndViewIcons() {
        ffk ffkVarA0 = ffk.A0(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ffkVarA0, "inflate(...)");
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        View root = ffkVarA0.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setLayoutParams(layoutParams);
        this.addOrMyQrCodeView = ffkVarA0.A;
        this.smallRedPoint = ffkVarA0.C;
        ImageView imageView = ffkVarA0.B;
        this.notificationIcon = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notificationIcon");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: iek
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RelativeCareHomePageActivity.setEndViewIcons$lambda$3(this.f21058a, view);
            }
        });
        setEndView(root);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEndViewIcons$lambda$3(RelativeCareHomePageActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goToMessageNotificationPage();
    }

    private final void setLayoutManager() {
        RecyclerView recyclerView = this.inviteRelativeApproachRecyclerView;
        if (recyclerView != null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 5);
            gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.relative.ui.RelativeCareHomePageActivity$setLayoutManager$1$1
                @Override // androidx.recyclerview.widget.GridLayoutManager.b
                public int getSpanSize(int position) {
                    return position == 0 ? 5 : 1;
                }
            });
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView2 = this.shareToFamilyRecyclerView;
        if (recyclerView2 != null) {
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(this, getColCountPerRow());
            gridLayoutManager2.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.relative.ui.RelativeCareHomePageActivity$setLayoutManager$2$1
                @Override // androidx.recyclerview.widget.GridLayoutManager.b
                public int getSpanSize(int position) {
                    if (position != 0) {
                        ShareDataToFamilyAdapter shareDataToFamilyAdapter = this.this$0.shareDataToFamilyAdapter;
                        Intrinsics.checkNotNull(shareDataToFamilyAdapter);
                        if (shareDataToFamilyAdapter.getCount() - 1 != position) {
                            return 1;
                        }
                    }
                    return this.this$0.getColCountPerRow();
                }
            });
            recyclerView2.setLayoutManager(gridLayoutManager2);
        }
    }

    private final void setPageBgColor() {
        setTitleBackground(vji.f36950b);
        UIUtils.INSTANCE.setNavigationBarColor(this, vji.f36950b);
    }

    private final void setRelativeListPageBackground() {
        ImageView imageView = this.addOrMyQrCodeView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addOrMyQrCodeView");
            imageView = null;
        }
        imageView.setContentDescription(getString(t0j.f34175k));
        ImageView imageView3 = this.addOrMyQrCodeView;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addOrMyQrCodeView");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: pek
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RelativeCareHomePageActivity.setRelativeListPageBackground$lambda$4(this.f30320a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRelativeListPageBackground$lambda$4(RelativeCareHomePageActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goToAddRelativePage();
    }

    private final void setStartViewBackIcon() {
        hideBack();
        IActionBar.DefaultImpls.setStartView$default(this, 0, aoi.f3300b, null, new View.OnClickListener() { // from class: zdk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RelativeCareHomePageActivity.setStartViewBackIcon$lambda$1(this.f41158a, view);
            }
        }, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStartViewBackIcon$lambda$1(RelativeCareHomePageActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lambda$onCreate$0();
    }

    private final void showTargetLayout() {
        if (this.homePageLayoutType == 2) {
            requestDataToSwitchLayout();
        } else {
            switchToTargetLayout();
        }
    }

    private final void switchToTargetLayout() {
        int i = this.homePageLayoutType;
        ImageView imageView = null;
        if (i == 0) {
            Logger.d(TAG, "switchToTargetLayout relative list page");
            ConstraintLayout constraintLayout = this.addRelativeLayout;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addRelativeLayout");
                constraintLayout = null;
            }
            ViewExtKt.gone(constraintLayout);
            ConstraintLayout constraintLayout2 = this.relativeListLayout;
            if (constraintLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("relativeListLayout");
                constraintLayout2 = null;
            }
            ViewExtKt.visible(constraintLayout2);
            ImageView imageView2 = this.addOrMyQrCodeView;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addOrMyQrCodeView");
            } else {
                imageView = imageView2;
            }
            imageView.setBackground(ResourceExtKt.getResourceDrawable(this, aoi.f3299a));
            setTitle(t0j.l0);
            setRelativeListPageBackground();
            initRelativeListAdapter();
            requestDataForRelativeList();
            return;
        }
        if (i != 1) {
            return;
        }
        Logger.d(TAG, "switchToTargetLayout add relative page");
        ConstraintLayout constraintLayout3 = this.relativeListLayout;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("relativeListLayout");
            constraintLayout3 = null;
        }
        ViewExtKt.gone(constraintLayout3);
        ConstraintLayout constraintLayout4 = this.addRelativeLayout;
        if (constraintLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addRelativeLayout");
            constraintLayout4 = null;
        }
        ViewExtKt.visible(constraintLayout4);
        ImageView imageView3 = this.addOrMyQrCodeView;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addOrMyQrCodeView");
        } else {
            imageView = imageView3;
        }
        imageView.setBackground(ResourceExtKt.getResourceDrawable(this, aoi.j));
        setTitle(t0j.X);
        initAddRelativeViewAndAccountUsername();
        setAddRelativePageBackground();
        requestDataForAddRelative();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return xui.f39482b;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null && requestCode == 666) {
            String stringExtra = data.getStringExtra("scan_result");
            if (stringExtra != null) {
                handleMyQRCodeScanResult(stringExtra);
            } else if (data.getLongExtra("qr_code_id", 0L) != 0) {
                IRelativeCareAccessApi.DefaultImpls.goToConfirmUserinfoPage$default(RelativeCareAccessExtKt.getINSTANCE(IRelativeCareAccessApi.INSTANCE), this, null, null, Long.valueOf(data.getLongExtra("qr_code_id", 0L)), 6, null);
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        if (this.homePageLayoutType == 1 && this.shouldBeBackToRelativeList) {
            NetUtil netUtil = NetUtil.INSTANCE;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            if (netUtil.getNetWorkAvailable(application)) {
                this.homePageLayoutType = 0;
                switchToTargetLayout();
                return;
            }
        }
        if (this.isThirdPartyInvitation || Intrinsics.areEqual(this.origin, RelativeCareConstants.KEY_RELATIONSHIP_ESTABLISHED)) {
            RelativeCareUtil.INSTANCE.jumpToMineTabPage(this);
        } else {
            super.lambda$onCreate$0();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        setLayoutManager();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.relative.ui.Hilt_RelativeCareHomePageActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.relativeListLayout = ((wdk) getMBinding()).F;
        this.addRelativeLayout = ((wdk) getMBinding()).A;
        setPageBgColor();
        setEndViewIcons();
        setStartViewBackIcon();
        String stringExtra = getIntent().getStringExtra("origin");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.origin = stringExtra;
        Logger.d(TAG, "origin=" + stringExtra);
        if (Intrinsics.areEqual(this.origin, "account")) {
            listenToConnectionStatus();
        }
        int intExtra = getIntent().getIntExtra(RelativeCareConstants.KEY_HOME_PAGE_LAYOUT_TYPE, 2);
        this.homePageLayoutType = intExtra;
        Logger.d(TAG, "homePageLayoutType=" + intExtra);
        this.isThirdPartyInvitation = getIntent().getBooleanExtra(RelativeCareConstants.KEY_IS_THIRD_PARTY_INVITATION, false);
        if (savedInstanceState == null) {
            this.homePageLayoutType = getIntent().getIntExtra(RelativeCareConstants.KEY_HOME_PAGE_LAYOUT_TYPE, 2);
            return;
        }
        this.shouldBeBackToRelativeList = savedInstanceState.getBoolean(KEY_SHOULD_BE_BACK_TO_RELATIVE_LIST, false);
        this.homePageLayoutType = savedInstanceState.getInt(RelativeCareConstants.KEY_HOME_PAGE_LAYOUT_TYPE);
        this.relativeCountInRelativeList = savedInstanceState.getInt(KEY_RELATIVE_COUNT_IN_RELATIVE_LIST, 0);
    }

    @Override // com.xiaomi.fitness.relative.ui.Hilt_RelativeCareHomePageActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (Intrinsics.areEqual(this.origin, "account")) {
            ServiceConnector.removeServiceConnectListener$default(ServiceConnector.INSTANCE.getInstance(), this.serviceConnectionListener, 0, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.d(TAG, "onResume homePageLayoutType=" + this.homePageLayoutType);
        NetUtil netUtil = NetUtil.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        if (!netUtil.getNetWorkAvailable(application)) {
            this.homePageLayoutType = 1;
            ToastExtKt.toastShort(this, t0j.d0);
        }
        if (Intrinsics.areEqual(this.origin, "account")) {
            ((RelativeCareViewModel) getMViewModel()).getConnectionStatusLiveData().observe(this, new RelativeCareHomePageActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cek
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RelativeCareHomePageActivity.onResume$lambda$2(this.f5249a, (Boolean) obj);
                }
            }));
        } else {
            showTargetLayout();
        }
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(RelativeCareConstants.KEY_HOME_PAGE_LAYOUT_TYPE, this.homePageLayoutType);
        outState.putBoolean(KEY_SHOULD_BE_BACK_TO_RELATIVE_LIST, this.shouldBeBackToRelativeList);
        outState.putInt(KEY_RELATIVE_COUNT_IN_RELATIVE_LIST, this.relativeCountInRelativeList);
    }
}

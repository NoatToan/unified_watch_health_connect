package com.huami.member_card.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.NavController;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcherKt;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.member_card.BarcodeType;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCard;
import com.huami.bluetooth.profile.channel.module.member_card.Version;
import com.huami.lib.qrcode.QRCodeActivity;
import com.huami.lib.qrcode.QRCodeEncoder;
import com.huami.lib.qrcode.result.IntentIntegrator;
import com.huami.lib.qrcode.result.IntentResult;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.member_card.MemberQRCodeActivity;
import com.huami.member_card.MemberStatisticalKt;
import com.huami.member_card.MembershipCardListAdapter;
import com.huami.member_card.MembershipCardViewModel;
import com.huami.member_card.MembershipDiffUtilCallBack;
import com.huami.member_card.R;
import com.huami.member_card.ScreenBrightnessController;
import com.huami.member_card.bean.HmFormatCodeType;
import com.huami.member_card.bean.MemberCardColorBg;
import com.huami.member_card.databinding.MembershipFragmentHomeBinding;
import com.huami.member_card.databinding.MembershipShowCodeAlterBinding;
import com.huami.member_card.fragment.MembershipHomeFragment;
import com.huami.member_card.koin.DeviceQualifier;
import com.huami.member_card.koin.inject.BtStatusFragmentBuilder;
import com.huami.member_card.move.OnItemTouchCallbackListener;
import com.huami.member_card.move.OnStartDragListener;
import com.huami.member_card.move.RecyclerViewTouchHelper;
import com.huami.member_card.move.TouchCallback;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.utils.easypermission.EasyPermissions;
import com.huami.utils.easypermission.PermissionDialogFragmentCompat;
import com.huami.web.service.WebViewService;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 h2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001hB\u0007¢\u0006\u0004\bf\u0010gJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0016\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J$\u0010\u001b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0005H\u0002J$\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'H\u0016J\u0018\u0010,\u001a\u00020\u00182\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\u001e\u00101\u001a\u00020\u00052\u0006\u0010.\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130/H\u0016J\u001e\u00102\u001a\u00020\u00052\u0006\u0010.\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130/H\u0017J/\u00107\u001a\u00020\u00052\u0006\u0010.\u001a\u00020'2\u000e\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u0013032\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108R$\u0010>\u001a\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00010:0:098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010P\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010MR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010V\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010SR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001d\u0010`\u001a\u00020[8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001d\u0010e\u001a\u00020a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010]\u001a\u0004\bc\u0010d¨\u0006i"}, d2 = {"Lcom/huami/member_card/fragment/MembershipHomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/huami/member_card/move/OnItemTouchCallbackListener;", "Lcom/huami/utils/easypermission/EasyPermissions$PermissionCallbacks;", "Lorg/koin/core/component/KoinComponent;", "", "F", "v", "initLifecycle", "", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", "memberList", "U", "memberCard", "O", "membershipCard", "Q", DTransferConstants.SEARCH_KEY, "M", "", "msg", ExifInterface.GPS_DIRECTION_TRUE, SOAP.XMLNS, "K", "", "isAdd", "resultFromCamera", LogUtil.I, "r", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "", "adapterPosition", "onSwiped", "srcPosition", "targetPosition", "onMove", "onDestroyView", "requestCode", "", "perms", "onPermissionsGranted", "onPermissionsDenied", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "a", "Landroidx/activity/result/ActivityResultLauncher;", "registerForActivityResult", "Lcom/huami/member_card/databinding/MembershipFragmentHomeBinding;", "b", "Lcom/huami/member_card/databinding/MembershipFragmentHomeBinding;", "binding", "Lcom/huami/member_card/MembershipCardViewModel;", "c", "Lcom/huami/member_card/MembershipCardViewModel;", "viewModel", "Lcom/huami/member_card/MembershipCardListAdapter;", GoogleApiAvailabilityLight.a, "Lcom/huami/member_card/MembershipCardListAdapter;", "adapter", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "e", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "deleteDialog", "f", "addLimitDialog", "Lcom/huami/android/design/dialog/AlertDialogFragment$Builder;", "g", "Lcom/huami/android/design/dialog/AlertDialogFragment$Builder;", "builder", "h", "addLimitBuilder", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "i", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Lcom/huami/web/service/WebViewService;", z.j, "Lkotlin/Lazy;", "u", "()Lcom/huami/web/service/WebViewService;", "webViewService", "Lcom/huami/member_card/koin/inject/BtStatusFragmentBuilder;", hl.k, "t", "()Lcom/huami/member_card/koin/inject/BtStatusFragmentBuilder;", "btStatusFragmentBuilder", "<init>", "()V", "Companion", "member_card_release"}, k = 1, mv = {1, 5, 1})
public final class MembershipHomeFragment extends Fragment implements OnItemTouchCallbackListener, EasyPermissions.PermissionCallbacks, KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DETAIL_MEMBERCARD = "DETAIL_MEMBERCARD";

    @NotNull
    public static final String SUPPORT_CODE_LIST = "SUPPORT_CODE_LIST";

    @NotNull
    public static final String TARGET_ADD = "TARGET_ADD";
    private static final int l = 20;

    @NotNull
    private static final String m = "MembershipHomeFragment";
    private static final int n = 10;

    @NotNull
    private static final String o = "member_scan_qr_code";

    @NotNull
    private static final String p = "t/posts/watch?meta_key=tag&category=108&meta_value=faq";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: ez4
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            MembershipHomeFragment.L(this.a, (ActivityResult) obj);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private MembershipFragmentHomeBinding binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private MembershipCardViewModel viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private MembershipCardListAdapter adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment deleteDialog;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment addLimitDialog;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment.Builder builder;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment.Builder addLimitBuilder;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy webViewService;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy btStatusFragmentBuilder;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0016\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0016\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/huami/member_card/fragment/MembershipHomeFragment$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "dpValue", "", "dip2px", "", MembershipHomeFragment.DETAIL_MEMBERCARD, "Ljava/lang/String;", "MEMBER_CAMERA_PERMISSION_CODE", LogUtil.I, "PATH_URL_FAQ", "REQUEST_MEMBER_KEY", "SIZE_ADD_LIMIT", MembershipHomeFragment.SUPPORT_CODE_LIST, "TAG", MembershipHomeFragment.TARGET_ADD, "<init>", "()V", "member_card_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final int dip2px(@NotNull Context context, float dpValue) {
            return (int) ((dpValue * context.getResources().getDisplayMetrics().density) + 0.5f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<OnBackPressedCallback, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull OnBackPressedCallback onBackPressedCallback) {
            MembershipCardViewModel membershipCardViewModel = MembershipHomeFragment.this.viewModel;
            if (membershipCardViewModel == null) {
                membershipCardViewModel = null;
            }
            if (!Intrinsics.areEqual(membershipCardViewModel.isEdit().getValue(), Boolean.TRUE)) {
                MembershipHomeFragment.this.requireActivity().finish();
            } else {
                MembershipCardViewModel membershipCardViewModel2 = MembershipHomeFragment.this.viewModel;
                (membershipCardViewModel2 != null ? membershipCardViewModel2 : null).setEdit(false);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
            a(onBackPressedCallback);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            MembershipFragmentHomeBinding membershipFragmentHomeBinding = MembershipHomeFragment.this.binding;
            if (membershipFragmentHomeBinding == null) {
                membershipFragmentHomeBinding = null;
            }
            membershipFragmentHomeBinding.maskView.setVisibility(z ? 8 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "contents:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "formatName:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.member_card.fragment.MembershipHomeFragment$showCodeBitmap$2", f = "MembershipHomeFragment.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MemberCard b;
        public final /* synthetic */ MembershipHomeFragment c;
        public final /* synthetic */ String d;
        public final /* synthetic */ MembershipShowCodeAlterBinding e;
        public final /* synthetic */ ScreenBrightnessController f;
        public final /* synthetic */ AlertDialog g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.member_card.fragment.MembershipHomeFragment$showCodeBitmap$2$1", f = "MembershipHomeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ MemberCard b;
            public final /* synthetic */ MembershipShowCodeAlterBinding c;
            public final /* synthetic */ Bitmap d;
            public final /* synthetic */ ScreenBrightnessController e;
            public final /* synthetic */ AlertDialog f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MemberCard memberCard, MembershipShowCodeAlterBinding membershipShowCodeAlterBinding, Bitmap bitmap, ScreenBrightnessController screenBrightnessController, AlertDialog alertDialog, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = memberCard;
                this.c = membershipShowCodeAlterBinding;
                this.d = bitmap;
                this.e = screenBrightnessController;
                this.f = alertDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Analytics.recordEvent(new CountEventBuilder(MemberStatisticalKt.EVENTID_MEMBERSHIPCARD_CODE_V).addExtra("name", this.b.getNameID()).addExtra("phonemodels", Build.MODEL));
                this.c.icCodeBitmap.setImageBitmap(this.d);
                this.e.lightUp();
                this.f.show();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MemberCard memberCard, MembershipHomeFragment membershipHomeFragment, String str, MembershipShowCodeAlterBinding membershipShowCodeAlterBinding, ScreenBrightnessController screenBrightnessController, AlertDialog alertDialog, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = memberCard;
            this.c = membershipHomeFragment;
            this.d = str;
            this.e = membershipShowCodeAlterBinding;
            this.f = screenBrightnessController;
            this.g = alertDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Bitmap bitmapSyncEncodeBarcode;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                byte codeType = this.b.getCodeType();
                if ((codeType == BarcodeType.QR_CODE.getValue() || codeType == BarcodeType.DATA_MATRIX.getValue()) || codeType == BarcodeType.PDF417.getValue()) {
                    bitmapSyncEncodeBarcode = QRCodeEncoder.syncEncodeQRCode(this.b.getData(), MembershipHomeFragment.INSTANCE.dip2px(this.c.requireContext(), 182.0f), this.d);
                } else {
                    String data = this.b.getData();
                    Companion companion = MembershipHomeFragment.INSTANCE;
                    bitmapSyncEncodeBarcode = QRCodeEncoder.syncEncodeBarcode(data, companion.dip2px(this.c.requireContext(), 260.0f), companion.dip2px(this.c.requireContext(), 120.0f), this.d);
                }
                Bitmap bitmap = bitmapSyncEncodeBarcode;
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(this.b, this.e, bitmap, this.f, this.g, null);
                this.a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ MemberCard a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MemberCard memberCard) {
            super(0);
            this.a = memberCard;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "not support format Int value:" + ((int) this.a.getCodeType());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MembershipHomeFragment() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.webViewService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<WebViewService>() { // from class: com.huami.member_card.fragment.MembershipHomeFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.web.service.WebViewService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewService invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(WebViewService.class), qualifier, objArr);
            }
        });
        final StringQualifier stringQualifierNamed = QualifierKt.named(DeviceQualifier.MEMBERSHIP_CARD_QUALIFIER);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.btStatusFragmentBuilder = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<BtStatusFragmentBuilder>() { // from class: com.huami.member_card.fragment.MembershipHomeFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.member_card.koin.inject.BtStatusFragmentBuilder, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BtStatusFragmentBuilder invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(BtStatusFragmentBuilder.class), stringQualifierNamed, objArr2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(MembershipHomeFragment membershipHomeFragment, View view) {
        membershipHomeFragment.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(MembershipHomeFragment membershipHomeFragment, View view) {
        membershipHomeFragment.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void C(MembershipHomeFragment membershipHomeFragment, List list) {
        MembershipCardListAdapter membershipCardListAdapter = membershipHomeFragment.adapter;
        if (membershipCardListAdapter == null) {
            membershipCardListAdapter = null;
        }
        if (!(!membershipCardListAdapter.getIsEdit())) {
            list = null;
        }
        if (list == null) {
            return;
        }
        MembershipCardListAdapter membershipCardListAdapter2 = membershipHomeFragment.adapter;
        if (membershipCardListAdapter2 == null) {
            membershipCardListAdapter2 = null;
        }
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new MembershipDiffUtilCallBack(membershipCardListAdapter2.getCards(), list), true);
        MembershipCardListAdapter membershipCardListAdapter3 = membershipHomeFragment.adapter;
        MembershipCardListAdapter membershipCardListAdapter4 = membershipCardListAdapter3;
        if (membershipCardListAdapter3 == null) {
            membershipCardListAdapter4 = 0;
        }
        membershipCardListAdapter4.setCards(list);
        MembershipCardListAdapter membershipCardListAdapter5 = membershipHomeFragment.adapter;
        diffResultCalculateDiff.dispatchUpdatesTo(membershipCardListAdapter5 != null ? membershipCardListAdapter5 : null);
        membershipHomeFragment.U(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(MembershipHomeFragment membershipHomeFragment, Boolean bool) {
        MembershipCardListAdapter membershipCardListAdapter = membershipHomeFragment.adapter;
        if (membershipCardListAdapter == null) {
            membershipCardListAdapter = null;
        }
        membershipCardListAdapter.setEdit(bool.booleanValue());
        if (bool.booleanValue()) {
            MembershipFragmentHomeBinding membershipFragmentHomeBinding = membershipHomeFragment.binding;
            if (membershipFragmentHomeBinding == null) {
                membershipFragmentHomeBinding = null;
            }
            membershipFragmentHomeBinding.memberAdd.setVisibility(8);
            MembershipFragmentHomeBinding membershipFragmentHomeBinding2 = membershipHomeFragment.binding;
            if (membershipFragmentHomeBinding2 == null) {
                membershipFragmentHomeBinding2 = null;
            }
            membershipFragmentHomeBinding2.memberEdit.setVisibility(8);
        } else {
            MembershipCardViewModel membershipCardViewModel = membershipHomeFragment.viewModel;
            if (membershipCardViewModel == null) {
                membershipCardViewModel = null;
            }
            List<MemberCard> value = membershipCardViewModel.getMemberCardList().getValue();
            if (value != null) {
                membershipHomeFragment.U(value);
            }
        }
        MembershipFragmentHomeBinding membershipFragmentHomeBinding3 = membershipHomeFragment.binding;
        (membershipFragmentHomeBinding3 != null ? membershipFragmentHomeBinding3 : null).memberBtnComplete.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(MembershipHomeFragment membershipHomeFragment, Pair pair) {
        int i;
        Integer num;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        if (iIntValue != 0 && iIntValue != 3) {
            if (iIntValue == 255 && (num = (Integer) pair.getSecond()) != null) {
                if (num.intValue() == 10) {
                    membershipHomeFragment.T("");
                    return;
                } else {
                    membershipHomeFragment.s();
                    return;
                }
            }
            return;
        }
        Integer num2 = (Integer) pair.getSecond();
        if (num2 == null) {
            return;
        }
        int iIntValue2 = num2.intValue();
        if (iIntValue2 == 10) {
            membershipHomeFragment.T(membershipHomeFragment.getString(((Number) pair.getFirst()).intValue() == 0 ? R.string.delete_alarm : R.string.world_clock_saving));
            return;
        }
        boolean z = iIntValue2 == 0;
        if (((Number) pair.getFirst()).intValue() == 0) {
            i = z ? R.string.delete_alarm_success : R.string.alarm_delete_failed;
        } else {
            i = z ? R.string.world_clock_saving_success : R.string.world_clock_save_failed;
        }
        membershipHomeFragment.s();
        if (z) {
            IconToast.showSuccess(membershipHomeFragment.requireContext(), i);
        } else {
            IconToast.showSuccess(membershipHomeFragment.requireContext(), i);
        }
    }

    private final void F() {
        MembershipFragmentHomeBinding membershipFragmentHomeBinding = this.binding;
        if (membershipFragmentHomeBinding == null) {
            membershipFragmentHomeBinding = null;
        }
        membershipFragmentHomeBinding.recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        MembershipFragmentHomeBinding membershipFragmentHomeBinding2 = this.binding;
        if (membershipFragmentHomeBinding2 == null) {
            membershipFragmentHomeBinding2 = null;
        }
        RecyclerView recyclerView = membershipFragmentHomeBinding2.recyclerView;
        MembershipCardListAdapter membershipCardListAdapter = new MembershipCardListAdapter();
        this.adapter = membershipCardListAdapter;
        Unit unit = Unit.INSTANCE;
        recyclerView.setAdapter(membershipCardListAdapter);
        final RecyclerViewTouchHelper recyclerViewTouchHelper = new RecyclerViewTouchHelper(new TouchCallback(this));
        recyclerViewTouchHelper.setEnableDrag(false);
        recyclerViewTouchHelper.setEnableSwipe(false);
        MembershipFragmentHomeBinding membershipFragmentHomeBinding3 = this.binding;
        if (membershipFragmentHomeBinding3 == null) {
            membershipFragmentHomeBinding3 = null;
        }
        recyclerViewTouchHelper.attachToRecyclerView(membershipFragmentHomeBinding3.recyclerView);
        MembershipCardListAdapter membershipCardListAdapter2 = this.adapter;
        if (membershipCardListAdapter2 == null) {
            membershipCardListAdapter2 = null;
        }
        membershipCardListAdapter2.setMDragStartListener(new OnStartDragListener() { // from class: com.huami.member_card.fragment.MembershipHomeFragment$initRecyclerView$2
            @Override // com.huami.member_card.move.OnStartDragListener
            public void onStartDrag(@NotNull RecyclerView.ViewHolder viewHolder) {
                recyclerViewTouchHelper.startDrag(viewHolder);
            }
        });
        MembershipCardListAdapter membershipCardListAdapter3 = this.adapter;
        if (membershipCardListAdapter3 == null) {
            membershipCardListAdapter3 = null;
        }
        membershipCardListAdapter3.setRemoveClickListener(new View.OnClickListener() { // from class: dz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MembershipHomeFragment.G(this.a, view);
            }
        });
        MembershipCardListAdapter membershipCardListAdapter4 = this.adapter;
        (membershipCardListAdapter4 != null ? membershipCardListAdapter4 : null).setListener(new View.OnClickListener() { // from class: mz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MembershipHomeFragment.H(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(MembershipHomeFragment membershipHomeFragment, View view) {
        if (view.getTag() instanceof MemberCard) {
            Object tag = view.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.bluetooth.profile.channel.module.member_card.MemberCard");
            membershipHomeFragment.Q((MemberCard) tag);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(MembershipHomeFragment membershipHomeFragment, View view) {
        Object tag = view.getTag();
        Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.bluetooth.profile.channel.module.member_card.MemberCard");
        MemberCard memberCardCopy$default = MemberCard.copy$default((MemberCard) tag, null, null, null, (byte) 0, (byte) 0, 31, null);
        MembershipCardViewModel membershipCardViewModel = membershipHomeFragment.viewModel;
        if (membershipCardViewModel == null) {
            membershipCardViewModel = null;
        }
        if (!Intrinsics.areEqual(membershipCardViewModel.isEdit().getValue(), Boolean.TRUE)) {
            membershipHomeFragment.O(memberCardCopy$default);
            return;
        }
        J(membershipHomeFragment, memberCardCopy$default, false, false, 4, null);
        MembershipCardViewModel membershipCardViewModel2 = membershipHomeFragment.viewModel;
        (membershipCardViewModel2 != null ? membershipCardViewModel2 : null).setEdit(false);
    }

    private final void I(MemberCard memberCard, boolean isAdd, boolean resultFromCamera) {
        Analytics.recordEvent(new CountEventBuilder(MemberStatisticalKt.EVENTID_MEMBERSHIPCARD_ENTER_INFO_V));
        NavController navControllerFindNavController = FragmentKt.findNavController(this);
        int i = R.id.action_membershipHomeFragment_to_membershipEditInfoFragment;
        Bundle bundle = new Bundle();
        bundle.putSerializable(DETAIL_MEMBERCARD, memberCard);
        bundle.putBoolean(TARGET_ADD, isAdd);
        bundle.putBoolean(QRCodeActivity.SCAN_RESULT_SOURCE, resultFromCamera);
        Unit unit = Unit.INSTANCE;
        navControllerFindNavController.navigate(i, bundle);
    }

    public static /* synthetic */ void J(MembershipHomeFragment membershipHomeFragment, MemberCard memberCard, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        membershipHomeFragment.I(memberCard, z, z2);
    }

    private final void K() {
        Intent intent = new Intent(requireContext(), (Class<?>) MemberQRCodeActivity.class);
        MembershipCardViewModel membershipCardViewModel = this.viewModel;
        if (membershipCardViewModel == null) {
            membershipCardViewModel = null;
        }
        Version value = membershipCardViewModel.getVersion().getValue();
        if (value != null) {
            List<BarcodeType> codeType = value.getCodeType();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(codeType, 10));
            Iterator<T> it2 = codeType.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((BarcodeType) it2.next()).getValue()));
            }
            intent.putExtra(SUPPORT_CODE_LIST, CollectionsKt___CollectionsKt.toIntArray(arrayList));
        }
        this.registerForActivityResult.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(MembershipHomeFragment membershipHomeFragment, ActivityResult activityResult) {
        String formatName;
        if (activityResult.getData() == null) {
            return;
        }
        IntentResult activityResult2 = IntentIntegrator.parseActivityResult(49374, -1, activityResult.getData());
        String contents = activityResult2 == null ? null : activityResult2.getContents();
        HMLog.info(m, new c(contents));
        if (contents == null) {
            return;
        }
        if (activityResult2 == null || (formatName = activityResult2.getFormatName()) == null) {
            formatName = null;
        } else {
            HMLog.info(m, new d(formatName));
        }
        if (formatName == null) {
            return;
        }
        Intent data = activityResult.getData();
        boolean booleanExtra = data != null ? data.getBooleanExtra(QRCodeActivity.SCAN_RESULT_SOURCE, false) : false;
        Integer numDes2Value = HmFormatCodeType.INSTANCE.des2Value(formatName);
        Byte bValueOf = numDes2Value != null ? Byte.valueOf((byte) numDes2Value.intValue()) : null;
        if (bValueOf == null) {
            return;
        }
        byte bByteValue = bValueOf.byteValue();
        Analytics.recordEvent(new CountEventBuilder(MemberStatisticalKt.EVENTID_MEMBERSHIPCARD_IDENTIFY_SUCCESSFUL_C).addExtra("type", booleanExtra ? "0" : "1"));
        J(membershipHomeFragment, new MemberCard("", "", contents, bByteValue, MemberCardColorBg.COLOR1.getColorValue()), false, false, 6, null);
    }

    private final void M() {
        AlertDialogFragment alertDialogFragment;
        AlertDialogFragment.Builder message;
        AlertDialogFragment.Builder neutralButton;
        if (this.addLimitDialog == null) {
            AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(requireContext());
            this.addLimitBuilder = builder;
            AlertDialogFragment.Builder cancelable = builder.setCancelable(true);
            AlertDialogFragment alertDialogFragmentCreate = null;
            if (cancelable != null && (message = cancelable.setMessage(R.string.member_add_limit)) != null && (neutralButton = message.setNeutralButton(R.string.ble_known, new DialogInterface.OnClickListener() { // from class: kz4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    MembershipHomeFragment.N(dialogInterface, i);
                }
            })) != null) {
                alertDialogFragmentCreate = neutralButton.create();
            }
            this.addLimitDialog = alertDialogFragmentCreate;
        }
        AlertDialogFragment alertDialogFragment2 = this.addLimitDialog;
        if (!((alertDialogFragment2 == null || alertDialogFragment2.isShowing()) ? false : true) || (alertDialogFragment = this.addLimitDialog) == null) {
            return;
        }
        alertDialogFragment.show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    private final void O(MemberCard memberCard) {
        String str;
        MembershipShowCodeAlterBinding membershipShowCodeAlterBindingInflate = MembershipShowCodeAlterBinding.inflate(LayoutInflater.from(requireContext()), null, false);
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(requireContext()).setView(membershipShowCodeAlterBindingInflate.getRoot()).create();
        final ScreenBrightnessController screenBrightnessController = new ScreenBrightnessController(new WeakReference(alertDialogCreate.getWindow()));
        membershipShowCodeAlterBindingInflate.close.setOnClickListener(new View.OnClickListener() { // from class: lz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MembershipHomeFragment.P(alertDialogCreate, screenBrightnessController, view);
            }
        });
        membershipShowCodeAlterBindingInflate.name.setText(memberCard.getNameID());
        membershipShowCodeAlterBindingInflate.number.setText(MembershipCardListAdapter.INSTANCE.formatNumber(memberCard.getNumber()));
        String formatStr = HmFormatCodeType.INSTANCE.getFormatStr(memberCard.getCodeType());
        if (formatStr == null) {
            HMLog.info(m, new f(memberCard));
            str = null;
        } else {
            str = formatStr;
        }
        if (str == null) {
            return;
        }
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new e(memberCard, this, str, membershipShowCodeAlterBindingInflate, screenBrightnessController, alertDialogCreate, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(AlertDialog alertDialog, ScreenBrightnessController screenBrightnessController, View view) {
        alertDialog.dismiss();
        screenBrightnessController.lightDown();
    }

    private final void Q(final MemberCard membershipCard) {
        AlertDialogFragment alertDialogFragment;
        AlertDialogFragment.Builder message;
        AlertDialogFragment.Builder negativeButton;
        if (this.deleteDialog == null) {
            AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(requireContext());
            this.builder = builder;
            AlertDialogFragment.Builder cancelable = builder.setCancelable(true);
            AlertDialogFragment alertDialogFragmentCreate = null;
            if (cancelable != null && (message = cancelable.setMessage(getString(R.string.membership_card_delete_title))) != null && (negativeButton = message.setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: jz4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    MembershipHomeFragment.R(dialogInterface, i);
                }
            })) != null) {
                alertDialogFragmentCreate = negativeButton.create();
            }
            this.deleteDialog = alertDialogFragmentCreate;
        }
        AlertDialogFragment.Builder builder2 = this.builder;
        if (builder2 != null) {
            builder2.setPositiveButton(getString(R.string.btn_confirm), new DialogInterface.OnClickListener() { // from class: cz4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    MembershipHomeFragment.S(this.a, membershipCard, dialogInterface, i);
                }
            });
        }
        AlertDialogFragment alertDialogFragment2 = this.deleteDialog;
        if (!((alertDialogFragment2 == null || alertDialogFragment2.isShowing()) ? false : true) || (alertDialogFragment = this.deleteDialog) == null) {
            return;
        }
        alertDialogFragment.show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(MembershipHomeFragment membershipHomeFragment, MemberCard memberCard, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        MembershipCardViewModel membershipCardViewModel = membershipHomeFragment.viewModel;
        if (membershipCardViewModel == null) {
            membershipCardViewModel = null;
        }
        if (Intrinsics.areEqual(membershipCardViewModel.isEdit().getValue(), Boolean.TRUE)) {
            MembershipCardListAdapter membershipCardListAdapter = membershipHomeFragment.adapter;
            if (membershipCardListAdapter == null) {
                membershipCardListAdapter = null;
            }
            membershipCardListAdapter.removeItem(memberCard);
        }
        MembershipCardViewModel membershipCardViewModel2 = membershipHomeFragment.viewModel;
        (membershipCardViewModel2 != null ? membershipCardViewModel2 : null).deleteCard(memberCard, true);
    }

    private final void T(String msg) {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2;
        boolean z = false;
        if (this.mLoadingDialog == null) {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(requireContext());
            this.mLoadingDialog = loadingDialogShowDialog;
            if (loadingDialogShowDialog != null) {
                loadingDialogShowDialog.setCancelable(false);
            }
        }
        LoadingDialog loadingDialog3 = this.mLoadingDialog;
        if (loadingDialog3 != null && !loadingDialog3.isShowing()) {
            z = true;
        }
        if (z && (loadingDialog2 = this.mLoadingDialog) != null) {
            loadingDialog2.show();
        }
        if (TextUtils.isEmpty(msg) || (loadingDialog = this.mLoadingDialog) == null) {
            return;
        }
        loadingDialog.setMessage(msg);
    }

    private final void U(List<MemberCard> memberList) {
        MembershipFragmentHomeBinding membershipFragmentHomeBinding = this.binding;
        if (membershipFragmentHomeBinding == null) {
            membershipFragmentHomeBinding = null;
        }
        membershipFragmentHomeBinding.memberEmptyHintMsg.setVisibility(memberList.isEmpty() ? 0 : 8);
        MembershipFragmentHomeBinding membershipFragmentHomeBinding2 = this.binding;
        if (membershipFragmentHomeBinding2 == null) {
            membershipFragmentHomeBinding2 = null;
        }
        membershipFragmentHomeBinding2.memberBtnAdd.setVisibility(memberList.isEmpty() ? 0 : 8);
        MembershipFragmentHomeBinding membershipFragmentHomeBinding3 = this.binding;
        if (membershipFragmentHomeBinding3 == null) {
            membershipFragmentHomeBinding3 = null;
        }
        membershipFragmentHomeBinding3.memberSpace.setVisibility(memberList.isEmpty() ^ true ? 0 : 8);
        MembershipFragmentHomeBinding membershipFragmentHomeBinding4 = this.binding;
        if (membershipFragmentHomeBinding4 == null) {
            membershipFragmentHomeBinding4 = null;
        }
        membershipFragmentHomeBinding4.recyclerView.setVisibility(memberList.isEmpty() ? 8 : 0);
        MembershipFragmentHomeBinding membershipFragmentHomeBinding5 = this.binding;
        if (membershipFragmentHomeBinding5 == null) {
            membershipFragmentHomeBinding5 = null;
        }
        membershipFragmentHomeBinding5.memberAdd.setVisibility(memberList.isEmpty() ^ true ? 0 : 8);
        MembershipFragmentHomeBinding membershipFragmentHomeBinding6 = this.binding;
        (membershipFragmentHomeBinding6 != null ? membershipFragmentHomeBinding6 : null).memberEdit.setVisibility(memberList.isEmpty() ^ true ? 0 : 8);
    }

    @JvmStatic
    public static final int dip2px(@NotNull Context context, float f2) {
        return INSTANCE.dip2px(context, f2);
    }

    private final void initLifecycle() {
        MembershipCardViewModel membershipCardViewModel = (MembershipCardViewModel) new ViewModelProvider(requireActivity()).get(MembershipCardViewModel.class);
        this.viewModel = membershipCardViewModel;
        if (membershipCardViewModel == null) {
            membershipCardViewModel = null;
        }
        membershipCardViewModel.queryMembershipCardList();
        MembershipCardViewModel membershipCardViewModel2 = this.viewModel;
        if (membershipCardViewModel2 == null) {
            membershipCardViewModel2 = null;
        }
        membershipCardViewModel2.getMemberCardList().observe(getViewLifecycleOwner(), new Observer() { // from class: gz4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MembershipHomeFragment.C(this.a, (List) obj);
            }
        });
        MembershipCardViewModel membershipCardViewModel3 = this.viewModel;
        if (membershipCardViewModel3 == null) {
            membershipCardViewModel3 = null;
        }
        membershipCardViewModel3.isEdit().observe(getViewLifecycleOwner(), new Observer() { // from class: fz4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MembershipHomeFragment.D(this.a, (Boolean) obj);
            }
        });
        MembershipCardViewModel membershipCardViewModel4 = this.viewModel;
        (membershipCardViewModel4 != null ? membershipCardViewModel4 : null).getResult().observe(getViewLifecycleOwner(), new Observer() { // from class: hz4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MembershipHomeFragment.E(this.a, (Pair) obj);
            }
        });
    }

    private final void q() {
        MembershipCardViewModel membershipCardViewModel = this.viewModel;
        if (membershipCardViewModel == null) {
            membershipCardViewModel = null;
        }
        List<MemberCard> value = membershipCardViewModel.getMemberCardList().getValue();
        if ((value == null ? 0 : value.size()) < 20) {
            r();
        } else {
            M();
        }
    }

    private final void r() {
        if (EasyPermissions.hasPermissions(requireContext(), "android.permission.CAMERA")) {
            K();
        } else {
            EasyPermissions.requestPermissions(this, getString(R.string.member_relatives_permission_tip), 10, o, "android.permission.CAMERA");
        }
    }

    private final void s() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    private final BtStatusFragmentBuilder t() {
        return (BtStatusFragmentBuilder) this.btStatusFragmentBuilder.getValue();
    }

    private final WebViewService u() {
        return (WebViewService) this.webViewService.getValue();
    }

    private final void v() {
        OnBackPressedDispatcherKt.addCallback$default(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), false, new a(), 2, null);
        MembershipFragmentHomeBinding membershipFragmentHomeBinding = this.binding;
        if (membershipFragmentHomeBinding == null) {
            membershipFragmentHomeBinding = null;
        }
        membershipFragmentHomeBinding.memberEdit.setOnClickListener(new View.OnClickListener() { // from class: qz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MembershipHomeFragment.z(this.a, view);
            }
        });
        MembershipFragmentHomeBinding membershipFragmentHomeBinding2 = this.binding;
        if (membershipFragmentHomeBinding2 == null) {
            membershipFragmentHomeBinding2 = null;
        }
        membershipFragmentHomeBinding2.memberBtnAdd.setOnClickListener(new View.OnClickListener() { // from class: rz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MembershipHomeFragment.A(this.a, view);
            }
        });
        MembershipFragmentHomeBinding membershipFragmentHomeBinding3 = this.binding;
        if (membershipFragmentHomeBinding3 == null) {
            membershipFragmentHomeBinding3 = null;
        }
        membershipFragmentHomeBinding3.memberAdd.setOnClickListener(new View.OnClickListener() { // from class: nz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MembershipHomeFragment.B(this.a, view);
            }
        });
        MembershipFragmentHomeBinding membershipFragmentHomeBinding4 = this.binding;
        if (membershipFragmentHomeBinding4 == null) {
            membershipFragmentHomeBinding4 = null;
        }
        membershipFragmentHomeBinding4.memberBtnComplete.setOnClickListener(new View.OnClickListener() { // from class: oz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MembershipHomeFragment.w(this.a, view);
            }
        });
        MembershipFragmentHomeBinding membershipFragmentHomeBinding5 = this.binding;
        if (membershipFragmentHomeBinding5 == null) {
            membershipFragmentHomeBinding5 = null;
        }
        membershipFragmentHomeBinding5.rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: pz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MembershipHomeFragment.x(this.a, view);
            }
        });
        MembershipFragmentHomeBinding membershipFragmentHomeBinding6 = this.binding;
        (membershipFragmentHomeBinding6 != null ? membershipFragmentHomeBinding6 : null).rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: iz4
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i) {
                MembershipHomeFragment.y(this.a, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(MembershipHomeFragment membershipHomeFragment, View view) {
        MembershipCardViewModel membershipCardViewModel = membershipHomeFragment.viewModel;
        if (membershipCardViewModel == null) {
            membershipCardViewModel = null;
        }
        membershipCardViewModel.done();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(MembershipHomeFragment membershipHomeFragment, View view) {
        MembershipCardViewModel membershipCardViewModel = membershipHomeFragment.viewModel;
        if (membershipCardViewModel == null) {
            membershipCardViewModel = null;
        }
        if (!Intrinsics.areEqual(membershipCardViewModel.isEdit().getValue(), Boolean.TRUE)) {
            membershipHomeFragment.requireActivity().finish();
        } else {
            MembershipCardViewModel membershipCardViewModel2 = membershipHomeFragment.viewModel;
            (membershipCardViewModel2 != null ? membershipCardViewModel2 : null).setEdit(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(MembershipHomeFragment membershipHomeFragment, View view, int i) {
        if (i == 0) {
            membershipHomeFragment.u().launch(HMServerDef.getUrl(p));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(MembershipHomeFragment membershipHomeFragment, View view) {
        MembershipCardViewModel membershipCardViewModel = membershipHomeFragment.viewModel;
        if (membershipCardViewModel == null) {
            membershipCardViewModel = null;
        }
        membershipCardViewModel.setEdit(true);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MembershipFragmentHomeBinding membershipFragmentHomeBindingInflate = MembershipFragmentHomeBinding.inflate(LayoutInflater.from(getContext()), container, false);
        this.binding = membershipFragmentHomeBindingInflate;
        if (membershipFragmentHomeBindingInflate == null) {
            membershipFragmentHomeBindingInflate = null;
        }
        return membershipFragmentHomeBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        MembershipCardViewModel membershipCardViewModel = this.viewModel;
        if (membershipCardViewModel == null) {
            membershipCardViewModel = null;
        }
        membershipCardViewModel.restoreMemberOperationStatus();
    }

    @Override // com.huami.member_card.move.OnItemTouchCallbackListener
    public boolean onMove(int srcPosition, int targetPosition) {
        if (srcPosition < 0) {
            return false;
        }
        MembershipCardListAdapter membershipCardListAdapter = this.adapter;
        if (membershipCardListAdapter == null) {
            membershipCardListAdapter = null;
        }
        if (srcPosition >= membershipCardListAdapter.getCards().size() || targetPosition < 0) {
            return false;
        }
        MembershipCardListAdapter membershipCardListAdapter2 = this.adapter;
        if (membershipCardListAdapter2 == null) {
            membershipCardListAdapter2 = null;
        }
        if (targetPosition >= membershipCardListAdapter2.getCards().size()) {
            return false;
        }
        MembershipCardViewModel membershipCardViewModel = this.viewModel;
        if (membershipCardViewModel == null) {
            membershipCardViewModel = null;
        }
        membershipCardViewModel.swapList(srcPosition, targetPosition);
        MembershipCardListAdapter membershipCardListAdapter3 = this.adapter;
        (membershipCardListAdapter3 != null ? membershipCardListAdapter3 : null).swapItem(srcPosition, targetPosition);
        return true;
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    @SuppressLint({"RestrictedApi"})
    public void onPermissionsDenied(int requestCode, @NotNull List<String> perms) {
        if (requestCode == 10 && EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
            new PermissionDialogFragmentCompat.Builder().setMessage(getString(R.string.member_relatives_permission_tip)).create().show(getChildFragmentManager(), "");
        }
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsGranted(int requestCode, @NotNull List<String> perms) {
        if (requestCode == 10) {
            K();
        }
    }

    @Override // androidx.fragment.app.Fragment, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    @Override // com.huami.member_card.move.OnItemTouchCallbackListener
    public void onSwiped(int adapterPosition) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        t().addBtStatusFragment(R.id.container, getChildFragmentManager(), new b());
        F();
        v();
        initLifecycle();
    }
}

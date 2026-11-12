package com.huami.wallet.ui.fragment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.BusCardSimple2;
import com.huami.wallet.lib.entity.CheckOrderResult;
import com.huami.wallet.lib.entity.Coupon;
import com.huami.wallet.lib.entity.Fee;
import com.huami.wallet.lib.entity.MiOrder;
import com.huami.wallet.lib.entity.Notice;
import com.huami.wallet.lib.entity.Protocol;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.entity.WalletConfig;
import com.huami.wallet.lib.entity.XiaomiNotice;
import com.huami.wallet.lib.util.ErrorCode;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.aac.SingleLiveEvent;
import com.huami.wallet.ui.dialog.PayRechargeDialogFragment;
import com.huami.wallet.ui.entity.ResultInfo;
import com.huami.wallet.ui.entity.RichPayMode;
import com.huami.wallet.ui.fragment.OpenBusCardFragment;
import com.huami.wallet.ui.function.Supplier;
import com.huami.wallet.ui.helper.AnalyticsHelper;
import com.huami.wallet.ui.helper.BenchmarkResourceObserver;
import com.huami.wallet.ui.helper.LiveDataExtensionKt;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.repository.BusCardRepo;
import com.huami.wallet.ui.repository.NoticeRepo;
import com.huami.wallet.ui.utils.ErrorMsgUtils;
import com.huami.wallet.ui.utils.ImageLoadUtils;
import com.huami.wallet.ui.utils.KTExtFunKt;
import com.huami.wallet.ui.utils.KtUtils;
import com.huami.wallet.ui.utils.KtUtilsKt;
import com.huami.wallet.ui.utils.MoneyUtils;
import com.huami.wallet.ui.utils.NoticeActionType;
import com.huami.wallet.ui.utils.NoticeViewUtils;
import com.huami.wallet.ui.utils.TintUtils;
import com.huami.wallet.ui.view.MyTextView;
import com.huami.wallet.ui.view.NoticeBarView;
import com.huami.wallet.ui.viewmodel.OpenBusCardViewModel;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.netty.util.internal.StringUtil;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 o2\u00020\u0001:\u0003opNB\u0007¢\u0006\u0004\bm\u0010nJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u001c\u0010\u0012\u001a\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0018\u0010\u0015\u001a\u00020\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H\u0002J\u0018\u0010\u0017\u001a\u00020\u00022\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H\u0002J\u001e\u0010\u001a\u001a\u00020\u00022\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u0013H\u0002J\u0018\u0010\u001c\u001a\u00020\u00022\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0013H\u0002J\u0016\u0010\u001d\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0013H\u0002J\u001e\u0010 \u001a\u00020\u00022\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0018\u0018\u00010\u0013H\u0002J\u0016\u0010!\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0002J\u0019\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b#\u0010$J\u0012\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%H\u0002J\u001a\u0010\u0016\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010+\u001a\u00020\u0002H\u0002J\b\u0010,\u001a\u00020\u0002H\u0002J\b\u0010-\u001a\u00020\u0002H\u0002J\b\u0010.\u001a\u00020\u0002H\u0002J\u0012\u00100\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u0004H\u0002J\"\u00101\u001a\u00020\u00022\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u0018\u0012\u0004\u0012\u00020%0\u000fH\u0002J\u0019\u00103\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b3\u00104J \u00107\u001a\u00020\u00022\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00182\u0006\u00106\u001a\u00020\u001eH\u0002J \u0010;\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0004H\u0002J\b\u0010<\u001a\u00020\u0002H\u0002J\u0010\u0010?\u001a\u00020\u00022\u0006\u0010>\u001a\u00020=H\u0016J&\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010A\u001a\u00020@2\b\u0010C\u001a\u0004\u0018\u00010B2\b\u0010E\u001a\u0004\u0018\u00010DH\u0016J\u001a\u0010I\u001a\u00020\u00022\u0006\u0010H\u001a\u00020F2\b\u0010E\u001a\u0004\u0018\u00010DH\u0016J\u0010\u0010K\u001a\u00020\u00022\b\u0010J\u001a\u0004\u0018\u00010DJ\b\u0010L\u001a\u00020\u0002H\u0016R\u001d\u0010R\u001a\u00020M8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001d\u0010W\u001a\u00020S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010O\u001a\u0004\bU\u0010VR\u001d\u0010\\\u001a\u00020X8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010O\u001a\u0004\bZ\u0010[R\u001d\u0010a\u001a\u00020]8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010O\u001a\u0004\b_\u0010`R\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010i\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010l\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006q"}, d2 = {"Lcom/huami/wallet/ui/fragment/OpenBusCardFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "", "initViewModel", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "f0", "", "isAgree", "V", "canOpenUp", "W", "Lcom/huami/wallet/ui/entity/ResultInfo;", "resultInfo", "U", "Landroid/util/Pair;", "", "tuple", "M", "Lcom/huami/wallet/lib/entity/Resource;", "resource", "Z", "r", DTransferConstants.SEARCH_KEY, "", "Lcom/huami/wallet/lib/entity/XiaomiNotice;", "g0", "Lcom/huami/wallet/lib/entity/Protocol;", "e0", "a0", "Lcom/huami/wallet/lib/entity/Coupon;", "couponsResource", "X", "b0", "showPhone", "d0", "(Ljava/lang/Boolean;)V", "Lcom/huami/wallet/lib/entity/Fee;", "fee", "Y", "Landroid/widget/TextView;", "textView", "link", "H", "initViews", "K", "t", "type", LogUtil.I, "R", "shouldPayAmount", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/Integer;)V", "couponList", FirebaseAnalytics.Param.COUPON, "P", "cardName", "payMoney", "userProtocolId", "N", SOAP.XMLNS, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "args", "refreshArguments", "onDestroy", "Lcom/huami/wallet/ui/navigation/NavigationController;", "b", "Lkotlin/Lazy;", "u", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "mNavigationController", "Lcom/huami/wallet/ui/repository/NoticeRepo;", "c", "v", "()Lcom/huami/wallet/ui/repository/NoticeRepo;", "mNoticeRepo", "Lcom/huami/wallet/lib/api/WalletDataSource;", GoogleApiAvailabilityLight.a, "x", "()Lcom/huami/wallet/lib/api/WalletDataSource;", "walletDataSource", "Lcom/huami/wallet/ui/viewmodel/OpenBusCardViewModel;", "e", "w", "()Lcom/huami/wallet/ui/viewmodel/OpenBusCardViewModel;", "mViewModel", "Lcom/huami/wallet/ui/fragment/OpenBusCardFragment$b;", "f", "Lcom/huami/wallet/ui/fragment/OpenBusCardFragment$b;", "mViewHolder", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "g", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "mLoadingDialogHelper", "h", "Ljava/lang/String;", "appCode", "<init>", "()V", "Companion", "a", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class OpenBusCardFragment extends BaseFragment {

    @NotNull
    public static final String ARG_APP_NAME = "ARG_APP_NAME";

    @NotNull
    public static final String ARG_BOUND_PHONE = "ARG_BOUND_PHONE";

    @NotNull
    public static final String ARG_BUS_CARD_ID = "ARG_BUS_CARD_ID";

    @NotNull
    public static final String ARG_BUS_CARD_IMAGE_URL = "ARG_BUS_CARD_IMAGE_URL";

    @NotNull
    public static final String ARG_BUS_CARD_NAME = "ARG_BUS_CARD_NAME";

    @NotNull
    public static final String ARG_PACKAGE_NAME = "ARG_PACKAGE_NAME";

    @NotNull
    public static final String ARG_REDIRECT_TO = "ARG_REDIRECT_TO";

    @NotNull
    public static final String ARG_SERVICE_CONTACT = "ARG_SERVICE_CONTACT";

    @NotNull
    public static final String ARG_XIAO_MI_CARDNAME = "ARG_XIAO_MI_CARDNAME";

    @NotNull
    public static final String TAG = "Wallet-OpenBusCard";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNavigationController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNoticeRepo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy walletDataSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private b mViewHolder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper mLoadingDialogHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private String appCode;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"com/huami/wallet/ui/fragment/OpenBusCardFragment$a", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "Landroid/text/TextPaint;", "ds", "updateDrawState", "<init>", "(Lcom/huami/wallet/ui/fragment/OpenBusCardFragment;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public final class a extends ClickableSpan {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View widget) {
            Resource<Protocol> value;
            Resource<Protocol> value2;
            Protocol protocol;
            Resource<Protocol> value3;
            Protocol protocol2;
            MutableLiveData<Resource<Protocol>> mutableLiveData = OpenBusCardFragment.this.w().isNeedShowProtocol;
            if ((mutableLiveData == null ? null : mutableLiveData.getValue()) != null) {
                MutableLiveData<Resource<Protocol>> mutableLiveData2 = OpenBusCardFragment.this.w().isNeedShowProtocol;
                if (((mutableLiveData2 == null || (value = mutableLiveData2.getValue()) == null) ? null : value.data) != null) {
                    MutableLiveData<Resource<Protocol>> mutableLiveData3 = OpenBusCardFragment.this.w().isNeedShowProtocol;
                    if (((mutableLiveData3 == null || (value2 = mutableLiveData3.getValue()) == null || (protocol = value2.data) == null) ? null : protocol.getContent()) == null) {
                        return;
                    }
                    NavigationController navigationControllerU = OpenBusCardFragment.this.u();
                    MutableLiveData<Resource<Protocol>> mutableLiveData4 = OpenBusCardFragment.this.w().isNeedShowProtocol;
                    navigationControllerU.navigateToWeb((mutableLiveData4 == null || (value3 = mutableLiveData4.getValue()) == null || (protocol2 = value3.data) == null) ? null : protocol2.getContent(), null);
                }
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint ds) {
            ds.setUnderlineText(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010I\u001a\u00020'¢\u0006\u0004\bJ\u0010KR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0012\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\fR\u0019\u0010\u0015\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0018\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u001b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u001d\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u001c\u0010\fR\u0019\u0010\u001f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u001e\u0010\fR\u0019\u0010!\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b\u0003\u0010\fR\u0019\u0010&\u001a\u00020\"8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\t\u0010%R\u0019\u0010+\u001a\u00020'8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0019\u0010-\u001a\u00020'8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b\u0019\u0010*R\u0019\u0010.\u001a\u00020'8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010)\u001a\u0004\b,\u0010*R\u0019\u0010/\u001a\u00020'8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010)\u001a\u0004\b \u0010*R\u0019\u00103\u001a\u0002008\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b#\u00102R\u0019\u00108\u001a\u0002048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u00107R\u0019\u0010:\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b\u0013\u0010\fR\u0019\u0010<\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b\u0016\u0010\fR\u0019\u0010=\u001a\u00020'8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b\u0010\u0010*R\u0019\u0010A\u001a\u00020>8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010?\u001a\u0004\b9\u0010@R\u0019\u0010C\u001a\u00020>8\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\b;\u0010@R\u0019\u0010E\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010\n\u001a\u0004\bD\u0010\fR\u0019\u0010G\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010\n\u001a\u0004\bB\u0010\fR\u0019\u0010H\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010\n\u001a\u0004\bF\u0010\f¨\u0006L"}, d2 = {"com/huami/wallet/ui/fragment/OpenBusCardFragment$b", "", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "c", "()Landroid/widget/ImageView;", "cardImage", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "t", "()Landroid/widget/TextView;", "serviceCharge", com.google.android.exoplayer2.text.ttml.b.r, "rechargeAmountTitle", GoogleApiAvailabilityLight.a, DTransferConstants.SEARCH_KEY, "rechargeAmountValue", "e", "h", "flashSaleTitle", "f", "i", "flashSaleValue", "g", GoogleApiAvailabilityLight.b, "phoneTitle", "o", "phoneValue", "u", "shouldPayAmountValue", z.j, "agree", "Landroid/widget/CheckBox;", hl.k, "Landroid/widget/CheckBox;", "()Landroid/widget/CheckBox;", "agreementCheckbox", "Landroid/view/View;", "l", "Landroid/view/View;", "()Landroid/view/View;", "openUpButton", "m", "flashSaleDivider", "payAmountDivider", "modifyPhoneButton", "Lcom/huami/wallet/ui/view/NoticeBarView;", "Lcom/huami/wallet/ui/view/NoticeBarView;", "()Lcom/huami/wallet/ui/view/NoticeBarView;", "noticeBarView", "Lcom/huami/wallet/ui/view/MyTextView;", "Lcom/huami/wallet/ui/view/MyTextView;", "y", "()Lcom/huami/wallet/ui/view/MyTextView;", "xiaomiNoticeView", "r", "couponTitle", SOAP.XMLNS, "couponValue", "couponDivider", "Landroid/widget/RelativeLayout;", "Landroid/widget/RelativeLayout;", "()Landroid/widget/RelativeLayout;", "rlCardDetail", "v", "rlCardInformation", "w", "tvOpenCardKnow", "x", "tvCardInformation", "tvReturn", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ImageView cardImage;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView serviceCharge;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final TextView rechargeAmountTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final TextView rechargeAmountValue;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final TextView flashSaleTitle;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private final TextView flashSaleValue;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        private final TextView phoneTitle;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        private final TextView phoneValue;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        private final TextView shouldPayAmountValue;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        private final TextView agree;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        private final CheckBox agreementCheckbox;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        private final View openUpButton;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @NotNull
        private final View flashSaleDivider;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @NotNull
        private final View payAmountDivider;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @NotNull
        private final View modifyPhoneButton;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @NotNull
        private final NoticeBarView noticeBarView;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @NotNull
        private final MyTextView xiaomiNoticeView;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @NotNull
        private final TextView couponTitle;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @NotNull
        private final TextView couponValue;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @NotNull
        private final View couponDivider;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @NotNull
        private final RelativeLayout rlCardDetail;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        @NotNull
        private final RelativeLayout rlCardInformation;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        @NotNull
        private final TextView tvOpenCardKnow;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        @NotNull
        private final TextView tvCardInformation;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        @NotNull
        private final TextView tvReturn;

        public b(@NotNull View view) {
            this.cardImage = (ImageView) view.findViewById(R.id.card_image);
            this.serviceCharge = (TextView) view.findViewById(R.id.service_charge);
            this.rechargeAmountTitle = (TextView) view.findViewById(R.id.recharge_amount_title);
            this.rechargeAmountValue = (TextView) view.findViewById(R.id.recharge_amount_value);
            this.flashSaleTitle = (TextView) view.findViewById(R.id.flash_sale_title);
            this.flashSaleValue = (TextView) view.findViewById(R.id.flash_sale);
            this.phoneTitle = (TextView) view.findViewById(R.id.phone_title);
            this.phoneValue = (TextView) view.findViewById(R.id.phone_value);
            this.shouldPayAmountValue = (TextView) view.findViewById(R.id.should_pay_amount_value);
            this.agree = (TextView) view.findViewById(R.id.agree);
            this.agreementCheckbox = (CheckBox) view.findViewById(R.id.agreement_checkbox);
            this.openUpButton = view.findViewById(R.id.open_up_button);
            this.flashSaleDivider = view.findViewById(R.id.flash_sale_divider);
            this.payAmountDivider = view.findViewById(R.id.pay_amount_divider);
            this.modifyPhoneButton = view.findViewById(R.id.modify_phone_button);
            this.noticeBarView = (NoticeBarView) view.findViewById(R.id.wl_noticebarview);
            this.xiaomiNoticeView = (MyTextView) view.findViewById(R.id.wl_tv_xiaomi_notice);
            this.couponTitle = (TextView) view.findViewById(R.id.coupon_title);
            this.couponValue = (TextView) view.findViewById(R.id.coupon);
            this.couponDivider = view.findViewById(R.id.coupon_divider);
            this.rlCardDetail = (RelativeLayout) view.findViewById(R.id.rl_card);
            this.rlCardInformation = (RelativeLayout) view.findViewById(R.id.rl_card_information);
            this.tvOpenCardKnow = (TextView) view.findViewById(R.id.tv_open_card_know);
            this.tvCardInformation = (TextView) view.findViewById(R.id.card_information);
            this.tvReturn = (TextView) view.findViewById(R.id.tv_return);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextView getAgree() {
            return this.agree;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final CheckBox getAgreementCheckbox() {
            return this.agreementCheckbox;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final ImageView getCardImage() {
            return this.cardImage;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final View getCouponDivider() {
            return this.couponDivider;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextView getCouponTitle() {
            return this.couponTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextView getCouponValue() {
            return this.couponValue;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final View getFlashSaleDivider() {
            return this.flashSaleDivider;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextView getFlashSaleTitle() {
            return this.flashSaleTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextView getFlashSaleValue() {
            return this.flashSaleValue;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final View getModifyPhoneButton() {
            return this.modifyPhoneButton;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final NoticeBarView getNoticeBarView() {
            return this.noticeBarView;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final View getOpenUpButton() {
            return this.openUpButton;
        }

        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public final View getPayAmountDivider() {
            return this.payAmountDivider;
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public final TextView getPhoneTitle() {
            return this.phoneTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: o, reason: from getter */
        public final TextView getPhoneValue() {
            return this.phoneValue;
        }

        @NotNull
        /* JADX INFO: renamed from: p, reason: from getter */
        public final TextView getRechargeAmountTitle() {
            return this.rechargeAmountTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: q, reason: from getter */
        public final TextView getRechargeAmountValue() {
            return this.rechargeAmountValue;
        }

        @NotNull
        /* JADX INFO: renamed from: r, reason: from getter */
        public final RelativeLayout getRlCardDetail() {
            return this.rlCardDetail;
        }

        @NotNull
        /* JADX INFO: renamed from: s, reason: from getter */
        public final RelativeLayout getRlCardInformation() {
            return this.rlCardInformation;
        }

        @NotNull
        /* JADX INFO: renamed from: t, reason: from getter */
        public final TextView getServiceCharge() {
            return this.serviceCharge;
        }

        @NotNull
        /* JADX INFO: renamed from: u, reason: from getter */
        public final TextView getShouldPayAmountValue() {
            return this.shouldPayAmountValue;
        }

        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public final TextView getTvCardInformation() {
            return this.tvCardInformation;
        }

        @NotNull
        /* JADX INFO: renamed from: w, reason: from getter */
        public final TextView getTvOpenCardKnow() {
            return this.tvOpenCardKnow;
        }

        @NotNull
        /* JADX INFO: renamed from: x, reason: from getter */
        public final TextView getTvReturn() {
            return this.tvReturn;
        }

        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public final MyTextView getXiaomiNoticeView() {
            return this.xiaomiNoticeView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "passCheck", "Lcom/huami/wallet/lib/entity/Notice;", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Boolean, Notice, Object> {
        public c() {
            super(2);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0072  */
        @Nullable
        public final Object a(boolean z, @Nullable Notice notice) {
            BusCardSimple2 value;
            if (z) {
                MutableLiveData<Resource<Protocol>> mutableLiveData = OpenBusCardFragment.this.w().isNeedShowProtocol;
                Resource<Protocol> value2 = mutableLiveData == null ? null : mutableLiveData.getValue();
                if ((value2 == null ? null : value2.data) == null) {
                    OpenBusCardFragment.this.w().startOpenCard();
                } else {
                    MutableLiveData<BusCardSimple2> mutableLiveData2 = OpenBusCardFragment.this.w().busCardLiveData;
                    if ((mutableLiveData2 == null ? null : mutableLiveData2.getValue()) == null) {
                        OpenBusCardFragment.this.w().startOpenCard();
                    } else {
                        Protocol protocol = value2.data;
                        if ((protocol == null ? null : protocol.getId()) != null) {
                            OpenBusCardViewModel openBusCardViewModelW = OpenBusCardFragment.this.w();
                            MutableLiveData<BusCardSimple2> mutableLiveData3 = OpenBusCardFragment.this.w().busCardLiveData;
                            String str = (mutableLiveData3 == null || (value = mutableLiveData3.getValue()) == null) ? null : value.id;
                            Protocol protocol2 = value2.data;
                            openBusCardViewModelW.agreeProtocol(str, (protocol2 == null ? null : protocol2.getId()).longValue());
                        } else {
                            OpenBusCardFragment.this.w().startOpenCard();
                        }
                    }
                }
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Notice notice) {
            return a(bool.booleanValue(), notice);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052F\u0010\u0004\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/util/Pair;", "", "kotlin.jvm.PlatformType", "", "r", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Pair<String, Integer>, Unit> {
        public d() {
            super(1);
        }

        public final void a(Pair<String, Integer> pair) {
            OpenBusCardFragment.this.M(pair);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<String, Integer> pair) {
            a(pair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/ui/entity/ResultInfo;", "kotlin.jvm.PlatformType", "resultInfo", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<ResultInfo, Unit> {
        public e() {
            super(1);
        }

        public final void a(ResultInfo resultInfo) {
            OpenBusCardFragment.this.U(resultInfo);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ResultInfo resultInfo) {
            a(resultInfo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/wallet/lib/entity/CheckOrderResult;", "kotlin.jvm.PlatformType", "r", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Resource<CheckOrderResult>, Unit> {
        public f() {
            super(1);
        }

        public final void a(Resource<CheckOrderResult> resource) {
            LoadingDialogHelper loadingDialogHelper = OpenBusCardFragment.this.mLoadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.showOrError(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<CheckOrderResult> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/wallet/lib/entity/CheckOrderResult;", "kotlin.jvm.PlatformType", "r", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<Resource<CheckOrderResult>, Unit> {
        public g() {
            super(1);
        }

        public final void a(Resource<CheckOrderResult> resource) {
            LoadingDialogHelper loadingDialogHelper = OpenBusCardFragment.this.mLoadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.showOrError(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<CheckOrderResult> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/wallet/ui/entity/ResultInfo;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<Resource<ResultInfo>, Unit> {
        public h() {
            super(1);
        }

        public final void a(Resource<ResultInfo> resource) {
            OpenBusCardFragment.this.a0(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<ResultInfo> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/wallet/lib/entity/Protocol;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<Resource<Protocol>, Unit> {
        public i() {
            super(1);
        }

        public final void a(Resource<Protocol> resource) {
            OpenBusCardFragment.this.e0(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Protocol> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<Resource<String>, Unit> {
        public j() {
            super(1);
        }

        public final void a(Resource<String> resource) {
            OpenBusCardFragment.this.q(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062b\u0010\u0005\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001 \u0003*.\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "Lcom/huami/wallet/lib/entity/XiaomiNotice;", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<Resource<List<XiaomiNotice>>, Unit> {
        public k() {
            super(1);
        }

        public final void a(Resource<List<XiaomiNotice>> resource) {
            OpenBusCardFragment.this.g0(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<List<XiaomiNotice>> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/BusCardSimple2;", "kotlin.jvm.PlatformType", "busCard", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<BusCardSimple2, Unit> {
        public l() {
            super(1);
        }

        public final void a(BusCardSimple2 busCardSimple2) {
            b bVar = OpenBusCardFragment.this.mViewHolder;
            ImageLoadUtils.loadImage(bVar == null ? null : bVar.getCardImage(), busCardSimple2.imageUrl);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BusCardSimple2 busCardSimple2) {
            a(busCardSimple2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<Resource<String>, Unit> {
        public m() {
            super(1);
        }

        public final void a(Resource<String> resource) {
            OpenBusCardFragment.this.Z(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062b\u0010\u0005\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001 \u0003*.\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "Lcom/huami/wallet/lib/entity/Coupon;", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function1<Resource<List<Coupon>>, Unit> {
        public n() {
            super(1);
        }

        public final void a(Resource<List<Coupon>> resource) {
            OpenBusCardFragment.this.X(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<List<Coupon>> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Coupon;", "kotlin.jvm.PlatformType", FirebaseAnalytics.Param.COUPON, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<Coupon, Unit> {
        public o() {
            super(1);
        }

        public final void a(Coupon coupon) {
            String string = OpenBusCardFragment.this.getString(R.string.wl_format_x_yuan, MoneyUtils.formatCentRMB(coupon.getIssueDiscount()));
            b bVar = OpenBusCardFragment.this.mViewHolder;
            if (bVar != null) {
                bVar.getCouponValue().setText(MessageFormat.format("{0} {1}", coupon.getName(), string));
            }
            OpenBusCardFragment.this.T(Integer.valueOf(coupon.getTotalPayFee()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Coupon coupon) {
            a(coupon);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062~\u0010\u0005\u001az\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*<\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/util/Pair;", "", "Lcom/huami/wallet/lib/entity/Coupon;", "kotlin.jvm.PlatformType", "", "tuple", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function1<Pair<List<Coupon>, Coupon>, Unit> {
        public p() {
            super(1);
        }

        public final void a(Pair<List<Coupon>, Coupon> pair) {
            OpenBusCardFragment.this.P((List) pair.first, (Coupon) pair.second);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<List<Coupon>, Coupon> pair) {
            a(pair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062b\u0010\u0005\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001 \u0003*.\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "Lcom/huami/wallet/lib/entity/Fee;", "kotlin.jvm.PlatformType", "", "r", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function1<Resource<List<Fee>>, Unit> {
        public q() {
            super(1);
        }

        public final void a(Resource<List<Fee>> resource) {
            LoadingDialogHelper loadingDialogHelper = OpenBusCardFragment.this.mLoadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.showOrError(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<List<Fee>> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Fee;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function1<Fee, Unit> {
        public r() {
            super(1);
        }

        public final void a(Fee fee) {
            OpenBusCardFragment.this.Y(fee);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Fee fee) {
            a(fee);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function1<Integer, Unit> {
        public s() {
            super(1);
        }

        public final void a(Integer num) {
            OpenBusCardFragment.this.T(num);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function1<Boolean, Unit> {
        public t() {
            super(1);
        }

        public final void a(Boolean bool) {
            OpenBusCardFragment.this.d0(bool);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function1<String, Unit> {
        public u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            OpenBusCardFragment.this.f0(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function1<Boolean, Unit> {
        public v() {
            super(1);
        }

        public final void a(Boolean bool) {
            OpenBusCardFragment.this.V(bool.booleanValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function1<Boolean, Unit> {
        public w() {
            super(1);
        }

        public final void a(Boolean bool) {
            OpenBusCardFragment.this.W(bool.booleanValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062~\u0010\u0005\u001az\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*<\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/util/Pair;", "", "Lcom/huami/wallet/lib/entity/Fee;", "kotlin.jvm.PlatformType", "", "r", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function1<Pair<List<Fee>, Fee>, Unit> {
        public x() {
            super(1);
        }

        public final void a(Pair<List<Fee>, Fee> pair) {
            OpenBusCardFragment.this.R(pair);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<List<Fee>, Fee> pair) {
            a(pair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "url", "msg", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function2<String, String, Object> {
        public y() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable String str, @Nullable String str2) {
            if (TextUtils.isEmpty(str)) {
                NoticeViewUtils.showDialog(OpenBusCardFragment.this.requireContext(), OpenBusCardFragment.this.getChildFragmentManager(), str2);
                return null;
            }
            OpenBusCardFragment.this.u().navigateToWeb(str, null);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenBusCardFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mNavigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.fragment.OpenBusCardFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NavigationController getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.mNoticeRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NoticeRepo>() { // from class: com.huami.wallet.ui.fragment.OpenBusCardFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.repository.NoticeRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NoticeRepo getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NoticeRepo.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.walletDataSource = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WalletDataSource>() { // from class: com.huami.wallet.ui.fragment.OpenBusCardFragment$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.lib.api.WalletDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WalletDataSource getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), objArr4, objArr5);
            }
        });
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.OpenBusCardFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<OpenBusCardViewModel>() { // from class: com.huami.wallet.ui.fragment.OpenBusCardFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.OpenBusCardViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final OpenBusCardViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr6, Reflection.getOrCreateKotlinClass(OpenBusCardViewModel.class), function0, objArr7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(OpenBusCardFragment openBusCardFragment, View view) {
        openBusCardFragment.w().showSelectFeesDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(OpenBusCardFragment openBusCardFragment, View view) {
        openBusCardFragment.w().showSelectCouponsDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(OpenBusCardFragment openBusCardFragment, View view) {
        OpenBusCardViewModel openBusCardViewModelW = openBusCardFragment.w();
        b bVar = openBusCardFragment.mViewHolder;
        openBusCardViewModelW.agreeAgreement(bVar == null ? false : bVar.getAgreementCheckbox().isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(OpenBusCardFragment openBusCardFragment, View view) {
        openBusCardFragment.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(OpenBusCardFragment openBusCardFragment, View view) {
        MutableLiveData<BusCardSimple2> mutableLiveData = openBusCardFragment.w().busCardLiveData;
        BusCardSimple2 value = mutableLiveData == null ? null : mutableLiveData.getValue();
        if (value != null) {
            NavigationController navigationControllerU = openBusCardFragment.u();
            Context context = openBusCardFragment.getContext();
            Boolean bool = Boolean.FALSE;
            navigationControllerU.navigateToBindPhoneNumber(context, bool, bool, "", value.id, value.name, value.imageUrl, "", value.packageName, value.appName, value.redirectTo, value.serviceContact);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(OpenBusCardFragment openBusCardFragment, View view) {
        Resource<String> value;
        b bVar = openBusCardFragment.mViewHolder;
        if (bVar != null) {
            bVar.getRlCardDetail().setVisibility(8);
        }
        b bVar2 = openBusCardFragment.mViewHolder;
        if (bVar2 != null) {
            bVar2.getRlCardInformation().setVisibility(0);
        }
        b bVar3 = openBusCardFragment.mViewHolder;
        if (bVar3 == null) {
            return;
        }
        TextView tvCardInformation = bVar3.getTvCardInformation();
        MediatorLiveData<Resource<String>> mediatorLiveData = openBusCardFragment.w().openCardInformationLiveData;
        String str = null;
        if (mediatorLiveData != null && (value = mediatorLiveData.getValue()) != null) {
            str = value.data;
        }
        tvCardInformation.setText(Html.fromHtml(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(OpenBusCardFragment openBusCardFragment, View view) {
        b bVar = openBusCardFragment.mViewHolder;
        if (bVar != null) {
            bVar.getRlCardDetail().setVisibility(0);
        }
        b bVar2 = openBusCardFragment.mViewHolder;
        if (bVar2 == null) {
            return;
        }
        bVar2.getRlCardInformation().setVisibility(8);
    }

    private final void H() {
        WalletDataSource walletDataSource;
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.appCode = arguments.getString("ARG_BUS_CARD_ID");
        String string = arguments.getString("ARG_BUS_CARD_NAME");
        String string2 = arguments.getString("ARG_BUS_CARD_IMAGE_URL");
        String string3 = arguments.getString("ARG_BOUND_PHONE");
        String string4 = arguments.getString("ARG_XIAO_MI_CARDNAME");
        String string5 = arguments.getString("ARG_PACKAGE_NAME");
        String string6 = arguments.getString("ARG_APP_NAME");
        String string7 = arguments.getString("ARG_REDIRECT_TO");
        String string8 = arguments.getString("ARG_SERVICE_CONTACT");
        AnalyticsHelper.Companion companion = AnalyticsHelper.INSTANCE;
        String str = this.appCode;
        BusCardRepo busCardRepo = w().mBusCardRepo;
        String deviceModel = null;
        if (busCardRepo != null && (walletDataSource = busCardRepo.mDataSource) != null) {
            deviceModel = walletDataSource.getDeviceModel();
        }
        companion.recordAddBusEvent(str, deviceModel);
        w().setCardSimpleInfo(this.appCode, string, string2, string4, string5, string6, string7, string8);
        w().setBoundPhone(string3);
        w().checkProtocol(this.appCode, string4);
        w().checkXiaoNotice();
    }

    private final boolean I(String type) {
        Resource<List<XiaomiNotice>> value;
        MutableLiveData<BusCardSimple2> mutableLiveData = w().busCardLiveData;
        List<XiaomiNotice> list = null;
        BusCardSimple2 value2 = mutableLiveData == null ? null : mutableLiveData.getValue();
        if (value2 != null) {
            MutableLiveData<Resource<List<XiaomiNotice>>> mutableLiveData2 = w().xiaomiNoticesLiveData;
            if ((mutableLiveData2 == null ? null : mutableLiveData2.getValue()) != null) {
                MutableLiveData<Resource<List<XiaomiNotice>>> mutableLiveData3 = w().xiaomiNoticesLiveData;
                if (mutableLiveData3 != null && (value = mutableLiveData3.getValue()) != null) {
                    list = value.data;
                }
                XiaomiNotice popXiaomiNotice = KtUtils.getPopXiaomiNotice(list, value2.xiaomiCardName, type);
                if (popXiaomiNotice != null) {
                    NoticeViewUtils.showDialog(requireContext(), getChildFragmentManager(), popXiaomiNotice.getDescription());
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean J(OpenBusCardFragment openBusCardFragment, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "OPEN_CARDRECHARGE";
        }
        return openBusCardFragment.I(str);
    }

    private final void K() {
        new AlertDialogFragment.Builder(getContext()).setMessage(getString(R.string.wl_not_support_city_tips)).setNeutralButton(R.string.wl_i_know_it, new DialogInterface.OnClickListener() { // from class: ok5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                OpenBusCardFragment.L(this.a, dialogInterface, i2);
            }
        }).setCancelable(false).create().show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(OpenBusCardFragment openBusCardFragment, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        openBusCardFragment.requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(Pair<String, Integer> tuple) {
        Resource<Protocol> value;
        Protocol protocol;
        Long id;
        String string;
        String str = (String) tuple.first;
        Object obj = tuple.second;
        Integer num = obj != null ? (Integer) obj : 0;
        String str2 = "";
        if (!w().isForMi()) {
            if (num != null && num.intValue() == 0) {
                w().openCardForSnowball(getActivity(), RichPayMode.ALIPAY);
                return;
            } else {
                N(str, num.intValue(), "");
                return;
            }
        }
        MutableLiveData<Resource<Protocol>> mutableLiveData = w().isNeedShowProtocol;
        if (mutableLiveData != null && (value = mutableLiveData.getValue()) != null && (protocol = value.data) != null && (id = protocol.getId()) != null && (string = id.toString()) != null) {
            str2 = string;
        }
        N(str, num.intValue(), str2);
    }

    private final void N(String cardName, int payMoney, final String userProtocolId) {
        new PayRechargeDialogFragment.Builder().setPayModes(w().getRichPayModes()).setTitle(getString(R.string.wl_format_card_open, cardName)).setPayMoney(payMoney).setOnPayButtonClickListener(new PayRechargeDialogFragment.OnPayButtonClickListener() { // from class: rk5
            @Override // com.huami.wallet.ui.dialog.PayRechargeDialogFragment.OnPayButtonClickListener
            public final void onPay(RichPayMode richPayMode) {
                OpenBusCardFragment.O(this.a, userProtocolId, richPayMode);
            }
        }).create().show(getChildFragmentManager(), "PayRechargeDialogFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(OpenBusCardFragment openBusCardFragment, String str, RichPayMode richPayMode) {
        if (openBusCardFragment.w().isForMi()) {
            openBusCardFragment.w().openCardForMi(openBusCardFragment.getActivity(), str, richPayMode);
        } else {
            openBusCardFragment.w().openCardForSnowball(openBusCardFragment.getActivity(), richPayMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(final List<Coupon> couponList, Coupon coupon) {
        if (couponList == null) {
            return;
        }
        int iIndexOf = couponList.indexOf(coupon);
        String[] strArr = new String[couponList.size()];
        int[] iArr = new int[couponList.size()];
        int size = couponList.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                Coupon coupon2 = couponList.get(i2);
                int issueDiscount = coupon2.getIssueDiscount();
                String name = coupon2.getName();
                strArr[i2] = getString(R.string.wl_format_x_yuan, MoneyUtils.formatCentRMB(issueDiscount)) + StringUtil.SPACE + name;
                if (i3 > size) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        new AlertDialogFragment.Builder(getActivity()).setTitle(R.string.wl_choose_coupon_amount).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(strArr).setItemsStrikeThroughLength(iArr).setItemChoice(iIndexOf), new DialogInterface.OnClickListener() { // from class: tk5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                OpenBusCardFragment.Q(this.a, couponList, dialogInterface, i4);
            }
        }).setNeutralButton(R.string.wl_cancel, (DialogInterface.OnClickListener) null).create().show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(OpenBusCardFragment openBusCardFragment, List list, DialogInterface dialogInterface, int i2) {
        openBusCardFragment.w().selectCoupon((Coupon) list.get(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(Pair<List<Fee>, Fee> tuple) {
        final List list = (List) tuple.first;
        Fee fee = (Fee) tuple.second;
        int iIndexOf = fee != null ? list.indexOf(fee) : -1;
        String[] strArr = new String[list.size()];
        int[] iArr = new int[list.size()];
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                Fee fee2 = (Fee) list.get(i2);
                int i4 = R.string.wl_format_x_yuan;
                String string = getString(i4, MoneyUtils.formatCentRMB(fee2.rechargeAmountRaw));
                int i5 = fee2.rechargeAmountDiscount;
                if (i5 == 0) {
                    strArr[i2] = string;
                } else {
                    String string2 = getString(R.string.wl_format_actual_pay_x, getString(i4, MoneyUtils.formatCentRMB(fee2.rechargeAmountRaw - i5)));
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    strArr[i2] = String.format(Locale.CHINA, "%s  %s", Arrays.copyOf(new Object[]{string, string2}, 2));
                    iArr[i2] = string.length();
                }
                if (i3 > size) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        new AlertDialogFragment.Builder(getActivity()).setTitle(R.string.wl_choose_recharge_amount).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(strArr).setItemsStrikeThroughLength(iArr).setItemChoice(iIndexOf), new DialogInterface.OnClickListener() { // from class: uk5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                OpenBusCardFragment.S(this.a, list, dialogInterface, i6);
            }
        }).setNeutralButton(R.string.wl_cancel, (DialogInterface.OnClickListener) null).setCancelable(true).create().show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(OpenBusCardFragment openBusCardFragment, List list, DialogInterface dialogInterface, int i2) {
        openBusCardFragment.w().selectFee((Fee) list.get(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Integer shouldPayAmount) {
        if (shouldPayAmount != null) {
            String centRMB = MoneyUtils.formatCentRMB(shouldPayAmount.intValue());
            String string = getString(R.string.wl_format_x_yuan, centRMB);
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, centRMB, 0, false, 6, (Object) null);
            int length = centRMB.length() + iIndexOf$default;
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new TextAppearanceSpan(getContext(), R.style.TextAppearance_MiFit_Display1_Blue), iIndexOf$default, length, 18);
            spannableString.setSpan(new TextAppearanceSpan(getContext(), R.style.TextAppearance_MiFit_Title2_Blue), length, string.length(), 18);
            b bVar = this.mViewHolder;
            if (bVar == null) {
                return;
            }
            bVar.getShouldPayAmountValue().setText(spannableString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(ResultInfo resultInfo) {
        u().navigateToBusCardOperationNoTokenResult(getContext(), resultInfo.busCardId, resultInfo.orderId, resultInfo.busCardName, false, resultInfo.errorMsg, true);
        u().finishCurrentPage(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(boolean isAgree) {
        b bVar = this.mViewHolder;
        if (bVar == null) {
            return;
        }
        bVar.getAgreementCheckbox().setChecked(isAgree);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(boolean canOpenUp) {
        b bVar = this.mViewHolder;
        if (bVar == null) {
            return;
        }
        bVar.getOpenUpButton().setEnabled(canOpenUp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(Resource<List<Coupon>> couponsResource) {
        if (couponsResource == null || !couponsResource.isCompleted()) {
            return;
        }
        int i2 = !KtUtilsKt.isNullOrEmpty(couponsResource.data) ? 0 : 8;
        b bVar = this.mViewHolder;
        if (bVar != null) {
            bVar.getCouponTitle().setVisibility(i2);
        }
        b bVar2 = this.mViewHolder;
        if (bVar2 != null) {
            bVar2.getCouponValue().setVisibility(i2);
        }
        b bVar3 = this.mViewHolder;
        if (bVar3 != null) {
            bVar3.getCouponDivider().setVisibility(i2);
        }
        if (i2 == 0) {
            b bVar4 = this.mViewHolder;
            if (bVar4 != null) {
                bVar4.getFlashSaleTitle().setVisibility(8);
            }
            b bVar5 = this.mViewHolder;
            if (bVar5 != null) {
                bVar5.getFlashSaleValue().setVisibility(8);
            }
            b bVar6 = this.mViewHolder;
            if (bVar6 != null) {
                bVar6.getFlashSaleDivider().setVisibility(8);
            }
            OpenBusCardViewModel openBusCardViewModelW = w();
            List<Coupon> list = couponsResource.data;
            Objects.requireNonNull(list);
            openBusCardViewModelW.selectCoupon(list.get(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(Fee fee) {
        if (fee == null) {
            return;
        }
        int i2 = R.string.wl_format_x_yuan;
        String string = getString(i2, MoneyUtils.formatCentRMB(fee.serviceChargeRaw));
        b bVar = this.mViewHolder;
        if (bVar != null) {
            bVar.getServiceCharge().setText(string);
        }
        boolean z = fee.serviceChargeDiscount > 0;
        b bVar2 = this.mViewHolder;
        if (bVar2 != null) {
            bVar2.getFlashSaleDivider().setVisibility(z ? 0 : 8);
        }
        b bVar3 = this.mViewHolder;
        if (bVar3 != null) {
            bVar3.getFlashSaleTitle().setVisibility(z ? 0 : 8);
        }
        b bVar4 = this.mViewHolder;
        if (bVar4 != null) {
            bVar4.getFlashSaleValue().setVisibility(z ? 0 : 8);
        }
        String string2 = getString(i2, MoneyUtils.formatCentRMB(fee.serviceChargeDiscount));
        b bVar5 = this.mViewHolder;
        if (bVar5 != null) {
            TextView flashSaleValue = bVar5.getFlashSaleValue();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            flashSaleValue.setText(String.format(Locale.getDefault(), "-%s", Arrays.copyOf(new Object[]{string2}, 1)));
        }
        String string3 = getString(i2, MoneyUtils.formatCentRMB(fee.rechargeAmountRaw - fee.rechargeAmountDiscount));
        b bVar6 = this.mViewHolder;
        if (bVar6 == null) {
            return;
        }
        bVar6.getRechargeAmountValue().setText(string3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(Resource<String> resource) {
        String str;
        if (resource == null) {
            return;
        }
        int i2 = 8;
        if (resource.status != Status.SUCCESS || (str = resource.data) == null) {
            b bVar = this.mViewHolder;
            if (bVar == null) {
                return;
            }
            bVar.getTvOpenCardKnow().setVisibility(8);
            return;
        }
        String string = Html.fromHtml(str).toString();
        b bVar2 = this.mViewHolder;
        if (bVar2 == null) {
            return;
        }
        TextView tvOpenCardKnow = bVar2.getTvOpenCardKnow();
        if (w().isSupportCardInformation() && !TextUtils.isEmpty(string) && w().isForMi()) {
            i2 = 0;
        }
        tvOpenCardKnow.setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(Resource<ResultInfo> r2) {
        HMLog.w(TAG, Intrinsics.stringPlus("openCardToDeviceResultLiveData status=", r2.status), new Object[0]);
        if (r2.status == Status.LOADING) {
            MutableLiveData<BusCardSimple2> mutableLiveData = w().busCardLiveData;
            BusCardSimple2 value = mutableLiveData != null ? mutableLiveData.getValue() : null;
            if (value != null) {
                HMLog.w(TAG, "openCardToDeviceResultLiveData navigateToOpenBusCardInProgress", new Object[0]);
                u().navigateToOpenBusCardInProgress(getActivity(), value.name);
                return;
            }
            return;
        }
        ResultInfo resultInfo = r2.data;
        if (resultInfo != null) {
            ResultInfo resultInfo2 = resultInfo;
            HMLog.w(TAG, "openCardToDeviceResultLiveData navigateToBusCardOperationResult", new Object[0]);
            u().navigateToBusCardOperationResult(getContext(), resultInfo2 == null ? null : resultInfo2.busCardId, resultInfo2 == null ? null : resultInfo2.orderId, resultInfo2 == null ? null : resultInfo2.busCardName, false, resultInfo2 != null ? resultInfo2.errorMsg : null);
            u().finishCurrentPage(getContext());
        }
    }

    private final void b0(Resource<?> resource) {
        final String string;
        if (resource == null) {
            return;
        }
        if (Intrinsics.areEqual(ErrorCode.NETWORK_ERROR, resource.code)) {
            string = getString(R.string.wl_network_not_connected);
        } else {
            string = Intrinsics.areEqual(ErrorCode.FAILED_TO_MAKE_ORDER, resource.code) ? getString(R.string.wl_failed_to_make_order) : ErrorMsgUtils.parseErrorMsg(x().isForMi(), getContext(), resource, WalletConfig.isShowMessage().getA().booleanValue());
        }
        LoadingDialogHelper loadingDialogHelper = this.mLoadingDialogHelper;
        if (loadingDialogHelper == null) {
            return;
        }
        loadingDialogHelper.showOrError(resource, getString(R.string.wl_making_order), new Supplier() { // from class: sk5
            @Override // com.huami.wallet.ui.function.Supplier
            public final Object get() {
                return OpenBusCardFragment.c0(string);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(Boolean showPhone) {
        boolean z = showPhone != null && showPhone.booleanValue();
        b bVar = this.mViewHolder;
        if (bVar != null) {
            bVar.getPhoneTitle().setVisibility(z ? 0 : 8);
        }
        b bVar2 = this.mViewHolder;
        if (bVar2 != null) {
            bVar2.getPhoneValue().setVisibility(z ? 0 : 8);
        }
        b bVar3 = this.mViewHolder;
        if (bVar3 != null) {
            bVar3.getPayAmountDivider().setVisibility(z ? 0 : 8);
        }
        b bVar4 = this.mViewHolder;
        if (bVar4 == null) {
            return;
        }
        bVar4.getModifyPhoneButton().setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(Resource<Protocol> r2) {
        LoadingDialogHelper loadingDialogHelper;
        if (r2 != null && (loadingDialogHelper = this.mLoadingDialogHelper) != null) {
            loadingDialogHelper.showOrError(r2);
        }
        if ((r2 == null ? null : r2.status) != Status.SUCCESS || r2.data == null) {
            if ((r2 != null ? r2.status : null) != Status.LOADING) {
                b bVar = this.mViewHolder;
                if (bVar != null) {
                    bVar.getAgree().setVisibility(8);
                }
                b bVar2 = this.mViewHolder;
                if (bVar2 != null) {
                    bVar2.getAgreementCheckbox().setVisibility(8);
                }
                w().agreeAgreement(false);
                return;
            }
            return;
        }
        b bVar3 = this.mViewHolder;
        if (bVar3 != null) {
            bVar3.getAgree().setVisibility(0);
        }
        b bVar4 = this.mViewHolder;
        if (bVar4 != null) {
            bVar4.getAgreementCheckbox().setVisibility(0);
        }
        w().agreeAgreement(false);
        b bVar5 = this.mViewHolder;
        TextView agree = bVar5 == null ? null : bVar5.getAgree();
        Protocol protocol = r2.data;
        r(agree, protocol != null ? protocol.getTitle() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(String phoneNumber) {
        b bVar = this.mViewHolder;
        if (bVar == null) {
            return;
        }
        bVar.getPhoneValue().setText(phoneNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(Resource<List<XiaomiNotice>> resource) {
        b bVar;
        if (resource == null) {
            return;
        }
        LoadingDialogHelper loadingDialogHelper = this.mLoadingDialogHelper;
        if (loadingDialogHelper != null) {
            loadingDialogHelper.showOrError(resource);
        }
        if (resource.status != Status.SUCCESS || (bVar = this.mViewHolder) == null) {
            return;
        }
        MyTextView xiaomiNoticeView = bVar.getXiaomiNoticeView();
        List<XiaomiNotice> list = resource.data;
        MutableLiveData<BusCardSimple2> mutableLiveData = w().busCardLiveData;
        BusCardSimple2 value = mutableLiveData == null ? null : mutableLiveData.getValue();
        Objects.requireNonNull(value);
        KTExtFunKt.shouldShowXiaomiNoticeCrossBar(xiaomiNoticeView, list, value.xiaomiCardName, "OPEN_CARD");
    }

    private final void initViewModel() {
        if (getActivity() == null) {
            return;
        }
        MutableLiveData<BusCardSimple2> mutableLiveData = w().busCardLiveData;
        if (mutableLiveData != null) {
            LiveDataExtensionKt.observeWithNotNull(mutableLiveData, this, new l());
        }
        MediatorLiveData<Resource<List<Fee>>> mediatorLiveData = w().feesLiveData;
        if (mediatorLiveData != null) {
            mediatorLiveData.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("加载开卡服务费和充值金额"));
        }
        MediatorLiveData<Resource<List<Fee>>> mediatorLiveData2 = w().feesLiveData;
        if (mediatorLiveData2 != null) {
            LiveDataExtensionKt.observeWithNotNull(mediatorLiveData2, this, new q());
        }
        MediatorLiveData<Fee> mediatorLiveData3 = w().selectedFeeLiveData;
        if (mediatorLiveData3 != null) {
            LiveDataExtensionKt.observeWithNotNull(mediatorLiveData3, this, new r());
        }
        MediatorLiveData<Integer> mediatorLiveData4 = w().shouldPayAmountLiveData;
        if (mediatorLiveData4 != null) {
            LiveDataExtensionKt.observeWithNotNull(mediatorLiveData4, this, new s());
        }
        MutableLiveData<Boolean> mutableLiveData2 = w().showPhoneLiveData;
        if (mutableLiveData2 != null) {
            LiveDataExtensionKt.observeWithNotNull(mutableLiveData2, this, new t());
        }
        MutableLiveData<String> mutableLiveData3 = w().verifiedPhoneLiveData;
        if (mutableLiveData3 != null) {
            LiveDataExtensionKt.observeWithNotNull(mutableLiveData3, this, new u());
        }
        MutableLiveData<Boolean> mutableLiveData4 = w().agreeAgreementLiveData;
        if (mutableLiveData4 != null) {
            LiveDataExtensionKt.observeWithNotNull(mutableLiveData4, this, new v());
        }
        MediatorLiveData<Boolean> mediatorLiveData5 = w().canOpenUpLiveData;
        if (mediatorLiveData5 != null) {
            LiveDataExtensionKt.observeWithNotNull(mediatorLiveData5, this, new w());
        }
        SingleLiveEvent<Pair<List<Fee>, Fee>> singleLiveEvent = w().showFeesDialogCommandLiveData;
        if (singleLiveEvent != null) {
            LiveDataExtensionKt.observeWithNotNull(singleLiveEvent, this, new x());
        }
        SingleLiveEvent<Pair<String, Integer>> singleLiveEvent2 = w().showPayModeDialogCommandLiveData;
        if (singleLiveEvent2 != null) {
            LiveDataExtensionKt.observeWithNotNull(singleLiveEvent2, this, new d());
        }
        MutableLiveData<Resource<String>> mutableLiveData5 = w().snowballOrderLiveData;
        if (mutableLiveData5 != null) {
            mutableLiveData5.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("生成开卡并充值的订单"));
        }
        MutableLiveData<Resource<String>> mutableLiveData6 = w().snowballOrderLiveData;
        if (mutableLiveData6 != null) {
            mutableLiveData6.observe(getViewLifecycleOwner(), new Observer() { // from class: qk5
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    OpenBusCardFragment.y(this.a, (Resource) obj);
                }
            });
        }
        MutableLiveData<Resource<MiOrder>> mutableLiveData7 = w().miOrderLiveData;
        if (mutableLiveData7 != null) {
            mutableLiveData7.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("生成开卡并充值的订单"));
        }
        MutableLiveData<Resource<MiOrder>> mutableLiveData8 = w().miOrderLiveData;
        if (mutableLiveData8 != null) {
            mutableLiveData8.observe(getViewLifecycleOwner(), new Observer() { // from class: pk5
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    OpenBusCardFragment.z(this.a, (Resource) obj);
                }
            });
        }
        MutableLiveData<ResultInfo> mutableLiveData9 = w().xiaomiNotTokenOpenCardLiveData;
        if (mutableLiveData9 != null) {
            LiveDataExtensionKt.observeWithNotNull(mutableLiveData9, this, new e());
        }
        MutableLiveData<Resource<CheckOrderResult>> mutableLiveData10 = w().checkOrderLiveData;
        if (mutableLiveData10 != null) {
            mutableLiveData10.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("检查开卡订单是否已支付"));
        }
        MutableLiveData<Resource<CheckOrderResult>> mutableLiveData11 = w().checkOrderLiveData;
        if (mutableLiveData11 != null) {
            LiveDataExtensionKt.observeWithNotNull(mutableLiveData11, this, new f());
        }
        MutableLiveData<Resource<CheckOrderResult>> mutableLiveData12 = w().checkOrderH5LiveData;
        if (mutableLiveData12 != null) {
            LiveDataExtensionKt.observeWithNotNull(mutableLiveData12, this, new g());
        }
        MutableLiveData<Resource<ResultInfo>> mutableLiveData13 = w().openCardToDeviceResultLiveData;
        if (mutableLiveData13 != null) {
            mutableLiveData13.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("将开卡和充值信息写入设备"));
        }
        MutableLiveData<Resource<ResultInfo>> mutableLiveData14 = w().openCardToDeviceResultLiveData;
        if (mutableLiveData14 != null) {
            LiveDataExtensionKt.observeWithNotNull(mutableLiveData14, this, new h());
        }
        MutableLiveData<Resource<Protocol>> mutableLiveData15 = w().isNeedShowProtocol;
        if (mutableLiveData15 != null) {
            mutableLiveData15.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("获取开卡协议"));
        }
        MutableLiveData<Resource<Protocol>> mutableLiveData16 = w().isNeedShowProtocol;
        if (mutableLiveData16 != null) {
            LiveDataExtensionKt.observeWithNotNull(mutableLiveData16, this, new i());
        }
        MutableLiveData<Resource<String>> mutableLiveData17 = w().agreeProtocolLiveData;
        if (mutableLiveData17 != null) {
            mutableLiveData17.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("同意开卡协议"));
        }
        MutableLiveData<Resource<String>> mutableLiveData18 = w().agreeProtocolLiveData;
        if (mutableLiveData18 != null) {
            LiveDataExtensionKt.observeWithNotNull(mutableLiveData18, this, new j());
        }
        MutableLiveData<Resource<List<XiaomiNotice>>> mutableLiveData19 = w().xiaomiNoticesLiveData;
        if (mutableLiveData19 != null) {
            mutableLiveData19.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("checkXiaoNotice"));
        }
        MutableLiveData<Resource<List<XiaomiNotice>>> mutableLiveData20 = w().xiaomiNoticesLiveData;
        if (mutableLiveData20 != null) {
            LiveDataExtensionKt.observeWithNotNull(mutableLiveData20, this, new k());
        }
        MediatorLiveData<Resource<String>> mediatorLiveData6 = w().openCardInformationLiveData;
        if (mediatorLiveData6 != null) {
            LiveDataExtensionKt.observeWithNotNull(mediatorLiveData6, this, new m());
        }
        MediatorLiveData<Resource<List<Coupon>>> mediatorLiveData7 = w().couponsLiveData;
        if (mediatorLiveData7 != null) {
            LiveDataExtensionKt.observeWithNotNull(mediatorLiveData7, this, new n());
        }
        MediatorLiveData<Coupon> mediatorLiveData8 = w().selectedCouponLiveData;
        if (mediatorLiveData8 != null) {
            LiveDataExtensionKt.observeWithNotNull(mediatorLiveData8, this, new o());
        }
        SingleLiveEvent<Pair<List<Coupon>, Coupon>> singleLiveEvent3 = w().showCouponsDialogCommandLiveData;
        if (singleLiveEvent3 == null) {
            return;
        }
        LiveDataExtensionKt.observeWithNotNull(singleLiveEvent3, this, new p());
    }

    private final void initViews() {
        b bVar;
        NoticeBarView typeList;
        NoticeBarView noticeRepo;
        this.mViewHolder = new b(requireView());
        Drawable drawableTintDrawable = TintUtils.tintDrawable(getContext(), R.drawable.wl_ic_arrow_right, R.color.s1);
        b bVar2 = this.mViewHolder;
        if (bVar2 != null) {
            bVar2.getRechargeAmountTitle().setOnClickListener(new View.OnClickListener() { // from class: al5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OpenBusCardFragment.A(this.a, view);
                }
            });
        }
        b bVar3 = this.mViewHolder;
        if (bVar3 != null) {
            bVar3.getCouponTitle().setOnClickListener(new View.OnClickListener() { // from class: bl5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OpenBusCardFragment.B(this.a, view);
                }
            });
        }
        b bVar4 = this.mViewHolder;
        if (bVar4 != null) {
            bVar4.getRechargeAmountValue().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableTintDrawable, (Drawable) null);
        }
        b bVar5 = this.mViewHolder;
        if (bVar5 != null) {
            bVar5.getAgree().setText(getString(R.string.wl_format_agree_x));
        }
        b bVar6 = this.mViewHolder;
        if (bVar6 != null) {
            bVar6.getAgreementCheckbox().setOnClickListener(new View.OnClickListener() { // from class: wk5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OpenBusCardFragment.C(this.a, view);
                }
            });
        }
        b bVar7 = this.mViewHolder;
        if (bVar7 != null) {
            bVar7.getOpenUpButton().setOnClickListener(new View.OnClickListener() { // from class: xk5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OpenBusCardFragment.D(this.a, view);
                }
            });
        }
        b bVar8 = this.mViewHolder;
        if (bVar8 != null) {
            bVar8.getModifyPhoneButton().setOnClickListener(new View.OnClickListener() { // from class: vk5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OpenBusCardFragment.E(this.a, view);
                }
            });
        }
        List<? extends NoticeActionType> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(NoticeActionType.ISSUE, NoticeActionType.ISSUE_TOPUP);
        b bVar9 = this.mViewHolder;
        if (bVar9 != null && (typeList = bVar9.getNoticeBarView().setTypeList(listMutableListOf)) != null && (noticeRepo = typeList.setNoticeRepo(v())) != null) {
            noticeRepo.setOnReadMore(new y());
        }
        MutableLiveData<BusCardSimple2> mutableLiveData = w().busCardLiveData;
        BusCardSimple2 value = mutableLiveData != null ? mutableLiveData.getValue() : null;
        if (value != null && (bVar = this.mViewHolder) != null) {
            bVar.getNoticeBarView().setAppCode(value.id);
        }
        b bVar10 = this.mViewHolder;
        if (bVar10 != null) {
            bVar10.getTvOpenCardKnow().setOnClickListener(new View.OnClickListener() { // from class: zk5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OpenBusCardFragment.F(this.a, view);
                }
            });
        }
        b bVar11 = this.mViewHolder;
        if (bVar11 != null) {
            bVar11.getTvReturn().setOnClickListener(new View.OnClickListener() { // from class: yk5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OpenBusCardFragment.G(this.a, view);
                }
            });
        }
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(Resource<String> r2) {
        Resource<Protocol> value;
        Resource<Protocol> value2;
        Protocol protocol;
        LoadingDialogHelper loadingDialogHelper;
        if (r2 != null && (loadingDialogHelper = this.mLoadingDialogHelper) != null) {
            loadingDialogHelper.showOrError(r2);
        }
        if (r2 == null || r2.status != Status.SUCCESS) {
            return;
        }
        MutableLiveData<Resource<Protocol>> mutableLiveData = w().isNeedShowProtocol;
        Long id = null;
        if ((mutableLiveData == null ? null : mutableLiveData.getValue()) == null) {
            return;
        }
        MutableLiveData<Resource<Protocol>> mutableLiveData2 = w().isNeedShowProtocol;
        if (((mutableLiveData2 == null || (value = mutableLiveData2.getValue()) == null) ? null : value.data) == null) {
            return;
        }
        MutableLiveData<Resource<Protocol>> mutableLiveData3 = w().isNeedShowProtocol;
        if (mutableLiveData3 != null && (value2 = mutableLiveData3.getValue()) != null && (protocol = value2.data) != null) {
            id = protocol.getId();
        }
        if (id == null) {
            return;
        }
        w().startOpenCard();
    }

    private final void r(TextView textView, String link) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 12298);
        sb.append((Object) link);
        sb.append((char) 12299);
        String string = sb.toString();
        SpannableString spannableString = new SpannableString(((Object) textView.getText()) + "  " + string);
        int length = textView.getText().length() + 2;
        spannableString.setSpan(new a(), length, string.length() + length, 33);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(requireContext(), R.color.s15)), length, string.length() + length, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void s() {
        Drawable drawableTintDrawable = TintUtils.tintDrawable(getContext(), R.drawable.wl_ic_arrow_right, R.color.s1);
        b bVar = this.mViewHolder;
        if (bVar != null) {
            bVar.getRechargeAmountValue().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableTintDrawable, (Drawable) null);
        }
        b bVar2 = this.mViewHolder;
        if (bVar2 == null) {
            return;
        }
        bVar2.getCouponValue().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableTintDrawable, (Drawable) null);
    }

    private final void t() {
        if (!w().isSupportCity(this.appCode)) {
            K();
            return;
        }
        MutableLiveData<BusCardSimple2> mutableLiveData = w().busCardLiveData;
        BusCardSimple2 value = mutableLiveData == null ? null : mutableLiveData.getValue();
        if (J(this, null, 1, null) || value == null) {
            return;
        }
        NoticeViewUtils.checkNeedShowDialog(requireContext(), v().getNotices(), getChildFragmentManager(), value.id, CollectionsKt__CollectionsKt.mutableListOf(NoticeActionType.ISSUE, NoticeActionType.ISSUE_TOPUP), new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController u() {
        return (NavigationController) this.mNavigationController.getValue();
    }

    private final NoticeRepo v() {
        return (NoticeRepo) this.mNoticeRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OpenBusCardViewModel w() {
        return (OpenBusCardViewModel) this.mViewModel.getValue();
    }

    private final WalletDataSource x() {
        return (WalletDataSource) this.walletDataSource.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(OpenBusCardFragment openBusCardFragment, Resource resource) {
        openBusCardFragment.b0(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(OpenBusCardFragment openBusCardFragment, Resource resource) {
        openBusCardFragment.b0(resource);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.wallet.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.mLoadingDialogHelper = LoadingDialogHelper.newInstance(getActivity());
        v().preLoad();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.wl_fragment_open_bus_card, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        v().dispose();
        b bVar = this.mViewHolder;
        if (bVar == null) {
            return;
        }
        bVar.getNoticeBarView().destroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
        initViewModel();
        H();
    }

    public final void refreshArguments(@Nullable Bundle args) {
        if (args == null) {
            return;
        }
        w().setBoundPhone(args.getString("ARG_BOUND_PHONE"));
    }
}

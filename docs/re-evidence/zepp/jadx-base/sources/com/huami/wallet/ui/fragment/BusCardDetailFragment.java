package com.huami.wallet.ui.fragment;

import android.R;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.RecyclerView;
import cn.bingoogolapple.bgabanner.BGABanner;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.nfc.applet.CardScheduleTime;
import com.huami.nfc.applet.ConstantKt;
import com.huami.nfc.bus.entities.XiaomiBulletin;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.entity.BusCardDetail;
import com.huami.wallet.lib.entity.BusOpenFeeStateEntity;
import com.huami.wallet.lib.entity.BusRefundOpenFeeEntity;
import com.huami.wallet.lib.entity.CarouseInfo;
import com.huami.wallet.lib.entity.CitySimpleInfo;
import com.huami.wallet.lib.entity.Notice;
import com.huami.wallet.lib.entity.Protocol;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.entity.XiaomiBulletinType;
import com.huami.wallet.lib.entity.XiaomiNotice;
import com.huami.wallet.lib.util.CitySimpleInfoCache;
import com.huami.wallet.lib.util.ErrorCode;
import com.huami.wallet.ui.activity.BusCardDetailActivity;
import com.huami.wallet.ui.activity.RefundResultActivity;
import com.huami.wallet.ui.adapter.CardScheduleTimeAdapter;
import com.huami.wallet.ui.di.module.KoinModuleKt;
import com.huami.wallet.ui.dialog.TimeSelectorDialog;
import com.huami.wallet.ui.entity.BusCardDetailAndBalance;
import com.huami.wallet.ui.fragment.BusCardDetailFragment;
import com.huami.wallet.ui.helper.AnalyticsHelper;
import com.huami.wallet.ui.helper.BenchmarkResourceObserver;
import com.huami.wallet.ui.helper.BusDetailOutType;
import com.huami.wallet.ui.helper.LiveDataExtensionKt;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.wallet.ui.helper.XiaomiBulletinHelper;
import com.huami.wallet.ui.navigation.Args;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.repository.NoticeRepo;
import com.huami.wallet.ui.resource.IWalletRes;
import com.huami.wallet.ui.utils.AppUtils;
import com.huami.wallet.ui.utils.BusExtensionKt;
import com.huami.wallet.ui.utils.BusWebUrlHelper;
import com.huami.wallet.ui.utils.ImageLoadUtils;
import com.huami.wallet.ui.utils.KTExtFunKt;
import com.huami.wallet.ui.utils.KTViewExtensionKt;
import com.huami.wallet.ui.utils.KtUtils;
import com.huami.wallet.ui.utils.MoneyUtils;
import com.huami.wallet.ui.utils.NoticeActionType;
import com.huami.wallet.ui.utils.NoticeViewUtils;
import com.huami.wallet.ui.utils.TintUtils;
import com.huami.wallet.ui.utils.WalletUI;
import com.huami.wallet.ui.view.MyTextView;
import com.huami.wallet.ui.view.NoticeBarView;
import com.huami.wallet.ui.viewmodel.BusCardDetailViewModel;
import com.huami.wallet.ui.viewmodel.XiaomiBulletinViewModel;
import com.huami.wallet.ui.viewmodel.XiaomiSztRefundViewModel;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.tekartik.sqflite.Constant;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.soap.SOAP;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00ad\u00012\u00020\u0001:\u0002\u00ad\u0001B\t¢\u0006\u0006\b«\u0001\u0010¬\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J,\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0016\u0010\u000f\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\u0016\u0010\u001d\u001a\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001bH\u0002J\u0016\u0010\u001f\u001a\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bH\u0002J\u0016\u0010 \u001a\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001bH\u0002J\u001c\u0010#\u001a\u00020\u00022\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u001bH\u0002J\u0018\u0010$\u001a\u00020\u00022\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001bH\u0002J$\u0010(\u001a\u00020\u00022\u001a\u0010'\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001b\u0018\u00010%H\u0002J\b\u0010)\u001a\u00020\u0002H\u0002J\b\u0010*\u001a\u00020\u0002H\u0002J\b\u0010+\u001a\u00020\u0002H\u0002J\u0018\u0010-\u001a\u00020\u00022\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0002J\"\u0010/\u001a\u00020\u00022\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u001b0%H\u0002J\"\u00100\u001a\u00020\u00052\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u001b0%H\u0002J\u0019\u00102\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\bH\u0002J\"\u00106\u001a\u00020\u00022\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u001b0%H\u0002J\u0010\u00108\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u0005H\u0002J\u0016\u0010:\u001a\u00020\u00022\f\u00109\u001a\b\u0012\u0004\u0012\u00020\b0\u001bH\u0002J\u0016\u0010;\u001a\u00020\u00022\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bH\u0002J'\u0010>\u001a\u00020\u00022\n\b\u0002\u0010<\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b>\u0010?J\u0010\u0010A\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\bH\u0002J\b\u0010B\u001a\u00020\u0002H\u0002J\u0010\u0010E\u001a\u00020\u00022\u0006\u0010D\u001a\u00020CH\u0016J\u001a\u0010J\u001a\u00020\u00022\u0006\u0010G\u001a\u00020F2\b\u0010I\u001a\u0004\u0018\u00010HH\u0016J!\u0010M\u001a\u00020\u00022\b\u0010K\u001a\u0004\u0018\u00010H2\b\u0010L\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bM\u0010NJ&\u0010S\u001a\u0004\u0018\u00010F2\u0006\u0010P\u001a\u00020O2\b\u0010R\u001a\u0004\u0018\u00010Q2\b\u0010I\u001a\u0004\u0018\u00010HH\u0016J\b\u0010T\u001a\u00020\u0002H\u0016J\b\u0010U\u001a\u00020\u0002H\u0016J\u0006\u0010V\u001a\u00020\u0002J\u0006\u0010W\u001a\u00020\u0002R\u001d\u0010]\u001a\u00020X8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001d\u0010b\u001a\u00020^8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010Z\u001a\u0004\b`\u0010aR\u001d\u0010g\u001a\u00020c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010Z\u001a\u0004\be\u0010fR\u0016\u0010k\u001a\u00020h8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001d\u0010p\u001a\u00020l8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010Z\u001a\u0004\bn\u0010oR\u001d\u0010u\u001a\u00020q8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\br\u0010Z\u001a\u0004\bs\u0010tR\u0018\u0010y\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010|\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R'\u0010\u0082\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b}\u0010{\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R)\u0010\u0086\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0083\u0001\u0010{\u001a\u0005\b\u0084\u0001\u0010\u007f\"\u0006\b\u0085\u0001\u0010\u0081\u0001R\u001a\u0010\u0088\u0001\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010{R\u001a\u0010\u008a\u0001\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010{R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010{R\u001a\u0010\u0090\u0001\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010{R\u001a\u0010\u0092\u0001\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010{R\u0019\u0010\u0093\u0001\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010{R\u001b\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u008c\u0001R\u001b\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u008c\u0001R\u001b\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u008c\u0001R(\u0010\u009f\u0001\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u009a\u0001\u00102\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001c\u0010£\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010¦\u0001\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001a\u0010ª\u0001\u001a\u00030§\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001¨\u0006®\u0001"}, d2 = {"Lcom/huami/wallet/ui/fragment/BusCardDetailFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "", "V", "J", "", "K", "initView", "", "packageName", "Lkotlin/Function0;", "onNoInstalled", "onPass", "L", "L0", "P0", "h0", "g0", "M", "N0", "z0", "C0", "X", "b0", "q0", "v0", "W", "Lcom/huami/wallet/lib/entity/Resource;", "it", "I0", "Lcom/huami/wallet/ui/entity/BusCardDetailAndBalance;", "F0", "J0", "", "Lcom/huami/wallet/lib/entity/CarouseInfo;", "E0", "G0", "Landroid/util/Pair;", "", "resource", "D0", "R", "B0", "A0", "data", ExifInterface.LATITUDE_SOUTH, "Lcom/huami/wallet/lib/entity/Protocol;", "c1", "y0", "id", LogUtil.I, "(Ljava/lang/Integer;)V", "type", "K0", "T0", "setSuccess", "X0", "r", "e1", "d1", "hour", "minute", "a1", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "msg", "Y0", "R0", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", Constant.PARAM_SQL_ARGUMENTS, "refreshImg", "parseArguments", "(Landroid/os/Bundle;Ljava/lang/Boolean;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "onResume", "onDestroy", "navigateToBusCardList", "initViewModel", "Lcom/huami/wallet/ui/viewmodel/XiaomiSztRefundViewModel;", "b", "Lkotlin/Lazy;", "Q", "()Lcom/huami/wallet/ui/viewmodel/XiaomiSztRefundViewModel;", "xiaomiSztRefundViewModel", "Lcom/huami/wallet/ui/viewmodel/XiaomiBulletinViewModel;", "c", "N", "()Lcom/huami/wallet/ui/viewmodel/XiaomiBulletinViewModel;", "bulletinViewModel", "Lcom/huami/wallet/ui/navigation/NavigationController;", GoogleApiAvailabilityLight.a, "O", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "navigationController", "Lcom/huami/wallet/ui/resource/IWalletRes;", "e", "Lcom/huami/wallet/ui/resource/IWalletRes;", "iWalletRes", "Lcom/huami/wallet/ui/repository/NoticeRepo;", "f", "P", "()Lcom/huami/wallet/ui/repository/NoticeRepo;", "noticeRepo", "Lcom/huami/wallet/ui/viewmodel/BusCardDetailViewModel;", "g", "getViewModel", "()Lcom/huami/wallet/ui/viewmodel/BusCardDetailViewModel;", "viewModel", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "h", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingDialogHelper", "i", "Ljava/lang/String;", "cardId", z.j, "getCardName", "()Ljava/lang/String;", "setCardName", "(Ljava/lang/String;)V", "cardName", hl.k, "getXiaomiCardName", "setXiaomiCardName", "xiaomiCardName", "l", "imgUrl", "m", "cardNumber", GoogleApiAvailabilityLight.b, "Ljava/lang/Boolean;", "shiftEnable", "o", com.google.android.exoplayer2.text.ttml.b.r, "appName", DTransferConstants.SEARCH_KEY, "redirectTo", "serviceContact", SOAP.XMLNS, "xmReturnCardFlg", "t", "xmReturnFeeFlg", "u", "refundEnable", "v", "getMBalance", "()I", "setMBalance", "(I)V", "mBalance", "Lcom/huami/wallet/ui/dialog/TimeSelectorDialog;", "w", "Lcom/huami/wallet/ui/dialog/TimeSelectorDialog;", "timeSelectorDialog", "x", "Landroid/view/View;", RootDescription.ROOT_ELEMENT, "Landroid/view/View$OnClickListener;", "y", "Landroid/view/View$OnClickListener;", "onClickListener", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BusCardDetailFragment extends BaseFragment {

    @NotNull
    private static final String A = "BusCardDetailFragment";
    private static final int B = 5;
    private static final int z = 1000;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy xiaomiSztRefundViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy bulletinViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final IWalletRes iWalletRes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy noticeRepo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper loadingDialogHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private String cardId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private String cardName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private String xiaomiCardName;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private String imgUrl;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private String cardNumber;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private Boolean shiftEnable;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private String packageName;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private String appName;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private String redirectTo;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    private String serviceContact;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    private Boolean xmReturnCardFlg;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    private Boolean xmReturnFeeFlg;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    private Boolean refundEnable;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private int mBalance;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    private TimeSelectorDialog timeSelectorDialog;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private View root;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final View.OnClickListener onClickListener;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.LOADING.ordinal()] = 1;
            iArr[Status.SUCCESS.ordinal()] = 2;
            iArr[Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "canRecharge", "Lcom/huami/wallet/lib/entity/Notice;", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<Boolean, Notice, Object> {
        public a() {
            super(2);
        }

        @Nullable
        public final Object a(boolean z, @Nullable Notice notice) {
            if (!z) {
                return null;
            }
            BusCardDetailFragment.this.z0();
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Notice notice) {
            return a(bool.booleanValue(), notice);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "pass", "Lcom/huami/wallet/lib/entity/Notice;", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Boolean, Notice, Object> {
        public b() {
            super(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(BusCardDetailFragment busCardDetailFragment, DialogInterface dialogInterface, int i) {
            busCardDetailFragment.getViewModel().deleteBusCard(busCardDetailFragment.cardId);
        }

        @Nullable
        public final Object b(boolean z, @Nullable Notice notice) {
            if (z) {
                AlertDialogFragment.Builder negativeButton = new AlertDialogFragment.Builder(BusCardDetailFragment.this.getActivity()).setMessage("确定要删除公交卡？").setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
                final BusCardDetailFragment busCardDetailFragment = BusCardDetailFragment.this;
                negativeButton.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.huami.wallet.ui.fragment.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        BusCardDetailFragment.b.c(busCardDetailFragment, dialogInterface, i);
                    }
                }).create().show(BusCardDetailFragment.this.getFragmentManager());
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Notice notice) {
            return b(bool.booleanValue(), notice);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable View view) {
            BusCardDetailFragment.this.A0();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0000\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/applet/CardScheduleTime;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<CardScheduleTime, Comparable<?>> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(@NotNull CardScheduleTime cardScheduleTime) {
            return Integer.valueOf(cardScheduleTime.getHour());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0000\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/applet/CardScheduleTime;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<CardScheduleTime, Comparable<?>> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(@NotNull CardScheduleTime cardScheduleTime) {
            return Integer.valueOf(cardScheduleTime.getMinute());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<View, Unit> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable View view) {
            BusCardDetailFragment.b1(BusCardDetailFragment.this, null, null, 3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/applet/CardScheduleTime;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<CardScheduleTime, Unit> {
        public g() {
            super(1);
        }

        public final void a(@NotNull CardScheduleTime cardScheduleTime) {
            BusCardDetailFragment.this.getViewModel().deleteScheduleTimes(cardScheduleTime);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CardScheduleTime cardScheduleTime) {
            a(cardScheduleTime);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<View, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "pass", "Lcom/huami/wallet/lib/entity/Notice;", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Boolean, Notice, Object> {
            public final /* synthetic */ BusCardDetailFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BusCardDetailFragment busCardDetailFragment) {
                super(2);
                this.a = busCardDetailFragment;
            }

            @Nullable
            public final Object a(boolean z, @Nullable Notice notice) {
                if (!z) {
                    return null;
                }
                this.a.getViewModel().checkHasVerifiedPhone();
                return null;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Notice notice) {
                return a(bool.booleanValue(), notice);
            }
        }

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable View view) {
            if (BusCardDetailFragment.this.getViewModel().isMiDevice()) {
                BusCardDetailFragment.this.B0();
            } else {
                NoticeViewUtils.checkNeedShowDialog(BusCardDetailFragment.this.requireContext(), BusCardDetailFragment.this.P().getNotices(), BusCardDetailFragment.this.getChildFragmentManager(), BusCardDetailFragment.this.cardId, CollectionsKt__CollectionsKt.mutableListOf(NoticeActionType.SHIFT_OUT), new a(BusCardDetailFragment.this));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(1);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable View view) {
            AppUtils.INSTANCE.call(BusCardDetailFragment.this.requireActivity(), this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<View, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ BusCardDetailFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BusCardDetailFragment busCardDetailFragment) {
                super(0);
                this.a = busCardDetailFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String str = this.a.redirectTo;
                if (str == null) {
                    return;
                }
                AppUtils.INSTANCE.goWeb(this.a.requireActivity(), str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ BusCardDetailFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(BusCardDetailFragment busCardDetailFragment) {
                super(0);
                this.a = busCardDetailFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PackageManager packageManager;
                Intent launchIntentForPackage;
                FragmentActivity activity;
                FragmentActivity activity2 = this.a.getActivity();
                if (activity2 == null || (packageManager = activity2.getPackageManager()) == null || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(this.a.packageName)) == null || (activity = this.a.getActivity()) == null) {
                    return;
                }
                activity.startActivity(launchIntentForPackage);
            }
        }

        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable View view) {
            BusCardDetailFragment busCardDetailFragment = BusCardDetailFragment.this;
            busCardDetailFragment.L(busCardDetailFragment.packageName, new a(BusCardDetailFragment.this), new b(BusCardDetailFragment.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<View, Unit> {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable View view) {
            BusCardDetailFragment.this.M();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "url", "msg", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function2<String, String, Object> {
        public l() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable String str, @Nullable String str2) {
            if (str == null || TextUtils.isEmpty(str)) {
                NoticeViewUtils.showDialog(BusCardDetailFragment.this.requireContext(), BusCardDetailFragment.this.getChildFragmentManager(), str2);
                return null;
            }
            BusCardDetailFragment.this.O().navigateToWeb(str, null);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<String, Unit> {
        public m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            BusCardDetailFragment.this.O().navigateToWeb(str, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/bus/entities/XiaomiBulletin;", "keepIt", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function1<XiaomiBulletin, Unit> {
        public n() {
            super(1);
        }

        public final void a(@NotNull XiaomiBulletin xiaomiBulletin) {
            BusCardDetailFragment.this.N().keep(BusCardDetailFragment.this.requireContext(), xiaomiBulletin);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(XiaomiBulletin xiaomiBulletin) {
            a(xiaomiBulletin);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "Lcom/huami/wallet/lib/entity/CarouseInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<Resource<List<? extends CarouseInfo>>, Unit> {
        public o() {
            super(1);
        }

        public final void a(@NotNull Resource<List<CarouseInfo>> resource) {
            BusCardDetailFragment.this.E0(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<List<? extends CarouseInfo>> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function1<Resource<String>, Unit> {
        public p() {
            super(1);
        }

        public final void a(Resource<String> resource) {
            BusCardDetailFragment.this.J0(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/wallet/ui/entity/BusCardDetailAndBalance;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function1<Resource<BusCardDetailAndBalance>, Unit> {
        public q() {
            super(1);
        }

        public final void a(Resource<BusCardDetailAndBalance> resource) {
            BusCardDetailFragment.this.F0(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<BusCardDetailAndBalance> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function1<Resource<String>, Unit> {
        public r() {
            super(1);
        }

        public final void a(Resource<String> resource) {
            BusCardDetailFragment.this.I0(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function1<Boolean, Unit> {
        public s() {
            super(1);
        }

        public final void a(Boolean bool) {
            if (bool.booleanValue()) {
                LoadingDialogHelper loadingDialogHelper = BusCardDetailFragment.this.loadingDialogHelper;
                if (loadingDialogHelper == null) {
                    return;
                }
                loadingDialogHelper.showLoading();
                return;
            }
            LoadingDialogHelper loadingDialogHelper2 = BusCardDetailFragment.this.loadingDialogHelper;
            if (loadingDialogHelper2 == null) {
                return;
            }
            loadingDialogHelper2.hideLoading();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function1<String, Unit> {
        public t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            IconToast.showError(BusCardDetailFragment.this.getActivity(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<Unit> {
        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BusCardDetailFragment.this.Q().returnCard(BusCardDetailFragment.this.cardId, Integer.valueOf(BusCardDetailFragment.this.getMBalance()), null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<Unit> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BusCardDetailViewModel viewModel = BusCardDetailFragment.this.getViewModel();
            String str = BusCardDetailFragment.this.cardId;
            if (str == null) {
                str = "";
            }
            if (viewModel.isMiSzt(str)) {
                BusCardDetailViewModel viewModel2 = BusCardDetailFragment.this.getViewModel();
                String str2 = BusCardDetailFragment.this.cardId;
                viewModel2.revertBusCard(str2 != null ? str2 : "");
            } else {
                BusCardDetailViewModel viewModel3 = BusCardDetailFragment.this.getViewModel();
                String str3 = BusCardDetailFragment.this.cardId;
                viewModel3.revertBusCard(str3 != null ? str3 : "");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "hour", "minute", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function2<Integer, Integer, Unit> {
        public final /* synthetic */ TimeSelectorDialog b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "code", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Integer, Unit> {
            public final /* synthetic */ BusCardDetailFragment a;
            public final /* synthetic */ TimeSelectorDialog b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BusCardDetailFragment busCardDetailFragment, TimeSelectorDialog timeSelectorDialog) {
                super(1);
                this.a = busCardDetailFragment;
                this.b = timeSelectorDialog;
            }

            public final void a(int i) {
                if (i == 1) {
                    this.a.Y0(this.b.getString(com.huami.wallet.ui.R.string.wl_set_scheduled_switch_notification_msg_1));
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.a.Y0(this.b.getResources().getQuantityString(com.huami.wallet.ui.R.plurals.wl_set_scheduled_switch_notification_msg_2, 5, 5));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                a(num.intValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(TimeSelectorDialog timeSelectorDialog) {
            super(2);
            this.b = timeSelectorDialog;
        }

        public final void a(@Nullable Integer num, @Nullable Integer num2) {
            if (num == null) {
                return;
            }
            num.intValue();
            if (num2 == null) {
                return;
            }
            num2.intValue();
            String str = BusCardDetailFragment.this.cardId;
            if (str == null) {
                return;
            }
            BusCardDetailFragment busCardDetailFragment = BusCardDetailFragment.this;
            busCardDetailFragment.getViewModel().setCardScheduleTime(str, num.intValue(), num2.intValue(), new a(busCardDetailFragment, this.b));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            a(num, num2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BusCardDetailFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.BusCardDetailFragment$special$$inlined$viewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.xiaomiSztRefundViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<XiaomiSztRefundViewModel>() { // from class: com.huami.wallet.ui.fragment.BusCardDetailFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.XiaomiSztRefundViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final XiaomiSztRefundViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(XiaomiSztRefundViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.BusCardDetailFragment$special$$inlined$viewModel$default$3
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
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.bulletinViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<XiaomiBulletinViewModel>() { // from class: com.huami.wallet.ui.fragment.BusCardDetailFragment$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.XiaomiBulletinViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final XiaomiBulletinViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(XiaomiBulletinViewModel.class), function1, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.fragment.BusCardDetailFragment$special$$inlined$inject$default$1
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
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), objArr4, objArr5);
            }
        });
        this.iWalletRes = KoinModuleKt.deviceRes();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.noticeRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<NoticeRepo>() { // from class: com.huami.wallet.ui.fragment.BusCardDetailFragment$special$$inlined$inject$default$2
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
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NoticeRepo.class), objArr6, objArr7);
            }
        });
        final Function0<ViewModelOwner> function2 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.BusCardDetailFragment$special$$inlined$viewModel$default$5
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
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BusCardDetailViewModel>() { // from class: com.huami.wallet.ui.fragment.BusCardDetailFragment$special$$inlined$viewModel$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.BusCardDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final BusCardDetailViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr8, Reflection.getOrCreateKotlinClass(BusCardDetailViewModel.class), function2, objArr9);
            }
        });
        Boolean bool = Boolean.FALSE;
        this.xmReturnCardFlg = bool;
        this.xmReturnFeeFlg = bool;
        this.refundEnable = bool;
        this.onClickListener = new View.OnClickListener() { // from class: ta0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BusCardDetailFragment.H0(this.a, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0() {
        Args args = Args.INSTANCE;
        args.clean();
        String str = this.cardId;
        if (str == null) {
            str = "";
        }
        args.setAppCode(str);
        args.setCardNumber(this.cardNumber);
        args.setXiaomiCardName(this.xiaomiCardName);
        args.setBlance(this.mBalance);
        args.setCardName(this.cardName);
        O().navigateToRemindRefundActivity(this.cardId, getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0() {
        O().navigateToShiftOutTips(getActivity(), this.cardId, null, this.imgUrl, this.cardName, this.xiaomiCardName, "");
    }

    private final void C0() {
        O().navigateToTradeRecord(getContext(), this.cardId, this.cardName, this.xiaomiCardName, this.cardNumber);
    }

    private final void D0(Pair<Integer, Resource<String>> resource) {
        if (resource == null) {
            return;
        }
        Status status = ((Resource) resource.second).status;
        Status status2 = Status.LOADING;
        if (status == status2) {
            LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
            if (loadingDialogHelper != null) {
                loadingDialogHelper.showLoading();
            }
        } else {
            LoadingDialogHelper loadingDialogHelper2 = this.loadingDialogHelper;
            if (loadingDialogHelper2 != null) {
                loadingDialogHelper2.hideLoading();
            }
        }
        if (((Resource) resource.second).status != status2) {
            I((Integer) resource.first);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(Resource<List<CarouseInfo>> it2) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[it2.status.ordinal()];
        if (i2 == 1) {
            LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.showLoading();
            return;
        }
        if (i2 != 2) {
            LoadingDialogHelper loadingDialogHelper2 = this.loadingDialogHelper;
            if (loadingDialogHelper2 == null) {
                return;
            }
            loadingDialogHelper2.hideLoading();
            return;
        }
        LoadingDialogHelper loadingDialogHelper3 = this.loadingDialogHelper;
        if (loadingDialogHelper3 != null) {
            loadingDialogHelper3.hideLoading();
        }
        S(it2.data);
        CitySimpleInfoCache citySimpleInfoCache = CitySimpleInfoCache.INSTANCE;
        String str = this.cardId;
        if (str == null) {
            str = "";
        }
        CitySimpleInfo cityInfo = citySimpleInfoCache.getCityInfo(str);
        if (cityInfo == null) {
            return;
        }
        getViewModel().updateCardInfo(cityInfo.getName(), cityInfo.getAid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0(Resource<BusCardDetailAndBalance> it2) {
        BusCardDetail busCardDetail;
        if (it2.status == Status.SUCCESS) {
            BusCardDetailAndBalance busCardDetailAndBalance = it2.data;
            this.cardNumber = (busCardDetailAndBalance == null || (busCardDetail = busCardDetailAndBalance.detail) == null) ? null : busCardDetail.number;
            getViewModel().getDefaultBusCardId();
            if (kotlin.text.m.equals$default(this.cardId, ConstantKt.APP_CODE_SHEN_ZHEN_MOT, false, 2, null) && !getViewModel().isMiDevice()) {
                CitySimpleInfoCache citySimpleInfoCache = CitySimpleInfoCache.INSTANCE;
                String str = this.cardId;
                if (str == null) {
                    str = "";
                }
                CitySimpleInfo cityInfo = citySimpleInfoCache.getCityInfo(str);
                if (cityInfo != null ? Intrinsics.areEqual(cityInfo.getOpenFeeRefundApplyFlg(), Boolean.FALSE) : false) {
                    BusCardDetailViewModel viewModel = getViewModel();
                    String str2 = this.cardId;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = this.cardNumber;
                    viewModel.getOpenFeeStatus(str2, str3 != null ? str3 : "");
                }
            }
        }
        LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
        if (loadingDialogHelper != null) {
            loadingDialogHelper.showOrError(it2);
        }
        d1(it2);
    }

    private final void G0(Resource<String> it2) {
        if (it2 == null) {
            return;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[it2.status.ordinal()];
        if (i2 == 1) {
            LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.showLoading(getString(com.huami.wallet.ui.R.string.wl_setting_card_set_card));
            return;
        }
        if (i2 != 2) {
            LoadingDialogHelper loadingDialogHelper2 = this.loadingDialogHelper;
            if (loadingDialogHelper2 != null) {
                loadingDialogHelper2.hideLoading();
            }
            X0(false);
            return;
        }
        AnalyticsHelper.INSTANCE.recordBusDetailOutEvent(BusDetailOutType.BUS_DETAIL_OUT_ENABLED, getViewModel().getWalletDataSource().getDeviceModel());
        LoadingDialogHelper loadingDialogHelper3 = this.loadingDialogHelper;
        if (loadingDialogHelper3 != null) {
            loadingDialogHelper3.hideLoading();
        }
        X0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(BusCardDetailFragment busCardDetailFragment, View view) {
        busCardDetailFragment.getViewModel().checkProtocol(busCardDetailFragment.cardId, busCardDetailFragment.getXiaomiCardName(), view.hashCode());
    }

    private final void I(Integer id) {
        View view = this.root;
        Objects.requireNonNull(view);
        int iHashCode = ((Button) view.findViewById(com.huami.wallet.ui.R.id.recharge_button)).hashCode();
        if (id != null && id.intValue() == iHashCode) {
            if (K0("RECHARGE")) {
                return;
            }
            NoticeViewUtils.checkNeedShowDialog(requireContext(), P().getNotices(), getChildFragmentManager(), this.cardId, CollectionsKt__CollectionsKt.mutableListOf(NoticeActionType.TOPUP), new a());
            return;
        }
        View view2 = this.root;
        Objects.requireNonNull(view2);
        int iHashCode2 = ((TextView) view2.findViewById(com.huami.wallet.ui.R.id.trade_record)).hashCode();
        if (id != null && id.intValue() == iHashCode2) {
            C0();
            return;
        }
        View view3 = this.root;
        Objects.requireNonNull(view3);
        int iHashCode3 = ((TextView) view3.findViewById(com.huami.wallet.ui.R.id.faq)).hashCode();
        if (id != null && id.intValue() == iHashCode3) {
            AnalyticsHelper.INSTANCE.recordBusDetailOutEvent(BusDetailOutType.BUS_DETAIL_OUT_FAQ, getViewModel().getWalletDataSource().getDeviceModel());
            NavigationController navigationControllerO = O();
            Context context = getContext();
            navigationControllerO.navigateToWeb(context == null ? null : BusWebUrlHelper.INSTANCE.getBusFAQWebUrl(context, getViewModel().isMiDevice()), null);
            return;
        }
        View view4 = this.root;
        Objects.requireNonNull(view4);
        int iHashCode4 = ((TextView) view4.findViewById(com.huami.wallet.ui.R.id.set_as_default_card_button)).hashCode();
        if (id != null && id.intValue() == iHashCode4) {
            N0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0(Resource<String> it2) {
        if (it2.isSuccessful() || !Intrinsics.areEqual(it2.code, ErrorCode.CARD_EXPIRED)) {
            return;
        }
        R0();
    }

    private final void J() {
        Drawable drawableTintDrawable = TintUtils.tintDrawable(getContext(), com.huami.wallet.ui.R.drawable.wl_ic_arrow_right, com.huami.wallet.ui.R.color.s1);
        View view = this.root;
        Objects.requireNonNull(view);
        TextView textView = (TextView) view.findViewById(com.huami.wallet.ui.R.id.trade_record);
        if (textView != null) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableTintDrawable, (Drawable) null);
        }
        View view2 = this.root;
        Objects.requireNonNull(view2);
        TextView textView2 = (TextView) view2.findViewById(com.huami.wallet.ui.R.id.faq);
        if (textView2 != null) {
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableTintDrawable, (Drawable) null);
        }
        View view3 = this.root;
        Objects.requireNonNull(view3);
        TextView textView3 = (TextView) view3.findViewById(com.huami.wallet.ui.R.id.detail_tv_arrow_right);
        if (textView3 == null) {
            return;
        }
        textView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableTintDrawable, (Drawable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(Resource<String> it2) {
        if (it2.status == Status.ERROR && Intrinsics.areEqual(it2.code, "c0007")) {
            LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
            if (loadingDialogHelper != null) {
                loadingDialogHelper.hideLoading();
            }
            R();
            return;
        }
        LoadingDialogHelper loadingDialogHelper2 = this.loadingDialogHelper;
        if (loadingDialogHelper2 != null) {
            loadingDialogHelper2.showOrError(it2);
        }
        if (it2.status != Status.SUCCESS) {
            return;
        }
        B0();
    }

    private final boolean K() {
        if (!TextUtils.isEmpty(this.cardId)) {
            return true;
        }
        IconToast.showError(getActivity(), "appCode为空");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        HMLog.e(A, "appCode为空", new Object[0]);
        return false;
    }

    private final boolean K0(String type) {
        Resource<List<XiaomiNotice>> value = getViewModel().getXiaomiNoticesLiveData().getValue();
        XiaomiNotice popXiaomiNotice = KtUtils.getPopXiaomiNotice(value == null ? null : value.data, this.xiaomiCardName, type);
        if (popXiaomiNotice == null) {
            return false;
        }
        NoticeViewUtils.showDialog(requireContext(), getChildFragmentManager(), popXiaomiNotice.getDescription());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(String packageName, Function0<Unit> onNoInstalled, Function0<Unit> onPass) {
        if (AppUtils.INSTANCE.isAppInstalled(requireContext(), packageName)) {
            onPass.getA();
        } else {
            onNoInstalled.getA();
        }
    }

    private final void L0() {
        new AlertDialogFragment.Builder(getContext()).setMessage(requireContext().getResources().getString(com.huami.wallet.ui.R.string.wl_order_expired_tip)).setNeutralButton(com.huami.wallet.ui.R.string.wl_order_expired_get_repair_number, new DialogInterface.OnClickListener() { // from class: q90
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                BusCardDetailFragment.M0(this.a, dialogInterface, i2);
            }
        }).setCancelable(true).create().show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        NoticeViewUtils.checkNeedShowDialog(requireContext(), P().getNotices(), getChildFragmentManager(), this.cardId, CollectionsKt__CollectionsKt.mutableListOf(NoticeActionType.DELETE), new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(BusCardDetailFragment busCardDetailFragment, DialogInterface dialogInterface, int i2) {
        BusCardDetailViewModel viewModel = busCardDetailFragment.getViewModel();
        String str = busCardDetailFragment.cardId;
        if (str == null) {
            str = "";
        }
        View view = busCardDetailFragment.root;
        Objects.requireNonNull(view);
        viewModel.applyRefundOpenFee(str, ((TextView) view.findViewById(com.huami.wallet.ui.R.id.card_number)).getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final XiaomiBulletinViewModel N() {
        return (XiaomiBulletinViewModel) this.bulletinViewModel.getValue();
    }

    private final void N0() {
        new AlertDialogFragment.Builder(getContext()).setTitle(com.huami.wallet.ui.R.string.wl_set_default_card).setMessage(this.iWalletRes.getSetAsDefaultCardMessage()).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: ba0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                BusCardDetailFragment.O0(this.a, dialogInterface, i2);
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController O() {
        return (NavigationController) this.navigationController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(BusCardDetailFragment busCardDetailFragment, DialogInterface dialogInterface, int i2) {
        Resource<String> value;
        String str = null;
        if (busCardDetailFragment.getViewModel().getDefaultBusCardIdLiveData().getValue() != null) {
            Resource<String> value2 = busCardDetailFragment.getViewModel().getDefaultBusCardIdLiveData().getValue();
            if (!KtUtils.isNullOrEmpty(value2 == null ? null : value2.data) && (value = busCardDetailFragment.getViewModel().getDefaultBusCardIdLiveData().getValue()) != null) {
                str = value.data;
            }
        }
        if (busCardDetailFragment.cardId != null) {
            busCardDetailFragment.getViewModel().setDefaultBusCard(busCardDetailFragment.cardId, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NoticeRepo P() {
        return (NoticeRepo) this.noticeRepo.getValue();
    }

    private final void P0(final Function0<Unit> onPass) {
        new AlertDialogFragment.Builder(getContext()).setMessage(requireContext().getResources().getString(com.huami.wallet.ui.R.string.wl_return_card_tip)).setPositiveButton(com.huami.wallet.ui.R.string.wl_return_card_dialog_true, new DialogInterface.OnClickListener() { // from class: pa0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                BusCardDetailFragment.Q0(onPass, dialogInterface, i2);
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final XiaomiSztRefundViewModel Q() {
        return (XiaomiSztRefundViewModel) this.xiaomiSztRefundViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q0(Function0 function0, DialogInterface dialogInterface, int i2) {
        function0.getA();
    }

    private final void R() {
        O().navigateToBindPhoneNumber(getContext(), Boolean.FALSE, Boolean.TRUE, "", this.cardId, this.cardName, this.imgUrl, this.xiaomiCardName, this.packageName, this.appName, this.redirectTo, this.serviceContact);
    }

    private final void R0() {
        LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
        if (loadingDialogHelper != null) {
            loadingDialogHelper.hideLoading();
        }
        Context contextRequireContext = requireContext();
        LoadingDialogHelper loadingDialogHelper2 = this.loadingDialogHelper;
        String string = contextRequireContext.getString(loadingDialogHelper2 != null && loadingDialogHelper2.isForMi() ? com.huami.wallet.ui.R.string.wl_contact_xiaomi : com.huami.wallet.ui.R.string.wl_contact_huami);
        AlertDialogFragment.Builder cancelable = new AlertDialogFragment.Builder(requireContext()).setTitle(com.huami.wallet.ui.R.string.wl_tips).setCancelable(false);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        cancelable.setMessage(String.format(Locale.getDefault(), getString(com.huami.wallet.ui.R.string.wl_card_expired), Arrays.copyOf(new Object[]{string}, 1))).setNeutralButton(com.huami.wallet.ui.R.string.wl_known, new DialogInterface.OnClickListener() { // from class: sa0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                BusCardDetailFragment.S0(dialogInterface, i2);
            }
        }).show(getChildFragmentManager());
    }

    private final void S(List<CarouseInfo> data) {
        int i2 = 0;
        if (getViewModel().isSupportBannerView()) {
            View view = this.root;
            Objects.requireNonNull(view);
            ((BGABanner) view.findViewById(com.huami.wallet.ui.R.id.view_pager_banner)).setVisibility(0);
        } else {
            View view2 = this.root;
            Objects.requireNonNull(view2);
            ((BGABanner) view2.findViewById(com.huami.wallet.ui.R.id.view_pager_banner)).setVisibility(8);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (data != null) {
            for (Object obj : data) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(i2, View.inflate(b(), com.huami.wallet.ui.R.layout.wl_item_bus_banner_intro, null));
                arrayList2.add(i2, (CarouseInfo) obj);
                i2 = i3;
            }
        }
        View view3 = this.root;
        Objects.requireNonNull(view3);
        int i4 = com.huami.wallet.ui.R.id.view_pager_banner;
        ((BGABanner) view3.findViewById(i4)).setAdapter(new BGABanner.Adapter() { // from class: na0
            @Override // cn.bingoogolapple.bgabanner.BGABanner.Adapter
            public final void fillBannerItem(BGABanner bGABanner, View view4, Object obj2, int i5) {
                BusCardDetailFragment.T(this.a, bGABanner, view4, obj2, i5);
            }
        });
        View view4 = this.root;
        Objects.requireNonNull(view4);
        ((BGABanner) view4.findViewById(i4)).setData(arrayList, arrayList2, (List<String>) null);
        View view5 = this.root;
        Objects.requireNonNull(view5);
        ((BGABanner) view5.findViewById(i4)).setDelegate(new BGABanner.Delegate() { // from class: oa0
            @Override // cn.bingoogolapple.bgabanner.BGABanner.Delegate
            public final void onBannerItemClick(BGABanner bGABanner, View view6, Object obj2, int i5) {
                BusCardDetailFragment.U(this.a, bGABanner, view6, obj2, i5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S0(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(BusCardDetailFragment busCardDetailFragment, BGABanner bGABanner, View view, Object obj, int i2) {
        RequestManager requestManagerWith = Glide.with(busCardDetailFragment.b());
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.huami.wallet.lib.entity.CarouseInfo");
        requestManagerWith.load(((CarouseInfo) obj).getImage()).into((ImageView) view.findViewById(com.huami.wallet.ui.R.id.iv_banner_detail));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void T0(final Pair<Integer, Resource<Protocol>> resource) {
        Object obj = resource.second;
        if ((((Resource) obj).data != 0 ? ((Protocol) ((Resource) obj).data).getId() : null) == null) {
            return;
        }
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(b());
        int i2 = com.huami.wallet.ui.R.string.wl_protcol_title;
        Object[] objArr = new Object[1];
        Protocol protocol = (Protocol) ((Resource) resource.second).data;
        objArr[0] = Intrinsics.stringPlus("", protocol == null ? null : protocol.getTitle());
        AlertDialogFragment.Builder message = builder.setTitle(getString(i2, objArr)).setMessage(com.huami.wallet.ui.R.string.wl_protcol_link_head);
        Protocol protocol2 = (Protocol) ((Resource) resource.second).data;
        message.setLink(Intrinsics.stringPlus("", protocol2 != null ? protocol2.getTitle() : null), new View.OnClickListener() { // from class: t90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BusCardDetailFragment.U0(this.a, resource, view);
            }
        }).setNegativeButton(com.huami.wallet.ui.R.string.wl_protcol_dont_agree, new DialogInterface.OnClickListener() { // from class: qa0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                BusCardDetailFragment.V0(dialogInterface, i3);
            }
        }).setPositiveButton(com.huami.wallet.ui.R.string.wl_protcol_agree, new DialogInterface.OnClickListener() { // from class: ma0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                BusCardDetailFragment.W0(this.a, resource, dialogInterface, i3);
            }
        }).setCancelable(false).create().show(getFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(BusCardDetailFragment busCardDetailFragment, BGABanner bGABanner, View view, Object obj, int i2) {
        NavigationController navigationControllerO = busCardDetailFragment.O();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.huami.wallet.lib.entity.CarouseInfo");
        navigationControllerO.navigateToWeb(((CarouseInfo) obj).getUrl(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void U0(BusCardDetailFragment busCardDetailFragment, Pair pair, View view) {
        NavigationController navigationControllerO = busCardDetailFragment.O();
        Protocol protocol = (Protocol) ((Resource) pair.second).data;
        navigationControllerO.navigateToWeb(protocol == null ? null : protocol.getContent(), null);
    }

    private final void V() {
        CitySimpleInfoCache citySimpleInfoCache = CitySimpleInfoCache.INSTANCE;
        String str = this.cardId;
        if (str == null) {
            str = "";
        }
        CitySimpleInfo cityInfo = citySimpleInfoCache.getCityInfo(str);
        this.xmReturnCardFlg = cityInfo == null ? null : cityInfo.getXmReturnCardFlg();
        String str2 = this.cardId;
        CitySimpleInfo cityInfo2 = citySimpleInfoCache.getCityInfo(str2 != null ? str2 : "");
        this.xmReturnFeeFlg = cityInfo2 != null ? cityInfo2.getXmReturnFeeFlg() : null;
        q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V0(DialogInterface dialogInterface, int i2) {
    }

    private final void W() {
        Boolean bool = this.refundEnable;
        if (bool == null) {
            return;
        }
        if (!bool.booleanValue()) {
            bool = null;
        }
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        View view = this.root;
        Objects.requireNonNull(view);
        int i2 = com.huami.wallet.ui.R.id.ll_normal_return_card;
        ((LinearLayout) view.findViewById(i2)).setVisibility(0);
        View view2 = this.root;
        Objects.requireNonNull(view2);
        view2.findViewById(com.huami.wallet.ui.R.id.ll_normal_return_card_divider).setVisibility(0);
        View view3 = this.root;
        Objects.requireNonNull(view3);
        KTViewExtensionKt.singleClick((LinearLayout) view3.findViewById(i2), new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void W0(BusCardDetailFragment busCardDetailFragment, Pair pair, DialogInterface dialogInterface, int i2) {
        busCardDetailFragment.getViewModel().agreeProtocol(((Number) pair.first).intValue(), busCardDetailFragment.cardId, ((Protocol) ((Resource) pair.second).data).getId().longValue());
    }

    private final void X() {
        getViewModel().getRevertCardLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: z90
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardDetailFragment.Y(this.a, (Resource) obj);
            }
        });
        getViewModel().getOpenFeeStateLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: da0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardDetailFragment.Z(this.a, (Resource) obj);
            }
        });
        getViewModel().getRefundOpenFeeLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ea0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardDetailFragment.a0(this.a, (Resource) obj);
            }
        });
    }

    private final void X0(boolean setSuccess) {
        int i2 = com.huami.wallet.ui.R.string.wl_set_default_success;
        int setAsDefaultCardSuccessMessage = this.iWalletRes.getSetAsDefaultCardSuccessMessage();
        if (!setSuccess) {
            i2 = com.huami.wallet.ui.R.string.wl_set_default_failure;
            setAsDefaultCardSuccessMessage = com.huami.wallet.ui.R.string.wl_set_default_failure_message;
        }
        new AlertDialogFragment.Builder(getActivity()).setCancelable(true).setTitle(i2).setMessage(setAsDefaultCardSuccessMessage).setNeutralButton(com.huami.wallet.ui.R.string.wl_i_know_it, (DialogInterface.OnClickListener) null).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void Y(BusCardDetailFragment busCardDetailFragment, Resource resource) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i2 == 1) {
            LoadingDialogHelper loadingDialogHelper = busCardDetailFragment.loadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.showLoading(busCardDetailFragment.requireContext().getResources().getString(com.huami.wallet.ui.R.string.wl_deleting_tip));
            return;
        }
        if (i2 == 2) {
            LoadingDialogHelper loadingDialogHelper2 = busCardDetailFragment.loadingDialogHelper;
            if (loadingDialogHelper2 != null) {
                loadingDialogHelper2.hideLoading();
            }
            busCardDetailFragment.requireContext().startActivity(new Intent(busCardDetailFragment.getContext(), (Class<?>) RefundResultActivity.class).putExtra(RefundResultActivity.EXTRA_RESULT, 2).putExtra("ARG_BUS_CARD_NAME", busCardDetailFragment.getCardName()).putExtra(RefundResultActivity.EXTRA_ORDER_NUMBER, (String) resource.data));
            return;
        }
        if (i2 != 3) {
            return;
        }
        LoadingDialogHelper loadingDialogHelper3 = busCardDetailFragment.loadingDialogHelper;
        if (loadingDialogHelper3 != null) {
            loadingDialogHelper3.hideLoading();
        }
        CustomToast.makeText(busCardDetailFragment.requireContext(), com.huami.wallet.ui.R.string.wl_revert_card_fail, 0).show();
        busCardDetailFragment.requireContext().startActivity(new Intent(busCardDetailFragment.getContext(), (Class<?>) RefundResultActivity.class).putExtra(RefundResultActivity.EXTRA_RESULT, 3).putExtra("ARG_BUS_CARD_NAME", busCardDetailFragment.getCardName()).putExtra(RefundResultActivity.EXTRA_ORDER_NUMBER, (String) resource.data).putExtra(RefundResultActivity.EXTRA_ERROR_MEG, resource.message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0(String msg) {
        new AlertDialogFragment.Builder(requireContext()).setTitle(com.huami.wallet.ui.R.string.wl_scheduled_switch_notification_title).setMessage(msg).setNeutralButton(com.huami.wallet.ui.R.string.got_it, new DialogInterface.OnClickListener() { // from class: ra0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                BusCardDetailFragment.Z0(dialogInterface, i2);
            }
        }).setCancelable(false).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void Z(BusCardDetailFragment busCardDetailFragment, Resource resource) {
        LoadingDialogHelper loadingDialogHelper;
        int i2 = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i2 == 1) {
            LoadingDialogHelper loadingDialogHelper2 = busCardDetailFragment.loadingDialogHelper;
            if (loadingDialogHelper2 == null) {
                return;
            }
            loadingDialogHelper2.showOrError(resource);
            return;
        }
        if (i2 != 2) {
            if (i2 == 3 && (loadingDialogHelper = busCardDetailFragment.loadingDialogHelper) != null) {
                loadingDialogHelper.hideLoading();
                return;
            }
            return;
        }
        LoadingDialogHelper loadingDialogHelper3 = busCardDetailFragment.loadingDialogHelper;
        if (loadingDialogHelper3 != null) {
            loadingDialogHelper3.hideLoading();
        }
        BusOpenFeeStateEntity busOpenFeeStateEntity = (BusOpenFeeStateEntity) resource.data;
        Integer numValueOf = busOpenFeeStateEntity == null ? null : Integer.valueOf(busOpenFeeStateEntity.getStatus());
        if (numValueOf != null && numValueOf.intValue() == 0) {
            View view = busCardDetailFragment.root;
            Objects.requireNonNull(view);
            BusExtensionKt.setGone((LinearLayout) view.findViewById(com.huami.wallet.ui.R.id.ll_apply_refund));
            View view2 = busCardDetailFragment.root;
            Objects.requireNonNull(view2);
            BusExtensionKt.setGone(view2.findViewById(com.huami.wallet.ui.R.id.ll_apply_refund_divider));
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            View view3 = busCardDetailFragment.root;
            Objects.requireNonNull(view3);
            ((TextView) view3.findViewById(com.huami.wallet.ui.R.id.apply_for_refund_tip)).setText(com.huami.wallet.ui.R.string.wl_return_open_card_money_tip);
            View view4 = busCardDetailFragment.root;
            Objects.requireNonNull(view4);
            ((TextView) view4.findViewById(com.huami.wallet.ui.R.id.apply_for_refund_title)).setTextColor(busCardDetailFragment.requireContext().getResources().getColor(com.huami.wallet.ui.R.color.s1));
            View view5 = busCardDetailFragment.root;
            Objects.requireNonNull(view5);
            ((LinearLayout) view5.findViewById(com.huami.wallet.ui.R.id.ll_apply_refund)).setEnabled(false);
            return;
        }
        View view6 = busCardDetailFragment.root;
        Objects.requireNonNull(view6);
        ((TextView) view6.findViewById(com.huami.wallet.ui.R.id.apply_for_refund_tip)).setText(com.huami.wallet.ui.R.string.wl_return_open_card_money_tip);
        View view7 = busCardDetailFragment.root;
        Objects.requireNonNull(view7);
        int i3 = com.huami.wallet.ui.R.id.apply_for_refund_title;
        TextView textView = (TextView) view7.findViewById(i3);
        Resources resources = busCardDetailFragment.requireContext().getResources();
        int i4 = com.huami.wallet.ui.R.color.s1;
        textView.setTextColor(resources.getColor(i4));
        View view8 = busCardDetailFragment.root;
        Objects.requireNonNull(view8);
        ((TextView) view8.findViewById(i3)).setTextColor(busCardDetailFragment.requireContext().getResources().getColor(i4));
        View view9 = busCardDetailFragment.root;
        Objects.requireNonNull(view9);
        ((LinearLayout) view9.findViewById(com.huami.wallet.ui.R.id.ll_apply_refund)).setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z0(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a0(BusCardDetailFragment busCardDetailFragment, Resource resource) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i2 == 1) {
            LoadingDialogHelper loadingDialogHelper = busCardDetailFragment.loadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.showLoading(busCardDetailFragment.requireContext().getResources().getString(com.huami.wallet.ui.R.string.wl_apply_tip));
            return;
        }
        if (i2 == 2) {
            LoadingDialogHelper loadingDialogHelper2 = busCardDetailFragment.loadingDialogHelper;
            if (loadingDialogHelper2 != null) {
                loadingDialogHelper2.hideLoading();
            }
            Context contextRequireContext = busCardDetailFragment.requireContext();
            Intent intentPutExtra = new Intent(busCardDetailFragment.getContext(), (Class<?>) RefundResultActivity.class).putExtra(RefundResultActivity.EXTRA_RESULT, 0).putExtra("ARG_BUS_CARD_NAME", busCardDetailFragment.getCardName());
            BusRefundOpenFeeEntity busRefundOpenFeeEntity = (BusRefundOpenFeeEntity) resource.data;
            contextRequireContext.startActivity(intentPutExtra.putExtra(RefundResultActivity.EXTRA_ORDER_NUMBER, busRefundOpenFeeEntity != null ? busRefundOpenFeeEntity.getVoucherCode() : null));
            return;
        }
        if (i2 != 3) {
            return;
        }
        LoadingDialogHelper loadingDialogHelper3 = busCardDetailFragment.loadingDialogHelper;
        if (loadingDialogHelper3 != null) {
            loadingDialogHelper3.hideLoading();
        }
        Context contextRequireContext2 = busCardDetailFragment.requireContext();
        Intent intentPutExtra2 = new Intent(busCardDetailFragment.getContext(), (Class<?>) RefundResultActivity.class).putExtra(RefundResultActivity.EXTRA_RESULT, 1).putExtra("ARG_BUS_CARD_NAME", busCardDetailFragment.getCardName());
        BusRefundOpenFeeEntity busRefundOpenFeeEntity2 = (BusRefundOpenFeeEntity) resource.data;
        contextRequireContext2.startActivity(intentPutExtra2.putExtra(RefundResultActivity.EXTRA_ORDER_NUMBER, busRefundOpenFeeEntity2 != null ? busRefundOpenFeeEntity2.getVoucherCode() : null));
    }

    private final void a1(Integer hour, Integer minute) {
        List<CardScheduleTime> list;
        Resource<List<CardScheduleTime>> value = getViewModel().getCardScheduleTimesLiveData().getValue();
        boolean z2 = false;
        if (((value == null || (list = value.data) == null) ? 0 : list.size()) >= 5) {
            Y0(getResources().getQuantityString(com.huami.wallet.ui.R.plurals.wl_set_scheduled_switch_notification_msg_2, 5, 5));
            return;
        }
        String string = getString(com.huami.wallet.ui.R.string.wl_choose_time);
        if (this.timeSelectorDialog == null) {
            TimeSelectorDialog timeSelectorDialog = new TimeSelectorDialog();
            this.timeSelectorDialog = timeSelectorDialog;
            timeSelectorDialog.setCancelable(true);
        }
        TimeSelectorDialog timeSelectorDialog2 = this.timeSelectorDialog;
        if (timeSelectorDialog2 == null) {
            return;
        }
        timeSelectorDialog2.setSureListener(new w(timeSelectorDialog2));
        timeSelectorDialog2.setTitle(string);
        Calendar calendar = Calendar.getInstance();
        timeSelectorDialog2.setInitialTime(hour == null ? calendar.get(11) : hour.intValue(), minute == null ? calendar.get(12) : minute.intValue());
        if (!timeSelectorDialog2.isAdded() && !timeSelectorDialog2.isVisible() && getChildFragmentManager().findFragmentByTag(A) == null) {
            z2 = true;
        }
        if (!z2) {
            timeSelectorDialog2 = null;
        }
        if (timeSelectorDialog2 == null) {
            return;
        }
        timeSelectorDialog2.show(getChildFragmentManager(), A);
    }

    private final void b0() {
        getViewModel().getCardScheduleTimesLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ia0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardDetailFragment.c0(this.a, (Resource) obj);
            }
        });
        getViewModel().getSetCardScheduleTimeResultLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: y90
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardDetailFragment.d0(this.a, (Resource) obj);
            }
        });
        getViewModel().getDeleteCardScheduleTimeResultLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ca0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardDetailFragment.e0(this.a, (Resource) obj);
            }
        });
        getViewModel().isSupportTimeSwitchCardLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: la0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardDetailFragment.f0(this.a, (Boolean) obj);
            }
        });
        getViewModel().isSupportTimeSwitchCard();
    }

    public static /* synthetic */ void b1(BusCardDetailFragment busCardDetailFragment, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 2) != 0) {
            num2 = null;
        }
        busCardDetailFragment.a1(num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(BusCardDetailFragment busCardDetailFragment, Resource resource) {
        List listSortedWith;
        LoadingDialogHelper loadingDialogHelper;
        int i2 = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i2 == 1) {
            LoadingDialogHelper loadingDialogHelper2 = busCardDetailFragment.loadingDialogHelper;
            if (loadingDialogHelper2 == null) {
                return;
            }
            loadingDialogHelper2.showLoading();
            return;
        }
        if (i2 != 2) {
            if (i2 == 3 && (loadingDialogHelper = busCardDetailFragment.loadingDialogHelper) != null) {
                loadingDialogHelper.hideLoading();
                return;
            }
            return;
        }
        LoadingDialogHelper loadingDialogHelper3 = busCardDetailFragment.loadingDialogHelper;
        if (loadingDialogHelper3 != null) {
            loadingDialogHelper3.hideLoading();
        }
        View view = busCardDetailFragment.root;
        Objects.requireNonNull(view);
        RecyclerView.Adapter adapter = ((RecyclerView) view.findViewById(com.huami.wallet.ui.R.id.rv_scheduled_switch_times)).getAdapter();
        List<CardScheduleTime> mutableList = null;
        if (!(adapter instanceof CardScheduleTimeAdapter)) {
            adapter = null;
        }
        if (adapter == null) {
            return;
        }
        CardScheduleTimeAdapter cardScheduleTimeAdapter = (CardScheduleTimeAdapter) adapter;
        List list = (List) resource.data;
        if (list != null && (listSortedWith = CollectionsKt___CollectionsKt.sortedWith(list, ComparisonsKt__ComparisonsKt.compareBy(d.a, e.a))) != null) {
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listSortedWith);
        }
        if (mutableList == null) {
            return;
        }
        cardScheduleTimeAdapter.setDataSource(mutableList);
    }

    private final void c1(Pair<Integer, Resource<Protocol>> resource) {
        Status status = ((Resource) resource.second).status;
        Status status2 = Status.LOADING;
        if (status == status2) {
            LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
            if (loadingDialogHelper != null) {
                loadingDialogHelper.showLoading();
            }
        } else {
            LoadingDialogHelper loadingDialogHelper2 = this.loadingDialogHelper;
            if (loadingDialogHelper2 != null) {
                loadingDialogHelper2.hideLoading();
            }
        }
        if (y0(resource)) {
            T0(resource);
        } else if (((Resource) resource.second).status != status2) {
            I((Integer) resource.first);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(BusCardDetailFragment busCardDetailFragment, Resource resource) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i2 == 1) {
            LoadingDialogHelper loadingDialogHelper = busCardDetailFragment.loadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.showLoading();
            return;
        }
        if (i2 != 3) {
            LoadingDialogHelper loadingDialogHelper2 = busCardDetailFragment.loadingDialogHelper;
            if (loadingDialogHelper2 == null) {
                return;
            }
            loadingDialogHelper2.hideLoading();
            return;
        }
        LoadingDialogHelper loadingDialogHelper3 = busCardDetailFragment.loadingDialogHelper;
        if (loadingDialogHelper3 != null) {
            loadingDialogHelper3.hideLoading();
        }
        String str = resource.code;
        if (!(str != null && StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "53", false, 2, (Object) null))) {
            String str2 = resource.code;
            if (!(str2 != null && StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "66", false, 2, (Object) null))) {
                CustomToast.makeText(busCardDetailFragment.requireContext(), com.huami.wallet.ui.R.string.earbud_music_oper_fail, 0).show();
                return;
            }
        }
        busCardDetailFragment.Y0(busCardDetailFragment.getString(com.huami.wallet.ui.R.string.wl_set_scheduled_switch_notification_msg_1));
    }

    private final void d1(Resource<BusCardDetailAndBalance> r2) {
        BusCardDetail busCardDetail;
        if ((r2.status != Status.SUCCESS || r2.data == null) && !Intrinsics.areEqual(r2.code, ErrorCode.CARD_EXPIRED)) {
            return;
        }
        View view = this.root;
        Objects.requireNonNull(view);
        ((LinearLayout) view.findViewById(com.huami.wallet.ui.R.id.card_detail)).setVisibility(0);
        if (r2.data.balance != null) {
            this.mBalance = r2.data.balance.balance;
            View view2 = this.root;
            Objects.requireNonNull(view2);
            ((TextView) view2.findViewById(com.huami.wallet.ui.R.id.balance)).setText(MoneyUtils.formatCentRMB(this.mBalance));
            View view3 = this.root;
            Objects.requireNonNull(view3);
            TextView textView = (TextView) view3.findViewById(com.huami.wallet.ui.R.id.card_number);
            BusCardDetailAndBalance busCardDetailAndBalance = r2.data;
            textView.setText((busCardDetailAndBalance == null || (busCardDetail = busCardDetailAndBalance.detail) == null) ? null : busCardDetail.number);
            boolean z2 = this.mBalance < 1000;
            View view4 = this.root;
            Objects.requireNonNull(view4);
            ((TextView) view4.findViewById(com.huami.wallet.ui.R.id.low_balance_tip)).setVisibility(z2 ? 0 : 8);
        }
        View view5 = this.root;
        Objects.requireNonNull(view5);
        ImageView imageView = (ImageView) view5.findViewById(com.huami.wallet.ui.R.id.card_image_detail);
        String str = this.imgUrl;
        Context context = getContext();
        ImageLoadUtils.loadImageInRoundRect(imageView, str, (context != null ? context.getResources() : null).getDimensionPixelOffset(com.huami.wallet.ui.R.dimen.wl_image_round_rect_radius));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(BusCardDetailFragment busCardDetailFragment, Resource resource) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i2 == 1) {
            LoadingDialogHelper loadingDialogHelper = busCardDetailFragment.loadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.showLoading();
            return;
        }
        if (i2 == 2) {
            LoadingDialogHelper loadingDialogHelper2 = busCardDetailFragment.loadingDialogHelper;
            if (loadingDialogHelper2 == null) {
                return;
            }
            loadingDialogHelper2.hideLoading();
            return;
        }
        if (i2 != 3) {
            return;
        }
        LoadingDialogHelper loadingDialogHelper3 = busCardDetailFragment.loadingDialogHelper;
        if (loadingDialogHelper3 != null) {
            loadingDialogHelper3.hideLoading();
        }
        CustomToast.makeText(busCardDetailFragment.requireContext(), com.huami.wallet.ui.R.string.earbud_music_oper_fail, 0).show();
    }

    private final void e1(Resource<String> r2) {
        boolean zBooleanValue;
        if (r2.status != Status.LOADING) {
            getViewModel().validateCardDate();
        }
        if (r2.status != Status.SUCCESS) {
            return;
        }
        getViewModel().loadBusBannerData(this.cardId);
        String str = r2.data;
        if (str != null) {
            String str2 = str;
            zBooleanValue = (str2 == null ? null : Boolean.valueOf(str2.equals(this.cardId))).booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            View view = this.root;
            Objects.requireNonNull(view);
            ((TextView) view.findViewById(com.huami.wallet.ui.R.id.card_state)).setText(getString(com.huami.wallet.ui.R.string.wl_default_card_use));
        }
        View view2 = this.root;
        Objects.requireNonNull(view2);
        ((TextView) view2.findViewById(com.huami.wallet.ui.R.id.card_state)).setVisibility(zBooleanValue ? 0 : 8);
        View view3 = this.root;
        Objects.requireNonNull(view3);
        ((TextView) view3.findViewById(com.huami.wallet.ui.R.id.set_as_default_card_button)).setVisibility(!zBooleanValue ? 0 : 8);
        View view4 = this.root;
        Objects.requireNonNull(view4);
        view4.findViewById(com.huami.wallet.ui.R.id.set_as_default_card_button_divider).setVisibility(zBooleanValue ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(BusCardDetailFragment busCardDetailFragment, Boolean bool) {
        if (bool.booleanValue()) {
            View view = busCardDetailFragment.root;
            Objects.requireNonNull(view);
            ((ConstraintLayout) view.findViewById(com.huami.wallet.ui.R.id.cl_scheduled_switch)).setVisibility(0);
            String str = busCardDetailFragment.cardId;
            if (str == null) {
                return;
            }
            busCardDetailFragment.getViewModel().queryScheduleTimes(str);
        }
    }

    private final void g0() {
        View view = this.root;
        Objects.requireNonNull(view);
        KTViewExtensionKt.singleClick((AppCompatButton) view.findViewById(com.huami.wallet.ui.R.id.bt_scheduled_switch_card_add), new f());
        CardScheduleTimeAdapter cardScheduleTimeAdapter = new CardScheduleTimeAdapter();
        cardScheduleTimeAdapter.setItemViewDeleteClickListener(new g());
        View view2 = this.root;
        Objects.requireNonNull(view2);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(com.huami.wallet.ui.R.id.rv_scheduled_switch_times);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext());
        flexboxLayoutManager.setFlexDirection(0);
        flexboxLayoutManager.setJustifyContent(0);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setAdapter(cardScheduleTimeAdapter);
    }

    private final void h0() {
        Boolean bool;
        View view = this.root;
        Objects.requireNonNull(view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(com.huami.wallet.ui.R.id.wl_shift_group_ll);
        if (linearLayout == null || (bool = this.shiftEnable) == null) {
            return;
        }
        bool.booleanValue();
        int i2 = 0;
        if (this.shiftEnable.booleanValue()) {
            KTViewExtensionKt.singleClick(linearLayout, new h());
            View view2 = this.root;
            Objects.requireNonNull(view2);
            view2.findViewById(com.huami.wallet.ui.R.id.wl_shift_group_divider).setVisibility(0);
        } else {
            View view3 = this.root;
            Objects.requireNonNull(view3);
            view3.findViewById(com.huami.wallet.ui.R.id.wl_shift_group_divider).setVisibility(8);
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i0(BusCardDetailFragment busCardDetailFragment, View view) {
        busCardDetailFragment.M();
        return false;
    }

    private final void initView() {
        v0();
        W();
        this.loadingDialogHelper = LoadingDialogHelper.newInstance(getActivity());
        View view = this.root;
        Objects.requireNonNull(view);
        ((TextView) view.findViewById(com.huami.wallet.ui.R.id.set_as_default_card_button)).setOnClickListener(this.onClickListener);
        View view2 = this.root;
        Objects.requireNonNull(view2);
        ((Button) view2.findViewById(com.huami.wallet.ui.R.id.recharge_button)).setOnClickListener(this.onClickListener);
        View view3 = this.root;
        Objects.requireNonNull(view3);
        ((TextView) view3.findViewById(com.huami.wallet.ui.R.id.trade_record)).setOnClickListener(this.onClickListener);
        View view4 = this.root;
        Objects.requireNonNull(view4);
        ((TextView) view4.findViewById(com.huami.wallet.ui.R.id.faq)).setOnClickListener(this.onClickListener);
        View view5 = this.root;
        Objects.requireNonNull(view5);
        ((BGABanner) view5.findViewById(com.huami.wallet.ui.R.id.view_pager_banner)).setVisibility(8);
        String str = this.serviceContact;
        if (str != null) {
            View view6 = this.root;
            Objects.requireNonNull(view6);
            ((LinearLayout) view6.findViewById(com.huami.wallet.ui.R.id.wl_serviceContactLL)).setVisibility(0);
            View view7 = this.root;
            Objects.requireNonNull(view7);
            int i2 = com.huami.wallet.ui.R.id.wl_serviceContactValue;
            ((TextView) view7.findViewById(i2)).setText(str);
            View view8 = this.root;
            Objects.requireNonNull(view8);
            KTViewExtensionKt.singleClick((TextView) view8.findViewById(i2), new i(str));
            if (this.appName != null) {
                View view9 = this.root;
                Objects.requireNonNull(view9);
                ((TextView) view9.findViewById(com.huami.wallet.ui.R.id.wl_serviceContactTitle)).setText(getString(com.huami.wallet.ui.R.string.wl_city_tel_desc, this.appName));
            }
        }
        if (this.packageName != null) {
            if (this.appName != null) {
                View view10 = this.root;
                Objects.requireNonNull(view10);
                ((TextView) view10.findViewById(com.huami.wallet.ui.R.id.gotoCityApp)).setText(getString(com.huami.wallet.ui.R.string.wl_city_app, String.valueOf(this.appName)));
            }
            View view11 = this.root;
            Objects.requireNonNull(view11);
            int i3 = com.huami.wallet.ui.R.id.gotoCityApp;
            ((TextView) view11.findViewById(i3)).setVisibility(0);
            View view12 = this.root;
            Objects.requireNonNull(view12);
            KTViewExtensionKt.singleClick((TextView) view12.findViewById(i3), new j());
        }
        if (WalletUI.getInstance().canDeleteCard()) {
            View view13 = this.root;
            Objects.requireNonNull(view13);
            ((ImageView) view13.findViewById(com.huami.wallet.ui.R.id.card_image_detail)).setOnLongClickListener(new View.OnLongClickListener() { // from class: u90
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view14) {
                    return BusCardDetailFragment.i0(this.a, view14);
                }
            });
            View view14 = this.root;
            Objects.requireNonNull(view14);
            int i4 = com.huami.wallet.ui.R.id.delete_bus_card_button;
            ((TextView) view14.findViewById(i4)).setVisibility(0);
            View view15 = this.root;
            Objects.requireNonNull(view15);
            view15.findViewById(com.huami.wallet.ui.R.id.delete_bus_card_button_divider).setVisibility(0);
            View view16 = this.root;
            Objects.requireNonNull(view16);
            KTViewExtensionKt.singleClick((TextView) view16.findViewById(i4), new k());
        }
        if (getViewModel().isMiDevice()) {
            getViewModel().loadXiaoNotice();
        }
        View view17 = this.root;
        Objects.requireNonNull(view17);
        int i5 = com.huami.wallet.ui.R.id.wl_noticebar_view;
        ((NoticeBarView) view17.findViewById(i5)).setAppCode(this.cardId);
        List<? extends NoticeActionType> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(NoticeActionType.TOPUP, NoticeActionType.SHIFT_OUT);
        View view18 = this.root;
        Objects.requireNonNull(view18);
        ((NoticeBarView) view18.findViewById(i5)).setTypeList(listMutableListOf).setNoticeRepo(P()).setOnReadMore(new l());
        View view19 = this.root;
        Objects.requireNonNull(view19);
        ImageView imageView = (ImageView) view19.findViewById(com.huami.wallet.ui.R.id.card_image_detail);
        String str2 = this.imgUrl;
        Context context = getContext();
        ImageLoadUtils.loadImageInRoundRect(imageView, str2, (context == null ? null : context.getResources()).getDimensionPixelOffset(com.huami.wallet.ui.R.dimen.wl_image_round_rect_radius));
        h0();
        g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void j0(BusCardDetailFragment busCardDetailFragment, Resource resource) {
        if (!resource.isSuccessful() || resource.data == 0) {
            return;
        }
        XiaomiBulletinHelper.showXiaomiBulletin(busCardDetailFragment.requireContext(), busCardDetailFragment.getChildFragmentManager(), (XiaomiBulletin) resource.data, busCardDetailFragment.new m(), busCardDetailFragment.new n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(BusCardDetailFragment busCardDetailFragment, Resource resource) {
        LoadingDialogHelper loadingDialogHelper = busCardDetailFragment.loadingDialogHelper;
        if (loadingDialogHelper == null) {
            return;
        }
        Status status = resource == null ? null : resource.status;
        StringBuilder sb = new StringBuilder();
        sb.append("删除公交卡失败, code:");
        sb.append((Object) (resource == null ? null : resource.code));
        sb.append(" , msg:");
        sb.append((Object) (resource != null ? resource.message : null));
        loadingDialogHelper.showByStatus(status, "正在删除公交卡", "已成功删除公交卡", sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(BusCardDetailFragment busCardDetailFragment, Resource resource) {
        busCardDetailFragment.e1(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(BusCardDetailFragment busCardDetailFragment, Resource resource) {
        busCardDetailFragment.G0(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(BusCardDetailFragment busCardDetailFragment, Resource resource) {
        if ((resource == null ? null : resource.status) != Status.SUCCESS || resource.data == 0) {
            return;
        }
        View view = busCardDetailFragment.root;
        Objects.requireNonNull(view);
        KTExtFunKt.shouldShowXiaomiNoticeCrossBar((MyTextView) view.findViewById(com.huami.wallet.ui.R.id.wl_tv_detail_xiaomi_notice), (List) resource.data, busCardDetailFragment.getXiaomiCardName(), "RECHARGE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(BusCardDetailFragment busCardDetailFragment, Pair pair) {
        busCardDetailFragment.c1(pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(BusCardDetailFragment busCardDetailFragment, Pair pair) {
        busCardDetailFragment.D0(pair);
    }

    private final void q0() {
        Boolean bool = this.xmReturnCardFlg;
        if (bool != null) {
            if (!bool.booleanValue()) {
                bool = null;
            }
            if (bool != null) {
                bool.booleanValue();
                View view = this.root;
                Objects.requireNonNull(view);
                int i2 = com.huami.wallet.ui.R.id.ll_xiaomi_return_card;
                ((LinearLayout) view.findViewById(i2)).setVisibility(0);
                View view2 = this.root;
                Objects.requireNonNull(view2);
                view2.findViewById(com.huami.wallet.ui.R.id.ll_xiaomi_return_card_divider).setVisibility(0);
                View view3 = this.root;
                Objects.requireNonNull(view3);
                ((LinearLayout) view3.findViewById(i2)).setOnClickListener(new View.OnClickListener() { // from class: s90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        BusCardDetailFragment.r0(this.a, view4);
                    }
                });
            }
        }
        Boolean bool2 = this.xmReturnFeeFlg;
        if (bool2 != null) {
            Boolean bool3 = bool2.booleanValue() ? bool2 : null;
            if (bool3 != null) {
                bool3.booleanValue();
                View view4 = this.root;
                Objects.requireNonNull(view4);
                int i3 = com.huami.wallet.ui.R.id.ll_xiaomi_refund;
                ((LinearLayout) view4.findViewById(i3)).setVisibility(0);
                View view5 = this.root;
                Objects.requireNonNull(view5);
                view5.findViewById(com.huami.wallet.ui.R.id.ll_xiaomi_refund_divider).setVisibility(0);
                View view6 = this.root;
                Objects.requireNonNull(view6);
                ((LinearLayout) view6.findViewById(i3)).setOnClickListener(new View.OnClickListener() { // from class: r90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view7) {
                        BusCardDetailFragment.s0(this.a, view7);
                    }
                });
            }
        }
        Q().getXiaomiReturnCardLiveData().observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("退卡"));
        Q().getXiaomiReturnCardLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: aa0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardDetailFragment.t0(this.a, (Resource) obj);
            }
        });
        Q().getXiaomiApplyRefundLiveData().observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("退费"));
        Q().getXiaomiApplyRefundLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: x90
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardDetailFragment.u0(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(BusCardDetailFragment busCardDetailFragment, View view) {
        busCardDetailFragment.P0(busCardDetailFragment.new u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(BusCardDetailFragment busCardDetailFragment, View view) {
        busCardDetailFragment.Q().applyRefund(busCardDetailFragment.cardId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void t0(BusCardDetailFragment busCardDetailFragment, Resource resource) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i2 == 1) {
            LoadingDialogHelper loadingDialogHelper = busCardDetailFragment.loadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.showLoading(busCardDetailFragment.requireContext().getResources().getString(com.huami.wallet.ui.R.string.wl_deleting_tip));
            return;
        }
        if (i2 == 2) {
            LoadingDialogHelper loadingDialogHelper2 = busCardDetailFragment.loadingDialogHelper;
            if (loadingDialogHelper2 != null) {
                loadingDialogHelper2.hideLoading();
            }
            busCardDetailFragment.O().navigateToRefundResult(busCardDetailFragment.requireContext(), 2, busCardDetailFragment.getCardName(), "", null);
            busCardDetailFragment.O().finishCurrentPage(busCardDetailFragment.requireContext());
            return;
        }
        if (i2 != 3) {
            return;
        }
        LoadingDialogHelper loadingDialogHelper3 = busCardDetailFragment.loadingDialogHelper;
        if (loadingDialogHelper3 != null) {
            loadingDialogHelper3.hideLoading();
        }
        CustomToast.makeText(busCardDetailFragment.requireContext(), com.huami.wallet.ui.R.string.wl_revert_card_fail, 0).show();
        NavigationController navigationControllerO = busCardDetailFragment.O();
        Context contextRequireContext = busCardDetailFragment.requireContext();
        String cardName = busCardDetailFragment.getCardName();
        String str = (String) resource.data;
        if (str == null) {
            str = "";
        }
        navigationControllerO.navigateToRefundResult(contextRequireContext, 3, cardName, str, resource.message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(BusCardDetailFragment busCardDetailFragment, Resource resource) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i2 == 1) {
            LoadingDialogHelper loadingDialogHelper = busCardDetailFragment.loadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.showLoading(busCardDetailFragment.requireContext().getResources().getString(com.huami.wallet.ui.R.string.wl_apply_tip));
            return;
        }
        if (i2 == 2) {
            LoadingDialogHelper loadingDialogHelper2 = busCardDetailFragment.loadingDialogHelper;
            if (loadingDialogHelper2 != null) {
                loadingDialogHelper2.hideLoading();
            }
            busCardDetailFragment.O().navigateToRefundResult(busCardDetailFragment.requireContext(), 0, busCardDetailFragment.getCardName(), "", null);
            return;
        }
        if (i2 != 3) {
            return;
        }
        LoadingDialogHelper loadingDialogHelper3 = busCardDetailFragment.loadingDialogHelper;
        if (loadingDialogHelper3 != null) {
            loadingDialogHelper3.hideLoading();
        }
        busCardDetailFragment.O().navigateToRefundResult(busCardDetailFragment.requireContext(), 1, busCardDetailFragment.getCardName(), "", resource.message);
    }

    private final void v0() {
        if (!kotlin.text.m.equals$default(this.cardId, ConstantKt.APP_CODE_SHEN_ZHEN_MOT, false, 2, null) || getViewModel().isMiDevice()) {
            View view = this.root;
            Objects.requireNonNull(view);
            BusExtensionKt.setGone((LinearLayout) view.findViewById(com.huami.wallet.ui.R.id.ll_apply_refund));
            View view2 = this.root;
            Objects.requireNonNull(view2);
            BusExtensionKt.setGone((LinearLayout) view2.findViewById(com.huami.wallet.ui.R.id.ll_revert_card));
            View view3 = this.root;
            Objects.requireNonNull(view3);
            BusExtensionKt.setGone(view3.findViewById(com.huami.wallet.ui.R.id.ll_revert_card_divider));
            View view4 = this.root;
            Objects.requireNonNull(view4);
            BusExtensionKt.setGone(view4.findViewById(com.huami.wallet.ui.R.id.ll_apply_refund_divider));
        } else {
            View view5 = this.root;
            Objects.requireNonNull(view5);
            int i2 = com.huami.wallet.ui.R.id.ll_apply_refund;
            BusExtensionKt.setVisible((LinearLayout) view5.findViewById(i2));
            View view6 = this.root;
            Objects.requireNonNull(view6);
            BusExtensionKt.setVisible((LinearLayout) view6.findViewById(com.huami.wallet.ui.R.id.ll_revert_card));
            View view7 = this.root;
            Objects.requireNonNull(view7);
            BusExtensionKt.setVisible(view7.findViewById(com.huami.wallet.ui.R.id.ll_revert_card_divider));
            View view8 = this.root;
            Objects.requireNonNull(view8);
            BusExtensionKt.setVisible(view8.findViewById(com.huami.wallet.ui.R.id.ll_apply_refund_divider));
            CitySimpleInfoCache citySimpleInfoCache = CitySimpleInfoCache.INSTANCE;
            String str = this.cardId;
            if (str == null) {
                str = "";
            }
            CitySimpleInfo cityInfo = citySimpleInfoCache.getCityInfo(str);
            if (cityInfo == null ? false : Intrinsics.areEqual(cityInfo.getOpenFeeRefundApplyFlg(), Boolean.TRUE)) {
                View view9 = this.root;
                Objects.requireNonNull(view9);
                ((TextView) view9.findViewById(com.huami.wallet.ui.R.id.apply_for_refund_tip)).setText(com.huami.wallet.ui.R.string.wl_return_open_card_money_success);
                View view10 = this.root;
                Objects.requireNonNull(view10);
                ((TextView) view10.findViewById(com.huami.wallet.ui.R.id.apply_for_refund_title)).setTextColor(requireContext().getResources().getColor(com.huami.wallet.ui.R.color.s1));
                View view11 = this.root;
                Objects.requireNonNull(view11);
                ((LinearLayout) view11.findViewById(i2)).setEnabled(false);
            } else {
                View view12 = this.root;
                Objects.requireNonNull(view12);
                ((TextView) view12.findViewById(com.huami.wallet.ui.R.id.apply_for_refund_tip)).setText(com.huami.wallet.ui.R.string.wl_return_open_card_money_tip);
                View view13 = this.root;
                Objects.requireNonNull(view13);
                ((TextView) view13.findViewById(com.huami.wallet.ui.R.id.apply_for_refund_title)).setTextColor(requireContext().getResources().getColor(com.huami.wallet.ui.R.color.s1));
                View view14 = this.root;
                Objects.requireNonNull(view14);
                ((LinearLayout) view14.findViewById(i2)).setEnabled(true);
            }
        }
        View view15 = this.root;
        Objects.requireNonNull(view15);
        ((LinearLayout) view15.findViewById(com.huami.wallet.ui.R.id.ll_revert_card)).setOnClickListener(new View.OnClickListener() { // from class: ua0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view16) {
                BusCardDetailFragment.w0(this.a, view16);
            }
        });
        View view16 = this.root;
        Objects.requireNonNull(view16);
        ((LinearLayout) view16.findViewById(com.huami.wallet.ui.R.id.ll_apply_refund)).setOnClickListener(new View.OnClickListener() { // from class: va0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view17) {
                BusCardDetailFragment.x0(this.a, view17);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(BusCardDetailFragment busCardDetailFragment, View view) {
        busCardDetailFragment.P0(busCardDetailFragment.new v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(BusCardDetailFragment busCardDetailFragment, View view) {
        BusOpenFeeStateEntity busOpenFeeStateEntity;
        Resource<BusOpenFeeStateEntity> value = busCardDetailFragment.getViewModel().getOpenFeeStateLiveData().getValue();
        boolean z2 = false;
        if (value != null && (busOpenFeeStateEntity = value.data) != null && busOpenFeeStateEntity.getStatus() == 3) {
            z2 = true;
        }
        if (z2) {
            busCardDetailFragment.L0();
            return;
        }
        BusCardDetailViewModel viewModel = busCardDetailFragment.getViewModel();
        String str = busCardDetailFragment.cardId;
        if (str == null) {
            str = "";
        }
        View view2 = busCardDetailFragment.root;
        Objects.requireNonNull(view2);
        viewModel.applyRefundOpenFee(str, ((TextView) view2.findViewById(com.huami.wallet.ui.R.id.card_number)).getText().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean y0(Pair<Integer, Resource<Protocol>> resource) {
        Resource resource2 = (Resource) resource.second;
        Protocol protocol = (Protocol) resource2.data;
        return (resource2.status != Status.SUCCESS || protocol == null || protocol.getTitle() == null || protocol.getContent() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0() {
        O().navigateToRechargeBusCard(getContext(), this.cardId, this.cardName, this.xiaomiCardName, this.cardNumber);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final String getCardName() {
        return this.cardName;
    }

    public final int getMBalance() {
        return this.mBalance;
    }

    @NotNull
    public final BusCardDetailViewModel getViewModel() {
        return (BusCardDetailViewModel) this.viewModel.getValue();
    }

    @Nullable
    public final String getXiaomiCardName() {
        return this.xiaomiCardName;
    }

    public final void initViewModel() {
        if (getViewModel().isMiDevice()) {
            N().getXiaomiBulletinLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ja0
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    BusCardDetailFragment.j0(this.a, (Resource) obj);
                }
            });
        }
        getViewModel().getVerifiedPhoneLiveData().observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("加载已开通的公交卡列表"));
        LiveDataExtensionKt.observeWithNotNull(getViewModel().getVerifiedPhoneLiveData(), this, new p());
        getViewModel().getCardDetailAndBalanceLiveData().observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("加载已开通的公交卡列表"));
        LiveDataExtensionKt.observeWithNotNull(getViewModel().getCardDetailAndBalanceLiveData(), this, new q());
        LiveDataExtensionKt.observeWithNotNull(getViewModel().getValidateCardDateLiveData(), this, new r());
        LiveDataExtensionKt.observeWithNotNull(getViewModel().getLoadingDialogStatusLiveData(), this, new s());
        LiveDataExtensionKt.observeWithNotNull(getViewModel().getErrorMsgLiveData(), this, new t());
        getViewModel().getDeleteCardLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: fa0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardDetailFragment.k0(this.a, (Resource) obj);
            }
        });
        getViewModel().getDefaultBusCardIdLiveData().observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("加载默认卡"));
        getViewModel().getDefaultBusCardIdLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ha0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardDetailFragment.l0(this.a, (Resource) obj);
            }
        });
        getViewModel().getChangeDefaultCardResultLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ka0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardDetailFragment.m0(this.a, (Resource) obj);
            }
        });
        getViewModel().getXiaomiNoticesLiveData().observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("加载小米公告"));
        getViewModel().getXiaomiNoticesLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ga0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardDetailFragment.n0(this.a, (Resource) obj);
            }
        });
        getViewModel().isNeedShowProtocol().observe(getViewLifecycleOwner(), new Observer() { // from class: v90
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardDetailFragment.o0(this.a, (Pair) obj);
            }
        });
        getViewModel().getAgreeProtocolLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: w90
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardDetailFragment.p0(this.a, (Pair) obj);
            }
        });
        LiveDataExtensionKt.observeResourceWithNotNull(getViewModel().getBusBannerDataLiveData(), this, new o());
        X();
        b0();
    }

    public final void navigateToBusCardList() {
        AnalyticsHelper.INSTANCE.recordBusDetailOutEvent(BusDetailOutType.BUS_DETAIL_OUT_ADD, getViewModel().getWalletDataSource().getDeviceModel());
        O().navigateToBusCardList(getContext(), null);
    }

    @Override // com.huami.wallet.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        parseArguments(getArguments(), Boolean.FALSE);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.root = inflater.inflate(com.huami.wallet.ui.R.layout.wl_fragment_bus_card_detail, container, false);
        initView();
        P().preLoad();
        View view = this.root;
        Objects.requireNonNull(view);
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        P().dispose();
        View view = this.root;
        Objects.requireNonNull(view);
        ((NoticeBarView) view.findViewById(com.huami.wallet.ui.R.id.wl_noticebar_view)).destroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (K()) {
            getViewModel().loadCardDetailAndBalance(this.cardId);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewModel();
        J();
        String str = this.xiaomiCardName;
        if (str != null) {
            if (!getViewModel().isMiDevice()) {
                return;
            }
            String str2 = this.cardId;
            if (str2 != null) {
                N().getXiaomiBulletins(XiaomiBulletinType.CardDetail, str, str2);
            }
        }
        if (this.cardId != null && getViewModel().isMiSzt(this.cardId)) {
            V();
        }
    }

    public final void parseArguments(@Nullable Bundle arguments, @Nullable Boolean refreshImg) {
        if (arguments == null) {
            return;
        }
        this.cardId = arguments.getString("EXTRA_EXPAND_CARD_ID");
        this.cardName = arguments.getString(BusCardDetailActivity.EXTRA_EXPAND_CARD_NAME);
        this.xiaomiCardName = arguments.getString(BusCardDetailActivity.EXTRA_EXPAND_XIAOMI_CARD_NAME);
        this.imgUrl = arguments.getString("EXTRA_EXPAND_CARD_IMG_URL");
        this.shiftEnable = Boolean.valueOf(arguments.getBoolean(BusCardDetailActivity.EXTRA_EXPAND_CARD_SHIFTENABLE));
        this.packageName = arguments.getString("EXTRA_PACKAGENAME");
        this.appName = arguments.getString("EXTRA_APPNAME");
        this.redirectTo = arguments.getString("EXTRA_REDIRECTTO");
        this.serviceContact = arguments.getString("EXTRA_SERVICECONTACT");
        CitySimpleInfoCache citySimpleInfoCache = CitySimpleInfoCache.INSTANCE;
        String str = this.cardId;
        if (str == null) {
            str = "";
        }
        CitySimpleInfo cityInfo = citySimpleInfoCache.getCityInfo(str);
        this.refundEnable = cityInfo == null ? null : cityInfo.getRefundEnable();
        if (refreshImg.booleanValue()) {
            View view = this.root;
            Objects.requireNonNull(view);
            ImageView imageView = (ImageView) view.findViewById(com.huami.wallet.ui.R.id.card_image_detail);
            String str2 = this.imgUrl;
            Context context = getContext();
            ImageLoadUtils.loadImageInRoundRect(imageView, str2, (context != null ? context.getResources() : null).getDimensionPixelOffset(com.huami.wallet.ui.R.dimen.wl_image_round_rect_radius));
        }
    }

    public final void setCardName(@Nullable String str) {
        this.cardName = str;
    }

    public final void setMBalance(int i2) {
        this.mBalance = i2;
    }

    public final void setXiaomiCardName(@Nullable String str) {
        this.xiaomiCardName = str;
    }
}

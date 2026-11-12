package com.huami.wallet.ui.fragment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.applet.ConstantKt;
import com.huami.nfc.bus.entities.XiaomiBulletin;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.common.config.LocationConfig;
import com.huami.wallet.common.config.LocationInfo;
import com.huami.wallet.lib.entity.BusCardListItem;
import com.huami.wallet.lib.entity.Notice;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.entity.XiaomiBulletinType;
import com.huami.wallet.lib.entity.XiaomiNotice;
import com.huami.wallet.lib.util.ErrorCode;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.activity.BusCardListActivity;
import com.huami.wallet.ui.activity.RefundResultActivity;
import com.huami.wallet.ui.adapter.BusCardListSectionAdapter;
import com.huami.wallet.ui.decoration.SectionDividerDecoration;
import com.huami.wallet.ui.entity.BusCardItemSection;
import com.huami.wallet.ui.fragment.BusCardListFragment;
import com.huami.wallet.ui.helper.BenchmarkResourceObserver;
import com.huami.wallet.ui.helper.EmptyViewHelper;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.wallet.ui.helper.XiaomiBulletinHelper;
import com.huami.wallet.ui.navigation.Args;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.repository.NoticeRepo;
import com.huami.wallet.ui.utils.KtUtilsKt;
import com.huami.wallet.ui.utils.NoticeActionType;
import com.huami.wallet.ui.utils.NoticeViewUtils;
import com.huami.wallet.ui.viewmodel.BusCardListViewModel;
import com.huami.wallet.ui.viewmodel.XiaomiBulletinViewModel;
import com.huami.wallet.ui.viewmodel.XiaomiSztRefundViewModel;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import defpackage.cd0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
import org.cybergarage.soap.SOAP;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\b¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002J&\u0010\u0016\u001a\u00020\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\f\u0010\u0018\u001a\u00020\u0010*\u00020\nH\u0002J\u0018\u0010\u001a\u001a\u00020\u00022\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\rH\u0002J\b\u0010\u001b\u001a\u00020\u0002H\u0002J\b\u0010\u001c\u001a\u00020\u0002H\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0002J\b\u0010\u001e\u001a\u00020\u0002H\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0002J\u0012\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\"\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\nH\u0002J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016J&\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J\u001a\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J\b\u00103\u001a\u00020\u0002H\u0016J\b\u00104\u001a\u00020\u0002H\u0016R\u001d\u0010:\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010?\u001a\u00020;8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R\u001d\u0010D\u001a\u00020@8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010CR\u001d\u0010I\u001a\u00020E8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00107\u001a\u0004\bG\u0010HR\u001d\u0010N\u001a\u00020J8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u00107\u001a\u0004\bL\u0010MR\u001d\u0010S\u001a\u00020O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u00107\u001a\u0004\bQ\u0010RR\u0016\u0010W\u001a\u00020T8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Z\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010e\u001a\u00020c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010dR\u0016\u0010h\u001a\u00020f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010gR\u001c\u0010l\u001a\b\u0012\u0004\u0012\u00020j0i8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010kR\u001c\u0010m\u001a\b\u0012\u0004\u0012\u00020j0i8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010kR\u001c\u0010n\u001a\b\u0012\u0004\u0012\u00020j0i8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010kR\u001c\u0010o\u001a\b\u0012\u0004\u0012\u00020j0i8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010kR\u001c\u0010p\u001a\b\u0012\u0004\u0012\u00020j0i8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010kR\u001c\u0010q\u001a\b\u0012\u0004\u0012\u00020j0i8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010kR\u0016\u0010s\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010rR\u0016\u0010u\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010tR\u0016\u0010v\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010z\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010tR\u0018\u0010|\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010tR\u0016\u0010~\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b}\u0010Y¨\u0006\u0081\u0001"}, d2 = {"Lcom/huami/wallet/ui/fragment/BusCardListFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "", "initViewModel", LogUtil.D, "G", "Lcom/huami/wallet/lib/entity/Resource;", "", "resource", "Q", "Lcom/huami/wallet/lib/entity/BusCardListItem;", "busCard", "u", "", "Lcom/huami/wallet/lib/entity/XiaomiNotice;", "xiaomiNotices", "", "m", "Lcom/huami/wallet/ui/utils/NoticeActionType;", "type", "Lkotlin/Function0;", "onNext", "l", "v", "B", "busCardListItems", "L", "O", "P", "M", "K", "C", "item", LogUtil.I, GoogleApiAvailabilityLight.b, "", "J", "(Lcom/huami/wallet/lib/entity/BusCardListItem;)Ljava/lang/Integer;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "onDestroy", "Lcom/huami/wallet/ui/viewmodel/XiaomiSztRefundViewModel;", "b", "Lkotlin/Lazy;", "t", "()Lcom/huami/wallet/ui/viewmodel/XiaomiSztRefundViewModel;", "xiaomiSztRefundViewModel", "Lcom/huami/wallet/ui/navigation/NavigationController;", "c", DTransferConstants.SEARCH_KEY, "()Lcom/huami/wallet/ui/navigation/NavigationController;", "navigationController", "Lcom/huami/wallet/ui/repository/NoticeRepo;", GoogleApiAvailabilityLight.a, "r", "()Lcom/huami/wallet/ui/repository/NoticeRepo;", "noticeRepo", "Lcom/huami/wallet/common/config/LocationConfig;", "e", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/wallet/common/config/LocationConfig;", "locationConfig", "Lcom/huami/wallet/ui/viewmodel/BusCardListViewModel;", "f", SOAP.XMLNS, "()Lcom/huami/wallet/ui/viewmodel/BusCardListViewModel;", "viewModel", "Lcom/huami/wallet/ui/viewmodel/XiaomiBulletinViewModel;", "g", "o", "()Lcom/huami/wallet/ui/viewmodel/XiaomiBulletinViewModel;", "bulletinViewModel", "Landroidx/recyclerview/widget/RecyclerView;", "h", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "i", "Landroid/view/View;", "headerView", "Lcom/huami/wallet/ui/adapter/BusCardListSectionAdapter;", z.j, "Lcom/huami/wallet/ui/adapter/BusCardListSectionAdapter;", "adapter", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", hl.k, "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingDialogHelper", "Lcom/huami/wallet/ui/helper/EmptyViewHelper;", "Lcom/huami/wallet/ui/helper/EmptyViewHelper;", "emptyViewHelper", "Lcom/huami/wallet/ui/decoration/SectionDividerDecoration;", "Lcom/huami/wallet/ui/decoration/SectionDividerDecoration;", "sectionDividerDecoration", "Ljava/util/ArrayList;", "Lcom/huami/wallet/ui/entity/BusCardItemSection;", "Ljava/util/ArrayList;", "allCardList", "shiftedCardList", "shiftedFailureCardList", "mocCardList", "motCardList", "recommendCardList", "Z", "isShiftIn", "Ljava/lang/String;", "shiftInOrderId", "cardName", "w", "Lcom/huami/wallet/lib/entity/BusCardListItem;", "x", "cacheAppCode", "y", "parentAppCode", "z", RootDescription.ROOT_ELEMENT, "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BusCardListFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy xiaomiSztRefundViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy noticeRepo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy locationConfig;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy bulletinViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private RecyclerView recyclerView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private View headerView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private BusCardListSectionAdapter adapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper loadingDialogHelper;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private EmptyViewHelper emptyViewHelper;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private SectionDividerDecoration sectionDividerDecoration;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<BusCardItemSection> allCardList;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<BusCardItemSection> shiftedCardList;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<BusCardItemSection> shiftedFailureCardList;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<BusCardItemSection> mocCardList;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<BusCardItemSection> motCardList;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<BusCardItemSection> recommendCardList;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean isShiftIn;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private String shiftInOrderId;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private String cardName;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    private BusCardListItem busCard;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private String cacheAppCode;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private String parentAppCode;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private View root;

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "pass", "Lcom/huami/wallet/lib/entity/Notice;", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<Boolean, Notice, Object> {
        public final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0) {
            super(2);
            this.a = function0;
        }

        @Nullable
        public final Object a(boolean z, @Nullable Notice notice) {
            if (!z) {
                return null;
            }
            this.a.getA();
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Notice notice) {
            return a(bool.booleanValue(), notice);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<String, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            BusCardListFragment.this.q().navigateToWeb(str, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/bus/entities/XiaomiBulletin;", "keepIt", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<XiaomiBulletin, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull XiaomiBulletin xiaomiBulletin) {
            BusCardListFragment.this.o().keep(BusCardListFragment.this.requireContext(), xiaomiBulletin);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(XiaomiBulletin xiaomiBulletin) {
            a(xiaomiBulletin);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ BusCardListItem b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BusCardListItem busCardListItem) {
            super(0);
            this.b = busCardListItem;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BusCardListFragment.this.s().goToNextPage(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public final /* synthetic */ BusCardListItem b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BusCardListItem busCardListItem) {
            super(0);
            this.b = busCardListItem;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BusCardListFragment.this.isShiftIn = true;
            BusCardListFragment.this.shiftInOrderId = this.b.orderId;
            BusCardListFragment.this.s().goToNextPage(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ BusCardListItem b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BusCardListItem busCardListItem) {
            super(0);
            this.b = busCardListItem;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NavigationController navigationControllerQ = BusCardListFragment.this.q();
            Context context = BusCardListFragment.this.getContext();
            BusCardListItem busCardListItem = this.b;
            navigationControllerQ.navigateToShift(context, busCardListItem.id, busCardListItem.name, busCardListItem.xiaomiCardName, false, busCardListItem.orderId, busCardListItem.imageUrl, Boolean.FALSE, busCardListItem.xmActionToken, busCardListItem.packageName, busCardListItem.appName, busCardListItem.redirectTo, busCardListItem.serviceContact);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Unit> {
        public final /* synthetic */ BusCardListItem b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BusCardListItem busCardListItem) {
            super(0);
            this.b = busCardListItem;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NavigationController navigationControllerQ = BusCardListFragment.this.q();
            Context context = BusCardListFragment.this.getContext();
            BusCardListItem busCardListItem = this.b;
            navigationControllerQ.navigateToShift(context, busCardListItem.id, busCardListItem.name, busCardListItem.xiaomiCardName, true, busCardListItem.orderId, busCardListItem.imageUrl, Boolean.TRUE, busCardListItem.xmActionToken, busCardListItem.packageName, busCardListItem.appName, busCardListItem.redirectTo, busCardListItem.serviceContact);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BusCardListFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.BusCardListFragment$special$$inlined$viewModel$default$1
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
        this.xiaomiSztRefundViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<XiaomiSztRefundViewModel>() { // from class: com.huami.wallet.ui.fragment.BusCardListFragment$special$$inlined$viewModel$default$2
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
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.fragment.BusCardListFragment$special$$inlined$inject$default$1
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
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.noticeRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<NoticeRepo>() { // from class: com.huami.wallet.ui.fragment.BusCardListFragment$special$$inlined$inject$default$2
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
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NoticeRepo.class), objArr4, objArr5);
            }
        });
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.locationConfig = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<LocationConfig>() { // from class: com.huami.wallet.ui.fragment.BusCardListFragment$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.common.config.LocationConfig, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final LocationConfig getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(LocationConfig.class), objArr6, objArr7);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.BusCardListFragment$special$$inlined$viewModel$default$3
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BusCardListViewModel>() { // from class: com.huami.wallet.ui.fragment.BusCardListFragment$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.BusCardListViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final BusCardListViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr8, Reflection.getOrCreateKotlinClass(BusCardListViewModel.class), function1, objArr9);
            }
        });
        final Function0<ViewModelOwner> function2 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.BusCardListFragment$special$$inlined$viewModel$default$5
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
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.bulletinViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<XiaomiBulletinViewModel>() { // from class: com.huami.wallet.ui.fragment.BusCardListFragment$special$$inlined$viewModel$default$6
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
                return ComponentCallbackExtKt.getViewModel(this, objArr10, Reflection.getOrCreateKotlinClass(XiaomiBulletinViewModel.class), function2, objArr11);
            }
        });
        this.allCardList = new ArrayList<>();
        this.shiftedCardList = new ArrayList<>();
        this.shiftedFailureCardList = new ArrayList<>();
        this.mocCardList = new ArrayList<>();
        this.motCardList = new ArrayList<>();
        this.recommendCardList = new ArrayList<>();
        this.shiftInOrderId = "";
        this.cardName = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(BusCardListFragment busCardListFragment, BusCardListItem busCardListItem) {
        busCardListFragment.u(busCardListItem);
    }

    private final boolean B(BusCardListItem busCardListItem) {
        int i = busCardListItem.state;
        return i == 8 || i == 9 || i == 13 || i == 10 || i == 11 || i == 12 || i == 14;
    }

    private final void C() {
        BusCardListSectionAdapter busCardListSectionAdapter = this.adapter;
        Objects.requireNonNull(busCardListSectionAdapter);
        busCardListSectionAdapter.setNewData(null);
        SectionDividerDecoration sectionDividerDecoration = this.sectionDividerDecoration;
        Objects.requireNonNull(sectionDividerDecoration);
        sectionDividerDecoration.getSectionPosList().clear();
        EmptyViewHelper emptyViewHelper = this.emptyViewHelper;
        Objects.requireNonNull(emptyViewHelper);
        emptyViewHelper.showEmptyView();
    }

    private final void D() {
        s().getBusCardsLiveData().observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("加载所有可用公交卡列表"));
        s().getBusCardsLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: wc0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardListFragment.E(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(final BusCardListFragment busCardListFragment, Resource resource) {
        String str;
        if (resource == null) {
            return;
        }
        Status status = resource.status;
        Status status2 = Status.ERROR;
        if (status == status2 && (str = resource.code) != null && Intrinsics.areEqual(str, ErrorCode.NETWORK_ERROR)) {
            LoadingDialogHelper loadingDialogHelper = busCardListFragment.loadingDialogHelper;
            if (loadingDialogHelper != null) {
                loadingDialogHelper.hideLoading();
            }
            IconToast.showError(busCardListFragment.requireContext(), "网络未连接");
        } else {
            LoadingDialogHelper loadingDialogHelper2 = busCardListFragment.loadingDialogHelper;
            if (loadingDialogHelper2 != null) {
                loadingDialogHelper2.showOrError(resource);
            }
        }
        Status status3 = resource.status;
        if (status3 == Status.SUCCESS) {
            busCardListFragment.L((List) resource.data);
        } else if (status3 == status2) {
            busCardListFragment.L(null);
            EmptyViewHelper emptyViewHelper = busCardListFragment.emptyViewHelper;
            Objects.requireNonNull(emptyViewHelper);
            emptyViewHelper.showRetryView(new View.OnClickListener() { // from class: uc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BusCardListFragment.F(this.a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(BusCardListFragment busCardListFragment, View view) {
        busCardListFragment.s().getBusCardListData(busCardListFragment.parentAppCode);
    }

    private final void G() {
        s().getXiaomiNoticesLiveData().observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("checkXiaoNotice"));
        s().getXiaomiNoticesLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: zc0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardListFragment.H(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(BusCardListFragment busCardListFragment, Resource resource) {
        if (resource == null) {
            return;
        }
        busCardListFragment.loadingDialogHelper.showOrError(resource);
        if (resource.status == Status.SUCCESS && busCardListFragment.m((List) resource.data)) {
            busCardListFragment.I(busCardListFragment.busCard);
        }
    }

    private final void I(BusCardListItem item) {
        if (item == null) {
            return;
        }
        this.isShiftIn = false;
        this.shiftInOrderId = "";
        int i = item.state;
        if (i != 0) {
            if (i == 1) {
                q().navigateToBusCardDetail(getContext(), item.id, item.name, item.xiaomiCardName, item.imageUrl, item.shiftEnable.booleanValue(), item.packageName, item.appName, item.redirectTo, item.serviceContact);
                return;
            }
            if (i != 2) {
                if (i == 8) {
                    l(CollectionsKt__CollectionsKt.mutableListOf(NoticeActionType.SHIFT_IN), new e(item));
                    return;
                }
                if (i == 9) {
                    l(CollectionsKt__CollectionsKt.mutableListOf(NoticeActionType.SHIFT_OUT), new f(item));
                    return;
                }
                if (i == 13) {
                    l(CollectionsKt__CollectionsKt.mutableListOf(NoticeActionType.SHIFT_IN), new g(item));
                    return;
                }
                if (i != 15) {
                    return;
                }
                this.cardName = item.name;
                this.cacheAppCode = item.id;
                Args args = Args.INSTANCE;
                args.clean();
                args.setAppCode(item.id);
                args.setXiaomiCardName(item.xiaomiCardName);
                args.setCardName(this.cardName);
                t().returnCard(item.id, null, item.xmActionToken);
                return;
            }
        }
        l(CollectionsKt__CollectionsKt.mutableListOf(NoticeActionType.ISSUE, NoticeActionType.TOPUP, NoticeActionType.ISSUE_TOPUP), new d(item));
    }

    private final Integer J(BusCardListItem item) {
        switch (item.state) {
            case 4:
                return Integer.valueOf(R.string.wl_cant_open);
            case 5:
                return Integer.valueOf(R.string.wl_cant_open_toast);
            case 6:
                return Integer.valueOf(R.string.wl_cant_open_toast_mot);
            case 7:
                return Integer.valueOf(R.string.wl_can_open_onlyone_lnt_toast);
            case 8:
            case 9:
            case 13:
            default:
                return null;
            case 10:
                return Integer.valueOf(R.string.wl_cant_open_toast_shift_limit);
            case 11:
                return Integer.valueOf(R.string.wl_cant_open_toast_shift_limit_mot);
            case 12:
                return Integer.valueOf(R.string.wl_cant_open_toast_shift_limit_lnt);
            case 14:
                return Integer.valueOf(R.string.wl_cant_open_toast_shift_limit_same_binding);
        }
    }

    private final void K() {
        this.allCardList.clear();
        this.recommendCardList.clear();
        this.shiftedCardList.clear();
        this.shiftedFailureCardList.clear();
        this.motCardList.clear();
        this.mocCardList.clear();
        SectionDividerDecoration sectionDividerDecoration = this.sectionDividerDecoration;
        Objects.requireNonNull(sectionDividerDecoration);
        sectionDividerDecoration.getSectionPosList().clear();
    }

    private final void L(List<? extends BusCardListItem> busCardListItems) {
        K();
        if (KtUtilsKt.isNullOrEmpty(busCardListItems)) {
            C();
            BusCardListSectionAdapter busCardListSectionAdapter = this.adapter;
            Objects.requireNonNull(busCardListSectionAdapter);
            busCardListSectionAdapter.setNewData(this.allCardList);
            return;
        }
        for (BusCardListItem busCardListItem : busCardListItems) {
            if (B(busCardListItem)) {
                if (busCardListItem.state == 9) {
                    this.shiftedFailureCardList.add(new BusCardItemSection(busCardListItem));
                } else {
                    this.shiftedCardList.add(new BusCardItemSection(busCardListItem));
                }
            } else if (Intrinsics.areEqual(busCardListItem.isRecommend, Boolean.TRUE)) {
                this.recommendCardList.add(new BusCardItemSection(busCardListItem));
            } else if (busCardListItem.isMot) {
                this.motCardList.add(new BusCardItemSection(busCardListItem));
            } else {
                this.mocCardList.add(new BusCardItemSection(busCardListItem));
            }
        }
        O();
        P();
        M();
        EmptyViewHelper emptyViewHelper = this.emptyViewHelper;
        Objects.requireNonNull(emptyViewHelper);
        emptyViewHelper.removeEmptyView();
        BusCardListSectionAdapter busCardListSectionAdapter2 = this.adapter;
        Objects.requireNonNull(busCardListSectionAdapter2);
        busCardListSectionAdapter2.setNewData(this.allCardList);
    }

    private final void M() {
        cd0 cd0Var = new Comparator() { // from class: cd0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BusCardListFragment.N((BusCardItemSection) obj, (BusCardItemSection) obj2);
            }
        };
        if (!this.mocCardList.isEmpty()) {
            this.allCardList.add(new BusCardItemSection(true, getString(R.string.wl_city_one_card_pass)));
            kotlin.collections.g.sortWith(this.mocCardList, cd0Var);
            this.allCardList.addAll(this.mocCardList);
        }
        if (!this.motCardList.isEmpty()) {
            this.allCardList.add(new BusCardItemSection(true, getString(R.string.wl_traffic_union_card)));
            kotlin.collections.g.sortWith(this.motCardList, cd0Var);
            this.allCardList.addAll(this.motCardList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final int N(BusCardItemSection busCardItemSection, BusCardItemSection busCardItemSection2) {
        T t = busCardItemSection.t;
        int i = ((BusCardListItem) t).state;
        T t2 = busCardItemSection2.t;
        if (i == ((BusCardListItem) t2).state) {
            return 0;
        }
        if (((BusCardListItem) t).state == 15) {
            return -1;
        }
        if (((BusCardListItem) t2).state != 15) {
            if (((BusCardListItem) t).state == 1) {
                return -1;
            }
            if (((BusCardListItem) t2).state != 1) {
                if (((BusCardListItem) t).state == 2) {
                    return -1;
                }
                if (((BusCardListItem) t2).state != 2) {
                    return ((BusCardListItem) t).state - ((BusCardListItem) t2).state;
                }
            }
        }
        return 1;
    }

    private final void O() {
        if (!this.recommendCardList.isEmpty()) {
            this.allCardList.add(new BusCardItemSection(true, getString(R.string.wl_card_recomend_list_header)));
            BusCardListSectionAdapter busCardListSectionAdapter = this.adapter;
            Objects.requireNonNull(busCardListSectionAdapter);
            View view = this.headerView;
            Objects.requireNonNull(view);
            busCardListSectionAdapter.setHeaderView(view);
            SectionDividerDecoration sectionDividerDecoration = this.sectionDividerDecoration;
            Objects.requireNonNull(sectionDividerDecoration);
            sectionDividerDecoration.setNotShowHeaderLine(true);
            LocationInfo locationInfo = p().getLocationInfo();
            if (locationInfo != null) {
                View view2 = this.headerView;
                Objects.requireNonNull(view2);
                ((TextView) view2.findViewById(R.id.cityName)).setText(locationInfo.getCityName());
            }
        } else {
            SectionDividerDecoration sectionDividerDecoration2 = this.sectionDividerDecoration;
            Objects.requireNonNull(sectionDividerDecoration2);
            sectionDividerDecoration2.setNotShowHeaderLine(false);
            BusCardListSectionAdapter busCardListSectionAdapter2 = this.adapter;
            Objects.requireNonNull(busCardListSectionAdapter2);
            View view3 = this.headerView;
            Objects.requireNonNull(view3);
            busCardListSectionAdapter2.removeHeaderView(view3);
        }
        this.allCardList.addAll(this.recommendCardList);
    }

    private final void P() {
        if (!this.shiftedCardList.isEmpty()) {
            this.allCardList.add(new BusCardItemSection(true, getString(R.string.wl_card_shifted_out_list_header)));
        }
        this.allCardList.addAll(this.shiftedCardList);
        if (!this.shiftedFailureCardList.isEmpty()) {
            this.allCardList.add(new BusCardItemSection(true, getString(R.string.wl_shift_out_retry_title)));
        }
        this.allCardList.addAll(this.shiftedFailureCardList);
    }

    private final void Q(Resource<String> resource) {
        if (resource == null) {
            return;
        }
        if (resource.status == Status.ERROR && Intrinsics.areEqual(resource.code, "c0007")) {
            LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
            if (loadingDialogHelper != null) {
                loadingDialogHelper.hideLoading();
            }
            BusCardListItem busCard = s().getBusCard();
            q().navigateToBindPhoneNumber(getContext(), Boolean.valueOf(this.isShiftIn), Boolean.FALSE, this.shiftInOrderId, busCard.id, busCard.name, busCard.imageUrl, busCard.xiaomiCardName, busCard.packageName, busCard.appName, busCard.redirectTo, busCard.serviceContact);
            return;
        }
        LoadingDialogHelper loadingDialogHelper2 = this.loadingDialogHelper;
        if (loadingDialogHelper2 != null) {
            loadingDialogHelper2.showOrError(resource);
        }
        if (resource.status != Status.SUCCESS) {
            return;
        }
        BusCardListItem busCard2 = s().getBusCard();
        String str = resource.data;
        int i = busCard2.state;
        if (i == 0) {
            q().navigateToOpenBusCard(getContext(), busCard2.id, busCard2.name, busCard2.imageUrl, str, "");
            return;
        }
        if (i == 2) {
            q().navigateToBusCardOperationResult(getContext(), busCard2.id, busCard2.orderId, busCard2.name, false, null);
            return;
        }
        if (i == 13) {
            q().navigateToShift(getContext(), busCard2.id, busCard2.name, busCard2.xiaomiCardName, false, busCard2.orderId, busCard2.imageUrl, Boolean.TRUE, busCard2.xmActionToken, busCard2.packageName, busCard2.appName, busCard2.redirectTo, busCard2.serviceContact);
        } else if (i == 8) {
            q().navigateToShift(getContext(), busCard2.id, busCard2.name, busCard2.xiaomiCardName, true, busCard2.orderId, busCard2.imageUrl, Boolean.FALSE, busCard2.xmActionToken, busCard2.packageName, busCard2.appName, busCard2.redirectTo, busCard2.serviceContact);
        } else {
            if (i != 9) {
                return;
            }
            q().navigateToShift(getContext(), busCard2.id, busCard2.name, busCard2.xiaomiCardName, false, busCard2.orderId, busCard2.imageUrl, Boolean.FALSE, busCard2.xmActionToken, busCard2.packageName, busCard2.appName, busCard2.redirectTo, busCard2.serviceContact);
        }
    }

    private final void initViewModel() {
        if (getActivity() == null) {
            return;
        }
        t().getXiaomiReturnCardLiveData().observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("退卡"));
        t().getXiaomiReturnCardLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: xc0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardListFragment.x(this.a, (Resource) obj);
            }
        });
        o().getXiaomiBulletinLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: yc0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardListFragment.y(this.a, (Resource) obj);
            }
        });
        D();
        s().getVerifiedPhoneLiveData().observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("加载已绑定的手机号"));
        s().getVerifiedPhoneLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ad0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardListFragment.z(this.a, (Resource) obj);
            }
        });
        s().getGoToNextPageLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: vc0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BusCardListFragment.A(this.a, (BusCardListItem) obj);
            }
        });
        r().preLoad();
        G();
    }

    private final void l(List<? extends NoticeActionType> type, Function0<Unit> onNext) {
        Context contextRequireContext = requireContext();
        List<Notice> notices = r().getNotices();
        FragmentManager childFragmentManager = getChildFragmentManager();
        BusCardListItem busCardListItem = this.busCard;
        NoticeViewUtils.checkNeedShowDialog(contextRequireContext, notices, childFragmentManager, busCardListItem == null ? null : busCardListItem.id, type, new a(onNext));
    }

    private final boolean m(List<XiaomiNotice> xiaomiNotices) {
        if (this.busCard.state == 1 || KtUtilsKt.isNullOrEmpty(xiaomiNotices)) {
            return true;
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            return false;
        }
        for (XiaomiNotice xiaomiNotice : xiaomiNotices) {
            String cardName = xiaomiNotice.getCardName();
            int status = xiaomiNotice.getStatus();
            String description = xiaomiNotice.getDescription();
            if (Intrinsics.areEqual(cardName, this.busCard.xiaomiCardName) && status == 4) {
                NoticeViewUtils.showDialog(requireContext(), fragmentManager, description);
                return false;
            }
        }
        return true;
    }

    private final boolean n(BusCardListItem item) {
        if (item == null) {
            return false;
        }
        Integer numJ = J(item);
        if (numJ == null) {
            return true;
        }
        CustomToast.showShort(getContext(), numJ.intValue());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final XiaomiBulletinViewModel o() {
        return (XiaomiBulletinViewModel) this.bulletinViewModel.getValue();
    }

    private final LocationConfig p() {
        return (LocationConfig) this.locationConfig.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController q() {
        return (NavigationController) this.navigationController.getValue();
    }

    private final NoticeRepo r() {
        return (NoticeRepo) this.noticeRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BusCardListViewModel s() {
        return (BusCardListViewModel) this.viewModel.getValue();
    }

    private final XiaomiSztRefundViewModel t() {
        return (XiaomiSztRefundViewModel) this.xiaomiSztRefundViewModel.getValue();
    }

    private final void u(BusCardListItem busCard) {
        if (busCard == null) {
            return;
        }
        int i = busCard.state;
        if (i == 0) {
            q().navigateToOpenBusCard(getContext(), busCard.id, busCard.name, busCard.imageUrl, null, busCard.xiaomiCardName);
            return;
        }
        if (i == 2) {
            q().navigateToBusCardOperationResult(getContext(), busCard.id, busCard.orderId, busCard.name, false, null);
            return;
        }
        if (i == 13) {
            q().navigateToShift(getContext(), busCard.id, busCard.name, busCard.xiaomiCardName, true, busCard.orderId, busCard.imageUrl, Boolean.TRUE, busCard.xmActionToken, busCard.packageName, busCard.appName, busCard.redirectTo, busCard.serviceContact);
        } else if (i == 8) {
            q().navigateToShift(getContext(), busCard.id, busCard.name, busCard.xiaomiCardName, true, busCard.orderId, busCard.imageUrl, Boolean.FALSE, busCard.xmActionToken, busCard.packageName, busCard.appName, busCard.redirectTo, busCard.serviceContact);
        } else {
            if (i != 9) {
                return;
            }
            q().navigateToShift(getContext(), busCard.id, busCard.name, busCard.xiaomiCardName, false, busCard.orderId, busCard.imageUrl, Boolean.FALSE, busCard.xmActionToken, busCard.packageName, busCard.appName, busCard.redirectTo, busCard.serviceContact);
        }
    }

    private final void v() {
        SectionDividerDecoration sectionDividerDecoration = new SectionDividerDecoration(getContext());
        this.sectionDividerDecoration = sectionDividerDecoration;
        RecyclerView recyclerView = this.recyclerView;
        Objects.requireNonNull(recyclerView);
        Objects.requireNonNull(sectionDividerDecoration);
        recyclerView.addItemDecoration(sectionDividerDecoration);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        RecyclerView recyclerView2 = this.recyclerView;
        Objects.requireNonNull(recyclerView2);
        recyclerView2.setLayoutManager(linearLayoutManager);
        BusCardListSectionAdapter busCardListSectionAdapter = new BusCardListSectionAdapter(R.layout.wl_item_bus_card, R.layout.wl_item_bus_card_head, null);
        this.adapter = busCardListSectionAdapter;
        Objects.requireNonNull(busCardListSectionAdapter);
        RecyclerView recyclerView3 = this.recyclerView;
        Objects.requireNonNull(recyclerView3);
        busCardListSectionAdapter.bindToRecyclerView(recyclerView3);
        BusCardListSectionAdapter busCardListSectionAdapter2 = this.adapter;
        Objects.requireNonNull(busCardListSectionAdapter2);
        busCardListSectionAdapter2.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: bd0
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                BusCardListFragment.w(this.a, baseQuickAdapter, view, i);
            }
        });
        BusCardListSectionAdapter busCardListSectionAdapter3 = this.adapter;
        Objects.requireNonNull(busCardListSectionAdapter3);
        this.emptyViewHelper = new EmptyViewHelper(busCardListSectionAdapter3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void w(BusCardListFragment busCardListFragment, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        BusCardListSectionAdapter busCardListSectionAdapter = busCardListFragment.adapter;
        Objects.requireNonNull(busCardListSectionAdapter);
        BusCardItemSection busCardItemSection = (BusCardItemSection) busCardListSectionAdapter.getItem(i);
        if ((busCardItemSection == null ? null : Boolean.valueOf(busCardItemSection.isHeader)).booleanValue()) {
            return;
        }
        BusCardListSectionAdapter busCardListSectionAdapter2 = busCardListFragment.adapter;
        Objects.requireNonNull(busCardListSectionAdapter2);
        T item = busCardListSectionAdapter2.getItem(i);
        Objects.requireNonNull(item);
        BusCardListItem busCardListItem = (BusCardListItem) ((BusCardItemSection) item).t;
        busCardListFragment.busCard = busCardListItem;
        if (busCardListItem != null) {
            Boolean boolValueOf = Boolean.valueOf(busCardListItem.isParent);
            if (!boolValueOf.booleanValue()) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                boolValueOf.booleanValue();
                BusCardListItem busCardListItem2 = busCardListFragment.busCard;
                if ((busCardListItem2 == null ? null : busCardListItem2.id) == null) {
                    return;
                }
                NavigationController navigationControllerQ = busCardListFragment.q();
                Context context = busCardListFragment.getContext();
                BusCardListItem busCardListItem3 = busCardListFragment.busCard;
                navigationControllerQ.navigateToBusCardList(context, busCardListItem3 != null ? busCardListItem3.id : null);
                return;
            }
        }
        if (busCardListFragment.n(busCardListFragment.busCard)) {
            busCardListFragment.s().checkXiaoNotice();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void x(BusCardListFragment busCardListFragment, Resource resource) {
        String str = busCardListFragment.cacheAppCode;
        if (str != null && Intrinsics.areEqual(str, ConstantKt.APP_CODE_SHEN_ZHEN_MOT)) {
            int i = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
            if (i == 1) {
                LoadingDialogHelper loadingDialogHelper = busCardListFragment.loadingDialogHelper;
                if (loadingDialogHelper == null) {
                    return;
                }
                loadingDialogHelper.showLoading(busCardListFragment.requireContext().getResources().getString(R.string.wl_deleting_tip));
                return;
            }
            if (i == 2) {
                LoadingDialogHelper loadingDialogHelper2 = busCardListFragment.loadingDialogHelper;
                if (loadingDialogHelper2 != null) {
                    loadingDialogHelper2.hideLoading();
                }
                busCardListFragment.requireContext().startActivity(new Intent(busCardListFragment.getContext(), (Class<?>) RefundResultActivity.class).putExtra(RefundResultActivity.EXTRA_RESULT, 2).putExtra("ARG_BUS_CARD_NAME", busCardListFragment.cardName).putExtra(RefundResultActivity.EXTRA_ORDER_NUMBER, ""));
                return;
            }
            if (i != 3) {
                return;
            }
            LoadingDialogHelper loadingDialogHelper3 = busCardListFragment.loadingDialogHelper;
            if (loadingDialogHelper3 != null) {
                loadingDialogHelper3.hideLoading();
            }
            CustomToast.makeText(busCardListFragment.requireContext(), R.string.wl_revert_card_fail, 0).show();
            busCardListFragment.requireContext().startActivity(new Intent(busCardListFragment.getContext(), (Class<?>) RefundResultActivity.class).putExtra(RefundResultActivity.EXTRA_RESULT, 3).putExtra("ARG_BUS_CARD_NAME", busCardListFragment.cardName).putExtra(RefundResultActivity.EXTRA_ORDER_NUMBER, (String) resource.data).putExtra(RefundResultActivity.EXTRA_ERROR_MEG, resource.message));
            return;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i2 == 2) {
            LoadingDialogHelper loadingDialogHelper4 = busCardListFragment.loadingDialogHelper;
            if (loadingDialogHelper4 != null) {
                loadingDialogHelper4.hideLoading();
            }
            busCardListFragment.q().closePreviousPages();
            FragmentActivity activity = busCardListFragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
            busCardListFragment.q().navigateReturnCardResultSuccessActivity(busCardListFragment.getActivity());
            return;
        }
        if (i2 != 3) {
            return;
        }
        LoadingDialogHelper loadingDialogHelper5 = busCardListFragment.loadingDialogHelper;
        if (loadingDialogHelper5 != null) {
            loadingDialogHelper5.hideLoading();
        }
        busCardListFragment.q().closePreviousPages();
        FragmentActivity activity2 = busCardListFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        busCardListFragment.q().navigateReturnCardResultFailActivity(busCardListFragment.getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void y(BusCardListFragment busCardListFragment, Resource resource) {
        if (!resource.isSuccessful() || resource.data == 0) {
            return;
        }
        XiaomiBulletinHelper.showXiaomiBulletin(busCardListFragment.requireContext(), busCardListFragment.getChildFragmentManager(), (XiaomiBulletin) resource.data, busCardListFragment.new b(), busCardListFragment.new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(BusCardListFragment busCardListFragment, Resource resource) {
        busCardListFragment.Q(resource);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.wallet.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        this.parentAppCode = arguments == null ? null : arguments.getString(BusCardListActivity.EXTRA_PARENT_APP_CODE);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.fragment_bus_list, container, false);
        this.root = viewInflate;
        Objects.requireNonNull(viewInflate);
        this.recyclerView = (RecyclerView) viewInflate.findViewById(R.id.wl_bus_ls_rv);
        this.headerView = inflater.inflate(R.layout.wl_view_bus_card_list_header, (ViewGroup) null);
        View view = this.root;
        Objects.requireNonNull(view);
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        r().dispose();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        s().getBusCardListData(this.parentAppCode);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewModel();
        this.loadingDialogHelper = LoadingDialogHelper.newInstance(getActivity());
        v();
        XiaomiBulletinViewModel.getXiaomiBulletins$default(o(), XiaomiBulletinType.CardList, null, "", 2, null);
    }
}

package com.huami.message.ui.notification;

import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.message.di.koin.ScopesAndQualifersKt;
import com.huami.message.navigation.ExternalNavigator;
import com.huami.message.ui.R;
import com.huami.message.ui.base.ext.MessageStatusExKt;
import com.huami.message.ui.base.ext.NotificationItemVoExKt;
import com.huami.message.ui.base.ext.ViewExKt;
import com.huami.message.ui.base.fragment.BaseDelegateFragment;
import com.huami.message.ui.base.fragmentdelegate.LoadDataOnVisibleOnce;
import com.huami.message.ui.home.MidongMessageCenterActivity;
import com.huami.message.ui.message.VerticalLinearSpacingDecoration;
import com.huami.message.ui.notification.NotificationFragment;
import com.huami.message.ui.widget.CustomSmartRefreshLayout;
import com.huami.message.ui.widget.FavoriteClassicsFooter;
import com.huami.message.utils.AppUtils;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.message.utils.TimeoutAction;
import com.huami.message.viewmodel.MessageCountViewModel;
import com.huami.message.vo.NotificationItemVo;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0001QB\u0007¢\u0006\u0004\bO\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0016\u0010\t\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\u0006\u0010\u001a\u001a\u00020\u0002J\b\u0010\u001b\u001a\u00020\u0002H\u0016R\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010/\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002008\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00107\u001a\u0002008\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b6\u00102R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b9\u0010\tR\u0016\u0010<\u001a\u0002088\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b;\u0010\tR\u0016\u0010>\u001a\u0002088\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b=\u0010\tR\u0016\u0010@\u001a\u0002088\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b?\u0010\tR\u0016\u0010C\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010\bR\u0016\u0010H\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010BR\u0016\u0010J\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010BR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u0002000K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010LR\u0016\u0010N\u001a\u0002008\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u00102¨\u0006R"}, d2 = {"Lcom/huami/message/ui/notification/NotificationFragment;", "Lcom/huami/message/ui/base/fragment/BaseDelegateFragment;", "", "initRecycleView", "v", "Lcom/huami/android/vo/Resource;", "", "resource", "J", LogUtil.I, "O", "M", "N", "t", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "isVisibleToUser", "setUserVisibleHint", "changeMessageReadStatus", "onDestroy", "Lcom/huami/message/ui/notification/NotificationViewModel;", "b", "Lkotlin/Lazy;", SOAP.XMLNS, "()Lcom/huami/message/ui/notification/NotificationViewModel;", "viewModel", "Lcom/huami/message/viewmodel/MessageCountViewModel;", "c", DTransferConstants.SEARCH_KEY, "()Lcom/huami/message/viewmodel/MessageCountViewModel;", "messageCntViewModel", "Lcom/huami/message/ui/notification/NotificationAdapter;", GoogleApiAvailabilityLight.a, "Lcom/huami/message/ui/notification/NotificationAdapter;", "adapter", "Lcom/huami/message/navigation/ExternalNavigator;", "e", "r", "()Lcom/huami/message/navigation/ExternalNavigator;", "navigator", "", "f", "Ljava/lang/String;", "TYPE_H5", "g", "TYPE_APP", "h", "TYPE_APPLETS", "", "i", "MODE_JUMP_WEB", z.j, "MODE_JUMP_APP", hl.k, "MODE_JUMP_RN", "l", "MODE_JUMP_APPLETS", "m", "Z", WebAPI.PARAM_IS_REFRESH, "", GoogleApiAvailabilityLight.b, "enterTime", "o", "visibleHint", b.r, MidongMessageCenterActivity.IS_OUT, "Lcom/huami/message/utils/TimeoutAction;", "Lcom/huami/message/utils/TimeoutAction;", "timeoutAction", "visibleKey", "<init>", "()V", "Companion", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class NotificationFragment extends BaseDelegateFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String s = "NotificationFragment";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy messageCntViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private NotificationAdapter adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String TYPE_H5;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String TYPE_APP;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String TYPE_APPLETS;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int MODE_JUMP_WEB;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int MODE_JUMP_APP;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int MODE_JUMP_RN;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int MODE_JUMP_APPLETS;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isRefresh;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private long enterTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean visibleHint;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean isOut;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private TimeoutAction<String> timeoutAction;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final String visibleKey;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/message/ui/notification/NotificationFragment$Companion;", "", "Lcom/huami/message/ui/notification/NotificationFragment;", "newInstance", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NotificationFragment newInstance() {
            return new NotificationFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.ERROR.ordinal()] = 2;
            iArr[Status.LOADING.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "Lcom/huami/message/vo/NotificationItemVo;", "item", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<Integer, NotificationItemVo, Unit> {
        public a() {
            super(2);
        }

        public final void a(int i, @NotNull NotificationItemVo notificationItemVo) {
            String jumpType = notificationItemVo.getJumpType();
            if (Intrinsics.areEqual(jumpType, NotificationFragment.this.TYPE_H5)) {
                NotificationFragment.this.r().navigateToPage(NotificationFragment.this.getActivity(), Integer.valueOf(NotificationFragment.this.MODE_JUMP_WEB), notificationItemVo.getUrl(), notificationItemVo.getPushUrl());
            } else if (Intrinsics.areEqual(jumpType, NotificationFragment.this.TYPE_APP)) {
                NotificationFragment.this.r().navigateToPage(NotificationFragment.this.getActivity(), Integer.valueOf(NotificationFragment.this.MODE_JUMP_APP), notificationItemVo.getUrl(), notificationItemVo.getPushUrl());
            } else if (Intrinsics.areEqual(jumpType, NotificationFragment.this.TYPE_APPLETS)) {
                NotificationFragment.this.r().navigateToPage(NotificationFragment.this.getActivity(), Integer.valueOf(NotificationFragment.this.MODE_JUMP_APPLETS), notificationItemVo.getUrl(), notificationItemVo.getPushUrl());
            } else {
                NotificationFragment.this.r().navigateToPage(NotificationFragment.this.getActivity(), Integer.valueOf(NotificationFragment.this.MODE_JUMP_RN), notificationItemVo.getUrl(), notificationItemVo.getPushUrl());
            }
            MessageRecorderEventHelper.MessageCenterEventHelper.INSTANCE.clickNotification(NotificationItemVoExKt.getTypeForRecord(notificationItemVo), String.valueOf(notificationItemVo.getMessageId()), MessageStatusExKt.getStatusForRecord(notificationItemVo.getStatus()));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, NotificationItemVo notificationItemVo) {
            a(num.intValue(), notificationItemVo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.message.ui.notification.NotificationFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NotificationViewModel>() { // from class: com.huami.message.ui.notification.NotificationFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.message.ui.notification.NotificationViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NotificationViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(NotificationViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.message.ui.notification.NotificationFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.messageCntViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MessageCountViewModel>() { // from class: com.huami.message.ui.notification.NotificationFragment$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.message.viewmodel.MessageCountViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MessageCountViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(MessageCountViewModel.class), function1, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.navigator = LazyKt__LazyJVMKt.lazy(new Function0<ExternalNavigator>() { // from class: com.huami.message.ui.notification.NotificationFragment$special$$inlined$injectInMc$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.message.navigation.ExternalNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExternalNavigator invoke() {
                return ScopesAndQualifersKt.messageScope(org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(ExternalNavigator.class), objArr4, objArr5);
            }
        });
        this.TYPE_H5 = "h5";
        this.TYPE_APP = "app";
        this.TYPE_APPLETS = "xcx";
        this.MODE_JUMP_WEB = 1;
        this.MODE_JUMP_APP = 2;
        this.MODE_JUMP_RN = 4;
        this.MODE_JUMP_APPLETS = 5;
        this.enterTime = System.currentTimeMillis();
        this.timeoutAction = new TimeoutAction<>(1, TimeUnit.SECONDS);
        this.visibleKey = "visibleKey";
        addDelegate(new LoadDataOnVisibleOnce() { // from class: com.huami.message.ui.notification.NotificationFragment.1
            @Override // com.huami.message.ui.base.fragmentdelegate.LoadDataOnVisibleOnce
            public void loadDataOnVisibleOnce() {
                NotificationFragment.this.v();
                NotificationFragment.this.s().initRefresh();
                NotificationFragment.this.enterTime = System.currentTimeMillis();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(NotificationFragment notificationFragment, Resource resource) {
        View view = notificationFragment.getView();
        ((CustomSmartRefreshLayout) (view == null ? null : view.findViewById(R.id.refreshLayout))).setLoadmoreFinished(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(NotificationFragment notificationFragment, Resource resource) {
        notificationFragment.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(NotificationFragment notificationFragment, Resource resource) {
        notificationFragment.I(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(NotificationFragment notificationFragment, Resource resource) {
        notificationFragment.J(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(final NotificationFragment notificationFragment, final PagedList pagedList) {
        View view = notificationFragment.getView();
        ((RecyclerView) (view == null ? null : view.findViewById(R.id.recycler_view))).post(new Runnable() { // from class: jg5
            @Override // java.lang.Runnable
            public final void run() {
                NotificationFragment.F(this.a, pagedList);
            }
        });
        notificationFragment.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(NotificationFragment notificationFragment, PagedList pagedList) {
        try {
            NotificationAdapter notificationAdapter = notificationFragment.adapter;
            if (notificationAdapter == null) {
                throw null;
            }
            notificationAdapter.submitList(pagedList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(NotificationFragment notificationFragment, Resource resource) {
        if (resource == null) {
            return;
        }
        if (WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()] == 1) {
            View view = notificationFragment.getView();
            final RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.recycler_view));
            if (recyclerView == null) {
                return;
            }
            recyclerView.postDelayed(new Runnable() { // from class: eg5
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationFragment.H(recyclerView);
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        layoutManager.scrollToPosition(0);
    }

    private final void I(Resource<Boolean> resource) {
        if (Status.SUCCESS == resource.getStatus()) {
            s().refresh();
            return;
        }
        if (Status.ERROR == resource.getStatus()) {
            s().refresh();
            if (TextUtils.isEmpty(resource.getMessage())) {
                Toast.makeText(getActivity(), getString(R.string.no_network_connection), 0).show();
            } else {
                Toast.makeText(getActivity(), resource.getMessage(), 0).show();
            }
        }
    }

    private final void J(Resource<Boolean> resource) {
        if (Status.SUCCESS == resource.getStatus()) {
            View view = getView();
            final RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.recycler_view));
            if (recyclerView == null) {
                return;
            }
            recyclerView.postDelayed(new Runnable() { // from class: fg5
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationFragment.K(recyclerView);
                }
            }, 500L);
            ViewExKt.setVisible(recyclerView, true);
            View view2 = getView();
            ((CustomSmartRefreshLayout) (view2 != null ? view2.findViewById(R.id.refreshLayout) : null)).finishRefresh(true);
            return;
        }
        if (Status.ERROR != resource.getStatus()) {
            if (Status.LOADING == resource.getStatus()) {
                View view3 = getView();
                ((CustomSmartRefreshLayout) (view3 != null ? view3.findViewById(R.id.refreshLayout) : null)).startRefreshingAnim();
                return;
            }
            return;
        }
        View view4 = getView();
        final RecyclerView recyclerView2 = (RecyclerView) (view4 == null ? null : view4.findViewById(R.id.recycler_view));
        if (recyclerView2 != null) {
            recyclerView2.postDelayed(new Runnable() { // from class: gg5
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationFragment.L(recyclerView2);
                }
            }, 500L);
            ViewExKt.setVisible(recyclerView2, true);
        }
        View view5 = getView();
        ((CustomSmartRefreshLayout) (view5 != null ? view5.findViewById(R.id.refreshLayout) : null)).finishRefresh(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        layoutManager.scrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        layoutManager.scrollToPosition(0);
    }

    private final void M() {
        View view = getView();
        View viewFindViewById = view == null ? null : view.findViewById(R.id.messageEmpty);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
        View view2 = getView();
        RecyclerView recyclerView = (RecyclerView) (view2 != null ? view2.findViewById(R.id.recycler_view) : null);
        if (recyclerView == null) {
            return;
        }
        recyclerView.setVisibility(8);
    }

    private final void N() {
        HMLog.d(s, "showNetworkErrorUI", new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    private final void O() {
        HMLog.d(s, "showNormalUI", new Object[0]);
        AppUtils appUtils = AppUtils.INSTANCE;
        String midong_package_name = appUtils.getMIDONG_PACKAGE_NAME();
        FragmentActivity activity = getActivity();
        if (midong_package_name.equals(appUtils.getPackageName(activity == null ? null : activity.getApplicationContext()))) {
            new Handler().postDelayed(new Runnable() { // from class: ig5
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationFragment.P(this.a);
                }
            }, 600L);
        } else {
            String midong_package_name1 = appUtils.getMIDONG_PACKAGE_NAME1();
            FragmentActivity activity2 = getActivity();
            if (midong_package_name1.equals(appUtils.getPackageName(activity2 == null ? null : activity2.getApplicationContext()))) {
                new Handler().postDelayed(new Runnable() { // from class: ig5
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotificationFragment.P(this.a);
                    }
                }, 600L);
            }
        }
        if (this.isRefresh) {
            View view = getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.messageEmpty);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            View view2 = getView();
            RecyclerView recyclerView = (RecyclerView) (view2 != null ? view2.findViewById(R.id.recycler_view) : null);
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(NotificationFragment notificationFragment) {
        if (notificationFragment.isRefresh) {
            return;
        }
        notificationFragment.changeMessageReadStatus();
        notificationFragment.isRefresh = true;
    }

    private final void initRecycleView() {
        this.adapter = new NotificationAdapter(new a(), this.isOut);
        View view = getView();
        RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.recycler_view));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        NotificationAdapter notificationAdapter = this.adapter;
        Objects.requireNonNull(notificationAdapter);
        recyclerView.setAdapter(notificationAdapter);
        VerticalLinearSpacingDecoration verticalLinearSpacingDecoration = new VerticalLinearSpacingDecoration(recyclerView.getContext(), 1, 0, 0, 0, 0, 1, 60, null);
        Drawable drawable = ContextCompat.getDrawable(recyclerView.getContext(), R.drawable.mc_msg_item_divider);
        if (drawable != null) {
            verticalLinearSpacingDecoration.setDrawable(drawable);
        }
        recyclerView.addItemDecoration(verticalLinearSpacingDecoration);
    }

    private final MessageCountViewModel q() {
        return (MessageCountViewModel) this.messageCntViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExternalNavigator r() {
        return (ExternalNavigator) this.navigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationViewModel s() {
        return (NotificationViewModel) this.viewModel.getValue();
    }

    private final void t() {
        View view = getView();
        CustomSmartRefreshLayout customSmartRefreshLayout = (CustomSmartRefreshLayout) (view == null ? null : view.findViewById(R.id.refreshLayout));
        customSmartRefreshLayout.setEnableLoadmore(false);
        customSmartRefreshLayout.setEnableRefresh(true);
        customSmartRefreshLayout.setOnRefreshListener(new OnRefreshListener() { // from class: sg5
            @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
            public final void onRefresh(RefreshLayout refreshLayout) {
                NotificationFragment.u(this.a, refreshLayout);
            }
        });
        customSmartRefreshLayout.setRefreshFooter((RefreshFooter) new FavoriteClassicsFooter(customSmartRefreshLayout.getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(NotificationFragment notificationFragment, RefreshLayout refreshLayout) {
        notificationFragment.q().markNotice(notificationFragment.enterTime);
        NotificationAdapter notificationAdapter = notificationFragment.adapter;
        Objects.requireNonNull(notificationAdapter);
        notificationAdapter.resetCountHelper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        s().init();
        s().pagedList().observe(this, new Observer() { // from class: dg5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NotificationFragment.E(this.a, (PagedList) obj);
            }
        });
        s().initRefreshState().observe(this, new Observer() { // from class: og5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NotificationFragment.G(this.a, (Resource) obj);
            }
        });
        s().refreshState().observe(this, new Observer() { // from class: rg5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NotificationFragment.w(this.a, (Resource) obj);
            }
        });
        s().networkState().observe(this, new Observer() { // from class: qg5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NotificationFragment.y(this.a, (Resource) obj);
            }
        });
        s().loadEmptyDataState().observe(this, new Observer() { // from class: kg5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NotificationFragment.z(this.a, (Resource) obj);
            }
        });
        s().loadMoreFinishedState().observe(this, new Observer() { // from class: mg5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NotificationFragment.A(this.a, (Resource) obj);
            }
        });
        s().loadFirstPagingErrorState().observe(this, new Observer() { // from class: ng5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NotificationFragment.B(this.a, (Resource) obj);
            }
        });
        q().getNoticeUpdateResult().observe(this, new Observer() { // from class: pg5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NotificationFragment.C(this.a, (Resource) obj);
            }
        });
        q().getNoticeUpdateResultMidong().observe(this, new Observer() { // from class: lg5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NotificationFragment.D(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(NotificationFragment notificationFragment, Resource resource) {
        if (resource != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            if (i == 1) {
                HMLog.d(s, "refreshState SUCCESS", new Object[0]);
                View view = notificationFragment.getView();
                final RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.recycler_view));
                if (recyclerView != null) {
                    recyclerView.postDelayed(new Runnable() { // from class: hg5
                        @Override // java.lang.Runnable
                        public final void run() {
                            NotificationFragment.x(recyclerView);
                        }
                    }, 500L);
                    View view2 = notificationFragment.getView();
                    ((CustomSmartRefreshLayout) (view2 != null ? view2.findViewById(R.id.refreshLayout) : null)).finishRefresh(true);
                }
                notificationFragment.enterTime = System.currentTimeMillis();
                return;
            }
            if (i == 2) {
                HMLog.d(s, "refreshState ERROR", new Object[0]);
                View view3 = notificationFragment.getView();
                ((CustomSmartRefreshLayout) (view3 != null ? view3.findViewById(R.id.refreshLayout) : null)).finishRefresh(false);
            } else {
                if (i != 3) {
                    return;
                }
                HMLog.d(s, "refreshState LOADING", new Object[0]);
                View view4 = notificationFragment.getView();
                ((CustomSmartRefreshLayout) (view4 != null ? view4.findViewById(R.id.refreshLayout) : null)).startRefreshingAnim();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        layoutManager.scrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(NotificationFragment notificationFragment, Resource resource) {
        HMLog.d(s, Intrinsics.stringPlus("networkState", resource.getStatus().name()), new Object[0]);
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            View view = notificationFragment.getView();
            ((CustomSmartRefreshLayout) (view != null ? view.findViewById(R.id.refreshLayout) : null)).finishLoadmore(true);
        } else if (i == 2) {
            View view2 = notificationFragment.getView();
            ((CustomSmartRefreshLayout) (view2 != null ? view2.findViewById(R.id.refreshLayout) : null)).finishLoadmore(false);
        } else {
            if (i != 3) {
                return;
            }
            View view3 = notificationFragment.getView();
            ((CustomSmartRefreshLayout) (view3 == null ? null : view3.findViewById(R.id.refreshLayout))).setEnableLoadmore(true);
            View view4 = notificationFragment.getView();
            ((CustomSmartRefreshLayout) (view4 != null ? view4.findViewById(R.id.refreshLayout) : null)).startFootRefreshingAnim();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(NotificationFragment notificationFragment, Resource resource) {
        notificationFragment.M();
    }

    @Override // com.huami.message.ui.base.fragment.BaseDelegateFragment
    public void _$_clearFindViewByIdCache() {
    }

    public final void changeMessageReadStatus() {
        q().markNoticeMidong(this.enterTime);
        NotificationAdapter notificationAdapter = this.adapter;
        Objects.requireNonNull(notificationAdapter);
        notificationAdapter.resetCountHelper();
    }

    @Override // com.huami.message.ui.base.fragment.BaseDelegateFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        HMLog.i(s, "onCreateView", new Object[0]);
        return inflater.inflate(R.layout.mc_fragment_notifition, container, false);
    }

    @Override // com.huami.message.ui.base.fragment.BaseDelegateFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (this.visibleHint) {
            q().updateNotificationCountAsRead(Long.valueOf(this.enterTime));
        }
        this.timeoutAction.reset(this.visibleKey);
        super.onDestroy();
    }

    @Override // com.huami.message.ui.base.fragment.BaseDelegateFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.isOut = arguments == null ? false : arguments.getBoolean(MidongMessageCenterActivity.IS_OUT);
        t();
        initRecycleView();
    }

    @Override // com.huami.message.ui.base.fragment.BaseDelegateFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        this.visibleHint = isVisibleToUser;
        if (isVisibleToUser) {
            this.timeoutAction.start(this.visibleKey);
        } else if (this.timeoutAction.shouldAction(this.visibleKey)) {
            this.visibleHint = true;
        }
    }
}

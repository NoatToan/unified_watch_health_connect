package com.xiaomi.hm.health.play.health;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.event.EventAccountStatus;
import com.huami.femalehealth.uilib.helper.ExtKt;
import com.huami.mifit.analytics.helper.FragmentTrackHelper;
import com.huami.relatives.FriendsAndFamilyService;
import com.huami.relatives.event.EventFriendRemoved;
import com.huami.relatives.event.EventFriends;
import com.huami.tools.log.HMLog;
import com.huami.utils.easypermission.EasyPermissions;
import com.huami.utils.easypermission.PermissionDialogFragmentCompat;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.databinding.FragmentPlayBaseBinding;
import com.xiaomi.hm.health.homepage.status.utils.HomeAnalytics;
import com.xiaomi.hm.health.play.PlayTabType;
import com.xiaomi.hm.health.play.PlayTool;
import com.xiaomi.hm.health.play.PlayViewModel;
import com.xiaomi.hm.health.play.base.PlayBaseFragment;
import com.xiaomi.hm.health.play.bean.EventFriendFollow;
import com.xiaomi.hm.health.play.bean.EventFriendUnFollow;
import com.xiaomi.hm.health.play.bean.EventJumpToCaptureActivity;
import com.xiaomi.hm.health.play.card.CardManager;
import com.xiaomi.hm.health.play.health.HealthFragment;
import com.xiaomi.hm.health.relation.RelationServiceKt;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001=B\u0007¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0017J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bJ\u001e\u0010\"\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J\u001e\u0010#\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J/\u0010(\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u001d\u0010/\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00101R\u001d\u00107\u001a\u0002038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u00106R\u001d\u0010:\u001a\u0002088B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b4\u00109¨\u0006>"}, d2 = {"Lcom/xiaomi/hm/health/play/health/HealthFragment;", "Lcom/xiaomi/hm/health/play/base/PlayBaseFragment;", "Lcom/xiaomi/hm/health/databinding/FragmentPlayBaseBinding;", "Lcom/huami/utils/easypermission/EasyPermissions$PermissionCallbacks;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initBinding", "", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "onPause", "", "isVisibleToUser", "setUserVisibleHint", "hidden", "onHiddenChanged", "onDestroy", "Lcom/huami/relatives/event/EventFriends;", "eventFriends", "onEvent", "Lcom/huami/relatives/event/EventFriendRemoved;", "Lcom/xiaomi/hm/health/play/bean/EventFriendUnFollow;", "message", "Lcom/xiaomi/hm/health/play/bean/EventFriendFollow;", "Lcom/xiaomi/hm/health/play/bean/EventJumpToCaptureActivity;", "event", "", "requestCode", "", "", "perms", "onPermissionsGranted", "onPermissionsDenied", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/xiaomi/hm/health/play/card/CardManager;", "b", "Lkotlin/Lazy;", "c", "()Lcom/xiaomi/hm/health/play/card/CardManager;", "cardManager", "Lcom/huami/mifit/analytics/helper/FragmentTrackHelper;", "Lcom/huami/mifit/analytics/helper/FragmentTrackHelper;", "trackHelper", "Lcom/xiaomi/hm/health/play/PlayViewModel;", GoogleApiAvailabilityLight.a, "e", "()Lcom/xiaomi/hm/health/play/PlayViewModel;", "playViewModel", "Lcom/xiaomi/hm/health/play/health/HealthViewModel;", "()Lcom/xiaomi/hm/health/play/health/HealthViewModel;", "healthViewModel", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthFragment extends PlayBaseFragment<FragmentPlayBaseBinding> implements EasyPermissions.PermissionCallbacks {

    @NotNull
    private static final String f = "HealthFragment";
    private static final int g = 10;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy cardManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final FragmentTrackHelper trackHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy playViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy healthViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/play/card/CardManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<CardManager> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CardManager invoke() {
            return new CardManager(HealthFragment.this.requireContext(), HealthFragment.this.requireActivity());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<PlayTool> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<PlayTool> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toolLiveData get Health tools:  " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ EventAccountStatus a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EventAccountStatus eventAccountStatus) {
            super(0);
            this.a = eventAccountStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loginLiveData " + this.a.getStatus();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ EventFriendUnFollow b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EventFriendUnFollow eventFriendUnFollow) {
            super(0);
            this.b = eventFriendUnFollow;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HealthFragment.this.d().removeFriendData(this.b.getFromUid());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "duration", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Long, Unit> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            HomeAnalytics.analyticsVisibleTime("health", j);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HomeAnalytics.analysisTabVisible("health");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthFragment() {
        super(R.layout.fragment_play_base);
        this.cardManager = LazyKt__LazyJVMKt.lazy(new a());
        this.trackHelper = new FragmentTrackHelper(this, e.a, f.a);
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.health.HealthFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.playViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PlayViewModel>() { // from class: com.xiaomi.hm.health.play.health.HealthFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.play.PlayViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PlayViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(PlayViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.health.HealthFragment$special$$inlined$sharedViewModel$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.healthViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<HealthViewModel>() { // from class: com.xiaomi.hm.health.play.health.HealthFragment$special$$inlined$sharedViewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.play.health.HealthViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HealthViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(HealthViewModel.class), function1, objArr3);
            }
        });
    }

    private final CardManager c() {
        return (CardManager) this.cardManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HealthViewModel d() {
        return (HealthViewModel) this.healthViewModel.getValue();
    }

    private final PlayViewModel e() {
        return (PlayViewModel) this.playViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(HealthFragment healthFragment, List list) {
        healthFragment.c().updateCardUi(list, PlayTabType.HEALTH);
        HMLog.info(f, new b(list));
        AppCompatTextView appCompatTextView = healthFragment.getBinding().playEmptyView;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PlayTool) obj).isShow()) {
                arrayList.add(obj);
            }
        }
        appCompatTextView.setVisibility(arrayList.size() <= 1 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(HealthFragment healthFragment, EventAccountStatus eventAccountStatus) {
        if (eventAccountStatus == null) {
            return;
        }
        HMLog.info(f, new c(eventAccountStatus));
        if (eventAccountStatus.getStatus() == 2) {
            healthFragment.e().loadSupportSorTools(PlayTabType.HEALTH);
        }
    }

    @Override // com.xiaomi.hm.health.play.base.PlayBaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.play.base.PlayBaseFragment
    public void initView() {
        View view = getBinding().statusBar;
        ViewGroup.LayoutParams layoutParams = getBinding().statusBar.getLayoutParams();
        layoutParams.height = BaseTitleActivity.getStatusBarHeight(requireContext());
        Unit unit = Unit.INSTANCE;
        view.setLayoutParams(layoutParams);
        FrameLayout frameLayout = getBinding().container;
        RecyclerView cardContainer = c().getCardContainer();
        cardContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(cardContainer);
        e().getHealthLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: zv3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthFragment.f(this.a, (List) obj);
            }
        });
        e().getLoginLiveData().observe(this, new Observer() { // from class: yv3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthFragment.g(this.a, (EventAccountStatus) obj);
            }
        });
        e().loadSupportSorTools(PlayTabType.HEALTH);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public final void onEvent(@NotNull EventFriends eventFriends) {
        d().loadFriendListData(eventFriends.getJsonStr());
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        this.trackHelper.trackOnHiddenChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.trackHelper.trackOnPause();
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsDenied(int requestCode, @NotNull List<String> perms) {
        if (requestCode == 10 && EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
            new PermissionDialogFragmentCompat.Builder().setMessage(getString(R.string.relatives_permision_tip)).create().show(getChildFragmentManager(), "");
        }
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsGranted(int requestCode, @NotNull List<String> perms) {
        FragmentActivity activity;
        if (requestCode != 10 || (activity = getActivity()) == null) {
            return;
        }
        RelationServiceKt.getRelationService().jumpToCaptureActivity(activity);
    }

    @Override // androidx.fragment.app.Fragment, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.trackHelper.trackOnResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        this.trackHelper.trackOnUserVisibleHint();
    }

    @Override // com.xiaomi.hm.health.play.base.PlayBaseFragment
    @NotNull
    public FragmentPlayBaseBinding initBinding(@NotNull View view) {
        return FragmentPlayBaseBinding.bind(view);
    }

    public final void onEvent(@NotNull EventFriendRemoved eventFriends) {
        if (eventFriends.code == 1) {
            d().removeFriendData(eventFriends.uid);
        }
    }

    public final void onEvent(@NotNull EventFriendUnFollow message) {
        ExtKt.runOnUiThread(new d(message));
    }

    public final void onEvent(@NotNull EventFriendFollow message) {
        FriendsAndFamilyService.DefaultImpls.requestFriendListData$default(RelationServiceKt.getRelationService(), 0, 10, true, false, true, false, 40, null);
    }

    public final void onEvent(@NotNull EventJumpToCaptureActivity event) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (EasyPermissions.hasPermissions(activity, "android.permission.CAMERA")) {
            RelationServiceKt.getRelationService().jumpToCaptureActivity(activity);
        } else {
            EasyPermissions.requestPermissions(this, activity.getString(R.string.relatives_permision_tip), 10, "tool_scan_qr_code", "android.permission.CAMERA");
        }
    }
}

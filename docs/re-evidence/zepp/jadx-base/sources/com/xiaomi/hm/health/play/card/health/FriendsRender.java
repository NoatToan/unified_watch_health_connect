package com.xiaomi.hm.health.play.card.health;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.lib.view.ViewUtils;
import com.huami.relatives.FriendsAndFamilyService;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.databases.model.Friend;
import com.xiaomi.hm.health.databinding.LayoutToolFriendsBinding;
import com.xiaomi.hm.health.play.bean.EventJumpToCaptureActivity;
import com.xiaomi.hm.health.play.card.AbstractCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.play.card.health.FriendsRender;
import com.xiaomi.hm.health.play.health.HealthViewModel;
import com.xiaomi.hm.health.relation.RelationServiceKt;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import com.xiaomi.hm.health.view.ToolFriendPopupWindow;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020%0)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/play/card/health/FriendsRender;", "Lcom/xiaomi/hm/health/play/card/AbstractCardRender;", "Lcom/xiaomi/hm/health/databinding/LayoutToolFriendsBinding;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "r", "Landroidx/appcompat/widget/AppCompatTextView;", "toolFriendsAdd", "x", DTransferConstants.SEARCH_KEY, "onClear", "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "onCardClick", "setUiData", "Landroidx/lifecycle/LifecycleOwner;", "g", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/xiaomi/hm/health/play/health/HealthViewModel;", "h", "Lkotlin/Lazy;", b.r, "()Lcom/xiaomi/hm/health/play/health/HealthViewModel;", "healthViewModel", "Landroidx/fragment/app/FragmentActivity;", "i", "Landroidx/fragment/app/FragmentActivity;", "mActivity", "", "Lcom/xiaomi/hm/health/databases/model/Friend;", z.j, "Ljava/util/List;", "mFriendsList", "Ljava/util/Comparator;", hl.k, "Ljava/util/Comparator;", "comparator", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FriendsRender extends AbstractCardRender<LayoutToolFriendsBinding> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy healthViewModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private FragmentActivity mActivity;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private List<Friend> mFriendsList;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Comparator<Friend> comparator;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/Friend;", "currentFriend", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Friend, Boolean> {
        public final /* synthetic */ Friend a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Friend friend) {
            super(1);
            this.a = friend;
        }

        public final boolean a(@NotNull Friend friend) {
            return Intrinsics.areEqual(friend.uid, this.a.uid);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Friend friend) {
            return Boolean.valueOf(a(friend));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendsRender(@NotNull LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
        final ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.card.health.FriendsRender$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks2 = componentCallbacks;
                return companion.from((ViewModelStoreOwner) componentCallbacks2, componentCallbacks2 instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks2 : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.healthViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<HealthViewModel>() { // from class: com.xiaomi.hm.health.play.card.health.FriendsRender$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.play.health.HealthViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final HealthViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(componentCallbacks, qualifier, Reflection.getOrCreateKotlinClass(HealthViewModel.class), function0, objArr);
            }
        });
        this.mFriendsList = new ArrayList();
        this.comparator = new Comparator() { // from class: xb2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return FriendsRender.o((Friend) obj, (Friend) obj2);
            }
        };
        if (lifecycleOwner instanceof FragmentActivity) {
            this.mActivity = (FragmentActivity) lifecycleOwner;
        }
        p().getFriendsLiveData().observe(lifecycleOwner, new Observer() { // from class: vb2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) throws JSONException {
                FriendsRender.m(this.a, (String) obj);
            }
        });
        p().getRemoveFriendLiveData().observe(lifecycleOwner, new Observer() { // from class: wb2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FriendsRender.n(this.a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(FriendsRender friendsRender, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        List<Friend> list = (List) new Gson().fromJson(jSONObject.getString("friends"), new TypeToken<List<? extends Friend>>() { // from class: com.xiaomi.hm.health.play.card.health.FriendsRender$1$friendList$1
        }.getType());
        if (list != null) {
            Collections.sort(list, friendsRender.comparator);
            if (jSONObject.getBoolean(WebAPI.PARAM_IS_REFRESH)) {
                friendsRender.mFriendsList.clear();
            }
            for (Friend friend : list) {
                h.removeAll((List) friendsRender.mFriendsList, (Function1) new a(friend));
                friendsRender.mFriendsList.add(friend);
            }
        } else {
            friendsRender.mFriendsList.clear();
        }
        friendsRender.updateUi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(FriendsRender friendsRender, String str) {
        for (Friend friend : friendsRender.mFriendsList) {
            if (Intrinsics.areEqual(friend.uid, str)) {
                friendsRender.mFriendsList.remove(friend);
                friendsRender.updateUi();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(Friend friend, Friend friend2) {
        return friend.createTime.longValue() > friend2.createTime.longValue() ? -1 : 1;
    }

    private final HealthViewModel p() {
        return (HealthViewModel) this.healthViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        EventBus.getDefault().post(new EventJumpToCaptureActivity());
    }

    private final void r(final Context context) {
        final LayoutToolFriendsBinding binding = getBinding();
        binding.toolFriendsScan.setOnClickListener(new View.OnClickListener() { // from class: qb2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendsRender.u(this.a, view);
            }
        });
        binding.toolFriendsQrcode.setOnClickListener(new View.OnClickListener() { // from class: rb2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendsRender.v(this.a, view);
            }
        });
        binding.toolFriendsInvite.setOnClickListener(new View.OnClickListener() { // from class: tb2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendsRender.w(this.a, view);
            }
        });
        binding.toolFriendsMore.setOnClickListener(new View.OnClickListener() { // from class: sb2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendsRender.s(this.a, view);
            }
        });
        binding.toolFriendsAdd.setOnClickListener(new View.OnClickListener() { // from class: ub2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendsRender.t(this.a, context, binding, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(FriendsRender friendsRender, View view) {
        FragmentActivity fragmentActivity;
        if (PolicyTipUtil.anonymousPolicyApi().showLoginIfNeeded() || (fragmentActivity = friendsRender.mActivity) == null) {
            return;
        }
        fragmentActivity.startActivity(RelationServiceKt.getRelationService().friendActivityIntent(fragmentActivity));
        friendsRender.recordClickEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(FriendsRender friendsRender, Context context, LayoutToolFriendsBinding layoutToolFriendsBinding, View view) {
        if (PolicyTipUtil.anonymousPolicyApi().showLoginIfNeeded()) {
            return;
        }
        friendsRender.x(context, layoutToolFriendsBinding.toolFriends);
        friendsRender.recordClickEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(FriendsRender friendsRender, View view) {
        if (PolicyTipUtil.anonymousPolicyApi().showLoginIfNeeded()) {
            return;
        }
        friendsRender.q();
        friendsRender.recordClickEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(FriendsRender friendsRender, View view) {
        FragmentActivity fragmentActivity;
        if (PolicyTipUtil.anonymousPolicyApi().showLoginIfNeeded() || (fragmentActivity = friendsRender.mActivity) == null) {
            return;
        }
        RelationServiceKt.getRelationService().showQrCode(fragmentActivity);
        friendsRender.recordClickEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(FriendsRender friendsRender, View view) {
        FragmentActivity fragmentActivity;
        if (PolicyTipUtil.anonymousPolicyApi().showLoginIfNeeded() || (fragmentActivity = friendsRender.mActivity) == null) {
            return;
        }
        RelationServiceKt.getRelationService().shareFriendInvite(fragmentActivity);
        friendsRender.recordClickEvent();
    }

    private final void x(Context context, AppCompatTextView toolFriendsAdd) {
        ToolFriendPopupWindow toolFriendPopupWindow = new ToolFriendPopupWindow(context);
        toolFriendPopupWindow.showAsDropDown(toolFriendsAdd, (int) ViewUtils.dp2px(context, 71.0f), (int) ViewUtils.dp2px(context, 8.0f), GravityCompat.END);
        toolFriendPopupWindow.setOnItemClickListener(new ToolFriendPopupWindow.OnItemClickListener() { // from class: com.xiaomi.hm.health.play.card.health.FriendsRender$showFriendAddPop$1
            @Override // com.xiaomi.hm.health.view.ToolFriendPopupWindow.OnItemClickListener
            public void onInviteClick() {
                FragmentActivity fragmentActivity = this.a.mActivity;
                if (fragmentActivity == null) {
                    return;
                }
                FriendsRender friendsRender = this.a;
                RelationServiceKt.getRelationService().shareFriendInvite(fragmentActivity);
                friendsRender.recordClickEvent();
            }

            @Override // com.xiaomi.hm.health.view.ToolFriendPopupWindow.OnItemClickListener
            public void onQrCodeClick() {
                FragmentActivity fragmentActivity = this.a.mActivity;
                if (fragmentActivity == null) {
                    return;
                }
                FriendsRender friendsRender = this.a;
                RelationServiceKt.getRelationService().showQrCode(fragmentActivity);
                friendsRender.recordClickEvent();
            }

            @Override // com.xiaomi.hm.health.view.ToolFriendPopupWindow.OnItemClickListener
            public void onScanClick() {
                this.a.q();
                this.a.recordClickEvent();
            }
        });
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void initData(@NotNull Context context, @NotNull CardUiData uiParams) {
        super.initData(context, uiParams);
        r(context);
        if (PolicyTipUtil.isNeedIntercept()) {
            return;
        }
        FriendsAndFamilyService.DefaultImpls.requestFriendListData$default(RelationServiceKt.getRelationService(), 0, 10, true, false, true, false, 40, null);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void onCardClick(@NotNull Context context, @NotNull CardUiData uiParams) {
        if (PolicyTipUtil.anonymousPolicyApi().isAnonymousUser()) {
            return;
        }
        super.onCardClick(context, uiParams);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender, com.xiaomi.hm.health.play.card.ICardRender
    public void onClear() {
        super.onClear();
        p().getFriendsLiveData().removeObservers(this.lifecycleOwner);
        p().getRemoveFriendLiveData().removeObservers(this.lifecycleOwner);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void setUiData(@NotNull final Context context, @NotNull CardUiData uiParams) {
        LayoutToolFriendsBinding binding = getBinding();
        int size = this.mFriendsList.size();
        if (size > 0) {
            binding.toolFriendsAdd.setVisibility(0);
            binding.toolFriendsAddIcon.setVisibility(0);
            binding.toolNoFriendsLayout.setVisibility(8);
            binding.toolFriendsLayout.setVisibility(0);
        } else {
            binding.toolFriendsAdd.setVisibility(8);
            binding.toolFriendsAddIcon.setVisibility(8);
            binding.toolNoFriendsLayout.setVisibility(0);
            binding.toolFriendsLayout.setVisibility(8);
        }
        if (size > 3) {
            binding.toolFriendsMore.setVisibility(0);
            binding.view1.setVisibility(0);
        } else {
            binding.toolFriendsMore.setVisibility(8);
            binding.view1.setVisibility(8);
        }
        binding.toolFriendsRecyclerview.setLayoutManager(new LinearLayoutManager(context) { // from class: com.xiaomi.hm.health.play.card.health.FriendsRender$setUiData$1$layoutManager$1
            public final /* synthetic */ Context a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context);
                this.a = context;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        FriendsAdapter friendsAdapter = new FriendsAdapter(context, this.mFriendsList);
        binding.toolFriendsRecyclerview.setAdapter(friendsAdapter);
        friendsAdapter.setOnItemClickListener(new OnFriendsItemClickListener() { // from class: com.xiaomi.hm.health.play.card.health.FriendsRender$setUiData$1$1
            @Override // com.xiaomi.hm.health.play.card.health.OnFriendsItemClickListener
            public void onItemClick(int position) {
                FragmentActivity fragmentActivity = this.a.mActivity;
                if (fragmentActivity == null) {
                    return;
                }
                FriendsRender friendsRender = this.a;
                RelationServiceKt.getRelationService().jumpToDetailActivity(fragmentActivity, new Gson().toJson(friendsRender.mFriendsList.get(position)));
                friendsRender.recordClickEvent();
            }
        });
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public LayoutToolFriendsBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return LayoutToolFriendsBinding.inflate(inflater, rootView, true);
    }
}

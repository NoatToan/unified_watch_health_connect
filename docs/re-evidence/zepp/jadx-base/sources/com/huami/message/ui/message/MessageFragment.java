package com.huami.message.ui.message;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.message.di.koin.ScopesAndQualifersKt;
import com.huami.message.dto.MessageStatus;
import com.huami.message.navigation.ExternalNavigator;
import com.huami.message.navigation.MessageNavigator;
import com.huami.message.ui.R;
import com.huami.message.ui.base.fragment.BaseDelegateFragment;
import com.huami.message.ui.base.fragmentdelegate.LoadDataOnVisibleOnce;
import com.huami.message.ui.message.MessageFragment;
import com.huami.message.ui.widget.CustomSmartRefreshLayout;
import com.huami.message.ui.widget.FavoriteClassicsFooter;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.message.viewmodel.MessageCountViewModel;
import com.huami.message.vo.PrivateMessageItemVo;
import com.huami.message.vo.UnreadMessageVo;
import com.huami.tools.log.HMLog;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import java.util.Objects;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0006\u0010\n\u001a\u00020\tJ&\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/huami/message/ui/message/MessageFragment;", "Lcom/huami/message/ui/base/fragment/BaseDelegateFragment;", "", b.r, "u", "G", "E", "F", SOAP.XMLNS, "Lcom/huami/message/ui/message/MessageAdapter;", "getMessageAdapter", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/message/ui/message/MessageViewModel;", "b", "Lkotlin/Lazy;", "o", "()Lcom/huami/message/ui/message/MessageViewModel;", "viewModel", "Lcom/huami/message/viewmodel/MessageCountViewModel;", "c", "m", "()Lcom/huami/message/viewmodel/MessageCountViewModel;", "messageCountViewModel", "Lcom/huami/message/navigation/ExternalNavigator;", GoogleApiAvailabilityLight.a, GoogleApiAvailabilityLight.b, "()Lcom/huami/message/navigation/ExternalNavigator;", "navigator", "e", "Lcom/huami/message/ui/message/MessageAdapter;", "adapter", "<init>", "()V", "Companion", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class MessageFragment extends BaseDelegateFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String f = "MsgCenterFragment";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy messageCountViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private MessageAdapter adapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/message/ui/message/MessageFragment$Companion;", "", "Lcom/huami/message/ui/message/MessageFragment;", "newInstance", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MessageFragment newInstance() {
            return new MessageFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.ERROR.ordinal()] = 1;
            iArr[Status.SUCCESS.ordinal()] = 2;
            iArr[Status.LOADING.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "Lcom/huami/message/vo/PrivateMessageItemVo;", "item", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<Integer, PrivateMessageItemVo, Unit> {
        public a() {
            super(2);
        }

        public final void a(int i, @NotNull PrivateMessageItemVo privateMessageItemVo) {
            Context context = MessageFragment.this.getContext();
            if (context == null) {
                return;
            }
            MessageFragment messageFragment = MessageFragment.this;
            if (privateMessageItemVo.getUserId() == null || privateMessageItemVo.getNickName() == null) {
                return;
            }
            messageFragment.n().navigateToPrivateMsgActivity(context, privateMessageItemVo.getUserId(), privateMessageItemVo.getNickName(), "messagebox");
            MessageRecorderEventHelper.MessageCenterEventHelper.INSTANCE.messageChatClick(privateMessageItemVo.getUserId());
            if (privateMessageItemVo.getMsgStatus() == null || privateMessageItemVo.getMsgStatus() != MessageStatus.NEW || privateMessageItemVo.getCount() == null) {
                return;
            }
            messageFragment.m().markChatMessage(String.valueOf(privateMessageItemVo.getId()), privateMessageItemVo.getCount().intValue());
            messageFragment.o().updatePrivateMsgStatus(privateMessageItemVo);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, PrivateMessageItemVo privateMessageItemVo) {
            a(num.intValue(), privateMessageItemVo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.message.ui.message.MessageFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MessageViewModel>() { // from class: com.huami.message.ui.message.MessageFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.message.ui.message.MessageViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MessageViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(MessageViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.message.ui.message.MessageFragment$special$$inlined$viewModel$default$3
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
        this.messageCountViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MessageCountViewModel>() { // from class: com.huami.message.ui.message.MessageFragment$special$$inlined$viewModel$default$4
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
        this.navigator = LazyKt__LazyJVMKt.lazy(new Function0<ExternalNavigator>() { // from class: com.huami.message.ui.message.MessageFragment$special$$inlined$injectInMc$default$1
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
        addDelegate(new LoadDataOnVisibleOnce() { // from class: com.huami.message.ui.message.MessageFragment.1
            @Override // com.huami.message.ui.base.fragmentdelegate.LoadDataOnVisibleOnce
            public void loadDataOnVisibleOnce() {
                MessageFragment.this.u();
                MessageFragment.this.o().initRefresh();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(Resource resource) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(MessageFragment messageFragment, Resource resource) {
        if (resource != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            if (i == 1) {
                View view = messageFragment.getView();
                ((CustomSmartRefreshLayout) (view != null ? view.findViewById(R.id.refreshLayout) : null)).finishRefresh(false);
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                View view2 = messageFragment.getView();
                ((CustomSmartRefreshLayout) (view2 != null ? view2.findViewById(R.id.refreshLayout) : null)).startRefreshingAnim();
                return;
            }
            View view3 = messageFragment.getView();
            ((CustomSmartRefreshLayout) (view3 != null ? view3.findViewById(R.id.refreshLayout) : null)).finishRefresh(true);
            MessageAdapter messageAdapter = messageFragment.adapter;
            Objects.requireNonNull(messageAdapter);
            messageAdapter.refresh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(MessageFragment messageFragment, Resource resource) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            View view = messageFragment.getView();
            ((CustomSmartRefreshLayout) (view != null ? view.findViewById(R.id.refreshLayout) : null)).finishLoadmore(false);
        } else if (i == 2) {
            View view2 = messageFragment.getView();
            ((CustomSmartRefreshLayout) (view2 != null ? view2.findViewById(R.id.refreshLayout) : null)).finishLoadmore(true);
        } else {
            if (i != 3) {
                return;
            }
            View view3 = messageFragment.getView();
            ((CustomSmartRefreshLayout) (view3 == null ? null : view3.findViewById(R.id.refreshLayout))).setEnableLoadmore(true);
            View view4 = messageFragment.getView();
            ((CustomSmartRefreshLayout) (view4 != null ? view4.findViewById(R.id.refreshLayout) : null)).startFootRefreshingAnim();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(MessageFragment messageFragment, Resource resource) {
        messageFragment.E();
    }

    private final void E() {
        HMLog.d(f, "showEmptyUI", new Object[0]);
    }

    private final void F() {
        HMLog.d(f, "showNetworkErrorUI", new Object[0]);
    }

    private final void G() {
        HMLog.d(f, "showNormalUI", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MessageCountViewModel m() {
        return (MessageCountViewModel) this.messageCountViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExternalNavigator n() {
        return (ExternalNavigator) this.navigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MessageViewModel o() {
        return (MessageViewModel) this.viewModel.getValue();
    }

    private final void p() {
        this.adapter = new MessageAdapter(new a());
        View view = getView();
        RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.recycler_view));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        MessageAdapter messageAdapter = this.adapter;
        Objects.requireNonNull(messageAdapter);
        recyclerView.setAdapter(messageAdapter);
        VerticalLinearSpacingDecoration verticalLinearSpacingDecoration = new VerticalLinearSpacingDecoration(recyclerView.getContext(), 1, 0, 0, 0, 0, 1, 60, null);
        Drawable drawable = ContextCompat.getDrawable(recyclerView.getContext(), R.drawable.mc_msg_item_divider);
        if (drawable != null) {
            verticalLinearSpacingDecoration.setDrawable(drawable);
        }
        recyclerView.addItemDecoration(verticalLinearSpacingDecoration);
        MessageAdapter messageAdapter2 = this.adapter;
        Objects.requireNonNull(messageAdapter2);
        final View mHeaderView = messageAdapter2.getMHeaderView();
        boolean z = mHeaderView == null;
        if (z) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            int i = R.layout.mc_message_header;
            View view2 = getView();
            mHeaderView = layoutInflaterFrom.inflate(i, (ViewGroup) (view2 != null ? view2.findViewById(R.id.recycler_view) : null), false);
            ConstraintLayout constraintLayout = (ConstraintLayout) mHeaderView.findViewById(R.id.cl_like);
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: l15
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        MessageFragment.q(mHeaderView, view3);
                    }
                });
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mHeaderView.findViewById(R.id.cl_comment);
            if (constraintLayout2 != null) {
                constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: i15
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        MessageFragment.r(mHeaderView, view3);
                    }
                });
            }
        }
        if (z) {
            MessageAdapter messageAdapter3 = this.adapter;
            Objects.requireNonNull(messageAdapter3);
            messageAdapter3.setHeaderView(mHeaderView);
        }
        m().loadMessageCntVo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(View view, View view2) {
        MessageNavigator.INSTANCE.navigateToSubMessageActivity(view.getContext(), 1);
        MessageRecorderEventHelper.MessageCenterEventHelper.INSTANCE.awesomeAttentionCollectionClick(((TextView) view.findViewById(R.id.tv_red_dot_like)).getTag().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(View view, View view2) {
        MessageNavigator.INSTANCE.navigateToSubMessageActivity(view.getContext(), 2);
        MessageRecorderEventHelper.MessageCenterEventHelper.INSTANCE.commentReplyClick(((TextView) view.findViewById(R.id.tv_red_dot_comment)).getTag().toString());
    }

    private final void s() {
        View view = getView();
        CustomSmartRefreshLayout customSmartRefreshLayout = (CustomSmartRefreshLayout) (view == null ? null : view.findViewById(R.id.refreshLayout));
        customSmartRefreshLayout.setEnableLoadmore(false);
        customSmartRefreshLayout.setEnableRefresh(true);
        customSmartRefreshLayout.setOnRefreshListener(new OnRefreshListener() { // from class: k15
            @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
            public final void onRefresh(RefreshLayout refreshLayout) {
                MessageFragment.t(this.a, refreshLayout);
            }
        });
        customSmartRefreshLayout.setRefreshFooter((RefreshFooter) new FavoriteClassicsFooter(customSmartRefreshLayout.getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(MessageFragment messageFragment, RefreshLayout refreshLayout) {
        MessageAdapter messageAdapter = messageFragment.adapter;
        Objects.requireNonNull(messageAdapter);
        messageAdapter.resetCountHelper();
        messageFragment.o().refresh();
        messageFragment.m().loadMessageCntVo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        o().getPagedList().observe(this, new Observer() { // from class: m15
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MessageFragment.z(this.a, (PagedList) obj);
            }
        });
        o().initRefreshState().observe(this, new Observer() { // from class: t15
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MessageFragment.A((Resource) obj);
            }
        });
        o().getRefreshState().observe(this, new Observer() { // from class: s15
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MessageFragment.B(this.a, (Resource) obj);
            }
        });
        o().getNetworkState().observe(this, new Observer() { // from class: n15
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MessageFragment.C(this.a, (Resource) obj);
            }
        });
        LiveData<Resource<Unit>> loadEmptyDataState = o().getLoadEmptyDataState();
        if (loadEmptyDataState != null) {
            loadEmptyDataState.observe(this, new Observer() { // from class: q15
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    MessageFragment.D(this.a, (Resource) obj);
                }
            });
        }
        LiveData<Resource<Unit>> loadMoreFinishedState = o().getLoadMoreFinishedState();
        if (loadMoreFinishedState != null) {
            loadMoreFinishedState.observe(this, new Observer() { // from class: o15
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    MessageFragment.v(this.a, (Resource) obj);
                }
            });
        }
        LiveData<Resource<Unit>> loadFirstPagingErrorState = o().getLoadFirstPagingErrorState();
        if (loadFirstPagingErrorState != null) {
            loadFirstPagingErrorState.observe(this, new Observer() { // from class: p15
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    MessageFragment.w(this.a, (Resource) obj);
                }
            });
        }
        m().getChatMsgUpdateResult().observe(this, new Observer() { // from class: j15
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MessageFragment.x((Resource) obj);
            }
        });
        m().getMessageCntVoResult().observe(this, new Observer() { // from class: r15
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MessageFragment.y(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(MessageFragment messageFragment, Resource resource) {
        View view = messageFragment.getView();
        ((CustomSmartRefreshLayout) (view == null ? null : view.findViewById(R.id.refreshLayout))).setLoadmoreFinished(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(MessageFragment messageFragment, Resource resource) {
        messageFragment.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(Resource resource) {
        HMLog.d(f, Intrinsics.stringPlus("mark chat, chatMsgUpdateResult=", resource.getStatus()), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(MessageFragment messageFragment, Resource resource) {
        if (resource != null && resource.getStatus() == Status.SUCCESS) {
            MessageAdapter messageAdapter = messageFragment.adapter;
            Objects.requireNonNull(messageAdapter);
            UnreadMessageVo unreadMessageVo = (UnreadMessageVo) resource.getData();
            messageAdapter.setPraiseFavCollectRedDotVisible(unreadMessageVo == null ? null : unreadMessageVo.getPraiseFavFollowCnt());
            MessageAdapter messageAdapter2 = messageFragment.adapter;
            Objects.requireNonNull(messageAdapter2);
            UnreadMessageVo unreadMessageVo2 = (UnreadMessageVo) resource.getData();
            messageAdapter2.setCommentRedDotVisible(unreadMessageVo2 != null ? unreadMessageVo2.getCommentReplyCnt() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(MessageFragment messageFragment, PagedList pagedList) {
        messageFragment.G();
        MessageAdapter messageAdapter = messageFragment.adapter;
        Objects.requireNonNull(messageAdapter);
        messageAdapter.submitList(pagedList);
    }

    @Override // com.huami.message.ui.base.fragment.BaseDelegateFragment
    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final MessageAdapter getMessageAdapter() {
        MessageAdapter messageAdapter = this.adapter;
        Objects.requireNonNull(messageAdapter);
        return messageAdapter;
    }

    @Override // com.huami.message.ui.base.fragment.BaseDelegateFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        HMLog.i(f, "onCreateView", new Object[0]);
        return inflater.inflate(R.layout.mc_fragment_message, container, false);
    }

    @Override // com.huami.message.ui.base.fragment.BaseDelegateFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        s();
        p();
    }
}

package com.huami.message.ui.submessage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.message.di.koin.ScopesAndQualifersKt;
import com.huami.message.dto.MessageSubType;
import com.huami.message.navigation.ExternalNavigator;
import com.huami.message.repo.MessageCountRepo;
import com.huami.message.ui.R;
import com.huami.message.ui.base.dialog.LoadingDialogHelper;
import com.huami.message.ui.base.fragment.BaseDelegateFragment;
import com.huami.message.ui.base.fragmentdelegate.LoadDataOnVisibleOnce;
import com.huami.message.ui.message.VerticalLinearSpacingDecoration;
import com.huami.message.ui.submessage.SubMessageFragment;
import com.huami.message.ui.widget.CustomSmartRefreshLayout;
import com.huami.message.ui.widget.FavoriteClassicsFooter;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.message.viewmodel.MessageCountViewModel;
import com.huami.message.vo.SubMessageItemVo;
import com.huami.tools.log.HMLog;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
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
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\bR\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\nR\u001d\u0010:\u001a\u0002068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u0019\u001a\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/huami/message/ui/submessage/SubMessageFragment;", "Lcom/huami/message/ui/base/fragment/BaseDelegateFragment;", "", SOAP.XMLNS, "v", "Lcom/huami/android/vo/Resource;", "", "resource", LogUtil.I, "L", "J", "K", "t", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/message/ui/submessage/SubMessageViewModel;", "b", "Lkotlin/Lazy;", "r", "()Lcom/huami/message/ui/submessage/SubMessageViewModel;", "viewModel", "Lcom/huami/message/repo/MessageCountRepo;", "c", "o", "()Lcom/huami/message/repo/MessageCountRepo;", "messageCntRepo", "Lcom/huami/message/viewmodel/MessageCountViewModel;", GoogleApiAvailabilityLight.a, com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/message/viewmodel/MessageCountViewModel;", "messageCntViewModel", "Lcom/huami/message/navigation/ExternalNavigator;", "e", DTransferConstants.SEARCH_KEY, "()Lcom/huami/message/navigation/ExternalNavigator;", "navigator", "Lcom/huami/message/ui/submessage/SubMessageAdapter;", "f", "Lcom/huami/message/ui/submessage/SubMessageAdapter;", "adapter", "", "g", "subType", "", "h", "enterTime", "Lcom/huami/message/ui/base/dialog/LoadingDialogHelper;", "i", GoogleApiAvailabilityLight.b, "()Lcom/huami/message/ui/base/dialog/LoadingDialogHelper;", "loadingDialogHelper", "<init>", "()V", "Companion", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class SubMessageFragment extends BaseDelegateFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String j = "SubMessageFragment";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy messageCntRepo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy messageCntViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private SubMessageAdapter adapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int subType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long enterTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingDialogHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/message/ui/submessage/SubMessageFragment$Companion;", "", "", "subType", "", "enterTime", "Lcom/huami/message/ui/submessage/SubMessageFragment;", "create", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SubMessageFragment create(int subType, long enterTime) {
            SubMessageFragment subMessageFragment = new SubMessageFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(SubMessageActivity.EXTRA_SUB_TYPE, subType);
            bundle.putLong(SubMessageActivity.EXTRA_ENTER_TIME, enterTime);
            subMessageFragment.setArguments(bundle);
            return subMessageFragment;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "Lcom/huami/message/vo/SubMessageItemVo;", "item", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<Integer, SubMessageItemVo, Unit> {
        public a() {
            super(2);
        }

        public final void a(int i, @NotNull SubMessageItemVo subMessageItemVo) {
            Context context = SubMessageFragment.this.getContext();
            if (context == null) {
                return;
            }
            SubMessageFragment subMessageFragment = SubMessageFragment.this;
            MessageSubType messageSubType = subMessageItemVo.getMessageSubType();
            String strCommentDetailTp = MessageRecorderEventHelper.CommentDetialHelper.INSTANCE.commentDetailTp(messageSubType);
            if ((MessageSubType.AGREE_COMMENT == messageSubType || MessageSubType.AGREE_SECOND_COMMENT == messageSubType || MessageSubType.COMMENT == messageSubType || MessageSubType.REPLY_COMMENT == messageSubType || MessageSubType.REPLY_SECOND_COMMENT == messageSubType) && !TextUtils.isEmpty(subMessageItemVo.getFromPostId()) && !TextUtils.isEmpty(subMessageItemVo.getFromFirstCommentId())) {
                subMessageFragment.q().navigateToCommentDetail(context, subMessageItemVo.getFromPostId(), subMessageItemVo.getFromFirstCommentId(), subMessageItemVo.getFromSecondCommentId(), subMessageItemVo.getFolloweeId(), strCommentDetailTp);
                HMLog.d(SubMessageFragment.j, Intrinsics.stringPlus("navigateToCommentDetail->fromPostId:", subMessageItemVo.getFromPostId()), new Object[0]);
            }
            if (MessageSubType.AGREE_POST == messageSubType || MessageSubType.COLLECT == messageSubType) {
                if (!TextUtils.isEmpty(subMessageItemVo.getFromPostId())) {
                    subMessageFragment.q().startPostDetail(context, subMessageItemVo.getFromPostId(), "messagebox");
                }
                HMLog.d(SubMessageFragment.j, Intrinsics.stringPlus("startPostDetail->fromPostId:", subMessageItemVo.getFromPostId()), new Object[0]);
            }
            if (MessageSubType.FOLLOW == messageSubType) {
                subMessageFragment.q().navigateToPersonalProfile(context, subMessageItemVo.getFolloweeId(), "messagebox");
                HMLog.d(SubMessageFragment.j, Intrinsics.stringPlus("navigateToPersonalProfile->uid:", subMessageItemVo.getFolloweeId()), new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, SubMessageItemVo subMessageItemVo) {
            a(num.intValue(), subMessageItemVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "Lcom/huami/message/vo/SubMessageItemVo;", "item", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Integer, SubMessageItemVo, Unit> {
        public b() {
            super(2);
        }

        public final void a(int i, @NotNull SubMessageItemVo subMessageItemVo) {
            Context context = SubMessageFragment.this.getContext();
            if (context == null) {
                return;
            }
            SubMessageFragment.this.q().navigateToPersonalProfile(context, subMessageItemVo.getFolloweeId(), "messagebox");
            HMLog.d(SubMessageFragment.j, Intrinsics.stringPlus("navigateToPersonalProfile->uid:", subMessageItemVo.getFolloweeId()), new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, SubMessageItemVo subMessageItemVo) {
            a(num.intValue(), subMessageItemVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "Lcom/huami/message/vo/SubMessageItemVo;", "item", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Integer, SubMessageItemVo, Unit> {
        public c() {
            super(2);
        }

        public final void a(int i, @NotNull SubMessageItemVo subMessageItemVo) {
            Context context = SubMessageFragment.this.getContext();
            if (context == null) {
                return;
            }
            SubMessageFragment subMessageFragment = SubMessageFragment.this;
            String fromFirstCommentId = subMessageItemVo.getFromFirstCommentId();
            if (subMessageItemVo.getMessageSubType() == MessageSubType.REPLY_COMMENT || subMessageItemVo.getMessageSubType() == MessageSubType.REPLY_SECOND_COMMENT) {
                fromFirstCommentId = subMessageItemVo.getFromSecondCommentId();
            }
            String str = fromFirstCommentId;
            if (subMessageItemVo.getFromPostId() != null && !TextUtils.isEmpty(str)) {
                subMessageFragment.q().startCommentInputTransparent(context, subMessageItemVo.getFromPostId(), str, subMessageItemVo.getFolloweeId(), subMessageItemVo.getNickName());
            }
            HMLog.d(SubMessageFragment.j, "startCommentInputTransparent->uid:" + ((Object) subMessageItemVo.getFolloweeId()) + " postId:" + subMessageItemVo.getFromPostId() + " reCommentId:" + ((Object) str), new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, SubMessageItemVo subMessageItemVo) {
            a(num.intValue(), subMessageItemVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "Lcom/huami/message/vo/SubMessageItemVo;", "item", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function2<Integer, SubMessageItemVo, Unit> {
        public d() {
            super(2);
        }

        public final void a(int i, @NotNull SubMessageItemVo subMessageItemVo) {
            if (SubMessageFragment.this.getContext() == null) {
                return;
            }
            SubMessageFragment subMessageFragment = SubMessageFragment.this;
            subMessageFragment.r().postFollowStatus(subMessageItemVo.getFolloweeId());
            if (subMessageFragment.subType == 1) {
                MessageRecorderEventHelper.AwesomeAttentionCollectionHelper.INSTANCE.awesomeAttentionCollectionAttentionClick(subMessageItemVo.getFolloweeId(), String.valueOf(subMessageItemVo.getMessageId()));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, SubMessageItemVo subMessageItemVo) {
            a(num.intValue(), subMessageItemVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/message/ui/base/dialog/LoadingDialogHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<LoadingDialogHelper> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialogHelper getA() {
            return new LoadingDialogHelper(SubMessageFragment.this.getActivity());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubMessageFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.message.ui.submessage.SubMessageFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SubMessageViewModel>() { // from class: com.huami.message.ui.submessage.SubMessageFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.message.ui.submessage.SubMessageViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SubMessageViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SubMessageViewModel.class), function0, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.messageCntRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<MessageCountRepo>() { // from class: com.huami.message.ui.submessage.SubMessageFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.message.repo.MessageCountRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final MessageCountRepo getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(MessageCountRepo.class), objArr2, objArr3);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.message.ui.submessage.SubMessageFragment$special$$inlined$viewModel$default$3
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
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.messageCntViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MessageCountViewModel>() { // from class: com.huami.message.ui.submessage.SubMessageFragment$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.message.viewmodel.MessageCountViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final MessageCountViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr4, Reflection.getOrCreateKotlinClass(MessageCountViewModel.class), function1, objArr5);
            }
        });
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.navigator = LazyKt__LazyJVMKt.lazy(new Function0<ExternalNavigator>() { // from class: com.huami.message.ui.submessage.SubMessageFragment$special$$inlined$injectInMc$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.message.navigation.ExternalNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ExternalNavigator getA() {
                return ScopesAndQualifersKt.messageScope(org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(ExternalNavigator.class), objArr6, objArr7);
            }
        });
        this.subType = 1;
        this.enterTime = System.currentTimeMillis();
        this.loadingDialogHelper = LazyKt__LazyJVMKt.lazy(new e());
        addDelegate(new LoadDataOnVisibleOnce() { // from class: com.huami.message.ui.submessage.SubMessageFragment.1
            @Override // com.huami.message.ui.base.fragmentdelegate.LoadDataOnVisibleOnce
            public void loadDataOnVisibleOnce() {
                SubMessageFragment.this.v();
                SubMessageFragment.this.r().initRefresh();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(SubMessageFragment subMessageFragment, Resource resource) {
        View view = subMessageFragment.getView();
        ((CustomSmartRefreshLayout) (view == null ? null : view.findViewById(R.id.refreshLayout))).setLoadmoreFinished(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(SubMessageFragment subMessageFragment, Resource resource) {
        subMessageFragment.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(SubMessageFragment subMessageFragment, Resource resource) {
        LoadingDialogHelper.showOrError$default(subMessageFragment.n(), resource, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(SubMessageFragment subMessageFragment, Resource resource) {
        subMessageFragment.I(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(SubMessageFragment subMessageFragment, Resource resource) {
        subMessageFragment.I(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(SubMessageFragment subMessageFragment, PagedList pagedList) {
        if (pagedList == null) {
            return;
        }
        subMessageFragment.L();
        SubMessageAdapter subMessageAdapter = subMessageFragment.adapter;
        Objects.requireNonNull(subMessageAdapter);
        subMessageAdapter.submitList(pagedList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(SubMessageFragment subMessageFragment, Resource resource) {
        if (resource == null) {
            return;
        }
        if (WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()] == 1) {
            View view = subMessageFragment.getView();
            final RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.recycler_view));
            if (recyclerView == null) {
                return;
            }
            recyclerView.postDelayed(new Runnable() { // from class: wh7
                @Override // java.lang.Runnable
                public final void run() {
                    SubMessageFragment.H(recyclerView);
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
            r().refresh();
        }
    }

    private final void J() {
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

    private final void K() {
        HMLog.d(j, "showNetworkErrorUI", new Object[0]);
    }

    private final void L() {
        HMLog.d(j, "showNormalUI", new Object[0]);
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

    private final LoadingDialogHelper n() {
        return (LoadingDialogHelper) this.loadingDialogHelper.getValue();
    }

    private final MessageCountRepo o() {
        return (MessageCountRepo) this.messageCntRepo.getValue();
    }

    private final MessageCountViewModel p() {
        return (MessageCountViewModel) this.messageCntViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExternalNavigator q() {
        return (ExternalNavigator) this.navigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SubMessageViewModel r() {
        return (SubMessageViewModel) this.viewModel.getValue();
    }

    private final void s() {
        this.adapter = new SubMessageAdapter(new a(), new b(), new c(), new d());
        View view = getView();
        RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.recycler_view));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        SubMessageAdapter subMessageAdapter = this.adapter;
        Objects.requireNonNull(subMessageAdapter);
        recyclerView.setAdapter(subMessageAdapter);
        VerticalLinearSpacingDecoration verticalLinearSpacingDecoration = new VerticalLinearSpacingDecoration(recyclerView.getContext(), 1, 0, 0, 0, 0, 1, 60, null);
        Drawable drawable = ContextCompat.getDrawable(recyclerView.getContext(), R.drawable.mc_msg_item_divider);
        if (drawable != null) {
            verticalLinearSpacingDecoration.setDrawable(drawable);
        }
        recyclerView.addItemDecoration(verticalLinearSpacingDecoration);
    }

    private final void t() {
        View view = getView();
        CustomSmartRefreshLayout customSmartRefreshLayout = (CustomSmartRefreshLayout) (view == null ? null : view.findViewById(R.id.refreshLayout));
        customSmartRefreshLayout.setEnableLoadmore(false);
        customSmartRefreshLayout.setEnableRefresh(true);
        customSmartRefreshLayout.setOnRefreshListener(new OnRefreshListener() { // from class: uh7
            @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
            public final void onRefresh(RefreshLayout refreshLayout) {
                SubMessageFragment.u(this.a, refreshLayout);
            }
        });
        customSmartRefreshLayout.setRefreshFooter((RefreshFooter) new FavoriteClassicsFooter(customSmartRefreshLayout.getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(SubMessageFragment subMessageFragment, RefreshLayout refreshLayout) {
        SubMessageAdapter subMessageAdapter = subMessageFragment.adapter;
        Objects.requireNonNull(subMessageAdapter);
        subMessageAdapter.resetCountHelper();
        int i = subMessageFragment.subType;
        if (i == 1) {
            subMessageFragment.p().markPraiseFavCollect(subMessageFragment.enterTime);
        } else {
            if (i != 2) {
                return;
            }
            subMessageFragment.p().markCommentReply(subMessageFragment.enterTime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        Bundle arguments = getArguments();
        this.subType = arguments.getInt(SubMessageActivity.EXTRA_SUB_TYPE);
        this.enterTime = arguments.getLong(SubMessageActivity.EXTRA_ENTER_TIME);
        if (this.subType == 1) {
            r().init(SubMessageViewModel.REQ_LIKES);
        } else {
            r().init("Comment");
        }
        r().pagedList().observe(this, new Observer() { // from class: th7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SubMessageFragment.F(this.a, (PagedList) obj);
            }
        });
        r().initRefreshState().observe(this, new Observer() { // from class: yh7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SubMessageFragment.G(this.a, (Resource) obj);
            }
        });
        r().refreshState().observe(this, new Observer() { // from class: ai7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SubMessageFragment.w(this.a, (Resource) obj);
            }
        });
        r().networkState().observe(this, new Observer() { // from class: ci7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SubMessageFragment.y(this.a, (Resource) obj);
            }
        });
        r().loadEmptyDataState().observe(this, new Observer() { // from class: di7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SubMessageFragment.z(this.a, (Resource) obj);
            }
        });
        r().loadMoreFinishedState().observe(this, new Observer() { // from class: bi7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SubMessageFragment.A(this.a, (Resource) obj);
            }
        });
        r().loadFirstPagingErrorState().observe(this, new Observer() { // from class: ei7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SubMessageFragment.B(this.a, (Resource) obj);
            }
        });
        r().getFollowState().observe(this, new Observer() { // from class: xh7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SubMessageFragment.C(this.a, (Resource) obj);
            }
        });
        p().getPraiseUpdateResult().observe(this, new Observer() { // from class: fi7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SubMessageFragment.D(this.a, (Resource) obj);
            }
        });
        p().getCommentUpdateResult().observe(this, new Observer() { // from class: zh7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SubMessageFragment.E(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(SubMessageFragment subMessageFragment, Resource resource) {
        if (resource != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            if (i == 1) {
                HMLog.d(j, "refreshState SUCCESS", new Object[0]);
                View view = subMessageFragment.getView();
                final RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.recycler_view));
                if (recyclerView != null) {
                    recyclerView.postDelayed(new Runnable() { // from class: vh7
                        @Override // java.lang.Runnable
                        public final void run() {
                            SubMessageFragment.x(recyclerView);
                        }
                    }, 500L);
                    View view2 = subMessageFragment.getView();
                    ((CustomSmartRefreshLayout) (view2 != null ? view2.findViewById(R.id.refreshLayout) : null)).finishRefresh(true);
                }
                subMessageFragment.enterTime = System.currentTimeMillis();
                return;
            }
            if (i == 2) {
                HMLog.d(j, "refreshState ERROR", new Object[0]);
                View view3 = subMessageFragment.getView();
                ((CustomSmartRefreshLayout) (view3 != null ? view3.findViewById(R.id.refreshLayout) : null)).finishRefresh(false);
            } else {
                if (i != 3) {
                    return;
                }
                HMLog.d(j, "refreshState LOADING", new Object[0]);
                View view4 = subMessageFragment.getView();
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
    public static final void y(SubMessageFragment subMessageFragment, Resource resource) {
        HMLog.d(j, Intrinsics.stringPlus("networkState", resource.getStatus().name()), new Object[0]);
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            View view = subMessageFragment.getView();
            ((CustomSmartRefreshLayout) (view != null ? view.findViewById(R.id.refreshLayout) : null)).finishLoadmore(true);
        } else if (i == 2) {
            View view2 = subMessageFragment.getView();
            ((CustomSmartRefreshLayout) (view2 != null ? view2.findViewById(R.id.refreshLayout) : null)).finishLoadmore(false);
        } else {
            if (i != 3) {
                return;
            }
            View view3 = subMessageFragment.getView();
            ((CustomSmartRefreshLayout) (view3 == null ? null : view3.findViewById(R.id.refreshLayout))).setEnableLoadmore(true);
            View view4 = subMessageFragment.getView();
            ((CustomSmartRefreshLayout) (view4 != null ? view4.findViewById(R.id.refreshLayout) : null)).startFootRefreshingAnim();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(SubMessageFragment subMessageFragment, Resource resource) {
        subMessageFragment.J();
    }

    @Override // com.huami.message.ui.base.fragment.BaseDelegateFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.message.ui.base.fragment.BaseDelegateFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        HMLog.i(j, "onCreateView", new Object[0]);
        return inflater.inflate(R.layout.mc_fragment_message, container, false);
    }

    @Override // com.huami.message.ui.base.fragment.BaseDelegateFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        t();
        s();
    }
}

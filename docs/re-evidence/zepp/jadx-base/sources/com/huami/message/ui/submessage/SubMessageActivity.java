package com.huami.message.ui.submessage;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.message.repo.MessageCountRepo;
import com.huami.message.ui.R;
import com.huami.message.ui.base.ext.IntExKt;
import com.huami.message.ui.submessage.SubMessageActivity;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.message.viewmodel.MessageCountViewModel;
import com.huami.message.vo.UnreadMessageVo;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.xiaomi.hm.health.push.Type;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002JK\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0016\u0010\u0014\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/huami/message/ui/submessage/SubMessageActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "o", "initView", "", "praise", StatEvent.MINE_KINGKONG_C_FAVORITE_VALUE, Type.FOLLOW_MESSAGE, "comment", "reply", DTransferConstants.SEARCH_KEY, "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "onLeftClicked", "x", LogUtil.I, "subType", "Lcom/huami/message/repo/MessageCountRepo;", "y", "Lkotlin/Lazy;", "m", "()Lcom/huami/message/repo/MessageCountRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/message/viewmodel/MessageCountViewModel;", "z", GoogleApiAvailabilityLight.b, "()Lcom/huami/message/viewmodel/MessageCountViewModel;", "viewModel", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "J", "enterPageTime", "<init>", "()V", "Companion", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class SubMessageActivity extends BaseTitleActivity {

    @NotNull
    private static final String B = "SubMessageActivity";
    public static final int COMMENT_SUB_TYPE = 2;

    @NotNull
    public static final String EXTRA_ENTER_TIME = "enter_time";

    @NotNull
    public static final String EXTRA_SUB_TYPE = "sub_type";
    public static final int LIKES_SUB_TYPE = 1;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private long enterPageTime;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int subType = 1;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy repo;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubMessageActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.repo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MessageCountRepo>() { // from class: com.huami.message.ui.submessage.SubMessageActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.message.repo.MessageCountRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MessageCountRepo invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(MessageCountRepo.class), qualifier, objArr);
            }
        });
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.message.ui.submessage.SubMessageActivity$special$$inlined$viewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<MessageCountViewModel>() { // from class: com.huami.message.ui.submessage.SubMessageActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.message.viewmodel.MessageCountViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MessageCountViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(MessageCountViewModel.class), function0, objArr3);
            }
        });
        this.enterPageTime = System.currentTimeMillis();
    }

    private final void initView() {
        setContentView(R.layout.mc_activity_message_center);
        this.subType = getIntent().getIntExtra(EXTRA_SUB_TYPE, 1);
        getSupportFragmentManager().beginTransaction().replace(R.id.message_center_content, SubMessageFragment.INSTANCE.create(this.subType, this.enterPageTime)).commit();
        String string = 2 == this.subType ? getString(R.string.mc_sub_msg_title_comment, new Object[]{"", ""}) : getString(R.string.mc_sub_msg_title_likes, new Object[]{"", "", ""});
        if (2 == this.subType) {
            MessageRecorderEventHelper.CommentReplyHelper.INSTANCE.commentReplyPager();
        } else {
            MessageRecorderEventHelper.AwesomeAttentionCollectionHelper.INSTANCE.awesomeAttentionCollectionPager();
        }
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.white), string, true);
        setBaseTitleColor(ContextCompat.getColor(this, R.color.message_center_title));
    }

    private final MessageCountRepo m() {
        return (MessageCountRepo) this.repo.getValue();
    }

    private final MessageCountViewModel n() {
        return (MessageCountViewModel) this.viewModel.getValue();
    }

    private final void o() {
        n().getMessageCntVoResult().observe(this, new Observer() { // from class: sh7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SubMessageActivity.p(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(SubMessageActivity subMessageActivity, Resource resource) {
        if (WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()] == 1) {
            UnreadMessageVo unreadMessageVo = (UnreadMessageVo) resource.getData();
            Integer praiseCnt = unreadMessageVo == null ? null : unreadMessageVo.getPraiseCnt();
            UnreadMessageVo unreadMessageVo2 = (UnreadMessageVo) resource.getData();
            Integer favoriteCnt = unreadMessageVo2 == null ? null : unreadMessageVo2.getFavoriteCnt();
            UnreadMessageVo unreadMessageVo3 = (UnreadMessageVo) resource.getData();
            Integer followCnt = unreadMessageVo3 == null ? null : unreadMessageVo3.getFollowCnt();
            UnreadMessageVo unreadMessageVo4 = (UnreadMessageVo) resource.getData();
            Integer commentCnt = unreadMessageVo4 == null ? null : unreadMessageVo4.getCommentCnt();
            UnreadMessageVo unreadMessageVo5 = (UnreadMessageVo) resource.getData();
            subMessageActivity.q(praiseCnt, favoriteCnt, followCnt, commentCnt, unreadMessageVo5 != null ? unreadMessageVo5.getReplyCnt() : null);
        }
    }

    private final void q(Integer praise, Integer favorite, Integer follow, Integer comment, Integer reply) {
        TextView titleTextView = getTitleTextView();
        if (titleTextView == null) {
            return;
        }
        titleTextView.setText(2 == this.subType ? getString(R.string.mc_sub_msg_title_comment, new Object[]{IntExKt.formatRealCount(comment), IntExKt.formatRealCount(reply)}) : getString(R.string.mc_sub_msg_title_likes, new Object[]{IntExKt.formatRealCount(praise), IntExKt.formatRealCount(favorite), IntExKt.formatRealCount(follow)}));
    }

    public static /* synthetic */ void r(SubMessageActivity subMessageActivity, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = 0;
        }
        if ((i & 2) != 0) {
            num2 = 0;
        }
        if ((i & 4) != 0) {
            num3 = 0;
        }
        if ((i & 8) != 0) {
            num4 = 0;
        }
        if ((i & 16) != 0) {
            num5 = 0;
        }
        subMessageActivity.q(num, num2, num3, num4, num5);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        o();
        n().loadMessageCntVo();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        HMLog.d(B, Intrinsics.stringPlus("onDestroy, enterPageTime=", Long.valueOf(this.enterPageTime)), new Object[0]);
        int i = this.subType;
        if (i == 1) {
            m().updatePraiseFavFollowCountAsRead(Long.valueOf(this.enterPageTime));
        } else if (i == 2) {
            m().updateCommentCountAsRead(this.enterPageTime);
        }
        super.onDestroy();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        onBackPressed();
    }
}

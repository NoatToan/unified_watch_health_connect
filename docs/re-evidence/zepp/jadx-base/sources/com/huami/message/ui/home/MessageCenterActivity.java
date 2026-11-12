package com.huami.message.ui.home;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.viewpager.widget.ViewPager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.message.dto.MessageStatus;
import com.huami.message.ui.R;
import com.huami.message.ui.base.drawable.DrawableUtil;
import com.huami.message.ui.base.ext.IntExKt;
import com.huami.message.ui.base.ext.ViewExKt;
import com.huami.message.ui.home.MessageCenterActivity;
import com.huami.message.ui.message.MessageFragment;
import com.huami.message.ui.message.MessageViewModel;
import com.huami.message.ui.widget.CustomRelativeLayout;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.message.viewmodel.MessageCountViewModel;
import com.huami.message.vo.UnreadMessageVo;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.typeface.TypefaceManager;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.SimplePagerTitleView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u0007¢\u0006\u0004\b=\u0010>J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0012\u0010\u0015\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J \u0010 \u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0005H\u0016J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0005H\u0016R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010*\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b(\u0010)R\u001d\u0010/\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\u0007\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;¨\u0006@"}, d2 = {"Lcom/huami/message/ui/home/MessageCenterActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "", "r", "", "messageCount", "notificationCount", "y", "initView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, DTransferConstants.SEARCH_KEY, "index", "x", "u", VoiceConfigFuncKt.NEWS, "w", "v", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onLeftClicked", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onRightOnClicked", "state", "onPageScrollStateChanged", "position", "", "positionOffset", "positionOffsetPixels", "onPageScrolled", "onPageSelected", "Lcom/huami/message/viewmodel/MessageCountViewModel;", "Lkotlin/Lazy;", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/message/viewmodel/MessageCountViewModel;", "viewModel", "Lcom/huami/message/ui/message/MessageViewModel;", GoogleApiAvailabilityLight.b, "()Lcom/huami/message/ui/message/MessageViewModel;", "messageViewModel", "Lcom/huami/message/ui/home/McFragmentPagerAdapter;", "z", "o", "()Lcom/huami/message/ui/home/McFragmentPagerAdapter;", "pagerAdapter", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/titles/SimplePagerTitleView;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/titles/SimplePagerTitleView;", "messageTitle", "B", "noticeTitle", "Lcom/huami/message/ui/widget/CustomRelativeLayout;", "C", "Lcom/huami/message/ui/widget/CustomRelativeLayout;", "messageTitleLinearylayout", LogUtil.D, LogUtil.I, "E", "<init>", "()V", "Companion", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class MessageCenterActivity extends BaseTitleActivity implements ViewPager.OnPageChangeListener {

    @NotNull
    private static final String F = "Message-CenterActivity";
    private static final int G = 1;
    private static final int H = 0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private SimplePagerTitleView messageTitle;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private SimplePagerTitleView noticeTitle;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private CustomRelativeLayout messageTitleLinearylayout;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private int messageCount;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private int notificationCount;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy messageViewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy pagerAdapter;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            MessageCenterActivity.this.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/message/ui/home/McFragmentPagerAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<McFragmentPagerAdapter> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final McFragmentPagerAdapter getA() {
            return new McFragmentPagerAdapter(MessageCenterActivity.this.getSupportFragmentManager());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageCenterActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.message.ui.home.MessageCenterActivity$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MessageCountViewModel>() { // from class: com.huami.message.ui.home.MessageCenterActivity$special$$inlined$viewModel$default$2
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
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(MessageCountViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.message.ui.home.MessageCenterActivity$special$$inlined$viewModel$default$3
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
        this.messageViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MessageViewModel>() { // from class: com.huami.message.ui.home.MessageCenterActivity$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.message.ui.message.MessageViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final MessageViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(MessageViewModel.class), function1, objArr3);
            }
        });
        this.pagerAdapter = LazyKt__LazyJVMKt.lazy(new b());
    }

    private final void initView() {
        setContentView(R.layout.mc_activity_message_centers);
        setStyle(BaseTitleActivity.STYLE.NONE);
        this.mTintManager.setStatusBarTintEnabled(true);
        this.mTintManager.setStatusBarTintColor(ContextCompat.getColor(this, R.color.mc_btn_grey_text));
        q(this);
        ViewExKt.smartClick$default((ImageView) findViewById(R.id.back), 0L, new a(), 1, null);
        SimplePagerTitleView simplePagerTitleView = this.messageTitle;
        Objects.requireNonNull(simplePagerTitleView);
        new DrawableUtil(simplePagerTitleView, new DrawableUtil.OnDrawableListener() { // from class: com.huami.message.ui.home.MessageCenterActivity.initView.2
            @Override // com.huami.message.ui.base.drawable.DrawableUtil.OnDrawableListener
            public void onClick() {
                MessageCenterActivity.this.u();
            }
        });
        ((ViewPager) findViewById(R.id.mc_view_pager)).addOnPageChangeListener(this);
    }

    private final MessageViewModel n() {
        return (MessageViewModel) this.messageViewModel.getValue();
    }

    private final McFragmentPagerAdapter o() {
        return (McFragmentPagerAdapter) this.pagerAdapter.getValue();
    }

    private final MessageCountViewModel p() {
        return (MessageCountViewModel) this.viewModel.getValue();
    }

    private final void q(Context context) {
        final ArrayList arrayList = new ArrayList();
        CustomRelativeLayout customRelativeLayout = new CustomRelativeLayout(context);
        this.messageTitleLinearylayout = customRelativeLayout;
        Objects.requireNonNull(customRelativeLayout);
        this.messageTitle = customRelativeLayout.getMessageTitle();
        SimplePagerTitleView simplePagerTitleView = new SimplePagerTitleView(context);
        this.noticeTitle = simplePagerTitleView;
        Objects.requireNonNull(simplePagerTitleView);
        TypefaceManager typefaceManager = TypefaceManager.get();
        SimplePagerTitleView simplePagerTitleView2 = this.noticeTitle;
        Objects.requireNonNull(simplePagerTitleView2);
        typefaceManager.applyTypeface(simplePagerTitleView2, "lt-bold");
        int i = R.color.mc_title_normal;
        simplePagerTitleView.setNormalColor(ContextCompat.getColor(context, i));
        int i2 = R.color.mc_title_chose;
        simplePagerTitleView.setSelectedColor(ContextCompat.getColor(context, i2));
        simplePagerTitleView.setTextSize(16.0f);
        simplePagerTitleView.setText(getString(R.string.mc_title_notification));
        SimplePagerTitleView simplePagerTitleView3 = this.messageTitle;
        Objects.requireNonNull(simplePagerTitleView3);
        TypefaceManager typefaceManager2 = TypefaceManager.get();
        SimplePagerTitleView simplePagerTitleView4 = this.messageTitle;
        Objects.requireNonNull(simplePagerTitleView4);
        typefaceManager2.applyTypeface(simplePagerTitleView4, "lt-bold");
        simplePagerTitleView3.setNormalColor(ContextCompat.getColor(context, i));
        simplePagerTitleView3.setSelectedColor(ContextCompat.getColor(context, i2));
        simplePagerTitleView3.setTextSize(16.0f);
        simplePagerTitleView3.setText(getString(R.string.mc_title_news));
        SimplePagerTitleView simplePagerTitleView5 = this.noticeTitle;
        Objects.requireNonNull(simplePagerTitleView5);
        arrayList.add(simplePagerTitleView5);
        CustomRelativeLayout customRelativeLayout2 = this.messageTitleLinearylayout;
        Objects.requireNonNull(customRelativeLayout2);
        arrayList.add(customRelativeLayout2);
        int i3 = R.id.mc_view_pager;
        ((ViewPager) findViewById(i3)).setAdapter(o());
        ((ViewPager) findViewById(i3)).setOffscreenPageLimit(arrayList.size());
        CommonNavigator commonNavigator = new CommonNavigator(context);
        commonNavigator.setScrollPivotX(0.5f);
        commonNavigator.setAdjustMode(true);
        commonNavigator.setAdapter(new CommonNavigatorAdapter() { // from class: com.huami.message.ui.home.MessageCenterActivity$initMagicIndicator$4

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function1<View, Unit> {
                public final /* synthetic */ MessageCenterActivity a;
                public final /* synthetic */ int b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(MessageCenterActivity messageCenterActivity, int i) {
                    super(1);
                    this.a = messageCenterActivity;
                    this.b = i;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull View view) {
                    this.a.x(this.b);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function1<View, Unit> {
                public final /* synthetic */ MessageCenterActivity a;
                public final /* synthetic */ int b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(MessageCenterActivity messageCenterActivity, int i) {
                    super(1);
                    this.a = messageCenterActivity;
                    this.b = i;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull View view) {
                    this.a.x(this.b);
                }
            }

            @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
            public int getCount() {
                return arrayList.size();
            }

            @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
            @NotNull
            public IPagerIndicator getIndicator(@NotNull Context context2) {
                LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context2);
                linePagerIndicator.setLineWidth(ViewExKt.dpToPx((View) linePagerIndicator, 25.0f));
                linePagerIndicator.setLineHeight(ViewExKt.dpToPx((View) linePagerIndicator, 2.0f));
                linePagerIndicator.setColors(Integer.valueOf(ContextCompat.getColor(context2, R.color.mc_chose)));
                linePagerIndicator.setMode(2);
                return linePagerIndicator;
            }

            @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
            @NotNull
            public IPagerTitleView getTitleView(@NotNull Context context2, int position) {
                IPagerTitleView iPagerTitleView = arrayList.get(position);
                if (iPagerTitleView instanceof SimplePagerTitleView) {
                    ViewExKt.smartClick$default((SimplePagerTitleView) iPagerTitleView, 0L, new a(this, position), 1, null);
                } else if (iPagerTitleView instanceof CustomRelativeLayout) {
                    ViewExKt.smartClick$default(((CustomRelativeLayout) iPagerTitleView).getMessageTitle(), 0L, new b(this, position), 1, null);
                }
                return iPagerTitleView;
            }
        });
        int i4 = R.id.message_tab_indicator;
        ((MagicIndicator) findViewById(i4)).setNavigator(commonNavigator);
        ViewPagerHelper.bind((MagicIndicator) findViewById(i4), (ViewPager) findViewById(i3));
    }

    private final void r() {
        p().getMessageCntVoResult().observe(this, new Observer() { // from class: i05
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MessageCenterActivity.s(this.a, (Resource) obj);
            }
        });
        p().loadMessageCntVo();
        p().getUserMsgUpdateResult().observe(this, new Observer() { // from class: j05
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MessageCenterActivity.t(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(MessageCenterActivity messageCenterActivity, Resource resource) {
        Integer messageCount;
        Integer noticeCount;
        Integer messageCount2;
        Integer noticeCount2;
        if (WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()] == 1) {
            UnreadMessageVo unreadMessageVo = (UnreadMessageVo) resource.getData();
            int iIntValue = 0;
            messageCenterActivity.messageCount = (unreadMessageVo == null || (messageCount = unreadMessageVo.getMessageCount()) == null) ? 0 : messageCount.intValue();
            UnreadMessageVo unreadMessageVo2 = (UnreadMessageVo) resource.getData();
            messageCenterActivity.notificationCount = (unreadMessageVo2 == null || (noticeCount = unreadMessageVo2.getNoticeCount()) == null) ? 0 : noticeCount.intValue();
            UnreadMessageVo unreadMessageVo3 = (UnreadMessageVo) resource.getData();
            messageCenterActivity.w((unreadMessageVo3 == null || (messageCount2 = unreadMessageVo3.getMessageCount()) == null) ? 0 : messageCount2.intValue());
            UnreadMessageVo unreadMessageVo4 = (UnreadMessageVo) resource.getData();
            if (unreadMessageVo4 != null && (noticeCount2 = unreadMessageVo4.getNoticeCount()) != null) {
                iIntValue = noticeCount2.intValue();
            }
            messageCenterActivity.v(iIntValue);
            if (messageCenterActivity.p().getFirstSelectMark()) {
                return;
            }
            messageCenterActivity.y(messageCenterActivity.messageCount, messageCenterActivity.notificationCount);
            MessageRecorderEventHelper.MessageCenterEventHelper.INSTANCE.messageCenterPage(String.valueOf(messageCenterActivity.notificationCount), String.valueOf(messageCenterActivity.messageCount));
            messageCenterActivity.p().setFirstSelectMark(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(MessageCenterActivity messageCenterActivity, Resource resource) {
        HMLog.d(F, Intrinsics.stringPlus("mark userMsg, userMsgResult=", resource.getStatus()), new Object[0]);
        try {
            McFragmentPagerAdapter mcFragmentPagerAdapterO = messageCenterActivity.o();
            int i = R.id.mc_view_pager;
            MessageFragment messageFragment = (MessageFragment) mcFragmentPagerAdapterO.instantiateItem((ViewGroup) messageCenterActivity.findViewById(i), ((ViewPager) messageCenterActivity.findViewById(i)).getCurrentItem());
            if (messageFragment != null) {
                messageFragment.getMessageAdapter().setPraiseFavCollectRedDotVisible(0);
                messageFragment.getMessageAdapter().setCommentRedDotVisible(0);
            }
        } catch (Exception e) {
            HMLog.e(F, "chucuo ;;;;;", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        p().markUserMessage();
        n().updateAllMessageStatus(MessageStatus.READ);
        HMLog.d(F, "onCleanup", new Object[0]);
        MessageRecorderEventHelper.MessageCenterEventHelper.INSTANCE.clickCleanButton(String.valueOf(this.messageCount));
    }

    private final void v(int news) {
        SimplePagerTitleView simplePagerTitleView = this.noticeTitle;
        Objects.requireNonNull(simplePagerTitleView);
        simplePagerTitleView.setText(getString(R.string.mc_title_notification));
        if (news <= 0 || ((ViewPager) findViewById(R.id.mc_view_pager)).getCurrentItem() != 1) {
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        simplePagerTitleView.setText(String.format(simplePagerTitleView.getResources().getString(R.string.mc_title_news_notification_number), Arrays.copyOf(new Object[]{IntExKt.formatRedDotCount(news)}, 1)));
    }

    private final void w(int news) {
        SimplePagerTitleView simplePagerTitleView = this.messageTitle;
        Objects.requireNonNull(simplePagerTitleView);
        if (news <= 0) {
            simplePagerTitleView.setCompoundDrawables(null, null, null, null);
            simplePagerTitleView.setText(getString(R.string.mc_title_news));
            return;
        }
        if (((ViewPager) findViewById(R.id.mc_view_pager)).getCurrentItem() == 1) {
            Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), R.drawable.mc_clean);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            }
            simplePagerTitleView.setCompoundDrawables(null, null, drawable, null);
            simplePagerTitleView.setCompoundDrawablePadding(ViewExKt.dpToPx((View) simplePagerTitleView, 8));
        }
        simplePagerTitleView.setText(simplePagerTitleView.getResources().getQuantityString(R.plurals.mc_title_news_number, news, IntExKt.formatRedDotCount(news)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(int index) {
        ((ViewPager) findViewById(R.id.mc_view_pager)).setCurrentItem(index);
        if (index == 0) {
            MessageRecorderEventHelper.MessageCenterEventHelper.INSTANCE.messageCenterNotificationClick(String.valueOf(this.notificationCount));
        } else {
            if (index != 1) {
                return;
            }
            MessageRecorderEventHelper.MessageCenterEventHelper.INSTANCE.messageCenterUserMessageClick(String.valueOf(this.messageCount));
        }
    }

    private final void y(int messageCount, int notificationCount) {
        if (messageCount <= 0 && notificationCount > 0) {
            x(0);
        }
        if (messageCount > 0 && notificationCount <= 0) {
            x(1);
        }
        if (messageCount <= 0 || notificationCount <= 0) {
            return;
        }
        x(1);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        r();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        onBackPressed();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        if (position != 1) {
            v(0);
            SimplePagerTitleView simplePagerTitleView = this.messageTitle;
            Objects.requireNonNull(simplePagerTitleView);
            simplePagerTitleView.setCompoundDrawables(null, null, null, null);
            MessageRecorderEventHelper.MessageCenterEventHelper.INSTANCE.messageCenterNotificationPage(String.valueOf(this.notificationCount));
            return;
        }
        SimplePagerTitleView simplePagerTitleView2 = this.messageTitle;
        Objects.requireNonNull(simplePagerTitleView2);
        if (this.messageCount > 0) {
            Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), R.drawable.mc_clean);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            }
            simplePagerTitleView2.setCompoundDrawables(null, null, drawable, null);
            simplePagerTitleView2.setCompoundDrawablePadding(ViewExKt.dpToPx((View) simplePagerTitleView2, 8));
            MessageRecorderEventHelper.MessageCenterEventHelper.INSTANCE.viewCleanButton(String.valueOf(this.messageCount));
        }
        v(this.notificationCount);
        MessageRecorderEventHelper.MessageCenterEventHelper.INSTANCE.messageCenterUserMessagePage(String.valueOf(this.messageCount));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onRightOnClicked(@Nullable View view) {
    }
}

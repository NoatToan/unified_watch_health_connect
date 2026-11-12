package com.huami.module.homepage.cards.business.phn;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.business.phn.PHNCardView;
import com.huami.module.homepage.cards.cardui.BackgroundTextView;
import com.huami.module.homepage.cards.cardui.PiecewiseArcView;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.databinding.HomepageItemCardPhnBinding;
import com.huami.module.homepage.databinding.HomepageItemCardPhnDialogBinding;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.HMSpannable;
import com.huami.phn.service.PHNCardTipsData;
import com.huami.phn.service.PHNStateEntry;
import com.huami.phn.service.PHNStateType;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.notification.TransportUri;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.Language;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001.B'\b\u0007\u0012\u0006\u0010E\u001a\u00020D\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F\u0012\b\b\u0002\u0010H\u001a\u00020\n¢\u0006\u0004\bI\u0010JJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J-\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\nH\u0002J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J$\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\nH\u0002J$\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\nH\u0002J\b\u0010\"\u001a\u00020\u0004H\u0002J\u0010\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0002J\b\u0010'\u001a\u00020\u0004H\u0002J\u0006\u0010(\u001a\u00020\u0004J\u0014\u0010+\u001a\u00020\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170)J\u000e\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00102R\u0016\u00105\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00102R\u0016\u00106\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00102R\u0016\u00107\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00102R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00102R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\n0:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010;R\u001d\u0010A\u001a\u00020=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010B¨\u0006K"}, d2 = {"Lcom/huami/module/homepage/cards/business/phn/PHNCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/huami/phn/service/PHNStateEntry;", "phnStateEntry", "", z.j, SOAP.XMLNS, "r", "h", "i", "", "state", "", "stateValue", "", "stateText", "u", "(ILjava/lang/Float;Ljava/lang/String;)V", "e", "(Ljava/lang/Float;)I", GoogleApiAvailabilityLight.a, "progress", "t", "", "planning", "m", "showMask", "maskText", "paddingTop", GoogleApiAvailabilityLight.b, "showButton", "buttonText", "marginTop", com.google.android.exoplayer2.text.ttml.b.r, hl.k, "Landroid/text/SpannableStringBuilder;", "spanText", "Landroidx/appcompat/widget/AppCompatTextView;", "c", "f", "initView", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "setEnterClick", "updateView", "Lcom/huami/module/homepage/databinding/HomepageItemCardPhnBinding;", "a", "Lcom/huami/module/homepage/databinding/HomepageItemCardPhnBinding;", "binding", "b", LogUtil.I, "gray", "purple", "blue", "green", "grassGreen", "g", "yellow", "", "Ljava/util/List;", "defaultStateColors", "Lcom/huami/module/homepage/databinding/HomepageItemCardPhnDialogBinding;", "Lkotlin/Lazy;", "getDialogView", "()Lcom/huami/module/homepage/databinding/HomepageItemCardPhnDialogBinding;", "dialogView", "Lcom/huami/phn/service/PHNStateEntry;", "currentPhnData", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class PHNCardView extends ConstraintLayout {

    @Deprecated
    public static final float ARC_OPEN_ANGLE = 180.0f;

    @Deprecated
    public static final int MAX_PROGRESS = 100;

    @Deprecated
    public static final int PHN_STATE_NORMAL_TEXT_SIZE = 16;

    @Deprecated
    public static final float SCREEN_WIDTH_RATIO = 0.6f;

    @Deprecated
    public static final float TSB_ARC_VIEW_MAX_VALUE = 10.0f;

    @Deprecated
    public static final int TSB_MAX_VALUE = 1000;

    @Deprecated
    public static final int TSB_MIDDLE_VALUE = 100;

    @Deprecated
    public static final int TSB_TEXT_SIZE_MAX = 32;

    @Deprecated
    public static final int TSB_TEXT_SIZE_MIDDLE = 28;

    @Deprecated
    public static final int TSB_TEXT_SIZE_SMALL = 24;

    @NotNull
    private static final a k = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageItemCardPhnBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int gray;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int purple;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int blue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int green;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int grassGreen;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int yellow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final List<Integer> defaultStateColors;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy dialogView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private PHNStateEntry currentPhnData;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PHNStateType.values().length];
            iArr[PHNStateType.PLAN_UNOPENED.ordinal()] = 1;
            iArr[PHNStateType.PLAN_STATE_UNKNOWN.ordinal()] = 2;
            iArr[PHNStateType.PLAN_NOT_START.ordinal()] = 3;
            iArr[PHNStateType.PLAN_ON_GOING_REST_TODAY.ordinal()] = 4;
            iArr[PHNStateType.PLAN_ON_GOING_OVER_LOAD_TODAY_NO_PLAN.ordinal()] = 5;
            iArr[PHNStateType.PLAN_ON_GOING_DONE_THIS_WEEK_NO_PLAN.ordinal()] = 6;
            iArr[PHNStateType.PLAN_ON_GOING_TODAY_HAS_FINISHED.ordinal()] = 7;
            iArr[PHNStateType.PLAN_ON_GOING_TODAY_UN_FINISH.ordinal()] = 8;
            iArr[PHNStateType.PLAN_STOPED.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0016\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0016\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0016\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007¨\u0006\u0012"}, d2 = {"com/huami/module/homepage/cards/business/phn/PHNCardView$a", "", "", "ARC_OPEN_ANGLE", "F", "", "MAX_PROGRESS", LogUtil.I, "PHN_STATE_NORMAL_TEXT_SIZE", "SCREEN_WIDTH_RATIO", "TSB_ARC_VIEW_MAX_VALUE", "TSB_MAX_VALUE", "TSB_MIDDLE_VALUE", "TSB_TEXT_SIZE_MAX", "TSB_TEXT_SIZE_MIDDLE", "TSB_TEXT_SIZE_SMALL", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/module/homepage/databinding/HomepageItemCardPhnDialogBinding;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HomepageItemCardPhnDialogBinding> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HomepageItemCardPhnDialogBinding getA() {
            return HomepageItemCardPhnDialogBinding.inflate(LayoutInflater.from(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
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
            PHNCardView.this.k();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function0<Boolean> a;
        public final /* synthetic */ PHNCardView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0<Boolean> function0, PHNCardView pHNCardView) {
            super(0);
            this.a = function0;
            this.b = pHNCardView;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_PHN_C, new Pair[0]);
            if (this.a.getA().booleanValue()) {
                return;
            }
            this.b.f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "linkUrl", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<String, Unit> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            ServiceManager.INSTANCE.getWebService().launch(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "linkUrl", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<String, Unit> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            ServiceManager.INSTANCE.getWebService().launch(str);
        }
    }

    @JvmOverloads
    public PHNCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PHNCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PHNCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final AppCompatTextView c(SpannableStringBuilder spanText) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(new ContextThemeWrapper(getContext(), R.style.HomepageDialogStyle));
        appCompatTextView.setMaxHeight((int) (Resources.getSystem().getDisplayMetrics().heightPixels * 0.6f));
        appCompatTextView.setVerticalScrollBarEnabled(true);
        appCompatTextView.setMovementMethod(ScrollingMovementMethod.getInstance());
        appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
        appCompatTextView.setPadding(NumberExtKt.getDp(15), NumberExtKt.getDp(20), NumberExtKt.getDp(11), 0);
        appCompatTextView.setText(spanText);
        return appCompatTextView;
    }

    private final int d(int state) {
        if (state == 0) {
            return this.purple;
        }
        if (state == 1) {
            return this.blue;
        }
        if (state == 2) {
            return this.green;
        }
        if (state != 3) {
            return state != 4 ? this.gray : this.yellow;
        }
        return this.grassGreen;
    }

    private final int e(Float stateValue) {
        if (stateValue == null) {
            return 32;
        }
        if (Math.abs(stateValue.floatValue()) >= 1000.0f) {
            return 24;
        }
        return Math.abs(stateValue.floatValue()) >= 100.0f ? 28 : 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    public final void f() {
        List<PHNCardTipsData> tips;
        PHNCardTipsData pHNCardTipsData;
        boolean z;
        PHNStateEntry pHNStateEntry;
        if (getContext() instanceof FragmentActivity) {
            PHNStateEntry pHNStateEntry2 = this.currentPhnData;
            if (pHNStateEntry2 == null || (tips = pHNStateEntry2.getTips()) == null) {
                pHNCardTipsData = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : tips) {
                    if (!((PHNCardTipsData) obj).isHelper()) {
                        arrayList.add(obj);
                    }
                }
                pHNCardTipsData = (PHNCardTipsData) CollectionsKt.firstOrNull((List) arrayList);
            }
            if (pHNCardTipsData == null) {
                return;
            }
            HomepageItemCardPhnDialogBinding dialogView = getDialogView();
            dialogView.homepagePhnDialogTitle.setText(pHNCardTipsData.getTitle());
            TextView textView = dialogView.homepagePhnDialogDescription;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            HMSpannable hMSpannable = new HMSpannable();
            Iterator<T> it2 = pHNCardTipsData.getDescription().iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                String str = (String) pair.component1();
                if (((Boolean) pair.component2()).booleanValue()) {
                    PHNStateEntry pHNStateEntry3 = this.currentPhnData;
                    String supportPHNDeviceH5Url = pHNStateEntry3 == null ? null : pHNStateEntry3.getSupportPHNDeviceH5Url();
                    z = supportPHNDeviceH5Url == null || supportPHNDeviceH5Url.length() == 0 ? false : true;
                }
                HMSpannable.append$default(hMSpannable, str, Integer.valueOf(ViewExtKt.loadColor(textView, z ? R.color.s41 : R.color.s1)), null, false, Integer.valueOf(NumberExtKt.getDp(3)), null, (!z || (pHNStateEntry = this.currentPhnData) == null) ? null : pHNStateEntry.getSupportPHNDeviceH5Url(), 44, null).addNewlineWithBottom(NumberExtKt.getDp(10));
            }
            textView.setText(hMSpannable.buildWithWebLaunch(e.a));
            AlertDialogFragment.Builder neutralButton = new AlertDialogFragment.Builder(getContext()).setContentView(getDialogView().getRoot()).setNeutralButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: ro5
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PHNCardView.g(this.a, dialogInterface, i);
                }
            });
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            neutralButton.show(((FragmentActivity) context).getSupportFragmentManager()).setGravity(17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(PHNCardView pHNCardView, DialogInterface dialogInterface, int i) {
        RouterHelperKt.executeRoute$default(pHNCardView.getContext(), "main/MainTabActivity", new Pair[]{TuplesKt.to("tab_index", 3)}, null, 8, null);
    }

    private final HomepageItemCardPhnDialogBinding getDialogView() {
        return (HomepageItemCardPhnDialogBinding) this.dialogView.getValue();
    }

    private final void h(PHNStateEntry phnStateEntry) {
        v(this, -1, null, null, 6, null);
        n(true, phnStateEntry.getPlanStateDescription(), NumberExtKt.getDp(45));
        q(this, false, null, 0, 6, null);
        HomepageItemCardPhnBinding homepageItemCardPhnBinding = this.binding;
        homepageItemCardPhnBinding.phnTitle.setFirstTime(phnStateEntry.getUpdateTime());
        ViewExtKt.setVisible(homepageItemCardPhnBinding.phnNoPlan, false);
    }

    private final void i(PHNStateEntry phnStateEntry) {
        v(this, -1, null, null, 6, null);
        n(true, phnStateEntry.getPlanStateDescription(), NumberExtKt.getDp(21));
        p(true, phnStateEntry.getSubDescription(), NumberExtKt.getDp(82));
        HomepageItemCardPhnBinding homepageItemCardPhnBinding = this.binding;
        homepageItemCardPhnBinding.phnTitle.setFirstTime(phnStateEntry.getUpdateTime());
        ViewExtKt.setVisible(homepageItemCardPhnBinding.phnNoPlan, false);
    }

    private final void j(PHNStateEntry phnStateEntry) {
        v(this, -1, null, null, 6, null);
        o(this, true, null, 0, 6, null);
        String subDescription = phnStateEntry == null ? null : phnStateEntry.getSubDescription();
        if (subDescription == null) {
            subDescription = ViewExtKt.getString(this, R.string.phn_open_new_plan);
        }
        q(this, true, subDescription, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    public final void k() {
        List<PHNCardTipsData> tips;
        boolean z;
        PHNStateEntry pHNStateEntry;
        if (getContext() instanceof FragmentActivity) {
            HMSpannable hMSpannable = new HMSpannable();
            PHNStateEntry pHNStateEntry2 = this.currentPhnData;
            if (pHNStateEntry2 != null && (tips = pHNStateEntry2.getTips()) != null) {
                for (PHNCardTipsData pHNCardTipsData : tips) {
                    if (pHNCardTipsData.isHelper()) {
                        HMSpannable.append$default(hMSpannable, pHNCardTipsData.getTitle(), Integer.valueOf(ViewExtKt.loadColor(this, R.color.s1)), 16, true, null, null, null, 112, null).addNewlineWithBottom(NumberExtKt.getDp(10));
                        Iterator<T> it2 = pHNCardTipsData.getDescription().iterator();
                        while (it2.hasNext()) {
                            Pair pair = (Pair) it2.next();
                            String str = (String) pair.component1();
                            if (((Boolean) pair.component2()).booleanValue()) {
                                PHNStateEntry pHNStateEntry3 = this.currentPhnData;
                                String supportPHNDeviceH5Url = pHNStateEntry3 == null ? null : pHNStateEntry3.getSupportPHNDeviceH5Url();
                                z = supportPHNDeviceH5Url == null || supportPHNDeviceH5Url.length() == 0 ? false : true;
                            }
                            HMSpannable.append$default(hMSpannable, str, Integer.valueOf(ViewExtKt.loadColor(this, z ? R.color.s41 : R.color.s1)), 14, false, Integer.valueOf(NumberExtKt.getDp(3)), null, (!z || (pHNStateEntry = this.currentPhnData) == null) ? null : pHNStateEntry.getSupportPHNDeviceH5Url(), 40, null).addNewline();
                        }
                        hMSpannable.addNewline();
                    }
                }
            }
            AlertDialogFragment.Builder contentView = new AlertDialogFragment.Builder(getContext()).setNeutralButton(R.string.i_know, new DialogInterface.OnClickListener() { // from class: so5
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PHNCardView.l(dialogInterface, i);
                }
            }).setContentView(c(hMSpannable.buildWithWebLaunch(f.a)));
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            contentView.show(((FragmentActivity) context).getSupportFragmentManager()).setGravity(17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(DialogInterface dialogInterface, int i) {
    }

    private final void m(boolean planning, String stateText) {
        HomepageItemCardPhnBinding homepageItemCardPhnBinding = this.binding;
        ViewExtKt.setVisible(homepageItemCardPhnBinding.phnLine, planning);
        ViewExtKt.setVisible(homepageItemCardPhnBinding.phnZero, planning);
        ViewExtKt.setVisible(homepageItemCardPhnBinding.phn100, planning);
        ViewExtKt.setVisible(homepageItemCardPhnBinding.phnTodayProgress, planning);
        ViewExtKt.setVisible(homepageItemCardPhnBinding.phnNoPlan, !planning);
        homepageItemCardPhnBinding.phnNoPlan.setText(stateText);
    }

    private final void n(boolean showMask, String maskText, int paddingTop) {
        BackgroundTextView backgroundTextView = this.binding.phnMask;
        ViewExtKt.setVisible(backgroundTextView, showMask);
        if (showMask) {
            backgroundTextView.setText(maskText);
            ViewGroup.LayoutParams layoutParams = backgroundTextView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            backgroundTextView.setPadding(0, paddingTop, 0, 0);
            Unit unit = Unit.INSTANCE;
            backgroundTextView.setLayoutParams((ConstraintLayout.LayoutParams) layoutParams);
        }
    }

    public static /* synthetic */ void o(PHNCardView pHNCardView, boolean z, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            i = NumberExtKt.getDp(0);
        }
        pHNCardView.n(z, str, i);
    }

    private final void p(boolean showButton, String buttonText, int marginTop) {
        AppCompatButton appCompatButton = this.binding.phnPlanButton;
        ViewExtKt.setVisible(appCompatButton, showButton);
        if (showButton) {
            appCompatButton.setText(buttonText);
            ViewGroup.LayoutParams layoutParams = appCompatButton.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(0, marginTop, 0, 0);
            Unit unit = Unit.INSTANCE;
            appCompatButton.setLayoutParams(layoutParams2);
        }
    }

    public static /* synthetic */ void q(PHNCardView pHNCardView, boolean z, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            i = NumberExtKt.getDp(72);
        }
        pHNCardView.p(z, str, i);
    }

    private final void r(PHNStateEntry phnStateEntry) {
        o(this, false, null, 0, 6, null);
        q(this, false, null, 0, 6, null);
        u(phnStateEntry.getTsbType(), Float.valueOf(phnStateEntry.getTsbValue()), phnStateEntry.getTsbTypeName());
        this.binding.phnTitle.setFirstTime(phnStateEntry.getUpdateTime());
        m(false, phnStateEntry.getPlanStateDescription());
    }

    private final void s(PHNStateEntry phnStateEntry) {
        o(this, false, null, 0, 6, null);
        q(this, false, null, 0, 6, null);
        m(true, phnStateEntry.getPlanStateDescription());
        t(phnStateEntry.getDailyPercent());
        u(phnStateEntry.getTsbType(), Float.valueOf(phnStateEntry.getTsbValue()), phnStateEntry.getTsbTypeName());
        this.binding.phnTitle.setFirstTime(phnStateEntry.getUpdateTime());
    }

    private final void t(int progress) {
        ProgressBar progressBar = this.binding.phnLine;
        int i = 100;
        if (progress < 0) {
            i = 0;
        } else if (progress <= 100) {
            i = progress;
        }
        progressBar.setProgress(i);
        AppCompatTextView appCompatTextView = this.binding.phnTodayProgress;
        HMSpannable hMSpannableAddSpaceBlank = HMSpannable.append$default(new HMSpannable(), ViewExtKt.getString(this, R.string.homepage_phn_today_progress), null, null, false, null, null, null, 126, null).addSpaceBlank();
        if (Language.isTurkish()) {
            HMSpannable.append$default(hMSpannableAddSpaceBlank, "%", null, 14, false, null, null, null, 122, null);
            HMSpannable.append$default(hMSpannableAddSpaceBlank, I18nKt.i18n(progress), null, 20, false, null, HomeUtils.getMaisonTypeface(), null, 90, null);
        } else {
            HMSpannable.append$default(hMSpannableAddSpaceBlank, I18nKt.i18n(progress), null, 20, false, null, HomeUtils.getMaisonTypeface(), null, 90, null);
            hMSpannableAddSpaceBlank.addSpaceBlank();
            HMSpannable.append$default(hMSpannableAddSpaceBlank, "%", null, 14, false, null, null, null, 122, null);
        }
        Unit unit = Unit.INSTANCE;
        appCompatTextView.setText(hMSpannableAddSpaceBlank.build());
    }

    private final void u(int state, Float stateValue, String stateText) {
        String strI18n$default;
        int iD = d(state);
        PiecewiseArcView piecewiseArcViewShowIndicator = this.binding.phnArc.showIndicator(state >= 0 && state <= 4);
        List<Integer> list = this.defaultStateColors;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            if (state == i) {
                iIntValue = iD;
            }
            arrayList.add(Integer.valueOf(iIntValue));
            i = i2;
        }
        piecewiseArcViewShowIndicator.setPiecewiseColor(arrayList).setValue((state * 2) + 1.0f).refresh();
        this.binding.phnContent.setText(HMSpannable.append$default(HMSpannable.append$default(HMSpannable.append$default(new HMSpannable(), (stateValue == null || (strI18n$default = I18nKt.i18n$default(stateValue.floatValue(), 0, 1, null)) == null) ? "--" : strI18n$default, null, Integer.valueOf(e(stateValue)), false, null, HomeUtils.getMaisonTypeface(), null, 90, null).addNewline(), ViewExtKt.getString(this, R.string.phn_training_analysis_status), null, null, false, null, null, null, 126, null).addNewline(), stateText, Integer.valueOf(iD), null, false, Integer.valueOf(NumberExtKt.getDp(5)), null, null, 108, null).build());
    }

    public static /* synthetic */ void v(PHNCardView pHNCardView, int i, Float f2, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = null;
        }
        if ((i2 & 4) != 0) {
            str = "";
        }
        pHNCardView.u(i, f2, str);
    }

    public final void initView() {
        this.binding.phnTitle.setTitleTextWithIcon(ViewExtKt.getString(this, R.string.phn_common_title), ViewExtKt.loadDrawable(this, R.drawable.ic_tips_20, R.color.s2, Integer.valueOf(NumberExtKt.getDp(16))), new c());
        this.binding.phnArc.setMaxValue(10.0f).setPiecewiseColor(this.defaultStateColors).showIndicator(false).setOpenAngle(HomeUtils.isChineseLanguage() ? 90.0f : 180.0f).refresh();
        j(null);
    }

    public final void setEnterClick(@NotNull Function0<Boolean> block) {
        ExteranelKt.setOnClickWithPolicyListener(this, new d(block, this));
    }

    public final void updateView(@NotNull PHNStateEntry phnStateEntry) {
        this.currentPhnData = phnStateEntry;
        switch (WhenMappings.$EnumSwitchMapping$0[phnStateEntry.getPhnState().ordinal()]) {
            case 1:
            case 2:
                j(phnStateEntry);
                break;
            case 3:
                h(phnStateEntry);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                r(phnStateEntry);
                break;
            case 8:
                s(phnStateEntry);
                break;
            case 9:
                i(phnStateEntry);
                break;
        }
    }

    @JvmOverloads
    public PHNCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.binding = HomepageItemCardPhnBinding.inflate(LayoutInflater.from(context), this, true);
        int iLoadColor = ViewExtKt.loadColor(this, R.color.s4);
        this.gray = iLoadColor;
        this.purple = ViewExtKt.loadColor(this, R.color.s25);
        this.blue = ViewExtKt.loadColor(this, R.color.s15);
        this.green = ViewExtKt.loadColor(this, R.color.s20);
        this.grassGreen = ViewExtKt.loadColor(this, R.color.s22);
        this.yellow = ViewExtKt.loadColor(this, R.color.s33);
        this.defaultStateColors = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(iLoadColor), Integer.valueOf(iLoadColor), Integer.valueOf(iLoadColor), Integer.valueOf(iLoadColor), Integer.valueOf(iLoadColor)});
        this.dialogView = LazyKt__LazyJVMKt.lazy(new b(context));
    }
}

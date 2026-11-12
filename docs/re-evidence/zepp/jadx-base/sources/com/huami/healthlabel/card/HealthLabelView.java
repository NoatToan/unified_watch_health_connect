package com.huami.healthlabel.card;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.healthlabel.R;
import com.huami.healthlabel.card.HealthLabelView;
import com.huami.healthlabel.databinding.HealthLabelExpandCardBinding;
import com.huami.healthlabel.healthlabelhistory.HealthLabelHistoryActivity;
import com.huami.healthlabel.healthlabelmanager.HealthLabelManagerActivity;
import com.huami.healthlabel.koin.ScopesAndQualifersKt;
import com.huami.healthlabel.repository.HealthLabelUseCase;
import com.huami.healthlabel.ui.adapter.LabelAdapter;
import com.huami.healthlabel.ui.anim.SelfRotateAnimation;
import com.huami.healthlabel.ui.custom.AdapterAnimationListener;
import com.huami.healthlabel.ui.custom.DeleteView;
import com.huami.healthlabel.ui.custom.InputView;
import com.huami.healthlabel.ui.custom.LabelTextViewKt;
import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import com.huami.healthlabel.utils.HealthLabelHelper;
import com.huami.healthlabel.utils.UtilsKt;
import com.huami.healthlabel.utils.ext.ColorExtKt;
import com.huami.healthlabel.utils.ext.DateExtKt;
import com.huami.healthlabel.utils.ext.NumberExtKt;
import com.huami.lib.healthlabel.service.HealthLabelCardView;
import com.huami.lib.healthlabel.service.HealthLabelService;
import com.huami.lib.healthlabel.service.LoadData;
import com.huami.lib.healthlabel.service.MixLabel;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u001d\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010X\u001a\u00020W\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010Y\u0012\b\b\u0002\u0010[\u001a\u00020\r¢\u0006\u0004\b\\\u0010]J\u001e\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J.\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0019\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0005H\u0016J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&H\u0016J\b\u0010*\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020+H\u0016J\u0016\u0010-\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\t028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\t028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\t028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00104R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\t028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00104R\u0016\u0010>\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010=R\u0016\u0010B\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010=R\u0016\u0010D\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010=R\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010#R\u0016\u0010L\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001d\u0010V\u001a\u00020Q8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006^"}, d2 = {"Lcom/huami/healthlabel/card/HealthLabelView;", "Lcom/huami/lib/healthlabel/service/HealthLabelCardView;", "Lkotlin/Function0;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "expand", com.google.android.exoplayer2.text.ttml.b.r, "", "Lcom/huami/lib/healthlabel/service/MixLabel;", "dataList", "F", ExifInterface.GPS_DIRECTION_TRUE, "", "remainder", "o", "r", LogUtil.D, "C", "w", "E", "Landroidx/recyclerview/widget/RecyclerView;", "firstRv", "secondRv", "thirdRv", "list", "Lcom/huami/healthlabel/ui/adapter/LabelAdapter;", "y", "stopScrollHorizontally", "com/huami/healthlabel/card/HealthLabelView$loadRvManager$1", "z", "(Z)Lcom/huami/healthlabel/card/HealthLabelView$loadRvManager$1;", "B", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "rv", "J", "isExpand", "initExpand", "Lcom/huami/lib/healthlabel/service/LoadData;", "data", "updateView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "targetView", "Landroid/widget/ImageView;", "arrowView", "expandListener", "Lcom/huami/healthlabel/databinding/HealthLabelExpandCardBinding;", "a", "Lcom/huami/healthlabel/databinding/HealthLabelExpandCardBinding;", "binding", "", "b", "Ljava/util/List;", "firstList", "c", "secondList", GoogleApiAvailabilityLight.a, "thirdList", "e", "expandList", "f", "Lcom/huami/healthlabel/ui/adapter/LabelAdapter;", "firstAdapter", "g", "secondAdapter", "h", "thirdAdapter", "i", "expandAdapter", z.j, "Z", "", hl.k, "clickTime", "l", LogUtil.I, "dataSize", "Lcom/huami/healthlabel/ui/custom/DeleteView;", "m", "Lcom/huami/healthlabel/ui/custom/DeleteView;", "deleteView", "Lcom/huami/healthlabel/repository/HealthLabelUseCase;", GoogleApiAvailabilityLight.b, "Lkotlin/Lazy;", "getUseCase", "()Lcom/huami/healthlabel/repository/HealthLabelUseCase;", "useCase", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelView extends HealthLabelCardView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HealthLabelExpandCardBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private List<MixLabel> firstList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<MixLabel> secondList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private List<MixLabel> thirdList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private List<MixLabel> expandList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private LabelAdapter firstAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private LabelAdapter secondAdapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private LabelAdapter thirdAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private LabelAdapter expandAdapter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isExpand;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private long clickTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int dataSize;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private DeleteView deleteView;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy useCase;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0) {
            super(0);
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HealthLabelView.this.p(this.b, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "hasCache", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (!UtilsKt.isNetworkConnect(HealthLabelView.this.getContext()) && !z) {
                UtilsKt.toast(R.string.health_label_network_error_retry);
            } else {
                HealthLabelAnalyticsKt.analytics$default(HealthLabelAnalyticsKt.HOME_TAG_MANAGE_C, null, 2, null);
                HealthLabelView.this.getContext().startActivity(new Intent(HealthLabelView.this.getContext(), (Class<?>) HealthLabelManagerActivity.class));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "hasCache", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (!UtilsKt.isNetworkConnect(HealthLabelView.this.getContext()) && !z) {
                UtilsKt.toast(R.string.health_label_network_error_retry);
            } else {
                HealthLabelAnalyticsKt.analytics$default(HealthLabelAnalyticsKt.HOME_TAG_LOGGING_C, null, 2, null);
                HealthLabelView.this.getContext().startActivity(new Intent(HealthLabelView.this.getContext(), (Class<?>) HealthLabelHistoryActivity.class).putExtra("cf", HealthLabelAnalyticsKt.TAG_CLICK_SOURCE_HOME));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/healthlabel/repository/HealthLabelUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<HealthLabelUseCase> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HealthLabelUseCase getA() {
            return (HealthLabelUseCase) ScopesAndQualifersKt.labelScope(ScopesAndQualifersKt.getKoin()).get(Reflection.getOrCreateKotlinClass(HealthLabelService.class), null, null);
        }
    }

    @JvmOverloads
    public HealthLabelView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public HealthLabelView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ HealthLabelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ HealthLabelView$loadRvManager$1 A(HealthLabelView healthLabelView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return healthLabelView.z(z);
    }

    private final int B(List<MixLabel> list) {
        Paint paint = new Paint();
        paint.setTextSize(NumberExtKt.sp(15));
        int size = list.size();
        int iMeasureText = 0;
        for (int i = 0; i < size; i++) {
            iMeasureText += ((int) paint.measureText(list.get(i).getLabelText())) + NumberExtKt.dp(34) + NumberExtKt.dp(10);
            if (list.get(i).getClickCount() > 0) {
                iMeasureText += NumberExtKt.dp(15);
            }
        }
        return iMeasureText;
    }

    private final void C() {
        HealthLabelExpandCardBinding healthLabelExpandCardBinding = this.binding;
        healthLabelExpandCardBinding.healthLabelLoadingLl.setVisibility(8);
        healthLabelExpandCardBinding.healthLabelRvAll.setVisibility(8);
        healthLabelExpandCardBinding.healthLabelRetry.setVisibility(0);
        healthLabelExpandCardBinding.healthLabelNetworkError.setVisibility(0);
        healthLabelExpandCardBinding.healthLabelLoadingIv.clearAnimation();
        UtilsKt.toast(R.string.health_label_network_error_retry);
    }

    private final void D() {
        final HealthLabelExpandCardBinding healthLabelExpandCardBinding = this.binding;
        healthLabelExpandCardBinding.healthLabelRvAll.setVisibility(8);
        healthLabelExpandCardBinding.healthLabelRetry.setVisibility(8);
        healthLabelExpandCardBinding.healthLabelNetworkError.setVisibility(8);
        healthLabelExpandCardBinding.healthLabelLoadingLl.setVisibility(0);
        ImageView imageView = healthLabelExpandCardBinding.healthLabelLoadingIv;
        final SelfRotateAnimation selfRotateAnimation = new SelfRotateAnimation(0.0f, 360.0f, 500L, -1);
        selfRotateAnimation.setAnimationListener(new AdapterAnimationListener() { // from class: com.huami.healthlabel.card.HealthLabelView$retryLoadView$1$1$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private long startTime = System.currentTimeMillis();

            public final long getStartTime() {
                return this.startTime;
            }

            @Override // com.huami.healthlabel.ui.custom.AdapterAnimationListener, android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@Nullable Animation animation) {
                if (System.currentTimeMillis() - this.startTime > 30000) {
                    selfRotateAnimation.cancel();
                    healthLabelExpandCardBinding.healthLabelLoadingLl.setVisibility(8);
                    healthLabelExpandCardBinding.healthLabelRetry.setVisibility(0);
                    healthLabelExpandCardBinding.healthLabelNetworkError.setVisibility(0);
                }
            }

            @Override // com.huami.healthlabel.ui.custom.AdapterAnimationListener, android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@Nullable Animation animation) {
                this.startTime = System.currentTimeMillis();
            }

            public final void setStartTime(long j) {
                this.startTime = j;
            }
        });
        Unit unit = Unit.INSTANCE;
        imageView.startAnimation(selfRotateAnimation);
        if (UtilsKt.isNetworkConnect(getContext())) {
            getUseCase().retryLoad$healthLabel_release();
        } else {
            C();
        }
    }

    private final void E() {
        HealthLabelExpandCardBinding healthLabelExpandCardBinding = this.binding;
        if (this.isExpand) {
            healthLabelExpandCardBinding.healthLabelExpand.setVisibility(8);
            healthLabelExpandCardBinding.healthLabelHeader.setVisibility(0);
        } else {
            healthLabelExpandCardBinding.healthLabelHeader.setVisibility(8);
            healthLabelExpandCardBinding.healthLabelExpand.setVisibility(0);
        }
    }

    private final void F(List<MixLabel> dataList) {
        this.dataSize = dataList.size();
        List<MixLabel> listO = o(dataList, 1);
        this.firstList.clear();
        this.firstList.addAll(listO);
        List<MixLabel> listO2 = o(dataList, 2);
        this.secondList.clear();
        this.secondList.addAll(listO2);
        List<MixLabel> listO3 = o(dataList, 0);
        this.thirdList.clear();
        this.thirdList.addAll(listO3);
        final int iCoerceAtLeast = e.coerceAtLeast(B(listO), e.coerceAtLeast(B(listO2), B(listO3)));
        final HealthLabelExpandCardBinding healthLabelExpandCardBinding = this.binding;
        this.firstAdapter.submitList(listO, new Runnable() { // from class: ex3
            @Override // java.lang.Runnable
            public final void run() {
                HealthLabelView.G(this.a, iCoerceAtLeast, healthLabelExpandCardBinding);
            }
        });
        this.secondAdapter.submitList(listO2, new Runnable() { // from class: ox3
            @Override // java.lang.Runnable
            public final void run() {
                HealthLabelView.H(this.a, iCoerceAtLeast, healthLabelExpandCardBinding);
            }
        });
        this.thirdAdapter.submitList(listO3, new Runnable() { // from class: nx3
            @Override // java.lang.Runnable
            public final void run() {
                HealthLabelView.I(this.a, iCoerceAtLeast, healthLabelExpandCardBinding);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(HealthLabelView healthLabelView, int i, HealthLabelExpandCardBinding healthLabelExpandCardBinding) {
        healthLabelView.J(i, healthLabelExpandCardBinding.healthLabelRvOne);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(HealthLabelView healthLabelView, int i, HealthLabelExpandCardBinding healthLabelExpandCardBinding) {
        healthLabelView.J(i, healthLabelExpandCardBinding.healthLabelRvTwo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(HealthLabelView healthLabelView, int i, HealthLabelExpandCardBinding healthLabelExpandCardBinding) {
        healthLabelView.J(i, healthLabelExpandCardBinding.healthLabelRvThree);
    }

    private final void J(int width, RecyclerView rv) {
        rv.setLayoutParams(new LinearLayout.LayoutParams(width, NumberExtKt.dp(47)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(HealthLabelView healthLabelView) {
        healthLabelView.J(healthLabelView.B(healthLabelView.expandList), healthLabelView.binding.healthLabelExpandRv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HealthLabelUseCase getUseCase() {
        return (HealthLabelUseCase) this.useCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(HealthLabelView healthLabelView, Function0 function0, View view) {
        healthLabelView.p(function0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(HealthLabelView healthLabelView, Function0 function0, View view) {
        healthLabelView.p(function0, true);
    }

    private final <T> List<T> o(List<? extends T> list, int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (T t : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (i3 % 3 == i) {
                arrayList.add(t);
            }
            i2 = i3;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Function0<Unit> listener, boolean expand) {
        if (System.currentTimeMillis() - this.clickTime < 500) {
            return;
        }
        this.clickTime = System.currentTimeMillis();
        listener.getA();
        this.isExpand = expand;
        E();
        if (expand) {
            D();
            return;
        }
        if (!this.firstAdapter.getCurrentList().isEmpty()) {
            this.expandList.clear();
            this.expandList.addAll(this.firstAdapter.getCurrentList());
            LabelAdapter labelAdapter = this.expandAdapter;
            if (labelAdapter == null) {
                labelAdapter = null;
            }
            labelAdapter.submitList(this.expandList, new Runnable() { // from class: mx3
                @Override // java.lang.Runnable
                public final void run() {
                    HealthLabelView.q(this.a);
                }
            });
            LabelAdapter labelAdapter2 = this.expandAdapter;
            (labelAdapter2 != null ? labelAdapter2 : null).notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(HealthLabelView healthLabelView) {
        healthLabelView.J(healthLabelView.B(healthLabelView.expandList), healthLabelView.binding.healthLabelExpandRv);
    }

    private final void r() {
        final HealthLabelExpandCardBinding healthLabelExpandCardBinding = this.binding;
        final InputView inputView = new InputView(getContext(), new InputView.InputResultCallback() { // from class: com.huami.healthlabel.card.HealthLabelView$initBottomBtListener$1$inputView$1
            @Override // com.huami.healthlabel.ui.custom.InputView.InputResultCallback
            public void onInputResult(@NotNull String text, @NotNull String textColor) {
                if (this.a.dataSize < 20 && UtilsKt.isNetworkConnect(UtilsKt.getGlobalContext())) {
                    this.a.getUseCase().retryLoad$healthLabel_release();
                }
                this.a.getUseCase().insertHomeLabel$healthLabel_release(new MixLabel(-1, text, textColor, true, System.currentTimeMillis(), 0, -UtilsKt.getTimeSecond(), ColorExtKt.getConvertColor(textColor), null, 256, null));
            }
        });
        healthLabelExpandCardBinding.healthLabelAdd.setOnClickListener(new View.OnClickListener() { // from class: kx3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthLabelView.s(inputView, healthLabelExpandCardBinding, view);
            }
        });
        healthLabelExpandCardBinding.healthLabelEdit.setOnClickListener(new View.OnClickListener() { // from class: hx3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthLabelView.t(this.a, view);
            }
        });
        healthLabelExpandCardBinding.healthLabelRecord.setOnClickListener(new View.OnClickListener() { // from class: gx3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthLabelView.u(this.a, view);
            }
        });
        healthLabelExpandCardBinding.healthLabelRetry.setOnClickListener(new View.OnClickListener() { // from class: dx3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthLabelView.v(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(InputView inputView, HealthLabelExpandCardBinding healthLabelExpandCardBinding, View view) {
        inputView.showAtLocation(healthLabelExpandCardBinding.healthLabelContainer, 48, 0, 0);
        HealthLabelAnalyticsKt.analytics$default(HealthLabelAnalyticsKt.HOME_TAG_ADD_C, null, 2, null);
        Function0<Unit> addLabelListener = HealthLabelHelper.getAddLabelListener();
        if (addLabelListener == null) {
            return;
        }
        addLabelListener.getA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(HealthLabelView healthLabelView, View view) {
        healthLabelView.getUseCase().openManagerPage$healthLabel_release(healthLabelView.new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(HealthLabelView healthLabelView, View view) {
        healthLabelView.getUseCase().openRecordPage$healthLabel_release(healthLabelView.new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(HealthLabelView healthLabelView, View view) {
        healthLabelView.D();
    }

    private final void w() {
        final RecyclerView recyclerView = this.binding.healthLabelExpandRv;
        LabelAdapter labelAdapter = new LabelAdapter(null, false);
        this.expandAdapter = labelAdapter;
        labelAdapter.submitList(this.expandList, new Runnable() { // from class: fx3
            @Override // java.lang.Runnable
            public final void run() {
                HealthLabelView.x(this.a, recyclerView);
            }
        });
        Unit unit = Unit.INSTANCE;
        recyclerView.setAdapter(labelAdapter);
        recyclerView.setLayoutManager(z(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(HealthLabelView healthLabelView, RecyclerView recyclerView) {
        healthLabelView.J(healthLabelView.B(healthLabelView.expandList), recyclerView);
    }

    private final LabelAdapter y(RecyclerView firstRv, final RecyclerView secondRv, final RecyclerView thirdRv, final List<MixLabel> list) {
        LabelAdapter labelAdapter = new LabelAdapter(new LabelAdapter.ItemListener() { // from class: com.huami.healthlabel.card.HealthLabelView$initTripleRv$labelAdapter$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function1<Boolean, Unit> {
                public final /* synthetic */ HealthLabelView a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(HealthLabelView healthLabelView) {
                    super(1);
                    this.a = healthLabelView;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    DeleteView deleteView = this.a.deleteView;
                    if (deleteView != null) {
                        deleteView.cancel();
                    }
                    if (z) {
                        return;
                    }
                    UtilsKt.toast(R.string.health_label_delete_error);
                }
            }

            @Override // com.huami.healthlabel.ui.adapter.LabelAdapter.ItemListener
            public void onItemClick(int position) {
                MixLabel mixLabel = list.get(position);
                HealthLabelView healthLabelView = this;
                MixLabel mixLabel2 = mixLabel;
                if (mixLabel2.getClickCount() < 99) {
                    mixLabel2.setClickCount(mixLabel2.getClickCount() + 1);
                    mixLabel2.setTimestamp(System.currentTimeMillis());
                    healthLabelView.getUseCase().updateRecordLabel$healthLabel_release(mixLabel2);
                } else {
                    UtilsKt.toast(R.string.health_label_click_limit_reached);
                }
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("id", Integer.valueOf(mixLabel2.getLabelId()));
                pairArr[1] = new Pair("tag", mixLabel2.getLabelText());
                String reason = mixLabel2.getReason();
                if (reason == null) {
                    reason = "";
                }
                pairArr[2] = new Pair("reason", reason);
                HealthLabelAnalyticsKt.analytics(HealthLabelAnalyticsKt.HOME_TAG_SELECT_C, (List<? extends Pair<String, ? extends Object>>) CollectionsKt__CollectionsKt.listOf((Object[]) pairArr));
            }

            @Override // com.huami.healthlabel.ui.adapter.LabelAdapter.ItemListener
            public void onItemLongClick(int position) {
                MixLabel mixLabel = list.get(position);
                HealthLabelView healthLabelView = this;
                MixLabel mixLabel2 = mixLabel;
                if (mixLabel2.getClickCount() > 0) {
                    if (!UtilsKt.isNetworkConnect(UtilsKt.getGlobalContext())) {
                        UtilsKt.toast(R.string.health_label_delete_error);
                        return;
                    }
                    if (healthLabelView.deleteView == null) {
                        healthLabelView.deleteView = new DeleteView(healthLabelView.getContext());
                    }
                    DeleteView deleteView = healthLabelView.deleteView;
                    if (deleteView != null) {
                        deleteView.show();
                    }
                    Pair<Long, Long> pairTimeRange = DateExtKt.timeRange(DateExtKt.getBeginningTime(new Date()), 1440);
                    healthLabelView.getUseCase().deleteLabelRecord$healthLabel_release(mixLabel2.getLabelText(), pairTimeRange.getFirst().longValue(), pairTimeRange.getSecond().longValue(), new a(healthLabelView));
                    HealthLabelAnalyticsKt.analytics(HealthLabelAnalyticsKt.HOME_TAG_HOLD_C, CollectionsKt__CollectionsKt.arrayListOf(new Pair("id", Integer.valueOf(mixLabel2.getLabelId())), new Pair("tag", mixLabel2.getLabelText()), new Pair("count", Integer.valueOf(mixLabel2.getClickCount()))));
                }
            }
        }, false, 2, null);
        firstRv.setAdapter(labelAdapter);
        firstRv.setLayoutManager(A(this, false, 1, null));
        firstRv.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huami.healthlabel.card.HealthLabelView$initTripleRv$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (recyclerView.getScrollState() != 0) {
                    secondRv.scrollBy(dx, dy);
                    thirdRv.scrollBy(dx, dy);
                }
            }
        });
        return labelAdapter;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.flexbox.FlexboxLayoutManager, com.huami.healthlabel.card.HealthLabelView$loadRvManager$1] */
    private final HealthLabelView$loadRvManager$1 z(final boolean stopScrollHorizontally) {
        final Context context = getContext();
        ?? r1 = new FlexboxLayoutManager(context) { // from class: com.huami.healthlabel.card.HealthLabelView$loadRvManager$1
            @Override // com.google.android.flexbox.FlexboxLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                if (stopScrollHorizontally) {
                    return false;
                }
                return super.canScrollHorizontally();
            }

            @Override // com.google.android.flexbox.FlexboxLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
        r1.setJustifyContent(0);
        r1.setAlignItems(0);
        r1.setFlexWrap(1);
        r1.setMaxLine(1);
        return r1;
    }

    @Override // com.huami.lib.healthlabel.service.HealthLabelCardView
    public void expandListener(@NotNull final Function0<Unit> listener) {
        this.clickTime = System.currentTimeMillis();
        HealthLabelExpandCardBinding healthLabelExpandCardBinding = this.binding;
        healthLabelExpandCardBinding.healthLabelArrow.setOnClickListener(new View.OnClickListener() { // from class: jx3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthLabelView.m(this.a, listener, view);
            }
        });
        healthLabelExpandCardBinding.healthLabelExpand.setOnClickListener(new View.OnClickListener() { // from class: ix3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthLabelView.n(this.a, listener, view);
            }
        });
        LabelTextViewKt.setLabelTextViewListener(new a(listener));
    }

    @Override // com.huami.lib.healthlabel.service.HealthLabelCardView
    public void initExpand(boolean isExpand) {
        this.isExpand = isExpand;
        E();
    }

    @Override // com.huami.lib.healthlabel.service.HealthLabelCardView
    public void updateView(@NotNull LoadData data) {
        HealthLabelExpandCardBinding healthLabelExpandCardBinding = this.binding;
        healthLabelExpandCardBinding.healthLabelLoadingIv.clearAnimation();
        if (data.getLoadFromDb() || !data.getDatas().isEmpty()) {
            healthLabelExpandCardBinding.healthLabelLoadingLl.setVisibility(8);
            healthLabelExpandCardBinding.healthLabelRvAll.setVisibility(0);
            healthLabelExpandCardBinding.healthLabelRetry.setVisibility(8);
            healthLabelExpandCardBinding.healthLabelNetworkError.setVisibility(8);
        } else {
            healthLabelExpandCardBinding.healthLabelLoadingLl.setVisibility(8);
            healthLabelExpandCardBinding.healthLabelRvAll.setVisibility(8);
            healthLabelExpandCardBinding.healthLabelRetry.setVisibility(0);
            healthLabelExpandCardBinding.healthLabelNetworkError.setVisibility(0);
        }
        if ((!data.getDatas().isEmpty()) && data.getLoadFromDb()) {
            List listO = o(data.getDatas(), 1);
            this.expandList.clear();
            this.expandList.addAll(listO);
            LabelAdapter labelAdapter = this.expandAdapter;
            if (labelAdapter == null) {
                labelAdapter = null;
            }
            labelAdapter.submitList(this.expandList, new Runnable() { // from class: lx3
                @Override // java.lang.Runnable
                public final void run() {
                    HealthLabelView.K(this.a);
                }
            });
            LabelAdapter labelAdapter2 = this.expandAdapter;
            (labelAdapter2 != null ? labelAdapter2 : null).notifyDataSetChanged();
        }
        if (data.getLoadFromDb()) {
            return;
        }
        F(data.getDatas());
    }

    @JvmOverloads
    public HealthLabelView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        HealthLabelExpandCardBinding healthLabelExpandCardBindingInflate = HealthLabelExpandCardBinding.inflate(LayoutInflater.from(context), this, true);
        this.binding = healthLabelExpandCardBindingInflate;
        this.firstList = new ArrayList();
        this.secondList = new ArrayList();
        this.thirdList = new ArrayList();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(HealthLabelViewKt.a);
        Unit unit = Unit.INSTANCE;
        this.expandList = arrayList;
        this.useCase = LazyKt__LazyJVMKt.lazy(d.a);
        E();
        w();
        this.firstAdapter = y(healthLabelExpandCardBindingInflate.healthLabelRvOne, healthLabelExpandCardBindingInflate.healthLabelRvTwo, healthLabelExpandCardBindingInflate.healthLabelRvThree, this.firstList);
        this.secondAdapter = y(healthLabelExpandCardBindingInflate.healthLabelRvTwo, healthLabelExpandCardBindingInflate.healthLabelRvOne, healthLabelExpandCardBindingInflate.healthLabelRvThree, this.secondList);
        this.thirdAdapter = y(healthLabelExpandCardBindingInflate.healthLabelRvThree, healthLabelExpandCardBindingInflate.healthLabelRvOne, healthLabelExpandCardBindingInflate.healthLabelRvTwo, this.thirdList);
        r();
    }

    @Override // com.huami.lib.healthlabel.service.HealthLabelCardView
    @NotNull
    public ImageView arrowView() {
        return this.binding.healthLabelArrow;
    }

    @Override // com.huami.lib.healthlabel.service.HealthLabelCardView
    @NotNull
    public ConstraintLayout targetView() {
        return this.binding.healthLabelContainer;
    }
}

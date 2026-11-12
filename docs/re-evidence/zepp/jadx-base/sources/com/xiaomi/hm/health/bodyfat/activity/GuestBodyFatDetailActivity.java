package com.xiaomi.hm.health.bodyfat.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.ViewModelProviders;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.databinding.ActivityGuestBodyfatDetailBinding;
import com.xiaomi.hm.health.bodyfat.fragment.AdultBodyIndexFragment;
import com.xiaomi.hm.health.bodyfat.fragment.ChildBodyIndexFragment;
import com.xiaomi.hm.health.bodyfat.fragment.HeartRatePressureFragment;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoRepository;
import com.xiaomi.hm.health.bodyfat.share.WeightShare;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.viewmodel.BodyFatDetailsViewModel;
import com.xiaomi.hm.health.databases.model.AdEntity;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.netty.util.internal.StringUtil;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0019\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\"\u001a\u0004\u0018\u00010\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001f\u0010'\u001a\u0004\u0018\u00010#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/GuestBodyFatDetailActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", com.google.android.exoplayer2.text.ttml.b.r, "", "age", "height", DTransferConstants.SEARCH_KEY, "score", "r", "(Ljava/lang/Integer;)V", "initViews", "Lcom/xiaomi/hm/health/bodyfat/share/WeightShare;", "l", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onShareClicked", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityGuestBodyfatDetailBinding;", "x", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityGuestBodyfatDetailBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/BodyFatDetailsViewModel;", "y", "Lkotlin/Lazy;", "o", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/BodyFatDetailsViewModel;", "viewModel", "Lcom/xiaomi/hm/health/databases/model/AdEntity;", "z", "m", "()Lcom/xiaomi/hm/health/databases/model/AdEntity;", "bodyAdEntity", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, GoogleApiAvailabilityLight.b, "()Ljava/lang/String;", "prefixTitle", "Lcom/xiaomi/hm/health/bodyfat/fragment/AdultBodyIndexFragment;", "B", "Lcom/xiaomi/hm/health/bodyfat/fragment/AdultBodyIndexFragment;", "adultBodyIndexFragment", "Lcom/xiaomi/hm/health/bodyfat/fragment/ChildBodyIndexFragment;", "C", "Lcom/xiaomi/hm/health/bodyfat/fragment/ChildBodyIndexFragment;", "childBodyIndexFragment", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class GuestBodyFatDetailActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    private AdultBodyIndexFragment adultBodyIndexFragment;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    private ChildBodyIndexFragment childBodyIndexFragment;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private ActivityGuestBodyfatDetailBinding binding;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy bodyAdEntity = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy prefixTitle = LazyKt__LazyJVMKt.lazy(new b());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/AdEntity;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AdEntity> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AdEntity getA() {
            return BFCallback.getHMAdManager().getCurrentAd(BFConstant.TYPE_BODY_FAT_AD);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            AdEntity adEntityM = GuestBodyFatDetailActivity.this.m();
            if (adEntityM == null) {
                return null;
            }
            return adEntityM.getTitle();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.activity.GuestBodyFatDetailActivity$showGuestContent$1", f = "GuestBodyFatDetailActivity.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GuestBodyFatDetailActivity.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ActivityGuestBodyfatDetailBinding activityGuestBodyfatDetailBinding = GuestBodyFatDetailActivity.this.binding;
            Objects.requireNonNull(activityGuestBodyfatDetailBinding);
            activityGuestBodyfatDetailBinding.guestBodyFatScroll.scrollTo(0, 0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/BodyFatDetailsViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<BodyFatDetailsViewModel> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BodyFatDetailsViewModel getA() {
            return (BodyFatDetailsViewModel) ViewModelProviders.of(GuestBodyFatDetailActivity.this).get(BodyFatDetailsViewModel.class);
        }
    }

    private final void initViews() {
        BFCallback.getHMAdManager().saveAdLoaded(m(), BFConstant.TYPE_BODY_FAT_AD);
        BFCallback.getHMAdManager().getCurrentColor(m(), "title", BFConstant.DEFAULT_BODY_FAT_COLOR);
        BFTitleStyleKt.setBackAndShareTitleStyle(this);
        setTitleText(R.string.guest_measure_result);
    }

    private final WeightShare l() {
        WeightInfos value = o().getSelectWeightInfo().getValue();
        if (value == null) {
            return null;
        }
        String unitStr = HMWeightUtils.toUnitStr(getApplicationContext(), BFCallback.getUnitManager().getWeightUnit());
        WeightShare weightShare = new WeightShare();
        weightShare.setUserid(-3L);
        weightShare.setWeightUnitStr(unitStr);
        weightShare.setWeightTime(value.getTimestamp().longValue());
        float fFloatValue = value.getWeight().floatValue();
        weightShare.setType(1);
        weightShare.setWeightValue(HMWeightUtils.getWeightValueStringForDisplay(fFloatValue, BFCallback.getUnitManager().getWeightUnit()));
        if (value.getBody_fat() != null) {
            weightShare.setBodyFat(String.valueOf(HMWeightUtils.scaleFloatToDown(value.getBody_fat().floatValue(), 1)));
        } else {
            weightShare.setBodyFat("--");
        }
        String string = getString(R.string.empty_value);
        AdultBodyIndexFragment adultBodyIndexFragment = this.adultBodyIndexFragment;
        if (adultBodyIndexFragment != null && adultBodyIndexFragment.isAdded()) {
            string = adultBodyIndexFragment.getShareShapeStr();
        }
        weightShare.setFigure(string);
        weightShare.setScore(value.getScore() == null ? 0 : value.getScore().intValue());
        return weightShare;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdEntity m() {
        return (AdEntity) this.bodyAdEntity.getValue();
    }

    private final String n() {
        return (String) this.prefixTitle.getValue();
    }

    private final BodyFatDetailsViewModel o() {
        return (BodyFatDetailsViewModel) this.viewModel.getValue();
    }

    private final void p() {
        o().setUserInfos(UserInfoManager.getManager().getGuest());
        o().getSelectWeightInfo().setValue(WeightInfoRepository.INSTANCE.getInstance().getGuestWeightInfo());
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            getSupportFragmentManager().beginTransaction().add(R.id.hr_pressure_container, new HeartRatePressureFragment()).commit();
        }
        UserInfos userInfos = o().getUserInfos();
        if (userInfos == null) {
            return;
        }
        q(BFCallback.getInstance().getAgeByDate(userInfos.getBirthday()), userInfos.getHeight().intValue());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    private final void q(int age, int height) {
        String quantityString;
        if (age < 6 || age > 99) {
            quantityString = getResources().getQuantityString(R.plurals.too_young_for_calculate, 6, 6);
            String quantityString2 = getResources().getQuantityString(R.plurals.too_old_for_calculate, 99, 99);
            if (age >= 6) {
                quantityString = quantityString2;
            }
        } else if (height > 220 || height < 90) {
            quantityString = getString(height < 90 ? R.string.body_fat_guest_empty_too_short : R.string.body_fat_guest_empty_too_high);
        } else if (o().getSelectWeightInfo().getValue() == null) {
            quantityString = getString(R.string.body_fat_guest_empty_no_data);
        } else {
            WeightInfos value = o().getSelectWeightInfo().getValue();
            if ((value == null ? null : value.getBody_fat()) == null) {
                quantityString = getString(R.string.body_fat_guest_empty_no_data);
            } else {
                quantityString = "";
            }
        }
        if (quantityString.length() == 0) {
            if (HMWeightUtils.isAgeMatch(age)) {
                this.childBodyIndexFragment = new ChildBodyIndexFragment();
                getSupportFragmentManager().beginTransaction().add(R.id.body_index_container, this.childBodyIndexFragment).commit();
            } else {
                this.adultBodyIndexFragment = new AdultBodyIndexFragment();
                getSupportFragmentManager().beginTransaction().add(R.id.body_index_container, this.adultBodyIndexFragment).commit();
            }
            ActivityGuestBodyfatDetailBinding activityGuestBodyfatDetailBinding = this.binding;
            Objects.requireNonNull(activityGuestBodyfatDetailBinding);
            activityGuestBodyfatDetailBinding.bodyFatEmptyTv.setVisibility(8);
            ActivityGuestBodyfatDetailBinding activityGuestBodyfatDetailBinding2 = this.binding;
            Objects.requireNonNull(activityGuestBodyfatDetailBinding2);
            activityGuestBodyfatDetailBinding2.guestBodyFatScroll.setScrollable(true);
            e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(null), 3, null);
        } else {
            ActivityGuestBodyfatDetailBinding activityGuestBodyfatDetailBinding3 = this.binding;
            Objects.requireNonNull(activityGuestBodyfatDetailBinding3);
            activityGuestBodyfatDetailBinding3.guestBodyFatScroll.setScrollable(false);
            ActivityGuestBodyfatDetailBinding activityGuestBodyfatDetailBinding4 = this.binding;
            Objects.requireNonNull(activityGuestBodyfatDetailBinding4);
            activityGuestBodyfatDetailBinding4.bodyIndexContainer.setVisibility(8);
            ActivityGuestBodyfatDetailBinding activityGuestBodyfatDetailBinding5 = this.binding;
            Objects.requireNonNull(activityGuestBodyfatDetailBinding5);
            activityGuestBodyfatDetailBinding5.bodyFatEmptyTv.setVisibility(0);
            ActivityGuestBodyfatDetailBinding activityGuestBodyfatDetailBinding6 = this.binding;
            Objects.requireNonNull(activityGuestBodyfatDetailBinding6);
            activityGuestBodyfatDetailBinding6.bodyFatEmptyTv.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            ActivityGuestBodyfatDetailBinding activityGuestBodyfatDetailBinding7 = this.binding;
            Objects.requireNonNull(activityGuestBodyfatDetailBinding7);
            activityGuestBodyfatDetailBinding7.bodyFatEmptyTv.setText(quantityString);
        }
        WeightInfos value2 = o().getSelectWeightInfo().getValue();
        if (value2 == null) {
            return;
        }
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        r(value2.getScore());
        ActivityGuestBodyfatDetailBinding activityGuestBodyfatDetailBinding8 = this.binding;
        Objects.requireNonNull(activityGuestBodyfatDetailBinding8);
        TypefaceTextView typefaceTextView = activityGuestBodyfatDetailBinding8.scoreSubValueTv;
        StringBuilder sb = new StringBuilder();
        sb.append((Object) HMWeightUtils.getWeightValueStringForDisplay(value2.getWeight().floatValue(), weightUnit));
        sb.append(StringUtil.SPACE);
        sb.append((Object) HMWeightUtils.toUnitStr(getApplicationContext(), weightUnit));
        typefaceTextView.setText(sb.toString());
    }

    private final void r(Integer score) {
        String string = getString(R.string.empty_value);
        if (score != null) {
            string = score.toString();
        }
        ActivityGuestBodyfatDetailBinding activityGuestBodyfatDetailBinding = this.binding;
        Objects.requireNonNull(activityGuestBodyfatDetailBinding);
        activityGuestBodyfatDetailBinding.scoreValueTv.setValues(string, "");
        ActivityGuestBodyfatDetailBinding activityGuestBodyfatDetailBinding2 = this.binding;
        Objects.requireNonNull(activityGuestBodyfatDetailBinding2);
        activityGuestBodyfatDetailBinding2.scoreValueTv.setTag(string);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(savedInstanceState);
        ActivityGuestBodyfatDetailBinding activityGuestBodyfatDetailBindingInflate = ActivityGuestBodyfatDetailBinding.inflate(getLayoutInflater());
        this.binding = activityGuestBodyfatDetailBindingInflate;
        Objects.requireNonNull(activityGuestBodyfatDetailBindingInflate);
        setContentView(activityGuestBodyfatDetailBindingInflate.getRoot());
        initViews();
        p();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onShareClicked(@Nullable View view) {
        super.onShareClicked(view);
        WeightShare weightShareL = l();
        if (weightShareL == null) {
            return;
        }
        BFCallback.getInstance().shareBodyFat(this, weightShareL, weightShareL.getUserid(), weightShareL.getWeightTime(), "");
    }
}

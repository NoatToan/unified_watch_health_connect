package com.xiaomi.hm.health.bodyfat.activity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.view.weightfigure.WeightFigureView;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.databinding.ActivityGuestOneFootDetailBinding;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.model.Birthday;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.OneFootUtils;
import com.xiaomi.hm.health.bodyfat.view.SDAdaptiveTextView;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.text.NumberFormat;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/GuestOneFootDetailActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "m", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "weightInfo", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "user", "l", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityGuestOneFootDetailBinding;", "x", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityGuestOneFootDetailBinding;", "binding", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class GuestOneFootDetailActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private ActivityGuestOneFootDetailBinding binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "", "index", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<Float, Integer, Unit> {
        public final /* synthetic */ String[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String[] strArr) {
            super(2);
            this.b = strArr;
        }

        public final void a(float f, int i) {
            String string = GuestOneFootDetailActivity.this.getString(R.string.one_foot_score_level, new Object[]{this.b[i]});
            ActivityGuestOneFootDetailBinding activityGuestOneFootDetailBinding = GuestOneFootDetailActivity.this.binding;
            Objects.requireNonNull(activityGuestOneFootDetailBinding);
            activityGuestOneFootDetailBinding.textViewScoreLevel.setText(string);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Float f, Integer num) {
            a(f.floatValue(), num.intValue());
            return Unit.INSTANCE;
        }
    }

    private final void l(WeightInfos weightInfo, UserInfos user) {
        if (weightInfo == null || user == null) {
            return;
        }
        int age = Birthday.fromStr(user.getBirthday()).getAge();
        Float ofmt = weightInfo.getOfmt();
        if (age < 20 || age > 69) {
            ActivityGuestOneFootDetailBinding activityGuestOneFootDetailBinding = this.binding;
            Objects.requireNonNull(activityGuestOneFootDetailBinding);
            activityGuestOneFootDetailBinding.oneFootValueTextView.setText(getResources().getString(R.string.empty_value));
            ActivityGuestOneFootDetailBinding activityGuestOneFootDetailBinding2 = this.binding;
            Objects.requireNonNull(activityGuestOneFootDetailBinding2);
            activityGuestOneFootDetailBinding2.relayoutForScoreFigure.setVisibility(8);
            ActivityGuestOneFootDetailBinding activityGuestOneFootDetailBinding3 = this.binding;
            Objects.requireNonNull(activityGuestOneFootDetailBinding3);
            activityGuestOneFootDetailBinding3.relayoutForNoScore.setVisibility(0);
            String quantityString = getResources().getQuantityString(R.plurals.too_young_for_calculate, 20, 20);
            String quantityString2 = getResources().getQuantityString(R.plurals.too_old_for_calculate, 69, 69);
            ActivityGuestOneFootDetailBinding activityGuestOneFootDetailBinding4 = this.binding;
            Objects.requireNonNull(activityGuestOneFootDetailBinding4);
            TextView textView = activityGuestOneFootDetailBinding4.textNoScore;
            if (age >= 20) {
                quantityString = quantityString2;
            }
            textView.setText(quantityString);
            return;
        }
        ActivityGuestOneFootDetailBinding activityGuestOneFootDetailBinding5 = this.binding;
        Objects.requireNonNull(activityGuestOneFootDetailBinding5);
        activityGuestOneFootDetailBinding5.oneFootValueTextView.setText(NumberFormat.getNumberInstance().format(ofmt));
        ActivityGuestOneFootDetailBinding activityGuestOneFootDetailBinding6 = this.binding;
        Objects.requireNonNull(activityGuestOneFootDetailBinding6);
        activityGuestOneFootDetailBinding6.relayoutForScoreFigure.setVisibility(0);
        ActivityGuestOneFootDetailBinding activityGuestOneFootDetailBinding7 = this.binding;
        Objects.requireNonNull(activityGuestOneFootDetailBinding7);
        activityGuestOneFootDetailBinding7.relayoutForNoScore.setVisibility(8);
        float[] maxTimeArray = OneFootUtils.getMaxTimeArray(age, user.getGender().intValue());
        String[] oneFootFigureLables = HMWeightUtils.getOneFootFigureLables(this);
        int[] iArrGeOneFootScoreColors = HMWeightUtils.geOneFootScoreColors(this);
        ActivityGuestOneFootDetailBinding activityGuestOneFootDetailBinding8 = this.binding;
        Objects.requireNonNull(activityGuestOneFootDetailBinding8);
        ViewGroup.LayoutParams layoutParams = activityGuestOneFootDetailBinding8.oneFootFigureView.getLayoutParams();
        ActivityGuestOneFootDetailBinding activityGuestOneFootDetailBinding9 = this.binding;
        Objects.requireNonNull(activityGuestOneFootDetailBinding9);
        activityGuestOneFootDetailBinding9.oneFootFigureView.setLayoutParams(layoutParams);
        ActivityGuestOneFootDetailBinding activityGuestOneFootDetailBinding10 = this.binding;
        Objects.requireNonNull(activityGuestOneFootDetailBinding10);
        WeightFigureView.setValues$default(activityGuestOneFootDetailBinding10.oneFootFigureView, maxTimeArray, iArrGeOneFootScoreColors, oneFootFigureLables, null, false, 24, null);
        ActivityGuestOneFootDetailBinding activityGuestOneFootDetailBinding11 = this.binding;
        Objects.requireNonNull(activityGuestOneFootDetailBinding11);
        activityGuestOneFootDetailBinding11.oneFootFigureView.setInitValue(ofmt.floatValue());
        ActivityGuestOneFootDetailBinding activityGuestOneFootDetailBinding12 = this.binding;
        Objects.requireNonNull(activityGuestOneFootDetailBinding12);
        activityGuestOneFootDetailBinding12.oneFootFigureView.setValueIndexListener(new a(oneFootFigureLables));
    }

    private final void m() {
        l(WeightInfoManager.getManager().getGuestOneFootInfo(), UserInfoManager.getManager().getGuest());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(savedInstanceState);
        ActivityGuestOneFootDetailBinding activityGuestOneFootDetailBindingInflate = ActivityGuestOneFootDetailBinding.inflate(getLayoutInflater());
        this.binding = activityGuestOneFootDetailBindingInflate;
        Objects.requireNonNull(activityGuestOneFootDetailBindingInflate);
        setContentView(activityGuestOneFootDetailBindingInflate.getRoot());
        BFTitleStyleKt.setTitleStyle$default(this, getString(R.string.guest_measure_result), null, null, 0, BFCallback.getInstance().enableMiDongFlavor(), 6, null);
        ((TextView) findViewById(R.id.card_status_title)).setText(R.string.card_intro_balance_title);
        ((SDAdaptiveTextView) findViewById(R.id.card_status_introduce)).setText(R.string.card_intro_balance_info);
        m();
    }
}

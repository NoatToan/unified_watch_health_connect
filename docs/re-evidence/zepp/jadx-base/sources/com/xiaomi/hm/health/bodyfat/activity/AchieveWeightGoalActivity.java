package com.xiaomi.hm.health.bodyfat.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.view.image.HMCircleImageView;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.widget.share.PreShareListener;
import com.huami.widget.share.ShareContent;
import com.huami.widget.share.SharePanel;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.AchieveWeightGoalActivity;
import com.xiaomi.hm.health.bodyfat.databinding.ActivityAchieveWeightGoalBinding;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightGoalManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoRepository;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BodyFatTimeUtils;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightGoals;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.Date;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\n\u001a\u00020\u0003H\u0014J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001a\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/AchieveWeightGoalActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/huami/widget/share/PreShareListener;", "", "initView", "Lcom/huami/widget/share/ShareContent;", "g", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "", "shareType", "onPreShare", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityAchieveWeightGoalBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityAchieveWeightGoalBinding;", "binding", "", "b", "Lkotlin/Lazy;", "i", "()J", "userId", "c", z.j, ParamKey.weightId, "Lcom/huami/widget/share/SharePanel;", GoogleApiAvailabilityLight.a, "h", "()Lcom/huami/widget/share/SharePanel;", "shareFragment", "Landroid/widget/Button;", "e", "Landroid/widget/Button;", com.alipay.sdk.m.x.d.x, "Landroid/widget/FrameLayout;", "f", "Landroid/widget/FrameLayout;", "shareContainer", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class AchieveWeightGoalActivity extends AppCompatActivity implements PreShareListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private ActivityAchieveWeightGoalBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy weightId = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy shareFragment = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Button backButton;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private FrameLayout shareContainer;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/AchieveWeightGoalActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "uid", ParamKey.weightId, "", "startAchieveWeightGoal", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startAchieveWeightGoal(@NotNull Context context, long uid, long weightId) {
            Intent intent = new Intent(context, (Class<?>) AchieveWeightGoalActivity.class);
            Bundle bundle = new Bundle();
            bundle.putLong("UID", uid);
            bundle.putLong(ParamKey.weightId, weightId);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ ShareContent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ShareContent shareContent) {
            super(0);
            this.a = shareContent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("bitmapUrl = ", this.a.bitmapUrl);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/widget/share/SharePanel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SharePanel> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharePanel getA() {
            return new SharePanel();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Long> {
        public c() {
            super(0);
        }

        public final long a() {
            Bundle extras;
            Intent intent = AchieveWeightGoalActivity.this.getIntent();
            if (intent == null || (extras = intent.getExtras()) == null) {
                return 0L;
            }
            return extras.getLong("UID");
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Long getA() {
            return Long.valueOf(a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Long> {
        public d() {
            super(0);
        }

        public final long a() {
            Bundle extras;
            Intent intent = AchieveWeightGoalActivity.this.getIntent();
            if (intent == null || (extras = intent.getExtras()) == null) {
                return 0L;
            }
            return extras.getLong(ParamKey.weightId);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Long getA() {
            return Long.valueOf(a());
        }
    }

    private final ShareContent g() {
        ShareContent shareContent = new ShareContent();
        shareContent.content = "";
        shareContent.title = "";
        shareContent.topic = "";
        BFCallback.IBFCallBack bFCallback = BFCallback.getInstance();
        ActivityAchieveWeightGoalBinding activityAchieveWeightGoalBinding = this.binding;
        Objects.requireNonNull(activityAchieveWeightGoalBinding);
        shareContent.bitmapUrl = bFCallback.captureViewShare(activityAchieveWeightGoalBinding.getRoot());
        HMLog.info(SportAnalytics.Params.VALUE_SHARE, new a(shareContent));
        return shareContent;
    }

    private final SharePanel h() {
        return (SharePanel) this.shareFragment.getValue();
    }

    private final long i() {
        return ((Number) this.userId.getValue()).longValue();
    }

    private final void initView() {
        Float weight;
        Float bmi;
        Float weight2;
        ActivityAchieveWeightGoalBinding activityAchieveWeightGoalBinding = this.binding;
        Objects.requireNonNull(activityAchieveWeightGoalBinding);
        activityAchieveWeightGoalBinding.btnSetGoal.setOnClickListener(new View.OnClickListener() { // from class: h5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AchieveWeightGoalActivity.k(this.a, view);
            }
        });
        this.backButton = (Button) findViewById(R.id.back_button);
        int i = R.id.share_container;
        this.shareContainer = (FrameLayout) findViewById(i);
        Button button = this.backButton;
        Objects.requireNonNull(button);
        button.setOnClickListener(new View.OnClickListener() { // from class: f5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AchieveWeightGoalActivity.l(this.a, view);
            }
        });
        ActivityAchieveWeightGoalBinding activityAchieveWeightGoalBinding2 = this.binding;
        Objects.requireNonNull(activityAchieveWeightGoalBinding2);
        activityAchieveWeightGoalBinding2.titleBarBack.setOnClickListener(new View.OnClickListener() { // from class: g5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AchieveWeightGoalActivity.m(this.a, view);
            }
        });
        Bundle bundle = new Bundle();
        bundle.putBoolean("share_type", true);
        h().setArguments(bundle);
        h().setShareListener(this);
        getSupportFragmentManager().beginTransaction().add(i, h()).commit();
        WeightGoals weightGoalByUserId = WeightGoalManager.getInstance().getWeightGoalByUserId(i());
        UserInfos info = UserInfoManager.getManager().getInfo(i());
        WeightInfos weightInfo = WeightInfoRepository.INSTANCE.getInstance().getWeightInfo(j());
        if (weightGoalByUserId == null) {
            return;
        }
        ActivityAchieveWeightGoalBinding activityAchieveWeightGoalBinding3 = this.binding;
        Objects.requireNonNull(activityAchieveWeightGoalBinding3);
        String strValueOf = null;
        activityAchieveWeightGoalBinding3.textUserName.setText(info == null ? null : info.getName());
        BFCallback.IBFCallBack bFCallback = BFCallback.getInstance();
        ActivityAchieveWeightGoalBinding activityAchieveWeightGoalBinding4 = this.binding;
        Objects.requireNonNull(activityAchieveWeightGoalBinding4);
        HMCircleImageView hMCircleImageView = activityAchieveWeightGoalBinding4.ivUserAvatar;
        String avatarPath = info == null ? null : info.getAvatarPath();
        String avatarUrl = info == null ? null : info.getAvatarUrl();
        Object[] objArr = new Object[1];
        objArr[0] = info == null ? null : info.getName();
        bFCallback.updateAvatarUI(hMCircleImageView, avatarPath, avatarUrl, objArr);
        int deltaDayCount = BodyFatTimeUtils.INSTANCE.getDeltaDayCount(new Date(ExtentionUtilsKt.millsToSecond(weightGoalByUserId.getDateTime().longValue(), true)), new Date(System.currentTimeMillis()));
        if (deltaDayCount <= 0) {
            deltaDayCount = 1;
        }
        float fFloatValue = 0.0f;
        float fFloatValue2 = weightGoalByUserId.getCurrentVal().floatValue() - ((weightInfo == null || (weight = weightInfo.getWeight()) == null) ? 0.0f : weight.floatValue());
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        if (fFloatValue2 < 0.0f) {
            ActivityAchieveWeightGoalBinding activityAchieveWeightGoalBinding5 = this.binding;
            Objects.requireNonNull(activityAchieveWeightGoalBinding5);
            activityAchieveWeightGoalBinding5.textTips.setText(getResources().getQuantityString(R.plurals.bodyfat_tips_achieve_weight_goal_1, deltaDayCount, Integer.valueOf(deltaDayCount)));
        } else {
            ActivityAchieveWeightGoalBinding activityAchieveWeightGoalBinding6 = this.binding;
            Objects.requireNonNull(activityAchieveWeightGoalBinding6);
            activityAchieveWeightGoalBinding6.textTips.setText(getResources().getQuantityString(R.plurals.tips_achieve_weight_goal, deltaDayCount, Integer.valueOf(deltaDayCount)));
        }
        int i2 = fFloatValue2 < 0.0f ? R.drawable.icon_arrow_up : R.drawable.icon_arrow_down_black;
        ActivityAchieveWeightGoalBinding activityAchieveWeightGoalBinding7 = this.binding;
        Objects.requireNonNull(activityAchieveWeightGoalBinding7);
        activityAchieveWeightGoalBinding7.textNum.setText(HMWeightUtils.getWeightValueStringForDisplay(Math.abs(fFloatValue2), weightUnit));
        ActivityAchieveWeightGoalBinding activityAchieveWeightGoalBinding8 = this.binding;
        Objects.requireNonNull(activityAchieveWeightGoalBinding8);
        activityAchieveWeightGoalBinding8.textUnit.setText(BFCallback.getUnitManager().getWeightUnitString(weightUnit));
        ActivityAchieveWeightGoalBinding activityAchieveWeightGoalBinding9 = this.binding;
        Objects.requireNonNull(activityAchieveWeightGoalBinding9);
        activityAchieveWeightGoalBinding9.textUnit.setCompoundDrawablesWithIntrinsicBounds(0, 0, i2, 0);
        ActivityAchieveWeightGoalBinding activityAchieveWeightGoalBinding10 = this.binding;
        Objects.requireNonNull(activityAchieveWeightGoalBinding10);
        TextView textView = activityAchieveWeightGoalBinding10.textWeightValue;
        if (weightInfo != null && (weight2 = weightInfo.getWeight()) != null) {
            fFloatValue = weight2.floatValue();
        }
        textView.setText(HMWeightUtils.getWeightValueStringForDisplay(fFloatValue, weightUnit));
        ActivityAchieveWeightGoalBinding activityAchieveWeightGoalBinding11 = this.binding;
        Objects.requireNonNull(activityAchieveWeightGoalBinding11);
        TextView textView2 = activityAchieveWeightGoalBinding11.textBmiValue;
        if (weightInfo != null && (bmi = weightInfo.getBmi()) != null) {
            strValueOf = String.valueOf(bmi);
        }
        textView2.setText(strValueOf);
        if (weightInfo == null) {
            return;
        }
        String bodyFigureDescription = HMWeightUtils.toBodyFigureDescription(this, weightInfo.getBmi().floatValue(), BodyParamsUtils.getWeightAge(weightInfo.getTimestamp().longValue(), info.getBirthday()), info.getGender().intValue());
        ActivityAchieveWeightGoalBinding activityAchieveWeightGoalBinding12 = this.binding;
        Objects.requireNonNull(activityAchieveWeightGoalBinding12);
        activityAchieveWeightGoalBinding12.textBodyShape.setText(bodyFigureDescription);
    }

    private final long j() {
        return ((Number) this.weightId.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(AchieveWeightGoalActivity achieveWeightGoalActivity, View view) {
        Intent intent = new Intent(achieveWeightGoalActivity, (Class<?>) WeightGoalsSetActivity.class);
        intent.putExtra("UID", achieveWeightGoalActivity.i());
        achieveWeightGoalActivity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(AchieveWeightGoalActivity achieveWeightGoalActivity, View view) {
        achieveWeightGoalActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(AchieveWeightGoalActivity achieveWeightGoalActivity, View view) {
        achieveWeightGoalActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(AchieveWeightGoalActivity achieveWeightGoalActivity) {
        Button button = achieveWeightGoalActivity.backButton;
        Objects.requireNonNull(button);
        button.setVisibility(8);
        FrameLayout frameLayout = achieveWeightGoalActivity.shareContainer;
        Objects.requireNonNull(frameLayout);
        frameLayout.setVisibility(8);
        achieveWeightGoalActivity.h().onSharePrepared(achieveWeightGoalActivity.g());
        Button button2 = achieveWeightGoalActivity.backButton;
        Objects.requireNonNull(button2);
        button2.setVisibility(0);
        FrameLayout frameLayout2 = achieveWeightGoalActivity.shareContainer;
        Objects.requireNonNull(frameLayout2);
        frameLayout2.setVisibility(0);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAchieveWeightGoalBinding activityAchieveWeightGoalBindingInflate = ActivityAchieveWeightGoalBinding.inflate(getLayoutInflater());
        this.binding = activityAchieveWeightGoalBindingInflate;
        Objects.requireNonNull(activityAchieveWeightGoalBindingInflate);
        setContentView(activityAchieveWeightGoalBindingInflate.getRoot());
        StatusBarUtil.setStatusColor(this, false, true, 0);
        initView();
    }

    @Override // com.huami.widget.share.PreShareListener
    public void onPreShare(int shareType) {
        runOnUiThread(new Runnable() { // from class: i5
            @Override // java.lang.Runnable
            public final void run() {
                AchieveWeightGoalActivity.n(this.a);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Button button = this.backButton;
        Objects.requireNonNull(button);
        button.setVisibility(0);
        FrameLayout frameLayout = this.shareContainer;
        Objects.requireNonNull(frameLayout);
        frameLayout.setVisibility(0);
    }
}

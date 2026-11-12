package com.xiaomi.hm.health.ui.goal.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.WheelView;
import com.xiaomi.hm.health.baseui.GlobalTitleStyle;
import com.xiaomi.hm.health.ui.goal.GoalEvent;
import com.xiaomi.hm.health.ui.goal.manager.CalorieGoalPickerManager;
import com.xiaomi.hm.health.ui.goal.manager.ConnectManager;
import com.xiaomi.hm.health.ui.goal.ui.SetCalorieGoalActivity;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0014J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/ui/goal/ui/SetCalorieGoalActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initViews", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "Lcom/xiaomi/hm/health/ui/goal/GoalEvent$CalorieUpdate;", "event", "onEventMainThread", "Lcom/xiaomi/hm/health/ui/goal/manager/CalorieGoalPickerManager;", "x", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.b, "()Lcom/xiaomi/hm/health/ui/goal/manager/CalorieGoalPickerManager;", "pickerManager", "Lcom/xiaomi/hm/health/ui/goal/manager/ConnectManager;", "y", "m", "()Lcom/xiaomi/hm/health/ui/goal/manager/ConnectManager;", "connectManager", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SetCalorieGoalActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SetCalorieGoalActivity";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy pickerManager = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy connectManager = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/ui/goal/ui/SetCalorieGoalActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "start", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void start(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) SetCalorieGoalActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/goal/manager/ConnectManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ConnectManager> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConnectManager invoke() {
            SetCalorieGoalActivity setCalorieGoalActivity = SetCalorieGoalActivity.this;
            return new ConnectManager(setCalorieGoalActivity, setCalorieGoalActivity.findViewById(R.id.calorie_goal_tip), SetCalorieGoalActivity.this.findViewById(R.id.calorie_mask));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/goal/manager/CalorieGoalPickerManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<CalorieGoalPickerManager> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CalorieGoalPickerManager invoke() {
            return new CalorieGoalPickerManager((WheelView) SetCalorieGoalActivity.this.findViewById(R.id.picker_goal_calorie), false, 2, null);
        }
    }

    private final void initViews() {
        n().init();
        m().setupBtStatusFragment(R.id.container);
        ((Button) findViewById(R.id.tv_confirm)).setOnClickListener(new View.OnClickListener() { // from class: bp6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetCalorieGoalActivity.o(this.a, view);
            }
        });
    }

    private final ConnectManager m() {
        return (ConnectManager) this.connectManager.getValue();
    }

    private final CalorieGoalPickerManager n() {
        return (CalorieGoalPickerManager) this.pickerManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(SetCalorieGoalActivity setCalorieGoalActivity, View view) {
        setCalorieGoalActivity.n().saveData();
        setCalorieGoalActivity.finish();
    }

    @JvmStatic
    public static final void start(@NotNull Context context) {
        INSTANCE.start(context);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_calorie);
        GlobalTitleStyle.setUnifyTitleStyle$default(this, getString(R.string.set_calorie_goal), null, 2, null);
        initViews();
        EventBus.getDefault().register(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull GoalEvent.CalorieUpdate event) {
        WheelView wheelView;
        if (event.getFromDevice() && (wheelView = (WheelView) findViewById(R.id.picker_goal_calorie)) != null) {
            CalorieGoalPickerManager.INSTANCE.loadExistData(wheelView);
        }
    }
}

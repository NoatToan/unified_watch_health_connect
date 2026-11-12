package com.xiaomi.hm.health.ui.goal.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.WheelView;
import com.xiaomi.hm.health.ui.goal.manager.SleepGoalPickerManager;
import com.xiaomi.hm.health.ui.goal.ui.SetSleepGoalActivity;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\u001d\u0010\f\u001a\u00020\u00078F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/ui/goal/ui/SetSleepGoalActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initViews", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/ui/goal/manager/SleepGoalPickerManager;", "a", "Lkotlin/Lazy;", "getManager", "()Lcom/xiaomi/hm/health/ui/goal/manager/SleepGoalPickerManager;", "manager", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SetSleepGoalActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SetSleepGoalActivity";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy manager = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/ui/goal/ui/SetSleepGoalActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "start", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void start(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) SetSleepGoalActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/goal/manager/SleepGoalPickerManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SleepGoalPickerManager> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepGoalPickerManager invoke() {
            return new SleepGoalPickerManager((WheelView) SetSleepGoalActivity.this.findViewById(R.id.picker_goal_sleep_hour), (WheelView) SetSleepGoalActivity.this.findViewById(R.id.picker_goal_sleep_min), false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SetSleepGoalActivity setSleepGoalActivity, View view) {
        setSleepGoalActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SetSleepGoalActivity setSleepGoalActivity, View view) {
        setSleepGoalActivity.getManager().saveData();
        setSleepGoalActivity.finish();
    }

    private final void initViews() {
        getManager().init();
        ((RainbowTitleBar) findViewById(R.id.titleBar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: aq6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetSleepGoalActivity.e(this.a, view);
            }
        });
        ((Button) findViewById(R.id.tv_confirm)).setOnClickListener(new View.OnClickListener() { // from class: bq6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetSleepGoalActivity.f(this.a, view);
            }
        });
    }

    @JvmStatic
    public static final void start(@NotNull Context context) {
        INSTANCE.start(context);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final SleepGoalPickerManager getManager() {
        return (SleepGoalPickerManager) this.manager.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_sleep);
        initViews();
    }
}

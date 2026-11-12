package com.huami.xiaopeng.ui.amazfit.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.xiaopeng.repo.ActionToXiaoPengActivity;
import com.huami.xiaopeng.ui.amazfit.R;
import com.huami.xiaopeng.ui.amazfit.utils.XpLifeCycleHelper;
import com.huami.xiaopeng.ui.amazfit.utils.XpLifeCycleListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014¨\u0006\n"}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/activity/CarHostActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onDestroy", "<init>", "()V", "Companion", "xiaopeng-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class CarHostActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String XP_ACTION = "XP_ACTION";

    @NotNull
    public static final String XP_KEY_COUNT = "XP_KEY_COUNT";

    @NotNull
    public static final String XP_KEY_TOKEN = "XP_KEY_TOKEN";

    @NotNull
    public static final String XP_TOKEN = "XP_TOKEN";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bR\u0016\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/activity/CarHostActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/xiaopeng/repo/ActionToXiaoPengActivity;", "action", "", "count", "", "token", "keyToken", "", "toCar", CarHostActivity.XP_ACTION, "Ljava/lang/String;", CarHostActivity.XP_KEY_COUNT, CarHostActivity.XP_KEY_TOKEN, CarHostActivity.XP_TOKEN, "<init>", "()V", "xiaopeng-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void toCar(@NotNull Context context, @NotNull ActionToXiaoPengActivity action, int count, @NotNull String token, @NotNull String keyToken) {
            Intent intent = new Intent(context, (Class<?>) CarHostActivity.class);
            intent.putExtra(CarHostActivity.XP_ACTION, action.getAction());
            intent.putExtra(CarHostActivity.XP_KEY_COUNT, count);
            intent.putExtra(CarHostActivity.XP_TOKEN, token);
            intent.putExtra(CarHostActivity.XP_KEY_TOKEN, keyToken);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        XpLifeCycleHelper xpLifeCycleHelper = XpLifeCycleHelper.INSTANCE;
        xpLifeCycleHelper.setInXpModule(true);
        XpLifeCycleListener xpModuleLifeCycle = xpLifeCycleHelper.getXpModuleLifeCycle();
        if (xpModuleLifeCycle != null) {
            xpModuleLifeCycle.onEnterModule();
        }
        HMLog.i(XpLifeCycleHelper.XP_LIFE_CYCLE_TAG, "进入小鹏模块 --> " + CarHostActivity.class.getSimpleName(), new Object[0]);
        setContentView(R.layout.activity_car_base_content);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        XpLifeCycleHelper xpLifeCycleHelper = XpLifeCycleHelper.INSTANCE;
        xpLifeCycleHelper.setInXpModule(false);
        XpLifeCycleListener xpModuleLifeCycle = xpLifeCycleHelper.getXpModuleLifeCycle();
        if (xpModuleLifeCycle != null) {
            xpModuleLifeCycle.onExitModule();
        }
        HMLog.i(XpLifeCycleHelper.XP_LIFE_CYCLE_TAG, "退出小鹏模块 --> " + CarHostActivity.class.getSimpleName(), new Object[0]);
    }
}

package com.huami.jac.ui.amazfit.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.jac.repo.ActionToJacActivity;
import com.huami.jac.ui.amazfit.R;
import com.huami.jac.ui.amazfit.utils.JacLifeCycleHelper;
import com.huami.jac.ui.amazfit.utils.JacLifeCycleListener;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014¨\u0006\n"}, d2 = {"Lcom/huami/jac/ui/amazfit/activity/JacCarHostActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onDestroy", "<init>", "()V", "Companion", "jac-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class JacCarHostActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String JAC_ACTION = "JAC_ACTION";

    @NotNull
    public static final String JAC_KEY_COUNT = "JAC_KEY_COUNT";

    @NotNull
    public static final String JAC_KEY_TOKEN = "JAC_KEY_TOKEN";

    @NotNull
    public static final String JAC_TOKEN = "JAC_TOKEN";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bR\u0016\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huami/jac/ui/amazfit/activity/JacCarHostActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/jac/repo/ActionToJacActivity;", "action", "", "count", "", "token", "keyToken", "", "toCar", JacCarHostActivity.JAC_ACTION, "Ljava/lang/String;", JacCarHostActivity.JAC_KEY_COUNT, JacCarHostActivity.JAC_KEY_TOKEN, JacCarHostActivity.JAC_TOKEN, "<init>", "()V", "jac-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void toCar(@NotNull Context context, @NotNull ActionToJacActivity action, int count, @NotNull String token, @NotNull String keyToken) {
            Intent intent = new Intent(context, (Class<?>) JacCarHostActivity.class);
            intent.putExtra(JacCarHostActivity.JAC_ACTION, action.getAction());
            intent.putExtra(JacCarHostActivity.JAC_KEY_COUNT, count);
            intent.putExtra(JacCarHostActivity.JAC_TOKEN, token);
            intent.putExtra(JacCarHostActivity.JAC_KEY_TOKEN, keyToken);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JacLifeCycleHelper jacLifeCycleHelper = JacLifeCycleHelper.INSTANCE;
        jacLifeCycleHelper.setInXpModule(true);
        JacLifeCycleListener jacModuleLifeCycle = jacLifeCycleHelper.getJacModuleLifeCycle();
        if (jacModuleLifeCycle != null) {
            jacModuleLifeCycle.onEnterModule();
        }
        HMLog.i(JacLifeCycleHelper.JAC_LIFE_CYCLE_TAG, "进入JAC模块 --> " + JacCarHostActivity.class.getSimpleName(), new Object[0]);
        setContentView(R.layout.jac_activity_car_base_content);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        JacLifeCycleHelper jacLifeCycleHelper = JacLifeCycleHelper.INSTANCE;
        jacLifeCycleHelper.setInXpModule(false);
        JacLifeCycleListener jacModuleLifeCycle = jacLifeCycleHelper.getJacModuleLifeCycle();
        if (jacModuleLifeCycle != null) {
            jacModuleLifeCycle.onExitModule();
        }
        HMLog.i(JacLifeCycleHelper.JAC_LIFE_CYCLE_TAG, "退出JAC模块 --> " + JacCarHostActivity.class.getSimpleName(), new Object[0]);
    }
}

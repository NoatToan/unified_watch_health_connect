package com.huami.assistant.ui.schedule.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.huami.assistant.R;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.ui.schedule.fragment.ScheduleDetailFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.util.DeviceCompatibility;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/huami/assistant/ui/schedule/activity/ScheduleDetailActivity;", "Landroidx/fragment/app/FragmentActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleDetailActivity extends FragmentActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/huami/assistant/ui/schedule/activity/ScheduleDetailActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/assistant/model/bean/Update;", "event", "", "to", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void to(@NotNull Context context, @NotNull Update event) {
            Intent intent = new Intent(context, (Class<?>) ScheduleDetailActivity.class);
            intent.putExtra("UpdateId", event.getId().longValue());
            intent.putExtra("startTime", event.startTime);
            context.startActivity(intent);
        }
    }

    @JvmStatic
    public static final void to(@NotNull Context context, @NotNull Update update) {
        INSTANCE.to(context, update);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        long longExtra = getIntent().getLongExtra("UpdateId", -1L);
        long longExtra2 = getIntent().getLongExtra("startTime", 0L);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = R.id.container;
        ScheduleDetailFragment scheduleDetailFragment = new ScheduleDetailFragment();
        scheduleDetailFragment.setArguments(new Bundle());
        Bundle arguments = scheduleDetailFragment.getArguments();
        if (arguments != null) {
            arguments.putLong("UpdateId", longExtra);
        }
        Bundle arguments2 = scheduleDetailFragment.getArguments();
        if (arguments2 != null) {
            arguments2.putLong("startTime", longExtra2);
        }
        Unit unit = Unit.INSTANCE;
        fragmentTransactionBeginTransaction.add(i, scheduleDetailFragment).commit();
    }
}

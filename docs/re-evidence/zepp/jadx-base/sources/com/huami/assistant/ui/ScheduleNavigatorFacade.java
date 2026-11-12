package com.huami.assistant.ui;

import android.content.Context;
import android.content.Intent;
import com.huami.assistant.ui.v2.ScheduleActivity;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/assistant/ui/ScheduleNavigatorFacade;", "", "", "startMain", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleNavigatorFacade {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    public ScheduleNavigatorFacade(@NotNull Context context) {
        this.context = context;
    }

    public final void startMain() {
        this.context.startActivity(new Intent(this.context, (Class<?>) ScheduleActivity.class));
    }
}

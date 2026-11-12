package com.huami.phn.coach.usecase;

import android.content.Context;
import android.content.Intent;
import com.huami.phn.coach.ui.activity.PHNDetailPageActivity;
import com.huami.tools.analytics.DbUtils;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/phn/coach/usecase/OpenPHNPlanPageUseCase;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", Constant.METHOD_EXECUTE, "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class OpenPHNPlanPageUseCase {
    public final void execute(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) PHNDetailPageActivity.class));
    }
}

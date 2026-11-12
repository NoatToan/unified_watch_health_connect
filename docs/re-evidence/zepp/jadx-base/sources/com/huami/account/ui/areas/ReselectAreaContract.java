package com.huami.account.ui.areas;

import android.content.Context;
import android.content.Intent;
import androidx.view.result.contract.ActivityResultContract;
import com.huami.account.service.model.Area;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/huami/account/ui/areas/ReselectAreaContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Void;", "Lcom/huami/account/service/model/Area;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "input", "Landroid/content/Intent;", "createIntent", "", "resultCode", "data", "parseResult", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class ReselectAreaContract extends ActivityResultContract<Void, Area> {
    @Override // androidx.view.result.contract.ActivityResultContract
    @NotNull
    public Intent createIntent(@NotNull Context context, @Nullable Void input) {
        Intent intent = new Intent(context, (Class<?>) SelectAreaActivity.class);
        intent.putExtra(SelectAreaActivity.PARAM_RESELECT_AREA, true);
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    @Nullable
    public Area parseResult(int resultCode, @Nullable Intent data) {
        if (data != null) {
            return (Area) data.getSerializableExtra(SelectAreaActivity.RESULT_RESELECT_AREA);
        }
        return null;
    }
}

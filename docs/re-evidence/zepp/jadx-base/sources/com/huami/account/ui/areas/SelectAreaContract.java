package com.huami.account.ui.areas;

import android.content.Context;
import android.content.Intent;
import androidx.view.result.contract.ActivityResultContract;
import com.huami.tools.analytics.DbUtils;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/huami/account/ui/areas/SelectAreaContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/content/Intent;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "input", "createIntent", "", "resultCode", "data", "parseResult", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class SelectAreaContract extends ActivityResultContract<Intent, String> {
    @Override // androidx.view.result.contract.ActivityResultContract
    @NotNull
    public Intent createIntent(@NotNull Context context, @NotNull Intent input) {
        return input;
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    @Nullable
    public String parseResult(int resultCode, @Nullable Intent data) {
        Serializable serializableExtra = data == null ? null : data.getSerializableExtra("TYPE_RESPONSE");
        if (serializableExtra instanceof String) {
            return (String) serializableExtra;
        }
        return null;
    }
}

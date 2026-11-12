package com.huami.userproperty;

import androidx.annotation.CheckResult;
import com.huami.userproperty.service.UserProperty;
import com.huami.userproperty.service.entity.remote.BatchPushResult;
import com.huami.userproperty.service.entity.remote.ResultFuture;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\u0007¨\u0006\u0006"}, d2 = {"", "Lcom/huami/userproperty/service/UserProperty;", "Lcom/huami/userproperty/service/entity/remote/ResultFuture;", "Lcom/huami/userproperty/service/entity/remote/BatchPushResult;", "Lcom/huami/userproperty/entity/BatchPushResult;", "batchPush", "userproperty_release"}, k = 2, mv = {1, 5, 1})
public final class UserPropertyExtKt {
    @CheckResult
    @NotNull
    public static final ResultFuture<BatchPushResult> batchPush(@NotNull List<? extends UserProperty<?>> list) {
        return UserPropertyManager.INSTANCE.batchPush(list);
    }
}

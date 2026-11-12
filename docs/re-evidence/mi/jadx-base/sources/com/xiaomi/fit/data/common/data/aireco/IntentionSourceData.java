package com.xiaomi.fit.data.common.data.aireco;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fit/data/common/data/aireco/IntentionSourceData;", "", "<init>", "()V", "packageName", "", "getPackageName", "()Ljava/lang/String;", "setPackageName", "(Ljava/lang/String;)V", "sourceTypeValue", "", "getSourceTypeValue", "()I", "setSourceTypeValue", "(I)V", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntentionSourceData {

    @NotNull
    private String packageName;
    private int sourceTypeValue;

    public IntentionSourceData() {
        String packageName = ApplicationExtKt.getApplication().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        this.packageName = packageName;
        this.sourceTypeValue = 1;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public final int getSourceTypeValue() {
        return this.sourceTypeValue;
    }

    public final void setPackageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageName = str;
    }

    public final void setSourceTypeValue(int i) {
        this.sourceTypeValue = i;
    }
}

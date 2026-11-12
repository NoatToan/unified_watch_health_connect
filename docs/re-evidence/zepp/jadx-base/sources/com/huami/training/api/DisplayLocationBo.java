package com.huami.training.api;

import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/huami/training/api/DisplayLocationBo;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ALL", "LOOK_AROUND", TrainingWebConst.Value.DisplayLocation.DETAIL_PAGE, "MIFIT_CIRCLE", "lib_release"}, k = 1, mv = {1, 5, 1})
public enum DisplayLocationBo {
    ALL("LIST_PAG"),
    LOOK_AROUND("KAN_KAN"),
    DETAIL_PAGE(TrainingWebConst.Value.DisplayLocation.DETAIL_PAGE),
    MIFIT_CIRCLE("MIFIT_CIRCLE");


    @NotNull
    private final String value;

    DisplayLocationBo(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}

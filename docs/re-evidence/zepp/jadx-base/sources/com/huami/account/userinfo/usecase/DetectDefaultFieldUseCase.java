package com.huami.account.userinfo.usecase;

import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/account/userinfo/usecase/DetectDefaultFieldUseCase;", "", "", "key", "", Constant.METHOD_EXECUTE, "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class DetectDefaultFieldUseCase {

    @NotNull
    public static final DetectDefaultFieldUseCase INSTANCE = new DetectDefaultFieldUseCase();

    private DetectDefaultFieldUseCase() {
    }

    @JvmStatic
    public static final boolean execute(@NotNull String key) {
        List<String> defaultFields = HMPersonInfo.getInstance().getUserInfo().getDefaultFields();
        if (defaultFields == null || defaultFields.isEmpty()) {
            return false;
        }
        return defaultFields.contains(key);
    }
}

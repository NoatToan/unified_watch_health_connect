package com.huami.account.utils;

import com.xiaomi.hm.health.baseutil.Language;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/account/utils/DeprecatedFunc;", "", "", "isSimplifiedChinese", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class DeprecatedFunc {

    @NotNull
    public static final DeprecatedFunc INSTANCE = new DeprecatedFunc();

    private DeprecatedFunc() {
    }

    public final boolean isSimplifiedChinese() {
        return Language.isSimplifiedChinese();
    }
}

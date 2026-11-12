package com.huami.pai.p004const;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/huami/pai/const/SharedPrefConst;", "", "", "KEY_PAI_GUIDE_ROLLOUT", "Ljava/lang/String;", "KEY_SHOW_PAI_TOTAL_VALUE", "VALUE_SHOW_PAI_TOTAL_NEVER", "KEY_SHOW_PAI_DAILY_DATE", "KEY_SHOW_PAI_TOTAL_DATE", SharedPrefConst.KEY_PAI_LAST_DOWNLOAD_TIME, "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class SharedPrefConst {

    @NotNull
    public static final SharedPrefConst INSTANCE = new SharedPrefConst();

    @NotNull
    public static final String KEY_PAI_GUIDE_ROLLOUT = "key_pai_guide_rollout";

    @NotNull
    public static final String KEY_PAI_LAST_DOWNLOAD_TIME = "KEY_PAI_LAST_DOWNLOAD_TIME";

    @NotNull
    public static final String KEY_SHOW_PAI_DAILY_DATE = "pai_daily_date";

    @NotNull
    public static final String KEY_SHOW_PAI_TOTAL_DATE = "pai_total_date";

    @NotNull
    public static final String KEY_SHOW_PAI_TOTAL_VALUE = "pai_total_value";

    @NotNull
    public static final String VALUE_SHOW_PAI_TOTAL_NEVER = "pai_total_never_show";

    private SharedPrefConst() {
    }
}

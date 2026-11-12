package com.huami.wallet.accessdoor.utils;

import com.huami.wallet.ui.utils.AnalyticConst;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/wallet/accessdoor/utils/ParamValue;", "", "", "Edit_Name", "Ljava/lang/String;", "FAQ", "Delete", "Add", AnalyticConst.BusDetailOuValue.BUS_DETAIL_OUT_SWITCHCARD, "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class ParamValue {

    @NotNull
    public static final String Add = "添加卡片";

    @NotNull
    public static final String Delete = "删除卡片";

    @NotNull
    public static final String Edit_Name = "编辑名称";

    @NotNull
    public static final String FAQ = "常见问题";

    @NotNull
    public static final ParamValue INSTANCE = new ParamValue();

    @NotNull
    public static final String SwitchCard = "切换卡片";

    private ParamValue() {
    }
}

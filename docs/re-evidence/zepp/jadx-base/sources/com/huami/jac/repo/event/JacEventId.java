package com.huami.jac.repo.event;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, d2 = {"Lcom/huami/jac/repo/event/JacEventId;", "", "", "Jac_CLICKNUM", "Ljava/lang/String;", "Jac_DETAIL_OUT", "Jac_INSTALL_VCARD_AND_KEYCARD_SUCCESS", "Jac_INSTALL_VCARD_AND_KEYCARD_FAIL", "Jac_INSTALL_KEYCARD_SUCCESS", "Jac_INSTALL_KEYCARD_FAIL", "Jac_DELETE_VCARD_AND_KEYCARD_SUCCESS", "Jac_DELETE_VCARD_AND_KEYCARD_FAIL", "Jac_DETAIL_OUT_FAQ", "Jac_DETAIL_OUT_DELETE", "Jac_DETAIL_OUT_ADD", "Jac_DETAIL_OUT_CREATE", "Jac_DETAIL_OUT_QUERY", "<init>", "()V", "jac-repo_release"}, k = 1, mv = {1, 5, 1})
public final class JacEventId {

    @NotNull
    public static final JacEventId INSTANCE = new JacEventId();

    @NotNull
    public static final String Jac_CLICKNUM = "NFC_Jac_ClickNum";

    @NotNull
    public static final String Jac_DELETE_VCARD_AND_KEYCARD_FAIL = "NFC_Jac_DeleteCard_Failure";

    @NotNull
    public static final String Jac_DELETE_VCARD_AND_KEYCARD_SUCCESS = "NFC_Jac_DeleteCard_Success";

    @NotNull
    public static final String Jac_DETAIL_OUT = "NFC_Jac_Detail_Out";

    @NotNull
    public static final String Jac_DETAIL_OUT_ADD = "添加钥匙";

    @NotNull
    public static final String Jac_DETAIL_OUT_CREATE = "创建钥匙";

    @NotNull
    public static final String Jac_DETAIL_OUT_DELETE = "移除卡片";

    @NotNull
    public static final String Jac_DETAIL_OUT_FAQ = "使用帮助";

    @NotNull
    public static final String Jac_DETAIL_OUT_QUERY = "查询";

    @NotNull
    public static final String Jac_INSTALL_KEYCARD_FAIL = "NFC_Jac_AddCard_Failure";

    @NotNull
    public static final String Jac_INSTALL_KEYCARD_SUCCESS = "NFC_Jac_AddCard_Success";

    @NotNull
    public static final String Jac_INSTALL_VCARD_AND_KEYCARD_FAIL = "NFC_Jac_AddCard_Failure";

    @NotNull
    public static final String Jac_INSTALL_VCARD_AND_KEYCARD_SUCCESS = "NFC_Jac_AddCard_Success";

    private JacEventId() {
    }
}

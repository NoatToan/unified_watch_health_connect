package com.huami.jac.repo.exception;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/jac/repo/exception/JacErrorCode;", "", "", "msg", "getJACCode", "", "isJacCode", JacErrorCode.JAC_ERROR_CODE_NET, "Ljava/lang/String;", JacErrorCode.JAC_ERROR_CODE_LOGIN, JacErrorCode.JAC_ERROR_CODE_BT, JacErrorCode.JAC_ERROR_CODE_NO_BONDING, JacErrorCode.JAC_ERROR_CODE_NO_SUPPORT, JacErrorCode.JAC_ERROR_CODE_NO_JAC_APP, "", "a", "Ljava/util/List;", "JAC_SDK_CODE_LIST", "<init>", "()V", "jac-repo_release"}, k = 1, mv = {1, 5, 1})
public final class JacErrorCode {

    @NotNull
    public static final String JAC_ERROR_CODE_BT = "JAC_ERROR_CODE_BT";

    @NotNull
    public static final String JAC_ERROR_CODE_LOGIN = "JAC_ERROR_CODE_LOGIN";

    @NotNull
    public static final String JAC_ERROR_CODE_NET = "JAC_ERROR_CODE_NET";

    @NotNull
    public static final String JAC_ERROR_CODE_NO_BONDING = "JAC_ERROR_CODE_NO_BONDING";

    @NotNull
    public static final String JAC_ERROR_CODE_NO_JAC_APP = "JAC_ERROR_CODE_NO_JAC_APP";

    @NotNull
    public static final String JAC_ERROR_CODE_NO_SUPPORT = "JAC_ERROR_CODE_NO_SUPPORT";

    @NotNull
    public static final JacErrorCode INSTANCE = new JacErrorCode();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final List<String> JAC_SDK_CODE_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"70001", "70003", "70002", "70004"});

    private JacErrorCode() {
    }

    @NotNull
    public final String getJACCode(@Nullable String msg) {
        for (String str : JAC_SDK_CODE_LIST) {
            if ((msg != null ? Boolean.valueOf(StringsKt__StringsKt.contains$default((CharSequence) msg, (CharSequence) str, false, 2, (Object) null)) : null).booleanValue()) {
                return str;
            }
        }
        return "";
    }

    public final boolean isJacCode(@Nullable String msg) {
        if (msg == null) {
            return false;
        }
        Iterator<T> it2 = JAC_SDK_CODE_LIST.iterator();
        while (it2.hasNext()) {
            if (StringsKt__StringsKt.contains$default((CharSequence) msg, (CharSequence) it2.next(), false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }
}

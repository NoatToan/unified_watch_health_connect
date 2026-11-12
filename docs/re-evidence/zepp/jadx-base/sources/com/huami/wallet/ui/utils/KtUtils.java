package com.huami.wallet.ui.utils;

import com.huami.wallet.lib.entity.XiaomiNotice;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J,\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/wallet/ui/utils/KtUtils;", "", "", "string", "", "isNullOrEmpty", "", "Lcom/huami/wallet/lib/entity/XiaomiNotice;", "xiaomiNotices", "xiaomiCardName", "type", "getPopXiaomiNotice", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class KtUtils {

    @NotNull
    public static final KtUtils INSTANCE = new KtUtils();

    private KtUtils() {
    }

    @JvmStatic
    @Nullable
    public static final XiaomiNotice getPopXiaomiNotice(@Nullable List<XiaomiNotice> xiaomiNotices, @Nullable String xiaomiCardName, @NotNull String type) {
        if (!KtUtilsKt.isNullOrEmpty(xiaomiNotices) && !isNullOrEmpty(xiaomiCardName)) {
            for (XiaomiNotice xiaomiNotice : xiaomiNotices) {
                String appCode = xiaomiNotice.getAppCode();
                String cardName = xiaomiNotice.getCardName();
                int status = xiaomiNotice.getStatus();
                String type2 = xiaomiNotice.getType();
                String description = xiaomiNotice.getDescription();
                if (Intrinsics.areEqual(cardName, xiaomiCardName) && status == 4 && !isNullOrEmpty(description) && StringsKt__StringsKt.contains$default((CharSequence) type, (CharSequence) type2, false, 2, (Object) null)) {
                    return new XiaomiNotice(appCode, cardName, status, type, description);
                }
            }
        }
        return null;
    }

    @JvmStatic
    public static final boolean isNullOrEmpty(@Nullable String string) {
        if (string != null) {
            if (!(string.length() == 0)) {
                return false;
            }
        }
        return true;
    }
}

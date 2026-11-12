package com.mi.fitness.lpamanagement.util;

import com.mi.fitness.lpamanagement.exception.InvalidActivationCodeException;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b¨\u0006\r"}, d2 = {"Lcom/mi/fitness/lpamanagement/util/LpaManagementUtil;", "", "<init>", "()V", "isRetryDownLoad", "", "activationCodeElements", "", "", "parseActivationCodeElements", "activationCode", "getRawActivationCode", "userInput", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LpaManagementUtil {

    @NotNull
    public static final LpaManagementUtil INSTANCE = new LpaManagementUtil();

    private LpaManagementUtil() {
    }

    @NotNull
    public final String getRawActivationCode(@NotNull String userInput) {
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = userInput.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (!StringsKt__StringsJVMKt.startsWith$default(lowerCase, "lpa:", false, 2, null)) {
            return userInput;
        }
        String strSubstring = userInput.substring(4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean isRetryDownLoad(@NotNull List<String> activationCodeElements) {
        Intrinsics.checkNotNullParameter(activationCodeElements, "activationCodeElements");
        return activationCodeElements.size() > 4 && Intrinsics.areEqual("1", activationCodeElements.get(4));
    }

    @NotNull
    public final List<String> parseActivationCodeElements(@NotNull String activationCode) throws InvalidActivationCodeException {
        Intrinsics.checkNotNullParameter(activationCode, "activationCode");
        List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) activationCode, new String[]{"$"}, false, 0, 6, (Object) null);
        if (listSplit$default.size() < 3) {
            throw new InvalidActivationCodeException("Invalid Activation Code: Mandatory field(s) missing. Check if all acFormat, matching Id or token are present");
        }
        if (Intrinsics.areEqual("1", listSplit$default.get(0))) {
            return listSplit$default;
        }
        throw new InvalidActivationCodeException("Invalid Activation Code: Unsupported acFormat");
    }
}

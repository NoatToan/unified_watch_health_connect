package com.huami.femalehealth.uilib.helper;

import android.content.Context;
import androidx.core.text.TextUtilsCompat;
import com.huami.tools.analytics.DbUtils;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/femalehealth/uilib/helper/RTLHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "isRTL", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class RTLHelper {

    @NotNull
    public static final RTLHelper INSTANCE = new RTLHelper();

    private RTLHelper() {
    }

    public final boolean isRTL(@NotNull Context context) {
        boolean z;
        boolean z2 = (context.getApplicationInfo().flags & 4194304) == 4194304;
        try {
            z = TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        } catch (Exception unused) {
        }
        return z2 && z;
    }
}

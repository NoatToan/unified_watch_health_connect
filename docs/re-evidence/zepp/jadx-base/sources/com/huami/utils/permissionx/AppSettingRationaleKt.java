package com.huami.utils.permissionx;

import android.app.Activity;
import androidx.core.app.ActivityCompat;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0006"}, d2 = {"Landroid/app/Activity;", "", "", "permissions", "", "shouldShowAppSettingRationale", "permissionx_release"}, k = 2, mv = {1, 5, 1})
public final class AppSettingRationaleKt {
    public static final boolean shouldShowAppSettingRationale(@NotNull Activity activity, @NotNull List<String> list) {
        if (list.size() == 1) {
            return !ActivityCompat.shouldShowRequestPermissionRationale(activity, (String) CollectionsKt.first((List) list));
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (!ActivityCompat.shouldShowRequestPermissionRationale(activity, it2.next())) {
                return true;
            }
        }
        return false;
    }
}

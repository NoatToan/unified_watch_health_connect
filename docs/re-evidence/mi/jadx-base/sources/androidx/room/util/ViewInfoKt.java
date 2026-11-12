package androidx.room.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0000¨\u0006\t"}, d2 = {"equalsCommon", "", "Landroidx/room/util/ViewInfo;", "other", "", "hashCodeCommon", "", "toStringCommon", "", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ViewInfoKt {
    public static final boolean equalsCommon(@NotNull ViewInfo viewInfo, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(viewInfo, "<this>");
        if (viewInfo == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo2 = (ViewInfo) obj;
        if (Intrinsics.areEqual(viewInfo.name, viewInfo2.name)) {
            String str = viewInfo.sql;
            if (str != null) {
                if (Intrinsics.areEqual(str, viewInfo2.sql)) {
                    return true;
                }
            } else if (viewInfo2.sql == null) {
                return true;
            }
        }
        return false;
    }

    public static final int hashCodeCommon(@NotNull ViewInfo viewInfo) {
        Intrinsics.checkNotNullParameter(viewInfo, "<this>");
        int iHashCode = viewInfo.name.hashCode() * 31;
        String str = viewInfo.sql;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public static final String toStringCommon(@NotNull ViewInfo viewInfo) {
        Intrinsics.checkNotNullParameter(viewInfo, "<this>");
        return StringsKt__IndentKt.trimMargin$default("\n            |ViewInfo {\n            |   name = '" + viewInfo.name + "',\n            |   sql = '" + viewInfo.sql + "'\n            |}\n        ", null, 1, null);
    }
}

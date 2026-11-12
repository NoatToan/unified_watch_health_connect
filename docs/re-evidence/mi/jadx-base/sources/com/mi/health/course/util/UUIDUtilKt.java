package com.mi.health.course.util;

import java.util.Arrays;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"UUID_FORMAT", "", "makeUUID", "value", "", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UUIDUtilKt {

    @NotNull
    public static final String UUID_FORMAT = "0000%04x-0000-1000-8000-00805f9b34fb";

    @NotNull
    public static final String makeUUID(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("0000%04x-0000-1000-8000-00805f9b34fb", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String string = UUID.fromString(str).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

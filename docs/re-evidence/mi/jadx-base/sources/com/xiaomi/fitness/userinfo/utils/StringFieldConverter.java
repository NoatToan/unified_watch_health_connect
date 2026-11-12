package com.xiaomi.fitness.userinfo.utils;

import android.text.TextUtils;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.o1j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/userinfo/utils/StringFieldConverter;", "", "<init>", "()V", "convertFieldToDisplayString", "", "field", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StringFieldConverter {

    @NotNull
    public static final StringFieldConverter INSTANCE = new StringFieldConverter();

    private StringFieldConverter() {
    }

    @NotNull
    public final String convertFieldToDisplayString(@Nullable String field) {
        return (field == null || TextUtils.isEmpty(field)) ? ResourceExtKt.getString(o1j.v0) : field;
    }
}

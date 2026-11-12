package com.huami.healthlabel.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\"+\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00008@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"+\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\t8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"", "<set-?>", "b", "Lcom/huami/healthlabel/utils/SpUtils;", "getHealthLabelRecord", "()Ljava/lang/String;", "setHealthLabelRecord", "(Ljava/lang/String;)V", "healthLabelRecord", "", "c", "getHasRecordData", "()Z", "setHasRecordData", "(Z)V", "hasRecordData", "healthLabel_release"}, k = 2, mv = {1, 5, 1})
public final class SpUtilsKt {
    public static final /* synthetic */ KProperty<Object>[] a = {Reflection.mutableProperty0(new MutablePropertyReference0Impl(SpUtilsKt.class, "healthLabelRecord", "getHealthLabelRecord()Ljava/lang/String;", 1)), Reflection.mutableProperty0(new MutablePropertyReference0Impl(SpUtilsKt.class, "hasRecordData", "getHasRecordData()Z", 1))};

    @NotNull
    private static final SpUtils b = new SpUtils("healthLabelRecord", new JSONArray().toString());

    @NotNull
    private static final SpUtils c = new SpUtils("hasRecordData", Boolean.FALSE);

    public static final boolean getHasRecordData() {
        return ((Boolean) c.getValue(null, a[1])).booleanValue();
    }

    @NotNull
    public static final String getHealthLabelRecord() {
        return (String) b.getValue(null, a[0]);
    }

    public static final void setHasRecordData(boolean z) {
        c.setValue(null, a[1], Boolean.valueOf(z));
    }

    public static final void setHealthLabelRecord(@NotNull String str) {
        b.setValue(null, a[0], str);
    }
}

package com.xiaomi.fitness.common.viewbinding;

import androidx.health.connect.client.records.CervicalMucusRecord;
import defpackage.bsq;
import kotlin.Metadata;
import kotlin.properties.ReadOnlyProperty;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\n\b\u0001\u0010\u0004 \u0001*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "", "R", "Lbsq;", "T", "Lkotlin/properties/ReadOnlyProperty;", "", CervicalMucusRecord.Appearance.CLEAR, "()V", "common_release"}, k = 1, mv = {2, 0, 0})
public interface ViewBindingProperty<R, T extends bsq> extends ReadOnlyProperty<R, T> {
    void clear();
}

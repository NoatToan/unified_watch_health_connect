package com.huami.device.feature.health.model;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/device/feature/health/model/HealthSettingData;", ExifInterface.GPS_DIRECTION_TRUE, "", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "", "b", "Ljava/util/List;", "getValueList", "()Ljava/util/List;", "valueList", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "health-base_release"}, k = 1, mv = {1, 5, 1})
public class HealthSettingData<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final T value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<T> valueList;

    /* JADX WARN: Multi-variable type inference failed */
    public HealthSettingData(T t, @NotNull List<? extends T> list) {
        this.value = t;
        this.valueList = list;
    }

    public final T getValue() {
        return this.value;
    }

    @NotNull
    public final List<T> getValueList() {
        return this.valueList;
    }

    public /* synthetic */ HealthSettingData(Object obj, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}

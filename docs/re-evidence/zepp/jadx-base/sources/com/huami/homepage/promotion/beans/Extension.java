package com.huami.homepage.promotion.beans;

import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R!\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/homepage/promotion/beans/Extension;", "", "", "", "component1", DeviceSettingApiImpl.PARAMS_SOURCE, "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getDeviceSources", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "promotion_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Extension {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<Integer> deviceSources;

    /* JADX WARN: Multi-variable type inference failed */
    public Extension() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Extension(@Nullable List<Integer> list) {
        this.deviceSources = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Extension copy$default(Extension extension, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = extension.deviceSources;
        }
        return extension.copy(list);
    }

    @Nullable
    public final List<Integer> component1() {
        return this.deviceSources;
    }

    @NotNull
    public final Extension copy(@Nullable List<Integer> deviceSources) {
        return new Extension(deviceSources);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Extension) && Intrinsics.areEqual(this.deviceSources, ((Extension) other).deviceSources);
    }

    @Nullable
    public final List<Integer> getDeviceSources() {
        return this.deviceSources;
    }

    public int hashCode() {
        List<Integer> list = this.deviceSources;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "Extension(deviceSources=" + this.deviceSources + ")";
    }

    public /* synthetic */ Extension(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}

package com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.web;

import com.huami.device.feature.quickcards.cloud.resouce.api.bean.RequestBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÂ\u0003J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\u0019\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/repo/iddesc/web/NormalRequestBean;", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/bean/RequestBean;", "", "", "a", "", "requestIds", "appSortIds", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NormalRequestBean extends RequestBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<String> appSortIds;

    public NormalRequestBean(@NotNull List<String> list) {
        this.appSortIds = list;
    }

    private final List<String> a() {
        return this.appSortIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NormalRequestBean copy$default(NormalRequestBean normalRequestBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = normalRequestBean.appSortIds;
        }
        return normalRequestBean.copy(list);
    }

    @NotNull
    public final NormalRequestBean copy(@NotNull List<String> appSortIds) {
        return new NormalRequestBean(appSortIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NormalRequestBean) && Intrinsics.areEqual(this.appSortIds, ((NormalRequestBean) other).appSortIds);
    }

    public int hashCode() {
        return this.appSortIds.hashCode();
    }

    @Override // com.huami.device.feature.quickcards.cloud.resouce.api.bean.RequestBean
    @NotNull
    public Iterable<String> requestIds() {
        return this.appSortIds;
    }

    @NotNull
    public String toString() {
        return "NormalRequestBean(appSortIds=" + this.appSortIds + ")";
    }
}

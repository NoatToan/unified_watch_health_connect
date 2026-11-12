package com.huami.device.feature.quickcards.cloud.resouce.impl;

import com.huami.device.feature.quickcards.cloud.resouce.api.bean.RequestBean;
import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÂ\u0003J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0006HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/device/feature/quickcards/cloud/resouce/impl/QuickCardRequestBean;", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/bean/RequestBean;", "", "Lcom/huami/device/feature/quickcards/cloud/resouce/impl/QuickCardId;", "a", "", "", "requestIds", HealthLabelAnalyticsKt.TAG_HOME_LABEL_COUNT, "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class QuickCardRequestBean extends RequestBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<QuickCardId> cards;

    public QuickCardRequestBean(@NotNull List<QuickCardId> list) {
        this.cards = list;
    }

    private final List<QuickCardId> a() {
        return this.cards;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuickCardRequestBean copy$default(QuickCardRequestBean quickCardRequestBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = quickCardRequestBean.cards;
        }
        return quickCardRequestBean.copy(list);
    }

    @NotNull
    public final QuickCardRequestBean copy(@NotNull List<QuickCardId> cards) {
        return new QuickCardRequestBean(cards);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QuickCardRequestBean) && Intrinsics.areEqual(this.cards, ((QuickCardRequestBean) other).cards);
    }

    public int hashCode() {
        return this.cards.hashCode();
    }

    @Override // com.huami.device.feature.quickcards.cloud.resouce.api.bean.RequestBean
    @NotNull
    public Iterable<String> requestIds() {
        List<QuickCardId> list = this.cards;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (QuickCardId quickCardId : list) {
            arrayList.add(quickCardId.getAppId() + '-' + quickCardId.getCardId());
        }
        return arrayList;
    }

    @NotNull
    public String toString() {
        return "QuickCardRequestBean(cards=" + this.cards + ')';
    }
}

package com.huami.snore.core.vo;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.paging.PagedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003HÆ\u0003J%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002HÖ\u0003R%\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/huami/snore/core/vo/VoiceListingModel;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "component1", "pagedList", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Landroidx/lifecycle/LiveData;", "getPagedList", "()Landroidx/lifecycle/LiveData;", "<init>", "(Landroidx/lifecycle/LiveData;)V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class VoiceListingModel<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final LiveData<PagedList<T>> pagedList;

    public VoiceListingModel(@NotNull LiveData<PagedList<T>> liveData) {
        this.pagedList = liveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoiceListingModel copy$default(VoiceListingModel voiceListingModel, LiveData liveData, int i, Object obj) {
        if ((i & 1) != 0) {
            liveData = voiceListingModel.pagedList;
        }
        return voiceListingModel.copy(liveData);
    }

    @NotNull
    public final LiveData<PagedList<T>> component1() {
        return this.pagedList;
    }

    @NotNull
    public final VoiceListingModel<T> copy(@NotNull LiveData<PagedList<T>> pagedList) {
        return new VoiceListingModel<>(pagedList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VoiceListingModel) && Intrinsics.areEqual(this.pagedList, ((VoiceListingModel) other).pagedList);
    }

    @NotNull
    public final LiveData<PagedList<T>> getPagedList() {
        return this.pagedList;
    }

    public int hashCode() {
        return this.pagedList.hashCode();
    }

    @NotNull
    public String toString() {
        return "VoiceListingModel(pagedList=" + this.pagedList + ")";
    }
}

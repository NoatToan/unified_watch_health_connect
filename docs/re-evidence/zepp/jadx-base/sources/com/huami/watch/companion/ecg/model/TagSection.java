package com.huami.watch.companion.ecg.model;

import com.chad.library.adapter.base.entity.SectionEntity;
import com.huami.watch.companion.ecg.util.EcgTagEnum;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/huami/watch/companion/ecg/model/TagSection;", "Lcom/chad/library/adapter/base/entity/SectionEntity;", "Lcom/huami/watch/companion/ecg/util/EcgTagEnum;", "", "isHeader", "", "header", "<init>", "(ZLjava/lang/String;)V", "ecgTagEnum", "(Lcom/huami/watch/companion/ecg/util/EcgTagEnum;)V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class TagSection extends SectionEntity<EcgTagEnum> {
    public TagSection(boolean z, @NotNull String str) {
        super(z, str);
    }

    public TagSection(@NotNull EcgTagEnum ecgTagEnum) {
        super(ecgTagEnum);
    }
}

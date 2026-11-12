package com.huami.sleep.repo;

import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0006H\u0016R2\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\fj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000`\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/sleep/repo/BreathQualitySelectHistoryRepo;", "Index", "Lcom/huami/sleep/repo/IBreathQualitySelectHistoryRepo;", "", "key", "value", "", "record", "(Ljava/lang/String;Ljava/lang/Object;)V", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "cleanRecord", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "initSelectPosition", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualitySelectHistoryRepo<Index> implements IBreathQualitySelectHistoryRepo<Index> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HashMap<String, Index> initSelectPosition = new HashMap<>();

    @Override // com.huami.sleep.repo.IBreathQualitySelectHistoryRepo
    public void cleanRecord() {
        this.initSelectPosition.clear();
    }

    @Override // com.huami.sleep.repo.IBreathQualitySelectHistoryRepo
    @Nullable
    public Index get(@NotNull String key) {
        return this.initSelectPosition.get(key);
    }

    @Override // com.huami.sleep.repo.IBreathQualitySelectHistoryRepo
    public void record(@NotNull String key, Index value) {
        this.initSelectPosition.put(key, value);
    }
}

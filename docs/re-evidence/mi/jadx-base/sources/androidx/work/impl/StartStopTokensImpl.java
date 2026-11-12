package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/work/impl/StartStopTokensImpl;", "Landroidx/work/impl/StartStopTokens;", "()V", "runs", "", "Landroidx/work/impl/model/WorkGenerationalId;", "Landroidx/work/impl/StartStopToken;", "contains", "", "id", "remove", "", "workSpecId", "", "tokenFor", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStartStopToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartStopToken.kt\nandroidx/work/impl/StartStopTokensImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n361#2,7:105\n467#2,7:112\n1855#3,2:119\n*S KotlinDebug\n*F\n+ 1 StartStopToken.kt\nandroidx/work/impl/StartStopTokensImpl\n*L\n65#1:105,7\n73#1:112,7\n74#1:119,2\n*E\n"})
final class StartStopTokensImpl implements StartStopTokens {

    @NotNull
    private final Map<WorkGenerationalId, StartStopToken> runs = new LinkedHashMap();

    @Override // androidx.work.impl.StartStopTokens
    public boolean contains(@NotNull WorkGenerationalId id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.runs.containsKey(id);
    }

    @Override // androidx.work.impl.StartStopTokens
    @Nullable
    public StartStopToken remove(@NotNull WorkGenerationalId id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.runs.remove(id);
    }

    @Override // androidx.work.impl.StartStopTokens
    @NotNull
    public StartStopToken tokenFor(@NotNull WorkGenerationalId id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Map<WorkGenerationalId, StartStopToken> map = this.runs;
        StartStopToken startStopToken = map.get(id);
        if (startStopToken == null) {
            startStopToken = new StartStopToken(id);
            map.put(id, startStopToken);
        }
        return startStopToken;
    }

    @Override // androidx.work.impl.StartStopTokens
    @NotNull
    public List<StartStopToken> remove(@NotNull String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Map<WorkGenerationalId, StartStopToken> map = this.runs;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<WorkGenerationalId, StartStopToken> entry : map.entrySet()) {
            if (Intrinsics.areEqual(entry.getKey().getWorkSpecId(), workSpecId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.runs.remove((WorkGenerationalId) it.next());
        }
        return CollectionsKt___CollectionsKt.toList(linkedHashMap.values());
    }
}

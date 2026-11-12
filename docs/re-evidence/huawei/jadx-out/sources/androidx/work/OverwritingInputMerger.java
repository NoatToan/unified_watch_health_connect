package androidx.work;

import defpackage.zcp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "Landroidx/work/InputMerger;", "()V", "merge", "Landroidx/work/Data;", "inputs", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OverwritingInputMerger extends InputMerger {
    @Override // androidx.work.InputMerger
    public Data merge(List<Data> inputs) throws Throwable {
        zcp.c(inputs, "");
        Data.Builder builder = new Data.Builder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Data> it = inputs.iterator();
        while (it.hasNext()) {
            Map<String, Object> keyValueMap = it.next().getKeyValueMap();
            zcp.b((Object) keyValueMap, "");
            linkedHashMap.putAll(keyValueMap);
        }
        builder.putAll(linkedHashMap);
        Data dataBuild = builder.build();
        zcp.b((Object) dataBuild, "");
        return dataBuild;
    }
}

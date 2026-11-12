package androidx.work;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OverwritingInputMerger extends InputMerger {
    @Override // androidx.work.InputMerger
    @NonNull
    public Data merge(@NonNull List<Data> inputs) {
        Data.Builder builder = new Data.Builder();
        HashMap map = new HashMap();
        Iterator<Data> it2 = inputs.iterator();
        while (it2.hasNext()) {
            map.putAll(it2.next().getKeyValueMap());
        }
        builder.putAll(map);
        return builder.build();
    }
}

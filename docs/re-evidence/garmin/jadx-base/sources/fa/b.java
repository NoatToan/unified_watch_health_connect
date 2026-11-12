package fa;

import android.os.Bundle;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private b() {
    }

    public static ImmutableList a(Function function, ArrayList arrayList) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            Bundle bundle = (Bundle) arrayList.get(i14);
            bundle.getClass();
            builder.add(function.apply(bundle));
        }
        return builder.build();
    }
}

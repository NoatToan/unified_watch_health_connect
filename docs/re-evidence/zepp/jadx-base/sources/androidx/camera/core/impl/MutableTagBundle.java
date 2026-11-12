package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MutableTagBundle extends TagBundle {
    private MutableTagBundle(Map<String, Integer> source) {
        super(source);
    }

    @NonNull
    public static MutableTagBundle create() {
        return new MutableTagBundle(new ArrayMap());
    }

    @NonNull
    public static MutableTagBundle from(@NonNull TagBundle otherTagBundle) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : otherTagBundle.listKeys()) {
            arrayMap.put(str, otherTagBundle.getTag(str));
        }
        return new MutableTagBundle(arrayMap);
    }

    public void addTagBundle(@NonNull TagBundle bundle) {
        Map<String, Integer> map;
        Map<String, Integer> map2 = this.mTagMap;
        if (map2 == null || (map = bundle.mTagMap) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void putTag(@NonNull String key, @NonNull Integer value) {
        this.mTagMap.put(key, value);
    }
}

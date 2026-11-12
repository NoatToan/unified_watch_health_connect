package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class TagBundle {
    private static final TagBundle EMPTY_TAGBUNDLE = new TagBundle(new ArrayMap());
    public final Map<String, Integer> mTagMap;

    public TagBundle(@NonNull Map<String, Integer> tagMap) {
        this.mTagMap = tagMap;
    }

    @NonNull
    public static TagBundle create(@NonNull Pair<String, Integer> source) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) source.first, (Integer) source.second);
        return new TagBundle(arrayMap);
    }

    @NonNull
    public static TagBundle emptyBundle() {
        return EMPTY_TAGBUNDLE;
    }

    @NonNull
    public static TagBundle from(@NonNull TagBundle otherTagBundle) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : otherTagBundle.listKeys()) {
            arrayMap.put(str, otherTagBundle.getTag(str));
        }
        return new TagBundle(arrayMap);
    }

    @Nullable
    public Integer getTag(@NonNull String key) {
        return this.mTagMap.get(key);
    }

    @NonNull
    public Set<String> listKeys() {
        return this.mTagMap.keySet();
    }
}

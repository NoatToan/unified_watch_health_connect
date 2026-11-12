package androidx.profileinstaller;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
class DexProfileData {
    public final int classSetSize;

    @NonNull
    public final HashSet<Integer> classes;
    public final long dexChecksum;
    public final int hotMethodRegionSize;

    @NonNull
    public final String key;

    @NonNull
    public final HashMap<Integer, Integer> methods;
    public final int numMethodIds;

    public DexProfileData(@NonNull String key, long dexChecksum, int classSetSize, int hotMethodRegionSize, int numMethodIds, @NonNull HashSet<Integer> classes, @NonNull HashMap<Integer, Integer> methods) {
        this.key = key;
        this.dexChecksum = dexChecksum;
        this.classSetSize = classSetSize;
        this.hotMethodRegionSize = hotMethodRegionSize;
        this.numMethodIds = numMethodIds;
        this.classes = classes;
        this.methods = methods;
    }
}

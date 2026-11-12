package coil.request;

import coil.util.Collections;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mibi.sdk.component.Constants;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0003\u001f !B\u0007\b\u0016¢\u0006\u0002\u0010\u0005B\u001b\b\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0003J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0006\u0010\u0013\u001a\u00020\u000fJ\u001b\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0015H\u0096\u0002J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u0003J\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u001f\u0010\u001b\u001a\u0004\u0018\u0001H\u001c\"\b\b\u0000\u0010\u001c*\u00020\u00112\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0007R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\""}, d2 = {"Lcoil/request/Parameters;", "", "Lkotlin/Pair;", "", "Lcoil/request/Parameters$Entry;", "()V", "entries", "", "(Ljava/util/Map;)V", MediaStoreUtil.MediaInfo.SIZE, "", "()I", "entry", "key", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "", "memoryCacheKey", "memoryCacheKeys", "newBuilder", "Lcoil/request/Parameters$Builder;", "toString", "value", "T", "(Ljava/lang/String;)Ljava/lang/Object;", Constants.KEY_RECHARGE_VALUES, "Builder", "Companion", "Entry", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Parameters implements Iterable<Pair<? extends String, ? extends Entry>>, KMappedMarker {

    @JvmField
    @NotNull
    public static final Parameters EMPTY = new Parameters();

    @NotNull
    private final Map<String, Entry> entries;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ&\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0007R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcoil/request/Parameters$Builder;", "", "()V", "parameters", "Lcoil/request/Parameters;", "(Lcoil/request/Parameters;)V", "entries", "", "", "Lcoil/request/Parameters$Entry;", OneTrack.Param.BUILD, "remove", "key", CourseConfigModel.DevCmd.CMD_ACTION_SET, "value", "memoryCacheKey", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @NotNull
        private final Map<String, Entry> entries;

        public Builder() {
            this.entries = new LinkedHashMap();
        }

        public static /* synthetic */ Builder set$default(Builder builder, String str, Object obj, String str2, int i, Object obj2) {
            if ((i & 4) != 0) {
                str2 = obj != null ? obj.toString() : null;
            }
            return builder.set(str, obj, str2);
        }

        @NotNull
        public final Parameters build() {
            return new Parameters(Collections.toImmutableMap(this.entries), null);
        }

        @NotNull
        public final Builder remove(@NotNull String key) {
            this.entries.remove(key);
            return this;
        }

        @JvmOverloads
        @NotNull
        public final Builder set(@NotNull String str, @Nullable Object obj) {
            return set$default(this, str, obj, null, 4, null);
        }

        @JvmOverloads
        @NotNull
        public final Builder set(@NotNull String key, @Nullable Object value, @Nullable String memoryCacheKey) {
            this.entries.put(key, new Entry(value, memoryCacheKey));
            return this;
        }

        public Builder(@NotNull Parameters parameters) {
            this.entries = MapsKt__MapsKt.toMutableMap(parameters.entries);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcoil/request/Parameters$Entry;", "", "value", "memoryCacheKey", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "getMemoryCacheKey", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "equals", "", "other", "hashCode", "", "toString", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Entry {

        @Nullable
        private final String memoryCacheKey;

        @Nullable
        private final Object value;

        public Entry(@Nullable Object obj, @Nullable String str) {
            this.value = obj;
            this.memoryCacheKey = str;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Entry) {
                Entry entry = (Entry) other;
                if (Intrinsics.areEqual(this.value, entry.value) && Intrinsics.areEqual(this.memoryCacheKey, entry.memoryCacheKey)) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public final String getMemoryCacheKey() {
            return this.memoryCacheKey;
        }

        @Nullable
        public final Object getValue() {
            return this.value;
        }

        public int hashCode() {
            Object obj = this.value;
            int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
            String str = this.memoryCacheKey;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Entry(value=" + this.value + ", memoryCacheKey=" + this.memoryCacheKey + ')';
        }
    }

    public /* synthetic */ Parameters(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @Nullable
    public final Entry entry(@NotNull String key) {
        return this.entries.get(key);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Parameters) && Intrinsics.areEqual(this.entries, ((Parameters) other).entries);
    }

    public int hashCode() {
        return this.entries.hashCode();
    }

    public final boolean isEmpty() {
        return this.entries.isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Pair<? extends String, ? extends Entry>> iterator() {
        Map<String, Entry> map = this.entries;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Entry> entry : map.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    @Nullable
    public final String memoryCacheKey(@NotNull String key) {
        Entry entry = this.entries.get(key);
        if (entry != null) {
            return entry.getMemoryCacheKey();
        }
        return null;
    }

    @NotNull
    public final Map<String, String> memoryCacheKeys() {
        if (isEmpty()) {
            return MapsKt__MapsKt.emptyMap();
        }
        Map<String, Entry> map = this.entries;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Entry> entry : map.entrySet()) {
            String memoryCacheKey = entry.getValue().getMemoryCacheKey();
            if (memoryCacheKey != null) {
                linkedHashMap.put(entry.getKey(), memoryCacheKey);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @JvmName(name = MediaStoreUtil.MediaInfo.SIZE)
    public final int size() {
        return this.entries.size();
    }

    @NotNull
    public String toString() {
        return "Parameters(entries=" + this.entries + ')';
    }

    @Nullable
    public final <T> T value(@NotNull String key) {
        Entry entry = this.entries.get(key);
        if (entry != null) {
            return (T) entry.getValue();
        }
        return null;
    }

    @NotNull
    public final Map<String, Object> values() {
        if (isEmpty()) {
            return MapsKt__MapsKt.emptyMap();
        }
        Map<String, Entry> map = this.entries;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((Entry) entry.getValue()).getValue());
        }
        return linkedHashMap;
    }

    private Parameters(Map<String, Entry> map) {
        this.entries = map;
    }

    public Parameters() {
        this(MapsKt__MapsKt.emptyMap());
    }
}

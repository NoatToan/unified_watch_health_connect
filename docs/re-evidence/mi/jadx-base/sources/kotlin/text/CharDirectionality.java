package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.CharDirectionality;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nCharDirectionality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1202#2,2:125\n1230#2,4:127\n*S KotlinDebug\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality\n*L\n118#1:125,2\n118#1:127,4\n*E\n"})
public enum CharDirectionality {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Lazy<Map<Integer, CharDirectionality>> directionalityMap$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ot3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CharDirectionality.directionalityMap_delegate$lambda$1();
        }
    });

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<Integer, CharDirectionality> getDirectionalityMap() {
            return (Map) CharDirectionality.directionalityMap$delegate.getValue();
        }

        @NotNull
        public final CharDirectionality valueOf(int i) {
            CharDirectionality charDirectionality = getDirectionalityMap().get(Integer.valueOf(i));
            if (charDirectionality != null) {
                return charDirectionality;
            }
            throw new IllegalArgumentException("Directionality #" + i + " is not defined.");
        }
    }

    CharDirectionality(int i) {
        this.value = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map directionalityMap_delegate$lambda$1() {
        EnumEntries<CharDirectionality> entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(entries, 10)), 16));
        for (CharDirectionality charDirectionality : entries) {
            linkedHashMap.put(Integer.valueOf(charDirectionality.value), charDirectionality);
        }
        return linkedHashMap;
    }

    @NotNull
    public static EnumEntries<CharDirectionality> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}

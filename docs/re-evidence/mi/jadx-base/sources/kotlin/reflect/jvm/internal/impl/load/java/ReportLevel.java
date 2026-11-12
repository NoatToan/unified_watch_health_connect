package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public enum ReportLevel {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");


    @NotNull
    private final String description;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nReportLevel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportLevel.kt\norg/jetbrains/kotlin/load/java/ReportLevel$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,20:1\n1310#2,2:21\n*S KotlinDebug\n*F\n+ 1 ReportLevel.kt\norg/jetbrains/kotlin/load/java/ReportLevel$Companion\n*L\n15#1:21,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    ReportLevel(String str) {
        this.description = str;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}

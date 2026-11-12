package androidx.work;

import android.annotation.SuppressLint;
import com.xiaomi.onetrack.OneTrack;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011BG\b\u0000\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0012"}, d2 = {"Landroidx/work/WorkQuery;", "", "ids", "", "Ljava/util/UUID;", "uniqueWorkNames", "", "tags", "states", "Landroidx/work/WorkInfo$State;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getIds", "()Ljava/util/List;", "getStates", "getTags", "getUniqueWorkNames", "Builder", "Companion", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WorkQuery {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<UUID> ids;

    @NotNull
    private final List<WorkInfo.State> states;

    @NotNull
    private final List<String> tags;

    @NotNull
    private final List<String> uniqueWorkNames;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\u0014\u0010\r\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\fJ\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fJ\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/work/WorkQuery$Builder;", "", "()V", "ids", "", "Ljava/util/UUID;", "states", "Landroidx/work/WorkInfo$State;", "tags", "", "uniqueWorkNames", "addIds", "", "addStates", "addTags", "addUniqueWorkNames", OneTrack.Param.BUILD, "Landroidx/work/WorkQuery;", "Companion", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final List<UUID> ids;

        @NotNull
        private final List<WorkInfo.State> states;

        @NotNull
        private final List<String> tags;

        @NotNull
        private final List<String> uniqueWorkNames;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0007J\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0007¨\u0006\u0010"}, d2 = {"Landroidx/work/WorkQuery$Builder$Companion;", "", "()V", "fromIds", "Landroidx/work/WorkQuery$Builder;", "ids", "", "Ljava/util/UUID;", "fromStates", "states", "Landroidx/work/WorkInfo$State;", "fromTags", "tags", "", "fromUniqueWorkNames", "uniqueWorkNames", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder fromIds(@NotNull List<UUID> ids) {
                Intrinsics.checkNotNullParameter(ids, "ids");
                Builder builder = new Builder(null);
                builder.addIds(ids);
                return builder;
            }

            @JvmStatic
            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder fromStates(@NotNull List<? extends WorkInfo.State> states) {
                Intrinsics.checkNotNullParameter(states, "states");
                Builder builder = new Builder(null);
                builder.addStates(states);
                return builder;
            }

            @JvmStatic
            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder fromTags(@NotNull List<String> tags) {
                Intrinsics.checkNotNullParameter(tags, "tags");
                Builder builder = new Builder(null);
                builder.addTags(tags);
                return builder;
            }

            @JvmStatic
            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder fromUniqueWorkNames(@NotNull List<String> uniqueWorkNames) {
                Intrinsics.checkNotNullParameter(uniqueWorkNames, "uniqueWorkNames");
                Builder builder = new Builder(null);
                builder.addUniqueWorkNames(uniqueWorkNames);
                return builder;
            }
        }

        public /* synthetic */ Builder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @SuppressLint({"BuilderSetStyle"})
        @NotNull
        public static final Builder fromIds(@NotNull List<UUID> list) {
            return INSTANCE.fromIds(list);
        }

        @JvmStatic
        @SuppressLint({"BuilderSetStyle"})
        @NotNull
        public static final Builder fromStates(@NotNull List<? extends WorkInfo.State> list) {
            return INSTANCE.fromStates(list);
        }

        @JvmStatic
        @SuppressLint({"BuilderSetStyle"})
        @NotNull
        public static final Builder fromTags(@NotNull List<String> list) {
            return INSTANCE.fromTags(list);
        }

        @JvmStatic
        @SuppressLint({"BuilderSetStyle"})
        @NotNull
        public static final Builder fromUniqueWorkNames(@NotNull List<String> list) {
            return INSTANCE.fromUniqueWorkNames(list);
        }

        @NotNull
        public final Builder addIds(@NotNull List<UUID> ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            CollectionsKt__MutableCollectionsKt.addAll(this.ids, ids);
            return this;
        }

        @NotNull
        public final Builder addStates(@NotNull List<? extends WorkInfo.State> states) {
            Intrinsics.checkNotNullParameter(states, "states");
            CollectionsKt__MutableCollectionsKt.addAll(this.states, states);
            return this;
        }

        @NotNull
        public final Builder addTags(@NotNull List<String> tags) {
            Intrinsics.checkNotNullParameter(tags, "tags");
            CollectionsKt__MutableCollectionsKt.addAll(this.tags, tags);
            return this;
        }

        @NotNull
        public final Builder addUniqueWorkNames(@NotNull List<String> uniqueWorkNames) {
            Intrinsics.checkNotNullParameter(uniqueWorkNames, "uniqueWorkNames");
            CollectionsKt__MutableCollectionsKt.addAll(this.uniqueWorkNames, uniqueWorkNames);
            return this;
        }

        @NotNull
        public final WorkQuery build() {
            if (this.ids.isEmpty() && this.uniqueWorkNames.isEmpty() && this.tags.isEmpty() && this.states.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new WorkQuery(this.ids, this.uniqueWorkNames, this.tags, this.states);
        }

        private Builder() {
            this.ids = new ArrayList();
            this.uniqueWorkNames = new ArrayList();
            this.tags = new ArrayList();
            this.states = new ArrayList();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007J!\u0010\n\u001a\u00020\u00042\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0006\"\u00020\fH\u0007¢\u0006\u0002\u0010\rJ\u0016\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0007J!\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0006\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0007J!\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0006\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0007¨\u0006\u0014"}, d2 = {"Landroidx/work/WorkQuery$Companion;", "", "()V", "fromIds", "Landroidx/work/WorkQuery;", "ids", "", "Ljava/util/UUID;", "([Ljava/util/UUID;)Landroidx/work/WorkQuery;", "", "fromStates", "states", "Landroidx/work/WorkInfo$State;", "([Landroidx/work/WorkInfo$State;)Landroidx/work/WorkQuery;", "fromTags", "tags", "", "([Ljava/lang/String;)Landroidx/work/WorkQuery;", "fromUniqueWorkNames", "uniqueWorkNames", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final WorkQuery fromIds(@NotNull List<UUID> ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            return new WorkQuery(ids, null, null, null, 14, null);
        }

        @JvmStatic
        @NotNull
        public final WorkQuery fromStates(@NotNull List<? extends WorkInfo.State> states) {
            Intrinsics.checkNotNullParameter(states, "states");
            return new WorkQuery(null, null, null, states, 7, null);
        }

        @JvmStatic
        @NotNull
        public final WorkQuery fromTags(@NotNull List<String> tags) {
            Intrinsics.checkNotNullParameter(tags, "tags");
            return new WorkQuery(null, null, tags, null, 11, null);
        }

        @JvmStatic
        @NotNull
        public final WorkQuery fromUniqueWorkNames(@NotNull String... uniqueWorkNames) {
            Intrinsics.checkNotNullParameter(uniqueWorkNames, "uniqueWorkNames");
            return new WorkQuery(null, ArraysKt___ArraysKt.toList(uniqueWorkNames), null, null, 13, null);
        }

        @JvmStatic
        @NotNull
        public final WorkQuery fromIds(@NotNull UUID... ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            return new WorkQuery(ArraysKt___ArraysKt.toList(ids), null, null, null, 14, null);
        }

        @JvmStatic
        @NotNull
        public final WorkQuery fromStates(@NotNull WorkInfo.State... states) {
            Intrinsics.checkNotNullParameter(states, "states");
            return new WorkQuery(null, null, null, ArraysKt___ArraysKt.toList(states), 7, null);
        }

        @JvmStatic
        @NotNull
        public final WorkQuery fromTags(@NotNull String... tags) {
            Intrinsics.checkNotNullParameter(tags, "tags");
            return new WorkQuery(null, null, ArraysKt___ArraysKt.toList(tags), null, 11, null);
        }

        @JvmStatic
        @NotNull
        public final WorkQuery fromUniqueWorkNames(@NotNull List<String> uniqueWorkNames) {
            Intrinsics.checkNotNullParameter(uniqueWorkNames, "uniqueWorkNames");
            return new WorkQuery(null, uniqueWorkNames, null, null, 13, null);
        }
    }

    public WorkQuery() {
        this(null, null, null, null, 15, null);
    }

    @JvmStatic
    @NotNull
    public static final WorkQuery fromIds(@NotNull List<UUID> list) {
        return INSTANCE.fromIds(list);
    }

    @JvmStatic
    @NotNull
    public static final WorkQuery fromStates(@NotNull List<? extends WorkInfo.State> list) {
        return INSTANCE.fromStates(list);
    }

    @JvmStatic
    @NotNull
    public static final WorkQuery fromTags(@NotNull List<String> list) {
        return INSTANCE.fromTags(list);
    }

    @JvmStatic
    @NotNull
    public static final WorkQuery fromUniqueWorkNames(@NotNull List<String> list) {
        return INSTANCE.fromUniqueWorkNames(list);
    }

    @NotNull
    public final List<UUID> getIds() {
        return this.ids;
    }

    @NotNull
    public final List<WorkInfo.State> getStates() {
        return this.states;
    }

    @NotNull
    public final List<String> getTags() {
        return this.tags;
    }

    @NotNull
    public final List<String> getUniqueWorkNames() {
        return this.uniqueWorkNames;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkQuery(@NotNull List<UUID> ids, @NotNull List<String> uniqueWorkNames, @NotNull List<String> tags, @NotNull List<? extends WorkInfo.State> states) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(uniqueWorkNames, "uniqueWorkNames");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(states, "states");
        this.ids = ids;
        this.uniqueWorkNames = uniqueWorkNames;
        this.tags = tags;
        this.states = states;
    }

    @JvmStatic
    @NotNull
    public static final WorkQuery fromIds(@NotNull UUID... uuidArr) {
        return INSTANCE.fromIds(uuidArr);
    }

    @JvmStatic
    @NotNull
    public static final WorkQuery fromStates(@NotNull WorkInfo.State... stateArr) {
        return INSTANCE.fromStates(stateArr);
    }

    @JvmStatic
    @NotNull
    public static final WorkQuery fromTags(@NotNull String... strArr) {
        return INSTANCE.fromTags(strArr);
    }

    @JvmStatic
    @NotNull
    public static final WorkQuery fromUniqueWorkNames(@NotNull String... strArr) {
        return INSTANCE.fromUniqueWorkNames(strArr);
    }

    public /* synthetic */ WorkQuery(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4);
    }
}

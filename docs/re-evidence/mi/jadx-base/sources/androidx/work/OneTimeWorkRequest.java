package androidx.work;

import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0002\u0005\u0006B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/work/OneTimeWorkRequest;", "Landroidx/work/WorkRequest;", "builder", "Landroidx/work/OneTimeWorkRequest$Builder;", "(Landroidx/work/OneTimeWorkRequest$Builder;)V", "Builder", "Companion", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OneTimeWorkRequest extends WorkRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011B\u0019\b\u0016\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0012¢\u0006\u0004\b\u0010\u0010\u0013J\u001d\u0010\u0006\u001a\u00020\u00002\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Landroidx/work/OneTimeWorkRequest$Builder;", "Landroidx/work/WorkRequest$Builder;", "Landroidx/work/OneTimeWorkRequest;", "Ljava/lang/Class;", "Landroidx/work/InputMerger;", "inputMerger", "setInputMerger", "(Ljava/lang/Class;)Landroidx/work/OneTimeWorkRequest$Builder;", "buildInternal$work_runtime_release", "()Landroidx/work/OneTimeWorkRequest;", "buildInternal", "getThisObject$work_runtime_release", "()Landroidx/work/OneTimeWorkRequest$Builder;", "thisObject", "Landroidx/work/a;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class Builder extends WorkRequest.Builder<Builder, OneTimeWorkRequest> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull Class<? extends a> workerClass) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        }

        @Override // androidx.work.WorkRequest.Builder
        @NotNull
        public Builder getThisObject$work_runtime_release() {
            return this;
        }

        @NotNull
        public final Builder setInputMerger(@NotNull Class<? extends InputMerger> inputMerger) {
            Intrinsics.checkNotNullParameter(inputMerger, "inputMerger");
            WorkSpec workSpec = getWorkSpec();
            String name = inputMerger.getName();
            Intrinsics.checkNotNullExpressionValue(name, "inputMerger.name");
            workSpec.inputMergerClassName = name;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull KClass<? extends a> workerClass) {
            this((Class<? extends a>) JvmClassMappingKt.getJavaClass((KClass) workerClass));
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        }

        @Override // androidx.work.WorkRequest.Builder
        @NotNull
        public OneTimeWorkRequest buildInternal$work_runtime_release() {
            if (getBackoffCriteriaSet() && getWorkSpec().constraints.getRequiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            return new OneTimeWorkRequest(this);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\bH\u0007¢\u0006\u0004\b\u0006\u0010\n¨\u0006\r"}, d2 = {"Landroidx/work/OneTimeWorkRequest$Companion;", "", "Ljava/lang/Class;", "Landroidx/work/a;", "workerClass", "Landroidx/work/OneTimeWorkRequest;", "from", "(Ljava/lang/Class;)Landroidx/work/OneTimeWorkRequest;", "", "workerClasses", "(Ljava/util/List;)Ljava/util/List;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOneTimeWorkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequest$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1549#2:113\n1620#2,3:114\n*S KotlinDebug\n*F\n+ 1 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequest$Companion\n*L\n98#1:113\n98#1:114,3\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final OneTimeWorkRequest from(@NotNull Class<? extends a> workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            return new Builder(workerClass).build();
        }

        @JvmStatic
        @NotNull
        public final List<OneTimeWorkRequest> from(@NotNull List<? extends Class<? extends a>> workerClasses) {
            Intrinsics.checkNotNullParameter(workerClasses, "workerClasses");
            List<? extends Class<? extends a>> list = workerClasses;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Builder((Class<? extends a>) it.next()).build());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTimeWorkRequest(@NotNull Builder builder) {
        super(builder.getId(), builder.getWorkSpec(), builder.getTags$work_runtime_release());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    @JvmStatic
    @NotNull
    public static final OneTimeWorkRequest from(@NotNull Class<? extends a> cls) {
        return INSTANCE.from(cls);
    }

    @JvmStatic
    @NotNull
    public static final List<OneTimeWorkRequest> from(@NotNull List<? extends Class<? extends a>> list) {
        return INSTANCE.from(list);
    }
}

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class PredefinedFunctionEnhancementInfo {

    @Nullable
    private final TypeEnhancementInfo a;

    @NotNull
    private final List<TypeEnhancementInfo> b;

    /* JADX WARN: Multi-variable type inference failed */
    public PredefinedFunctionEnhancementInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public PredefinedFunctionEnhancementInfo(@Nullable TypeEnhancementInfo typeEnhancementInfo, @NotNull List<TypeEnhancementInfo> list) {
        this.a = typeEnhancementInfo;
        this.b = list;
    }

    @NotNull
    public final List<TypeEnhancementInfo> getParametersInfo() {
        return this.b;
    }

    @Nullable
    public final TypeEnhancementInfo getReturnTypeInfo() {
        return this.a;
    }

    public /* synthetic */ PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeEnhancementInfo, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}

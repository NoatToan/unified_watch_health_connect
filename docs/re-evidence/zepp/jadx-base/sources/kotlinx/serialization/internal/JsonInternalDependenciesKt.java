package kotlinx.serialization.internal;

import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "jsonCachedSerialNames", "kotlinx-serialization-core"}, k = 2, mv = {1, 5, 1})
public final class JsonInternalDependenciesKt {
    @Deprecated(level = DeprecationLevel.ERROR, message = "Should not be used")
    @InternalSerializationApi
    @NotNull
    public static final Set<String> jsonCachedSerialNames(@NotNull SerialDescriptor serialDescriptor) {
        return Platform_commonKt.cachedSerialNames(serialDescriptor);
    }
}

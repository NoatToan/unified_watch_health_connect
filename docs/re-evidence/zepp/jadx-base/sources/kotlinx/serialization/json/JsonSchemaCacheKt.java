package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\" \u0010\u0006\u001a\u00020\u0001*\u00020\u00008@@\u0000X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "getSchemaCache", "(Lkotlinx/serialization/json/Json;)Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "getSchemaCache$annotations", "(Lkotlinx/serialization/json/Json;)V", "schemaCache", "kotlinx-serialization-json"}, k = 2, mv = {1, 5, 1})
public final class JsonSchemaCacheKt {
    @NotNull
    public static final DescriptorSchemaCache getSchemaCache(@NotNull Json json) {
        return json.get_schemaCache();
    }

    public static /* synthetic */ void getSchemaCache$annotations(Json json) {
    }
}

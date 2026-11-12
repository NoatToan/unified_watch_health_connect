package kotlinx.serialization.json;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a)\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005\u001a$\u0010\u000b\u001a\u00020\n\"\u0006\b\u0000\u0010\b\u0018\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u000e\u001a\u00028\u0000\"\u0006\b\u0000\u0010\b\u0018\u0001*\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\"\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/json/Json;", "from", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Json", ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlinx/serialization/json/JsonElement;", "encodeToJsonElement", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "json", "decodeFromJsonElement", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "defaultIndent", "b", "defaultDiscriminator", "kotlinx-serialization-json"}, k = 2, mv = {1, 5, 1})
public final class JsonKt {

    @NotNull
    private static final String a = "    ";

    @NotNull
    private static final String b = "type";

    @NotNull
    public static final Json Json(@NotNull Json json, @NotNull Function1<? super JsonBuilder, Unit> function1) {
        JsonBuilder jsonBuilder = new JsonBuilder(json);
        function1.invoke(jsonBuilder);
        return new a(jsonBuilder.build$kotlinx_serialization_json(), jsonBuilder.getSerializersModule());
    }

    public static /* synthetic */ Json Json$default(Json json, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            json = Json.INSTANCE;
        }
        return Json(json, function1);
    }

    public static final /* synthetic */ <T> T decodeFromJsonElement(Json json, JsonElement jsonElement) {
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) json.decodeFromJsonElement(SerializersKt.serializer(serializersModule, (KType) null), jsonElement);
    }

    public static final /* synthetic */ <T> JsonElement encodeToJsonElement(Json json, T t) {
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return json.encodeToJsonElement(SerializersKt.serializer(serializersModule, (KType) null), t);
    }
}

package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lkotlinx/serialization/json/JsonNamingStrategy;", "", "serialNameForJson", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementIndex", "", "serialName", "Builtins", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalSerializationApi
public interface JsonNamingStrategy {

    /* JADX INFO: renamed from: Builtins, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: renamed from: kotlinx.serialization.json.JsonNamingStrategy$Builtins, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007¨\u0006\u0010"}, d2 = {"Lkotlinx/serialization/json/JsonNamingStrategy$Builtins;", "", "()V", "KebabCase", "Lkotlinx/serialization/json/JsonNamingStrategy;", "getKebabCase$annotations", "getKebabCase", "()Lkotlinx/serialization/json/JsonNamingStrategy;", "SnakeCase", "getSnakeCase$annotations", "getSnakeCase", "convertCamelCase", "", "serialName", "delimiter", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ExperimentalSerializationApi
    @SourceDebugExtension({"SMAP\nJsonNamingStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1174#2:179\n1175#2:181\n1#3:180\n*S KotlinDebug\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n*L\n149#1:179\n149#1:181\n*E\n"})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final JsonNamingStrategy SnakeCase = new JsonNamingStrategy() { // from class: kotlinx.serialization.json.JsonNamingStrategy$Builtins$SnakeCase$1
            @Override // kotlinx.serialization.json.JsonNamingStrategy
            @NotNull
            public String serialNameForJson(@NotNull SerialDescriptor descriptor, int elementIndex, @NotNull String serialName) {
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(serialName, "serialName");
                return JsonNamingStrategy.Companion.$$INSTANCE.convertCamelCase(serialName, '_');
            }

            @NotNull
            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
            }
        };

        @NotNull
        private static final JsonNamingStrategy KebabCase = new JsonNamingStrategy() { // from class: kotlinx.serialization.json.JsonNamingStrategy$Builtins$KebabCase$1
            @Override // kotlinx.serialization.json.JsonNamingStrategy
            @NotNull
            public String serialNameForJson(@NotNull SerialDescriptor descriptor, int elementIndex, @NotNull String serialName) {
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(serialName, "serialName");
                return JsonNamingStrategy.Companion.$$INSTANCE.convertCamelCase(serialName, '-');
            }

            @NotNull
            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.KebabCase";
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String convertCamelCase(String serialName, char delimiter) {
            StringBuilder sb = new StringBuilder(serialName.length() * 2);
            Character chValueOf = null;
            int i = 0;
            for (int i2 = 0; i2 < serialName.length(); i2++) {
                char cCharAt = serialName.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    if (i == 0 && sb.length() > 0 && StringsKt___StringsKt.last(sb) != delimiter) {
                        sb.append(delimiter);
                    }
                    if (chValueOf != null) {
                        sb.append(chValueOf.charValue());
                    }
                    i++;
                    chValueOf = Character.valueOf(Character.toLowerCase(cCharAt));
                } else {
                    if (chValueOf != null) {
                        if (i > 1 && Character.isLetter(cCharAt)) {
                            sb.append(delimiter);
                        }
                        sb.append(chValueOf);
                        chValueOf = null;
                        i = 0;
                    }
                    sb.append(cCharAt);
                }
            }
            if (chValueOf != null) {
                sb.append(chValueOf);
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getKebabCase$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getSnakeCase$annotations() {
        }

        @NotNull
        public final JsonNamingStrategy getKebabCase() {
            return KebabCase;
        }

        @NotNull
        public final JsonNamingStrategy getSnakeCase() {
            return SnakeCase;
        }
    }

    @NotNull
    String serialNameForJson(@NotNull SerialDescriptor descriptor, int elementIndex, @NotNull String serialName);
}

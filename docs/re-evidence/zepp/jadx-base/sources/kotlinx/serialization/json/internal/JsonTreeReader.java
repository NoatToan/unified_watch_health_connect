package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0006\u0010\t\u001a\u00020\u0002R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeReader;", "", "Lkotlinx/serialization/json/JsonElement;", "b", "a", "", "isString", "Lkotlinx/serialization/json/JsonPrimitive;", "c", "read", "Lkotlinx/serialization/json/internal/JsonLexer;", "Lkotlinx/serialization/json/internal/JsonLexer;", "lexer", "Z", "isLenient", "Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;Lkotlinx/serialization/json/internal/JsonLexer;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
public final class JsonTreeReader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final JsonReader lexer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isLenient;

    public JsonTreeReader(@NotNull JsonConfiguration jsonConfiguration, @NotNull JsonReader jsonReader) {
        this.lexer = jsonReader;
        this.isLenient = jsonConfiguration.getIsLenient();
    }

    private final JsonElement a() {
        byte bConsumeNextToken = this.lexer.consumeNextToken();
        if (this.lexer.peekNextToken() == 4) {
            JsonReader.fail$default(this.lexer, "Unexpected leading comma", 0, 2, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.lexer.canConsumeValue()) {
            arrayList.add(read());
            bConsumeNextToken = this.lexer.consumeNextToken();
            if (bConsumeNextToken != 4) {
                JsonReader jsonReader = this.lexer;
                boolean z = bConsumeNextToken == 9;
                int i = jsonReader.currentPosition;
                if (!z) {
                    jsonReader.fail("Expected end of the array or comma", i);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bConsumeNextToken == 8) {
            this.lexer.consumeNextToken((byte) 9);
        } else if (bConsumeNextToken == 4) {
            JsonReader.fail$default(this.lexer, "Unexpected trailing comma", 0, 2, null);
            throw new KotlinNothingValueException();
        }
        return new JsonArray(arrayList);
    }

    private final JsonElement b() {
        byte bConsumeNextToken = this.lexer.consumeNextToken((byte) 6);
        if (this.lexer.peekNextToken() == 4) {
            JsonReader.fail$default(this.lexer, "Unexpected leading comma", 0, 2, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (this.lexer.canConsumeValue()) {
            String strConsumeStringLenient = this.isLenient ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
            this.lexer.consumeNextToken((byte) 5);
            linkedHashMap.put(strConsumeStringLenient, read());
            bConsumeNextToken = this.lexer.consumeNextToken();
            if (bConsumeNextToken != 4 && bConsumeNextToken != 7) {
                JsonReader.fail$default(this.lexer, "Expected end of the object or comma", 0, 2, null);
                throw new KotlinNothingValueException();
            }
        }
        if (bConsumeNextToken == 6) {
            this.lexer.consumeNextToken((byte) 7);
        } else if (bConsumeNextToken == 4) {
            JsonReader.fail$default(this.lexer, "Unexpected trailing comma", 0, 2, null);
            throw new KotlinNothingValueException();
        }
        return new JsonObject(linkedHashMap);
    }

    private final JsonPrimitive c(boolean isString) {
        String strConsumeStringLenient = (this.isLenient || !isString) ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
        return (isString || !Intrinsics.areEqual(strConsumeStringLenient, "null")) ? new JsonLiteral(strConsumeStringLenient, isString) : JsonNull.INSTANCE;
    }

    @NotNull
    public final JsonElement read() {
        byte bPeekNextToken = this.lexer.peekNextToken();
        if (bPeekNextToken == 1) {
            return c(true);
        }
        if (bPeekNextToken == 0) {
            return c(false);
        }
        if (bPeekNextToken == 6) {
            return b();
        }
        if (bPeekNextToken == 8) {
            return a();
        }
        JsonReader.fail$default(this.lexer, "Can't begin reading element, unexpected token", 0, 2, null);
        throw new KotlinNothingValueException();
    }
}

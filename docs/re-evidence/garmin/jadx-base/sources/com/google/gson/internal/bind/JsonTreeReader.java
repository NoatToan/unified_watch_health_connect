package com.google.gson.internal.bind;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import fb1.c;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kg.f;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonTreeReader extends JsonReader {
    private int[] pathIndices;
    private String[] pathNames;
    private Object[] stack;
    private int stackSize;
    private static final Reader UNREADABLE_READER = new Reader() { // from class: com.google.gson.internal.bind.JsonTreeReader.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i14, int i15) {
            throw new AssertionError();
        }
    };
    private static final Object SENTINEL_CLOSED = new Object();

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JsonTreeReader$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public JsonTreeReader(JsonElement jsonElement) {
        super(UNREADABLE_READER);
        this.stack = new Object[32];
        this.stackSize = 0;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        push(jsonElement);
    }

    private void expect(JsonToken jsonToken) {
        if (peek() == jsonToken) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        sb3.append(jsonToken);
        sb3.append(" but was ");
        sb3.append(peek());
        c.y(sb3, locationString());
    }

    private String getPath(boolean z14) {
        StringBuilder sb3 = new StringBuilder("$");
        int i14 = 0;
        while (true) {
            int i15 = this.stackSize;
            if (i14 >= i15) {
                return sb3.toString();
            }
            Object[] objArr = this.stack;
            Object obj = objArr[i14];
            if (obj instanceof JsonArray) {
                i14++;
                if (i14 < i15 && (objArr[i14] instanceof Iterator)) {
                    int i16 = this.pathIndices[i14];
                    if (z14 && i16 > 0 && (i14 == i15 - 1 || i14 == i15 - 2)) {
                        i16--;
                    }
                    sb3.append('[');
                    sb3.append(i16);
                    sb3.append(']');
                }
            } else if ((obj instanceof JsonObject) && (i14 = i14 + 1) < i15 && (objArr[i14] instanceof Iterator)) {
                sb3.append('.');
                String str = this.pathNames[i14];
                if (str != null) {
                    sb3.append(str);
                }
            }
            i14++;
        }
    }

    private String locationString() {
        return " at path " + getPath();
    }

    private String nextName(boolean z14) {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        String str = (String) entry.getKey();
        this.pathNames[this.stackSize - 1] = z14 ? "<skipped>" : str;
        push(entry.getValue());
        return str;
    }

    private Object peekStack() {
        return this.stack[this.stackSize - 1];
    }

    @CanIgnoreReturnValue
    private Object popStack() {
        Object[] objArr = this.stack;
        int i14 = this.stackSize - 1;
        this.stackSize = i14;
        Object obj = objArr[i14];
        objArr[i14] = null;
        return obj;
    }

    private void push(Object obj) {
        int i14 = this.stackSize;
        Object[] objArr = this.stack;
        if (i14 == objArr.length) {
            int i15 = i14 * 2;
            this.stack = Arrays.copyOf(objArr, i15);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i15);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i15);
        }
        Object[] objArr2 = this.stack;
        int i16 = this.stackSize;
        this.stackSize = i16 + 1;
        objArr2[i16] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() {
        expect(JsonToken.BEGIN_ARRAY);
        push(((JsonArray) peekStack()).iterator());
        this.pathIndices[this.stackSize - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() {
        expect(JsonToken.BEGIN_OBJECT);
        push(((JsonObject) peekStack()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.stack = new Object[]{SENTINEL_CLOSED};
        this.stackSize = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() {
        expect(JsonToken.END_ARRAY);
        popStack();
        popStack();
        int i14 = this.stackSize;
        if (i14 > 0) {
            int[] iArr = this.pathIndices;
            int i15 = i14 - 1;
            iArr[i15] = iArr[i15] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() {
        expect(JsonToken.END_OBJECT);
        this.pathNames[this.stackSize - 1] = null;
        popStack();
        popStack();
        int i14 = this.stackSize;
        if (i14 > 0) {
            int[] iArr = this.pathIndices;
            int i15 = i14 - 1;
            iArr[i15] = iArr[i15] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPreviousPath() {
        return getPath(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        return (jsonTokenPeek == JsonToken.END_OBJECT || jsonTokenPeek == JsonToken.END_ARRAY || jsonTokenPeek == JsonToken.END_DOCUMENT) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() {
        expect(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) popStack()).getAsBoolean();
        int i14 = this.stackSize;
        if (i14 > 0) {
            int[] iArr = this.pathIndices;
            int i15 = i14 - 1;
            iArr[i15] = iArr[i15] + 1;
        }
        return asBoolean;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            StringBuilder sb3 = new StringBuilder("Expected ");
            sb3.append(jsonToken);
            sb3.append(" but was ");
            sb3.append(jsonTokenPeek);
            c.y(sb3, locationString());
            return 0.0d;
        }
        double asDouble = ((JsonPrimitive) peekStack()).getAsDouble();
        if (!isLenient() && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + asDouble);
        }
        popStack();
        int i14 = this.stackSize;
        if (i14 > 0) {
            int[] iArr = this.pathIndices;
            int i15 = i14 - 1;
            iArr[i15] = iArr[i15] + 1;
        }
        return asDouble;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            StringBuilder sb3 = new StringBuilder("Expected ");
            sb3.append(jsonToken);
            sb3.append(" but was ");
            sb3.append(jsonTokenPeek);
            c.y(sb3, locationString());
            return 0;
        }
        int asInt = ((JsonPrimitive) peekStack()).getAsInt();
        popStack();
        int i14 = this.stackSize;
        if (i14 > 0) {
            int[] iArr = this.pathIndices;
            int i15 = i14 - 1;
            iArr[i15] = iArr[i15] + 1;
        }
        return asInt;
    }

    public JsonElement nextJsonElement() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek == JsonToken.NAME || jsonTokenPeek == JsonToken.END_ARRAY || jsonTokenPeek == JsonToken.END_OBJECT || jsonTokenPeek == JsonToken.END_DOCUMENT) {
            f.o("Unexpected ", jsonTokenPeek, " when reading a JsonElement.");
            return null;
        }
        JsonElement jsonElement = (JsonElement) peekStack();
        skipValue();
        return jsonElement;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            StringBuilder sb3 = new StringBuilder("Expected ");
            sb3.append(jsonToken);
            sb3.append(" but was ");
            sb3.append(jsonTokenPeek);
            c.y(sb3, locationString());
            return 0L;
        }
        long asLong = ((JsonPrimitive) peekStack()).getAsLong();
        popStack();
        int i14 = this.stackSize;
        if (i14 > 0) {
            int[] iArr = this.pathIndices;
            int i15 = i14 - 1;
            iArr[i15] = iArr[i15] + 1;
        }
        return asLong;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() {
        expect(JsonToken.NULL);
        popStack();
        int i14 = this.stackSize;
        if (i14 > 0) {
            int[] iArr = this.pathIndices;
            int i15 = i14 - 1;
            iArr[i15] = iArr[i15] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.NUMBER) {
            StringBuilder sb3 = new StringBuilder("Expected ");
            sb3.append(jsonToken);
            sb3.append(" but was ");
            sb3.append(jsonTokenPeek);
            c.y(sb3, locationString());
            return null;
        }
        String asString = ((JsonPrimitive) popStack()).getAsString();
        int i14 = this.stackSize;
        if (i14 > 0) {
            int[] iArr = this.pathIndices;
            int i15 = i14 - 1;
            iArr[i15] = iArr[i15] + 1;
        }
        return asString;
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws MalformedJsonException {
        if (this.stackSize == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objPeekStack = peekStack();
        if (objPeekStack instanceof Iterator) {
            boolean z14 = this.stack[this.stackSize - 2] instanceof JsonObject;
            Iterator it = (Iterator) objPeekStack;
            if (!it.hasNext()) {
                return z14 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z14) {
                return JsonToken.NAME;
            }
            push(it.next());
            return peek();
        }
        if (objPeekStack instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objPeekStack instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (objPeekStack instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) objPeekStack;
            if (jsonPrimitive.isString()) {
                return JsonToken.STRING;
            }
            if (jsonPrimitive.isBoolean()) {
                return JsonToken.BOOLEAN;
            }
            if (jsonPrimitive.isNumber()) {
                return JsonToken.NUMBER;
            }
            e0.l();
            return null;
        }
        if (objPeekStack instanceof JsonNull) {
            return JsonToken.NULL;
        }
        if (objPeekStack == SENTINEL_CLOSED) {
            h.z("JsonReader is closed");
            return null;
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objPeekStack.getClass().getName() + " is not supported");
    }

    public void promoteNameToValue() {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        push(entry.getValue());
        push(new JsonPrimitive((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws MalformedJsonException {
        int i14 = AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken[peek().ordinal()];
        if (i14 == 1) {
            nextName(true);
            return;
        }
        if (i14 == 2) {
            endArray();
            return;
        }
        if (i14 == 3) {
            endObject();
            return;
        }
        if (i14 != 4) {
            popStack();
            int i15 = this.stackSize;
            if (i15 > 0) {
                int[] iArr = this.pathIndices;
                int i16 = i15 - 1;
                iArr[i16] = iArr[i16] + 1;
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return "JsonTreeReader" + locationString();
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() {
        return nextName(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        return getPath(false);
    }
}

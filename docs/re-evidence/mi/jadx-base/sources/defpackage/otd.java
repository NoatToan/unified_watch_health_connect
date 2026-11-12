package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class otd extends ntd {
    public final JsonParser[] d;
    public final boolean e;
    public int f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otd(boolean z, JsonParser[] jsonParserArr) {
        super(jsonParserArr[0]);
        boolean z2 = false;
        this.e = z;
        if (z && this.c.w0()) {
            z2 = true;
        }
        this.g = z2;
        this.d = jsonParserArr;
        this.f = 1;
    }

    public static otd Q0(boolean z, JsonParser jsonParser, JsonParser jsonParser2) {
        boolean z2 = jsonParser instanceof otd;
        if (!z2 && !(jsonParser2 instanceof otd)) {
            return new otd(z, new JsonParser[]{jsonParser, jsonParser2});
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            ((otd) jsonParser).P0(arrayList);
        } else {
            arrayList.add(jsonParser);
        }
        if (jsonParser2 instanceof otd) {
            ((otd) jsonParser2).P0(arrayList);
        } else {
            arrayList.add(jsonParser2);
        }
        return new otd(z, (JsonParser[]) arrayList.toArray(new JsonParser[arrayList.size()]));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken G0() throws IOException {
        JsonParser jsonParser = this.c;
        if (jsonParser == null) {
            return null;
        }
        if (this.g) {
            this.g = false;
            return jsonParser.m();
        }
        JsonToken jsonTokenG0 = jsonParser.G0();
        return jsonTokenG0 == null ? R0() : jsonTokenG0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser O0() throws IOException {
        if (this.c.m() != JsonToken.START_OBJECT && this.c.m() != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken jsonTokenG0 = G0();
            if (jsonTokenG0 == null) {
                return this;
            }
            if (jsonTokenG0.isStructStart()) {
                i++;
            } else if (jsonTokenG0.isStructEnd() && (i = i - 1) == 0) {
                return this;
            }
        }
    }

    public void P0(List<JsonParser> list) {
        int length = this.d.length;
        for (int i = this.f - 1; i < length; i++) {
            JsonParser jsonParser = this.d[i];
            if (jsonParser instanceof otd) {
                ((otd) jsonParser).P0(list);
            } else {
                list.add(jsonParser);
            }
        }
    }

    public JsonToken R0() throws IOException {
        JsonToken jsonTokenG0;
        do {
            int i = this.f;
            JsonParser[] jsonParserArr = this.d;
            if (i >= jsonParserArr.length) {
                return null;
            }
            this.f = i + 1;
            JsonParser jsonParser = jsonParserArr[i];
            this.c = jsonParser;
            if (this.e && jsonParser.w0()) {
                return this.c.K();
            }
            jsonTokenG0 = this.c.G0();
        } while (jsonTokenG0 == null);
        return jsonTokenG0;
    }

    public boolean S0() {
        int i = this.f;
        JsonParser[] jsonParserArr = this.d;
        if (i >= jsonParserArr.length) {
            return false;
        }
        this.f = i + 1;
        this.c = jsonParserArr[i];
        return true;
    }

    @Override // defpackage.ntd, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        do {
            this.c.close();
        } while (S0());
    }
}

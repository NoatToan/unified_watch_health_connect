package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class yc extends ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f53323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f53324b;
    protected final boolean d;
    protected final JsonParser[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected yc(boolean z, JsonParser[] jsonParserArr) {
        super(jsonParserArr[0]);
        boolean z2 = false;
        this.d = z;
        if (z && this.h.hasCurrentToken()) {
            z2 = true;
        }
        this.f53324b = z2;
        this.e = jsonParserArr;
        this.f53323a = 1;
    }

    public static yc d(boolean z, JsonParser jsonParser, JsonParser jsonParser2) {
        boolean z2 = jsonParser instanceof yc;
        if (!z2 && !(jsonParser2 instanceof yc)) {
            return new yc(z, new JsonParser[]{jsonParser, jsonParser2});
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            ((yc) jsonParser).a(arrayList);
        } else {
            arrayList.add(jsonParser);
        }
        if (jsonParser2 instanceof yc) {
            ((yc) jsonParser2).a(arrayList);
        } else {
            arrayList.add(jsonParser2);
        }
        return new yc(z, (JsonParser[]) arrayList.toArray(new JsonParser[arrayList.size()]));
    }

    protected void a(List<JsonParser> list) {
        int length = this.e.length;
        for (int i = this.f53323a - 1; i < length; i++) {
            JsonParser jsonParser = this.e[i];
            if (jsonParser instanceof yc) {
                ((yc) jsonParser).a(list);
            } else {
                list.add(jsonParser);
            }
        }
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        do {
            this.h.close();
        } while (b());
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        if (this.h == null) {
            return null;
        }
        if (this.f53324b) {
            this.f53324b = false;
            return this.h.currentToken();
        }
        JsonToken jsonTokenNextToken = this.h.nextToken();
        return jsonTokenNextToken == null ? a() : jsonTokenNextToken;
    }

    @Override // defpackage.ye, com.fasterxml.jackson.core.JsonParser
    public JsonParser skipChildren() throws IOException {
        if (this.h.currentToken() == JsonToken.START_OBJECT || this.h.currentToken() == JsonToken.START_ARRAY) {
            int i = 1;
            while (true) {
                JsonToken jsonTokenNextToken = nextToken();
                if (jsonTokenNextToken == null) {
                    break;
                }
                if (!jsonTokenNextToken.isStructStart()) {
                    if (jsonTokenNextToken.isStructEnd() && (i = i - 1) == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        return this;
    }

    protected boolean b() {
        int i = this.f53323a;
        JsonParser[] jsonParserArr = this.e;
        if (i >= jsonParserArr.length) {
            return false;
        }
        this.f53323a = i + 1;
        this.h = jsonParserArr[i];
        return true;
    }

    protected JsonToken a() throws IOException {
        JsonToken jsonTokenNextToken;
        do {
            int i = this.f53323a;
            JsonParser[] jsonParserArr = this.e;
            if (i >= jsonParserArr.length) {
                return null;
            }
            this.f53323a = i + 1;
            this.h = jsonParserArr[i];
            if (this.d && this.h.hasCurrentToken()) {
                return this.h.getCurrentToken();
            }
            jsonTokenNextToken = this.h.nextToken();
        } while (jsonTokenNextToken == null);
        return jsonTokenNextToken;
    }
}

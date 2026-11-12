package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.StreamReadException;

/* JADX INFO: loaded from: classes21.dex */
public class wt extends StreamReadException {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Class<?> f52448b;
    protected final JsonToken d;

    public wt(JsonParser jsonParser, String str, JsonToken jsonToken, Class<?> cls) {
        super(jsonParser, str);
        this.d = jsonToken;
        this.f52448b = cls;
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public wt withParser(JsonParser jsonParser) {
        this._processor = jsonParser;
        return this;
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wt withRequestPayload(yd ydVar) {
        this._requestPayload = ydVar;
        return this;
    }
}

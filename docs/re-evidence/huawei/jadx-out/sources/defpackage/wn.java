package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.exc.StreamReadException;

/* JADX INFO: loaded from: classes21.dex */
public class wn extends StreamReadException {
    private static final long serialVersionUID = 2;

    public wn(JsonParser jsonParser, String str) {
        super(jsonParser, str);
    }

    public wn(JsonParser jsonParser, String str, Throwable th) {
        super(jsonParser, str, th);
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public wn withParser(JsonParser jsonParser) {
        this._processor = jsonParser;
        return this;
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wn withRequestPayload(yd ydVar) {
        this._requestPayload = ydVar;
        return this;
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException, defpackage.wr, com.fasterxml.jackson.core.JacksonException
    public JsonParser getProcessor() {
        return super.getProcessor();
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException
    public yd getRequestPayload() {
        return super.getRequestPayload();
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException
    public String getRequestPayloadAsString() {
        return super.getRequestPayloadAsString();
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException, defpackage.wr, java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }
}

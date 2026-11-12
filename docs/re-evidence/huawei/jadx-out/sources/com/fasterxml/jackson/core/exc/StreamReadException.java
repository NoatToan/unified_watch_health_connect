package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonParser;
import defpackage.wq;
import defpackage.wr;
import defpackage.yd;

/* JADX INFO: loaded from: classes21.dex */
public abstract class StreamReadException extends wr {
    static final long serialVersionUID = 1;
    protected transient JsonParser _processor;
    protected yd _requestPayload;

    public abstract StreamReadException withParser(JsonParser jsonParser);

    public abstract StreamReadException withRequestPayload(yd ydVar);

    public StreamReadException(JsonParser jsonParser, String str) {
        super(str, jsonParser == null ? null : jsonParser.getCurrentLocation());
        this._processor = jsonParser;
    }

    public StreamReadException(JsonParser jsonParser, String str, Throwable th) {
        super(str, jsonParser == null ? null : jsonParser.getCurrentLocation(), th);
        this._processor = jsonParser;
    }

    public StreamReadException(JsonParser jsonParser, String str, wq wqVar) {
        super(str, wqVar, null);
        this._processor = jsonParser;
    }

    protected StreamReadException(String str, wq wqVar, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this._location = wqVar;
    }

    @Override // defpackage.wr, com.fasterxml.jackson.core.JacksonException
    public JsonParser getProcessor() {
        return this._processor;
    }

    public yd getRequestPayload() {
        return this._requestPayload;
    }

    public String getRequestPayloadAsString() {
        yd ydVar = this._requestPayload;
        if (ydVar != null) {
            return ydVar.toString();
        }
        return null;
    }

    @Override // defpackage.wr, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this._requestPayload == null) {
            return message;
        }
        return message + "\nRequest payload : " + this._requestPayload.toString();
    }
}

package com.amazon.alexa.avs.message.response;

import com.amazon.alexa.avs.exception.AlexaSystemException;
import com.amazon.alexa.avs.message.Header;
import com.amazon.alexa.avs.message.Message;
import com.amazon.alexa.avs.message.response.system.Exception;
import com.google.gson.JsonObject;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class AlexaExceptionResponse extends Message {
    public AlexaExceptionResponse(Header header, JsonObject jsonObject, String str) throws IOException {
        super(header, jsonObject, str);
    }

    public void throwException() throws AlexaSystemException {
        Exception exception = (Exception) this.payload;
        throw new AlexaSystemException(exception.getCode(), exception.getDescription());
    }
}

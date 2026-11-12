package com.amazon.alexa.avs.message.response;

import com.amazon.alexa.avs.message.DialogRequestIdHeader;
import com.amazon.alexa.avs.message.Header;
import com.amazon.alexa.avs.message.Message;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class Directive extends Message {

    @Expose(serialize = false)
    private final String dialogRequestId;

    public static class DirectiveWrapper {
        public Directive directive;

        public static GsonBuilder getDirectiveBuilder() {
            return new GsonBuilder().registerTypeAdapter(Directive.class, new Message.MessageJsonDeserializer());
        }

        public Directive getDirective() {
            return this.directive;
        }
    }

    public Directive(Header header, JsonObject jsonObject, String str) throws IOException {
        super(header, jsonObject, str);
        this.dialogRequestId = extractDialogRequestId();
    }

    private String extractDialogRequestId() {
        Header header = this.header;
        if (header instanceof DialogRequestIdHeader) {
            return ((DialogRequestIdHeader) header).getDialogRequestId();
        }
        return null;
    }

    public String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Override // com.amazon.alexa.avs.message.Message
    public String toString() {
        return super.toString() + " dialogRequestId : " + this.dialogRequestId;
    }
}

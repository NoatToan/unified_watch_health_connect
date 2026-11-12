package com.amazon.alexa.avs.message;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.amazon.alexa.avs.log.LogHelper;
import com.amazon.alexa.avs.message.response.AlexaExceptionResponse;
import com.amazon.alexa.avs.message.response.Directive;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.Expose;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Message {
    private static final String TAG = LogHelper.makeLogTag(Message.class);
    public Header header;
    public Payload payload;

    @Expose(serialize = false)
    public String rawMessage;

    public static class MessageJsonDeserializer implements JsonDeserializer<Message> {
        private Message createMessage(Header header, JsonObject jsonObject, String str) throws JsonParseException, IOException {
            return ("System".equals(header.getNamespace()) && AVSAPIConstants.System.Exception.NAME.equals(header.getName())) ? new AlexaExceptionResponse(header, jsonObject, str) : new Directive(header, jsonObject, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Message deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            String string = asJsonObject.toString();
            LogHelper.d(Message.TAG, "rawMessage: " + string);
            DialogRequestIdHeader dialogRequestIdHeader = null;
            JsonObject asJsonObject2 = null;
            for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                if ("header".equals(entry.getKey())) {
                    dialogRequestIdHeader = (DialogRequestIdHeader) jsonDeserializationContext.deserialize(entry.getValue(), DialogRequestIdHeader.class);
                }
                if ("payload".equals(entry.getKey())) {
                    asJsonObject2 = entry.getValue().getAsJsonObject();
                }
            }
            try {
                return createMessage(dialogRequestIdHeader, asJsonObject2, string);
            } catch (IOException e) {
                LogHelper.e(Message.TAG, "", e);
                return null;
            }
        }
    }

    public static class MessageWrapper {
        public Message message;

        public static GsonBuilder getMessageBuilder() {
            return new GsonBuilder().registerTypeAdapter(Message.class, new MessageJsonDeserializer());
        }

        public Message getMessage() {
            return this.message;
        }
    }

    public Message(Header header, JsonObject jsonObject, String str) throws IOException {
        this.header = header;
        try {
            this.payload = (Payload) new Gson().fromJson((JsonElement) jsonObject, (Class) Class.forName(getClass().getPackage().getName() + "." + header.getNamespace().toLowerCase() + "." + header.getName()));
        } catch (ClassNotFoundException unused) {
            this.payload = new Payload();
        }
        this.rawMessage = str;
    }

    public Header getHeader() {
        return this.header;
    }

    public String getName() {
        return this.header.getName();
    }

    public String getNamespace() {
        return this.header.getNamespace();
    }

    public Payload getPayload() {
        return this.payload;
    }

    public String getRawMessage() {
        return this.rawMessage;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public String toString() {
        return this.header.toString();
    }

    public Message(Header header, Payload payload, String str) {
        this.header = header;
        this.payload = payload;
        this.rawMessage = str;
    }
}

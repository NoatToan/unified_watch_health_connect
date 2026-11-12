package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import defpackage.c4h;
import defpackage.esd;
import defpackage.mj1;
import defpackage.q4q;
import defpackage.r92;
import defpackage.y1h;
import defpackage.zsd;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class JsonNodeDeserializer extends r92<zsd> {
    private static final JsonNodeDeserializer instance = new JsonNodeDeserializer();

    public static final class a extends r92<mj1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f7650a = new a();
        private static final long serialVersionUID = 1;

        public a() {
            super(mj1.class, Boolean.TRUE);
        }

        public static a c() {
            return f7650a;
        }

        @Override // defpackage.esd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public mj1 deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.B0() ? deserializeArray(jsonParser, deserializationContext, deserializationContext.getNodeFactory()) : (mj1) deserializationContext.handleUnexpectedToken(mj1.class, jsonParser);
        }

        @Override // defpackage.esd
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public mj1 deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, mj1 mj1Var) throws IOException {
            return jsonParser.B0() ? (mj1) updateArray(jsonParser, deserializationContext, mj1Var) : (mj1) deserializationContext.handleUnexpectedToken(mj1.class, jsonParser);
        }
    }

    public static final class b extends r92<c4h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f7651a = new b();
        private static final long serialVersionUID = 1;

        public b() {
            super(c4h.class, Boolean.TRUE);
        }

        public static b c() {
            return f7651a;
        }

        @Override // defpackage.esd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c4h deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.C0()) {
                return deserializeObject(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            }
            if (jsonParser.y0(JsonToken.FIELD_NAME)) {
                return deserializeObjectAtName(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            }
            return jsonParser.y0(JsonToken.END_OBJECT) ? deserializationContext.getNodeFactory().objectNode() : (c4h) deserializationContext.handleUnexpectedToken(c4h.class, jsonParser);
        }

        @Override // defpackage.esd
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c4h deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, c4h c4hVar) throws IOException {
            return (jsonParser.C0() || jsonParser.y0(JsonToken.FIELD_NAME)) ? (c4h) updateObject(jsonParser, deserializationContext, c4hVar) : (c4h) deserializationContext.handleUnexpectedToken(c4h.class, jsonParser);
        }
    }

    public JsonNodeDeserializer() {
        super(zsd.class, null);
    }

    public static esd<? extends zsd> getDeserializer(Class<?> cls) {
        if (cls == c4h.class) {
            return b.c();
        }
        return cls == mj1.class ? a.c() : instance;
    }

    @Override // defpackage.r92, com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public /* bridge */ /* synthetic */ Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return super.deserializeWithType(jsonParser, deserializationContext, q4qVar);
    }

    @Override // defpackage.r92, defpackage.esd
    public /* bridge */ /* synthetic */ boolean isCachable() {
        return super.isCachable();
    }

    @Override // defpackage.r92, defpackage.esd
    public /* bridge */ /* synthetic */ Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return super.supportsUpdate(deserializationConfig);
    }

    @Override // defpackage.esd
    public zsd deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int iM = jsonParser.M();
        if (iM != 1) {
            return iM != 3 ? deserializeAny(jsonParser, deserializationContext, deserializationContext.getNodeFactory()) : deserializeArray(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
        }
        return deserializeObject(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
    }

    @Override // defpackage.esd, defpackage.z1h
    public zsd getNullValue(DeserializationContext deserializationContext) {
        return y1h.V();
    }
}

package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ProtobufEncoder {
    private final Map<Class<?>, ObjectEncoder<?>> a;
    private final Map<Class<?>, ValueEncoder<?>> b;
    private final ObjectEncoder<Object> c;

    public ProtobufEncoder(Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.a = map;
        this.b = map2;
        this.c = objectEncoder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void encode(@NonNull Object obj, @NonNull OutputStream outputStream) throws IOException {
        new c(outputStream, this.a, this.b, this.c).o(obj);
    }

    public static final class Builder implements EncoderConfig<Builder> {
        private static final ObjectEncoder<Object> d = new ObjectEncoder() { // from class: y46
            @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
            public final void a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
                ProtobufEncoder.Builder.b(obj, objectEncoderContext);
            }
        };
        private final Map<Class<?>, ObjectEncoder<?>> a = new HashMap();
        private final Map<Class<?>, ValueEncoder<?>> b = new HashMap();
        private ObjectEncoder<Object> c = d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public ProtobufEncoder build() {
            return new ProtobufEncoder(new HashMap(this.a), new HashMap(this.b), this.c);
        }

        @NonNull
        public Builder configureWith(@NonNull Configurator configurator) {
            configurator.configure(this);
            return this;
        }

        @NonNull
        public Builder registerFallbackEncoder(@NonNull ObjectEncoder<Object> objectEncoder) {
            this.c = objectEncoder;
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @NonNull
        public <U> Builder registerEncoder(@NonNull Class<U> cls, @NonNull ObjectEncoder<? super U> objectEncoder) {
            this.a.put(cls, objectEncoder);
            this.b.remove(cls);
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @NonNull
        public <U> Builder registerEncoder(@NonNull Class<U> cls, @NonNull ValueEncoder<? super U> valueEncoder) {
            this.b.put(cls, valueEncoder);
            this.a.remove(cls);
            return this;
        }
    }

    @NonNull
    public byte[] encode(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encode(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}

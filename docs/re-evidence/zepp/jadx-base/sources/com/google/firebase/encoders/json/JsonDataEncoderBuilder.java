package com.google.firebase.encoders.json;

import androidx.annotation.NonNull;
import com.google.android.material.datepicker.UtcDates;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {
    private static final ObjectEncoder<Object> e = new ObjectEncoder() { // from class: hk4
        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        public final void a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            JsonDataEncoderBuilder.h(obj, objectEncoderContext);
        }
    };
    private static final ValueEncoder<String> f = new ValueEncoder() { // from class: jk4
        @Override // com.google.firebase.encoders.ValueEncoder, com.google.firebase.encoders.a
        public final void a(Object obj, ValueEncoderContext valueEncoderContext) throws IOException {
            valueEncoderContext.add((String) obj);
        }
    };
    private static final ValueEncoder<Boolean> g = new ValueEncoder() { // from class: ik4
        @Override // com.google.firebase.encoders.ValueEncoder, com.google.firebase.encoders.a
        public final void a(Object obj, ValueEncoderContext valueEncoderContext) throws IOException {
            JsonDataEncoderBuilder.j((Boolean) obj, valueEncoderContext);
        }
    };
    private static final b h = new b(null);
    private final Map<Class<?>, ObjectEncoder<?>> a = new HashMap();
    private final Map<Class<?>, ValueEncoder<?>> b = new HashMap();
    private ObjectEncoder<Object> c = e;
    private boolean d = false;

    public static final class b implements ValueEncoder<Date> {
        private static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
        }

        private b() {
        }

        @Override // com.google.firebase.encoders.ValueEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull Date date, @NonNull ValueEncoderContext valueEncoderContext) throws IOException {
            valueEncoderContext.add(a.format(date));
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public JsonDataEncoderBuilder() {
        registerEncoder(String.class, (ValueEncoder) f);
        registerEncoder(Boolean.class, (ValueEncoder) g);
        registerEncoder(Date.class, (ValueEncoder) h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(Boolean bool, ValueEncoderContext valueEncoderContext) throws IOException {
        valueEncoderContext.add(bool.booleanValue());
    }

    @NonNull
    public DataEncoder build() {
        return new a();
    }

    @NonNull
    public JsonDataEncoderBuilder configureWith(@NonNull Configurator configurator) {
        configurator.configure(this);
        return this;
    }

    @NonNull
    public JsonDataEncoderBuilder ignoreNullValues(boolean z) {
        this.d = z;
        return this;
    }

    @NonNull
    public JsonDataEncoderBuilder registerFallbackEncoder(@NonNull ObjectEncoder<Object> objectEncoder) {
        this.c = objectEncoder;
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public <T> JsonDataEncoderBuilder registerEncoder(@NonNull Class<T> cls, @NonNull ObjectEncoder<? super T> objectEncoder) {
        this.a.put(cls, objectEncoder);
        this.b.remove(cls);
        return this;
    }

    public class a implements DataEncoder {
        public a() {
        }

        @Override // com.google.firebase.encoders.DataEncoder
        public void encode(@NonNull Object obj, @NonNull Writer writer) throws IOException {
            com.google.firebase.encoders.json.a aVar = new com.google.firebase.encoders.json.a(writer, JsonDataEncoderBuilder.this.a, JsonDataEncoderBuilder.this.b, JsonDataEncoderBuilder.this.c, JsonDataEncoderBuilder.this.d);
            aVar.e(obj, false);
            aVar.o();
        }

        @Override // com.google.firebase.encoders.DataEncoder
        public String encode(@NonNull Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                encode(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public <T> JsonDataEncoderBuilder registerEncoder(@NonNull Class<T> cls, @NonNull ValueEncoder<? super T> valueEncoder) {
        this.b.put(cls, valueEncoder);
        this.a.remove(cls);
        return this;
    }
}

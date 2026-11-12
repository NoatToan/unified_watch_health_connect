package defpackage;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes21.dex */
public class yn implements Versioned, Serializable {
    protected static final PrettyPrinter d = new ya();
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final yt f53641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JsonFactory f53642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f53643c;
    protected final a e;
    protected final SerializerFactory f;
    protected final DefaultSerializerProvider h;

    public yn(ObjectMapper objectMapper, yt ytVar) {
        this.f53641a = ytVar;
        this.h = objectMapper.l;
        this.f = objectMapper.m;
        this.f53642b = objectMapper.j;
        this.f53643c = c.f53646c;
        this.e = a.f53644a;
    }

    protected yn(yn ynVar, yt ytVar, c cVar, a aVar) {
        this.f53641a = ytVar;
        this.h = ynVar.h;
        this.f = ynVar.f;
        this.f53642b = ynVar.f53642b;
        this.f53643c = cVar;
        this.e = aVar;
    }

    protected yn(yn ynVar, yt ytVar) {
        this.f53641a = ytVar;
        this.h = ynVar.h;
        this.f = ynVar.f;
        this.f53642b = ynVar.f53642b;
        this.f53643c = ynVar.f53643c;
        this.e = ynVar.e;
    }

    @Override // com.fasterxml.jackson.core.Versioned
    public wu version() {
        return za.e;
    }

    protected yn e(yn ynVar, yt ytVar) {
        return ytVar == this.f53641a ? this : new yn(ynVar, ytVar);
    }

    protected yn d(c cVar, a aVar) {
        return (this.f53643c == cVar && this.e == aVar) ? this : new yn(this, this.f53641a, cVar, aVar);
    }

    public yn b(JsonGenerator.Feature feature) {
        return e(this, this.f53641a.e(feature));
    }

    public yn b() {
        return c(this.f53641a.b());
    }

    public yn c(PrettyPrinter prettyPrinter) {
        return d(this.f53643c.b(prettyPrinter), this.e);
    }

    public JsonGenerator e(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        a("out", outputStream);
        return e(this.f53642b.createGenerator(outputStream, jsonEncoding));
    }

    public JsonGenerator e(Writer writer) throws IOException {
        a("w", writer);
        return e(this.f53642b.createGenerator(writer));
    }

    public void c(OutputStream outputStream, Object obj) throws IOException {
        d(e(outputStream, JsonEncoding.UTF8), obj);
    }

    public String c(Object obj) throws wr {
        xf xfVar = new xf(this.f53642b.d());
        try {
            d(e(xfVar), obj);
            return xfVar.d();
        } catch (wr e) {
            throw e;
        } catch (IOException e2) {
            throw ym.fromUnexpectedIOE(e2);
        }
    }

    protected DefaultSerializerProvider d() {
        return this.h.createInstance(this.f53641a, this.f);
    }

    protected final void d(JsonGenerator jsonGenerator, Object obj) throws IOException {
        if (this.f53641a.a(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            b(jsonGenerator, obj);
            return;
        }
        try {
            this.e.a(jsonGenerator, obj, d());
            jsonGenerator.close();
        } catch (Exception e) {
            ahw.b(jsonGenerator, e);
        }
    }

    private final void b(JsonGenerator jsonGenerator, Object obj) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            this.e.a(jsonGenerator, obj, d());
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e) {
                e = e;
                closeable = null;
                ahw.c(jsonGenerator, closeable, e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    protected final JsonGenerator e(JsonGenerator jsonGenerator) {
        this.f53641a.b(jsonGenerator);
        this.f53643c.d(jsonGenerator);
        return jsonGenerator;
    }

    protected final void a(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }

    public static final class c implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f53646c = new c(null, null, null, null);
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FormatSchema f53647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PrettyPrinter f53648b;
        public final CharacterEscapes d;
        public final SerializableString e;

        public c(PrettyPrinter prettyPrinter, FormatSchema formatSchema, CharacterEscapes characterEscapes, SerializableString serializableString) {
            this.f53648b = prettyPrinter;
            this.f53647a = formatSchema;
            this.d = characterEscapes;
            this.e = serializableString;
        }

        public c b(PrettyPrinter prettyPrinter) {
            if (prettyPrinter == null) {
                prettyPrinter = yn.d;
            }
            return prettyPrinter == this.f53648b ? this : new c(prettyPrinter, this.f53647a, this.d, this.e);
        }

        public void d(JsonGenerator jsonGenerator) {
            PrettyPrinter prettyPrinter = this.f53648b;
            if (prettyPrinter != null) {
                if (prettyPrinter == yn.d) {
                    jsonGenerator.setPrettyPrinter(null);
                } else {
                    if (prettyPrinter instanceof Instantiatable) {
                        prettyPrinter = (PrettyPrinter) ((Instantiatable) prettyPrinter).createInstance();
                    }
                    jsonGenerator.setPrettyPrinter(prettyPrinter);
                }
            }
            CharacterEscapes characterEscapes = this.d;
            if (characterEscapes != null) {
                jsonGenerator.setCharacterEscapes(characterEscapes);
            }
            FormatSchema formatSchema = this.f53647a;
            if (formatSchema != null) {
                jsonGenerator.setSchema(formatSchema);
            }
            SerializableString serializableString = this.e;
            if (serializableString != null) {
                jsonGenerator.setRootValueSeparator(serializableString);
            }
        }
    }

    public static final class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f53644a = new a(null, null, null);
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final JsonSerializer<Object> f53645c;
        private final TypeSerializer d;
        private final JavaType e;

        private a(JavaType javaType, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer) {
            this.e = javaType;
            this.f53645c = jsonSerializer;
            this.d = typeSerializer;
        }

        public void a(JsonGenerator jsonGenerator, Object obj, DefaultSerializerProvider defaultSerializerProvider) throws IOException {
            TypeSerializer typeSerializer = this.d;
            if (typeSerializer != null) {
                defaultSerializerProvider.serializePolymorphic(jsonGenerator, obj, this.e, this.f53645c, typeSerializer);
                return;
            }
            JsonSerializer<Object> jsonSerializer = this.f53645c;
            if (jsonSerializer != null) {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj, this.e, jsonSerializer);
                return;
            }
            JavaType javaType = this.e;
            if (javaType != null) {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj, javaType);
            } else {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj);
            }
        }
    }
}

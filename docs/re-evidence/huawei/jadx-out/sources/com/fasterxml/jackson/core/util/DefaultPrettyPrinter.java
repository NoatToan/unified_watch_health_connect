package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import defpackage.xb;
import defpackage.xz;
import defpackage.yf;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class DefaultPrettyPrinter implements PrettyPrinter, Instantiatable<DefaultPrettyPrinter>, Serializable {
    public static final xb e = new xb(" ");
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected transient int f4084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f4085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Indenter f4086c;
    protected Indenter d;
    protected final SerializableString g;
    protected boolean h;
    protected yf i;

    public interface Indenter {
        boolean isInline();

        void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException;
    }

    public static class a implements Indenter, Serializable {
        public static final a e = new a();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
        public boolean isInline() {
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
        public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException {
        }
    }

    public DefaultPrettyPrinter() {
        this(e);
    }

    public DefaultPrettyPrinter(SerializableString serializableString) {
        this.f4086c = d.f4087a;
        this.d = xz.f53316b;
        this.h = true;
        this.g = serializableString;
        a(DEFAULT_SEPARATORS);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter) {
        this(defaultPrettyPrinter, defaultPrettyPrinter.g);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter, SerializableString serializableString) {
        this.f4086c = d.f4087a;
        this.d = xz.f53316b;
        this.h = true;
        this.f4086c = defaultPrettyPrinter.f4086c;
        this.d = defaultPrettyPrinter.d;
        this.h = defaultPrettyPrinter.h;
        this.f4084a = defaultPrettyPrinter.f4084a;
        this.i = defaultPrettyPrinter.i;
        this.f4085b = defaultPrettyPrinter.f4085b;
        this.g = serializableString;
    }

    public DefaultPrettyPrinter a(yf yfVar) {
        this.i = yfVar;
        this.f4085b = " " + yfVar.a() + " ";
        return this;
    }

    @Override // com.fasterxml.jackson.core.util.Instantiatable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public DefaultPrettyPrinter createInstance() {
        if (getClass() != DefaultPrettyPrinter.class) {
            throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
        }
        return new DefaultPrettyPrinter(this);
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        SerializableString serializableString = this.g;
        if (serializableString != null) {
            jsonGenerator.writeRaw(serializableString);
        }
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw('{');
        if (this.d.isInline()) {
            return;
        }
        this.f4084a++;
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
        this.d.writeIndentation(jsonGenerator, this.f4084a);
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        if (this.h) {
            jsonGenerator.writeRaw(this.f4085b);
        } else {
            jsonGenerator.writeRaw(this.i.a());
        }
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw(this.i.c());
        this.d.writeIndentation(jsonGenerator, this.f4084a);
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException {
        if (!this.d.isInline()) {
            this.f4084a--;
        }
        if (i > 0) {
            this.d.writeIndentation(jsonGenerator, this.f4084a);
        } else {
            jsonGenerator.writeRaw(' ');
        }
        jsonGenerator.writeRaw('}');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        if (!this.f4086c.isInline()) {
            this.f4084a++;
        }
        jsonGenerator.writeRaw('[');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
        this.f4086c.writeIndentation(jsonGenerator, this.f4084a);
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw(this.i.d());
        this.f4086c.writeIndentation(jsonGenerator, this.f4084a);
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException {
        if (!this.f4086c.isInline()) {
            this.f4084a--;
        }
        if (i > 0) {
            this.f4086c.writeIndentation(jsonGenerator, this.f4084a);
        } else {
            jsonGenerator.writeRaw(' ');
        }
        jsonGenerator.writeRaw(']');
    }

    public static class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f4087a = new d();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.a, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
        public boolean isInline() {
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.a, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
        public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException {
            jsonGenerator.writeRaw(' ');
        }
    }
}

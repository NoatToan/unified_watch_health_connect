package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class ya implements PrettyPrinter, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f53319a;
    protected yf e;

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
    }

    public ya() {
        this(DEFAULT_ROOT_VALUE_SEPARATOR.toString());
    }

    public ya(String str) {
        this.f53319a = str;
        this.e = DEFAULT_SEPARATORS;
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        String str = this.f53319a;
        if (str != null) {
            jsonGenerator.writeRaw(str);
        }
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw('{');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw(this.e.a());
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw(this.e.c());
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.writeRaw('}');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw('[');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw(this.e.d());
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.writeRaw(']');
    }
}

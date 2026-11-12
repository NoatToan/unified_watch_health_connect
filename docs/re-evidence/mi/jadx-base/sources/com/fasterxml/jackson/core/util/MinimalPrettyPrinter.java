package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import defpackage.r7i;
import java.io.IOException;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class MinimalPrettyPrinter implements r7i, Serializable {
    private static final long serialVersionUID = 1;
    protected String _rootValueSeparator;
    protected Separators _separators;

    public MinimalPrettyPrinter() {
        this(r7i.f9.toString());
    }

    @Override // defpackage.r7i
    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
    }

    @Override // defpackage.r7i
    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
    }

    public void setRootValueSeparator(String str) {
        this._rootValueSeparator = str;
    }

    public MinimalPrettyPrinter setSeparators(Separators separators) {
        this._separators = separators;
        return this;
    }

    @Override // defpackage.r7i
    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.F0(this._separators.getArrayValueSeparator());
    }

    @Override // defpackage.r7i
    public void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.F0(AbstractJsonLexerKt.END_LIST);
    }

    @Override // defpackage.r7i
    public void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.F0(AbstractJsonLexerKt.END_OBJ);
    }

    @Override // defpackage.r7i
    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.F0(this._separators.getObjectEntrySeparator());
    }

    @Override // defpackage.r7i
    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.F0(this._separators.getObjectFieldValueSeparator());
    }

    @Override // defpackage.r7i
    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        String str = this._rootValueSeparator;
        if (str != null) {
            jsonGenerator.H0(str);
        }
    }

    @Override // defpackage.r7i
    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.F0(AbstractJsonLexerKt.BEGIN_LIST);
    }

    @Override // defpackage.r7i
    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.F0(AbstractJsonLexerKt.BEGIN_OBJ);
    }

    public MinimalPrettyPrinter(String str) {
        this._rootValueSeparator = str;
        this._separators = r7i.e9;
    }
}

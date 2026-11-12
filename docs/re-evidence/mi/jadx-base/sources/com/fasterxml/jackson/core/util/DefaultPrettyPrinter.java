package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import defpackage.ccd;
import defpackage.owl;
import defpackage.r7i;
import java.io.IOException;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultPrettyPrinter implements r7i, ccd<DefaultPrettyPrinter>, Serializable {
    public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
    private static final long serialVersionUID = 1;
    protected a _arrayIndenter;
    protected transient int _nesting;
    protected String _objectFieldValueSeparatorWithSpaces;
    protected a _objectIndenter;
    protected final owl _rootSeparator;
    protected Separators _separators;
    protected boolean _spacesInObjectEntries;

    public static class FixedSpaceIndenter extends NopIndenter {
        public static final FixedSpaceIndenter instance = new FixedSpaceIndenter();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.a
        public boolean isInline() {
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.a
        public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException {
            jsonGenerator.F0(' ');
        }
    }

    public static class NopIndenter implements a, Serializable {
        public static final NopIndenter instance = new NopIndenter();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.a
        public boolean isInline() {
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.a
        public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException {
        }
    }

    public interface a {
        boolean isInline();

        void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException;
    }

    public DefaultPrettyPrinter() {
        this(DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    public DefaultPrettyPrinter _withSpaces(boolean z) {
        if (this._spacesInObjectEntries == z) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._spacesInObjectEntries = z;
        return defaultPrettyPrinter;
    }

    @Override // defpackage.r7i
    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // defpackage.r7i
    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void indentArraysWith(a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        this._arrayIndenter = aVar;
    }

    public void indentObjectsWith(a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        this._objectIndenter = aVar;
    }

    public DefaultPrettyPrinter withArrayIndenter(a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        if (this._arrayIndenter == aVar) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._arrayIndenter = aVar;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withObjectIndenter(a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        if (this._objectIndenter == aVar) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._objectIndenter = aVar;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withRootSeparator(owl owlVar) {
        owl owlVar2 = this._rootSeparator;
        return (owlVar2 == owlVar || (owlVar != null && owlVar.equals(owlVar2))) ? this : new DefaultPrettyPrinter(this, owlVar);
    }

    public DefaultPrettyPrinter withSeparators(Separators separators) {
        this._separators = separators;
        this._objectFieldValueSeparatorWithSpaces = " " + separators.getObjectFieldValueSeparator() + " ";
        return this;
    }

    public DefaultPrettyPrinter withSpacesInObjectEntries() {
        return _withSpaces(true);
    }

    public DefaultPrettyPrinter withoutSpacesInObjectEntries() {
        return _withSpaces(false);
    }

    @Override // defpackage.r7i
    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.F0(this._separators.getArrayValueSeparator());
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // defpackage.r7i
    public void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.F0(' ');
        }
        jsonGenerator.F0(AbstractJsonLexerKt.END_LIST);
    }

    @Override // defpackage.r7i
    public void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException {
        if (!this._objectIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.F0(' ');
        }
        jsonGenerator.F0(AbstractJsonLexerKt.END_OBJ);
    }

    @Override // defpackage.r7i
    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.F0(this._separators.getObjectEntrySeparator());
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // defpackage.r7i
    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        if (this._spacesInObjectEntries) {
            jsonGenerator.H0(this._objectFieldValueSeparatorWithSpaces);
        } else {
            jsonGenerator.F0(this._separators.getObjectFieldValueSeparator());
        }
    }

    @Override // defpackage.r7i
    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        owl owlVar = this._rootSeparator;
        if (owlVar != null) {
            jsonGenerator.G0(owlVar);
        }
    }

    @Override // defpackage.r7i
    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting++;
        }
        jsonGenerator.F0(AbstractJsonLexerKt.BEGIN_LIST);
    }

    @Override // defpackage.r7i
    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.F0(AbstractJsonLexerKt.BEGIN_OBJ);
        if (this._objectIndenter.isInline()) {
            return;
        }
        this._nesting++;
    }

    public DefaultPrettyPrinter(String str) {
        this(str == null ? null : new SerializedString(str));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.ccd
    public DefaultPrettyPrinter createInstance() {
        return new DefaultPrettyPrinter(this);
    }

    public DefaultPrettyPrinter(owl owlVar) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._rootSeparator = owlVar;
        withSeparators(r7i.e9);
    }

    public DefaultPrettyPrinter withRootSeparator(String str) {
        return withRootSeparator(str == null ? null : new SerializedString(str));
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter) {
        this(defaultPrettyPrinter, defaultPrettyPrinter._rootSeparator);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter, owl owlVar) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        this._objectIndenter = defaultPrettyPrinter._objectIndenter;
        this._spacesInObjectEntries = defaultPrettyPrinter._spacesInObjectEntries;
        this._nesting = defaultPrettyPrinter._nesting;
        this._separators = defaultPrettyPrinter._separators;
        this._objectFieldValueSeparatorWithSpaces = defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces;
        this._rootSeparator = owlVar;
    }
}

package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class msd extends yxa {
    public static final int[] n = xt3.e();
    public final xuc h;
    public int[] i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharacterEscapes f27156k;
    public owl l;
    public boolean m;

    public msd(xuc xucVar, int i, v3h v3hVar) {
        super(i, v3hVar);
        this.i = n;
        this.l = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        this.h = xucVar;
        if (JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i)) {
            this.j = 127;
        }
        this.m = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator K(CharacterEscapes characterEscapes) {
        this.f27156k = characterEscapes;
        if (characterEscapes == null) {
            this.i = n;
        } else {
            this.i = characterEscapes.getEscapeCodesForAscii();
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator O(int i) {
        if (i < 0) {
            i = 0;
        }
        this.j = i;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator Q(owl owlVar) {
        this.l = owlVar;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void S0(String str, String str2) throws IOException {
        r0(str);
        Q0(str2);
    }

    @Override // defpackage.yxa
    public void X0(int i, int i2) {
        super.X0(i, i2);
        this.m = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i);
    }

    public void b1(String str) throws IOException {
        a(String.format("Can not %s, expecting field name (context: %s)", str, this.e.j()));
    }

    public void c1(String str, int i) throws IOException {
        if (i == 0) {
            if (this.e.f()) {
                this.f7619a.beforeArrayValues(this);
                return;
            } else {
                if (this.e.g()) {
                    this.f7619a.beforeObjectEntries(this);
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            this.f7619a.writeArrayValueSeparator(this);
            return;
        }
        if (i == 2) {
            this.f7619a.writeObjectFieldValueSeparator(this);
            return;
        }
        if (i == 3) {
            this.f7619a.writeRootValueSeparator(this);
        } else if (i != 5) {
            b();
        } else {
            b1(str);
        }
    }

    @Override // defpackage.yxa, com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator p(JsonGenerator.Feature feature) {
        super.p(feature);
        if (feature == JsonGenerator.Feature.QUOTE_FIELD_NAMES) {
            this.m = true;
        }
        return this;
    }
}

package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.math.BigDecimal;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yxa extends JsonGenerator {
    public static final int g = (JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v3h f40661b;
    public int c;
    public boolean d;
    public xud e;
    public boolean f;

    public yxa(int i, v3h v3hVar) {
        this.c = i;
        this.f40661b = v3hVar;
        this.e = xud.o(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? q67.e(this) : null);
        this.d = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void B0(Object obj) throws IOException {
        if (obj == null) {
            s0();
            return;
        }
        v3h v3hVar = this.f40661b;
        if (v3hVar != null) {
            v3hVar.writeValue(this, obj);
        } else {
            d(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator J(int i, int i2) {
        int i3 = this.c;
        int i4 = (i & i2) | ((~i2) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this.c = i4;
            X0(i4, i5);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void J0(owl owlVar) throws IOException {
        Z0("write raw value");
        G0(owlVar);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void K0(String str) throws IOException {
        Z0("write raw value");
        H0(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void M(Object obj) {
        this.e.i(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    @Deprecated
    public JsonGenerator N(int i) {
        int i2 = this.c ^ i;
        this.c = i;
        if (i2 != 0) {
            X0(i, i2);
        }
        return this;
    }

    public String W0(BigDecimal bigDecimal) throws IOException {
        if (!JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this.c)) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale < -9999 || iScale > 9999) {
            a(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        }
        return bigDecimal.toPlainString();
    }

    public void X0(int i, int i2) {
        if ((g & i2) == 0) {
            return;
        }
        this.d = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
        JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
        if (feature.enabledIn(i2)) {
            if (feature.enabledIn(i)) {
                O(127);
            } else {
                O(0);
            }
        }
        JsonGenerator.Feature feature2 = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
        if (feature2.enabledIn(i2)) {
            if (!feature2.enabledIn(i)) {
                this.e = this.e.s(null);
            } else if (this.e.p() == null) {
                this.e = this.e.s(q67.e(this));
            }
        }
    }

    public final int Y0(int i, int i2) throws IOException {
        if (i2 < 56320 || i2 > 57343) {
            a("Incomplete surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2));
        }
        return ((i - 55296) << 10) + 65536 + (i2 - Utf8.LOG_SURROGATE_HEADER);
    }

    public abstract void Z0(String str) throws IOException;

    public final boolean a1(JsonGenerator.Feature feature) {
        return (feature.getMask() & this.c) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator p(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this.c &= ~mask;
        if ((mask & g) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this.d = false;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                O(0);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                this.e = this.e.s(null);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int s() {
        return this.c;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public fud y() {
        return this.e;
    }
}

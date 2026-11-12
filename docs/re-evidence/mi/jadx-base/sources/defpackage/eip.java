package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class eip extends fud {
    public final eip c;
    public eip d;
    public String e;
    public dip f;
    public boolean g;
    public boolean h;

    public eip(int i, eip eipVar, dip dipVar, boolean z) {
        this.f18247a = i;
        this.c = eipVar;
        this.f = dipVar;
        this.f18248b = -1;
        this.g = z;
        this.h = false;
    }

    public static eip o(dip dipVar) {
        return new eip(0, null, dipVar, true);
    }

    @Override // defpackage.fud
    public final String b() {
        return this.e;
    }

    @Override // defpackage.fud
    public Object c() {
        return null;
    }

    @Override // defpackage.fud
    public void i(Object obj) {
    }

    public void k(StringBuilder sb) {
        eip eipVar = this.c;
        if (eipVar != null) {
            eipVar.k(sb);
        }
        int i = this.f18247a;
        if (i != 2) {
            if (i != 1) {
                sb.append("/");
                return;
            }
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(a());
            sb.append(AbstractJsonLexerKt.END_LIST);
            return;
        }
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        if (this.e != null) {
            sb.append('\"');
            sb.append(this.e);
            sb.append('\"');
        } else {
            sb.append('?');
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
    }

    public dip l(dip dipVar) {
        int i = this.f18247a;
        if (i == 2) {
            return dipVar;
        }
        int i2 = this.f18248b + 1;
        this.f18248b = i2;
        return i == 1 ? dipVar.e(i2) : dipVar.g(i2);
    }

    public eip m(dip dipVar, boolean z) {
        eip eipVar = this.d;
        if (eipVar != null) {
            return eipVar.u(1, dipVar, z);
        }
        eip eipVar2 = new eip(1, this, dipVar, z);
        this.d = eipVar2;
        return eipVar2;
    }

    public eip n(dip dipVar, boolean z) {
        eip eipVar = this.d;
        if (eipVar != null) {
            return eipVar.u(2, dipVar, z);
        }
        eip eipVar2 = new eip(2, this, dipVar, z);
        this.d = eipVar2;
        return eipVar2;
    }

    public eip p(eip eipVar) {
        eip eipVar2 = this.c;
        if (eipVar2 == eipVar) {
            return this;
        }
        while (eipVar2 != null) {
            eip eipVar3 = eipVar2.c;
            if (eipVar3 == eipVar) {
                return eipVar2;
            }
            eipVar2 = eipVar3;
        }
        return null;
    }

    public dip q() {
        return this.f;
    }

    @Override // defpackage.fud
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final eip e() {
        return this.c;
    }

    public boolean s() {
        return this.g;
    }

    public JsonToken t() {
        if (!this.g) {
            this.g = true;
            return this.f18247a == 2 ? JsonToken.START_OBJECT : JsonToken.START_ARRAY;
        }
        if (!this.h || this.f18247a != 2) {
            return null;
        }
        this.h = false;
        return JsonToken.FIELD_NAME;
    }

    @Override // defpackage.fud
    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        k(sb);
        return sb.toString();
    }

    public eip u(int i, dip dipVar, boolean z) {
        this.f18247a = i;
        this.f = dipVar;
        this.f18248b = -1;
        this.e = null;
        this.g = z;
        this.h = false;
        return this;
    }

    public dip v(String str) throws JsonProcessingException {
        this.e = str;
        this.h = true;
        return this.f;
    }
}

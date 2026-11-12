package defpackage;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.filter.TokenFilter;

/* JADX INFO: loaded from: classes21.dex */
public class ws extends JsonStreamContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f52390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ws f52391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f52392c;
    protected final ws d;
    protected TokenFilter e;
    protected boolean j;

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public Object getCurrentValue() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public void setCurrentValue(Object obj) {
    }

    protected ws(int i, ws wsVar, TokenFilter tokenFilter, boolean z) {
        this._type = i;
        this.d = wsVar;
        this.e = tokenFilter;
        this._index = -1;
        this.j = z;
        this.f52392c = false;
    }

    protected ws e(int i, TokenFilter tokenFilter, boolean z) {
        this._type = i;
        this.e = tokenFilter;
        this._index = -1;
        this.f52390a = null;
        this.j = z;
        this.f52392c = false;
        return this;
    }

    public static ws a(TokenFilter tokenFilter) {
        return new ws(0, null, tokenFilter, true);
    }

    public ws d(TokenFilter tokenFilter, boolean z) {
        ws wsVar = this.f52391b;
        if (wsVar == null) {
            ws wsVar2 = new ws(1, this, tokenFilter, z);
            this.f52391b = wsVar2;
            return wsVar2;
        }
        return wsVar.e(1, tokenFilter, z);
    }

    public ws c(TokenFilter tokenFilter, boolean z) {
        ws wsVar = this.f52391b;
        if (wsVar == null) {
            ws wsVar2 = new ws(2, this, tokenFilter, z);
            this.f52391b = wsVar2;
            return wsVar2;
        }
        return wsVar.e(2, tokenFilter, z);
    }

    public TokenFilter e(String str) throws wr {
        this.f52390a = str;
        this.f52392c = true;
        return this.e;
    }

    public TokenFilter c(TokenFilter tokenFilter) {
        if (this._type == 2) {
            return tokenFilter;
        }
        int i = this._index + 1;
        this._index = i;
        if (this._type == 1) {
            return tokenFilter.c(i);
        }
        return tokenFilter.b(i);
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ws getParent() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final String getCurrentName() {
        return this.f52390a;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public boolean hasCurrentName() {
        return this.f52390a != null;
    }

    public TokenFilter b() {
        return this.e;
    }

    public boolean a() {
        return this.j;
    }

    public JsonToken c() {
        if (!this.j) {
            this.j = true;
            if (this._type == 2) {
                return JsonToken.START_OBJECT;
            }
            return JsonToken.START_ARRAY;
        }
        if (!this.f52392c || this._type != 2) {
            return null;
        }
        this.f52392c = false;
        return JsonToken.FIELD_NAME;
    }

    public ws c(ws wsVar) {
        ws wsVar2 = this.d;
        if (wsVar2 == wsVar) {
            return this;
        }
        while (wsVar2 != null) {
            ws wsVar3 = wsVar2.d;
            if (wsVar3 == wsVar) {
                return wsVar2;
            }
            wsVar2 = wsVar3;
        }
        return null;
    }

    protected void b(StringBuilder sb) {
        ws wsVar = this.d;
        if (wsVar != null) {
            wsVar.b(sb);
        }
        if (this._type == 2) {
            sb.append('{');
            if (this.f52390a != null) {
                sb.append('\"');
                sb.append(this.f52390a);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
            return;
        }
        if (this._type == 1) {
            sb.append('[');
            sb.append(getCurrentIndex());
            sb.append(']');
            return;
        }
        sb.append("/");
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        b(sb);
        return sb.toString();
    }
}

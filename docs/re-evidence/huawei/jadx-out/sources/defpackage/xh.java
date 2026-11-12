package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;

/* JADX INFO: loaded from: classes21.dex */
public final class xh extends JsonStreamContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f52965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Object f52966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected xj f52967c;
    protected xh d;
    protected int e;
    protected final xh h;
    protected int j;

    public xh(xh xhVar, xj xjVar, int i, int i2, int i3) {
        this.h = xhVar;
        this.f52967c = xjVar;
        this._type = i;
        this.j = i2;
        this.e = i3;
        this._index = -1;
    }

    public void b(int i, int i2, int i3) {
        this._type = i;
        this._index = -1;
        this.j = i2;
        this.e = i3;
        this.f52965a = null;
        this.f52966b = null;
        xj xjVar = this.f52967c;
        if (xjVar != null) {
            xjVar.b();
        }
    }

    public xh d(xj xjVar) {
        this.f52967c = xjVar;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public Object getCurrentValue() {
        return this.f52966b;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public void setCurrentValue(Object obj) {
        this.f52966b = obj;
    }

    public static xh a(xj xjVar) {
        return new xh(null, xjVar, 0, 1, 0);
    }

    public xh c(int i, int i2) {
        xh xhVar = this.d;
        if (xhVar == null) {
            xj xjVar = this.f52967c;
            xh xhVar2 = new xh(this, xjVar == null ? null : xjVar.d(), 1, i, i2);
            this.d = xhVar2;
            return xhVar2;
        }
        xhVar.b(1, i, i2);
        return xhVar;
    }

    public xh b(int i, int i2) {
        xh xhVar = this.d;
        if (xhVar == null) {
            xj xjVar = this.f52967c;
            xh xhVar2 = new xh(this, xjVar == null ? null : xjVar.d(), 2, i, i2);
            this.d = xhVar2;
            return xhVar2;
        }
        xhVar.b(2, i, i2);
        return xhVar;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public String getCurrentName() {
        return this.f52965a;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public boolean hasCurrentName() {
        return this.f52965a != null;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xh getParent() {
        return this.h;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public wq getStartLocation(Object obj) {
        return new wq(obj, -1L, this.j, this.e);
    }

    public xh b() {
        this.f52966b = null;
        return this.h;
    }

    public xj c() {
        return this.f52967c;
    }

    public boolean e() {
        int i = this._index + 1;
        this._index = i;
        return this._type != 0 && i > 0;
    }

    public void c(String str) throws wr {
        this.f52965a = str;
        xj xjVar = this.f52967c;
        if (xjVar != null) {
            e(xjVar, str);
        }
    }

    private void e(xj xjVar, String str) throws wr {
        if (xjVar.d(str)) {
            Object objC = xjVar.c();
            throw new wn(objC instanceof JsonParser ? (JsonParser) objC : null, "Duplicate field '" + str + "'");
        }
    }
}

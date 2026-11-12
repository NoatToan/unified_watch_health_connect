package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;

/* JADX INFO: loaded from: classes21.dex */
public class xm extends JsonStreamContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected xj f53154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f53155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Object f53156c;
    protected xm d;
    protected boolean e;
    protected final xm j;

    protected xm(int i, xm xmVar, xj xjVar) {
        this._type = i;
        this.j = xmVar;
        this.f53154a = xjVar;
        this._index = -1;
    }

    protected xm(int i, xm xmVar, xj xjVar, Object obj) {
        this._type = i;
        this.j = xmVar;
        this.f53154a = xjVar;
        this._index = -1;
        this.f53156c = obj;
    }

    public xm e(int i) {
        this._type = i;
        this._index = -1;
        this.f53155b = null;
        this.e = false;
        this.f53156c = null;
        xj xjVar = this.f53154a;
        if (xjVar != null) {
            xjVar.b();
        }
        return this;
    }

    public xm b(int i, Object obj) {
        this._type = i;
        this._index = -1;
        this.f53155b = null;
        this.e = false;
        this.f53156c = obj;
        xj xjVar = this.f53154a;
        if (xjVar != null) {
            xjVar.b();
        }
        return this;
    }

    public xm e(xj xjVar) {
        this.f53154a = xjVar;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public Object getCurrentValue() {
        return this.f53156c;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public void setCurrentValue(Object obj) {
        this.f53156c = obj;
    }

    public static xm d(xj xjVar) {
        return new xm(0, null, xjVar);
    }

    public xm b() {
        xm xmVar = this.d;
        if (xmVar == null) {
            xj xjVar = this.f53154a;
            xm xmVar2 = new xm(1, this, xjVar == null ? null : xjVar.d());
            this.d = xmVar2;
            return xmVar2;
        }
        return xmVar.e(1);
    }

    public xm e(Object obj) {
        xm xmVar = this.d;
        if (xmVar == null) {
            xj xjVar = this.f53154a;
            xm xmVar2 = new xm(1, this, xjVar == null ? null : xjVar.d(), obj);
            this.d = xmVar2;
            return xmVar2;
        }
        return xmVar.b(1, obj);
    }

    public xm a() {
        xm xmVar = this.d;
        if (xmVar == null) {
            xj xjVar = this.f53154a;
            xm xmVar2 = new xm(2, this, xjVar == null ? null : xjVar.d());
            this.d = xmVar2;
            return xmVar2;
        }
        return xmVar.e(2);
    }

    public xm b(Object obj) {
        xm xmVar = this.d;
        if (xmVar == null) {
            xj xjVar = this.f53154a;
            xm xmVar2 = new xm(2, this, xjVar == null ? null : xjVar.d(), obj);
            this.d = xmVar2;
            return xmVar2;
        }
        return xmVar.b(2, obj);
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final xm getParent() {
        return this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final String getCurrentName() {
        return this.f53155b;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public boolean hasCurrentName() {
        return this.f53155b != null;
    }

    public xm e() {
        this.f53156c = null;
        return this.j;
    }

    public xj d() {
        return this.f53154a;
    }

    public int b(String str) throws wr {
        if (this._type != 2 || this.e) {
            return 4;
        }
        this.e = true;
        this.f53155b = str;
        xj xjVar = this.f53154a;
        if (xjVar != null) {
            d(xjVar, str);
        }
        return this._index < 0 ? 0 : 1;
    }

    private final void d(xj xjVar, String str) throws wr {
        if (xjVar.d(str)) {
            Object objC = xjVar.c();
            throw new wp("Duplicate field '" + str + "'", objC instanceof JsonGenerator ? (JsonGenerator) objC : null);
        }
    }

    public int i() {
        if (this._type == 2) {
            if (!this.e) {
                return 5;
            }
            this.e = false;
            this._index++;
            return 2;
        }
        if (this._type == 1) {
            int i = this._index;
            this._index++;
            return i < 0 ? 0 : 1;
        }
        this._index++;
        return this._index == 0 ? 0 : 3;
    }
}

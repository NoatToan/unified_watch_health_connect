package defpackage;

import com.fasterxml.jackson.core.JsonStreamContext;

/* JADX INFO: loaded from: classes21.dex */
public class aij extends JsonStreamContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Object f470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final JsonStreamContext f472c;
    protected final wq d;

    protected aij(JsonStreamContext jsonStreamContext, wq wqVar) {
        super(jsonStreamContext);
        this.f472c = jsonStreamContext.getParent();
        this.f471b = jsonStreamContext.getCurrentName();
        this.f470a = jsonStreamContext.getCurrentValue();
        this.d = wqVar;
    }

    protected aij() {
        super(0, -1);
        this.f472c = null;
        this.d = wq.f52339c;
    }

    protected aij(aij aijVar, int i, int i2) {
        super(i, i2);
        this.f472c = aijVar;
        this.d = aijVar.d;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public Object getCurrentValue() {
        return this.f470a;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public void setCurrentValue(Object obj) {
        this.f470a = obj;
    }

    public static aij d(JsonStreamContext jsonStreamContext) {
        if (jsonStreamContext == null) {
            return new aij();
        }
        return new aij(jsonStreamContext, null);
    }

    public aij a() {
        this._index++;
        return new aij(this, 1, -1);
    }

    public aij b() {
        this._index++;
        return new aij(this, 2, -1);
    }

    public aij e() {
        JsonStreamContext jsonStreamContext = this.f472c;
        if (jsonStreamContext instanceof aij) {
            return (aij) jsonStreamContext;
        }
        if (jsonStreamContext == null) {
            return new aij();
        }
        return new aij(jsonStreamContext, this.d);
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public String getCurrentName() {
        return this.f471b;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public boolean hasCurrentName() {
        return this.f471b != null;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public JsonStreamContext getParent() {
        return this.f472c;
    }

    public void e(String str) throws wr {
        this.f471b = str;
    }

    public void d() {
        this._index++;
    }
}

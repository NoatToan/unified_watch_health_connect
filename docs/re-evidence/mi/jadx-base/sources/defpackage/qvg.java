package defpackage;

import com.fasterxml.jackson.core.JsonToken;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qvg extends fud {
    public final qvg c;
    public String d;
    public Object e;

    public static final class a extends qvg {
        public Iterator<zsd> f;
        public zsd g;

        public a(zsd zsdVar, qvg qvgVar) {
            super(1, qvgVar);
            this.f = zsdVar.u();
        }

        @Override // defpackage.fud
        public /* bridge */ /* synthetic */ fud e() {
            return super.n();
        }

        @Override // defpackage.qvg
        public boolean k() {
            return ((eh4) l()).size() > 0;
        }

        @Override // defpackage.qvg
        public zsd l() {
            return this.g;
        }

        @Override // defpackage.qvg
        public JsonToken m() {
            return JsonToken.END_ARRAY;
        }

        @Override // defpackage.qvg
        public JsonToken p() {
            if (!this.f.hasNext()) {
                this.g = null;
                return null;
            }
            zsd next = this.f.next();
            this.g = next;
            return next.f();
        }
    }

    public static final class b extends qvg {
        public Iterator<Map.Entry<String, zsd>> f;
        public Map.Entry<String, zsd> g;
        public boolean h;

        public b(zsd zsdVar, qvg qvgVar) {
            super(2, qvgVar);
            this.f = ((c4h) zsdVar).v();
            this.h = true;
        }

        @Override // defpackage.fud
        public /* bridge */ /* synthetic */ fud e() {
            return super.n();
        }

        @Override // defpackage.qvg
        public boolean k() {
            return ((eh4) l()).size() > 0;
        }

        @Override // defpackage.qvg
        public zsd l() {
            Map.Entry<String, zsd> entry = this.g;
            if (entry == null) {
                return null;
            }
            return entry.getValue();
        }

        @Override // defpackage.qvg
        public JsonToken m() {
            return JsonToken.END_OBJECT;
        }

        @Override // defpackage.qvg
        public JsonToken p() {
            if (!this.h) {
                this.h = true;
                return this.g.getValue().f();
            }
            if (!this.f.hasNext()) {
                this.d = null;
                this.g = null;
                return null;
            }
            this.h = false;
            Map.Entry<String, zsd> next = this.f.next();
            this.g = next;
            this.d = next != null ? next.getKey() : null;
            return JsonToken.FIELD_NAME;
        }
    }

    public static final class c extends qvg {
        public zsd f;
        public boolean g;

        public c(zsd zsdVar, qvg qvgVar) {
            super(0, qvgVar);
            this.g = false;
            this.f = zsdVar;
        }

        @Override // defpackage.fud
        public /* bridge */ /* synthetic */ fud e() {
            return super.n();
        }

        @Override // defpackage.qvg
        public boolean k() {
            return false;
        }

        @Override // defpackage.qvg
        public zsd l() {
            return this.f;
        }

        @Override // defpackage.qvg
        public JsonToken m() {
            return null;
        }

        @Override // defpackage.qvg
        public JsonToken p() {
            if (this.g) {
                this.f = null;
                return null;
            }
            this.g = true;
            return this.f.f();
        }
    }

    public qvg(int i, qvg qvgVar) {
        this.f18247a = i;
        this.f18248b = -1;
        this.c = qvgVar;
    }

    @Override // defpackage.fud
    public final String b() {
        return this.d;
    }

    @Override // defpackage.fud
    public Object c() {
        return this.e;
    }

    @Override // defpackage.fud
    public void i(Object obj) {
        this.e = obj;
    }

    public abstract boolean k();

    public abstract zsd l();

    public abstract JsonToken m();

    public final qvg n() {
        return this.c;
    }

    public final qvg o() {
        zsd zsdVarL = l();
        if (zsdVarL == null) {
            throw new IllegalStateException("No current node");
        }
        if (zsdVarL.C()) {
            return new a(zsdVarL, this);
        }
        if (zsdVarL.H()) {
            return new b(zsdVarL, this);
        }
        throw new IllegalStateException("Current node of type " + zsdVarL.getClass().getName());
    }

    public abstract JsonToken p();
}

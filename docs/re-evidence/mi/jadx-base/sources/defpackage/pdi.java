package defpackage;

import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pdi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pdi f30292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f30293b;

    public static final class a extends pdi {
        public final SettableAnyProperty c;
        public final String d;

        public a(pdi pdiVar, Object obj, SettableAnyProperty settableAnyProperty, String str) {
            super(pdiVar, obj);
            this.c = settableAnyProperty;
            this.d = str;
        }

        @Override // defpackage.pdi
        public void a(Object obj) throws IOException {
            this.c.set(obj, this.d, this.f30293b);
        }
    }

    public static final class b extends pdi {
        public final Object c;

        public b(pdi pdiVar, Object obj, Object obj2) {
            super(pdiVar, obj);
            this.c = obj2;
        }

        @Override // defpackage.pdi
        public void a(Object obj) throws IOException {
            ((Map) obj).put(this.c, this.f30293b);
        }
    }

    public static final class c extends pdi {
        public final SettableBeanProperty c;

        public c(pdi pdiVar, Object obj, SettableBeanProperty settableBeanProperty) {
            super(pdiVar, obj);
            this.c = settableBeanProperty;
        }

        @Override // defpackage.pdi
        public void a(Object obj) throws IOException {
            this.c.set(obj, this.f30293b);
        }
    }

    public pdi(pdi pdiVar, Object obj) {
        this.f30292a = pdiVar;
        this.f30293b = obj;
    }

    public abstract void a(Object obj) throws IOException;
}

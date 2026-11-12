package defpackage;

import com.fasterxml.jackson.core.JsonLocation;

/* JADX INFO: loaded from: classes4.dex */
public class fbq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonLocation f17635b;
    public final Class<?> c;

    public fbq(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this.f17634a = obj;
        this.c = cls;
        this.f17635b = jsonLocation;
    }

    public String toString() {
        return String.format("Object id [%s] (for %s) at %s", this.f17634a, h04.T(this.c), this.f17635b);
    }
}

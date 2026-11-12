package defpackage;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import defpackage.eh4;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eh4<T extends eh4<T>> extends m82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonNodeFactory f16638a;

    public eh4(JsonNodeFactory jsonNodeFactory) {
        this.f16638a = jsonNodeFactory;
    }

    public final mj1 V() {
        return this.f16638a.arrayNode();
    }

    public final p43 W(boolean z) {
        return this.f16638a.m127booleanNode(z);
    }

    public final y1h X() {
        return this.f16638a.nullNode();
    }

    public final u2h Y(int i) {
        return this.f16638a.numberNode(i);
    }

    public final u2h Z(long j) {
        return this.f16638a.numberNode(j);
    }

    public final c4h a0() {
        return this.f16638a.objectNode();
    }

    public final i8p b0(String str) {
        return this.f16638a.m135textNode(str);
    }

    @Override // defpackage.zsd
    public String l() {
        return "";
    }

    @Override // defpackage.zsd
    public abstract int size();
}

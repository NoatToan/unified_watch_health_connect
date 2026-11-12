package im2;

import c83.b0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lim2/b;", "Ldn2/d$d;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements dn2.d.InterfaceC1284d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.InterfaceC1797c f94214a;

    public b(c.InterfaceC1797c interfaceC1797c) {
        this.f94214a = interfaceC1797c;
    }

    @Override // dn2.d.InterfaceC1284d, im2.c.InterfaceC1797c
    public final zi2.a a() {
        return this.f94214a.a();
    }

    @Override // dn2.d.InterfaceC1284d, im2.c.InterfaceC1797c
    public final b0 b(String str) {
        c.InterfaceC1797c interfaceC1797c = this.f94214a;
        if (str == null) {
            zi2.a aVarA = interfaceC1797c.a();
            str = aVarA != null ? aVarA.f204881b : null;
        }
        return interfaceC1797c.b(str);
    }
}

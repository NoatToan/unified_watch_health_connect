package defpackage;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.a;

/* JADX INFO: loaded from: classes7.dex */
public class drd extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15833a = false;

    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // com.fasterxml.jackson.databind.a
    public String getModuleName() {
        return "Jdk8Module";
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    @Override // com.fasterxml.jackson.databind.a
    public void setupModule(a.InterfaceC0177a interfaceC0177a) {
        interfaceC0177a.b(new erd());
        interfaceC0177a.h(new brd());
        interfaceC0177a.c(new frd());
        if (this.f15833a) {
            interfaceC0177a.e(new ard());
        }
    }

    @Override // com.fasterxml.jackson.databind.a
    public Version version() {
        return jhh.f22809a;
    }
}

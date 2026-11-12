package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import defpackage.hh2;
import defpackage.lh2;
import defpackage.oz5;
import defpackage.pnq;
import defpackage.u4q;
import defpackage.wzd;
import defpackage.x10;
import defpackage.xwl;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.a$a, reason: collision with other inner class name */
    public interface InterfaceC0177a {
        void a(wzd wzdVar);

        void b(xwl xwlVar);

        void c(u4q u4qVar);

        void d(hh2 hh2Var);

        void e(lh2 lh2Var);

        void f(pnq pnqVar);

        void g(NamedType... namedTypeArr);

        void h(oz5 oz5Var);

        void i(Class<?> cls, Class<?> cls2);

        void j(x10 x10Var);

        void k(xwl xwlVar);

        void l(PropertyNamingStrategy propertyNamingStrategy);
    }

    public abstract String getModuleName();

    public Object getTypeId() {
        return getClass().getName();
    }

    public abstract void setupModule(InterfaceC0177a interfaceC0177a);

    public abstract Version version();
}

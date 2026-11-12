package c63;

import c63.b;
import java.util.ArrayList;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public interface b<Target, ActualSelf extends b<Target, ActualSelf>> extends s {
    e63.d<Target> A();

    ActualSelf C();

    default void L(e23.l<? super ActualSelf, Unit>[] lVarArr, e23.l<? super ActualSelf, Unit> lVar) {
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (e23.l<? super ActualSelf, Unit> lVar2 : lVarArr) {
            b bVarC = C();
            lVar2.invoke(bVarC);
            arrayList.add(new e63.h(bVarC.A().f63242a));
        }
        b bVarC2 = C();
        lVar.invoke(bVarC2);
        A().a(new e63.c(new e63.h(bVarC2.A().f63242a), arrayList));
    }

    default e63.f<Target> build() {
        return new e63.f<>(new e63.h(A().f63242a).f63248a);
    }

    @Override // c63.s
    default void q(String str) {
        str.getClass();
        A().a(new e63.j(str));
    }

    default void z(e23.l lVar, String str) {
        e63.d<Target> dVarA = A();
        b bVarC = C();
        lVar.invoke(bVarC);
        Unit unit = Unit.INSTANCE;
        dVarA.a(new e63.t(str, new e63.h(bVarC.A().f63242a)));
    }
}

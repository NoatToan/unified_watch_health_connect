package a43;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public enum x {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<x> f1186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<x> f1187c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1203a;

    static {
        new a(null);
        x[] xVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (x xVar : xVarArrValues) {
            if (xVar.f1203a) {
                arrayList.add(xVar);
            }
        }
        f1186b = p13.h0.g1(arrayList);
        f1187c = p13.u.m0(values());
    }

    x(boolean z14) {
        this.f1203a = z14;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

package m4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lm4/b0;", "", "<init>", "()V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f116451b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f116452c = new b0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f116453d = new b0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f116454e = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3.c<e0> f116455a = new q3.c<>(new e0[16], 0);

    public static void a(b0 b0Var) {
        g.f116466b.getClass();
        int i14 = g.f116473i;
        b0Var.getClass();
        f116451b.getClass();
        if (b0Var == f116452c) {
            vb.h.z("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (b0Var == f116453d) {
            vb.h.z("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        q3.c<e0> cVar = b0Var.f116455a;
        int i15 = cVar.f142358c;
        if (i15 == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        e0[] e0VarArr = cVar.f142356a;
        for (int i16 = 0; i16 < i15; i16++) {
            e0 e0Var = e0VarArr[i16];
            if (!e0Var.getNode().getIsAttached()) {
                e5.a.b("visitChildren called on an unattached node");
            }
            q3.c cVar2 = new q3.c(new h4.r.c[16], 0);
            h4.r.c child = e0Var.getNode().getChild();
            if (child == null) {
                h5.k.a(cVar2, e0Var.getNode());
            } else {
                cVar2.b(child);
            }
            while (true) {
                int i17 = cVar2.f142358c;
                if (i17 == 0) {
                    break;
                }
                h4.r.c cVarB = (h4.r.c) cVar2.k(i17 - 1);
                if ((cVarB.getAggregateChildKindSet() & 1024) == 0) {
                    h5.k.a(cVar2, cVarB);
                } else {
                    while (cVarB != null) {
                        if ((cVarB.getKindSet() & 1024) != 0) {
                            q3.c cVar3 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof j0) {
                                    if (((j0) cVarB).n1(i14)) {
                                        break;
                                    }
                                } else if ((cVarB.getKindSet() & 1024) != 0 && (cVarB instanceof h5.m)) {
                                    int i18 = 0;
                                    for (h4.r.c child2 = ((h5.m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                        if ((child2.getKindSet() & 1024) != 0) {
                                            i18++;
                                            if (i18 == 1) {
                                                cVarB = child2;
                                            } else {
                                                if (cVar3 == null) {
                                                    cVar3 = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (cVarB != null) {
                                                    cVar3.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar3.b(child2);
                                            }
                                        }
                                    }
                                    if (i18 == 1) {
                                    }
                                }
                                cVarB = h5.k.b(cVar3);
                            }
                            break;
                        }
                        cVarB = cVarB.getChild();
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm4/b0$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

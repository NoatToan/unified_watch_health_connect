package sa2;

import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f158330b;

    public /* synthetic */ f(h hVar, int i14) {
        this.f158329a = i14;
        this.f158330b = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f158329a;
        final int i15 = 1;
        final h hVar = this.f158330b;
        switch (i14) {
            case 0:
                qa2.b bVar = (qa2.b) obj;
                if (bVar != null) {
                    h.f158334i.getClass();
                    hVar.getClass();
                    if (s.g(bVar.getStatusCode(), qa2.k.TOO_MANY_REQUESTS.f143942a)) {
                        hVar.g(bVar.getStatusCode());
                    } else {
                        pa2.b.f136781a.getClass();
                        if (s.g(pa2.b.a.a().f136770b, "ecg")) {
                            hVar.d(new f(hVar, i15));
                        } else {
                            hVar.f(true, new e(hVar, 2));
                        }
                    }
                } else {
                    wa2.b bVar2 = h.f158334i;
                    hVar.g(qa2.k.GENERIC_ERROR.f143942a);
                }
                break;
            case 1:
                final String str = (String) obj;
                if (str != null) {
                    wa2.b bVar3 = h.f158334i;
                    if (str.length() == 0) {
                        wa2.b bVar4 = h.f158334i;
                        hVar.g(qa2.k.GENERIC_ERROR.f143942a);
                    } else {
                        h.f158334i.getClass();
                        final int i16 = 0;
                        hVar.b(new e23.l() { // from class: sa2.g
                            @Override // e23.l
                            public final Object invoke(Object obj2) {
                                switch (i16) {
                                    case 0:
                                        wa2.b bVar5 = h.f158334i;
                                        bVar5.getClass();
                                        h hVar2 = hVar;
                                        hVar2.getClass();
                                        bVar5.getClass();
                                        ge1.b.T(hVar2.f158341g, null, null, new l(hVar2, str, null), 3);
                                        break;
                                    default:
                                        wa2.b bVar6 = h.f158334i;
                                        bVar6.getClass();
                                        h hVar3 = hVar;
                                        hVar3.getClass();
                                        bVar6.getClass();
                                        ge1.b.T(hVar3.f158341g, null, null, new l(hVar3, str, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                } else {
                    wa2.b bVar5 = h.f158334i;
                    hVar.g(qa2.k.GENERIC_ERROR.f143942a);
                }
                break;
            default:
                final String str2 = (String) obj;
                if (str2 != null) {
                    wa2.b bVar6 = h.f158334i;
                    if (str2.length() == 0) {
                        wa2.b bVar7 = h.f158334i;
                        hVar.g(qa2.k.GENERIC_ERROR.f143942a);
                    } else {
                        h.f158334i.getClass();
                        hVar.b(new e23.l() { // from class: sa2.g
                            @Override // e23.l
                            public final Object invoke(Object obj2) {
                                switch (i15) {
                                    case 0:
                                        wa2.b bVar8 = h.f158334i;
                                        bVar8.getClass();
                                        h hVar2 = hVar;
                                        hVar2.getClass();
                                        bVar8.getClass();
                                        ge1.b.T(hVar2.f158341g, null, null, new l(hVar2, str2, null), 3);
                                        break;
                                    default:
                                        wa2.b bVar9 = h.f158334i;
                                        bVar9.getClass();
                                        h hVar3 = hVar;
                                        hVar3.getClass();
                                        bVar9.getClass();
                                        ge1.b.T(hVar3.f158341g, null, null, new l(hVar3, str2, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                } else {
                    wa2.b bVar8 = h.f158334i;
                    hVar.g(qa2.k.GENERIC_ERROR.f143942a);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

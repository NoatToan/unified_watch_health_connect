package n70;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f124764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j70.i f124765c;

    public /* synthetic */ y1(List list, j70.i iVar, int i14) {
        this.f124763a = i14;
        this.f124764b = list;
        this.f124765c = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:125:0x0123  */
    /* JADX WARN: Code duplicated, block: B:146:0x0154  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e  */
    /* JADX WARN: Code duplicated, block: B:41:0x005f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0090  */
    /* JADX WARN: Code duplicated, block: B:83:0x00c1  */
    @Override // e23.a
    public final Object invoke() {
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        switch (this.f124763a) {
            case 0:
                List list = this.f124764b;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()) == null) {
                            j70.i iVar = this.f124765c;
                            if ((iVar != null ? iVar.f97538f : null) != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                    }
                    z14 = true;
                } else {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 1:
                List list2 = this.f124764b;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (((String) it3.next()) == null) {
                            j70.i iVar2 = this.f124765c;
                            if ((iVar2 != null ? iVar2.f97535c : null) != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        }
                    }
                    z15 = true;
                } else {
                    z15 = true;
                }
                return Boolean.valueOf(z15);
            case 2:
                List list3 = this.f124764b;
                if (list3 == null || !list3.isEmpty()) {
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        if (((String) it4.next()) == null) {
                            j70.i iVar3 = this.f124765c;
                            if ((iVar3 != null ? iVar3.f97536d : null) != null) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                        }
                    }
                    z16 = true;
                } else {
                    z16 = true;
                }
                return Boolean.valueOf(z16);
            case 3:
                List list4 = this.f124764b;
                if (list4 == null || !list4.isEmpty()) {
                    Iterator it5 = list4.iterator();
                    while (it5.hasNext()) {
                        if (((String) it5.next()) == null) {
                            j70.i iVar4 = this.f124765c;
                            if ((iVar4 != null ? iVar4.f97537e : null) != null) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                        }
                    }
                    z17 = true;
                } else {
                    z17 = true;
                }
                return Boolean.valueOf(z17);
            case 4:
                List list5 = this.f124764b;
                if (list5 == null || !list5.isEmpty()) {
                    Iterator it6 = list5.iterator();
                    while (it6.hasNext()) {
                        if (((String) it6.next()) == null) {
                            j70.i iVar5 = this.f124765c;
                            if ((iVar5 != null ? iVar5.f97538f : null) != null) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                        }
                    }
                    z18 = true;
                } else {
                    z18 = true;
                }
                return Boolean.valueOf(z18);
            case 5:
                List list6 = this.f124764b;
                if (list6 == null || !list6.isEmpty()) {
                    Iterator it7 = list6.iterator();
                    while (it7.hasNext()) {
                        if (((String) it7.next()) == null) {
                            j70.i iVar6 = this.f124765c;
                            if ((iVar6 != null ? iVar6.f97541i : null) != null) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                        }
                    }
                    z19 = true;
                } else {
                    z19 = true;
                }
                return Boolean.valueOf(z19);
            default:
                List list7 = this.f124764b;
                if (list7.isEmpty()) {
                    z24 = true;
                } else {
                    Iterator it8 = list7.iterator();
                    while (it8.hasNext()) {
                        if (((String) it8.next()) == null) {
                            j70.i iVar7 = this.f124765c;
                            if ((iVar7 != null ? iVar7.f97534b : null) != null) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                        }
                    }
                    z24 = true;
                }
                return Boolean.valueOf(z24);
        }
    }
}

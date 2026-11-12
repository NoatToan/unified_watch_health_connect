package pk0;

import java.text.Collator;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collator f138244b;

    public /* synthetic */ l(Collator collator, int i14) {
        this.f138243a = i14;
        this.f138244b = collator;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int iCompare;
        int iCompare2;
        switch (this.f138243a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                if (s.g(str, str2)) {
                    iCompare = 0;
                } else if (s.g(str, "#")) {
                    iCompare = -1;
                } else {
                    iCompare = s.g(str2, "#") ? 1 : this.f138244b.compare(str, str2);
                }
                return Integer.valueOf(iCompare);
            default:
                ww0.e eVar = (ww0.e) obj;
                ww0.e eVar2 = (ww0.e) obj2;
                if (eVar == eVar2) {
                    iCompare2 = 0;
                } else {
                    ww0.e eVar3 = ww0.e.f187544c;
                    if (eVar == eVar3) {
                        iCompare2 = -1;
                    } else if (eVar2 == eVar3) {
                        iCompare2 = 1;
                    } else {
                        iCompare2 = this.f138244b.compare(eVar.name(), eVar2.name());
                    }
                }
                return Integer.valueOf(iCompare2);
        }
    }
}

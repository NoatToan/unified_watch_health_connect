package i7;

import java.util.ArrayList;
import p1.k1;

/* JADX INFO: loaded from: classes.dex */
public class i implements k7.b<j.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f91928a;

    public i(String str) {
        this.f91928a = str;
    }

    @Override // k7.b
    public final void accept(j.a aVar) {
        j.a aVar2 = aVar;
        synchronized (j.f91931c) {
            try {
                k1<String, ArrayList<k7.b<j.a>>> k1Var = j.f91932d;
                ArrayList<k7.b<j.a>> arrayList = k1Var.get(this.f91928a);
                if (arrayList == null) {
                    return;
                }
                k1Var.remove(this.f91928a);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    arrayList.get(i14).accept(aVar2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}

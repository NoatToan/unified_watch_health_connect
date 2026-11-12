package p53;

import java.util.LinkedHashMap;
import o53.u0;
import p005kotlin.Unit;
import u7.e1;
import u7.f1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f136182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f136183c;

    public /* synthetic */ a(int i14, Object obj, Object obj2) {
        this.f136181a = i14;
        this.f136182b = obj;
        this.f136183c = obj2;
    }

    @Override // o53.u0
    public final void dispose() {
        switch (this.f136181a) {
            case 0:
                b bVar = (b) this.f136182b;
                bVar.f136185a.removeCallbacks((Runnable) this.f136183c);
                return;
            default:
                String str = (String) this.f136182b;
                e1.b bVar2 = (e1.b) this.f136183c;
                synchronized (f1.f169130c) {
                    try {
                        f1.f169129b.getClass();
                        LinkedHashMap linkedHashMap = f1.f169131d;
                        f1 f1Var = (f1) linkedHashMap.get(str);
                        if (f1Var != null) {
                            f1Var.f169132a.remove(bVar2);
                            if (f1Var.f169132a.isEmpty()) {
                                linkedHashMap.remove(str);
                                f1Var.stopWatching();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}

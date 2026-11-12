package v;

import androidx.camera.core.impl.a3;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c3;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f173986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f173987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.impl.l2 f173988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b3 f173989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.impl.q2 f173990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f173991g;

    public /* synthetic */ q(s sVar, String str, androidx.camera.core.impl.l2 l2Var, b3 b3Var, androidx.camera.core.impl.q2 q2Var, List list, int i14) {
        this.f173985a = i14;
        this.f173986b = sVar;
        this.f173987c = str;
        this.f173988d = l2Var;
        this.f173989e = b3Var;
        this.f173990f = q2Var;
        this.f173991g = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f173985a) {
            case 0:
                s sVar = this.f173986b;
                String str = this.f173987c;
                androidx.camera.core.impl.l2 l2Var = this.f173988d;
                b3<?> b3Var = this.f173989e;
                androidx.camera.core.impl.q2 q2Var = this.f173990f;
                List<c3.b> list = this.f173991g;
                sVar.toString();
                LinkedHashMap linkedHashMap = sVar.f174006a.f5492a;
                a3.a aVar = (a3.a) linkedHashMap.get(str);
                if (aVar == null) {
                    aVar = new a3.a(l2Var, b3Var, q2Var, list);
                    linkedHashMap.put(str, aVar);
                }
                aVar.f5498f = true;
                sVar.f174006a.f(str, l2Var, b3Var, q2Var, list);
                sVar.J();
                break;
            case 1:
                s sVar2 = this.f173986b;
                String str2 = this.f173987c;
                androidx.camera.core.impl.l2 l2Var2 = this.f173988d;
                b3<?> b3Var2 = this.f173989e;
                androidx.camera.core.impl.q2 q2Var2 = this.f173990f;
                List<c3.b> list2 = this.f173991g;
                sVar2.toString();
                sVar2.f174006a.f(str2, l2Var2, b3Var2, q2Var2, list2);
                sVar2.q();
                sVar2.C();
                sVar2.J();
                if (sVar2.f174010e == s.g.OPENED) {
                    sVar2.B();
                }
                break;
            default:
                s sVar3 = this.f173986b;
                String str3 = this.f173987c;
                androidx.camera.core.impl.l2 l2Var3 = this.f173988d;
                b3<?> b3Var3 = this.f173989e;
                androidx.camera.core.impl.q2 q2Var3 = this.f173990f;
                List<c3.b> list3 = this.f173991g;
                sVar3.toString();
                sVar3.f174006a.f(str3, l2Var3, b3Var3, q2Var3, list3);
                sVar3.J();
                break;
        }
    }
}

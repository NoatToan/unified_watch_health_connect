package lo;

import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class y2 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113990b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(f0 f0Var) {
        super(f0Var, 0);
        this.f113990b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113990b;
        String buttonTopLabel = f0Var.K0.getButtonTopLabel();
        HashMap<String, String> map = f0Var.Y1;
        LinkedHashMap linkedHashMapF = am.v1.f(f0Var.J1.f4358a, map.get("difficultyScale"));
        String str = map.get("max_difficulty");
        t tVar = (t) dVar;
        tVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : linkedHashMapF.keySet()) {
            linkedHashMap.put(str2, (String) linkedHashMapF.get(str2));
        }
        tVar.I6(buttonTopLabel, "max_difficulty", linkedHashMap, str);
    }
}

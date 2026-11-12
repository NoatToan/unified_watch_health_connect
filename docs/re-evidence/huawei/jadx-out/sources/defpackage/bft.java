package defpackage;

import android.util.ArrayMap;
import com.huawei.animationkit.computationalwallpaper.pattern.variable.Variable;
import com.huawei.animationkit.computationalwallpaper.pattern.variable.VariableType;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes23.dex */
public class bft implements Variable {
    private static final bft e = new bft();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Variable> f1070b = new ArrayMap();

    public static bft b() {
        return e;
    }

    private bft() {
        b(VariableType.Random.RANDOM.getKey(), new bfv());
        bfn bfnVar = new bfn();
        b(VariableType.Crown.SCROLL.getKey(), bfnVar);
        b(VariableType.Crown.DEGREE.getKey(), bfnVar);
        b(VariableType.Crown.SMOOTH_DEGREE.getKey(), bfnVar);
    }

    public void b(String str, Variable variable) {
        this.f1070b.put(str, variable);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.variable.Variable
    public void updateFloat(String str, float f) {
        c(str).updateFloat(str, f);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.variable.Variable
    public void updateInt(String str, int i) {
        c(str).updateInt(str, i);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.variable.Variable
    public int nextInt(String str, int i, int i2) {
        return c(str).nextInt(str, i, i2);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.variable.Variable
    public float nextFloat(String str, float f, float f2) {
        return c(str).nextFloat(str, f, f2);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.variable.Variable
    public float nextFraction(String str) {
        return c(str).nextFraction(str);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.variable.Variable
    public void addUpdateObserver(String str, Variable.VariableObserver variableObserver) {
        c(str).addUpdateObserver(str, variableObserver);
    }

    private Variable c(final String str) {
        return (Variable) Optional.ofNullable(this.f1070b.get(str)).orElseThrow(new Supplier() { // from class: bfu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bft.a(str);
            }
        });
    }

    static /* synthetic */ Variable.b a(String str) {
        return new Variable.b(str);
    }
}

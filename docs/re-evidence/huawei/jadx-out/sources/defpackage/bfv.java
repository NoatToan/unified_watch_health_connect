package defpackage;

import com.huawei.animationkit.computationalwallpaper.pattern.variable.Variable;
import java.util.Random;

/* JADX INFO: loaded from: classes23.dex */
public class bfv implements Variable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Random f1071c = new Random();

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.variable.Variable
    public float nextFloat(String str, float f, float f2) {
        return (this.f1071c.nextFloat() * (f2 - f)) + f;
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.variable.Variable
    public int nextInt(String str, int i, int i2) {
        return this.f1071c.nextInt(i2 - i) + i;
    }
}

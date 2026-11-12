package defpackage;

import android.view.Choreographer;
import com.huawei.animationkit.computationalwallpaper.pattern.variable.ObservableVariable;
import com.huawei.animationkit.computationalwallpaper.pattern.variable.Variable;
import com.huawei.animationkit.computationalwallpaper.pattern.variable.VariableType;

/* JADX INFO: loaded from: classes23.dex */
public class bfn extends ObservableVariable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1065c = 0.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f1063a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f1064b = 0.0f;
    private final Choreographer.FrameCallback e = new Choreographer.FrameCallback() { // from class: bfn.2
        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            if (Math.abs(bfn.this.f1063a - bfn.this.f1064b) > 1.0f) {
                bfn.this.f1064b += Math.signum(bfn.this.f1063a - bfn.this.f1064b) * 1.0f;
                Choreographer.getInstance().postFrameCallback(this);
            } else {
                bfn bfnVar = bfn.this;
                bfnVar.f1064b = bfnVar.f1063a;
            }
            bfn.this.notifyObserver(VariableType.Crown.SMOOTH_DEGREE.getKey());
        }
    };

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.variable.Variable
    public void updateFloat(String str, float f) {
        if (VariableType.Crown.SCROLL.getKey().equals(str)) {
            d(str, f);
            a(str, f);
            return;
        }
        throw new Variable.c(str);
    }

    private void d(String str, float f) {
        this.f1065c = f;
        this.f1063a += f;
        notifyObserver(VariableType.Crown.SCROLL.getKey());
        notifyObserver(VariableType.Crown.DEGREE.getKey());
    }

    private void a(String str, float f) {
        if (getObservers(VariableType.Crown.SMOOTH_DEGREE.getKey()).isPresent()) {
            this.f1065c = f;
            this.f1063a += f;
            Choreographer.getInstance().postFrameCallback(this.e);
        }
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.variable.Variable
    public float nextFloat(String str, float f, float f2) {
        if (VariableType.Crown.SCROLL.getKey().equals(str)) {
            return this.f1065c;
        }
        if (VariableType.Crown.DEGREE.getKey().equals(str)) {
            return a(str, f, f2);
        }
        if (VariableType.Crown.SMOOTH_DEGREE.getKey().equals(str)) {
            return e(str, f, f2);
        }
        throw new Variable.c(str);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.variable.Variable
    public int nextInt(String str, int i, int i2) {
        float fE;
        if (VariableType.Crown.DEGREE.getKey().equals(str)) {
            fE = a(str, i, i2);
        } else if (VariableType.Crown.SMOOTH_DEGREE.getKey().equals(str)) {
            fE = e(str, i, i2);
        } else {
            throw new Variable.c(str);
        }
        return (int) fE;
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.variable.Variable
    public float nextFraction(String str) {
        float fAbs;
        if (VariableType.Crown.DEGREE.getKey().equals(str)) {
            fAbs = Math.abs(this.f1063a);
        } else if (VariableType.Crown.SMOOTH_DEGREE.getKey().equals(str)) {
            fAbs = Math.abs(this.f1064b);
        } else {
            throw new Variable.c(str);
        }
        return (fAbs % 360.0f) / 360.0f;
    }

    private float a(String str, float f, float f2) {
        if (this.f1063a < 0.0f && f < 0.0f) {
            return Math.min(0.0f, f2) - (nextFraction(str) * (Math.min(0.0f, f2) - f));
        }
        return (nextFraction(str) * (f2 - Math.max(0.0f, f))) + Math.max(0.0f, f);
    }

    private float e(String str, float f, float f2) {
        if (this.f1064b < 0.0f && f < 0.0f) {
            return Math.min(0.0f, f2) - (nextFraction(str) * (Math.min(0.0f, f2) - f));
        }
        return (nextFraction(str) * (f2 - Math.max(0.0f, f))) + Math.max(0.0f, f);
    }
}

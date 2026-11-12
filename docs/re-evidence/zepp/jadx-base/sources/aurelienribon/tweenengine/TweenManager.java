package aurelienribon.tweenengine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TweenManager {
    private final ArrayList<BaseTween<?>> a = new ArrayList<>(20);
    private boolean b = false;

    private static int a(List<BaseTween<?>> list) {
        int size = list.size();
        int iA = 0;
        for (int i = 0; i < size; i++) {
            BaseTween<?> baseTween = list.get(i);
            if (baseTween instanceof Timeline) {
                iA += a(((Timeline) baseTween).getChildren()) + 1;
            }
        }
        return iA;
    }

    private static int b(List<BaseTween<?>> list) {
        int size = list.size();
        int iB = 0;
        for (int i = 0; i < size; i++) {
            BaseTween<?> baseTween = list.get(i);
            iB = baseTween instanceof Tween ? iB + 1 : iB + b(((Timeline) baseTween).getChildren());
        }
        return iB;
    }

    public static void setAutoRemove(BaseTween<?> baseTween, boolean z) {
        baseTween.p = z;
    }

    public static void setAutoStart(BaseTween<?> baseTween, boolean z) {
        baseTween.q = z;
    }

    public TweenManager add(BaseTween<?> baseTween) {
        if (!this.a.contains(baseTween)) {
            this.a.add(baseTween);
        }
        if (baseTween.q) {
            baseTween.start();
        }
        return this;
    }

    public boolean containsTarget(Object obj) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (this.a.get(i).containsTarget(obj)) {
                return true;
            }
        }
        return false;
    }

    public void ensureCapacity(int i) {
        this.a.ensureCapacity(i);
    }

    public List<BaseTween<?>> getObjects() {
        return Collections.unmodifiableList(this.a);
    }

    public int getRunningTimelinesCount() {
        return a(this.a);
    }

    public int getRunningTweensCount() {
        return b(this.a);
    }

    public void killAll() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            this.a.get(i).kill();
        }
    }

    public void killTarget(Object obj) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            this.a.get(i).killTarget(obj);
        }
    }

    public void pause() {
        this.b = true;
    }

    public void resume() {
        this.b = false;
    }

    public int size() {
        return this.a.size();
    }

    public void update(float f) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            BaseTween<?> baseTween = this.a.get(size);
            if (baseTween.isFinished() && baseTween.p) {
                this.a.remove(size);
                baseTween.free();
            }
        }
        if (this.b) {
            return;
        }
        if (f < 0.0f) {
            for (int size2 = this.a.size() - 1; size2 >= 0; size2--) {
                this.a.get(size2).update(f);
            }
            return;
        }
        int size3 = this.a.size();
        for (int i = 0; i < size3; i++) {
            this.a.get(i).update(f);
        }
    }

    public boolean containsTarget(Object obj, int i) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.a.get(i2).containsTarget(obj, i)) {
                return true;
            }
        }
        return false;
    }

    public void killTarget(Object obj, int i) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.a.get(i2).killTarget(obj, i);
        }
    }
}

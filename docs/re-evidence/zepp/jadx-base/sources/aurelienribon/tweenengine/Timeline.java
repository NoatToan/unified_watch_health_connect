package aurelienribon.tweenengine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Timeline extends BaseTween<Timeline> {
    private static final Pool.Callback<Timeline> x;
    public static final Pool<Timeline> y;
    public static final /* synthetic */ boolean z = false;
    private final List<BaseTween<?>> s;
    private Timeline t;
    private Timeline u;
    private d v;
    private boolean w;

    public static class a implements Pool.Callback<Timeline> {
        @Override // aurelienribon.tweenengine.Pool.Callback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPool(Timeline timeline) {
            timeline.reset();
        }

        @Override // aurelienribon.tweenengine.Pool.Callback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onUnPool(Timeline timeline) {
            timeline.reset();
        }
    }

    public static class b extends Pool<Timeline> {
        public b(int i, Pool.Callback callback) {
            super(i, callback);
        }

        @Override // aurelienribon.tweenengine.Pool
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Timeline b() {
            return new Timeline(null);
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.SEQUENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.PARALLEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum d {
        SEQUENCE,
        PARALLEL
    }

    static {
        a aVar = new a();
        x = aVar;
        y = new b(10, aVar);
    }

    public /* synthetic */ Timeline(a aVar) {
        this();
    }

    public static Timeline createParallel() {
        Timeline timelineE = y.e();
        timelineE.e(d.PARALLEL);
        return timelineE;
    }

    public static Timeline createSequence() {
        Timeline timelineE = y.e();
        timelineE.e(d.SEQUENCE);
        return timelineE;
    }

    private void e(d dVar) {
        this.v = dVar;
        this.t = this;
    }

    public static void ensurePoolCapacity(int i) {
        y.c(i);
    }

    public static int getPoolSize() {
        return y.f();
    }

    public Timeline beginParallel() {
        if (this.w) {
            throw new RuntimeException("You can't push anything to a timeline once it is started");
        }
        Timeline timelineE = y.e();
        Timeline timeline = this.t;
        timelineE.u = timeline;
        timelineE.v = d.PARALLEL;
        timeline.s.add(timelineE);
        this.t = timelineE;
        return this;
    }

    public Timeline beginSequence() {
        if (this.w) {
            throw new RuntimeException("You can't push anything to a timeline once it is started");
        }
        Timeline timelineE = y.e();
        Timeline timeline = this.t;
        timelineE.u = timeline;
        timelineE.v = d.SEQUENCE;
        timeline.s.add(timelineE);
        this.t = timelineE;
        return this;
    }

    @Override // aurelienribon.tweenengine.BaseTween
    public boolean containsTarget(Object obj) {
        int size = this.s.size();
        for (int i = 0; i < size; i++) {
            if (this.s.get(i).containsTarget(obj)) {
                return true;
            }
        }
        return false;
    }

    public Timeline end() {
        if (this.w) {
            throw new RuntimeException("You can't push anything to a timeline once it is started");
        }
        Timeline timeline = this.t;
        if (timeline == this) {
            throw new RuntimeException("Nothing to end...");
        }
        this.t = timeline.u;
        return this;
    }

    @Override // aurelienribon.tweenengine.BaseTween
    public void forceEndValues() {
        int size = this.s.size();
        for (int i = 0; i < size; i++) {
            this.s.get(i).forceToEnd(this.duration);
        }
    }

    @Override // aurelienribon.tweenengine.BaseTween
    public void forceStartValues() {
        for (int size = this.s.size() - 1; size >= 0; size--) {
            this.s.get(size).forceToStart();
        }
    }

    @Override // aurelienribon.tweenengine.BaseTween
    public void free() {
        for (int size = this.s.size() - 1; size >= 0; size--) {
            this.s.remove(size).free();
        }
        y.d(this);
    }

    public List<BaseTween<?>> getChildren() {
        return this.w ? Collections.unmodifiableList(this.t.s) : this.t.s;
    }

    public Timeline push(Tween tween) {
        if (this.w) {
            throw new RuntimeException("You can't push anything to a timeline once it is started");
        }
        this.t.s.add(tween);
        return this;
    }

    public Timeline pushPause(float f) {
        if (this.w) {
            throw new RuntimeException("You can't push anything to a timeline once it is started");
        }
        this.t.s.add(Tween.mark().delay(f));
        return this;
    }

    @Override // aurelienribon.tweenengine.BaseTween
    public void reset() {
        super.reset();
        this.s.clear();
        this.u = null;
        this.t = null;
        this.w = false;
    }

    @Override // aurelienribon.tweenengine.BaseTween
    public void updateOverride(int i, int i2, boolean z2, float f) {
        int i3 = 0;
        if (!z2 && i > i2) {
            float f2 = isReverse(i2) ? (-f) - 1.0f : f + 1.0f;
            int size = this.s.size();
            while (i3 < size) {
                this.s.get(i3).update(f2);
                i3++;
            }
            return;
        }
        if (!z2 && i < i2) {
            float f3 = isReverse(i2) ? (-f) - 1.0f : f + 1.0f;
            for (int size2 = this.s.size() - 1; size2 >= 0; size2--) {
                this.s.get(size2).update(f3);
            }
            return;
        }
        if (i > i2) {
            if (isReverse(i)) {
                forceEndValues();
                int size3 = this.s.size();
                while (i3 < size3) {
                    this.s.get(i3).update(f);
                    i3++;
                }
                return;
            }
            forceStartValues();
            int size4 = this.s.size();
            while (i3 < size4) {
                this.s.get(i3).update(f);
                i3++;
            }
            return;
        }
        if (i >= i2) {
            float f4 = isReverse(i) ? -f : f;
            if (f >= 0.0f) {
                int size5 = this.s.size();
                while (i3 < size5) {
                    this.s.get(i3).update(f4);
                    i3++;
                }
                return;
            }
            for (int size6 = this.s.size() - 1; size6 >= 0; size6--) {
                this.s.get(size6).update(f4);
            }
            return;
        }
        if (isReverse(i)) {
            forceStartValues();
            for (int size7 = this.s.size() - 1; size7 >= 0; size7--) {
                this.s.get(size7).update(f);
            }
            return;
        }
        forceEndValues();
        for (int size8 = this.s.size() - 1; size8 >= 0; size8--) {
            this.s.get(size8).update(f);
        }
    }

    private Timeline() {
        this.s = new ArrayList(10);
        reset();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // aurelienribon.tweenengine.BaseTween
    public Timeline build() {
        if (this.w) {
            return this;
        }
        this.duration = 0.0f;
        for (int i = 0; i < this.s.size(); i++) {
            BaseTween<?> baseTween = this.s.get(i);
            if (baseTween.getRepeatCount() < 0) {
                throw new RuntimeException("You can't push an object with infinite repetitions in a timeline");
            }
            baseTween.build();
            int i2 = c.a[this.v.ordinal()];
            if (i2 == 1) {
                float f = this.duration;
                this.duration = baseTween.getFullDuration() + f;
                baseTween.delay += f;
            } else if (i2 == 2) {
                this.duration = Math.max(this.duration, baseTween.getFullDuration());
            }
        }
        this.w = true;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // aurelienribon.tweenengine.BaseTween
    public Timeline start() {
        super.start();
        for (int i = 0; i < this.s.size(); i++) {
            this.s.get(i).start();
        }
        return this;
    }

    @Override // aurelienribon.tweenengine.BaseTween
    public boolean containsTarget(Object obj, int i) {
        int size = this.s.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.s.get(i2).containsTarget(obj, i)) {
                return true;
            }
        }
        return false;
    }

    public Timeline push(Timeline timeline) {
        if (!this.w) {
            if (timeline.t == timeline) {
                Timeline timeline2 = this.t;
                timeline.u = timeline2;
                timeline2.s.add(timeline);
                return this;
            }
            throw new RuntimeException("You forgot to call a few 'end()' statements in your pushed timeline");
        }
        throw new RuntimeException("You can't push anything to a timeline once it is started");
    }
}

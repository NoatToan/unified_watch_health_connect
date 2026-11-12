package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;

/* JADX INFO: loaded from: classes4.dex */
public class u6e {
    public static Handler h;
    public boolean e;
    public Runnable g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c10 f35453a = new f7e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c10 f35454b = new wde();
    public final c10 c = new e8e();
    public final SparseArray<v9e> d = new SparseArray<>(0);
    public long f = -1;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f35455a;

        public a(Callback callback) {
            this.f35455a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35455a.invoke(Boolean.TRUE);
        }
    }

    public class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35457a;

        public b(int i) {
            this.f35457a = i;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            u6e.this.d.remove(this.f35457a);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            u6e.this.d.put(this.f35457a, (v9e) animation);
        }
    }

    public class c implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v6e f35459a;

        public c(v6e v6eVar) {
            this.f35459a = v6eVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f35459a.onAnimationEnd();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public void b(View view, int i, int i2, int i3, int i4) {
        UiThreadUtil.assertOnUiThread();
        int id = view.getId();
        v9e v9eVar = this.d.get(id);
        if (v9eVar != null) {
            v9eVar.a(i, i2, i3, i4);
            return;
        }
        Animation animationA = ((view.getWidth() == 0 || view.getHeight() == 0) ? this.f35453a : this.f35454b).a(view, i, i2, i3, i4);
        if (animationA instanceof v9e) {
            animationA.setAnimationListener(new b(id));
        } else {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
        if (animationA != null) {
            long duration = animationA.getDuration();
            if (duration > this.f) {
                this.f = duration;
                g(duration);
            }
            view.startAnimation(animationA);
        }
    }

    public void c(View view, v6e v6eVar) {
        UiThreadUtil.assertOnUiThread();
        Animation animationA = this.c.a(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (animationA == null) {
            v6eVar.onAnimationEnd();
            return;
        }
        d(view);
        animationA.setAnimationListener(new c(v6eVar));
        long duration = animationA.getDuration();
        if (duration > this.f) {
            g(duration);
            this.f = duration;
        }
        view.startAnimation(animationA);
    }

    public final void d(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i));
            }
        }
    }

    public void e(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            f();
            return;
        }
        this.e = false;
        int i = readableMap.hasKey("duration") ? readableMap.getInt("duration") : 0;
        w6e w6eVar = w6e.CREATE;
        if (readableMap.hasKey(w6e.a(w6eVar))) {
            this.f35453a.d(readableMap.getMap(w6e.a(w6eVar)), i);
            this.e = true;
        }
        w6e w6eVar2 = w6e.UPDATE;
        if (readableMap.hasKey(w6e.a(w6eVar2))) {
            this.f35454b.d(readableMap.getMap(w6e.a(w6eVar2)), i);
            this.e = true;
        }
        w6e w6eVar3 = w6e.DELETE;
        if (readableMap.hasKey(w6e.a(w6eVar3))) {
            this.c.d(readableMap.getMap(w6e.a(w6eVar3)), i);
            this.e = true;
        }
        if (!this.e || callback == null) {
            return;
        }
        this.g = new a(callback);
    }

    public void f() {
        this.f35453a.f();
        this.f35454b.f();
        this.c.f();
        this.g = null;
        this.e = false;
        this.f = -1L;
    }

    public final void g(long j) {
        if (h == null) {
            h = new Handler(Looper.getMainLooper());
        }
        Runnable runnable = this.g;
        if (runnable != null) {
            h.removeCallbacks(runnable);
            h.postDelayed(this.g, j);
        }
    }

    public boolean h(View view) {
        if (view == null) {
            return false;
        }
        return (this.e && view.getParent() != null) || this.d.get(view.getId()) != null;
    }
}

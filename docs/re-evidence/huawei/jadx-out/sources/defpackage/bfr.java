package defpackage;

import com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bfr {
    private static final Map<String, List<VectorAnimation>> e;

    static {
        HashMap map = new HashMap();
        e = map;
        map.put("rotate", Collections.singletonList(new c(true)));
        map.put("translateX", Collections.singletonList(new g(true)));
        map.put("translateY", Collections.singletonList(new i(true)));
        map.put("translateXY", Collections.singletonList(new h(true)));
        map.put("scale", Collections.singletonList(new j(true)));
        map.put("breath", Collections.singletonList(new a(0L, true)));
        map.put("-rotate", Collections.singletonList(new c(false)));
        map.put("-translateX", Collections.singletonList(new g(false)));
        map.put("-translateY", Collections.singletonList(new i(false)));
        map.put("-translateXY", Collections.singletonList(new h(false)));
        map.put("-scale", Collections.singletonList(new j(false)));
        map.put("-breath", Collections.singletonList(new a(0L, false)));
        map.put("0", Collections.singletonList(new b()));
        map.put("1", Collections.singletonList(new d()));
        map.put("2", Collections.singletonList(new e()));
    }

    public static List<VectorAnimation> e(String str) {
        return e.get(str);
    }

    public static class c implements VectorAnimation {
        private final boolean d;

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public int getDuration() {
            return 5000;
        }

        public c(boolean z) {
            this.d = z;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public List<VectorAnimation.b> getScaleKeyFrames() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new VectorAnimation.b(0.0f, 1.6f));
            arrayList.add(new VectorAnimation.b(1.0f, 1.0f));
            return arrayList;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public List<VectorAnimation.b> getRotateKeyFrame() {
            ArrayList arrayList = new ArrayList();
            if (this.d) {
                arrayList.add(new VectorAnimation.b(0.0f, -45.0f));
            } else {
                arrayList.add(new VectorAnimation.b(0.0f, 45.0f));
            }
            arrayList.add(new VectorAnimation.b(1.0f, 0.0f));
            return arrayList;
        }
    }

    public static class j implements VectorAnimation {
        private final boolean e;

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public int getDuration() {
            return 5000;
        }

        public j(boolean z) {
            this.e = z;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public List<VectorAnimation.b> getScaleKeyFrames() {
            ArrayList arrayList = new ArrayList();
            if (this.e) {
                arrayList.add(new VectorAnimation.b(0.0f, 1.5f));
                arrayList.add(new VectorAnimation.b(1.0f, 1.0f));
                return arrayList;
            }
            arrayList.add(new VectorAnimation.b(0.0f, 1.0f));
            arrayList.add(new VectorAnimation.b(1.0f, 1.5f));
            return arrayList;
        }
    }

    public static class g implements VectorAnimation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f1068c;

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public int getDuration() {
            return 5000;
        }

        public g(boolean z) {
            this.f1068c = z;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public List<VectorAnimation.b> getTranslateXKeyFrames() {
            ArrayList arrayList = new ArrayList();
            if (this.f1068c) {
                arrayList.add(new VectorAnimation.b(0.0f, 0.5f));
                arrayList.add(new VectorAnimation.b(1.0f, -0.5f));
                return arrayList;
            }
            arrayList.add(new VectorAnimation.b(0.0f, -0.5f));
            arrayList.add(new VectorAnimation.b(1.0f, 0.5f));
            return arrayList;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public List<VectorAnimation.b> getScaleKeyFrames() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new VectorAnimation.b(0.0f, 2.0f));
            arrayList.add(new VectorAnimation.b(1.0f, 2.0f));
            return arrayList;
        }
    }

    public static class i implements VectorAnimation {
        private final boolean e;

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public int getDuration() {
            return 5000;
        }

        public i(boolean z) {
            this.e = z;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public List<VectorAnimation.b> getTranslateYKeyFrames() {
            ArrayList arrayList = new ArrayList();
            if (this.e) {
                arrayList.add(new VectorAnimation.b(0.0f, -0.5f));
                arrayList.add(new VectorAnimation.b(1.0f, 0.5f));
                return arrayList;
            }
            arrayList.add(new VectorAnimation.b(0.0f, 0.5f));
            arrayList.add(new VectorAnimation.b(1.0f, -0.5f));
            return arrayList;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public List<VectorAnimation.b> getScaleKeyFrames() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new VectorAnimation.b(0.0f, 2.0f));
            arrayList.add(new VectorAnimation.b(1.0f, 2.0f));
            return arrayList;
        }
    }

    public static class h implements VectorAnimation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f1069c;

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public int getDuration() {
            return 5000;
        }

        public h(boolean z) {
            this.f1069c = z;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public List<VectorAnimation.b> getTranslateXKeyFrames() {
            ArrayList arrayList = new ArrayList();
            if (this.f1069c) {
                arrayList.add(new VectorAnimation.b(0.0f, 0.5f));
                arrayList.add(new VectorAnimation.b(1.0f, -0.5f));
                return arrayList;
            }
            arrayList.add(new VectorAnimation.b(0.0f, -0.5f));
            arrayList.add(new VectorAnimation.b(1.0f, 0.5f));
            return arrayList;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public List<VectorAnimation.b> getTranslateYKeyFrames() {
            ArrayList arrayList = new ArrayList();
            if (this.f1069c) {
                arrayList.add(new VectorAnimation.b(0.0f, -0.5f));
                arrayList.add(new VectorAnimation.b(1.0f, 0.5f));
                return arrayList;
            }
            arrayList.add(new VectorAnimation.b(0.0f, 0.5f));
            arrayList.add(new VectorAnimation.b(1.0f, -0.5f));
            return arrayList;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public List<VectorAnimation.b> getScaleKeyFrames() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new VectorAnimation.b(0.0f, 2.0f));
            arrayList.add(new VectorAnimation.b(1.0f, 2.0f));
            return arrayList;
        }
    }

    public static class a implements VectorAnimation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f1067a;
        private final long d;

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public int getDuration() {
            return 5000;
        }

        public a(long j, boolean z) {
            this.d = j;
            this.f1067a = z;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public List<VectorAnimation.b> getScaleKeyFrames() {
            ArrayList arrayList = new ArrayList();
            if (this.f1067a) {
                arrayList.add(new VectorAnimation.b(0.0f, 1.0f));
                arrayList.add(new VectorAnimation.b(0.5f, 1.5f));
                arrayList.add(new VectorAnimation.b(1.0f, 1.0f));
                return arrayList;
            }
            arrayList.add(new VectorAnimation.b(0.0f, 1.5f));
            arrayList.add(new VectorAnimation.b(0.5f, 1.0f));
            arrayList.add(new VectorAnimation.b(1.0f, 1.5f));
            return arrayList;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public long getStartDelay() {
            return this.d;
        }
    }

    public static class b implements VectorAnimation {
        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public int getDuration() {
            return 1000;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public List<VectorAnimation.b> getScaleKeyFrames() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new VectorAnimation.b(0.0f, 1.6f));
            arrayList.add(new VectorAnimation.b(1.0f, 1.0f));
            return arrayList;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public List<VectorAnimation.b> getRotateKeyFrame() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new VectorAnimation.b(0.0f, -30.0f));
            arrayList.add(new VectorAnimation.b(1.0f, 0.0f));
            return arrayList;
        }
    }

    public static class d implements VectorAnimation {
        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public int getDuration() {
            return 1000;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public List<VectorAnimation.b> getScaleKeyFrames() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new VectorAnimation.b(0.0f, 2.0f));
            arrayList.add(new VectorAnimation.b(0.6f, 1.0f));
            arrayList.add(new VectorAnimation.b(0.8f, 1.02f));
            arrayList.add(new VectorAnimation.b(1.0f, 1.0f));
            return arrayList;
        }
    }

    public static class e implements VectorAnimation {
        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public int getDuration() {
            return 2000;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public List<VectorAnimation.b> getTranslateXKeyFrames() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new VectorAnimation.b(0.0f, 0.5f));
            arrayList.add(new VectorAnimation.b(1.0f, 0.0f));
            return arrayList;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation
        public List<VectorAnimation.b> getScaleKeyFrames() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new VectorAnimation.b(0.0f, 2.0f));
            arrayList.add(new VectorAnimation.b(0.25f, 2.0f));
            arrayList.add(new VectorAnimation.b(1.0f, 1.0f));
            return arrayList;
        }
    }
}

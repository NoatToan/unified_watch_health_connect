package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Mask> f33752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<BaseKeyframeAnimation<Integer, Integer>> f33753b;
    private final List<BaseKeyframeAnimation<gq, Path>> e;

    public fa(List<Mask> list) {
        this.f33752a = list;
        this.e = new ArrayList(list.size());
        this.f33753b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.e.add(list.get(i).c().createAnimation());
            this.f33753b.add(list.get(i).a().createAnimation());
        }
    }

    public List<Mask> b() {
        return this.f33752a;
    }

    public List<BaseKeyframeAnimation<gq, Path>> e() {
        return this.e;
    }

    public List<BaseKeyframeAnimation<Integer, Integer>> a() {
        return this.f33753b;
    }
}

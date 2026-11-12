package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CompoundTrimPathContent {
    private List<TrimPathContent> a = new ArrayList();

    public void a(TrimPathContent trimPathContent) {
        this.a.add(trimPathContent);
    }

    public void apply(Path path) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Utils.applyTrimPathIfNeeded(path, this.a.get(size));
        }
    }
}

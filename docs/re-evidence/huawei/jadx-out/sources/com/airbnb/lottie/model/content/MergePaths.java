package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.layer.BaseLayer;
import defpackage.cx;
import defpackage.er;
import defpackage.iy;

/* JADX INFO: loaded from: classes21.dex */
public class MergePaths implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MergePathsMode f1936b;
    private final String d;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i == 5) {
                return EXCLUDE_INTERSECTIONS;
            }
            return MERGE;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.d = str;
        this.f1936b = mergePathsMode;
        this.f1935a = z;
    }

    public String d() {
        return this.d;
    }

    public MergePathsMode b() {
        return this.f1936b;
    }

    public boolean e() {
        return this.f1935a;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, cx cxVar, BaseLayer baseLayer) {
        if (!lottieDrawable.c()) {
            iy.d("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new er(this);
    }

    public String toString() {
        return "MergePaths{mode=" + this.f1936b + '}';
    }
}

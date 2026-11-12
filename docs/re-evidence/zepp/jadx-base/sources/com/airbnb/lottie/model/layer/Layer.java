package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class Layer {
    private final List<ContentModel> a;
    private final LottieComposition b;
    private final String c;
    private final long d;
    private final LayerType e;
    private final long f;

    @Nullable
    private final String g;
    private final List<Mask> h;
    private final AnimatableTransform i;
    private final int j;
    private final int k;
    private final int l;
    private final float m;
    private final float n;
    private final int o;
    private final int p;

    @Nullable
    private final AnimatableTextFrame q;

    @Nullable
    private final AnimatableTextProperties r;

    @Nullable
    private final AnimatableFloatValue s;
    private final List<Keyframe<Float>> t;
    private final MatteType u;
    private final boolean v;

    @Nullable
    private final BlurEffect w;

    @Nullable
    private final DropShadowEffect x;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<ContentModel> list, LottieComposition lottieComposition, String str, long j, LayerType layerType, long j2, @Nullable String str2, List<Mask> list2, AnimatableTransform animatableTransform, int i, int i2, int i3, float f, float f2, int i4, int i5, @Nullable AnimatableTextFrame animatableTextFrame, @Nullable AnimatableTextProperties animatableTextProperties, List<Keyframe<Float>> list3, MatteType matteType, @Nullable AnimatableFloatValue animatableFloatValue, boolean z, @Nullable BlurEffect blurEffect, @Nullable DropShadowEffect dropShadowEffect) {
        this.a = list;
        this.b = lottieComposition;
        this.c = str;
        this.d = j;
        this.e = layerType;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = animatableTransform;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = i4;
        this.p = i5;
        this.q = animatableTextFrame;
        this.r = animatableTextProperties;
        this.t = list3;
        this.u = matteType;
        this.s = animatableFloatValue;
        this.v = z;
        this.w = blurEffect;
        this.x = dropShadowEffect;
    }

    public LottieComposition a() {
        return this.b;
    }

    public List<Keyframe<Float>> b() {
        return this.t;
    }

    public List<Mask> c() {
        return this.h;
    }

    public MatteType d() {
        return this.u;
    }

    public String e() {
        return this.c;
    }

    public long f() {
        return this.f;
    }

    public int g() {
        return this.p;
    }

    @Nullable
    public BlurEffect getBlurEffect() {
        return this.w;
    }

    @Nullable
    public DropShadowEffect getDropShadowEffect() {
        return this.x;
    }

    public long getId() {
        return this.d;
    }

    public LayerType getLayerType() {
        return this.e;
    }

    public int h() {
        return this.o;
    }

    @Nullable
    public String i() {
        return this.g;
    }

    public boolean isHidden() {
        return this.v;
    }

    public List<ContentModel> j() {
        return this.a;
    }

    public int k() {
        return this.l;
    }

    public int l() {
        return this.k;
    }

    public int m() {
        return this.j;
    }

    public float n() {
        return this.n / this.b.getDurationFrames();
    }

    @Nullable
    public AnimatableTextFrame o() {
        return this.q;
    }

    @Nullable
    public AnimatableTextProperties p() {
        return this.r;
    }

    @Nullable
    public AnimatableFloatValue q() {
        return this.s;
    }

    public float r() {
        return this.m;
    }

    public AnimatableTransform s() {
        return this.i;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(e());
        sb.append("\n");
        Layer layerLayerModelForId = this.b.layerModelForId(f());
        if (layerLayerModelForId != null) {
            sb.append("\t\tParents: ");
            sb.append(layerLayerModelForId.e());
            Layer layerLayerModelForId2 = this.b.layerModelForId(layerLayerModelForId.f());
            while (layerLayerModelForId2 != null) {
                sb.append("->");
                sb.append(layerLayerModelForId2.e());
                layerLayerModelForId2 = this.b.layerModelForId(layerLayerModelForId2.f());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!c().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(c().size());
            sb.append("\n");
        }
        if (m() != 0 && l() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(m()), Integer.valueOf(l()), Integer.valueOf(k())));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (ContentModel contentModel : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(contentModel);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}

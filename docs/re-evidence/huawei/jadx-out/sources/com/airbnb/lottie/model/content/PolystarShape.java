package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import defpackage.cx;
import defpackage.ep;
import defpackage.fu;

/* JADX INFO: loaded from: classes21.dex */
public class PolystarShape implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fu f1937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f1939c;
    private final fu d;
    private final String e;
    private final fu f;
    private final AnimatableValue<PointF, PointF> g;
    private final fu h;
    private final fu i;
    private final fu j;
    private final Type o;

    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type forValue(int i) {
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, fu fuVar, AnimatableValue<PointF, PointF> animatableValue, fu fuVar2, fu fuVar3, fu fuVar4, fu fuVar5, fu fuVar6, boolean z, boolean z2) {
        this.e = str;
        this.o = type;
        this.i = fuVar;
        this.g = animatableValue;
        this.h = fuVar2;
        this.d = fuVar3;
        this.f = fuVar4;
        this.f1937a = fuVar5;
        this.j = fuVar6;
        this.f1939c = z;
        this.f1938b = z2;
    }

    public String e() {
        return this.e;
    }

    public Type h() {
        return this.o;
    }

    public fu j() {
        return this.i;
    }

    public AnimatableValue<PointF, PointF> i() {
        return this.g;
    }

    public fu f() {
        return this.h;
    }

    public fu b() {
        return this.d;
    }

    public fu c() {
        return this.f;
    }

    public fu a() {
        return this.f1937a;
    }

    public fu d() {
        return this.j;
    }

    public boolean g() {
        return this.f1939c;
    }

    public boolean m() {
        return this.f1938b;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, cx cxVar, BaseLayer baseLayer) {
        return new ep(lottieDrawable, baseLayer, this);
    }
}

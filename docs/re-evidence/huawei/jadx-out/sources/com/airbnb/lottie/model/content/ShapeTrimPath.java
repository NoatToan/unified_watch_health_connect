package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.layer.BaseLayer;
import defpackage.cx;
import defpackage.ev;
import defpackage.fu;

/* JADX INFO: loaded from: classes21.dex */
public class ShapeTrimPath implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fu f1945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fu f1947c;
    private final fu d;
    private final boolean e;
    private final Type g;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public ShapeTrimPath(String str, Type type, fu fuVar, fu fuVar2, fu fuVar3, boolean z) {
        this.f1946b = str;
        this.g = type;
        this.f1947c = fuVar;
        this.d = fuVar2;
        this.f1945a = fuVar3;
        this.e = z;
    }

    public String c() {
        return this.f1946b;
    }

    public Type d() {
        return this.g;
    }

    public fu a() {
        return this.d;
    }

    public fu b() {
        return this.f1947c;
    }

    public fu e() {
        return this.f1945a;
    }

    public boolean j() {
        return this.e;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, cx cxVar, BaseLayer baseLayer) {
        return new ev(baseLayer, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.f1947c + ", end: " + this.d + ", offset: " + this.f1945a + "}";
    }
}

package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.gj3;
import defpackage.h55;
import defpackage.xoo;
import defpackage.yoo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<xoo> f8333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<h55> f8334b;
    public int c;
    public float d;
    public gj3 e;
    public float f;

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }

    public static h55 b(h55 h55Var) {
        h55.b bVarP = h55Var.a().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (h55Var.f == 0) {
            bVarP.h(1.0f - h55Var.e, 0);
        } else {
            bVarP.h((-h55Var.e) - 1.0f, 1);
        }
        int i = h55Var.g;
        if (i == 0) {
            bVarP.i(2);
        } else if (i == 2) {
            bVarP.i(0);
        }
        return bVarP.a();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<h55> list, gj3 gj3Var, float f, int i, float f2) {
        this.f8334b = list;
        this.e = gj3Var;
        this.d = f;
        this.c = i;
        this.f = f2;
        while (this.f8333a.size() < list.size()) {
            this.f8333a.add(new xoo(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<h55> list = this.f8334b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float fA = yoo.a(this.c, this.d, height, i);
        if (fA <= 0.0f) {
            return;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            h55 h55VarB = list.get(i2);
            if (h55VarB.p != Integer.MIN_VALUE) {
                h55VarB = b(h55VarB);
            }
            h55 h55Var = h55VarB;
            int i3 = paddingBottom;
            this.f8333a.get(i2).b(h55Var, this.e, fA, yoo.a(h55Var.n, h55Var.o, height, i), this.f, canvas, paddingLeft, paddingTop, width, i3);
            i2++;
            size = size;
            i = i;
            paddingBottom = i3;
            width = width;
        }
    }

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8333a = new ArrayList();
        this.f8334b = Collections.emptyList();
        this.c = 0;
        this.d = 0.0533f;
        this.e = gj3.g;
        this.f = 0.08f;
    }
}

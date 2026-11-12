package com.huawei.ui.commonui.interval;

import android.content.Context;
import defpackage.qre;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class IntervalCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CardType f23576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharSequence f23577c;
    private int d;
    private CharSequence e;
    private int f;
    private int g;
    private boolean h;
    private List<IntervalData> i;
    private float j;
    private int k;
    private float l;
    private int m;
    private float n;
    private int o;

    public enum CardType {
        SMALL,
        MEDIUM,
        LARGE
    }

    public int b(Context context) {
        int i = this.k;
        return i == 0 ? qre.e(context, this.o) : i;
    }

    public void c(int i) {
        this.o = i;
    }

    public float f() {
        return this.l;
    }

    public void c(float f) {
        this.l = f;
    }

    public float a() {
        return this.j;
    }

    public void d(float f) {
        this.j = f;
    }

    public CardType d() {
        return this.f23576b;
    }

    public void e(CardType cardType) {
        this.f23576b = cardType;
    }

    public CharSequence b() {
        return this.f23577c;
    }

    public void e(CharSequence charSequence) {
        this.f23577c = charSequence;
    }

    public CharSequence e() {
        return this.e;
    }

    public void a(CharSequence charSequence) {
        this.e = charSequence;
    }

    public List<IntervalData> c() {
        return this.i;
    }

    public void c(List<IntervalData> list) {
        this.i = list;
    }

    public int h() {
        return this.m;
    }

    public void b(int i) {
        this.m = i;
    }

    public boolean j() {
        return this.h;
    }

    public void b(boolean z) {
        this.h = z;
    }

    public String toString() {
        return "IntervalCardData{mMainColor=" + this.k + ", mMainColorId=" + this.o + ", mContentColor=" + this.d + ", mContentColorId=" + this.f23575a + ", mDescriptionColor=" + this.g + ", mDescriptionColorId=" + this.f + ", mWidth=" + this.l + ", mHeight=" + this.j + ", mCardType=" + this.f23576b + ", mContent=" + ((Object) this.f23577c) + ", mDescription=" + ((Object) this.e) + ", mIntervalDataList=" + this.i + ", mPosition=" + this.m + ", mPositionProportion=" + this.n + ", mIsAnimation=" + this.h + '}';
    }
}

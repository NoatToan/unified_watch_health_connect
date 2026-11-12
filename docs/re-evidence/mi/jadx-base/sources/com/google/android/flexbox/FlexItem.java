package com.google.android.flexbox;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
interface FlexItem extends Parcelable {
    public static final float FLEX_BASIS_PERCENT_DEFAULT = -1.0f;
    public static final float FLEX_GROW_DEFAULT = 0.0f;
    public static final float FLEX_SHRINK_DEFAULT = 1.0f;
    public static final float FLEX_SHRINK_NOT_SET = 0.0f;
    public static final int MAX_SIZE = 16777215;
    public static final int ORDER_DEFAULT = 1;

    int D();

    int S();

    float T();

    void Z(int i);

    float b0();

    float c0();

    boolean d0();

    int f0();

    int getHeight();

    int getOrder();

    int getWidth();

    void m0(int i);

    int n0();

    int p();

    int r0();

    int s();

    int s0();

    int t0();
}

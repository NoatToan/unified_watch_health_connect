package com.google.typography.font.sfntly.data;

import defpackage.r63;

/* JADX INFO: loaded from: classes5.dex */
public abstract class FontData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r63<? extends r63<?>> f9792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9793b;
    public int c;

    public enum DataSize {
        BYTE(1),
        CHAR(1),
        USHORT(2),
        SHORT(2),
        UINT24(3),
        ULONG(4),
        LONG(4),
        Fixed(4),
        FUNIT(4),
        FWORD(2),
        UFWORD(2),
        F2DOT14(2),
        LONGDATETIME(8),
        Tag(4),
        GlyphID(2),
        Offset(2);

        private final int size;

        DataSize(int i) {
            this.size = i;
        }

        public int size() {
            return this.size;
        }
    }

    public FontData(r63<? extends r63<?>> r63Var) {
        this.c = Integer.MAX_VALUE;
        this.f9792a = r63Var;
    }

    public boolean a(int i, int i2) {
        if (i + i2 > f() || i < 0 || i2 < 0) {
            return false;
        }
        this.f9793b += i;
        this.c = i2;
        return true;
    }

    public final int b(int i, int i2) {
        return Math.min(i2, this.c - i);
    }

    public final int c(int i) {
        return i + this.f9793b;
    }

    public final boolean d(int i, int i2) {
        int i3;
        return i >= 0 && i < (i3 = this.c) && i2 >= 0 && i2 + i <= i3;
    }

    public int e() {
        return Math.min(this.f9792a.i() - this.f9793b, this.c);
    }

    public int f() {
        return Math.min(this.f9792a.m() - this.f9793b, this.c);
    }

    public FontData(FontData fontData, int i, int i2) {
        this(fontData.f9792a);
        a(fontData.f9793b + i, i2);
    }

    public FontData(FontData fontData, int i) {
        this(fontData.f9792a);
        int i2 = fontData.f9793b + i;
        int i3 = fontData.c;
        a(i2, i3 != Integer.MAX_VALUE ? i3 - i : Integer.MAX_VALUE);
    }
}

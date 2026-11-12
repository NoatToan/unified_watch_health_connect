package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.Dimension;
import androidx.annotation.RestrictTo;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.h2j;
import defpackage.iyi;
import defpackage.j7p;
import defpackage.k3j;
import defpackage.k8f;
import defpackage.pmi;
import defpackage.z47;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class BadgeState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final State f8531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final State f8532b;
    public final float c;
    public final float d;
    public final float e;

    public BadgeState(Context context, int i, int i2, int i3, State state) {
        State state2 = new State();
        this.f8532b = state2;
        state = state == null ? new State() : state;
        if (i != 0) {
            state.f8533a = i;
        }
        TypedArray typedArrayA = a(context, state.f8533a, i2, i3);
        Resources resources = context.getResources();
        this.c = typedArrayA.getDimensionPixelSize(b4j.G, resources.getDimensionPixelSize(pmi.Q));
        this.e = typedArrayA.getDimensionPixelSize(b4j.I, resources.getDimensionPixelSize(pmi.P));
        this.d = typedArrayA.getDimensionPixelSize(b4j.J, resources.getDimensionPixelSize(pmi.S));
        state2.d = state.d == -2 ? 255 : state.d;
        state2.h = state.h == null ? context.getString(h2j.s) : state.h;
        state2.i = state.i == 0 ? iyi.f22228a : state.i;
        state2.j = state.j == 0 ? h2j.u : state.j;
        state2.l = Boolean.valueOf(state.l == null || state.l.booleanValue());
        state2.f = state.f == -2 ? typedArrayA.getInt(b4j.M, 4) : state.f;
        if (state.e != -2) {
            state2.e = state.e;
        } else if (typedArrayA.hasValue(b4j.N)) {
            state2.e = typedArrayA.getInt(b4j.N, 0);
        } else {
            state2.e = -1;
        }
        state2.f8534b = Integer.valueOf(state.f8534b == null ? u(context, typedArrayA, b4j.E) : state.f8534b.intValue());
        if (state.c != null) {
            state2.c = state.c;
        } else if (typedArrayA.hasValue(b4j.H)) {
            state2.c = Integer.valueOf(u(context, typedArrayA, b4j.H));
        } else {
            state2.c = Integer.valueOf(new j7p(context, k3j.e).i().getDefaultColor());
        }
        state2.f8535k = Integer.valueOf(state.f8535k == null ? typedArrayA.getInt(b4j.F, 8388661) : state.f8535k.intValue());
        state2.m = Integer.valueOf(state.m == null ? typedArrayA.getDimensionPixelOffset(b4j.K, 0) : state.m.intValue());
        state2.n = Integer.valueOf(state.m == null ? typedArrayA.getDimensionPixelOffset(b4j.O, 0) : state.n.intValue());
        state2.o = Integer.valueOf(state.o == null ? typedArrayA.getDimensionPixelOffset(b4j.L, state2.m.intValue()) : state.o.intValue());
        state2.p = Integer.valueOf(state.p == null ? typedArrayA.getDimensionPixelOffset(b4j.P, state2.n.intValue()) : state.p.intValue());
        state2.q = Integer.valueOf(state.q == null ? 0 : state.q.intValue());
        state2.f8536r = Integer.valueOf(state.f8536r != null ? state.f8536r.intValue() : 0);
        typedArrayA.recycle();
        if (state.g == null) {
            state2.g = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            state2.g = state.g;
        }
        this.f8531a = state;
    }

    public static int u(Context context, TypedArray typedArray, int i) {
        return k8f.b(context, typedArray, i).getDefaultColor();
    }

    public final TypedArray a(Context context, int i, int i2, int i3) {
        AttributeSet attributeSet;
        int styleAttribute;
        if (i != 0) {
            AttributeSet attributeSetA = z47.a(context, i, "badge");
            styleAttribute = attributeSetA.getStyleAttribute();
            attributeSet = attributeSetA;
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        return c9p.h(context, attributeSet, b4j.D, i2, styleAttribute == 0 ? i3 : styleAttribute, new int[0]);
    }

    @Dimension(unit = 1)
    public int b() {
        return this.f8532b.q.intValue();
    }

    @Dimension(unit = 1)
    public int c() {
        return this.f8532b.f8536r.intValue();
    }

    public int d() {
        return this.f8532b.d;
    }

    public int e() {
        return this.f8532b.f8534b.intValue();
    }

    public int f() {
        return this.f8532b.f8535k.intValue();
    }

    public int g() {
        return this.f8532b.c.intValue();
    }

    public int h() {
        return this.f8532b.j;
    }

    public CharSequence i() {
        return this.f8532b.h;
    }

    public int j() {
        return this.f8532b.i;
    }

    @Dimension(unit = 1)
    public int k() {
        return this.f8532b.o.intValue();
    }

    @Dimension(unit = 1)
    public int l() {
        return this.f8532b.m.intValue();
    }

    public int m() {
        return this.f8532b.f;
    }

    public int n() {
        return this.f8532b.e;
    }

    public Locale o() {
        return this.f8532b.g;
    }

    public State p() {
        return this.f8531a;
    }

    @Dimension(unit = 1)
    public int q() {
        return this.f8532b.p.intValue();
    }

    @Dimension(unit = 1)
    public int r() {
        return this.f8532b.n.intValue();
    }

    public boolean s() {
        return this.f8532b.e != -1;
    }

    public boolean t() {
        return this.f8532b.l.booleanValue();
    }

    public void v(int i) {
        this.f8531a.d = i;
        this.f8532b.d = i;
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f8534b;
        public Integer c;
        public int d;
        public int e;
        public int f;
        public Locale g;
        public CharSequence h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Integer f8535k;
        public Boolean l;

        @Dimension(unit = 1)
        public Integer m;

        @Dimension(unit = 1)
        public Integer n;

        @Dimension(unit = 1)
        public Integer o;

        @Dimension(unit = 1)
        public Integer p;

        @Dimension(unit = 1)
        public Integer q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f8536r;

        public class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
            this.d = 255;
            this.e = -2;
            this.f = -2;
            this.l = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f8533a);
            parcel.writeSerializable(this.f8534b);
            parcel.writeSerializable(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            CharSequence charSequence = this.h;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.i);
            parcel.writeSerializable(this.f8535k);
            parcel.writeSerializable(this.m);
            parcel.writeSerializable(this.n);
            parcel.writeSerializable(this.o);
            parcel.writeSerializable(this.p);
            parcel.writeSerializable(this.q);
            parcel.writeSerializable(this.f8536r);
            parcel.writeSerializable(this.l);
            parcel.writeSerializable(this.g);
        }

        public State(Parcel parcel) {
            this.d = 255;
            this.e = -2;
            this.f = -2;
            this.l = Boolean.TRUE;
            this.f8533a = parcel.readInt();
            this.f8534b = (Integer) parcel.readSerializable();
            this.c = (Integer) parcel.readSerializable();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.h = parcel.readString();
            this.i = parcel.readInt();
            this.f8535k = (Integer) parcel.readSerializable();
            this.m = (Integer) parcel.readSerializable();
            this.n = (Integer) parcel.readSerializable();
            this.o = (Integer) parcel.readSerializable();
            this.p = (Integer) parcel.readSerializable();
            this.q = (Integer) parcel.readSerializable();
            this.f8536r = (Integer) parcel.readSerializable();
            this.l = (Boolean) parcel.readSerializable();
            this.g = (Locale) parcel.readSerializable();
        }
    }
}

package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.RequiresApi;
import com.google.common.collect.ImmutableList;
import defpackage.wlq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR;

    @Deprecated
    public static final TrackSelectionParameters DEFAULT;
    public static final TrackSelectionParameters DEFAULT_WITHOUT_CONTEXT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList<String> f8312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8313b;
    public final ImmutableList<String> c;
    public final int d;
    public final boolean e;
    public final int f;

    public class a implements Parcelable.Creator<TrackSelectionParameters> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackSelectionParameters createFromParcel(Parcel parcel) {
            return new TrackSelectionParameters(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackSelectionParameters[] newArray(int i) {
            return new TrackSelectionParameters[i];
        }
    }

    static {
        TrackSelectionParameters trackSelectionParametersA = new b().a();
        DEFAULT_WITHOUT_CONTEXT = trackSelectionParametersA;
        DEFAULT = trackSelectionParametersA;
        CREATOR = new a();
    }

    public TrackSelectionParameters(ImmutableList<String> immutableList, int i, ImmutableList<String> immutableList2, int i2, boolean z, int i3) {
        this.f8312a = immutableList;
        this.f8313b = i;
        this.c = immutableList2;
        this.d = i2;
        this.e = z;
        this.f = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        return this.f8312a.equals(trackSelectionParameters.f8312a) && this.f8313b == trackSelectionParameters.f8313b && this.c.equals(trackSelectionParameters.c) && this.d == trackSelectionParameters.d && this.e == trackSelectionParameters.e && this.f == trackSelectionParameters.f;
    }

    public int hashCode() {
        return ((((((((((this.f8312a.hashCode() + 31) * 31) + this.f8313b) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f8312a);
        parcel.writeInt(this.f8313b);
        parcel.writeList(this.c);
        parcel.writeInt(this.d);
        wlq.X0(parcel, this.e);
        parcel.writeInt(this.f);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImmutableList<String> f8314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8315b;
        public ImmutableList<String> c;
        public int d;
        public boolean e;
        public int f;

        public b(Context context) {
            this();
            b(context);
        }

        public TrackSelectionParameters a() {
            return new TrackSelectionParameters(this.f8314a, this.f8315b, this.c, this.d, this.e, this.f);
        }

        public b b(Context context) {
            if (wlq.f38110a >= 19) {
                c(context);
            }
            return this;
        }

        @RequiresApi(19)
        public final void c(Context context) {
            CaptioningManager captioningManager;
            if ((wlq.f38110a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.d = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.c = ImmutableList.of(wlq.T(locale));
                }
            }
        }

        @Deprecated
        public b() {
            this.f8314a = ImmutableList.of();
            this.f8315b = 0;
            this.c = ImmutableList.of();
            this.d = 0;
            this.e = false;
            this.f = 0;
        }

        public b(TrackSelectionParameters trackSelectionParameters) {
            this.f8314a = trackSelectionParameters.f8312a;
            this.f8315b = trackSelectionParameters.f8313b;
            this.c = trackSelectionParameters.c;
            this.d = trackSelectionParameters.d;
            this.e = trackSelectionParameters.e;
            this.f = trackSelectionParameters.f;
        }
    }

    public TrackSelectionParameters(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.f8312a = ImmutableList.copyOf((Collection) arrayList);
        this.f8313b = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.c = ImmutableList.copyOf((Collection) arrayList2);
        this.d = parcel.readInt();
        this.e = wlq.F0(parcel);
        this.f = parcel.readInt();
    }
}

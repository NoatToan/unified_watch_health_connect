package com.miui.circulate.api.bean;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class ExtraBundle implements Parcelable {
    public static final Parcelable.Creator<ExtraBundle> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f10286a;

    public class a implements Parcelable.Creator<ExtraBundle> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ExtraBundle createFromParcel(Parcel parcel) {
            return new ExtraBundle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ExtraBundle[] newArray(int i) {
            return new ExtraBundle[i];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f10287a = new Bundle();

        public ExtraBundle a() {
            return new ExtraBundle(this.f10287a, null);
        }

        public b b(Bundle bundle) {
            if (bundle != null) {
                this.f10287a.putAll(bundle);
            }
            return this;
        }

        public b c(String str, boolean z) {
            Bundle bundle = this.f10287a;
            Objects.requireNonNull(str);
            bundle.putBoolean(str, z);
            return this;
        }

        public b d(String str, int i) {
            Bundle bundle = this.f10287a;
            Objects.requireNonNull(str);
            bundle.putInt(str, i);
            return this;
        }

        public b e(String str, long j) {
            Bundle bundle = this.f10287a;
            Objects.requireNonNull(str);
            bundle.putLong(str, j);
            return this;
        }

        public b f(String str, String str2) {
            Bundle bundle = this.f10287a;
            Objects.requireNonNull(str);
            bundle.putString(str, str2);
            return this;
        }

        public b g(String str) {
            Bundle bundle = this.f10287a;
            Objects.requireNonNull(str);
            bundle.remove(str);
            return this;
        }
    }

    public /* synthetic */ ExtraBundle(Bundle bundle, a aVar) {
        this(bundle);
    }

    public boolean a(String str) {
        Bundle bundle = this.f10286a;
        Objects.requireNonNull(str);
        return bundle.containsKey(str);
    }

    public Bundle c() {
        return this.f10286a;
    }

    public boolean d(String str, boolean z) {
        return this.f10286a.getBoolean(str, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e(String str, int i) {
        return this.f10286a.getInt(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ExtraBundle.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f10286a, ((ExtraBundle) obj).f10286a);
    }

    public String f(String str, String str2) {
        return this.f10286a.getString(str, str2);
    }

    public int hashCode() {
        return Objects.hash(this.f10286a);
    }

    public String toString() {
        return "ExtraBundle{extraBundle=" + this.f10286a + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f10286a);
    }

    public ExtraBundle(Bundle bundle) {
        Objects.requireNonNull(bundle);
        this.f10286a = bundle;
    }

    public ExtraBundle(Parcel parcel) {
        this.f10286a = parcel.readBundle(ExtraBundle.class.getClassLoader());
    }
}

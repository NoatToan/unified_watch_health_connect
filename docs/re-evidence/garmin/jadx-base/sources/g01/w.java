package g01;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lg01/w;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public enum w implements Parcelable {
    GENERIC,
    BRAND;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<w> CREATOR = new Parcelable.Creator<w>() { // from class: g01.w.b
        @Override // android.os.Parcelable.Creator
        public final w createFromParcel(Parcel parcel) {
            parcel.getClass();
            return w.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final w[] newArray(int i14) {
            return new w[i14];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f74269a = o13.m.a(o13.n.PUBLICATION, new q(7));

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(name());
    }

    /* JADX INFO: renamed from: g01.w$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/w$a;", "", "<init>", "()V", "Li63/c;", "Lg01/w;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<w> serializer() {
            return (i63.c) w.f74269a.getValue();
        }

        private Companion() {
        }
    }
}

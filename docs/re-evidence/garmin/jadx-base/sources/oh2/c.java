package oh2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import tn.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\rBG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Loh2/c;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", FirebaseAnalytics.Param.INDEX, "", "isRequired", "controlDrawable", "controlText", "rank", "<init>", "(Ljava/lang/String;ILjava/lang/Boolean;III)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements Parcelable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f132171h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f132173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f132174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f132175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f132176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f132177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f132170g = new a(null);
    public static final Parcelable.Creator<c> CREATOR = new b();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new c(string, i14, boolValueOf, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(String str, int i14, Boolean bool, int i15, int i16, int i17, int i18, j jVar) {
        this((i18 & 1) != 0 ? null : str, (i18 & 2) != 0 ? 0 : i14, (i18 & 4) != 0 ? null : bool, (i18 & 8) != 0 ? 0 : i15, (i18 & 16) != 0 ? 0 : i16, (i18 & 32) != 0 ? 0 : i17);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f132172a);
        parcel.writeInt(this.f132173b);
        Boolean bool = this.f132174c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        parcel.writeInt(this.f132175d);
        parcel.writeInt(this.f132176e);
        parcel.writeInt(this.f132177f);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loh2/c$a;", "", "<init>", "()V", "", "sOrderNumber", "I", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public c(String str, int i14, Boolean bool, int i15, int i16, int i17) {
        this.f132172a = str;
        this.f132173b = i14;
        this.f132174c = bool;
        this.f132175d = i15;
        this.f132176e = i16;
        this.f132177f = i17;
    }

    public c() {
        this(null, 0, null, 0, 0, 0, 63, null);
    }
}

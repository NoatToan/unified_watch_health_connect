package c22;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lc22/g2;", "Lc22/c3;", "a", "hash", "", "gcm-common-strings_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g2 implements c3 {
    public static final Parcelable.Creator<g2> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23059a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<g2> {
        @Override // android.os.Parcelable.Creator
        public final g2 createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            Parcelable.Creator<g2> creator = g2.CREATOR;
            string.getClass();
            return g2.b(string);
        }

        @Override // android.os.Parcelable.Creator
        public final g2[] newArray(int i14) {
            return new g2[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    private /* synthetic */ g2(String str) {
        this.f23059a = str;
    }

    public static final /* synthetic */ g2 b(String str) {
        return new g2(str);
    }

    public static final boolean d(String str, String str2) {
        return p005kotlin.jvm.internal.s.g(str, str2);
    }

    public static final String f(String str) {
        String strA;
        try {
            c2.f23014a.getClass();
            c2 c2VarA = c2.a.a();
            return (c2VarA == null || (strA = c2VarA.a(str)) == null) ? "" : strA;
        } catch (Exception e4) {
            int i14 = gt2.c.f79010a;
            gt2.b.f79005a.h("OnDemandStringHandle").error("getString: OnDemandResources is not initialized yet", (Throwable) e4);
            return "";
        }
    }

    public static String g(String str) {
        return am.j.m("OnDemandStringHandle(hash=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g2) {
            return p005kotlin.jvm.internal.s.g(this.f23059a, ((g2) obj).f23059a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23059a.hashCode();
    }

    public final String toString() {
        return g(this.f23059a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f23059a);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc22/g2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-strings_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

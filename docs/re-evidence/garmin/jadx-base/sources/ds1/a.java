package ds1;

import androidx.recyclerview.widget.o;
import b71.i;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import j23.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fB;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lds1/a;", "", "", "userId", "", "displayName", "fullName", "taggingHint", "Lb12/b;", "userProfileImageData", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb12/b;)V", "b", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f61090f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f61091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f61094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b12.b f61095e;

    /* JADX INFO: renamed from: ds1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"ds1/a$a", "Landroidx/recyclerview/widget/o$f;", "Lds1/a;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1296a extends o.f<a> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            aVar3.getClass();
            aVar4.getClass();
            return aVar3.equals(aVar4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            aVar3.getClass();
            aVar4.getClass();
            Long l14 = aVar3.f61091a;
            if (l14 != null) {
                long jLongValue = l14.longValue();
                Long l15 = aVar4.f61091a;
                if (l15 != null && jLongValue == l15.longValue()) {
                    return true;
                }
            }
            String str = aVar3.f61092b;
            return str != null && s.g(str, aVar4.f61092b);
        }
    }

    static {
        new b(null);
        f61090f = b12.b.f14385f;
        new C1296a();
    }

    public /* synthetic */ a(Long l14, String str, String str2, String str3, b12.b bVar, int i14, j jVar) {
        this(l14, str, str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? b12.b.f14386g : bVar);
    }

    public final String a() {
        String str = this.f61093c;
        if (str != null && !w.J(str)) {
            return str;
        }
        String str2 = this.f61092b;
        if (str2 != null) {
            return str2;
        }
        String string = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).h().getString(R.string.lbl_anonymous);
        string.getClass();
        return string;
    }

    public final String b() {
        return a().length() <= 20 ? a() : w.b0(a(), t.o(0, 20)).concat("...");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f61091a, aVar.f61091a) && s.g(this.f61092b, aVar.f61092b) && s.g(this.f61093c, aVar.f61093c) && s.g(this.f61094d, aVar.f61094d) && s.g(this.f61095e, aVar.f61095e);
    }

    public final int hashCode() {
        Long l14 = this.f61091a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f61092b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61093c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61094d;
        return this.f61095e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = i.j("Tag(userId=", ", displayName=", this.f61092b, this.f61091a, ", fullName=");
        sn.a.t(sbJ, this.f61093c, ", taggingHint=", this.f61094d, ", userProfileImageData=");
        sbJ.append(this.f61095e);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lds1/a$b;", "", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public a(Long l14, String str, String str2, String str3, b12.b bVar) {
        bVar.getClass();
        this.f61091a = l14;
        this.f61092b = str;
        this.f61093c = str2;
        this.f61094d = str3;
        this.f61095e = bVar;
    }
}

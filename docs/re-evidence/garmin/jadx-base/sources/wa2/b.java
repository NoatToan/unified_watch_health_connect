package wa2;

import android.annotation.SuppressLint;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lwa2/b;", "", "", "classTag", "groupTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"LongLogTag"})
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f183801c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183803b;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f183801c = gt2.b.f79005a.h("ER-ExportableReports");
    }

    public b(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f183802a = str;
        this.f183803b = str2;
    }

    public final void a(String str) {
        StringBuilder sbI = p6.b.i("ExportableReports:Group=", this.f183803b, ":Class=", this.f183802a, ":Message=");
        sbI.append(str);
        f183801c.error(sbI.toString());
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lwa2/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(String str, String str2, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? "" : str2);
    }
}

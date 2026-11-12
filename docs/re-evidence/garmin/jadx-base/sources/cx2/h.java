package cx2;

import android.annotation.SuppressLint;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcx2/h;", "", "", "classTag", "groupTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SuppressLint({"LongLogTag"})
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f56678c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56680b;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f56678c = gt2.b.f79005a.h("#RTS");
    }

    public h(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f56679a = str;
        this.f56680b = str2;
    }

    public static void a(String str) {
        int length;
        if (str.length() <= 4096 || (length = str.length() / 4096) < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            int i15 = i14 + 1;
            int i16 = i15 * 4096;
            if (i16 >= str.length()) {
                str.substring(i14 * 4096);
            } else {
                str.substring(i14 * 4096, i16);
            }
            if (i14 == length) {
                return;
            } else {
                i14 = i15;
            }
        }
    }

    public static void c(h hVar, String str) {
        hVar.getClass();
    }

    public final void b(String str) {
        StringBuilder sbI = p6.b.i("#RTS:Group=", this.f56680b, ":Class=", this.f56679a, ":Message=");
        sbI.append(str);
        f56678c.debug(sbI.toString());
    }

    public final void d(Exception exc, String str) {
        StringBuilder sbI = p6.b.i("#RTS:Group=", this.f56680b, ":Class=", this.f56679a, ":Message=");
        sbI.append(str);
        f56678c.error(sbI.toString(), (Throwable) exc);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcx2/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "", "LOGGER_ENTRY_MAX_LEN", "I", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ h(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? "" : str2);
    }
}

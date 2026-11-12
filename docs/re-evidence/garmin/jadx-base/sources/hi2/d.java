package hi2;

import android.annotation.SuppressLint;
import ch.qos.logback.classic.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lhi2/d;", "", "", "classTag", "groupTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"LongLogTag"})
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f83889c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83891b;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f83889c = gt2.b.f79005a.i("DSL-DynamicSettings");
    }

    public d(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f83890a = str;
        this.f83891b = str2;
    }

    public final void a(String str) {
        StringBuilder sbI = p6.b.i("DynamicSettings:Group=", this.f83891b, ":Class=", this.f83890a, ":Message=");
        sbI.append(str);
        f83889c.debug(sbI.toString());
    }

    public final void b(String str) {
        StringBuilder sbI = p6.b.i("DynamicSettings:Group=", this.f83891b, ":Class=", this.f83890a, ":Message=");
        sbI.append(str);
        f83889c.error(sbI.toString());
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhi2/d$a;", "", "<init>", "()V", "Lch/qos/logback/classic/Logger;", "Glog", "Lch/qos/logback/classic/Logger;", "", "TAG", "Ljava/lang/String;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? "" : str2);
    }
}

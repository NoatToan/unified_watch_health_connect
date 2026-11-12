package rc;

import ch.qos.logback.classic.spi.CallerData;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\nB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lrc/i;", "T", "", "Li63/c;", "serializer", "<init>", "(Li63/c;)V", "", "path", "(Ljava/lang/String;Li63/c;)V", "a", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63.c<T> f151837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f151839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f151840d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrc/i$a;", "", "<init>", "(Ljava/lang/String;I)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        PATH,
        QUERY
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151844a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f151844a = iArr;
        }
    }

    public i(i63.c<T> cVar) {
        cVar.getClass();
        this.f151839c = "";
        this.f151840d = "";
        this.f151837a = cVar;
        this.f151838b = cVar.getDescriptor().getF117004c();
    }

    public final void a(String str, String str2) {
        this.f151840d += (this.f151840d.length() == 0 ? CallerData.NA : "&") + str + '=' + str2;
    }

    public i(String str, i63.c<T> cVar) {
        str.getClass();
        cVar.getClass();
        this.f151839c = "";
        this.f151840d = "";
        this.f151837a = cVar;
        this.f151838b = str;
    }
}

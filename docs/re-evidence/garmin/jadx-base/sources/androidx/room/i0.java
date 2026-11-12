package androidx.room;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/room/i0;", "Landroidx/room/j0;", "", "version", "", "identityHash", "legacyIdentityHash", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class i0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10851c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/room/i0$a;", "", "", "isValid", "", "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f10853b;

        public a(boolean z14, String str) {
            this.f10852a = z14;
            this.f10853b = str;
        }
    }

    public i0(int i14, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f10849a = i14;
        this.f10850b = str;
        this.f10851c = str2;
    }

    public abstract void a(ud.a aVar);

    public abstract void b(ud.a aVar);

    public abstract void c(ud.a aVar);

    public abstract void d(ud.a aVar);

    public abstract void e(ud.a aVar);

    public abstract void f(ud.a aVar);

    public abstract a g(ud.a aVar);
}

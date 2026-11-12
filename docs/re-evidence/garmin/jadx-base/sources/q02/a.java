package q02;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import s5.c;
import x5.c0;
import x5.q0;
import x5.r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq02/a;", "Lx5/r0;", "", "suffix", "", "showSuffixWhenTextEmpty", "<init>", "(Ljava/lang/String;Z)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f142041c;

    /* JADX INFO: renamed from: q02.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"q02/a$a", "Lx5/c0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2665a implements c0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f142042b;

        public C2665a(c cVar) {
            this.f142042b = cVar;
        }

        @Override // x5.c0
        public final int a(int i14) {
            c cVar = this.f142042b;
            return i14 > cVar.f157138b.length() ? cVar.f157138b.length() : i14;
        }

        @Override // x5.c0
        public final int b(int i14) {
            return i14;
        }
    }

    public a(String str, boolean z14) {
        str.getClass();
        this.f142040b = str;
        this.f142041c = z14;
    }

    @Override // x5.r0
    public final q0 a(c cVar) {
        cVar.getClass();
        return new q0((this.f142041c || cVar.length() != 0) ? cVar.d(new c(this.f142040b, null, 2, null)) : cVar, new C2665a(cVar));
    }

    public /* synthetic */ a(String str, boolean z14, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? true : z14);
    }
}

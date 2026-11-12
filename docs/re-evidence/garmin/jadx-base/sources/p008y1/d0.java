package p008y1;

import b5.a0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Ly1/d0;", "", "<init>", "()V", "a", "c", "b", "d", "Ly1/d0$a;", "Ly1/d0$b;", "Ly1/d0$c;", "Ly1/d0$d;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class d0 {
    public /* synthetic */ d0(j jVar) {
        this();
    }

    private d0() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly1/d0$d;", "Ly1/d0;", "Lb5/z;", "pointerId", "<init>", "(JLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f193163a;

        public d(long j8, int i14, j jVar) {
            this((i14 & 1) != 0 ? Long.MAX_VALUE : j8, null);
        }

        private d(long j8) {
            super(null);
            this.f193163a = j8;
        }

        public /* synthetic */ d(long j8, j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ly1/d0$a;", "Ly1/d0;", "Ly1/d0$a$a;", "awaitTouchSlop", "", "consumedOnInitial", "<init>", "(Ly1/d0$a$a;Z)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public EnumC3607a f193152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f193153b;

        /* JADX INFO: renamed from: y1.d0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly1/d0$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public enum EnumC3607a {
            Yes,
            No,
            NotInitialized
        }

        public /* synthetic */ a(EnumC3607a enumC3607a, boolean z14, int i14, j jVar) {
            this((i14 & 1) != 0 ? EnumC3607a.NotInitialized : enumC3607a, (i14 & 2) != 0 ? false : z14);
        }

        public a(EnumC3607a enumC3607a, boolean z14) {
            super(null);
            this.f193152a = enumC3607a;
            this.f193153b = z14;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly1/d0$c;", "Ly1/d0;", "Lb5/a0;", "initialDown", "Lb5/z;", "pointerId", "", "verifyConsumptionInFinalPass", "<init>", "(Lb5/a0;JZLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a0 f193160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f193161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f193162c;

        public c(a0 a0Var, long j8, boolean z14, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : a0Var, (i14 & 2) != 0 ? Long.MAX_VALUE : j8, (i14 & 4) != 0 ? false : z14, null);
        }

        private c(a0 a0Var, long j8, boolean z14) {
            super(null);
            this.f193160a = a0Var;
            this.f193161b = j8;
            this.f193162c = z14;
        }

        public /* synthetic */ c(a0 a0Var, long j8, boolean z14, j jVar) {
            this(a0Var, j8, z14);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly1/d0$b;", "Ly1/d0;", "Lb5/a0;", "initialDown", "Lb5/z;", "pointerId", "Ly1/v3;", "touchSlopDetector", "<init>", "(Lb5/a0;JLy1/v3;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a0 f193158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f193159b;

        public b(a0 a0Var, long j8, v3 v3Var, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : a0Var, (i14 & 2) != 0 ? Long.MAX_VALUE : j8, (i14 & 4) != 0 ? null : v3Var, null);
        }

        private b(a0 a0Var, long j8, v3 v3Var) {
            super(null);
            this.f193158a = a0Var;
            this.f193159b = j8;
        }

        public /* synthetic */ b(a0 a0Var, long j8, v3 v3Var, j jVar) {
            this(a0Var, j8, v3Var);
        }
    }
}

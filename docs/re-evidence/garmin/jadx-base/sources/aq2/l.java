package aq2;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Laq2/l;", "T", "", "<init>", "()V", "b", "d", "a", "c", "Laq2/l$a;", "Laq2/l$b;", "Laq2/l$c;", "Laq2/l$d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class l<T> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Laq2/l$a;", "Laq2/l;", "", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f12512a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th3) {
            super(null);
            th3.getClass();
            this.f12512a = th3;
        }

        public final String toString() {
            Throwable th3 = this.f12512a;
            return "Process.Failure(" + th3 + "\n" + o13.g.b(th3) + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Laq2/l$b;", "Laq2/l;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12513a = new b();

        private b() {
            super(null);
        }

        public final String toString() {
            return "Process.NotStarted";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Laq2/l$c;", "Laq2/l;", "", "", "progress", "<init>", "(I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12514a;

        public c(int i14) {
            super(null);
            this.f12514a = i14;
        }

        public final String toString() {
            return e0.f(this.f12514a, "Process.Progress(", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Laq2/l$d;", "T", "Laq2/l;", "result", "<init>", "(Ljava/lang/Object;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> extends l<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f12515a;

        public d(T t7) {
            super(null);
            this.f12515a = t7;
        }

        public final String toString() {
            return org.apache.commons.lang3.e.f("Process.Success(", ")", this.f12515a);
        }
    }

    public /* synthetic */ l(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private l() {
    }
}

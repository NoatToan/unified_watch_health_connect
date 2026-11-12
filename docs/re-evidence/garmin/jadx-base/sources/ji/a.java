package ji;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1900a f98763a = C1900a.f98764a;

    /* JADX INFO: renamed from: ji.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class C1900a extends w implements l<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1900a f98764a = new C1900a();

        public C1900a() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            Throwable th4 = th3;
            th4.getClass();
            System.out.println((Object) "Apollo: unhandled exception");
            th4.printStackTrace();
            return Unit.INSTANCE;
        }
    }
}

package pv0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public interface y {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 pv0.y$a[], still in use, count: 1, list:
      (r0v1 pv0.y$a[]) from 0x0031: CONSTRUCTOR (r0v1 pv0.y$a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpv0/y$a;", "Lpv0/y;", "", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;II)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements y {
        BEER(1),
        WINE(2),
        SPIRIT(3),
        OTHER(4);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f141464g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f141465a;

        static {
            f141464g = new w13.c(aVarArr);
        }

        private a(int i14) {
            super(str, i);
            this.f141465a = i14;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f141463f.clone();
        }

        @Override // pv0.y
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final int getF141473a() {
            return this.f141465a;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 pv0.y$b[], still in use, count: 1, list:
      (r0v1 pv0.y$b[]) from 0x003b: CONSTRUCTOR (r0v1 pv0.y$b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpv0/y$b;", "Lpv0/y;", "", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;II)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements y {
        COFFEE(1),
        TEA(2),
        SODA(4),
        ENERGY_DRINK(5),
        OTHER(3);


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ w13.c f141472h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f141473a;

        static {
            f141472h = new w13.c(bVarArr);
        }

        private b(int i14) {
            super(str, i);
            this.f141473a = i14;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f141471g.clone();
        }

        @Override // pv0.y
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final int getF141473a() {
            return this.f141473a;
        }
    }

    /* JADX INFO: renamed from: getId */
    int getF141473a();
}

package z92;

import am.j;
import p005kotlin.Metadata;
import w13.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lz92/b;", "", "", "isSuccess", "Lz92/b$a;", "responseCode", "", "remainingRetries", "<init>", "(ZLz92/b$a;I)V", "a", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f203141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f203142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f203143c;

    public b(boolean z14, a aVar, int i14) {
        aVar.getClass();
        this.f203141a = z14;
        this.f203142b = aVar;
        this.f203143c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f203141a == bVar.f203141a && this.f203142b == bVar.f203142b && this.f203143c == bVar.f203143c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f203143c) + ((this.f203142b.hashCode() + (Boolean.hashCode(this.f203141a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DevicePasscodeResponse(isSuccess=");
        sb3.append(this.f203141a);
        sb3.append(", responseCode=");
        sb3.append(this.f203142b);
        sb3.append(", remainingRetries=");
        return j.q(sb3, this.f203143c, ")");
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v23 z92.b$a[], still in use, count: 1, list:
      (r0v23 z92.b$a[]) from 0x012b: CONSTRUCTOR (r0v23 z92.b$a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lz92/b$a;", "", "", "code", "<init>", "(Ljava/lang/String;II)V", "a", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        NOT_RECOGNIZED(-1),
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN(0),
        /* JADX INFO: Fake field, exist only in values array */
        PROTOCOL_ERROR(1),
        /* JADX INFO: Fake field, exist only in values array */
        NO_ALGORITHM_AVAILABLE(2),
        /* JADX INFO: Fake field, exist only in values array */
        FAILED_CRS_APPLET_COMMAND(3),
        /* JADX INFO: Fake field, exist only in values array */
        NO_SUCH_PADDING_IN_CREATING_PUBLIC_KEY(4),
        /* JADX INFO: Fake field, exist only in values array */
        INVALID_KEY_IN_CREATING_PUBLIC_KEY(5),
        /* JADX INFO: Fake field, exist only in values array */
        ILLEGAL_BLOCK_SIZE_IN_CREATING_PUBLIC_KEY(6),
        /* JADX INFO: Fake field, exist only in values array */
        BAD_PADDING_IN_CREATING_PUBLIC_KEY(7),
        /* JADX INFO: Fake field, exist only in values array */
        INVALID_ENCRYPTED_PAYLOAD_SIZE(8),
        /* JADX INFO: Fake field, exist only in values array */
        FAILED_RESPONSE_INITIAL_AUTH_COMMAND(9),
        /* JADX INFO: Fake field, exist only in values array */
        INVALID_RESPONSE_IN_GETTING_MODULUS(10),
        PASSCODE_ALREADY_SET(11),
        WALLET_BLOCKED(12),
        WALLET_LOCKED(13),
        PASSCODE_MISMATCH(14),
        /* JADX INFO: Fake field, exist only in values array */
        WRONG_LENGTH(15),
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN(16),
        /* JADX INFO: Fake field, exist only in values array */
        CONDITION_NET_MET(17),
        /* JADX INFO: Fake field, exist only in values array */
        WRONG_LENGTH(18),
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN(19),
        /* JADX INFO: Fake field, exist only in values array */
        CONDITION_NET_MET(20),
        PASSCODE_NOT_SET(22),
        /* JADX INFO: Fake field, exist only in values array */
        PUBLIC_KEY_TLV_TAG_MISMATCH(23),
        /* JADX INFO: Fake field, exist only in values array */
        COMMAND_NOT_SUPPORTED(24),
        /* JADX INFO: Fake field, exist only in values array */
        COMMAND_FAILED(25);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C3790a f203144b = new C3790a(null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ c f203152j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f203153a;

        static {
            f203152j = new c(new a[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r2, r0, r1, r2, r0, r1, new a(23), new a(24), new a(25)});
        }

        private a(int i14) {
            super(str, i);
            this.f203153a = i14;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f203151i.clone();
        }

        /* JADX INFO: renamed from: z92.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz92/b$a$a;", "", "<init>", "()V", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C3790a {
            public /* synthetic */ C3790a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C3790a() {
            }
        }
    }
}

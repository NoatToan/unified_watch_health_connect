package uk;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Luk/j;", "", "", "value", "<init>", "(Ljava/lang/Integer;)V", "a", "vivoki_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f171686a;

    static {
        new a(null);
    }

    public j(Integer num) {
        this.f171686a = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof j) && p005kotlin.jvm.internal.s.g(this.f171686a, ((j) obj).f171686a);
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.f171686a;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Integer num = this.f171686a;
        if (num == null) {
            return "Unused";
        }
        String hexString = Integer.toHexString(num.intValue());
        hexString.getClass();
        return hexString;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luk/j$a;", "", "<init>", "()V", "", "max", "I", "vivoki_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }
}

package b63;

import java.io.Serializable;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lb63/a0;", "Ljava/io/Serializable;", "Ljava/time/ZoneOffset;", "zoneOffset", "<init>", "(Ljava/time/ZoneOffset;)V", "Companion", "a", "b", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h(with = h63.q.class)
public final class a0 implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f16172b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZoneOffset f16173a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb63/a0$b;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16174a = new b();

        private b() {
        }
    }

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        zoneOffset.getClass();
        f16172b = new a0(zoneOffset);
    }

    public a0(ZoneOffset zoneOffset) {
        zoneOffset.getClass();
        this.f16173a = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            return this.f16173a.equals(((a0) obj).f16173a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16173a.hashCode();
    }

    public final String toString() {
        String string = this.f16173a.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: b63.a0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lb63/a0$a;", "", "<init>", "()V", "Li63/c;", "Lb63/a0;", "serializer", "()Li63/c;", "", "serialVersionUID", "J", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a0> serializer() {
            return h63.q.f82316a;
        }

        private Companion() {
        }
    }
}

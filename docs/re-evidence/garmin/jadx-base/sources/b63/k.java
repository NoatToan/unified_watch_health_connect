package b63;

import com.mapbox.maps.MapboxMap;
import java.time.ZoneId;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\b¨\u0006\u000b"}, d2 = {"Lb63/k;", "Lb63/z;", "Lb63/a0;", MapboxMap.QFE_OFFSET, "Ljava/time/ZoneId;", "zoneId", "<init>", "(Lb63/a0;Ljava/time/ZoneId;)V", "(Lb63/a0;)V", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h(with = h63.h.class)
public final class k extends z {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a0 a0Var, ZoneId zoneId) {
        super(zoneId);
        a0Var.getClass();
        zoneId.getClass();
    }

    /* JADX INFO: renamed from: b63.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb63/k$a;", "", "<init>", "()V", "Li63/c;", "Lb63/k;", "serializer", "()Li63/c;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<k> serializer() {
            return h63.h.f82298a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(a0 a0Var) {
        this(a0Var, a0Var.f16173a);
        a0Var.getClass();
    }
}

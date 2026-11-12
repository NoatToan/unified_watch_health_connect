package sf2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lsf2/b;", "", "<init>", "()V", "a", "Lsf2/b$a;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {
    public /* synthetic */ b(j jVar) {
        this();
    }

    private b() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf2/b$a;", "Lsf2/b;", "Ljava/util/UUID;", TtmlNode.ATTR_ID, "<init>", "(Ljava/util/UUID;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158891a;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(UUID uuid, int i14, j jVar) {
            if ((i14 & 1) != 0) {
                uuid = UUID.randomUUID();
                uuid.getClass();
            }
            this(uuid);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f158891a, ((a) obj).f158891a);
        }

        public final int hashCode() {
            return this.f158891a.hashCode();
        }

        public final String toString() {
            return "SportChanged(id=" + this.f158891a + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UUID uuid) {
            super(null);
            uuid.getClass();
            this.f158891a = uuid;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}

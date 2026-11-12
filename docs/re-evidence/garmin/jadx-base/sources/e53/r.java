package e53;

import ch.qos.logback.core.CoreConstants;
import com.roomorama.caldroid.CaldroidFragment;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Le53/r;", "", "", CaldroidFragment.YEAR, CaldroidFragment.MONTH, "day", "hour", "minute", "second", "nanosecond", "<init>", "(IIIIIII)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f63131h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f63135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f63136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f63137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f63138g;

    public r(int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        this.f63132a = i14;
        this.f63133b = i15;
        this.f63134c = i16;
        this.f63135d = i17;
        this.f63136e = i18;
        this.f63137f = i19;
        this.f63138g = i24;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UnboundLocalDateTime(");
        sb3.append(this.f63132a);
        sb3.append('-');
        sb3.append(this.f63133b);
        sb3.append('-');
        sb3.append(this.f63134c);
        sb3.append(' ');
        sb3.append(this.f63135d);
        sb3.append(CoreConstants.COLON_CHAR);
        sb3.append(this.f63136e);
        sb3.append(CoreConstants.COLON_CHAR);
        sb3.append(this.f63137f);
        sb3.append('.');
        return e0.j(sb3, this.f63138g, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le53/r$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

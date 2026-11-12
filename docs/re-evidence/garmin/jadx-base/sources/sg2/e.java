package sg2;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import yg2.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lsg2/e;", "", "", "durationSeconds", "Lsg2/e$b;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(ILsg2/e$b;)V", "b", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f159224c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f159225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f159226b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsg2/e$b;", "", "<init>", "(Ljava/lang/String;I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        INHALE,
        INHALE_HOLD,
        EXHALE,
        EXHALE_HOLD
    }

    public e(int i14, b bVar) {
        bVar.getClass();
        this.f159225a = i14;
        this.f159226b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f159225a == eVar.f159225a && this.f159226b == eVar.f159226b;
    }

    public final int hashCode() {
        return this.f159226b.hashCode() + (Integer.hashCode(this.f159225a) * 31);
    }

    public final String toString() {
        return "BreathworkStep(durationSeconds=" + this.f159225a + ", type=" + this.f159226b + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsg2/e$a;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: sg2.e$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3011a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f159227a;

            static {
                int[] iArr = new int[mt2.i.values().length];
                try {
                    iArr[mt2.i.INHALE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[mt2.i.INHALE_HOLD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[mt2.i.EXHALE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[mt2.i.EXHALE_HOLD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f159227a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static e a(h0 h0Var) {
            b bVar;
            if (h0Var == null) {
                return null;
            }
            lt2.b primaryTarget = h0Var.getPrimaryTarget();
            mt2.i iVar = primaryTarget != null ? primaryTarget.f114870a : null;
            int i14 = iVar == null ? -1 : C3011a.f159227a[iVar.ordinal()];
            if (i14 == 1) {
                bVar = b.INHALE;
            } else if (i14 == 2) {
                bVar = b.INHALE_HOLD;
            } else if (i14 == 3) {
                bVar = b.EXHALE;
            } else {
                if (i14 != 4) {
                    return null;
                }
                bVar = b.EXHALE_HOLD;
            }
            lt2.a duration = h0Var.getDuration();
            if (duration != null) {
                return new e((int) duration.f114867b, bVar);
            }
            return null;
        }

        private a() {
        }
    }
}

package t41;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import lc.u0;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 t41.i[], still in use, count: 1, list:
  (r0v1 t41.i[]) from 0x0035: CONSTRUCTOR (r0v1 t41.i[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \t2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lt41/i;", "Landroid/os/Parcelable;", "", "", Action.KEY_ATTRIBUTE, "", "labelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Companion", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final class i implements Parcelable {
    EVERY_MILE("DISTANCE_MILE", R.string.pacepro_splits_every_mile),
    EVERY_KM("DISTANCE_KILOMETER", R.string.pacepro_splits_every_km),
    ELEVATION_BASED("ELEVATION", R.string.pacepro_elevation_based);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f162320h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f162322b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<i> CREATOR = new Parcelable.Creator<i>() { // from class: t41.i.b
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return i.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f162315c = m.a(n.PUBLICATION, new t21.f(17));

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f162323a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.EVERY_MILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.EVERY_KM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.ELEVATION_BASED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f162323a = iArr;
        }
    }

    static {
        f162320h = new w13.c(new i[]{r0, r1, r2});
    }

    private i(String str, int i14) {
        super(str, i);
        this.f162321a = str;
        this.f162322b = i14;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f162319g.clone();
    }

    public final List<h> b() {
        int i14 = c.f162323a[ordinal()];
        if (i14 == 1 || i14 == 2) {
            return x.k(h.f162301d, h.f162302e, h.f162303f, h.f162306i);
        }
        if (i14 == 3) {
            return x.k(h.f162301d, h.f162302e, h.f162304g, h.f162307j);
        }
        u0.r();
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(name());
    }

    /* JADX INFO: renamed from: t41.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt41/i$a;", "", "<init>", "()V", "Li63/c;", "Lt41/i;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static i a(String str) {
            Object next;
            w13.c cVar = i.f162320h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!s.g(((i) next).f162321a, str));
            i iVar = (i) next;
            return iVar == null ? i.EVERY_KM : iVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<i> serializer() {
            return (i63.c) i.f162315c.getValue();
        }

        private Companion() {
        }
    }
}

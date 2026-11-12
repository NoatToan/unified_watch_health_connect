package q91;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i63.h;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q53.q;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 q91.g[], still in use, count: 1, list:
  (r0v1 q91.g[]) from 0x0067: CONSTRUCTOR (r0v1 q91.g[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lq91/g;", "Landroid/os/Parcelable;", "", "", Action.KEY_ATTRIBUTE, "", "labelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Companion", "a", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final class g implements Parcelable {
    RUNNING("RUNNING", R.string.lbl_running),
    CYCLING("CYCLING", R.string.lbl_cycling),
    SWIMMING("SWIMMING", R.string.lbl_swimming),
    TRAINING("TRAINING", R.string.lbl_strength),
    PARASPORTS("WHEELCHAIR_PUSH_RUN", R.string.lbl_activity_pushing_run_speed),
    PUSHES("WHEELCHAIR_PUSH_WALK", R.string.lbl_pushes),
    STEPS("STEPS", R.string.lbl_steps);


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ w13.c f143596l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f143598b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>() { // from class: q91.g.b
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return g.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f143587c = m.a(n.PUBLICATION, new q(3));

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143599a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.SWIMMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f143599a = iArr;
        }
    }

    static {
        f143596l = new w13.c(new g[]{r0, r1, r2, r3, r4, r5, r6});
    }

    private g(String str, int i14) {
        super(str, i);
        this.f143597a = str;
        this.f143598b = i14;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f143595k.clone();
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

    /* JADX INFO: renamed from: q91.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq91/g$a;", "", "<init>", "()V", "Li63/c;", "Lq91/g;", "serializer", "()Li63/c;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<g> serializer() {
            return (i63.c) g.f143587c.getValue();
        }

        private Companion() {
        }
    }
}

package x52;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx52/a;", "", "", TtmlNode.ATTR_ID, "", "targetName", "resourceString", "<init>", "(Ljava/lang/String;IILjava/lang/String;I)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    RECOVERY(1, "recovery", R.string.workout_step_type_recovery),
    EASY(3, "easy", R.string.lbl_easy),
    /* JADX INFO: Fake field, exist only in values array */
    MODERATE(4, "moderate", R.string.lbl_moderate),
    /* JADX INFO: Fake field, exist only in values array */
    HARD(5, "hard", R.string.lbl_hard),
    /* JADX INFO: Fake field, exist only in values array */
    VERY_HARD(6, "very_hard", R.string.lbl_very_hard),
    /* JADX INFO: Fake field, exist only in values array */
    ALL_OUT(7, "all_out", R.string.lbl_all_out),
    /* JADX INFO: Fake field, exist only in values array */
    ASCEND(9, "ascend", R.string.lbl_ascending),
    /* JADX INFO: Fake field, exist only in values array */
    DESCEND(10, "descend", R.string.lbl_descending);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3515a f189039c = new C3515a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f189043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f189044b;

    a(int i14, String str, int i15) {
        this.f189043a = i14;
        this.f189044b = i15;
    }

    /* JADX INFO: renamed from: x52.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx52/a$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3515a {
        public /* synthetic */ C3515a(j jVar) {
            this();
        }

        public static a a(int i14) {
            for (a aVar : a.values()) {
                if (aVar.f189043a == i14) {
                    return aVar;
                }
            }
            return null;
        }

        private C3515a() {
        }
    }
}

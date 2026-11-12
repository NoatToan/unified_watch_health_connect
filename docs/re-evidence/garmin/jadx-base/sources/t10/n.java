package t10;

import com.garmin.android.apps.connectmobile.R;
import com.roomorama.caldroid.CaldroidFragment;
import d53.u;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lt10/n;", "", "", "notificationTitle", "notificationDescription", CaldroidFragment.DIALOG_TITLE, "dialogDescription", "<init>", "(Ljava/lang/String;IIIII)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum n {
    CREATE(R.string.lbl_create_workout_title, R.string.lbl_create_workout_message, R.string.workout_lbl_create_workout, R.string.alert_create_a_workout_message_short),
    EDIT(R.string.workout_edit_workout, R.string.lbl_edit_workout_notification_message, R.string.lbl_edit_workout_name, R.string.edit_workout_name_desc),
    FIND(R.string.workout_lbl_find_workout, R.string.lbl_find_a_workout_notification_message, R.string.workout_lbl_find_workout, R.string.alert_find_a_workout_message),
    VIEW(R.string.lbl_notification_from_device_title, R.string.lbl_notification_from_device_subtitle, R.string.lbl_notification_from_device_title, R.string.lbl_notification_from_device_subtitle);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f161700e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f161706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f161707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f161708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f161709d;

    n(int i14, int i15, int i16, int i17) {
        this.f161706a = i14;
        this.f161707b = i15;
        this.f161708c = i16;
        this.f161709d = i17;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt10/n$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001c  */
        /* JADX WARN: Code duplicated, block: B:12:0x001f A[RETURN] */
        public static n a(String str) {
            for (n nVar : n.values()) {
                if (u.q(nVar.name(), str, true)) {
                    if (nVar == null) {
                        return n.VIEW;
                    }
                    return nVar;
                }
            }
            nVar = null;
            if (nVar == null) {
                return n.VIEW;
            }
            return nVar;
        }

        private a() {
        }
    }
}

package ty0;

import com.google.android.gms.stats.CodePackage;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lty0/m;", "Lty0/j;", "Lj22/g;", "permissionGroup", "<init>", "(Lj22/g;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j22.g f167031a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f167032a;

        static {
            int[] iArr = new int[j22.g.values().length];
            try {
                iArr[j22.g.f96759d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j22.g.f96760e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j22.g.f96761f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j22.g.f96762g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j22.g.f96763h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[j22.g.f96764i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[j22.g.f96765j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[j22.g.f96766k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[j22.g.f96767l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[j22.g.f96768m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[j22.g.f96769n.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[j22.g.f96770o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f167032a = iArr;
        }
    }

    public m(j22.g gVar) {
        gVar.getClass();
        this.f167031a = gVar;
    }

    @Override // ty0.j
    public final String b(l22.b bVar) {
        return bVar.getString(this.f167031a.f96772a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f167031a == ((m) obj).f167031a;
    }

    @Override // ty0.j
    /* JADX INFO: renamed from: h */
    public final String getF188047a() {
        switch (a.f167032a[this.f167031a.ordinal()]) {
            case 1:
                return "BLUETOOTH";
            case 2:
                return "NOTIFICATIONS";
            case 3:
                return "CALENDAR";
            case 4:
                return "CALL_LOG";
            case 5:
                return "CAMERA";
            case 6:
                return "CONTACTS";
            case 7:
                return CodePackage.LOCATION;
            case 8:
                return "PHONE";
            case 9:
                return "SCHEDULE_EXACT_ALARM";
            case 10:
                return "SMS";
            case 11:
                return "STORAGE";
            case 12:
                return "MICROPHONE";
            default:
                u0.r();
                return null;
        }
    }

    public final int hashCode() {
        return this.f167031a.hashCode();
    }

    public final String toString() {
        return "PhonePermissionsSettingsItem(permissionGroup=" + this.f167031a + ")";
    }
}

package sr;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lsr/s;", "", "Ll22/b;", "resolver", "<init>", "(Ll22/b;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f160584a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160585a;

        static {
            int[] iArr = new int[fg1.a.values().length];
            try {
                iArr[fg1.a.CRITICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fg1.a.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f160585a = iArr;
        }
    }

    static {
        new a(null);
    }

    public s(l22.b bVar) {
        bVar.getClass();
        this.f160584a = bVar;
    }

    public final String a(String str) {
        fg1.a.f71382d.getClass();
        fg1.a aVarA = fg1.a.C1455a.a(str);
        l22.b bVar = this.f160584a;
        String string = aVarA != null ? bVar.getString(aVarA.f71390b) : null;
        if (g22.n.d(string)) {
            return bVar.a(R.string.sensor_battery_status, string);
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsr/s$a;", "", "<init>", "()V", "", "EMPTY_STRING", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

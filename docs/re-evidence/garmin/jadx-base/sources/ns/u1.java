package ns;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lns/u1;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lns/u1$a;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lu00/c;", "validator", "<init>", "(Ll22/b;Lns/u1$a;Lu00/c;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u1 extends u00.b<Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f127775d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lns/u1$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        Total,
        Other
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127779a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Total.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Other.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f127779a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(l22.b bVar, a aVar, u00.c<Integer> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        aVar.getClass();
        cVar.getClass();
        this.f127774c = bVar;
        this.f127775d = aVar;
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        String str = c22.l3.f23135m.format(Integer.valueOf(((Number) obj).intValue()));
        str.getClass();
        return str;
    }

    @Override // u00.b
    public final String d(int i14) {
        int i15 = b.f127779a[this.f127775d.ordinal()];
        if (i15 == 1) {
            return null;
        }
        if (i15 == 2) {
            return this.f127774c.getString(R.string.no_value);
        }
        lc.u0.r();
        return null;
    }

    @Override // u00.b
    public final String e(Integer num) {
        int i14 = b.f127779a[this.f127775d.ordinal()];
        if (i14 == 1) {
            return null;
        }
        if (i14 == 2) {
            return this.f127774c.getString(R.string.lbl_rounds);
        }
        lc.u0.r();
        return null;
    }

    public /* synthetic */ u1(l22.b bVar, a aVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, aVar, (i14 & 4) != 0 ? new ms.c0() : cVar);
    }
}

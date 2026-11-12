package rc;

import com.garmin.android.gncs.NotificationConstants;
import com.google.maps.android.BuildConfig;
import d53.u;
import java.lang.Enum;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrc/c;", "", "D", "Lrc/d;", "Ljava/lang/Class;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c<D extends Enum<?>> extends d<D> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Class<D> f151799t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Class<D> cls) {
        super(cls);
        cls.getClass();
        if (cls.isEnum()) {
            this.f151799t = cls;
        } else {
            kg.f.l(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // rc.d, lc.q0
    public final String b() {
        return this.f151799t.getName();
    }

    @Override // rc.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final D h(String str) {
        str.getClass();
        D d14 = null;
        if (str.equals(BuildConfig.TRAVIS)) {
            return null;
        }
        Class<D> cls = this.f151799t;
        D[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        for (D d15 : enumConstants) {
            D d16 = d15;
            d16.getClass();
            if (u.q(d16.name(), str, true)) {
                d14 = d15;
                break;
            }
        }
        D d17 = d14;
        if (d17 != null) {
            return d17;
        }
        StringBuilder sbL = hb.a.l("Enum value ", str, " not found for type ");
        sbL.append(cls.getName());
        sbL.append('.');
        throw new IllegalArgumentException(sbL.toString());
    }
}

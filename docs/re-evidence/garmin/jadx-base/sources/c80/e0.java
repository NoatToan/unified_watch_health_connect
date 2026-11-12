package c80;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.gncs.NotificationConstants;
import java.util.Locale;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lc80/e0;", "", "", Action.KEY_ATTRIBUTE, "Lc80/f0;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/String;Lc80/f0;)V", "a", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25359c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f25361b;

    public e0(String str, f0 f0Var) {
        str.getClass();
        f0Var.getClass();
        this.f25360a = str;
        this.f25361b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f25360a.equals(e0Var.f25360a) && this.f25361b.equals(e0Var.f25361b);
    }

    public final int hashCode() {
        return this.f25361b.hashCode() + (this.f25360a.hashCode() * 31);
    }

    public final String toString() {
        return "PromoAutoDismissParam(key=" + this.f25360a + ", type=" + this.f25361b + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc80/e0$a;", "", "<init>", "()V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static e0 a(Map map) {
            String str;
            String str2;
            f0 cVar;
            Float fG;
            Integer numI;
            Boolean boolU;
            map.getClass();
            String str3 = (String) map.get(Action.KEY_ATTRIBUTE);
            if (str3 != null && (str = (String) map.get("value")) != null && (str2 = (String) map.get(NotificationConstants.KEY_DATA_MIME_TYPE)) != null) {
                f0.f25367a.getClass();
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                switch (lowerCase.hashCode()) {
                    case -1325958191:
                        cVar = (!lowerCase.equals("double") || (fG = d53.s.g(str)) == null) ? null : new f0.c(fG.floatValue());
                        break;
                    case -891985903:
                        cVar = !lowerCase.equals("string") ? null : new f0.e(str);
                        break;
                    case 104431:
                        cVar = (lowerCase.equals("int") && (numI = d53.t.i(str)) != null) ? new f0.d(numI.intValue()) : null;
                        break;
                    case 64711720:
                        cVar = (!lowerCase.equals("boolean") || (boolU = w3.x.u(str)) == null) ? null : new f0.a(boolU.booleanValue());
                        break;
                    default:
                        cVar = null;
                        break;
                }
                if (cVar != null) {
                    return new e0(str3, cVar);
                }
            }
            return null;
        }

        private a() {
        }
    }
}

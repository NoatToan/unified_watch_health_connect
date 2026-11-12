package he0;

import c80.m0;
import c80.n0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.maps.android.BuildConfig;
import d53.u;
import d53.w;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import zd0.e0;
import zd0.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhe0/k;", "Lzd0/e0;", "<init>", "()V", "a", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f83521i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m0 f83522j = m0.f25444h;

    @Override // zd0.e0
    public final m0 a() {
        return f83522j;
    }

    @Override // zd0.e0
    public final Object c(t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        e12.e eVarC;
        e12.e eVarC2;
        a2 a2Var = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.k(a2Var, "PromosUsageIndicatorValidator", "conditionsProvider = " + n0Var);
        String str = n0Var.f25484i;
        if (str == null) {
            return l0.HIDE;
        }
        c cVar = (c) GsonUtil.f47253b.fromJson(str, new l().getType());
        i2.a.k(a2Var, "PromosUsageIndicatorValidator", "promoUsageIndicators = " + cVar);
        List<b> listA = cVar.a();
        boolean z14 = false;
        if (listA != null) {
            if (listA.isEmpty()) {
                z14 = true;
            } else {
                for (b bVar : listA) {
                    String str2 = bVar.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String();
                    Boolean value = bVar.getValue();
                    Integer timeFrame = bVar.getTimeFrame();
                    try {
                        eVarC = bo1.a.a().c();
                    } catch (Exception unused) {
                        eVarC = null;
                    }
                    String strValueOf = String.valueOf(eVarC != null ? eVarC.getDeviceBasedIndicators() : null);
                    a2 a2Var2 = a2.PROMOTIONS;
                    String strConcat = "deviceBasedIndicators = ".concat(strValueOf);
                    i2.f36769a.getClass();
                    i2.a.k(a2Var2, "PromosUsageIndicatorValidator", strConcat);
                    try {
                        eVarC2 = bo1.a.a().c();
                    } catch (Exception unused2) {
                        eVarC2 = null;
                    }
                    String strValueOf2 = String.valueOf(eVarC2 != null ? eVarC2.getHistoricalDeviceBasedIndicators() : null);
                    i2.a.k(a2Var2, "PromosUsageIndicatorValidator", "historicalDeviceBasedIndicators = ".concat(strValueOf2));
                    List<String> listW = w.W(u.v(u.v(u.v(strValueOf, StringUtils.SPACE, "", false), "DeviceBasedIndicators(", "", false), ")", "", false), new String[]{","});
                    List<String> listW2 = w.W(u.v(u.v(u.v(strValueOf2, StringUtils.SPACE, "", false), "HistoricalDeviceBasedIndicators(", "", false), ")", "", false), new String[]{","});
                    boolean z15 = false;
                    for (String str3 : listW) {
                        if (!s.g(str3, BuildConfig.TRAVIS)) {
                            List listW3 = w.W(str3, new String[]{"="});
                            String str4 = (String) listW3.get(0);
                            String str5 = (String) listW3.get(1);
                            if (w.z(str4, String.valueOf(str2), false) && s.g(str5, String.valueOf(value))) {
                                z15 = true;
                            }
                        }
                    }
                    boolean z16 = false;
                    for (String str6 : listW2) {
                        if (!s.g(str6, BuildConfig.TRAVIS)) {
                            List listW4 = w.W(str6, new String[]{"="});
                            String str7 = (String) listW4.get(0);
                            String str8 = (String) listW4.get(1);
                            if (s.g(str7, str2) && s.g(str8, String.valueOf(value))) {
                                z16 = true;
                            }
                        }
                    }
                    if (!listW2.isEmpty()) {
                        Iterator it = listW2.iterator();
                        while (it.hasNext()) {
                            if (u.y((String) it.next(), str2 + "=null", false)) {
                                if (!s.g(value, Boolean.FALSE)) {
                                    break;
                                }
                                z16 = true;
                                break;
                            }
                        }
                    }
                    if (!listW2.isEmpty()) {
                        Iterator it3 = listW2.iterator();
                        while (it3.hasNext()) {
                            if (u.y((String) it3.next(), str2 + "=null", false)) {
                                if (!s.g(value, Boolean.FALSE)) {
                                    break;
                                }
                                z16 = true;
                                break;
                            }
                        }
                    }
                    if (timeFrame == null || timeFrame.intValue() != 0) {
                        z15 = (timeFrame != null && timeFrame.intValue() == 1) ? z16 : timeFrame != null && timeFrame.intValue() == 2 && (z15 || z16);
                    }
                    if (!z15) {
                    }
                }
                z14 = true;
            }
        }
        a2 a2Var3 = a2.PROMOTIONS;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("allConditionsMet = ", z14);
        i2.f36769a.getClass();
        i2.a.k(a2Var3, "PromosUsageIndicatorValidator", strH);
        return e0.b(z14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhe0/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

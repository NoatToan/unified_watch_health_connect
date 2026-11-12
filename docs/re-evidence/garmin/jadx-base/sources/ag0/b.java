package ag0;

import a73.j;
import android.os.Bundle;
import android.widget.NumberPicker;
import c53.c0;
import c53.q;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.timepicker.TimeModel;
import f12.l;
import j20.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p13.y;
import r22.a2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lag0/b;", "Lr22/a2;", "<init>", "()V", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends a2 {
    public static final a Z0 = new a(null);
    public p<Integer, Integer> S0;
    public p<Integer, Integer> T0;
    public String U0;
    public int V0 = -1;
    public boolean W0;
    public final long X0;
    public final long Y0;

    /* JADX INFO: renamed from: ag0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0051b {
        void a(long j8);
    }

    public b() {
        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        this.W0 = zY;
        this.X0 = zY ? 149L : 240L;
        this.Y0 = zY ? 779L : 1200L;
    }

    public static String[] T6(int i14) {
        p0 p0Var = new p0();
        p0Var.f105807a = i14;
        List listS = c0.s(q.d(new ag0.a(p0Var, i14, 0)));
        ArrayList arrayList = new ArrayList(y.r(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            x0 x0Var = x0.f105818a;
            arrayList.add(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1)));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final void U6(String str, InterfaceC0051b interfaceC0051b) {
        this.I = str;
        this.T = new j(interfaceC0051b, this, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f149567m = true;
        this.f149570p = true;
        this.f149571q = true;
        this.f149568n = true;
        this.A = true;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.W0 = arguments.getBoolean("showMetric");
            this.U0 = arguments.getString("customTitleKey");
            this.V0 = arguments.getInt("customUnitKey", -1);
        }
        if (this.W0) {
            this.K0 = R.string.lbl_pace_unit_km;
        } else {
            this.K0 = R.string.lbl_pace_unit_mi;
        }
        int i14 = this.V0;
        if (i14 != -1) {
            this.K0 = i14;
        }
        this.J0 = R.string.separator_colon;
        og0.a aVar = og0.a.f131967a;
        Bundle arguments2 = getArguments();
        long j8 = arguments2 != null ? arguments2.getLong("lowerBound") : this.X0;
        aVar.getClass();
        this.S0 = og0.a.z(j8);
        Bundle arguments3 = getArguments();
        this.T0 = og0.a.z(arguments3 != null ? arguments3.getLong("upperBound") : this.Y0);
        p<Integer, Integer> pVar = this.S0;
        if (pVar == null) {
            s.m("parsedMinTime");
            throw null;
        }
        int iIntValue = pVar.f128594a.intValue();
        this.f149567m = true;
        this.f149573t = iIntValue;
        p<Integer, Integer> pVar2 = this.T0;
        if (pVar2 == null) {
            s.m("parsedMaxTime");
            throw null;
        }
        int iIntValue2 = pVar2.f128594a.intValue();
        this.f149567m = true;
        this.f149574v = iIntValue2;
        this.f149569o = false;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            p pVarZ = og0.a.z(arguments4.getLong("oldPace"));
            A6(((Number) pVarZ.f128594a).intValue());
            E6(((Number) pVarZ.f128595b).intValue());
        }
        int i15 = this.f149561h;
        p<Integer, Integer> pVar3 = this.S0;
        if (pVar3 == null) {
            s.m("parsedMinTime");
            throw null;
        }
        if (i15 == pVar3.f128594a.intValue()) {
            p<Integer, Integer> pVar4 = this.S0;
            if (pVar4 == null) {
                s.m("parsedMinTime");
                throw null;
            }
            G6(pVar4.f128595b.intValue());
            F6(59);
        } else {
            p<Integer, Integer> pVar5 = this.T0;
            if (pVar5 == null) {
                s.m("parsedMaxTime");
                throw null;
            }
            if (i15 == pVar5.f128594a.intValue()) {
                G6(0);
                p<Integer, Integer> pVar6 = this.T0;
                if (pVar6 == null) {
                    s.m("parsedMaxTime");
                    throw null;
                }
                F6(pVar6.f128595b.intValue());
                int i16 = this.f149562i;
                int i17 = this.f149576x;
                if (i16 >= i17) {
                    i16 = i17;
                }
                E6(i16);
            } else {
                G6(0);
                F6(59);
            }
        }
        String[] strArrT6 = T6(this.f149575w);
        this.f149568n = true;
        this.A = true;
        this.f149564k = strArrT6;
    }

    @Override // r22.a2
    public final String u6(String str, int i14, int i15, String str2, String str3, int i16) {
        String str4 = this.U0;
        return str4 == null ? x.d(getString(R.string.lbl_course_goal_pace), StringUtils.SPACE, getString(R.string.lbl_time_unit_minutes), StringUtils.SPACE, getString(R.string.lbl_time_unit_seconds)) : str4;
    }

    @Override // r22.a2
    public final String v6(String str, int i14, int i15, String str2, String str3, int i16) {
        String str4 = this.U0;
        return str4 == null ? com.nimbusds.jose.shaded.gson.internal.a.h(getString(R.string.lbl_course_goal_pace), " (", getString(R.string.common_abbrev_mm_ss_string), ")") : str4;
    }

    @Override // r22.a2
    public final void z6(NumberPicker numberPicker, int i14, int i15) {
        if (numberPicker.equals(this.f149555b)) {
            p<Integer, Integer> pVar = this.S0;
            if (pVar == null) {
                s.m("parsedMinTime");
                throw null;
            }
            if (i15 == pVar.f128594a.intValue()) {
                NumberPicker numberPicker2 = this.f149556c;
                p<Integer, Integer> pVar2 = this.S0;
                if (pVar2 == null) {
                    s.m("parsedMinTime");
                    throw null;
                }
                numberPicker2.setMinValue(pVar2.f128595b.intValue());
                this.f149556c.setMaxValue(59);
                if (this.Y <= this.f149556c.getMinValue()) {
                    NumberPicker numberPicker3 = this.f149556c;
                    numberPicker3.setValue(numberPicker3.getMinValue());
                }
            } else {
                p<Integer, Integer> pVar3 = this.T0;
                if (pVar3 == null) {
                    s.m("parsedMaxTime");
                    throw null;
                }
                int iIntValue = pVar3.f128594a.intValue();
                NumberPicker numberPicker4 = this.f149556c;
                if (i15 == iIntValue) {
                    numberPicker4.setMinValue(0);
                    NumberPicker numberPicker5 = this.f149556c;
                    p<Integer, Integer> pVar4 = this.T0;
                    if (pVar4 == null) {
                        s.m("parsedMaxTime");
                        throw null;
                    }
                    numberPicker5.setMaxValue(pVar4.f128595b.intValue());
                    if (this.Y >= this.f149556c.getMaxValue()) {
                        NumberPicker numberPicker6 = this.f149556c;
                        numberPicker6.setValue(numberPicker6.getMaxValue());
                    }
                } else {
                    numberPicker4.setMinValue(0);
                    this.f149556c.setMaxValue(59);
                }
            }
            NumberPicker numberPicker7 = this.f149556c;
            numberPicker7.setDisplayedValues(T6(numberPicker7.getMinValue()));
            this.f149554a.setTitle(v6(null, this.f149555b.getValue(), this.f149556c.getValue(), null, null, 0));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"Lag0/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "FASTEST_PACE_IN_MIN_PER_KM", "J", "FASTEST_PACE_IN_MIN_PER_MILE", "SLOWEST_PACE_IN_MIN_PER_KM", "SLOWEST_PACE_IN_MIN_PER_MILE", "FASTEST_NON_DSW_IN_MIN_PER_MILE", "FASTEST_NON_DSW_IN_MIN_PER_KM", "SLOWEST_NON_DSW_IN_MIN_PER_MILE", "SLOWEST_NON_DSW_IN_MIN_PER_KM", "OLD_PACE_KEY", "LOWER_BOUND_KEY", "UPPER_BOUND_KEY", "SHOW_METRIC_KEY", "CUSTOM_TITLE_KEY", "CUSTOM_UNIT_KEY", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static b a(long j8, long j14, long j15, String str, int i14) {
            b bVar = new b();
            Bundle bundle = new Bundle(4);
            bundle.putLong("oldPace", j8);
            bundle.putLong("lowerBound", j14);
            bundle.putLong("upperBound", j15);
            bundle.putString("customTitleKey", str);
            bundle.putInt("customUnitKey", i14);
            bVar.setArguments(bundle);
            return bVar;
        }

        public static b b(a aVar, long j8, long j14, long j15, boolean z14) {
            aVar.getClass();
            b bVar = new b();
            Bundle bundle = new Bundle(5);
            bundle.putLong("oldPace", j8);
            bundle.putLong("lowerBound", j14);
            bundle.putLong("upperBound", j15);
            bundle.putString("customTitleKey", null);
            bundle.putBoolean("showMetric", z14);
            bVar.setArguments(bundle);
            return bVar;
        }

        private a() {
        }
    }
}

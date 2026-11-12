package ag0;

import am.j;
import android.os.Bundle;
import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import o13.u;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r22.a2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lag0/c;", "Lr22/a2;", "<init>", "()V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends a2 {
    public static final a U0 = new a(null);
    public u<Integer, Integer, Integer> S0;
    public u<Integer, Integer, Integer> T0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f149570p = true;
        this.f149571q = true;
        this.f149572r = true;
        this.f149569o = true;
        this.B = true;
        this.J0 = R.string.lbl_hour;
        this.K0 = R.string.lbl_minute;
        this.L0 = R.string.lbl_second;
        Bundle arguments = getArguments();
        long j8 = arguments != null ? arguments.getLong("lowerBound") : 240L;
        Bundle arguments2 = getArguments();
        long j14 = arguments2 != null ? arguments2.getLong("upperBound") : 1200L;
        Bundle arguments3 = getArguments();
        a aVar = U0;
        if (arguments3 != null) {
            long j15 = arguments3.getLong("oldTime");
            aVar.getClass();
            u uVarA = a.a(j15);
            A6(((Number) uVarA.f128605a).intValue());
            E6(((Number) uVarA.f128606b).intValue());
            I6(((Number) uVarA.f128607c).intValue());
        }
        aVar.getClass();
        this.S0 = a.a(j8);
        this.T0 = a.a(j14);
        u<Integer, Integer, Integer> uVar = this.S0;
        if (uVar == null) {
            s.m("parsedMinTime");
            throw null;
        }
        int iIntValue = uVar.f128605a.intValue();
        this.f149567m = true;
        this.f149573t = iIntValue;
        u<Integer, Integer, Integer> uVar2 = this.T0;
        if (uVar2 == null) {
            s.m("parsedMaxTime");
            throw null;
        }
        int iIntValue2 = uVar2.f128605a.intValue();
        this.f149567m = true;
        this.f149574v = iIntValue2;
        this.f149577y = 0;
        this.f149569o = true;
        this.f149578z = 59;
        int i14 = this.f149561h;
        u<Integer, Integer, Integer> uVar3 = this.S0;
        if (uVar3 == null) {
            s.m("parsedMinTime");
            throw null;
        }
        if (i14 == uVar3.f128605a.intValue()) {
            u<Integer, Integer, Integer> uVar4 = this.S0;
            if (uVar4 == null) {
                s.m("parsedMinTime");
                throw null;
            }
            G6(uVar4.f128606b.intValue());
            F6(59);
            int i15 = this.f149562i;
            u<Integer, Integer, Integer> uVar5 = this.S0;
            if (uVar5 == null) {
                s.m("parsedMinTime");
                throw null;
            }
            if (i15 == uVar5.f128606b.intValue()) {
                u<Integer, Integer, Integer> uVar6 = this.S0;
                if (uVar6 == null) {
                    s.m("parsedMinTime");
                    throw null;
                }
                this.f149577y = uVar6.f128607c.intValue();
                this.f149569o = true;
                this.f149578z = 59;
            }
        } else {
            u<Integer, Integer, Integer> uVar7 = this.T0;
            if (uVar7 == null) {
                s.m("parsedMaxTime");
                throw null;
            }
            if (i14 == uVar7.f128605a.intValue()) {
                G6(0);
                u<Integer, Integer, Integer> uVar8 = this.T0;
                if (uVar8 == null) {
                    s.m("parsedMaxTime");
                    throw null;
                }
                F6(uVar8.f128606b.intValue());
                int i16 = this.f149562i;
                u<Integer, Integer, Integer> uVar9 = this.T0;
                if (uVar9 == null) {
                    s.m("parsedMaxTime");
                    throw null;
                }
                if (i16 == uVar9.f128606b.intValue()) {
                    this.f149569o = true;
                    this.f149577y = 0;
                    u<Integer, Integer, Integer> uVar10 = this.T0;
                    if (uVar10 == null) {
                        s.m("parsedMaxTime");
                        throw null;
                    }
                    int iIntValue3 = uVar10.f128607c.intValue();
                    this.f149569o = true;
                    this.f149578z = iIntValue3;
                }
            } else {
                G6(0);
                F6(59);
            }
        }
        this.f149577y = 0;
        this.f149569o = true;
        this.f149578z = 59;
    }

    @Override // r22.a2
    public final String v6(String str, int i14, int i15, String str2, String str3, int i16) {
        String string = getString(R.string.lbl_hour);
        String string2 = getString(R.string.lbl_minute);
        String string3 = getString(R.string.lbl_second);
        StringBuilder sbL = e5.l(str, StringUtils.SPACE, string, StringUtils.SPACE, str2);
        sn.a.t(sbL, StringUtils.SPACE, string2, StringUtils.SPACE, str3);
        return j.o(StringUtils.SPACE, string3, sbL);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:63:0x0110  */
    /* JADX WARN: Code duplicated, block: B:65:0x011a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0124  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0136  */
    /* JADX WARN: Code duplicated, block: B:74:0x0145  */
    /* JADX WARN: Code duplicated, block: B:75:0x0151  */
    /* JADX WARN: Code duplicated, block: B:77:0x0155  */
    /* JADX WARN: Code duplicated, block: B:79:0x0159  */
    /* JADX WARN: Code duplicated, block: B:81:0x015d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0168  */
    @Override // r22.a2
    public final void z6(NumberPicker numberPicker, int i14, int i15) {
        u<Integer, Integer, Integer> uVar;
        int value;
        u<Integer, Integer, Integer> uVar2;
        int value2;
        u<Integer, Integer, Integer> uVar3;
        NumberPicker numberPicker2;
        u<Integer, Integer, Integer> uVar4;
        NumberPicker numberPicker3;
        u<Integer, Integer, Integer> uVar5;
        if (numberPicker.equals(this.f149555b)) {
            u<Integer, Integer, Integer> uVar6 = this.S0;
            if (uVar6 == null) {
                s.m("parsedMinTime");
                throw null;
            }
            if (i15 == uVar6.f128605a.intValue()) {
                NumberPicker numberPicker4 = this.f149556c;
                u<Integer, Integer, Integer> uVar7 = this.S0;
                if (uVar7 == null) {
                    s.m("parsedMinTime");
                    throw null;
                }
                numberPicker4.setMinValue(uVar7.f128606b.intValue());
                this.f149556c.setMaxValue(59);
            } else {
                u<Integer, Integer, Integer> uVar8 = this.T0;
                if (uVar8 == null) {
                    s.m("parsedMaxTime");
                    throw null;
                }
                int iIntValue = uVar8.f128605a.intValue();
                NumberPicker numberPicker5 = this.f149556c;
                if (i15 == iIntValue) {
                    numberPicker5.setMinValue(0);
                    NumberPicker numberPicker6 = this.f149556c;
                    u<Integer, Integer, Integer> uVar9 = this.T0;
                    if (uVar9 == null) {
                        s.m("parsedMaxTime");
                        throw null;
                    }
                    numberPicker6.setMaxValue(uVar9.f128606b.intValue());
                } else {
                    numberPicker5.setMinValue(0);
                    this.f149556c.setMaxValue(59);
                }
            }
        } else if (numberPicker.equals(this.f149556c)) {
            u<Integer, Integer, Integer> uVar10 = this.S0;
            if (uVar10 == null) {
                s.m("parsedMinTime");
                throw null;
            }
            if (i15 == uVar10.f128606b.intValue()) {
                int value3 = this.f149555b.getValue();
                u<Integer, Integer, Integer> uVar11 = this.S0;
                if (uVar11 == null) {
                    s.m("parsedMinTime");
                    throw null;
                }
                if (value3 == uVar11.f128605a.intValue()) {
                    int value4 = this.f149557d.getValue();
                    u<Integer, Integer, Integer> uVar12 = this.S0;
                    if (uVar12 == null) {
                        s.m("parsedMinTime");
                        throw null;
                    }
                    if (value4 < uVar12.f128607c.intValue()) {
                        NumberPicker numberPicker7 = this.f149557d;
                        u<Integer, Integer, Integer> uVar13 = this.S0;
                        if (uVar13 == null) {
                            s.m("parsedMinTime");
                            throw null;
                        }
                        numberPicker7.setValue(uVar13.f128607c.intValue());
                    }
                    NumberPicker numberPicker8 = this.f149557d;
                    u<Integer, Integer, Integer> uVar14 = this.S0;
                    if (uVar14 == null) {
                        s.m("parsedMinTime");
                        throw null;
                    }
                    numberPicker8.setMinValue(uVar14.f128607c.intValue());
                    this.f149557d.setMaxValue(59);
                } else {
                    uVar = this.T0;
                    if (uVar != null) {
                        s.m("parsedMaxTime");
                        throw null;
                    }
                    if (i15 == uVar.f128606b.intValue()) {
                        value = this.f149555b.getValue();
                        uVar2 = this.T0;
                        if (uVar2 != null) {
                            s.m("parsedMaxTime");
                            throw null;
                        }
                        if (value == uVar2.f128605a.intValue()) {
                            value2 = this.f149557d.getValue();
                            uVar3 = this.T0;
                            if (uVar3 != null) {
                                s.m("parsedMaxTime");
                                throw null;
                            }
                            if (value2 > uVar3.f128607c.intValue()) {
                                numberPicker3 = this.f149557d;
                                uVar5 = this.T0;
                                if (uVar5 != null) {
                                    s.m("parsedMaxTime");
                                    throw null;
                                }
                                numberPicker3.setValue(uVar5.f128607c.intValue());
                            }
                            this.f149557d.setMinValue(0);
                            numberPicker2 = this.f149557d;
                            uVar4 = this.T0;
                            if (uVar4 != null) {
                                s.m("parsedMaxTime");
                                throw null;
                            }
                            numberPicker2.setMaxValue(uVar4.f128607c.intValue());
                        } else {
                            this.f149557d.setMinValue(0);
                            this.f149557d.setMaxValue(59);
                        }
                    } else {
                        this.f149557d.setMinValue(0);
                        this.f149557d.setMaxValue(59);
                    }
                }
            } else {
                uVar = this.T0;
                if (uVar != null) {
                    s.m("parsedMaxTime");
                    throw null;
                }
                if (i15 == uVar.f128606b.intValue()) {
                    value = this.f149555b.getValue();
                    uVar2 = this.T0;
                    if (uVar2 != null) {
                        s.m("parsedMaxTime");
                        throw null;
                    }
                    if (value == uVar2.f128605a.intValue()) {
                        value2 = this.f149557d.getValue();
                        uVar3 = this.T0;
                        if (uVar3 != null) {
                            s.m("parsedMaxTime");
                            throw null;
                        }
                        if (value2 > uVar3.f128607c.intValue()) {
                            numberPicker3 = this.f149557d;
                            uVar5 = this.T0;
                            if (uVar5 != null) {
                                s.m("parsedMaxTime");
                                throw null;
                            }
                            numberPicker3.setValue(uVar5.f128607c.intValue());
                        }
                        this.f149557d.setMinValue(0);
                        numberPicker2 = this.f149557d;
                        uVar4 = this.T0;
                        if (uVar4 != null) {
                            s.m("parsedMaxTime");
                            throw null;
                        }
                        numberPicker2.setMaxValue(uVar4.f128607c.intValue());
                    } else {
                        this.f149557d.setMinValue(0);
                        this.f149557d.setMaxValue(59);
                    }
                } else {
                    this.f149557d.setMinValue(0);
                    this.f149557d.setMaxValue(59);
                }
            }
        }
        this.f149565k0 = String.valueOf(this.f149555b.getValue());
        this.H0 = String.valueOf(this.f149556c.getValue());
        String strValueOf = String.valueOf(this.f149557d.getValue());
        this.I0 = strValueOf;
        this.f149554a.setTitle(v6(this.f149565k0, this.X, this.Y, this.H0, strValueOf, this.Z));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lag0/c$a;", "", "<init>", "()V", "", "OLD_TIME_KEY", "Ljava/lang/String;", "LOWER_BOUND_KEY", "UPPER_BOUND_KEY", "", "MIN_SEC_LOWER_BOUND", "I", "MIN_SEC_UPPER_BOUND", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static u a(long j8) {
            int i14 = (int) (j8 / ((long) DateTimeConstants.SECONDS_PER_HOUR));
            long j14 = j8 - ((long) (i14 * DateTimeConstants.SECONDS_PER_HOUR));
            int i15 = (int) (j14 / ((long) 60));
            return new u(Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf((int) (j14 - ((long) (i15 * 60)))));
        }

        private a() {
        }
    }
}

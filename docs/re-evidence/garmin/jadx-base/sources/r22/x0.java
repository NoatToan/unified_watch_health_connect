package r22;

import android.content.Context;
import android.os.Bundle;
import android.widget.NumberPicker;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lr22/x0;", "Lr22/a2;", "<init>", "()V", "a", "b", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x0 extends a2 {
    public static final a U0 = new a(null);
    public b S0 = y0.f149925a;
    public b T0 = y0.f149926b;

    @Override // r22.a2
    public final void C6(int i14, int i15, boolean z14) {
        super.C6(i14, i15, true);
        NumberPicker numberPicker = this.f149555b;
        if (numberPicker != null) {
            numberPicker.setMinValue(i14);
        }
        NumberPicker numberPicker2 = this.f149555b;
        if (numberPicker2 != null) {
            numberPicker2.setMaxValue(i15);
        }
    }

    @Override // r22.a2
    public final void H6(int i14, int i15, boolean z14) {
        super.H6(i14, i15, true);
        NumberPicker numberPicker = this.f149556c;
        if (numberPicker != null) {
            numberPicker.setMinValue(i14);
        }
        NumberPicker numberPicker2 = this.f149556c;
        if (numberPicker2 != null) {
            numberPicker2.setMaxValue(i15);
        }
    }

    @Override // r22.a2
    public final void J6(int i14, int i15, boolean z14) {
        super.J6(i14, i15, true);
        NumberPicker numberPicker = this.f149557d;
        if (numberPicker != null) {
            numberPicker.setMinValue(i14);
        }
        NumberPicker numberPicker2 = this.f149557d;
        if (numberPicker2 != null) {
            numberPicker2.setMaxValue(i15);
        }
    }

    public final void T6(b bVar, b bVar2, b bVar3) {
        int iMin = bVar.f149920b;
        int i14 = bVar.f149919a;
        int i15 = bVar2.f149919a;
        int i16 = bVar2.f149920b;
        if (i14 <= i15) {
            iMin = Math.max(iMin, i16);
        } else {
            i16 = y0.f149925a.f149920b;
        }
        int i17 = bVar3.f149919a;
        int i18 = bVar3.f149920b;
        if (i14 >= i17) {
            iMin = Math.min(iMin, i18);
        } else {
            i18 = y0.f149926b.f149920b;
        }
        H6(i16, i18, true);
        E6(iMin);
    }

    public final void U6(b bVar, b bVar2, b bVar3) {
        int iMin = bVar.f149921c;
        int i14 = bVar.f149920b;
        int i15 = bVar.f149919a;
        int i16 = bVar2.f149919a;
        int i17 = bVar2.f149921c;
        if (i15 > i16 || i14 > bVar2.f149920b) {
            i17 = y0.f149925a.f149921c;
        } else {
            iMin = Math.max(iMin, i17);
        }
        int i18 = bVar3.f149919a;
        int i19 = bVar3.f149921c;
        if (i15 < i18 || i14 < bVar3.f149920b) {
            i19 = y0.f149926b.f149921c;
        } else {
            iMin = Math.min(iMin, i19);
        }
        J6(i17, i19, true);
        I6(iMin);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.F = getString(R.string.lbl_cancel);
        this.I = getString(R.string.lbl_done);
        b.a aVar = b.f149918d;
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("EXTRA_PICKER_DURATION")) : null;
        b bVar = y0.f149925a;
        aVar.getClass();
        b bVarA = b.a.a(numValueOf, bVar);
        Bundle arguments2 = getArguments();
        this.S0 = b.a.a(arguments2 != null ? Integer.valueOf(arguments2.getInt("EXTRA_PICKER_MIN_LIMIT_DURATION")) : null, bVar);
        Bundle arguments3 = getArguments();
        b bVarA2 = b.a.a(arguments3 != null ? Integer.valueOf(arguments3.getInt("EXTRA_PICKER_MAX_LIMIT_DURATION")) : null, y0.f149926b);
        int i14 = bVarA2.f149919a;
        this.T0 = bVarA2;
        b bVar2 = this.S0;
        C6(bVar2.f149919a, i14, true);
        int i15 = bVarA.f149919a;
        int i16 = bVar2.f149919a;
        if (i15 <= i16) {
            i14 = i16;
        } else if (i15 < i14) {
            i14 = i15;
        }
        A6(i14);
        T6(bVarA, bVar2, bVarA2);
        U6(bVarA, bVar2, bVarA2);
    }

    @Override // r22.a2
    public final String v6(String str, int i14, int i15, String str2, String str3, int i16) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        l3.a aVar = l3.f23124b;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        return l3.a.j1(contextRequireContext, i14, i15, i16);
    }

    @Override // r22.a2
    public final void z6(NumberPicker numberPicker, int i14, int i15) {
        b bVar;
        if (numberPicker.equals(this.f149555b)) {
            bVar = new b(i15, this.f149556c.getValue(), this.f149557d.getValue());
        } else if (numberPicker.equals(this.f149556c)) {
            bVar = new b(this.f149555b.getValue(), i15, this.f149557d.getValue());
        } else if (!numberPicker.equals(this.f149557d)) {
            return;
        } else {
            bVar = new b(this.f149555b.getValue(), this.f149556c.getValue(), i15);
        }
        b bVar2 = this.S0;
        b bVar3 = this.T0;
        C6(bVar2.f149919a, bVar3.f149919a, true);
        int i16 = bVar2.f149919a;
        int i17 = bVar.f149919a;
        if (i17 > i16 && i17 < (i16 = bVar3.f149919a)) {
            i16 = i17;
        }
        A6(i16);
        T6(bVar, this.S0, this.T0);
        U6(bVar, this.S0, this.T0);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lr22/x0$b;", "", "", "hours", "minutes", "seconds", "<init>", "(III)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f149918d = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f149919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f149920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f149921c;

        public /* synthetic */ b(int i14, int i15, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
            this((i17 & 1) != 0 ? 0 : i14, (i17 & 2) != 0 ? 0 : i15, i16);
        }

        public final int a() {
            return (this.f149920b * 60) + (this.f149919a * DateTimeConstants.SECONDS_PER_HOUR) + this.f149921c;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            bVar2.getClass();
            int iH = p005kotlin.jvm.internal.s.h(this.f149919a, bVar2.f149919a);
            if (iH != 0) {
                return iH;
            }
            int iH2 = p005kotlin.jvm.internal.s.h(this.f149920b, bVar2.f149920b);
            return iH2 != 0 ? iH2 : p005kotlin.jvm.internal.s.h(this.f149921c, bVar2.f149921c);
        }

        public final String toString() {
            return this.f149919a + ":" + this.f149920b + ":" + this.f149921c;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr22/x0$b$a;", "", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static b a(Integer num, b bVar) {
                bVar.getClass();
                if (num == null) {
                    return bVar;
                }
                int iIntValue = num.intValue();
                int i14 = iIntValue / DateTimeConstants.SECONDS_PER_HOUR;
                int i15 = iIntValue % DateTimeConstants.SECONDS_PER_HOUR;
                return new b(i14, i15 / 60, i15 % 60);
            }

            private a() {
            }
        }

        public b(int i14, int i15, int i16) {
            this.f149919a = i14;
            this.f149920b = i15;
            this.f149921c = i16;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr22/x0$a;", "", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static x0 a(a aVar, Integer num, b bVar, int i14) {
            if ((i14 & 2) != 0) {
                bVar = y0.f149925a;
            }
            b bVar2 = y0.f149926b;
            aVar.getClass();
            bVar.getClass();
            bVar2.getClass();
            b.f149918d.getClass();
            b bVarA = b.a.a(num, bVar);
            x0 x0Var = new x0();
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_PICKER_DURATION", bVarA.a());
            bundle.putInt("EXTRA_PICKER_MIN_LIMIT_DURATION", bVar.a());
            bundle.putInt("EXTRA_PICKER_MAX_LIMIT_DURATION", bVar2.a());
            x0Var.setArguments(bundle);
            return x0Var;
        }

        private a() {
        }
    }
}

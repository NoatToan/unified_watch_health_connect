package bp1;

import am.r1;
import android.content.Context;
import c22.j0;
import c22.l3;
import c22.m3;
import c22.q3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import g22.n;
import i3.e5;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.LinkedHashMap;
import lc.u0;
import oi0.h;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.i0;
import p005kotlin.jvm.internal.x0;
import p13.t0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbp1/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ll22/b;", "resolver", "<init>", "(Landroid/content/Context;Ll22/b;)V", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.b f19417b;

    /* JADX INFO: renamed from: bp1.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0284a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19418a;

        static {
            int[] iArr = new int[wo1.a.values().length];
            try {
                iArr[wo1.a.DIMENSIONLESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wo1.a.JUMPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wo1.a.JUMP_METER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[wo1.a.MESSAGES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[wo1.a.METER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[wo1.a.METERS_PER_SECOND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[wo1.a.PERCENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[wo1.a.RPM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[wo1.a.SECOND.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[wo1.a.MILLISECOND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[wo1.a.TIME_OF_DAY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[wo1.a.VAM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[wo1.a.WATT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[wo1.a.WATTS_PER_KG.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f19418a = iArr;
        }
    }

    public a(Context context, l22.b bVar) {
        context.getClass();
        bVar.getClass();
        this.f19416a = context;
        this.f19417b = bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0087 A[PHI: r9
      0x0087: PHI (r9v1 java.lang.String) = 
      (r9v0 java.lang.String)
      (r9v0 java.lang.String)
      (r9v0 java.lang.String)
      (r9v0 java.lang.String)
      (r9v12 java.lang.String)
      (r9v13 java.lang.String)
      (r9v14 java.lang.String)
      (r9v15 java.lang.String)
      (r9v16 java.lang.String)
      (r9v17 java.lang.String)
      (r9v18 java.lang.String)
      (r9v0 java.lang.String)
      (r9v0 java.lang.String)
      (r9v0 java.lang.String)
      (r9v19 java.lang.String)
      (r9v20 java.lang.String)
      (r9v21 java.lang.String)
      (r9v22 java.lang.String)
      (r9v23 java.lang.String)
     binds: [B:8:0x0024, B:10:0x002a, B:23:0x0077, B:66:0x018a, B:63:0x0170, B:64:0x0172, B:60:0x0159, B:61:0x015b, B:58:0x0134, B:57:0x0124, B:54:0x0113, B:52:0x010f, B:32:0x00a6, B:34:0x00ac, B:45:0x00e3, B:46:0x00e5, B:29:0x0093, B:30:0x0095, B:26:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0113 A[PHI: r2
      0x0113: PHI (r2v38 java.lang.String) = (r2v27 java.lang.String), (r2v40 java.lang.String) binds: [B:66:0x018a, B:52:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    public final String a(yo1.b bVar, boolean z14) {
        l22.b bVar2;
        String strB0;
        bVar.getClass();
        String description = bVar.getDescription();
        if (description == null) {
            description = "";
        }
        if (!n.d(description)) {
            return "";
        }
        String winningValueUnit = bVar.getWinningValueUnit();
        double winningValue = bVar.getWinningValue();
        boolean zIsNaN = Double.isNaN(winningValue);
        l22.b bVar3 = this.f19417b;
        String strC = "";
        if (!zIsNaN && !Double.isInfinite(winningValue)) {
            boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
            b bVar4 = new i0() { // from class: bp1.b
                @Override // p005kotlin.jvm.internal.i0, k23.n
                public final Object get(Object obj) {
                    return ((wo1.a) obj).f186439a;
                }
            };
            wo1.a[] aVarArrValues = wo1.a.values();
            int iA = t0.a(aVarArrValues.length);
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (wo1.a aVar : aVarArrValues) {
                linkedHashMap.put(bVar4.invoke(aVar), aVar);
            }
            wo1.a aVar2 = (wo1.a) ((Enum) linkedHashMap.get(winningValueUnit));
            int i14 = aVar2 == null ? -1 : C0284a.f19418a[aVar2.ordinal()];
            Context context = this.f19416a;
            switch (i14) {
                case -1:
                    bVar2 = bVar3;
                    break;
                case 0:
                default:
                    u0.r();
                    return null;
                case 1:
                    bVar2 = bVar3;
                    strC = l3.f23126d.format(winningValue);
                    strC.getClass();
                    break;
                case 2:
                    bVar2 = bVar3;
                    int i15 = (int) winningValue;
                    strC = bVar2.c(R.plurals.lbl_group_ride_jumps, i15, Integer.valueOf(i15));
                    break;
                case 3:
                    bVar2 = bVar3;
                    m3 m3Var = zY ? m3.METER : m3.FOOT;
                    l3.a aVar3 = l3.f23124b;
                    DecimalFormat decimalFormat = l3.f23125c;
                    aVar3.getClass();
                    strC = l3.a.R(bVar2, winningValue, m3Var, decimalFormat, true, "");
                    if (z14) {
                        oi0.b bVar5 = new oi0.b(bVar2, strC);
                        bVar5.g();
                        bVar5.y();
                        Unit unit = Unit.INSTANCE;
                        strC = bVar5.f132238b;
                    }
                    break;
                case 4:
                    bVar2 = bVar3;
                    int i16 = (int) winningValue;
                    strC = bVar2.c(R.plurals.lbl_group_ride_messages, i16, Integer.valueOf(i16));
                    break;
                case 5:
                    bVar2 = bVar3;
                    l3.a aVar4 = l3.f23124b;
                    DecimalFormat decimalFormat2 = l3.f23125c;
                    aVar4.getClass();
                    strC = l3.a.S(bVar2, winningValue, decimalFormat2, true, zY);
                    if (z14) {
                        oi0.b bVar6 = new oi0.b(bVar2, strC);
                        bVar6.s();
                        bVar6.B();
                        Unit unit2 = Unit.INSTANCE;
                        strC = bVar6.f132238b;
                    }
                    break;
                case 6:
                    q3 q3Var = zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                    l3.a aVar5 = l3.f23124b;
                    DecimalFormat decimalFormat3 = l3.f23126d;
                    aVar5.getClass();
                    bVar2 = bVar3;
                    strC = l3.a.O0(bVar2, winningValue, q3Var, decimalFormat3, true, "");
                    if (z14) {
                        oi0.b bVar7 = new oi0.b(bVar2, strC);
                        bVar7.C();
                        bVar7.t();
                        Unit unit3 = Unit.INSTANCE;
                        strC = bVar7.f132238b;
                    }
                    break;
                case 7:
                    l3.f23124b.getClass();
                    strB0 = l3.a.B0(bVar3, winningValue, 0, "");
                    if (strB0 != null) {
                        strC = strB0;
                    }
                    bVar2 = bVar3;
                    break;
                case 8:
                    l3.f23124b.getClass();
                    strC = l3.a.F(bVar3, winningValue, true, true);
                    if (z14) {
                        oi0.b bVar8 = new oi0.b(bVar3, strC);
                        bVar8.T();
                        Unit unit4 = Unit.INSTANCE;
                        strC = bVar8.f132238b;
                    }
                    bVar2 = bVar3;
                    break;
                case 9:
                    l3.f23124b.getClass();
                    strC = l3.a.b1((long) (((double) 1000) * winningValue));
                    if (z14) {
                        strC = new h(context).d((long) winningValue, true);
                    }
                    bVar2 = bVar3;
                    break;
                case 10:
                    String str = l3.f23137o.format(winningValue / 1000.0d);
                    if (z14) {
                        str.getClass();
                        strC = bVar3.a(R.string.lbl_plural_more_than_one_second, str);
                    } else {
                        x0 x0Var = x0.f105818a;
                        strC = String.format(bVar3.getString(R.string.lbl_short_form_for_seconds), Arrays.copyOf(new Object[]{str}, 1));
                    }
                    bVar2 = bVar3;
                    break;
                case 11:
                    DateTime dateTime = new DateTime((long) winningValue);
                    j0.f23099a.getClass();
                    strB0 = j0.b(dateTime, j0.D() ? "HH:mm" : "h:mm a", null);
                    if (strB0 != null) {
                        strC = strB0;
                    }
                    bVar2 = bVar3;
                    break;
                case 12:
                    if (!Double.isNaN(winningValue) && !Double.isInfinite(winningValue)) {
                        boolean zR = r1.r();
                        q3 q3Var2 = zR ? q3.METERS_PER_HOUR : q3.FEET_PER_HOUR;
                        l3.a aVar6 = l3.f23124b;
                        DecimalFormat decimalFormat4 = l3.f23126d;
                        aVar6.getClass();
                        String strN0 = l3.a.N0(context, winningValue, q3Var2, decimalFormat4, false, "");
                        strC = zR ? e5.g(strN0, StringUtils.SPACE, bVar3.getString(R.string.lbl_meters_per_hour_short_abbrev)) : e5.g(strN0, StringUtils.SPACE, bVar3.getString(q3Var2.f23223e));
                        if (z14) {
                            oi0.b bVar9 = new oi0.b(bVar3, strC);
                            bVar9.h();
                            bVar9.z();
                            Unit unit5 = Unit.INSTANCE;
                            strC = bVar9.f132238b;
                        }
                    }
                    bVar2 = bVar3;
                    break;
                case 13:
                    l3.f23124b.getClass();
                    strC = l3.a.E0(bVar3, winningValue, true, "");
                    if (z14) {
                        oi0.b bVar10 = new oi0.b(bVar3, strC);
                        bVar10.X();
                        Unit unit6 = Unit.INSTANCE;
                        strC = bVar10.f132238b;
                    }
                    bVar2 = bVar3;
                    break;
                case 14:
                    strC = l3.f23125c.format(winningValue);
                    strC.getClass();
                    bVar2 = bVar3;
                    break;
            }
        } else {
            bVar2 = bVar3;
        }
        return n.d(strC) ? bVar2.a(R.string.string_space_bullet_string_pattern, description, strC) : description;
    }
}

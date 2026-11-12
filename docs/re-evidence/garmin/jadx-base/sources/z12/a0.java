package z12;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.card.view.CardSummaryRowView;
import java.util.Arrays;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz12/a0;", "", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f201361a = new a0();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f201362a;

        static {
            int[] iArr = new int[q91.d.values().length];
            try {
                iArr[q91.d.f143573t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q91.d.f143574v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q91.d.f143575w.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q91.d.I0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q91.d.J0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q91.d.K0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q91.d.f143577y.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[q91.d.f143576x.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[q91.d.f143568n.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[q91.d.f143569o.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[q91.d.f143578z.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[q91.d.f143570p.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[q91.d.f143571q.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[q91.d.X.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[q91.d.Y.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[q91.d.Z.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[q91.d.f143565k0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[q91.d.H0.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[q91.d.U0.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[q91.d.W0.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[q91.d.V0.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[q91.d.X0.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[q91.d.Z0.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[q91.d.f143555a1.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[q91.d.Y0.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            f201362a = iArr;
        }
    }

    private a0() {
    }

    public static final void a(CardSummaryRowView cardSummaryRowView, j12.f fVar) {
        cardSummaryRowView.getClass();
        Context context = cardSummaryRowView.getContext();
        if (fVar == null) {
            cardSummaryRowView.setVisibility(8);
            return;
        }
        q91.d.a aVar = q91.d.f143558e;
        Long lValueOf = Long.valueOf(fVar.getTypeId());
        aVar.getClass();
        q91.d dVarA = q91.d.a.a(lValueOf);
        if (dVarA == null || fVar.getValue() <= 0.0d) {
            cardSummaryRowView.setVisibility(8);
            return;
        }
        m12.r rVar = (m12.r) KoinJavaComponent.get$default(m12.r.class, null, null, 6, null);
        context.getClass();
        String strN = rVar.n(context, dVarA, fVar.getValue());
        String strN2 = rVar.n(context, dVarA, fVar.getValue());
        f201361a.getClass();
        String strB = b(context, dVarA, true);
        if (!g22.n.d(strB) || !g22.n.d(strN)) {
            cardSummaryRowView.c(strN, strN2);
            return;
        }
        Context context2 = cardSummaryRowView.getContext();
        CharSequence charSequenceC = gm.b.c(context2, R.style.GCMCardSecondaryValueCaption, -1, context2.getString(R.string.string_space_string_pattern, strN, strB));
        String strB2 = b(context, dVarA, false);
        x0 x0Var = x0.f105818a;
        cardSummaryRowView.c(charSequenceC, String.format("%s %s", Arrays.copyOf(new Object[]{strN, strB2}, 2)));
    }

    public static String b(Context context, q91.d dVar, boolean z14) {
        f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        boolean zY = lVar.y();
        gg1.o0 o0VarG = lVar.g();
        boolean z15 = o0VarG == gg1.o0.METRIC || o0VarG == gg1.o0.STATUTE_UK;
        int i14 = a.f201362a[dVar.ordinal()];
        int i15 = R.string.meters;
        int i16 = R.string.lbl_meter;
        switch (i14) {
            case 1:
            case 2:
            case 3:
                String string = context.getString(R.string.lbl_steps);
                string.getClass();
                return string;
            case 4:
            case 5:
            case 6:
                String string2 = context.getString(R.string.lbl_pushes);
                string2.getClass();
                return string2;
            case 7:
            case 8:
                String string3 = context.getString(R.string.common_days);
                string3.getClass();
                return string3;
            case 9:
            case 10:
                if (z14) {
                    String string4 = context.getString(zY ? R.string.lbl_km : R.string.lbl_mile);
                    string4.getClass();
                    return string4;
                }
                String string5 = context.getString(zY ? R.string.kilometers : R.string.miles);
                string5.getClass();
                return string5;
            case 11:
                if (z14) {
                    if (!zY) {
                        i16 = R.string.lbl_yard;
                    }
                    String string6 = context.getString(i16);
                    string6.getClass();
                    return string6;
                }
                if (!zY) {
                    i15 = R.string.common_yards_string;
                }
                String string7 = context.getString(i15);
                string7.getClass();
                return string7;
            case 12:
                if (z14) {
                    if (!z15) {
                        i16 = R.string.lbl_foot;
                    }
                    String string8 = context.getString(i16);
                    string8.getClass();
                    return string8;
                }
                if (!z15) {
                    i15 = R.string.common_feet_string;
                }
                String string9 = context.getString(i15);
                string9.getClass();
                return string9;
            case 13:
                if (z14) {
                    String string10 = context.getString(R.string.lbl_watts);
                    string10.getClass();
                    return string10;
                }
                String string11 = context.getString(R.string.common_watts);
                string11.getClass();
                return string11;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                l22.b bVar = new k52.e(new l22.a(context)).f102947a;
                return zY ? bVar.getString(R.string.lbl_kg) : bVar.getString(R.string.lbl_lbs);
            default:
                return "";
        }
    }
}

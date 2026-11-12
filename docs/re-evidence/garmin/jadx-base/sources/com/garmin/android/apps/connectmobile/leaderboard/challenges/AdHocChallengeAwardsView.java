package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c22.l3;
import c22.m3;
import c22.q3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/AdHocChallengeAwardsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/b;", "list", "", "setAwards", "(Ljava/util/List;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AdHocChallengeAwardsView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f37166a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37167a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.leaderboard.model.t.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38338v.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.L0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38324g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38330l.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38323f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38332n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.Z.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38339w.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.C.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.M0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.P.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.I.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38335q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.I0.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.A.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38337t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.X.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.B.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.K0.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.Q0.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38327j.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38336r.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.J0.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38331m.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.Y.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38328k.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38342z.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.T.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.P0.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38325h.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38326i.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38333o.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38334p.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38340x.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38341y.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.E.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.F.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.f38329k0.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.H0.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.N0.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.t.O0.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            f37167a = iArr;
        }
    }

    public /* synthetic */ AdHocChallengeAwardsView(Context context, AttributeSet attributeSet, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }

    public final void setAwards(List<com.garmin.android.apps.connectmobile.leaderboard.model.b> list) {
        list.getClass();
        removeAllViews();
        this.f37166a = am.j.z(f12.l.f68084a);
        if (list.isEmpty()) {
            return;
        }
        setPadding(0, getResources().getDimensionPixelSize(R.dimen.spacing_large), 0, 0);
        for (com.garmin.android.apps.connectmobile.leaderboard.model.b bVar : list) {
            bVar.getClass();
            String strV0 = null;
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.ad_hoc_challenge_award_list_item, (ViewGroup) null, false);
            viewInflate.getClass();
            TextView textView = (TextView) viewInflate.findViewById(R.id.award_name);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.award_winner);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.award_description_result);
            String string = getContext().getString(bVar.C().f38344b);
            string.getClass();
            Locale locale = Locale.getDefault();
            locale.getClass();
            String upperCase = string.toUpperCase(locale);
            upperCase.getClass();
            textView.setText(upperCase);
            textView2.setText(bVar.f38081e);
            Double d14 = bVar.f38080d;
            if (d14 != null) {
                double dDoubleValue = d14.doubleValue();
                switch (a.f37167a[bVar.C().ordinal()]) {
                    case 1:
                    case 2:
                        strV0 = l3.a.v0(l3.f23124b, getContext(), dDoubleValue, this.f37166a, true, getContext().getString(R.string.no_value), 32);
                        break;
                    case 3:
                        q3 q3Var = this.f37166a ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                        l3.a aVar = l3.f23124b;
                        Context context = getContext();
                        DecimalFormat decimalFormat = l3.f23126d;
                        String string2 = getContext().getString(R.string.no_value);
                        aVar.getClass();
                        strV0 = l3.a.N0(context, dDoubleValue, q3Var, decimalFormat, true, string2);
                        break;
                    case 4:
                        l3.a aVar2 = l3.f23124b;
                        Context context2 = getContext();
                        context2.getClass();
                        boolean z14 = this.f37166a;
                        String string3 = getContext().getString(R.string.no_value);
                        string3.getClass();
                        strV0 = aVar2.J1(context2, dDoubleValue, true, z14, true, string3);
                        break;
                    case 5:
                    case 6:
                        m3 m3Var = this.f37166a ? m3.METER : m3.YARD;
                        l3.a aVar3 = l3.f23124b;
                        Context context3 = getContext();
                        aVar3.getClass();
                        strV0 = l3.a.P(context3, dDoubleValue, m3Var, l3.f23131i, true, getContext().getString(R.string.no_value));
                        break;
                    case 7:
                    case 8:
                        long j8 = bVar.f38080d != null ? (long) (dDoubleValue * ((double) 100)) : 0L;
                        Context context4 = getContext();
                        l3.f23124b.getClass();
                        strV0 = context4.getString(R.string.lbl_value_percent, l3.a.B(j8));
                        break;
                    case 9:
                    case 10:
                    case 11:
                        f12.l.f68084a.getClass();
                        m3 m3Var2 = f12.l.a.a().c() ? m3.FOOT : m3.METER;
                        l3.a aVar4 = l3.f23124b;
                        Context context5 = getContext();
                        aVar4.getClass();
                        strV0 = l3.a.O(context5, dDoubleValue, m3Var2, l3.f23131i, true);
                        break;
                    case 12:
                    case 13:
                        strV0 = l3.a.F0(l3.f23124b, getContext(), dDoubleValue, true);
                        break;
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        m3 m3Var3 = this.f37166a ? m3.KILOMETER : m3.MILE;
                        l3.a aVar5 = l3.f23124b;
                        Context context6 = getContext();
                        DecimalFormat decimalFormat2 = l3.f23126d;
                        aVar5.getClass();
                        strV0 = l3.a.O(context6, dDoubleValue, m3Var3, decimalFormat2, true);
                        break;
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        l3.f23124b.getClass();
                        DecimalFormat decimalFormat3 = new DecimalFormat("#,###.##");
                        decimalFormat3.setMaximumFractionDigits(1);
                        strV0 = decimalFormat3.format(dDoubleValue);
                        strV0.getClass();
                        break;
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                        l3.a aVar6 = l3.f23124b;
                        Context context7 = getContext();
                        context7.getClass();
                        l22.a aVar7 = new l22.a(context7);
                        f12.l.f68084a.getClass();
                        boolean zC = f12.l.a.a().c();
                        aVar6.getClass();
                        strV0 = l3.a.U0(aVar7, dDoubleValue, zC, true, true);
                        break;
                }
            }
            if (strV0 == null || strV0.length() == 0) {
                textView3.setText(getContext().getString(bVar.C().f38345c));
            } else {
                textView3.setText(getContext().getString(R.string.string_space_bullet_string_pattern, getContext().getString(bVar.C().f38345c), strV0));
            }
            addView(viewInflate);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdHocChallengeAwardsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdHocChallengeAwardsView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        setOrientation(1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdHocChallengeAwardsView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}

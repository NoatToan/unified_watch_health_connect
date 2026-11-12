package z12;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.card.view.CardSummaryRowView;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lz12/m;", "Lb32/a;", "Lb32/e;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends b32.a implements b32.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f201437b;

    @Override // b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new n(viewGroup);
    }

    @Override // b32.d
    public final int b() {
        return 1;
    }

    @Override // b32.d
    public final b32.e c(b32.c cVar, int i14) {
        cVar.getClass();
        if (!(cVar instanceof com.garmin.android.apps.connectmobile.userprofile.c)) {
            return null;
        }
        this.f201437b = new l((com.garmin.android.apps.connectmobile.userprofile.c) cVar);
        return this;
    }

    @Override // b32.e
    public final void d(RecyclerView.f0 f0Var, int i14) throws Throwable {
        Throwable th3;
        boolean z14;
        int i15;
        f0Var.getClass();
        l lVar = this.f201437b;
        if (lVar != null) {
            n nVar = f0Var instanceof n ? (n) f0Var : null;
            if (nVar != null) {
                Context context = nVar.itemView.getContext();
                com.garmin.android.apps.connectmobile.userprofile.c.a aVar = lVar.f201434a;
                j12.k kVar = aVar.f46549b;
                CardView cardView = nVar.f201445h;
                if (cardView == null) {
                    p005kotlin.jvm.internal.s.m("cardContainer");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
                layoutParams.getClass();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = context.getResources().getDimensionPixelSize(R.dimen.spacing_normal);
                j12.a sectionPublicity = kVar != null ? kVar.getSectionPublicity() : null;
                j12.i biometricProfile = kVar != null ? kVar.getBiometricProfile() : null;
                if (sectionPublicity == null || biometricProfile == null) {
                    return;
                }
                boolean z15 = !aVar.c() || sectionPublicity.getIsShowAge() || sectionPublicity.getIsShowGender() || sectionPublicity.getIsShowWeight() || sectionPublicity.getIsShowHeight() || sectionPublicity.getIsShowVO2Max();
                TextView textView = nVar.f61662g;
                textView.getClass();
                v22.e.r(textView, (aVar.a() || z15) ? false : true);
                if (aVar.c() || sectionPublicity.getIsShowAge()) {
                    CardSummaryRowView cardSummaryRowView = nVar.f201446i;
                    if (cardSummaryRowView == null) {
                        p005kotlin.jvm.internal.s.m("ageView");
                        throw null;
                    }
                    cardSummaryRowView.setVisibility(0);
                    int iB = biometricProfile.getAge();
                    CardSummaryRowView cardSummaryRowView2 = nVar.f201446i;
                    if (iB > 0) {
                        if (cardSummaryRowView2 == null) {
                            p005kotlin.jvm.internal.s.m("ageView");
                            throw null;
                        }
                        cardSummaryRowView2.setValueText(String.valueOf(biometricProfile.getAge()));
                        CardSummaryRowView cardSummaryRowView3 = nVar.f201446i;
                        if (cardSummaryRowView3 == null) {
                            p005kotlin.jvm.internal.s.m("ageView");
                            throw null;
                        }
                        cardSummaryRowView3.setPrivacyVisibility((aVar.a() || !z15 || sectionPublicity.getIsShowAge()) ? false : true);
                    } else {
                        if (cardSummaryRowView2 == null) {
                            p005kotlin.jvm.internal.s.m("ageView");
                            throw null;
                        }
                        nVar.h(lVar, cardSummaryRowView2);
                    }
                } else {
                    CardSummaryRowView cardSummaryRowView4 = nVar.f201446i;
                    if (cardSummaryRowView4 == null) {
                        p005kotlin.jvm.internal.s.m("ageView");
                        throw null;
                    }
                    cardSummaryRowView4.setVisibility(8);
                }
                if (aVar.c() || sectionPublicity.getIsShowGender()) {
                    CardSummaryRowView cardSummaryRowView5 = nVar.f201447j;
                    if (cardSummaryRowView5 == null) {
                        p005kotlin.jvm.internal.s.m("genderView");
                        throw null;
                    }
                    cardSummaryRowView5.setVisibility(0);
                    if (g22.n.d(biometricProfile.getGender())) {
                        boolean z16 = (aVar.a() || !z15 || sectionPublicity.getIsShowGender()) ? false : true;
                        if (d53.u.q(biometricProfile.getGender(), context.getString(R.string.user_gender_value_male), false)) {
                            CardSummaryRowView cardSummaryRowView6 = nVar.f201447j;
                            if (cardSummaryRowView6 == null) {
                                p005kotlin.jvm.internal.s.m("genderView");
                                throw null;
                            }
                            cardSummaryRowView6.setValueText(context.getString(R.string.lbl_gender_male));
                            CardSummaryRowView cardSummaryRowView7 = nVar.f201447j;
                            if (cardSummaryRowView7 == null) {
                                p005kotlin.jvm.internal.s.m("genderView");
                                throw null;
                            }
                            cardSummaryRowView7.setPrivacyVisibility(z16);
                        } else {
                            boolean zQ = d53.u.q(biometricProfile.getGender(), context.getString(R.string.user_gender_value_female), false);
                            CardSummaryRowView cardSummaryRowView8 = nVar.f201447j;
                            if (zQ) {
                                if (cardSummaryRowView8 == null) {
                                    p005kotlin.jvm.internal.s.m("genderView");
                                    throw null;
                                }
                                cardSummaryRowView8.setValueText(context.getString(R.string.lbl_gender_female));
                                CardSummaryRowView cardSummaryRowView9 = nVar.f201447j;
                                if (cardSummaryRowView9 == null) {
                                    p005kotlin.jvm.internal.s.m("genderView");
                                    throw null;
                                }
                                cardSummaryRowView9.setPrivacyVisibility(z16);
                            } else {
                                if (cardSummaryRowView8 == null) {
                                    p005kotlin.jvm.internal.s.m("genderView");
                                    throw null;
                                }
                                nVar.h(lVar, cardSummaryRowView8);
                            }
                        }
                    } else {
                        CardSummaryRowView cardSummaryRowView10 = nVar.f201447j;
                        if (cardSummaryRowView10 == null) {
                            p005kotlin.jvm.internal.s.m("genderView");
                            throw null;
                        }
                        nVar.h(lVar, cardSummaryRowView10);
                    }
                } else {
                    CardSummaryRowView cardSummaryRowView11 = nVar.f201447j;
                    if (cardSummaryRowView11 == null) {
                        p005kotlin.jvm.internal.s.m("genderView");
                        throw null;
                    }
                    cardSummaryRowView11.setVisibility(8);
                }
                boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                if (aVar.c() || sectionPublicity.getIsShowHeight()) {
                    CardSummaryRowView cardSummaryRowView12 = nVar.f201448k;
                    if (cardSummaryRowView12 == null) {
                        p005kotlin.jvm.internal.s.m("heightView");
                        throw null;
                    }
                    cardSummaryRowView12.setVisibility(0);
                    if (biometricProfile.getHeight() > 0.0d) {
                        if (zY) {
                            String string = gm.b.d(context, String.valueOf((int) biometricProfile.getHeight()), context.getString(m3.CENTIMETER.f23164e)).toString();
                            string.getClass();
                            th3 = null;
                            String strA = oi0.d.a(context, hb.a.i(string), new ig1.l0(18));
                            CardSummaryRowView cardSummaryRowView13 = nVar.f201448k;
                            if (cardSummaryRowView13 == null) {
                                p005kotlin.jvm.internal.s.m("heightView");
                                throw null;
                            }
                            cardSummaryRowView13.c(string, strA);
                        } else {
                            th3 = null;
                            l3.a aVar2 = l3.f23124b;
                            float f14 = (float) biometricProfile.getHeight();
                            aVar2.getClass();
                            String strM0 = l3.a.m0(context, f14, zY, true);
                            String strA2 = oi0.d.a(context, hb.a.i(strM0), new ig1.l0(19));
                            CardSummaryRowView cardSummaryRowView14 = nVar.f201448k;
                            if (cardSummaryRowView14 == null) {
                                p005kotlin.jvm.internal.s.m("heightView");
                                throw null;
                            }
                            cardSummaryRowView14.c(strM0, strA2);
                        }
                        CardSummaryRowView cardSummaryRowView15 = nVar.f201448k;
                        if (cardSummaryRowView15 == null) {
                            p005kotlin.jvm.internal.s.m("heightView");
                            throw th3;
                        }
                        cardSummaryRowView15.setPrivacyVisibility((aVar.a() || !z15 || sectionPublicity.getIsShowHeight()) ? false : true);
                    } else {
                        th3 = null;
                        CardSummaryRowView cardSummaryRowView16 = nVar.f201448k;
                        if (cardSummaryRowView16 == null) {
                            p005kotlin.jvm.internal.s.m("heightView");
                            throw null;
                        }
                        nVar.h(lVar, cardSummaryRowView16);
                    }
                } else {
                    CardSummaryRowView cardSummaryRowView17 = nVar.f201448k;
                    if (cardSummaryRowView17 == null) {
                        p005kotlin.jvm.internal.s.m("heightView");
                        throw null;
                    }
                    cardSummaryRowView17.setVisibility(8);
                    th3 = null;
                }
                if (aVar.c() || sectionPublicity.getIsShowWeight()) {
                    CardSummaryRowView cardSummaryRowView18 = nVar.f201449l;
                    if (cardSummaryRowView18 == null) {
                        p005kotlin.jvm.internal.s.m("weightView");
                        throw th3;
                    }
                    cardSummaryRowView18.setVisibility(0);
                    if (biometricProfile.getWeight() > 0.0d) {
                        l3.a aVar3 = l3.f23124b;
                        double dI = biometricProfile.getWeight();
                        aVar3.getClass();
                        z14 = true;
                        String strC1 = l3.a.C1(aVar3, context, l3.a.P1(dI), zY, false, null, 48);
                        String string2 = context.getString(zY ? R.string.lbl_kg : R.string.lbl_lbs);
                        string2.getClass();
                        String string3 = gm.b.d(context, strC1, string2).toString();
                        string3.getClass();
                        String strA3 = oi0.d.a(context, hb.a.i(string3), new ig1.l0(20));
                        CardSummaryRowView cardSummaryRowView19 = nVar.f201449l;
                        if (cardSummaryRowView19 == null) {
                            p005kotlin.jvm.internal.s.m("weightView");
                            throw th3;
                        }
                        cardSummaryRowView19.c(string3, strA3);
                        CardSummaryRowView cardSummaryRowView20 = nVar.f201449l;
                        if (cardSummaryRowView20 == null) {
                            p005kotlin.jvm.internal.s.m("weightView");
                            throw th3;
                        }
                        cardSummaryRowView20.setPrivacyVisibility((aVar.a() || !z15 || sectionPublicity.getIsShowWeight()) ? false : true);
                        i15 = 8;
                    } else {
                        z14 = true;
                        i15 = 8;
                        CardSummaryRowView cardSummaryRowView21 = nVar.f201449l;
                        if (cardSummaryRowView21 == null) {
                            p005kotlin.jvm.internal.s.m("weightView");
                            throw th3;
                        }
                        nVar.h(lVar, cardSummaryRowView21);
                    }
                } else {
                    CardSummaryRowView cardSummaryRowView22 = nVar.f201449l;
                    if (cardSummaryRowView22 == null) {
                        p005kotlin.jvm.internal.s.m("weightView");
                        throw th3;
                    }
                    cardSummaryRowView22.setVisibility(8);
                    z14 = true;
                    i15 = 8;
                }
                CardSummaryRowView cardSummaryRowView23 = nVar.f201450m;
                if (cardSummaryRowView23 == null) {
                    p005kotlin.jvm.internal.s.m("runningVO2MaxView");
                    throw th3;
                }
                cardSummaryRowView23.setPrivacyVisibility((aVar.a() || !z15 || sectionPublicity.getIsShowVO2Max()) ? false : z14);
                CardSummaryRowView cardSummaryRowView24 = nVar.f201450m;
                if (cardSummaryRowView24 == null) {
                    p005kotlin.jvm.internal.s.m("runningVO2MaxView");
                    throw th3;
                }
                String strA4 = oi0.d.a(context, cardSummaryRowView24.getRowName(), new ig1.l0(21));
                CardSummaryRowView cardSummaryRowView25 = nVar.f201450m;
                if (cardSummaryRowView25 == null) {
                    p005kotlin.jvm.internal.s.m("runningVO2MaxView");
                    throw th3;
                }
                cardSummaryRowView25.setRowNameContentDescription(strA4);
                CardSummaryRowView cardSummaryRowView26 = nVar.f201451n;
                if (cardSummaryRowView26 == null) {
                    p005kotlin.jvm.internal.s.m("cyclingVO2MaxView");
                    throw th3;
                }
                if (aVar.a() || !z15 || sectionPublicity.getIsShowVO2Max()) {
                    z14 = false;
                }
                cardSummaryRowView26.setPrivacyVisibility(z14);
                CardSummaryRowView cardSummaryRowView27 = nVar.f201451n;
                if (cardSummaryRowView27 == null) {
                    p005kotlin.jvm.internal.s.m("cyclingVO2MaxView");
                    throw th3;
                }
                String strA5 = oi0.d.a(context, cardSummaryRowView27.getRowName(), new ig1.l0(22));
                CardSummaryRowView cardSummaryRowView28 = nVar.f201451n;
                if (cardSummaryRowView28 == null) {
                    p005kotlin.jvm.internal.s.m("cyclingVO2MaxView");
                    throw th3;
                }
                cardSummaryRowView28.setRowNameContentDescription(strA5);
                if (aVar.c() || sectionPublicity.getIsShowVO2Max()) {
                    String string4 = context.getString(R.string.common_abbrev_ml_per_kg_per_min);
                    string4.getClass();
                    if (biometricProfile.getVo2MaxRunning() > 0.0d) {
                        String str = l3.f23126d.format(biometricProfile.getVo2MaxRunning());
                        CardSummaryRowView cardSummaryRowView29 = nVar.f201450m;
                        if (cardSummaryRowView29 == null) {
                            p005kotlin.jvm.internal.s.m("runningVO2MaxView");
                            throw th3;
                        }
                        cardSummaryRowView29.setVisibility(0);
                        String string5 = gm.b.d(context, str, string4).toString();
                        string5.getClass();
                        String strA6 = oi0.d.a(context, hb.a.i(string5), new ig1.l0(23));
                        CardSummaryRowView cardSummaryRowView30 = nVar.f201450m;
                        if (cardSummaryRowView30 == null) {
                            p005kotlin.jvm.internal.s.m("runningVO2MaxView");
                            throw th3;
                        }
                        cardSummaryRowView30.c(string5, strA6);
                    } else {
                        CardSummaryRowView cardSummaryRowView31 = nVar.f201450m;
                        if (cardSummaryRowView31 == null) {
                            p005kotlin.jvm.internal.s.m("runningVO2MaxView");
                            throw th3;
                        }
                        cardSummaryRowView31.setVisibility(i15);
                    }
                    if (biometricProfile.getVo2MaxCycling() > 0.0d) {
                        String str2 = l3.f23126d.format(biometricProfile.getVo2MaxCycling());
                        CardSummaryRowView cardSummaryRowView32 = nVar.f201451n;
                        if (cardSummaryRowView32 == null) {
                            p005kotlin.jvm.internal.s.m("cyclingVO2MaxView");
                            throw th3;
                        }
                        cardSummaryRowView32.setVisibility(0);
                        String string6 = gm.b.d(context, str2, string4).toString();
                        string6.getClass();
                        String strA7 = oi0.d.a(context, hb.a.i(string6), new ig1.l0(24));
                        CardSummaryRowView cardSummaryRowView33 = nVar.f201451n;
                        if (cardSummaryRowView33 == null) {
                            p005kotlin.jvm.internal.s.m("cyclingVO2MaxView");
                            throw th3;
                        }
                        cardSummaryRowView33.c(string6, strA7);
                    } else {
                        CardSummaryRowView cardSummaryRowView34 = nVar.f201451n;
                        if (cardSummaryRowView34 == null) {
                            p005kotlin.jvm.internal.s.m("cyclingVO2MaxView");
                            throw th3;
                        }
                        cardSummaryRowView34.setVisibility(i15);
                    }
                } else {
                    CardSummaryRowView cardSummaryRowView35 = nVar.f201450m;
                    if (cardSummaryRowView35 == null) {
                        p005kotlin.jvm.internal.s.m("runningVO2MaxView");
                        throw th3;
                    }
                    cardSummaryRowView35.setVisibility(i15);
                    CardSummaryRowView cardSummaryRowView36 = nVar.f201451n;
                    if (cardSummaryRowView36 == null) {
                        p005kotlin.jvm.internal.s.m("cyclingVO2MaxView");
                        throw th3;
                    }
                    cardSummaryRowView36.setVisibility(i15);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // b32.d
    public final int getItemCount() {
        return 1;
    }

    @Override // b32.d
    public final int getItemViewType(int i14) {
        return 0;
    }

    @Override // b32.a, b32.d
    /* JADX INFO: renamed from: isVisible */
    public final boolean getF120672c() {
        l lVar = this.f201437b;
        if (lVar != null) {
            com.garmin.android.apps.connectmobile.userprofile.c.a aVar = lVar.f201434a;
            j12.k kVar = aVar.f46549b;
            j12.a sectionPublicity = kVar != null ? kVar.getSectionPublicity() : null;
            if (sectionPublicity != null) {
                j12.k kVar2 = aVar.f46549b;
                j12.i biometricProfile = kVar2 != null ? kVar2.getBiometricProfile() : null;
                if (biometricProfile != null && ((biometricProfile.getAge() != 0 || g22.n.d(biometricProfile.getGender()) || biometricProfile.getHeight() != 0.0d || biometricProfile.getWeight() != 0.0d || biometricProfile.getVo2MaxRunning() != 0.0d || biometricProfile.getVo2MaxCycling() != 0.0d) && (aVar.c() || sectionPublicity.getIsShowAge() || sectionPublicity.getIsShowGender() || sectionPublicity.getIsShowWeight() || sectionPublicity.getIsShowHeight() || sectionPublicity.getIsShowVO2Max()))) {
                    return true;
                }
            }
        }
        return false;
    }
}

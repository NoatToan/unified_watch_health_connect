package po2;

import android.content.Context;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import java.util.ArrayList;
import java.util.Collection;
import ng1.c1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f139132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f139133c;

    public /* synthetic */ e0(EditPowerGuideStrategyActivity editPowerGuideStrategyActivity, double d14) {
        this.f139131a = 2;
        this.f139133c = editPowerGuideStrategyActivity;
        this.f139132b = d14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        ab1.g powerGuidanceSummary;
        int i14 = this.f139131a;
        double d14 = this.f139132b;
        Object obj2 = this.f139133c;
        switch (i14) {
            case 0:
                androidx.appcompat.app.e.a aVar = (androidx.appcompat.app.e.a) obj;
                aVar.getClass();
                aVar.setTitle(R.string.wallet_limit_reached);
                Context context = aVar.getContext();
                ko2.c.f105778b.getClass();
                aVar.setMessage(context.getString(R.string.wallet_upper_balance_limit_reached, ko2.c.f(d14), aVar.getContext().getString(R.string.wallet_currency_cny)));
                aVar.setPositiveButton(R.string.lbl_ok, new c1((o) obj2, 13));
                aVar.setCancelable(false);
                return Unit.INSTANCE;
            case 1:
                androidx.appcompat.app.e.a aVar2 = (androidx.appcompat.app.e.a) obj;
                aVar2.getClass();
                aVar2.setTitle(R.string.wallet_title_exceeded_max_balance);
                Context context2 = aVar2.getContext();
                ko2.c.f105778b.getClass();
                aVar2.setMessage(context2.getString(R.string.wallet_message_exceeded_max_balance_with_currency_unit, ko2.c.f(d14), aVar2.getContext().getString(R.string.wallet_currency_cny)));
                aVar2.setPositiveButton(R.string.lbl_ok, new c1((o) obj2, 14));
                aVar2.setCancelable(false);
                return Unit.INSTANCE;
            default:
                EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = (EditPowerGuideStrategyActivity) obj2;
                g3 g3Var = (g3) obj;
                EditPowerGuideStrategyActivity.a aVar3 = EditPowerGuideStrategyActivity.f40384t;
                if (g3Var != null) {
                    int i15 = EditPowerGuideStrategyActivity.b.f40403a[g3Var.f35300a.ordinal()];
                    if (i15 != 1) {
                        int i16 = 2;
                        if (i15 == 2) {
                            editPowerGuideStrategyActivity.hideProgressOverlay();
                            ab1.f fVar = editPowerGuideStrategyActivity.f40390f;
                            if (fVar == null) {
                                p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                                throw null;
                            }
                            ab1.d dVar = fVar.f2563a;
                            if (dVar != null && (powerGuidanceSummary = dVar.getPowerGuidanceSummary()) != null) {
                                powerGuidanceSummary.h(Float.valueOf((float) d14));
                            }
                            ya1.r rVar = editPowerGuideStrategyActivity.f40385a;
                            if (rVar == null) {
                                p005kotlin.jvm.internal.s.m("summaryViewHolder");
                                throw null;
                            }
                            ya1.t tVar = rVar.f195606q;
                            if (tVar != null) {
                                tVar.f195614d = d14;
                                TextView textView = tVar.f195613c;
                                Context context3 = tVar.f195612b;
                                context3.getClass();
                                textView.setText(xa1.h.a(context3, tVar.f195614d));
                                v22.d.d(textView, new ya1.h(i16));
                            }
                            Fragment fragmentG = editPowerGuideStrategyActivity.getSupportFragmentManager().G("BannerFragment");
                            com.garmin.android.apps.connectmobile.x xVar = fragmentG instanceof com.garmin.android.apps.connectmobile.x ? (com.garmin.android.apps.connectmobile.x) fragmentG : null;
                            if (xVar != null) {
                                xVar.dismiss();
                            }
                            ab1.f fVar2 = editPowerGuideStrategyActivity.f40390f;
                            if (fVar2 != null) {
                                ab1.d dVar2 = fVar2.f2563a;
                                ab1.a alertUserSettingsChanges = dVar2 != null ? dVar2.getAlertUserSettingsChanges() : null;
                                if (alertUserSettingsChanges != null) {
                                    Collection collection = alertUserSettingsChanges.f2532a;
                                    if (collection == null) {
                                        collection = p13.j0.f134944a;
                                    }
                                    ArrayList arrayListD1 = p13.h0.d1(collection);
                                    p13.d0.A(arrayListD1, new x91.j(5), true);
                                    if (arrayListD1.isEmpty()) {
                                        ab1.f fVar3 = editPowerGuideStrategyActivity.f40390f;
                                        if (fVar3 == null) {
                                            p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                                            throw null;
                                        }
                                        ab1.d dVar3 = fVar3.f2563a;
                                        if (dVar3 != null) {
                                            dVar3.h(null);
                                        }
                                    } else {
                                        alertUserSettingsChanges.f2532a = arrayListD1;
                                    }
                                }
                            }
                            ab1.f fVar4 = editPowerGuideStrategyActivity.f40390f;
                            if (fVar4 == null) {
                                p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                                throw null;
                            }
                            ab1.d dVar4 = fVar4.f2563a;
                            ab1.a alertUserSettingsChanges2 = dVar4 != null ? dVar4.getAlertUserSettingsChanges() : null;
                            if (alertUserSettingsChanges2 != null) {
                                editPowerGuideStrategyActivity.ka(alertUserSettingsChanges2);
                            }
                        } else {
                            if (i15 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            editPowerGuideStrategyActivity.hideProgressOverlay();
                            editPowerGuideStrategyActivity.displayFailedMessage();
                        }
                    } else {
                        editPowerGuideStrategyActivity.showProgressOverlay();
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e0(int i14, double d14, e23.l lVar) {
        this.f139131a = i14;
        this.f139132b = d14;
        this.f139133c = lVar;
    }
}

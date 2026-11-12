package xa1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditRidingPositionActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditTerrainActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.PowerGuideFullscreenChartActivity;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import lc.u0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import po2.e0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditPowerGuideStrategyActivity f189731b;

    public /* synthetic */ b(EditPowerGuideStrategyActivity editPowerGuideStrategyActivity, int i14) {
        this.f189730a = i14;
        this.f189731b = editPowerGuideStrategyActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.l
    public final Object invoke(Object obj) {
        ab1.d dVar;
        ab1.g powerGuidanceSummary;
        PowerZonesDTO powerZonesDTO;
        ab1.g powerGuidanceSummary2;
        ab1.g powerGuidanceSummary3;
        ab1.g powerGuidanceSummary4;
        ab1.g powerGuidanceSummary5;
        Float f14;
        ab1.g powerGuidanceSummary6;
        ab1.g powerGuidanceSummary7;
        ab1.g powerGuidanceSummary8;
        int i14 = this.f189730a;
        EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = this.f189731b;
        switch (i14) {
            case 0:
                String str = (String) obj;
                EditPowerGuideStrategyActivity.a aVar = EditPowerGuideStrategyActivity.f40384t;
                str.getClass();
                k kVar = editPowerGuideStrategyActivity.f40389e;
                if (kVar == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                kVar.f189761j.j(Boolean.TRUE);
                ab1.f fVarD = kVar.f189760i.d();
                if (fVarD != null && (dVar = fVarD.f2563a) != null && (powerGuidanceSummary = dVar.getPowerGuidanceSummary()) != null) {
                    powerGuidanceSummary.f2569b = str;
                }
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) obj;
                EditPowerGuideStrategyActivity.a aVar2 = EditPowerGuideStrategyActivity.f40384t;
                eVar.getClass();
                editPowerGuideStrategyActivity.f40397m.d(editPowerGuideStrategyActivity, eVar, !editPowerGuideStrategyActivity.ea());
                return Unit.INSTANCE;
            case 2:
                ab1.p pVar = (ab1.p) obj;
                EditPowerGuideStrategyActivity.a aVar3 = EditPowerGuideStrategyActivity.f40384t;
                pVar.getClass();
                EditTerrainActivity.f40407b.getClass();
                Intent intent = new Intent(editPowerGuideStrategyActivity, (Class<?>) EditTerrainActivity.class);
                intent.putExtra("extra_terrain", pVar);
                editPowerGuideStrategyActivity.startActivityForResult(intent, 1);
                return Unit.INSTANCE;
            case 3:
                za1.c cVar = (za1.c) obj;
                EditPowerGuideStrategyActivity.a aVar4 = EditPowerGuideStrategyActivity.f40384t;
                cVar.getClass();
                PowerGuideFullscreenChartActivity.f40409a.getClass();
                Intent intent2 = new Intent(editPowerGuideStrategyActivity, (Class<?>) PowerGuideFullscreenChartActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("POWER_GUIDE_CHART_DATA", cVar);
                l2.f37135b.getClass();
                l2.a.b().a(intent2, bundle);
                editPowerGuideStrategyActivity.startActivity(intent2);
                return Unit.INSTANCE;
            case 4:
                int iIntValue = ((Integer) obj).intValue();
                ab1.f fVar = editPowerGuideStrategyActivity.f40390f;
                if (fVar != null && (powerZonesDTO = fVar.f2565c) != null) {
                    k kVar2 = editPowerGuideStrategyActivity.f40389e;
                    if (kVar2 == null) {
                        p005kotlin.jvm.internal.s.m("viewModel");
                        throw null;
                    }
                    y0 y0Var = new y0();
                    ge1.b.T(v1.a(kVar2), null, null, new u(y0Var, powerZonesDTO, iIntValue, kVar2, null), 3);
                    y0Var.f(editPowerGuideStrategyActivity, new EditPowerGuideStrategyActivity.c(new ap.b(editPowerGuideStrategyActivity, iIntValue, 20)));
                }
                return Unit.INSTANCE;
            case 5:
                double dDoubleValue = ((Double) obj).doubleValue();
                k kVar3 = editPowerGuideStrategyActivity.f40389e;
                if (kVar3 == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                y0 y0Var2 = new y0();
                ab1.r rVar = new ab1.r(new ab1.q(null, Double.valueOf(((double) 1000) * dDoubleValue), 1, null));
                w9.a aVarA = v1.a(kVar3);
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new v(y0Var2, kVar3, rVar, dDoubleValue, null), 2);
                y0Var2.f(editPowerGuideStrategyActivity, new EditPowerGuideStrategyActivity.c(new e0(editPowerGuideStrategyActivity, dDoubleValue)));
                return Unit.INSTANCE;
            case 6:
                ab1.l lVar = (ab1.l) obj;
                EditPowerGuideStrategyActivity.a aVar5 = EditPowerGuideStrategyActivity.f40384t;
                lVar.getClass();
                EditRidingPositionActivity.f40405b.getClass();
                Intent intent3 = new Intent(editPowerGuideStrategyActivity, (Class<?>) EditRidingPositionActivity.class);
                intent3.putExtra("riding_position", lVar);
                editPowerGuideStrategyActivity.startActivityForResult(intent3, 2);
                return Unit.INSTANCE;
            case 7:
                w01.c cVar3 = (w01.c) obj;
                EditPowerGuideStrategyActivity.a aVar6 = EditPowerGuideStrategyActivity.f40384t;
                cVar3.getClass();
                ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).w(editPowerGuideStrategyActivity, cVar3, editPowerGuideStrategyActivity.f40402r);
                return Unit.INSTANCE;
            case 8:
                g3 g3Var = (g3) obj;
                EditPowerGuideStrategyActivity.a aVar7 = EditPowerGuideStrategyActivity.f40384t;
                if (g3Var != null) {
                    int i15 = EditPowerGuideStrategyActivity.b.f40403a[g3Var.f35300a.ordinal()];
                    if (i15 == 1) {
                        editPowerGuideStrategyActivity.showProgressOverlay(editPowerGuideStrategyActivity.getString(R.string.msg_duplicate_course_progress));
                    } else if (i15 == 2) {
                        editPowerGuideStrategyActivity.hideProgressOverlay();
                        com.garmin.android.apps.connectmobile.courses.model.e eVar2 = (com.garmin.android.apps.connectmobile.courses.model.e) g3Var.f35301b;
                        if (eVar2 != null) {
                            ab1.f fVar2 = editPowerGuideStrategyActivity.f40390f;
                            if (fVar2 == null) {
                                p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                                throw null;
                            }
                            fVar2.f2564b = eVar2;
                            String str2 = eVar2.courseId;
                            Long lJ = str2 != null ? d53.t.j(str2) : null;
                            if (lJ != null) {
                                ab1.f fVar3 = editPowerGuideStrategyActivity.f40390f;
                                if (fVar3 == null) {
                                    p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                                    throw null;
                                }
                                ab1.d dVar2 = fVar3.f2563a;
                                if (dVar2 != null && (powerGuidanceSummary2 = dVar2.getPowerGuidanceSummary()) != null) {
                                    powerGuidanceSummary2.f2570c = lJ;
                                }
                                editPowerGuideStrategyActivity.ga();
                            } else {
                                editPowerGuideStrategyActivity.displayFailedMessage();
                            }
                        } else {
                            editPowerGuideStrategyActivity.displayFailedMessage();
                        }
                    } else {
                        if (i15 != 3) {
                            u0.r();
                            return null;
                        }
                        editPowerGuideStrategyActivity.hideProgressOverlay();
                        editPowerGuideStrategyActivity.displayFailedMessage();
                    }
                }
                return Unit.INSTANCE;
            case 9:
                g3 g3Var2 = (g3) obj;
                EditPowerGuideStrategyActivity.a aVar8 = EditPowerGuideStrategyActivity.f40384t;
                if (g3Var2 != null) {
                    int i16 = EditPowerGuideStrategyActivity.b.f40403a[g3Var2.f35300a.ordinal()];
                    if (i16 == 1) {
                        editPowerGuideStrategyActivity.showProgressOverlay();
                    } else if (i16 == 2) {
                        editPowerGuideStrategyActivity.hideProgressOverlay();
                        Intent intent4 = new Intent();
                        intent4.setAction("android.intent.action.DELETE");
                        intent4.putExtra("GCM_extra_power_guide_id_to_remove", editPowerGuideStrategyActivity.f40391g);
                        editPowerGuideStrategyActivity.setResult(-1, intent4);
                        editPowerGuideStrategyActivity.finish();
                    } else {
                        if (i16 != 3) {
                            u0.r();
                            return null;
                        }
                        editPowerGuideStrategyActivity.hideProgressOverlay();
                        new androidx.appcompat.app.e.a(editPowerGuideStrategyActivity).setTitle(R.string.power_guide_could_not_delete_title).setMessage(editPowerGuideStrategyActivity.getString(R.string.power_guide_could_not_delete_msg)).setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
                    }
                }
                return Unit.INSTANCE;
            case 10:
                g3 g3Var3 = (g3) obj;
                EditPowerGuideStrategyActivity.a aVar9 = EditPowerGuideStrategyActivity.f40384t;
                if (g3Var3 != null) {
                    int i17 = EditPowerGuideStrategyActivity.b.f40403a[g3Var3.f35300a.ordinal()];
                    if (i17 == 1) {
                        editPowerGuideStrategyActivity.showProgressOverlay();
                    } else if (i17 == 2) {
                        editPowerGuideStrategyActivity.hideProgressOverlay();
                        com.garmin.android.apps.connectmobile.k kVar4 = editPowerGuideStrategyActivity.f40396l;
                        ab1.f fVar4 = (ab1.f) g3Var3.f35301b;
                        if (fVar4 != null) {
                            ab1.f fVar5 = editPowerGuideStrategyActivity.f40390f;
                            if (fVar5 == null) {
                                p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                                throw null;
                            }
                            ab1.d dVar3 = fVar5.f2563a;
                            if (dVar3 != null && (powerGuidanceSummary4 = dVar3.getPowerGuidanceSummary()) != null) {
                                powerGuidanceSummary4.deleteObserver(kVar4);
                            }
                            editPowerGuideStrategyActivity.f40390f = fVar4;
                            ab1.d dVar4 = fVar4.f2563a;
                            if (dVar4 != null && (powerGuidanceSummary3 = dVar4.getPowerGuidanceSummary()) != null) {
                                powerGuidanceSummary3.addObserver(kVar4);
                            }
                            editPowerGuideStrategyActivity.pa();
                        } else {
                            editPowerGuideStrategyActivity.displayFailedMessage();
                        }
                    } else {
                        if (i17 != 3) {
                            u0.r();
                            return null;
                        }
                        editPowerGuideStrategyActivity.hideProgressOverlay();
                        editPowerGuideStrategyActivity.displayFailedMessage();
                    }
                }
                return Unit.INSTANCE;
            case 11:
                g3 g3Var4 = (g3) obj;
                EditPowerGuideStrategyActivity.a aVar10 = EditPowerGuideStrategyActivity.f40384t;
                if (g3Var4 != null) {
                    int i18 = EditPowerGuideStrategyActivity.b.f40403a[g3Var4.f35300a.ordinal()];
                    EditPowerGuideStrategyActivity editPowerGuideStrategyActivity2 = this.f189731b;
                    if (i18 == 1) {
                        editPowerGuideStrategyActivity2.showProgressOverlay();
                    } else if (i18 == 2) {
                        editPowerGuideStrategyActivity2.hideProgressOverlay();
                        k kVar5 = editPowerGuideStrategyActivity2.f40389e;
                        if (kVar5 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        ge1.b.T(v1.a(kVar5), null, null, new s(kVar5, editPowerGuideStrategyActivity2.f40391g, null), 3);
                        ab1.d dVar5 = (ab1.d) g3Var4.f35301b;
                        Long powerGuidancePk = dVar5 != null ? dVar5.getPowerGuidancePk() : null;
                        String string = editPowerGuideStrategyActivity2.ea() ? editPowerGuideStrategyActivity2.getString(R.string.lbl_power_guide_updated_title) : editPowerGuideStrategyActivity2.getString(R.string.lbl_power_guide_saved);
                        string.getClass();
                        ab1.f fVar6 = editPowerGuideStrategyActivity2.f40390f;
                        if (fVar6 == null) {
                            p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                            throw null;
                        }
                        w01.c cVar4 = fVar6.f2566d;
                        String string2 = (cVar4 != null ? cVar4.f181028a : null) != null ? editPowerGuideStrategyActivity2.getString(R.string.lbl_updated_power_guide_message) : editPowerGuideStrategyActivity2.getString(R.string.lbl_saved_power_guide_message);
                        string2.getClass();
                        String string3 = editPowerGuideStrategyActivity2.getString(R.string.common_button_got_it);
                        string3.getClass();
                        androidx.appcompat.app.e eVarShow = new androidx.appcompat.app.e.a(editPowerGuideStrategyActivity2).setView(new ya1.m(editPowerGuideStrategyActivity2, string, string2, string3, new wz1.c(15, editPowerGuideStrategyActivity2, powerGuidancePk)).a()).show();
                        eVarShow.getClass();
                        editPowerGuideStrategyActivity2.f40400p = eVarShow;
                    } else {
                        if (i18 != 3) {
                            u0.r();
                            return null;
                        }
                        editPowerGuideStrategyActivity2.hideProgressOverlay();
                        editPowerGuideStrategyActivity2.displayFailedMessage();
                    }
                }
                return Unit.INSTANCE;
            case 12:
                g3 g3Var5 = (g3) obj;
                EditPowerGuideStrategyActivity.a aVar11 = EditPowerGuideStrategyActivity.f40384t;
                if (g3Var5 != null) {
                    int i19 = EditPowerGuideStrategyActivity.b.f40403a[g3Var5.f35300a.ordinal()];
                    if (i19 == 1) {
                        editPowerGuideStrategyActivity.showProgressOverlay();
                    } else if (i19 == 2) {
                        editPowerGuideStrategyActivity.hideProgressOverlay();
                        com.garmin.android.apps.connectmobile.k kVar6 = editPowerGuideStrategyActivity.f40396l;
                        ab1.f fVar7 = (ab1.f) g3Var5.f35301b;
                        if (fVar7 != null) {
                            ab1.f fVar8 = editPowerGuideStrategyActivity.f40390f;
                            if (fVar8 == null) {
                                p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                                throw null;
                            }
                            ab1.d dVar6 = fVar8.f2563a;
                            if (dVar6 != null && (powerGuidanceSummary8 = dVar6.getPowerGuidanceSummary()) != null) {
                                powerGuidanceSummary8.deleteObserver(kVar6);
                            }
                            editPowerGuideStrategyActivity.f40390f = fVar7;
                            ab1.d dVar7 = fVar7.f2563a;
                            if (dVar7 != null && (powerGuidanceSummary7 = dVar7.getPowerGuidanceSummary()) != null) {
                                powerGuidanceSummary7.addObserver(kVar6);
                            }
                            ab1.f fVar9 = editPowerGuideStrategyActivity.f40390f;
                            if (fVar9 == null) {
                                p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                                throw null;
                            }
                            ab1.d dVar8 = fVar9.f2563a;
                            Integer num = (dVar8 == null || (powerGuidanceSummary6 = dVar8.getPowerGuidanceSummary()) == null) ? null : powerGuidanceSummary6.f2573f;
                            if (num != null) {
                                ya1.r rVar2 = editPowerGuideStrategyActivity.f40385a;
                                if (rVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("summaryViewHolder");
                                    throw null;
                                }
                                int iIntValue2 = num.intValue();
                                ya1.i iVar = rVar2.f195605p;
                                if (iVar != null) {
                                    iVar.a(iIntValue2);
                                }
                            }
                            ab1.f fVar10 = editPowerGuideStrategyActivity.f40390f;
                            if (fVar10 == null) {
                                p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                                throw null;
                            }
                            ab1.d dVar9 = fVar10.f2563a;
                            Double dValueOf = (dVar9 == null || (powerGuidanceSummary5 = dVar9.getPowerGuidanceSummary()) == null || (f14 = powerGuidanceSummary5.f2577j) == null) ? null : Double.valueOf(f14.floatValue());
                            if (dValueOf != null) {
                                ya1.r rVar3 = editPowerGuideStrategyActivity.f40385a;
                                if (rVar3 == null) {
                                    p005kotlin.jvm.internal.s.m("summaryViewHolder");
                                    throw null;
                                }
                                double dDoubleValue2 = dValueOf.doubleValue();
                                ya1.t tVar = rVar3.f195606q;
                                if (tVar != null) {
                                    tVar.f195614d = dDoubleValue2;
                                    TextView textView = tVar.f195613c;
                                    Context context = tVar.f195612b;
                                    context.getClass();
                                    textView.setText(h.a(context, tVar.f195614d));
                                    v22.d.d(textView, new ya1.h(2));
                                }
                            }
                            editPowerGuideStrategyActivity.pa();
                            sa1.j jVar = editPowerGuideStrategyActivity.f40397m;
                            ab1.f fVar11 = editPowerGuideStrategyActivity.f40390f;
                            if (fVar11 == null) {
                                p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                                throw null;
                            }
                            com.garmin.android.apps.connectmobile.courses.model.e eVar3 = fVar11.f2564b;
                            jVar.n(editPowerGuideStrategyActivity, eVar3 != null ? eVar3.z() : null);
                        } else {
                            editPowerGuideStrategyActivity.displayFailedMessage();
                        }
                    } else {
                        if (i19 != 3) {
                            u0.r();
                            return null;
                        }
                        editPowerGuideStrategyActivity.hideProgressOverlay();
                        editPowerGuideStrategyActivity.displayFailedMessage();
                    }
                }
                return Unit.INSTANCE;
            default:
                Boolean bool = (Boolean) obj;
                EditPowerGuideStrategyActivity.a aVar12 = EditPowerGuideStrategyActivity.f40384t;
                if (bool != null && editPowerGuideStrategyActivity.getResources().getConfiguration().orientation == 1) {
                    Button button = editPowerGuideStrategyActivity.f40388d;
                    if (button == null) {
                        p005kotlin.jvm.internal.s.m("saveBtn");
                        throw null;
                    }
                    v22.e.v(button, bool.booleanValue());
                }
                return Unit.INSTANCE;
        }
    }
}

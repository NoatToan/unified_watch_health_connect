package com.xiaomi.fitness.sport_capture.widgets;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.d1j;
import defpackage.ded;
import defpackage.eae;
import defpackage.f8e;
import defpackage.p2o;
import defpackage.pde;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/widgets/SportStatusInfoViewType3;", "Lcom/xiaomi/fitness/sport_capture/widgets/BaseSportStatusInfoView;", "Lded;", "projectionData", "", "oriRotate", "", "render", "(Lded;F)V", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "Lp2o;", "binding", "Lp2o;", "<init>", "(Landroid/content/Context;)V", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportStatusInfoViewType3 extends BaseSportStatusInfoView {

    @Nullable
    private p2o binding;

    @NotNull
    private final Context ctx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportStatusInfoViewType3(@NotNull Context ctx) {
        super(ctx, null, 2, null);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.binding = p2o.A0(LayoutInflater.from(ctx), this, true);
    }

    @Override // com.xiaomi.fitness.sport_capture.widgets.BaseSportStatusInfoView
    public void render(@NotNull ded projectionData, float oriRotate) {
        pde pdeVar;
        TextView textView;
        PathView pathView;
        eae eaeVar;
        TextView textView2;
        p2o p2oVar;
        eae eaeVar2;
        TextView textView3;
        eae eaeVar3;
        TextView textView4;
        eae eaeVar4;
        TextView textView5;
        eae eaeVar5;
        TextView textView6;
        eae eaeVar6;
        TextView textView7;
        eae eaeVar7;
        TextView textView8;
        eae eaeVar8;
        TextView textView9;
        eae eaeVar9;
        TextView textView10;
        TextView textView11;
        eae eaeVar10;
        TextView textView12;
        eae eaeVar11;
        TextView textView13;
        eae eaeVar12;
        TextView textView14;
        eae eaeVar13;
        TextView textView15;
        eae eaeVar14;
        TextView textView16;
        eae eaeVar15;
        TextView textView17;
        SpeedView speedView;
        f8e f8eVar;
        TextView textView18;
        pde pdeVar2;
        LinearLayout linearLayout;
        pde pdeVar3;
        TextView textView19;
        Intrinsics.checkNotNullParameter(projectionData, "projectionData");
        p2o p2oVar2 = this.binding;
        if (p2oVar2 != null && (pdeVar3 = p2oVar2.K) != null && (textView19 = pdeVar3.D) != null) {
            textView19.setText(getTimeStr());
        }
        Pair<Boolean, String> pairCalcVideoDurationInfo = calcVideoDurationInfo();
        if (pairCalcVideoDurationInfo.getFirst().booleanValue()) {
            p2o p2oVar3 = this.binding;
            if (p2oVar3 != null && (pdeVar = p2oVar3.K) != null && (textView = pdeVar.A) != null) {
                textView.setText(pairCalcVideoDurationInfo.getSecond());
            }
        } else {
            p2o p2oVar4 = this.binding;
            if (p2oVar4 != null && (pdeVar2 = p2oVar4.K) != null && (linearLayout = pdeVar2.B) != null) {
                ViewExtKt.invisible(linearLayout);
            }
        }
        p2o p2oVar5 = this.binding;
        if (p2oVar5 != null && (f8eVar = p2oVar5.B) != null && (textView18 = f8eVar.A) != null) {
            textView18.setText(getDeviceModelNameStr());
        }
        p2o p2oVar6 = this.binding;
        if (p2oVar6 != null && (speedView = p2oVar6.J) != null) {
            speedView.setSpeed(getSpeed(projectionData.f15440k));
        }
        p2o p2oVar7 = this.binding;
        if (p2oVar7 != null && (eaeVar15 = p2oVar7.I) != null && (textView17 = eaeVar15.B) != null) {
            textView17.setText(ApplicationExtKt.getApplication().getString(d1j.s));
        }
        p2o p2oVar8 = this.binding;
        if (p2oVar8 != null && (eaeVar14 = p2oVar8.I) != null && (textView16 = eaeVar14.D) != null) {
            textView16.setText(getSlopeStr(projectionData.t.f));
        }
        p2o p2oVar9 = this.binding;
        if (p2oVar9 != null && (eaeVar13 = p2oVar9.I) != null && (textView15 = eaeVar13.C) != null) {
            textView15.setText("%");
        }
        Pair<String, String> distanceStrInfo = getDistanceStrInfo(projectionData.i);
        p2o p2oVar10 = this.binding;
        if (p2oVar10 != null && (eaeVar12 = p2oVar10.C) != null && (textView14 = eaeVar12.B) != null) {
            textView14.setText(ApplicationExtKt.getApplication().getString(d1j.x));
        }
        p2o p2oVar11 = this.binding;
        if (p2oVar11 != null && (eaeVar11 = p2oVar11.C) != null && (textView13 = eaeVar11.D) != null) {
            textView13.setText(distanceStrInfo.getFirst());
        }
        p2o p2oVar12 = this.binding;
        if (p2oVar12 != null && (eaeVar10 = p2oVar12.C) != null && (textView12 = eaeVar10.C) != null) {
            textView12.setText(distanceStrInfo.getSecond());
        }
        p2o p2oVar13 = this.binding;
        if (p2oVar13 != null && (textView11 = p2oVar13.F) != null) {
            textView11.setText(getADecendStr(projectionData.t.e));
        }
        p2o p2oVar14 = this.binding;
        if (p2oVar14 != null && (eaeVar9 = p2oVar14.A) != null && (textView10 = eaeVar9.B) != null) {
            textView10.setText(ApplicationExtKt.getApplication().getString(d1j.j));
        }
        p2o p2oVar15 = this.binding;
        if (p2oVar15 != null && (eaeVar8 = p2oVar15.A) != null && (textView9 = eaeVar8.D) != null) {
            textView9.setText(getCalorieStr(projectionData.g));
        }
        p2o p2oVar16 = this.binding;
        if (p2oVar16 != null && (eaeVar7 = p2oVar16.A) != null && (textView8 = eaeVar7.C) != null) {
            textView8.setText("KCAL");
        }
        p2o p2oVar17 = this.binding;
        if (p2oVar17 != null && (eaeVar6 = p2oVar17.G) != null && (textView7 = eaeVar6.B) != null) {
            textView7.setText(ApplicationExtKt.getApplication().getString(d1j.p));
        }
        p2o p2oVar18 = this.binding;
        if (p2oVar18 != null && (eaeVar5 = p2oVar18.G) != null && (textView6 = eaeVar5.D) != null) {
            textView6.setText(String.valueOf(projectionData.f));
        }
        p2o p2oVar19 = this.binding;
        if (p2oVar19 != null && (eaeVar4 = p2oVar19.G) != null && (textView5 = eaeVar4.C) != null) {
            textView5.setText("BPM");
        }
        p2o p2oVar20 = this.binding;
        if (p2oVar20 != null && (eaeVar3 = p2oVar20.G) != null && (textView4 = eaeVar3.A) != null) {
            textView4.setVisibility(needShowHrType(projectionData.f15441r) ? 0 : 4);
        }
        p2o p2oVar21 = this.binding;
        if (p2oVar21 != null && (eaeVar = p2oVar21.G) != null && (textView2 = eaeVar.A) != null && textView2.getVisibility() == 0 && (p2oVar = this.binding) != null && (eaeVar2 = p2oVar.G) != null && (textView3 = eaeVar2.A) != null) {
            textView3.setText(getHrSectionStr(projectionData.p));
        }
        p2o p2oVar22 = this.binding;
        if (p2oVar22 == null || (pathView = p2oVar22.H) == null) {
            return;
        }
        pathView.update(oriRotate, this.ctx);
    }
}

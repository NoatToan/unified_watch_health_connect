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
import defpackage.j2o;
import defpackage.pde;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/widgets/SportStatusInfoViewType1;", "Lcom/xiaomi/fitness/sport_capture/widgets/BaseSportStatusInfoView;", "Lded;", "projectionData", "", "oriRotate", "", "render", "(Lded;F)V", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "Lj2o;", "binding", "Lj2o;", "<init>", "(Landroid/content/Context;)V", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportStatusInfoViewType1 extends BaseSportStatusInfoView {

    @Nullable
    private j2o binding;

    @NotNull
    private final Context ctx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportStatusInfoViewType1(@NotNull Context ctx) {
        super(ctx, null, 2, null);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.binding = j2o.A0(LayoutInflater.from(ctx), this, true);
    }

    @Override // com.xiaomi.fitness.sport_capture.widgets.BaseSportStatusInfoView
    public void render(@NotNull ded projectionData, float oriRotate) {
        pde pdeVar;
        TextView textView;
        PathView pathView;
        SpeedView speedView;
        eae eaeVar;
        TextView textView2;
        j2o j2oVar;
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
        TextView textView12;
        eae eaeVar10;
        TextView textView13;
        eae eaeVar11;
        TextView textView14;
        eae eaeVar12;
        TextView textView15;
        eae eaeVar13;
        TextView textView16;
        eae eaeVar14;
        TextView textView17;
        eae eaeVar15;
        TextView textView18;
        f8e f8eVar;
        TextView textView19;
        pde pdeVar2;
        LinearLayout linearLayout;
        pde pdeVar3;
        TextView textView20;
        Intrinsics.checkNotNullParameter(projectionData, "projectionData");
        j2o j2oVar2 = this.binding;
        if (j2oVar2 != null && (pdeVar3 = j2oVar2.J) != null && (textView20 = pdeVar3.D) != null) {
            textView20.setText(getTimeStr());
        }
        Pair<Boolean, String> pairCalcVideoDurationInfo = calcVideoDurationInfo();
        if (pairCalcVideoDurationInfo.getFirst().booleanValue()) {
            j2o j2oVar3 = this.binding;
            if (j2oVar3 != null && (pdeVar = j2oVar3.J) != null && (textView = pdeVar.A) != null) {
                textView.setText(pairCalcVideoDurationInfo.getSecond());
            }
        } else {
            j2o j2oVar4 = this.binding;
            if (j2oVar4 != null && (pdeVar2 = j2oVar4.J) != null && (linearLayout = pdeVar2.B) != null) {
                ViewExtKt.invisible(linearLayout);
            }
        }
        j2o j2oVar5 = this.binding;
        if (j2oVar5 != null && (f8eVar = j2oVar5.B) != null && (textView19 = f8eVar.A) != null) {
            textView19.setText(getDeviceModelNameStr());
        }
        Pair<String, String> distanceStrInfo = getDistanceStrInfo(projectionData.i);
        j2o j2oVar6 = this.binding;
        if (j2oVar6 != null && (eaeVar15 = j2oVar6.C) != null && (textView18 = eaeVar15.B) != null) {
            textView18.setText(ApplicationExtKt.getApplication().getString(d1j.w));
        }
        j2o j2oVar7 = this.binding;
        if (j2oVar7 != null && (eaeVar14 = j2oVar7.C) != null && (textView17 = eaeVar14.D) != null) {
            textView17.setText(distanceStrInfo.getFirst());
        }
        j2o j2oVar8 = this.binding;
        if (j2oVar8 != null && (eaeVar13 = j2oVar8.C) != null && (textView16 = eaeVar13.C) != null) {
            textView16.setText(distanceStrInfo.getSecond());
        }
        j2o j2oVar9 = this.binding;
        if (j2oVar9 != null && (eaeVar12 = j2oVar9.E) != null && (textView15 = eaeVar12.B) != null) {
            textView15.setText(ApplicationExtKt.getApplication().getString(d1j.o));
        }
        j2o j2oVar10 = this.binding;
        if (j2oVar10 != null && (eaeVar11 = j2oVar10.E) != null && (textView14 = eaeVar11.D) != null) {
            ded.b elevationInfo = projectionData.t;
            Intrinsics.checkNotNullExpressionValue(elevationInfo, "elevationInfo");
            textView14.setText(getAltitudeStr(elevationInfo));
        }
        j2o j2oVar11 = this.binding;
        if (j2oVar11 != null && (eaeVar10 = j2oVar11.E) != null && (textView13 = eaeVar10.C) != null) {
            textView13.setText("m");
        }
        j2o j2oVar12 = this.binding;
        if (j2oVar12 != null && (textView12 = j2oVar12.L) != null) {
            textView12.setText(getADecendStr(projectionData.t.d));
        }
        j2o j2oVar13 = this.binding;
        if (j2oVar13 != null && (textView11 = j2oVar13.D) != null) {
            textView11.setText(getADecendStr(projectionData.t.e));
        }
        j2o j2oVar14 = this.binding;
        if (j2oVar14 != null && (eaeVar9 = j2oVar14.A) != null && (textView10 = eaeVar9.B) != null) {
            textView10.setText(ApplicationExtKt.getApplication().getString(d1j.j));
        }
        j2o j2oVar15 = this.binding;
        if (j2oVar15 != null && (eaeVar8 = j2oVar15.A) != null && (textView9 = eaeVar8.D) != null) {
            textView9.setText(getCalorieStr(projectionData.g));
        }
        j2o j2oVar16 = this.binding;
        if (j2oVar16 != null && (eaeVar7 = j2oVar16.A) != null && (textView8 = eaeVar7.C) != null) {
            textView8.setText("KCAL");
        }
        j2o j2oVar17 = this.binding;
        if (j2oVar17 != null && (eaeVar6 = j2oVar17.G) != null && (textView7 = eaeVar6.B) != null) {
            textView7.setText(ApplicationExtKt.getApplication().getString(d1j.p));
        }
        j2o j2oVar18 = this.binding;
        if (j2oVar18 != null && (eaeVar5 = j2oVar18.G) != null && (textView6 = eaeVar5.D) != null) {
            textView6.setText(String.valueOf(projectionData.f));
        }
        j2o j2oVar19 = this.binding;
        if (j2oVar19 != null && (eaeVar4 = j2oVar19.G) != null && (textView5 = eaeVar4.C) != null) {
            textView5.setText("BPM");
        }
        j2o j2oVar20 = this.binding;
        if (j2oVar20 != null && (eaeVar3 = j2oVar20.G) != null && (textView4 = eaeVar3.A) != null) {
            textView4.setVisibility(needShowHrType(projectionData.f15441r) ? 0 : 4);
        }
        j2o j2oVar21 = this.binding;
        if (j2oVar21 != null && (eaeVar = j2oVar21.G) != null && (textView2 = eaeVar.A) != null && textView2.getVisibility() == 0 && (j2oVar = this.binding) != null && (eaeVar2 = j2oVar.G) != null && (textView3 = eaeVar2.A) != null) {
            textView3.setText(getHrSectionStr(projectionData.p));
        }
        j2o j2oVar22 = this.binding;
        if (j2oVar22 != null && (speedView = j2oVar22.I) != null) {
            speedView.setSpeed(getSpeed(projectionData.f15440k));
        }
        j2o j2oVar23 = this.binding;
        if (j2oVar23 == null || (pathView = j2oVar23.H) == null) {
            return;
        }
        pathView.update(oriRotate, this.ctx);
    }
}

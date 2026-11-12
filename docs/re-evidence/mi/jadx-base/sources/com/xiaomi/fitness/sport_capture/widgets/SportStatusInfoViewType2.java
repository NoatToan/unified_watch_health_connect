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
import defpackage.m2o;
import defpackage.pde;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/widgets/SportStatusInfoViewType2;", "Lcom/xiaomi/fitness/sport_capture/widgets/BaseSportStatusInfoView;", "Lded;", "projectionData", "", "oriRotate", "", "render", "(Lded;F)V", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "Lm2o;", "binding", "Lm2o;", "<init>", "(Landroid/content/Context;)V", "Companion", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportStatusInfoViewType2 extends BaseSportStatusInfoView {

    @NotNull
    private static final String TAG = "SportStatusInfoViewType2";

    @Nullable
    private m2o binding;

    @NotNull
    private final Context ctx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportStatusInfoViewType2(@NotNull Context ctx) {
        super(ctx, null, 2, null);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.binding = m2o.A0(LayoutInflater.from(ctx), this, true);
    }

    @Override // com.xiaomi.fitness.sport_capture.widgets.BaseSportStatusInfoView
    public void render(@NotNull ded projectionData, float oriRotate) {
        pde pdeVar;
        TextView textView;
        PathView pathView;
        eae eaeVar;
        TextView textView2;
        m2o m2oVar;
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
        SpeedView speedView;
        TextView textView11;
        TextView textView12;
        eae eaeVar10;
        TextView textView13;
        eae eaeVar11;
        TextView textView14;
        eae eaeVar12;
        TextView textView15;
        f8e f8eVar;
        TextView textView16;
        pde pdeVar2;
        LinearLayout linearLayout;
        pde pdeVar3;
        TextView textView17;
        Intrinsics.checkNotNullParameter(projectionData, "projectionData");
        m2o m2oVar2 = this.binding;
        if (m2oVar2 != null && (pdeVar3 = m2oVar2.H) != null && (textView17 = pdeVar3.D) != null) {
            textView17.setText(getTimeStr());
        }
        Pair<Boolean, String> pairCalcVideoDurationInfo = calcVideoDurationInfo();
        if (pairCalcVideoDurationInfo.getFirst().booleanValue()) {
            m2o m2oVar3 = this.binding;
            if (m2oVar3 != null && (pdeVar = m2oVar3.H) != null && (textView = pdeVar.A) != null) {
                textView.setText(pairCalcVideoDurationInfo.getSecond());
            }
        } else {
            m2o m2oVar4 = this.binding;
            if (m2oVar4 != null && (pdeVar2 = m2oVar4.H) != null && (linearLayout = pdeVar2.B) != null) {
                ViewExtKt.invisible(linearLayout);
            }
        }
        m2o m2oVar5 = this.binding;
        if (m2oVar5 != null && (f8eVar = m2oVar5.B) != null && (textView16 = f8eVar.A) != null) {
            textView16.setText(getDeviceModelNameStr());
        }
        Pair<String, String> distanceStrInfo = getDistanceStrInfo(projectionData.i);
        m2o m2oVar6 = this.binding;
        if (m2oVar6 != null && (eaeVar12 = m2oVar6.C) != null && (textView15 = eaeVar12.B) != null) {
            textView15.setText(ApplicationExtKt.getApplication().getString(d1j.w));
        }
        m2o m2oVar7 = this.binding;
        if (m2oVar7 != null && (eaeVar11 = m2oVar7.C) != null && (textView14 = eaeVar11.D) != null) {
            textView14.setText(distanceStrInfo.getFirst());
        }
        m2o m2oVar8 = this.binding;
        if (m2oVar8 != null && (eaeVar10 = m2oVar8.C) != null && (textView13 = eaeVar10.C) != null) {
            textView13.setText(distanceStrInfo.getSecond());
        }
        m2o m2oVar9 = this.binding;
        if (m2oVar9 != null && (textView12 = m2oVar9.J) != null) {
            textView12.setText(getADecendStr(projectionData.t.d));
        }
        m2o m2oVar10 = this.binding;
        if (m2oVar10 != null && (textView11 = m2oVar10.D) != null) {
            textView11.setText(getADecendStr(projectionData.t.e));
        }
        m2o m2oVar11 = this.binding;
        if (m2oVar11 != null && (speedView = m2oVar11.G) != null) {
            speedView.setSpeed(getSpeed(projectionData.f15440k));
        }
        m2o m2oVar12 = this.binding;
        if (m2oVar12 != null && (eaeVar9 = m2oVar12.A) != null && (textView10 = eaeVar9.B) != null) {
            textView10.setText(ApplicationExtKt.getApplication().getString(d1j.j));
        }
        m2o m2oVar13 = this.binding;
        if (m2oVar13 != null && (eaeVar8 = m2oVar13.A) != null && (textView9 = eaeVar8.D) != null) {
            textView9.setText(getCalorieStr(projectionData.g));
        }
        m2o m2oVar14 = this.binding;
        if (m2oVar14 != null && (eaeVar7 = m2oVar14.A) != null && (textView8 = eaeVar7.C) != null) {
            textView8.setText("KCAL");
        }
        m2o m2oVar15 = this.binding;
        if (m2oVar15 != null && (eaeVar6 = m2oVar15.E) != null && (textView7 = eaeVar6.B) != null) {
            textView7.setText(ApplicationExtKt.getApplication().getString(d1j.p));
        }
        m2o m2oVar16 = this.binding;
        if (m2oVar16 != null && (eaeVar5 = m2oVar16.E) != null && (textView6 = eaeVar5.D) != null) {
            textView6.setText(String.valueOf(projectionData.f));
        }
        m2o m2oVar17 = this.binding;
        if (m2oVar17 != null && (eaeVar4 = m2oVar17.E) != null && (textView5 = eaeVar4.C) != null) {
            textView5.setText("BPM");
        }
        m2o m2oVar18 = this.binding;
        if (m2oVar18 != null && (eaeVar3 = m2oVar18.E) != null && (textView4 = eaeVar3.A) != null) {
            textView4.setVisibility(needShowHrType(projectionData.f15441r) ? 0 : 4);
        }
        m2o m2oVar19 = this.binding;
        if (m2oVar19 != null && (eaeVar = m2oVar19.E) != null && (textView2 = eaeVar.A) != null && textView2.getVisibility() == 0 && (m2oVar = this.binding) != null && (eaeVar2 = m2oVar.E) != null && (textView3 = eaeVar2.A) != null) {
            textView3.setText(getHrSectionStr(projectionData.p));
        }
        m2o m2oVar20 = this.binding;
        if (m2oVar20 == null || (pathView = m2oVar20.F) == null) {
            return;
        }
        pathView.update(oriRotate, this.ctx);
    }
}

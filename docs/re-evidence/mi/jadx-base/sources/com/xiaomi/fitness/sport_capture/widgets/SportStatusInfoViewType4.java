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
import defpackage.pde;
import defpackage.s2o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/widgets/SportStatusInfoViewType4;", "Lcom/xiaomi/fitness/sport_capture/widgets/BaseSportStatusInfoView;", "Lded;", "projectionData", "", "oriRotate", "", "render", "(Lded;F)V", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "Ls2o;", "binding", "Ls2o;", "<init>", "(Landroid/content/Context;)V", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportStatusInfoViewType4 extends BaseSportStatusInfoView {

    @Nullable
    private s2o binding;

    @NotNull
    private final Context ctx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportStatusInfoViewType4(@NotNull Context ctx) {
        super(ctx, null, 2, null);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.binding = s2o.A0(LayoutInflater.from(ctx), this, true);
    }

    @Override // com.xiaomi.fitness.sport_capture.widgets.BaseSportStatusInfoView
    public void render(@NotNull ded projectionData, float oriRotate) {
        pde pdeVar;
        TextView textView;
        PathView pathView;
        eae eaeVar;
        TextView textView2;
        eae eaeVar2;
        TextView textView3;
        eae eaeVar3;
        TextView textView4;
        eae eaeVar4;
        TextView textView5;
        s2o s2oVar;
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
        eae eaeVar10;
        TextView textView12;
        eae eaeVar11;
        TextView textView13;
        eae eaeVar12;
        TextView textView14;
        f8e f8eVar;
        TextView textView15;
        pde pdeVar2;
        LinearLayout linearLayout;
        pde pdeVar3;
        TextView textView16;
        Intrinsics.checkNotNullParameter(projectionData, "projectionData");
        s2o s2oVar2 = this.binding;
        if (s2oVar2 != null && (pdeVar3 = s2oVar2.I) != null && (textView16 = pdeVar3.D) != null) {
            textView16.setText(getTimeStr());
        }
        Pair<Boolean, String> pairCalcVideoDurationInfo = calcVideoDurationInfo();
        if (pairCalcVideoDurationInfo.getFirst().booleanValue()) {
            s2o s2oVar3 = this.binding;
            if (s2oVar3 != null && (pdeVar = s2oVar3.I) != null && (textView = pdeVar.A) != null) {
                textView.setText(pairCalcVideoDurationInfo.getSecond());
            }
        } else {
            s2o s2oVar4 = this.binding;
            if (s2oVar4 != null && (pdeVar2 = s2oVar4.I) != null && (linearLayout = pdeVar2.B) != null) {
                ViewExtKt.invisible(linearLayout);
            }
        }
        s2o s2oVar5 = this.binding;
        if (s2oVar5 != null && (f8eVar = s2oVar5.B) != null && (textView15 = f8eVar.A) != null) {
            textView15.setText(getDeviceModelNameStr());
        }
        Pair<String, String> distanceStrInfo = getDistanceStrInfo(projectionData.i);
        s2o s2oVar6 = this.binding;
        if (s2oVar6 != null && (eaeVar12 = s2oVar6.C) != null && (textView14 = eaeVar12.B) != null) {
            textView14.setText(ApplicationExtKt.getApplication().getString(d1j.w));
        }
        s2o s2oVar7 = this.binding;
        if (s2oVar7 != null && (eaeVar11 = s2oVar7.C) != null && (textView13 = eaeVar11.D) != null) {
            textView13.setText(distanceStrInfo.getFirst());
        }
        s2o s2oVar8 = this.binding;
        if (s2oVar8 != null && (eaeVar10 = s2oVar8.C) != null && (textView12 = eaeVar10.C) != null) {
            textView12.setText(distanceStrInfo.getSecond());
        }
        s2o s2oVar9 = this.binding;
        if (s2oVar9 != null && (textView11 = s2oVar9.E) != null) {
            textView11.setText(getADecendStr(projectionData.t.e));
        }
        s2o s2oVar10 = this.binding;
        if (s2oVar10 != null && (speedView = s2oVar10.H) != null) {
            speedView.setSpeed(getSpeed(projectionData.f15440k));
        }
        s2o s2oVar11 = this.binding;
        if (s2oVar11 != null && (eaeVar9 = s2oVar11.F) != null && (textView10 = eaeVar9.B) != null) {
            textView10.setText(ApplicationExtKt.getApplication().getString(d1j.p));
        }
        s2o s2oVar12 = this.binding;
        if (s2oVar12 != null && (eaeVar8 = s2oVar12.F) != null && (textView9 = eaeVar8.D) != null) {
            textView9.setText(String.valueOf(projectionData.f));
        }
        s2o s2oVar13 = this.binding;
        if (s2oVar13 != null && (eaeVar7 = s2oVar13.F) != null && (textView8 = eaeVar7.C) != null) {
            textView8.setText("BPM");
        }
        s2o s2oVar14 = this.binding;
        if (s2oVar14 != null && (eaeVar6 = s2oVar14.F) != null && (textView7 = eaeVar6.A) != null) {
            textView7.setVisibility(needShowHrType(projectionData.f15441r) ? 0 : 4);
        }
        s2o s2oVar15 = this.binding;
        if (s2oVar15 != null && (eaeVar4 = s2oVar15.F) != null && (textView5 = eaeVar4.A) != null && textView5.getVisibility() == 0 && (s2oVar = this.binding) != null && (eaeVar5 = s2oVar.F) != null && (textView6 = eaeVar5.A) != null) {
            textView6.setText(getHrSectionStr(projectionData.p));
        }
        s2o s2oVar16 = this.binding;
        if (s2oVar16 != null && (eaeVar3 = s2oVar16.A) != null && (textView4 = eaeVar3.B) != null) {
            textView4.setText(ApplicationExtKt.getApplication().getString(d1j.j));
        }
        s2o s2oVar17 = this.binding;
        if (s2oVar17 != null && (eaeVar2 = s2oVar17.A) != null && (textView3 = eaeVar2.D) != null) {
            textView3.setText(getCalorieStr(projectionData.g));
        }
        s2o s2oVar18 = this.binding;
        if (s2oVar18 != null && (eaeVar = s2oVar18.A) != null && (textView2 = eaeVar.C) != null) {
            textView2.setText("KCAL");
        }
        s2o s2oVar19 = this.binding;
        if (s2oVar19 == null || (pathView = s2oVar19.G) == null) {
            return;
        }
        pathView.update(oriRotate, this.ctx);
    }
}

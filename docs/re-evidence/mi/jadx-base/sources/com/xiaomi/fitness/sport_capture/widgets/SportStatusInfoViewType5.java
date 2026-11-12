package com.xiaomi.fitness.sport_capture.widgets;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport_capture.widgets.hr.HeartRateView;
import defpackage.d1j;
import defpackage.ded;
import defpackage.eae;
import defpackage.f8e;
import defpackage.pde;
import defpackage.v2o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/widgets/SportStatusInfoViewType5;", "Lcom/xiaomi/fitness/sport_capture/widgets/BaseSportStatusInfoView;", "Lded;", "projectionData", "", "oriRotate", "", "render", "(Lded;F)V", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "Lv2o;", "binding", "Lv2o;", "<init>", "(Landroid/content/Context;)V", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportStatusInfoViewType5 extends BaseSportStatusInfoView {

    @Nullable
    private v2o binding;

    @NotNull
    private final Context ctx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportStatusInfoViewType5(@NotNull Context ctx) {
        super(ctx, null, 2, null);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.binding = v2o.A0(LayoutInflater.from(ctx), this, true);
    }

    @Override // com.xiaomi.fitness.sport_capture.widgets.BaseSportStatusInfoView
    public void render(@NotNull ded projectionData, float oriRotate) {
        pde pdeVar;
        TextView textView;
        HeartRateView heartRateView;
        v2o v2oVar;
        HeartRateView heartRateView2;
        HeartRateView heartRateView3;
        eae eaeVar;
        TextView textView2;
        eae eaeVar2;
        TextView textView3;
        eae eaeVar3;
        TextView textView4;
        f8e f8eVar;
        TextView textView5;
        pde pdeVar2;
        LinearLayout linearLayout;
        pde pdeVar3;
        TextView textView6;
        Intrinsics.checkNotNullParameter(projectionData, "projectionData");
        v2o v2oVar2 = this.binding;
        if (v2oVar2 != null && (pdeVar3 = v2oVar2.D) != null && (textView6 = pdeVar3.D) != null) {
            textView6.setText(getTimeStr());
        }
        Pair<Boolean, String> pairCalcVideoDurationInfo = calcVideoDurationInfo();
        if (pairCalcVideoDurationInfo.getFirst().booleanValue()) {
            v2o v2oVar3 = this.binding;
            if (v2oVar3 != null && (pdeVar = v2oVar3.D) != null && (textView = pdeVar.A) != null) {
                textView.setText(pairCalcVideoDurationInfo.getSecond());
            }
        } else {
            v2o v2oVar4 = this.binding;
            if (v2oVar4 != null && (pdeVar2 = v2oVar4.D) != null && (linearLayout = pdeVar2.B) != null) {
                ViewExtKt.invisible(linearLayout);
            }
        }
        v2o v2oVar5 = this.binding;
        if (v2oVar5 != null && (f8eVar = v2oVar5.B) != null && (textView5 = f8eVar.A) != null) {
            textView5.setText(getDeviceModelNameStr());
        }
        v2o v2oVar6 = this.binding;
        if (v2oVar6 != null && (eaeVar3 = v2oVar6.A) != null && (textView4 = eaeVar3.B) != null) {
            textView4.setText(ApplicationExtKt.getApplication().getString(d1j.j));
        }
        v2o v2oVar7 = this.binding;
        if (v2oVar7 != null && (eaeVar2 = v2oVar7.A) != null && (textView3 = eaeVar2.D) != null) {
            textView3.setText(getCalorieStr(projectionData.g));
        }
        v2o v2oVar8 = this.binding;
        if (v2oVar8 != null && (eaeVar = v2oVar8.A) != null && (textView2 = eaeVar.C) != null) {
            textView2.setText("KCAL");
        }
        v2o v2oVar9 = this.binding;
        if (v2oVar9 != null && (heartRateView3 = v2oVar9.C) != null) {
            heartRateView3.setVisibility(needShowHrType(projectionData.f15441r) ? 0 : 4);
        }
        v2o v2oVar10 = this.binding;
        if (v2oVar10 == null || (heartRateView = v2oVar10.C) == null || heartRateView.getVisibility() != 0 || (v2oVar = this.binding) == null || (heartRateView2 = v2oVar.C) == null) {
            return;
        }
        int i = projectionData.f;
        int i2 = projectionData.p;
        heartRateView2.setHr(i, i2, getHrSectionStr(i2));
    }
}

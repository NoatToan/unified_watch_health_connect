package com.xiaomi.fitness.health.pai;

import android.os.Bundle;
import android.view.View;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.base.BaseDataFragment;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u001a\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0014J\b\u0010\u001b\u001a\u00020\u0013H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/pai/BasePaiFragment;", "Lcom/xiaomi/fitness/base/BaseDataFragment;", "Lcom/xiaomi/fitness/health/pai/DataPaiViewModel;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "<init>", "()V", "sportDataType", "", "getSportDataType", "()I", "setSportDataType", "(I)V", "mDid", "", "getMDid", "()Ljava/lang/String;", "setMDid", "(Ljava/lang/String;)V", "onVisible", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initView", "displayData", "scrollToCurrentCycle", SdkContants.KEY_BUNDLE, "getBundle", "()Lkotlin/Unit;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BasePaiFragment extends BaseDataFragment<DataPaiViewModel, RecyclerBarEntry> {

    @Nullable
    private String mDid;
    private int sportDataType;

    private final Unit getBundle() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mSelectDate = (LocalDate) arguments.getSerializable("local_date");
            this.sportDataType = arguments.getInt("sport_type", 5);
            this.mDid = arguments.getString("did");
            if (this.mSelectDate == null) {
                this.mSelectDate = LocalDate.now();
            }
        } else {
            this.mSelectDate = LocalDate.now();
        }
        return Unit.INSTANCE;
    }

    private final void initView() {
        getBundle();
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment
    public void displayData() {
    }

    @Nullable
    public final String getMDid() {
        return this.mDid;
    }

    public final int getSportDataType() {
        return this.sportDataType;
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment, com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        setStatusBarFontBlack(true);
        getBundle();
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment
    public void scrollToCurrentCycle() {
    }

    public final void setMDid(@Nullable String str) {
        this.mDid = str;
    }

    public final void setSportDataType(int i) {
        this.sportDataType = i;
    }
}

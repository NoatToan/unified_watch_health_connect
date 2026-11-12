package com.xiaomi.fitness.sport_eco.view.launch.gym;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport_eco.view.environmental.model.EcoEnvrionmentalBean;
import defpackage.e1j;
import defpackage.eua;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "isSportDynamic", "", "setSportDynamic", "(Z)V", "Lcom/xiaomi/fitness/sport_eco/view/environmental/model/EcoEnvrionmentalBean;", "environmental", "setEnvironmental", "(Lcom/xiaomi/fitness/sport_eco/view/environmental/model/EcoEnvrionmentalBean;)V", "", "ftpValue", "setFtpTest", "(I)V", "Leua;", "view", "Leua;", "getView", "()Leua;", "", "", "data", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "<init>", "(Leua;Ljava/util/List;Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportActivity;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFunctionListHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionListHolder.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1872#2,3:85\n1872#2,3:88\n1872#2,3:91\n*S KotlinDebug\n*F\n+ 1 FunctionListHolder.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListHolder\n*L\n39#1:85,3\n58#1:88,3\n74#1:91,3\n*E\n"})
public final class FunctionListHolder extends RecyclerView.d0 {

    @NotNull
    private final eua view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionListHolder(@NotNull eua view, @NotNull List<? extends Object> data, @NotNull GymLaunchEcoSportActivity activity) {
        super(view.getRoot());
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.view = view;
        if (data.isEmpty()) {
            View root = view.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtKt.setHeight(root, 0);
        }
        Context context = view.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FunctionListAdapter functionListAdapter = new FunctionListAdapter(context, activity);
        view.A.setLayoutManager(new LinearLayoutManager(view.getRoot().getContext(), 1, false));
        view.A.setAdapter(functionListAdapter);
        functionListAdapter.setData(data);
    }

    @NotNull
    public final eua getView() {
        return this.view;
    }

    public final void setEnvironmental(@NotNull EcoEnvrionmentalBean environmental) {
        Intrinsics.checkNotNullParameter(environmental, "environmental");
        List<FunctionListData> functionList = FunctionListDataKt.getFunctionList();
        RecyclerView.Adapter adapter = this.view.A.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListAdapter");
        FunctionListAdapter functionListAdapter = (FunctionListAdapter) adapter;
        int i = -1;
        int i2 = 0;
        for (Object obj : functionList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            FunctionListData functionListData = (FunctionListData) obj;
            if (Intrinsics.areEqual(functionListData.getScene(), FunctionListDataKt.TAG_ENVIRONMENTAL)) {
                functionListData.setTitle(environmental.getTitle());
                functionListData.setDes(environmental.getDes());
                i = i2;
            }
            i2 = i3;
        }
        functionListAdapter.setData(functionList);
        functionListAdapter.notifyItemChanged(i);
    }

    public final void setFtpTest(int ftpValue) {
        List<FunctionListData> functionList = FunctionListDataKt.getFunctionList();
        RecyclerView.Adapter adapter = this.view.A.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListAdapter");
        FunctionListAdapter functionListAdapter = (FunctionListAdapter) adapter;
        int i = -1;
        int i2 = 0;
        for (Object obj : functionList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            FunctionListData functionListData = (FunctionListData) obj;
            if (Intrinsics.areEqual(functionListData.getScene(), FunctionListDataKt.TAG_FTP_TEST)) {
                functionListData.setTitle(e1j.L1);
                functionListData.setDesV2(ftpValue > 0 ? ResourceExtKt.getString(e1j.I0, Integer.valueOf(ftpValue)) : ResourceExtKt.getString(e1j.M1));
                i = i2;
            }
            i2 = i3;
        }
        functionListAdapter.setData(functionList);
        functionListAdapter.notifyItemChanged(i);
    }

    public final void setSportDynamic(boolean isSportDynamic) {
        List<FunctionListData> functionList = FunctionListDataKt.getFunctionList();
        RecyclerView.Adapter adapter = this.view.A.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.xiaomi.fitness.sport_eco.view.launch.gym.FunctionListAdapter");
        FunctionListAdapter functionListAdapter = (FunctionListAdapter) adapter;
        int i = -1;
        int i2 = 0;
        for (Object obj : functionList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            FunctionListData functionListData = (FunctionListData) obj;
            if (Intrinsics.areEqual(functionListData.getScene(), FunctionListDataKt.TAG_SPORT_DYNAMIC)) {
                if (isSportDynamic) {
                    functionListData.setDes(e1j.G0);
                } else {
                    functionListData.setDes(e1j.G1);
                }
                i = i2;
            }
            i2 = i3;
        }
        functionListAdapter.setData(functionList);
        functionListAdapter.notifyItemChanged(i);
    }
}

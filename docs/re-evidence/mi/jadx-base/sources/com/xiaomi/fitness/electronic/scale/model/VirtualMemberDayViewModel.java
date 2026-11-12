package com.xiaomi.fitness.electronic.scale.model;

import android.os.Bundle;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper;
import com.xiaomi.fitness.electronic.scale.model.VirtualMemberDayViewModel;
import com.xiaomi.fitness.electronic.scale.util.DateUtil;
import defpackage.bu7;
import defpackage.f4b;
import defpackage.qal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0016\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tJ8\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b\u0012\u0004\u0012\u00020\u00050\u0017J$\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00050\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/model/VirtualMemberDayViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "getTheMaxNumber", "", "entries", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "formatWeightYMaxValue", "", "yAxisMaximum", "queryByVirtualid", "virtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "startTime", "", "endTime", "callBack", "Lkotlin/Function1;", "queryLastWeightRecordByCreateTime", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVirtualMemberDayViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualMemberDayViewModel.kt\ncom/xiaomi/fitness/electronic/scale/model/VirtualMemberDayViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1863#2,2:84\n*S KotlinDebug\n*F\n+ 1 VirtualMemberDayViewModel.kt\ncom/xiaomi/fitness/electronic/scale/model/VirtualMemberDayViewModel\n*L\n67#1:84,2\n*E\n"})
public final class VirtualMemberDayViewModel extends AbsViewModel {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit queryByVirtualid$lambda$0(Function1 callBack, List list) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(list, "list");
        if (list.isEmpty()) {
            callBack.invoke2(new ArrayList());
        } else {
            callBack.invoke2(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit queryLastWeightRecordByCreateTime$lambda$2(VirtualAccount virtualAccount, Function1 callBack, List it) {
        Intrinsics.checkNotNullParameter(virtualAccount, "$virtualAccount");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("queryLastWeightRecordByCreateTime" + f4b.c(it), new Object[0]);
        String dateToString = DateUtil.INSTANCE.getDateToString(virtualAccount.getCreateTime(), "yyyyMMdd");
        Iterator it2 = it.iterator();
        while (it2.hasNext()) {
            VirtualAccount virtualAccount2 = (VirtualAccount) it2.next();
            WeightResult weightResult = (WeightResult) bu7.a(virtualAccount2.getBodyComposition(), WeightResult.class);
            String dateToString2 = DateUtil.INSTANCE.getDateToString(virtualAccount2.getCreateTime(), "yyyyMMdd");
            if (weightResult != null && weightResult.getBmi() > 0.0f && !Intrinsics.areEqual(dateToString2, dateToString)) {
                callBack.invoke2(weightResult);
                return Unit.INSTANCE;
            }
        }
        callBack.invoke2(null);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final int formatWeightYMaxValue(float yAxisMaximum) {
        if (yAxisMaximum < 60) {
            return 60;
        }
        return ((((int) yAxisMaximum) / 10) * 10) + 10;
    }

    public final float getTheMaxNumber(@Nullable List<? extends RecyclerBarEntry> entries) {
        if (entries == null || entries.isEmpty()) {
            return 0.0f;
        }
        float y = entries.get(0).getY();
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            y = Math.max(y, entries.get(i).getY());
        }
        return y;
    }

    public final void queryByVirtualid(@NotNull VirtualAccount virtualAccount, long startTime, long endTime, @NotNull final Function1<? super List<VirtualAccount>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        qal.c("db queryByVirtualid accountId is " + virtualAccount.getAccountId() + "  " + startTime + " " + endTime);
        VirtualAccountHelper.INSTANCE.queryVirtualDayData(virtualAccount, startTime, endTime, new Function1() { // from class: a0r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VirtualMemberDayViewModel.queryByVirtualid$lambda$0(callBack, (List) obj);
            }
        });
    }

    public final void queryLastWeightRecordByCreateTime(@NotNull final VirtualAccount virtualAccount, @NotNull final Function1<? super WeightResult, Unit> callBack) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        VirtualAccountHelper.INSTANCE.queryWeightRecordByCreateTime(virtualAccount, new Function1() { // from class: zzq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VirtualMemberDayViewModel.queryLastWeightRecordByCreateTime$lambda$2(virtualAccount, callBack, (List) obj);
            }
        });
    }
}

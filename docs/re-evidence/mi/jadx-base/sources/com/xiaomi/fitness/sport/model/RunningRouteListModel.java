package com.xiaomi.fitness.sport.model;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.sport.view.route.RunningRouteListBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rR&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport/model/RunningRouteListModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "mData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/fitness/sport/view/route/RunningRouteListBean;", "getMData", "()Landroidx/lifecycle/MutableLiveData;", "setMData", "(Landroidx/lifecycle/MutableLiveData;)V", "getRouteList", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RunningRouteListModel extends BaseModel {

    @NotNull
    private MutableLiveData<List<RunningRouteListBean>> mData = new MutableLiveData<>();

    public RunningRouteListModel() {
        new ArrayList();
    }

    @NotNull
    public final MutableLiveData<List<RunningRouteListBean>> getMData() {
        return this.mData;
    }

    public final void getRouteList() {
    }

    public final void setMData(@NotNull MutableLiveData<List<RunningRouteListBean>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mData = mutableLiveData;
    }
}

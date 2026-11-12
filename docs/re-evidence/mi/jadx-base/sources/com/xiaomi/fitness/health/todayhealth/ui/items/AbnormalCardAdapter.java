package com.xiaomi.fitness.health.todayhealth.ui.items;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.health.todayhealth.ui.items.AbnormalCardAdapter;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.kp5;
import defpackage.of1;
import defpackage.pni;
import defpackage.qxi;
import defpackage.ul5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003 !\"BO\u0012F\u0010\u001d\u001aB\u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001b0\u001aj \u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001b`\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u0017R\u00020\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "abnormalType", "", "", "data", "getDataSizeByType", "(ILjava/util/List;)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalCardAdapter$DataModel;", "mDataModelList", "Ljava/util/List;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "riskMap", "<init>", "(Ljava/util/HashMap;)V", "Companion", "DataModel", "ViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AbnormalCardAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int HealthType_SleepHr = -1;
    public static final int HealthType_SleepSpo2 = -2;

    @NotNull
    public static final String TAG = "AbnormalCardAdapter";

    @NotNull
    private final List<DataModel> mDataModelList;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalCardAdapter$DataModel;", "", "healthType", "", "data", "", "", "<init>", "(Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalCardAdapter;ILjava/util/Map;)V", "getHealthType", "()I", "getData", "()Ljava/util/Map;", "getCountValue", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAbnormalCardAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbnormalCardAdapter.kt\ncom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalCardAdapter$DataModel\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,287:1\n216#2,2:288\n*S KotlinDebug\n*F\n+ 1 AbnormalCardAdapter.kt\ncom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalCardAdapter$DataModel\n*L\n59#1:288,2\n*E\n"})
    public final class DataModel {

        @NotNull
        private final Map<Integer, List<Object>> data;
        private final int healthType;
        final /* synthetic */ AbnormalCardAdapter this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public DataModel(AbnormalCardAdapter abnormalCardAdapter, @NotNull int i, Map<Integer, ? extends List<? extends Object>> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.this$0 = abnormalCardAdapter;
            this.healthType = i;
            this.data = data;
        }

        public final int getCountValue() {
            Map<Integer, List<Object>> map = this.data;
            AbnormalCardAdapter abnormalCardAdapter = this.this$0;
            int dataSizeByType = 0;
            for (Map.Entry<Integer, List<Object>> entry : map.entrySet()) {
                dataSizeByType += abnormalCardAdapter.getDataSizeByType(entry.getKey().intValue(), entry.getValue());
            }
            return dataSizeByType;
        }

        @NotNull
        public final Map<Integer, List<Object>> getData() {
            return this.data;
        }

        public final int getHealthType() {
            return this.healthType;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0015\u001a\n \u0010*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u001c\u0010\u0018\u001a\n \u0010*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001c\u0010\u001a\u001a\n \u0010*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalCardAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "type", "", "getSleepOtherDataTitle", "(I)Ljava/lang/String;", "Landroid/graphics/drawable/Drawable;", "getSleepOtherDataDrawable", "(I)Landroid/graphics/drawable/Drawable;", "getRefTvStrByType", "position", "", "bindData", "(I)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "titleTv", "Landroid/widget/TextView;", "refTv", "Landroid/widget/ImageView;", "cardImageTv", "Landroid/widget/ImageView;", "cardTitleTv", "understandView", "Landroidx/recyclerview/widget/RecyclerView;", "abnormalRecordListRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalCardAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ViewHolder extends RecyclerView.d0 {
        private final RecyclerView abnormalRecordListRecycler;
        private final ImageView cardImageTv;
        private final TextView cardTitleTv;
        private final TextView refTv;
        final /* synthetic */ AbnormalCardAdapter this$0;
        private final TextView titleTv;
        private final ImageView understandView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull AbnormalCardAdapter abnormalCardAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = abnormalCardAdapter;
            this.titleTv = (TextView) itemView.findViewById(eri.oj);
            this.refTv = (TextView) itemView.findViewById(eri.Qd);
            this.cardImageTv = (ImageView) itemView.findViewById(eri.o7);
            this.cardTitleTv = (TextView) itemView.findViewById(eri.h);
            this.understandView = (ImageView) itemView.findViewById(eri.t5);
            this.abnormalRecordListRecycler = (RecyclerView) itemView.findViewById(eri.g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$0(kp5 kp5Var, View view) {
            ToastUtil.showToast("没有H5 链接 " + ResourceExtKt.getString(kp5Var.f24128b));
        }

        private final String getRefTvStrByType(int type) {
            if (type == -2) {
                String string = ApplicationExtKt.getApplication().getString(c0j.Sd);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            }
            if (type == -1) {
                String string2 = ApplicationExtKt.getApplication().getString(c0j.Gd);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            if (type == 4) {
                String string3 = ApplicationExtKt.getApplication().getString(c0j.R);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            }
            if (type == 13) {
                String string4 = ApplicationExtKt.getApplication().getString(c0j.U);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            }
            if (type == 6) {
                String string5 = ApplicationExtKt.getApplication().getString(c0j.T);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            }
            if (type == 7) {
                String string6 = ApplicationExtKt.getApplication().getString(c0j.V);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            }
            if (type == 25) {
                String string7 = ApplicationExtKt.getApplication().getString(c0j.W8);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            }
            if (type != 26) {
                return "";
            }
            String string8 = ApplicationExtKt.getApplication().getString(c0j.Xb);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            return string8;
        }

        private final Drawable getSleepOtherDataDrawable(int type) {
            if (type != -2) {
                return type != -1 ? ApplicationExtKt.getApplication().getDrawable(pni.m1) : ApplicationExtKt.getApplication().getDrawable(pni.m1);
            }
            return ApplicationExtKt.getApplication().getDrawable(pni.n1);
        }

        private final String getSleepOtherDataTitle(int type) {
            if (type == -2) {
                String string = ApplicationExtKt.getApplication().getString(c0j.zd);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            }
            if (type != -1) {
                return "";
            }
            String string2 = ApplicationExtKt.getApplication().getString(c0j.Ad);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        public final void bindData(int position) {
            DataModel dataModel = (DataModel) this.this$0.mDataModelList.get(position);
            final kp5 kp5VarA = ul5.c().a(dataModel.getHealthType());
            int i = kp5VarA.c;
            int countValue = dataModel.getCountValue();
            this.titleTv.setText(ResourceExtKt.getQuantityString(AppUtil.getApp(), qxi.r1, countValue, Integer.valueOf(countValue)));
            if (dataModel.getHealthType() < 0) {
                Drawable sleepOtherDataDrawable = getSleepOtherDataDrawable(dataModel.getHealthType());
                this.cardTitleTv.setText(getSleepOtherDataTitle(dataModel.getHealthType()));
                this.cardImageTv.setImageDrawable(sleepOtherDataDrawable);
                if (sleepOtherDataDrawable != null) {
                    sleepOtherDataDrawable.setBounds(0, 0, ExtUtilsKt.getDp(32), ExtUtilsKt.getDp(32));
                }
            } else {
                Drawable drawableB = of1.b(this.itemView.getContext(), i);
                this.cardTitleTv.setText(kp5VarA.f24128b);
                this.cardImageTv.setImageDrawable(drawableB);
                if (drawableB != null) {
                    drawableB.setBounds(0, 0, ExtUtilsKt.getDp(32), ExtUtilsKt.getDp(32));
                }
            }
            this.refTv.setText(getRefTvStrByType(dataModel.getHealthType()));
            this.abnormalRecordListRecycler.setAdapter(new SingleAbnormalTypeAdapter(dataModel.getData()));
            this.understandView.setOnClickListener(new View.OnClickListener() { // from class: tu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbnormalCardAdapter.ViewHolder.bindData$lambda$0(kp5VarA, view);
                }
            });
        }
    }

    public AbnormalCardAdapter(@NotNull HashMap<Integer, Map<Integer, List<Object>>> riskMap) {
        Intrinsics.checkNotNullParameter(riskMap, "riskMap");
        ArrayList arrayList = new ArrayList();
        this.mDataModelList = arrayList;
        Map<Integer, List<Object>> map = riskMap.get(6);
        if (map != null && (map.containsKey(7) || map.containsKey(8))) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map.containsKey(7)) {
                List<Object> list = map.get(7);
                linkedHashMap.put(7, list == null ? CollectionsKt__CollectionsKt.emptyList() : list);
            } else {
                List<Object> list2 = map.get(8);
                linkedHashMap.put(8, list2 == null ? CollectionsKt__CollectionsKt.emptyList() : list2);
            }
            arrayList.add(new DataModel(this, 6, linkedHashMap));
        }
        Map<Integer, List<Object>> map2 = riskMap.get(-1);
        if (map2 != null) {
            arrayList.add(new DataModel(this, -1, map2));
        }
        Map<Integer, List<Object>> map3 = riskMap.get(-2);
        if (map3 != null) {
            arrayList.add(new DataModel(this, -2, map3));
        }
        Map<Integer, List<Object>> map4 = riskMap.get(4);
        if (map4 != null) {
            arrayList.add(new DataModel(this, 4, map4));
        }
        Map<Integer, List<Object>> map5 = riskMap.get(7);
        if (map5 != null) {
            arrayList.add(new DataModel(this, 7, map5));
        }
        Map<Integer, List<Object>> map6 = riskMap.get(13);
        if (map6 != null) {
            arrayList.add(new DataModel(this, 13, map6));
        }
        Map<Integer, List<Object>> map7 = riskMap.get(25);
        if (map7 != null) {
            arrayList.add(new DataModel(this, 25, map7));
        }
        Map<Integer, List<Object>> map8 = riskMap.get(26);
        if (map8 != null) {
            arrayList.add(new DataModel(this, 26, map8));
        }
        Logger.d(TAG, "AbnormalCardAdapter mDataModelList size=" + arrayList.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDataSizeByType(int abnormalType, List<? extends Object> data) {
        switch (abnormalType) {
            case 0:
                if (data.isEmpty()) {
                    return 0;
                }
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem>");
                return data.size();
            case 1:
            case 2:
                if (data.isEmpty()) {
                    return 0;
                }
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AbnormalRecordItem>");
                return data.size();
            case 3:
                if (data.isEmpty()) {
                    return 0;
                }
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AbnormalRecordItem>");
                return data.size();
            case 4:
            case 5:
            case 6:
                if (data.isEmpty()) {
                    return 0;
                }
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.StressItem>");
                return data.size();
            case 7:
            case 8:
                if (data.isEmpty()) {
                    return 0;
                }
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport>");
                return data.size();
            case 9:
            case 10:
                if (data.isEmpty()) {
                    return 0;
                }
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport>");
                return data.size();
            case 11:
                if (data.isEmpty()) {
                    return 0;
                }
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport>");
                return data.size();
            case 12:
                if (data.isEmpty()) {
                    return 0;
                }
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fitness.health.todayhealth.model.DailyHrHealthReport>");
                return data.size();
            case 13:
                if (data.isEmpty()) {
                    return 0;
                }
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AmbulatoryBloodPressureReport>");
                return data.size();
            default:
                return 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mDataModelList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof ViewHolder) {
            ((ViewHolder) holder).bindData(position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.G5, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ViewHolder(this, viewInflate);
    }
}

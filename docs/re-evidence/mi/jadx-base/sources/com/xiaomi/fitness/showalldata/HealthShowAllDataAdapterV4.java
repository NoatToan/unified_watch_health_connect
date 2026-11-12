package com.xiaomi.fitness.showalldata;

import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.log.TalkbackLogger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.showalldata.HealthShowAllDataAdapterV4;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.km5;
import defpackage.l2c;
import defpackage.nuf;
import defpackage.pni;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0011\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005=>?@<B%\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b:\u0010;J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0005J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\tJ\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u0005R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020 008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010.R\"\u00104\u001a\u00020\u001a8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "reSortList", "()V", "", "position", "getRealPos", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "oldPosition", "newPosition", "moveItemPosition", "(II)V", "moveItemOver", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "getItemViewType", "", "hasAddedData", "(I)Z", "hasRemovedData", "resetSortList", "", "Lkm5;", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4$OnItemClickListener;", "onItemClick", "Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4$OnItemClickListener;", "Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4$OnSaveItemClick;", "onSaveItemClick", "Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4$OnSaveItemClick;", "getOnSaveItemClick", "()Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4$OnSaveItemClick;", "addedLabelIndex", "I", "removedLabelIndex", "", "constCacheDataList", "[Lkm5;", "constRemovedLabelIndex", "hasChanged", "Z", "getHasChanged", "()Z", "setHasChanged", "(Z)V", "<init>", "(Ljava/util/List;Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4$OnItemClickListener;Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4$OnSaveItemClick;)V", "Companion", "ShowAllDataViewHolder", "LabelViewHolder", "OnItemClickListener", "OnSaveItemClick", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHealthShowAllDataAdapterV4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthShowAllDataAdapterV4.kt\ncom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,297:1\n37#2:298\n36#2,3:299\n37#2:302\n36#2,3:303\n1863#3,2:306\n1863#3,2:308\n1557#3:310\n1628#3,3:311\n*S KotlinDebug\n*F\n+ 1 HealthShowAllDataAdapterV4.kt\ncom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4\n*L\n54#1:298\n54#1:299,3\n48#1:302\n48#1:303,3\n62#1:306,2\n80#1:308,2\n169#1:310\n169#1:311,3\n*E\n"})
public final class HealthShowAllDataAdapterV4 extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int ITEM_ADDED_LABEL = 1;
    public static final int ITEM_CONTENT = 3;
    public static final int ITEM_REMOVED_LABEL = 2;

    @NotNull
    public static final String TAG = "HealthShowAllDataAdapter";
    private int addedLabelIndex;

    @NotNull
    private km5[] constCacheDataList;
    private int constRemovedLabelIndex;

    @NotNull
    private final List<km5> dataList;
    private boolean hasChanged;

    @NotNull
    private final OnItemClickListener onItemClick;

    @NotNull
    private final OnSaveItemClick onSaveItemClick;
    private int removedLabelIndex;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4$LabelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "labelTv", "Landroid/widget/TextView;", "getLabelTv", "()Landroid/widget/TextView;", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class LabelViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView labelTv;
        final /* synthetic */ HealthShowAllDataAdapterV4 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LabelViewHolder(@NotNull HealthShowAllDataAdapterV4 healthShowAllDataAdapterV4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = healthShowAllDataAdapterV4;
            View viewFindViewById = view.findViewById(eri.y9);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.labelTv = (TextView) viewFindViewById;
        }

        @NotNull
        public final TextView getLabelTv() {
            return this.labelTv;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4$OnItemClickListener;", "", "onItemClick", "", DailyRecordKey.sportType, "", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onItemClick(int sportType, @NotNull Bundle bundle);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4$OnSaveItemClick;", "", "onSaveItemClick", "", "position", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnSaveItemClick {
        void onSaveItemClick(int position);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4$ShowAllDataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "savedIcon", "getSavedIcon", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapterV4;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ShowAllDataViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView icon;

        @NotNull
        private final TextView name;

        @NotNull
        private final ImageView savedIcon;
        final /* synthetic */ HealthShowAllDataAdapterV4 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowAllDataViewHolder(@NotNull HealthShowAllDataAdapterV4 healthShowAllDataAdapterV4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = healthShowAllDataAdapterV4;
            View viewFindViewById = view.findViewById(eri.f7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(eri.bc);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.name = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(eri.l7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.savedIcon = (ImageView) viewFindViewById3;
        }

        @NotNull
        public final ImageView getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextView getName() {
            return this.name;
        }

        @NotNull
        public final ImageView getSavedIcon() {
            return this.savedIcon;
        }
    }

    public HealthShowAllDataAdapterV4(@NotNull List<km5> dataList, @NotNull OnItemClickListener onItemClick, @NotNull OnSaveItemClick onSaveItemClick) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onSaveItemClick, "onSaveItemClick");
        this.dataList = dataList;
        this.onItemClick = onItemClick;
        this.onSaveItemClick = onSaveItemClick;
        this.addedLabelIndex = -1;
        this.removedLabelIndex = -1;
        this.constRemovedLabelIndex = -1;
        FitnessLogUtils.i("HealthShowAllDataAdapter", "init dataList = " + dataList);
        reSortList();
        this.constCacheDataList = (km5[]) dataList.toArray(new km5[0]);
        this.constRemovedLabelIndex = this.removedLabelIndex;
    }

    private final int getRealPos(int position) {
        if (position == this.addedLabelIndex) {
            return 0;
        }
        int i = this.removedLabelIndex;
        return (position <= i || i <= 0) ? position - 1 : position - 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3(HealthShowAllDataAdapterV4 this$0, km5 data, Ref.IntRef realPos, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(realPos, "$realPos");
        this$0.hasChanged = true;
        data.e = data.e >= 0 ? -1 : 0;
        data.l = true;
        this$0.onSaveItemClick.onSaveItemClick(realPos.element);
        boolean z = data.e >= 0;
        String string = z ? ExtUtilKt.getString(c0j.Nq) : ExtUtilKt.getString(c0j.Jq);
        view.setContentDescription(string);
        TalkbackLogger.INSTANCE.d("HealthShowAllDataAdapter", "isSelected=" + z + " talkback=" + string, new Object[0]);
        this$0.reSortList();
        this$0.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$4(km5 data, HealthShowAllDataAdapterV4 this$0, View view) {
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(data.d)) {
            bundle.putString("did", data.d);
            bundle.putSerializable("local_date", TimeDateUtil.timestampToLocalDate(data.f23978a));
        }
        int i = data.f23979b;
        bundle.putInt("sport_type", i);
        this$0.onItemClick.onItemClick(i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$5(ShowAllDataViewHolder viewHolder, View view) {
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Object systemService = viewHolder.itemView.getContext().getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        Vibrator vibrator = (Vibrator) systemService;
        if (Build.VERSION.SDK_INT <= 26) {
            return true;
        }
        vibrator.vibrate(VibrationEffect.createOneShot(100L, 255));
        return true;
    }

    private final void reSortList() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (km5 km5Var : this.dataList) {
            if (km5Var.e >= 0) {
                arrayList.add(km5Var);
            } else {
                arrayList2.add(km5Var);
            }
        }
        if (arrayList.isEmpty()) {
            this.addedLabelIndex = -1;
            this.removedLabelIndex = 0;
        } else if (arrayList2.isEmpty()) {
            this.addedLabelIndex = 0;
            this.removedLabelIndex = -1;
        } else {
            this.addedLabelIndex = 0;
            this.removedLabelIndex = arrayList.size() + 1;
        }
        arrayList.addAll(arrayList2);
        this.dataList.clear();
        this.dataList.addAll(arrayList);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(((km5) it.next()).f23979b));
        }
        HealthPrefer healthPrefer = HealthPrefer.INSTANCE;
        healthPrefer.setHEALTH_CARD_SORT(arrayList3);
        Logger.i("HealthShowAllDataAdapter", "sort list:" + healthPrefer.getHEALTH_CARD_SORT());
    }

    @NotNull
    public final List<km5> getDataList() {
        return this.dataList;
    }

    public final boolean getHasChanged() {
        return (this.constRemovedLabelIndex == this.removedLabelIndex && Arrays.equals(this.constCacheDataList, this.dataList.toArray(new km5[0]))) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size() + (this.addedLabelIndex >= 0 ? 1 : 0) + (this.removedLabelIndex >= 0 ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (hasAddedData(position)) {
            return 1;
        }
        return hasRemovedData(position) ? 2 : 3;
    }

    @NotNull
    public final OnSaveItemClick getOnSaveItemClick() {
        return this.onSaveItemClick;
    }

    public final boolean hasAddedData(int position) {
        return position == this.addedLabelIndex;
    }

    public final boolean hasRemovedData(int position) {
        return position == this.removedLabelIndex;
    }

    public final void moveItemOver() {
        HealthPrefer healthPrefer = HealthPrefer.INSTANCE;
        List<km5> list = this.dataList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((km5) it.next()).f23979b));
        }
        healthPrefer.setHEALTH_CARD_SORT(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
    }

    public final void moveItemPosition(int oldPosition, int newPosition) {
        int i;
        int i2;
        int realPos = getRealPos(oldPosition);
        int realPos2 = getRealPos(newPosition);
        notifyItemMoved(oldPosition, newPosition);
        if (this.removedLabelIndex >= 0) {
            km5 km5Var = this.dataList.get(realPos);
            int i3 = km5Var.e;
            if (i3 >= 0 && newPosition == (i2 = this.removedLabelIndex)) {
                km5Var.e = -1;
                km5Var.l = true;
                realPos2--;
                int i4 = i2 - 1;
                this.removedLabelIndex = i4;
                if (i4 == 1 && this.addedLabelIndex == 0) {
                    this.addedLabelIndex = -1;
                    this.removedLabelIndex = 0;
                    notifyItemRemoved(0);
                    return;
                }
            } else if (i3 < 0 && newPosition == (i = this.removedLabelIndex)) {
                km5Var.e = 0;
                km5Var.l = true;
                this.removedLabelIndex = i + 1;
                if (this.addedLabelIndex < 0) {
                    this.addedLabelIndex = 0;
                    this.removedLabelIndex = i + 2;
                    List<km5> list = this.dataList;
                    list.add(0, list.remove(realPos));
                    notifyItemInserted(0);
                    return;
                }
            }
        }
        List<km5> list2 = this.dataList;
        list2.add(realPos2, list2.remove(realPos));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        int itemViewType = getItemViewType(position);
        if (itemViewType == 1) {
            ((LabelViewHolder) holder).getLabelTv().setText(ExtUtilKt.getString(c0j.M));
            return;
        }
        if (itemViewType == 2) {
            ((LabelViewHolder) holder).getLabelTv().setText(ExtUtilKt.getString(c0j.L));
            return;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = position;
        int i = this.addedLabelIndex;
        if (i >= 0 && i < position) {
            intRef.element = position - 1;
        }
        int i2 = this.removedLabelIndex;
        if (i2 >= 0 && i2 < position) {
            intRef.element--;
        }
        final ShowAllDataViewHolder showAllDataViewHolder = (ShowAllDataViewHolder) holder;
        final km5 km5Var = this.dataList.get(intRef.element);
        showAllDataViewHolder.getName().setText(l2c.b(km5Var.f23979b));
        showAllDataViewHolder.getIcon().setImageResource(l2c.a(km5Var.f23979b));
        if (km5Var.e == -1) {
            showAllDataViewHolder.getSavedIcon().setImageResource(pni.X0);
            showAllDataViewHolder.getSavedIcon().setContentDescription(ExtUtilKt.getString(c0j.Jq));
        } else {
            showAllDataViewHolder.getSavedIcon().setImageResource(pni.Z0);
            showAllDataViewHolder.getSavedIcon().setContentDescription(ExtUtilKt.getString(c0j.Nq));
        }
        showAllDataViewHolder.getSavedIcon().setOnClickListener(new View.OnClickListener() { // from class: b1c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthShowAllDataAdapterV4.onBindViewHolder$lambda$3(this.f3678a, km5Var, intRef, view);
            }
        });
        showAllDataViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: c1c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthShowAllDataAdapterV4.onBindViewHolder$lambda$4(km5Var, this, view);
            }
        });
        showAllDataViewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: d1c
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return HealthShowAllDataAdapterV4.onBindViewHolder$lambda$5(showAllDataViewHolder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1 || viewType == 2) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.r4, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new LabelViewHolder(this, viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(jui.s4, parent, false);
        nuf.f(viewInflate2);
        Intrinsics.checkNotNull(viewInflate2);
        return new ShowAllDataViewHolder(this, viewInflate2);
    }

    public final void resetSortList() {
        this.dataList.clear();
        CollectionsKt__MutableCollectionsKt.addAll(this.dataList, this.constCacheDataList);
        reSortList();
    }

    public final void setHasChanged(boolean z) {
        this.hasChanged = z;
    }
}

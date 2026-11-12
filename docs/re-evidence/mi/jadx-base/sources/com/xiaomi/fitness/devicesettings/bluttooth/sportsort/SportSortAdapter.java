package com.xiaomi.fitness.devicesettings.bluttooth.sportsort;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.sportsort.SportSortAdapter;
import defpackage.eui;
import defpackage.jni;
import defpackage.wzi;
import defpackage.zqi;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006ABCDE@B-\u0012\u0006\u0010\"\u001a\u00020!\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\b>\u0010?J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u0010J\u0015\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b \u0010\u0010R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006F"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "getExposeDataListSize", "()I", "position", "", "isAllHide", "(I)Z", "", "expandItem", "(I)V", "hideItem", "category", "getInsertPosition", "(I)I", "sportsType", "", "getSportsType", "(I)Ljava/lang/String;", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "getItemViewType", "type", "getOptionType", "Landroidx/recyclerview/widget/l;", "itemTouchHelper", "Landroidx/recyclerview/widget/l;", "getItemTouchHelper", "()Landroidx/recyclerview/widget/l;", "setItemTouchHelper", "(Landroidx/recyclerview/widget/l;)V", "Ljava/util/LinkedList;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortData;", "showList", "Ljava/util/LinkedList;", "getShowList", "()Ljava/util/LinkedList;", "setShowList", "(Ljava/util/LinkedList;)V", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortAdapter$ChangeOptionCountCallback;", "changeOptionCountCallback", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortAdapter$ChangeOptionCountCallback;", "getChangeOptionCountCallback", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortAdapter$ChangeOptionCountCallback;", "setChangeOptionCountCallback", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortAdapter$ChangeOptionCountCallback;)V", "<init>", "(Landroidx/recyclerview/widget/l;Ljava/util/LinkedList;Landroidx/recyclerview/widget/RecyclerView;Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortAdapter$ChangeOptionCountCallback;)V", "Companion", "ChangeOptionCountCallback", "SportSortExposeItemHolder", "SportSortItemHolder", "SportSortTypeHolder", "SportSortHideHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportSortAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int BALL_SPORTS = 6;
    public static final int CHESS_SPORTS = 9;
    public static final int DANCE = 4;
    public static final int EXERCISE_SPORTS = 3;
    public static final int EXPOSE_SPORTS = 10;
    public static final int FIGHT = 5;
    public static final int HIDDEN_TYPE = 11;
    public static final int ICE_SPORTS = 7;
    public static final int LEISURE_SPORTS = 8;
    public static final int NORMAL_SPORTS = 0;
    public static final int OTHER_SPOTS = 100;
    public static final int OUTDOOR_SPORTS = 2;
    public static final int WATER_SPORTS = 1;

    @NotNull
    private ChangeOptionCountCallback changeOptionCountCallback;

    @NotNull
    private l itemTouchHelper;

    @NotNull
    private RecyclerView mRecyclerView;

    @NotNull
    private LinkedList<SportSortData> showList;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortAdapter$ChangeOptionCountCallback;", "", "onChangeOptionCount", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ChangeOptionCountCallback {
        void onChangeOptionCount();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortAdapter$SportSortExposeItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "swipe", "Landroid/widget/ImageView;", "getSwipe", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "icon", "getIcon", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class SportSortExposeItemHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView icon;

        @NotNull
        private final TextView name;

        @NotNull
        private final ImageView swipe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SportSortExposeItemHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(zqi.Z8);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.swipe = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(zqi.B5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.name = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(zqi.A3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById3;
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
        public final ImageView getSwipe() {
            return this.swipe;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortAdapter$SportSortHideHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class SportSortHideHolder extends RecyclerView.d0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SportSortHideHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortAdapter$SportSortItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "isVisible", "", "setVisibility", "(Z)V", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class SportSortItemHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView icon;

        @NotNull
        private final TextView name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SportSortItemHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(zqi.A3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(zqi.B5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.name = (TextView) viewFindViewById2;
        }

        @NotNull
        public final ImageView getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextView getName() {
            return this.name;
        }

        public final void setVisibility(boolean isVisible) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            if (isVisible) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
                this.itemView.setVisibility(0);
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                this.itemView.setVisibility(8);
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortAdapter$SportSortTypeHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "Landroid/widget/ImageView;", "status", "Landroid/widget/ImageView;", "getStatus", "()Landroid/widget/ImageView;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class SportSortTypeHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView name;

        @NotNull
        private final ImageView status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SportSortTypeHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(zqi.Ca);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.name = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(zqi.M8);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.status = (ImageView) viewFindViewById2;
        }

        @NotNull
        public final TextView getName() {
            return this.name;
        }

        @NotNull
        public final ImageView getStatus() {
            return this.status;
        }
    }

    public SportSortAdapter(@NotNull l itemTouchHelper, @NotNull LinkedList<SportSortData> showList, @NotNull RecyclerView mRecyclerView, @NotNull ChangeOptionCountCallback changeOptionCountCallback) {
        Intrinsics.checkNotNullParameter(itemTouchHelper, "itemTouchHelper");
        Intrinsics.checkNotNullParameter(showList, "showList");
        Intrinsics.checkNotNullParameter(mRecyclerView, "mRecyclerView");
        Intrinsics.checkNotNullParameter(changeOptionCountCallback, "changeOptionCountCallback");
        this.itemTouchHelper = itemTouchHelper;
        this.showList = showList;
        this.mRecyclerView = mRecyclerView;
        this.changeOptionCountCallback = changeOptionCountCallback;
    }

    private final void expandItem(int position) {
        int categoryName = this.showList.get(position).getCategoryName();
        int size = this.showList.size();
        for (int i = 0; i < size; i++) {
            if (this.showList.get(i).getCategoryName() == categoryName && this.showList.get(i).getSportType() != categoryName) {
                this.showList.get(i).setExpand(true);
                notifyDataSetChanged();
            }
        }
    }

    private final int getExposeDataListSize() {
        Iterator<SportSortData> it = this.showList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        int i = 0;
        while (it.hasNext()) {
            SportSortData next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            SportSortData sportSortData = next;
            if (sportSortData.getViewType() != SportSortData.INSTANCE.getSPORT_SORT_EXPOSE() || !sportSortData.getIsExpose()) {
                break;
            }
            i++;
        }
        return i;
    }

    private final int getInsertPosition(int category) {
        int size = this.showList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SportSortData sportSortData = this.showList.get(i2);
            Intrinsics.checkNotNullExpressionValue(sportSortData, "get(...)");
            SportSortData sportSortData2 = sportSortData;
            if (sportSortData2.getViewType() == SportSortData.INSTANCE.getSPORT_SORT_TYPE() && category == sportSortData2.getCategoryName()) {
                i = i2;
            }
        }
        return i + 1;
    }

    private final String getSportsType(int sportsType) {
        switch (sportsType) {
            case 0:
                String string = ApplicationExtKt.getApplication().getString(wzi.V7);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            case 1:
                String string2 = ApplicationExtKt.getApplication().getString(wzi.Y7);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 2:
                String string3 = ApplicationExtKt.getApplication().getString(wzi.X7);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 3:
                String string4 = ApplicationExtKt.getApplication().getString(wzi.R7);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 4:
                String string5 = ApplicationExtKt.getApplication().getString(wzi.Q7);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 5:
                String string6 = ApplicationExtKt.getApplication().getString(wzi.S7);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 6:
                String string7 = ApplicationExtKt.getApplication().getString(wzi.O7);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 7:
                String string8 = ApplicationExtKt.getApplication().getString(wzi.T7);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            case 8:
                String string9 = ApplicationExtKt.getApplication().getString(wzi.U7);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                return string9;
            default:
                String string10 = ApplicationExtKt.getApplication().getString(wzi.W7);
                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                return string10;
        }
    }

    private final void hideItem(int position) {
        int categoryName = this.showList.get(position).getCategoryName();
        int size = this.showList.size();
        for (int i = 0; i < size; i++) {
            if (this.showList.get(i).getCategoryName() == categoryName && this.showList.get(i).getSportType() != categoryName) {
                this.showList.get(i).setExpand(false);
                notifyDataSetChanged();
            }
        }
    }

    private final boolean isAllHide(int position) {
        int categoryName = this.showList.get(position).getCategoryName();
        int size = this.showList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.showList.get(i2).getCategoryName() == categoryName && this.showList.get(i2).getSportType() != categoryName && !this.showList.get(i2).getIsExpose() && this.showList.get(i2).getIsExpand()) {
                i++;
            }
        }
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(RecyclerView.d0 holder, SportSortAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = ((SportSortTypeHolder) holder).getBindingAdapterPosition();
        if (this$0.isAllHide(bindingAdapterPosition)) {
            this$0.expandItem(bindingAdapterPosition);
        } else {
            this$0.hideItem(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(SportSortAdapter this$0, RecyclerView.d0 holder, SportSortData sportSortData, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(sportSortData, "$sportSortData");
        if (this$0.getExposeDataListSize() >= 30) {
            Application application = ApplicationExtKt.getApplication();
            String string = ApplicationExtKt.getApplication().getString(wzi.y);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(application, string);
            return;
        }
        this$0.showList.remove(((SportSortItemHolder) holder).getBindingAdapterPosition());
        sportSortData.setExpose(true);
        sportSortData.setExpand(false);
        sportSortData.setViewType(SportSortData.INSTANCE.getSPORT_SORT_EXPOSE());
        this$0.showList.add(this$0.getExposeDataListSize(), sportSortData);
        this$0.notifyDataSetChanged();
        this$0.changeOptionCountCallback.onChangeOptionCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$2(SportSortAdapter this$0, RecyclerView.d0 holder, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this$0.itemTouchHelper.x(holder);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3(SportSortAdapter this$0, SportSortData sportSortData, RecyclerView.d0 holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sportSortData, "$sportSortData");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        if (this$0.getExposeDataListSize() <= 1) {
            Application application = ApplicationExtKt.getApplication();
            String string = ApplicationExtKt.getApplication().getString(wzi.y6);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(application, string);
            return;
        }
        if (sportSortData.getSportType() == 0) {
            Application application2 = ApplicationExtKt.getApplication();
            String string2 = ApplicationExtKt.getApplication().getString(wzi.w1);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            ToastExtKt.toastShort(application2, string2);
            return;
        }
        sportSortData.setViewType(SportSortData.INSTANCE.getSPORT_SORT_ITEM());
        sportSortData.setCategoryName(sportSortData.getSportType() / 100);
        sportSortData.setExpose(false);
        sportSortData.setExpand(true);
        this$0.showList.remove(((SportSortExposeItemHolder) holder).getBindingAdapterPosition());
        this$0.showList.add(this$0.getInsertPosition(this$0.getOptionType(sportSortData.getSportType())), sportSortData);
        this$0.notifyDataSetChanged();
        this$0.changeOptionCountCallback.onChangeOptionCount();
    }

    @NotNull
    public final ChangeOptionCountCallback getChangeOptionCountCallback() {
        return this.changeOptionCountCallback;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.showList.size();
    }

    @NotNull
    public final l getItemTouchHelper() {
        return this.itemTouchHelper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.showList.get(position).getViewType();
    }

    @NotNull
    public final RecyclerView getMRecyclerView() {
        return this.mRecyclerView;
    }

    public final int getOptionType(int type) {
        return type / 100;
    }

    @NotNull
    public final LinkedList<SportSortData> getShowList() {
        return this.showList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SportSortData sportSortData = this.showList.get(position);
        Intrinsics.checkNotNullExpressionValue(sportSortData, "get(...)");
        final SportSortData sportSortData2 = sportSortData;
        if (holder instanceof SportSortTypeHolder) {
            SportSortTypeHolder sportSortTypeHolder = (SportSortTypeHolder) holder;
            sportSortTypeHolder.getName().setText(getSportsType(sportSortData2.getCategoryName()));
            sportSortTypeHolder.getStatus().setImageResource(isAllHide(position) ? jni.u1 : jni.t1);
            sportSortTypeHolder.getStatus().setOnClickListener(new View.OnClickListener() { // from class: e1o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportSortAdapter.onBindViewHolder$lambda$0(holder, this, view);
                }
            });
            return;
        }
        if (holder instanceof SportSortItemHolder) {
            SportSortItemHolder sportSortItemHolder = (SportSortItemHolder) holder;
            sportSortItemHolder.getIcon().setImageResource(jni.a1);
            sportSortItemHolder.getName().setText(sportSortData2.getName());
            if (sportSortData2.getIsExpand()) {
                sportSortItemHolder.setVisibility(true);
            } else {
                sportSortItemHolder.setVisibility(false);
            }
            sportSortItemHolder.getIcon().setOnClickListener(new View.OnClickListener() { // from class: f1o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportSortAdapter.onBindViewHolder$lambda$1(this.f17300a, holder, sportSortData2, view);
                }
            });
            return;
        }
        if (!(holder instanceof SportSortExposeItemHolder)) {
            boolean z = holder instanceof SportSortHideHolder;
            return;
        }
        SportSortExposeItemHolder sportSortExposeItemHolder = (SportSortExposeItemHolder) holder;
        sportSortExposeItemHolder.getName().setText(sportSortData2.getName());
        sportSortExposeItemHolder.getSwipe().setImageResource(jni.e1);
        sportSortExposeItemHolder.getIcon().setImageResource(jni.c1);
        sportSortExposeItemHolder.getSwipe().setOnTouchListener(new View.OnTouchListener() { // from class: g1o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SportSortAdapter.onBindViewHolder$lambda$2(this.f18476a, holder, view, motionEvent);
            }
        });
        sportSortExposeItemHolder.getSwipe().setEnabled(true);
        sportSortExposeItemHolder.getIcon().setOnClickListener(new View.OnClickListener() { // from class: h1o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportSortAdapter.onBindViewHolder$lambda$3(this.f19583a, sportSortData2, holder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SportSortData.Companion companion = SportSortData.INSTANCE;
        if (viewType == companion.getSPORT_SORT_ITEM()) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(eui.Q2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new SportSortItemHolder(viewInflate);
        }
        if (viewType == companion.getSPORT_SORT_TYPE()) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(eui.j3, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            return new SportSortTypeHolder(viewInflate2);
        }
        if (viewType == companion.getSPORT_SORT_EXPOSE()) {
            View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(eui.P2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
            return new SportSortExposeItemHolder(viewInflate3);
        }
        View viewInflate4 = LayoutInflater.from(parent.getContext()).inflate(eui.R2, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate4, "inflate(...)");
        return new SportSortHideHolder(viewInflate4);
    }

    public final void setChangeOptionCountCallback(@NotNull ChangeOptionCountCallback changeOptionCountCallback) {
        Intrinsics.checkNotNullParameter(changeOptionCountCallback, "<set-?>");
        this.changeOptionCountCallback = changeOptionCountCallback;
    }

    public final void setItemTouchHelper(@NotNull l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.itemTouchHelper = lVar;
    }

    public final void setMRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.mRecyclerView = recyclerView;
    }

    public final void setShowList(@NotNull LinkedList<SportSortData> linkedList) {
        Intrinsics.checkNotNullParameter(linkedList, "<set-?>");
        this.showList = linkedList;
    }
}

package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListAdapter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.eg4;
import defpackage.eui;
import defpackage.fli;
import defpackage.wzi;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\b\u0007*\u00012\u0018\u0000 62\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u000276B\u0007¢\u0006\u0004\b5\u0010\bJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0005J3\u0010\u000e\u001a\u00020\u00062$\u0010\r\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\bJ%\u0010\u0015\u001a\u00020\u00062\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0011j\u0002`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u00062\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R*\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0011j\u0004\u0018\u0001`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\f0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListAdapter$EmergencyContactListViewHolder;", "", "listHasChanged", "()Z", "", "setEditMode", "()V", "getEditMode", "Lkotlin/Function2;", "", "Leg4;", "list", "save", "(Lkotlin/jvm/functions/Function2;)V", "reset", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/OnEmergencyContactCountChange;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnEmergencyContactCountChange", "(Lkotlin/jvm/functions/Function1;)V", "updateList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListAdapter$EmergencyContactListViewHolder;", "holder", "position", "onBindViewHolder", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListAdapter$EmergencyContactListViewHolder;I)V", "getItemCount", "()I", "Landroidx/recyclerview/widget/l;", "itemTouchHelper", "Landroidx/recyclerview/widget/l;", "getItemTouchHelper", "()Landroidx/recyclerview/widget/l;", "setItemTouchHelper", "(Landroidx/recyclerview/widget/l;)V", "editMode", "Z", "onEmergencyContactCountChange", "Lkotlin/jvm/functions/Function1;", "", "currentList", "Ljava/util/List;", "com/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListAdapter$itemTouchHelperCallback$1", "itemTouchHelperCallback", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListAdapter$itemTouchHelperCallback$1;", "<init>", "Companion", "EmergencyContactListViewHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EmergencyContactListAdapter extends RecyclerView.Adapter<EmergencyContactListViewHolder> {

    @NotNull
    private static final String TAG = "EmergencyContactListAdapter";

    @NotNull
    private final List<eg4> currentList = new ArrayList();
    private boolean editMode;

    @Nullable
    private l itemTouchHelper;

    @NotNull
    private final EmergencyContactListAdapter$itemTouchHelperCallback$1 itemTouchHelperCallback;

    @Nullable
    private Function1<? super Integer, Unit> onEmergencyContactCountChange;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListAdapter$EmergencyContactListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Leg4;", "info", "", "bindData", "(Leg4;)V", "click", "()V", "Landroid/widget/TextView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "phone", "getPhone", "Landroid/widget/ImageView;", "delete", "Landroid/widget/ImageView;", "getDelete", "()Landroid/widget/ImageView;", "swipe", "getSwipe", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListAdapter;Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class EmergencyContactListViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView delete;

        @NotNull
        private final TextView name;

        @NotNull
        private final TextView phone;

        @NotNull
        private final ImageView swipe;
        final /* synthetic */ EmergencyContactListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmergencyContactListViewHolder(@NotNull EmergencyContactListAdapter emergencyContactListAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = emergencyContactListAdapter;
            this.name = (TextView) itemView.findViewById(zqi.B5);
            this.phone = (TextView) itemView.findViewById(zqi.p6);
            this.delete = (ImageView) itemView.findViewById(zqi.Z0);
            this.swipe = (ImageView) itemView.findViewById(zqi.Z8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void click$lambda$0(EmergencyContactListAdapter this$0, EmergencyContactListViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (this$0.currentList.size() <= 1) {
                ToastExtKt.toastShort(ApplicationExtKt.getApplication(), wzi.s7);
                return;
            }
            this$0.currentList.remove(this$1.getBindingAdapterPosition());
            Function1 function1 = this$0.onEmergencyContactCountChange;
            if (function1 != null) {
                function1.invoke2(Integer.valueOf(this$0.currentList.size()));
            }
            this$0.notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean click$lambda$1(EmergencyContactListAdapter this$0, EmergencyContactListViewHolder this$1, View view, MotionEvent event) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(event, "event");
            l itemTouchHelper = this$0.getItemTouchHelper();
            if (itemTouchHelper == null) {
                return false;
            }
            itemTouchHelper.x(this$1);
            return false;
        }

        public final void bindData(@NotNull eg4 info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.name.setText(info.c);
            this.phone.setText(info.d);
            ViewExtKt.setVisible(this.delete, this.this$0.editMode);
            ViewExtKt.setVisible(this.swipe, this.this$0.editMode);
            ViewGroup.LayoutParams layoutParams = this.name.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            float dimension = ApplicationExtKt.getApplication().getResources().getDimension(fli.c);
            if (this.this$0.editMode) {
                float dimension2 = ApplicationExtKt.getApplication().getResources().getDimension(fli.d);
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMargins(ExtUtilsKt.getDp(10), (int) dimension, (int) dimension2, 0);
                    return;
                }
                return;
            }
            float dimension3 = ApplicationExtKt.getApplication().getResources().getDimension(fli.e);
            if (marginLayoutParams != null) {
                int i = (int) dimension3;
                marginLayoutParams.setMargins(i, (int) dimension, i, 0);
            }
        }

        public final void click() {
            ImageView imageView = this.delete;
            final EmergencyContactListAdapter emergencyContactListAdapter = this.this$0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: p78
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EmergencyContactListAdapter.EmergencyContactListViewHolder.click$lambda$0(emergencyContactListAdapter, this, view);
                }
            });
            ImageView imageView2 = this.swipe;
            final EmergencyContactListAdapter emergencyContactListAdapter2 = this.this$0;
            imageView2.setOnTouchListener(new View.OnTouchListener() { // from class: q78
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return EmergencyContactListAdapter.EmergencyContactListViewHolder.click$lambda$1(emergencyContactListAdapter2, this, view, motionEvent);
                }
            });
        }

        @NotNull
        public final ImageView getDelete() {
            return this.delete;
        }

        @NotNull
        public final TextView getName() {
            return this.name;
        }

        @NotNull
        public final TextView getPhone() {
            return this.phone;
        }

        @NotNull
        public final ImageView getSwipe() {
            return this.swipe;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.l$e, com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListAdapter$itemTouchHelperCallback$1] */
    public EmergencyContactListAdapter() {
        ?? r0 = new l.h() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListAdapter$itemTouchHelperCallback$1
            {
                super(3, 0);
            }

            @Override // androidx.recyclerview.widget.l.e
            public boolean isLongPressDragEnabled() {
                return false;
            }

            @Override // androidx.recyclerview.widget.l.e
            public boolean onMove(RecyclerView recyclerView, RecyclerView.d0 viewHolder, RecyclerView.d0 target) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                Intrinsics.checkNotNullParameter(target, "target");
                if (!this.this$0.editMode) {
                    return false;
                }
                int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                int bindingAdapterPosition2 = target.getBindingAdapterPosition();
                Collections.swap(this.this$0.currentList, bindingAdapterPosition, bindingAdapterPosition2);
                if (recyclerView.isComputingLayout()) {
                    return true;
                }
                this.this$0.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
                return true;
            }

            @Override // androidx.recyclerview.widget.l.e
            public void onSwiped(RecyclerView.d0 viewHolder, int direction) {
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            }
        };
        this.itemTouchHelperCallback = r0;
        this.itemTouchHelper = new l(r0);
    }

    private final boolean listHasChanged() {
        FallDetectionHelper fallDetectionHelper = FallDetectionHelper.INSTANCE;
        if (fallDetectionHelper.getSLocalEmergencyContactList().size() != this.currentList.size()) {
            return true;
        }
        int size = fallDetectionHelper.getSLocalEmergencyContactList().size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.areEqual(FallDetectionHelper.INSTANCE.getSLocalEmergencyContactList().get(i).d, this.currentList.get(i).d)) {
                return true;
            }
        }
        return false;
    }

    public final boolean getEditMode() {
        return this.editMode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.currentList.size();
    }

    @Nullable
    public final l getItemTouchHelper() {
        return this.itemTouchHelper;
    }

    public final void reset() {
        this.currentList.clear();
        this.currentList.addAll(CollectionsKt___CollectionsKt.toMutableList((Collection) FallDetectionHelper.INSTANCE.getSLocalEmergencyContactList()));
        notifyDataSetChanged();
    }

    public final void save(@NotNull Function2<? super List<eg4>, ? super List<eg4>, Unit> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        FallDetectionHelper fallDetectionHelper = FallDetectionHelper.INSTANCE;
        List list2 = CollectionsKt___CollectionsKt.toList(fallDetectionHelper.getSLocalEmergencyContactList());
        fallDetectionHelper.getSLocalEmergencyContactList().clear();
        fallDetectionHelper.getSLocalEmergencyContactList().addAll(CollectionsKt___CollectionsKt.toMutableList((Collection) this.currentList));
        list.invoke(list2, CollectionsKt___CollectionsKt.toMutableList((Collection) this.currentList));
    }

    public final void setEditMode() {
        this.editMode = !this.editMode;
        notifyDataSetChanged();
    }

    public final void setItemTouchHelper(@Nullable l lVar) {
        this.itemTouchHelper = lVar;
    }

    public final void setOnEmergencyContactCountChange(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onEmergencyContactCountChange = listener;
    }

    public final void updateList(@NotNull List<eg4> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.currentList.clear();
        this.currentList.addAll(list);
        notifyDataSetChanged();
        Function1<? super Integer, Unit> function1 = this.onEmergencyContactCountChange;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(list.size()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull EmergencyContactListViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.currentList.get(position));
        holder.click();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public EmergencyContactListViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(eui.t1, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new EmergencyContactListViewHolder(this, viewInflate);
    }
}

package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetManagerAdapterV2;
import com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.devicesettings.utils.WatchType;
import defpackage.cji;
import defpackage.eui;
import defpackage.ikr;
import defpackage.zqi;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\"\u0010#J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerAdapterV2;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "oldPos", "newPos", "moveItemPositioin", "(II)V", "clearView", "()V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/IWidgetOperationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setWidgetOperationListener", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/IWidgetOperationListener;)V", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/NativeBuiltinWrapper;", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "onWidgetOperationListener", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/IWidgetOperationListener;", "<init>", "(Ljava/util/List;)V", "WidgetManagerViewHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WidgetManagerAdapterV2 extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private final List<NativeBuiltinWrapper> dataList;

    @Nullable
    private IWidgetOperationListener onWidgetOperationListener;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001f\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001f\u0010\f\u001a\n \u0006*\u0004\u0018\u00010\u000b0\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0010\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\nR\u001f\u0010\u0012\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u001f\u0010\u0015\u001a\n \u0006*\u0004\u0018\u00010\u00140\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerAdapterV2$WidgetManagerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "bindData", "()V", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "widgetImg", "Landroid/widget/ImageView;", "getWidgetImg", "()Landroid/widget/ImageView;", "Landroidx/cardview/widget/CardView;", "widgetImgCard", "Landroidx/cardview/widget/CardView;", "getWidgetImgCard", "()Landroidx/cardview/widget/CardView;", "widgetClose", "getWidgetClose", "swipeImg", "getSwipeImg", "Landroid/widget/TextView;", "tvWidgetName", "Landroid/widget/TextView;", "getTvWidgetName", "()Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerAdapterV2;Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class WidgetManagerViewHolder extends RecyclerView.d0 {
        private final ImageView swipeImg;
        final /* synthetic */ WidgetManagerAdapterV2 this$0;
        private final TextView tvWidgetName;
        private final ImageView widgetClose;
        private final ImageView widgetImg;
        private final CardView widgetImgCard;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WatchType.values().length];
                try {
                    iArr[WatchType.TYPE_SQUARE_WATCH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WatchType.TYPE_ROUND_WATCH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[WatchType.TYPE_SQUARE_BAND.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[WatchType.TYPE_ROUND_BAND.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WidgetManagerViewHolder(@NotNull WidgetManagerAdapterV2 widgetManagerAdapterV2, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = widgetManagerAdapterV2;
            this.widgetImg = (ImageView) itemView.findViewById(zqi.Q3);
            this.widgetImgCard = (CardView) itemView.findViewById(zqi.M3);
            this.widgetClose = (ImageView) itemView.findViewById(zqi.S3);
            this.swipeImg = (ImageView) itemView.findViewById(zqi.P3);
            this.tvWidgetName = (TextView) itemView.findViewById(zqi.wa);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean bindData$lambda$0(WidgetManagerAdapterV2 this$0, WidgetManagerViewHolder this$1, View view, MotionEvent motionEvent) {
            IWidgetOperationListener iWidgetOperationListener;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (motionEvent.getAction() != 0 || (iWidgetOperationListener = this$0.onWidgetOperationListener) == null) {
                return true;
            }
            iWidgetOperationListener.doDrag(this$1);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$1(WidgetManagerAdapterV2 this$0, WidgetManagerViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            IWidgetOperationListener iWidgetOperationListener = this$0.onWidgetOperationListener;
            if (iWidgetOperationListener != null) {
                iWidgetOperationListener.onWidgetRemove(this$1.getBindingAdapterPosition());
            }
        }

        public final void bindData() {
            ImageView imageView = this.swipeImg;
            final WidgetManagerAdapterV2 widgetManagerAdapterV2 = this.this$0;
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: qir
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return WidgetManagerAdapterV2.WidgetManagerViewHolder.bindData$lambda$0(widgetManagerAdapterV2, this, view, motionEvent);
                }
            });
            ImageView imageView2 = this.widgetClose;
            final WidgetManagerAdapterV2 widgetManagerAdapterV3 = this.this$0;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: rir
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WidgetManagerAdapterV2.WidgetManagerViewHolder.bindData$lambda$1(widgetManagerAdapterV3, this, view);
                }
            });
            this.tvWidgetName.setText(this.this$0.getDataList().get(getBindingAdapterPosition()).getName());
            ViewGroup.LayoutParams layoutParams = this.widgetImg.getLayoutParams();
            int i = WhenMappings.$EnumSwitchMapping$0[UtilsKt.getWatchShape().ordinal()];
            if (i == 1) {
                UIUtils uIUtils = UIUtils.INSTANCE;
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                layoutParams.width = uIUtils.dip2px(context, 145.0f);
                Context context2 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                layoutParams.height = uIUtils.dip2px(context2, 70.0f);
                CardView cardView = this.widgetImgCard;
                Context context3 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                cardView.setRadius(uIUtils.dip2px(context3, 12.6f));
            } else if (i == 2) {
                UIUtils uIUtils2 = UIUtils.INSTANCE;
                Context context4 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                layoutParams.width = uIUtils2.dip2px(context4, 127.0f);
                Context context5 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                layoutParams.height = uIUtils2.dip2px(context5, 88.0f);
                CardView cardView2 = this.widgetImgCard;
                Context context6 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                cardView2.setRadius(uIUtils2.dip2px(context6, 14.67f));
            } else if (i == 3) {
                UIUtils uIUtils3 = UIUtils.INSTANCE;
                Context context7 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                layoutParams.width = uIUtils3.dip2px(context7, 137.0f);
                Context context8 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                layoutParams.height = uIUtils3.dip2px(context8, 88.0f);
                CardView cardView3 = this.widgetImgCard;
                Context context9 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                cardView3.setRadius(uIUtils3.dip2px(context9, 15.09f));
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                UIUtils uIUtils4 = UIUtils.INSTANCE;
                Context context10 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                layoutParams.width = uIUtils4.dip2px(context10, 53.0f);
                Context context11 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
                layoutParams.height = uIUtils4.dip2px(context11, 130.0f);
                CardView cardView4 = this.widgetImgCard;
                Context context12 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
                cardView4.setRadius(uIUtils4.dip2px(context12, 50.0f));
            }
            this.widgetImg.setLayoutParams(layoutParams);
            ikr.e(this.itemView.getContext(), this.this$0.getDataList().get(getBindingAdapterPosition()).getId(), new ImageLoadUtil.Callback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetManagerAdapterV2$WidgetManagerViewHolder$bindData$3
                @Override // com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil.Callback
                public void onFailure(Drawable errorDrawable) {
                    this.this$0.getWidgetImg().setImageBitmap(null);
                    this.this$0.getWidgetImg().setBackgroundColor(ExtUtilsKt.getColor(cji.c));
                }

                @Override // com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil.Callback
                public void onReady(Bitmap resource) {
                    Intrinsics.checkNotNullParameter(resource, "resource");
                    this.this$0.getWidgetImg().setImageBitmap(resource);
                    this.this$0.getWidgetImg().setBackgroundColor(ExtUtilsKt.getColor(cji.G));
                }
            });
        }

        public final ImageView getSwipeImg() {
            return this.swipeImg;
        }

        public final TextView getTvWidgetName() {
            return this.tvWidgetName;
        }

        public final ImageView getWidgetClose() {
            return this.widgetClose;
        }

        public final ImageView getWidgetImg() {
            return this.widgetImg;
        }

        public final CardView getWidgetImgCard() {
            return this.widgetImgCard;
        }
    }

    public WidgetManagerAdapterV2(@NotNull List<NativeBuiltinWrapper> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
    }

    public final void clearView() {
        notifyDataSetChanged();
    }

    @NotNull
    public final List<NativeBuiltinWrapper> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    public final void moveItemPositioin(int oldPos, int newPos) {
        List<NativeBuiltinWrapper> list = this.dataList;
        list.add(newPos, list.remove(oldPos));
        notifyItemMoved(oldPos, newPos);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof WidgetManagerViewHolder) {
            ((WidgetManagerViewHolder) holder).bindData();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(eui.m1, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new WidgetManagerViewHolder(this, viewInflate);
    }

    public final void setWidgetOperationListener(@NotNull IWidgetOperationListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onWidgetOperationListener = listener;
    }
}

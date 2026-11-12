package com.xiaomi.hm.health.device.settings.base;

import android.content.Context;
import androidx.annotation.FloatRange;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.view.FixedXRecyclerView;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.zhouyou.recyclerview.adapter.HelperRecyclerViewDragAdapter;
import com.zhouyou.recyclerview.listener.OnItemDragListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\b\u0016\u0012\u0006\u0010=\u001a\u00020<\u0012\n\u0010?\u001a\u00020>\"\u00020\u000e¢\u0006\u0004\b@\u0010AB\u001f\b\u0016\u0012\u0006\u0010=\u001a\u00020<\u0012\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000B¢\u0006\u0004\b@\u0010DB+\b\u0016\u0012\u0006\u0010=\u001a\u00020<\u0012\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000B\u0012\n\u0010?\u001a\u00020>\"\u00020\u000e¢\u0006\u0004\b@\u0010EJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0004R6\u0010\u001d\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00104\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00107\u001a\u00020\u000e8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006F"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/base/XRecyclerViewDragAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/zhouyou/recyclerview/adapter/HelperRecyclerViewDragAdapter;", "Lcom/zhouyou/recyclerview/listener/OnItemDragListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnItemDragListener", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "onItemDragStart", "source", "target", "onItemDragMoving", "onItemDragEnd", "", "from", "to", "move", "position", "getItemViewHolderPosition", "dataPosition", "Lkotlin/Function1;", "Lkotlin/Function0;", GoogleApiAvailabilityLight.b, "Lkotlin/jvm/functions/Function1;", "getSafeNotify", "()Lkotlin/jvm/functions/Function1;", "setSafeNotify", "(Lkotlin/jvm/functions/Function1;)V", "safeNotify", "", "o", "Ljava/lang/Float;", "getDragAlpha", "()Ljava/lang/Float;", "setDragAlpha", "(Ljava/lang/Float;)V", "dragAlpha", "Lcom/xiaomi/hm/health/device/view/FixedXRecyclerView;", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/xiaomi/hm/health/device/view/FixedXRecyclerView;", "getRecyclerView", "()Lcom/xiaomi/hm/health/device/view/FixedXRecyclerView;", "setRecyclerView", "(Lcom/xiaomi/hm/health/device/view/FixedXRecyclerView;)V", "recyclerView", DTransferConstants.SEARCH_KEY, "Lcom/zhouyou/recyclerview/listener/OnItemDragListener;", "getDragListener", "()Lcom/zhouyou/recyclerview/listener/OnItemDragListener;", "setDragListener", "(Lcom/zhouyou/recyclerview/listener/OnItemDragListener;)V", "dragListener", "f", "()I", "itemViewHolderStartIndex", "", "getTag", "()Ljava/lang/String;", "tag", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "layoutIds", "<init>", "(Landroid/content/Context;[I)V", "", "list", "(Landroid/content/Context;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/util/List;[I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class XRecyclerViewDragAdapter<T> extends HelperRecyclerViewDragAdapter<T> {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Function0<Unit>, Unit> safeNotify;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @FloatRange(from = 0.0d, to = 1.0d)
    @Nullable
    private Float dragAlpha;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private FixedXRecyclerView recyclerView;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private OnItemDragListener dragListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onItemDragEnd - " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onItemDragMoving - " + this.a + " -> " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ XRecyclerViewDragAdapter<T> a;
        public final /* synthetic */ RecyclerView.ViewHolder b;
        public final /* synthetic */ RecyclerView.ViewHolder c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(XRecyclerViewDragAdapter<T> xRecyclerViewDragAdapter, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            super(0);
            this.a = xRecyclerViewDragAdapter;
            this.b = viewHolder;
            this.c = viewHolder2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.notifyItemMoved(this.b.getAdapterPosition(), this.c.getAdapterPosition());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onItemDragStart - " + this.a;
        }
    }

    public XRecyclerViewDragAdapter(@NotNull Context context, @NotNull int... iArr) {
        super(context, Arrays.copyOf(iArr, iArr.length));
        this.dragAlpha = Float.valueOf(0.8f);
    }

    private final int f() {
        FixedXRecyclerView fixedXRecyclerView = this.recyclerView;
        if (fixedXRecyclerView == null) {
            return 0;
        }
        return fixedXRecyclerView.getHeadersCount() + 1;
    }

    public final int dataPosition(@NotNull RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getAdapterPosition() - f();
    }

    @Nullable
    public final Float getDragAlpha() {
        return this.dragAlpha;
    }

    @Nullable
    public final OnItemDragListener getDragListener() {
        return this.dragListener;
    }

    public final int getItemViewHolderPosition(int position) {
        return position + f();
    }

    @Nullable
    public final FixedXRecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @Nullable
    public final Function1<Function0<Unit>, Unit> getSafeNotify() {
        return this.safeNotify;
    }

    @NotNull
    public abstract String getTag();

    public final void move(int from, int to) {
        List<T> list = getList();
        if (from < to) {
            int iMin = Math.min(to, list.size());
            if (from >= iMin) {
                return;
            }
            while (true) {
                int i = from + 1;
                Collections.swap(list, from, i);
                if (i >= iMin) {
                    return;
                } else {
                    from = i;
                }
            }
        } else {
            int iMax = Math.max(to + 1, 0);
            if (iMax > from) {
                return;
            }
            while (true) {
                int i2 = from - 1;
                Collections.swap(list, from, from - 1);
                if (from == iMax) {
                    return;
                } else {
                    from = i2;
                }
            }
        }
    }

    @Override // com.zhouyou.recyclerview.adapter.HelperRecyclerViewDragAdapter
    public void onItemDragEnd(@NotNull RecyclerView.ViewHolder viewHolder) {
        if (isItemDraggable()) {
            Float f = this.dragAlpha;
            if (f != null) {
                f.floatValue();
                viewHolder.itemView.setAlpha(1.0f);
            }
            int iDataPosition = dataPosition(viewHolder);
            HMLog.verbose(getTag(), new a(iDataPosition));
            OnItemDragListener onItemDragListener = this.dragListener;
            if (onItemDragListener == null) {
                return;
            }
            onItemDragListener.onItemDragEnd(viewHolder, iDataPosition);
        }
    }

    @Override // com.zhouyou.recyclerview.adapter.HelperRecyclerViewDragAdapter
    public void onItemDragMoving(@NotNull RecyclerView.ViewHolder source, @NotNull RecyclerView.ViewHolder target) {
        if (isItemDraggable()) {
            int iDataPosition = dataPosition(source);
            int iDataPosition2 = dataPosition(target);
            HMLog.verbose(getTag(), new b(iDataPosition, iDataPosition2));
            move(iDataPosition, iDataPosition2);
            OnItemDragListener onItemDragListener = this.dragListener;
            if (onItemDragListener != null) {
                onItemDragListener.onItemDragMoving(source, iDataPosition, target, iDataPosition2);
            }
            Function1<? super Function0<Unit>, Unit> function1 = this.safeNotify;
            if (function1 == null) {
                return;
            }
            function1.invoke(new c(this, source, target));
        }
    }

    @Override // com.zhouyou.recyclerview.adapter.HelperRecyclerViewDragAdapter
    public void onItemDragStart(@NotNull RecyclerView.ViewHolder viewHolder) {
        if (isItemDraggable()) {
            Float f = this.dragAlpha;
            if (f != null) {
                viewHolder.itemView.setAlpha(f.floatValue());
            }
            int iDataPosition = dataPosition(viewHolder);
            HMLog.verbose(getTag(), new d(iDataPosition));
            OnItemDragListener onItemDragListener = this.dragListener;
            if (onItemDragListener == null) {
                return;
            }
            onItemDragListener.onItemDragStart(viewHolder, iDataPosition);
        }
    }

    public final void setDragAlpha(@Nullable Float f) {
        this.dragAlpha = f;
    }

    public final void setDragListener(@Nullable OnItemDragListener onItemDragListener) {
        this.dragListener = onItemDragListener;
    }

    @Override // com.zhouyou.recyclerview.adapter.HelperRecyclerViewDragAdapter
    public void setOnItemDragListener(@NotNull OnItemDragListener listener) {
        this.dragListener = listener;
    }

    public final void setRecyclerView(@Nullable FixedXRecyclerView fixedXRecyclerView) {
        this.recyclerView = fixedXRecyclerView;
    }

    public final void setSafeNotify(@Nullable Function1<? super Function0<Unit>, Unit> function1) {
        this.safeNotify = function1;
    }

    public XRecyclerViewDragAdapter(@NotNull Context context, @NotNull List<? extends T> list) {
        super(list, context);
        this.dragAlpha = Float.valueOf(0.8f);
    }

    public XRecyclerViewDragAdapter(@NotNull Context context, @NotNull List<? extends T> list, @NotNull int... iArr) {
        super(list, context, Arrays.copyOf(iArr, iArr.length));
        this.dragAlpha = Float.valueOf(0.8f);
    }
}

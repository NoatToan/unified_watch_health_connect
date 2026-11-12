package com.huami.phone_call.sms.base;

import android.content.Context;
import androidx.annotation.FloatRange;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.phone_call.sms.base.XRecyclerViewDragAdapter;
import com.huami.phone_call.sms.view.FixedXRecyclerView;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.zhouyou.recyclerview.adapter.HelperRecyclerViewDragAdapter;
import com.zhouyou.recyclerview.listener.OnItemDragListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\n\u00106\u001a\u000205\"\u00020\u000e¢\u0006\u0004\b7\u00108B\u001f\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000009¢\u0006\u0004\b7\u0010;B+\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000009\u0012\n\u00106\u001a\u000205\"\u00020\u000e¢\u0006\u0004\b7\u0010<J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0004R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u000e8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006="}, d2 = {"Lcom/huami/phone_call/sms/base/XRecyclerViewDragAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/zhouyou/recyclerview/adapter/HelperRecyclerViewDragAdapter;", "Lcom/zhouyou/recyclerview/listener/OnItemDragListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnItemDragListener", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "onItemDragStart", "source", "target", "onItemDragMoving", "onItemDragEnd", "", "from", "to", "move", "position", "getItemViewHolderPosition", "dataPosition", "", GoogleApiAvailabilityLight.b, "Ljava/lang/Float;", "getDragAlpha", "()Ljava/lang/Float;", "setDragAlpha", "(Ljava/lang/Float;)V", "dragAlpha", "Lcom/huami/phone_call/sms/view/FixedXRecyclerView;", "o", "Lcom/huami/phone_call/sms/view/FixedXRecyclerView;", "getRecyclerView", "()Lcom/huami/phone_call/sms/view/FixedXRecyclerView;", "setRecyclerView", "(Lcom/huami/phone_call/sms/view/FixedXRecyclerView;)V", "recyclerView", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/zhouyou/recyclerview/listener/OnItemDragListener;", "getDragListener", "()Lcom/zhouyou/recyclerview/listener/OnItemDragListener;", "setDragListener", "(Lcom/zhouyou/recyclerview/listener/OnItemDragListener;)V", "dragListener", "g", "()I", "itemViewHolderStartIndex", "", "getTag", "()Ljava/lang/String;", "tag", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "layoutIds", "<init>", "(Landroid/content/Context;[I)V", "", "list", "(Landroid/content/Context;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/util/List;[I)V", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
public abstract class XRecyclerViewDragAdapter<T> extends HelperRecyclerViewDragAdapter<T> {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @FloatRange(from = 0.0d, to = 1.0d)
    @Nullable
    private Float dragAlpha;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private FixedXRecyclerView recyclerView;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
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

    private final int g() {
        FixedXRecyclerView fixedXRecyclerView = this.recyclerView;
        if (fixedXRecyclerView == null) {
            return 0;
        }
        return fixedXRecyclerView.getHeadersCount() + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(XRecyclerViewDragAdapter xRecyclerViewDragAdapter, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        xRecyclerViewDragAdapter.notifyItemMoved(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
    }

    public final int dataPosition(@NotNull RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getAdapterPosition() - g();
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
        return position + g();
    }

    @Nullable
    public final FixedXRecyclerView getRecyclerView() {
        return this.recyclerView;
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
    public void onItemDragMoving(@NotNull final RecyclerView.ViewHolder source, @NotNull final RecyclerView.ViewHolder target) {
        if (isItemDraggable()) {
            int iDataPosition = dataPosition(source);
            int iDataPosition2 = dataPosition(target);
            HMLog.verbose(getTag(), new b(iDataPosition, iDataPosition2));
            move(iDataPosition, iDataPosition2);
            OnItemDragListener onItemDragListener = this.dragListener;
            if (onItemDragListener != null) {
                onItemDragListener.onItemDragMoving(source, iDataPosition, target, iDataPosition2);
            }
            source.itemView.post(new Runnable() { // from class: ix8
                @Override // java.lang.Runnable
                public final void run() {
                    XRecyclerViewDragAdapter.h(this.a, source, target);
                }
            });
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
            HMLog.verbose(getTag(), new c(iDataPosition));
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

    public XRecyclerViewDragAdapter(@NotNull Context context, @NotNull List<? extends T> list) {
        super(list, context);
        this.dragAlpha = Float.valueOf(0.8f);
    }

    public XRecyclerViewDragAdapter(@NotNull Context context, @NotNull List<? extends T> list, @NotNull int... iArr) {
        super(list, context, Arrays.copyOf(iArr, iArr.length));
        this.dragAlpha = Float.valueOf(0.8f);
    }
}

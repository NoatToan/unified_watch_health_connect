package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.quickstart;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/quickstart/QuickStartAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/quickstart/QuickStartHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/quickstart/QuickStartVo;", "a", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "Lkotlin/Function2;", "b", "Lkotlin/jvm/functions/Function2;", "getListener", "()Lkotlin/jvm/functions/Function2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class QuickStartAdapter extends RecyclerView.Adapter<QuickStartHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<QuickStartVo> data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function2<Integer, Integer, Unit> listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ QuickStartVo a;
        public final /* synthetic */ QuickStartAdapter b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(QuickStartVo quickStartVo, QuickStartAdapter quickStartAdapter, int i) {
            super(1);
            this.a = quickStartVo;
            this.b = quickStartAdapter;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            Object next;
            if (this.a.getSelect()) {
                return;
            }
            Iterator<QuickStartVo> it2 = this.b.getData().iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else if (it2.next().getSelect()) {
                    break;
                } else {
                    i++;
                }
            }
            Iterator<T> it3 = this.b.getData().iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!((QuickStartVo) next).getSelect());
            QuickStartVo quickStartVo = (QuickStartVo) next;
            if (quickStartVo != null) {
                quickStartVo.setSelect(false);
            }
            this.a.setSelect(true);
            this.b.getListener().invoke(Integer.valueOf(i), Integer.valueOf(this.c));
        }
    }

    public /* synthetic */ QuickStartAdapter(List list, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, function2);
    }

    @NotNull
    public final List<QuickStartVo> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.data.size();
    }

    @NotNull
    public final Function2<Integer, Integer, Unit> getListener() {
        return this.listener;
    }

    public final void setData(@NotNull List<QuickStartVo> list) {
        this.data = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull QuickStartHolder holder, int position) {
        QuickStartVo quickStartVo = this.data.get(position);
        ExtKt.setVisible$default(holder.getCom.xiaomi.hm.health.watermarkcamera.ui.activity.WatermarkClipActivity.EXTRA_SELECT_IMG java.lang.String(), quickStartVo.getSelect(), false, 2, null);
        holder.getNameTv().setText(quickStartVo.getName());
        ExtKt.smartClick$default(holder.itemView, 0L, new a(quickStartVo, this, position), 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public QuickStartHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new QuickStartHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_quick_start, parent, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuickStartAdapter(@NotNull List<QuickStartVo> list, @NotNull Function2<? super Integer, ? super Integer, Unit> function2) {
        this.data = list;
        this.listener = function2;
    }
}

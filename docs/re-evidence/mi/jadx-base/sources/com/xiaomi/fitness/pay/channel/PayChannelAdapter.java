package com.xiaomi.fitness.pay.channel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.pay.channel.PayChannelAdapter;
import defpackage.nnh;
import defpackage.r0j;
import defpackage.yni;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u001f\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u000f\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\u001c\u0010\u0019\u001a\u00020\u00072\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000eH\u0016R \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/pay/channel/PayChannelAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/pay/channel/PayChannelAdapter$PayChannelHolder;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/pay/channel/OnPayChannelSelectListener;", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "channelList", "", "select", "", "setChannelList", "list", "", "setChecked", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "PayChannelHolder", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PayChannelAdapter extends RecyclerView.Adapter<PayChannelHolder> {

    @NotNull
    private final List<String> channelList;

    @NotNull
    private final Function1<String, Unit> listener;
    private int select;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/pay/channel/PayChannelAdapter$PayChannelHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "bind", "(I)V", "onClick", "Lnnh;", "binding", "Lnnh;", "getBinding", "()Lnnh;", "<init>", "(Lcom/xiaomi/fitness/pay/channel/PayChannelAdapter;Lnnh;)V", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class PayChannelHolder extends RecyclerView.d0 {

        @NotNull
        private final nnh binding;
        final /* synthetic */ PayChannelAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayChannelHolder(@NotNull PayChannelAdapter payChannelAdapter, nnh binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = payChannelAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$0(PayChannelAdapter this$0, int i, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            String str = (String) this$0.channelList.get(i);
            this$0.setChecked(i);
            this$0.listener.invoke2(str);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void bind(int position) {
            String str = (String) this.this$0.channelList.get(position);
            this.binding.A.setSelected(position == this.this$0.select);
            switch (str.hashCode()) {
                case 73364844:
                    if (str.equals("MIPAY")) {
                        this.binding.C.setImageDrawable(ApplicationExtKt.getApplication().getDrawable(yni.e));
                        this.binding.D.setText(r0j.j);
                        this.binding.B.setText(r0j.h);
                        break;
                    }
                    break;
                case 83046919:
                    if (!str.equals("WXPAY")) {
                    }
                    this.binding.C.setImageDrawable(ApplicationExtKt.getApplication().getDrawable(yni.f));
                    this.binding.D.setText(r0j.f32053k);
                    this.binding.B.setText(r0j.i);
                    break;
                case 612852106:
                    if (!str.equals("WXPAYDEDUCT")) {
                    }
                    this.binding.C.setImageDrawable(ApplicationExtKt.getApplication().getDrawable(yni.f));
                    this.binding.D.setText(r0j.f32053k);
                    this.binding.B.setText(r0j.i);
                    break;
                case 1652625293:
                    if (!str.equals("ALIPAYDEDUCT")) {
                    }
                    this.binding.C.setImageDrawable(ApplicationExtKt.getApplication().getDrawable(yni.d));
                    this.binding.D.setText(r0j.f);
                    this.binding.B.setText(r0j.g);
                    break;
                case 1933336138:
                    if (!str.equals("ALIPAY")) {
                    }
                    this.binding.C.setImageDrawable(ApplicationExtKt.getApplication().getDrawable(yni.d));
                    this.binding.D.setText(r0j.f);
                    this.binding.B.setText(r0j.g);
                    break;
            }
        }

        @NotNull
        public final nnh getBinding() {
            return this.binding;
        }

        public final void onClick(final int position) {
            View root = this.binding.getRoot();
            final PayChannelAdapter payChannelAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: vmh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PayChannelAdapter.PayChannelHolder.onClick$lambda$0(payChannelAdapter, position, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PayChannelAdapter(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.channelList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setChecked(int position) {
        this.select = position;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.channelList.size();
    }

    public final void setChannelList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.channelList.clear();
        this.channelList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull PayChannelHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(position);
        holder.onClick(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PayChannelHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        nnh nnhVarA0 = nnh.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(nnhVarA0, "inflate(...)");
        return new PayChannelHolder(this, nnhVarA0);
    }
}

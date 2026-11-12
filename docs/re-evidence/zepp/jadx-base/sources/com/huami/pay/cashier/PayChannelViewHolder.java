package com.huami.pay.cashier;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.ktx.ContextExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.pay.cashier.PayChannelViewHolder;
import com.huami.pay.service.PayChannel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\"\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0016\u001a\n \u0010*\u0004\u0018\u00010\u00140\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u001e\u0010\u0018\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/huami/pay/cashier/PayChannelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlin/Triple;", "", "c", "Lcom/huami/pay/cashier/PayItem;", "payItem", "Lkotlin/Function1;", "", "itemClickListener", "bind", "Landroid/view/View;", "a", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroidx/appcompat/widget/AppCompatImageView;", "kotlin.jvm.PlatformType", "b", "Landroidx/appcompat/widget/AppCompatImageView;", "iconView", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "titleView", GoogleApiAvailabilityLight.a, "selectView", "<init>", "(Landroid/view/View;)V", "e", "pay-cashier_release"}, k = 1, mv = {1, 5, 1})
public final class PayChannelViewHolder extends RecyclerView.ViewHolder {

    @Deprecated
    public static final float RADIUS = 6.0f;

    @NotNull
    private static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AppCompatImageView iconView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AppCompatTextView titleView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AppCompatImageView selectView;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PayChannel.values().length];
            iArr[PayChannel.ALI_PAY.ordinal()] = 1;
            iArr[PayChannel.WECHAT_PAY.ordinal()] = 2;
            iArr[PayChannel.GOOGLE_PAY.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/pay/cashier/PayChannelViewHolder$a", "", "", "RADIUS", "F", "<init>", "()V", "pay-cashier_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PayChannelViewHolder(@NotNull View view) {
        super(view);
        this.view = view;
        this.iconView = (AppCompatImageView) view.findViewById(R.id.pay_cashier_item_icon);
        this.titleView = (AppCompatTextView) view.findViewById(R.id.pay_cashier_item_title);
        this.selectView = (AppCompatImageView) view.findViewById(R.id.pay_cashier_item_select);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, PayItem payItem, View view) {
        function1.invoke(payItem);
    }

    @SuppressLint({"ResourceType"})
    private final Triple<Integer, Integer, Integer> c() {
        Context context = this.view.getContext();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.payCashierItemColor, R.attr.payCashierItemTextColor, R.attr.payCashierItemSelectedColor});
        return new Triple<>(Integer.valueOf(typedArrayObtainStyledAttributes.getColor(0, ContextExtKt.loadColor(context, R.color.s4))), Integer.valueOf(typedArrayObtainStyledAttributes.getColor(1, ContextExtKt.loadColor(context, R.color.s1))), Integer.valueOf(typedArrayObtainStyledAttributes.getColor(2, ContextExtKt.loadColor(context, R.color.p3))));
    }

    public final void bind(@NotNull final PayItem payItem, @NotNull final Function1<? super PayItem, Unit> itemClickListener) {
        Pair pair;
        Triple<Integer, Integer, Integer> tripleC = c();
        int iIntValue = tripleC.component1().intValue();
        int iIntValue2 = tripleC.component2().intValue();
        int iIntValue3 = tripleC.component3().intValue();
        View view = this.view;
        if (!payItem.getSelect()) {
            iIntValue = 0;
        }
        ViewExtKt.setShape(view, 6.0f, Integer.valueOf(iIntValue));
        int i = WhenMappings.$EnumSwitchMapping$0[payItem.getPayChannel().ordinal()];
        if (i == 1) {
            pair = TuplesKt.to(Integer.valueOf(R.drawable.pay_cashier_ali_pay), Integer.valueOf(R.string.pay_cashier_ali));
        } else if (i == 2) {
            pair = TuplesKt.to(Integer.valueOf(R.drawable.pay_cashier_wx_pay), Integer.valueOf(R.string.pay_cashier_wechat));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            pair = TuplesKt.to(Integer.valueOf(R.drawable.pay_cashier_google_pay), Integer.valueOf(R.string.pay_cashier_google));
        }
        int iIntValue4 = ((Number) pair.component1()).intValue();
        int iIntValue5 = ((Number) pair.component2()).intValue();
        if (!payItem.getSelect()) {
            iIntValue3 = 0;
        }
        this.iconView.setImageResource(iIntValue4);
        AppCompatTextView appCompatTextView = this.titleView;
        appCompatTextView.setTextColor(iIntValue2);
        appCompatTextView.setText(ViewExtKt.getString(this.view, iIntValue5));
        this.selectView.setImageTintList(ColorStateList.valueOf(iIntValue3));
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: ts5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PayChannelViewHolder.b(itemClickListener, payItem, view2);
            }
        });
    }
}

package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.nfc.bean.CardSwitcherBean;
import com.xiaomi.fitness.nfc.widget.CardSwitcherView;
import defpackage.mri;
import defpackage.ssg;
import defpackage.sui;
import defpackage.y64;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0002)*B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\rJ:\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0007J\u001a\u0010#\u001a\u00020\u00162\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015J\u000e\u0010%\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0007J\u001a\u0010(\u001a\u00020\u00162\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/nfc/widget/CardSwitcherView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mCardSwitcherBean", "Lcom/xiaomi/fitness/nfc/bean/CardSwitcherBean;", "getMCardSwitcherBean", "()Lcom/xiaomi/fitness/nfc/bean/CardSwitcherBean;", "setMCardSwitcherBean", "(Lcom/xiaomi/fitness/nfc/bean/CardSwitcherBean;)V", "mAdapter", "Lcom/xiaomi/fitness/nfc/widget/CardSwitcherView$CardSwitcherAdapter;", "mDeleteListener", "Lkotlin/Function1;", "", "checkCountClickListener", "setCardSwitcher", "cardSwitch", "addCardSwitcher", "aid", "", "cardType", "hour", "min", "callback", "updateSwitchTimeViewAdd", "time", "setOnDeleteListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeBindingCardSwitcherTime", "removeCardSwitcherTime", "position", "setOnCheckCountClickListener", "CardSwitcherAdapter", "CardSwitcherViewHolder", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CardSwitcherView extends ConstraintLayout {

    @Nullable
    private Function1<? super Integer, Unit> checkCountClickListener;

    @NotNull
    private final CardSwitcherAdapter mAdapter;

    @NotNull
    private CardSwitcherBean mCardSwitcherBean;

    @Nullable
    private Function1<? super Integer, Unit> mDeleteListener;

    @NotNull
    private RecyclerView recyclerView;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/nfc/widget/CardSwitcherView$CardSwitcherAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/nfc/widget/CardSwitcherView$CardSwitcherViewHolder;", "Lcom/xiaomi/fitness/nfc/widget/CardSwitcherView;", "<init>", "(Lcom/xiaomi/fitness/nfc/widget/CardSwitcherView;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class CardSwitcherAdapter extends RecyclerView.Adapter<CardSwitcherViewHolder> {
        public CardSwitcherAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onBindViewHolder$lambda$0(CardSwitcherView this$0, int i, int i2) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Function1 function1 = this$0.mDeleteListener;
            if (function1 != null) {
                function1.invoke2(Integer.valueOf(i));
            }
            return Unit.INSTANCE;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return CardSwitcherView.this.getMCardSwitcherBean().getTime().size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull CardSwitcherViewHolder holder, final int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.bindView(position);
            final CardSwitcherView cardSwitcherView = CardSwitcherView.this;
            holder.onDelete(new Function1() { // from class: com.xiaomi.fitness.nfc.widget.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CardSwitcherView.CardSwitcherAdapter.onBindViewHolder$lambda$0(cardSwitcherView, position, ((Integer) obj).intValue());
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public CardSwitcherViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View viewInflate = LayoutInflater.from(CardSwitcherView.this.getContext()).inflate(sui.N0, parent, false);
            CardSwitcherView cardSwitcherView = CardSwitcherView.this;
            Intrinsics.checkNotNull(viewInflate);
            return new CardSwitcherViewHolder(cardSwitcherView, viewInflate);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/nfc/widget/CardSwitcherView$CardSwitcherViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "bindView", "(I)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onDelete", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/nfc/widget/CardSwitcherView;Landroid/view/View;)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class CardSwitcherViewHolder extends RecyclerView.d0 {
        final /* synthetic */ CardSwitcherView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardSwitcherViewHolder(@NotNull CardSwitcherView cardSwitcherView, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = cardSwitcherView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onDelete$lambda$0(Function1 listener, CardSwitcherViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            listener.invoke2(Integer.valueOf(this$0.getBindingAdapterPosition()));
        }

        public final void bindView(int position) {
            Object objValueOf;
            Object objValueOf2;
            int iIntValue = this.this$0.getMCardSwitcherBean().getTime().get(position).intValue();
            int i = iIntValue / 60;
            if (i > 9) {
                objValueOf = Integer.valueOf(i);
            } else {
                objValueOf = "0" + i;
            }
            int i2 = iIntValue % 60;
            if (i2 > 9) {
                objValueOf2 = Integer.valueOf(i2);
            } else {
                objValueOf2 = "0" + i2;
            }
            ((TextView) this.itemView.findViewById(mri.J4)).setText(objValueOf + ":" + objValueOf2);
        }

        public final void onDelete(@NotNull final Function1<? super Integer, Unit> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            ((ImageView) this.itemView.findViewById(mri.I4)).setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.fitness.nfc.widget.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CardSwitcherView.CardSwitcherViewHolder.onDelete$lambda$0(listener, this, view);
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardSwitcherView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CardSwitcherView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Integer, Unit> function1 = this$0.checkCountClickListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(this$0.mCardSwitcherBean.getTime().size()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCardSwitcher$lambda$0(Function1 callback, int i) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke2(Integer.valueOf(i));
    }

    public final void addCardSwitcher(@NotNull String aid, int cardType, int hour, int min, @NotNull final Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.mCardSwitcherBean.getTime().contains(Integer.valueOf((hour * 60) + min))) {
            callback.invoke2(-1);
        } else {
            ssg.u().b(aid, cardType, hour, min, new y64.o() { // from class: sr3
                @Override // y64.o
                public final void onResult(int i) {
                    CardSwitcherView.addCardSwitcher$lambda$0(callback, i);
                }
            });
        }
    }

    @NotNull
    public final CardSwitcherBean getMCardSwitcherBean() {
        return this.mCardSwitcherBean;
    }

    public final void removeBindingCardSwitcherTime(int time) {
        int size = this.mCardSwitcherBean.getTime().size();
        for (int i = 0; i < size; i++) {
            if (this.mCardSwitcherBean.getTime().get(i).intValue() == time) {
                ListExtKt.remove(this.mCardSwitcherBean.getTime(), i);
            }
        }
        this.mAdapter.notifyDataSetChanged();
    }

    public final void removeCardSwitcherTime(int position) {
        int iIntValue = this.mCardSwitcherBean.getTime().get(position).intValue();
        ListExtKt.remove(this.mCardSwitcherBean.getTime(), position);
        ssg.u().h(this.mCardSwitcherBean.getAid(), this.mCardSwitcherBean.getCardType(), iIntValue / 60, iIntValue % 60);
        this.mAdapter.notifyDataSetChanged();
    }

    public final void setCardSwitcher(@NotNull CardSwitcherBean cardSwitch) {
        Intrinsics.checkNotNullParameter(cardSwitch, "cardSwitch");
        this.mCardSwitcherBean = cardSwitch;
        this.mAdapter.notifyDataSetChanged();
    }

    public final void setMCardSwitcherBean(@NotNull CardSwitcherBean cardSwitcherBean) {
        Intrinsics.checkNotNullParameter(cardSwitcherBean, "<set-?>");
        this.mCardSwitcherBean = cardSwitcherBean;
    }

    public final void setOnCheckCountClickListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.checkCountClickListener = listener;
    }

    public final void setOnDeleteListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mDeleteListener = listener;
    }

    public final void updateSwitchTimeViewAdd(int time) {
        ListExtKt.add(this.mCardSwitcherBean.getTime(), Integer.valueOf(time));
        CollectionsKt___CollectionsKt.sorted(this.mCardSwitcherBean.getTime());
        this.mAdapter.notifyDataSetChanged();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardSwitcherView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardSwitcherView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardSwitcherView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mCardSwitcherBean = new CardSwitcherBean(null, 0, new ArrayList(), 3, null);
        CardSwitcherAdapter cardSwitcherAdapter = new CardSwitcherAdapter();
        this.mAdapter = cardSwitcherAdapter;
        LayoutInflater.from(context).inflate(sui.O0, (ViewGroup) this, true);
        this.recyclerView = (RecyclerView) findViewById(mri.A0);
        setOnClickListener(new View.OnClickListener() { // from class: tr3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardSwitcherView._init_$lambda$1(this.f34954a, view);
            }
        });
        this.recyclerView.setAdapter(cardSwitcherAdapter);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
    }
}

package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.nfc.bean.AutoSwitchCardBean;
import com.xiaomi.fitness.nfc.widget.AutoSwitchCardListView;
import defpackage.mri;
import defpackage.o0j;
import defpackage.sui;
import defpackage.vqg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0019\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ&\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001c2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\"\u001a\u00020\u0007H\u0002J\u000e\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/nfc/widget/AutoSwitchCardListView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "typeView", "Landroid/widget/TextView;", "getTypeView", "()Landroid/widget/TextView;", "setTypeView", "(Landroid/widget/TextView;)V", "layoutView", "getLayoutView", "()Landroid/widget/LinearLayout;", "setLayoutView", "(Landroid/widget/LinearLayout;)V", "cardListViewListener", "Lcom/xiaomi/fitness/nfc/widget/AutoSwitchCardListView$CardListViewListener;", "setListener", "", "setCardList", "list", "", "Lcom/xiaomi/fitness/nfc/bean/AutoSwitchCardBean;", "itemCheckList", "Ljava/util/ArrayList;", "Landroid/widget/ImageView;", "addCardView", "cardInfo", "index", "setItemSelected", "isSelected", "", "CardListViewListener", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAutoSwitchCardListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoSwitchCardListView.kt\ncom/xiaomi/fitness/nfc/widget/AutoSwitchCardListView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,128:1\n1872#2,3:129\n1863#2,2:145\n1863#2,2:147\n1863#2,2:149\n54#3,3:132\n24#3:135\n57#3,6:136\n63#3,2:143\n57#4:142\n*S KotlinDebug\n*F\n+ 1 AutoSwitchCardListView.kt\ncom/xiaomi/fitness/nfc/widget/AutoSwitchCardListView\n*L\n64#1:129,3\n119#1:145,2\n100#1:147,2\n104#1:149,2\n93#1:132,3\n93#1:135\n93#1:136,6\n93#1:143,2\n93#1:142\n*E\n"})
public final class AutoSwitchCardListView extends LinearLayout {

    @Nullable
    private CardListViewListener cardListViewListener;

    @NotNull
    private ArrayList<ImageView> itemCheckList;

    @NotNull
    private LinearLayout layoutView;

    @NotNull
    private TextView typeView;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/nfc/widget/AutoSwitchCardListView$CardListViewListener;", "", "onCardClicked", "", "cardInfo", "Lcom/xiaomi/fitness/nfc/bean/AutoSwitchCardBean;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface CardListViewListener {
        void onCardClicked(@NotNull AutoSwitchCardBean cardInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AutoSwitchCardListView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addCardView(final AutoSwitchCardBean cardInfo, final List<AutoSwitchCardBean> list, int index) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(sui.f, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(mri.O);
        TextView textView = (TextView) viewInflate.findViewById(mri.S2);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(mri.C0);
        ((TextView) viewInflate.findViewById(mri.f2)).setVisibility(cardInfo.getType() == 3 ? 0 : 8);
        this.itemCheckList.add(imageView2);
        imageView2.setSelected(cardInfo.getIsSelected());
        if (cardInfo.getIsSelected()) {
            imageView2.setContentDescription(ResourceExtKt.getString(o0j.A2));
        } else {
            imageView2.setContentDescription(ResourceExtKt.getString(o0j.G2));
        }
        String cardFace = cardInfo.getCardFace();
        vqg.d("cardFace cardFace:" + cardFace);
        if (imageView != null) {
            Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(cardFace).target(imageView).build());
        }
        textView.setText(cardInfo.getName());
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: ms1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AutoSwitchCardListView.addCardView$lambda$3(cardInfo, list, this, view);
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (index != 0) {
            layoutParams.topMargin = ExtUtilsKt.getDp(10);
        }
        this.layoutView.addView(viewInflate, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCardView$lambda$3(AutoSwitchCardBean cardInfo, List list, AutoSwitchCardListView this$0, View view) {
        Intrinsics.checkNotNullParameter(cardInfo, "$cardInfo");
        Intrinsics.checkNotNullParameter(list, "$list");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (cardInfo.getIsSelected()) {
            cardInfo.setSelected(false);
            view.setSelected(false);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AutoSwitchCardBean) it.next()).setSelected(false);
            }
            cardInfo.setSelected(true);
            Iterator<T> it2 = this$0.itemCheckList.iterator();
            while (it2.hasNext()) {
                ((ImageView) it2.next()).setSelected(false);
            }
            view.setSelected(true);
        }
        CardListViewListener cardListViewListener = this$0.cardListViewListener;
        if (cardListViewListener != null) {
            cardListViewListener.onCardClicked(cardInfo);
        }
    }

    @NotNull
    public final LinearLayout getLayoutView() {
        return this.layoutView;
    }

    @NotNull
    public final TextView getTypeView() {
        return this.typeView;
    }

    public final void setCardList(@NotNull List<AutoSwitchCardBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        int i = 0;
        if (!list.isEmpty()) {
            int type = list.get(0).getType();
            if (type == 0) {
                this.typeView.setText(o0j.Y6);
            } else if (type == 1) {
                this.typeView.setText(o0j.d3);
            } else if (type == 2) {
                this.typeView.setText(o0j.H4);
            } else if (type == 3) {
                this.typeView.setText(o0j.X3);
            }
        }
        this.layoutView.setVisibility(0);
        this.itemCheckList.clear();
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            addCardView((AutoSwitchCardBean) obj, list, i);
            i = i2;
        }
    }

    public final void setItemSelected(boolean isSelected) {
        Iterator<T> it = this.itemCheckList.iterator();
        while (it.hasNext()) {
            ((ImageView) it.next()).setSelected(isSelected);
        }
    }

    public final void setLayoutView(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.layoutView = linearLayout;
    }

    public final void setListener(@NotNull CardListViewListener cardListViewListener) {
        Intrinsics.checkNotNullParameter(cardListViewListener, "cardListViewListener");
        this.cardListViewListener = cardListViewListener;
    }

    public final void setTypeView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.typeView = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AutoSwitchCardListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AutoSwitchCardListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AutoSwitchCardListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(sui.T0, (ViewGroup) this, true);
        this.typeView = (TextView) findViewById(mri.j5);
        this.layoutView = (LinearLayout) findViewById(mri.u2);
        this.itemCheckList = new ArrayList<>();
    }
}

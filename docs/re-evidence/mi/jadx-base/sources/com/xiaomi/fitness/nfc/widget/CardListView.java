package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.sesdk.SeCardStatus;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.widget.CardListView;
import defpackage.lxf;
import defpackage.mri;
import defpackage.o0j;
import defpackage.pli;
import defpackage.r4j;
import defpackage.sui;
import defpackage.vqg;
import defpackage.wni;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00019B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010)\u001a\u00020*2\u0006\u0010'\u001a\u00020(J\u000e\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020\u0007J\u0014\u00102\u001a\u00020*2\f\u00103\u001a\b\u0012\u0004\u0012\u00020504J\u0018\u00106\u001a\u00020*2\u0006\u00107\u001a\u0002052\u0006\u00108\u001a\u00020\u0007H\u0002R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/nfc/widget/CardListView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "emptyView", "Lcom/xiaomi/fitness/nfc/widget/CardImageView;", "getEmptyView", "()Lcom/xiaomi/fitness/nfc/widget/CardImageView;", "setEmptyView", "(Lcom/xiaomi/fitness/nfc/widget/CardImageView;)V", "addView", "Landroid/widget/TextView;", "getAddView", "()Landroid/widget/TextView;", "setAddView", "(Landroid/widget/TextView;)V", "typeView", "getTypeView", "setTypeView", "layoutView", "Landroid/widget/FrameLayout;", "getLayoutView", "()Landroid/widget/FrameLayout;", "setLayoutView", "(Landroid/widget/FrameLayout;)V", "lineView", "Landroid/view/View;", "getLineView", "()Landroid/view/View;", "setLineView", "(Landroid/view/View;)V", "cardWidth", "cardHeight", "cardListViewListener", "Lcom/xiaomi/fitness/nfc/widget/CardListView$CardListViewListener;", "setListener", "", "category", "getCategory", "()I", "setCategory", "(I)V", "init", TSMAuthContants.PARAM_CARD_CATEGORY, "setCardList", "list", "", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "addCardView", "cardInfo", "index", "CardListViewListener", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCardListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardListView.kt\ncom/xiaomi/fitness/nfc/widget/CardListView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,192:1\n1872#2,3:193\n54#3,3:196\n24#3:199\n59#3,6:200\n*S KotlinDebug\n*F\n+ 1 CardListView.kt\ncom/xiaomi/fitness/nfc/widget/CardListView\n*L\n108#1:193,3\n176#1:196,3\n176#1:199\n176#1:200,6\n*E\n"})
public final class CardListView extends LinearLayout {

    @NotNull
    private TextView addView;
    private int cardHeight;

    @Nullable
    private CardListViewListener cardListViewListener;
    private int cardWidth;
    private int category;

    @NotNull
    private CardImageView emptyView;

    @NotNull
    private FrameLayout layoutView;

    @NotNull
    private View lineView;

    @NotNull
    private TextView typeView;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/nfc/widget/CardListView$CardListViewListener;", "", "onCardClicked", "", "cardInfo", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "onAddViewClicked", TSMAuthContants.PARAM_CARD_CATEGORY, "", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface CardListViewListener {
        void onAddViewClicked(int cardCategory);

        void onCardClicked(@NotNull CardWrapper cardInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardListView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CardListView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CardListViewListener cardListViewListener = this$0.cardListViewListener;
        if (cardListViewListener != null) {
            cardListViewListener.onAddViewClicked(this$0.category);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0039  */
    private final void addCardView(final CardWrapper cardInfo, int index) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(sui.j, (ViewGroup) null);
        CardImageView cardImageView = (CardImageView) viewInflate.findViewById(mri.O);
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate.findViewById(mri.X);
        int i = 0;
        if (cardInfo.isCar()) {
            SeCardStatus carStatus = cardInfo.getCarStatus();
            SeCardStatus seCardStatus = SeCardStatus.END_DATE_INVALID;
            if (carStatus != seCardStatus && cardInfo.getCarStatus() != SeCardStatus.START_DATE_INVALID) {
                i = 8;
            } else if (cardInfo.getCarStatus() == seCardStatus) {
                appCompatTextView.setText(o0j.E0);
            } else {
                appCompatTextView.setText(o0j.F0);
            }
        } else if (!cardInfo.isMifare()) {
            i = 8;
        } else if (cardInfo.isSuperCardOk()) {
            appCompatTextView.setText(o0j.Q0);
        } else if (cardInfo.isSuperCardNotOk()) {
            appCompatTextView.setText(o0j.P0);
        } else {
            i = 8;
        }
        appCompatTextView.setVisibility(i);
        int screenWidth = SettingsPropertiesUtil.INSTANCE.isFolded(AppUtil.getApp()) ? DisplayUtil.getScreenWidth() - (getResources().getDimensionPixelSize(pli.n) * 2) : ((DisplayUtil.getScreenWidth() - (getResources().getDimensionPixelSize(pli.n) * 2)) - (getResources().getDimensionPixelSize(pli.f) * 2)) / 2;
        this.cardWidth = screenWidth;
        this.cardHeight = (screenWidth * 67) / 100;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.cardHeight);
        layoutParams.height = this.cardHeight;
        layoutParams.topMargin = index * ExtUtilsKt.getDp(Float.valueOf(50.0f));
        viewInflate.setLayoutParams(layoutParams);
        this.layoutView.addView(viewInflate, layoutParams);
        String cardFace = cardInfo.getCardFace();
        Intrinsics.checkNotNullExpressionValue(cardFace, "getCardFace(...)");
        if (cardInfo.isMifare()) {
            String mCardName = cardInfo.mCardName;
            Intrinsics.checkNotNullExpressionValue(mCardName, "mCardName");
            if (TextUtils.isEmpty(cardFace)) {
                cardFace = lxf.b();
            }
            cardImageView.setName(mCardName);
        }
        vqg.d("cardFace cardFace:" + cardFace);
        Intrinsics.checkNotNull(cardImageView);
        ImageLoader imageLoader = Coil.imageLoader(cardImageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(cardImageView.getContext()).data(cardFace).target(cardImageView);
        builderTarget.size(this.cardWidth, this.cardHeight);
        builderTarget.placeholder(cardInfo.isMifare() ? wni.m : wni.n);
        imageLoader.enqueue(builderTarget.build());
        cardImageView.setOnClickListener(new View.OnClickListener() { // from class: xm3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardListView.addCardView$lambda$3(this.f39256a, cardInfo, view);
            }
        });
        cardImageView.setContentDescription(cardInfo.mCardName);
        this.addView.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCardView$lambda$3(CardListView this$0, CardWrapper cardInfo, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cardInfo, "$cardInfo");
        CardListViewListener cardListViewListener = this$0.cardListViewListener;
        if (cardListViewListener != null) {
            cardListViewListener.onCardClicked(cardInfo);
        }
    }

    @NotNull
    public final TextView getAddView() {
        return this.addView;
    }

    public final int getCategory() {
        return this.category;
    }

    @NotNull
    public final CardImageView getEmptyView() {
        return this.emptyView;
    }

    @NotNull
    public final FrameLayout getLayoutView() {
        return this.layoutView;
    }

    @NotNull
    public final View getLineView() {
        return this.lineView;
    }

    @NotNull
    public final TextView getTypeView() {
        return this.typeView;
    }

    public final void init(int cardCategory) {
        this.category = cardCategory;
        if (cardCategory == 0) {
            this.typeView.setText(o0j.Y6);
            this.emptyView.setImageResource(wni.n);
            this.addView.setText(o0j.Z6);
            this.addView.setVisibility(0);
            return;
        }
        if (cardCategory == 1) {
            this.typeView.setText(o0j.d3);
            this.emptyView.setImageResource(wni.m);
            this.addView.setText(o0j.f28617k);
            this.addView.setVisibility(0);
            return;
        }
        if (cardCategory == 2) {
            this.typeView.setText(o0j.D0);
            this.emptyView.setImageResource(wni.m);
            this.addView.setVisibility(8);
        } else {
            if (cardCategory != 3) {
                return;
            }
            this.typeView.setText(o0j.C7);
            this.emptyView.setImageResource(wni.n);
            this.addView.setText(o0j.t);
            this.addView.setVisibility(0);
        }
    }

    public final void setAddView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.addView = textView;
    }

    public final void setCardList(@NotNull List<? extends CardWrapper> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.layoutView.removeAllViews();
        if (list.isEmpty()) {
            this.layoutView.setVisibility(8);
            this.emptyView.setVisibility(0);
        } else {
            this.layoutView.setVisibility(0);
            this.emptyView.setVisibility(8);
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            addCardView((CardWrapper) obj, i);
            i = i2;
        }
        if (this.category == 3) {
            if (list.size() == 1) {
                this.addView.setVisibility(8);
                this.lineView.setVisibility(8);
            } else {
                this.addView.setVisibility(0);
                this.lineView.setVisibility(0);
            }
        }
    }

    public final void setCategory(int i) {
        this.category = i;
    }

    public final void setEmptyView(@NotNull CardImageView cardImageView) {
        Intrinsics.checkNotNullParameter(cardImageView, "<set-?>");
        this.emptyView = cardImageView;
    }

    public final void setLayoutView(@NotNull FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
        this.layoutView = frameLayout;
    }

    public final void setLineView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.lineView = view;
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
    public CardListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(sui.U0, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r4j.A5);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(r4j.D5);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(r4j.C5);
        String string2 = typedArrayObtainStyledAttributes.getString(r4j.B5);
        typedArrayObtainStyledAttributes.recycle();
        this.typeView = (TextView) findViewById(mri.j5);
        this.addView = (TextView) findViewById(mri.c);
        this.emptyView = (CardImageView) findViewById(mri.r1);
        this.layoutView = (FrameLayout) findViewById(mri.u2);
        this.lineView = findViewById(mri.v2);
        this.typeView.setText(string);
        this.addView.setText(string2);
        this.emptyView.setImageDrawable(drawable);
        this.addView.setOnClickListener(new View.OnClickListener() { // from class: ym3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardListView._init_$lambda$0(this.f40316a, view);
            }
        });
    }
}

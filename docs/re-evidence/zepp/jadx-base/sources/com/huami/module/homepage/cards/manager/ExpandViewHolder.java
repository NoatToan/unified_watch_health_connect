package com.huami.module.homepage.cards.manager;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.cards.helper.ExpandHelper;
import com.huami.module.homepage.cards.manager.ExpandViewHolder;
import com.huami.module.homepage.cards.sort.db.CardExpand;
import com.huami.module.homepage.cards.sort.use.CardSortUseCase;
import com.huami.module.ktx.ViewExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001\u000fB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/module/homepage/cards/manager/ExpandViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/module/homepage/cards/helper/ExpandHelper$Expandable;", "Lcom/huami/module/homepage/cards/manager/AdapterItem;", "item", "", "bind", "Landroid/view/View;", "obtainExpandView", "", "isOpen", "", "type", "addAnim", "Landroid/view/ViewGroup;", "a", "Landroid/view/ViewGroup;", ViewHierarchyConstants.VIEW_KEY, "b", "Lcom/huami/module/homepage/cards/manager/AdapterItem;", "Lcom/huami/module/homepage/cards/helper/ExpandHelper$KeepOneHolder;", "c", "Lcom/huami/module/homepage/cards/helper/ExpandHelper$KeepOneHolder;", "keepOne", "Lcom/huami/module/homepage/cards/sort/use/CardSortUseCase;", GoogleApiAvailabilityLight.a, "Lcom/huami/module/homepage/cards/sort/use/CardSortUseCase;", "cardSortUseCase", "e", "Ljava/lang/Boolean;", "<init>", "(Landroid/view/ViewGroup;)V", "f", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class ExpandViewHolder extends RecyclerView.ViewHolder implements ExpandHelper.Expandable {

    @Deprecated
    public static final float ROTATE_ANGLE = 180.0f;

    @NotNull
    private static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ViewGroup view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private AdapterItem item;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ExpandHelper.KeepOneHolder<ExpandViewHolder> keepOne;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CardSortUseCase cardSortUseCase;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Boolean isOpen;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/module/homepage/cards/manager/ExpandViewHolder$a", "", "", "ROTATE_ANGLE", "F", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ExpandViewHolder(@NotNull ViewGroup viewGroup) {
        super(viewGroup);
        this.view = viewGroup;
        this.keepOne = ExpandHelper.INSTANCE.getKeepOneHolder();
        this.cardSortUseCase = new CardSortUseCase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ExpandViewHolder expandViewHolder, String str, AdapterItem adapterItem, View view) {
        expandViewHolder.keepOne.toggle(expandViewHolder, str);
        if (Intrinsics.areEqual(str, CardType.HEALTH_LABEL.name())) {
            return;
        }
        ExpandAdapterKt.a(adapterItem.getCom.unionpay.tsmservice.data.Constant.KEY_CARD_TYPE java.lang.String());
        expandViewHolder.cardSortUseCase.updateCardExpand(new CardExpand(str, ExpandHelper.INSTANCE.isExpand(str)));
    }

    @Override // com.huami.module.homepage.cards.helper.ExpandHelper.Expandable
    public void addAnim(boolean isOpen, @NotNull String type) {
        View rotateView;
        CardType cardType;
        if (Intrinsics.areEqual(this.isOpen, Boolean.valueOf(isOpen))) {
            AdapterItem adapterItem = this.item;
            String strName = null;
            if (adapterItem != null && (cardType = adapterItem.getCom.unionpay.tsmservice.data.Constant.KEY_CARD_TYPE java.lang.String()) != null) {
                strName = cardType.name();
            }
            if (Intrinsics.areEqual(type, strName)) {
                return;
            }
        }
        this.isOpen = Boolean.valueOf(isOpen);
        AdapterItem adapterItem2 = this.item;
        if (adapterItem2 == null || (rotateView = adapterItem2.getRotateView()) == null) {
            return;
        }
        if (isOpen) {
            ExpandHelper.INSTANCE.rotateExpandWidget(rotateView, 0.0f, 180.0f);
        } else {
            ExpandHelper.INSTANCE.rotateExpandWidget(rotateView, 180.0f, 0.0f);
        }
    }

    public final void bind(@NotNull final AdapterItem item) {
        if (item.getCom.unionpay.tsmservice.data.Constant.KEY_CARD_TYPE java.lang.String() == CardType.STAR_SKY) {
            ViewExtKt.setViewBackgroundTint(this.view, ColorStateList.valueOf(-16777216));
        } else {
            ViewExtKt.setViewBackgroundTint(this.view, (ColorStateList) null);
        }
        this.item = item;
        this.view.removeAllViews();
        ViewParent parent = item.getRootView().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(item.getRootView());
        }
        ViewGroup viewGroup2 = this.view;
        View rootView = item.getRootView();
        rootView.setBackgroundColor(0);
        Unit unit = Unit.INSTANCE;
        viewGroup2.addView(rootView, new FrameLayout.LayoutParams(-1, -2));
        final String strName = item.getCom.unionpay.tsmservice.data.Constant.KEY_CARD_TYPE java.lang.String().name();
        this.keepOne.bind(this, strName);
        View foldButton = item.getFoldButton();
        if (foldButton == null) {
            return;
        }
        foldButton.setOnClickListener(new View.OnClickListener() { // from class: dx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExpandViewHolder.b(this.a, strName, item, view);
            }
        });
    }

    @Override // com.huami.module.homepage.cards.helper.ExpandHelper.Expandable
    @Nullable
    public View obtainExpandView() {
        AdapterItem adapterItem = this.item;
        if (adapterItem == null) {
            return null;
        }
        return adapterItem.getExpandableView();
    }
}

package com.huami.module.homepage.cards.manager;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.koin.ScopesAndQualifersKt;
import com.huami.tools.analytics.DbUtils;
import com.unionpay.tsmservice.data.Constant;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u0012\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0016\u001a\u00020\u000f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00178\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001e\u0010\"\u001a\u0004\u0018\u00010\u00178\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001c\u0010(\u001a\u00020#8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/huami/module/homepage/cards/manager/SmallToolItem;", "Lcom/huami/module/homepage/cards/manager/AdapterItem;", "", "bindData", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/fragment/app/Fragment;", "b", "Lkotlin/Lazy;", "()Landroidx/fragment/app/Fragment;", "fragment", "Landroid/widget/FrameLayout;", "c", "()Landroid/widget/FrameLayout;", "container", GoogleApiAvailabilityLight.a, "Landroid/widget/FrameLayout;", "getRootView", "rootView", "Landroid/view/View;", "e", "Landroid/view/View;", "getExpandableView", "()Landroid/view/View;", "expandableView", "f", "getFoldButton", "foldButton", "g", "getRotateView", "rotateView", "Lcom/huami/module/homepage/cards/manager/CardType;", "h", "Lcom/huami/module/homepage/cards/manager/CardType;", "getCardType", "()Lcom/huami/module/homepage/cards/manager/CardType;", Constant.KEY_CARD_TYPE, "<init>", "(Landroid/content/Context;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class SmallToolItem implements AdapterItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final View expandableView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final View foldButton;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final View rotateView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy fragment = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy container = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final FrameLayout rootView = a();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final CardType cardType = CardType.MINE_TOOL;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/FrameLayout;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<FrameLayout> {

        /* JADX INFO: renamed from: com.huami.module.homepage.cards.manager.SmallToolItem$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0488a extends Lambda implements Function0<ParametersHolder> {
            public final /* synthetic */ SmallToolItem a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0488a(SmallToolItem smallToolItem) {
                super(0);
                this.a = smallToolItem;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ParametersHolder invoke() {
                return ParametersHolderKt.parametersOf(this.a.getContext());
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FrameLayout invoke() {
            return (FrameLayout) ScopesAndQualifersKt.homePageScope(ScopesAndQualifersKt.getKoin()).get(Reflection.getOrCreateKotlinClass(FrameLayout.class), null, new C0488a(SmallToolItem.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Fragment> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Fragment invoke() {
            return (Fragment) ScopesAndQualifersKt.homePageScope(ScopesAndQualifersKt.getKoin()).get(Reflection.getOrCreateKotlinClass(Fragment.class), null, null);
        }
    }

    public SmallToolItem(@NotNull Context context) {
        this.context = context;
    }

    private final FrameLayout a() {
        return (FrameLayout) this.container.getValue();
    }

    private final Fragment b() {
        return (Fragment) this.fragment.getValue();
    }

    @Override // com.huami.module.homepage.cards.manager.AdapterItem
    public void bindData() {
        if (Intrinsics.areEqual(a().getTag(), Boolean.FALSE)) {
            ((FragmentActivity) this.context).getSupportFragmentManager().beginTransaction().add(a().getId(), b()).commitAllowingStateLoss();
            a().setTag(Boolean.TRUE);
        }
    }

    @Override // com.huami.module.homepage.cards.manager.AdapterItem
    @NotNull
    public CardType getCardType() {
        return this.cardType;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.huami.module.homepage.cards.manager.AdapterItem
    @Nullable
    public View getExpandableView() {
        return this.expandableView;
    }

    @Override // com.huami.module.homepage.cards.manager.AdapterItem
    @Nullable
    public View getFoldButton() {
        return this.foldButton;
    }

    @Override // com.huami.module.homepage.cards.manager.AdapterItem
    @Nullable
    public View getRotateView() {
        return this.rotateView;
    }

    @Override // com.huami.module.homepage.cards.manager.AdapterItem
    @NotNull
    public FrameLayout getRootView() {
        return this.rootView;
    }
}

package com.huami.wallet.accessdoor.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.activity.AccessCardDetailActivity;
import com.huami.wallet.accessdoor.adapter.AccessDoorListAdapter;
import com.huami.wallet.accessdoor.api.FunctionsConfig;
import com.huami.wallet.accessdoor.databinding.FragmentAccessDoorListBinding;
import com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog;
import com.huami.wallet.accessdoor.entity.DoorInfoAndDefaultCard;
import com.huami.wallet.accessdoor.fragment.AccessDoorListFragment;
import com.huami.wallet.accessdoor.helper.IconToastHelper;
import com.huami.wallet.accessdoor.helper.LiveDataExtensionKt;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.helper.Status;
import com.huami.wallet.accessdoor.utils.ImageUtils;
import com.huami.wallet.accessdoor.viewmodel.AccessDoorListViewModel;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.loopeer.cardstack.CardStackView;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0006\u0010\u0019\u001a\u00020\u000fR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010-R\u001d\u00102\u001a\u00020/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00104¨\u00068"}, d2 = {"Lcom/huami/wallet/accessdoor/fragment/AccessDoorListFragment;", "Landroidx/fragment/app/Fragment;", "", z.j, "", "Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", HealthLabelAnalyticsKt.TAG_HOME_LABEL_COUNT, GoogleApiAvailabilityLight.b, "i", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "protocolEntity", "h", "c", "m", "initViews", "", "value", GoogleApiAvailabilityLight.a, "onResume", "onPause", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "getAccessDoorCardListSize", "Lcom/huami/wallet/accessdoor/fragment/AccessDoorListFragment$a;", "a", "Lcom/huami/wallet/accessdoor/fragment/AccessDoorListFragment$a;", "mViewHolder", "Lcom/huami/wallet/accessdoor/adapter/AccessDoorListAdapter;", "b", "Lcom/huami/wallet/accessdoor/adapter/AccessDoorListAdapter;", "mAdapter", "Lcom/huami/wallet/accessdoor/databinding/FragmentAccessDoorListBinding;", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "e", "()Lcom/huami/wallet/accessdoor/databinding/FragmentAccessDoorListBinding;", "binding", "Lcom/huami/wallet/accessdoor/viewmodel/AccessDoorListViewModel;", "Lkotlin/Lazy;", "g", "()Lcom/huami/wallet/accessdoor/viewmodel/AccessDoorListViewModel;", "mViewModel", "", "Z", "mIsNeedLoadList", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "f", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Lcom/huami/wallet/accessdoor/dialog/AccessDoorUserPrivacyDialog;", "Lcom/huami/wallet/accessdoor/dialog/AccessDoorUserPrivacyDialog;", "mAccessDoorUserPrivacyDialog", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class AccessDoorListFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private a mViewHolder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private AccessDoorListAdapter mAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean mIsNeedLoadList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy mLoadingDialog;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private AccessDoorUserPrivacyDialog mAccessDoorUserPrivacyDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u0003\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"com/huami/wallet/accessdoor/fragment/AccessDoorListFragment$a", "", "Lcom/loopeer/cardstack/CardStackView;", "a", "Lcom/loopeer/cardstack/CardStackView;", "c", "()Lcom/loopeer/cardstack/CardStackView;", "h", "(Lcom/loopeer/cardstack/CardStackView;)V", "cardStack", "Landroid/widget/LinearLayout;", "b", "Landroid/widget/LinearLayout;", GoogleApiAvailabilityLight.a, "()Landroid/widget/LinearLayout;", "i", "(Landroid/widget/LinearLayout;)V", "llCardInUse", "e", z.j, "llCardNoUse", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "g", "(Landroid/widget/TextView;)V", "cardName", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "f", "(Landroid/widget/ImageView;)V", "cardImageDefault", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "access-door_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private CardStackView cardStack;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private LinearLayout llCardInUse;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private LinearLayout llCardNoUse;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private TextView cardName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private ImageView cardImageDefault;

        public a(@NotNull View view) {
            this.cardStack = (CardStackView) view.findViewById(R.id.card_stack);
            this.llCardInUse = (LinearLayout) view.findViewById(R.id.card_in_use);
            this.llCardNoUse = (LinearLayout) view.findViewById(R.id.cards_no_use);
            this.cardName = (TextView) view.findViewById(R.id.tv_card_name);
            this.cardImageDefault = (ImageView) view.findViewById(R.id.card_image_default);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ImageView getCardImageDefault() {
            return this.cardImageDefault;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getCardName() {
            return this.cardName;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final CardStackView getCardStack() {
            return this.cardStack;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final LinearLayout getLlCardInUse() {
            return this.llCardInUse;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final LinearLayout getLlCardNoUse() {
            return this.llCardNoUse;
        }

        public final void f(@NotNull ImageView imageView) {
            this.cardImageDefault = imageView;
        }

        public final void g(@NotNull TextView textView) {
            this.cardName = textView;
        }

        public final void h(@NotNull CardStackView cardStackView) {
            this.cardStack = cardStackView;
        }

        public final void i(@NotNull LinearLayout linearLayout) {
            this.llCardInUse = linearLayout;
        }

        public final void j(@NotNull LinearLayout linearLayout) {
            this.llCardNoUse = linearLayout;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Resource<String>, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            if (resource.isSuccessful()) {
                if (AccessDoorListFragment.this.mAccessDoorUserPrivacyDialog == null || !AccessDoorListFragment.this.mAccessDoorUserPrivacyDialog.isShowing()) {
                    return;
                }
                AccessDoorListFragment.this.mAccessDoorUserPrivacyDialog.dismiss();
                return;
            }
            if (TextUtils.equals(resource.code, PayResponse.CODE_NETWORK_ERROR)) {
                IconToastHelper.showOrError(AccessDoorListFragment.this.requireContext(), AccessDoorListFragment.this.getResources().getString(R.string.access_no_network), resource);
            } else {
                IconToastHelper.showOrError(AccessDoorListFragment.this.requireContext(), AccessDoorListFragment.this.getResources().getString(R.string.access_access_door_loading_failure), resource);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Resource<List<? extends DoorInfoAndDefaultCard>>, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull Resource<List<DoorInfoAndDefaultCard>> resource) {
            if (!resource.isSuccessful()) {
                if (Intrinsics.areEqual(resource.code, PayResponse.CODE_NETWORK_ERROR)) {
                    IconToastHelper.showOrError(AccessDoorListFragment.this.requireContext(), AccessDoorListFragment.this.getResources().getString(R.string.access_no_network), resource);
                    return;
                } else {
                    IconToastHelper.showOrError(AccessDoorListFragment.this.requireContext(), AccessDoorListFragment.this.getResources().getString(R.string.access_access_door_loading_failure), resource);
                    AccessDoorListFragment.this.requireActivity().finish();
                    return;
                }
            }
            List<DoorInfoAndDefaultCard> list = resource.data;
            if (list != null) {
                if (!list.isEmpty()) {
                    a aVar = AccessDoorListFragment.this.mViewHolder;
                    Objects.requireNonNull(aVar);
                    aVar.getCardStack().setClickEnable(list.size() > 1);
                    return;
                }
            }
            IconToast.showError(AccessDoorListFragment.this.requireContext(), AccessDoorListFragment.this.getResources().getString(R.string.access_door_card_list_success));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<List<? extends DoorInfoAndDefaultCard>> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<DoorInfoAndDefaultCard, Unit> {
        public d() {
            super(1);
        }

        public final void a(DoorInfoAndDefaultCard doorInfoAndDefaultCard) {
            if (doorInfoAndDefaultCard == null) {
                a aVar = AccessDoorListFragment.this.mViewHolder;
                Objects.requireNonNull(aVar);
                aVar.getLlCardInUse().setVisibility(8);
            } else if (doorInfoAndDefaultCard.getIdDefaultCard()) {
                a aVar2 = AccessDoorListFragment.this.mViewHolder;
                Objects.requireNonNull(aVar2);
                aVar2.getLlCardInUse().setVisibility(0);
                DoorInfoAndDefaultCard value = AccessDoorListFragment.this.g().getDefaultCardIdLiveData().getValue();
                DoorCardInfo doorCardInfo = value == null ? null : value.getDoorCardInfo();
                a aVar3 = AccessDoorListFragment.this.mViewHolder;
                Objects.requireNonNull(aVar3);
                aVar3.getCardName().setText(doorCardInfo == null ? null : doorCardInfo.getName());
                a aVar4 = AccessDoorListFragment.this.mViewHolder;
                Objects.requireNonNull(aVar4);
                ImageUtils.loadImage(aVar4.getCardImageDefault(), doorCardInfo != null ? doorCardInfo.getCardArt() : null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DoorInfoAndDefaultCard doorInfoAndDefaultCard) {
            a(doorInfoAndDefaultCard);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Boolean, Unit> {
        public e() {
            super(1);
        }

        public final void a(Boolean bool) {
            if (bool.booleanValue()) {
                AccessDoorListFragment.this.m();
            } else {
                AccessDoorListFragment.this.c();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<List<? extends DoorInfoAndDefaultCard>, Unit> {
        public f() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(AccessDoorListFragment accessDoorListFragment, List list) {
            accessDoorListFragment.n(list);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends DoorInfoAndDefaultCard> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(final List<? extends DoorInfoAndDefaultCard> list) {
            int size = list.size();
            Resource<List<DoorInfoAndDefaultCard>> value = AccessDoorListFragment.this.g().getGetAccessDoorCardListLiveData().getValue();
            List<DoorInfoAndDefaultCard> list2 = value == null ? null : value.data;
            if (list2 != null && size == list2.size()) {
                a aVar = AccessDoorListFragment.this.mViewHolder;
                Objects.requireNonNull(aVar);
                aVar.getLlCardInUse().setVisibility(8);
                a aVar2 = AccessDoorListFragment.this.mViewHolder;
                Objects.requireNonNull(aVar2);
                aVar2.getLlCardNoUse().setVisibility(0);
            } else if (list.isEmpty()) {
                a aVar3 = AccessDoorListFragment.this.mViewHolder;
                Objects.requireNonNull(aVar3);
                aVar3.getLlCardNoUse().setVisibility(8);
            } else {
                a aVar4 = AccessDoorListFragment.this.mViewHolder;
                Objects.requireNonNull(aVar4);
                aVar4.getLlCardNoUse().setVisibility(0);
            }
            LinearLayout root = AccessDoorListFragment.this.e().getRoot();
            final AccessDoorListFragment accessDoorListFragment = AccessDoorListFragment.this;
            root.post(new Runnable() { // from class: com.huami.wallet.accessdoor.fragment.b
                @Override // java.lang.Runnable
                public final void run() {
                    AccessDoorListFragment.f.b(accessDoorListFragment, list);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<LoadingDialog> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog getA() {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(AccessDoorListFragment.this.getActivity(), AccessDoorListFragment.this.getResources().getString(R.string.access_access_door_loading));
            loadingDialogShowDialog.setCancelable(false);
            return loadingDialogShowDialog;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AccessDoorListFragment.class), "binding", "getBinding()Lcom/huami/wallet/accessdoor/databinding/FragmentAccessDoorListBinding;"));
        h = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccessDoorListFragment() {
        super(R.layout.fragment_access_door_list);
        this.binding = FragmentViewBindingKt.viewBinding(new AccessDoorListFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentAccessDoorListBinding.class)));
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.accessdoor.fragment.AccessDoorListFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<AccessDoorListViewModel>() { // from class: com.huami.wallet.accessdoor.fragment.AccessDoorListFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.accessdoor.viewmodel.AccessDoorListViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AccessDoorListViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(AccessDoorListViewModel.class), function0, objArr);
            }
        });
        this.mLoadingDialog = LazyKt__LazyJVMKt.lazy(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        if (f().isShowing()) {
            f().dismiss();
        }
    }

    private final int d(int value) {
        return (int) ((value * getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentAccessDoorListBinding e() {
        return (FragmentAccessDoorListBinding) this.binding.getValue(this, h[0]);
    }

    private final LoadingDialog f() {
        return (LoadingDialog) this.mLoadingDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccessDoorListViewModel g() {
        return (AccessDoorListViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(ProtocolEntity protocolEntity) {
        AccessDoorUserPrivacyDialog accessDoorUserPrivacyDialog = AccessDoorUserPrivacyDialog.getInstance(protocolEntity);
        this.mAccessDoorUserPrivacyDialog = accessDoorUserPrivacyDialog;
        accessDoorUserPrivacyDialog.setOnClickButton(new AccessDoorUserPrivacyDialog.OnClickButton() { // from class: com.huami.wallet.accessdoor.fragment.AccessDoorListFragment$initDialog$1
            @Override // com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog.OnClickButton
            public void clickNegation() {
                this.a.mAccessDoorUserPrivacyDialog.dismiss();
            }

            @Override // com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog.OnClickButton
            public void clickPosition(@Nullable Long id) throws Exception {
                this.a.g().userAgreementProtocol(id);
            }

            @Override // com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog.OnClickButton
            public void clickUserPrivacy(@Nullable String protocol) {
                if (protocol == null) {
                    return;
                }
                FunctionsConfig.getOpenWebUrl().invoke(protocol);
            }
        });
        this.mAccessDoorUserPrivacyDialog.show(getChildFragmentManager(), "AccessCardDetailFragment");
    }

    private final void i() {
        LiveDataExtensionKt.observeWithNotNull(g().getGetProtocolEntityLiveData(), this, new Function1<Resource<ProtocolEntity>, Unit>() { // from class: com.huami.wallet.accessdoor.fragment.AccessDoorListFragment$initUserProtocolObserver$1

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Status.values().length];
                    iArr[Status.SUCCESS.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            public final void a(Resource<ProtocolEntity> resource) {
                ProtocolEntity protocolEntity;
                if (WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()] != 1 || (protocolEntity = resource.data) == null) {
                    return;
                }
                this.a.h(protocolEntity);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<ProtocolEntity> resource) {
                a(resource);
                return Unit.INSTANCE;
            }
        });
        LiveDataExtensionKt.observeResourceWithCompleted(g().getUserAgreementProtocolLiveData(), this, new b());
    }

    private final void initViews() {
        a aVar = this.mViewHolder;
        Objects.requireNonNull(aVar);
        CardStackView cardStack = aVar.getCardStack();
        cardStack.setOverlapGaps(d(80));
        cardStack.setOverlapGapsCollapse(d(25));
        cardStack.setNumBottomShow(5);
        AccessDoorListAdapter accessDoorListAdapter = new AccessDoorListAdapter(getContext());
        this.mAdapter = accessDoorListAdapter;
        Objects.requireNonNull(accessDoorListAdapter);
        cardStack.setAdapter(accessDoorListAdapter);
        AccessDoorListAdapter accessDoorListAdapter2 = this.mAdapter;
        Objects.requireNonNull(accessDoorListAdapter2);
        accessDoorListAdapter2.setOnItemClick(new AccessDoorListAdapter.OnItemClick() { // from class: x0
            @Override // com.huami.wallet.accessdoor.adapter.AccessDoorListAdapter.OnItemClick
            public final void onItemClick(int i, DoorInfoAndDefaultCard doorInfoAndDefaultCard) {
                AccessDoorListFragment.k(this.a, i, doorInfoAndDefaultCard);
            }
        });
        a aVar2 = this.mViewHolder;
        Objects.requireNonNull(aVar2);
        aVar2.getCardImageDefault().setOnClickListener(new View.OnClickListener() { // from class: w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccessDoorListFragment.l(this.a, view);
            }
        });
    }

    private final void j() {
        if (getActivity() == null) {
            return;
        }
        LiveDataExtensionKt.observeResourceWithCompleted(g().getGetAccessDoorCardListLiveData(), this, new c());
        LiveDataExtensionKt.observeWithNotNull(g().getDefaultCardIdLiveData(), this, new d());
        LiveDataExtensionKt.observeWithNotNull(g().getLoadingDialogStatusLiveData(), this, new e());
        LiveDataExtensionKt.observeWithNotNull(g().getNotDefaultCardIdLiveData(), this, new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(AccessDoorListFragment accessDoorListFragment, int i, DoorInfoAndDefaultCard doorInfoAndDefaultCard) {
        AccessCardDetailActivity.INSTANCE.open(accessDoorListFragment.requireContext(), doorInfoAndDefaultCard, accessDoorListFragment.getAccessDoorCardListSize(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(AccessDoorListFragment accessDoorListFragment, View view) {
        AccessCardDetailActivity.INSTANCE.open(accessDoorListFragment.requireContext(), accessDoorListFragment.g().getDefaultCardIdLiveData().getValue(), accessDoorListFragment.getAccessDoorCardListSize(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        if (f().isShowing()) {
            return;
        }
        f().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(List<? extends DoorInfoAndDefaultCard> cards) {
        if (!cards.isEmpty()) {
            AccessDoorListAdapter accessDoorListAdapter = this.mAdapter;
            Objects.requireNonNull(accessDoorListAdapter);
            accessDoorListAdapter.updateData(cards);
            int size = cards.size();
            float measuredWidth = e().cardStack.getMeasuredWidth() / 1.5804878f;
            e().cardStack.getLayoutParams().height = ((int) (measuredWidth + (((size - 1) * measuredWidth) / 4.0f))) + 10;
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final int getAccessDoorCardListSize() {
        Resource<List<DoorInfoAndDefaultCard>> value = g().getGetAccessDoorCardListLiveData().getValue();
        return (value == null ? null : value.data).size();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mIsNeedLoadList = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() throws Exception {
        super.onResume();
        if (this.mIsNeedLoadList) {
            g().getCardListAndDefault(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.mViewHolder = new a(view);
        initViews();
        j();
        i();
    }
}

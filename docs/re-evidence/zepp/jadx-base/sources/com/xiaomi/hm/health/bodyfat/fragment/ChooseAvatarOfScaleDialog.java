package com.xiaomi.hm.health.bodyfat.fragment;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.OnBackPressedCallback;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.adapter.BaseRecyclerAdapter;
import com.xiaomi.hm.health.bodyfat.adapter.MyViewHolder;
import com.xiaomi.hm.health.bodyfat.databinding.DialogChooseAvatarOfScaleBinding;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseAvatarOfScaleDialog;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.SystemBarTintSupport;
import com.xiaomi.hm.health.bodyfat.viewmodel.SettingOfScaleViewModel;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u001f B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000b\u001a\u00020\tH\u0014J\b\u0010\f\u001a\u00020\tH\u0014J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseAvatarOfScaleDialog;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "", "e", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", Constant.PAI_KEY_DAILY_PAI, "dp2px", "", "hasPadding", "isWidePadding", "hasBackground", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "initView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/bodyfat/databinding/DialogChooseAvatarOfScaleBinding;", "Lcom/xiaomi/hm/health/bodyfat/databinding/DialogChooseAvatarOfScaleBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "f", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "viewModel", "<init>", "()V", "a", "AvatarInfo", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class ChooseAvatarOfScaleDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private DialogChooseAvatarOfScaleBinding binding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new b());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseAvatarOfScaleDialog$AvatarInfo;", "", "", "component1", "component2", "resId", "value", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getResId", "()I", "b", "getValue", "<init>", "(II)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class AvatarInfo {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int resId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int value;

        public AvatarInfo(int i, int i2) {
            this.resId = i;
            this.value = i2;
        }

        public static /* synthetic */ AvatarInfo copy$default(AvatarInfo avatarInfo, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = avatarInfo.resId;
            }
            if ((i3 & 2) != 0) {
                i2 = avatarInfo.value;
            }
            return avatarInfo.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getResId() {
            return this.resId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @NotNull
        public final AvatarInfo copy(int resId, int value) {
            return new AvatarInfo(resId, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AvatarInfo)) {
                return false;
            }
            AvatarInfo avatarInfo = (AvatarInfo) other;
            return this.resId == avatarInfo.resId && this.value == avatarInfo.value;
        }

        public final int getResId() {
            return this.resId;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.resId * 31) + this.value;
        }

        @NotNull
        public String toString() {
            return "AvatarInfo(resId=" + this.resId + ", value=" + this.value + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J$\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0010"}, d2 = {"com/xiaomi/hm/health/bodyfat/fragment/ChooseAvatarOfScaleDialog$a", "Lcom/xiaomi/hm/health/bodyfat/adapter/BaseRecyclerAdapter;", "Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseAvatarOfScaleDialog$AvatarInfo;", "Lcom/xiaomi/hm/health/bodyfat/adapter/MyViewHolder;", "holder", "item", "", "position", "", "a", "Landroid/view/View;", "itemView", "b", "layoutResId", "<init>", "(Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseAvatarOfScaleDialog;I)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public final class a extends BaseRecyclerAdapter<AvatarInfo> {
        public a(int i) {
            super(i);
        }

        @Override // com.xiaomi.hm.health.bodyfat.adapter.BaseRecyclerAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull MyViewHolder holder, @NotNull AvatarInfo item, int position) {
            ((ImageView) holder.getView(R.id.iv_avatar)).setImageResource(item.getResId());
        }

        @Override // com.xiaomi.hm.health.bodyfat.adapter.BaseRecyclerAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onItemClicked(@Nullable View itemView, int position, @Nullable AvatarInfo item) {
            super.onItemClicked(itemView, position, item);
            ChooseAvatarOfScaleDialog.this.getViewModel().getChooseAvatarId().setValue(item);
            ChooseAvatarOfScaleDialog.this.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SettingOfScaleViewModel> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SettingOfScaleViewModel getA() {
            return (SettingOfScaleViewModel) ViewModelProviders.of(ChooseAvatarOfScaleDialog.this.requireActivity()).get(SettingOfScaleViewModel.class);
        }
    }

    private final float dp2px(Context context, float dp) {
        return TypedValue.applyDimension(1, dp, context.getResources().getDisplayMetrics());
    }

    private final void e() {
        DialogChooseAvatarOfScaleBinding dialogChooseAvatarOfScaleBinding = this.binding;
        Objects.requireNonNull(dialogChooseAvatarOfScaleBinding);
        dialogChooseAvatarOfScaleBinding.btnCancel.setOnClickListener(new View.OnClickListener() { // from class: eo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseAvatarOfScaleDialog.f(this.a, view);
            }
        });
        final int i = 3;
        DialogChooseAvatarOfScaleBinding dialogChooseAvatarOfScaleBinding2 = this.binding;
        Objects.requireNonNull(dialogChooseAvatarOfScaleBinding2);
        dialogChooseAvatarOfScaleBinding2.listAvatar.setLayoutManager(new GridLayoutManager(getContext(), 3));
        final int screenWidth = (int) ((ViewUtils.getScreenWidth(requireActivity()) - dp2px(requireActivity(), 262.0f)) / 6);
        DialogChooseAvatarOfScaleBinding dialogChooseAvatarOfScaleBinding3 = this.binding;
        Objects.requireNonNull(dialogChooseAvatarOfScaleBinding3);
        dialogChooseAvatarOfScaleBinding3.listAvatar.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.xiaomi.hm.health.bodyfat.fragment.ChooseAvatarOfScaleDialog$initListView$2
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
                Integer numValueOf = layoutManager == null ? null : Integer.valueOf(layoutManager.getPosition(view));
                outRect.set(screenWidth * (numValueOf != null ? Integer.valueOf(numValueOf.intValue() % i) : null).intValue(), 0, 0, 0);
            }
        });
        final a aVar = new a(R.layout.bodyfat_item_avatar);
        DialogChooseAvatarOfScaleBinding dialogChooseAvatarOfScaleBinding4 = this.binding;
        Objects.requireNonNull(dialogChooseAvatarOfScaleBinding4);
        dialogChooseAvatarOfScaleBinding4.listAvatar.setAdapter(aVar);
        getViewModel().getAvatarList().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.bodyfat.fragment.b
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ChooseAvatarOfScaleDialog.g(aVar, (List) obj);
            }
        });
        getViewModel().getAvatarList(requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ChooseAvatarOfScaleDialog chooseAvatarOfScaleDialog, View view) {
        chooseAvatarOfScaleDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(a aVar, List list) {
        aVar.update(list);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final SettingOfScaleViewModel getViewModel() {
        return (SettingOfScaleViewModel) this.viewModel.getValue();
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return !BFCallback.getInstance().enableMiDongFlavor();
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        DialogChooseAvatarOfScaleBinding dialogChooseAvatarOfScaleBindingInflate = DialogChooseAvatarOfScaleBinding.inflate(getLayoutInflater());
        this.binding = dialogChooseAvatarOfScaleBindingInflate;
        Objects.requireNonNull(dialogChooseAvatarOfScaleBindingInflate);
        return dialogChooseAvatarOfScaleBindingInflate.getRoot();
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: isWidePadding */
    public boolean getIsMiDong() {
        return BFCallback.getInstance().enableMiDongFlavor();
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = R.style.DimPanel;
        if (SystemBarTintSupport.isSupport(getActivity())) {
            i = R.style.DimPanelTint;
        }
        setStyle(0, i);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        e();
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new OnBackPressedCallback() { // from class: com.xiaomi.hm.health.bodyfat.fragment.ChooseAvatarOfScaleDialog.onViewCreated.1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                ChooseAvatarOfScaleDialog.this.dismiss();
            }
        });
    }
}

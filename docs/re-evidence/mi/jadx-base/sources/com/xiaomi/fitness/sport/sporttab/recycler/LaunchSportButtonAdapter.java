package com.xiaomi.fitness.sport.sporttab.recycler;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.mi.health.search.SearchContract;
import com.xiaomi.eco.api.EcoScalePreference;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductManager;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.bean.RNDevice;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.sport.eco.export.EcoSportManager;
import com.xiaomi.fitness.sport.eco.export.EcoSportManagerExtKt;
import com.xiaomi.fitness.sport.sporttab.recycler.LaunchSportButtonAdapter;
import com.xiaomi.fitness.sport.sporttab.util.SportTabOneTrackExtKt;
import com.xiaomi.fitness.sport.utils.SportUtilsExtKt;
import com.xiaomi.fitness.sport.view.launch.LaunchSportActivity;
import com.xiaomi.fitness.sport.view.launch.LaunchSportModel;
import com.xiaomi.fitness.sport_eco_manager_export.SportConstants;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.clb;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.xri;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003'&(B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/LaunchSportButtonAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "fillModelList", "()V", "Landroid/content/Context;", "context", "launchToRopeSkipping", "(Landroid/content/Context;)V", "", "itemWidth", "bindData", "(I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "", "Lcom/xiaomi/fitness/sport/sporttab/recycler/LaunchSportButtonAdapter$UiModel;", "mModelList", "Ljava/util/List;", "mItemWidth", "I", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "Companion", "UiModel", "LaunchEntranceItemViewHolder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLaunchSportButtonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchSportButtonAdapter.kt\ncom/xiaomi/fitness/sport/sporttab/recycler/LaunchSportButtonAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n774#2:226\n865#2,2:227\n1062#2:229\n*S KotlinDebug\n*F\n+ 1 LaunchSportButtonAdapter.kt\ncom/xiaomi/fitness/sport/sporttab/recycler/LaunchSportButtonAdapter\n*L\n167#1:226\n167#1:227,2\n168#1:229\n*E\n"})
public final class LaunchSportButtonAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "LaunchSportButtonAdapter";

    @NotNull
    private final FragmentActivity fragmentActivity;
    private int mItemWidth;

    @NotNull
    private final List<UiModel> mModelList;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/LaunchSportButtonAdapter$LaunchEntranceItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", DailyRecordKey.sportType, "Landroid/content/Context;", "context", "", "setClickCallback", "(ILandroid/content/Context;)V", "Lcom/xiaomi/fitness/sport/sporttab/recycler/LaunchSportButtonAdapter$UiModel;", "model", "bindData", "(Lcom/xiaomi/fitness/sport/sporttab/recycler/LaunchSportButtonAdapter$UiModel;)V", "Landroid/view/View;", "itemView", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "Landroid/widget/TextView;", "sportNameTv", "Landroid/widget/TextView;", "Landroidx/appcompat/widget/AppCompatImageView;", "sportIconIv", "Landroidx/appcompat/widget/AppCompatImageView;", "<init>", "(Lcom/xiaomi/fitness/sport/sporttab/recycler/LaunchSportButtonAdapter;Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nLaunchSportButtonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchSportButtonAdapter.kt\ncom/xiaomi/fitness/sport/sporttab/recycler/LaunchSportButtonAdapter$LaunchEntranceItemViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,225:1\n54#2,3:226\n24#2:229\n57#2,6:230\n63#2,2:237\n57#3:236\n*S KotlinDebug\n*F\n+ 1 LaunchSportButtonAdapter.kt\ncom/xiaomi/fitness/sport/sporttab/recycler/LaunchSportButtonAdapter$LaunchEntranceItemViewHolder\n*L\n104#1:226,3\n104#1:229\n104#1:230,6\n104#1:237,2\n104#1:236\n*E\n"})
    public final class LaunchEntranceItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final View itemView;

        @NotNull
        private final AppCompatImageView sportIconIv;

        @NotNull
        private final TextView sportNameTv;
        final /* synthetic */ LaunchSportButtonAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchEntranceItemViewHolder(@NotNull LaunchSportButtonAdapter launchSportButtonAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = launchSportButtonAdapter;
            this.itemView = itemView;
            View viewFindViewById = itemView.findViewById(xri.K6);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.sportNameTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(xri.A6);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.sportIconIv = (AppCompatImageView) viewFindViewById2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$0(Context context, LaunchEntranceItemViewHolder this$0, UiModel model, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(model, "$model");
            Intrinsics.checkNotNullParameter(it, "it");
            clb.a(context);
            int sportType = model.getSportType();
            Intrinsics.checkNotNull(context);
            this$0.setClickCallback(sportType, context);
            SportTabOneTrackExtKt.oneTrackOnLaunchSportEntranceClick(model.getSportType());
            return Unit.INSTANCE;
        }

        private final void setClickCallback(int sportType, Context context) {
            if (sportType == 1 || sportType == 2 || sportType == 3 || sportType == 6) {
                if (!SportUtilsExtKt.perfectInfo(this.this$0.getFragmentActivity()) || new LaunchSportModel().isShowCtaDialog(context)) {
                    return;
                }
                Intent intent = new Intent(context, (Class<?>) LaunchSportActivity.class);
                intent.putExtra("KEY_SPORT_TYPE", sportType);
                intent.putExtra("type", String.valueOf(sportType));
                context.startActivity(intent);
                return;
            }
            if (sportType == 14) {
                if (!SportUtilsExtKt.perfectInfo(this.this$0.getFragmentActivity()) || new LaunchSportModel().isShowCtaDialog(context)) {
                    return;
                }
                this.this$0.launchToRopeSkipping(context);
                return;
            }
            if (sportType == 324 && SportUtilsExtKt.perfectInfo(this.this$0.getFragmentActivity()) && !new LaunchSportModel().isShowCtaDialog(context)) {
                SportManagerExportPreference.INSTANCE.setKEY_GYM_LOCAL_SPORT_TYPE("yesoul.exbike.jsc01y");
                EcoSportManagerExtKt.getINSTANCE(EcoSportManager.INSTANCE).goToGymLaunchSportActivity(context, null);
            }
        }

        public final void bindData(@NotNull final UiModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            AppCompatImageView appCompatImageView = this.sportIconIv;
            Coil.imageLoader(appCompatImageView.getContext()).enqueue(new ImageRequest.Builder(appCompatImageView.getContext()).data(Integer.valueOf(model.getIconResId())).target(appCompatImageView).build());
            this.sportNameTv.setText(SportUtilsExtKt.getSportTypeStr(model.getSportType()));
            final Context context = this.itemView.getContext();
            ViewExtKt.clickWithTrigger$default(this.itemView, 0L, new Function1() { // from class: p3e
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LaunchSportButtonAdapter.LaunchEntranceItemViewHolder.bindData$lambda$0(context, this, model, (View) obj);
                }
            }, 1, null);
        }

        @NotNull
        public final View getItemView() {
            return this.itemView;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/LaunchSportButtonAdapter$UiModel;", "", DailyRecordKey.sportType, "", SearchContract.COLUMN_ICON_RESID, "<init>", "(II)V", "getSportType", "()I", "getIconResId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UiModel {
        private final int iconResId;
        private final int sportType;

        public UiModel(int i, int i2) {
            this.sportType = i;
            this.iconResId = i2;
        }

        public static /* synthetic */ UiModel copy$default(UiModel uiModel, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = uiModel.sportType;
            }
            if ((i3 & 2) != 0) {
                i2 = uiModel.iconResId;
            }
            return uiModel.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getSportType() {
            return this.sportType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getIconResId() {
            return this.iconResId;
        }

        @NotNull
        public final UiModel copy(int sportType, int iconResId) {
            return new UiModel(sportType, iconResId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiModel)) {
                return false;
            }
            UiModel uiModel = (UiModel) other;
            return this.sportType == uiModel.sportType && this.iconResId == uiModel.iconResId;
        }

        public final int getIconResId() {
            return this.iconResId;
        }

        public final int getSportType() {
            return this.sportType;
        }

        public int hashCode() {
            return (Integer.hashCode(this.sportType) * 31) + Integer.hashCode(this.iconResId);
        }

        @NotNull
        public String toString() {
            return "UiModel(sportType=" + this.sportType + ", iconResId=" + this.iconResId + ")";
        }
    }

    public LaunchSportButtonAdapter(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.fragmentActivity = fragmentActivity;
        this.mModelList = new ArrayList();
    }

    public static /* synthetic */ void bindData$default(LaunchSportButtonAdapter launchSportButtonAdapter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        launchSportButtonAdapter.bindData(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void fillModelList() {
        this.mModelList.clear();
        this.mModelList.add(new UiModel(1, eoi.a2));
        this.mModelList.add(new UiModel(2, eoi.X1));
        this.mModelList.add(new UiModel(6, eoi.Z1));
        this.mModelList.add(new UiModel(3, eoi.Y1));
        if (!AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            this.mModelList.add(new UiModel(14, eoi.b2));
            this.mModelList.add(new UiModel(324, eoi.c2));
            return;
        }
        EcoProduct ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).getProductByModel("yunmai.jmprope.sr804");
        if (ecoProduct == null || ecoProduct.getStatus() == 0) {
            return;
        }
        this.mModelList.add(new UiModel(14, eoi.b2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchToRopeSkipping(Context context) {
        EcoDeviceModel localDeviceModel;
        String str;
        Iterable deviceModels = RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).getDeviceModels();
        ArrayList arrayList = new ArrayList();
        for (Object obj : deviceModels) {
            if (StringsKt__StringsJVMKt.startsWith$default(DeviceModelExtKt.getModel((RNDeviceModel) obj), SportConstants.GYM_MODEL_YUN_MAI_JUMP2_PREFIX, false, 2, null)) {
                arrayList.add(obj);
            }
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.sport.sporttab.recycler.LaunchSportButtonAdapter$launchToRopeSkipping$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                String orderTimeJString;
                String orderTimeJString2;
                RNDevice device = ((RNDeviceModel) t2).getDevice();
                Integer numValueOf = null;
                Integer numValueOf2 = (device == null || (orderTimeJString2 = device.getOrderTimeJString()) == null) ? null : Integer.valueOf(Integer.parseInt(orderTimeJString2));
                RNDevice device2 = ((RNDeviceModel) t).getDevice();
                if (device2 != null && (orderTimeJString = device2.getOrderTimeJString()) != null) {
                    numValueOf = Integer.valueOf(Integer.parseInt(orderTimeJString));
                }
                return ComparisonsKt__ComparisonsKt.compareValues(numValueOf2, numValueOf);
            }
        });
        List list = listSortedWith;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RNDevice device = ((RNDeviceModel) listSortedWith.get(i)).getDevice();
            Logger.i(TAG, "orderTimeJString --------" + (device != null ? device.getOrderTimeJString() : null) + " ");
        }
        if (!(!list.isEmpty())) {
            SportManagerExportPreference sportManagerExportPreference = SportManagerExportPreference.INSTANCE;
            if (AppUtil.INSTANCE.isPlayChannel()) {
                str = "yunmai.jmprope.sr804";
            } else {
                EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
                EcoDeviceModel localDeviceModel2 = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel("yunmai.jmprope.sr803");
                str = ((localDeviceModel2 == null || !localDeviceModel2.getIsDeviceConnected()) && (localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED)) != null && localDeviceModel.getIsDeviceConnected()) ? SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED : "yunmai.jmprope.sr803";
            }
            sportManagerExportPreference.setKEY_GYM_LOCAL_SPORT_TYPE(str);
            EcoSportManagerExtKt.getINSTANCE(EcoSportManager.INSTANCE).goToGymLaunchSportActivity(context, null);
            return;
        }
        String string = EcoScalePreference.getString(SportConstants.KEY_CURRENT_BIND_ROPE_SKIPPING + AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        if (string == null || string.length() == 0) {
            RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).openPlugin(((RNDeviceModel) listSortedWith.get(0)).getDid());
            return;
        }
        RNDeviceManager.Companion companion2 = RNDeviceManager.INSTANCE;
        if (((RNDeviceModel) RNDeviceManagerExtKt.getInstance(companion2).getDeviceModel(string)) != null) {
            RNDeviceManagerExtKt.getInstance(companion2).openPlugin(string);
        } else {
            RNDeviceManagerExtKt.getInstance(companion2).openPlugin(((RNDeviceModel) listSortedWith.get(0)).getDid());
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void bindData(int itemWidth) {
        fillModelList();
        this.mItemWidth = itemWidth;
        notifyDataSetChanged();
    }

    @NotNull
    public final FragmentActivity getFragmentActivity() {
        return this.fragmentActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mModelList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof LaunchEntranceItemViewHolder) {
            ((LaunchEntranceItemViewHolder) holder).bindData(this.mModelList.get(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(dvi.v0, parent, false);
        if (this.mItemWidth != 0) {
            Intrinsics.checkNotNull(viewInflate);
            ViewExtKt.setWidth(viewInflate, this.mItemWidth);
        }
        Intrinsics.checkNotNull(viewInflate);
        return new LaunchEntranceItemViewHolder(this, viewInflate);
    }
}

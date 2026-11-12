package com.xiaomi.fitness.detail.inner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.request.ImageRequest;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.device.manager.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.wda;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0007¢\u0006\u0004\b \u0010!J!\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0015\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00060\u001dR\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailDateFromFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "", "sid", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "getDeviceInfo", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "", "initParamsFromBundle", "(Landroid/os/Bundle;)V", "getCardName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lwda;", "mViewBinding", "Lwda;", "Lcom/xiaomi/fitness/detail/inner/SportDetailDateFromFragment$DataFromListAdapter;", "adapter", "Lcom/xiaomi/fitness/detail/inner/SportDetailDateFromFragment$DataFromListAdapter;", "<init>", "()V", "Companion", "DataFromListAdapter", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailDateFromFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailDateFromFragment";
    private DataFromListAdapter adapter;
    private wda mViewBinding;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailDateFromFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void switchDetailFragment(@NotNull SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType, @Nullable FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(sportValues, "sportValues");
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putInt("sport_type", sportType);
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, sportDetailType);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag("SportDetailDateFromFragment", triathlonNum, sportType);
            int i = bsi.Z0;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailDateFromFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u001aB\u001f\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0011\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J \u0010\u0015\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016R!\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailDateFromFragment$DataFromListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/detail/inner/SportDetailDateFromFragment$DataFromListAdapter$DataFromListHolder;", "Lcom/xiaomi/fitness/detail/inner/SportDetailDateFromFragment;", "dataList", "", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "<init>", "(Lcom/xiaomi/fitness/detail/inner/SportDetailDateFromFragment;Ljava/util/List;)V", "getDataList", "()Ljava/util/List;", "getDeviceIconUrl", "", "deviceModel", "imageType", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "getItemCount", "DataFromListHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DataFromListAdapter extends RecyclerView.Adapter<DataFromListHolder> {

        @NotNull
        private final List<DeviceInfo<? extends Device>> dataList;
        final /* synthetic */ SportDetailDateFromFragment this$0;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\n \u0010*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailDateFromFragment$DataFromListAdapter$DataFromListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "deviceModel", "", "bind", "(Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "deviceIconIV", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "deviceNameTV", "Landroid/widget/TextView;", "<init>", "(Lcom/xiaomi/fitness/detail/inner/SportDetailDateFromFragment$DataFromListAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        public final class DataFromListHolder extends RecyclerView.d0 {
            private final ImageView deviceIconIV;
            private final TextView deviceNameTV;
            final /* synthetic */ DataFromListAdapter this$0;

            @NotNull
            private View view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DataFromListHolder(@NotNull DataFromListAdapter dataFromListAdapter, View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0 = dataFromListAdapter;
                this.view = view;
                this.deviceIconIV = (ImageView) view.findViewById(bsi.p1);
                this.deviceNameTV = (TextView) this.view.findViewById(bsi.q1);
            }

            public final void bind(@Nullable DeviceInfo<? extends Device> deviceModel) {
                Product product;
                String productName;
                String name = null;
                AnyExtKt.io$default(null, new SportDetailDateFromFragment$DataFromListAdapter$DataFromListHolder$bind$1(new ImageRequest.Builder(ApplicationExtKt.getApplication()).data(deviceModel != null ? DeviceModelExtKt.getBigIcon(deviceModel) : null).allowConversionToBitmap(true).allowHardware(false).build(), this, null), 1, null);
                TextView textView = this.deviceNameTV;
                if (deviceModel != null && (product = deviceModel.getProduct()) != null && (productName = product.getProductName()) != null) {
                    name = productName;
                } else if (deviceModel != null) {
                    name = deviceModel.getName();
                }
                textView.setText(name);
            }

            @NotNull
            public final View getView() {
                return this.view;
            }

            public final void setView(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "<set-?>");
                this.view = view;
            }
        }

        public DataFromListAdapter(@NotNull SportDetailDateFromFragment sportDetailDateFromFragment, List<DeviceInfo<? extends Device>> dataList) {
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            this.this$0 = sportDetailDateFromFragment;
            this.dataList = dataList;
        }

        private final String getDeviceIconUrl(DeviceInfo<? extends Device> deviceModel, int imageType) {
            Product product;
            Product product2;
            Product product3;
            Product product4;
            Product product5;
            Product product6;
            if (imageType == 1) {
                if (deviceModel == null || (product = deviceModel.getProduct()) == null) {
                    return null;
                }
                return product.getSmallIcon();
            }
            if (imageType != 2) {
                if (imageType != 3) {
                    if (deviceModel == null || (product6 = deviceModel.getProduct()) == null) {
                        return null;
                    }
                    return product6.getBigPreview();
                }
                if (deviceModel == null || (product5 = deviceModel.getProduct()) == null) {
                    return null;
                }
                return product5.getBigPreview();
            }
            if (((deviceModel == null || (product4 = deviceModel.getProduct()) == null) ? null : product4.getBigIcon3()) != null) {
                if (deviceModel == null || (product3 = deviceModel.getProduct()) == null) {
                    return null;
                }
                return product3.getBigIcon3();
            }
            if (deviceModel == null || (product2 = deviceModel.getProduct()) == null) {
                return null;
            }
            return product2.getBigIcon();
        }

        @NotNull
        public final List<DeviceInfo<? extends Device>> getDataList() {
            return this.dataList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return this.dataList.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull DataFromListHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.bind(this.dataList.get(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public DataFromListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View viewInflate = LayoutInflater.from(this.this$0.getContext()).inflate(ivi.a2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new DataFromListHolder(this, viewInflate);
        }
    }

    private final DeviceInfo<? extends Device> getDeviceInfo(String sid) {
        return DeviceManagerExtKt.getInstance(DeviceManager.INSTANCE).getDeviceInfoInAll(sid);
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
        }
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "data_source";
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this.mViewBinding = wda.A0(inflater, container, false);
        initParamsFromBundle(getArguments());
        wda wdaVar = this.mViewBinding;
        if (wdaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            wdaVar = null;
        }
        View root = wdaVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        wda wdaVar = this.mViewBinding;
        DataFromListAdapter dataFromListAdapter = null;
        if (wdaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            wdaVar = null;
        }
        wdaVar.B.bindData(hoi.V1, getString(j1j.n6));
        wda wdaVar2 = this.mViewBinding;
        if (wdaVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            wdaVar2 = null;
        }
        wdaVar2.A.setLayoutManager(new LinearLayoutManager(getMActivity(), 1, false));
        ArrayList arrayList = new ArrayList();
        SportBasicReport mSportValues = getMSportValues();
        String sid = mSportValues != null ? mSportValues.getSid() : null;
        Intrinsics.checkNotNull(sid);
        DeviceInfo<? extends Device> deviceInfo = getDeviceInfo(sid);
        if (deviceInfo == null) {
            wda wdaVar3 = this.mViewBinding;
            if (wdaVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
                wdaVar3 = null;
            }
            wdaVar3.getRoot().setVisibility(8);
        } else {
            wda wdaVar4 = this.mViewBinding;
            if (wdaVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
                wdaVar4 = null;
            }
            wdaVar4.getRoot().setVisibility(0);
            arrayList.add(deviceInfo);
        }
        this.adapter = new DataFromListAdapter(this, arrayList);
        wda wdaVar5 = this.mViewBinding;
        if (wdaVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            wdaVar5 = null;
        }
        RecyclerView recyclerView = wdaVar5.A;
        DataFromListAdapter dataFromListAdapter2 = this.adapter;
        if (dataFromListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            dataFromListAdapter = dataFromListAdapter2;
        }
        recyclerView.setAdapter(dataFromListAdapter);
    }
}

package com.xiaomi.hm.health.device.beep;

import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.devicex.R;
import com.huami.lib.view.widget.ItemView2;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.beep.BeepSettingActivity;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/device/beep/BeepSettingActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", b.r, "t", "initRecyclerView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/device/beep/BeepSettingViewModel;", "viewModel", "Lcom/xiaomi/hm/health/device/beep/BeepSettingViewModel;", "getViewModel", "()Lcom/xiaomi/hm/health/device/beep/BeepSettingViewModel;", "setViewModel", "(Lcom/xiaomi/hm/health/device/beep/BeepSettingViewModel;)V", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "x", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "y", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "z", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "hmMiLiProDevice", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "mLoadingDialogHelper", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BeepSettingActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper mLoadingDialogHelper;
    public BeepSettingViewModel viewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private HMDeviceSource source;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private HMDeviceType deviceType = HMDeviceType.MILI;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private HMMiLiProDevice hmMiLiProDevice;

    private final void initRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        int i = R.id.recyclerView;
        ((RecyclerView) findViewById(i)).setLayoutManager(linearLayoutManager);
        AdapterBeep adapterBeep = new AdapterBeep();
        adapterBeep.setListener(new ItemView2.OnCheckedChangeListener() { // from class: bt
            @Override // com.huami.lib.view.widget.ItemView2.OnCheckedChangeListener
            public final void onCheckedChanged(ItemView2 itemView2, boolean z, boolean z2) {
                BeepSettingActivity.s(this.a, itemView2, z, z2);
            }
        });
        BeepPropertyRepo beepPropertyRepo = BeepPropertyRepo.INSTANCE;
        List<Pair<BeepType, Boolean>> localeProperty = beepPropertyRepo.getLocaleProperty();
        if (localeProperty == null) {
            localeProperty = beepPropertyRepo.getDefaultBeeps();
        }
        adapterBeep.setBeeps(localeProperty);
        ((RecyclerView) findViewById(i)).setAdapter(adapterBeep);
    }

    private final void p() {
        setViewModel((BeepSettingViewModel) new ViewModelProvider(this).get(BeepSettingViewModel.class));
        getViewModel().getResult().observe(this, new Observer() { // from class: at
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BeepSettingActivity.q(this.a, (Boolean) obj);
            }
        });
        getViewModel().isShowLoading().observe(this, new Observer() { // from class: zs
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BeepSettingActivity.r(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(BeepSettingActivity beepSettingActivity, Boolean bool) {
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            LoadingDialogHelper loadingDialogHelper = beepSettingActivity.mLoadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.setSuccess(R.string.save_success);
            return;
        }
        LoadingDialogHelper loadingDialogHelper2 = beepSettingActivity.mLoadingDialogHelper;
        if (loadingDialogHelper2 == null) {
            return;
        }
        loadingDialogHelper2.setFail(R.string.save_failed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(BeepSettingActivity beepSettingActivity, Boolean bool) {
        LoadingDialogHelper loadingDialogHelper;
        if (!bool.booleanValue() || (loadingDialogHelper = beepSettingActivity.mLoadingDialogHelper) == null) {
            return;
        }
        loadingDialogHelper.showLoading(R.string.saving);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(BeepSettingActivity beepSettingActivity, ItemView2 itemView2, boolean z, boolean z2) {
        if (z2) {
            BeepSettingViewModel viewModel = beepSettingActivity.getViewModel();
            Object tag = itemView2.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.xiaomi.hm.health.device.beep.BeepType");
            viewModel.setBeepSettingToDevice(new Pair<>((BeepType) tag, Boolean.valueOf(z)));
        }
    }

    private final void t() {
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.pale_grey), getString(R.string.beep_setting), true);
        getTitleTextView().setTextColor(ContextCompat.getColor(this, R.color.black70));
        getLeft().setOnClickListener(new View.OnClickListener() { // from class: ys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BeepSettingActivity.u(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(BeepSettingActivity beepSettingActivity, View view) {
        beepSettingActivity.finish();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final BeepSettingViewModel getViewModel() {
        BeepSettingViewModel beepSettingViewModel = this.viewModel;
        Objects.requireNonNull(beepSettingViewModel);
        return beepSettingViewModel;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_beep);
        this.mLoadingDialogHelper = new LoadingDialogHelper(this);
        t();
        initRecyclerView();
        p();
    }

    public final void setViewModel(@NotNull BeepSettingViewModel beepSettingViewModel) {
        this.viewModel = beepSettingViewModel;
    }
}

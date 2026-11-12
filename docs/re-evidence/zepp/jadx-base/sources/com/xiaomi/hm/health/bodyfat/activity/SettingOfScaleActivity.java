package com.xiaomi.hm.health.bodyfat.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.arch.helper.Resource;
import com.huami.arch.helper.Status;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.view.basetitle.StatusBarUtil;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.SettingOfScaleActivity;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseAvatarOfScaleDialog;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseAvatarOfScaleFragment;
import com.xiaomi.hm.health.bodyfat.viewmodel.SettingOfScaleViewModel;
import com.xiaomi.hm.health.databases.model.UserScaleInfo;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\u001d\u0010\f\u001a\u00020\u00078F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u00020\r8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/SettingOfScaleActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "a", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "viewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "b", "getLoadingDialog", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class SettingOfScaleActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingDialog = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.LOADING.ordinal()] = 1;
            iArr[Status.ERROR.ordinal()] = 2;
            iArr[Status.SUCCESS.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LoadingDialog> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog getA() {
            return LoadingDialog.showDialog(SettingOfScaleActivity.this, "");
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
            return (SettingOfScaleViewModel) ViewModelProviders.of(SettingOfScaleActivity.this).get(SettingOfScaleViewModel.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SettingOfScaleActivity settingOfScaleActivity, Integer num) {
        ChooseAvatarOfScaleDialog.AvatarInfo value = settingOfScaleActivity.getViewModel().getChooseAvatarId().getValue();
        settingOfScaleActivity.getViewModel().syncScaleOfSettingInfo(new UserScaleInfo(EcgData.DEFAULT_DIGIT_VALUE, value == null ? 0 : value.getValue(), num.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SettingOfScaleActivity settingOfScaleActivity, Resource resource) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            settingOfScaleActivity.getLoadingDialog().show();
            return;
        }
        if (i == 2) {
            settingOfScaleActivity.getLoadingDialog().dismiss();
            settingOfScaleActivity.finish();
        } else {
            if (i != 3) {
                return;
            }
            settingOfScaleActivity.getLoadingDialog().dismiss();
            settingOfScaleActivity.setResult(-1);
            settingOfScaleActivity.finish();
        }
    }

    private final void initView() {
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new ChooseAvatarOfScaleFragment(), WebAPI.PARAM_SHARE_INVITE_AVATAR).commit();
        getViewModel().getMeasureMode().observe(this, new Observer() { // from class: sr6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SettingOfScaleActivity.e(this.a, (Integer) obj);
            }
        });
        getViewModel().getResult().observe(this, new Observer() { // from class: rr6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SettingOfScaleActivity.f(this.a, (Resource) obj);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final LoadingDialog getLoadingDialog() {
        return (LoadingDialog) this.loadingDialog.getValue();
    }

    @NotNull
    public final SettingOfScaleViewModel getViewModel() {
        return (SettingOfScaleViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_of_scale);
        StatusBarUtil.setStatusColor(this, false, true, 0);
        initView();
    }
}

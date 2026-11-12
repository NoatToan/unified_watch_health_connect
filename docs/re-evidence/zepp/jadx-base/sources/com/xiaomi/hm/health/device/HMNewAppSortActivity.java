package com.xiaomi.hm.health.device;

import android.os.Bundle;
import com.huami.devicex.R;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.device.setting.appsort.AppSortFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/HMNewAppSortActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMNewAppSortActivity extends BaseTitleActivity {
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BaseTitleActivity.STYLE.NONE, 0, true);
        setContentView(R.layout.activity_new_app_sort);
        getSupportFragmentManager().beginTransaction().add(R.id.new_app_sort_container, new AppSortFragment()).commit();
    }
}

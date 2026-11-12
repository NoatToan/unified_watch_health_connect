package com.xiaomi.xms.wearable.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.xms.wearable.WearableXmsService;
import defpackage.dih;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\"\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/TransparentActivity;", "Landroid/app/Activity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", AccountInteractActivity.KEY_REQUEST_CODE, "", "resultCode", "data", "Landroid/content/Intent;", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransparentActivity extends Activity {
    public static final int REQUEST_CODE = 100;

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 100) {
            Intent intent = new Intent();
            intent.setClass(this, WearableXmsService.class);
            intent.putExtra(WearableXmsService.PARAM_ACTION, WearableXmsService.ACTION_REQUEST_PERMISSION_EVENT);
            startService(intent);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dih.a().h(this, new FragmentParams.b().e(PermissionManagementFragment.class).c(getIntent().getExtras()).b(), 100);
    }
}

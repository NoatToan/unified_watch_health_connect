package com.huami.wallet.accessdoor.activity;

import android.os.Bundle;
import com.huami.wallet.accessdoor.helper.AccessDoorPageHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0014J\b\u0010\n\u001a\u00020\u0004H\u0014J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lcom/huami/wallet/accessdoor/activity/BaseAccessDoorActivity;", "Lcom/huami/wallet/accessdoor/activity/BaseDeviceStatusActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onStart", "onResume", "onPause", "onStop", "onDestroy", "outState", "onSaveInstanceState", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseAccessDoorActivity extends BaseDeviceStatusActivity {
    @Override // com.huami.wallet.accessdoor.activity.BaseDeviceStatusActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.wallet.accessdoor.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AccessDoorPageHelper.getInstance().onActivityCreated(this, savedInstanceState);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AccessDoorPageHelper.getInstance().onActivityDestroyed(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        AccessDoorPageHelper.getInstance().onActivityPaused(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        AccessDoorPageHelper.getInstance().onActivityResumed(this);
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        AccessDoorPageHelper.getInstance().onActivitySaveInstanceState(this, outState);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        AccessDoorPageHelper.getInstance().onActivityStarted(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        AccessDoorPageHelper.getInstance().onActivityStopped(this);
    }
}

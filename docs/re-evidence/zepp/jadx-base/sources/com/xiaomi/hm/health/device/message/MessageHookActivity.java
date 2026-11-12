package com.xiaomi.hm.health.device.message;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/message/MessageHookActivity;", "Landroidx/fragment/app/FragmentActivity;", "Landroid/view/View;", "c", "", GoogleApiAvailabilityLight.a, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "a", "Ljava/lang/String;", "hostFragmentTag", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MessageHookActivity extends FragmentActivity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String hostFragmentTag = "message_host";

    private final View c() {
        FrameLayout frameLayout = new FrameLayout(getBaseContext());
        frameLayout.setId(R.id.content_view);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    private final void d() {
        ExtensionsKt.addFragmentByTag(this, new MessageHostFragment(), R.id.content_view, this.hostFragmentTag);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(c());
        StatusBarUtil.setStatusColor(this, true, true, -1);
        d();
        MessageHookManager.INSTANCE.regUI(this);
    }
}

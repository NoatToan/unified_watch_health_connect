package com.xiaomi.hm.health.device;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/WeightAboutActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightAboutActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String x = "fm_version";

    @NotNull
    private static final String y = "wifi_version";

    @NotNull
    private static final String z = "address";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/WeightAboutActivity$Companion;", "", "", "fmVersion", "wifiVersion", "address", "", "startActivity", "KEY_FM", "Ljava/lang/String;", "KEY_MAC", "KEY_WIFI", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startActivity(@NotNull String fmVersion, @NotNull String wifiVersion, @NotNull String address) {
            Intent intent = new Intent(DeviceXFunctionsKt.getContext(), (Class<?>) WeightAboutActivity.class);
            intent.putExtra(WeightAboutActivity.x, fmVersion);
            intent.putExtra(WeightAboutActivity.y, wifiVersion);
            intent.putExtra("address", address);
            intent.setFlags(268435456);
            DeviceXFunctionsKt.getContext().startActivity(intent);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_about);
        UnifyTitleBarStyle.setUnifyTitleStyle$default(this, getString(R.string.about_device), null, 2, null);
        String stringExtra = getIntent().getStringExtra(x);
        String stringExtra2 = getIntent().getStringExtra(y);
        String stringExtra3 = getIntent().getStringExtra("address");
        int i = R.id.wifi_version;
        ((ListTile) findViewById(i)).setTrailing((Drawable) null);
        int i2 = R.id.firmware_version;
        ((ListTile) findViewById(i2)).setTrailing((Drawable) null);
        int i3 = R.id.mac_address;
        ((ListTile) findViewById(i3)).setTrailing((Drawable) null);
        ((ListTile) findViewById(i2)).setTips(stringExtra);
        ((ListTile) findViewById(i)).setTips(stringExtra2);
        ((ListTile) findViewById(i3)).setTips(stringExtra3);
    }
}

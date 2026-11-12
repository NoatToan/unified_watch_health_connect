package com.xiaomi.fitness.device.manager.ui.bind;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.device.manager.extensions.DeviceExtKt;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity;
import com.xiaomi.fitness.eco.device.manager.export.EcoBindDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoBindDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.IBindGuideAction;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.habit.ui.HabitShareActivity;
import defpackage.dui;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/RestGuideActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RestGuideActivity extends BaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_BIG_ICON = "big_icon";

    @NotNull
    private static final String KEY_MODEL = "model";

    @NotNull
    private static final String KEY_PRODUCT_ID = "product_id";

    @NotNull
    private static final String KEY_PRODUCT_NAME = "product_name";

    @NotNull
    private static final String KEY_SMALL_ICON = "small_icon";

    @NotNull
    private static final String TAG = "RestGuideActivity";

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/RestGuideActivity$Companion;", "", "<init>", "()V", "TAG", "", "KEY_MODEL", "KEY_PRODUCT_ID", "KEY_PRODUCT_NAME", "KEY_BIG_ICON", "KEY_SMALL_ICON", "launch", "", "context", "Landroid/content/Context;", "model", "productId", "", "productName", HabitShareActivity.KEY_BIG_ICON, "smallIcon", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, @NotNull String model, int productId, @Nullable String productName, @Nullable String bigIcon, @Nullable String smallIcon) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(model, "model");
            Intent intent = new Intent(context, (Class<?>) RestGuideActivity.class);
            intent.putExtra("model", model);
            intent.putExtra("product_id", productId);
            intent.putExtra("product_name", productName);
            intent.putExtra(RestGuideActivity.KEY_BIG_ICON, bigIcon);
            intent.putExtra(RestGuideActivity.KEY_SMALL_ICON, smallIcon);
            context.startActivity(intent);
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dui.f;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra("model");
        int intExtra = getIntent().getIntExtra("product_id", -1);
        String stringExtra2 = getIntent().getStringExtra("product_name");
        String stringExtra3 = getIntent().getStringExtra(KEY_BIG_ICON);
        String stringExtra4 = getIntent().getStringExtra(KEY_SMALL_ICON);
        final EcoProduct ecoProduct = new EcoProduct();
        if (stringExtra == null) {
            stringExtra = "";
        }
        ecoProduct.setModel(stringExtra);
        ecoProduct.setProductId(intExtra);
        ecoProduct.setProductName(stringExtra2);
        ecoProduct.setBigIcon(stringExtra3);
        ecoProduct.setSmallIcon(stringExtra4);
        EcoBindDeviceManagerExtKt.getInstance(EcoBindDeviceManager.INSTANCE).showResetGuideView(this, ecoProduct, new IBindGuideAction() { // from class: com.xiaomi.fitness.device.manager.ui.bind.RestGuideActivity.onCreate.1
            @Override // com.xiaomi.fitness.eco.device.manager.export.IBindGuideAction
            public void onBack() {
                RestGuideActivity.this.finish();
            }

            @Override // com.xiaomi.fitness.eco.device.manager.export.IBindGuideAction
            public void onKnown() {
                ScanDeviceActivity.INSTANCE.launch$device_manager_chinaProductRelease(RestGuideActivity.this, DeviceExtKt.toDeviceInfo(ecoProduct), true);
                RestGuideActivity.this.finish();
            }
        }, getMiuiActionBar(), false);
    }
}

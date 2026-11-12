package com.xiaomi.fitness.feedback.bugreport;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.habit.ui.HabitShareActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u0011R\u001c\u0010#\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\u0011R\u001c\u0010&\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\u0011R\u001a\u0010)\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001f¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/DeviceData;", "", "product", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "<init>", "(Lcom/xiaomi/fitness/device/manager/bean/Product;Lcom/xiaomi/fitness/device/manager/DeviceModel;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "model", "getModel", "setModel", "(Ljava/lang/String;)V", "isBandType", "", "()Z", "setBandType", "(Z)V", "name", "getName", "setName", "productId", "", "getProductId", "()I", "setProductId", "(I)V", "productName", "getProductName", "setProductName", HabitShareActivity.KEY_BIG_ICON, "getBigIcon", "setBigIcon", "did", "getDid", "setDid", "type", "getType", "setType", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceData {

    @NotNull
    private final String TAG = "DeviceData";

    @Nullable
    private String bigIcon;

    @Nullable
    private String did;
    private boolean isBandType;

    @Nullable
    private String model;

    @Nullable
    private String name;
    private int productId;

    @Nullable
    private String productName;
    private int type;

    public DeviceData(@Nullable Product product, @Nullable DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel) {
        String model;
        String name;
        Product product2;
        String productName;
        Product product3;
        String previewIcon;
        int type = -1;
        this.type = -1;
        if (product == null || (model = product.getModel()) == null) {
            model = deviceModel != null ? DeviceModelExtKt.getModel(deviceModel) : "";
        }
        this.model = model;
        int productId = 0;
        this.isBandType = product != null && (product.getType() == 3 || product.getType() == 5 || product.getType() == 7);
        if (product != null) {
            name = product.getProductName();
        } else {
            name = deviceModel != null ? DeviceModelExtKt.getName(deviceModel) : null;
        }
        this.name = name;
        if (product != null) {
            productId = product.getProductId();
        } else if (deviceModel != null && (product2 = deviceModel.getProduct()) != null) {
            productId = product2.getProductId();
        }
        this.productId = productId;
        if (product != null) {
            productName = product.getProductName();
        } else {
            productName = (deviceModel == null || (product3 = deviceModel.getProduct()) == null) ? null : product3.getProductName();
        }
        this.productName = productName;
        if (product != null) {
            previewIcon = product.getBigPreview() != null ? product.getBigPreview() : product.getBigIcon();
        } else if (deviceModel != null) {
            previewIcon = deviceModel.getProduct().getBigPreview() != null ? DeviceModelExtKt.getPreviewIcon(deviceModel) : DeviceModelExtKt.getBigIcon(deviceModel);
        } else {
            previewIcon = null;
        }
        this.bigIcon = previewIcon;
        this.did = deviceModel != null ? deviceModel.getDid() : null;
        if (product != null || (deviceModel != null && (product = deviceModel.getProduct()) != null)) {
            type = product.getType();
        }
        this.type = type;
        Logger.d("DeviceData", "model " + this.model + ", isBandType is " + this.isBandType + ", name is " + this.name + " , productId is " + this.productId + ", productName is " + this.productName + ", bigIcon = " + this.bigIcon + ", did = " + this.did);
    }

    @Nullable
    public final String getBigIcon() {
        return this.bigIcon;
    }

    @Nullable
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isBandType, reason: from getter */
    public final boolean getIsBandType() {
        return this.isBandType;
    }

    public final void setBandType(boolean z) {
        this.isBandType = z;
    }

    public final void setBigIcon(@Nullable String str) {
        this.bigIcon = str;
    }

    public final void setDid(@Nullable String str) {
        this.did = str;
    }

    public final void setModel(@Nullable String str) {
        this.model = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setProductId(int i) {
        this.productId = i;
    }

    public final void setProductName(@Nullable String str) {
        this.productName = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}

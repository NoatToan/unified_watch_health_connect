package com.garmin.device.sharing.management.dtos;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005¨\u0006\u0015"}, d2 = {"Lcom/garmin/device/sharing/management/dtos/IRegisteredDeviceDto;", "Landroid/os/Parcelable;", "applicationKey", "", "getApplicationKey", "()Ljava/lang/String;", "deviceId", "", "getDeviceId", "()J", "displayName", "getDisplayName", "imageUrl", "getImageUrl", "partNumber", "getPartNumber", "partNumberPartial", "getPartNumberPartial", "productDisplayName", "getProductDisplayName", "Companion", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IRegisteredDeviceDto extends Parcelable {
    public static final String APPLICATION_KEY = "applicationKey";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String DEVICE_ID = "deviceId";
    public static final String DISPLAY_NAME = "displayName";
    public static final String IMAGE_URL = "imageUrl";
    public static final String PART_NUMBER = "partNumber";
    public static final String PRODUCT_DISPLAY_NAME = "productDisplayName";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/garmin/device/sharing/management/dtos/IRegisteredDeviceDto$Companion;", "", "()V", "APPLICATION_KEY", "", "DEVICE_ID", "DISPLAY_NAME", "IMAGE_URL", "PART_NUMBER", "PRODUCT_DISPLAY_NAME", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String APPLICATION_KEY = "applicationKey";
        public static final String DEVICE_ID = "deviceId";
        public static final String DISPLAY_NAME = "displayName";
        public static final String IMAGE_URL = "imageUrl";
        public static final String PART_NUMBER = "partNumber";
        public static final String PRODUCT_DISPLAY_NAME = "productDisplayName";

        private Companion() {
        }
    }

    String getApplicationKey();

    long getDeviceId();

    String getDisplayName();

    String getImageUrl();

    String getPartNumber();

    String getPartNumberPartial();

    String getProductDisplayName();
}

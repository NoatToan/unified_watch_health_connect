package com.huami.device.feature.health.ui.item;

import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.res.AppResKt;
import com.huami.device.feature.health.ui.R;
import com.huami.device.feature.health.ui.medical.MedicalResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u000f\u0010\u0011\u0012\u0013\u0014B\u001d\b\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\t\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b\u0082\u0001\u0006\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/huami/device/feature/health/ui/item/TitleItem;", "Lcom/huami/device/feature/health/ui/item/ViewItem;", "", "getItemType", "", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "title", "b", "getButton", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "AtrialTitleItem", "BloodPressureTitleItem", "HrTitleItem", "PressureTitleItem", "SleepTitleItem", "Spo2TitleItem", "Lcom/huami/device/feature/health/ui/item/TitleItem$HrTitleItem;", "Lcom/huami/device/feature/health/ui/item/TitleItem$AtrialTitleItem;", "Lcom/huami/device/feature/health/ui/item/TitleItem$SleepTitleItem;", "Lcom/huami/device/feature/health/ui/item/TitleItem$PressureTitleItem;", "Lcom/huami/device/feature/health/ui/item/TitleItem$Spo2TitleItem;", "Lcom/huami/device/feature/health/ui/item/TitleItem$BloodPressureTitleItem;", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class TitleItem implements ViewItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String button;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/device/feature/health/ui/item/TitleItem$AtrialTitleItem;", "Lcom/huami/device/feature/health/ui/item/TitleItem;", "", "getTitle", "()Ljava/lang/String;", "title", "getButton", "button", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class AtrialTitleItem extends TitleItem {

        @NotNull
        public static final AtrialTitleItem INSTANCE = new AtrialTitleItem();

        /* JADX WARN: Multi-variable type inference failed */
        private AtrialTitleItem() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.huami.device.feature.health.ui.item.TitleItem
        @NotNull
        public String getButton() {
            return AppResKt.getHealthStr().getKnowMoreRes();
        }

        @Override // com.huami.device.feature.health.ui.item.TitleItem
        @NotNull
        public String getTitle() {
            return MedicalResource.INSTANCE.get().getAtrial_fib_text();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/device/feature/health/ui/item/TitleItem$BloodPressureTitleItem;", "Lcom/huami/device/feature/health/ui/item/TitleItem;", "", "getTitle", "()Ljava/lang/String;", "title", "getButton", "button", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class BloodPressureTitleItem extends TitleItem {

        @NotNull
        public static final BloodPressureTitleItem INSTANCE = new BloodPressureTitleItem();

        /* JADX WARN: Multi-variable type inference failed */
        private BloodPressureTitleItem() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.huami.device.feature.health.ui.item.TitleItem
        @NotNull
        public String getButton() {
            return AppResKt.getHealthStr().getKnowMoreRes();
        }

        @Override // com.huami.device.feature.health.ui.item.TitleItem
        @NotNull
        public String getTitle() {
            return HealthDetect.INSTANCE.getContext().getString(R.string.blood_pressure_study);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/device/feature/health/ui/item/TitleItem$HrTitleItem;", "Lcom/huami/device/feature/health/ui/item/TitleItem;", "", "getTitle", "()Ljava/lang/String;", "title", "getButton", "button", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class HrTitleItem extends TitleItem {

        @NotNull
        public static final HrTitleItem INSTANCE = new HrTitleItem();

        /* JADX WARN: Multi-variable type inference failed */
        private HrTitleItem() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.huami.device.feature.health.ui.item.TitleItem
        @NotNull
        public String getButton() {
            return AppResKt.getHealthStr().getKnowMoreRes();
        }

        @Override // com.huami.device.feature.health.ui.item.TitleItem
        @NotNull
        public String getTitle() {
            return AppResKt.getHealthStr().getHeartRateRes();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/device/feature/health/ui/item/TitleItem$PressureTitleItem;", "Lcom/huami/device/feature/health/ui/item/TitleItem;", "", "getTitle", "()Ljava/lang/String;", "title", "getButton", "button", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class PressureTitleItem extends TitleItem {

        @NotNull
        public static final PressureTitleItem INSTANCE = new PressureTitleItem();

        /* JADX WARN: Multi-variable type inference failed */
        private PressureTitleItem() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.huami.device.feature.health.ui.item.TitleItem
        @NotNull
        public String getButton() {
            return AppResKt.getHealthStr().getKnowMoreRes();
        }

        @Override // com.huami.device.feature.health.ui.item.TitleItem
        @NotNull
        public String getTitle() {
            return AppResKt.getHealthStr().getPressure();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/device/feature/health/ui/item/TitleItem$SleepTitleItem;", "Lcom/huami/device/feature/health/ui/item/TitleItem;", "", "getTitle", "()Ljava/lang/String;", "title", "getButton", "button", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class SleepTitleItem extends TitleItem {

        @NotNull
        public static final SleepTitleItem INSTANCE = new SleepTitleItem();

        /* JADX WARN: Multi-variable type inference failed */
        private SleepTitleItem() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.huami.device.feature.health.ui.item.TitleItem
        @NotNull
        public String getButton() {
            return AppResKt.getHealthStr().getKnowMoreRes();
        }

        @Override // com.huami.device.feature.health.ui.item.TitleItem
        @NotNull
        public String getTitle() {
            return AppResKt.getHealthStr().getSleepRes();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/device/feature/health/ui/item/TitleItem$Spo2TitleItem;", "Lcom/huami/device/feature/health/ui/item/TitleItem;", "", "getTitle", "()Ljava/lang/String;", "title", "getButton", "button", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Spo2TitleItem extends TitleItem {

        @NotNull
        public static final Spo2TitleItem INSTANCE = new Spo2TitleItem();

        /* JADX WARN: Multi-variable type inference failed */
        private Spo2TitleItem() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.huami.device.feature.health.ui.item.TitleItem
        @NotNull
        public String getButton() {
            return AppResKt.getHealthStr().getKnowMoreRes();
        }

        @Override // com.huami.device.feature.health.ui.item.TitleItem
        @NotNull
        public String getTitle() {
            return AppResKt.getHealthStr().getSpo2();
        }
    }

    private TitleItem(String str, String str2) {
        this.title = str;
        this.button = str2;
    }

    public /* synthetic */ TitleItem(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    @NotNull
    public String getButton() {
        return this.button;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return 1;
    }

    @NotNull
    public String getTitle() {
        return this.title;
    }

    public /* synthetic */ TitleItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, null);
    }
}

package com.huami.device.feature.health.ui.bloodpressure.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.device.feature.health.bloodpressure_ui.R;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016B'\b\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0001\u0007\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus;", "", "", "a", LogUtil.I, "getTitle", "()I", "title", "b", "getSummary", "summary", "c", "getImg", SocialConstants.PARAM_IMG_URL, "<init>", "(III)V", "CANCEL", "CheckConnect", "Fail", "Ing", "Start", "Success", "Tip", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus$Tip;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus$Start;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus$Ing;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus$Success;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus$Fail;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus$CheckConnect;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus$CANCEL;", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class BloodPressureCorrectPageStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int summary;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int img;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus$CANCEL;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class CANCEL extends BloodPressureCorrectPageStatus {

        @NotNull
        public static final CANCEL INSTANCE = new CANCEL();

        private CANCEL() {
            super(R.string.blood_pressure_watch_correct_success_title, R.string.blood_pressure_watch_correct_summary_two, R.drawable.ic_watch_correct_four, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus$CheckConnect;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class CheckConnect extends BloodPressureCorrectPageStatus {

        @NotNull
        public static final CheckConnect INSTANCE = new CheckConnect();

        private CheckConnect() {
            super(R.string.blood_pressure_watch_correct_success_title, R.string.blood_pressure_watch_correct_summary_two, R.drawable.ic_watch_correct_four, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus$Fail;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Fail extends BloodPressureCorrectPageStatus {

        @NotNull
        public static final Fail INSTANCE = new Fail();

        private Fail() {
            super(R.string.blood_pressure_watch_correct_success_title, R.string.blood_pressure_watch_correct_summary_two, R.drawable.ic_watch_correct_four, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus$Ing;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Ing extends BloodPressureCorrectPageStatus {

        @NotNull
        public static final Ing INSTANCE = new Ing();

        private Ing() {
            super(R.string.blood_pressure_watch_correct_ing_title, R.string.blood_pressure_watch_correct_summary_two, R.drawable.ic_watch_correct_three, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus$Start;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Start extends BloodPressureCorrectPageStatus {

        @NotNull
        public static final Start INSTANCE = new Start();

        private Start() {
            super(R.string.blood_pressure_watch_correct_start_title, R.string.blood_pressure_watch_correct_summary_two, R.drawable.ic_watch_correct_two, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus$Success;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Success extends BloodPressureCorrectPageStatus {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
            super(R.string.blood_pressure_watch_correct_success_title, R.string.blood_pressure_watch_correct_summary_three, R.drawable.ic_watch_correct_four, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus$Tip;", "Lcom/huami/device/feature/health/ui/bloodpressure/model/BloodPressureCorrectPageStatus;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Tip extends BloodPressureCorrectPageStatus {

        @NotNull
        public static final Tip INSTANCE = new Tip();

        private Tip() {
            super(R.string.blood_pressure_watch_correct_tip_title, R.string.blood_pressure_watch_correct_summary_one, R.drawable.ic_watch_correct_one, null);
        }
    }

    private BloodPressureCorrectPageStatus(@StringRes int i, @StringRes int i2, @DrawableRes int i3) {
        this.title = i;
        this.summary = i2;
        this.img = i3;
    }

    public /* synthetic */ BloodPressureCorrectPageStatus(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    public final int getImg() {
        return this.img;
    }

    public final int getSummary() {
        return this.summary;
    }

    public final int getTitle() {
        return this.title;
    }
}

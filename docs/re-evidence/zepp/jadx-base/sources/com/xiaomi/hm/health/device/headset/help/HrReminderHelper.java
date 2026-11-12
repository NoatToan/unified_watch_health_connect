package com.xiaomi.hm.health.device.headset.help;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.dataflow.Constant;
import com.xiaomi.hm.health.device.headset.type.HeadSetSeekBar;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0002R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/help/HrReminderHelper;", "", "", "a", "Lcom/xiaomi/hm/health/device/headset/type/HeadSetSeekBar;", "seekBar", "Landroid/view/View;", "contianer", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "updateHrValueViewPos", "", "progress", "getHr", Constant.KEY_HR_VALUE, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlin/Pair;", "", "getHrSectionHint", Constants.DATA_KEY_HR, "hrToPercent", LogUtil.I, "AGE_MAX_HR", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HrReminderHelper {

    @NotNull
    public static final HrReminderHelper INSTANCE = new HrReminderHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int AGE_MAX_HR = 220;

    private HrReminderHelper() {
    }

    private final int a() {
        return 220 - HMPersonInfo.getInstance().getUserInfo().getAge();
    }

    public final int getHr(@NotNull HeadSetSeekBar seekBar, float progress) {
        float max = progress / seekBar.getMax();
        float fA = a();
        float f = 0.5f * fA;
        return (int) (f + ((fA - f) * max));
    }

    @NotNull
    public final Pair<String, Integer> getHrSectionHint(int heartRate, @NotNull Context context) {
        int i;
        int i2;
        int iA = a();
        float f = iA;
        float f2 = 0.6f * f;
        float f3 = 0.7f * f;
        float f4 = 0.8f * f;
        float f5 = f * 0.9f;
        float f6 = heartRate;
        if (f6 >= f5 && heartRate <= iA) {
            i = R.string.spo2_click;
            i2 = R.color.hr_tape_anaerobic_limit;
        } else if (f6 >= f4 && f6 < f5) {
            i = R.string.hr_section_stamina_strengthen;
            i2 = R.color.hr_tape_stamina_strength;
        } else if (f6 >= f3 && f6 < f4) {
            i = R.string.hr_section_heart_lung_strengthen;
            i2 = R.color.hr_tape_lung_strength;
        } else if (f6 < f2 || f6 >= f3) {
            i = R.string.hr_section_warm_up;
            i2 = R.color.hr_tape_warm_up;
        } else {
            i = R.string.hr_section_fat_burn;
            i2 = R.color.hr_tape_fat_burn;
        }
        return new Pair<>(context.getString(i), Integer.valueOf(ContextCompat.getColor(context, i2)));
    }

    public final float hrToPercent(int hr) {
        float fA = a();
        float f = 0.5f * fA;
        return (hr - f) / (fA - f);
    }

    public final void updateHrValueViewPos(@NotNull HeadSetSeekBar seekBar, @NotNull View contianer, @NotNull AppCompatActivity activity) {
        int i;
        float progress = seekBar.getProgress() / seekBar.getMax();
        int width = seekBar.getWidth();
        int i2 = (int) (width * 1.0f * progress);
        int screenWidth = ViewUtils.isRTL() ? ViewUtils.getScreenWidth(activity) - contianer.getRight() : contianer.getLeft();
        int width2 = contianer.getWidth() / 2;
        if (i2 >= width2) {
            if (i2 > width - width2) {
                i = screenWidth + width;
                width2 *= 2;
            } else {
                i = screenWidth + i2;
            }
            screenWidth = i - width2;
        }
        contianer.setX(screenWidth);
    }
}

package com.xiaomi.fitness.sport_capture.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.sport_capture.utils.SportStatusUtils;
import defpackage.d1j;
import defpackage.ded;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0004J\u001d\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\t¢\u0006\u0004\b#\u0010\u001eJ\u0015\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u001eJ!\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\u0018H&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0018¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\t¢\u0006\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/widgets/BaseSportStatusInfoView;", "Landroid/widget/FrameLayout;", "", "getTimeStr", "()Ljava/lang/String;", "Lkotlin/Pair;", "", "calcVideoDurationInfo", "()Lkotlin/Pair;", "", "hrSectionType", "needShowHrType", "(I)Z", "getDeviceModelNameStr", "hrSection", "getHrSectionStr", "(II)Ljava/lang/String;", "Lded$b;", "elevationInfo", "getAltitudeStr", "(Lded$b;)Ljava/lang/String;", "distance", "getDistanceStrInfo", "(I)Lkotlin/Pair;", "", "cend", "getADecendStr", "(F)Ljava/lang/String;", "calorie", "getCalorieStr", "(I)Ljava/lang/String;", "speed", "getSpeed", "(F)F", "slope", "getSlopeStr", "Lded;", "projectionData", "oriRotate", "", "render", "(Lded;F)V", "demoRandomSpeed", "()F", "demoHrSection", "()I", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "Ljava/text/SimpleDateFormat;", "simpleDateFormat", "Ljava/text/SimpleDateFormat;", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BaseSportStatusInfoView extends FrameLayout {

    @NotNull
    private final Context ctx;

    @NotNull
    private final SimpleDateFormat simpleDateFormat;

    public /* synthetic */ BaseSportStatusInfoView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static /* synthetic */ void render$default(BaseSportStatusInfoView baseSportStatusInfoView, ded dedVar, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: render");
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        baseSportStatusInfoView.render(dedVar, f);
    }

    @NotNull
    public final Pair<Boolean, String> calcVideoDurationInfo() {
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        SportStatusUtils sportStatusUtils = SportStatusUtils.INSTANCE;
        if (sportStatusUtils.getVideoStartTimeStamp() < 0) {
            return new Pair<>(Boolean.FALSE, "");
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - sportStatusUtils.getVideoStartTimeStamp()) / ((long) 1000);
        long j = 3600;
        long j2 = jCurrentTimeMillis / j;
        long j3 = jCurrentTimeMillis - (j * j2);
        long j4 = 60;
        long j5 = j3 / j4;
        long j6 = j3 - (j4 * j5);
        StringBuilder sb = new StringBuilder();
        if (j2 > 9) {
            objValueOf = Long.valueOf(j2);
        } else {
            objValueOf = "0" + j2;
        }
        sb.append(objValueOf);
        sb.append(":");
        if (j5 > 9) {
            objValueOf2 = Long.valueOf(j5);
        } else {
            objValueOf2 = "0" + j5;
        }
        sb.append(objValueOf2);
        sb.append(":");
        if (j6 > 9) {
            objValueOf3 = Long.valueOf(j6);
        } else {
            objValueOf3 = "0" + j6;
        }
        sb.append(objValueOf3);
        return new Pair<>(Boolean.TRUE, sb.toString());
    }

    public final int demoHrSection() {
        return new Random().nextInt(5) + 1;
    }

    public final float demoRandomSpeed() {
        return (float) ((Math.random() * ((double) 100)) + ((double) 1));
    }

    @NotNull
    public final String getADecendStr(float cend) {
        return String.valueOf((int) cend);
    }

    @NotNull
    public final String getAltitudeStr(@NotNull ded.b elevationInfo) {
        Intrinsics.checkNotNullParameter(elevationInfo, "elevationInfo");
        return String.valueOf((int) elevationInfo.c);
    }

    @NotNull
    public final String getCalorieStr(int calorie) {
        return String.valueOf(calorie);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    @NotNull
    public final String getDeviceModelNameStr() {
        int iIndexOf$default;
        WearableDeviceInfo deviceInfo;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String strSubstring = null;
        String name = (wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getName();
        String strSubstring2 = "";
        if (TextUtils.isEmpty(name)) {
            return "";
        }
        if (name != null) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) lowerCase, "xiaomi", 0, false, 6, (Object) null);
            } else {
                iIndexOf$default = -1;
            }
        } else {
            iIndexOf$default = -1;
        }
        if (iIndexOf$default <= -1) {
            Intrinsics.checkNotNull(name);
            return name;
        }
        StringBuilder sb = new StringBuilder();
        if (name != null) {
            strSubstring = name.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        int i = iIndexOf$default + 5;
        Intrinsics.checkNotNull(name);
        if (i != name.length()) {
            strSubstring2 = name.substring(iIndexOf$default + 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        }
        sb.append(strSubstring);
        sb.append(strSubstring2);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final Pair<String, String> getDistanceStrInfo(int distance) {
        if (distance <= 1000) {
            return new Pair<>(String.valueOf(distance), "M");
        }
        int i = distance / 1000;
        return new Pair<>(i + "." + ((distance - (i * 1000)) / 100), "KM");
    }

    @NotNull
    public final String getHrSectionStr(int hrSectionType, int hrSection) {
        return "";
    }

    @NotNull
    public final String getSlopeStr(int slope) {
        return String.valueOf(slope);
    }

    public final float getSpeed(float speed) {
        return speed;
    }

    @NotNull
    public final String getTimeStr() {
        String str = this.simpleDateFormat.format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final boolean needShowHrType(int hrSectionType) {
        return hrSectionType == 0;
    }

    public abstract void render(@NotNull ded projectionData, float oriRotate);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSportStatusInfoView(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        super(ctx, attributeSet);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.getDefault());
    }

    @NotNull
    public final String getHrSectionStr(int hrSection) {
        String string;
        if (hrSection == 1) {
            string = ApplicationExtKt.getApplication().getString(d1j.f14961b);
        } else if (hrSection == 2) {
            string = ApplicationExtKt.getApplication().getString(d1j.c);
        } else if (hrSection == 3) {
            string = ApplicationExtKt.getApplication().getString(d1j.d);
        } else if (hrSection != 4) {
            string = hrSection != 5 ? "" : ApplicationExtKt.getApplication().getString(d1j.f);
        } else {
            string = ApplicationExtKt.getApplication().getString(d1j.e);
        }
        Intrinsics.checkNotNull(string);
        return string;
    }
}

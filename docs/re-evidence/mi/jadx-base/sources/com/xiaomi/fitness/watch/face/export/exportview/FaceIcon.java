package com.xiaomi.fitness.watch.face.export.exportview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.yli;

/* JADX INFO: loaded from: classes10.dex */
public abstract class FaceIcon extends AppCompatImageView {
    public static int CURRENT_BORDER_PADDING = 0;
    public static int CUR_BORDER_WIDTH = 0;
    public static int ENTRANCE_SPACE = 0;
    public static int HEIGHT = 0;
    public static int INFO_HEIGHT = 0;
    public static float INFO_RADIUS = 0.0f;
    public static int INFO_WIDTH = 0;
    public static float K_SCALE_RATIO = 0.0f;
    public static int LIST_SPACE = 0;
    public static float ORI_HEIGHT = 0.0f;
    public static float ORI_RADIUS = 0.0f;
    public static float ORI_WIDTH = 0.0f;
    public static float RADIUS = 0.0f;
    public static float RATIO = 0.0f;
    private static float SCALE = 0.0f;
    public static float SIZE_RATE = 1.2f;
    public static final String TAG = "FaceIcon";
    public static int TYPE_ENTRANCE;
    public static int TYPE_MARKET_CATEGORY_ITEM;
    public static int TYPE_MARKET_COMMON_ITEM;
    public static int TYPE_MARKET_PHOTO_ITEM;
    public static int WIDTH;
    private static long lastConfigChangedTime;
    public int faceType;
    public boolean isDeviceTab;
    public boolean isPhotoPicker;
    public int location;
    public boolean mIsAodIcon;
    protected boolean mIsCurrent;
    public static float SCREEN_WIDTH = DisplayUtil.getScreenWidth();
    public static float ENTRANCE_MARGIN = AppUtil.getApp().getResources().getDimension(yli.f40302a);

    static {
        float fDip2px = DisplayUtil.dip2px(16.7f);
        INFO_RADIUS = fDip2px;
        RADIUS = fDip2px;
        int iRound = Math.round((SCREEN_WIDTH - DisplayUtil.dip2px(50.0f)) / 3.0f);
        WIDTH = iRound;
        HEIGHT = Math.round(iRound * SIZE_RATE);
        int iDip2px = DisplayUtil.dip2px(22.0f);
        LIST_SPACE = iDip2px;
        ENTRANCE_SPACE = iDip2px;
        CURRENT_BORDER_PADDING = DisplayUtil.dip2px(3.3f);
        CUR_BORDER_WIDTH = DisplayUtil.dip2px(1.3f);
        INFO_WIDTH = WIDTH;
        INFO_HEIGHT = HEIGHT;
        SCALE = DisplayUtil.getScreenDensity() / 3.0f;
        ORI_WIDTH = WIDTH;
        ORI_HEIGHT = HEIGHT;
        ORI_RADIUS = RADIUS;
        K_SCALE_RATIO = 0.58f;
        RATIO = 1.0f;
        lastConfigChangedTime = 0L;
        TYPE_ENTRANCE = 1;
        TYPE_MARKET_COMMON_ITEM = 2;
        TYPE_MARKET_PHOTO_ITEM = 3;
        TYPE_MARKET_CATEGORY_ITEM = 4;
        setProperty(null);
    }

    public FaceIcon(Context context) {
        this(context, null, 0);
    }

    private static int getCurrentListCount() {
        StringBuilder sb = new StringBuilder();
        sb.append("getCurrentListCount posture: ");
        SettingsPropertiesUtil settingsPropertiesUtil = SettingsPropertiesUtil.INSTANCE;
        sb.append(settingsPropertiesUtil.getPosture(AppUtil.getApp()));
        Logger.i(TAG, sb.toString());
        return (!SystemProperties.INSTANCE.isFoldDisplay() || settingsPropertiesUtil.isFolded(ApplicationExtKt.getApplication())) ? 3 : 5;
    }

    public static int getScaledSize(float f) {
        return (int) ((f * SCALE) + 0.5f);
    }

    public static boolean isCircle() {
        return SIZE_RATE == 1.0f && Math.abs(((float) WIDTH) - (INFO_RADIUS * 2.0f)) <= 5.0f;
    }

    public static void setProperty(Product.Size size) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        boolean zIsBandType = wearableDeviceModel.getDeviceInfo().isBandType();
        if (size == null) {
            size = DeviceModelExtKt.getSize(wearableDeviceModel);
        }
        if (size == null) {
            return;
        }
        Logger.i(TAG, "setProperty getStatic: screen_width=" + SCREEN_WIDTH + "; scale=" + SCALE);
        Logger.i(TAG, "setProperty: ratio=" + size.getRatio() + "; radius=" + size.getRadius() + "; height=" + size.getHeight() + "; width=" + size.getWidth() + "; android_scale:" + size.getAndroid_scale());
        ORI_WIDTH = (float) size.getWidth();
        ORI_HEIGHT = (float) size.getHeight();
        ORI_RADIUS = (float) size.getRadius();
        if (size.getAndroid_scale() != null) {
            float fFloatValue = size.getAndroid_scale().floatValue();
            size.setWidth((int) (size.getWidth() * fFloatValue));
            size.setHeight((int) (size.getHeight() * fFloatValue));
            size.setRadius((int) (size.getRadius() * fFloatValue));
            size.setRatio(fFloatValue > 0.0f ? size.getRatio() / fFloatValue : size.getRatio());
        }
        if (size.getRatio() > 0.0f) {
            RATIO = size.getRatio();
        }
        int currentListCount = getCurrentListCount();
        Logger.i(TAG, "setProperty listCount: " + currentListCount);
        if (size.getHeight() > 0 && size.getWidth() > 0) {
            SIZE_RATE = size.getHeight() / size.getWidth();
            float width = size.getWidth() * RATIO;
            float height = size.getHeight() * RATIO;
            float fMax = Math.max(size.getRadius(), 0) * RATIO;
            if (zIsBandType) {
                HEIGHT = ExtUtilsKt.getDp(Float.valueOf(126.7f));
            } else {
                HEIGHT = ExtUtilsKt.getDp(Float.valueOf(93.3f));
            }
            int i = HEIGHT;
            WIDTH = (int) ((i * width) / height);
            RADIUS = (int) ((i * fMax) / height);
            INFO_WIDTH = getScaledSize(size.getWidth());
            INFO_HEIGHT = getScaledSize(size.getHeight());
            INFO_RADIUS = getScaledSize(Math.max(size.getRadius(), 0));
        }
        ENTRANCE_SPACE = (int) ((((SCREEN_WIDTH - (WIDTH * currentListCount)) - (ENTRANCE_MARGIN * 2.0f)) / ((currentListCount - 1) * 2)) + 0.5f);
        Logger.i(TAG, "setProperty final: radius= " + RADIUS + "; info_radius= " + INFO_RADIUS + "; width=" + WIDTH + "; height= " + HEIGHT + "; info_width= " + INFO_WIDTH + "; info_height= " + INFO_HEIGHT + "; list_space= " + LIST_SPACE + "; entrance_margin= " + ENTRANCE_MARGIN);
        RectView.a();
    }

    public static synchronized void syncConfiguration() {
        try {
            boolean z = System.currentTimeMillis() - lastConfigChangedTime > 200 && ((float) DisplayUtil.getScreenWidth(AppUtil.getApp())) != SCREEN_WIDTH;
            Logger.d(TAG, "syncConfiguration are configurationChanged:" + z);
            if (z) {
                lastConfigChangedTime = System.currentTimeMillis();
                SCREEN_WIDTH = DisplayUtil.getScreenWidth(AppUtil.getApp());
                ENTRANCE_MARGIN = AppUtil.getApp().getResources().getDimension(yli.f40302a);
                setProperty(null);
                Logger.i(TAG, "syncConfiguration result:SCREEN_WIDTH =" + SCREEN_WIDTH + ", WIDTH=" + WIDTH + ", LIST_SPACE=" + LIST_SPACE + "; ENTRANCE_SPACE=" + ENTRANCE_SPACE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract int getH();

    public abstract float getRadius();

    public abstract int getW();

    public void isCurrent(boolean z) {
        this.mIsCurrent = z;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getW(), 1073741824), View.MeasureSpec.makeMeasureSpec(getH(), 1073741824));
    }

    public FaceIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FaceIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }
}

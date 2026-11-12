package com.huawei.hms.update.ui;

import android.content.Context;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* JADX INFO: loaded from: classes34.dex */
public class ButtonConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f16774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f16775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f16776c;
    int d;
    int e;
    Level f;

    enum Level {
        STRONG,
        ERROR,
        NORMAL
    }

    private ButtonConfig() {
    }

    public static ButtonConfig createDefault(Context context) {
        ButtonConfig buttonConfig = new ButtonConfig();
        if (context != null) {
            buttonConfig.f16774a = HwDialogUtil.a(context, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_pressed"));
            buttonConfig.f16775b = HwDialogUtil.a(context, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_normal"));
            buttonConfig.f16776c = HwDialogUtil.a(context, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_text_color"));
            buttonConfig.d = HwDialogUtil.a(context, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_text_color"));
            buttonConfig.e = context.getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_button_text_size"));
        }
        buttonConfig.f = Level.NORMAL;
        return buttonConfig;
    }

    public static ButtonConfig createWatch(Context context) {
        ButtonConfig buttonConfig = new ButtonConfig();
        if (context != null) {
            buttonConfig.f16774a = HwDialogUtil.a(context, ResourceLoaderUtil.getColorId("hw_cloud_watch_dialog_button_pressed"));
            buttonConfig.f16775b = HwDialogUtil.a(context, ResourceLoaderUtil.getColorId("hw_cloud_watch_dialog_button_normal"));
            buttonConfig.f16776c = HwDialogUtil.a(context, ResourceLoaderUtil.getColorId("hw_cloud_watch_dialog_button_text_color"));
            buttonConfig.d = HwDialogUtil.a(context, ResourceLoaderUtil.getColorId("hw_cloud_watch_dialog_button_text_color"));
            buttonConfig.e = context.getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_button_text_size"));
        }
        buttonConfig.f = Level.NORMAL;
        return buttonConfig;
    }
}

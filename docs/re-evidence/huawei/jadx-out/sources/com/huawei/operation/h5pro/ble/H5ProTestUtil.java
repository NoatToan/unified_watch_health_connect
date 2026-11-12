package com.huawei.operation.h5pro.ble;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.R;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqp;
import health.compact.a.SharedPreferenceManager;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class H5ProTestUtil {
    private static final String DEVELOP_TEST_PKG_NAME = "com.huawei.health.device.5aed8b97-1c8c-4d0c-a497-8d11c841ad7b";
    private static final String GPRS_BLOOD_PRESSURE_PKG_NAME = "com.huawei.health.device.5aed8b97-1c8c-4d0c-a497-8d11c841ad7e";
    private static final String GPRS_BLOOD_SUGAR_PKG_NAME = "com.huawei.health.device.5aed8b97-1c8c-4d0c-a497-8d11c841ad7d";
    private static final LinkedHashMap<String, String> GPRS_MAP = new LinkedHashMap<String, String>() { // from class: com.huawei.operation.h5pro.ble.H5ProTestUtil.1
        {
            put("开发接口测试应用（d7b）", "com.huawei.health.device.5aed8b97-1c8c-4d0c-a497-8d11c841ad7b");
            put("GPRS血糖模板应用（d7d）", H5ProTestUtil.GPRS_BLOOD_SUGAR_PKG_NAME);
            put("GPRS血压模板应用（d7e）", H5ProTestUtil.GPRS_BLOOD_PRESSURE_PKG_NAME);
            put("消息推送模板应用 （d7f）", H5ProTestUtil.MSG_PUSH_PKG_NAME);
        }
    };
    private static final String MSG_PUSH_PKG_NAME = "com.huawei.health.device.5aed8b97-1c8c-4d0c-a497-8d11c841ad7f";
    private static final String PKG_NAME_PREFIX = "com.huawei.health.device.";
    private static final String TAG = "PluginOperation_H5proTestUtil";
    private static final String TESTER_PKG_NAME = "com.huawei.health.device.5aed8b97-1c8c-4d0c-a497-8d11c841ad7b";
    private static final String VENDOR_MAN_PKG_NAME = "com.huawei.health.device.c2128114-ad6c-4999-a857-61be97f6fc13";
    private static String pkg;

    static /* synthetic */ void lambda$showGprsPkgChooseDialog$0(View view) {
    }

    private H5ProTestUtil() {
    }

    public static void startH5ProTest(Context context, H5ProLaunchOption.Builder builder, String str) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "ecology_device_module", "ecology_device_uuid");
        if (SharedPreferenceManager.g(context, "GPRS_TEST_KEY")) {
            LogUtil.a(TAG, "GPRS test");
            showGprsPkgChooseDialog(context, builder.build());
            return;
        }
        if (SharedPreferenceManager.g(context, "TESTER_TEST_KEY")) {
            LogUtil.a(TAG, "tester test");
            H5ProClient.startH5MiniProgram(context, "com.huawei.health.device.5aed8b97-1c8c-4d0c-a497-8d11c841ad7b", builder.build());
            return;
        }
        if (SharedPreferenceManager.g(context, "VENDOR_TEST_KEY")) {
            LogUtil.a(TAG, "vendor test");
            H5ProClient.startH5MiniProgram(context, VENDOR_MAN_PKG_NAME, builder.build());
        } else {
            if (!TextUtils.isEmpty(strE)) {
                String str2 = PKG_NAME_PREFIX + strE;
                LogUtil.a(TAG, "Use manually entered package name, packageName = ", str2);
                H5ProClient.startH5MiniProgram(context, str2, builder.build());
                return;
            }
            H5ProClient.startH5MiniProgram(context, str, builder.build());
        }
    }

    private static void showGprsPkgChooseDialog(final Context context, final H5ProLaunchOption h5ProLaunchOption) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        initDialogView(context, linearLayout);
        pkg = "com.huawei.health.device.5aed8b97-1c8c-4d0c-a497-8d11c841ad7b";
        linearLayout.getChildAt(0).setSelected(true);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(context);
        builder.d((View) linearLayout);
        builder.c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.operation.h5pro.ble.H5ProTestUtil$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                H5ProTestUtil.lambda$showGprsPkgChooseDialog$0(view);
            }
        });
        builder.d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.operation.h5pro.ble.H5ProTestUtil$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                H5ProTestUtil.lambda$showGprsPkgChooseDialog$1(context, h5ProLaunchOption, view);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.setCancelable(true);
        customViewDialogD.show();
    }

    static /* synthetic */ void lambda$showGprsPkgChooseDialog$1(Context context, H5ProLaunchOption h5ProLaunchOption, View view) {
        LogUtil.a(TAG, "select gprs pkg:", pkg);
        H5ProClient.startH5MiniProgram(context, pkg, h5ProLaunchOption);
    }

    private static void initDialogView(Context context, final LinearLayout linearLayout) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, qqp.a(context, 0.5f));
        for (final String str : GPRS_MAP.keySet()) {
            final HealthTextView healthTextView = new HealthTextView(context);
            healthTextView.setText(str);
            healthTextView.setTextColor(ContextCompat.getColorStateList(context, R.color.blood_pressure_subtab_item_text_color));
            healthTextView.setLayoutParams(layoutParams);
            healthTextView.setPadding(0, qqp.a(context, 10.0f), 0, qqp.a(context, 10.0f));
            healthTextView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.h5pro.ble.H5ProTestUtil$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    H5ProTestUtil.lambda$initDialogView$2(linearLayout, healthTextView, str, view);
                }
            });
            linearLayout.addView(healthTextView);
            View view = new View(context);
            view.setBackgroundColor(context.getColor(R.color.CS_divider_color));
            view.setLayoutParams(layoutParams2);
            linearLayout.addView(view);
        }
    }

    static /* synthetic */ void lambda$initDialogView$2(LinearLayout linearLayout, HealthTextView healthTextView, String str, View view) {
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            linearLayout.getChildAt(i).setSelected(false);
        }
        healthTextView.setSelected(true);
        pkg = GPRS_MAP.get(str);
    }
}

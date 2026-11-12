package com.huawei.healthcloud.plugintrack.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.util.AiSportExamDialogUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.HealthButtonBarLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.ScrollScaleView;
import com.huawei.up.model.UserInfomation;
import defpackage.izn;
import defpackage.njy;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public class AiSportExamDialogUtils {

    public interface DialogResultCallback {
        void executeResult(float f);
    }

    public static void e(final Context context, final DialogResultCallback dialogResultCallback) {
        if (context == null || dialogResultCallback == null) {
            LogUtil.j("Track_DialogUtils", "showSetHeightDialog context == null || resultCallback == null");
            return;
        }
        View viewInflate = View.inflate(context, R.layout.dialog_sport_exam_height, null);
        final AtomicReference<Float> atomicReferenceE = e(context, viewInflate, a());
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(context);
        builder.d(R.string.IDS_track_sure_height).a(viewInflate).d(R.string.IDS_contact_confirm, new DialogInterface.OnClickListener() { // from class: jwg
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogResultCallback.executeResult(((Float) atomicReferenceE.get()).floatValue());
            }
        }).a(R.string.IDS_highland_cancel, new DialogInterface.OnClickListener() { // from class: jwj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AiSportExamDialogUtils.c(dialogResultCallback, context, dialogInterface, i);
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        HealthButton healthButton = (HealthButton) customAlertDialogB.findViewById(com.huawei.health.servicesui.R.id.dialog_btn_positive);
        healthButton.setTextColor(ContextCompat.getColor(context, R.color.hwbutton_selector_text_emphasize_emui));
        healthButton.setBackgroundResource(com.huawei.health.servicesui.R.drawable.button_background_emphasize);
        ((HealthButtonBarLayout) customAlertDialogB.findViewById(com.huawei.health.servicesui.R.id.button_bar)).setDividerDrawable(ContextCompat.getDrawable(context, R.drawable.custom_dialog_divider_vertical_trusparent));
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    public static /* synthetic */ void c(DialogResultCallback dialogResultCallback, Context context, DialogInterface dialogInterface, int i) {
        dialogResultCallback.executeResult(0.0f);
        d(context);
    }

    private static float a() {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.j("Track_DialogUtils", "showSetHeightDialog userProfileMgrApi is null");
            return 170.0f;
        }
        UserInfomation userInfo = userProfileMgrApi.getUserInfo();
        if (userInfo == null) {
            LogUtil.j("Track_DialogUtils", "showSetHeightDialog userInfo is null");
            return 170.0f;
        }
        float height = userInfo.getHeight();
        if (izn.a(height)) {
            return 170.0f;
        }
        return height;
    }

    private static AtomicReference<Float> e(Context context, View view, float f) {
        ScrollScaleView scrollScaleView = (ScrollScaleView) view.findViewById(R.id.height_scale);
        final HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.height_text);
        ArrayList arrayList = new ArrayList();
        for (int i = 50; i <= 250; i++) {
            arrayList.add(UnitUtil.e(i, 1, 0));
        }
        scrollScaleView.setData(arrayList, 10, 40);
        scrollScaleView.setCustomStartColor(ContextCompat.getColor(context, R.color.common_colorAccent));
        scrollScaleView.setSelectedPosition(c(f, 50));
        healthTextView.setText(UnitUtil.e(f, 1, 1));
        final AtomicReference<Float> atomicReference = new AtomicReference<>(Float.valueOf(f));
        scrollScaleView.setOnSelectedListener(new ScrollScaleView.OnSelectedListener() { // from class: jwf
            @Override // com.huawei.ui.commonui.scrollview.ScrollScaleView.OnSelectedListener
            public final void onSelected(List list, int i2) {
                AiSportExamDialogUtils.d(healthTextView, 50, atomicReference, i2);
            }
        });
        return atomicReference;
    }

    private static void d(Context context) {
        if (!(context instanceof Activity)) {
            context = BaseApplication.j();
        }
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    private static int c(float f, int i) {
        return ((int) BigDecimal.valueOf(f).subtract(BigDecimal.valueOf(i)).floatValue()) * 10;
    }

    public static void e(Context context, List<Integer> list, final DialogResultCallback dialogResultCallback) {
        if (dialogResultCallback == null) {
            LogUtil.j("Track_DialogUtils", "resultCallback context == null");
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        for (int i = 0; i <= 2; i++) {
            if (njy.e(arrayList, i)) {
                arrayList.add(0);
            }
        }
        if (context == null) {
            LogUtil.j("Track_DialogUtils", "showScoreConfirmDialog context == null");
            dialogResultCallback.executeResult(0.0f);
            return;
        }
        int iIntValue = ((Integer) Collections.max(arrayList)).intValue();
        View viewInflate = View.inflate(context, R.layout.dialog_sport_exam_jump_distance, null);
        a(viewInflate, arrayList);
        final AtomicReference<Float> atomicReferenceB = b(context, viewInflate, iIntValue);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(context);
        builder.c().setBackgroundResource(R.drawable.button_background_emphasize);
        builder.c().setTextColor(ContextCompat.getColor(context, R.color.textColorPrimaryInverse));
        builder.d(R.string.IDS_track_sure_score).a(viewInflate).d(R.string.IDS_contact_confirm, new DialogInterface.OnClickListener() { // from class: jwl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogResultCallback.executeResult(((Float) atomicReferenceB.get()).floatValue());
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    private static void a(View view, List<Integer> list) {
        c(list.get(0).intValue(), (HealthTextView) view.findViewById(R.id.first_jump_score));
        c(list.get(1).intValue(), (HealthTextView) view.findViewById(R.id.second_jump_score));
        c(list.get(2).intValue(), (HealthTextView) view.findViewById(R.id.third_jump_score));
    }

    private static void c(float f, HealthTextView healthTextView) {
        healthTextView.setText(BaseApplication.b().getResources().getQuantityString(R.plurals.IDS_cm_string, (int) f, UnitUtil.e(f, 1, 1)));
    }

    private static AtomicReference<Float> b(Context context, View view, int i) {
        ScrollScaleView scrollScaleView = (ScrollScaleView) view.findViewById(R.id.distance_scale);
        final HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.best_distance_text);
        healthTextView.setText(UnitUtil.e(i, 1, 1));
        ArrayList arrayList = new ArrayList();
        final int i2 = i - 10;
        for (int i3 = i2; i3 <= i + 10; i3++) {
            arrayList.add(UnitUtil.e(i3, 1, 0));
        }
        scrollScaleView.setData(arrayList, 10, 40);
        scrollScaleView.setCustomStartColor(ContextCompat.getColor(context, R.color.common_colorAccent));
        float f = i;
        scrollScaleView.setSelectedPosition(c(f, i2));
        final AtomicReference<Float> atomicReference = new AtomicReference<>(Float.valueOf(f));
        scrollScaleView.setOnSelectedListener(new ScrollScaleView.OnSelectedListener() { // from class: jwd
            @Override // com.huawei.ui.commonui.scrollview.ScrollScaleView.OnSelectedListener
            public final void onSelected(List list, int i4) {
                AiSportExamDialogUtils.d(healthTextView, i2, atomicReference, i4);
            }
        });
        return atomicReference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(HealthTextView healthTextView, int i, AtomicReference<Float> atomicReference, int i2) {
        BigDecimal scale = new BigDecimal(i + (i2 * 0.1f)).setScale(1, 4);
        atomicReference.set(Float.valueOf(scale.floatValue()));
        if (healthTextView != null) {
            healthTextView.setText(UnitUtil.e(scale.floatValue(), 1, 1));
        }
    }
}

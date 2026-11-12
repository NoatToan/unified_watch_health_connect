package com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.ecologydevice.R;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.health.ecologydevice.open.data.model.CommonUiResponse;
import com.huawei.health.ecologydevice.ui.dialog.SelectAdapter;
import com.huawei.health.ecologydevice.ui.dialog.SelectDialog;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ProgressListener;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.emh;
import defpackage.lon;
import defpackage.njy;
import defpackage.oer;
import defpackage.oet;
import defpackage.phw;
import defpackage.qpx;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.UnitUtil;
import java.io.File;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class MediaManager {
    public static final String ECOLOGY_DEVICE_DIR;
    private static final float FILE_SIZE_CALCULATION = 1024.0f;
    public static final float FILE_SIZE_CALCULATION_ROPE = 10.0f;
    private static final DecimalFormat FORMAT_FILE_SIZE;
    public static final String KEY_MEDIA_LIST = "key_media_list";
    public static final String KEY_MEDIA_TYPE = "key_media_type";
    public static final String KEY_REMAINING_MEMORY = "key_remaining_memory";
    public static final int MEDIA_TYPE_COURSE = 0;
    public static final int MEDIA_TYPE_PLAYLIST = 1;
    public static final int MIN_DELAY_TIME = 500;
    public static final String ROPE_GET_CONFIG = "/hw/course/getConfig";
    public static final String ROPE_GET_MUSIC_CONFIG = "/hw/course/getMusicConfig";
    public static final String ROPE_JSON_FILE;
    public static final String ROPE_MEDIA_COURSE_JSON = "course.json";
    public static final String ROPE_MEDIA_HIGH = "high";
    public static final String ROPE_MEDIA_MUSIC_JSON = "music.json";
    public static final String ROPE_MEDIA_STANDARD = "standard";
    public static final String SPACE = " ";
    private static final String TAG;
    private SelectDialog mDeviceSelectDialog;
    private NoTitleCustomAlertDialog mDownloadDialog;
    private NoTitleCustomAlertDialog mNoTitleCustomAlertDialog;

    public long getRopeMemoryConvertByte(long j) {
        return (long) (((j * FILE_SIZE_CALCULATION) * FILE_SIZE_CALCULATION) / 10.0f);
    }

    static {
        String strG = CommonUtils.g("ecologydevice");
        ECOLOGY_DEVICE_DIR = strG;
        ROPE_JSON_FILE = strG + "/ropejsonfile";
        TAG = "MediaManager";
        FORMAT_FILE_SIZE = new DecimalFormat("###.#");
    }

    public void downloadJsonFile(final int i, boolean z, final CommonUiResponse<String> commonUiResponse) {
        File file = new File(ROPE_JSON_FILE, i == 0 ? ROPE_MEDIA_COURSE_JSON : ROPE_MEDIA_MUSIC_JSON);
        if (file.exists() && file.length() > 0 && z) {
            LogUtil.a(TAG, "file exists and existNotDownload is true");
            return;
        }
        if (file.getParentFile().exists() || file.mkdirs()) {
            ProgressListener<File> progressListener = new ProgressListener<File>() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.MediaManager.1
                @Override // com.huawei.networkclient.ProgressListener
                public void onProgress(long j, long j2, boolean z2) {
                }

                @Override // com.huawei.networkclient.ProgressListener
                public void onFinish(File file2) {
                    LogUtil.a(MediaManager.TAG, "downloadJsonFile onFinish");
                    CommonUiResponse commonUiResponse2 = commonUiResponse;
                    if (commonUiResponse2 == null) {
                        MediaManager.this.getMediaDataFromJson(i);
                    } else {
                        commonUiResponse2.onResponse(0, "");
                    }
                }

                @Override // com.huawei.networkclient.ProgressListener
                public void onFail(Throwable th) {
                    LogUtil.a(MediaManager.TAG, "downloadJsonFile onFail, throwable.getMessage() = ", th.getMessage());
                    CommonUiResponse commonUiResponse2 = commonUiResponse;
                    if (commonUiResponse2 != null) {
                        commonUiResponse2.onResponse(-1, th.getMessage());
                    }
                }
            };
            StringBuilder sb = new StringBuilder();
            sb.append(lon.c().d("domain_rope_course"));
            sb.append(i == 0 ? ROPE_GET_CONFIG : ROPE_GET_MUSIC_CONFIG);
            oet.d().a(new oer(sb.toString(), null, file, progressListener));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getMediaDataFromJson(int i) {
        CourseModel courseModel;
        String strE = phw.e(new File(ROPE_JSON_FILE, i == 0 ? ROPE_MEDIA_COURSE_JSON : ROPE_MEDIA_MUSIC_JSON));
        if (TextUtils.isEmpty(strE) || (courseModel = (CourseModel) new Gson().fromJson(strE, new TypeToken<CourseModel>() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.MediaManager.2
        }.getType())) == null) {
            return;
        }
        int dimensionPixelOffset = BaseApplication.getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_64dp);
        Glide.with(BaseApplication.getContext()).load(courseModel.getBannerImgUrl()).into(dimensionPixelOffset, dimensionPixelOffset);
        if (njy.e(courseModel.getCourses())) {
            return;
        }
        Iterator<CourseModel.Course> it = courseModel.getCourses().iterator();
        while (it.hasNext()) {
            Glide.with(BaseApplication.getContext()).load(it.next().getSmallImgUrl()).into(dimensionPixelOffset, dimensionPixelOffset);
        }
    }

    public void showDownloadDialog(Context context, int i, long j, long j2, final CommonUiResponse<String> commonUiResponse) {
        NoTitleCustomAlertDialog.Builder builderA;
        String string;
        if (context == null || commonUiResponse == null) {
            LogUtil.j(TAG, "showDownloadDialog context or callback is null");
            return;
        }
        if (!CommonUtil.ab(context)) {
            LogUtil.j(TAG, "showDownloadDialog network not connect");
            qpx.b(context, R.string.IDS_network_check);
            return;
        }
        if (isRopeDeviceConnected(context)) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.MediaManager$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m1084x7a07990d(view);
                }
            };
            if (j < j2) {
                if (i == 0) {
                    string = context.getString(R.string.IDS_rope_download_course_memory);
                } else {
                    string = context.getString(R.string.IDS_rope_download_music_memory);
                }
                builderA = new NoTitleCustomAlertDialog.Builder(context).a(string).a(R.string.IDS_settings_button_cancal, onClickListener);
            } else if (!NetworkUtil.k()) {
                builderA = new NoTitleCustomAlertDialog.Builder(context).a(context.getString(R.string.IDS_rope_traffic_remind, context.getResources().getQuantityString(R.plurals.IDS_device_upgrade_file_size_mb, 0, getByteConvertMb(j2)))).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.MediaManager$$ExternalSyntheticLambda4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.m1085x792e286c(commonUiResponse, view);
                    }
                }).a(R.string.IDS_settings_button_cancal, onClickListener);
            } else {
                commonUiResponse.onResponse(0, "");
                return;
            }
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builderA.c();
            this.mDownloadDialog = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.show();
        }
    }

    /* JADX INFO: renamed from: lambda$showDownloadDialog$0$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-mediamanager-MediaManager, reason: not valid java name */
    /* synthetic */ void m1084x7a07990d(View view) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.mDownloadDialog;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.mDownloadDialog = null;
        } else {
            LogUtil.j(TAG, "showDownloadDialog mDeleteDialog setNegativeButton null");
        }
    }

    /* JADX INFO: renamed from: lambda$showDownloadDialog$1$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-mediamanager-MediaManager, reason: not valid java name */
    /* synthetic */ void m1085x792e286c(CommonUiResponse commonUiResponse, View view) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.mDownloadDialog;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.mDownloadDialog = null;
            commonUiResponse.onResponse(0, "");
            return;
        }
        LogUtil.j(TAG, "showDownloadDialog mDeleteDialog setPositiveButton null");
    }

    public void setImageHeight(Context context, int i, float f, HealthImageView healthImageView) {
        if (context == null || healthImageView == null) {
            LogUtil.j(TAG, "setImageHeight context or imageView is null");
            return;
        }
        Object systemService = context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.e(TAG, "object is invalid type");
            return;
        }
        WindowManager windowManager = (WindowManager) systemService;
        if (windowManager == null) {
            LogUtil.e(TAG, "windowManager is null");
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) ((windowManager.getDefaultDisplay().getWidth() - (i + i)) * f));
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(i);
        healthImageView.setLayoutParams(layoutParams);
    }

    public void showRadioButtonSelectDialog(Context context, LinkedHashMap<String, String> linkedHashMap, final CommonUiResponse<String> commonUiResponse) {
        if (context == null || linkedHashMap == null || commonUiResponse == null) {
            LogUtil.j(TAG, "showRadioButtonSelectDialog context or hashMap or callback is null");
            return;
        }
        SelectDialog selectDialogA = new SelectDialog.Builder(context).c(linkedHashMap).a(R.string.IDS_settings_button_ok, new SelectAdapter.OnItemClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.MediaManager$$ExternalSyntheticLambda0
            @Override // com.huawei.health.ecologydevice.ui.dialog.SelectAdapter.OnItemClickListener
            public final void onItemClick(String str) {
                this.f$0.m1088xd0e3b93e(commonUiResponse, str);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.MediaManager.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MediaManager.this.mDeviceSelectDialog != null) {
                    MediaManager.this.mDeviceSelectDialog.dismiss();
                    MediaManager.this.mDeviceSelectDialog = null;
                } else {
                    LogUtil.j(MediaManager.TAG, "showRadioButtonSelectDialog setNegativeButton is null");
                }
            }
        }).a();
        this.mDeviceSelectDialog = selectDialogA;
        selectDialogA.show();
    }

    /* JADX INFO: renamed from: lambda$showRadioButtonSelectDialog$2$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-mediamanager-MediaManager, reason: not valid java name */
    /* synthetic */ void m1088xd0e3b93e(CommonUiResponse commonUiResponse, String str) {
        SelectDialog selectDialog = this.mDeviceSelectDialog;
        if (selectDialog != null) {
            selectDialog.dismiss();
            this.mDeviceSelectDialog = null;
            commonUiResponse.onResponse(0, str);
            return;
        }
        LogUtil.j(TAG, "showRadioButtonSelectDialog setPositiveButton is null");
    }

    public LinkedHashMap<String, String> getSelectHashMap(Context context) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (context == null) {
            return linkedHashMap;
        }
        linkedHashMap.put(ROPE_MEDIA_STANDARD, context.getResources().getString(R.string.IDS_rope_media_standard));
        linkedHashMap.put("high", context.getResources().getString(R.string.IDS_rope_media_high));
        return linkedHashMap;
    }

    public void showNoTitleCustomAlertDialog(Context context, int i, int i2, final CommonUiResponse<String> commonUiResponse) {
        if (context == null || commonUiResponse == null) {
            LogUtil.j(TAG, "showNoTitleCustomAlertDialog context or callback is null");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).b(i).c(i2, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.MediaManager$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1086x8df7e9de(commonUiResponse, view);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.MediaManager$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1087x8d1e793d(view);
            }
        }).c();
        this.mNoTitleCustomAlertDialog = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: renamed from: lambda$showNoTitleCustomAlertDialog$3$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-mediamanager-MediaManager, reason: not valid java name */
    /* synthetic */ void m1086x8df7e9de(CommonUiResponse commonUiResponse, View view) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.mNoTitleCustomAlertDialog;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.mNoTitleCustomAlertDialog = null;
            commonUiResponse.onResponse(0, "");
            return;
        }
        LogUtil.j(TAG, "showNoTitleCustomAlertDialog setPositiveButton null");
    }

    /* JADX INFO: renamed from: lambda$showNoTitleCustomAlertDialog$4$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-mediamanager-MediaManager, reason: not valid java name */
    /* synthetic */ void m1087x8d1e793d(View view) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.mNoTitleCustomAlertDialog;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.mNoTitleCustomAlertDialog = null;
        } else {
            LogUtil.j(TAG, "showNoTitleCustomAlertDialog setNegativeButton null");
        }
    }

    public String getByteConvertMb(long j) {
        return FORMAT_FILE_SIZE.format(j / 1048576.0f);
    }

    public String getRopeMemoryConvertMb(long j) {
        return FORMAT_FILE_SIZE.format(j / 10.0f);
    }

    public SpannableString getSpannableString(Context context, String str, String str2) {
        if (context == null) {
            LogUtil.j(TAG, "getSpannableString context null");
            return null;
        }
        return UnitUtil.b(context, str, str2, R.style.img_data_items_big, R.style.img_data_items);
    }

    public boolean isRopeDeviceConnected(Context context) {
        boolean zG = emh.b().g();
        if (!zG && context != null) {
            LogUtil.j(TAG, "Rope Device disconnect");
            qpx.e(context, R.string.IDS_bolt_bluetooth_disconnected);
        }
        return zG;
    }

    public boolean isHasMediaSelected(List<CourseModel.Course> list) {
        if (njy.e(list)) {
            return false;
        }
        Iterator<CourseModel.Course> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isCheckboxCheck()) {
                return true;
            }
        }
        return false;
    }

    public boolean isAllSelected(boolean z, List<CourseModel.Course> list) {
        if (njy.e(list)) {
            return false;
        }
        for (CourseModel.Course course : list) {
            if (z && course.getStatus() < 2 && !course.isCheckboxCheck()) {
                return false;
            }
            if (!z && course.getStatus() >= 2 && !course.isCheckboxCheck()) {
                return false;
            }
            LogUtil.j(TAG, "isAllSelected else");
        }
        return true;
    }

    public int getIntValue(HashMap<Integer, Object> map, int i) {
        if (map.get(Integer.valueOf(i)) == null || !(map.get(Integer.valueOf(i)) instanceof Integer)) {
            return 0;
        }
        return ((Integer) map.get(Integer.valueOf(i))).intValue();
    }
}

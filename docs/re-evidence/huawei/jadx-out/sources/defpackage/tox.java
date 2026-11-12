package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomStateDialog;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.main.stories.guide.interactors.GuideInteractors;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class tox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static CustomAlertDialog f49458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AnimationDrawable f49459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static CustomAlertDialog f49460c;
    private static AnimationDrawable e;

    public static void b(final Activity activity, final DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("DeviceUseGuide", "showUserGuideDialog, currentDeviceInfo is null");
        } else if (deviceInfo.getProductType() == 275) {
            LogUtil.j("DeviceUseGuide", "showUserGuideDialog, currentDeviceInfo is maca");
        } else {
            final String strJ = lvi.j(deviceInfo.getProductType());
            ThreadPoolManager.c().execute(new Runnable() { // from class: tox.5
                @Override // java.lang.Runnable
                public void run() {
                    edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
                    if (pluginInfoByUuid == null) {
                        LogUtil.j("DeviceUseGuide", "ezPluginInfo is null");
                        return;
                    }
                    boolean zE = rgd.d(deviceInfo, false).e();
                    ArrayList arrayList = new ArrayList();
                    List<List<String>> listD = eep.d(pluginInfoByUuid);
                    if (zE) {
                        for (List<String> list : listD) {
                            if (list.size() >= 2) {
                                arrayList.add(list.get(1));
                            }
                        }
                    } else {
                        arrayList.addAll(eep.a(pluginInfoByUuid, "guide_data", ""));
                    }
                    tox.c(activity, deviceInfo, strJ, pluginInfoByUuid, arrayList);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final Activity activity, final DeviceInfo deviceInfo, final String str, edl edlVar, final ArrayList<String> arrayList) {
        final List<List<String>> listD = eep.d(edlVar, "guide_data", "");
        final ArrayList<String> arrayListB = eep.b(edlVar, "guide_data", "");
        if (activity != null && deviceInfo != null) {
            eep.e(edlVar, deviceInfo.getHiLinkDeviceId(), arrayListB, arrayList, listD);
        }
        if (arrayList == null || arrayList.isEmpty() || arrayList.size() != listD.size()) {
            LogUtil.j("DeviceUseGuide", "guide description is null, is do not support guide dialog");
            return;
        }
        final int iE = eep.e(edlVar);
        final int iA = eep.a(edlVar);
        activity.runOnUiThread(new Runnable() { // from class: tox.1
            @Override // java.lang.Runnable
            public void run() {
                CustomStateDialog.Builder builder = new CustomStateDialog.Builder(activity);
                builder.e(str).e(arrayListB).a(arrayList).c(listD).d(iE);
                CustomStateDialog customStateDialogA = builder.a(iA);
                customStateDialogA.setCanceledOnTouchOutside(false);
                if (customStateDialogA.isShowing() || activity.isFinishing()) {
                    return;
                }
                customStateDialogA.show();
                new GuideInteractors(activity).c(erh.d(deviceInfo.getDeviceIdentify()));
            }
        });
    }

    public static void c(Activity activity, Context context, DeviceInfo deviceInfo) {
        CustomAlertDialog customAlertDialog = f49460c;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            LogUtil.j("DeviceUseGuide", "mEarCustomDialog isShowing");
        } else {
            ThreadPoolManager.c().execute(new AnonymousClass2(context, deviceInfo, activity));
        }
    }

    /* JADX INFO: renamed from: tox$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f49464a;
        final /* synthetic */ DeviceInfo d;
        final /* synthetic */ Context e;

        AnonymousClass2(Context context, DeviceInfo deviceInfo, Activity activity) {
            this.e = context;
            this.d = deviceInfo;
            this.f49464a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.ear_muff_dialog_content_layout, (ViewGroup) null);
            ((HealthTextView) viewInflate.findViewById(R.id.ear_muff_title)).setText(R.string.IDS_ear_remove_title);
            ((HealthTextView) viewInflate.findViewById(R.id.ear_muff_content)).setText(R.string.IDS_ear_remove_content);
            View viewInflate2 = LayoutInflater.from(this.e).inflate(R.layout.ear_muff_dialog_content_layout, (ViewGroup) null);
            ((HealthTextView) viewInflate2.findViewById(R.id.ear_muff_title)).setText(R.string.IDS_ear_install_title);
            ((HealthTextView) viewInflate2.findViewById(R.id.ear_muff_content)).setText(R.string.IDS_ear_install_content);
            tox.d(viewInflate, viewInflate2, this.d);
            final View viewInflate3 = LayoutInflater.from(this.e).inflate(R.layout.ear_muff_viewpager, (ViewGroup) null);
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(viewInflate);
            arrayList.add(viewInflate2);
            HealthViewPager healthViewPager = (HealthViewPager) viewInflate3.findViewById(R.id.viewpager);
            healthViewPager.setAdapter(new tli(arrayList));
            healthViewPager.setCurrentItem(0);
            healthViewPager.setIsAutoHeight(true);
            HealthDotsPageIndicator healthDotsPageIndicator = (HealthDotsPageIndicator) viewInflate3.findViewById(R.id.indicator);
            healthDotsPageIndicator.setRtlEnable(true);
            healthDotsPageIndicator.setViewPager(healthViewPager);
            tox.d(healthViewPager, arrayList);
            final Activity activity = this.f49464a;
            final Context context = this.e;
            activity.runOnUiThread(new Runnable() { // from class: tow
                @Override // java.lang.Runnable
                public final void run() {
                    tox.d(activity, context, viewInflate3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(HealthViewPager healthViewPager, final ArrayList<View> arrayList) {
        healthViewPager.setOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: tox.4
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                LogUtil.d("DeviceUseGuide", "onPageScrolled position ", Integer.valueOf(i));
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (i < 0 || i >= arrayList.size()) {
                    LogUtil.j("DeviceUseGuide", "onPageSelected position error:", Integer.valueOf(i));
                    return;
                }
                LogUtil.a("DeviceUseGuide", "onPageSelected position ", Integer.valueOf(i));
                if (i == 0) {
                    if (tox.e != null) {
                        tox.e.stop();
                    }
                    if (tox.f49459b != null) {
                        if (tox.f49459b.isRunning()) {
                            tox.f49459b.stop();
                        }
                        tox.f49459b.start();
                        return;
                    }
                    return;
                }
                if (tox.f49459b != null) {
                    tox.f49459b.stop();
                }
                if (tox.e != null) {
                    if (tox.e.isRunning()) {
                        tox.e.stop();
                    }
                    tox.e.start();
                }
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                LogUtil.d("DeviceUseGuide", "in onPageScrollStateChanged", Integer.valueOf(i));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(View view, View view2, DeviceInfo deviceInfo) {
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(deviceInfo.getProductType()));
        if (pluginInfoByUuid == null) {
            LogUtil.j("DeviceUseGuide", "ezPluginInfo is null");
            return;
        }
        AnimationDrawable animationDrawableB = b(pluginInfoByUuid, 6, view, R.id.ear_muff_image);
        f49459b = animationDrawableB;
        if (animationDrawableB == null) {
            return;
        }
        animationDrawableB.setOneShot(false);
        f49459b.start();
        AnimationDrawable animationDrawableB2 = b(pluginInfoByUuid, 5, view2, R.id.ear_muff_image);
        e = animationDrawableB2;
        if (animationDrawableB2 == null) {
            return;
        }
        animationDrawableB2.setOneShot(false);
        e.start();
    }

    private static AnimationDrawable b(edl edlVar, int i, View view, int i2) {
        ArrayList<String> arrayListB = eep.b(edlVar, i);
        if (arrayListB == null) {
            LogUtil.j("DeviceUseGuide", "imageList is null");
            return null;
        }
        AnimationDrawable animationDrawable = new AnimationDrawable();
        LogUtil.a("DeviceUseGuide", "imageList size is:", Integer.valueOf(arrayListB.size()));
        Iterator<String> it = arrayListB.iterator();
        while (it.hasNext()) {
            Bitmap bitmapC = c(edlVar, it.next());
            if (bitmapC != null) {
                animationDrawable.addFrame(new BitmapDrawable(bitmapC), 100);
            }
        }
        ((ImageView) view.findViewById(i2)).setImageDrawable(animationDrawable);
        return animationDrawable;
    }

    private static Bitmap c(edl edlVar, String str) {
        return ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImagePath(pig.c().e(edlVar.c()) + File.separator + edlVar.c() + File.separator + "img" + File.separator + str + ".png");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Activity activity, Context context, View view) {
        LogUtil.a("DeviceUseGuide", "showDialogEarMuffDialog");
        CustomAlertDialog.Builder builderA = new CustomAlertDialog.Builder(context).a(R.string.IDS_common_notification_know_tips, new DialogInterface.OnClickListener() { // from class: tox.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (tox.f49460c != null) {
                    tox.f49460c.dismiss();
                    CustomAlertDialog unused = tox.f49460c = null;
                }
                if (tox.e != null) {
                    tox.e.stop();
                    AnimationDrawable unused2 = tox.e = null;
                }
                if (tox.f49459b != null) {
                    tox.f49459b.stop();
                    AnimationDrawable unused3 = tox.f49459b = null;
                }
            }
        });
        f49460c = builderA.b();
        builderA.a(view);
        f49460c.setCancelable(false);
        if (f49460c.isShowing() || activity == null || activity.isFinishing()) {
            return;
        }
        f49460c.show();
    }

    public static void e(Activity activity, Context context, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("DeviceUseGuide", "showDialogRateReminder current device info is null");
            return;
        }
        if (eel.a(deviceInfo.getProductType())) {
            LogUtil.a("DeviceUseGuide", "isAw70ProHuaweiDevice");
        } else if (eel.b(deviceInfo.getProductType())) {
            LogUtil.a("DeviceUseGuide", "isAw70ProDevice");
        } else {
            a(activity, context, deviceInfo);
        }
    }

    private static void a(Activity activity, Context context, DeviceInfo deviceInfo) {
        boolean z;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.fragment_set_rate_reminder_dialog, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.fragment_set_rate_reminder_dialog_image);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.fragment_set_rate_reminder_dialog_text);
        if (deviceInfo.getProductType() == 3 || deviceInfo.getProductType() == 10 || deviceInfo.getProductType() == 8) {
            imageView.setImageResource(R.drawable.home_set_rate_watch_remider_image);
            healthTextView.setText(R.string.IDS_main_homefragment_rate_reminder_watch_text);
        } else if (d(deviceInfo)) {
            imageView.setImageResource(R.drawable.home_set_rate_band_remider_image);
            healthTextView.setText(R.string.IDS_main_homefragment_rate_reminder_band_text);
        } else {
            if (eel.e(deviceInfo.getProductType())) {
                imageView.setImageResource(R.mipmap.pic_runing_schema);
                healthTextView.setText(R.string.IDS_aw_running_mode_describe_dialog);
                z = false;
            } else if (!c(deviceInfo.getProductType(), imageView, healthTextView)) {
                return;
            }
            ThreadPoolManager.c().execute(new AnonymousClass7(z, deviceInfo, activity, context, viewInflate));
        }
        z = true;
        ThreadPoolManager.c().execute(new AnonymousClass7(z, deviceInfo, activity, context, viewInflate));
    }

    /* JADX INFO: renamed from: tox$7, reason: invalid class name */
    class AnonymousClass7 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f49466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f49467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f49468c;
        final /* synthetic */ Activity d;
        final /* synthetic */ DeviceInfo e;

        AnonymousClass7(boolean z, DeviceInfo deviceInfo, Activity activity, Context context, View view) {
            this.f49466a = z;
            this.e = deviceInfo;
            this.d = activity;
            this.f49468c = context;
            this.f49467b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tox.e(this.f49466a, this.e)) {
                return;
            }
            final Activity activity = this.d;
            final Context context = this.f49468c;
            final View view = this.f49467b;
            activity.runOnUiThread(new Runnable() { // from class: toy
                @Override // java.lang.Runnable
                public final void run() {
                    tox.b(activity, context, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(boolean z, DeviceInfo deviceInfo) {
        if (!z) {
            return false;
        }
        if (!eep.c(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(deviceInfo.getProductType())))) {
            return false;
        }
        LogUtil.a("DeviceUseGuide", "exist show guide page config");
        return true;
    }

    private static boolean c(int i, ImageView imageView, HealthTextView healthTextView) {
        if (imageView == null || healthTextView == null) {
            return false;
        }
        edl pluginInfoByDeviceType = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByDeviceType(i);
        int iAf = (pluginInfoByDeviceType == null || pluginInfoByDeviceType.i() == null) ? -1 : pluginInfoByDeviceType.i().af();
        if (iAf == 1) {
            imageView.setImageResource(R.drawable.home_set_rate_band_remider_image);
            healthTextView.setText(R.string.IDS_main_homefragment_rate_reminder_band_text);
            return true;
        }
        if (iAf != 2) {
            return false;
        }
        imageView.setImageResource(R.drawable.home_set_rate_watch_remider_image);
        healthTextView.setText(R.string.IDS_main_homefragment_rate_reminder_watch_text);
        return true;
    }

    private static boolean d(DeviceInfo deviceInfo) {
        return deviceInfo.getProductType() == 13 || deviceInfo.getProductType() == 15 || deviceInfo.getProductType() == 16 || deviceInfo.getProductType() == 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Activity activity, Context context, View view) {
        CustomAlertDialog.Builder builderA = new CustomAlertDialog.Builder(context).a(R.string.IDS_common_notification_know_tips, new DialogInterface.OnClickListener() { // from class: tox.8
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (tox.f49458a != null) {
                    tox.f49458a.dismiss();
                    CustomAlertDialog unused = tox.f49458a = null;
                }
            }
        });
        f49458a = builderA.b();
        builderA.a(view);
        f49458a.setCancelable(false);
        if (f49458a.isShowing() || activity.isFinishing()) {
            return;
        }
        f49458a.show();
    }

    public static void a(Activity activity, DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("R_DeviceUseGuide", "showXiaoYiDialog enter.");
        if (deviceInfo == null) {
            LogUtil.j("DeviceUseGuide", "showXiaoYiDialog, deviceInfo is null");
        } else {
            new tkn().d(activity, deviceInfo);
        }
    }
}

package com.huawei.ui.commonui.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ProgressListener;
import com.huawei.ui.commonui.utils.AnimResUtils;
import defpackage.lqb;
import defpackage.njy;
import defpackage.oer;
import defpackage.oet;
import defpackage.pia;
import defpackage.pil;
import defpackage.qqd;
import defpackage.qqf;
import defpackage.qqi;
import defpackage.qqt;
import defpackage.qrk;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes16.dex */
public class AnimResUtils {
    private static final String e = File.separator + "anim" + File.separator;

    public interface FrameCallback {
        void doFrame(Drawable drawable);

        void showLastFrame();
    }

    interface ResourceListener {
        void onFailed(Throwable th);

        void onReady(List<String> list);
    }

    public static final class AnimFrameHandler extends Handler {
        private static final HandlerCenter e = HandlerCenter.d("anim_res");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f23952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private FrameCallback f23953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AtomicInteger f23954c;
        private long d;
        private boolean i;
        private volatile Drawable j;

        public AnimFrameHandler(Looper looper, List<String> list, long j, Drawable drawable, FrameCallback frameCallback) {
            super(looper);
            this.f23952a = new ArrayList();
            this.f23954c = new AtomicInteger(0);
            this.f23952a.addAll(list);
            this.d = j;
            this.j = drawable;
            this.f23953b = frameCallback;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    LogUtil.e("AnimResUtils", "unknown msg = ", Integer.valueOf(message.what));
                    return;
                }
                if (!(message.obj instanceof Drawable)) {
                    LogUtil.e("AnimResUtils", "handle MSG_ANIM_FRAME_SKIP_ALL_FRAME failed msg.obj = ", message.obj);
                    return;
                }
                this.j = (Drawable) message.obj;
                removeMessages(0);
                this.i = true;
                this.f23953b.doFrame(this.j);
                return;
            }
            if (this.i) {
                return;
            }
            LogUtil.a("AnimResUtils", "show frame = ", this.j);
            this.f23953b.doFrame(this.j);
            final int iIncrementAndGet = this.f23954c.incrementAndGet();
            List<String> list = this.f23952a;
            if (iIncrementAndGet >= (list != null ? list.size() : 0)) {
                LogUtil.a("AnimResUtils", "showLastFrame");
                this.f23953b.showLastFrame();
            } else {
                sendMessageDelayed(Message.obtain(this, 0), this.d);
                e.c(new Runnable() { // from class: com.huawei.ui.commonui.utils.AnimResUtils.AnimFrameHandler.5
                    @Override // java.lang.Runnable
                    public void run() {
                        LogUtil.a("AnimResUtils", "fetch currentFrameIndex:", Integer.valueOf(iIncrementAndGet));
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (njy.c(AnimFrameHandler.this.f23952a, iIncrementAndGet)) {
                            String str = (String) AnimFrameHandler.this.f23952a.get(iIncrementAndGet);
                            AnimFrameHandler.this.j = AnimResUtils.a(str);
                            LogUtil.a("AnimResUtils", "fetch animPath = ", str, "  mNextFrame:", AnimFrameHandler.this.j);
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            if (jCurrentTimeMillis2 > AnimFrameHandler.this.d) {
                                LogUtil.e("AnimResUtils", "fetch animPath = ", str, ", exceed too long timeElapsed = ", Long.valueOf(jCurrentTimeMillis2), "ms, expected = ", Long.valueOf(AnimFrameHandler.this.d), "ms.");
                            }
                        }
                    }
                });
            }
        }
    }

    public static AnimFrameHandler c(List<String> list, Drawable drawable, long j, FrameCallback frameCallback) {
        if (njy.e(list)) {
            LogUtil.e("AnimResUtils", "scheduleFrameAnimation failed, animResPathList is empty!");
            return null;
        }
        AnimFrameHandler animFrameHandler = new AnimFrameHandler(Looper.getMainLooper(), list, j, drawable, frameCallback);
        animFrameHandler.sendEmptyMessage(0);
        return animFrameHandler;
    }

    public static Drawable a(String str) {
        return qqf.e(BaseApplication.getContext(), str);
    }

    private static List<qqi> b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        map.put("resources", str2);
        a aVar = (a) oet.d().e(str, b(), HiJsonUtil.d(new c("com.huawei.health_common_config", map)), a.class);
        if (aVar == null || aVar.b() != 0) {
            LogUtil.j("AnimResUtils", "getAnimResConfigList failed");
            return arrayList;
        }
        List<qqi> listA = aVar.a();
        if (njy.e(listA)) {
            LogUtil.j("AnimResUtils", "getAnimResConfigList failed, FileList is empty");
            return arrayList;
        }
        arrayList.addAll(listA);
        SharedPreferenceManager.c("threeCircleSp", "animConfigInfo", qqt.b(listA));
        SharedPreferenceManager.c("threeCircleSp", "getAnimConfigInfoTime", System.currentTimeMillis());
        return arrayList;
    }

    public static List<String> b(Context context, String str, ResInfo.Location location, d dVar) {
        String location2 = location.getLocation();
        ArrayList arrayList = new ArrayList();
        try {
            String str2 = context.getFilesDir().getCanonicalPath() + File.separator + location2 + e;
            d(str2);
            List<qqi> listE = c() ? e() : null;
            if (njy.e(listE)) {
                String noCheckUrl = GRSManager.c(context).getNoCheckUrl("domainHealthCloudCommon", GRSManager.c(context).getCommonCountryCode());
                if (TextUtils.isEmpty(noCheckUrl) || noCheckUrl == null) {
                    LogUtil.e("AnimResUtils", "fetchAnimation getUrl is empty or null.");
                    return arrayList;
                }
                listE = b(noCheckUrl + "/commonAbility/configCenter/getConfigInfo", location2 + "_resources");
            }
            String str3 = str + "_header";
            d dVarA = a(a(listE, str3), str2 + str3 + ".json", str3);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_res_wide_screen");
            arrayList.addAll(a(str2, e(context, listE, str + "_res", sb.toString()), dVarA));
            dVar.f23963a = dVarA.f23963a;
            dVar.d = dVarA.d;
            return arrayList;
        } catch (IOException e2) {
            LogUtil.e("AnimResUtils", "fetchAnimation failed, cause exception: ", e2.getMessage(), ", cause: ", e2.getCause());
            return arrayList;
        }
    }

    private static Map<String, String> b() {
        LogUtil.a("AnimResUtils", "enter getHeader");
        HashMap map = new HashMap();
        map.put("x-version", CommonUtil.c(BaseApplication.getContext()));
        map.put("Content-Type", "application/json; charset=utf-8");
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (!TextUtils.isEmpty(accountInfo)) {
            map.put("x-huid", accountInfo);
        }
        return map;
    }

    private static boolean c() {
        long jC = qrk.c(System.currentTimeMillis(), 0);
        long jD = SharedPreferenceManager.d("threeCircleSp", "getAnimConfigInfoTime", 0L);
        LogUtil.a("AnimResUtils", "isGetConfigInfoToday curDarStartTime:", Long.valueOf(jC), " lastTime:", Long.valueOf(jD));
        return jD > jC;
    }

    private static List<qqi> e() {
        LogUtil.a("AnimResUtils", "getConfigInfoFromLocal");
        return (List) qqt.c(SharedPreferenceManager.b("threeCircleSp", "animConfigInfo", ""), new TypeToken<List<qqi>>() { // from class: com.huawei.ui.commonui.utils.AnimResUtils.1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str) {
        File file = new File(str);
        if (file.exists() || !file.mkdirs()) {
            LogUtil.e("AnimResUtils", "checkAndMkdirs failed for rootDir = ", str);
        }
    }

    private static d a(qqi qqiVar, String str, String str2) {
        if (qqiVar == null) {
            return e(str);
        }
        String strB = SharedPreferenceManager.b("anim_resources_module", str2, "");
        String strD = qqiVar.d();
        if (!strB.equals(strD)) {
            if (!FileUtils.b(new File(str))) {
                LogUtil.e("AnimResUtils", "delete animHeaderPath = ", str, " failed!");
            }
            if (!lqb.d(qqiVar.c(), str)) {
                LogUtil.e("AnimResUtils", "fetchAnimHeader for animHeaderName = ", str2, "failed!");
                return e(str);
            }
            SharedPreferenceManager.c("anim_resources_module", str2, strD);
        }
        return e(str);
    }

    private static d e(String str) {
        d dVar = d.f23962c;
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            LogUtil.e("AnimResUtils", "createAnimHeaderFromFile failed, cause animHeaderPath = ", str, " not exists or is not file!");
            return dVar;
        }
        d dVar2 = (d) qqt.c(pia.a(file), new TypeToken<d>() { // from class: com.huawei.ui.commonui.utils.AnimResUtils.2
        }.getType());
        return dVar2 == null ? d.f23962c : dVar2;
    }

    private static qqi a(List<qqi> list, String str) {
        String strA;
        qqi qqiVar = null;
        if (njy.e(list)) {
            LogUtil.e("AnimResUtils", "extractAnimDownloadUrls extractConfigEntity failed, configEntityList is null!");
            return null;
        }
        for (qqi qqiVar2 : list) {
            if (qqiVar2 != null && (strA = qqiVar2.a()) != null && strA.equals(str)) {
                qqiVar = qqiVar2;
            }
        }
        return qqiVar;
    }

    private static List<qqi> e(Context context, List<qqi> list, String str, String str2) {
        List<qqi> listD = d(list, str);
        if (qrs.af(BaseApplication.getActivity())) {
            List<qqi> listD2 = d(list, str2);
            if (!njy.e(listD2)) {
                listD.clear();
                listD.addAll(listD2);
            }
        }
        Collections.sort(listD, new Comparator<qqi>() { // from class: com.huawei.ui.commonui.utils.AnimResUtils.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(qqi qqiVar, qqi qqiVar2) {
                if (qqiVar == null || qqiVar2 == null || qqiVar.a() == null || qqiVar2.a() == null) {
                    return 0;
                }
                return qqiVar.a().compareTo(qqiVar2.a());
            }
        });
        return listD;
    }

    private static List<qqi> d(List<qqi> list, String str) {
        String strA;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            LogUtil.e("AnimResUtils", "extractAnimDownloadUrls extractConfigEntityList failed, configEntityList is null!");
            return arrayList;
        }
        for (qqi qqiVar : list) {
            if (qqiVar != null && (strA = qqiVar.a()) != null) {
                if (Pattern.compile("^(" + str + ")(_\\d)*$").matcher(strA).find()) {
                    arrayList.add(qqiVar);
                }
            }
        }
        return arrayList;
    }

    private static int d(File file) {
        if (file == null) {
            return 0;
        }
        String name = file.getName();
        try {
            String[] strArrSplit = name.split("\\.")[0].split("_");
            return Integer.parseInt(strArrSplit[strArrSplit.length - 1]);
        } catch (Exception unused) {
            LogUtil.e("AnimResUtils", "getFileIndex failed, fileName = ", name, ", not match xxx_index.png format!", " fileName is ", name);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> a(File file) {
        String canonicalPath;
        ArrayList arrayList = new ArrayList();
        if (!file.isDirectory()) {
            LogUtil.e("AnimResUtils", "fetchAnimResList failed, cause animResDir = ", file.getAbsolutePath(), " is not directory");
            return arrayList;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            LogUtil.e("AnimResUtils", "fetchAnimResList failed, cause animResDir has no files");
            return arrayList;
        }
        Arrays.sort(fileArrListFiles, new Comparator() { // from class: qqh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AnimResUtils.a((File) obj, (File) obj2);
            }
        });
        for (File file2 : fileArrListFiles) {
            if (file2 != null) {
                try {
                    canonicalPath = file2.getCanonicalPath();
                } catch (IOException e2) {
                    LogUtil.e("AnimResUtils", "createAnimResListFromFile IOException happened exception = ", e2.getMessage(), ", cause = ", e2.getCause());
                    canonicalPath = "";
                }
                arrayList.add(canonicalPath);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ int a(File file, File file2) {
        if (file == null || file2 == null) {
            return 0;
        }
        return d(file) - d(file2);
    }

    private static List<String> a(String str, List<qqi> list, d dVar) {
        boolean zAwait;
        final ArrayList arrayList = new ArrayList(10);
        if (list == null) {
            LogUtil.j("AnimResUtils", "fetchAnimResList animResConfigEntityList is null");
            return arrayList;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        for (qqi qqiVar : list) {
            final String strA = qqiVar.a();
            String str2 = str + strA;
            d(strA, str2, str2 + ".zip", qqiVar, new ResourceListener() { // from class: com.huawei.ui.commonui.utils.AnimResUtils.3
                @Override // com.huawei.ui.commonui.utils.AnimResUtils.ResourceListener
                public void onReady(List<String> list2) {
                    arrayList.addAll((Collection) list2.stream().filter(new qqd()).collect(Collectors.toList()));
                    countDownLatch.countDown();
                }

                @Override // com.huawei.ui.commonui.utils.AnimResUtils.ResourceListener
                public void onFailed(Throwable th) {
                    LogUtil.e("AnimResUtils", "fetchAnimResList for animResName = ", strA, " failed! exception = ", ExceptionUtils.c(th));
                    countDownLatch.countDown();
                }
            });
        }
        try {
            zAwait = countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            LogUtil.e("AnimResUtils", "fetchAnimResList exception happened = ", ExceptionUtils.c(e2));
            zAwait = false;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.removeAll(Collections.singleton(null));
        if (!zAwait) {
            LogUtil.e("AnimResUtils", "fetchAnimResList time out!");
        }
        Collections.sort(arrayList2);
        int size = arrayList2.size();
        if (dVar.d > 0 && size != dVar.d) {
            LogUtil.e("AnimResUtils", "fetchAnimResList exception, cause animHeader.framesCount = ", Integer.valueOf(dVar.d), ", but frameCount = ", Integer.valueOf(size));
        }
        return arrayList2;
    }

    private static void d(String str, final String str2, String str3, final String str4, final String str5, final String str6, final ResourceListener resourceListener) {
        SharedPreferenceManager.c("anim_resources_module", str2, str3);
        oet.d().a(new oer(str, null, new File(str5), new ProgressListener<File>() { // from class: com.huawei.ui.commonui.utils.AnimResUtils.5
            @Override // com.huawei.networkclient.ProgressListener
            public void onProgress(long j, long j2, boolean z) {
            }

            @Override // com.huawei.networkclient.ProgressListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onFinish(File file) {
                LogUtil.a("AnimResUtils", "downloadAnimRes finish download file = ", file.getName());
                FileUtils.e(new File(str6));
                AnimResUtils.d(str6);
                if (pil.e(str5, str6 + File.separator) == -1) {
                    LogUtil.e("AnimResUtils", "downloadAnimRes unzip for downloadZipPath = ", str5, " to ", str6 + File.separator, " failed!");
                }
                if (!FileUtils.b(new File(str5))) {
                    LogUtil.e("AnimResUtils", "downloadAnimRes delete downloadZipPath = ", str5, " failed!");
                }
                resourceListener.onReady(AnimResUtils.a(new File(str6)));
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onFail(Throwable th) {
                LogUtil.e("AnimResUtils", "downloadAnimRes failed to download file = ", str5, ", exception = ", ExceptionUtils.c(th));
                SharedPreferenceManager.c("anim_resources_module", str2, str4);
                resourceListener.onFailed(th);
            }
        }));
    }

    private static void d(String str, String str2, String str3, qqi qqiVar, ResourceListener resourceListener) {
        File file = new File(str2);
        if (qqiVar == null) {
            resourceListener.onReady(a(file));
            return;
        }
        String strB = SharedPreferenceManager.b("anim_resources_module", str, "");
        String strD = qqiVar.d();
        if (!strB.equals(strD)) {
            d(qqiVar.c(), str, strD, strB, str3, str2, resourceListener);
        } else {
            resourceListener.onReady(a(file));
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final d f23962c = new d(-1, 33);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("frameDuration")
        private int f23963a;

        @SerializedName("framesCount")
        private int d;

        public d(int i, int i2) {
            this.d = i;
            this.f23963a = i2;
        }

        public d() {
        }

        public int b() {
            return this.f23963a;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("configId")
        private String f23959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("matchRules")
        private Map<String, String> f23960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("source")
        private int f23961c;

        @SerializedName("greyRules")
        private Map<String, Object> d;

        @SerializedName("ts")
        private long e;

        public c(String str, Map<String, String> map) {
            Objects.requireNonNull(str);
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("RequestBody", "configId is empty.");
                return;
            }
            this.e = System.currentTimeMillis();
            this.f23961c = 1;
            this.f23959a = str;
            this.f23960b = map;
        }
    }

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("fileList")
        private List<qqi> f23956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("resultDesc")
        private String f23957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("isFromCloud")
        private boolean f23958c;

        @SerializedName("resultCode")
        private int d;

        @SerializedName("duration")
        private int e;

        @SerializedName("resultType")
        private int h;

        public int b() {
            return this.d;
        }

        public List<qqi> a() {
            return this.f23956a;
        }
    }
}

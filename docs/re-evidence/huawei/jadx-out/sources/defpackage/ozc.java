package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.MedalInfo;
import com.huawei.pluginachievement.manager.model.MedalInfoDesc;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.ucd.helper.gles.Obj3DBufferLoadAider;
import com.huawei.ucd.medal.MedalBackType;
import com.huawei.ucd.medal.MedalView;
import com.huawei.up.api.UpApi;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class ozc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f45001b;
    private static long e;

    /* JADX WARN: Code duplicated, block: B:16:0x002a  */
    public static boolean c(Map<String, ArrayList<MedalInfoDesc>> map, int i) {
        ArrayList<MedalInfoDesc> arrayList;
        if (map == null) {
            LogUtil.j("PLGACHIEVE_AchieveSportMedalInitData", "isHaveSportMedals() secondTabRelationshipForSport == null");
            return false;
        }
        if (i == 264 || i == 10001 || i == 282 || i == 283) {
            arrayList = map.get(String.valueOf(i));
        } else {
            switch (i) {
                case 257:
                case 258:
                case 259:
                    arrayList = map.get(String.valueOf(i));
                    break;
                default:
                    arrayList = new ArrayList<>(10);
                    break;
            }
        }
        if (!njy.e(b(arrayList))) {
            return true;
        }
        LogUtil.j("PLGACHIEVE_AchieveSportMedalInitData", "isHaveSportMedals() medalTabInfoDesc isEmpty, sporttype = ", Integer.valueOf(i));
        return false;
    }

    public static boolean a() {
        String strE = osa.e(BaseApplication.getContext(), "sportMedalLastShowTime");
        long j = CommonUtil.j(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "hw_health_start_count_key"));
        if (j == 1) {
            LogUtil.j("PLGACHIEVE_AchieveSportMedalInitData", "setMedalFloatButton startCount = ", Long.valueOf(j));
            return false;
        }
        String strE2 = buh.e("is_reminder_dialog_click");
        if (!"true".equals(strE2)) {
            LogUtil.j("PLGACHIEVE_AchieveSportMedalInitData", "isFirstTimeOfDay isPushDataRemind = ", strE2);
            return false;
        }
        if (!TextUtils.isEmpty(strE) && !pap.b(qrs.f(strE), System.currentTimeMillis())) {
            return false;
        }
        osa.b(BaseApplication.getContext(), "sportMedalLastShowTime", String.valueOf(System.currentTimeMillis()));
        return true;
    }

    public static FrameLayout.LayoutParams d(Context context) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = GravityCompat.END;
        layoutParams.setMargins(layoutParams.leftMargin, (int) context.getResources().getDimension(R.dimen.hw_achieve_medal_size_264), 0, layoutParams.bottomMargin);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams c(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(context.getResources().getDimensionPixelOffset(com.huawei.ui.commonui.R.dimen.health_common_20dp), context.getResources().getDimensionPixelOffset(com.huawei.ui.commonui.R.dimen.health_common_20dp));
        layoutParams.topMargin = context.getResources().getDimensionPixelOffset(com.huawei.ui.commonui.R.dimen.health_common_5dp);
        layoutParams.addRule(3, com.huawei.ui.commonui.R.id.icon);
        if (LanguageUtil.ba(context)) {
            layoutParams.setMarginStart((int) context.getResources().getDimension(R.dimen.hw_achieve_medal_size_28));
            return layoutParams;
        }
        layoutParams.addRule(14);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams a(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins((int) context.getResources().getDimension(com.huawei.ui.commonui.R.dimen.emui_dimens_element_vertical_large), (int) context.getResources().getDimension(com.huawei.ui.commonui.R.dimen.emui_dimens_default_top), (int) context.getResources().getDimension(com.huawei.ui.commonui.R.dimen.emui_dimens_element_vertical_large), 0);
        return layoutParams;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    public static void e(Context context, Map<String, ArrayList<MedalInfoDesc>> map, int i, int i2) {
        ArrayList<MedalInfoDesc> arrayList;
        if (b() || context == null || map == null) {
            return;
        }
        if (i == 264 || i == 10001 || i == 282 || i == 283) {
            arrayList = map.get(String.valueOf(i));
        } else {
            switch (i) {
                case 257:
                case 258:
                case 259:
                    arrayList = map.get(String.valueOf(i));
                    break;
                default:
                    arrayList = new ArrayList<>(10);
                    break;
            }
        }
        e(context, b(arrayList), i2);
        e(String.valueOf(i));
    }

    private static List<MedalInfoDesc> b(ArrayList<MedalInfoDesc> arrayList) {
        return njy.e(arrayList) ? new ArrayList(10) : a(arrayList, d());
    }

    private static List<MedalInfoDesc> a(ArrayList<MedalInfoDesc> arrayList, List<String> list) {
        ArrayList arrayList2 = new ArrayList(10);
        if (list != null && !njy.e(arrayList)) {
            for (MedalInfoDesc medalInfoDesc : arrayList) {
                if (medalInfoDesc.acquireMedalType() != null && medalInfoDesc.acquireMedalType().length() < 3 && medalInfoDesc.acquireGainCount() <= 0 && !list.contains(medalInfoDesc.acquireMedalId()) && (pax.s(medalInfoDesc.acquireMedalId()) <= 19 || !b(medalInfoDesc.acquireMedalId()))) {
                    arrayList2.add(medalInfoDesc);
                    if (arrayList2.size() >= 5) {
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    private static boolean b(String str) {
        return !new File(pax.a(str, ParsedFieldTag.LIGHT_LIST_STYLE)).exists();
    }

    private static List<String> d() {
        ArrayList arrayList = new ArrayList(10);
        String strE = osa.e(BaseApplication.getContext(), "_sportGainMedalIdArray");
        if (TextUtils.isEmpty(strE)) {
            return arrayList;
        }
        LogUtil.a("PLGACHIEVE_AchieveSportMedalInitData", "dealNotUploadMedal=", strE);
        String[] strArrSplit = strE.split(",");
        return strArrSplit.length != 0 ? Arrays.asList(strArrSplit) : arrayList;
    }

    public static void e(Context context, List<MedalInfoDesc> list, int i) {
        if (context == null || njy.e(list)) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, PersonalData.CLASS_NAME_SPORT_MEDAL_VIEW);
        if (list instanceof Serializable) {
            intent.putExtra("sport_medal_record", (Serializable) list);
        }
        intent.putExtra("medal_sport_type_bi_click", String.valueOf(i));
        intent.setFlags(276824064);
        context.startActivity(intent);
        a(String.valueOf(i));
    }

    public static void e(String str) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("from", str);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.MEDAL_SPORT_2041090.value(), map, 0);
    }

    public static void a(String str) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("from", str);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.MEDAL_SPORT_2041091.value(), map, 0);
    }

    public static boolean b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - e < ProfileExtendConstants.TIME_OUT) {
            return true;
        }
        e = jElapsedRealtime;
        return false;
    }

    public static int a(String str, boolean z) {
        MedalInfo medalInfo = pas.d().d(true).get(str);
        if (medalInfo == null) {
            return 0;
        }
        if (z) {
            LogUtil.a("PLGACHIEVE_AchieveSportMedalInitData", "medalInfo getEnableResId is ", Integer.valueOf(medalInfo.getEnableResId()));
            return medalInfo.getEnableResId();
        }
        return medalInfo.getDisableResId();
    }

    public static String a(UserInfomation userInfomation) {
        if (userInfomation != null) {
            String name = userInfomation.getName();
            return TextUtils.isEmpty(name) ? new UpApi(BaseApplication.getContext()).getAccountName() : name;
        }
        return "";
    }

    public static void e(MedalInfoDesc medalInfoDesc, LinearLayout linearLayout, ImageView imageView) {
        if (medalInfoDesc == null) {
            return;
        }
        String strAcquireMedalId = medalInfoDesc.acquireMedalId();
        Bitmap bitmapA = pax.a(strAcquireMedalId, true, false);
        int iA = a(medalInfoDesc.acquireMedalTypeLevel(), true);
        String strC = osz.c(strAcquireMedalId);
        if (!ouk.a(BaseApplication.getContext(), strAcquireMedalId)) {
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
                return;
            } else {
                if (iA != 0) {
                    imageView.setImageResource(iA);
                    return;
                }
                return;
            }
        }
        LogUtil.d("PLGACHIEVE_AchieveSportMedalInitData", "3D medal");
        if (d(linearLayout, strC)) {
            return;
        }
        if (bitmapA == null) {
            imageView.setImageResource(iA);
        } else {
            imageView.setImageBitmap(bitmapA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v2 */
    private static boolean d(LinearLayout linearLayout, String str) throws Throwable {
        FileInputStream fileInputStream;
        ?? r3;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        FileInputStream fileInputStream4;
        ?? r4;
        FileInputStream fileInputStream5;
        FileInputStream fileInputStream6;
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("PLGACHIEVE_AchieveSportMedalInitData", "initMedal: untrusted -> " + str);
            return false;
        }
        String str2 = CommonUtil.c(str) + File.separator;
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("PLGACHIEVE_AchieveSportMedalInitData", "initMedal: path is empty");
            return false;
        }
        String str3 = str2 + "medal.tST";
        ?? r5 = str2 + "medal.nXYZ";
        String str4 = str2 + "medal.vXYZ";
        Bitmap bitmapD = d(str2 + "texture.jpg");
        FileInputStream fileInputStream7 = null;
        try {
            try {
                fileInputStream3 = new FileInputStream(str3);
                try {
                    FileInputStream fileInputStream8 = new FileInputStream((String) r5);
                    try {
                        fileInputStream6 = new FileInputStream(str4);
                        try {
                            d(fileInputStream3, fileInputStream8, fileInputStream6, bitmapD, linearLayout);
                            c(fileInputStream3, fileInputStream8, fileInputStream6);
                            return true;
                        } catch (FileNotFoundException unused) {
                            fileInputStream7 = fileInputStream8;
                            fileInputStream4 = fileInputStream6;
                            LogUtil.d("PLGACHIEVE_AchieveSportMedalInitData", " close InputStream is exception");
                            r5 = fileInputStream4;
                            c(fileInputStream3, fileInputStream7, r5);
                            return false;
                        } catch (OutOfMemoryError unused2) {
                            fileInputStream7 = fileInputStream8;
                            fileInputStream2 = fileInputStream6;
                            LogUtil.e("PLGACHIEVE_AchieveSportMedalInitData", "Obj3DBufferLoadAider.loadFromInputStream OutOfMemoryError");
                            r5 = fileInputStream2;
                            c(fileInputStream3, fileInputStream7, r5);
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream7 = fileInputStream8;
                            fileInputStream5 = fileInputStream6;
                            fileInputStream = fileInputStream7;
                            r4 = fileInputStream5;
                            fileInputStream7 = fileInputStream3;
                            r3 = r4;
                            c(fileInputStream7, fileInputStream, r3);
                            throw th;
                        }
                    } catch (FileNotFoundException unused3) {
                        fileInputStream6 = null;
                    } catch (OutOfMemoryError unused4) {
                        fileInputStream6 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream6 = null;
                    }
                } catch (FileNotFoundException unused5) {
                    fileInputStream4 = null;
                } catch (OutOfMemoryError unused6) {
                    fileInputStream2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream5 = null;
                }
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = fileInputStream7;
                r4 = r5;
            }
        } catch (FileNotFoundException unused7) {
            fileInputStream4 = null;
            fileInputStream3 = null;
        } catch (OutOfMemoryError unused8) {
            fileInputStream2 = null;
            fileInputStream3 = null;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            r3 = 0;
            c(fileInputStream7, fileInputStream, r3);
            throw th;
        }
    }

    private static Bitmap d(String str) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("PLGACHIEVE_AchieveSportMedalInitData", "getBitmapFromPath: untrusted -> " + str);
            return null;
        }
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        if (!new File(strC).exists()) {
            LogUtil.d("PLGACHIEVE_AchieveSportMedalInitData", "getBitmapFromPath: file not exists");
            return null;
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strC);
        if (bitmapDecodeFile == null) {
            LogUtil.d("PLGACHIEVE_AchieveSportMedalInitData", " bitmap is null");
        }
        return bitmapDecodeFile;
    }

    private static void d(final InputStream inputStream, final InputStream inputStream2, final InputStream inputStream3, final Bitmap bitmap, final LinearLayout linearLayout) {
        new Obj3DBufferLoadAider().a(BaseApplication.getContext(), inputStream, inputStream2, inputStream3, new Obj3DBufferLoadAider.OnLoadListener() { // from class: ozc.4
            @Override // com.huawei.ucd.helper.gles.Obj3DBufferLoadAider.OnLoadListener
            public void onLoadOK(final Obj3DBufferLoadAider.b bVar) {
                if (bVar == null) {
                    return;
                }
                HandlerExecutor.b(new Runnable() { // from class: ozc.4.5
                    @Override // java.lang.Runnable
                    public void run() {
                        linearLayout.removeAllViews();
                        MedalView medalView = new MedalView(BaseApplication.getContext());
                        if (!TextUtils.isEmpty(ozc.e())) {
                            medalView.setBackContent(new String[]{ozc.e(), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_tab_not_gained_medals)}, MedalBackType.ModelType.SOLID_CIRCLE, MedalBackType.ColorType.GOLD);
                        }
                        medalView.setTexture(bitmap);
                        medalView.setTouchRect(new Rect(0, 0, pbn.g(BaseApplication.getContext()), pbn.j(BaseApplication.getContext())));
                        medalView.setObjData(bVar);
                        medalView.setAnimatorScaleX(0.02f, 0.12f);
                        medalView.setAnimatorScaleY(0.02f, 0.12f);
                        medalView.setAnimatorRotationY(0.0f, 360.0f);
                        medalView.setAnimatorPositionX(qrs.d(BaseApplication.getContext(), 150.0f), qrs.d(BaseApplication.getContext(), 150.0f));
                        medalView.setAnimatorPositionY(qrs.d(BaseApplication.getContext(), 150.0f), qrs.d(BaseApplication.getContext(), 150.0f));
                        medalView.setAnimatorDuration(1000L);
                        linearLayout.addView(medalView);
                        medalView.b();
                    }
                });
                ozc.c(inputStream, inputStream2, inputStream3);
            }

            @Override // com.huawei.ucd.helper.gles.Obj3DBufferLoadAider.OnLoadListener
            public void onLoadFailed(String str) {
                LogUtil.e("PLGACHIEVE_AchieveSportMedalInitData", "Obj3DBufferLoadAider.OnLoadListener load failed，onLoadFailed msg=", str);
                ozc.c(inputStream, inputStream2, inputStream3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e() {
        if (TextUtils.isEmpty(f45001b)) {
            f45001b = pax.a(a(((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo()));
        }
        return f45001b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(InputStream inputStream, InputStream inputStream2, InputStream inputStream3) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                LogUtil.e("PLGACHIEVE_AchieveSportMedalInitData", " InpuStream tst close exception!");
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused2) {
                LogUtil.e("PLGACHIEVE_AchieveSportMedalInitData", " InputStream nxy close exception!");
            }
        }
        if (inputStream3 != null) {
            try {
                inputStream3.close();
            } catch (IOException unused3) {
                LogUtil.e("PLGACHIEVE_AchieveSportMedalInitData", " InputStream xyz close exception!");
            }
        }
    }
}

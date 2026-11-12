package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.servicesapi.R;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.datatypes.MemberMessage;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.health.vip.datatypes.VipMessageInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.BaseDeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefitInfoDetail;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.DevicePerfPurchaseInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IllegalFormatConversionException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class irz {
    private irz() {
    }

    public static boolean d(UserMemberInfo userMemberInfo) {
        return userMemberInfo != null && userMemberInfo.getExpireTime() < userMemberInfo.getNowTime();
    }

    public static String a(VipMessageInfo vipMessageInfo, boolean z) {
        if (vipMessageInfo == null) {
            LogUtil.j("VipUtils", "getMessageContent vipMessageInfo is null");
            return "";
        }
        LogUtil.a("VipUtils", "OperateType:", Integer.valueOf(vipMessageInfo.getOperateType()));
        return b(vipMessageInfo, z);
    }

    private static String f() {
        return LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1002);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x00bd A[Catch: all -> 0x0118, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000b, B:6:0x000e, B:8:0x0013, B:9:0x0016, B:10:0x0019, B:17:0x009c, B:19:0x00c2, B:20:0x00d5, B:21:0x00e8, B:22:0x00ed, B:23:0x00f2, B:14:0x0061, B:15:0x006d, B:16:0x007e, B:13:0x003f, B:18:0x00bd, B:11:0x001f, B:12:0x0039), top: B:29:0x0003 }] */
    private static String b(VipMessageInfo vipMessageInfo, boolean z) {
        String strD;
        synchronized (irz.class) {
            String strF = f();
            int operateType = vipMessageInfo.getOperateType();
            switch (operateType) {
                case 10001:
                    strD = d(vipMessageInfo, z);
                    break;
                case 10002:
                case 10003:
                    strD = String.format(Locale.ENGLISH, qre.f(R.string.IDS_member_renewal_message), strF, a(vipMessageInfo.getExpireTime()));
                    break;
                default:
                    switch (operateType) {
                        case 10012:
                        case 10013:
                            strD = i(vipMessageInfo);
                            break;
                        case PrebakedEffectId.RT_CALENDAR_DATE /* 10014 */:
                        case 10015:
                            strD = String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_member_return_content), a(vipMessageInfo.getCreateTime()));
                            break;
                        default:
                            switch (operateType) {
                                case 10024:
                                    strD = String.format(Locale.ENGLISH, qre.f(R.string.IDS_member_renewal_reminder_new), UnitUtil.e(5.0d, 1, 0), UnitUtil.e(24.0d, 1, 0));
                                    break;
                                case 10025:
                                    strD = qre.a(R.string.IDS_member_promotion_content, 3);
                                    break;
                                case 10026:
                                    strD = qre.a(R.string.IDS_member_renewal_cancel_message, strF);
                                    break;
                                default:
                                    switch (operateType) {
                                        case 30002:
                                            strD = String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_benefit_recycle_content), vipMessageInfo.getDeviceType(), d(vipMessageInfo.getInterval()));
                                            break;
                                        case OnRegisterSkinAttrsListener.REGISTER_BY_SCAN /* 30003 */:
                                            strD = a(vipMessageInfo);
                                            break;
                                        case 30004:
                                            strD = c(vipMessageInfo);
                                            break;
                                        case 30005:
                                            strD = b(vipMessageInfo, BaseApplication.getContext().getResources().getString(R.string.IDS_benefit_will_expire_des));
                                            break;
                                        case 30006:
                                            strD = b(vipMessageInfo, BaseApplication.getContext().getResources().getString(R.string.IDS_benefit_expired_des));
                                            break;
                                        case 30007:
                                        case 30008:
                                            strD = i(vipMessageInfo);
                                            break;
                                        case 30009:
                                        case 30010:
                                            strD = String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_benefit_return_content), a(vipMessageInfo.getCreateTime()));
                                            break;
                                        default:
                                            strD = c(vipMessageInfo, z);
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        return strD;
    }

    private static String d(VipMessageInfo vipMessageInfo, boolean z) {
        String strC = c(vipMessageInfo.getMemberType());
        String strF = f();
        if (z) {
            return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_member_eable_nofify), strC);
        }
        return String.format(Locale.ENGLISH, qre.f(R.string.IDS_member_eable_message), strF, a(vipMessageInfo.getExpireTime()));
    }

    private static String a(long j) {
        String strD = UnitUtil.d("yyyy-MM-dd", j);
        if (LanguageUtil.bs(com.huawei.haf.application.BaseApplication.b())) {
            return ltb.g(strD);
        }
        if (LanguageUtil.aj(BaseApplication.getContext())) {
            return ltb.d(strD);
        }
        if (LanguageUtil.br(BaseApplication.getContext()) || LanguageUtil.bt(BaseApplication.getContext())) {
            return ltb.c(strD);
        }
        return LanguageUtil.ak(BaseApplication.getContext()) ? ltb.a(strD) : strD;
    }

    public static boolean b(List<DeviceBenefits> list) {
        if (njy.e(list)) {
            return false;
        }
        for (DeviceBenefits deviceBenefits : list) {
            if (deviceBenefits != null && (d(deviceBenefits.getInboxInfos()) || e(deviceBenefits.getPerfPurchaseInfos()))) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(List<DeviceInboxInfo> list) {
        if (njy.e(list)) {
            return false;
        }
        for (DeviceInboxInfo deviceInboxInfo : list) {
            if (c(deviceInboxInfo) && !TextUtils.isEmpty(irx.e(deviceInboxInfo)) && deviceInboxInfo.getBenefitType() == 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean e(List<DevicePerfPurchaseInfo> list) {
        if (njy.e(list)) {
            return false;
        }
        for (DevicePerfPurchaseInfo devicePerfPurchaseInfo : list) {
            if (c(devicePerfPurchaseInfo) && !TextUtils.isEmpty(irx.d(devicePerfPurchaseInfo))) {
                return true;
            }
        }
        return false;
    }

    public static List<LinearLayout> a(Context context, List<DeviceBenefits> list, boolean z) {
        ArrayList arrayList = new ArrayList(10);
        if (!njy.e(list) && context != null) {
            for (DeviceBenefits deviceBenefits : list) {
                if (deviceBenefits != null) {
                    List<DeviceInboxInfo> inboxInfos = deviceBenefits.getInboxInfos();
                    if (njy.b(inboxInfos)) {
                        List<LinearLayout> listD = d(context, inboxInfos, z, deviceBenefits.getBenefitInfos(), deviceBenefits.getDeviceSn());
                        if (njy.b(listD)) {
                            arrayList.addAll(listD);
                        }
                    }
                    List<DevicePerfPurchaseInfo> perfPurchaseInfos = deviceBenefits.getPerfPurchaseInfos();
                    if (njy.b(perfPurchaseInfos)) {
                        List<LinearLayout> listE = e(context, perfPurchaseInfos, z, deviceBenefits.getBenefitInfos(), deviceBenefits.getDeviceSn());
                        if (njy.b(listE)) {
                            arrayList.addAll(listE);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static List<LinearLayout> e(Context context, List<DevicePerfPurchaseInfo> list, boolean z, List<DeviceBenefitInfo> list2, String str) {
        LinearLayout linearLayoutD;
        ArrayList arrayList = new ArrayList(10);
        for (DevicePerfPurchaseInfo devicePerfPurchaseInfo : list) {
            if (c(devicePerfPurchaseInfo) && !TextUtils.isEmpty(irx.d(devicePerfPurchaseInfo))) {
                devicePerfPurchaseInfo.setDeviceSn(str);
                if (z) {
                    linearLayoutD = a(context, devicePerfPurchaseInfo, a(devicePerfPurchaseInfo), irx.d(devicePerfPurchaseInfo), b(devicePerfPurchaseInfo), list2);
                } else {
                    linearLayoutD = d(context, devicePerfPurchaseInfo, a(devicePerfPurchaseInfo), irx.d(devicePerfPurchaseInfo), b(devicePerfPurchaseInfo), list2);
                }
                if (linearLayoutD != null) {
                    arrayList.add(linearLayoutD);
                }
            }
        }
        return arrayList;
    }

    private static List<LinearLayout> d(Context context, List<DeviceInboxInfo> list, boolean z, List<DeviceBenefitInfo> list2, String str) {
        LinearLayout linearLayoutD;
        ArrayList arrayList = new ArrayList(10);
        for (DeviceInboxInfo deviceInboxInfo : list) {
            if (c(deviceInboxInfo) && !TextUtils.isEmpty(irx.e(deviceInboxInfo)) && deviceInboxInfo.getBenefitType() == 1) {
                deviceInboxInfo.setDeviceSn(str);
                if (z) {
                    linearLayoutD = a(context, deviceInboxInfo, R.string.IDS_user_member_has_pick_tip, irx.e(deviceInboxInfo), 0, list2);
                } else {
                    linearLayoutD = d(context, deviceInboxInfo, R.string.IDS_user_member_has_pick_tip, irx.e(deviceInboxInfo), 0, list2);
                }
                if (linearLayoutD != null) {
                    arrayList.add(linearLayoutD);
                }
            }
        }
        return arrayList;
    }

    private static LinearLayout d(final Context context, final BaseDeviceBenefitInfo baseDeviceBenefitInfo, int i, String str, int i2, final List<DeviceBenefitInfo> list) {
        String strD = d(str, i2);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("VipUtils", "initMemberTabMsgView benefitInfo = ", baseDeviceBenefitInfo.toString());
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.member_tab_msg_layout, null);
        TextView textView = (TextView) linearLayout.findViewById(R.id.vip_inbox_message);
        if (context.getResources().getConfiguration().densityDpi > b()) {
            textView.setMaxWidth(qqp.a(context, 170.0f));
        }
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.vip_inbox_actative);
        final ImageView imageView = (ImageView) linearLayout.findViewById(R.id.vip_inbox_red_point);
        LogUtil.d("VipUtils", "initMemberTabMsgView benefitInfo = ", baseDeviceBenefitInfo.toString());
        try {
            String string = BaseApplication.getContext().getResources().getString(i, strD);
            textView.setText(string);
            LogUtil.a("VipUtils", "initMemberTabMsgView inbox description = ", string);
        } catch (IllegalFormatConversionException | MissingFormatArgumentException e) {
            LogUtil.e("VipUtils", "initMemberTabMsgView string format exception", e.getMessage());
        }
        textView2.setText(R.string.IDS_hw_activate_text);
        imageView.setVisibility(a(e(baseDeviceBenefitInfo)) ? 0 : 8);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: irz.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                irz.b(2, false);
                irz.e(context, baseDeviceBenefitInfo, 10, (List<DeviceBenefitInfo>) list);
                imageView.setVisibility(irz.a(irz.e(baseDeviceBenefitInfo)) ? 0 : 8);
            }
        });
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i, boolean z) {
        HashMap map = new HashMap();
        map.put("click", 1);
        if (z) {
            map.put(CommonUtil.PAGE_TYPE, 3);
        } else {
            map.put(CommonUtil.PAGE_TYPE, Integer.valueOf((!d(a()) || btw.e()) ? 2 : 1));
        }
        map.put("event", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.VIP_EQUITY_CLICK_EVENT.value(), map, 0);
    }

    public static int b() {
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Method method = cls.getMethod("getWindowManagerService", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(cls, new Object[0]);
            Method method2 = objInvoke.getClass().getMethod("getInitialDisplayDensity", Integer.TYPE);
            method2.setAccessible(true);
            return ((Integer) method2.invoke(objInvoke, 0)).intValue();
        } catch (Exception e) {
            LogUtil.e("VipUtils", "getDefaultDisplayDensity Exception ", ExceptionUtils.c(e));
            return -1;
        }
    }

    private static int a(DevicePerfPurchaseInfo devicePerfPurchaseInfo) {
        return R.string.IDS_user_member_has_pick_device_tip;
    }

    private static LinearLayout a(final Context context, final BaseDeviceBenefitInfo baseDeviceBenefitInfo, int i, String str, int i2, final List<DeviceBenefitInfo> list) {
        String strD = d(str, i2);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("VipUtils", "initBenefitView benefitInfo = ", baseDeviceBenefitInfo.toString());
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.my_page_inbox_message_layout, null);
        TextView textView = (TextView) linearLayout.findViewById(R.id.vip_inbox_message);
        if (i()) {
            textView.setTextColor(ContextCompat.getColor(context, R.color.vip_member_card_subtitle_text_color));
        } else {
            textView.setTextColor(ContextCompat.getColor(context, R.color.me_non_vip_description_color));
        }
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.vip_inbox_red_point);
        LogUtil.d("VipUtils", "initBenefitView benefitInfo = ", baseDeviceBenefitInfo.toString());
        try {
            String string = BaseApplication.getContext().getResources().getString(i, strD);
            textView.setText(string);
            LogUtil.a("VipUtils", "initBenefitView inbox description = ", string);
        } catch (IllegalFormatConversionException | MissingFormatArgumentException e) {
            LogUtil.e("VipUtils", "initBenefitView string format exception", e.getMessage());
        }
        imageView.setVisibility(a(e(baseDeviceBenefitInfo)) ? 0 : 8);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: iry
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                irz.e(context, baseDeviceBenefitInfo, 9, (List<DeviceBenefitInfo>) list);
            }
        });
        b(1, true);
        return linearLayout;
    }

    public static void e(final Context context, final BaseDeviceBenefitInfo baseDeviceBenefitInfo, final int i, final List<DeviceBenefitInfo> list) {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: isc
                @Override // java.lang.Runnable
                public final void run() {
                    irz.e(context, baseDeviceBenefitInfo, i, (List<DeviceBenefitInfo>) list);
                }
            });
            return;
        }
        if (context == null || baseDeviceBenefitInfo == null) {
            LogUtil.j("VipUtils", "clickDeviceBenefit can not jump");
            return;
        }
        ((VipApi) Services.b("vip", VipApi.class)).showBenefitDialog(context, list, baseDeviceBenefitInfo, i);
        if ((i == 9 || i == 10) && !TextUtils.isEmpty(baseDeviceBenefitInfo.getProductId())) {
            h(e(baseDeviceBenefitInfo));
        }
    }

    public static boolean c(List<DeviceBenefitInfo> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.e("VipUtils", "hasDeviceBenefit deviceBenefitInfos is empty");
            return false;
        }
        Iterator<DeviceBenefitInfo> it = list.iterator();
        while (it.hasNext()) {
            if (a(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(DeviceBenefitInfo deviceBenefitInfo) {
        if (deviceBenefitInfo == null) {
            ReleaseLogUtil.e("VipUtils", "hasIntelligentTrainingPlanBenefit deviceBenefitInfo is null");
            return false;
        }
        LogUtil.a("VipUtils", "hasIntelligentTrainingPlanBenefit ", deviceBenefitInfo.toString());
        if (!d(deviceBenefitInfo)) {
            return false;
        }
        List<DeviceBenefitInfoDetail> benefitInfos = deviceBenefitInfo.getBenefitInfos();
        if (njy.e(benefitInfos)) {
            return false;
        }
        Iterator<DeviceBenefitInfoDetail> it = benefitInfos.iterator();
        while (it.hasNext()) {
            if (it.next().getBenefitType() == 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        if (baseDeviceBenefitInfo == null) {
            LogUtil.j("VipUtils", "isEffectiveTime deviceBenefitInfo is null");
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long effectiveStartTime = baseDeviceBenefitInfo.getEffectiveStartTime();
        long effectiveEndTime = baseDeviceBenefitInfo.getEffectiveEndTime();
        LogUtil.a("VipUtils", "isEffectiveTime currentTime = ", Long.valueOf(jCurrentTimeMillis), ",effectiveStartTime = ", Long.valueOf(effectiveStartTime), ",effectiveEndTime = ", Long.valueOf(effectiveEndTime), ",benefitType = ", Integer.valueOf(baseDeviceBenefitInfo.getBenefitType()));
        return jCurrentTimeMillis >= effectiveStartTime && jCurrentTimeMillis <= effectiveEndTime;
    }

    public static void b(final Context context, final int i, final int i2) {
        LogUtil.a("VipUtils", "showBenefitHalfMode fromPage is ", Integer.valueOf(i), "benefitType is ", Integer.valueOf(i2));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: isg
                @Override // java.lang.Runnable
                public final void run() {
                    irz.b(context, i, i2);
                }
            });
            return;
        }
        if (i2 == 1) {
            e(context, i, 1);
            return;
        }
        if (i2 == 2) {
            e(context, i, 2);
        } else if (i2 == 3) {
            d(context, i);
        } else {
            LogUtil.j("VipUtils", "showBenefitHalfMode benefitType is error", Integer.valueOf(i2));
        }
    }

    private static void e(Context context, int i, int i2) {
        DeviceBenefitQueryParam deviceBenefitQueryParamE = e();
        if (deviceBenefitQueryParamE == null) {
            e(i2);
            return;
        }
        DeviceBenefits deviceBenefitsC = c(deviceBenefitQueryParamE);
        if (!c(deviceBenefitsC)) {
            e(i2);
            return;
        }
        DeviceInboxInfo deviceInboxInfo = null;
        for (DeviceInboxInfo deviceInboxInfo2 : deviceBenefitsC.getInboxInfos()) {
            if (deviceInboxInfo2 != null) {
                deviceInboxInfo2.setDeviceSn(deviceBenefitQueryParamE.getDeviceSn());
                if (deviceInboxInfo2.getBenefitType() != i2 || TextUtils.isEmpty(irx.e(deviceInboxInfo2))) {
                    LogUtil.a("VipUtils", "handleBenefitType benefitType is ", Integer.valueOf(deviceInboxInfo2.getBenefitType()), "getInboxInfoDuration is Empty", Boolean.valueOf(TextUtils.isEmpty(irx.e(deviceInboxInfo2))));
                } else {
                    if (deviceInboxInfo2.isBenefitInfoActive() && deviceInboxInfo == null) {
                        deviceInboxInfo = deviceInboxInfo2;
                    }
                    if (deviceInboxInfo2.isBenefitInfoValid()) {
                        e(context, deviceInboxInfo2, i, deviceBenefitsC.getBenefitInfos());
                        return;
                    }
                }
            }
        }
        if (deviceInboxInfo != null) {
            e(context, deviceInboxInfo, i, deviceBenefitsC.getBenefitInfos());
        } else {
            LogUtil.a("VipUtils", "handleBenefitType inboxInfoActive is null ");
            e(i2);
        }
    }

    private static boolean c(DeviceBenefits deviceBenefits) {
        return deviceBenefits != null && njy.b(deviceBenefits.getInboxInfos());
    }

    private static void d(Context context, int i) {
        DeviceBenefitQueryParam deviceBenefitQueryParamE = e();
        DeviceBenefitQueryParam deviceBenefitQueryParamC = c();
        if (deviceBenefitQueryParamE == null && deviceBenefitQueryParamC == null) {
            e(3);
            return;
        }
        List<DevicePerfPurchaseInfo> listC = c(deviceBenefitQueryParamE, c(deviceBenefitQueryParamE), deviceBenefitQueryParamC, c(deviceBenefitQueryParamC));
        if (njy.e(listC)) {
            e(3);
            return;
        }
        DevicePerfPurchaseInfo devicePerfPurchaseInfo = null;
        for (DevicePerfPurchaseInfo devicePerfPurchaseInfo2 : listC) {
            if (devicePerfPurchaseInfo2 != null) {
                if (TextUtils.isEmpty(irx.d(devicePerfPurchaseInfo2))) {
                    LogUtil.a("VipUtils", "handlePurchaseBenefitType Purchase continue getPerfPurchaseInfoDuration isEmpty ", Boolean.valueOf(TextUtils.isEmpty(irx.d(devicePerfPurchaseInfo2))));
                } else {
                    if (devicePerfPurchaseInfo2.isBenefitInfoActive() && devicePerfPurchaseInfo == null) {
                        devicePerfPurchaseInfo = devicePerfPurchaseInfo2;
                    }
                    if (devicePerfPurchaseInfo2.isBenefitInfoValid()) {
                        e(context, devicePerfPurchaseInfo2, i, (List<DeviceBenefitInfo>) null);
                        return;
                    }
                }
            }
        }
        if (devicePerfPurchaseInfo != null) {
            e(context, devicePerfPurchaseInfo, i, (List<DeviceBenefitInfo>) null);
        } else {
            LogUtil.a("VipUtils", "handlePurchaseBenefitType perfPurchaseInfoActive is null ");
            e(3);
        }
    }

    private static List<DevicePerfPurchaseInfo> c(DeviceBenefitQueryParam deviceBenefitQueryParam, DeviceBenefits deviceBenefits, DeviceBenefitQueryParam deviceBenefitQueryParam2, DeviceBenefits deviceBenefits2) {
        ArrayList arrayList = new ArrayList();
        if (deviceBenefits != null && njy.b(deviceBenefits.getPerfPurchaseInfos())) {
            for (DevicePerfPurchaseInfo devicePerfPurchaseInfo : deviceBenefits.getPerfPurchaseInfos()) {
                if (devicePerfPurchaseInfo != null) {
                    devicePerfPurchaseInfo.setDeviceSn(deviceBenefitQueryParam.getDeviceSn());
                    arrayList.add(devicePerfPurchaseInfo);
                }
            }
        }
        if (deviceBenefits2 != null && njy.b(deviceBenefits2.getPerfPurchaseInfos())) {
            for (DevicePerfPurchaseInfo devicePerfPurchaseInfo2 : deviceBenefits2.getPerfPurchaseInfos()) {
                if (devicePerfPurchaseInfo2 != null) {
                    devicePerfPurchaseInfo2.setDeviceSn(deviceBenefitQueryParam2.getDeviceSn());
                    arrayList.add(devicePerfPurchaseInfo2);
                }
            }
        }
        return arrayList;
    }

    private static DeviceBenefits c(DeviceBenefitQueryParam deviceBenefitQueryParam) {
        if (deviceBenefitQueryParam != null) {
            return d(deviceBenefitQueryParam);
        }
        return null;
    }

    public static void e(int i) {
        String str;
        if (i == 1) {
            str = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?h5pro=true&isImmerse&urlType=4&pName=com.huawei.health&path=VipRedeemGuide";
        } else if (i == 2) {
            str = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?h5pro=true&isImmerse&urlType=4&pName=com.huawei.health&path=ExclusiveGuardGuide";
        } else if (i == 3) {
            str = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?h5pro=true&isImmerse&urlType=4&pName=com.huawei.health&path=PrivilegeRedeemGuide";
        } else {
            LogUtil.j("VipUtils", "jumpToGuidePage: 无效的页面类型 -> " + i);
            return;
        }
        AppRouter.e(Uri.parse(str)).b(BaseApplication.getContext());
    }

    private static DeviceBenefits d(DeviceBenefitQueryParam deviceBenefitQueryParam) {
        PayApi payApi = (PayApi) Services.b("TradeService", PayApi.class);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference();
        payApi.getDeviceBenefits(deviceBenefitQueryParam, new IBaseResponseCallback() { // from class: irz.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i != 0) {
                    LogUtil.j("VipUtils", "getDeviceBenefitsData errorCode", Integer.valueOf(i));
                    countDownLatch.countDown();
                    return;
                }
                if (obj == null) {
                    LogUtil.j("VipUtils", "getDeviceBenefitsData objData is null");
                    countDownLatch.countDown();
                } else if (!(obj instanceof DeviceBenefits)) {
                    LogUtil.j("VipUtils", "getDeviceBenefitsData objData is not an instance of DeviceBenefits");
                    countDownLatch.countDown();
                } else {
                    LogUtil.d("VipUtils", "getDeviceBenefits objectData = ", HiJsonUtil.d(obj));
                    atomicReference.set((DeviceBenefits) obj);
                    countDownLatch.countDown();
                }
            }
        });
        try {
            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            LogUtil.j("VipUtils", "getDeviceBenefitsData interrupted", e);
            Thread.currentThread().interrupt();
        }
        return (DeviceBenefits) atomicReference.get();
    }

    public static DeviceBenefitQueryParam c() {
        if (!health.compact.a.CommonUtil.bg()) {
            return null;
        }
        String strC = qhu.c(BaseApplication.getContext());
        LogUtil.a("VipUtils", "getPhoneDeviceInfo phone getActiveParams");
        return new DeviceBenefitQueryParam.Builder().setDeviceType(PhoneInfoUtils.getDeviceModel()).setDeviceSn(strC).setBenefitType(DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_PERF_PURCHASE).setDeviceCategory(DeviceBenefitQueryParam.DeviceCategory.DEVICE_CATEGORY_PHONE.getCategory()).setDeviceSnType(DeviceBenefitQueryParam.DeviceSnType.DEVICE_SN_TYPE_UDID.getSnType()).setNeedProductInfo(true).build();
    }

    public static DeviceBenefitQueryParam e() {
        List<DeviceBenefitQueryParam> listE = qhu.e("VipUtils", DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_ALL);
        if (njy.e(listE)) {
            LogUtil.j("VipUtils", "getWatchDeviceInfo wearMainDevBenefitQueryParam is empty ");
            return null;
        }
        DeviceBenefitQueryParam deviceBenefitQueryParam = listE.get(0);
        if (deviceBenefitQueryParam != null) {
            return deviceBenefitQueryParam;
        }
        LogUtil.j("VipUtils", "getWatchDeviceInfo curDeviceParam is empty ");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        if (baseDeviceBenefitInfo == null) {
            return "";
        }
        if (baseDeviceBenefitInfo instanceof DeviceInboxInfo) {
            return ((DeviceInboxInfo) baseDeviceBenefitInfo).getDeviceInboxId();
        }
        if (!(baseDeviceBenefitInfo instanceof DevicePerfPurchaseInfo)) {
            return "";
        }
        return ((DevicePerfPurchaseInfo) baseDeviceBenefitInfo).getDevicePerfPurchaseId();
    }

    private static void h(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(30008), "vip_inbox_msg_read_list");
        if (!TextUtils.isEmpty(strE)) {
            str = strE.concat(",").concat(str);
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(30008), "vip_inbox_msg_read_list", str, null);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("VipUtils", "isNeedShowInboxRedPoint productId is empty");
            return false;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(30008), "vip_inbox_msg_read_list");
        return TextUtils.isEmpty(strE) || !strE.contains(str);
    }

    private static boolean c(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        if (baseDeviceBenefitInfo == null || !baseDeviceBenefitInfo.isBenefitInfoValid()) {
            return false;
        }
        LogUtil.j("VipUtils", "isBenefitsNeedShow benefitInfo is empty");
        return true;
    }

    private static String a(VipMessageInfo vipMessageInfo) {
        return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_benefit_activate_content), a(vipMessageInfo.getExpireTime()));
    }

    private static String c(VipMessageInfo vipMessageInfo) {
        return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_benefit_renew_content), b(vipMessageInfo.getDuration()), a(vipMessageInfo.getExpireTime()));
    }

    private static String b(VipMessageInfo vipMessageInfo, String str) {
        return String.format(Locale.ENGLISH, str, a(vipMessageInfo.getExpireTime()));
    }

    private static String i(VipMessageInfo vipMessageInfo) {
        if (vipMessageInfo.getOperateType() == 30007) {
            return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_benefit_give_content), a(vipMessageInfo.getCreateTime()));
        }
        if (vipMessageInfo.getOperateType() == 30008) {
            return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_benefit_accept_content), a(vipMessageInfo.getExpireTime()));
        }
        if (vipMessageInfo.getOperateType() == 10012) {
            return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_member_give_content), a(vipMessageInfo.getCreateTime()));
        }
        if (vipMessageInfo.getOperateType() == 10013) {
            return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_member_accept_content), a(vipMessageInfo.getExpireTime()));
        }
        LogUtil.j("VipUtils", "OperateType is wrong.");
        return "";
    }

    private static String c(VipMessageInfo vipMessageInfo, boolean z) {
        int operateType = vipMessageInfo.getOperateType();
        if (operateType == 10005) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_member_renewal_success);
        }
        switch (operateType) {
            case 20001:
                if (z) {
                    return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_invitation), d(vipMessageInfo.getUserAccountAnon()));
                }
                return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_invitation_notify), d(vipMessageInfo.getUserAccountAnon()), UnitUtil.e(10.0d, 1, 0));
            case 20002:
                if (z) {
                    return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_invitation_agree), d(vipMessageInfo.getUserAccountAnon()));
                }
                return BaseApplication.getContext().getResources().getString(R.string.IDS_invitation_share);
            case 20003:
                return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_invitation_refuse), d(vipMessageInfo.getUserAccountAnon()));
            case 20004:
                return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_invitation_disband), d(vipMessageInfo.getUserAccountAnon()));
            case 20005:
                return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_invitation_exit), d(vipMessageInfo.getUserAccountAnon()));
            default:
                return e(vipMessageInfo, z);
        }
    }

    private static String e(VipMessageInfo vipMessageInfo, boolean z) {
        String strF = f();
        int operateType = vipMessageInfo.getOperateType();
        if (operateType == 10028) {
            if (z) {
                return qre.f(R.string.IDS_vip_benefit_retract_push);
            }
            return qre.a(R.string.IDS_member_refund_message, strF);
        }
        switch (operateType) {
            case 30024:
            case 30026:
                if (z) {
                    return qre.f(R.string.IDS_excl_bft_retract_host_push);
                }
                return qre.a(R.string.IDS_excl_bft_retract_host_msg, strF);
            case 30025:
                if (z) {
                    return qre.f(R.string.IDS_excl_bft_retract_share_push);
                }
                return qre.a(R.string.IDS_excl_bft_retract_share_msg, strF);
            default:
                return b(vipMessageInfo);
        }
    }

    private static String b(VipMessageInfo vipMessageInfo) {
        String strA = a(vipMessageInfo.getExpireTime());
        String strF = f();
        int operateType = vipMessageInfo.getOperateType();
        if (operateType != 10027) {
            switch (operateType) {
                case 10006:
                    return qre.a(R.string.IDS_member_refund_message, strF);
                case 10007:
                    return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_member_expired), strA);
                case 10008:
                    return String.format(Locale.ENGLISH, qre.f(R.string.IDS_member_expire_reminder_message), strF, strA);
                case 10009:
                    return d(vipMessageInfo);
                case 10010:
                    String strA2 = a(vipMessageInfo.getResourceTypes());
                    return !TextUtils.isEmpty(strA2) ? String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_device_unbind), strA2) : strA2;
                case 10011:
                    return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_equity_recovery), vipMessageInfo.getDeviceType(), d(vipMessageInfo.getInterval()));
                default:
                    LogUtil.a("VipUtils", "getContent getOperateType() not match:", Integer.valueOf(vipMessageInfo.getOperateType()));
                    return "";
            }
        }
        return qre.a(R.string.IDS_member_equity_compensation_message, strF, b(vipMessageInfo.getInterval()), strA);
    }

    private static String d(VipMessageInfo vipMessageInfo) {
        String strA = a(vipMessageInfo.getResourceTypes());
        if (TextUtils.isEmpty(strA)) {
            return strA;
        }
        if (vipMessageInfo.getResourceTypes().size() > 1) {
            return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_device_bound_many), strA);
        }
        return String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_device_bound), strA);
    }

    private static String d(String str) {
        return TextUtils.isEmpty(str) ? "" : str;
    }

    private static String c(int i) {
        LogUtil.a("VipUtils", "memberType:", Integer.valueOf(i));
        if (i == 1) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_member_life);
        }
        LogUtil.a("VipUtils", "memberType not match:", Integer.valueOf(i));
        return "";
    }

    private static String a(List<Integer> list) {
        if (njy.e(list)) {
            LogUtil.a("VipUtils", "resourceTypes is empty");
            return "";
        }
        return b(list.get(0).intValue());
    }

    private static String b(int i) {
        LogUtil.a("VipUtils", "resourceType:", Integer.valueOf(i));
        if (i == 1) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_course);
        }
        if (i == 2) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_plan_reduction);
        }
        if (i == 5) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_plan_running);
        }
        if (i == 6) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_breath_train);
        }
        if (i == 7) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_music);
        }
        if (i == 8) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_virtual_reality);
        }
        LogUtil.j("VipUtils", "resourceType not match:", Integer.valueOf(i));
        return "";
    }

    public static String e(VipMessageInfo vipMessageInfo) {
        if (vipMessageInfo == null) {
            LogUtil.j("VipUtils", "getMessageTitle vipMessageInfo is null");
            return "";
        }
        return h(vipMessageInfo);
    }

    private static String h(VipMessageInfo vipMessageInfo) {
        Resources resources = BaseApplication.getContext().getResources();
        int operateType = vipMessageInfo.getOperateType();
        switch (operateType) {
            case 10001:
                return resources.getString(R.string.IDS_member_eable);
            case 10002:
            case 10003:
                break;
            default:
                switch (operateType) {
                    case 10005:
                        break;
                    case 10006:
                        return resources.getString(R.string.IDS_member_cancel_reminder_message);
                    case 10007:
                        return resources.getString(R.string.IDS_member_expired_title);
                    case 10008:
                        return resources.getString(R.string.IDS_about_to_expire_title);
                    case 10009:
                        return String.format(Locale.ENGLISH, resources.getString(R.string.IDS_device_bound_title), vipMessageInfo.getDeviceType());
                    case 10010:
                        return String.format(Locale.ENGLISH, resources.getString(R.string.IDS_device_unbind_title), vipMessageInfo.getDeviceType());
                    case 10011:
                        return resources.getString(R.string.IDS_equity_recovery_title);
                    case 10012:
                    case 10013:
                    case PrebakedEffectId.RT_CALENDAR_DATE /* 10014 */:
                    case 10015:
                        break;
                    default:
                        switch (operateType) {
                            case 10024:
                                return resources.getString(R.string.IDS_member_renewal_reminder);
                            case 10025:
                                return resources.getString(R.string.IDS_member_promotion_title);
                            case 10026:
                                return qre.f(R.string.IDS_member_renewal_cancel_title);
                            case PrebakedEffectId.RT_SPEED_UP /* 10027 */:
                                return qre.f(R.string.IDS_member_activated_reminder_message);
                            default:
                                switch (operateType) {
                                    case 20001:
                                    case 20002:
                                    case 20003:
                                    case 20004:
                                    case 20005:
                                        return resources.getString(R.string.IDS_invitation_title);
                                    default:
                                        switch (operateType) {
                                            case 30002:
                                                return resources.getString(R.string.IDS_benefit_recycle);
                                            case OnRegisterSkinAttrsListener.REGISTER_BY_SCAN /* 30003 */:
                                                return resources.getString(R.string.IDS_benefit_activate_success);
                                            case 30004:
                                                return resources.getString(R.string.IDS_benefit_renew_success);
                                            case 30005:
                                                return resources.getString(R.string.IDS_benefit_will_expire);
                                            case 30006:
                                                return resources.getString(R.string.IDS_benefit_expired);
                                            case 30007:
                                            case 30008:
                                                break;
                                            case 30009:
                                            case 30010:
                                                return resources.getString(R.string.IDS_benefit_return);
                                            default:
                                                return a(vipMessageInfo.getOperateType());
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                return resources.getString(R.string.IDS_benefit_give);
        }
        return resources.getString(R.string.IDS_member_renewal);
    }

    private static String a(int i) {
        if (i != 10028) {
            switch (i) {
                case 30024:
                case 30025:
                case 30026:
                    break;
                default:
                    LogUtil.j("VipUtils", "getTitle getOperateType not match:", Integer.valueOf(i));
                    return "";
            }
        }
        return qre.f(R.string.IDS_benefit_retract_title);
    }

    public static List<MessageObject> e(List<MemberMessage> list, boolean z) {
        String strValueOf;
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            LogUtil.a("VipUtils", "memberMessages is empty");
            return arrayList;
        }
        for (MemberMessage memberMessage : list) {
            MessageObject messageObject = new MessageObject();
            messageObject.setMsgType(2);
            if (z) {
                messageObject.setPosition(3);
            } else {
                messageObject.setPosition(1);
            }
            messageObject.setMsgPosition(11);
            messageObject.setExpireTime(memberMessage.getExpireTime());
            messageObject.setReceiveTime(memberMessage.getGenTime());
            messageObject.setReadFlag(memberMessage.getVisitFlag());
            messageObject.setMsgId(memberMessage.getMsgId());
            VipMessageInfo vipMessageInfoC = c(memberMessage.getInfoValue());
            boolean z2 = vipMessageInfoC.getOperateType() >= 30000;
            if (z2) {
                strValueOf = String.valueOf(90);
            } else {
                strValueOf = String.valueOf(70);
            }
            messageObject.setModule(strValueOf);
            messageObject.setType(z2 ? MessageConstant.BENEFIT_TYPE : MessageConstant.MEMBER_TYPE);
            String strE = e(vipMessageInfoC);
            if (TextUtils.isEmpty(strE)) {
                LogUtil.j("VipUtils", "operateType not support, operateType:", Integer.valueOf(vipMessageInfoC.getOperateType()));
            } else {
                messageObject.setMsgTitle(strE);
                messageObject.setInfoClassify(BaseApplication.getContext().getResources().getString(R.string.IDS_member));
                String strD = d(vipMessageInfoC, memberMessage, strE, z2);
                LogUtil.a("VipUtils", "vipMessageInfo.getOperateType(): ", Integer.valueOf(vipMessageInfoC.getOperateType()), "; url = ", strD);
                messageObject.setDetailUri(strD);
                String strA = a(vipMessageInfoC, z);
                if (TextUtils.isEmpty(strA)) {
                    LogUtil.j("VipUtils", "content is empty", Integer.valueOf(vipMessageInfoC.getOperateType()));
                } else {
                    messageObject.setMsgContent(strA);
                    messageObject.setCreateTime(memberMessage.getGenTime());
                    messageObject.setHuid(LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).getAccountInfo(1011));
                    arrayList.add(messageObject);
                }
            }
        }
        List<MessageObject> listH = h(arrayList);
        LogUtil.a("VipUtils", "messageObjects.size:", Integer.valueOf(listH.size()));
        return listH;
    }

    private static String d(VipMessageInfo vipMessageInfo, MemberMessage memberMessage, String str, boolean z) {
        if (vipMessageInfo.getOperateType() != 10025 || TextUtils.isEmpty(vipMessageInfo.getLinkValue())) {
            return z ? j(vipMessageInfo) : c(vipMessageInfo, memberMessage, str);
        }
        return vipMessageInfo.getLinkValue();
    }

    private static String c(VipMessageInfo vipMessageInfo, MemberMessage memberMessage, String str) {
        String str2 = "messagecenter://member?uniqueId=" + vipMessageInfo.getShareInfoUniqueId() + "&type=" + vipMessageInfo.getOperateType() + "&messageTitle=" + str + "&activityId=" + memberMessage.getMsgId() + "&orderCode=" + vipMessageInfo.getOrderCode();
        if (vipMessageInfo.getOperateType() != 10025) {
            return str2;
        }
        return str2 + "&promotionPolicyId=" + vipMessageInfo.getPromotionPolicyId() + "&productId=" + vipMessageInfo.getProductId() + "&promotionId=" + vipMessageInfo.getPromotionId() + "&popUpTypeSelect=true&vipOpenFrom=pushNotification&payResourceType=push到期提醒";
    }

    private static List<MessageObject> h(List<MessageObject> list) {
        Collections.sort(list, new Comparator<MessageObject>() { // from class: irz.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(MessageObject messageObject, MessageObject messageObject2) {
                if (messageObject.getReceiveTime() < messageObject2.getReceiveTime()) {
                    return -1;
                }
                return messageObject.getReceiveTime() == messageObject2.getReceiveTime() ? 0 : 1;
            }
        });
        return list;
    }

    private static String j(VipMessageInfo vipMessageInfo) {
        return (vipMessageInfo.getOperateType() == 30005 || vipMessageInfo.getOperateType() == 30006) ? "messagecenter://benefit?type=2&key=huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?h5pro=true%26isNeedLogin=true%26path=VipRenewal" : (vipMessageInfo.getOperateType() == 30003 || vipMessageInfo.getOperateType() == 30008 || vipMessageInfo.getOperateType() == 30004 || vipMessageInfo.getOperateType() == 30024 || vipMessageInfo.getOperateType() == 30025 || vipMessageInfo.getOperateType() == 30026) ? "messagecenter://benefit?type=2&key=huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?h5pro=true%26urlType=4%26pName=com.huawei.health%26path=ExclusiveGuardService" : "";
    }

    public static VipMessageInfo c(String str) {
        VipMessageInfo vipMessageInfo = new VipMessageInfo();
        try {
            return (VipMessageInfo) new Gson().fromJson(str, VipMessageInfo.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("VipUtils", "gson exception");
            return vipMessageInfo;
        }
    }

    private static String d(long j) {
        String quantityString;
        int[] iArrC = c(j);
        int i = iArrC[0];
        if (i > 0) {
            if (iArrC[1] <= 0) {
                quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_vip_year, iArrC[0], UnitUtil.e(i, 1, 0));
            } else {
                int i2 = (int) (j / 2592000000L);
                quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_vip_month, i2, UnitUtil.e(i2, 1, 0));
            }
        } else {
            int i3 = iArrC[1];
            if (i3 > 0) {
                if (iArrC[2] >= 28) {
                    i3++;
                }
                quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_vip_month, i3, UnitUtil.e(i3, 1, 0));
            } else {
                quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_user_profile_achieve_num_day, iArrC[2], UnitUtil.e(iArrC[2], 1, 0));
            }
        }
        LogUtil.a("VipUtils", "duration:", quantityString);
        return quantityString;
    }

    private static String b(long j) {
        String strE;
        int[] iArrC = c(j);
        if (iArrC.length != 3) {
            ReleaseLogUtil.a("VipUtils", "unknow leftTime result");
            return "";
        }
        int i = iArrC[0];
        if (i > 0) {
            if (iArrC[1] <= 0) {
                strE = qre.e(R.plurals.IDS_member_dated_product_name_year, iArrC[0], UnitUtil.e(i, 1, 0));
            } else {
                strE = qre.e(R.plurals.IDS_member_dated_product_name_month, iArrC[1], UnitUtil.e((int) (j / 2592000000L), 1, 0));
            }
        } else {
            int i2 = iArrC[1];
            if (i2 > 0) {
                if (iArrC[2] >= 28) {
                    i2++;
                }
                strE = qre.e(R.plurals.IDS_member_dated_product_name_month, iArrC[1], UnitUtil.e(i2, 1, 0));
            } else {
                strE = qre.e(R.plurals.IDS_member_dated_product_name_day, iArrC[2], UnitUtil.e(iArrC[2], 1, 0));
            }
        }
        LogUtil.a("VipUtils", "duration:", strE);
        return strE;
    }

    private static int[] c(long j) {
        LogUtil.a("VipUtils", "timeMillonSecond:", Long.valueOf(j));
        int i = (int) (j / 31536000000L);
        long j2 = j - (((long) i) * 31536000000L);
        int i2 = (int) (j2 / 2592000000L);
        int i3 = (int) ((j2 - (((long) i2) * 2592000000L)) / 86400000);
        LogUtil.a("VipUtils", "year:", Integer.valueOf(i), "month:", Integer.valueOf(i2), "day:", Integer.valueOf(i3));
        return new int[]{i, i2, i3};
    }

    public static String b(String str, int i) {
        String strC = c(str, i);
        if (TextUtils.isEmpty(strC)) {
            return "";
        }
        try {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_user_member_has_pick_device_tip, strC);
        } catch (IllegalFormatConversionException | MissingFormatArgumentException e) {
            LogUtil.e("VipUtils", "getInboxMessageStr string format exception", e.getMessage());
            return "";
        }
    }

    public static int b(DevicePerfPurchaseInfo devicePerfPurchaseInfo) {
        if (devicePerfPurchaseInfo == null || devicePerfPurchaseInfo.getAutoRenew() == 1 || devicePerfPurchaseInfo.getSubscriptionPromotion() == null) {
            return 0;
        }
        return devicePerfPurchaseInfo.getSubscriptionPromotion().getNumOfPeriods();
    }

    public static String d(String str, int i) {
        LogUtil.d("VipUtils", "getBenefitsTimeStr duration == ", str);
        if (TextUtils.isEmpty(str) || str.length() < 3) {
            LogUtil.j("VipUtils", "getInboxMessageStr duration is error");
            return "";
        }
        int iA = a(str, i);
        return iA <= 0 ? "" : c(iA, str);
    }

    public static String c(String str, int i) {
        LogUtil.a("VipUtils", "getDeviceInboxTimeStr duration == ", str);
        if (TextUtils.isEmpty(str) || str.length() < 3) {
            LogUtil.j("VipUtils", "getDeviceInboxTimeStr duration is error");
            return "";
        }
        int iA = a(str, i);
        if (iA <= 0) {
            return "";
        }
        if (str.charAt(str.length() - 1) == 'D') {
            return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_health_weight_day_local, iA, UnitUtil.e(iA, 1, 0));
        }
        return c(iA, str);
    }

    public static String b(String str) {
        LogUtil.d("VipUtils", "getBenefitsTimeStr duration == ", str);
        if (TextUtils.isEmpty(str) || str.length() < 3) {
            LogUtil.j("VipUtils", "getInboxMessageStr duration is error");
            return "";
        }
        int iA = a(str, 1);
        return iA <= 0 ? "" : c(iA, str);
    }

    public static int a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int iN = health.compact.a.CommonUtil.n(BaseApplication.getContext(), str.substring(1, str.length() - 1));
        LogUtil.a("VipUtils", "getBenefitsTimeStr getNum == ", str);
        if (i <= 0) {
            return iN;
        }
        LogUtil.a("VipUtils", "getBenefitsTimeStr getNum plus numOfPeriods == ", str);
        return iN * i;
    }

    public static String c(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strE = UnitUtil.e(i, 1, 0);
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'D') {
            return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_user_profile_achieve_num_day, i, strE);
        }
        if (cCharAt == 'M') {
            return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_vip_month, i, strE);
        }
        if (cCharAt == 'W') {
            return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_fitness_plan_week, i, Integer.valueOf(i));
        }
        if (cCharAt == 'Y') {
            int i2 = i * 12;
            return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_vip_month, i2, UnitUtil.e(i2, 1, 0));
        }
        LogUtil.j("VipUtils", "getInboxMessageStr duration format error");
        return "";
    }

    public static boolean i() {
        UserMemberInfo userMemberInfoA = a();
        return (userMemberInfoA == null || userMemberInfoA.getMemberFlag() != 1 || d(userMemberInfoA)) ? false : true;
    }

    public static UserMemberInfo a() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "USER_VIP_INFO_KEY");
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        return (UserMemberInfo) peh.b(strE, UserMemberInfo.class);
    }

    @Deprecated
    public static boolean h() {
        return !Utils.o() || ((OperationUtilsApi) Services.b("PluginOperation", OperationUtilsApi.class)).isModuleOperatedToOversea("ai-vip-oversea-001");
    }

    public static boolean j() {
        if (Utils.o()) {
            return pjg.b("1");
        }
        return true;
    }

    public static void a(boolean z, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = z ? new StringBuilder("SHOW_LIFE_TIME_") : new StringBuilder("SHOW_LIFE_TIME_PURCHASE_");
        sb.append(str);
        lua.a(Integer.toString(10000), sb.toString(), jCurrentTimeMillis);
        lua.a(Integer.toString(10000), "last_benefit_show_time", jCurrentTimeMillis);
    }

    public static long c(boolean z, String str) {
        StringBuilder sb = z ? new StringBuilder("SHOW_LIFE_TIME_") : new StringBuilder("SHOW_LIFE_TIME_PURCHASE_");
        sb.append(str);
        return lua.d(Integer.toString(10000), sb.toString(), 0L);
    }

    public static long d() {
        return lua.d(Integer.toString(10000), "last_benefit_show_time", 0L);
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "#/MemberCenter?currentBenefit=1&benefitList=%5B1%5D";
        }
        return "#/MemberCenter?currentBenefit=1&benefitList=%5B1%5D&" + str;
    }

    public static void d(Context context, String str) {
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath(e(str));
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.vip", builder);
    }
}

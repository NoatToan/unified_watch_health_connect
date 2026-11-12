package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.provider.Telephony;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.DataPromptData;
import com.huawei.hwcommonmodel.datatypes.MsgImage;
import com.huawei.hwcommonmodel.datatypes.MsgText;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.up.model.UserInfomation;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import io.jsonwebtoken.Claims;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes11.dex */
public class ncp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f42889a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f42891c = 30;
    private static int e = 30;
    private static int f = 30;
    private static boolean g = false;
    private static boolean i = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static StorageParams f42890b = new StorageParams(0);
    private static int d = 240;

    private static Bitmap e(Bitmap bitmap, int i2, int i3) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i4 = 0; i4 < height; i4++) {
            for (int i5 = 0; i5 < width; i5++) {
                int i6 = (width * i4) + i5;
                int i7 = iArr[i6];
                int i8 = (int) ((((16711680 & i7) >> 16) * 0.3f) + (((65280 & i7) >> 8) * 0.59f) + ((i7 & 255) * 0.11f));
                iArr[i6] = i8 | (i8 << 16) | (-16777216) | (i8 << 8);
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
        bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return ThumbnailUtils.extractThumbnail(bitmapCreateBitmap, i2, i3);
    }

    public static lry a(boolean z, List<MsgImage> list, List<MsgText> list2, String str, ncr ncrVar) {
        lry lryVar = new lry();
        if (ncrVar == null) {
            return lryVar;
        }
        int iC = ncrVar.c();
        int iE = ncrVar.e();
        int iA = ncrVar.a();
        int iB = ncrVar.b();
        LogUtil.a("NotifySendUtil", "pushNotificationToDevice getDataPromptContent yellowPagesFormat: ", Integer.valueOf(iE), " contentSignFormat: ", Integer.valueOf(iA), " incomingNumberFormat: ", Integer.valueOf(iB));
        lryVar.c(iC);
        if (z) {
            lryVar.e(1);
        } else {
            lryVar.e(0);
        }
        ArrayList<lrq> arrayList = new ArrayList<>(16);
        lrz lrzVar = new lrz();
        if (list != null && !list.isEmpty()) {
            b(list, arrayList, lrzVar);
        }
        ArrayList<lru> arrayList2 = new ArrayList<>(16);
        if (list2 != null && !list2.isEmpty()) {
            d(list2, iE, iA, iB, arrayList2);
        }
        lryVar.a(arrayList);
        lryVar.b(arrayList2);
        lryVar.e(str);
        return lryVar;
    }

    private static void d(List<MsgText> list, int i2, int i3, int i4, ArrayList<lru> arrayList) {
        for (MsgText msgText : list) {
            if (msgText != null) {
                lru lruVar = new lru();
                lruVar.a(msgText.getTextType());
                if (msgText.getTextType() == 5) {
                    lruVar.e(i2);
                } else if (msgText.getTextType() == 6) {
                    lruVar.e(i3);
                } else if (msgText.getTextType() == 7) {
                    lruVar.e(i4);
                } else {
                    lruVar.e(2);
                }
                lruVar.a(msgText.getTextContent());
                arrayList.add(lruVar);
            }
        }
    }

    private static void b(List<MsgImage> list, ArrayList<lrq> arrayList, lrz lrzVar) {
        byte[] bArrB = null;
        for (MsgImage msgImage : list) {
            lrq lrqVar = new lrq();
            if (msgImage != null) {
                Bitmap imageBitmap = msgImage.getImageBitmap();
                if (imageBitmap != null) {
                    bArrB = lrzVar.b(e(imageBitmap, 33, 24));
                }
                lrqVar.d(msgImage.getImageType());
                lrqVar.d(bArrB);
                lrqVar.d(msgImage.getImageType());
                lrqVar.e(1);
                lrqVar.b(33);
                lrqVar.c(24);
                arrayList.add(lrqVar);
            }
        }
    }

    public static String d(StringBuilder sb, ArrayList<lru> arrayList) {
        String str = "";
        if (sb == null) {
            return "";
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            c(sb, arrayList);
            if (sb.length() != 0) {
                str = eeq.d(140) + b(sb.length() / 2);
            }
        }
        LogUtil.a("NotifySendUtil", "notificationMsgToTLVS, textListTlvHex: ", str);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00e6  */
    private static void c(StringBuilder sb, ArrayList<lru> arrayList) {
        String str;
        for (lru lruVar : arrayList) {
            int iD = lruVar.d();
            LogUtil.d("NotifySendUtil", "notificationMsgToTLVS, textType: ", Integer.valueOf(iD));
            if (iD != 5 || i) {
                if (iD != 6 || g) {
                    if (iD != 7 || f42889a) {
                        String str2 = eeq.d(14) + eeq.d(1) + eeq.d(lruVar.d());
                        int iE = lruVar.e();
                        String str3 = eeq.d(15) + eeq.d(1) + eeq.d(iE);
                        if (lruVar.c() != null) {
                            String strD = d(iE, lruVar.c());
                            String strD2 = d(iE, "...");
                            if (!TextUtils.isEmpty(strD)) {
                                ReleaseLogUtil.d("R_NotifySendUtil", "setStringTextList textContentLength: ", Integer.valueOf(strD.length() / 2), " ,sContentLength: ", Integer.valueOf(d));
                                String strC = c(iE, strD, strD2, d(lruVar));
                                str = eeq.d(16) + b(strC.length() / 2) + strC;
                            } else {
                                str = "";
                            }
                        } else {
                            str = "";
                        }
                        d(sb, str2, str3, str);
                    }
                }
            }
        }
    }

    private static String d(int i2, String str) {
        if (i2 == 2) {
            return eeq.a(str);
        }
        if (i2 == 1) {
            return eeq.i(str);
        }
        if (i2 == 3) {
            return eeq.a(str);
        }
        LogUtil.a("NotifySendUtil", "textFormat: ", Integer.valueOf(i2));
        return "";
    }

    private static void d(StringBuilder sb, String str, String str2, String str3) {
        String strB = b((str + str2 + str3).length() / 2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eeq.d(141));
        sb2.append(strB);
        sb.append(sb2.toString());
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static String c(int i2, String str, String str2, int i3) {
        if (str.length() / 2 <= i3) {
            return str;
        }
        String strSubstring = str.substring(0, (i3 - 6) * 2);
        String strD = eeq.d(strSubstring);
        char[] charArray = strD.substring(strD.length() - 2).toCharArray();
        char c2 = charArray[0];
        char c3 = charArray[1];
        if (!Character.isHighSurrogate(c2) || !Character.isLowSurrogate(c3)) {
            strSubstring = d(i2, strD.substring(0, strD.length() - 1));
            LogUtil.a("NotifySendUtil", "getSportDeviceTextContentHex discard last char");
        }
        String str3 = strSubstring + str2;
        LogUtil.a("NotifySendUtil", "getSportDeviceTextContentHex source textContentHex: ", str);
        return str3;
    }

    private static int d(lru lruVar) {
        if (lruVar.d() == 5) {
            return f;
        }
        if (lruVar.d() == 6) {
            return f42891c;
        }
        if (lruVar.d() == 7) {
            return e;
        }
        return d;
    }

    public static String b(int i2) {
        if (i2 > 127) {
            return eeq.d((i2 >> 7) + 128) + eeq.d(i2 & 127);
        }
        return eeq.d(i2);
    }

    public static void b(nct nctVar) {
        if (nctVar == null) {
            return;
        }
        i = nctVar.h();
        g = nctVar.i();
        f42889a = nctVar.c();
        d = nctVar.a();
        f = nctVar.d();
        f42891c = nctVar.e();
        e = nctVar.b();
    }

    private static String c(int i2, String str) {
        String strI;
        String strD = "";
        if (str == null) {
            strI = "";
        } else {
            if (i2 == 2) {
                strI = eeq.a(str);
            } else if (i2 == 1) {
                strI = eeq.i(str);
            } else {
                LogUtil.j("NotifySendUtil", "textFormat is default");
                strI = "";
            }
            if (!"".equals(strI)) {
                strD = eeq.d(strI.length() / 2);
            } else {
                strD = eeq.d(0);
            }
        }
        return eeq.d(16) + strD + strI;
    }

    public static String d(lrv lrvVar, DataPromptData dataPromptData) {
        String str;
        String str2;
        String string;
        String str3;
        String strC = "";
        if (lrvVar == null || dataPromptData == null) {
            return "";
        }
        if (!lrvVar.j()) {
            str = "";
            str2 = str;
            string = str2;
        } else {
            if (!lrvVar.g()) {
                str3 = "";
            } else {
                String str4 = eeq.d(15) + eeq.d(1) + eeq.d(dataPromptData.getTextFormat());
                if (lrvVar.f()) {
                    strC = c(dataPromptData.getTextFormat(), dataPromptData.getTextContent());
                }
                str3 = strC;
                strC = str4;
            }
            String str5 = eeq.d(141) + b((strC + str3).length() / 2);
            StringBuilder sb = new StringBuilder();
            sb.append(eeq.d(140));
            sb.append(b(((strC + str3).length() / 2) + 2));
            string = sb.toString();
            String str6 = str3;
            str = strC;
            strC = str5;
            str2 = str6;
        }
        nci nciVar = new nci();
        nciVar.c(strC);
        nciVar.a(str);
        nciVar.d(str2);
        nciVar.e(string);
        return a(lrvVar, dataPromptData, nciVar);
    }

    private static String a(lrv lrvVar, DataPromptData dataPromptData, nci nciVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String strC;
        String str6;
        String str7 = "";
        if (lrvVar.c()) {
            if (lrvVar.e()) {
                if (lrvVar.d()) {
                    str6 = eeq.d(8) + eeq.d(2) + eeq.e(dataPromptData.getDotMatrixHeight());
                } else {
                    str6 = "";
                }
                if (lrvVar.a()) {
                    str3 = eeq.d(9) + eeq.d(2) + eeq.e(dataPromptData.getDotMatrixWidth());
                } else {
                    str3 = "";
                }
                if (lrvVar.b()) {
                    str7 = eeq.d(10) + eeq.d(1) + eeq.d(dataPromptData.getDotMatrixColor());
                }
                String str8 = str6;
                strC = c(lrvVar, dataPromptData);
                str5 = str7;
                str7 = str8;
            } else {
                str5 = "";
                strC = str5;
                str3 = strC;
            }
            String strB = b((str7 + str3 + str5 + strC).length() / 2);
            String str9 = strC;
            str2 = str5;
            str = str7;
            str7 = eeq.d(134) + strB;
            str4 = str9;
        } else {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
        }
        String str10 = eeq.d(UserInfomation.WEIGHT_DEFAULT_ENGLISH) + b((str7 + nciVar.c() + nciVar.e() + nciVar.d() + nciVar.a() + str + str3 + str2 + str4).length() / 2);
        String str11 = (eeq.d(2) + eeq.d(1) + eeq.d(dataPromptData.getPromptType())) + (eeq.d(3) + eeq.d(1) + eeq.d(dataPromptData.getMotorEnable())) + str10 + str7 + str + str3 + str2 + str4 + nciVar.c() + nciVar.e() + nciVar.d() + nciVar.a();
        LogUtil.a("NotifySendUtil", "promptMsgToTLVS result: ", str11);
        return str11;
    }

    private static String c(lrv lrvVar, DataPromptData dataPromptData) {
        if (lrvVar.e() && dataPromptData.getDotMatrixData() != null) {
            String strE = eeq.e(dataPromptData.getDotMatrixData());
            return eeq.d(11) + b(strE.length() / 2) + strE;
        }
        return "";
    }

    private static long a(Context context, String str) {
        long j;
        String strE = SharedPreferenceManager.e(context, String.valueOf(10039), str);
        try {
            j = Long.parseLong(strE);
        } catch (NumberFormatException unused) {
            LogUtil.e("NotifySendUtil", "getCurrentSystemTime NumberFormatException");
            j = 0;
        }
        LogUtil.a("NotifySendUtil", "getCurrentSystemTime currentTime is: ", strE, " ,time is: ", Long.valueOf(j));
        return j;
    }

    private static void e(Context context, long j, String str) {
        if (SharedPreferenceManager.e(context, String.valueOf(10039), str, String.valueOf(j), f42890b) == 0) {
            LogUtil.a("NotifySendUtil", "setCurrentSystemTime setSharedPreference success");
        } else {
            LogUtil.j("NotifySendUtil", "setCurrentSystemTime setSharedPreference failed");
        }
    }

    public static long b(Context context) {
        if (context == null) {
            LogUtil.j("NotifySendUtil", "getSendingMessageNumberTime context is null");
            return 0L;
        }
        LogUtil.a("NotifySendUtil", "getSendingMessageNumberTime");
        return a(context, "notify_update_record_sending_number_time");
    }

    public static void a(Context context, long j) {
        if (context == null) {
            LogUtil.j("NotifySendUtil", "setSendingMessageNumberTime context is null");
        } else {
            LogUtil.a("NotifySendUtil", "setSendingMessageNumberTime is: ", Long.valueOf(j));
            e(context, j, "notify_update_record_sending_number_time");
        }
    }

    public static long a(Context context) {
        if (context == null) {
            LogUtil.j("NotifySendUtil", "getReportBiTime context is null");
            return 0L;
        }
        LogUtil.a("NotifySendUtil", "getReportBiTime");
        return a(context, "notify_update_report_sending_number_time");
    }

    public static void e(Context context, long j) {
        if (context == null) {
            LogUtil.j("NotifySendUtil", "setReportBiTime context is null");
        } else {
            LogUtil.a("NotifySendUtil", "setReportBiTime is: ", Long.valueOf(j));
            e(context, j, "notify_update_report_sending_number_time");
        }
    }

    public static void e(Context context, int i2) {
        int i3;
        if (context == null) {
            LogUtil.j("NotifySendUtil", "setSendingNumber context is null");
            return;
        }
        try {
            i3 = Integer.parseInt(SharedPreferenceManager.e(context, String.valueOf(10039), "sending_message_number"));
        } catch (NumberFormatException unused) {
            LogUtil.e("NotifySendUtil", "setSendingNumber NumberFormatException");
            i3 = 0;
        }
        if (SharedPreferenceManager.e(context, String.valueOf(10039), "sending_message_number", String.valueOf(i3 + i2), f42890b) == 0) {
            LogUtil.a("NotifySendUtil", "setSendingNumber setSharedPreference success");
        } else {
            LogUtil.j("NotifySendUtil", "setSendingNumber setSharedPreference failed");
        }
    }

    public static void e(Context context) {
        if (context == null) {
            LogUtil.j("NotifySendUtil", "reportBiToService context is null");
            return;
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(10039), "sending_message_number");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
        linkedHashMap.put("push", strE);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.NOTIFY_SEND_MESSAGE_2129003.value(), linkedHashMap);
        LogUtil.a("NotifySendUtil", "report BI success,reportBiToService value is: ", strE);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("NotifySendUtil", "formatNumbers phoneNumber is empty");
            return "";
        }
        String number = PhoneNumberUtils.formatNumber(str, Locale.getDefault().getCountry());
        return TextUtils.isEmpty(number) ? str : number;
    }

    public static String e(String str) {
        return (TextUtils.isEmpty(str) || str.length() < 3) ? str : str.substring(str.length() - 3);
    }

    public static ndi a(ndi ndiVar) {
        if (ndiVar == null) {
            LogUtil.e("NotifySendUtil", "pushNotificationToDevice querySms ERROR: smsReceivedInfo is null,please check it!");
            return null;
        }
        long jF = ndiVar.f();
        if (jF == 0) {
            LogUtil.e("NotifySendUtil", "pushNotificationToDevice querySms ERROR: smsReceivedTime is 0L,please check it!");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        b(jF, arrayList);
        if (!arrayList.isEmpty() && arrayList.get(0) != null) {
            int size = arrayList.size();
            LogUtil.a("NotifySendUtil", "pushNotificationToDevice querySmsBoxByTime find resultList have ", Integer.valueOf(size), " items,first: ", arrayList.toString());
            return (ndi) arrayList.get(0);
        }
        if (!TextUtils.isEmpty(ndiVar.b()) || TextUtils.isEmpty(ndiVar.d())) {
            return null;
        }
        LogUtil.a("NotifySendUtil", "pushNotificationToDevice querySms by content start");
        d(ndiVar);
        b(ndiVar.d(), arrayList);
        return c(jF, arrayList);
    }

    private static void b(String str, final List<ndi> list) {
        if (TextUtils.isEmpty(str) || list == null) {
            return;
        }
        Uri uri = Telephony.Sms.Inbox.CONTENT_URI;
        String[] strArr = {"_id", "address", "date", "read", "type", TtmlNode.TAG_BODY, "sub_id", "error_code", "creator"};
        ContactsDatabaseUtils.e eVarC = new ContactsDatabaseUtils.e().e(uri).a(strArr).d("body LIKE ?  AND read=0 AND type=1").e(new String[]{"%" + str + '%'}).c("date DESC");
        LogUtil.a("NotifySendUtil", "pushNotificationToDevice selectSmsListByContent sql: ", lsu.a(uri.toString(), strArr, "body LIKE ?  AND read=0 AND type=1", null, "date DESC"));
        ContactsDatabaseUtils.a(eVarC, new ContactsDatabaseUtils.ResultCallback() { // from class: nco
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils.ResultCallback
            public final void onResult(Object obj) {
                ncp.c(list, (Cursor) obj);
            }
        });
    }

    static /* synthetic */ void c(List list, Cursor cursor) {
        Objects.requireNonNull(list);
        e(cursor, new ncn(list));
    }

    public static void b(long j, final List<ndi> list) {
        LogUtil.a("NotifySendUtil", "querySmsBoxByTime start!smsReceivedTime: ", Long.valueOf(j));
        if (j == 0 || list == null) {
            return;
        }
        Uri uri = Telephony.Sms.Inbox.CONTENT_URI;
        String[] strArr = {"_id", "address", "date", "read", "type", TtmlNode.TAG_BODY, "sub_id", "error_code", "creator"};
        String[] strArr2 = {String.valueOf(j)};
        ContactsDatabaseUtils.e eVarC = new ContactsDatabaseUtils.e().e(uri).a(strArr).d("date=? AND read=0 AND type=1").e(strArr2).c("date DESC");
        LogUtil.a("NotifySendUtil", "pushNotificationToDevice querySmsBoxByTime sql:", lsu.a(uri.toString(), strArr, "date=? AND read=0 AND type=1", strArr2, "date DESC"));
        ContactsDatabaseUtils.a(eVarC, new ContactsDatabaseUtils.ResultCallback() { // from class: ncq
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils.ResultCallback
            public final void onResult(Object obj) {
                ncp.d(list, (Cursor) obj);
            }
        });
    }

    static /* synthetic */ void d(List list, Cursor cursor) {
        Objects.requireNonNull(list);
        e(cursor, new ncn(list));
    }

    private static ndi c(long j, List<ndi> list) {
        ndi ndiVar = null;
        if (j == 0) {
            LogUtil.j("NotifySendUtil", "pushNotificationToDevice getRecentOneSms failed: smsReceivedTime is 0");
            return null;
        }
        boolean z = false;
        if (list.size() == 1) {
            LogUtil.a("NotifySendUtil", "pushNotificationToDevice getRecentOneSms result list has only one item: ", list.get(0).toString(), ",notiPushTime: ", Long.valueOf(j));
            return list.get(0);
        }
        for (ndi ndiVar2 : list) {
            long jF = ndiVar2.f();
            if (!z || (jF <= j && Math.abs(j - jF) <= Math.abs(j - ndiVar.f()))) {
                ndiVar = ndiVar2;
                z = true;
            }
        }
        if (ndiVar == null) {
            LogUtil.e("NotifySendUtil", "pushNotificationToDevice getRecentOneSms occurs error: mostRecently SMS is null");
            return ndiVar;
        }
        LogUtil.a("NotifySendUtil", "pushNotificationToDevice getRecentOneSms result is: ", ndiVar.toString(), ",notiPushTime: ", Long.valueOf(j));
        return ndiVar;
    }

    private static void d(ndi ndiVar) {
        String strD = ndiVar.d();
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("NotifySendUtil", "pushNotificationToDevice  querySms by content error: content is empty");
            return;
        }
        int iIndexOf = strD.indexOf("]");
        if (iIndexOf > 0 && iIndexOf < strD.length() - 1) {
            strD = strD.substring(iIndexOf + 1).trim();
        }
        if (strD.length() > 10) {
            strD = strD.substring(0, 10);
            char[] charArray = strD.substring(strD.length() - 2).toCharArray();
            if (!Character.isHighSurrogate(charArray[0]) || !Character.isLowSurrogate(charArray[1])) {
                strD = strD.substring(0, strD.length() - 1);
                LogUtil.a("NotifySendUtil", "pushNotificationToDevice querySmsByContent discard last char");
            }
        }
        LogUtil.a("NotifySendUtil", "pushNotificationToDevice dealWithContent content:", strD);
        ndiVar.b(strD);
    }

    public static void e(Cursor cursor, ContactsDatabaseUtils.ResultCallback<ndi> resultCallback) {
        String string;
        if (ContactsDatabaseUtils.d(cursor)) {
            LogUtil.j("NotifySendUtil", "pushNotificationToDevice assembleSmsReceivedInfo cursor ".concat(cursor == null ? "is null!" : "cannot move!"));
            return;
        }
        LogUtil.d("NotifySendUtil", "pushNotificationToDevice assembleSmsReceivedInfo cursor.getCount(): ", Integer.valueOf(cursor.getCount()), ",cursor.getColumnCount(): ", Integer.valueOf(cursor.getColumnCount()), ",cursor.getColumnNames(): ", Arrays.toString(cursor.getColumnNames()));
        Integer numA = lsu.a("_id", cursor, "NotifySendUtil");
        Integer numA2 = lsu.a("creator", cursor, "NotifySendUtil");
        Integer numA3 = lsu.a("address", cursor, "NotifySendUtil");
        Integer numA4 = lsu.a(TtmlNode.TAG_BODY, cursor, "NotifySendUtil");
        Integer numA5 = lsu.a("error_code", cursor, "NotifySendUtil");
        Integer numA6 = lsu.a("sub_id", cursor, "NotifySendUtil");
        Integer numA7 = lsu.a("type", cursor, "NotifySendUtil");
        Integer numA8 = lsu.a("read", cursor, "NotifySendUtil");
        Integer numA9 = lsu.a("date", cursor, "NotifySendUtil");
        if (numA == null) {
            LogUtil.j("NotifySendUtil", "pushNotificationToDevice assembleSmsReceivedInfo smsDbIdIndex is null!");
            return;
        }
        int i2 = 0;
        do {
            i2++;
            String string2 = "";
            String string3 = numA2 == null ? "" : cursor.getString(numA2.intValue());
            if (numA3 == null) {
                string = "";
            } else {
                string = cursor.getString(numA3.intValue());
            }
            if (numA4 != null) {
                string2 = cursor.getString(numA4.intValue());
            }
            ndi ndiVar = new ndi(string3, string, string2, cursor.getInt(numA.intValue()), numA5 == null ? -100 : cursor.getInt(numA5.intValue()), numA6 == null ? -100 : cursor.getInt(numA6.intValue()), numA7 == null ? -100 : cursor.getInt(numA7.intValue()), numA8 != null ? cursor.getInt(numA8.intValue()) : -100, numA9 == null ? -100L : cursor.getLong(numA9.intValue()));
            LogUtil.d("NotifySendUtil", "pushNotificationToDevice assembleSmsReceivedInfo smsReceivedInfo: ", ndiVar.toString(), ",content: " + ndiVar.d());
            resultCallback.onResult(ndiVar);
        } while (cursor.moveToNext());
        LogUtil.a("NotifySendUtil", "pushNotificationToDevice assembleSmsReceivedInfo cursor.getCount(): ", Integer.valueOf(cursor.getCount()), ",result number: ", Integer.valueOf(i2));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00b4: MOVE (r13 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:31:0x00b4 */
    public static ndi a(String str) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Uri uri = Telephony.Sms.Inbox.CONTENT_URI;
        String[] strArr = {"address", "sub_id"};
        Cursor cursor2 = null;
        ndi ndiVar = null;
        try {
            try {
                cursorQuery = BaseApplication.getContext().getContentResolver().query(uri, strArr, "address=?", new String[]{str}, "date DESC");
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.getCount() != 0) {
                            LogUtil.a("NotifySendUtil", lsu.a(uri.toString(), strArr, "address=?", new String[]{e(str)}, "date DESC"));
                            if (cursorQuery.moveToNext()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("address"));
                                int i2 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("sub_id"));
                                LogUtil.a("NotifySendUtil", "querySmsByPhoneNumber address: ", e(string), " subId:", Integer.valueOf(i2));
                                ndiVar = new ndi(string, i2);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return ndiVar;
                        }
                    } catch (SQLException | IllegalArgumentException | SecurityException unused) {
                        LogUtil.e("NotifySendUtil", "querySmsByPhoneNumber Exception");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                }
                LogUtil.j("NotifySendUtil", "querySmsByPhoneNumber cursor is null or no data ", Boolean.valueOf(cursorQuery == null));
                if (cursorQuery != null) {
                    cursorQuery.close();
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLException | IllegalArgumentException | SecurityException unused2) {
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    /* JADX WARN: Code duplicated, block: B:51:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static ndi c(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        ?? r3 = 0;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strD = d(str2);
            LogUtil.a("NotifySendUtil", "queryMmsByContent content: ", strD);
            try {
                try {
                    cursorQuery = BaseApplication.getContext().getContentResolver().query(Uri.withAppendedPath(Telephony.Mms.CONTENT_URI, "part"), new String[]{"text", "mid"}, "text LIKE ?", new String[]{"%" + strD + '%'}, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.getCount() == 0) {
                                LogUtil.j("NotifySendUtil", "queryMmsByContent part cursor is null");
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                    return null;
                                }
                            } else {
                                int iE = -1;
                                int i2 = -1;
                                while (cursorQuery.moveToNext()) {
                                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("text"));
                                    i2 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("mid"));
                                    LogUtil.a("NotifySendUtil", "queryMmsByContent mid: ", Integer.valueOf(i2), " text: ", string);
                                    iE = e(i2, str);
                                }
                                if (iE != -1 && i2 != -1) {
                                    String strA = a(i2);
                                    LogUtil.a("NotifySendUtil", "queryMmsByContent address: ", e(strA));
                                    ndi ndiVar = TextUtils.isEmpty(strA) ? null : new ndi(strA, iE);
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    return ndiVar;
                                }
                                LogUtil.j("NotifySendUtil", "queryMmsByContent subId or mid is -1");
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                    return null;
                                }
                            }
                        } catch (SQLException e2) {
                            e = e2;
                            LogUtil.e("NotifySendUtil", "queryMmsByContent Exception ", LogAnonymous.b(e));
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (IllegalArgumentException e3) {
                            e = e3;
                            LogUtil.e("NotifySendUtil", "queryMmsByContent Exception ", LogAnonymous.b(e));
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (SecurityException e4) {
                            e = e4;
                            LogUtil.e("NotifySendUtil", "queryMmsByContent Exception ", LogAnonymous.b(e));
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                    } else {
                        LogUtil.j("NotifySendUtil", "queryMmsByContent part cursor is null");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            return null;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    r3 = strD;
                    if (r3 != 0) {
                        r3.close();
                    }
                    throw th;
                }
            } catch (SQLException e5) {
                e = e5;
                cursorQuery = null;
                LogUtil.e("NotifySendUtil", "queryMmsByContent Exception ", LogAnonymous.b(e));
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (IllegalArgumentException e6) {
                e = e6;
                cursorQuery = null;
                LogUtil.e("NotifySendUtil", "queryMmsByContent Exception ", LogAnonymous.b(e));
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (SecurityException e7) {
                e = e7;
                cursorQuery = null;
                LogUtil.e("NotifySendUtil", "queryMmsByContent Exception ", LogAnonymous.b(e));
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        }
        return null;
    }

    private static int e(int i2, String str) {
        Cursor cursor = null;
        int i3 = -1;
        try {
            try {
                Cursor cursorQuery = BaseApplication.getContext().getContentResolver().query(Telephony.Mms.CONTENT_URI, new String[]{"sub_id", Claims.SUBJECT}, "_id=?", new String[]{String.valueOf(i2)}, null);
                if (cursorQuery != null && cursorQuery.getCount() != 0) {
                    if (cursorQuery.moveToNext()) {
                        i3 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("sub_id"));
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(Claims.SUBJECT));
                        if (!TextUtils.isEmpty(string)) {
                            string = new String(string.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
                        }
                        LogUtil.a("NotifySendUtil", "querySubIdByMmsPdu subId: ", Integer.valueOf(i3), " subject: ", string);
                        if (str.equals(string)) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i3;
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return i3;
                }
                LogUtil.j("NotifySendUtil", "querySubIdByMmsPdu pdu cursor is null");
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return -1;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLException | IllegalArgumentException e2) {
            LogUtil.e("NotifySendUtil", "querySubIdByMmsPdu Exception ", LogAnonymous.b(e2));
            if (0 != 0) {
                cursor.close();
            }
            return -1;
        }
    }

    private static String a(int i2) {
        String string = "";
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = BaseApplication.getContext().getContentResolver().query(Telephony.Mms.CONTENT_URI.buildUpon().appendPath(String.valueOf(i2)).appendPath("addr").build(), new String[]{"address"}, "type=?", new String[]{"137"}, null);
                if (cursorQuery != null && cursorQuery.getCount() != 0) {
                    if (cursorQuery.moveToNext()) {
                        string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("address"));
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return string;
                }
                LogUtil.j("NotifySendUtil", "queryAddressByMmsAddr addr cursor is null");
                if (cursorQuery != null) {
                    cursorQuery.close();
                    return "";
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLException | IllegalArgumentException e2) {
            LogUtil.e("NotifySendUtil", "queryAddressByMmsAddr Exception ", LogAnonymous.b(e2));
            if (0 != 0) {
                cursor.close();
            }
        }
        return "";
    }

    private static String d(String str) {
        if (str.length() <= 10) {
            return str;
        }
        String strSubstring = str.substring(0, 10);
        char[] charArray = strSubstring.substring(strSubstring.length() - 2).toCharArray();
        if (Character.isHighSurrogate(charArray[0]) && Character.isLowSurrogate(charArray[1])) {
            return strSubstring;
        }
        String strSubstring2 = strSubstring.substring(0, strSubstring.length() - 1);
        LogUtil.a("NotifySendUtil", "queryMmsByContent discard last char");
        return strSubstring2;
    }

    public static List<String> c(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("NotifySendUtil", "getValidPhoneNumber phoneNumber is empty");
            return arrayList;
        }
        String strReplaceAll = str.replaceAll("[^\\d]", "");
        if (strReplaceAll.length() < 3) {
            LogUtil.j("NotifySendUtil", "getValidPhoneNumber replaceNumber not is digits only");
            return arrayList;
        }
        if (strReplaceAll.startsWith("86")) {
            arrayList.add(Marker.ANY_NON_NULL_MARKER + strReplaceAll);
            arrayList.add(strReplaceAll.substring(2));
            return arrayList;
        }
        arrayList.add(strReplaceAll);
        return arrayList;
    }

    public static void b(Intent intent, Context context) {
        if (intent == null) {
            LogUtil.j("NotifySendUtil", "pushPromptToDevice intent is null");
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.j("NotifySendUtil", "pushPromptToDevice current device is disconnected");
            return;
        }
        DeviceInfo deviceInfo = deviceList.get(0);
        if (deviceInfo != null && deviceInfo.getProductType() == 57) {
            LogUtil.j("NotifySendUtil", "pushPromptToDevice current device is galileo");
        } else {
            a(intent, context);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    private static void a(Intent intent, Context context) {
        String stringExtra;
        byte b2;
        String stringExtra2 = null;
        try {
            stringExtra = intent.getStringExtra("type");
            try {
                stringExtra2 = intent.getStringExtra("message_short");
            } catch (Exception unused) {
                LogUtil.e("NotifySendUtil", "pushPromptToDevice error");
            }
        } catch (Exception unused2) {
            stringExtra = null;
        }
        LogUtil.a("NotifySendUtil", "pushPromptToDevice type: ", stringExtra, " message_short: ", stringExtra2);
        if (stringExtra == null || stringExtra2 == null) {
            return;
        }
        DataPromptData dataPromptData = new DataPromptData();
        boolean z = true;
        dataPromptData.setMotorEnable(1);
        dataPromptData.setTextFormat(2);
        dataPromptData.setTextContent(stringExtra2);
        lrv lrvVar = new lrv(new boolean[]{false, false, false, false, false, true, true, true});
        stringExtra.hashCode();
        switch (stringExtra) {
            case "flight":
                b2 = 0;
                break;
            case "train":
                b2 = 1;
                break;
            case "weather":
                b2 = 2;
                break;
            case "warm_remind":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            dataPromptData.setPromptType(7);
        } else if (b2 == 1) {
            dataPromptData.setPromptType(8);
        } else if (b2 == 2) {
            dataPromptData.setPromptType(10);
        } else if (b2 != 3) {
            z = false;
        } else {
            dataPromptData.setPromptType(9);
        }
        e(z, dataPromptData, lrvVar, context);
    }

    private static void e(boolean z, DataPromptData dataPromptData, lrv lrvVar, Context context) {
        if (z) {
            LogUtil.a("NotifySendUtil", "pushPromptToDevice start NotifySendData to send command");
            if (ncl.d(context) == null) {
                LogUtil.j("NotifySendUtil", "isSendCommand NotifySendData is null");
                return;
            } else {
                ncl.d(context).b(ncl.d(context).a(dataPromptData, lrvVar), 1);
                return;
            }
        }
        LogUtil.j("NotifySendUtil", "postPromptMsg failure type is not support");
    }

    public static boolean t() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportRepeatedNotifyProcess deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 94);
    }

    public static boolean c() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportDeleteSingleNotification deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 120);
    }

    public static boolean i() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportHarmonyNotificationCollaboration deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, Constants.MAX_PRO_BOTTOM_MARGIN_PAD);
    }

    public static boolean d() {
        Intent intent = new Intent();
        intent.setAction("com.huawei.action.NOTIFICATION_DECISION_CENTER");
        List<ResolveInfo> listQueryIntentContentProviders = BaseApplication.getContext().getPackageManager().queryIntentContentProviders(intent, 0);
        if (listQueryIntentContentProviders != null && !listQueryIntentContentProviders.isEmpty()) {
            return true;
        }
        LogUtil.j("NotifySendUtil", "isPhoneHarmonyNotificationCollaboration resolveInfoList is empty");
        return false;
    }

    public static boolean f() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportHfpConnectNum deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 126);
    }

    public static boolean o() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportNotifyReminderSwitchClose deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 121);
    }

    public static boolean q() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportWechatCallPush deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 130);
    }

    public static boolean l() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportOverseasCallPush deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 152);
    }

    public static void s() {
        int i2;
        DeviceInfo next = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        if (CollectionUtils.a(deviceList)) {
            c(-3, 0);
            LogUtil.a("NotifySendUtil", "saveToProviderConnectDeviceInfo HAS_NO_CONNECTED_MAIN_DEVICES!");
            return;
        }
        Iterator<DeviceInfo> it = deviceList.iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = 0;
                break;
            }
            next = it.next();
            if (c(next)) {
                i2 = 1;
                break;
            }
        }
        if (next == null) {
            return;
        }
        c(next.getProductType(), i2);
        LogUtil.a("NotifySendUtil", "saveToProviderConnectDeviceInfo device isSupportNotify? ", Boolean.valueOf(i2 == 1));
    }

    private static void c(int i2, int i3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("serialIndex", (Integer) 1);
        contentValues.put("DeviceType", Integer.valueOf(i2));
        contentValues.put("isSupportNotify", Integer.valueOf(i3));
        try {
            BaseApplication.getContext().getContentResolver().update(Uri.parse(lsu.f40767b), contentValues, "serialIndex=?", new String[]{String.valueOf(1)});
        } catch (SQLException | IllegalArgumentException | SecurityException e2) {
            LogUtil.e("NotifySendUtil", "insertStateIntoConnectDeviceInfo Exception:", LogAnonymous.b(e2));
        }
    }

    public static boolean c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isDeviceSupportNotificationPush: input param DEVICEINFO is NULL!");
            return false;
        }
        DeviceCapability deviceCapabilityD = d(deviceInfo);
        if (deviceCapabilityD == null) {
            LogUtil.j("NotifySendUtil", "isDeviceSupportNotificationPush: device capabilities is NULL!");
            return false;
        }
        if (!deviceCapabilityD.isMessageAlert()) {
            LogUtil.j("NotifySendUtil", "isDeviceSupportNotificationPush: device notification push capability INCAPABLE!");
            return false;
        }
        LogUtil.a("NotifySendUtil", "isDeviceSupportNotificationPush: device notification push capability SUPPORT!");
        return true;
    }

    public static DeviceCapability d(DeviceInfo deviceInfo) {
        Map<String, DeviceCapability> mapQueryDeviceCapability;
        HwDeviceMgrInterface hwDeviceMgrInterfaceE = mkf.e(BaseApplication.getContext());
        if (hwDeviceMgrInterfaceE == null || (mapQueryDeviceCapability = hwDeviceMgrInterfaceE.queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "NotifySendUtil")) == null || mapQueryDeviceCapability.isEmpty()) {
            return null;
        }
        return mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
    }

    public static boolean a() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportSyncIconMain deviceInfo is null");
            return false;
        }
        boolean zD = eey.d(deviceInfo, 73);
        LogUtil.d("NotifySendUtil", "0x18 deviceReplyAbility result is: ", Boolean.valueOf(zD));
        return zD;
    }

    public static boolean m() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportRepeatedNotifyProcess deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 176);
    }

    public static boolean k() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportNotifySubTextBigText deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 257);
    }

    public static boolean j() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportNotifySubTextBigText deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 260);
    }

    public static boolean p() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportVoipType deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 185);
    }

    public static boolean b() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportVoipType deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 194);
    }

    public static boolean e() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportOverseasCallPush deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 200);
    }

    public static boolean g() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportRepeatedNotifyProcess deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 219);
    }

    public static boolean h() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportHealthSummaryAddExtraField deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 243);
    }

    public static boolean r() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportVoipType deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 249);
    }

    public static boolean n() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendUtil");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("NotifySendUtil", "isSupportNotifyPicture deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 256);
    }
}

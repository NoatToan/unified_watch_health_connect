package defpackage;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mty {
    public static void d(Cursor cursor, mtc mtcVar) {
        if (cursor == null || mtcVar == null) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setContactFieldsWithDataCursor: cursor or rawContactBean is null.");
            return;
        }
        String string = cursor.getString(2);
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setContactFieldsWithDataCursor: mimeType: is null or empty.");
            return;
        }
        if ("vnd.android.cursor.item/phone_v2".equals(string)) {
            n(cursor, mtcVar);
            return;
        }
        if ("vnd.android.cursor.item/name".equals(string)) {
            s(cursor, mtcVar);
            return;
        }
        if ("vnd.android.cursor.item/nickname".equals(string)) {
            i(cursor, mtcVar);
            return;
        }
        if ("vnd.android.cursor.item/email_v2".equals(string)) {
            j(cursor, mtcVar);
            return;
        }
        if ("vnd.android.cursor.item/organization".equals(string)) {
            m(cursor, mtcVar);
            return;
        }
        if ("vnd.android.cursor.item/note".equals(string)) {
            f(cursor, mtcVar);
            return;
        }
        if ("vnd.android.cursor.item/contact_event".equals(string)) {
            g(cursor, mtcVar);
            return;
        }
        if ("vnd.android.cursor.item/photo".equals(string)) {
            k(cursor, mtcVar);
            return;
        }
        if ("vnd.android.cursor.item/website".equals(string)) {
            r(cursor, mtcVar);
            return;
        }
        if ("vnd.android.cursor.item/relation".equals(string)) {
            l(cursor, mtcVar);
            return;
        }
        if ("vnd.android.cursor.item/postal-address_v2".equals(string)) {
            e(cursor, mtcVar);
        } else if (!"vnd.android.cursor.item/im".equals(string)) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setContactFieldsWithDataCursor else, mimeType: ", string);
        } else {
            h(cursor, mtcVar);
        }
    }

    public static void b(Cursor cursor, mtc mtcVar) {
        if (cursor == null || mtcVar == null) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setContactFieldsWithDataCursor: cursor or rawContactBean is null.");
            return;
        }
        String string = cursor.getString(2);
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setContactFieldsWithDataCursor: mimeType: is null or empty.");
            return;
        }
        LogUtil.a("setContactFieldsWithDataCursor mimeType is ", string);
        if ("vnd.android.cursor.item/phone_v2".equals(string)) {
            o(cursor, mtcVar);
        } else if (!"vnd.android.cursor.item/name".equals(string)) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setContactFieldsWithDataCursor else, mimeType: ", string);
        } else {
            p(cursor, mtcVar);
        }
    }

    public static void a(Cursor cursor, mtc mtcVar, boolean z) {
        if (cursor == null || mtcVar == null) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setContactHiCallFields: cursor or rawContactBean is null.");
        } else if ("vnd.huawei.cursor.item/hicall_device".equals(cursor.getString(2))) {
            d(cursor, mtcVar, z);
        }
    }

    public static void c(Cursor cursor, mtc mtcVar) {
        if (cursor == null || mtcVar == null) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setContactHiCallFields: cursor or rawContactBean is null.");
            return;
        }
        mtcVar.setVersion(cursor.getString(1));
        mtcVar.l(cursor.getString(2));
        mtcVar.n(cursor.getString(3));
        mtcVar.c(cursor.getString(4));
        mtcVar.b(cursor.getString(5));
        if (CommonUtil.bb()) {
            mtcVar.o(cursor.getString(6));
            mtcVar.j(cursor.getString(7));
        }
    }

    public static void a(Cursor cursor, mtc mtcVar) {
        if (cursor == null || mtcVar == null) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setContactFieldsWithRawConCurSport: cursor or rawContactBean is null.");
            return;
        }
        mtcVar.setVersion(cursor.getString(1));
        mtcVar.l(cursor.getString(2));
        mtcVar.n(cursor.getString(3));
        mtcVar.c(cursor.getString(4));
        mtcVar.b(cursor.getString(5));
        mtcVar.f(cursor.getString(6));
    }

    private static void i(Cursor cursor, mtc mtcVar) {
        mtcVar.g(cursor.getString(3));
    }

    private static void j(Cursor cursor, mtc mtcVar) {
        String string = cursor.getString(3);
        int i = cursor.getInt(4);
        if (a(string)) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "email number is null");
            return;
        }
        if (i == 2) {
            mtcVar.c("vnd.android.cursor.item/email_v2", 2, string);
        } else if (i == 3) {
            mtcVar.c("vnd.android.cursor.item/email_v2", 3, string);
        } else {
            mtcVar.c("vnd.android.cursor.item/email_v2", 1, string);
        }
    }

    private static void f(Cursor cursor, mtc mtcVar) {
        String string = cursor.getString(3);
        if (string == null) {
            string = "";
        }
        mtcVar.i(string);
    }

    private static void g(Cursor cursor, mtc mtcVar) {
        int i = cursor.getInt(4);
        String string = cursor.getString(3);
        if (a(string)) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "event value is null");
            return;
        }
        if (i == 0) {
            String string2 = cursor.getString(5);
            if (a(string2)) {
                mtcVar.c("vnd.android.cursor.item/contact_event", 1, string);
                return;
            } else {
                mtcVar.a("vnd.android.cursor.item/contact_event", string2, string);
                return;
            }
        }
        if (i == 1) {
            mtcVar.c("vnd.android.cursor.item/contact_event", 1, string);
            return;
        }
        if (i == 2) {
            mtcVar.c("vnd.android.cursor.item/contact_event", 2, string);
            return;
        }
        if (i == 3) {
            mtcVar.c("vnd.android.cursor.item/contact_event", 3, string);
        } else if (i == 4) {
            mtcVar.c("vnd.android.cursor.item/contact_event", 4, string);
        } else {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setEventFields type: ", Integer.valueOf(i));
        }
    }

    private static void k(Cursor cursor, mtc mtcVar) {
        byte[] blob = cursor.getBlob(17);
        if (blob != null && blob.length > 0) {
            mtcVar.a(blob);
        }
        mtcVar.h(cursor.getString(12));
    }

    private static void m(Cursor cursor, mtc mtcVar) {
        mtcVar.e("data1", cursor.getString(3));
        mtcVar.e("data4", cursor.getString(6));
    }

    private static void d(Cursor cursor, mtc mtcVar, boolean z) {
        mtu mtuVar = new mtu();
        String string = cursor.getString(3);
        if (!a(string)) {
            mtuVar.n(string);
        }
        String string2 = cursor.getString(6);
        if (!a(string2)) {
            mtuVar.b(string2);
        }
        mtuVar.c(cursor.getInt(7));
        String string3 = cursor.getString(8);
        if (!a(string3)) {
            mtuVar.e("true".equalsIgnoreCase(string3));
        }
        mtuVar.a(cursor.getLong(9));
        String string4 = cursor.getString(10);
        if (!a(string4)) {
            mtuVar.c("true".equalsIgnoreCase(string4));
        }
        mtuVar.e(cursor.getInt(11));
        String string5 = cursor.getString(13);
        if (!a(string5)) {
            mtuVar.e(string5);
        }
        String string6 = cursor.getString(15);
        if (!a(string6)) {
            mtuVar.g(string6);
        }
        mtuVar.e(cursor.getLong(18));
        mtuVar.c(cursor.getLong(19));
        b(cursor, z, mtuVar);
        mtcVar.a(mtuVar);
    }

    private static void h(Cursor cursor, mtc mtcVar) {
        int i = cursor.getInt(7);
        String string = cursor.getString(3);
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setImFields: IM value is null or empty.");
            return;
        }
        if (a(i)) {
            mtcVar.c("vnd.android.cursor.item/im", i, string);
            return;
        }
        if (i != -1) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setImFields: other else branch: unsupported im type. ");
            return;
        }
        String string2 = cursor.getString(8);
        if (TextUtils.isEmpty(string2)) {
            mtcVar.c("vnd.android.cursor.item/im", 0, string);
        } else {
            mtcVar.a("vnd.android.cursor.item/im", string2, string);
        }
    }

    private static void b(Cursor cursor, boolean z, mtu mtuVar) {
        String string = cursor.getString(12);
        if (!a(string)) {
            if (z) {
                mtuVar.d(string);
            } else {
                mtuVar.f(string);
            }
        }
        String string2 = cursor.getString(14);
        if (!a(string2)) {
            if (z) {
                mtuVar.j(string2);
            } else {
                mtuVar.a(string2);
            }
        }
        String string3 = cursor.getString(16);
        if (z) {
            mtuVar.h(string3);
        } else {
            mtuVar.i(string3);
        }
        String string4 = cursor.getString(17);
        if (z) {
            return;
        }
        mtuVar.c(string4);
    }

    private static void n(Cursor cursor, mtc mtcVar) {
        String string = cursor.getString(3);
        int i = cursor.getInt(4);
        if (a(string)) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setPhoneFields: phone is null");
            return;
        }
        if (b(i)) {
            mtcVar.c("vnd.android.cursor.item/phone_v2", i, string);
        } else if (i != 0) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setPhoneFields: unknown phone type.");
        } else {
            mtcVar.a("vnd.android.cursor.item/phone_v2", cursor.getString(5), string);
        }
    }

    private static void o(Cursor cursor, mtc mtcVar) {
        String string = cursor.getString(3);
        CharSequence typeLabel = ContactsContract.CommonDataKinds.Phone.getTypeLabel(BaseApplication.getContext().getResources(), cursor.getInt(4), cursor.getString(5));
        if (a(string)) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setPhoneFields2: phone is null");
        } else {
            mtcVar.a("vnd.android.cursor.item/phone_v2", typeLabel.toString(), string);
        }
    }

    private static void s(Cursor cursor, mtc mtcVar) {
        String string = cursor.getString(5);
        if (string == null) {
            string = "";
        }
        mtcVar.d("data3", string);
        String string2 = cursor.getString(4);
        if (string2 == null) {
            string2 = "";
        }
        mtcVar.d("data2", string2);
        String string3 = cursor.getString(7);
        if (string3 == null) {
            string3 = "";
        }
        mtcVar.d("data5", string3);
        String string4 = cursor.getString(6);
        if (string4 == null) {
            string4 = "";
        }
        mtcVar.d("data4", string4);
        String string5 = cursor.getString(8);
        if (string5 == null) {
            string5 = "";
        }
        mtcVar.d("data6", string5);
        String string6 = cursor.getString(11);
        if (string6 == null) {
            string6 = "";
        }
        mtcVar.d("data9", string6);
        String string7 = cursor.getString(9);
        if (string7 == null) {
            string7 = "";
        }
        mtcVar.d("data7", string7);
        String string8 = cursor.getString(10);
        mtcVar.d("data8", string8 != null ? string8 : "");
    }

    private static void p(Cursor cursor, mtc mtcVar) {
        String string = cursor.getString(3);
        if (string == null) {
            string = "";
        }
        mtcVar.d("data1", string);
    }

    private static void e(Cursor cursor, mtc mtcVar) {
        int[] iArr = {7, 8, 6, 9, 10, 11, 12};
        int i = cursor.getInt(4);
        String[] strArr = new String[7];
        for (int i2 = 0; i2 < 7; i2++) {
            String string = cursor.getString(iArr[i2]);
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            strArr[i2] = string;
        }
        if (i == 0) {
            String string2 = cursor.getString(5);
            if (TextUtils.isEmpty(string2)) {
                mtcVar.e(1, strArr);
                return;
            } else {
                mtcVar.d(string2, strArr);
                return;
            }
        }
        if (i == 1 || i == 2 || i == 3) {
            mtcVar.e(i, strArr);
        } else {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setAddressFields: else branch.");
        }
    }

    private static void r(Cursor cursor, mtc mtcVar) {
        String string = cursor.getString(3);
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setWebSiteFields: value is null.");
        }
        switch (cursor.getInt(4)) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
                mtcVar.c("vnd.android.cursor.item/website", 7, string);
                break;
            case 4:
                mtcVar.c("vnd.android.cursor.item/website", 4, string);
                break;
            case 5:
                mtcVar.c("vnd.android.cursor.item/website", 5, string);
                break;
            default:
                LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setWebSiteFields: default branch.");
                break;
        }
    }

    private static void l(Cursor cursor, mtc mtcVar) {
        String string = cursor.getString(3);
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setRelationFields: value is null.");
            return;
        }
        int i = cursor.getInt(4);
        if (e(i)) {
            a(cursor, mtcVar, string, i);
        } else {
            mtcVar.c("vnd.android.cursor.item/relation", i, string);
        }
    }

    private static void a(Cursor cursor, mtc mtcVar, String str, int i) {
        if (i != 0) {
            LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "setRelationFields: unknown relation type.");
            return;
        }
        String string = cursor.getString(5);
        if (TextUtils.isEmpty(string)) {
            mtcVar.c("vnd.android.cursor.item/relation", 1, str);
        } else {
            mtcVar.a("vnd.android.cursor.item/relation", string, str);
        }
    }

    private static boolean e(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return false;
            default:
                LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "isCustomRelationType: not support custom relation type.");
                return true;
        }
    }

    private static boolean a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "isImType: not support im type.");
                return false;
        }
    }

    private static boolean b(int i) {
        if (i != 10 && i != 17 && i != 20 && i != 12 && i != 13) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    LogUtil.j("ContactSync", 1, "RawContactBeanUtils", "isPhoneType: not support phone type.");
                    return false;
            }
        }
        return true;
    }

    private static boolean a(String str) {
        return TextUtils.isEmpty(str);
    }
}

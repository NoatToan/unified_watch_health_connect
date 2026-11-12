package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.SyncHelper;
import com.huawei.hwlogsmodel.LogUtil;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes11.dex */
public class mte {
    public static String e(mtc mtcVar) {
        if (mtcVar == null) {
            LogUtil.j("ContactSync", 1, "ContactVcardBuilder", "[buildVCard] : bean is null");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(1024);
        stringBuffer.append("BEGIN:VCARD\r\nVERSION:2.1\r\n");
        d(stringBuffer);
        i(mtcVar, stringBuffer);
        l(mtcVar, stringBuffer);
        n(mtcVar, stringBuffer);
        d(mtcVar, stringBuffer);
        b(mtcVar, stringBuffer);
        a(mtcVar, stringBuffer);
        q(mtcVar, stringBuffer);
        h(mtcVar, stringBuffer);
        m(mtcVar, stringBuffer);
        g(mtcVar, stringBuffer);
        t(mtcVar, stringBuffer);
        j(mtcVar, stringBuffer);
        k(mtcVar, stringBuffer);
        r(mtcVar, stringBuffer);
        p(mtcVar, stringBuffer);
        e(mtcVar, stringBuffer);
        s(mtcVar, stringBuffer);
        o(mtcVar, stringBuffer);
        c(mtcVar, stringBuffer);
        f(mtcVar, stringBuffer);
        stringBuffer.append("END:VCARD").append("\r\n");
        return stringBuffer.toString();
    }

    private static void d(StringBuffer stringBuffer) {
        stringBuffer.append("X-HW-VERSION:").append(90006300).append("\r\n");
    }

    private static void i(mtc mtcVar, StringBuffer stringBuffer) {
        String strD = mtw.d(mtcVar.d("data3"), "");
        String strD2 = mtw.d(mtcVar.d("data2"), "");
        String strD3 = mtw.d(mtcVar.d("data5"), "");
        String strD4 = mtw.d(mtcVar.d("data4"), "");
        String strD5 = mtw.d(mtcVar.d("data6"), "");
        if (mtz.a(strD, strD2, strD3, strD4, strD5)) {
            stringBuffer.append("N;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:").append(strD).append(";").append(strD2).append(";").append(strD3).append(";").append(strD4).append(";").append(strD5).append("\r\n");
            if (mtz.b(strD)) {
                mtw.e(stringBuffer, "FN;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", strD2);
                return;
            }
            if (mtz.b(strD2)) {
                mtw.e(stringBuffer, "FN;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", strD);
                return;
            }
            mtw.e(stringBuffer, "FN;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", strD2 + " " + strD);
        }
    }

    private static void l(mtc mtcVar, StringBuffer stringBuffer) {
        String strD = mtw.d(mtcVar.d("data7"), "");
        String strD2 = mtw.d(mtcVar.d("data8"), "");
        String strD3 = mtw.d(mtcVar.d("data9"), "");
        if (mtz.a(strD, strD2, strD3)) {
            stringBuffer.append("X-PHONETIC;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:").append(strD3).append(";").append(strD).append(";").append(strD2).append("\r\n");
        }
    }

    private static void n(mtc mtcVar, StringBuffer stringBuffer) {
        mtw.d("vnd.android.cursor.item/phone_v2", mtcVar, stringBuffer);
        mtw.a(mtcVar.e("vnd.android.cursor.item/phone_v2", 2), "TEL;CELL:", stringBuffer);
        mtw.a(mtcVar.e("vnd.android.cursor.item/phone_v2", 17), "TEL;CELL;WORK:", stringBuffer);
        mtw.a(mtcVar.e("vnd.android.cursor.item/phone_v2", 1), "TEL;HOME:", stringBuffer);
        mtw.a(mtcVar.e("vnd.android.cursor.item/phone_v2", 3), "TEL;WORK:", stringBuffer);
        mtw.a(mtcVar.e("vnd.android.cursor.item/phone_v2", 12), "TEL;PREF:", stringBuffer);
        mtw.a(mtcVar.e("vnd.android.cursor.item/phone_v2", 7), "TEL;VOICE:", stringBuffer);
        mtw.a(mtcVar.e("vnd.android.cursor.item/phone_v2", 10), "TEL;WORK;PREF:", stringBuffer);
        mtw.a(mtcVar.e("vnd.android.cursor.item/phone_v2", 20), "TEL;MSG:", stringBuffer);
        mtw.a(mtcVar.e("vnd.android.cursor.item/phone_v2", 13), "TEL;FAX:", stringBuffer);
        mtw.a(mtcVar.e("vnd.android.cursor.item/phone_v2", 5), "TEL;FAX;HOME:", stringBuffer);
        mtw.a(mtcVar.e("vnd.android.cursor.item/phone_v2", 6), "TEL;PAGER:", stringBuffer);
        mtw.a(mtcVar.e("vnd.android.cursor.item/phone_v2", 4), "TEL;FAX;WORK:", stringBuffer);
    }

    private static void d(mtc mtcVar, StringBuffer stringBuffer) {
        mtw.a(mtcVar.e("vnd.android.cursor.item/email_v2", 3), "EMAIL;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/email_v2", 1), "EMAIL;HOME;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/email_v2", 2), "EMAIL;WORK;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.d("vnd.android.cursor.item/email_v2", mtcVar, stringBuffer);
    }

    private static void b(mtc mtcVar, StringBuffer stringBuffer) {
        mtw.e(mtcVar.d(1), "ADR;HOME;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.e(mtcVar.d(2), "ADR;WORK;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.e(mtcVar.d(3), "ADR;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.d("vnd.android.cursor.item/postal-address_v2", mtcVar, stringBuffer);
    }

    private static void a(mtc mtcVar, StringBuffer stringBuffer) {
        mtw.e(stringBuffer, "ORG;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", mtw.e(mtcVar.e("data1")));
    }

    private static void q(mtc mtcVar, StringBuffer stringBuffer) {
        mtw.e(stringBuffer, "TITLE;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", mtw.e(mtcVar.e("data4")));
    }

    private static void h(mtc mtcVar, StringBuffer stringBuffer) {
        mtw.a(mtcVar.e("vnd.android.cursor.item/im", 0), "X-AIM;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/im", 6), "X-ICQ;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/im", 7), "X-JABBER;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/im", 1), "X-MSN;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/im", 2), "X-YAHOO;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/im", 4), "X-QQ;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/im", 3), "X-SKYPE-USERNAME;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/im", 5), "X-GOOGLE-TALK;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.d("vnd.android.cursor.item/im", mtcVar, stringBuffer);
    }

    private static void m(mtc mtcVar, StringBuffer stringBuffer) {
        mtw.e(stringBuffer, "NOTE;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", mtw.e(mtcVar.j()));
    }

    private static void g(mtc mtcVar, StringBuffer stringBuffer) {
        mtw.e(stringBuffer, "X-NICKNAME;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", mtw.e(mtcVar.g()));
    }

    private static void t(mtc mtcVar, StringBuffer stringBuffer) {
        mtw.a(mtcVar.e("vnd.android.cursor.item/website", 7), "URL;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/website", 4), "URL;HOME;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/website", 5), "URL;WORK;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
    }

    private static void j(mtc mtcVar, StringBuffer stringBuffer) {
        mtw.a(mtcVar.e("vnd.android.cursor.item/contact_event", 3), "BDAY:", stringBuffer);
        mtw.a(mtcVar.e("vnd.android.cursor.item/contact_event", 4), "X-BDAY-LUNAR:", stringBuffer);
        mtw.a(mtcVar.e("vnd.android.cursor.item/contact_event", 1), "X-CUSTOM-EVENT-1:", stringBuffer);
        mtw.a(mtcVar.e("vnd.android.cursor.item/contact_event", 2), "X-CUSTOM-EVENT-2:", stringBuffer);
        mtw.d("vnd.android.cursor.item/contact_event", mtcVar, stringBuffer);
    }

    private static void k(mtc mtcVar, StringBuffer stringBuffer) {
        mtw.a(mtcVar.e("vnd.android.cursor.item/relation", 1), "X-CUSTOM-RELATION-1;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/relation", 2), "X-CUSTOM-RELATION-2;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/relation", 3), "X-CUSTOM-RELATION-3;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/relation", 4), "X-CUSTOM-RELATION-4;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/relation", 5), "X-CUSTOM-RELATION-5;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/relation", 6), "X-CUSTOM-RELATION-6;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/relation", 7), "X-CUSTOM-RELATION-7;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/relation", 8), "X-CUSTOM-RELATION-8;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/relation", 9), "X-CUSTOM-RELATION-9;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/relation", 10), "X-CUSTOM-RELATION-10;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/relation", 11), "X-CUSTOM-RELATION-11;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/relation", 12), "X-CUSTOM-RELATION-12;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/relation", 13), "X-CUSTOM-RELATION-13;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.a(mtcVar.e("vnd.android.cursor.item/relation", 14), "X-CUSTOM-RELATION-14;ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:", stringBuffer, SyncHelper.Encode.ENCODE);
        mtw.d("vnd.android.cursor.item/relation", mtcVar, stringBuffer);
    }

    private static void r(mtc mtcVar, StringBuffer stringBuffer) {
        mtw.e(stringBuffer, "X-HW-STARED-ORDER:", mtcVar.m());
    }

    private static void p(mtc mtcVar, StringBuffer stringBuffer) {
        mtw.e(stringBuffer, "X-HW-TIMES-CONTACTED:", mtcVar.o());
    }

    private static void e(mtc mtcVar, StringBuffer stringBuffer) {
        mtw.e(stringBuffer, "X-CUSTOM-PARAM:", mtcVar.k() + ";" + mtcVar.h());
    }

    private static void s(mtc mtcVar, StringBuffer stringBuffer) {
        mtw.e(stringBuffer, "UID:", mtcVar.getUid());
    }

    private static void o(mtc mtcVar, StringBuffer stringBuffer) {
        if (mtcVar.f() != null) {
            mtw.e(stringBuffer, "X-HW-PHOTO:", mtcVar.f());
        }
        mtw.e(stringBuffer, "PHOTO;ENCODING=BASE64:", new String(Base64.encode(mtcVar.i(), 2), StandardCharsets.UTF_8));
        if (mtcVar.b() != null) {
            mtw.e(stringBuffer, "X-CARD:", mtcVar.b());
        }
    }

    private static void c(mtc mtcVar, StringBuffer stringBuffer) {
        if (!mtz.b(mtcVar.d())) {
            mtw.e(stringBuffer, "X-HW-ACCOUNT-TYPE:", mtcVar.d());
        }
        if (mtz.b(mtcVar.a())) {
            return;
        }
        mtw.e(stringBuffer, "X-HW-ACCOUNT-NAME:", mtcVar.a());
    }

    private static void f(mtc mtcVar, StringBuffer stringBuffer) {
        if (mtj.d().equals(mtcVar.d())) {
            String strE = mtcVar.e();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            mtw.e(stringBuffer, "X-HW-HICALL-DATA:", strE);
        }
    }
}

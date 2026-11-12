package br2;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.v;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.m0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbr2/c;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f19585a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f19586b;

    static {
        int i14 = gt2.c.f79010a;
        f19586b = gt2.b.f79005a.h("PAY#AlertDialogUtil");
    }

    private c() {
    }

    public static void h(c cVar, Context context, e23.a aVar, e23.a aVar2, int i14) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        if ((i14 & 4) != 0) {
            aVar2 = null;
        }
        cVar.getClass();
        context.getClass();
        String string = context.getString(R.string.dialog_title_error);
        string.getClass();
        String string2 = context.getString(R.string.wallet_generic_server_error);
        androidx.appcompat.app.e eVarQ = q(cVar, context, string, string2, new p(p6.b.d(context, R.string.lbl_ok, string2), new a51.g(aVar, 15)), aVar2 != null ? new p(context.getString(R.string.lbl_try_again), new a51.g(aVar2, 14)) : null, null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public static void j(c cVar, hn2.c cVar2, e23.a aVar) {
        cVar.getClass();
        String string = cVar2.getString(R.string.wallet_title_app_not_installed);
        string.getClass();
        String string2 = cVar2.getString(R.string.wallet_install_app);
        string2.getClass();
        String string3 = cVar2.getString(R.string.google_play_store);
        string3.getClass();
        String string4 = cVar2.getString(R.string.lbl_cancel);
        string4.getClass();
        androidx.appcompat.app.e eVarQ = q(cVar, cVar2, string, string2, new p(string3, new a51.g(aVar, 11)), new p(string4, new bb1.a((byte) 0, 6)), null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public static androidx.appcompat.app.e q(c cVar, Context context, String str, String str2, p pVar, p pVar2, p pVar3, boolean z14, int i14) {
        if ((i14 & 16) != 0) {
            pVar2 = null;
        }
        if ((i14 & 32) != 0) {
            pVar3 = null;
        }
        if ((i14 & 64) != 0) {
            z14 = false;
        }
        cVar.getClass();
        context.getClass();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(new ContextThemeWrapper(context, R.style.AlertDialogTheme));
                aVar.setTitle(str);
                aVar.setMessage(str2);
                aVar.setPositiveButton((CharSequence) pVar.f128594a, new b((e23.p) pVar.f128595b, 2));
                if (pVar2 != null) {
                    aVar.setNegativeButton((CharSequence) pVar2.f128594a, new b((e23.p) pVar2.f128595b, 3));
                }
                if (pVar3 != null) {
                    aVar.setNeutralButton((CharSequence) pVar3.f128594a, new b((e23.p) pVar3.f128595b, 4));
                }
                androidx.appcompat.app.e eVarCreate = aVar.create();
                eVarCreate.getClass();
                eVarCreate.setOnDismissListener(null);
                eVarCreate.setCanceledOnTouchOutside(z14);
                return eVarCreate;
            }
        }
        return null;
    }

    public static androidx.appcompat.app.e r(c cVar, androidx.fragment.app.m mVar, String str, String[] strArr, int i14, e23.p pVar, p pVar2) {
        cVar.getClass();
        strArr.getClass();
        if (mVar.isFinishing() || mVar.isDestroyed()) {
            return null;
        }
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(new ContextThemeWrapper(mVar, R.style.AlertDialogTheme));
        aVar.setTitle(str);
        aVar.setMessage((CharSequence) null);
        aVar.setSingleChoiceItems(strArr, i14, new b(pVar, 0));
        aVar.setNegativeButton((CharSequence) pVar2.f128594a, new b((e23.p) pVar2.f128595b, 1));
        androidx.appcompat.app.e eVarCreate = aVar.create();
        eVarCreate.getClass();
        eVarCreate.setCanceledOnTouchOutside(false);
        return eVarCreate;
    }

    public static m0 s(v vVar, String str, String str2, int i14, e23.l lVar, int i15, e23.l lVar2) {
        return m0.a.c(m0.f149759e, str, str2, i14, new a71.k(lVar, 1), i15, lVar2 != null ? new a71.k(lVar2, 2) : null, 192);
    }

    public static /* synthetic */ m0 t(c cVar, v vVar, String str, String str2, e23.l lVar) {
        cVar.getClass();
        return s(vVar, str, str2, R.string.lbl_common_continue, lVar, -1, null);
    }

    public final void a(e23.a aVar, Context context) {
        String strE = a0.e(R.string.banner_bluetooth_off_title, context);
        String string = context.getString(R.string.banner_bluetooth_off_info);
        String strD = p6.b.d(context, R.string.lbl_enable, string);
        String string2 = context.getString(R.string.lbl_cancel);
        string2.getClass();
        androidx.appcompat.app.e eVarQ = q(this, context, strE, string, new p(strD, new a51.g(aVar, 16)), new p(string2, new bb1.a((byte) 0, 8)), null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public final void b(Context context) {
        String string = context.getString(R.string.wallet_title_card_not_removed);
        String strD = p6.b.d(context, R.string.wallet_message_card_removal_unsuccessful, string);
        String string2 = context.getString(R.string.lbl_ok);
        string2.getClass();
        androidx.appcompat.app.e eVarQ = q(this, context, string, strD, new p(string2, new bb1.a((byte) 0, 4)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public final void c(Context context, String str, e23.a aVar) {
        String strE = a0.e(R.string.card_partially_added, context);
        String string = context.getString(R.string.common_button_ok);
        string.getClass();
        androidx.appcompat.app.e eVarQ = q(this, context, strE, str, new p(string, new a51.g(aVar, 13)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.setCancelable(false);
        }
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public final androidx.appcompat.app.e d(Context context, String str, e23.a<Unit> aVar) {
        String strE = a0.e(R.string.devices_not_connected, context);
        String string = context.getString(R.string.device_text_how_to_connect);
        string.getClass();
        String str2 = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        String string2 = context.getString(R.string.lbl_ok);
        androidx.appcompat.app.e eVarQ = q(this, context, strE, str2, new p(string2, new a51.g(aVar, 12)), new p(p6.b.d(context, R.string.common_learn_more, string2), new a(context, 0)), null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
        return eVarQ;
    }

    public final void e(Context context, String str, e23.a aVar) {
        String str2 = String.format(a0.e(R.string.connect_iq_device_is_busy, context), Arrays.copyOf(new Object[]{str}, 1));
        String string = context.getString(R.string.connect_iq_music_setup_try_again);
        androidx.appcompat.app.e eVarQ = q(this, context, str2, string, new p(p6.b.d(context, R.string.lbl_ok, string), new a51.g(aVar, 23)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public final androidx.appcompat.app.e f(Context context, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
        String strE = a0.e(R.string.garmin_pay_unavailable, context);
        String string = context.getString(R.string.garmin_pay_maintenance_message);
        String strD = p6.b.d(context, R.string.garmin_pay_check_status, string);
        String string2 = context.getString(R.string.lbl_cancel);
        string2.getClass();
        androidx.appcompat.app.e eVarQ = q(this, context, strE, string, new p(strD, new a51.g(aVar, 9)), new p(string2, new a51.g(aVar2, 10)), null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
        return eVarQ;
    }

    public final androidx.appcompat.app.e g(e23.a aVar, Context context) {
        context.getClass();
        f19586b.debug("createAndShowGenericDeviceErrorDialog()");
        String string = context.getString(R.string.dialog_title_error);
        string.getClass();
        String string2 = context.getString(R.string.txt_error_occurred);
        androidx.appcompat.app.e eVarQ = q(this, context, string, string2, new p(p6.b.d(context, R.string.lbl_ok, string2), new a51.g(aVar, 24)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
        return eVarQ;
    }

    public final void i(Context context, e23.a aVar, e23.a aVar2) {
        String string = context.getString(R.string.golf_lbl_setup_error);
        String strD = p6.b.d(context, R.string.mobile_auth_msg_sign_in_attempt_failed, string);
        String string2 = context.getString(R.string.lbl_try_again);
        androidx.appcompat.app.e eVarQ = q(this, context, string, strD, new p(string2, new a51.g(aVar, 19)), new p(p6.b.d(context, R.string.lbl_cancel, string2), new a51.g(aVar2, 20)), null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public final void k(Context context) {
        String strE = a0.e(R.string.wallet_status_not_connected_to_garminpay, context);
        String string = context.getString(R.string.device_text_how_to_connect_nfc);
        String strD = p6.b.d(context, R.string.lbl_ok, string);
        String string2 = context.getString(R.string.lbl_settings);
        string2.getClass();
        androidx.appcompat.app.e eVarQ = q(this, context, strE, string, new p(strD, new bb1.a((byte) 0, 12)), new p(string2, new a(context, 1)), null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public final void l(Context context) {
        String strE = a0.e(R.string.wallet_status_not_connected_to_garminpay, context);
        String string = context.getString(R.string.message_nfc_stack_failed);
        androidx.appcompat.app.e eVarQ = q(this, context, strE, string, new p(p6.b.d(context, R.string.lbl_ok, string), new bb1.a((byte) 0, 11)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public final void m(Context context) {
        String string = context.getString(R.string.wallet_no_supported_cards_title);
        String strD = p6.b.d(context, R.string.wallet_device_does_not_support_cards_in_this_region_message, string);
        String string2 = context.getString(R.string.lbl_ok);
        string2.getClass();
        androidx.appcompat.app.e eVarQ = q(this, context, string, strD, new p(string2, new bb1.a((byte) 0, 7)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public final void n(Context context, String str, e23.a aVar) {
        context.getClass();
        str.getClass();
        String string = context.getString(R.string.wallet_unable_to_process_refund);
        string.getClass();
        String string2 = context.getString(R.string.wallet_message_unable_to_process_refund, str);
        String strD = p6.b.d(context, R.string.lbl_ok, string2);
        String string3 = context.getString(R.string.lbl_cancel);
        string3.getClass();
        androidx.appcompat.app.e eVarQ = q(this, context, string, string2, new p(strD, new a51.g(aVar, 8)), new p(string3, new bb1.a((byte) 0, 5)), null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public final androidx.appcompat.app.e o(Context context, e23.a aVar, rr2.a aVar2) {
        String strE = a0.e(R.string.wallet_reset_garmin_pay_message_lbl, context);
        String string = context.getString(R.string.wallet_reset_garmin_pay_info_lbl);
        String strD = p6.b.d(context, R.string.wallet_reset_wallet_confirm, string);
        String string2 = context.getString(R.string.lbl_cancel);
        string2.getClass();
        androidx.appcompat.app.e eVarQ = q(this, context, strE, string, new p(strD, new a51.g(aVar, 17)), new p(string2, new a51.g(aVar2, 18)), null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
        return eVarQ;
    }

    public final void p(com.garmin.android.apps.connectmobile.v vVar, e23.a aVar, e23.a aVar2) {
        String string = vVar.getString(R.string.mobile_auth_title_unable_to_continue);
        string.getClass();
        String string2 = vVar.getString(R.string.msg_common_server_error_try_again);
        string2.getClass();
        String string3 = vVar.getString(R.string.lbl_ok);
        string3.getClass();
        String string4 = vVar.getString(R.string.lbl_cancel);
        string4.getClass();
        androidx.appcompat.app.e eVarQ = q(this, vVar, string, string2, new p(string3, new a51.g(aVar, 21)), new p(string4, new a51.g(aVar2, 22)), null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }
}

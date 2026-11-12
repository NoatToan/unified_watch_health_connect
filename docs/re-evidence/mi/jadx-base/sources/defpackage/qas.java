package defpackage;

import android.content.Context;
import com.miui.tsmclient.model.ErrorCode;
import com.miui.tsmclient.util.ResUtils;

/* JADX INFO: loaded from: classes3.dex */
public class qas {
    public static String a(Context context, int i) {
        String str;
        if (context == null) {
            return null;
        }
        if (i == 21128) {
            str = "wrong_data_format";
        } else if (i == 21129) {
            str = "wrong_rsp_from_server";
        } else if (i == 22003) {
            str = "invalid_parameter";
        } else if (i != 23000) {
            switch (i) {
                case 22011:
                    str = "query_mailbox_io_error";
                    break;
                case 22012:
                case 22013:
                case 22017:
                    str = "ccc_share_url_occupied";
                    break;
                case 22014:
                case 22018:
                    str = "ccc_share_url_invalid";
                    break;
                case 22015:
                case 22016:
                    str = "update_mailbox_io_error";
                    break;
                case 22019:
                    str = "ccc_track_error";
                    break;
                case 22020:
                case 22021:
                    str = "ccc_share_fail";
                    break;
                case 22022:
                    str = "ccc_share_import_request_error";
                    break;
                default:
                    return ErrorCode.findText(context, i);
            }
        } else {
            str = "ccc_share_service_unavailable";
        }
        return ResUtils.getString(context, str);
    }
}

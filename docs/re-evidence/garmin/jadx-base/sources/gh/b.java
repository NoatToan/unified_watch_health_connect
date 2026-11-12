package gh;

import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.garmin.android.gncs.NotificationConstants;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends Handler {
    public b(Looper looper) {
        super(looper);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Uri uri;
        Uri uri2;
        Cursor cursorQuery;
        Object obj;
        if (message.what == 11) {
            int i14 = message.getData().getInt(NotificationConstants.KEY_DATA_MIME_TYPE);
            String string = message.getData().getString("appid");
            a aVar = c.f77417j;
            aVar.getClass();
            String string2 = null;
            if (i14 == 0) {
                uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
            } else if (i14 == 1) {
                uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + string);
            } else {
                if (i14 != 2) {
                    if (i14 != 4) {
                        uri2 = null;
                    } else {
                        uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS");
                    }
                    cursorQuery = aVar.f77407a.getContentResolver().query(uri2, null, null, null, null);
                    if (cursorQuery != null) {
                        string2 = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("value")) : null;
                        cursorQuery.close();
                    }
                    c.f77414g = string2;
                    obj = c.f77411d;
                    synchronized (obj) {
                        obj.notify();
                    }
                }
                uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + string);
            }
            uri2 = uri;
            cursorQuery = aVar.f77407a.getContentResolver().query(uri2, null, null, null, null);
            if (cursorQuery != null) {
                if (cursorQuery.moveToNext()) {
                }
                cursorQuery.close();
            }
            c.f77414g = string2;
            obj = c.f77411d;
            synchronized (obj) {
                obj.notify();
            }
        }
    }
}

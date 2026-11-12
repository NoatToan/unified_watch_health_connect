package v52;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static final void a(com.garmin.android.apps.connectmobile.c cVar, String str, String str2, DialogInterface.OnClickListener onClickListener) {
        cVar.getClass();
        new androidx.appcompat.app.e.a(cVar).setTitle(str).setMessage(str2).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.lbl_delete, onClickListener).show();
    }
}

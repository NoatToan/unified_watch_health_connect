package bd0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public class k0 extends androidx.appcompat.app.e.a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f17586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.app.e f17587b;

    public interface a {
        void b(boolean z14);
    }

    @SuppressLint({"InflateParams"})
    public k0(Context context, String str, a aVar) {
        super(context);
        this.f17587b = null;
        this.f17586a = aVar;
        setCancelable(false);
        setTitle(R.string.lbl_device_setup);
        setMessage(context.getString(R.string.pairing_gdi_authentication_failure, TextUtils.isEmpty(str) ? "" : str));
        setPositiveButton(R.string.lbl_try_again, this);
        setNegativeButton(R.string.lbl_cancel, this);
        this.f17587b = show();
    }

    public final void a() {
        androidx.appcompat.app.e eVar = this.f17587b;
        if (eVar != null) {
            eVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        dialogInterface.dismiss();
        this.f17586a.b(-1 == i14);
    }
}

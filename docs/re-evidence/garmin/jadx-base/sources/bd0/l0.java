package bd0;

import android.content.Context;
import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public class l0 extends androidx.appcompat.app.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f17590a;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            dialogInterface.dismiss();
            l0.this.f17590a.a(false);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            dialogInterface.dismiss();
            l0.this.f17590a.a(true);
        }
    }

    public interface c {
        void a(boolean z14);
    }

    public l0(Context context, c cVar) {
        super(context);
        this.f17590a = cVar;
        setCancelable(false);
        setTitle("");
        setMessage(context.getString(R.string.pairing_invalid_unitid));
        setNegativeButton(R.string.lbl_close, new a());
        setPositiveButton(R.string.pref_contact_us_title, new b()).show();
    }
}

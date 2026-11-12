package u20;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.i;
import com.garmin.android.apps.connectmobile.R;
import tn.k;

/* JADX INFO: loaded from: classes8.dex */
public class d extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f167881a;

    public interface a {
        void k(boolean z14);
    }

    public static d u6(String str, String str2, String str3) {
        d dVar = new d();
        Bundle bundleD = k.d("ENTITY_NAME_EXTRA", str, "POSITIVE_BUTTON_TEXT_EXTRA", str2);
        bundleD.putString("NEGATIVE_BUTTON_TEXT_EXTRA", str3);
        dVar.setArguments(bundleD);
        return dVar;
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        a aVar = this.f167881a;
        if (aVar != null) {
            aVar.k(false);
        }
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        String string;
        String string2;
        String string3;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("ENTITY_NAME_EXTRA");
            string3 = arguments.getString("POSITIVE_BUTTON_TEXT_EXTRA");
            string2 = arguments.getString("NEGATIVE_BUTTON_TEXT_EXTRA");
        } else {
            string = null;
            string2 = null;
            string3 = null;
        }
        if (TextUtils.isEmpty(string)) {
            string = getActivity().getString(R.string.txt_untitle);
        }
        if (TextUtils.isEmpty(string3)) {
            string3 = getString(R.string.lbl_yes);
        }
        if (TextUtils.isEmpty(string2)) {
            string2 = getString(R.string.lbl_no);
        }
        final int i14 = 0;
        final int i15 = 1;
        return new androidx.appcompat.app.e.a(getActivity()).setMessage(string).setPositiveButton(string3, new DialogInterface.OnClickListener(this) { // from class: u20.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f167880b;

            {
                this.f167880b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i16) {
                switch (i14) {
                    case 0:
                        d.a aVar = this.f167880b.f167881a;
                        if (aVar != null) {
                            aVar.k(true);
                        }
                        break;
                    default:
                        d.a aVar2 = this.f167880b.f167881a;
                        if (aVar2 != null) {
                            aVar2.k(false);
                        }
                        break;
                }
            }
        }).setNegativeButton(string2, new DialogInterface.OnClickListener(this) { // from class: u20.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f167880b;

            {
                this.f167880b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i16) {
                switch (i15) {
                    case 0:
                        d.a aVar = this.f167880b.f167881a;
                        if (aVar != null) {
                            aVar.k(true);
                        }
                        break;
                    default:
                        d.a aVar2 = this.f167880b.f167881a;
                        if (aVar2 != null) {
                            aVar2.k(false);
                        }
                        break;
                }
            }
        }).create();
    }
}

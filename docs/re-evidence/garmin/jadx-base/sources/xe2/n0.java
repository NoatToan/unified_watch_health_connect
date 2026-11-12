package xe2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mobileauth.ui.MobileAuthButton;
import com.garmin.android.library.mobileauth.ui.MobileAuthTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 {
    public static AlertDialog a(Context context, String str, String str2, DialogInterface.OnDismissListener onDismissListener, final k.a aVar, String str3, String str4, int i14) {
        if ((i14 & 8) != 0) {
            onDismissListener = null;
        }
        if ((i14 & 16) != 0) {
            aVar = null;
        }
        if ((i14 & 32) != 0) {
            str3 = null;
        }
        if ((i14 & 64) != 0) {
            str4 = null;
        }
        context.getClass();
        str2.getClass();
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setCancelable(false).create();
        if (onDismissListener != null) {
            alertDialogCreate.setOnDismissListener(onDismissListener);
        }
        alertDialogCreate.getClass();
        View viewInflate = View.inflate(context, R.layout.mobileauth_error_dialog, null);
        if (str != null) {
            MobileAuthTextView mobileAuthTextView = (MobileAuthTextView) viewInflate.findViewById(R.id.mobile_auth_error_dialog_title);
            mobileAuthTextView.setText(str);
            mobileAuthTextView.setVisibility(0);
        }
        ((MobileAuthTextView) viewInflate.findViewById(R.id.mobile_auth_error_dialog_msg)).setText(str2);
        MobileAuthButton mobileAuthButton = (MobileAuthButton) viewInflate.findViewById(R.id.mobile_auth_error_dialog_button_ok);
        if (str3 == null) {
            str3 = context.getString(R.string.lbl_ok);
            str3.getClass();
        }
        mobileAuthButton.setText(str3);
        final int i15 = 0;
        mobileAuthButton.setOnClickListener(new View.OnClickListener() { // from class: xe2.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        try {
                            alertDialogCreate.dismiss();
                            l0 l0Var = aVar;
                            if (l0Var != null) {
                                l0Var.a();
                            }
                        } catch (IllegalStateException unused) {
                            return;
                        }
                        break;
                    default:
                        try {
                            alertDialogCreate.dismiss();
                            l0 l0Var2 = aVar;
                            if (l0Var2 != null) {
                                l0Var2.b();
                            }
                        } catch (IllegalStateException unused2) {
                            return;
                        }
                        break;
                }
            }
        });
        if (str4 != null) {
            MobileAuthButton mobileAuthButton2 = (MobileAuthButton) viewInflate.findViewById(R.id.mobile_auth_error_dialog_button_secondary);
            mobileAuthButton2.setText(str4);
            mobileAuthButton2.setVisibility(0);
            final int i16 = 1;
            mobileAuthButton2.setOnClickListener(new View.OnClickListener() { // from class: xe2.m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i16) {
                        case 0:
                            try {
                                alertDialogCreate.dismiss();
                                l0 l0Var = aVar;
                                if (l0Var != null) {
                                    l0Var.a();
                                }
                            } catch (IllegalStateException unused) {
                                return;
                            }
                            break;
                        default:
                            try {
                                alertDialogCreate.dismiss();
                                l0 l0Var2 = aVar;
                                if (l0Var2 != null) {
                                    l0Var2.b();
                                }
                            } catch (IllegalStateException unused2) {
                                return;
                            }
                            break;
                    }
                }
            });
        }
        alertDialogCreate.setView(viewInflate);
        alertDialogCreate.setCanceledOnTouchOutside(false);
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialogCreate.show();
        return alertDialogCreate;
    }
}

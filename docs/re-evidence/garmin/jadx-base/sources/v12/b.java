package v12;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final androidx.appcompat.app.e a(Context context, int i14, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
        TextView textView = new TextView(context);
        textView.setText(context.getString(R.string.privacy_all_past_activities_dialog_title));
        textView.setTextAppearance(2132149083);
        Resources resources = textView.getResources();
        resources.getClass();
        int iN = (int) xy2.b.n(resources, 24.0f);
        Resources resources2 = textView.getResources();
        resources2.getClass();
        int iN2 = (int) xy2.b.n(resources2, 16.0f);
        Resources resources3 = textView.getResources();
        resources3.getClass();
        textView.setPadding(iN, iN2, (int) xy2.b.n(resources3, 24.0f), 0);
        textView.setMaxLines(Integer.MAX_VALUE);
        textView.setSingleLine(false);
        androidx.appcompat.app.e.a customTitle = new androidx.appcompat.app.e.a(context).setCustomTitle(textView);
        x0 x0Var = x0.f105818a;
        String string = context.getString(R.string.privacy_all_past_activities_dialog_message);
        string.getClass();
        androidx.appcompat.app.e eVarCreate = customTitle.setMessage(String.format(string, Arrays.copyOf(new Object[]{context.getString(i14)}, 1))).setPositiveButton(R.string.lbl_common_continue, new c32.a(aVar, 10)).setNegativeButton(R.string.lbl_cancel, new c32.a(aVar2, 11)).create();
        eVarCreate.getClass();
        return eVarCreate;
    }

    public static final androidx.appcompat.app.e b(Context context) {
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(context).setTitle(context.getString(R.string.lbl_no_privacy_level_selected)).setMessage(context.getString(R.string.msg_past_activities_no_privacy_level_selected)).setPositiveButton(R.string.lbl_ok, new ty1.o(22)).create();
        eVarCreate.getClass();
        return eVarCreate;
    }

    public static final androidx.appcompat.app.e c(Context context, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
        TextView textView = new TextView(context);
        textView.setText(context.getString(R.string.privacy_pending_update_request_dialog_title));
        textView.setTextAppearance(2132149083);
        Resources resources = textView.getResources();
        resources.getClass();
        int iN = (int) xy2.b.n(resources, 24.0f);
        Resources resources2 = textView.getResources();
        resources2.getClass();
        int iN2 = (int) xy2.b.n(resources2, 16.0f);
        Resources resources3 = textView.getResources();
        resources3.getClass();
        textView.setPadding(iN, iN2, (int) xy2.b.n(resources3, 24.0f), 0);
        textView.setMaxLines(Integer.MAX_VALUE);
        textView.setSingleLine(false);
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(context).setCustomTitle(textView).setMessage(context.getString(R.string.privacy_pending_update_request_dialog_message)).setPositiveButton(R.string.lbl_ok, new c32.a(aVar, 9)).setOnDismissListener(new jy0.w(aVar2, 1)).create();
        eVarCreate.getClass();
        return eVarCreate;
    }
}

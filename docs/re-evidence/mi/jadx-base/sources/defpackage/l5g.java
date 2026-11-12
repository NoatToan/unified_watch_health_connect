package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class l5g {

    public interface a {
        void onCancelClicked(View view);

        void onSaveClicked(View view);
    }

    public static void c(Context context, wc0 wc0Var, int i, int i2, a aVar) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(wc0Var);
        Bundle bundle = new Bundle();
        bundle.putInt("title", i);
        bundle.putInt("sub_title", i2);
        e(context, wc0Var, bundle, aVar);
    }

    public static void d(Context context, wc0 wc0Var, int i, a aVar) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(wc0Var);
        c(context, wc0Var, i, 0, aVar);
    }

    public static void e(Context context, wc0 wc0Var, Bundle bundle, final a aVar) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(wc0Var);
        Objects.requireNonNull(bundle);
        wc0Var.setDisplayOptions(8);
        Button button = new Button(context);
        Button button2 = new Button(context);
        int i = bundle.getInt("title", 0);
        int i2 = bundle.getInt("sub_title", 0);
        int i3 = bundle.getInt("cancel_btn_res_id", 0);
        bundle.getInt("save_btn_res_id", 0);
        int i4 = bundle.getInt("cancel_btn_cd", 0);
        int i5 = bundle.getInt("save_btn_cd", 0);
        Resources resources = context.getResources();
        if (i4 == 0) {
            i3 = wzi.e;
        }
        String string = resources.getString(i3);
        if (i5 == 0) {
            i5 = wzi.e;
        }
        String string2 = resources.getString(i5);
        button.setContentDescription(string);
        button2.setContentDescription(string2);
        if (i != 0) {
            wc0Var.setTitle(i);
        }
        if (i2 != 0) {
            wc0Var.setSubtitle(i2);
        }
        wc0Var.setStartView(button);
        wc0Var.setEndView(button2);
        if (aVar != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: g5g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aVar.onCancelClicked(view);
                }
            });
            button2.setOnClickListener(new View.OnClickListener() { // from class: i5g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aVar.onSaveClicked(view);
                }
            });
        }
    }
}

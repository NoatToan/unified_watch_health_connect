package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class k5g {

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
        button.setId(eri.n);
        button2.setId(eri.o);
        int i = bundle.getInt("title", 0);
        int i2 = bundle.getInt("sub_title", 0);
        int i3 = bundle.getInt("cancel_btn_res_id", 0);
        int i4 = bundle.getInt("save_btn_res_id", 0);
        int i5 = bundle.getInt("cancel_btn_cd", 0);
        int i6 = bundle.getInt("save_btn_cd", 0);
        button.setBackgroundResource(i3 == 0 ? pni.B2 : i3);
        if (i4 == 0) {
            i4 = pni.C2;
        }
        button2.setBackgroundResource(i4);
        Resources resources = context.getResources();
        if (i5 == 0) {
            i3 = c0j.c;
        }
        String string = resources.getString(i3);
        if (i6 == 0) {
            i6 = c0j.t5;
        }
        String string2 = resources.getString(i6);
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
            button.setOnClickListener(new View.OnClickListener() { // from class: h5g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aVar.onCancelClicked(view);
                }
            });
            button2.setOnClickListener(new View.OnClickListener() { // from class: j5g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aVar.onSaveClicked(view);
                }
            });
        }
    }

    public static View h(Context context, wc0 wc0Var, int i, int i2, String str, View.OnClickListener onClickListener) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(wc0Var);
        Objects.requireNonNull(onClickListener);
        TextView textView = new TextView(context);
        textView.setId(i);
        textView.setBackgroundResource(i2);
        textView.setContentDescription(str);
        textView.setOnClickListener(onClickListener);
        wc0Var.setEndView(textView);
        return textView;
    }

    public static View i(Context context, wc0 wc0Var, int i, String str, View.OnClickListener onClickListener) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(wc0Var);
        Objects.requireNonNull(onClickListener);
        TextView textView = new TextView(context);
        textView.setBackgroundResource(i);
        textView.setContentDescription(str);
        textView.setOnClickListener(onClickListener);
        wc0Var.setStartView(textView);
        return textView;
    }
}

package fb1;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfb1/v;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f70309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u[] f70310b;

    public v(View view2) {
        this.f70309a = view2;
        this.f70310b = new u[]{new u(view2 != null ? (ViewGroup) view2.findViewById(R.id.highlight_value_1_frame) : null, view2 != null ? (TextView) view2.findViewById(R.id.textView1) : null, view2 != null ? (TextView) view2.findViewById(R.id.highlight_value_1) : null, view2 != null ? (TextView) view2.findViewById(R.id.highlight_value_uom_1) : null, view2 != null ? (TextView) view2.findViewById(R.id.highlight_value_1_2) : null, null), new u(view2 != null ? (ViewGroup) view2.findViewById(R.id.highlight_value_2_frame) : null, null, view2 != null ? (TextView) view2.findViewById(R.id.highlight_value_2) : null, view2 != null ? (TextView) view2.findViewById(R.id.highlight_value_uom_2) : null, view2 != null ? (TextView) view2.findViewById(R.id.highlight_value_2_2) : null, null), new u(view2 != null ? (ViewGroup) view2.findViewById(R.id.highlight_value_3_frame) : null, null, view2 != null ? (TextView) view2.findViewById(R.id.highlight_value_3) : null, view2 != null ? (TextView) view2.findViewById(R.id.highlight_value_uom_3) : null, view2 != null ? (TextView) view2.findViewById(R.id.highlight_value_3_2) : null, null), new u(view2 != null ? (ViewGroup) view2.findViewById(R.id.highlight_value_4_frame) : null, null, view2 != null ? (TextView) view2.findViewById(R.id.highlight_value_4) : null, view2 != null ? (TextView) view2.findViewById(R.id.highlight_value_uom_4) : null, view2 != null ? (TextView) view2.findViewById(R.id.highlight_value_4_2) : null, null)};
    }

    public final void a(s sVar) {
        TextView textView;
        Drawable drawable;
        TextView textView2;
        TextView textView3;
        sVar.getClass();
        ArrayList<t> arrayList = sVar.f70297a;
        boolean zIsEmpty = arrayList.isEmpty();
        View view2 = this.f70309a;
        if (zIsEmpty) {
            if (view2 != null) {
                view2.setVisibility(4);
                return;
            }
            return;
        }
        TextView textView4 = view2 != null ? (TextView) view2.findViewById(R.id.textView1) : null;
        u[] uVarArr = this.f70310b;
        int length = uVarArr.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            u uVar = uVarArr[i14];
            int i16 = i15 + 1;
            if (i15 < arrayList.size()) {
                t tVar = arrayList.get(i15);
                if (tVar != null) {
                    Integer num = tVar.f70301c;
                    String str = tVar.f70303e;
                    if (str != null && textView4 != null) {
                        textView4.setText(str);
                    }
                    String str2 = tVar.f70299a;
                    if (str2 != null && (textView3 = uVar.f70305b) != null) {
                        textView3.setText(str2);
                    }
                    String str3 = tVar.f70300b;
                    if (str3 != null && (textView2 = uVar.f70306c) != null) {
                        textView2.setText(str3);
                    }
                    if (num != null) {
                        TextView textView5 = uVar.f70305b;
                        Context context = textView5 != null ? textView5.getContext() : null;
                        TextView textView6 = uVar.f70305b;
                        if (context != null) {
                            drawable = a7.b.getDrawable(context, R.drawable.circle_pulse_ox_normal);
                            if (drawable != null) {
                                drawable.mutate();
                                drawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC);
                                if (textView6 != null) {
                                    textView6.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.spacing_micro));
                                }
                            }
                        } else {
                            drawable = null;
                        }
                        if (textView6 != null) {
                            textView6.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                    }
                    String str4 = tVar.f70302d;
                    if (str4 != null && (textView = uVar.f70307d) != null) {
                        textView.setText(str4);
                    }
                    ViewGroup viewGroup = uVar.f70304a;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(0);
                    }
                    View view3 = uVar.f70308e;
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                } else {
                    ViewGroup viewGroup2 = uVar.f70304a;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(8);
                    }
                    View view4 = uVar.f70308e;
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                }
            } else {
                ViewGroup viewGroup3 = uVar.f70304a;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(8);
                }
                View view5 = uVar.f70308e;
                if (view5 != null) {
                    view5.setVisibility(8);
                }
            }
            i14++;
            i15 = i16;
        }
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }
}

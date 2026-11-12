package h32;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import g22.p;
import i3.e5;

/* JADX INFO: loaded from: classes10.dex */
public class n {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f81397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f81398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f81399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f81400d;

        public a(View view2) {
            this.f81397a = view2;
            if (view2 != null) {
                this.f81398b = (TextView) view2.findViewById(R.id.stats_value);
                this.f81399c = (TextView) view2.findViewById(R.id.stats_unit);
                this.f81400d = (TextView) view2.findViewById(R.id.stats_label);
            }
        }

        public final void a(String str) {
            TextView textView = this.f81400d;
            if (textView != null) {
                if (TextUtils.isEmpty(str)) {
                    textView.setVisibility(8);
                    return;
                }
                textView.setVisibility(0);
                if (str == null) {
                    str = "";
                }
                textView.setText(str);
                textView.setContentDescription(null);
            }
        }

        public final void b(String str, String str2, String str3) {
            TextView textView = this.f81398b;
            if (textView != null) {
                textView.setText(str);
                textView.setContentDescription(str3);
            }
            TextView textView2 = this.f81399c;
            if (textView2 != null) {
                textView2.setText(str2);
                textView2.setContentDescription(null);
            }
        }

        public final void c(String str) {
            TextView textView = this.f81399c;
            if (textView != null) {
                if (str == null) {
                    str = "";
                }
                textView.setText(str);
                textView.setContentDescription(null);
            }
        }

        public final void d(String str) {
            TextView textView = this.f81398b;
            if (textView != null) {
                if (str == null) {
                    str = "";
                }
                textView.setText(str);
                textView.getClass();
                String string = textView.getText().toString();
                d53.k kVar = new d53.k(e5.g(textView.getContext().getString(R.string.no_value), "|", textView.getContext().getString(R.string.no_value_card)));
                String string2 = textView.getContext().getString(R.string.txt_empty_page_no_data);
                string2.getClass();
                textView.setContentDescription(kVar.f(string, string2));
            }
        }

        public final void e(int i14) {
            View view2 = this.f81397a;
            if (view2 != null) {
                view2.setVisibility(i14);
            }
        }
    }

    public static class b extends a {
        public b(View view2) {
            super(view2);
            if (view2 != null) {
                p.b(view2, this);
            }
        }
    }

    private n() {
    }

    public static void a(a aVar, String str, String str2, String str3) {
        if (aVar != null) {
            aVar.b(str, str2, str3);
        }
    }
}

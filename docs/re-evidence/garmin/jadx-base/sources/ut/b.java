package ut;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.garmin.android.apps.connectmobile.R;
import j20.x;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NestedScrollView f172551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f172552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Button f172553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f172554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Button f172555e;

    private b(NestedScrollView nestedScrollView, Button button, Button button2, Button button3, Button button4, TextView textView) {
        this.f172551a = nestedScrollView;
        this.f172552b = button;
        this.f172553c = button2;
        this.f172554d = button3;
        this.f172555e = button4;
    }

    public static b a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_first, viewGroup, false);
        int i14 = R.id.btn_get_report;
        Button button = (Button) ee.a.a(R.id.btn_get_report, viewInflate);
        if (button != null) {
            i14 = R.id.btn_player_activity;
            Button button2 = (Button) ee.a.a(R.id.btn_player_activity, viewInflate);
            if (button2 != null) {
                i14 = R.id.btn_select_file;
                Button button3 = (Button) ee.a.a(R.id.btn_select_file, viewInflate);
                if (button3 != null) {
                    i14 = R.id.delete_cached_report;
                    Button button4 = (Button) ee.a.a(R.id.delete_cached_report, viewInflate);
                    if (button4 != null) {
                        i14 = R.id.processing_file_text;
                        TextView textView = (TextView) ee.a.a(R.id.processing_file_text, viewInflate);
                        if (textView != null) {
                            return new b((NestedScrollView) viewInflate, button, button2, button3, button4, textView);
                        }
                    }
                }
            }
        }
        x.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
        return null;
    }
}

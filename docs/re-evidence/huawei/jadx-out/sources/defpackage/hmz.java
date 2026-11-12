package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.health.suggestion.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes9.dex */
public class hmz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f36938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f36939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f36940c;
    private HealthTextView d;
    private HealthTextView e;
    private View f;
    private HealthTextView g;
    private ImageView h;
    private HealthTextView i;
    private ImageView j;
    private LinearLayout l;

    public hmz() {
        c();
    }

    private void c() {
        View viewInflate = LayoutInflater.from(btx.c()).inflate(R.layout.layout_count_timer_white, (ViewGroup) null);
        this.f = viewInflate;
        this.l = (LinearLayout) viewInflate.findViewById(R.id.timer_container);
        this.e = (HealthTextView) this.f.findViewById(R.id.minute_timed_white);
        this.j = (ImageView) this.f.findViewById(R.id.minute_unit_white);
        this.g = (HealthTextView) this.f.findViewById(R.id.second_timed_white);
        this.h = (ImageView) this.f.findViewById(R.id.second_timed_unit_white);
        this.f36938a = (HealthTextView) this.f.findViewById(R.id.goal_time_minute_white);
        this.f36940c = (ImageView) this.f.findViewById(R.id.goal_time_minute_unit_white);
        this.d = (HealthTextView) this.f.findViewById(R.id.goal_second_time_white);
        this.f36939b = (ImageView) this.f.findViewById(R.id.goal_second_time_unit_white);
        this.i = (HealthTextView) this.f.findViewById(R.id.motion_name_white);
    }

    public View a() {
        return this.f;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.i.setText(str);
    }

    public void d(int i, int i2, boolean z) {
        this.l.setVisibility(0);
        boolean z2 = i >= 60;
        boolean z3 = i2 >= 60;
        if (z) {
            this.f36939b.setVisibility(0);
            this.h.setVisibility(0);
            if (z2) {
                this.e.setVisibility(0);
                this.e.setText(String.valueOf(i / 60));
                this.j.setVisibility(0);
                this.g.setText(String.valueOf(i % 60));
            } else {
                this.e.setVisibility(8);
                this.j.setVisibility(8);
                this.g.setText(String.valueOf(i));
            }
            if (i2 == -1) {
                return;
            }
            if (z3) {
                this.f36938a.setVisibility(0);
                this.f36938a.setText(String.valueOf(i2 / 60));
                this.f36940c.setVisibility(0);
                this.d.setText(String.valueOf(i2 % 60));
                return;
            }
            this.f36938a.setVisibility(8);
            this.f36940c.setVisibility(8);
            this.d.setText(String.valueOf(i2));
            return;
        }
        this.e.setVisibility(8);
        this.j.setVisibility(8);
        this.h.setVisibility(8);
        this.f36938a.setVisibility(8);
        this.f36940c.setVisibility(8);
        this.f36939b.setVisibility(8);
        this.g.setText(String.valueOf(i));
        if (i2 != -1) {
            this.d.setText(String.valueOf(i2));
        }
    }
}

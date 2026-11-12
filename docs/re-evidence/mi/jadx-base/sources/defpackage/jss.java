package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.mi.health.R;

/* JADX INFO: loaded from: classes4.dex */
public final class jss extends lss implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OfflineMapManager f23098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f23099b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public int g;
    public String h;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            jss.this.dismiss();
        }
    }

    public jss(Context context, OfflineMapManager offlineMapManager) {
        super(context);
        this.f23098a = offlineMapManager;
    }

    @Override // defpackage.lss
    public final void a() {
        View viewD = xss.d(getContext(), R.array.ElectronicScaleBalanceIndex);
        this.f23099b = viewD;
        setContentView(viewD);
        this.f23099b.setOnClickListener(new a());
        this.c = (TextView) this.f23099b.findViewById(R.dimen.abc_action_bar_overflow_padding_end_material);
        TextView textView = (TextView) this.f23099b.findViewById(R.dimen.abc_action_bar_overflow_padding_start_material);
        this.d = textView;
        textView.setText("暂停下载");
        this.e = (TextView) this.f23099b.findViewById(R.dimen.abc_action_bar_stacked_max_height);
        this.f = (TextView) this.f23099b.findViewById(R.dimen.abc_action_bar_stacked_tab_max_width);
        this.d.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.f.setOnClickListener(this);
    }

    public final void c(int i, String str) {
        this.c.setText(str);
        if (i == 0) {
            this.d.setText("暂停下载");
            this.d.setVisibility(0);
            this.e.setText("取消下载");
        }
        if (i == 2) {
            this.d.setVisibility(8);
            this.e.setText("取消下载");
        } else if (i == -1 || i == 101 || i == 102 || i == 103) {
            this.d.setText("继续下载");
            this.d.setVisibility(0);
        } else if (i == 3) {
            this.d.setVisibility(0);
            this.d.setText("继续下载");
            this.e.setText("取消下载");
        } else if (i == 4) {
            this.e.setText("删除");
            this.d.setVisibility(8);
        }
        this.g = i;
        this.h = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            int id = view.getId();
            if (id != R.dimen.abc_action_bar_overflow_padding_start_material) {
                if (id != R.dimen.abc_action_bar_stacked_max_height) {
                    if (id == R.dimen.abc_action_bar_stacked_tab_max_width) {
                        dismiss();
                        return;
                    }
                    return;
                } else {
                    if (TextUtils.isEmpty(this.h)) {
                        return;
                    }
                    this.f23098a.remove(this.h);
                    dismiss();
                    return;
                }
            }
            int i = this.g;
            if (i == 0) {
                this.d.setText("继续下载");
                this.f23098a.pauseByName(this.h);
            } else if (i == 3 || i == -1 || i == 101 || i == 102 || i == 103) {
                this.d.setText("暂停下载");
                this.f23098a.downloadByCityName(this.h);
            }
            dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

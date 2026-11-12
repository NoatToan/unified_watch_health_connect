package defpackage;

import android.content.Context;
import android.view.View;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.offlinemap.ui.view.CityListBean;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.downloadwidget.HealthDownLoadWidget;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jcf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthDownLoadWidget f38375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f38376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f38377c;
    private HealthTextView d;
    private int e = 0;
    private HealthDivider j;

    public jcf(View view) {
        if (view != null) {
            this.f38377c = (HealthTextView) view.findViewById(R.id.city_name);
            this.f38376b = (HealthTextView) view.findViewById(R.id.city_size);
            this.j = (HealthDivider) view.findViewById(R.id.offline_view);
            this.d = (HealthTextView) view.findViewById(R.id.download_text);
            this.f38375a = (HealthDownLoadWidget) view.findViewById(R.id.city_status);
            view.setTag(this);
        }
    }

    public void e(Context context, int i, int i2) {
        if (context != null) {
            this.d.setText((CharSequence) null);
            this.f38375a.b();
            a(context, i, i2);
        }
    }

    private void a(Context context, int i, int i2) {
        if (i == 0) {
            e(8, 0);
            int i3 = this.e;
            this.e = i2;
            this.f38375a.a(i2 - i3);
            return;
        }
        if (i == 1) {
            e(8, 0);
            if (i2 == 0) {
                this.f38375a.setIdleText(context.getString(R.string.IDS_motiontrack_offlinemap_download_uziping));
            }
            this.f38375a.setProgress(i2);
            this.f38375a.setIdleText(context.getString(R.string.IDS_motiontrack_offlinemap_download_uziping));
            return;
        }
        if (i == 2) {
            e(8, 0);
            this.f38375a.setIdleText(context.getString(R.string.IDS_motiontrack_offlinemap_download_waiting));
            return;
        }
        if (i != 3) {
            if (i == 4) {
                if (i2 == 100) {
                    this.f38375a.d();
                    e(0, 8);
                    this.d.setText(context.getString(R.string.IDS_motiontrack_offlinemap_download_finish));
                    return;
                }
                return;
            }
            if (i != 101) {
                e(context, i);
                return;
            }
        }
        e(8, 0);
        this.f38375a.setIdleText(context.getString(R.string.IDS_motiontrack_offlinemap_download_pause));
    }

    private void e(Context context, int i) {
        if (i == -1) {
            e(8, 0);
            this.f38375a.setIdleText(context.getString(R.string.IDS_motiontrack_offlinemap_download_big_error));
            return;
        }
        if (i != 10) {
            if (i == 1002) {
                e(8, 0);
                this.f38375a.setIdleText(context.getString(R.string.IDS_motiontrack_offlinemap_download_error));
                return;
            }
            if (i == 5) {
                e(8, 0);
                this.f38375a.setIdleText(context.getString(R.string.IDS_motiontrack_offlinemap_download_stop));
                return;
            }
            if (i == 6) {
                e(8, 0);
                this.f38375a.setIdleText(context.getString(R.string.IDS_motiontrack_offlinemap_download_start));
                return;
            } else if (i != 7) {
                if (i == 102) {
                    e(8, 0);
                    this.f38375a.setIdleText(context.getString(R.string.IDS_motiontrack_offlinemap_download_amap_error));
                    return;
                } else {
                    if (i != 103) {
                        return;
                    }
                    e(8, 0);
                    this.f38375a.setIdleText(context.getString(R.string.IDS_motiontrack_offlinemap_download_save_error));
                    return;
                }
            }
        }
        e(8, 0);
        this.f38375a.setIdleText(context.getString(R.string.IDS_motiontrack_offlinemap_download_update));
    }

    private void e(int i, int i2) {
        this.d.setVisibility(i);
        this.f38375a.setVisibility(i2);
    }

    public HealthTextView e() {
        return this.f38377c;
    }

    public HealthTextView b() {
        return this.f38376b;
    }

    public HealthDownLoadWidget a() {
        return this.f38375a;
    }

    public void e(List<OfflineMapCity> list, int i) {
        if (njy.b(list)) {
            if (i == list.size() - 1) {
                this.j.setVisibility(8);
            } else {
                this.j.setVisibility(0);
            }
        }
    }

    public void c(CityListBean cityListBean, int i) {
        if (njy.b(cityListBean)) {
            if (i == cityListBean.size() - 1) {
                this.j.setVisibility(8);
            } else {
                this.j.setVisibility(0);
            }
        }
    }
}

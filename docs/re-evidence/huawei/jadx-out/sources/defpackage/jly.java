package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.trackanimation.bgm.choosedownload.MusicInformation;
import com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils;
import com.huawei.healthcloud.plugintrack.ui.adapter.CustomMusicStyleAdapter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jly {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomMusicStyleAdapter f38713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomProgressDialog f38714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f38715c;
    private CustomProgressDialog.Builder d;
    private CustomMusicStyleAdapter.MusicItemClickListener g;
    private String i;
    private HealthRecycleView j;
    private List<MusicInformation> h = new ArrayList(16);
    private boolean e = false;

    public jly(Activity activity) {
        this.f38715c = activity;
        ThreadPoolManager.c().execute(new Runnable() { // from class: jly.3
            @Override // java.lang.Runnable
            public void run() {
                jaq jaqVar = new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002));
                jly.this.i = jaqVar.o();
                jly jlyVar = jly.this;
                jlyVar.h = (List) izn.d(jlyVar.i, new TypeToken<ArrayList<MusicInformation>>(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.interactor.MusicInteractor$1$1
                });
            }
        });
    }

    public void a(CustomMusicStyleAdapter.MusicItemClickListener musicItemClickListener) {
        this.g = musicItemClickListener;
    }

    public void e(final boolean z) {
        DynamicTrackDownloadUtils.d();
        DynamicTrackDownloadUtils.b().c(new DynamicTrackDownloadUtils.DownloadResponseCallback() { // from class: jly.2
            @Override // com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.DownloadResponseCallback
            public void onStart() {
                jly.this.a();
            }

            @Override // com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.DownloadResponseCallback
            public void onProgress(int i) {
                jly.this.a(i);
            }

            @Override // com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.DownloadResponseCallback
            public void onSuccess() {
                jly.this.b();
                jly.this.i = DynamicTrackDownloadUtils.b().f();
                jly jlyVar = jly.this;
                jlyVar.h = (List) izn.d(jlyVar.i, new TypeToken<ArrayList<MusicInformation>>(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.interactor.MusicInteractor$2$1
                });
                if (z) {
                    jly.this.d();
                }
            }

            @Override // com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.DownloadResponseCallback
            public void onFail() {
                jly.this.b();
                if (jly.this.f38715c != null) {
                    qpx.e(jly.this.f38715c, jly.this.f38715c.getResources().getString(R.string.IDS_update_download_failed));
                }
            }

            @Override // com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.DownloadResponseCallback
            public void onMobile(int i) {
                jly.this.a(String.format(jly.this.f38715c.getResources().getString(R.string.IDS_music_mobile_network_notify), jly.this.f38715c.getString(R.string.IDS_device_upgrade_file_size_mb, new Object[]{UnitUtil.e(((double) i) / 1048576.0d, 1, 1)})));
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f38715c).a(str).c(R.string.IDS_settings_button_ok, new View.OnClickListener(this) { // from class: jly.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DynamicTrackDownloadUtils.b().c();
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener(this) { // from class: jly.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public void b(View view) {
        if (view == null) {
            LogUtil.e("Track_MusicInteractor", "[handleChooseMusic] view is null");
            return;
        }
        this.j = (HealthRecycleView) view.findViewById(R.id.track_music_recycleview);
        if (DynamicTrackDownloadUtils.b().g()) {
            e(true);
        } else {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.j == null) {
            LogUtil.e("Track_MusicInteractor", "[setRecyclerView] mMusicScrollView is null");
            return;
        }
        if (this.e) {
            return;
        }
        this.f38713a = new CustomMusicStyleAdapter(this.f38715c, this.h, this.g);
        HealthLinearLayoutManager healthLinearLayoutManager = new HealthLinearLayoutManager(this.f38715c);
        healthLinearLayoutManager.setOrientation(0);
        this.j.setLayoutManager(healthLinearLayoutManager);
        this.j.setAdapter(this.f38713a);
        this.e = true;
    }

    public void e() {
        CustomMusicStyleAdapter customMusicStyleAdapter = this.f38713a;
        if (customMusicStyleAdapter != null) {
            customMusicStyleAdapter.e();
        }
    }

    public void c(boolean z) {
        CustomMusicStyleAdapter customMusicStyleAdapter = this.f38713a;
        if (customMusicStyleAdapter != null) {
            customMusicStyleAdapter.a();
            this.f38713a.d(z);
            this.f38713a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        CustomProgressDialog customProgressDialog = this.f38714b;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            LogUtil.e("Track_MusicInteractor", "startDownloadProgress progress exist");
            return;
        }
        this.f38714b = new CustomProgressDialog(this.f38715c);
        CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.f38715c);
        this.d = builder;
        builder.e(this.f38715c.getString(R.string.IDS_downloading_music)).e(new View.OnClickListener(this) { // from class: jly.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_MusicInteractor", "startDownLoadProgress onclick cancel");
                DynamicTrackDownloadUtils.b().a();
            }
        });
        CustomProgressDialog customProgressDialogC = this.d.c();
        this.f38714b = customProgressDialogC;
        customProgressDialogC.setCanceledOnTouchOutside(false);
        if (!this.f38715c.isFinishing()) {
            this.f38714b.show();
            this.d.b(0);
            this.d.b(UnitUtil.e(0.0d, 2, 0));
            this.d.d();
        }
        LogUtil.a("Track_MusicInteractor", "mCustomProgressDialog.show()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        CustomProgressDialog customProgressDialog = this.f38714b;
        if (customProgressDialog == null || !customProgressDialog.isShowing()) {
            return;
        }
        this.d.b(i);
        this.d.b(UnitUtil.e(i, 2, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        CustomProgressDialog customProgressDialog = this.f38714b;
        if (customProgressDialog == null || !customProgressDialog.isShowing() || this.f38715c.isFinishing()) {
            return;
        }
        this.f38714b.cancel();
    }
}

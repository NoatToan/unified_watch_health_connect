package com.huawei.healthcloud.plugintrack.ui.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.media3.common.C;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.trackanimation.bgm.choosedownload.MusicInformation;
import com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.jaq;
import defpackage.jet;
import defpackage.jev;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class CustomMusicStyleAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DynamicTrackDownloadUtils.DownloadResponseCallback f10957a;
    private Context e;
    private MusicItemClickListener f;
    private LayoutInflater g;
    private int h;
    private List<MusicInformation> i;
    private int j;
    private jaq k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f10959c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10958b = false;
    private boolean d = true;

    public interface MusicItemClickListener {
        void onClickListener(String str, String str2);

        void onMuteClick();
    }

    public CustomMusicStyleAdapter(Context context, List<MusicInformation> list, MusicItemClickListener musicItemClickListener) {
        this.h = 0;
        this.j = 0;
        this.e = context;
        this.g = LayoutInflater.from(context);
        this.i = list;
        if (njy.e(list)) {
            MusicInformation musicInformation = new MusicInformation();
            musicInformation.setIsSelected(true);
            ArrayList arrayList = new ArrayList();
            this.i = arrayList;
            arrayList.add(musicInformation);
        }
        this.i.get(0).setIsMute(true);
        for (int i = 0; i < this.i.size(); i++) {
            if (this.i.get(i).getIsSelected()) {
                this.h = i;
                this.j = i;
            }
        }
        this.f = musicItemClickListener;
        this.k = new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(this.g.inflate(R.layout.choose_download_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i) {
        bVar.e(this.i.get(i), bVar, i);
    }

    public void a() {
        jet.b().d();
    }

    public void d(boolean z) {
        int i = z ? this.j : this.h;
        this.j = i;
        this.h = i;
        if (!njy.e(this.i)) {
            int i2 = 0;
            while (i2 < this.i.size()) {
                this.i.get(i2).setIsDownloading(false);
                this.i.get(i2).setIsSelected(i2 == this.j);
                i2++;
            }
        }
        this.d = false;
        notifyDataSetChanged();
    }

    public void e() {
        this.d = true;
    }

    public void c() {
        if (njy.c(this.i, this.j)) {
            if (this.i.get(this.j).getIsDownloaded() || this.j == 0) {
                MusicInformation musicInformation = this.i.get(this.j);
                final String strA = jev.a(musicInformation.getMusicName(), musicInformation.getIsDefault());
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.CustomMusicStyleAdapter.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (CustomMusicStyleAdapter.this.j == 0) {
                            CustomMusicStyleAdapter.this.k.b((String) null);
                        } else {
                            CustomMusicStyleAdapter.this.k.b(strA);
                        }
                        CustomMusicStyleAdapter.this.k.e(new Gson().toJson(CustomMusicStyleAdapter.this.i));
                    }
                });
                notifyDataSetChanged();
            }
        }
    }

    class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f10962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f10963c;
        private boolean d;
        private boolean e;
        private ImageView f;
        private HealthTextView g;
        private MusicInformation h;
        private ImageView i;
        private HealthCheckBox j;
        private int l;
        private ImageView m;

        b(View view) {
            super(view);
            this.d = false;
            this.e = false;
            this.f10962b = false;
            this.l = 0;
            a(view);
        }

        public void e(MusicInformation musicInformation, b bVar, int i) {
            this.h = musicInformation;
            if (musicInformation == null) {
                this.h = new MusicInformation();
            }
            this.f10962b = this.h.getIsMute();
            this.d = this.h.getIsSelected();
            this.e = this.h.getIsDownloaded();
            a();
            bVar.a(this.h.getIsSelected());
            if (this.f10962b) {
                e(bVar, i);
            } else {
                b(this.h, bVar, i);
            }
        }

        private void e(b bVar, final int i) {
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.CustomMusicStyleAdapter.b.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (qrs.c(1000)) {
                        return;
                    }
                    CustomMusicStyleAdapter.this.j = i;
                    int i2 = 0;
                    while (i2 < CustomMusicStyleAdapter.this.i.size()) {
                        ((MusicInformation) CustomMusicStyleAdapter.this.i.get(i2)).setIsSelected(i2 == i);
                        i2++;
                    }
                    if (CustomMusicStyleAdapter.this.f != null) {
                        CustomMusicStyleAdapter.this.f.onMuteClick();
                    }
                    CustomMusicStyleAdapter.this.a();
                    ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.CustomMusicStyleAdapter.b.1.5
                        @Override // java.lang.Runnable
                        public void run() {
                            CustomMusicStyleAdapter.this.k.e(new Gson().toJson(CustomMusicStyleAdapter.this.i));
                        }
                    });
                    CustomMusicStyleAdapter.this.notifyDataSetChanged();
                }
            });
        }

        private void b(final MusicInformation musicInformation, b bVar, final int i) {
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.CustomMusicStyleAdapter.b.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (qrs.c(1000)) {
                        return;
                    }
                    if (CustomMusicStyleAdapter.this.f10958b && !musicInformation.getIsDownloading() && !musicInformation.getIsDownloaded() && !musicInformation.getIsMute()) {
                        qpx.e(CustomMusicStyleAdapter.this.e, CustomMusicStyleAdapter.this.e.getResources().getString(R.string.IDS_downloading_music));
                        return;
                    }
                    CustomMusicStyleAdapter.this.j = i;
                    int i2 = 0;
                    while (i2 < CustomMusicStyleAdapter.this.i.size()) {
                        ((MusicInformation) CustomMusicStyleAdapter.this.i.get(i2)).setIsSelected(i2 == i);
                        i2++;
                    }
                    if (b.this.e(musicInformation)) {
                        LogUtil.d("Track_CustomMusicStyleAdapter", "setOnClickListener : The download is canceled because", "the network is abnormal or the download is in progress.");
                    } else {
                        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.CustomMusicStyleAdapter.b.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                CustomMusicStyleAdapter.this.k.e(new Gson().toJson(CustomMusicStyleAdapter.this.i));
                            }
                        });
                        CustomMusicStyleAdapter.this.notifyDataSetChanged();
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e(MusicInformation musicInformation) {
            String strC = CommonUtil.c(jev.a(musicInformation.getMusicName(), musicInformation.getIsDefault()));
            if (strC == null || !new File(strC).exists()) {
                musicInformation.setIsDownloaded(false);
            }
            if (!musicInformation.getIsDownloaded()) {
                jet.b().d();
                if (!CommonUtil.ab(CustomMusicStyleAdapter.this.e)) {
                    qpx.e(CustomMusicStyleAdapter.this.e, CustomMusicStyleAdapter.this.e.getResources().getString(R.string.IDS_connect_error));
                    CustomMusicStyleAdapter.this.notifyDataSetChanged();
                    return true;
                }
                if (musicInformation.getIsDownloading()) {
                    qpx.e(CustomMusicStyleAdapter.this.e, CustomMusicStyleAdapter.this.e.getResources().getString(R.string.IDS_downloading_music));
                    CustomMusicStyleAdapter.this.notifyDataSetChanged();
                    return true;
                }
                b(musicInformation, CustomMusicStyleAdapter.this.i);
            } else if (CustomMusicStyleAdapter.this.f != null) {
                String musicResourcePath = musicInformation.getMusicResourcePath();
                CustomMusicStyleAdapter.this.f.onClickListener(musicResourcePath, musicInformation.getMusicName());
                jet.b().d();
                jet.b().b(musicResourcePath);
            }
            return false;
        }

        private void b(final MusicInformation musicInformation, final List<MusicInformation> list) {
            CustomMusicStyleAdapter.this.f10957a = new DynamicTrackDownloadUtils.DownloadResponseCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.CustomMusicStyleAdapter.b.5
                @Override // com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.DownloadResponseCallback
                public void onProgress(int i) {
                }

                @Override // com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.DownloadResponseCallback
                public void onMobile(int i) {
                    b.this.d(String.format(CustomMusicStyleAdapter.this.e.getResources().getString(R.string.IDS_music_mobile_network_notify), CustomMusicStyleAdapter.this.e.getString(R.string.IDS_device_upgrade_file_size_mb, UnitUtil.e(((double) i) / 1048576.0d, 1, 1))), musicInformation.getUuid());
                }

                @Override // com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.DownloadResponseCallback
                public void onStart() {
                    musicInformation.setIsDownloading(true);
                    CustomMusicStyleAdapter.this.f10958b = true;
                }

                @Override // com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.DownloadResponseCallback
                public void onSuccess() {
                    b.this.d(musicInformation, (List<MusicInformation>) list);
                }

                @Override // com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.DownloadResponseCallback
                public void onFail() {
                    if (b.this.d()) {
                        return;
                    }
                    musicInformation.setIsDownloading(false);
                    CustomMusicStyleAdapter.this.f10958b = false;
                    if (CustomMusicStyleAdapter.this.e != null) {
                        qpx.e(CustomMusicStyleAdapter.this.e, CustomMusicStyleAdapter.this.e.getResources().getString(R.string.IDS_update_download_failed));
                    }
                    CustomMusicStyleAdapter.this.notifyDataSetChanged();
                }
            };
            DynamicTrackDownloadUtils.b().b(musicInformation.getUuid(), CustomMusicStyleAdapter.this.f10957a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(MusicInformation musicInformation, final List<MusicInformation> list) {
            musicInformation.setIsDownloading(false);
            CustomMusicStyleAdapter.this.f10958b = false;
            if (new File(jev.a(musicInformation.getMusicName(), musicInformation.getIsDefault())).exists()) {
                musicInformation.setIsDownloaded(true);
                String strA = jev.a(musicInformation.getMusicName(), musicInformation.getIsDefault());
                musicInformation.setMusicResourcePath(strA);
                if (CustomMusicStyleAdapter.this.f != null) {
                    CustomMusicStyleAdapter.this.f.onClickListener(strA, musicInformation.getMusicName());
                }
                if (CustomMusicStyleAdapter.this.d) {
                    jet.b().b(strA);
                }
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.CustomMusicStyleAdapter.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        CustomMusicStyleAdapter.this.k.e(new Gson().toJson(list));
                    }
                });
                CustomMusicStyleAdapter.this.notifyDataSetChanged();
                return;
            }
            CustomMusicStyleAdapter.this.f10957a.onFail();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(String str, final String str2) {
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(CustomMusicStyleAdapter.this.e).a(str).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.CustomMusicStyleAdapter.b.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DynamicTrackDownloadUtils.b().e(str2, CustomMusicStyleAdapter.this.f10957a);
                }
            }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener(this) { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.CustomMusicStyleAdapter.b.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            }).c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
        }

        boolean d() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - CustomMusicStyleAdapter.this.f10959c < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                return true;
            }
            CustomMusicStyleAdapter.this.f10959c = jElapsedRealtime;
            return false;
        }

        private void a() {
            if (!this.f10962b) {
                c();
                this.g.setText(this.h.getMusicName());
                return;
            }
            this.g.setText(CustomMusicStyleAdapter.this.e.getResources().getString(R.string.IDS_no_music));
            this.f.setVisibility(8);
            this.i.setVisibility(8);
            this.m.setVisibility(0);
            e();
            b();
        }

        private void a(View view) {
            this.f10963c = (ImageView) view.findViewById(R.id.music_picture);
            this.g = (HealthTextView) view.findViewById(R.id.music_name);
            this.f = (ImageView) view.findViewById(R.id.music_status);
            this.i = (ImageView) view.findViewById(R.id.music_mask);
            this.m = (ImageView) view.findViewById(R.id.no_voice);
            this.j = (HealthCheckBox) view.findViewById(R.id.music_select);
            if (LanguageUtil.ba(CustomMusicStyleAdapter.this.e)) {
                this.m.setRotationY(180.0f);
            }
            this.l = qrs.d(CustomMusicStyleAdapter.this.e, 4.0f);
        }

        private void e() {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(CustomMusicStyleAdapter.this.e.getResources().getColor(R.color.common_color_black));
            int iD = qrs.d(CustomMusicStyleAdapter.this.e, 64.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iD, iD, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            float f = iD;
            RectF rectF = new RectF(0.0f, 0.0f, f, f);
            float f2 = this.l;
            canvas.drawRoundRect(rectF, f2, f2, paint);
            qqf.a(CustomMusicStyleAdapter.this.e, this.f10963c);
            this.f10963c.setImageDrawable(new BitmapDrawable(CustomMusicStyleAdapter.this.e.getResources(), bitmapCreateBitmap));
        }

        private void b() {
            if (this.d) {
                this.j.setChecked(true);
                this.j.setVisibility(0);
            } else {
                this.j.setChecked(false);
                this.j.setVisibility(8);
            }
        }

        private void c() {
            MusicInformation musicInformation = this.h;
            if (musicInformation != null && musicInformation.getMusicBackgroundPath() != null) {
                qqf.a(CustomMusicStyleAdapter.this.e, this.f10963c);
                qqf.a(new File(this.h.getMusicBackgroundPath()), this.f10963c);
            }
            this.m.setVisibility(8);
            boolean z = this.d;
            if (z && this.e) {
                this.f.setVisibility(0);
                this.f.setImageDrawable(CustomMusicStyleAdapter.this.e.getResources().getDrawable(R.drawable.track_music_playing));
                this.i.setVisibility(8);
            } else if (!z && this.e) {
                this.f.setVisibility(8);
                this.i.setVisibility(8);
            } else {
                this.f.setVisibility(0);
                this.f.setImageDrawable(CustomMusicStyleAdapter.this.e.getResources().getDrawable(R.drawable.track_music_downloading));
                this.i.setVisibility(0);
            }
            b();
        }

        void a(boolean z) {
            this.d = z;
            b();
            if (this.f10962b) {
                return;
            }
            boolean z2 = this.d;
            if (z2 && this.e) {
                this.f.setVisibility(0);
                this.f.setImageDrawable(CustomMusicStyleAdapter.this.e.getResources().getDrawable(R.drawable.track_music_playing));
            } else if (!z2 && this.e) {
                this.f.setVisibility(8);
            } else {
                this.f.setVisibility(0);
                this.f.setImageDrawable(CustomMusicStyleAdapter.this.e.getResources().getDrawable(R.drawable.track_music_downloading));
            }
        }
    }
}

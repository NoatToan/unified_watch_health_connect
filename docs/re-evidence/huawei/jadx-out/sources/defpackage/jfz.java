package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionConfig;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.MediaStore;
import android.widget.Toast;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback;
import com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecordReceiver;
import com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecordService;
import com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecorder;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes10.dex */
public class jfz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f38564c;
    private CommonSingleCallback<Boolean> f;
    private long g;
    private String h;
    private TrackRecorder j;
    private TrackRecordReceiver l;
    private long n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaProjectionManager f38563b = null;
    private boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38562a = false;
    private boolean d = false;
    private Handler i = new Handler(Looper.getMainLooper()) { // from class: jfz.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 15790320) {
                return;
            }
            LogUtil.a("Suggestion_RecordManager", "handleMessage: ", Integer.valueOf(message.what));
            jfz.this.r();
        }
    };
    private jgg k = new jgg();
    private jaq m = new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002));

    public jfz(Context context, CommonSingleCallback commonSingleCallback) {
        this.f = commonSingleCallback;
        this.f38564c = context;
        o();
        m();
    }

    public void a(long j) {
        this.g = j;
    }

    private void o() {
        TrackRecordReceiver trackRecordReceiver = new TrackRecordReceiver(this.f38564c);
        this.l = trackRecordReceiver;
        trackRecordReceiver.b(this.f38564c, new TrackRecordReceiver.TrackRecordListener() { // from class: jfz.5
            @Override // com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecordReceiver.TrackRecordListener
            public void onRecordStart() {
                jfz.this.e = false;
            }

            @Override // com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecordReceiver.TrackRecordListener
            public void onRecordFinish(long j, boolean z) {
                jfz.this.n = j;
                jfz.this.d = z;
                jfz.this.r();
            }
        });
    }

    private void m() {
        if (this.f38563b != null) {
            return;
        }
        Object systemService = this.f38564c.getSystemService("media_projection");
        if (systemService instanceof MediaProjectionManager) {
            this.f38563b = (MediaProjectionManager) systemService;
        }
    }

    public void b(int i, Intent intent, boolean z) {
        if (this.f38563b == null) {
            return;
        }
        this.h = this.m.m();
        this.k.a(this.f38562a);
        this.n = 0L;
        if (PermissionUtil.a() && !jho.b()) {
            c(i, intent, z);
            return;
        }
        MediaProjection mediaProjection = this.f38563b.getMediaProjection(i, intent);
        if (mediaProjection == null && !jho.b()) {
            LogUtil.e("Suggestion_RecordManager", "media projection is null");
        } else {
            this.e = false;
            e(mediaProjection, z);
        }
    }

    private void c(int i, Intent intent, boolean z) {
        Intent intent2 = new Intent(this.f38564c, (Class<?>) TrackRecordService.class);
        intent2.putExtra("duration", this.g);
        intent2.putExtra("isShort", this.f38562a);
        intent2.putExtra("mMusicResourcePath", this.h);
        intent2.putExtra("mVideoPath", this.k.a());
        if (this.k.b() != null) {
            intent2.putExtra("mVideoUri", this.k.b().toString());
        }
        intent2.putExtra("resultCode", i);
        intent2.putExtra("isHdVideoType", z);
        intent2.putExtra("data", intent);
        try {
            this.f38564c.startForegroundService(intent2);
        } catch (SecurityException e) {
            LogUtil.j("Suggestion_RecordManager", "startRecordService: startForegroundService error ", LogAnonymous.b(e));
        }
    }

    private void e(MediaProjection mediaProjection, boolean z) {
        boolean zAf = qrs.af(this.f38564c);
        try {
            if (PermissionUtil.e()) {
                d(mediaProjection, zAf, z);
            } else {
                this.j = new jfy().c(this.f38562a).e(this.g).b(mediaProjection, this.k.a(), zAf, z).setAudioFilePath(this.h).setHandler(this.i);
            }
            if (this.j == null) {
                ReleaseLogUtil.b("Suggestion_RecordManager", "initRecorder: recorder is null");
                return;
            }
            if (jho.b()) {
                this.j.startViewRecord();
            }
            this.j.start();
        } catch (IllegalArgumentException e) {
            LogUtil.e("Suggestion_RecordManager", LogAnonymous.b(e));
        }
    }

    private void d(MediaProjection mediaProjection, boolean z, boolean z2) {
        if (this.k.b() == null) {
            ReleaseLogUtil.b("Suggestion_RecordManager", "buildRecorderInR: fileDescriptor is null");
        } else {
            this.j = new jfy().c(this.f38562a).e(this.g).b(mediaProjection, this.k.b(), z, z2).setAudioFilePath(this.h).setHandler(this.i);
        }
    }

    public void h() {
        this.e = true;
    }

    public boolean b() {
        TrackRecorder trackRecorder = this.j;
        if (trackRecorder != null) {
            return trackRecorder.isRunSuccess();
        }
        return !this.d;
    }

    public void j() {
        TrackRecorder trackRecorder = this.j;
        if (trackRecorder != null) {
            trackRecorder.stopScreen();
        }
        TrackRecordReceiver trackRecordReceiver = this.l;
        if (trackRecordReceiver != null) {
            if (this.e) {
                trackRecordReceiver.d();
            } else {
                trackRecordReceiver.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        i();
        CommonSingleCallback<Boolean> commonSingleCallback = this.f;
        if (commonSingleCallback != null) {
            commonSingleCallback.callback(Boolean.valueOf(n()));
        }
        if (n()) {
            f();
        } else {
            q();
        }
        this.j = null;
    }

    private boolean n() {
        return b() && this.e;
    }

    public void g() {
        Intent intentCreateScreenCaptureIntent;
        if (this.f38563b != null) {
            if (Build.VERSION.SDK_INT > 34) {
                intentCreateScreenCaptureIntent = this.f38563b.createScreenCaptureIntent(MediaProjectionConfig.createConfigForDefaultDisplay());
            } else {
                intentCreateScreenCaptureIntent = this.f38563b.createScreenCaptureIntent();
            }
            if (intentCreateScreenCaptureIntent == null) {
                LogUtil.j("Suggestion_RecordManager", "startRecord: captureIntent is null");
                return;
            }
            Context context = this.f38564c;
            if (context instanceof Activity) {
                try {
                    ((Activity) context).startActivityForResult(intentCreateScreenCaptureIntent, 101);
                    return;
                } catch (ActivityNotFoundException e) {
                    ReleaseLogUtil.b("Suggestion_RecordManager", e.getMessage());
                    return;
                }
            }
            return;
        }
        LogUtil.e("Suggestion_RecordManager", "Current API level is lower than 21");
    }

    private void i() {
        TrackRecorder trackRecorder = this.j;
        if (trackRecorder != null) {
            if (trackRecorder.isRunSuccess()) {
                return;
            }
            this.e = false;
            return;
        }
        ReleaseLogUtil.c("Suggestion_RecordManager", "checkRecordSuccess: recorder and receiver is null");
    }

    private void q() {
        ReleaseLogUtil.d("Suggestion_RecordManager", "updateGalleryAbnormally start");
        if (this.j != null || this.d) {
            this.k.e();
            Context context = this.f38564c;
            if (context != null) {
                Toast.makeText(context, context.getString(R.string.IDS_retack_save_break_tip), 0).show();
                return;
            } else {
                ReleaseLogUtil.d("Suggestion_RecordManager", "updateGalleryAbnormally: context is null");
                return;
            }
        }
        ReleaseLogUtil.b("Suggestion_RecordManager", "stopRecordNormally mRecorder is null.");
    }

    public void f() {
        TrackRecorder trackRecorder = this.j;
        if (trackRecorder != null) {
            this.n = trackRecorder.getVideoDuration();
        } else {
            LogUtil.a("Suggestion_RecordManager", "stopRecordNormally mRecorder is null. is record on service");
        }
        if (this.n > 0) {
            if (PermissionUtil.e()) {
                ReleaseLogUtil.c("Suggestion_RecordManager", "saveVideoToAlbumInQ()");
                this.k.c();
                k();
                return;
            } else {
                ReleaseLogUtil.c("Suggestion_RecordManager", "saveVideoToAlbum()");
                l();
                return;
            }
        }
        this.k.e();
        Context context = this.f38564c;
        if (context != null) {
            Toast.makeText(context, context.getString(R.string.IDS_retack_save_break_tip), 0).show();
        } else {
            ReleaseLogUtil.d("Suggestion_RecordManager", "updateGalleryNormally: context is null");
        }
    }

    private void l() {
        LogUtil.a("Suggestion_RecordManager", "saveVideoToAlbum: ");
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", "");
        contentValues.put("duration", Long.valueOf(this.n));
        contentValues.put("mime_type", "video/mp4");
        contentValues.put("_data", this.k.a());
        Context context = this.f38564c;
        if (context == null) {
            LogUtil.j("Suggestion_RecordManager", "saveVideoToAlbum: context is null");
        } else {
            context.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
            k();
        }
    }

    private void k() {
        Context context = this.f38564c;
        if (context == null) {
            LogUtil.j("Suggestion_RecordManager", "showSaveSuccessToast: context is null");
            return;
        }
        Toast toastMakeText = Toast.makeText(context, context.getString(R.string.IDS_retack_save_recorder_tip), 0);
        toastMakeText.setGravity(80, 0, qrs.d(this.f38564c, 110.0f));
        toastMakeText.show();
    }

    public boolean c() {
        return this.f38562a;
    }

    public void c(boolean z) {
        this.f38562a = z;
    }

    public String a() {
        return this.k.a();
    }

    public Uri d() {
        return this.k.b();
    }

    public void e() {
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        TrackRecordReceiver trackRecordReceiver = this.l;
        if (trackRecordReceiver != null) {
            trackRecordReceiver.e();
        }
        this.f38564c.stopService(new Intent(this.f38564c, (Class<?>) TrackRecordService.class));
        this.f38564c = null;
    }
}

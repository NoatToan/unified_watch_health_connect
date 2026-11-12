package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Build;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class hdt implements MediaPlayer.OnCompletionListener {
    private static volatile hdt d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f36488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaPlayer f36489c;

    private hdt(Context context) {
        if (context == null) {
            this.f36487a = BaseApplication.getContext();
        } else {
            this.f36487a = context.getApplicationContext();
        }
        this.f36488b = new ArrayList();
    }

    public static hdt e(Context context) {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new hdt(context);
                }
            }
        }
        return d;
    }

    public void d(int i) {
        if (this.f36489c == null) {
            d();
        }
        if (this.f36489c.isPlaying()) {
            this.f36488b.add(Integer.valueOf(i));
        } else {
            b(i);
        }
    }

    private void b(final int i) {
        if (Build.VERSION.SDK_INT < 31) {
            e(i, true);
        } else if (PermissionUtil.b(this.f36487a, new String[]{"android.permission.READ_PHONE_STATE"})) {
            e(i, true);
        } else {
            PermissionUtil.a(BaseApplication.getActivity(), new String[]{"android.permission.READ_PHONE_STATE"}, new PermissionsResultAction() { // from class: hdt.5
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    hdt.this.e(i, true);
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    hdt.this.e(i, false);
                    LogUtil.a("Suggestion_SugVoice", "checkPermission onDenied");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, boolean z) {
        if (z && CommonUtil.bs()) {
            onCompletion(null);
            return;
        }
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f36487a.getResources().openRawResourceFd(i);
        try {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                this.f36489c.reset();
                this.f36489c.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                this.f36489c.prepare();
                this.f36489c.start();
            }
        } catch (IOException e2) {
            LogUtil.e("Suggestion_SugVoice", LogAnonymous.b(e2));
        } finally {
            try {
                assetFileDescriptorOpenRawResourceFd.close();
            } catch (IOException e3) {
                LogUtil.e("Suggestion_SugVoice", LogAnonymous.b(e3));
            }
        }
    }

    private void d() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f36489c = mediaPlayer;
        mediaPlayer.setOnCompletionListener(this);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f36488b.size() != 0 && mediaPlayer != null) {
            b(this.f36488b.get(0).intValue());
            this.f36488b.remove(0);
        } else {
            this.f36488b.clear();
            this.f36489c.release();
            this.f36489c = null;
        }
    }
}

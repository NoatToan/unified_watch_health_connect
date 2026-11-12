package com.huami.watch.companion.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Toast;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.sync.SyncResult;
import com.huami.watch.companion.sync.SyncWatchFaceBgHelper;
import com.huami.watch.companion.sync.ble.SyncBleFileHelper;
import com.huami.watch.companion.ui.activity.ClipWatchFaceBgActivity;
import com.huami.watch.companion.ui.fragment.SourceDuplicateFragment;
import com.huami.watch.companion.ui.view.ClipCircleBorderView;
import com.huami.watch.companion.ui.view.ClipZoomImageView;
import com.huami.watch.companion.util.AvatarTools;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.AndroidPermissions;
import com.huami.watch.util.DensityUtil;
import com.huami.watch.util.FilesUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class ClipWatchFaceBgActivity extends Activity {
    private static final String g = "ClipWatchFaceBgActivity";
    private AlertDialogFragment a;
    private Uri b;
    private boolean c;
    private Disposable d;
    private int e = GlMapUtil.DEVICE_DISPLAY_DPI_HIGH;
    private int f = GlMapUtil.DEVICE_DISPLAY_DPI_HIGH;

    public class a implements View.OnClickListener {
        public final /* synthetic */ ClipZoomImageView a;

        public a(ClipZoomImageView clipZoomImageView) {
            this.a = clipZoomImageView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Bitmap bitmapClip = this.a.clip();
            if (bitmapClip == null) {
                return;
            }
            String path = ClipWatchFaceBgActivity.this.b.getPath();
            Log.v(ClipWatchFaceBgActivity.g, path, new Object[0]);
            if (path != null) {
                File file = new File(path);
                if (file.exists()) {
                    file.delete();
                }
                ClipWatchFaceBgActivity clipWatchFaceBgActivity = ClipWatchFaceBgActivity.this;
                clipWatchFaceBgActivity.saveBitmap(path, AvatarTools.clipToRoundBitmap(bitmapClip, clipWatchFaceBgActivity.e, ClipWatchFaceBgActivity.this.f));
                ClipWatchFaceBgActivity.this.r();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClipWatchFaceBgActivity.this.onBackPressed();
        }
    }

    public class c implements Consumer<String> {
        public c() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(@NonNull String str) throws Exception {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ClipWatchFaceBgActivity.this.showWFBgSettingDialog(str);
        }
    }

    public class d implements ObservableOnSubscribe<String> {
        public final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<String> observableEmitter) throws Exception {
            String strCheckSourceDuplicate = AvatarTools.checkSourceDuplicate(ClipWatchFaceBgActivity.this, this.a);
            if (strCheckSourceDuplicate != null) {
                observableEmitter.onNext(strCheckSourceDuplicate);
            }
        }
    }

    public class e implements SourceDuplicateFragment.onItemClickLister {
        public final /* synthetic */ String a;

        public e(String str) {
            this.a = str;
        }

        @Override // com.huami.watch.companion.ui.fragment.SourceDuplicateFragment.onItemClickLister
        public void asNew() {
            ClipWatchFaceBgActivity.this.c = false;
        }

        @Override // com.huami.watch.companion.ui.fragment.SourceDuplicateFragment.onItemClickLister
        public void cover() {
            ClipWatchFaceBgActivity.this.c = true;
            ClipWatchFaceBgActivity.this.b = Uri.parse(this.a);
        }
    }

    public class f implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public f(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismissAllowingStateLoss();
            ClipWatchFaceBgActivity.this.finish();
        }
    }

    public class g implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public g(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismiss();
            if (!ClipWatchFaceBgActivity.this.c) {
                FilesUtil.delete(new File(ClipWatchFaceBgActivity.this.b.getPath()));
            }
            ClipWatchFaceBgActivity.this.finish();
        }
    }

    private void m(String str) {
        Rx.io(new d(str)).subscribe(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(SyncResult syncResult) throws Exception {
        q(syncResult.success);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Throwable th) throws Exception {
        HMLog.warn(g, th, new Function0() { // from class: np0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return ClipWatchFaceBgActivity.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(boolean z) {
        this.a.dismissAllowingStateLoss();
        if (!z) {
            showSyncFailedDialog();
        } else {
            Toast.makeText(this, getString(!this.c ? R.string.watch_face_sync_success : R.string.watch_face_sync_cover_success), 0).show();
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        showSyncDialog();
        if (DeviceManager.getManager(this).isCurrentDeviceBLE()) {
            SyncBleFileHelper.getHelper(this).file(this.b.getPath()).startAsync(new Consumer() { // from class: lp0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    this.a.q(((Boolean) obj).booleanValue());
                }
            });
        } else {
            SyncWatchFaceBgHelper.getHelper().setFilePath(this.b.getPath());
            this.d = SyncWatchFaceBgHelper.getHelper().syncWFBgToWatchObservable(this, 20).subscribe(new Consumer() { // from class: kp0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.n((SyncResult) obj);
                }
            }, new Consumer() { // from class: mp0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    ClipWatchFaceBgActivity.p((Throwable) obj);
                }
            });
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_clip_watch_face_bg);
        Intent intent = getIntent();
        Uri data = intent.getData();
        this.b = (Uri) intent.getParcelableExtra("output");
        DeviceManager manager = DeviceManager.getManager(this);
        if (manager != null && DeviceSource.isModelQogir(manager.getCurrentDevice())) {
            this.e = 360;
            this.f = 360;
        }
        String str = g;
        Log.d(str, "Image Uri : " + data, new Object[0]);
        if (data == null) {
            Log.w(str, "Image Uri is Null!!", new Object[0]);
            return;
        }
        ClipZoomImageView clipZoomImageView = (ClipZoomImageView) findViewById(R.id.zoom_image);
        ClipCircleBorderView clipCircleBorderView = (ClipCircleBorderView) findViewById(R.id.border_view);
        clipZoomImageView.setHorizontalPadding((int) DensityUtil.dpToPx(this, 12.0f));
        clipCircleBorderView.setHorizontalPadding((int) DensityUtil.dpToPx(this, 12.0f));
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Bitmap bitmapDecodeBitmapFromFileDescriptor = null;
        try {
            FileDescriptor fileDescriptor = getContentResolver().openFileDescriptor(data, "r").getFileDescriptor();
            int i = displayMetrics.widthPixels;
            bitmapDecodeBitmapFromFileDescriptor = AvatarTools.decodeBitmapFromFileDescriptor(fileDescriptor, i, i);
            Log.d(str, "Decode Image: " + bitmapDecodeBitmapFromFileDescriptor, new Object[0]);
        } catch (Exception e2) {
            Log.w(g, "DecodeImageErr", e2, new Object[0]);
        }
        if (bitmapDecodeBitmapFromFileDescriptor != null) {
            clipZoomImageView.setImageBitmap(bitmapDecodeBitmapFromFileDescriptor);
        }
        findViewById(R.id.finish_clipping).setOnClickListener(new a(clipZoomImageView));
        findViewById(R.id.cancel).setOnClickListener(new b());
        if (getIntent().getBooleanExtra("isNeedCheckDuplicate", false)) {
            m(data.toString());
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.dispose();
            this.d = null;
        }
        SyncBleFileHelper.getHelper(this).release();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Analytics.endSession(this);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Analytics.startSession(this);
        AndroidPermissions.request(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    public void saveBitmap(String str, Bitmap bitmap) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.WEBP, 60, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            Log.v(g, "image stored!", new Object[0]);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    public void showSyncDialog() {
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(2);
        this.a = alertDialogFragmentNewInstance;
        alertDialogFragmentNewInstance.setMessage(getString(R.string.watch_face_syncing));
        this.a.setCancelable(false);
        try {
            this.a.show(getFragmentManager(), "");
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void showSyncFailedDialog() {
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(1);
        alertDialogFragmentNewInstance.setMessage(getString(R.string.watch_face_sync_fail));
        alertDialogFragmentNewInstance.setCancelable(false);
        alertDialogFragmentNewInstance.setNeutral(getString(R.string.btn_known), new g(alertDialogFragmentNewInstance));
        try {
            alertDialogFragmentNewInstance.show(getFragmentManager(), "");
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void showWFBgSettingDialog(String str) {
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(6);
        SourceDuplicateFragment sourceDuplicateFragment = new SourceDuplicateFragment();
        sourceDuplicateFragment.setOnItemClickLister(new e(str));
        alertDialogFragmentNewInstance.setContent(sourceDuplicateFragment);
        alertDialogFragmentNewInstance.setCancelable(false);
        alertDialogFragmentNewInstance.setNeutral(getString(R.string.btn_cancel), new f(alertDialogFragmentNewInstance));
        try {
            alertDialogFragmentNewInstance.show(getFragmentManager(), "");
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }
}

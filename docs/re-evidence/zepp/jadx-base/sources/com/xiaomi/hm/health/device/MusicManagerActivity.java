package com.xiaomi.hm.health.device;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Lifecycle;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.watch.musicupload.DeviceMusicActivity;
import com.huami.watch.wififtp.FileManagerFragment;
import com.xiaomi.hm.health.device.MusicManagerActivity;
import com.xiaomi.hm.health.utils.StoragePermissionRequester;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u000b\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007R\u001a\u0010\r\u001a\u00060\nR\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/MusicManagerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", GoogleApiAvailabilityLight.a, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "v", "onMusicUploadClick", "Lcom/xiaomi/hm/health/device/MusicManagerActivity$ReadPermissionCallback;", "a", "Lcom/xiaomi/hm/health/device/MusicManagerActivity$ReadPermissionCallback;", "permissionCallback", "Lcom/xiaomi/hm/health/utils/StoragePermissionRequester;", "b", "Lcom/xiaomi/hm/health/utils/StoragePermissionRequester;", "permissionRequester", "<init>", "()V", "c", "ReadPermissionCallback", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MusicManagerActivity extends AppCompatActivity {

    @NotNull
    private static final a c = new a(null);

    @Deprecated
    @NotNull
    private static final String d = "MusicManagerActivity";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ReadPermissionCallback permissionCallback = new ReadPermissionCallback();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private StoragePermissionRequester permissionRequester;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/MusicManagerActivity$ReadPermissionCallback;", "Lcom/xiaomi/hm/health/utils/StoragePermissionRequester$IStoragePermissionCallback;", "", "granted", "", "onReadStorageGranted", "<init>", "(Lcom/xiaomi/hm/health/device/MusicManagerActivity;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class ReadPermissionCallback implements StoragePermissionRequester.IStoragePermissionCallback {
        public ReadPermissionCallback() {
        }

        @Override // com.xiaomi.hm.health.utils.StoragePermissionRequester.IStoragePermissionCallback
        public void onReadStorageGranted(boolean granted) {
            if (granted) {
                MusicManagerActivity.this.d();
            }
        }

        @Override // com.xiaomi.hm.health.utils.StoragePermissionRequester.IStoragePermissionCallback
        public void onWriteStorageGranted(boolean z) {
            StoragePermissionRequester.IStoragePermissionCallback.DefaultImpls.onWriteStorageGranted(this, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/device/MusicManagerActivity$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        startActivity(new Intent(this, (Class<?>) DeviceMusicActivity.class).addFlags(536870912).putExtra("FileTypes", new String[]{FileManagerFragment.FILE_TYPE_MUSIC}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MusicManagerActivity musicManagerActivity, View view) {
        musicManagerActivity.finish();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.permissionRequester = new StoragePermissionRequester(getActivityResultRegistry(), this.permissionCallback);
        Lifecycle lifecycle = getLifecycle();
        StoragePermissionRequester storagePermissionRequester = this.permissionRequester;
        Objects.requireNonNull(storagePermissionRequester);
        lifecycle.addObserver(storagePermissionRequester);
        setContentView(R.layout.activity_music_manager);
        ((RainbowTitleBar) findViewById(R.id.title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: ha5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicManagerActivity.e(this.a, view);
            }
        });
    }

    public final void onMusicUploadClick(@NotNull View v) {
        StoragePermissionRequester storagePermissionRequester = this.permissionRequester;
        Objects.requireNonNull(storagePermissionRequester);
        if (storagePermissionRequester.checkReadStoragePermission(this)) {
            this.permissionCallback.onReadStorageGranted(true);
            return;
        }
        StoragePermissionRequester storagePermissionRequester2 = this.permissionRequester;
        Objects.requireNonNull(storagePermissionRequester2);
        storagePermissionRequester2.askReadStoragePermission();
    }
}

package androidx.profileinstaller;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class DeviceProfileWriter {

    @NonNull
    private final String mApkName;

    @NonNull
    private final AssetManager mAssetManager;

    @NonNull
    private final File mCurProfile;

    @NonNull
    private final ProfileInstaller.DiagnosticsCallback mDiagnostics;

    @NonNull
    private final Executor mExecutor;

    @Nullable
    private Map<String, DexProfileData> mProfile;

    @NonNull
    private final String mProfileSourceLocation;

    @NonNull
    private final File mRefProfile;

    @Nullable
    private byte[] mTranscodedProfile;
    private boolean mDeviceSupportsAotProfile = false;

    @Nullable
    private final byte[] mDesiredVersion = desiredVersion();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class ExistingProfileState {
        private final boolean mCurExists;
        private final long mCurLength;
        private final boolean mRefExists;
        private final long mRefLength;

        public ExistingProfileState(long curLength, long refLength, boolean curExists, boolean refExists) {
            this.mCurLength = curLength;
            this.mRefLength = refLength;
            this.mCurExists = curExists;
            this.mRefExists = refExists;
        }

        public long getCurLength() {
            return this.mCurLength;
        }

        public long getRefLength() {
            return this.mRefLength;
        }

        public boolean hasCurFile() {
            return this.mCurExists;
        }

        public boolean hasRefFile() {
            return this.mRefExists;
        }
    }

    public interface SkipStrategy {
        boolean shouldSkip(long newProfileLength, @NonNull ExistingProfileState existingProfileState);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull ProfileInstaller.DiagnosticsCallback diagnosticsCallback, @NonNull String apkName, @NonNull String profileSourceLocation, @NonNull File curProfile, @NonNull File refProfile) {
        this.mAssetManager = assetManager;
        this.mExecutor = executor;
        this.mDiagnostics = diagnosticsCallback;
        this.mApkName = apkName;
        this.mProfileSourceLocation = profileSourceLocation;
        this.mCurProfile = curProfile;
        this.mRefProfile = refProfile;
    }

    private void assertDeviceAllowsProfileInstallerAotWritesCalled() {
        if (!this.mDeviceSupportsAotProfile) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    @Nullable
    private static byte[] desiredVersion() {
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            return null;
        }
        switch (i) {
            case 24:
            case 25:
                return ProfileVersion.V001_N;
            case 26:
            case 27:
                return ProfileVersion.V005_O;
            case 28:
            case 29:
            case 30:
                return ProfileVersion.V010_P;
            default:
                return null;
        }
    }

    @NonNull
    private ExistingProfileState generateExistingProfileStateFromFileSystem() {
        return new ExistingProfileState(this.mCurProfile.length(), this.mRefProfile.length(), this.mCurProfile.exists(), this.mRefProfile.exists());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$result$0(int i, Object obj) {
        this.mDiagnostics.onResultReceived(i, obj);
    }

    private void result(final int code, @Nullable final Object data) {
        this.mExecutor.execute(new Runnable() { // from class: p81
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$result$0(code, data);
            }
        });
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter copyProfileOrRead(@NonNull SkipStrategy skipStrategy) {
        assertDeviceAllowsProfileInstallerAotWritesCalled();
        if (this.mDesiredVersion == null) {
            return this;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenFd = this.mAssetManager.openFd(this.mProfileSourceLocation);
            try {
                FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorOpenFd.createInputStream();
                try {
                    this.mProfile = ProfileTranscoder.readProfile(fileInputStreamCreateInputStream, ProfileTranscoder.readHeader(fileInputStreamCreateInputStream), this.mApkName);
                    if (fileInputStreamCreateInputStream != null) {
                        fileInputStreamCreateInputStream.close();
                    }
                    assetFileDescriptorOpenFd.close();
                    return this;
                } catch (Throwable th) {
                    if (fileInputStreamCreateInputStream != null) {
                        try {
                            fileInputStreamCreateInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (assetFileDescriptorOpenFd != null) {
                    try {
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (FileNotFoundException e) {
            this.mDiagnostics.onResultReceived(6, e);
            return this;
        } catch (IOException e2) {
            this.mDiagnostics.onResultReceived(7, e2);
            return this;
        } catch (IllegalStateException e3) {
            this.mDiagnostics.onResultReceived(8, e3);
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean deviceAllowsProfileInstallerAotWrites() {
        if (this.mDesiredVersion == null) {
            result(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.mCurProfile.canWrite()) {
            this.mDeviceSupportsAotProfile = true;
            return true;
        }
        result(4, null);
        return false;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter transcodeIfNeeded() {
        Map<String, DexProfileData> map = this.mProfile;
        byte[] bArr = this.mDesiredVersion;
        if (map != null && bArr != null) {
            assertDeviceAllowsProfileInstallerAotWritesCalled();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ProfileTranscoder.writeHeader(byteArrayOutputStream, bArr);
                    if (!ProfileTranscoder.transcodeAndWriteBody(byteArrayOutputStream, bArr, map)) {
                        this.mDiagnostics.onResultReceived(5, null);
                        this.mProfile = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.mTranscodedProfile = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.mProfile = null;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                this.mDiagnostics.onResultReceived(7, e);
            } catch (IllegalStateException e2) {
                this.mDiagnostics.onResultReceived(8, e2);
            }
        }
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void writeIfNeeded(@NonNull SkipStrategy skipStrategy) {
        byte[] bArr = this.mTranscodedProfile;
        if (bArr == null) {
            return;
        }
        assertDeviceAllowsProfileInstallerAotWritesCalled();
        if (skipStrategy.shouldSkip(bArr.length, generateExistingProfileStateFromFileSystem())) {
            return;
        }
        try {
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.mCurProfile);
                        try {
                            Encoding.writeAll(byteArrayInputStream, fileOutputStream);
                            result(1, null);
                            fileOutputStream.close();
                            byteArrayInputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    this.mTranscodedProfile = null;
                    this.mProfile = null;
                    throw th5;
                }
            } catch (IOException e) {
                result(7, e);
            }
        } catch (FileNotFoundException e2) {
            result(6, e2);
        }
        this.mTranscodedProfile = null;
        this.mProfile = null;
    }
}

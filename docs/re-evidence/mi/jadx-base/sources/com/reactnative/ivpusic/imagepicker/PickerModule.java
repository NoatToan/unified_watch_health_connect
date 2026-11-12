package com.reactnative.ivpusic.imagepicker;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import coil.util.Utils;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.yalantis.ucrop.UCrop;
import defpackage.bhj;
import defpackage.fh8;
import defpackage.gsh;
import defpackage.ni4;
import defpackage.prh;
import defpackage.xa4;
import defpackage.xsk;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
class PickerModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int CAMERA_PICKER_REQUEST = 61111;
    private static final String E_ACTIVITY_DOES_NOT_EXIST = "E_ACTIVITY_DOES_NOT_EXIST";
    private static final String E_CALLBACK_ERROR = "E_CALLBACK_ERROR";
    private static final String E_CAMERA_IS_NOT_AVAILABLE = "E_CAMERA_IS_NOT_AVAILABLE";
    private static final String E_CANNOT_LAUNCH_CAMERA = "E_CANNOT_LAUNCH_CAMERA";
    private static final String E_ERROR_WHILE_CLEANING_FILES = "E_ERROR_WHILE_CLEANING_FILES";
    private static final String E_FAILED_TO_OPEN_CAMERA = "E_FAILED_TO_OPEN_CAMERA";
    private static final String E_FAILED_TO_SHOW_PICKER = "E_FAILED_TO_SHOW_PICKER";
    private static final String E_NO_CAMERA_PERMISSION_KEY = "E_NO_CAMERA_PERMISSION";
    private static final String E_NO_CAMERA_PERMISSION_MSG = "User did not grant camera permission.";
    private static final String E_NO_IMAGE_DATA_FOUND = "E_NO_IMAGE_DATA_FOUND";
    private static final String E_NO_LIBRARY_PERMISSION_KEY = "E_NO_LIBRARY_PERMISSION";
    private static final String E_NO_LIBRARY_PERMISSION_MSG = "User did not grant library permission.";
    private static final String E_PICKER_CANCELLED_KEY = "E_PICKER_CANCELLED";
    private static final String E_PICKER_CANCELLED_MSG = "User cancelled image selection";
    private static final int IMAGE_PICKER_REQUEST = 61110;
    private xa4 compression;
    private String cropperActiveWidgetColor;
    private boolean cropperCircleOverlay;
    private String cropperStatusBarColor;
    private String cropperToolbarColor;
    private String cropperToolbarTitle;
    private String cropperToolbarWidgetColor;
    private boolean cropping;
    private boolean disableCropperColorSetters;
    private boolean enableRotationGesture;
    private boolean freeStyleCropEnabled;
    private int height;
    private boolean hideBottomControls;
    private boolean includeBase64;
    private boolean includeExif;
    private Uri mCameraCaptureURI;
    private String mCurrentMediaPath;
    private String mediaType;
    private boolean multiple;
    private ReadableMap options;
    private ReactApplicationContext reactContext;
    private xsk resultCollector;
    private boolean showCropFrame;
    private boolean showCropGuidelines;
    private boolean useFrontCamera;
    private int width;

    public class a implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PickerModule f10462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f10463b;
        public final /* synthetic */ Promise c;

        public a(PickerModule pickerModule, Activity activity, Promise promise) {
            this.f10462a = pickerModule;
            this.f10463b = activity;
            this.c = promise;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                File file = new File(this.f10462a.getTmpDir(this.f10463b));
                if (!file.exists()) {
                    throw new Exception("File does not exist");
                }
                this.f10462a.deleteRecursive(file);
                this.c.resolve(null);
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                this.c.reject(PickerModule.E_ERROR_WHILE_CLEANING_FILES, e.getMessage());
            }
        }
    }

    public class b implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PickerModule f10465b;
        public final /* synthetic */ Promise c;

        public b(String str, PickerModule pickerModule, Promise promise) {
            this.f10464a = str;
            this.f10465b = pickerModule;
            this.c = promise;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            try {
                String strSubstring = this.f10464a;
                if (strSubstring.startsWith("file://")) {
                    strSubstring = strSubstring.substring(7);
                }
                File file = new File(strSubstring);
                if (file.exists()) {
                    this.f10465b.deleteRecursive(file);
                    this.c.resolve(null);
                    return null;
                }
                throw new Exception("File does not exist. Path: " + strSubstring);
            } catch (Exception e) {
                e.printStackTrace();
                this.c.reject(PickerModule.E_ERROR_WHILE_CLEANING_FILES, e.getMessage());
            }
        }
    }

    public class c implements gsh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f10466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callable f10467b;

        public c(Promise promise, Callable callable) {
            this.f10466a = promise;
            this.f10467b = callable;
        }

        @Override // defpackage.gsh
        public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            if (i == 1) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    String str = strArr[i2];
                    if (iArr[i2] == -1) {
                        if (str.equals("android.permission.CAMERA")) {
                            this.f10466a.reject(PickerModule.E_NO_CAMERA_PERMISSION_KEY, PickerModule.E_NO_CAMERA_PERMISSION_MSG);
                        } else if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            this.f10466a.reject(PickerModule.E_NO_LIBRARY_PERMISSION_KEY, PickerModule.E_NO_LIBRARY_PERMISSION_MSG);
                        } else {
                            this.f10466a.reject(PickerModule.E_NO_LIBRARY_PERMISSION_KEY, "Required permission missing");
                        }
                        return true;
                    }
                }
                try {
                    this.f10467b.call();
                } catch (Exception e) {
                    this.f10466a.reject(PickerModule.E_CALLBACK_ERROR, "Unknown error", e);
                }
            }
            return true;
        }
    }

    public class d implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f10468a;

        public d(Activity activity) {
            this.f10468a = activity;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            PickerModule.this.initiateCamera(this.f10468a);
            return null;
        }
    }

    public class e implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f10470a;

        public e(Activity activity) {
            this.f10470a = activity;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            PickerModule.this.initiatePicker(this.f10470a);
            return null;
        }
    }

    public class f implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f10472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Uri f10473b;

        public f(Activity activity, Uri uri) {
            this.f10472a = activity;
            this.f10473b = uri;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            PickerModule.this.startCropping(this.f10472a, this.f10473b);
            return null;
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f10474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f10475b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public class a implements Callback {
            public a() {
            }

            @Override // com.facebook.react.bridge.Callback
            public void invoke(Object... objArr) {
                String str = (String) objArr[0];
                try {
                    Bitmap bitmapValidateVideo = PickerModule.this.validateVideo(str);
                    long jLastModified = new File(str).lastModified();
                    long jLongValue = PickerModule.getVideoDuration(str).longValue();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putInt("width", bitmapValidateVideo.getWidth());
                    writableNativeMap.putInt("height", bitmapValidateVideo.getHeight());
                    writableNativeMap.putString("mime", g.this.d);
                    writableNativeMap.putInt(MediaStoreUtil.MediaInfo.SIZE, (int) new File(str).length());
                    writableNativeMap.putInt("duration", (int) jLongValue);
                    writableNativeMap.putString("path", "file://" + str);
                    writableNativeMap.putString(MediaStoreUtil.MediaInfo.KEY_MODIFY_DATE, String.valueOf(jLastModified));
                    PickerModule.this.resultCollector.d(writableNativeMap);
                } catch (Exception e) {
                    PickerModule.this.resultCollector.c(PickerModule.E_NO_IMAGE_DATA_FOUND, e);
                }
            }
        }

        public class b implements Callback {
            public b() {
            }

            @Override // com.facebook.react.bridge.Callback
            public void invoke(Object... objArr) {
                WritableNativeMap writableNativeMap = (WritableNativeMap) objArr[0];
                PickerModule.this.resultCollector.b(writableNativeMap.getString("code"), writableNativeMap.getString("message"));
            }
        }

        public g(Activity activity, String str, String str2, String str3) {
            this.f10474a = activity;
            this.f10475b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            PickerModule.this.compression.d(this.f10474a, PickerModule.this.options, this.f10475b, this.c, new PromiseImpl(new a(), new b()));
        }
    }

    public PickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mediaType = "any";
        this.multiple = false;
        this.includeBase64 = false;
        this.includeExif = false;
        this.cropping = false;
        this.cropperCircleOverlay = false;
        this.freeStyleCropEnabled = false;
        this.showCropGuidelines = true;
        this.showCropFrame = true;
        this.hideBottomControls = false;
        this.enableRotationGesture = false;
        this.disableCropperColorSetters = false;
        this.useFrontCamera = false;
        this.cropperActiveWidgetColor = null;
        this.cropperStatusBarColor = null;
        this.cropperToolbarColor = null;
        this.cropperToolbarTitle = null;
        this.cropperToolbarWidgetColor = null;
        this.width = 0;
        this.height = 0;
        this.resultCollector = new xsk();
        this.compression = new xa4();
        reactApplicationContext.addActivityEventListener(this);
        this.reactContext = reactApplicationContext;
    }

    private void cameraPickerResult(Activity activity, int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.resultCollector.b(E_PICKER_CANCELLED_KEY, E_PICKER_CANCELLED_MSG);
            return;
        }
        if (i2 == -1) {
            Uri uri = this.mCameraCaptureURI;
            if (uri == null) {
                this.resultCollector.b(E_NO_IMAGE_DATA_FOUND, "Cannot resolve image url");
                return;
            }
            if (this.cropping) {
                new UCrop.Options().setCompressionFormat(Bitmap.CompressFormat.JPEG);
                startCropping(activity, uri);
                return;
            }
            try {
                this.resultCollector.e(1);
                WritableMap selection = getSelection(activity, uri, true);
                if (selection != null) {
                    this.resultCollector.d(selection);
                }
            } catch (Exception e2) {
                this.resultCollector.b(E_NO_IMAGE_DATA_FOUND, e2.getMessage());
            }
        }
    }

    private void configureCropperColors(UCrop.Options options) {
        String str = this.cropperActiveWidgetColor;
        if (str != null) {
            options.setActiveControlsWidgetColor(Color.parseColor(str));
        }
        String str2 = this.cropperToolbarColor;
        if (str2 != null) {
            options.setToolbarColor(Color.parseColor(str2));
        }
        String str3 = this.cropperStatusBarColor;
        if (str3 != null) {
            options.setStatusBarColor(Color.parseColor(str3));
        }
        String str4 = this.cropperToolbarWidgetColor;
        if (str4 != null) {
            options.setToolbarWidgetColor(Color.parseColor(str4));
        }
    }

    private File createImageFile() throws IOException {
        String str = "image-" + UUID.randomUUID().toString();
        File externalFilesDir = this.reactContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES + File.separator + "YRNImageCrop");
        if (!externalFilesDir.exists() && !externalFilesDir.isDirectory()) {
            externalFilesDir.mkdirs();
        }
        File fileCreateTempFile = File.createTempFile(str, ".jpg", externalFilesDir);
        this.mCurrentMediaPath = "file:" + fileCreateTempFile.getAbsolutePath();
        return fileCreateTempFile;
    }

    private File createVideoFile() throws IOException {
        String str = "video-" + UUID.randomUUID().toString();
        File externalFilesDir = this.reactContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists() && !externalFilesDir.isDirectory()) {
            externalFilesDir.mkdirs();
        }
        File fileCreateTempFile = File.createTempFile(str, ".mp4", externalFilesDir);
        this.mCurrentMediaPath = "file:" + fileCreateTempFile.getAbsolutePath();
        return fileCreateTempFile;
    }

    private void croppingResult(Activity activity, int i, int i2, Intent intent) {
        if (intent == null) {
            this.resultCollector.b(E_PICKER_CANCELLED_KEY, E_PICKER_CANCELLED_MSG);
            return;
        }
        Uri output = UCrop.getOutput(intent);
        if (output == null) {
            this.resultCollector.b(E_NO_IMAGE_DATA_FOUND, "Cannot find image data");
            return;
        }
        try {
            if (this.width > 0 && this.height > 0) {
                xa4 xa4Var = this.compression;
                ReactApplicationContext reactApplicationContext = this.reactContext;
                String path = output.getPath();
                int i3 = this.width;
                int i4 = this.height;
                output = Uri.fromFile(xa4Var.e(reactApplicationContext, path, i3, i4, i3, i4, 100));
            }
            WritableMap selection = getSelection(activity, output, false);
            if (selection == null) {
                throw new Exception("Cannot crop video files");
            }
            selection.putMap("cropRect", getCroppedRectMap(intent));
            this.resultCollector.e(1);
            this.resultCollector.d(selection);
        } catch (Exception e2) {
            this.resultCollector.b(E_NO_IMAGE_DATA_FOUND, e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteRecursive(file2);
            }
        }
        file.delete();
    }

    private void getAsyncSelection(Activity activity, Uri uri, boolean z) throws Exception {
        String strResolveRealPath = resolveRealPath(activity, uri, z);
        if (strResolveRealPath == null || strResolveRealPath.isEmpty()) {
            this.resultCollector.b(E_NO_IMAGE_DATA_FOUND, "Cannot resolve asset path.");
            return;
        }
        String mimeType = getMimeType(strResolveRealPath);
        if (mimeType == null || !mimeType.startsWith("video/")) {
            this.resultCollector.d(getImage(activity, strResolveRealPath));
        } else {
            getVideo(activity, strResolveRealPath, mimeType);
        }
    }

    private String getBase64StringFromFile(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            byte[] bArr = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                try {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (FileNotFoundException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    private static WritableMap getCroppedRectMap(Intent intent) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("x", intent.getIntExtra(UCrop.EXTRA_OUTPUT_OFFSET_X, -1));
        writableNativeMap.putInt("y", intent.getIntExtra(UCrop.EXTRA_OUTPUT_OFFSET_Y, -1));
        writableNativeMap.putInt("width", intent.getIntExtra(UCrop.EXTRA_OUTPUT_IMAGE_WIDTH, -1));
        writableNativeMap.putInt("height", intent.getIntExtra(UCrop.EXTRA_OUTPUT_IMAGE_HEIGHT, -1));
        return writableNativeMap;
    }

    private WritableMap getImage(Activity activity, String str) throws Exception {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (str.startsWith("http://") || str.startsWith("https://")) {
            throw new Exception("Cannot select remote files");
        }
        String path = this.compression.c(this.reactContext, this.options, str, validateImage(str)).getPath();
        BitmapFactory.Options optionsValidateImage = validateImage(path);
        long jLastModified = new File(str).lastModified();
        writableNativeMap.putString("path", "file://" + path);
        writableNativeMap.putInt("width", optionsValidateImage.outWidth);
        writableNativeMap.putInt("height", optionsValidateImage.outHeight);
        writableNativeMap.putString("mime", optionsValidateImage.outMimeType);
        writableNativeMap.putInt(MediaStoreUtil.MediaInfo.SIZE, (int) new File(path).length());
        writableNativeMap.putString(MediaStoreUtil.MediaInfo.KEY_MODIFY_DATE, String.valueOf(jLastModified));
        if (this.includeBase64) {
            writableNativeMap.putString("data", getBase64StringFromFile(path));
        }
        if (this.includeExif) {
            try {
                writableNativeMap.putMap("exif", fh8.a(str));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return writableNativeMap;
    }

    private String getMimeType(String str) {
        Uri uriFromFile = Uri.fromFile(new File(str));
        if (uriFromFile.getScheme().equals(MiuiCursorConstants.CONTENT)) {
            return this.reactContext.getContentResolver().getType(uriFromFile);
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uriFromFile.toString());
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
        }
        return null;
    }

    private WritableMap getSelection(Activity activity, Uri uri, boolean z) throws Exception {
        String strResolveRealPath = resolveRealPath(activity, uri, z);
        if (strResolveRealPath == null || strResolveRealPath.isEmpty()) {
            throw new Exception("Cannot resolve asset path.");
        }
        String mimeType = getMimeType(strResolveRealPath);
        if (mimeType == null || !mimeType.startsWith("video/")) {
            return getImage(activity, strResolveRealPath);
        }
        getVideo(activity, strResolveRealPath, mimeType);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getTmpDir(Activity activity) {
        String str = activity.getCacheDir() + "/react-native-image-crop-picker";
        new File(str).mkdir();
        return str;
    }

    private void getVideo(Activity activity, String str, String str2) throws Exception {
        validateVideo(str);
        new Thread(new g(activity, str, getTmpDir(activity) + "/" + UUID.randomUUID().toString() + ".mp4", str2)).run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Long getVideoDuration(String str) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            return Long.valueOf(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)));
        } catch (Exception unused) {
            return -1L;
        }
    }

    private void imagePickerResult(Activity activity, int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.resultCollector.b(E_PICKER_CANCELLED_KEY, E_PICKER_CANCELLED_MSG);
            return;
        }
        if (i2 == -1) {
            if (!this.multiple) {
                Uri data = intent.getData();
                if (data == null) {
                    this.resultCollector.b(E_NO_IMAGE_DATA_FOUND, "Cannot resolve image url");
                    return;
                }
                if (this.cropping) {
                    startCropping(activity, data);
                    return;
                }
                try {
                    getAsyncSelection(activity, data, false);
                    return;
                } catch (Exception e2) {
                    this.resultCollector.b(E_NO_IMAGE_DATA_FOUND, e2.getMessage());
                    return;
                }
            }
            ClipData clipData = intent.getClipData();
            try {
                if (clipData == null) {
                    this.resultCollector.e(1);
                    getAsyncSelection(activity, intent.getData(), false);
                    return;
                }
                this.resultCollector.e(clipData.getItemCount());
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    getAsyncSelection(activity, clipData.getItemAt(i3).getUri(), false);
                }
            } catch (Exception e3) {
                this.resultCollector.b(E_NO_IMAGE_DATA_FOUND, e3.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initiateCamera(Activity activity) {
        String str;
        File fileCreateImageFile;
        try {
            if (this.mediaType.equals("video")) {
                str = "android.media.action.VIDEO_CAPTURE";
                fileCreateImageFile = createVideoFile();
            } else {
                str = "android.media.action.IMAGE_CAPTURE";
                fileCreateImageFile = createImageFile();
            }
            Intent intent = new Intent(str);
            Uri uriForFile = FileProvider.getUriForFile(activity, activity.getApplicationContext().getPackageName() + ".YRNImageCropProvider", fileCreateImageFile);
            this.mCameraCaptureURI = uriForFile;
            intent.putExtra("output", uriForFile);
            if (this.useFrontCamera) {
                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            }
            if (intent.resolveActivity(activity.getPackageManager()) == null) {
                this.resultCollector.b(E_CANNOT_LAUNCH_CAMERA, "Cannot launch camera");
            } else {
                activity.startActivityForResult(intent, CAMERA_PICKER_REQUEST);
            }
        } catch (Exception e2) {
            this.resultCollector.c(E_FAILED_TO_OPEN_CAMERA, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initiatePicker(Activity activity) {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            if (this.cropping || this.mediaType.equals("photo")) {
                intent.setType("image/*");
                if (this.cropping) {
                    intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{Utils.MIME_TYPE_JPEG, "image/png"});
                }
            } else if (this.mediaType.equals("video")) {
                intent.setType("video/*");
            } else {
                intent.setType("*/*");
                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            intent.setFlags(67108864);
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.multiple);
            intent.addCategory("android.intent.category.OPENABLE");
            activity.startActivityForResult(Intent.createChooser(intent, "Pick an image"), IMAGE_PICKER_REQUEST);
        } catch (Exception e2) {
            this.resultCollector.c(E_FAILED_TO_SHOW_PICKER, e2);
        }
    }

    private boolean isCameraAvailable(Activity activity) {
        return activity.getPackageManager().hasSystemFeature("android.hardware.camera") || activity.getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void permissionsCheck(Activity activity, Promise promise, List<String> list, Callable<Void> callable) {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList(list);
        if (Build.VERSION.SDK_INT > 29) {
            arrayList2.remove("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        for (String str : arrayList2) {
            if (ni4.a(activity, str) != 0) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            ((prh) activity).requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 1, new c(promise, callable));
            return;
        }
        try {
            callable.call();
        } catch (Exception e2) {
            promise.reject(E_CALLBACK_ERROR, "Unknown error", e2);
        }
    }

    private String resolveRealPath(Activity activity, Uri uri, boolean z) throws IOException {
        return z ? Uri.parse(this.mCurrentMediaPath).getPath() : bhj.b(activity, uri);
    }

    private void setConfiguration(ReadableMap readableMap) {
        this.mediaType = readableMap.hasKey(MediaStoreUtil.MediaInfo.KEY_MIME_TYPE) ? readableMap.getString(MediaStoreUtil.MediaInfo.KEY_MIME_TYPE) : "any";
        this.multiple = readableMap.hasKey("multiple") && readableMap.getBoolean("multiple");
        this.includeBase64 = readableMap.hasKey("includeBase64") && readableMap.getBoolean("includeBase64");
        this.includeExif = readableMap.hasKey("includeExif") && readableMap.getBoolean("includeExif");
        this.width = readableMap.hasKey("width") ? readableMap.getInt("width") : 0;
        this.height = readableMap.hasKey("height") ? readableMap.getInt("height") : 0;
        this.cropping = readableMap.hasKey("cropping") && readableMap.getBoolean("cropping");
        this.cropperActiveWidgetColor = readableMap.hasKey("cropperActiveWidgetColor") ? readableMap.getString("cropperActiveWidgetColor") : null;
        this.cropperStatusBarColor = readableMap.hasKey("cropperStatusBarColor") ? readableMap.getString("cropperStatusBarColor") : null;
        this.cropperToolbarColor = readableMap.hasKey("cropperToolbarColor") ? readableMap.getString("cropperToolbarColor") : null;
        this.cropperToolbarTitle = readableMap.hasKey("cropperToolbarTitle") ? readableMap.getString("cropperToolbarTitle") : null;
        this.cropperToolbarWidgetColor = readableMap.hasKey("cropperToolbarWidgetColor") ? readableMap.getString("cropperToolbarWidgetColor") : null;
        this.cropperCircleOverlay = readableMap.hasKey("cropperCircleOverlay") && readableMap.getBoolean("cropperCircleOverlay");
        this.freeStyleCropEnabled = readableMap.hasKey("freeStyleCropEnabled") && readableMap.getBoolean("freeStyleCropEnabled");
        this.showCropGuidelines = !readableMap.hasKey("showCropGuidelines") || readableMap.getBoolean("showCropGuidelines");
        this.showCropFrame = !readableMap.hasKey("showCropFrame") || readableMap.getBoolean("showCropFrame");
        this.hideBottomControls = readableMap.hasKey("hideBottomControls") && readableMap.getBoolean("hideBottomControls");
        this.enableRotationGesture = readableMap.hasKey("enableRotationGesture") && readableMap.getBoolean("enableRotationGesture");
        this.disableCropperColorSetters = readableMap.hasKey("disableCropperColorSetters") && readableMap.getBoolean("disableCropperColorSetters");
        this.useFrontCamera = readableMap.hasKey("useFrontCamera") && readableMap.getBoolean("useFrontCamera");
        this.options = readableMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCropping(Activity activity, Uri uri) {
        int i;
        UCrop.Options options = new UCrop.Options();
        options.setCompressionFormat(Bitmap.CompressFormat.JPEG);
        options.setCompressionQuality(100);
        options.setCircleDimmedLayer(this.cropperCircleOverlay);
        options.setFreeStyleCropEnabled(this.freeStyleCropEnabled);
        options.setShowCropGrid(this.showCropGuidelines);
        options.setShowCropFrame(this.showCropFrame);
        options.setHideBottomControls(this.hideBottomControls);
        String str = this.cropperToolbarTitle;
        if (str != null) {
            options.setToolbarTitle(str);
        }
        if (this.enableRotationGesture) {
            options.setAllowedGestures(3, 3, 3);
        }
        if (!this.disableCropperColorSetters) {
            configureCropperColors(options);
        }
        UCrop uCropWithOptions = UCrop.of(uri, Uri.fromFile(new File(getTmpDir(activity), UUID.randomUUID().toString() + ".jpg"))).withOptions(options);
        int i2 = this.width;
        if (i2 > 0 && (i = this.height) > 0) {
            uCropWithOptions.withAspectRatio(i2, i);
        }
        uCropWithOptions.start(activity);
    }

    private BitmapFactory.Options validateImage(String str) throws Exception {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inDither = true;
        BitmapFactory.decodeFile(str, options);
        if (options.outMimeType == null || options.outWidth == 0 || options.outHeight == 0) {
            throw new Exception("Invalid image selected");
        }
        return options;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap validateVideo(String str) throws Exception {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
        if (frameAtTime != null) {
            return frameAtTime;
        }
        throw new Exception("Cannot retrieve video data");
    }

    @ReactMethod
    public void clean(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
        } else {
            permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new a(this, currentActivity, promise));
        }
    }

    @ReactMethod
    public void cleanSingle(String str, Promise promise) {
        if (str == null) {
            promise.reject(E_ERROR_WHILE_CLEANING_FILES, "Cannot cleanup empty path");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
        } else {
            permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new b(str, this, promise));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImageCropPicker";
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (i == IMAGE_PICKER_REQUEST) {
            imagePickerResult(activity, i, i2, intent);
        } else if (i == CAMERA_PICKER_REQUEST) {
            cameraPickerResult(activity, i, i2, intent);
        } else if (i == 69) {
            croppingResult(activity, i, i2, intent);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void openCamera(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
        } else {
            if (!isCameraAvailable(currentActivity)) {
                promise.reject(E_CAMERA_IS_NOT_AVAILABLE, "Camera not available");
                return;
            }
            setConfiguration(readableMap);
            this.resultCollector.f(promise, false);
            permissionsCheck(currentActivity, promise, Arrays.asList("android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"), new d(currentActivity));
        }
    }

    @ReactMethod
    public void openCropper(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
            return;
        }
        setConfiguration(readableMap);
        this.resultCollector.f(promise, false);
        permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new f(currentActivity, Uri.parse(readableMap.getString("path"))));
    }

    @ReactMethod
    public void openPicker(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
            return;
        }
        setConfiguration(readableMap);
        this.resultCollector.f(promise, this.multiple);
        permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new e(currentActivity));
    }
}

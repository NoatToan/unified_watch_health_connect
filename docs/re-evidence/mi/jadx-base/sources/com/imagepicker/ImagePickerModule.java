package com.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import defpackage.bch;
import defpackage.gmq;
import defpackage.ndj;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
@ndj(name = ImagePickerModule.NAME)
public class ImagePickerModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    static final String NAME = "ImagePickerManager";
    public static final int REQUEST_LAUNCH_IMAGE_CAPTURE = 13001;
    public static final int REQUEST_LAUNCH_LIBRARY = 13003;
    public static final int REQUEST_LAUNCH_VIDEO_CAPTURE = 13002;
    Callback callback;
    Uri cameraCaptureURI;
    private Uri fileUri;
    bch options;
    final ReactApplicationContext reactContext;

    public ImagePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void launchCamera(ReadableMap readableMap, Callback callback) {
        Intent intent;
        File fileB;
        int i;
        if (!gmq.t(this.reactContext)) {
            callback.invoke(gmq.j(gmq.f19142b, null));
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(gmq.j(gmq.d, "Activity error"));
            return;
        }
        if (!gmq.u(this.reactContext, currentActivity)) {
            callback.invoke(gmq.j(gmq.d, gmq.g));
            return;
        }
        this.callback = callback;
        bch bchVar = new bch(readableMap);
        this.options = bchVar;
        if (bchVar.f.booleanValue() && Build.VERSION.SDK_INT <= 28 && !gmq.s(currentActivity)) {
            callback.invoke(gmq.j(gmq.c, null));
            return;
        }
        if (this.options.i.equals(gmq.f)) {
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("android.intent.extra.videoQuality", this.options.f4058b);
            int i2 = this.options.g;
            if (i2 > 0) {
                intent.putExtra("android.intent.extra.durationLimit", i2);
            }
            fileB = gmq.b(this.reactContext, "mp4");
            this.cameraCaptureURI = gmq.c(fileB, this.reactContext);
            i = REQUEST_LAUNCH_VIDEO_CAPTURE;
        } else {
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            fileB = gmq.b(this.reactContext, "jpg");
            this.cameraCaptureURI = gmq.c(fileB, this.reactContext);
            i = REQUEST_LAUNCH_IMAGE_CAPTURE;
        }
        if (this.options.h.booleanValue()) {
            gmq.A(intent);
        }
        this.fileUri = Uri.fromFile(fileB);
        intent.putExtra("output", this.cameraCaptureURI);
        intent.addFlags(3);
        try {
            currentActivity.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e) {
            callback.invoke(gmq.j(gmq.d, e.getMessage()));
            this.callback = null;
        }
    }

    @ReactMethod
    public void launchImageLibrary(ReadableMap readableMap, Callback callback) {
        Intent intent;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(gmq.j(gmq.d, "Activity error"));
            return;
        }
        this.callback = callback;
        bch bchVar = new bch(readableMap);
        this.options = bchVar;
        if (bchVar.i.equals(gmq.f)) {
            intent = new Intent("android.intent.action.PICK");
            intent.setType("video/*");
        } else if (this.options.i.equals(gmq.e)) {
            intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            intent.addCategory("android.intent.category.OPENABLE");
        }
        try {
            currentActivity.startActivityForResult(Intent.createChooser(intent, null), REQUEST_LAUNCH_LIBRARY);
        } catch (ActivityNotFoundException e) {
            callback.invoke(gmq.j(gmq.d, e.getMessage()));
            this.callback = null;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) throws Throwable {
        if (!gmq.w(i) || this.callback == null) {
            return;
        }
        if (i2 != -1) {
            if (i == 13001) {
                gmq.d(this.fileUri);
            }
            this.callback.invoke(gmq.h());
            return;
        }
        switch (i) {
            case REQUEST_LAUNCH_IMAGE_CAPTURE /* 13001 */:
                if (this.options.f.booleanValue()) {
                    gmq.z(this.cameraCaptureURI, this.reactContext, "photo");
                }
                onImageObtained(this.fileUri);
                return;
            case REQUEST_LAUNCH_VIDEO_CAPTURE /* 13002 */:
                if (this.options.f.booleanValue()) {
                    gmq.z(this.cameraCaptureURI, this.reactContext, "video");
                }
                try {
                    onVideoObtained(this.fileUri);
                    return;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            case REQUEST_LAUNCH_LIBRARY /* 13003 */:
                Uri data = intent.getData();
                if (gmq.v(data, this.reactContext)) {
                    onImageObtained(gmq.e(data, this.reactContext));
                    return;
                } else {
                    if (!gmq.x(data, this.reactContext)) {
                        this.callback.invoke(gmq.j(gmq.d, "Unsupported file type"));
                        return;
                    }
                    try {
                        onVideoObtained(data);
                        return;
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            default:
                return;
        }
    }

    public void onImageObtained(Uri uri) throws Throwable {
        this.callback.invoke(gmq.q(gmq.y(uri, this.reactContext, this.options), this.options, this.reactContext));
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public void onVideoObtained(Uri uri) throws IOException {
        this.callback.invoke(gmq.r(uri, this.reactContext));
    }
}

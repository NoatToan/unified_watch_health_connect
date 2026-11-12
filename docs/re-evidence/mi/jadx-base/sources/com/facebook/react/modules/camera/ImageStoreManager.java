package com.facebook.react.modules.camera;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Base64OutputStream;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import defpackage.ndj;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ImageStoreManager.NAME)
public class ImageStoreManager extends ReactContextBaseJavaModule {
    private static final int BUFFER_SIZE = 8192;
    public static final String NAME = "ImageStoreManager";

    public class b extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Callback f7373b;
        public final Callback c;

        public b(ReactContext reactContext, String str, Callback callback, Callback callback2) {
            super(reactContext);
            this.f7372a = str;
            this.f7373b = callback;
            this.c = callback2;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            try {
                InputStream inputStreamOpenInputStream = ImageStoreManager.this.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(this.f7372a));
                try {
                    try {
                        this.f7373b.invoke(ImageStoreManager.this.convertInputStreamToBase64OutputStream(inputStreamOpenInputStream));
                    } catch (IOException e) {
                        this.c.invoke(e.getMessage());
                    }
                } finally {
                    ImageStoreManager.closeQuietly(inputStreamOpenInputStream);
                }
            } catch (FileNotFoundException e2) {
                this.c.invoke(e2.getMessage());
            }
        }
    }

    public ImageStoreManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public String convertInputStreamToBase64OutputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i <= -1) {
                    closeQuietly(base64OutputStream);
                    return byteArrayOutputStream.toString();
                }
                base64OutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                closeQuietly(base64OutputStream);
                throw th;
            }
        }
    }

    @ReactMethod
    public void getBase64ForTag(String str, Callback callback, Callback callback2) {
        new b(getReactApplicationContext(), str, callback, callback2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }
}

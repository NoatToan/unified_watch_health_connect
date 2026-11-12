package com.mipay.sdk.app;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class ImageSelector {
    private static final String TAG = "ImageSelector";
    private Uri mCapturedImageUri;
    private Context mContext;
    private ValueCallback<Uri[]> mImageSelectCallBack;

    public ImageSelector(Context context) {
        this.mContext = context;
    }

    private Uri createTempFileContentUri(String str) {
        try {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
            StringBuilder sb = new StringBuilder();
            sb.append(externalStoragePublicDirectory.getAbsolutePath());
            String str2 = File.separator;
            sb.append(str2);
            sb.append("captured_media");
            File file = new File(sb.toString());
            file.mkdirs();
            return Uri.fromFile(new File(file.getAbsolutePath() + str2 + System.currentTimeMillis() + "." + str));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Uri getSelectImageUri(Intent intent) {
        String action;
        return (intent != null && ((action = intent.getAction()) == null || !action.equals("android.media.action.IMAGE_CAPTURE"))) ? intent.getData() : this.mCapturedImageUri;
    }

    private Uri[] parseResult(int i, Intent intent) {
        Uri selectImageUri;
        if (i == 0 || (selectImageUri = getSelectImageUri(intent)) == null) {
            return null;
        }
        return new Uri[]{selectImageUri};
    }

    public void onResult(int i, Intent intent) {
        this.mImageSelectCallBack.onReceiveValue(parseResult(i, intent));
        this.mImageSelectCallBack = null;
    }

    public void openFileChooser(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (this.mImageSelectCallBack == null && TextUtils.equals(Environment.getExternalStorageState(), "mounted")) {
            this.mImageSelectCallBack = valueCallback;
            this.mCapturedImageUri = createTempFileContentUri("jpg");
            ArrayList arrayList = new ArrayList();
            Intent intent = new Intent();
            intent.setAction("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", this.mCapturedImageUri);
            arrayList.add(intent);
            Intent intent2 = new Intent();
            intent2.setType("image/*");
            intent2.setAction("android.intent.action.GET_CONTENT");
            Intent intent3 = new Intent("android.intent.action.CHOOSER");
            intent3.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
            intent3.putExtra("android.intent.extra.INTENT", intent2);
            try {
                Context context = this.mContext;
                if (context instanceof Activity) {
                    ((Activity) context).startActivityForResult(intent3, 1000);
                }
            } catch (ActivityNotFoundException unused) {
                this.mImageSelectCallBack = null;
            }
        }
    }
}

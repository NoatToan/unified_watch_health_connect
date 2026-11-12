package com.huawei.hms.hmsscankit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.feature.dynamic.DeferredLifecycleHelper;
import com.huawei.hms.feature.dynamic.LifecycleDelegate;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.feature.dynamic.OnDelegateCreatedListener;
import com.huawei.hms.hmsscankit.api.IOnErrorCallback;
import com.huawei.hms.hmsscankit.api.IOnLightCallback;
import com.huawei.hms.hmsscankit.api.IOnResultCallback;
import com.huawei.hms.hmsscankit.api.IRemoteCreator;
import com.huawei.hms.hmsscankit.api.IRemoteViewDelegate;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.w7;
import com.huawei.hms.scankit.p.y3;
import com.huawei.operation.utils.Constants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;

/* JADX INFO: loaded from: classes10.dex */
public class RemoteView extends FrameLayout {
    private static final int MAX_BITMAP_SIZE = 52428800;
    public static final int REQUEST_CODE_PHOTO = 4371;
    private static final String TAG = "ScanKitRemoteView";
    private static boolean flagForGallery = false;
    private static boolean isOnStop = true;
    private Context mContext;
    private boolean mContinuouslyScan;
    private OnErrorCallback mOnErrorCallback;
    private a mRemoteHelper;
    private boolean mReturnedBitmap;

    /* JADX INFO: loaded from: classes34.dex */
    public static class Builder {
        Activity mContext;
        HmsScanAnalyzerOptions mFormat;
        Rect mRect;
        boolean mIsCustomed = true;
        boolean mContinuouslyScan = true;
        boolean mReturnedBitmap = false;

        public RemoteView build() {
            Activity activity = this.mContext;
            boolean z = this.mIsCustomed;
            HmsScanAnalyzerOptions hmsScanAnalyzerOptions = this.mFormat;
            return new RemoteView(activity, z, hmsScanAnalyzerOptions == null ? 0 : hmsScanAnalyzerOptions.mode, this.mRect).setContinuouslyScan(this.mContinuouslyScan).enableReturnBitmap(this.mReturnedBitmap);
        }

        public Builder enableReturnBitmap() {
            this.mReturnedBitmap = true;
            return this;
        }

        public Builder setBoundingBox(Rect rect) {
            this.mRect = rect;
            return this;
        }

        public Builder setContext(Activity activity) {
            this.mContext = activity;
            return this;
        }

        public Builder setContinuouslyScan(boolean z) {
            this.mContinuouslyScan = z;
            return this;
        }

        public Builder setFormat(int i, int... iArr) {
            this.mFormat = new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(i, iArr).create();
            return this;
        }
    }

    class a extends DeferredLifecycleHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ViewGroup f13516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f13517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private OnDelegateCreatedListener f13518c;
        private IRemoteViewDelegate d;
        private IOnResultCallback e = null;
        private boolean f;
        private boolean g;
        private int h;
        private IOnLightCallback i;
        private Rect j;
        private Bundle k;
        private boolean l;
        private boolean m;
        private int n;
        private boolean o;
        private boolean p;

        /* JADX INFO: renamed from: com.huawei.hms.hmsscankit.RemoteView$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0128a implements View.OnClickListener {
            ViewOnClickListenerC0128a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a aVar = a.this;
                Activity activity = aVar.f13517b;
                if (activity != null) {
                    RemoteView.this.startPhotoCode(activity);
                }
            }
        }

        class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a aVar = a.this;
                Activity activity = aVar.f13517b;
                if (activity != null) {
                    RemoteView.this.startPhotoCode(activity);
                }
            }
        }

        a(Activity activity, ViewGroup viewGroup, boolean z, int i, Rect rect) {
            this.f13516a = viewGroup;
            this.f13517b = activity;
            this.f = z;
            this.h = i;
            this.j = rect;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g() {
            IRemoteViewDelegate iRemoteViewDelegate = this.d;
            if (iRemoteViewDelegate == null) {
                return false;
            }
            try {
                iRemoteViewDelegate.turnOnLight();
                return true;
            } catch (RemoteException unused) {
                o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
                return false;
            }
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper
        public void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
            this.f13518c = onDelegateCreatedListener;
            if (onDelegateCreatedListener == null || getDelegate() != null) {
                return;
            }
            this.d = null;
            try {
                Bundle bundle = new Bundle();
                boolean z = this.f;
                if (!z && this.h == 0 && this.j == null) {
                    o4.d(RemoteView.TAG, "!mCustomed && mFormatValue == 0 && mRect == null");
                } else {
                    bundle.putBoolean(DetailRect.CUSTOMED_FLAG, z);
                    bundle.putInt(DetailRect.FORMAT_FLAG, this.h);
                    Rect rect = this.j;
                    if (rect != null) {
                        bundle.putParcelable(DetailRect.RECT_FLAG, rect);
                    }
                }
                boolean z2 = this.l;
                if (z2) {
                    bundle.putBoolean(DetailRect.SCAN_OFFSCEEN_FLAG, z2);
                }
                boolean z3 = this.g;
                if (z3) {
                    bundle.putBoolean(DetailRect.DEEPLINK_JUMP_FLAG, z3);
                    bundle.putAll(this.k);
                }
                bundle.putInt(DetailRect.TYPE_TRANS, 3);
                bundle.putBoolean(DetailRect.RETURN_BITMAP, this.m);
                bundle.putAll(y3.a(this.f13517b));
                bundle.putBoolean(DetailRect.SCAN_NEW_UI, true);
                bundle.putInt(DetailRect.SCAN_VIEWTYPE_FLAG, this.n);
                bundle.putBoolean(DetailRect.SCAN_CAMERA_PERMISSION, this.o);
                bundle.putBoolean(HmsScanBase.SCAN_GUIDE_FLAG, this.p);
                IRemoteCreator iRemoteCreatorD = g.d(this.f13517b);
                if (iRemoteCreatorD == null) {
                    return;
                } else {
                    this.d = iRemoteCreatorD.newRemoteViewDelegate(ObjectWrapper.wrap(this.f13517b), ObjectWrapper.wrap(bundle));
                }
            } catch (RemoteException unused) {
                o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
            }
            IRemoteViewDelegate iRemoteViewDelegate = this.d;
            if (iRemoteViewDelegate == null) {
                return;
            }
            try {
                IOnResultCallback iOnResultCallback = this.e;
                if (iOnResultCallback != null) {
                    iRemoteViewDelegate.setOnResultCallback(iOnResultCallback);
                    this.d.setOnClickListener(ObjectWrapper.wrap(new ViewOnClickListenerC0128a()));
                }
                this.d.setOnClickListener(ObjectWrapper.wrap(new b()));
                IOnLightCallback iOnLightCallback = this.i;
                if (iOnLightCallback != null) {
                    this.d.setOnLightVisbleCallBack(iOnLightCallback);
                }
            } catch (RemoteException unused2) {
                o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
            }
            this.f13518c.onDelegateCreated(new b(this.f13516a, this.d));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            IRemoteViewDelegate iRemoteViewDelegate = this.d;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.pauseContinuouslyScan();
                } catch (RemoteException unused) {
                    o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            IRemoteViewDelegate iRemoteViewDelegate = this.d;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.resumeContinuouslyScan();
                } catch (RemoteException unused) {
                    o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean f() {
            IRemoteViewDelegate iRemoteViewDelegate = this.d;
            if (iRemoteViewDelegate == null) {
                return false;
            }
            try {
                iRemoteViewDelegate.turnOffLight();
                return true;
            } catch (RemoteException unused) {
                o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
                return false;
            }
        }

        public void b(boolean z) {
            this.l = z;
        }

        public void c(boolean z) {
            this.m = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (this.f13517b != null) {
                this.f13517b = null;
            }
            if (this.f13516a != null) {
                this.f13516a = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            IRemoteViewDelegate iRemoteViewDelegate = this.d;
            if (iRemoteViewDelegate == null) {
                return false;
            }
            try {
                return iRemoteViewDelegate.getLightStatus();
            } catch (RemoteException unused) {
                o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z) {
            this.g = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Bundle bundle) {
            this.k = bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(IOnResultCallback iOnResultCallback) {
            this.e = iOnResultCallback;
            IRemoteViewDelegate iRemoteViewDelegate = this.d;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.setOnResultCallback(iOnResultCallback);
                } catch (RemoteException unused) {
                    o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(IOnErrorCallback iOnErrorCallback) {
            IRemoteViewDelegate iRemoteViewDelegate = this.d;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.setOnErrorCallback(iOnErrorCallback);
                } catch (RemoteException unused) {
                    o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
                }
            }
        }

        a(Activity activity, ViewGroup viewGroup, boolean z, int i, Rect rect, int i2) {
            this.f13516a = viewGroup;
            this.f13517b = activity;
            this.f = z;
            this.h = i;
            this.j = rect;
            this.n = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(IOnLightCallback iOnLightCallback) {
            this.i = iOnLightCallback;
            IRemoteViewDelegate iRemoteViewDelegate = this.d;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.setOnLightVisbleCallBack(iOnLightCallback);
                } catch (RemoteException unused) {
                    o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, int i2, Intent intent) {
            HmsScan[] hmsScanArrA;
            if (i2 == -1 && intent != null && i == 4371) {
                try {
                    Bitmap bitmapA = w7.a(RemoteView.this.mContext, intent);
                    if (bitmapA != null && bitmapA.getWidth() * bitmapA.getHeight() <= 52428800) {
                        hmsScanArrA = f.a(RemoteView.this.mContext, bitmapA, new HmsScanAnalyzerOptions.Creator().setPhotoMode(true).create(), this.h);
                    } else {
                        if (bitmapA != null) {
                            o4.e("ScanUtil", "input image is too large:" + bitmapA.getWidth());
                        }
                        hmsScanArrA = new HmsScan[0];
                    }
                    IOnResultCallback iOnResultCallback = this.e;
                    if (iOnResultCallback != null) {
                        iOnResultCallback.onResult(hmsScanArrA);
                    }
                } catch (RemoteException unused) {
                    o4.b(RemoteView.TAG, "RemoteException in remoteview");
                } catch (Error unused2) {
                    o4.b(RemoteView.TAG, "Exception in error");
                } catch (IllegalStateException unused3) {
                    o4.b(RemoteView.TAG, "IllegalStateException in remoteview");
                } catch (Exception unused4) {
                    o4.b(RemoteView.TAG, "Exception in remoteview");
                }
            }
        }

        a(Activity activity, ViewGroup viewGroup, boolean z, int i, Rect rect, int i2, boolean z2, boolean z3) {
            this.f13516a = viewGroup;
            this.f13517b = activity;
            this.f = z;
            this.h = i;
            this.j = rect;
            this.n = i2;
            this.o = z2;
            this.p = z3;
        }
    }

    static class b implements LifecycleDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ViewGroup f13521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f13522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private IRemoteViewDelegate f13523c;

        b(ViewGroup viewGroup, IRemoteViewDelegate iRemoteViewDelegate) {
            this.f13521a = viewGroup;
            this.f13523c = iRemoteViewDelegate;
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onCreate(Bundle bundle) {
            try {
                this.f13523c.onCreate(bundle);
                this.f13522b = (View) ObjectWrapper.unwrap(this.f13523c.getView());
                this.f13521a.removeAllViews();
                this.f13521a.addView(this.f13522b);
            } catch (RemoteException unused) {
                o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return new View(null);
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onDestroy() {
            try {
                this.f13523c.onDestroy();
            } catch (RemoteException unused) {
                o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onDestroyView() {
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onLowMemory() {
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onPause() {
            try {
                this.f13523c.onPause();
            } catch (RemoteException unused) {
                o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onResume() {
            try {
                if (RemoteView.isOnStop) {
                    this.f13523c.onResume();
                } else if (RemoteView.flagForGallery) {
                    this.f13523c.onStart();
                } else {
                    this.f13523c.onResume();
                }
            } catch (RemoteException unused) {
                o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onSaveInstanceState(Bundle bundle) {
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onStart() {
            try {
                this.f13523c.onStart();
            } catch (RemoteException unused) {
                o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onStop() {
            try {
                this.f13523c.onStop();
            } catch (RemoteException unused) {
                o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
            }
        }
    }

    RemoteView(Activity activity, boolean z, int i, Rect rect) {
        super(activity);
        this.mContinuouslyScan = true;
        this.mReturnedBitmap = false;
        this.mOnErrorCallback = null;
        this.mContext = activity;
        this.mRemoteHelper = new a(activity, this, z, i, rect);
    }

    private boolean checkPhotoPermission(Activity activity) {
        if (Build.VERSION.SDK_INT >= 33) {
            return w7.b((Context) activity) || activity.checkPermission("android.permission.READ_MEDIA_IMAGES", Process.myPid(), Process.myUid()) == 0;
        }
        return w7.b((Context) activity) || activity.checkPermission("android.permission.READ_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) == 0;
    }

    private void requestPhotoPermission(Activity activity) {
        if (Build.VERSION.SDK_INT >= 33) {
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, REQUEST_CODE_PHOTO);
        } else {
            activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, REQUEST_CODE_PHOTO);
        }
    }

    private void startActivityForGallery(Activity activity) {
        try {
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            Intent intent = new Intent("android.intent.action.PICK", uri);
            if (w7.g(activity)) {
                if (w7.a(new Intent(), "com.android.gallery3d", activity) != null && w7.a("com.android.gallery3d", activity)) {
                    o4.d(TAG, "Start Gallery:com.android.gallery3d");
                    intent.setPackage("com.android.gallery3d");
                } else if (w7.a(new Intent(), "com.huawei.photos", activity) != null && w7.a("com.huawei.photos", activity)) {
                    intent.setPackage("com.huawei.photos");
                    o4.d(TAG, "Start Gallery:com.huawei.photos");
                }
            }
            intent.setDataAndType(uri, Constants.IMAGE_TYPE);
            flagForGallery = true;
            activity.startActivityForResult(intent, REQUEST_CODE_PHOTO);
        } catch (Exception unused) {
            o4.b(TAG, "startPhotoCode Exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPhotoCode(Activity activity) {
        if (checkPhotoPermission(activity)) {
            startActivityForGallery(activity);
            return;
        }
        o4.d(TAG, "no photo permission");
        if (this.mOnErrorCallback == null) {
            requestPhotoPermission(activity);
        } else {
            o4.b(TAG, "no photo permission, report error2");
            this.mOnErrorCallback.onError(2);
        }
    }

    RemoteView enableReturnBitmap(boolean z) {
        this.mReturnedBitmap = z;
        this.mRemoteHelper.c(z);
        return this;
    }

    public boolean getLightStatus() {
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            return aVar.c();
        }
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.i(TAG, "onActivityResult: ");
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.a(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        Log.i(TAG, "onCreate:");
        Context context = this.mContext;
        if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
            ((Activity) this.mContext).getWindow().setFlags(16777216, 16777216);
        }
        this.mRemoteHelper.onCreate(bundle);
    }

    public final void onDestroy() {
        Log.i(TAG, "onDestroy: ");
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.onDestroy();
            this.mRemoteHelper.b();
            this.mRemoteHelper = null;
        }
    }

    public final void onPause() {
        Log.i(TAG, "onPause: ");
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.onPause();
        }
        a aVar2 = this.mRemoteHelper;
        if (aVar2 != null && flagForGallery) {
            aVar2.onStop();
        }
        isOnStop = false;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr, Activity activity) {
        if (i == 4371 && iArr.length == 1 && iArr[0] == 0) {
            startPhotoCode(activity);
        }
    }

    public final void onResume() {
        Log.i(TAG, "onResume: ");
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.onResume();
        }
        flagForGallery = false;
    }

    public final void onStart() {
        Log.i(TAG, "onStart: ");
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.onStart();
        }
        flagForGallery = false;
    }

    public final void onStop() {
        Log.i(TAG, "onStop: ");
        a aVar = this.mRemoteHelper;
        if (aVar != null && !flagForGallery) {
            aVar.onStop();
        }
        isOnStop = true;
    }

    public void pauseContinuouslyScan() {
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.d();
        }
    }

    public void resumeContinuouslyScan() {
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.e();
        }
    }

    public void selectPictureFromLocalFile() {
        startPhotoCode((Activity) this.mContext);
    }

    RemoteView setContinuouslyScan(boolean z) {
        this.mContinuouslyScan = z;
        return this;
    }

    public void setOnErrorCallback(OnErrorCallback onErrorCallback) {
        this.mOnErrorCallback = onErrorCallback;
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.a(new c(this.mOnErrorCallback));
        }
    }

    public void setOnLightVisibleCallback(OnLightVisibleCallBack onLightVisibleCallBack) {
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.a(new d(onLightVisibleCallBack));
        }
    }

    public void setOnResultCallback(OnResultCallback onResultCallback) {
        a aVar = this.mRemoteHelper;
        if (aVar != null) {
            aVar.a(new e(onResultCallback, this.mContinuouslyScan));
        }
    }

    public boolean switchLight() {
        if (this.mRemoteHelper != null) {
            return !getLightStatus() ? this.mRemoteHelper.g() : this.mRemoteHelper.f();
        }
        return false;
    }

    RemoteView(Activity activity, boolean z, int i, Rect rect, int i2) {
        super(activity);
        this.mContinuouslyScan = true;
        this.mReturnedBitmap = false;
        this.mOnErrorCallback = null;
        this.mContext = activity;
        this.mRemoteHelper = new a(activity, this, z, i, rect, i2);
    }

    RemoteView(Activity activity, boolean z, int i, Rect rect, int i2, boolean z2, boolean z3) {
        super(activity);
        this.mContinuouslyScan = true;
        this.mReturnedBitmap = false;
        this.mOnErrorCallback = null;
        this.mContext = activity;
        this.mRemoteHelper = new a(activity, this, z, i, rect, i2, z2, z3);
    }

    RemoteView(Activity activity, boolean z, int i, Rect rect, boolean z2) {
        super(activity);
        this.mContinuouslyScan = true;
        this.mReturnedBitmap = false;
        this.mOnErrorCallback = null;
        this.mContext = activity;
        a aVar = new a(activity, this, z, i, rect);
        this.mRemoteHelper = aVar;
        aVar.b(z2);
    }

    RemoteView(Activity activity, boolean z, Bundle bundle) {
        super(activity);
        this.mContinuouslyScan = true;
        this.mReturnedBitmap = false;
        this.mOnErrorCallback = null;
        this.mContext = activity;
        a aVar = new a(activity, this, false, 0, null);
        this.mRemoteHelper = aVar;
        aVar.a(z);
        this.mRemoteHelper.a(bundle);
    }
}

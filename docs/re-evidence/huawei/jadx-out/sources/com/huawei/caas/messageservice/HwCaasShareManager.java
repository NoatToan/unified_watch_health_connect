package com.huawei.caas.messageservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.huawei.caassharea.caassharea.caasshareb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes23.dex */
public class HwCaasShareManager {
    private static HwCaasShareManager caasshareb;
    Context caassharea;
    private volatile boolean caassharec;
    private HwCaasShareHandler caasshared;
    private HwCaasShareCallBack caassharee;
    private volatile caasshareb caasshareg;
    private final com.huawei.caassharea.caassharea.caassharea caassharef = new com.huawei.caassharea.caassharea.caassharea.AbstractBinderC0065caassharea() { // from class: com.huawei.caas.messageservice.HwCaasShareManager.1
        @Override // com.huawei.caassharea.caassharea.caassharea
        public final void caassharea(int i, String str) {
            Log.d("HwCaaSShareManager", "retCode: " + i + "Meetime apk version " + str);
            if (i != 0) {
                if (i != 2001) {
                    if (HwCaasShareManager.this.caassharee == null) {
                        return;
                    }
                    Log.i("HwCaaSShareManager", "HwCaaSShareCallback initFail! retCode is " + i);
                } else {
                    Log.i("HwCaaSShareManager", "HwCaaSShareCallback initFail! retCode is " + i);
                    if (HwCaasShareManager.this.caassharee == null) {
                        return;
                    }
                }
                HwCaasShareManager.this.caassharee.initFail(i);
                return;
            }
            Log.i("HwCaaSShareManager", "HwCaaSShareCallback initSuccess!");
            if (HwCaasShareManager.this.caassharee != null) {
                HwCaasShareManager.this.caassharee.initSuccess(HwCaasShareManager.this.caasshared);
            }
        }

        @Override // com.huawei.caassharea.caassharea.caassharea
        public final void caassharea(int i) {
            Log.i("HwCaaSShareManager", "callStateCallback callState : " + i);
            switch (i) {
                case 1000:
                    Log.d("HwCaaSShareManager", "HwCaaSShareCallback SHARE_SUCCESS!");
                    if (HwCaasShareManager.this.caassharee != null) {
                        HwCaasShareManager.this.caassharee.sendResult(HwShareUtils.SendResultEnum.SEND_SUCCESS);
                    }
                    break;
                case 1001:
                    Log.d("HwCaaSShareManager", "HwCaaSShareCallback SHARE_FAIL!");
                    if (HwCaasShareManager.this.caassharee != null) {
                        HwCaasShareManager.this.caassharee.sendResult(HwShareUtils.SendResultEnum.SEND_FAIL);
                    }
                    break;
                case 1002:
                    Log.d("HwCaaSShareManager", "HwCaaSShareCallback SHARE_CANCEL!");
                    if (HwCaasShareManager.this.caassharee != null) {
                        HwCaasShareManager.this.caassharee.sendResult(HwShareUtils.SendResultEnum.SEND_CANCEL);
                    }
                    break;
                default:
                    Log.e("HwCaaSShareManager", "HwCaaSShareCallback error!");
                    break;
            }
        }
    };
    private final ServiceConnection caasshareh = new ServiceConnection() { // from class: com.huawei.caas.messageservice.HwCaasShareManager.2
        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            Log.d("HwCaaSShareManager", "onServiceDisconnected success.");
            if (HwCaasShareManager.this.caassharec) {
                HwCaasShareManager.this.caasshareg = null;
                HwCaasShareManager.this.caassharec = false;
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("HwCaaSShareManager", "onServiceConnected success.");
            try {
                HwCaasShareManager.this.caasshareg = caasshareb.caassharea.caassharea(iBinder);
                HwCaasShareManager.caassharec(HwCaasShareManager.this);
                HwCaasShareManager.caasshared(HwCaasShareManager.this);
                if (HwCaasShareManager.this.caasshareg != null) {
                    HwCaasShareManager.this.caassharec = true;
                }
            } catch (SecurityException unused) {
                HwCaasShareManager.this.caasshareg = null;
                Log.e("HwCaaSShareManager", "bind SecurityException.");
            }
        }
    };
    private boolean caassharei = false;

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    public void release() {
        String str;
        HwCaasShareCallBack hwCaasShareCallBack;
        Log.d("HwCaaSShareManager", "release.");
        Log.i("HwCaaSShareManager", "removeCallback: ");
        try {
            if (this.caasshareg != null) {
                this.caasshareg.caassharea();
            }
        } catch (RemoteException unused) {
            Log.e("HwCaaSShareManager", "removeCallback Exception.");
        }
        Log.i("HwCaaSShareManager", "bindShareService start.");
        Context context = this.caassharea;
        if (context != null) {
            try {
                context.unbindService(this.caasshareh);
            } catch (IllegalArgumentException unused2) {
                str = "IllegalArgumentException.";
                Log.e("HwCaaSShareManager", str);
            } catch (IllegalStateException unused3) {
                str = "IllegalStateException.";
                Log.e("HwCaaSShareManager", str);
            } catch (SecurityException unused4) {
                str = "unbind SecurityException.";
                Log.e("HwCaaSShareManager", str);
            }
            if (this.caassharec) {
                this.caasshareg = null;
                this.caasshared = null;
                this.caassharec = false;
            }
            hwCaasShareCallBack = this.caassharee;
            if (hwCaasShareCallBack != null) {
                hwCaasShareCallBack.releaseSuccess();
                this.caassharee = null;
            }
            this.caassharei = false;
        }
        str = "mContext is null.";
        Log.e("HwCaaSShareManager", str);
        if (this.caassharec) {
            this.caasshareg = null;
            this.caasshared = null;
            this.caassharec = false;
        }
        hwCaasShareCallBack = this.caassharee;
        if (hwCaasShareCallBack != null) {
            hwCaasShareCallBack.releaseSuccess();
            this.caassharee = null;
        }
        this.caassharei = false;
    }

    public void init(Context context, HwCaasShareCallBack hwCaasShareCallBack) {
        String str;
        String str2 = "isBind: false";
        Log.d("HwCaaSShareManager", "init.");
        Log.d("HwCaaSShareManager", "initHandler.");
        if (context == null || hwCaasShareCallBack == null) {
            Log.e("HwCaaSShareManager", "entry parameter is empty or not huawei phone.");
            if (hwCaasShareCallBack != null) {
                hwCaasShareCallBack.initFail(2001);
            }
        } else {
            if (this.caassharei) {
                release();
            }
            Context applicationContext = context.getApplicationContext();
            this.caassharea = applicationContext;
            this.caassharei = true;
            this.caassharee = hwCaasShareCallBack;
            if (this.caasshared == null) {
                this.caasshared = new HwCaasShareHandler(this, applicationContext);
            }
            Log.i("HwCaaSShareManager", "bindShareService start.");
            if (this.caassharea == null) {
                Log.e("HwCaaSShareManager", "mContext is null.");
            } else {
                Intent intent = new Intent();
                intent.setAction("com.huawei.message.service.HwCaasShareService");
                intent.setPackage("com.huawei.meetime");
                try {
                    try {
                        boolean zBindService = this.caassharea.bindService(intent, this.caasshareh, 1);
                        if (!zBindService) {
                            this.caassharee.initFail(2001);
                        }
                        str2 = "isBind: ";
                        Log.i("HwCaaSShareManager", "isBind: " + zBindService);
                    } catch (Throwable th) {
                        this.caassharee.initFail(2001);
                        Log.i("HwCaaSShareManager", str2);
                        throw th;
                    }
                } catch (IllegalStateException unused) {
                    str = "bindService fail, IllegalStateException.";
                    Log.e("HwCaaSShareManager", str);
                    this.caassharee.initFail(2001);
                    Log.i("HwCaaSShareManager", "isBind: false");
                } catch (SecurityException unused2) {
                    str = "bindService fail, SecurityException.";
                    Log.e("HwCaaSShareManager", str);
                    this.caassharee.initFail(2001);
                    Log.i("HwCaaSShareManager", "isBind: false");
                }
            }
        }
        caassharea.caassharea(this);
    }

    protected final int caassharea(int i, HwShareMsgInfo hwShareMsgInfo) {
        String str;
        Bundle bundle;
        Log.d("HwCaaSShareManager", "sendShareInfo.");
        if (hwShareMsgInfo == null || this.caassharea == null) {
            str = "shareInfo: Error ";
        } else {
            if (!hwShareMsgInfo.shareDataCheckArgs()) {
                return 2004;
            }
            if (hwShareMsgInfo == null) {
                Log.e("HwCaaSShareManager", "getShareInfoBundle: Error ");
                bundle = null;
            } else {
                bundle = new Bundle();
                bundle.putInt("ShareType", hwShareMsgInfo.shareType());
                bundle.putString("ThirdAppName", caassharea(this.caassharea));
                bundle.putString("callAppName", this.caassharea.getPackageName());
                Bitmap bitmapCaasshareb = caasshareb(this.caassharea);
                if (bitmapCaasshareb != null) {
                    bundle.putByteArray("ThirdAppIcon", caassharea(bitmapCaasshareb));
                }
                hwShareMsgInfo.shareDataSerialize(bundle);
                bundle.putInt("target_scene", 1);
            }
            if (bundle != null) {
                try {
                    if (i == 1) {
                        bundle.putInt("target_scene", 1);
                        if (this.caasshareg != null) {
                            this.caasshareg.caassharea(hwShareMsgInfo.shareType());
                        }
                    } else {
                        if (i != 2) {
                            Log.e("HwCaaSShareManager", "Only small circles and chatting are supported.");
                            return 2005;
                        }
                        bundle.putInt("target_scene", 2);
                        if (this.caasshareg != null) {
                            this.caasshareg.caassharea(hwShareMsgInfo.shareType());
                        }
                    }
                } catch (RemoteException unused) {
                    Log.e("HwCaaSShareManager", "queryCallAbility exception.");
                }
                Intent intent = new Intent();
                intent.putExtra("bundle", bundle);
                intent.setClass(this.caassharea, JumpActivity.class);
                intent.setFlags(268435456);
                this.caassharea.startActivity(intent);
                return 0;
            }
            str = "bundle: Error ";
        }
        Log.e("HwCaaSShareManager", str);
        return 2003;
    }

    public static HwCaasShareManager getInstance() {
        HwCaasShareManager hwCaasShareManager;
        synchronized (HwCaasShareManager.class) {
            Log.d("HwCaaSShareManager", "getInstance.");
            if (caasshareb == null) {
                caasshareb = new HwCaasShareManager();
            }
            hwCaasShareManager = caasshareb;
        }
        return hwCaasShareManager;
    }

    static /* synthetic */ void caasshared(HwCaasShareManager hwCaasShareManager) {
        Bundle bundle;
        Log.i("HwCaaSShareManager", "sendAppInfoToService.");
        if (hwCaasShareManager.caassharea == null) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle.putString("callAppId", caassharec(hwCaasShareManager.caassharea));
            bundle.putString("sdkVersion", "1.0.0.500");
            bundle.putString("callAppName", hwCaasShareManager.caassharea.getPackageName());
        }
        try {
            if (hwCaasShareManager.caasshareg != null) {
                hwCaasShareManager.caasshareg.caasshareb(bundle);
            }
        } catch (RemoteException unused) {
            Log.e("HwCaaSShareManager", "sendAppInfoToService exception.");
        }
    }

    static /* synthetic */ void caassharec(HwCaasShareManager hwCaasShareManager) {
        Log.i("HwCaaSShareManager", "registerCallback: ");
        try {
            if (hwCaasShareManager.caasshareg != null) {
                hwCaasShareManager.caasshareg.caassharea(hwCaasShareManager.caassharef);
            }
        } catch (RemoteException unused) {
            Log.i("HwCaaSShareManager", "Error why why: ");
        }
    }

    private static String caassharec(Context context) {
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        String strValueOf = "";
        if (packageManager == null) {
            Log.e("HwCaaSShareManager", "getAppId error.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null && (obj = applicationInfo.metaData.get("com.huawei.hms.client.appid")) != null) {
                strValueOf = String.valueOf(obj);
                if (strValueOf.startsWith("appid=")) {
                    strValueOf = strValueOf.substring(6);
                }
            }
            return strValueOf;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("HwCaaSShareManager", "NameNotFoundException.");
            return "";
        } finally {
            Log.i("HwCaaSShareManager", "appid ");
        }
    }

    private Bitmap caasshareb(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        synchronized (this) {
            try {
                packageManager = context.getPackageManager();
                if (packageManager != null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("HwCaaSShareManager", "name not found exception");
                        applicationInfo = null;
                    }
                } else {
                    applicationInfo = null;
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                packageManager = null;
            }
            if (packageManager != null && applicationInfo != null) {
                Drawable applicationIcon = packageManager.getApplicationIcon(applicationInfo);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                return bitmapCreateBitmap;
            }
            Log.e("HwCaaSShareManager", "getAppIcon error");
            return null;
        }
    }

    private static byte[] caassharea(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmap.recycle();
            try {
                return byteArray;
            } catch (IOException unused) {
                return byteArray;
            }
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused2) {
                Log.e("HwCaaSShareManager", "bmpToByteArray error");
            }
        }
    }

    private static String caassharea(Context context) {
        if (context == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager != null ? String.valueOf(packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128))) : "";
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("HwCaaSShareManager", "getAppName error");
            return "";
        }
    }

    private HwCaasShareManager() {
    }
}

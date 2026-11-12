package com.huawei.hms.hmsscankit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.hmsscankit.api.IRemoteCreator;
import com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator;
import com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate;
import com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate;
import com.huawei.hms.ml.scan.HmsBuildBitmapOption;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.huawei.hms.ml.scan.HmsScanFrame;
import com.huawei.hms.ml.scan.HmsScanResult;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.s6;
import com.huawei.hms.scankit.p.u6;
import com.huawei.hms.scankit.p.w3;
import com.huawei.hms.scankit.p.w7;
import com.huawei.hms.scankit.p.x3;
import com.huawei.hms.scankit.p.y3;
import com.huawei.hms.scankit.p.y6;
import com.huawei.operation.utils.Constants;
import com.huawei.wearengine.sensor.DataResult;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile x3 f13539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile IRemoteDecoderDelegate f13540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile w3 f13541c;
    private static volatile IRemoteFrameDecoderDelegate d;

    class a extends SimpleDateFormat {
        a(String str) {
            super(str);
            setTimeZone(TimeZone.getTimeZone(DataResult.UTC));
        }
    }

    public static void a(s6[] s6VarArr) {
        if (s6VarArr.length == 1 && a(s6VarArr[0].j())) {
            g.f13543b = true;
        } else {
            g.f13543b = false;
        }
    }

    private static boolean a(u6[] u6VarArr) {
        if (u6VarArr == null || u6VarArr.length == 0) {
            return false;
        }
        for (u6 u6Var : u6VarArr) {
            if (u6Var.b() + 2.0f > 1.0E-4d && u6Var.c() + 2.0f > 1.0E-4d) {
                return false;
            }
        }
        return true;
    }

    static HmsScan[] a(Context context, Bitmap bitmap, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        return a(context, bitmap, hmsScanAnalyzerOptions, hmsScanAnalyzerOptions != null ? hmsScanAnalyzerOptions.mode : HmsScanBase.ALL_SCAN_TYPE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027 A[Catch: RemoteException -> 0x009d, TryCatch #0 {RemoteException -> 0x009d, blocks: (B:12:0x0020, B:14:0x0027, B:15:0x003a, B:17:0x0075, B:23:0x008b, B:22:0x0088, B:20:0x0081), top: B:28:0x0020, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0075 A[Catch: RemoteException -> 0x009d, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x009d, blocks: (B:12:0x0020, B:14:0x0027, B:15:0x003a, B:17:0x0075, B:23:0x008b, B:22:0x0088, B:20:0x0081), top: B:28:0x0020, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x009b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    static HmsScan[] a(Context context, Bitmap bitmap, HmsScanAnalyzerOptions hmsScanAnalyzerOptions, int i) {
        Bundle bundle;
        HmsScan[] hmsScanArrDecodeWithBitmap;
        IRemoteCreator iRemoteCreatorC;
        HmsScan[] hmsScanArr = new HmsScan[0];
        if (f13540b == null) {
            IRemoteCreator iRemoteCreatorC2 = g.c(context);
            if (iRemoteCreatorC2 != null) {
                try {
                    f13540b = iRemoteCreatorC2.newRemoteDecoderDelegate();
                } catch (RemoteException unused) {
                    o4.b("ScankitRemoteDecoder", "RemoteException");
                }
                if (f13540b != null) {
                    return hmsScanArr;
                }
                bundle = new Bundle();
                if (hmsScanAnalyzerOptions != null) {
                    bundle.putInt(DetailRect.FORMAT_FLAG, i);
                    bundle.putBoolean(DetailRect.PHOTO_MODE, hmsScanAnalyzerOptions.photoMode);
                    bundle.putBoolean(DetailRect.PARSE_RESULT, hmsScanAnalyzerOptions.parseResult);
                }
                bundle.putInt(DetailRect.TYPE_TRANS, 3);
                bundle.putString(DetailRect.CP_PACKAGE, y3.b(context));
                bundle.putBoolean(DetailRect.SUPPORT_ROLLBACK, g.f13544c);
                bundle.putBoolean(DetailRect.USE_APK, g.f13542a);
                bundle.putAll(y3.a(context));
                hmsScanArrDecodeWithBitmap = f13540b.decodeWithBitmap(ObjectWrapper.wrap(bitmap), ObjectWrapper.wrap(bundle));
                a(hmsScanArrDecodeWithBitmap);
                if (g.a()) {
                    o4.d("ScankitRemoteDecoder", "iRemoteDecoderDelegate decodeWithBitmap rollback");
                    iRemoteCreatorC = g.c(context);
                    if (iRemoteCreatorC != null) {
                        f13540b = iRemoteCreatorC.newRemoteDecoderDelegate();
                        hmsScanArrDecodeWithBitmap = f13540b.decodeWithBitmap(ObjectWrapper.wrap(bitmap), ObjectWrapper.wrap(bundle));
                    }
                }
                if (hmsScanArrDecodeWithBitmap != null) {
                    return hmsScanArrDecodeWithBitmap;
                }
                return hmsScanArr;
            }
        } else {
            if (f13540b != null) {
                return hmsScanArr;
            }
            try {
                bundle = new Bundle();
                if (hmsScanAnalyzerOptions != null) {
                    bundle.putInt(DetailRect.FORMAT_FLAG, i);
                    bundle.putBoolean(DetailRect.PHOTO_MODE, hmsScanAnalyzerOptions.photoMode);
                    bundle.putBoolean(DetailRect.PARSE_RESULT, hmsScanAnalyzerOptions.parseResult);
                }
                bundle.putInt(DetailRect.TYPE_TRANS, 3);
                bundle.putString(DetailRect.CP_PACKAGE, y3.b(context));
                bundle.putBoolean(DetailRect.SUPPORT_ROLLBACK, g.f13544c);
                bundle.putBoolean(DetailRect.USE_APK, g.f13542a);
                bundle.putAll(y3.a(context));
                hmsScanArrDecodeWithBitmap = f13540b.decodeWithBitmap(ObjectWrapper.wrap(bitmap), ObjectWrapper.wrap(bundle));
                a(hmsScanArrDecodeWithBitmap);
                if (g.a()) {
                    o4.d("ScankitRemoteDecoder", "iRemoteDecoderDelegate decodeWithBitmap rollback");
                    iRemoteCreatorC = g.c(context);
                    if (iRemoteCreatorC != null) {
                        try {
                            f13540b = iRemoteCreatorC.newRemoteDecoderDelegate();
                        } catch (RemoteException unused2) {
                            o4.b("ScankitRemoteDecoder", "RemoteException");
                        }
                        hmsScanArrDecodeWithBitmap = f13540b.decodeWithBitmap(ObjectWrapper.wrap(bitmap), ObjectWrapper.wrap(bundle));
                    }
                }
                if (hmsScanArrDecodeWithBitmap != null) {
                    return hmsScanArrDecodeWithBitmap;
                }
                return hmsScanArr;
            } catch (RemoteException unused3) {
                o4.b("ScankitRemoteDecoder", "RemoteException");
                return hmsScanArr;
            }
        }
        return hmsScanArr;
    }

    public static void a(HmsScan[] hmsScanArr) {
        if (hmsScanArr.length == 1 && a(hmsScanArr[0].getCornerPoints())) {
            g.f13543b = true;
        } else {
            g.f13543b = false;
        }
    }

    private static boolean a(Point[] pointArr) {
        if (pointArr == null || pointArr.length == 0) {
            return false;
        }
        for (Point point : pointArr) {
            if (point.x != -2 && point.y != -2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f A[Catch: RemoteException -> 0x00ab, TryCatch #1 {RemoteException -> 0x00ab, blocks: (B:12:0x0028, B:14:0x002f, B:15:0x0044, B:17:0x0074, B:19:0x007a, B:21:0x0087, B:27:0x009d, B:26:0x009a, B:24:0x0093), top: B:34:0x0028, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0087 A[Catch: RemoteException -> 0x00ab, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00ab, blocks: (B:12:0x0028, B:14:0x002f, B:15:0x0044, B:17:0x0074, B:19:0x007a, B:21:0x0087, B:27:0x009d, B:26:0x009a, B:24:0x0093), top: B:34:0x0028, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    static HmsScanResult a(Context context, byte[] bArr, int i, int i2, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        Bundle bundle;
        HmsScanResult hmsScanResultDecodeWithBuffer;
        IRemoteCreator iRemoteCreatorC;
        HmsScanResult hmsScanResult = new HmsScanResult(4096, new HmsScan[0]);
        if (f13540b == null) {
            IRemoteCreator iRemoteCreatorC2 = g.c(context);
            if (iRemoteCreatorC2 != null) {
                try {
                    f13540b = iRemoteCreatorC2.newRemoteDecoderDelegate();
                } catch (RemoteException unused) {
                    o4.b("ScankitRemoteDecoder", "RemoteException");
                }
                if (f13540b != null) {
                    return hmsScanResult;
                }
                bundle = new Bundle();
                if (hmsScanAnalyzerOptions != null) {
                    bundle.putInt(DetailRect.FORMAT_FLAG, hmsScanAnalyzerOptions.mode);
                    bundle.putBoolean(DetailRect.PHOTO_MODE, hmsScanAnalyzerOptions.photoMode);
                    bundle.putBoolean(DetailRect.PARSE_RESULT, hmsScanAnalyzerOptions.parseResult);
                }
                bundle.putBoolean(DetailRect.SUPPORT_ROLLBACK, g.f13544c);
                bundle.putBoolean(DetailRect.USE_APK, g.f13542a);
                bundle.putInt(DetailRect.TYPE_TRANS, 3);
                bundle.putString(DetailRect.CP_PACKAGE, y3.b(context));
                bundle.putAll(y3.a(context));
                hmsScanResultDecodeWithBuffer = f13540b.decodeWithBuffer(bArr, i, i2, ObjectWrapper.wrap(bundle));
                if (hmsScanResultDecodeWithBuffer != null) {
                    a(hmsScanResultDecodeWithBuffer.getHmsScans());
                    if (g.a()) {
                        o4.d("ScankitRemoteDecoder", "iRemoteDecoderDelegate decodeWithBuffer rollback");
                        iRemoteCreatorC = g.c(context);
                        if (iRemoteCreatorC != null) {
                            f13540b = iRemoteCreatorC.newRemoteDecoderDelegate();
                            hmsScanResultDecodeWithBuffer = f13540b.decodeWithBuffer(bArr, i, i2, ObjectWrapper.wrap(bundle));
                        }
                    }
                }
                if (hmsScanResultDecodeWithBuffer != null) {
                    return hmsScanResultDecodeWithBuffer;
                }
                return hmsScanResult;
            }
        } else {
            if (f13540b != null) {
                return hmsScanResult;
            }
            try {
                bundle = new Bundle();
                if (hmsScanAnalyzerOptions != null) {
                    bundle.putInt(DetailRect.FORMAT_FLAG, hmsScanAnalyzerOptions.mode);
                    bundle.putBoolean(DetailRect.PHOTO_MODE, hmsScanAnalyzerOptions.photoMode);
                    bundle.putBoolean(DetailRect.PARSE_RESULT, hmsScanAnalyzerOptions.parseResult);
                }
                bundle.putBoolean(DetailRect.SUPPORT_ROLLBACK, g.f13544c);
                bundle.putBoolean(DetailRect.USE_APK, g.f13542a);
                bundle.putInt(DetailRect.TYPE_TRANS, 3);
                bundle.putString(DetailRect.CP_PACKAGE, y3.b(context));
                bundle.putAll(y3.a(context));
                hmsScanResultDecodeWithBuffer = f13540b.decodeWithBuffer(bArr, i, i2, ObjectWrapper.wrap(bundle));
                if (hmsScanResultDecodeWithBuffer != null && hmsScanResultDecodeWithBuffer.getHmsScans() != null) {
                    a(hmsScanResultDecodeWithBuffer.getHmsScans());
                    if (g.a()) {
                        o4.d("ScankitRemoteDecoder", "iRemoteDecoderDelegate decodeWithBuffer rollback");
                        iRemoteCreatorC = g.c(context);
                        if (iRemoteCreatorC != null) {
                            try {
                                f13540b = iRemoteCreatorC.newRemoteDecoderDelegate();
                            } catch (RemoteException unused2) {
                                o4.b("ScankitRemoteDecoder", "RemoteException");
                            }
                            hmsScanResultDecodeWithBuffer = f13540b.decodeWithBuffer(bArr, i, i2, ObjectWrapper.wrap(bundle));
                        }
                    }
                }
                if (hmsScanResultDecodeWithBuffer != null) {
                    return hmsScanResultDecodeWithBuffer;
                }
                return hmsScanResult;
            } catch (RemoteException unused3) {
                o4.b("ScankitRemoteDecoder", "RemoteException");
                return hmsScanResult;
            }
        }
        return hmsScanResult;
    }

    static HmsScanResult a(Context context, HmsScanFrame hmsScanFrame, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        w3.c cVarA;
        HmsScan hmsScan;
        new HmsScanResult(4096, new HmsScan[0]);
        Log.d("Scankit", "use decodeCompatibility");
        if (d == null) {
            Log.d("ScankitRemoteDecoder", "use remote decoder");
            a(context);
        }
        if (d != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putParcelable("Screen", new Point(hmsScanFrame.getWidth(), hmsScanFrame.getHeight()));
                bundle.putParcelable("Rect", new Rect(0, 0, hmsScanFrame.getWidth(), hmsScanFrame.getHeight()));
                bundle.putBoolean(DetailRect.SUPPORT_ROLLBACK, g.f13544c);
                bundle.putBoolean(DetailRect.USE_APK, g.f13542a);
                if (f13541c == null) {
                    try {
                        try {
                            f13541c = new w3(bundle, DetailRect.PHOTO_MODE);
                            f13541c.a("single");
                            cVarA = f13541c.a(false, hmsScanFrame.getHeight() * hmsScanFrame.getWidth());
                        } catch (RuntimeException unused) {
                            o4.b("ScankitRemoteDecoder", "RuntimeException");
                            cVarA = null;
                        }
                    } catch (Exception unused2) {
                        o4.b("ScankitRemoteDecoder", "Exception");
                        cVarA = null;
                    }
                } else {
                    cVarA = null;
                }
                int iB = hmsScanAnalyzerOptions != null ? w7.b(hmsScanAnalyzerOptions.mode) : HmsScanBase.ALL_SCAN_TYPE;
                s6[] s6VarArrDecode = d.decode(hmsScanFrame.getYuvImage().getYuvData(), hmsScanFrame.getWidth(), hmsScanFrame.getHeight(), 0, iB, ObjectWrapper.wrap(bundle));
                a(s6VarArrDecode);
                if (g.a()) {
                    o4.b("ScankitRemoteDecoder", "iRemoteFrameDecoderDelegate decode rollback");
                    a(context);
                    s6VarArrDecode = d.decode(hmsScanFrame.getYuvImage().getYuvData(), hmsScanFrame.getWidth(), hmsScanFrame.getHeight(), 0, iB, ObjectWrapper.wrap(bundle));
                }
                HmsScan[] hmsScanArrA = y6.a(s6VarArrDecode);
                if (f13541c != null) {
                    f13541c.a(hmsScanArrA, cVarA);
                }
                if (hmsScanArrA.length != 0 && (hmsScan = hmsScanArrA[0]) != null && hmsScan.getOriginalValue() != null && hmsScanArrA[0].getOriginalValue().length() != 0) {
                    return new HmsScanResult(0, hmsScanArrA);
                }
                return new HmsScanResult(4096, hmsScanArrA);
            } catch (RemoteException unused3) {
                Log.e("Scankit", "RemoteException");
            }
        }
        return new HmsScanResult(4096, new HmsScan[0]);
    }

    private static void a(Bundle bundle) {
        if (DynamicModuleInitializer.getContext() == null) {
            try {
                g.b(AGConnectInstance.getInstance().getContext());
            } catch (ClassNotFoundException unused) {
                o4.b("ScankitRemoteDecoder", "buildBitmapLog ClassNotFoundException");
            } catch (IllegalAccessException unused2) {
                o4.b("ScankitRemoteDecoder", "buildBitmapLog IllegalAccessException");
            } catch (Exception unused3) {
                o4.b("ScankitRemoteDecoder", "buildBitmapLog Exception");
            } catch (NoClassDefFoundError unused4) {
                o4.b("ScankitRemoteDecoder", "buildBitmapLog NoClassDefFoundError");
                return;
            } catch (NoSuchMethodException unused5) {
                o4.b("ScankitRemoteDecoder", "buildBitmapLog NoSuchMethodException");
            } catch (InvocationTargetException unused6) {
                o4.b("ScankitRemoteDecoder", "buildBitmapLog InvocationTargetException");
            }
        }
        if (f13539a == null) {
            try {
                f13539a = new x3();
                f13539a.c(bundle);
            } catch (RuntimeException unused7) {
                o4.b("ScankitRemoteDecoder", "buildBitmapLog RuntimeException");
            } catch (Exception unused8) {
                o4.b("ScankitRemoteDecoder", "buildBitmapLog Exception");
            }
        }
    }

    public static Bundle a(String str, int i, int i2, int i3, HmsBuildBitmapOption hmsBuildBitmapOption) {
        Bundle bundle = new Bundle();
        bundle.putInt("contentLength", str == null ? -1 : str.length());
        bundle.putInt("scanType", i);
        bundle.putInt("reqWidth", i2);
        bundle.putInt("reqHeight", i3);
        bundle.putString("buildBitmapOption", hmsBuildBitmapOption == null ? Constants.NULL : hmsBuildBitmapOption.toString());
        bundle.putString("apiName", "BuildBitmap");
        bundle.putLong("callTime", System.currentTimeMillis());
        bundle.putString("transId", UUID.randomUUID().toString());
        return bundle;
    }

    public static void a(int i, Bitmap bitmap, Bundle bundle) {
        if (bundle != null) {
            bundle.putInt("result", i);
            bundle.putInt("outputWidth", bitmap == null ? -1 : bitmap.getWidth());
            bundle.putInt("outputHeight", bitmap != null ? bitmap.getHeight() : -1);
            long j = bundle.getLong("callTime");
            bundle.putLong(WiseOpenHianalyticsData.UNION_COSTTIME, System.currentTimeMillis() - j);
            bundle.putString("callTime", new a("yyyyMMddHHmmss.SSS").format(Long.valueOf(j)));
            a(bundle);
        }
    }

    static void a(Context context) {
        Object objNewInstance;
        try {
            try {
                context = g.e(context);
            } catch (NoSuchMethodException | InvocationTargetException unused) {
            }
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.hms.scankit.DecoderCreator");
            context.getClassLoader().loadClass("com.huawei.hms.scankit.aiscan.common.BarcodeFormat");
            objNewInstance = clsLoadClass.newInstance();
        } catch (ClassNotFoundException unused2) {
            o4.a("ScankitRemoteDecoder", "ClassNotFoundException");
            objNewInstance = null;
        } catch (IllegalAccessException unused3) {
            o4.a("ScankitRemoteDecoder", "IllegalAccessException");
            objNewInstance = null;
        } catch (InstantiationException unused4) {
            o4.a("ScankitRemoteDecoder", "InstantiationException");
            objNewInstance = null;
        }
        if (objNewInstance instanceof IBinder) {
            try {
                d = IRemoteDecoderCreator.Stub.asInterface((IBinder) objNewInstance).newRemoteFrameDecoderDelegate();
            } catch (Exception unused5) {
                o4.a("ScankitRemoteDecoder", "remoteception");
            }
        }
    }
}

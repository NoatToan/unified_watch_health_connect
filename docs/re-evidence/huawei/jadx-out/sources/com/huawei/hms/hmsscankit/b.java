package com.huawei.hms.hmsscankit;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.api.IRemoteCreator;
import com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.huawei.hms.ml.scan.HmsScanFrame;
import com.huawei.hms.mlsdk.common.MLFrame;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.y3;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile IRemoteHmsDecoderDelegate f13532a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f13533b = "b";

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[Catch: RemoteException -> 0x0103, TryCatch #1 {RemoteException -> 0x0103, blocks: (B:12:0x0028, B:14:0x002e, B:16:0x0049, B:18:0x0050, B:20:0x0054, B:21:0x0060, B:23:0x0088, B:25:0x00b2, B:27:0x00bb, B:33:0x00ce, B:35:0x00d9, B:37:0x00ed, B:32:0x00c9, B:24:0x00a0, B:15:0x0044, B:30:0x00c2), top: B:45:0x0028, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[Catch: RemoteException -> 0x0103, TryCatch #1 {RemoteException -> 0x0103, blocks: (B:12:0x0028, B:14:0x002e, B:16:0x0049, B:18:0x0050, B:20:0x0054, B:21:0x0060, B:23:0x0088, B:25:0x00b2, B:27:0x00bb, B:33:0x00ce, B:35:0x00d9, B:37:0x00ed, B:32:0x00c9, B:24:0x00a0, B:15:0x0044, B:30:0x00c2), top: B:45:0x0028, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0088 A[Catch: RemoteException -> 0x0103, TryCatch #1 {RemoteException -> 0x0103, blocks: (B:12:0x0028, B:14:0x002e, B:16:0x0049, B:18:0x0050, B:20:0x0054, B:21:0x0060, B:23:0x0088, B:25:0x00b2, B:27:0x00bb, B:33:0x00ce, B:35:0x00d9, B:37:0x00ed, B:32:0x00c9, B:24:0x00a0, B:15:0x0044, B:30:0x00c2), top: B:45:0x0028, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a0 A[Catch: RemoteException -> 0x0103, TryCatch #1 {RemoteException -> 0x0103, blocks: (B:12:0x0028, B:14:0x002e, B:16:0x0049, B:18:0x0050, B:20:0x0054, B:21:0x0060, B:23:0x0088, B:25:0x00b2, B:27:0x00bb, B:33:0x00ce, B:35:0x00d9, B:37:0x00ed, B:32:0x00c9, B:24:0x00a0, B:15:0x0044, B:30:0x00c2), top: B:45:0x0028, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00bb A[Catch: RemoteException -> 0x0103, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x0103, blocks: (B:12:0x0028, B:14:0x002e, B:16:0x0049, B:18:0x0050, B:20:0x0054, B:21:0x0060, B:23:0x0088, B:25:0x00b2, B:27:0x00bb, B:33:0x00ce, B:35:0x00d9, B:37:0x00ed, B:32:0x00c9, B:24:0x00a0, B:15:0x0044, B:30:0x00c2), top: B:45:0x0028, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d9 A[Catch: RemoteException -> 0x0103, TryCatch #1 {RemoteException -> 0x0103, blocks: (B:12:0x0028, B:14:0x002e, B:16:0x0049, B:18:0x0050, B:20:0x0054, B:21:0x0060, B:23:0x0088, B:25:0x00b2, B:27:0x00bb, B:33:0x00ce, B:35:0x00d9, B:37:0x00ed, B:32:0x00c9, B:24:0x00a0, B:15:0x0044, B:30:0x00c2), top: B:45:0x0028, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ed A[Catch: RemoteException -> 0x0103, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x0103, blocks: (B:12:0x0028, B:14:0x002e, B:16:0x0049, B:18:0x0050, B:20:0x0054, B:21:0x0060, B:23:0x0088, B:25:0x00b2, B:27:0x00bb, B:33:0x00ce, B:35:0x00d9, B:37:0x00ed, B:32:0x00c9, B:24:0x00a0, B:15:0x0044, B:30:0x00c2), top: B:45:0x0028, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0100 A[DONT_INVERT, PHI: r10
      0x0100: PHI (r10v11 com.huawei.hms.ml.scan.HmsScan[]) = (r10v10 com.huawei.hms.ml.scan.HmsScan[]), (r10v13 com.huawei.hms.ml.scan.HmsScan[]) binds: [B:26:0x00b9, B:36:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static HmsScan[] a(Context context, MLFrame mLFrame, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        DetailRect detailRect;
        Bundle bundle;
        HmsScan[] hmsScanArrDetectWithByteBuffer;
        IRemoteCreator iRemoteCreatorC;
        HmsScan[] hmsScanArrDetectWithByteBuffer2;
        int i;
        o4.d("scankit mul", "start detectForHmsDector");
        HmsScan[] hmsScanArr = new HmsScan[0];
        if (f13532a == null) {
            IRemoteCreator iRemoteCreatorC2 = g.c(context);
            if (iRemoteCreatorC2 != null) {
                try {
                    f13532a = iRemoteCreatorC2.newRemoteHmsDecoderDelegate();
                } catch (RemoteException unused) {
                    o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
                }
                if (f13532a != null) {
                    if (mLFrame.acquireProperty() != null) {
                        detailRect = new DetailRect(mLFrame.acquireProperty().getWidth(), mLFrame.acquireProperty().getHeight());
                    } else {
                        detailRect = new DetailRect();
                    }
                    bundle = new Bundle();
                    if (hmsScanAnalyzerOptions != null) {
                        bundle.putInt(DetailRect.FORMAT_FLAG, i);
                        bundle.putBoolean(DetailRect.PHOTO_MODE, hmsScanAnalyzerOptions.photoMode);
                    }
                    bundle.putBoolean(DetailRect.PARSE_RESULT, hmsScanAnalyzerOptions.parseResult);
                    bundle.putInt(DetailRect.TYPE_TRANS, 3);
                    bundle.putBoolean(DetailRect.SUPPORT_ROLLBACK, g.f13544c);
                    bundle.putBoolean(DetailRect.USE_APK, g.f13542a);
                    bundle.putAll(y3.a(context));
                    if (mLFrame.readBitmap() != null) {
                        o4.d("scankit mul", "end detectForHmsDector");
                        hmsScanArrDetectWithByteBuffer = f13532a.decodeInBitmap(detailRect, ObjectWrapper.wrap(mLFrame.readBitmap()), ObjectWrapper.wrap(bundle));
                    } else {
                        hmsScanArrDetectWithByteBuffer = f13532a.detectWithByteBuffer(detailRect, ObjectWrapper.wrap(mLFrame.acquireGrayByteBuffer()), ObjectWrapper.wrap(bundle));
                    }
                    f.a(hmsScanArrDetectWithByteBuffer);
                    if (!g.a()) {
                        iRemoteCreatorC = g.c(context);
                        if (iRemoteCreatorC != null) {
                            f13532a = iRemoteCreatorC.newRemoteHmsDecoderDelegate();
                            o4.d("scankit mul", "iRemoteDecoderDelegate rollback");
                            if (mLFrame.readBitmap() != null) {
                                hmsScanArrDetectWithByteBuffer2 = f13532a.decodeInBitmap(detailRect, ObjectWrapper.wrap(mLFrame.readBitmap()), ObjectWrapper.wrap(bundle));
                            } else {
                                hmsScanArrDetectWithByteBuffer2 = f13532a.detectWithByteBuffer(detailRect, ObjectWrapper.wrap(mLFrame.acquireGrayByteBuffer()), ObjectWrapper.wrap(bundle));
                            }
                            hmsScanArrDetectWithByteBuffer = hmsScanArrDetectWithByteBuffer2;
                            if (hmsScanArrDetectWithByteBuffer != null) {
                                return hmsScanArrDetectWithByteBuffer;
                            }
                        }
                    } else if (hmsScanArrDetectWithByteBuffer != null) {
                        return hmsScanArrDetectWithByteBuffer;
                    }
                }
            }
        } else if (f13532a != null) {
            try {
                if (mLFrame.acquireProperty() != null) {
                    detailRect = new DetailRect(mLFrame.acquireProperty().getWidth(), mLFrame.acquireProperty().getHeight());
                } else {
                    detailRect = new DetailRect();
                }
                bundle = new Bundle();
                if (hmsScanAnalyzerOptions != null && (i = hmsScanAnalyzerOptions.mode) != 0) {
                    bundle.putInt(DetailRect.FORMAT_FLAG, i);
                    bundle.putBoolean(DetailRect.PHOTO_MODE, hmsScanAnalyzerOptions.photoMode);
                }
                bundle.putBoolean(DetailRect.PARSE_RESULT, hmsScanAnalyzerOptions.parseResult);
                bundle.putInt(DetailRect.TYPE_TRANS, 3);
                bundle.putBoolean(DetailRect.SUPPORT_ROLLBACK, g.f13544c);
                bundle.putBoolean(DetailRect.USE_APK, g.f13542a);
                bundle.putAll(y3.a(context));
                if (mLFrame.readBitmap() != null) {
                    o4.d("scankit mul", "end detectForHmsDector");
                    hmsScanArrDetectWithByteBuffer = f13532a.decodeInBitmap(detailRect, ObjectWrapper.wrap(mLFrame.readBitmap()), ObjectWrapper.wrap(bundle));
                } else {
                    hmsScanArrDetectWithByteBuffer = f13532a.detectWithByteBuffer(detailRect, ObjectWrapper.wrap(mLFrame.acquireGrayByteBuffer()), ObjectWrapper.wrap(bundle));
                }
                f.a(hmsScanArrDetectWithByteBuffer);
                if (!g.a()) {
                    iRemoteCreatorC = g.c(context);
                    if (iRemoteCreatorC != null) {
                        try {
                            f13532a = iRemoteCreatorC.newRemoteHmsDecoderDelegate();
                        } catch (RemoteException unused2) {
                            o4.b(f13533b, "RemoteException");
                        }
                        o4.d("scankit mul", "iRemoteDecoderDelegate rollback");
                        if (mLFrame.readBitmap() != null) {
                            hmsScanArrDetectWithByteBuffer2 = f13532a.decodeInBitmap(detailRect, ObjectWrapper.wrap(mLFrame.readBitmap()), ObjectWrapper.wrap(bundle));
                        } else {
                            hmsScanArrDetectWithByteBuffer2 = f13532a.detectWithByteBuffer(detailRect, ObjectWrapper.wrap(mLFrame.acquireGrayByteBuffer()), ObjectWrapper.wrap(bundle));
                        }
                        hmsScanArrDetectWithByteBuffer = hmsScanArrDetectWithByteBuffer2;
                        if (hmsScanArrDetectWithByteBuffer != null) {
                            return hmsScanArrDetectWithByteBuffer;
                        }
                    }
                } else if (hmsScanArrDetectWithByteBuffer != null) {
                    return hmsScanArrDetectWithByteBuffer;
                }
            } catch (RemoteException unused3) {
                o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
            }
        }
        return hmsScanArr;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c A[Catch: RemoteException -> 0x010c, TryCatch #1 {RemoteException -> 0x010c, blocks: (B:12:0x0028, B:14:0x003c, B:15:0x0051, B:17:0x0081, B:19:0x00b3, B:21:0x00bc, B:27:0x00cf, B:29:0x00da, B:31:0x00ee, B:26:0x00ca, B:18:0x0099, B:24:0x00c3), top: B:39:0x0028, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0081 A[Catch: RemoteException -> 0x010c, TryCatch #1 {RemoteException -> 0x010c, blocks: (B:12:0x0028, B:14:0x003c, B:15:0x0051, B:17:0x0081, B:19:0x00b3, B:21:0x00bc, B:27:0x00cf, B:29:0x00da, B:31:0x00ee, B:26:0x00ca, B:18:0x0099, B:24:0x00c3), top: B:39:0x0028, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0099 A[Catch: RemoteException -> 0x010c, TryCatch #1 {RemoteException -> 0x010c, blocks: (B:12:0x0028, B:14:0x003c, B:15:0x0051, B:17:0x0081, B:19:0x00b3, B:21:0x00bc, B:27:0x00cf, B:29:0x00da, B:31:0x00ee, B:26:0x00ca, B:18:0x0099, B:24:0x00c3), top: B:39:0x0028, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x00bc A[Catch: RemoteException -> 0x010c, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x010c, blocks: (B:12:0x0028, B:14:0x003c, B:15:0x0051, B:17:0x0081, B:19:0x00b3, B:21:0x00bc, B:27:0x00cf, B:29:0x00da, B:31:0x00ee, B:26:0x00ca, B:18:0x0099, B:24:0x00c3), top: B:39:0x0028, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00da A[Catch: RemoteException -> 0x010c, TryCatch #1 {RemoteException -> 0x010c, blocks: (B:12:0x0028, B:14:0x003c, B:15:0x0051, B:17:0x0081, B:19:0x00b3, B:21:0x00bc, B:27:0x00cf, B:29:0x00da, B:31:0x00ee, B:26:0x00ca, B:18:0x0099, B:24:0x00c3), top: B:39:0x0028, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ee A[Catch: RemoteException -> 0x010c, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x010c, blocks: (B:12:0x0028, B:14:0x003c, B:15:0x0051, B:17:0x0081, B:19:0x00b3, B:21:0x00bc, B:27:0x00cf, B:29:0x00da, B:31:0x00ee, B:26:0x00ca, B:18:0x0099, B:24:0x00c3), top: B:39:0x0028, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0109 A[DONT_INVERT, PHI: r10
      0x0109: PHI (r10v14 com.huawei.hms.ml.scan.HmsScan[]) = (r10v13 com.huawei.hms.ml.scan.HmsScan[]), (r10v16 com.huawei.hms.ml.scan.HmsScan[]) binds: [B:20:0x00ba, B:30:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static HmsScan[] a(Context context, HmsScanFrame hmsScanFrame, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        DetailRect detailRect;
        Bundle bundle;
        HmsScan[] hmsScanArrDetectWithByteBuffer;
        IRemoteCreator iRemoteCreatorC;
        HmsScan[] hmsScanArrDetectWithByteBuffer2;
        o4.d("scankit mul", "start detectForHmsDector");
        HmsScan[] hmsScanArr = new HmsScan[0];
        if (f13532a == null) {
            IRemoteCreator iRemoteCreatorC2 = g.c(context);
            if (iRemoteCreatorC2 != null) {
                try {
                    f13532a = iRemoteCreatorC2.newRemoteHmsDecoderDelegate();
                } catch (RemoteException unused) {
                    o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
                }
                if (f13532a != null) {
                    detailRect = new DetailRect(hmsScanFrame.getWidth(), hmsScanFrame.getHeight());
                    bundle = new Bundle();
                    if (hmsScanAnalyzerOptions != null) {
                        bundle.putInt(DetailRect.FORMAT_FLAG, hmsScanAnalyzerOptions.mode);
                        bundle.putBoolean(DetailRect.PARSE_RESULT, hmsScanAnalyzerOptions.parseResult);
                        bundle.putBoolean(DetailRect.PHOTO_MODE, hmsScanAnalyzerOptions.photoMode);
                    }
                    bundle.putBoolean(DetailRect.SUPPORT_ROLLBACK, g.f13544c);
                    bundle.putBoolean(DetailRect.USE_APK, g.f13542a);
                    bundle.putInt(DetailRect.TYPE_TRANS, 3);
                    bundle.putBoolean(DetailRect.NEW_VERSION, true);
                    bundle.putString(DetailRect.CP_PACKAGE, y3.b(context));
                    bundle.putAll(y3.a(context));
                    if (hmsScanFrame.getBitmap() != null) {
                        o4.d("scankit mul", "end detectForHmsDector");
                        hmsScanArrDetectWithByteBuffer = f13532a.decodeInBitmap(detailRect, ObjectWrapper.wrap(hmsScanFrame.getBitmap()), ObjectWrapper.wrap(bundle));
                    } else {
                        hmsScanArrDetectWithByteBuffer = f13532a.detectWithByteBuffer(detailRect, ObjectWrapper.wrap(ByteBuffer.wrap(hmsScanFrame.getYuvImage().getYuvData())), ObjectWrapper.wrap(bundle));
                    }
                    f.a(hmsScanArrDetectWithByteBuffer);
                    if (!g.a()) {
                        iRemoteCreatorC = g.c(context);
                        if (iRemoteCreatorC != null) {
                            f13532a = iRemoteCreatorC.newRemoteHmsDecoderDelegate();
                            o4.d("scankit mul", "iRemoteDecoderDelegate rollback");
                            if (hmsScanFrame.getBitmap() != null) {
                                hmsScanArrDetectWithByteBuffer2 = f13532a.decodeInBitmap(detailRect, ObjectWrapper.wrap(hmsScanFrame.getBitmap()), ObjectWrapper.wrap(bundle));
                            } else {
                                hmsScanArrDetectWithByteBuffer2 = f13532a.detectWithByteBuffer(detailRect, ObjectWrapper.wrap(ByteBuffer.wrap(hmsScanFrame.getYuvImage().getYuvData())), ObjectWrapper.wrap(bundle));
                            }
                            hmsScanArrDetectWithByteBuffer = hmsScanArrDetectWithByteBuffer2;
                            if (hmsScanArrDetectWithByteBuffer != null) {
                                return hmsScanArrDetectWithByteBuffer;
                            }
                        }
                    } else if (hmsScanArrDetectWithByteBuffer != null) {
                        return hmsScanArrDetectWithByteBuffer;
                    }
                }
            }
        } else if (f13532a != null) {
            try {
                detailRect = new DetailRect(hmsScanFrame.getWidth(), hmsScanFrame.getHeight());
                bundle = new Bundle();
                if (hmsScanAnalyzerOptions != null) {
                    bundle.putInt(DetailRect.FORMAT_FLAG, hmsScanAnalyzerOptions.mode);
                    bundle.putBoolean(DetailRect.PARSE_RESULT, hmsScanAnalyzerOptions.parseResult);
                    bundle.putBoolean(DetailRect.PHOTO_MODE, hmsScanAnalyzerOptions.photoMode);
                }
                bundle.putBoolean(DetailRect.SUPPORT_ROLLBACK, g.f13544c);
                bundle.putBoolean(DetailRect.USE_APK, g.f13542a);
                bundle.putInt(DetailRect.TYPE_TRANS, 3);
                bundle.putBoolean(DetailRect.NEW_VERSION, true);
                bundle.putString(DetailRect.CP_PACKAGE, y3.b(context));
                bundle.putAll(y3.a(context));
                if (hmsScanFrame.getBitmap() != null) {
                    o4.d("scankit mul", "end detectForHmsDector");
                    hmsScanArrDetectWithByteBuffer = f13532a.decodeInBitmap(detailRect, ObjectWrapper.wrap(hmsScanFrame.getBitmap()), ObjectWrapper.wrap(bundle));
                } else {
                    hmsScanArrDetectWithByteBuffer = f13532a.detectWithByteBuffer(detailRect, ObjectWrapper.wrap(ByteBuffer.wrap(hmsScanFrame.getYuvImage().getYuvData())), ObjectWrapper.wrap(bundle));
                }
                f.a(hmsScanArrDetectWithByteBuffer);
                if (!g.a()) {
                    iRemoteCreatorC = g.c(context);
                    if (iRemoteCreatorC != null) {
                        try {
                            f13532a = iRemoteCreatorC.newRemoteHmsDecoderDelegate();
                        } catch (RemoteException unused2) {
                            o4.b(f13533b, "RemoteException");
                        }
                        o4.d("scankit mul", "iRemoteDecoderDelegate rollback");
                        if (hmsScanFrame.getBitmap() != null) {
                            hmsScanArrDetectWithByteBuffer2 = f13532a.decodeInBitmap(detailRect, ObjectWrapper.wrap(hmsScanFrame.getBitmap()), ObjectWrapper.wrap(bundle));
                        } else {
                            hmsScanArrDetectWithByteBuffer2 = f13532a.detectWithByteBuffer(detailRect, ObjectWrapper.wrap(ByteBuffer.wrap(hmsScanFrame.getYuvImage().getYuvData())), ObjectWrapper.wrap(bundle));
                        }
                        hmsScanArrDetectWithByteBuffer = hmsScanArrDetectWithByteBuffer2;
                        if (hmsScanArrDetectWithByteBuffer != null) {
                            return hmsScanArrDetectWithByteBuffer;
                        }
                    }
                } else if (hmsScanArrDetectWithByteBuffer != null) {
                    return hmsScanArrDetectWithByteBuffer;
                }
            } catch (RemoteException unused3) {
                o4.b(TrackConstants$Events.EXCEPTION, "RemoteException");
            }
        }
        return hmsScanArr;
    }
}

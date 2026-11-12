package com.huawei.hms.scankit;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.r3;
import com.huawei.hms.scankit.p.r6;
import com.huawei.hms.scankit.p.w3;
import com.huawei.hms.scankit.p.w7;
import com.huawei.hms.scankit.p.y3;
import com.huawei.hms.scankit.util.OpencvJNI;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public class g extends IRemoteHmsDecoderDelegate.Stub {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile g f15947b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile w3 f15948a = null;

    static g a() {
        return f15947b;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate
    public HmsScan[] decodeInBitmap(DetailRect detailRect, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        boolean z;
        if (!r3.A) {
            OpencvJNI.init();
        }
        o4.d("Scankit", "start decodeInBitmap");
        Bundle bundleA = a(iObjectWrapper2);
        String string = "";
        boolean z2 = false;
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z = false;
        } else {
            string = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getString(DetailRect.CP_PACKAGE, "");
            z = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.USE_APK, false);
            z2 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.SUPPORT_ROLLBACK, false);
        }
        if (z2 && !r3.f16300a && z) {
            return new HmsScan[]{r6.b()};
        }
        if (this.f15948a == null && y3.a(string, y3.a())) {
            try {
                this.f15948a = new w3(bundleA, "MultiProcessor");
            } catch (RuntimeException unused) {
                o4.b("IRemoteDecoderDelegateImpl", "Ha error");
            } catch (Exception unused2) {
                o4.b("IRemoteDecoderDelegateImpl", "Ha error");
            }
        }
        o4.d("scankit mul", "end decodeInBitmap");
        return a(iObjectWrapper, iObjectWrapper2);
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate
    public HmsScan[] detectWithByteBuffer(DetailRect detailRect, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        boolean z;
        if (!r3.A) {
            OpencvJNI.init();
        }
        Bundle bundleA = a(iObjectWrapper2);
        String string = "";
        boolean z2 = false;
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z = false;
        } else {
            string = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getString(DetailRect.CP_PACKAGE, "");
            z = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.USE_APK, false);
            z2 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.SUPPORT_ROLLBACK, false);
        }
        if (z2 && !r3.f16300a && z) {
            return new HmsScan[]{r6.b()};
        }
        if (this.f15948a == null && y3.a(string, y3.a())) {
            try {
                this.f15948a = new w3(bundleA, "MultiProcessor");
            } catch (RuntimeException unused) {
                o4.b("IRemoteDecoderDelegateImpl", "Ha error");
            } catch (Exception unused2) {
                o4.b("IRemoteDecoderDelegateImpl", "Ha error");
            }
        }
        return a(detailRect, iObjectWrapper, iObjectWrapper2);
    }

    private Bundle a(IObjectWrapper iObjectWrapper) {
        return (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) ? new Bundle() : (Bundle) ObjectWrapper.unwrap(iObjectWrapper);
    }

    private HmsScan[] a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        boolean z;
        boolean z2;
        int iB;
        boolean z3;
        o4.d("Scankit", "start getHmsMLVisionScanResultByBitmap");
        if (iObjectWrapper == null) {
            o4.b("ScankitRemote", "bitmap is null");
            return new HmsScan[0];
        }
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        boolean z4 = true;
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z = false;
            z2 = false;
            iB = 0;
            z3 = false;
        } else {
            z2 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PHOTO_MODE, false);
            r3.f16302c = z2;
            iB = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.FORMAT_FLAG);
            boolean z5 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PARSE_RESULT, true);
            z3 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PARSE_RESULT, false);
            int i = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.TYPE_TRANS, 0);
            DetailRect.HMSSCAN_SDK_VALUE = i;
            z4 = i >= 2;
            if (z4) {
                iB = w7.b(iB);
            }
            z = z4;
            z4 = z5;
        }
        r3.f = z4;
        r3.g = z3;
        if (objUnwrap instanceof Bitmap) {
            o4.d("Scankit", "end getHmsMLVisionScanResultByBitmap");
            HmsScan[] hmsScanArrA = r6.a().a((Bitmap) objUnwrap, iB, z2, this.f15948a);
            return !z ? w7.a(hmsScanArrA) : hmsScanArrA;
        }
        return new HmsScan[0];
    }

    private HmsScan[] a(DetailRect detailRect, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        if (iObjectWrapper == null) {
            o4.b("ScankitRemoteS", "bytebuffer is null");
            return new HmsScan[0];
        }
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        boolean z4 = true;
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z = false;
            z2 = false;
            i = 0;
            z3 = false;
        } else {
            int iB = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.FORMAT_FLAG);
            boolean z5 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PHOTO_MODE, false);
            int i2 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.TYPE_TRANS, 0);
            DetailRect.HMSSCAN_SDK_VALUE = i2;
            boolean z6 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PARSE_RESULT, true);
            z = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.NEW_VERSION, false);
            z4 = i2 >= 2;
            if (z4) {
                iB = w7.b(iB);
            }
            i = iB;
            z3 = z5;
            z2 = z4;
            z4 = z6;
        }
        r3.f = z4;
        r3.g = z;
        if (objUnwrap instanceof ByteBuffer) {
            HmsScan[] hmsScanArrA = r6.a().a((ByteBuffer) objUnwrap, detailRect == null ? 1000 : detailRect.width, detailRect == null ? 1000 : detailRect.height, i, z3, this.f15948a);
            return !z2 ? w7.a(hmsScanArrA) : hmsScanArrA;
        }
        return new HmsScan[0];
    }
}

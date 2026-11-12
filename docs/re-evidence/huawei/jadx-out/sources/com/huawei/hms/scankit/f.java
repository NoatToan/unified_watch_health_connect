package com.huawei.hms.scankit;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import com.bumptech.glide.Registry;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate;
import com.huawei.hms.ml.scan.HmsBuildBitmapOption;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanResult;
import com.huawei.hms.scankit.p.c5;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.r3;
import com.huawei.hms.scankit.p.r6;
import com.huawei.hms.scankit.p.w3;
import com.huawei.hms.scankit.p.w7;
import com.huawei.hms.scankit.p.x3;
import com.huawei.hms.scankit.p.y3;
import com.huawei.hms.scankit.util.OpencvJNI;

/* JADX INFO: loaded from: classes34.dex */
public class f extends IRemoteDecoderDelegate.Stub {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile f f15944c = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile w3 f15945a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile x3 f15946b = null;

    static f a() {
        return f15944c;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public IObjectWrapper buildBitmap(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) {
            throw new RemoteException("Bundle is Null");
        }
        Bundle bundle = (Bundle) ObjectWrapper.unwrap(iObjectWrapper);
        String string = bundle.getString(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_CONTENT);
        int i = bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_FOTMAT);
        int i2 = bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_WIDTH);
        int i3 = bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_HEIGHT);
        int i4 = bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_MARGIN, 1);
        int i5 = bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_COLOR, -1);
        try {
            Bitmap bitmapA = new c5().a(string, i, i2, i3, new HmsBuildBitmapOption.Creator().setBitmapMargin(i4).setBitmapColor(i5).setBitmapBackgroundColor(bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_BACKCOLOR, -1)).create());
            if (bitmapA != null) {
                return ObjectWrapper.wrap(bitmapA);
            }
            throw new RemoteException("Bitmap is Null");
        } catch (WriterException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public void buildBitmapLog(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) {
            return;
        }
        Bundle bundle = (Bundle) ObjectWrapper.unwrap(iObjectWrapper);
        if (this.f15946b == null) {
            try {
                this.f15946b = new x3();
                this.f15946b.c(bundle);
            } catch (RuntimeException unused) {
                o4.b("IRemoteDecoderDelegateImpl", "buildBitmapLog RuntimeException");
            } catch (Exception unused2) {
                o4.b("IRemoteDecoderDelegateImpl", "buildBitmapLog Exception");
            }
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public HmsScan[] decodeWithBitmap(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        boolean z;
        if (!r3.A) {
            OpencvJNI.init();
        }
        Bundle bundle = (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) ? new Bundle() : (Bundle) ObjectWrapper.unwrap(iObjectWrapper2);
        boolean z2 = true;
        String string = "";
        boolean z3 = false;
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z = false;
        } else {
            string = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getString(DetailRect.CP_PACKAGE, "");
            z = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.USE_APK, false);
            z3 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.SUPPORT_ROLLBACK, false);
            z2 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PARSE_RESULT, true);
        }
        r3.f = z2;
        if (z3 && !r3.f16300a && z) {
            return new HmsScan[]{r6.b()};
        }
        if (this.f15945a == null && y3.a(string, y3.a())) {
            try {
                this.f15945a = new w3(bundle, Registry.BUCKET_BITMAP);
            } catch (RuntimeException unused) {
                o4.b("IRemoteDecoderDelegateImpl", "Ha error");
            } catch (Exception unused2) {
                o4.b("IRemoteDecoderDelegateImpl", "Ha error");
            }
        }
        return a(iObjectWrapper, iObjectWrapper2);
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public HmsScanResult decodeWithBuffer(byte[] bArr, int i, int i2, IObjectWrapper iObjectWrapper) {
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (bArr == null) {
            o4.b("IRemoteDecoder", "buffer is null");
            return new HmsScanResult(4096, new HmsScan[0]);
        }
        if (!r3.A) {
            OpencvJNI.init();
        }
        boolean z5 = true;
        if (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) {
            i3 = 0;
            z = false;
            z2 = true;
        } else {
            int iB = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getInt(DetailRect.FORMAT_FLAG);
            boolean z6 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getBoolean(DetailRect.PHOTO_MODE, false);
            r3.f16302c = z6;
            int i4 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getInt(DetailRect.TYPE_TRANS, 0);
            boolean z7 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getBoolean(DetailRect.PARSE_RESULT, true);
            DetailRect.HMSSCAN_SDK_VALUE = i4;
            z5 = i4 >= 2;
            if (z5) {
                iB = w7.b(iB);
            }
            z = z5;
            z2 = z6;
            z5 = z7;
            i3 = iB;
        }
        Bundle bundle = (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) ? new Bundle() : (Bundle) ObjectWrapper.unwrap(iObjectWrapper);
        String string = "";
        if (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) {
            z3 = false;
        } else {
            string = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getString(DetailRect.CP_PACKAGE, "");
            z3 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getBoolean(DetailRect.USE_APK, false);
            z4 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getBoolean(DetailRect.SUPPORT_ROLLBACK, false);
        }
        if (z4 && !r3.f16300a && z3) {
            return new HmsScanResult(4096, new HmsScan[]{r6.b()});
        }
        if (this.f15945a == null && y3.a(string, y3.a())) {
            try {
                this.f15945a = new w3(bundle, Registry.BUCKET_BITMAP);
            } catch (RuntimeException unused) {
                o4.b("IRemoteDecoderDelegateImpl", "Ha error");
            } catch (Exception unused2) {
                o4.b("IRemoteDecoderDelegateImpl", "Ha error");
            }
        }
        r3.f = z5;
        return r6.a().a(bArr, i, i2, i3, z2, z, this.f15945a);
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public IObjectWrapper queryDeepLinkInfo(IObjectWrapper iObjectWrapper) {
        return null;
    }

    private HmsScan[] a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        boolean z;
        int iB;
        boolean z2;
        if (iObjectWrapper == null) {
            o4.b("IRemoteDecoder", "bitmap is null");
            return new HmsScan[0];
        }
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        boolean z3 = true;
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z = false;
            iB = 0;
            z2 = true;
        } else {
            iB = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.FORMAT_FLAG);
            z2 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PHOTO_MODE, false);
            int i = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.TYPE_TRANS, 0);
            boolean z4 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PARSE_RESULT, true);
            DetailRect.HMSSCAN_SDK_VALUE = i;
            z3 = i >= 2;
            if (z3) {
                iB = w7.b(iB);
            }
            boolean z5 = z3;
            z3 = z4;
            z = z5;
        }
        r3.f = z3;
        if (!(objUnwrap instanceof Bitmap)) {
            return new HmsScan[0];
        }
        HmsScan[] hmsScanArrB = r6.a().b((Bitmap) objUnwrap, iB, z2, this.f15945a);
        return !z ? w7.a(hmsScanArrB) : hmsScanArrB;
    }
}

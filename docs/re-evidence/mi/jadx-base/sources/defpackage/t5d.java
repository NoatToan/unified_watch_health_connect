package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.aicr.constant.Constants;
import com.xiaomi.aicr.vision.VisionAttribute;
import com.xiaomi.aicr.vision.imagesegment.SegmentResult;

/* JADX INFO: loaded from: classes7.dex */
public class t5d extends m3f {
    public gtc g;

    public t5d(Context context, hz0 hz0Var) {
        super(context, hz0Var);
    }

    public static boolean w5(Context context) {
        return m3f.q5(context, "com.xiaomi.aicr.plugin.IImageSegmentService", "V0");
    }

    public SegmentResult T3(Bitmap bitmap, VisionAttribute visionAttribute) {
        s2n.a("ImageSegmentManager", "segment bitmap");
        if (bitmap == null || visionAttribute == null) {
            throw new NullPointerException("bitmap or attr is null");
        }
        try {
            gtc gtcVar = this.g;
            if (gtcVar != null) {
                return gtcVar.T3(bitmap, visionAttribute);
            }
            return null;
        } catch (RemoteException e) {
            s2n.b("ImageSegmentManager", "segment exception: " + e);
            return null;
        }
    }

    public int Y() throws RemoteException {
        s2n.a("ImageSegmentManager", "releaseAll");
        gtc gtcVar = this.g;
        if (gtcVar != null) {
            return gtcVar.Y();
        }
        return -1;
    }

    public int Z4() throws RemoteException {
        s2n.a("ImageSegmentManager", "initPersonModel");
        gtc gtcVar = this.g;
        if (gtcVar != null) {
            return gtcVar.Z4();
        }
        return -1;
    }

    @Override // defpackage.m3f
    public void h4(String str, long j) {
    }

    public int r2() {
        try {
            s2n.a("ImageSegmentManager", "initAlgorithmCachePath");
            gtc gtcVar = this.g;
            if (gtcVar != null) {
                return gtcVar.r2();
            }
            return -1;
        } catch (Exception e) {
            s2n.b("ImageSegmentManager", "initAlgorithmCachePath exception: " + e);
            return -1;
        }
    }

    @Override // defpackage.m3f
    public void s5(bpc bpcVar) {
        try {
            Bundle bundle = new Bundle();
            IBinder iBinderX2 = bpcVar.X2(this, super.toString(), "com.xiaomi.aicr.plugin.IImageSegmentService", "5.0", bundle);
            int i = bundle.getInt("Status");
            if (i == Constants.STATUS_DEFINE.OK.ordinal()) {
                this.g = gtc.a.s2(iBinderX2);
            } else if (i == Constants.STATUS_DEFINE.DOWNLOADING_FIRST_USE.ordinal()) {
                r5("com.xiaomi.aicr.plugin.IImageSegmentService");
            }
        } catch (Exception e) {
            s2n.a("ImageSegmentManager", "fail to fetch plugin service " + e);
        }
        this.d = this.g != null;
        if (this.c != null && this.d) {
            this.c.onServiceConnected(Constants.STATUS_DEFINE.OK.ordinal());
        } else {
            if (this.c == null || this.d || isSupport("com.xiaomi.aicr.plugin.IImageSegmentService")) {
                return;
            }
            this.c.onServiceConnected(Constants.STATUS_DEFINE.UNSUPPORTED_CAPABILITY.ordinal());
        }
    }

    @Override // defpackage.m3f
    public void u5() {
        s2n.a("ImageSegmentManager", "Service 断开连接");
        hz0 hz0Var = this.c;
        if (hz0Var != null) {
            hz0Var.onServiceDisconnected();
        }
    }
}

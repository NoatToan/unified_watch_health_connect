package defpackage;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback;
import com.huawei.health.trackprocess.api.TrackPostProcessApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mnp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42016a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static mnp f42017c;
    private ExtendHandler k;
    private List<Integer> p;
    private int r;
    private final TrackPostProcessApi t;
    private int y;
    private mnm l = mnm.a();
    private mof o = new mof();
    private Map<Integer, Map<Long, double[]>> d = new HashMap(16);
    private Map<Integer, Integer> f = new HashMap(16);
    private Map<Integer, List<Long>> g = new HashMap(16);
    private ArrayList<byte[]> n = new ArrayList<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<mnw> f42018b = new ArrayList(16);
    private mjd h = null;
    private boolean s = false;
    private boolean e = false;
    private int j = 0;
    private int q = 0;
    private List<muq> m = new ArrayList(16);
    private BtDeviceResponseCallback i = new BtDeviceResponseCallback() { // from class: mnp.5
        @Override // com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback
        public void onResponse(int i, Object obj) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                muq muqVar = new muq();
                muqVar.c(0);
                muqVar.e(bArr);
                if (bArr.length != 8 || bArr[2] != 127) {
                    mnr.b().c(mnp.this.k, 15);
                    mnp.this.b(0, muqVar);
                } else {
                    cpl.d("HwGpsFileTransferTaskManager", bArr, "mFileCallback() onResponse error: ");
                }
            }
        }
    };

    private mnp() {
        ExtendHandler extendHandlerB = HandlerCenter.b(new b(), "GPS_HwGpsFileTransferTaskManager");
        this.k = extendHandlerB;
        this.l.d(extendHandlerB);
        this.t = (TrackPostProcessApi) Services.b("Module_Track_Post_Process_Service", TrackPostProcessApi.class);
    }

    public static mnp d() {
        mnp mnpVar;
        synchronized (f42016a) {
            if (f42017c == null) {
                f42017c = new mnp();
            }
            mnpVar = f42017c;
        }
        return mnpVar;
    }

    public class b implements Handler.Callback {
        public b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            try {
                int i = message.what;
                if (i == 1) {
                    mnp.this.h(message);
                    return true;
                }
                if (i == 2) {
                    mnp.this.c(message);
                    return true;
                }
                if (i == 3) {
                    mnp.this.f(message);
                    return true;
                }
                if (i == 4) {
                    mnp.this.b(message);
                    return true;
                }
                if (i == 5) {
                    mnp.this.i(message);
                    return true;
                }
                if (i == 7) {
                    mnp.this.i();
                    return true;
                }
                if (i != 127) {
                    switch (i) {
                        case 14:
                            mnp.this.a(message);
                            return true;
                        case 15:
                            ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "GpsHandle data transfer time out");
                            mnp.this.k();
                            return true;
                        case 16:
                            mnp.this.j();
                            return true;
                        default:
                            Object[] objArr = new Object[1];
                            objArr[0] = "GpsHandle default";
                            ReleaseLogUtil.e("BTSYNC_HwGpsFileTransferTaskManager", objArr);
                            return false;
                    }
                }
                mnp.this.d(message);
                return true;
            } catch (ClassCastException e) {
                ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "GpsHandle ClassCastException:", ExceptionUtils.c(e));
                return true;
            } catch (NumberFormatException e2) {
                ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "GpsHandle NumberFormatException:", ExceptionUtils.c(e2));
                return true;
            } catch (Exception e3) {
                ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "GpsHandle Exception:", ExceptionUtils.c(e3));
                return true;
            }
        }
    }

    public void e(TransferFileInfo transferFileInfo) {
        if (transferFileInfo == null) {
            ReleaseLogUtil.e("BTSYNC_HwGpsFileTransferTaskManager", "transferFileGps transferFileInfo is null.");
            return;
        }
        this.d.clear();
        this.f.clear();
        this.g.clear();
        this.l.i(0);
        ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "request GPS");
        this.h = mjd.a();
        mke.e(this.i);
        this.p = transferFileInfo.getRecordId();
        this.y = transferFileInfo.getGpsType();
        this.r = 0;
        List<Integer> list = this.p;
        if (list == null || list.size() == 0 || this.p.size() <= this.r) {
            ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "mRecordIdList.size is 0");
            ExtendHandler extendHandler = this.k;
            if (extendHandler == null) {
                ReleaseLogUtil.e("BTSYNC_HwGpsFileTransferTaskManager", "mHandler is null");
                return;
            } else {
                extendHandler.sendEmptyMessage(16);
                return;
            }
        }
        mnr.b().e(this.p.get(this.r).intValue(), this.y, this.k);
    }

    public void b(int i, muq muqVar) {
        if (muqVar == null) {
            ReleaseLogUtil.e("BTSYNC_HwGpsFileTransferTaskManager", "processApplyGpsData maintenanceLog is null.");
            return;
        }
        if (muqVar.a().length == 8 && muqVar.a()[2] == 127 && muqVar.a()[0] == 10 && muqVar.a()[1] == 5 && muqVar.a()[3] == 4) {
            this.l.w();
            this.n.clear();
            this.l.j(0);
            this.l.a("All file:");
            this.l.c("Done file:");
            int i2 = this.q + 1;
            this.q = i2;
            LogUtil.d("HwGpsFileTransferTaskManager", "applyDataFromDeviceHandle() mSendNum = ", Integer.valueOf(i2));
            if (this.q == 4) {
                mnr.b().c(this.k, 15);
                k();
                this.q = 0;
                return;
            } else {
                List<Integer> list = this.p;
                if (list == null || this.r >= list.size()) {
                    return;
                }
                mnr.b().e(this.p.get(this.r).intValue(), i, this.k);
                return;
            }
        }
        b(muqVar);
    }

    private void b(muq muqVar) {
        int iB = muqVar.b();
        if (iB == this.l.b()) {
            a(muqVar);
            c();
        } else {
            ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "addPlayDataToList() lost index = ", Integer.valueOf(iB));
            this.m.add(muqVar);
        }
        ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "addPlayDataToList() mDonePackageSize = ", Integer.valueOf(this.l.j()), ",mCurrentFrameNum", Integer.valueOf(this.l.b()), ",index ", Integer.valueOf(iB), " mDoneTotalSize:", Integer.valueOf(this.l.h()));
        String strC = this.l.q().c();
        boolean zContains = strC == null ? false : strC.contains("AW");
        if (this.k != null) {
            if (this.l.e() == this.l.j() || zContains) {
                this.l.j(0);
                this.l.c(0);
                this.n.addAll(this.l.n());
                this.l.n().clear();
                LogUtil.a("HwGpsFileTransferTaskManager", "send ok writeLogToFile mFileName = ", this.l.m(), ";mMaintenanceLogList = ", Integer.valueOf(this.l.n().size()), ";mGpsLogList = ", Integer.valueOf(this.n.size()), ",mDoneTotalSize = ", Integer.valueOf(this.l.h()), ",mFileTotalSize = ", Integer.valueOf(this.l.h()));
                this.k.removeMessages(7);
                this.e = false;
                e();
            }
        }
    }

    private void a(muq muqVar) {
        byte[] bArrA = muqVar.a();
        if (bArrA == null) {
            ReleaseLogUtil.e("BTSYNC_HwGpsFileTransferTaskManager", "addPlayDataToList() byteData is null");
        } else {
            mnm mnmVar = this.l;
            mnmVar.c(mnmVar.j() + bArrA.length);
            ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "addPlayDataToList() mFileType = ", Integer.valueOf(this.l.o()));
            c(bArrA);
            mnm mnmVar2 = this.l;
            mnmVar2.a(mnmVar2.h() + bArrA.length);
        }
        mnm mnmVar3 = this.l;
        mnmVar3.e(mnmVar3.b() + 1);
    }

    private void c() {
        if (this.m.isEmpty()) {
            LogUtil.j("HwGpsFileTransferTaskManager", "getDataFrameCache mFrameDataList isEmpty.");
            return;
        }
        Collections.sort(this.m, new Comparator<muq>() { // from class: mnp.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(muq muqVar, muq muqVar2) {
                return muqVar.b() - muqVar2.b();
            }
        });
        Iterator<muq> it = this.m.iterator();
        while (it.hasNext()) {
            muq next = it.next();
            if (!(next instanceof muq)) {
                LogUtil.j("HwGpsFileTransferTaskManager", "getDataFrameCache iterator data error");
                return;
            }
            muq muqVar = next;
            if (muqVar.b() != this.l.b()) {
                return;
            }
            a(muqVar);
            it.remove();
        }
    }

    private void c(byte[] bArr) {
        if (this.l.o() != 1) {
            this.l.n().add(bArr);
            return;
        }
        try {
            this.l.n().add(eeq.e(bArr).getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "exception unsupportedEncodingException:", ExceptionUtils.c(e));
        }
    }

    private void e() {
        if (this.l.h() >= this.l.k()) {
            b();
        } else {
            a();
        }
    }

    private void b() {
        this.k.removeMessages(7);
        this.l.c(this.l.i() + this.l.m() + ",");
        List<mnw> list = this.f42018b;
        if (list != null && !list.isEmpty()) {
            Iterator<byte[]> it = this.n.iterator();
            int length = 0;
            while (it.hasNext()) {
                length += it.next().length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
            Iterator<byte[]> it2 = this.n.iterator();
            while (it2.hasNext()) {
                byteBufferAllocate.put(it2.next());
            }
            c(byteBufferAllocate);
            this.n.clear();
            this.l.e(0);
            this.m.clear();
        }
        mnr.b().b(this.l.l(), this.k);
    }

    private void c(ByteBuffer byteBuffer) {
        if (this.f42018b.isEmpty()) {
            LogUtil.j("HwGpsFileTransferTaskManager", "gpsTrackPostProcessingHandle mAllFileList is empty.");
            return;
        }
        mnw mnwVar = this.f42018b.get(0);
        if (mnwVar == null) {
            LogUtil.j("HwGpsFileTransferTaskManager", "gpsTrackPostProcessingHandle gpsFileInfo is null.");
            return;
        }
        if (!this.o.c()) {
            try {
                this.o.e(eeq.c(new String(byteBuffer.array(), "utf-8")), mnwVar.e());
            } catch (Exception e) {
                ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "addPlayData2List3()：", ExceptionUtils.c(e));
            }
            int iE = this.h.e(this.h.a(byteBuffer.array()));
            ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "addPlayDataToList()!,mapType:", Integer.valueOf(iE));
            this.f.put(Integer.valueOf(mnwVar.b()), Integer.valueOf(iE));
            this.d.put(Integer.valueOf(mnwVar.b()), this.h.d(byteBuffer.array(), this.l.o()));
            this.f42018b.remove(0);
            return;
        }
        try {
            byte[] bArrC = eeq.c(new String(byteBuffer.array(), "utf-8"));
            if (mnwVar.a() == 1) {
                muz muzVarA = this.h.a(byteBuffer.array());
                int iE2 = this.h.e(muzVarA);
                boolean zD = this.h.d(muzVarA);
                this.s = zD;
                ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "addPlayDataToList()!,mapType=", Integer.valueOf(iE2), " ,isSupportAltitude=", Boolean.valueOf(zD));
                this.f.put(Integer.valueOf(mnwVar.b()), Integer.valueOf(iE2));
                mnwVar.a(2);
                this.o.e(bArrC, mnwVar.e());
                this.g.put(Integer.valueOf(mnwVar.b()), this.o.d(bArrC));
                return;
            }
            b(bArrC);
        } catch (Exception e2) {
            ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "addPlayData2List2()：", ExceptionUtils.c(e2));
        }
    }

    private void b(byte[] bArr) {
        if (!this.f42018b.isEmpty()) {
            this.o.e(bArr, this.f42018b.get(0).d());
        }
        int iF = f();
        ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "addPlayDataToList()!,tatatee trackProcess result =", Integer.valueOf(iF));
        if (iF != 0) {
            this.f42018b.remove(0);
            this.n.clear();
            this.l.e(0);
            this.m.clear();
        }
    }

    private int f() {
        if (this.f42018b.isEmpty()) {
            LogUtil.a("HwGpsFileTransferTaskManager", "mAllFileList is null");
            return -1;
        }
        return this.t.getPostProcessingTrack(this.f42018b.get(0).e(), this.f42018b.get(0).d(), this.s, new IBaseResponseCallback() { // from class: mns
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f42038a.d(i, obj);
            }
        }, "");
    }

    /* synthetic */ void d(int i, Object obj) {
        LogUtil.a("HwGpsFileTransferTaskManager", "mAllFileList :", Integer.valueOf(this.f42018b.size()));
        if ((obj instanceof iln) && !this.f42018b.isEmpty()) {
            this.d.put(Integer.valueOf(this.f42018b.get(0).b()), ((iln) obj).d());
        }
        this.f42018b.remove(0);
        this.n.clear();
        this.l.e(0);
        this.m.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        if (!this.f42018b.isEmpty()) {
            if (this.f42018b.get(0).a() == 1) {
                this.l.d(this.f42018b.get(0).e());
            } else {
                this.l.d(this.f42018b.get(0).d());
            }
            this.l.g(this.f42018b.get(0).c());
            LogUtil.a("HwGpsFileTransferTaskManager", "GpsHandle start queryFileInformation mFileName = ", this.l.m(), " mFileType = ", Integer.valueOf(this.l.o()));
            if (TextUtils.isEmpty(this.l.m())) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 14;
                messageObtain.arg1 = this.f42018b.get(0).b();
                this.f42018b.remove(0);
                messageObtain.arg2 = 10003;
                this.k.sendMessage(messageObtain);
                return;
            }
            a(this.l.m());
            return;
        }
        e(message);
    }

    private void e(Message message) {
        IBaseResponseCallback iBaseResponseCallbackD = this.l.d();
        this.l.aa();
        h();
        mnr.b().c(iBaseResponseCallbackD, message, this.d, this.f, this.g);
        ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "GpsHandle maintenance success");
    }

    private void b(List<mnw> list) {
        try {
            if (list == null) {
                this.l.aa();
                h();
                if (this.l.d() != null) {
                    this.l.d().a(10001, "error fileList is null");
                    return;
                }
                return;
            }
            for (mnw mnwVar : list) {
                ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "isSupportTrackPostProcessing()", Boolean.valueOf(this.o.c()));
                if (!this.o.c() || !TextUtils.isEmpty(mnwVar.d())) {
                    this.l.a(this.l.c() + mnwVar.e());
                    this.f42018b.add(mnwVar);
                }
            }
            LogUtil.a("HwGpsFileTransferTaskManager", "getMaintenanceFileNameHandle() mAllFileListName:", this.l.c());
            if (list.size() == 0) {
                ReleaseLogUtil.e("BTSYNC_HwGpsFileTransferTaskManager", "getMaintenanceFileNameHandle fileList() = 0");
                this.l.aa();
                h();
                if (this.l.d() != null) {
                    this.l.d().a(10001, mnr.b().b(this.l.c(), this.l.i()));
                    return;
                }
                return;
            }
            if (this.r + 1 >= this.p.size()) {
                ReleaseLogUtil.e("BTSYNC_HwGpsFileTransferTaskManager", "Enter getMaintenanceFileNameHandle()");
                mnr.b().b(this.k);
            } else {
                this.r++;
                mnr.b().e(this.p.get(this.r).intValue(), this.y, this.k);
            }
        } catch (ClassCastException e) {
            ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "getMaintenanceFileNameHandle ClassCastException:", ExceptionUtils.c(e));
        }
    }

    private void e(mus musVar) {
        try {
            if (musVar == null) {
                ReleaseLogUtil.e("BTSYNC_HwGpsFileTransferTaskManager", "dataMaintParameters is null");
                return;
            }
            this.l.d(musVar);
            mnm mnmVar = this.l;
            mnmVar.l(mnmVar.q().a());
            if (this.l.u() == 0) {
                this.l.l(5000);
            }
            mnm mnmVar2 = this.l;
            mnmVar2.m(mnmVar2.q().d());
            mnm mnmVar3 = this.l;
            mnmVar3.f(mnmVar3.q().e());
            if (this.l.r() == 0) {
                this.l.f(732);
            }
            mnm mnmVar4 = this.l;
            mnmVar4.d(mnmVar4.r());
            String strC = this.l.q().c();
            String strLineSeparator = System.lineSeparator();
            int iV = this.l.v();
            String strLineSeparator2 = System.lineSeparator();
            int iR = this.l.r();
            ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", " getMaintenanceParametersHandle() ok protocalVersion :", strC, strLineSeparator, "mTransferUnitSize:", Integer.valueOf(iV), strLineSeparator2, "mMaxApplyDataSize:", Integer.valueOf(iR), System.lineSeparator(), " mWaitTimeout:", Integer.valueOf(this.l.u()), System.lineSeparator(), "breakPointEnable:", Boolean.valueOf(this.l.q().b()));
            ExtendHandler extendHandler = this.k;
            if (extendHandler != null) {
                extendHandler.sendEmptyMessage(14);
            }
        } catch (Exception e) {
            ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "getMaintenanceParametersHandle Exception:", ExceptionUtils.c(e));
        }
    }

    private void b(mut mutVar) {
        int iA;
        String strE;
        int iB;
        try {
            this.l.b((int) mutVar.c());
            this.l.d(mutVar.b());
            LogUtil.a("HwGpsFileTransferTaskManager", " queryFileInformationHandle() ok, mFileTotalSize:", Integer.valueOf(this.l.k()), ", mFileCrc:", Long.valueOf(this.l.g()));
            if (this.l.k() == 0) {
                List<mnw> list = this.f42018b;
                if (list == null || list.isEmpty()) {
                    iA = -1;
                    strE = null;
                    iB = -1;
                } else {
                    iA = this.f42018b.get(0).a();
                    strE = this.f42018b.get(0).e();
                    iB = this.f42018b.get(0).b();
                    this.f42018b.remove(0);
                }
                ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "file modelType is:GPS; transferFile size:", Integer.valueOf(this.l.k()));
                if (iA == 2) {
                    a(iB, strE);
                    return;
                } else {
                    if (this.k != null) {
                        mnr.b().c(iB, this.k);
                        return;
                    }
                    return;
                }
            }
            a();
        } catch (ClassCastException e) {
            ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "queryFileInformationHandle ClassCastException:", ExceptionUtils.c(e));
        }
    }

    private void a(final int i, String str) {
        int postProcessingTrack = this.t.getPostProcessingTrack(str, null, this.s, new IBaseResponseCallback() { // from class: mnu
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.f42042b.b(i, i2, obj);
            }
        }, "");
        ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "addPlayDataToList()!,tatatee trackProcess result:", Integer.valueOf(postProcessingTrack));
        if (postProcessingTrack != 0) {
            this.n.clear();
            this.l.e(0);
            this.m.clear();
            if (this.k != null) {
                mnr.b().c(i, this.k);
            }
        }
    }

    /* synthetic */ void b(int i, int i2, Object obj) {
        if (obj instanceof iln) {
            this.d.put(Integer.valueOf(i), ((iln) obj).d());
        }
        this.n.clear();
        this.l.e(0);
        this.m.clear();
        if (this.k != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 14;
            messageObtain.arg1 = i;
            this.k.sendMessage(messageObtain);
        }
    }

    private void a(String str) {
        ExtendHandler extendHandler = this.k;
        if (extendHandler != null) {
            extendHandler.removeMessages(15);
            this.k.sendEmptyMessage(15, 30000L);
        }
        this.l.w();
        this.n.clear();
        this.l.e(0);
        this.m.clear();
        mnr.b().a(str);
    }

    private void a(int[] iArr, int i) {
        ExtendHandler extendHandler;
        try {
            ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "applyDataHandle error code:", Integer.valueOf(iArr[0]), "; offset:", Integer.valueOf(i));
            if (iArr[0] == 100000 && (i == this.l.h() || i == 0)) {
                this.l.e(0);
                this.m.clear();
                this.e = true;
                ExtendHandler extendHandler2 = this.k;
                if (extendHandler2 != null) {
                    extendHandler2.removeMessages(7);
                    this.k.sendEmptyMessage(7, this.l.u());
                    return;
                }
                return;
            }
            if (i < this.l.h() && i != 0 && (extendHandler = this.k) != null) {
                extendHandler.removeMessages(7);
                this.k.sendEmptyMessage(7, this.l.u());
            } else {
                mnr.b().c(this.k, 15);
                k();
            }
        } catch (Exception e) {
            ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "applyDataHandle Exception:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        mnm mnmVar = this.l;
        mnmVar.j(mnmVar.s() + 1);
        if (this.l.s() == 3) {
            ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "GpsHandle more than 3 failures mReTransferTime = 3");
            k();
            ExtendHandler extendHandler = this.k;
            if (extendHandler != null) {
                extendHandler.removeMessages(7);
                return;
            }
            return;
        }
        if (this.l.n().size() != 0 && this.l.h() - this.l.j() >= 0 && this.l.j() != 0) {
            ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "GpsHandle packet loss write");
            mnm mnmVar2 = this.l;
            mnmVar2.a(mnmVar2.h() - this.l.j());
            this.l.e(0);
            this.m.clear();
            this.l.c(0);
            this.l.n().clear();
        }
        if (this.k != null) {
            ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "GpsHandle packet loss retry");
            a();
            this.k.sendEmptyMessage(7, this.l.u());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "PROCESS_NEXT_TASK");
        IBaseResponseCallback iBaseResponseCallbackD = this.l.d();
        this.l.aa();
        h();
        mnr.b().c(iBaseResponseCallbackD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(Message message) {
        mnr.b().c(this.k, 15);
        try {
            if (message.obj instanceof byte[]) {
                byte[] bArr = (byte[]) message.obj;
                if (bArr.length == 8 && bArr[2] == 127) {
                    e(bArr);
                } else {
                    b(this.l.y().g(bArr));
                }
            }
        } catch (eeu e) {
            ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "GpsHandle gpsMaintenanceGetFileName() TlvException:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        mnr.b().c(this.k, 15);
        try {
            if (message.obj instanceof byte[]) {
                e(this.l.y().h((byte[]) message.obj));
            }
        } catch (eeu e) {
            ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "GpsHandle gpsGetParameter() TlvException:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Message message) {
        mnr.b().c(this.k, 15);
        try {
            if (message.obj instanceof byte[]) {
                byte[] bArr = (byte[]) message.obj;
                if (bArr.length == 8 && bArr[2] == 127) {
                    k();
                    return;
                }
                mut mutVarF = this.l.y().f(bArr);
                if (mutVarF != null) {
                    mut mutVar = mutVarF;
                    b(mutVarF);
                }
            }
        } catch (eeu e) {
            ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "GpsHandle gpsQueryFileInformation() TlvException:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        mnr.b().c(this.k, 15);
        try {
            if (message.obj instanceof byte[]) {
                int[] iArrA = this.l.y().a((byte[]) message.obj);
                g(message);
                if (!(iArrA instanceof int[]) || iArrA.length <= 0) {
                    return;
                }
                a(iArrA, this.j);
            }
        } catch (eeu e) {
            ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "GpsHandle gpsMaintenanceApplyData() TlvException:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Message message) {
        try {
            if (message.obj instanceof byte[]) {
                muq muqVarI = this.l.y().i((byte[]) message.obj);
                if (this.e) {
                    b(0, muqVarI);
                }
            }
        } catch (eeu e) {
            ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "GpsHandle gpsMaintenanceReportData() TlvException:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        try {
            if (message.obj instanceof byte[]) {
                c(this.l.y().e((byte[]) message.obj));
            }
        } catch (eeu e) {
            ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "GpsHandle gpsErrorCode() TlvException:", ExceptionUtils.c(e));
        }
    }

    private void c(int[] iArr) {
        if (iArr != null) {
            try {
                if (iArr.length > 0 && iArr[0] != 100000) {
                    this.l.aa();
                    h();
                    b(iArr);
                }
            } catch (Exception e) {
                ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "errorCodeHandle Exception:", ExceptionUtils.c(e));
            }
        }
    }

    private void b(int[] iArr) {
        if (this.l.d() != null) {
            this.l.d().a(iArr[0], mnr.b().b(iArr[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.l.aa();
        h();
        mnr.b().a(this.l.d(), this.d, this.f, this.g);
    }

    private void e(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (!TextUtils.isEmpty(strE) && strE.contains("000186A7") && this.p.size() > 0) {
            mnr.b().e(this.k, this.p);
            return;
        }
        this.l.aa();
        h();
        mnr.b().b(this.l.d(), this.d, this.f, this.g);
    }

    private void g(Message message) {
        if (message.obj instanceof byte[]) {
            String strE = eeq.e((byte[]) message.obj);
            if (strE == null || strE.length() < 5) {
                ReleaseLogUtil.e("BTSYNC_HwGpsFileTransferTaskManager", "gpsMaintenanceApplyDataPart tlvHex is error");
            } else {
                d(strE.substring(4, strE.length()));
            }
        }
    }

    private void d(String str) {
        try {
            for (eew eewVar : new eet().b(str).e()) {
                if (CommonUtil.v(eewVar.e()) == 2) {
                    e(eewVar);
                    return;
                }
            }
        } catch (eeu e) {
            ReleaseLogUtil.a("BTSYNC_HwGpsFileTransferTaskManager", "parseGpsTlvData tlv exception:", ExceptionUtils.c(e));
        }
    }

    private void e(eew eewVar) {
        int iV = CommonUtil.v(eewVar.b());
        ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "gpsMaintenanceApplyDataPartHandle response mCurrentApplyDataSize:", Integer.valueOf(this.l.e()), ";mDonePackageSize:", Integer.valueOf(this.l.j()));
        if (this.l.e() != this.l.j() && this.l.j() != 0) {
            g();
        }
        this.j = iV;
    }

    private void g() {
        if (this.l.h() - this.l.j() < 0 || this.l.j() == 0) {
            return;
        }
        mnm mnmVar = this.l;
        mnmVar.a(mnmVar.h() - this.l.j());
        this.l.e(0);
        this.m.clear();
        this.l.c(0);
        this.l.n().clear();
    }

    private void a() {
        int iK = this.l.k() - this.l.h();
        ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "getApplyDataFromDevice spareSize:", Integer.valueOf(iK), ",mCurrentApplyDataSize:", Integer.valueOf(this.l.e()), ",mDoneTotalSize", Integer.valueOf(this.l.h()));
        if (this.l.h() % this.l.r() == 0 || iK == this.l.k()) {
            if (iK < this.l.r()) {
                this.l.d(iK);
                e(this.l.m(), this.l.h(), this.l.e());
                return;
            } else {
                mnm mnmVar = this.l;
                mnmVar.d(mnmVar.r());
                e(this.l.m(), this.l.h(), this.l.e());
                return;
            }
        }
        ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "getApplyDataFromDevice mFileTotalSize:", Integer.valueOf(this.l.k()), ", mMaxApplyDataSize:", Integer.valueOf(this.l.r()));
    }

    private void e(String str, int i, int i2) {
        this.l.h(0);
        if (lrs.a() != null && lrs.a().getSuspend() == 1) {
            this.l.t().setSuspend(1);
            ReleaseLogUtil.d("BTSYNC_HwGpsFileTransferTaskManager", "applyDataFromDevice Tasks are interrupted, and the higher priority is GPS");
            this.l.aa();
            h();
            if (this.l.d() != null) {
                this.l.d().a(104003, mnr.b().b(this.l.c(), this.l.i()));
            }
            ExtendHandler extendHandler = this.k;
            if (extendHandler != null) {
                extendHandler.removeMessages(7);
                return;
            }
            return;
        }
        ExtendHandler extendHandler2 = this.k;
        if (extendHandler2 != null) {
            extendHandler2.removeMessages(15);
            this.k.sendEmptyMessage(15, 30000L);
        }
        if (this.l.t().getType() == 0) {
            mnr.b().d(str, i, i2, this.l.q(), this.l.f());
        } else {
            mnr.b().d(str, i, i2, this.l.q(), "");
        }
    }

    private void h() {
        this.p = null;
        this.y = 0;
        this.r = 0;
        this.f42018b.clear();
    }
}

package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicControllerCallbackInterface;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicFolderStruct;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicHistoryCallbackInterface;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicIndexCallbackInterface;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicPageStruct;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicStruct;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.NegotiationCallbackInterface;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.NegotiationData;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.OperationStruct;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.HwMusicMgrCallback;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lzl extends HwBaseManager implements BluetoothDataReceiveCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static lzl f41202a;
    private static final Object d = new Object();
    private static final Object e = new Object();
    private lvb aa;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41204c;
    private List<int[]> f;
    private int g;
    private Map<OperationStruct, IBaseResponseCallback> h;
    private List<MusicFolderStruct> i;
    private IBaseResponseCallback j;
    private IBaseResponseCallback k;
    private IBaseResponseCallback l;
    private IBaseResponseCallback m;
    private IBaseResponseCallback n;
    private IBaseResponseCallback o;
    private MusicControllerCallbackInterface p;
    private int q;
    private ExtendHandler r;
    private boolean s;
    private int t;
    private MusicIndexCallbackInterface u;
    private int v;
    private List<MusicStruct> w;
    private List<maj> x;
    private boolean y;

    private lzl(Context context) {
        super(context);
        this.t = 0;
        this.v = 65535;
        this.q = 0;
        this.f41204c = 0;
        this.f = new ArrayList(16);
        this.g = 0;
        this.f41203b = 0;
        this.h = new HashMap(16);
        this.i = new ArrayList(16);
        this.w = new ArrayList(16);
        this.x = new ArrayList(16);
        this.y = true;
        this.r = HandlerCenter.b(new b(), "HwMusicControlManager");
        e();
    }

    public static lzl a(Context context) {
        lzl lzlVar;
        synchronized (e) {
            if (f41202a == null && context != null) {
                f41202a = new lzl(BaseApplication.getContext());
            }
            lzlVar = f41202a;
        }
        return lzlVar;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 37;
    }

    public void b(HwMusicMgrCallback hwMusicMgrCallback) {
        this.aa.b(hwMusicMgrCallback);
    }

    public void e() {
        lvb lvbVarE = lvb.e();
        this.aa = lvbVarE;
        lvbVarE.d(37, this);
        lzq.d(this.aa);
    }

    public void a(MusicControllerCallbackInterface musicControllerCallbackInterface) {
        LogUtil.a("HwMusicControlManager", "musicFullSynchronizationFromWear");
        this.p = musicControllerCallbackInterface;
        l();
        g();
    }

    public void b(MusicHistoryCallbackInterface musicHistoryCallbackInterface, int i, String str) {
        LogUtil.a("HwMusicControlManager", "getMusicHistory");
        lzq.e(musicHistoryCallbackInterface, i, str, d);
    }

    public void e(NegotiationData negotiationData, NegotiationCallbackInterface negotiationCallbackInterface) {
        ReleaseLogUtil.d("DEVMGR_HwMusicControlManager", "getNegotiation");
        lzq.c(negotiationData, negotiationCallbackInterface);
    }

    public void e(mak makVar) {
        if (makVar == null) {
            return;
        }
        synchronized (d) {
            lzq.b(makVar);
        }
    }

    public void e(List<Integer> list) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(37);
        deviceCommand.setCommandID(8);
        String strB = eeq.b(1);
        String strD = eeq.d(1);
        String strD2 = eeq.d(list.get(0).intValue());
        String strB2 = eeq.b(2);
        String strD3 = eeq.d(2);
        String strE = eeq.e(list.get(1).intValue());
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD);
        sb.append(strB);
        sb.append(strD2);
        sb.append(strD3);
        sb.append(strB2);
        sb.append(strE);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        lvb lvbVar = this.aa;
        if (lvbVar != null) {
            lvbVar.c(deviceCommand);
        } else {
            LogUtil.j("HwMusicControlManager", "sendMusicDeleteAudioInfo deviceConfigManager is null");
        }
    }

    public void c(MusicIndexCallbackInterface musicIndexCallbackInterface) {
        LogUtil.a("HwMusicControlManager", "registerMusicIndexCallback");
        this.u = musicIndexCallbackInterface;
    }

    public void c(OperationStruct operationStruct, IBaseResponseCallback iBaseResponseCallback) {
        if (operationStruct == null || iBaseResponseCallback == null) {
            LogUtil.j("HwMusicControlManager", "folderMusicOperate parameters callback is null");
            return;
        }
        LogUtil.a("HwMusicControlManager", "folderMusicOpetate parameters:", operationStruct.toString());
        if (!e(operationStruct)) {
            iBaseResponseCallback.a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, "");
        }
        e(operationStruct, iBaseResponseCallback);
    }

    private void l() {
        this.w.clear();
        this.i.clear();
        this.f.clear();
        this.x.clear();
        this.h.clear();
        this.t = 0;
        this.f41203b = 0;
        this.g = 0;
        this.q = 0;
        this.f41204c = 0;
        this.s = false;
    }

    private void g() {
        d(new IBaseResponseCallback() { // from class: lzp
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f41215a.a(i, obj);
            }
        });
    }

    /* synthetic */ void a(int i, Object obj) {
        if (obj == null) {
            ReleaseLogUtil.d("DEVMGR_HwMusicControlManager", "getMusicFrameCount objectData is null.");
            return;
        }
        this.q = 0;
        try {
            this.q = Integer.parseInt(obj.toString());
        } catch (NumberFormatException e2) {
            LogUtil.e("HwMusicControlManager", "getMusicFrameCount, exception:", ExceptionUtils.c(e2));
        }
        ReleaseLogUtil.d("DEVMGR_HwMusicControlManager", "getMusicFrameCount, musicFrameCount:", Integer.valueOf(this.q));
        this.y = true;
        this.v = 65535;
        f();
    }

    private void f() {
        ReleaseLogUtil.d("DEVMGR_HwMusicControlManager", "getMusicInfo musicFrameCount:", Integer.valueOf(this.q), " musicFrameCurrentIndex: ", Integer.valueOf(this.t));
        if (!this.y) {
            ReleaseLogUtil.d("DEVMGR_HwMusicControlManager", "stop getMusicInfo");
            this.t = 0;
            return;
        }
        int iMin = this.q;
        if (lzu.c().h()) {
            iMin = Math.min(this.q, 250);
        }
        int i = this.t;
        if (i < iMin) {
            b(this.v, i, new IBaseResponseCallback() { // from class: lzm
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f41209a.c(i2, obj);
                }
            });
        } else {
            c();
        }
    }

    /* synthetic */ void c(int i, Object obj) {
        if (!(obj instanceof mam)) {
            ReleaseLogUtil.d("DEVMGR_HwMusicControlManager", "getMusicInfo() objectData is null.");
            return;
        }
        mam mamVar = (mam) obj;
        this.w.addAll(mamVar.a());
        if (lzu.c().h() && (mamVar.d() == this.v || mamVar.a().size() == 1)) {
            ReleaseLogUtil.d("DEVMGR_HwMusicControlManager", "all music is loaded. musicFrameStruct.getMusicIndex() = ", Integer.valueOf(mamVar.d()), "; mMusicIndex: ", Integer.valueOf(this.v));
            c();
            return;
        }
        a(mamVar);
        this.t++;
        f();
    }

    private void a(mam mamVar) {
        List<MusicStruct> listA = mamVar.a();
        if (listA.size() == 2) {
            this.v = listA.get(1).getMusicIndex();
        }
    }

    private void c() {
        ReleaseLogUtil.d("DEVMGR_HwMusicControlManager", "finishGetMusicInfo enter size:", Integer.valueOf(this.w.size()));
        StringBuilder sb = new StringBuilder(16);
        Iterator<MusicStruct> it = this.w.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        LogUtil.a("HwMusicControlManager", "music:", sb.toString());
        this.t = 0;
        i();
    }

    public void b() {
        this.y = false;
        LogUtil.a("HwMusicControlManager", "set isGetMusicInfo = ", false);
    }

    public void b(final int i, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("HwMusicControlManager", "getMusicInfoByPageFrame callback is null");
        } else {
            this.s = true;
            b(this.v, i, new IBaseResponseCallback() { // from class: lzo
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f41214c.d(iBaseResponseCallback, i, i2, obj);
                }
            });
        }
    }

    /* synthetic */ void d(IBaseResponseCallback iBaseResponseCallback, int i, int i2, Object obj) {
        LogUtil.a("HwMusicControlManager", "getMusicInfoByPageFrame onResponse errorCode : ", Integer.valueOf(i2));
        this.s = false;
        if (i2 != 100000) {
            LogUtil.j("HwMusicControlManager", "getMusicInfoByPageFrame onResponse errorCode isn't success.");
            iBaseResponseCallback.a(2, null);
            return;
        }
        if (!(obj instanceof mam)) {
            LogUtil.j("HwMusicControlManager", "getMusicInfoByPageFrame onResponse object isn't  MusicFrameStruct.");
            iBaseResponseCallback.a(2, null);
            return;
        }
        mam mamVar = (mam) obj;
        a(mamVar);
        if (mamVar.c() != i) {
            LogUtil.j("HwMusicControlManager", "getMusicInfoByPageFrame onResponse musicFrameIndex no eq.");
            iBaseResponseCallback.a(2, null);
        } else {
            LogUtil.a("HwMusicControlManager", "getMusicInfoByPageFrame onResponse errorCode LOAD_STATUS_FINISHED.");
            iBaseResponseCallback.a(1, mamVar.a());
        }
    }

    private void i() {
        c(new IBaseResponseCallback() { // from class: lzl.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("DEVMGR_HwMusicControlManager", "getFolderInfo onResponse");
                lzl.this.h();
                LogUtil.a("HwMusicControlManager", "mFolderMusicAssociationFrameList", Integer.valueOf(lzl.this.f.size()));
                lzl lzlVar = lzl.this;
                lzlVar.f41204c = lzlVar.f.size();
                lzl.this.j();
            }
        });
    }

    public void e(String str, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (d) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("HwMusicControlManager", "getMusicFolderList packageName is null");
                return;
            }
            l();
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(37);
            deviceCommand.setCommandID(6);
            String strA = eeq.a(str);
            String str2 = eeq.d(6) + eeq.d(strA.length() / 2) + strA;
            StringBuilder sb = new StringBuilder(16);
            sb.append(str2);
            String string = sb.toString();
            LogUtil.a("HwMusicControlManager", "getMusicFolderList :", string);
            byte[] bArrC = eeq.c(string);
            deviceCommand.setDataLen(bArrC.length);
            deviceCommand.setDataContent(bArrC);
            this.aa.c(deviceCommand);
            this.l = iBaseResponseCallback;
            d(2001, 30);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ReleaseLogUtil.d("DEVMGR_HwMusicControlManager", "getFolderMusic: mFolderCount: ", Integer.valueOf(this.f41204c));
        int i = this.g;
        if (i < this.f41204c) {
            int[] iArr = this.f.get(i);
            if (iArr.length == 2) {
                c(iArr[0], iArr[1]);
                return;
            } else {
                LogUtil.j("HwMusicControlManager", "currentAssociation.length :", Integer.valueOf(iArr.length));
                return;
            }
        }
        MusicFolderStruct musicFolderStruct = new MusicFolderStruct();
        musicFolderStruct.setFolderIndex(0);
        musicFolderStruct.setMusicStructList(this.w);
        this.i.add(musicFolderStruct);
        StringBuilder sb = new StringBuilder(16);
        Iterator<MusicFolderStruct> it = this.i.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        LogUtil.a("HwMusicControlManager", "folderList: ", sb.toString());
        this.p.onGetFolders(this.i, 100000);
        this.g = 0;
        this.x.clear();
        this.h.clear();
    }

    private void c(final int i, final int i2) {
        ReleaseLogUtil.d("DEVMGR_HwMusicControlManager", "Enter getOneFolderMusic folderIndex:", Integer.valueOf(i), " frameCount:", Integer.valueOf(i2), " mFolderMusicAssociationFrameCurrentCount:", Integer.valueOf(this.f41203b));
        int i3 = this.f41203b;
        if (i3 < i2) {
            c(i, i3, new IBaseResponseCallback() { // from class: lzn
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i4, Object obj) {
                    this.e.e(i, i2, i4, obj);
                }
            });
        } else {
            a(i, i2);
        }
    }

    /* synthetic */ void e(int i, int i2, int i3, Object obj) {
        this.f41203b++;
        c(i, i2);
    }

    private void a(int i, int i2) {
        ReleaseLogUtil.d("DEVMGR_HwMusicControlManager", "Enter getOneFolderInstance folderIndex:", Integer.valueOf(i), " frameCount:", Integer.valueOf(i2));
        Iterator<MusicFolderStruct> it = this.i.iterator();
        MusicFolderStruct next = null;
        while (it.hasNext()) {
            next = it.next();
            if (next.getFolderIndex() == i) {
                break;
            }
        }
        ArrayList arrayList = new ArrayList(16);
        LogUtil.a("HwMusicControlManager", "mOneFolderMusicFrameAssociationList.size():", Integer.valueOf(this.x.size()));
        if (this.x.size() == i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.addAll(this.x.get(i3).a());
            }
        }
        LogUtil.a("HwMusicControlManager", "musicIndexList:", arrayList.toString());
        ArrayList arrayList2 = new ArrayList(16);
        HashMap map = new HashMap(16);
        for (MusicStruct musicStruct : this.w) {
            map.put(Integer.valueOf(musicStruct.getMusicIndex()), musicStruct);
        }
        Iterator<Integer> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MusicStruct musicStruct2 = (MusicStruct) map.get(it2.next());
            if (musicStruct2 != null) {
                arrayList2.add(musicStruct2);
            }
        }
        LogUtil.a("HwMusicControlManager", "GetOneFolderInstance oneFoldermusicStructList");
        if (next != null) {
            next.setMusicStructList(arrayList2);
            next.setMusicIndexList(arrayList);
        }
        this.g++;
        this.f41203b = 0;
        this.x.clear();
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f.clear();
        if (this.i.size() > 0) {
            for (MusicFolderStruct musicFolderStruct : this.i) {
                int folderIndex = musicFolderStruct.getFolderIndex();
                int folderMusicAssociationFrameCount = musicFolderStruct.getFolderMusicAssociationFrameCount();
                LogUtil.a("HwMusicControlManager", "folderIndex : ", Integer.valueOf(folderIndex), " folderMusicAssociationFrameCount : ", Integer.valueOf(folderMusicAssociationFrameCount));
                this.f.add(new int[]{folderIndex, folderMusicAssociationFrameCount});
            }
        }
    }

    private boolean e(OperationStruct operationStruct) {
        if (operationStruct == null) {
            LogUtil.j("HwMusicControlManager", "operationParametersIsValid parameters is null");
            return false;
        }
        if (operationStruct.getOperationType() < 0 || operationStruct.getOperationType() > 4) {
            LogUtil.j("HwMusicControlManager", "operationParametersIsValid parameters.getOperationType()：", Integer.valueOf(operationStruct.getOperationType()));
            return false;
        }
        if (operationStruct.getOperationType() >= 0) {
            return true;
        }
        if (operationStruct.getFolderName() != null && !operationStruct.getFolderName().equals("")) {
            return true;
        }
        LogUtil.j("HwMusicControlManager", "operationParametersIsValid parameters.getFolderName()：", operationStruct.getFolderName());
        return false;
    }

    public void e(byte[] bArr, DeviceInfo deviceInfo) {
        if (bArr == null || bArr.length < 2) {
            return;
        }
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 4) {
            LogUtil.j("HwMusicControlManager", "data lenth less 4");
            return;
        }
        try {
            ees eesVarB = new eet().b(strE.substring(4, strE.length()));
            List<eew> listE = eesVarB.e();
            List<ees> listB = eesVarB.b();
            LogUtil.a("HwMusicControlManager", "getResult(): ", eeq.e(bArr));
            b(listE, listB, bArr[1], deviceInfo);
        } catch (eeu unused) {
            LogUtil.e("HwMusicControlManager", "TlvException");
        } catch (IndexOutOfBoundsException unused2) {
            LogUtil.e("HwMusicControlManager", "IndexOutOfBoundsException");
        }
    }

    private void b(List<eew> list, List<ees> list2, int i, DeviceInfo deviceInfo) {
        d(i);
        if (list != null && list.size() > 0) {
            try {
                if (Integer.parseInt(list.get(0).e(), 16) == 127 && i != 10) {
                    e(list, i);
                    return;
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("HwMusicControlManager", "handleMusicMessage NumberFormatException");
            }
        }
        if (i != 15) {
            switch (i) {
                case 4:
                    c(list, list2);
                    break;
                case 5:
                    a(list, list2);
                    break;
                case 6:
                    a(list2);
                    break;
                case 7:
                    d(list);
                    break;
                case 8:
                    c(list);
                    break;
                case 9:
                    i(list);
                    break;
                case 10:
                    c(list, deviceInfo);
                    break;
                default:
                    lzq.b(list, list2, i);
                    LogUtil.j("HwMusicControlManager", "Invalid command:", Integer.valueOf(i));
                    break;
            }
            return;
        }
        f(list);
    }

    private void c(List<eew> list, List<ees> list2) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        int iA = -1;
        int i = 0;
        int i2 = 0;
        int iA2 = -1;
        for (eew eewVar : list) {
            int iA3 = lsk.a(eewVar.e(), 16);
            if (iA3 == 1) {
                try {
                    i2 = Integer.parseInt(eewVar.b(), 16);
                } catch (NumberFormatException unused) {
                    LogUtil.e("HwMusicControlManager", "tlv.getValue() NumberFormatException");
                }
            } else if (iA3 == 2) {
                try {
                    i = Integer.parseInt(eewVar.b(), 16);
                } catch (NumberFormatException unused2) {
                    LogUtil.e("HwMusicControlManager", "tlv.getValue() NumberFormatException");
                }
            } else if (iA3 == 3) {
                lzq.d(eewVar, arrayList);
            } else if (iA3 == 4) {
                iA = lsk.a(eewVar.b(), 16);
            } else if (iA3 == 5) {
                iA2 = lsk.a(eewVar.b(), 16);
            } else {
                LogUtil.j("HwMusicControlManager", "HandleNegotiationMessage invalid type:", Integer.valueOf(lsk.a(eewVar.e(), 16)));
            }
        }
        NegotiationData negotiationData = new NegotiationData();
        negotiationData.setMusicFormatList(arrayList);
        negotiationData.setStorageSpace(i);
        negotiationData.setMaxMusicNumber(iA);
        negotiationData.setMusicCount(iA2);
        a(list2, negotiationData);
        LogUtil.a("HwMusicControlManager", "musicFormatList :", arrayList.toString());
        this.p.onGetNegotiationData(negotiationData, 100000);
        this.o.a(100000, Integer.valueOf(i2));
    }

    private void a(List<ees> list, NegotiationData negotiationData) {
        if (list == null) {
            LogUtil.j("HwMusicControlManager", "unPackageMusicPageStruct, tlvFatherList is null.");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            Iterator<ees> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                e(it2.next().e(), arrayList);
            }
        }
        LogUtil.a("HwMusicControlManager", "unPackageMusicPageStruct, musicPageStructList size:", Integer.valueOf(arrayList.size()));
        negotiationData.setMusicPageStructList(arrayList);
    }

    private void e(List<eew> list, List<MusicPageStruct> list2) {
        MusicPageStruct musicPageStruct = new MusicPageStruct();
        for (eew eewVar : list) {
            switch (lsk.a(eewVar.e(), 16)) {
                case 8:
                    musicPageStruct.setMusicStartFrameIndex(lsk.a(eewVar.b(), 16));
                    break;
                case 9:
                    musicPageStruct.setMusicEndFrameIndex(lsk.a(eewVar.b(), 16));
                    break;
                case 10:
                    musicPageStruct.setMusicPageCount(lsk.a(eewVar.b(), 16));
                    break;
                case 11:
                    musicPageStruct.setMusicPageHashCode(lsk.a(eewVar.b(), 16));
                    break;
                default:
                    LogUtil.j("HwMusicControlManager", "other case");
                    break;
            }
        }
        list2.add(musicPageStruct);
    }

    private void a(List<eew> list, List<ees> list2) {
        if (list == null || list2 == null) {
            return;
        }
        LogUtil.a("HwMusicControlManager", "MusicConstants.COMMAND_ID_GET_MUSIC_LIST");
        mam mamVar = new mam();
        for (eew eewVar : list) {
            try {
                int i = Integer.parseInt(eewVar.e(), 16);
                if (i == 1) {
                    mamVar.a(Integer.parseInt(eewVar.b(), 16));
                } else if (i == 4) {
                    mamVar.b(Integer.parseInt(eewVar.b(), 16));
                } else {
                    LogUtil.j("HwMusicControlManager", "HandleMuisc type:", Integer.valueOf(Integer.parseInt(eewVar.e(), 16)));
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("HwMusicControlManager", "handleMuiscListMessage exception");
            }
        }
        ArrayList arrayList = new ArrayList(16);
        Iterator<ees> it = list2.iterator();
        while (it.hasNext()) {
            Iterator<ees> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                MusicStruct musicStructA = a(it2.next());
                if (musicStructA != null && musicStructA.getMusicIndex() != -1) {
                    arrayList.add(musicStructA);
                    LogUtil.a("HwMusicControlManager", "musicStruct:", musicStructA.toString());
                }
            }
        }
        mamVar.e(arrayList);
        this.k.a(100000, mamVar);
    }

    private MusicStruct a(ees eesVar) {
        if (eesVar == null) {
            return null;
        }
        MusicStruct musicStruct = new MusicStruct();
        musicStruct.setMusicIndex(-1);
        for (eew eewVar : eesVar.e()) {
            try {
                int i = Integer.parseInt(eewVar.e(), 16);
                if (i == 4) {
                    musicStruct.setMusicIndex(Integer.parseInt(eewVar.b(), 16));
                } else if (i == 5) {
                    musicStruct.setMusicName(eeq.d(eewVar.b()));
                } else if (i == 6) {
                    musicStruct.setMusicSinger(eeq.d(eewVar.b()));
                } else if (i != 7) {
                    LogUtil.j("HwMusicControlManager", "MuiscList type:", Integer.valueOf(Integer.parseInt(eewVar.e(), 16)));
                } else {
                    musicStruct.setFileName(eeq.d(eewVar.b()));
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("HwMusicControlManager", "unPackageMusicInfo exception");
            }
        }
        return musicStruct;
    }

    private void a(List<ees> list) {
        boolean z;
        if (list == null) {
            return;
        }
        ExtendHandler extendHandler = this.r;
        if (extendHandler == null || !extendHandler.hasMessages(2001)) {
            z = false;
        } else {
            this.r.removeMessages(2001);
            this.i.clear();
            z = true;
        }
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            Iterator<ees> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                ees next = it2.next();
                MusicFolderStruct musicFolderStructB = next != null ? b(next.e()) : null;
                if (musicFolderStructB != null && (musicFolderStructB.getFolderIndex() != 0 || z)) {
                    LogUtil.a("HwMusicControlManager", "folderStruct:getFolderIndex: ", Integer.valueOf(musicFolderStructB.getFolderIndex()), " getFolderName: ", musicFolderStructB.getFolderName(), " getFolderMusicAssociationFrameCount: ", Integer.valueOf(musicFolderStructB.getFolderMusicAssociationFrameCount()));
                    this.i.add(musicFolderStructB);
                }
            }
        }
        IBaseResponseCallback iBaseResponseCallback = this.l;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(100000, this.i);
        }
        IBaseResponseCallback iBaseResponseCallback2 = this.j;
        if (iBaseResponseCallback2 != null) {
            iBaseResponseCallback2.a(100000, "");
        }
    }

    private MusicFolderStruct b(List<eew> list) {
        MusicFolderStruct musicFolderStruct = new MusicFolderStruct();
        if (list != null) {
            for (eew eewVar : list) {
                if (eewVar != null) {
                    int iA = lsk.a(eewVar.e(), 16);
                    if (iA == 3) {
                        musicFolderStruct.setFolderIndex(CommonUtil.v(eewVar.b()));
                    } else if (iA == 4) {
                        musicFolderStruct.setFolderName(eeq.d(eewVar.b()));
                    } else if (iA == 5) {
                        musicFolderStruct.setFolderMusicAssociationFrameCount(CommonUtil.v(eewVar.b()));
                    } else {
                        LogUtil.j("HwMusicControlManager", "Folder type:", Integer.valueOf(CommonUtil.v(eewVar.e())));
                    }
                }
            }
        }
        return musicFolderStruct;
    }

    private void d(List<eew> list) {
        if (list == null) {
            return;
        }
        maj majVar = new maj();
        for (eew eewVar : list) {
            try {
                int i = Integer.parseInt(eewVar.e(), 16);
                if (i == 1) {
                    majVar.c(Integer.parseInt(eewVar.b(), 16));
                } else if (i != 2) {
                    int i2 = 0;
                    if (i == 3) {
                        String strB = eewVar.b();
                        ArrayList arrayList = new ArrayList(16);
                        while (true) {
                            int i3 = i2 + 4;
                            if (strB.length() < i3) {
                                break;
                            }
                            arrayList.add(Integer.valueOf(Integer.parseInt(strB.substring(i2, i3), 16)));
                            i2 = i3;
                        }
                        majVar.e(arrayList);
                    } else {
                        LogUtil.j("HwMusicControlManager", "Association type:", Integer.valueOf(Integer.parseInt(eewVar.e(), 16)));
                    }
                } else {
                    majVar.e(Integer.parseInt(eewVar.b(), 16));
                }
            } catch (NumberFormatException unused) {
                LogUtil.j("HwMusicControlManager", "handleAssociationMessage exception");
            }
        }
        LogUtil.a("HwMusicControlManager", "folderMusicFrameAssociation", majVar.toString());
        this.x.add(majVar);
        this.n.a(100000, "");
    }

    private void c(List<eew> list) {
        int iV;
        if (list == null) {
            return;
        }
        OperationStruct operationStruct = new OperationStruct();
        for (eew eewVar : list) {
            int i = 0;
            try {
                iV = CommonUtil.v(eewVar.e());
            } catch (NumberFormatException unused) {
                LogUtil.e("HwMusicControlManager", "tlv.getTag() NumberFormatException");
                iV = 0;
            }
            if (iV == 1) {
                operationStruct.setOperationType(CommonUtil.v(eewVar.b()));
            } else if (iV == 2) {
                operationStruct.setFolderIndex(CommonUtil.v(eewVar.b()));
            } else if (iV == 3) {
                operationStruct.setFolderName(eeq.d(eewVar.b()));
            } else if (iV == 4) {
                String strB = eewVar.b();
                ArrayList arrayList = new ArrayList(16);
                while (true) {
                    int i2 = i + 4;
                    if (strB.length() < i2) {
                        break;
                    }
                    arrayList.add(Integer.valueOf(CommonUtil.v(strB.substring(i, i2))));
                    i = i2;
                }
                operationStruct.setMusicIndexs(arrayList);
            } else if (iV != 127) {
                LogUtil.j("HwMusicControlManager", "Invalid type:", eewVar.e());
            } else {
                operationStruct.setOperateResult(CommonUtil.v(eewVar.b()));
            }
        }
        f(operationStruct);
    }

    private void i(List<eew> list) {
        if (list == null) {
            return;
        }
        String strD = "";
        int i = 0;
        for (eew eewVar : list) {
            try {
                int i2 = Integer.parseInt(eewVar.e(), 16);
                if (i2 == 1) {
                    i = Integer.parseInt(eewVar.b(), 16);
                } else if (i2 != 2) {
                    LogUtil.j("HwMusicControlManager", "Invalid type:", Integer.valueOf(Integer.parseInt(eewVar.e(), 16)));
                } else {
                    strD = eeq.d(eewVar.b());
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("HwMusicControlManager", "handleRequestMusicInfoMessage NumberFormatException");
            }
        }
        MusicIndexCallbackInterface musicIndexCallbackInterface = this.u;
        if (musicIndexCallbackInterface != null) {
            musicIndexCallbackInterface.onGetMusicFileInfo(i, strD, 100000);
        } else {
            LogUtil.j("HwMusicControlManager", "mMusicIndexCallback is null");
        }
    }

    private void c(List<eew> list, DeviceInfo deviceInfo) {
        if (njy.e(list)) {
            LogUtil.j("HwMusicControlManager", "RequestMusicAccountInfoMessage tlvList is empty.");
            return;
        }
        if (deviceInfo == null) {
            LogUtil.j("HwMusicControlManager", "RequestMusicAccountInfoMessage deviceInfo is null.");
            return;
        }
        Iterator<eew> it = list.iterator();
        while (it.hasNext()) {
            if (lsk.a(it.next().b(), 16) == 100000) {
                LogUtil.a("HwMusicControlManager", "RequestMusicAccountInfoMessage success.");
                SharedPreferenceManager.c(Integer.toString(10000), "setMusicInfo" + deviceInfo.getSecurityDeviceId(), System.currentTimeMillis());
                return;
            }
        }
    }

    private void f(List<eew> list) {
        LogUtil.a("HwMusicControlManager", "Enter handleRequestAuthorizationStatus");
        ExtendHandler extendHandler = this.r;
        if (extendHandler != null) {
            extendHandler.removeMessages(2002);
        }
        if (list == null) {
            return;
        }
        int iV = 0;
        for (eew eewVar : list) {
            try {
                if (CommonUtil.v(eewVar.e()) == 1) {
                    iV = CommonUtil.v(eewVar.b());
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("HwMusicControlManager", "handleRequestAuthorizationStatus NumberFormatException");
            }
        }
        IBaseResponseCallback iBaseResponseCallback = this.m;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, Integer.valueOf(iV));
        } else {
            LogUtil.j("HwMusicControlManager", "mMusicIndexCallback is null");
        }
    }

    private void f(OperationStruct operationStruct) {
        if (operationStruct == null) {
            return;
        }
        LogUtil.a("HwMusicControlManager", "Enter operationOnResponse operationStruct:", operationStruct.toString());
        if (!b(operationStruct) && this.h.size() > 0) {
            Iterator<Map.Entry<OperationStruct, IBaseResponseCallback>> it = this.h.entrySet().iterator();
            while (it.hasNext()) {
                this.h.get(it.next().getKey()).a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, "Wearing data errors");
            }
            this.h.clear();
        }
        c(operationStruct);
        a(operationStruct);
        d(operationStruct);
    }

    private void c(OperationStruct operationStruct) {
        if (operationStruct != null && operationStruct.getOperationType() == 0) {
            Iterator<Map.Entry<OperationStruct, IBaseResponseCallback>> it = this.h.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<OperationStruct, IBaseResponseCallback> next = it.next();
                OperationStruct key = next.getKey();
                LogUtil.a("HwMusicControlManager", "Enter onResponseAddFolder operation:", key.toString());
                if (key.getOperationType() == operationStruct.getOperationType() && key.getFolderName().equals(operationStruct.getFolderName())) {
                    next.getValue().a(operationStruct.getOperateResult(), Integer.valueOf(operationStruct.getFolderIndex()));
                    it.remove();
                    return;
                }
            }
        }
    }

    private void a(OperationStruct operationStruct) {
        if (operationStruct.getOperationType() == 1 || operationStruct.getOperationType() == 2) {
            h(operationStruct);
        }
    }

    private void d(OperationStruct operationStruct) {
        if (operationStruct == null) {
            return;
        }
        if (operationStruct.getOperationType() == 3 || operationStruct.getOperationType() == 4) {
            h(operationStruct);
        }
    }

    private void h(OperationStruct operationStruct) {
        Iterator<Map.Entry<OperationStruct, IBaseResponseCallback>> it = this.h.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<OperationStruct, IBaseResponseCallback> next = it.next();
            OperationStruct key = next.getKey();
            LogUtil.a("HwMusicControlManager", "Enter operationOnResponse operation:", key.toString());
            if (key.getOperationType() == operationStruct.getOperationType() && key.getFolderIndex() == operationStruct.getFolderIndex()) {
                next.getValue().a(operationStruct.getOperateResult(), "");
                it.remove();
                return;
            }
        }
    }

    private boolean b(OperationStruct operationStruct) {
        if (operationStruct == null) {
            return false;
        }
        if (operationStruct.getOperationType() < 0 || operationStruct.getOperationType() > 4) {
            LogUtil.j("HwMusicControlManager", "wearOperationParametersIsValid parameters.getOperationType()：", Integer.valueOf(operationStruct.getOperationType()));
            return false;
        }
        if (operationStruct.getOperateResult() == 0) {
            LogUtil.j("HwMusicControlManager", "wearOperationParametersIsValid parameters.getOperateResult()：", Integer.valueOf(operationStruct.getOperateResult()), " ", "parameters.getFolderIndex()", Integer.valueOf(operationStruct.getFolderIndex()));
            return false;
        }
        if (operationStruct.getOperationType() >= 0) {
            return true;
        }
        if (operationStruct.getFolderName() != null && !operationStruct.getFolderName().equals("")) {
            return true;
        }
        LogUtil.j("HwMusicControlManager", "wearOperationParametersIsValid parameters.getFolderName()：", operationStruct.getFolderName());
        return false;
    }

    private void d(IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("DEVMGR_HwMusicControlManager", "sendMusicFrameCount");
        synchronized (d) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(37);
            deviceCommand.setCommandID(4);
            String strD = eeq.d(1);
            String strB = eeq.b(0);
            String strD2 = eeq.d(2);
            String strB2 = eeq.b(0);
            String strD3 = eeq.d(3);
            String strB3 = eeq.b(0);
            StringBuilder sb = new StringBuilder(16);
            sb.append(strD);
            sb.append(strB);
            sb.append(strD2);
            sb.append(strB2);
            sb.append(strD3);
            sb.append(strB3);
            String string = sb.toString();
            LogUtil.a("HwMusicControlManager", "sendMusicFrameCount packageMusicCommond :", string);
            byte[] bArrC = eeq.c(string);
            deviceCommand.setDataLen(bArrC.length);
            deviceCommand.setDataContent(bArrC);
            this.aa.c(deviceCommand);
            this.o = iBaseResponseCallback;
            d(4, 30);
        }
    }

    private void b(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwMusicControlManager", "sendGetMusicInfo musicFrameindex: ", Integer.valueOf(i2));
        synchronized (d) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(37);
            deviceCommand.setCommandID(5);
            String strE = eeq.e(i2);
            String strB = eeq.b(strE.length() / 2);
            String strD = eeq.d(1);
            String strE2 = eeq.e(i);
            String strB2 = eeq.b(strE2.length() / 2);
            String strD2 = eeq.d(4);
            StringBuilder sb = new StringBuilder(16);
            sb.append(strD);
            sb.append(strB);
            sb.append(strE);
            sb.append(strD2);
            sb.append(strB2);
            sb.append(strE2);
            String string = sb.toString();
            LogUtil.a("HwMusicControlManager", "sendGetMusicInfo package packageMusicCommond :", string);
            byte[] bArrC = eeq.c(string);
            deviceCommand.setDataLen(bArrC.length);
            deviceCommand.setDataContent(bArrC);
            this.aa.c(deviceCommand);
            this.k = iBaseResponseCallback;
            d(5, 30);
        }
    }

    private void c(IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("DEVMGR_HwMusicControlManager", "sendGetFolderInfo");
        synchronized (d) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(37);
            deviceCommand.setCommandID(6);
            String strD = eeq.d(1);
            String strB = eeq.b(0);
            StringBuilder sb = new StringBuilder(16);
            sb.append(strD);
            sb.append(strB);
            String string = sb.toString();
            LogUtil.a("HwMusicControlManager", "package sendGetFolderInfo :", string);
            byte[] bArrC = eeq.c(string);
            deviceCommand.setDataLen(bArrC.length);
            deviceCommand.setDataContent(bArrC);
            this.aa.c(deviceCommand);
            this.j = iBaseResponseCallback;
            d(6, 30);
        }
    }

    private void c(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("DEVMGR_HwMusicControlManager", "getOneFolderOneFrameMusicAssociation folderIndex:", Integer.valueOf(i), " currentFrameIndex:", Integer.valueOf(i2));
        synchronized (d) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(37);
            deviceCommand.setCommandID(7);
            String strE = eeq.e(i);
            String strB = eeq.b(strE.length() / 2);
            String strD = eeq.d(1);
            String strE2 = eeq.e(i2);
            String strB2 = eeq.b(strE.length() / 2);
            String strD2 = eeq.d(2);
            StringBuilder sb = new StringBuilder(16);
            sb.append(strD);
            sb.append(strB);
            sb.append(strE);
            sb.append(strD2);
            sb.append(strB2);
            sb.append(strE2);
            String string = sb.toString();
            LogUtil.a("HwMusicControlManager", "package packagefolderMusicAssociationInfoListCommond :", string);
            byte[] bArrC = eeq.c(string);
            deviceCommand.setDataLen(bArrC.length);
            deviceCommand.setDataContent(bArrC);
            this.aa.c(deviceCommand);
            this.n = iBaseResponseCallback;
            d(7, 30);
        }
    }

    private void e(OperationStruct operationStruct, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwMusicControlManager", "Enter sendFolderMusicOperate");
        synchronized (d) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(37);
            deviceCommand.setCommandID(8);
            StringBuilder sb = new StringBuilder(16);
            b(operationStruct, sb);
            String string = sb.toString();
            LogUtil.a("HwMusicControlManager", "package sendFolderMusicOperate Command :", string);
            byte[] bArrC = eeq.c(string);
            deviceCommand.setDataLen(bArrC.length);
            deviceCommand.setDataContent(bArrC);
            this.aa.c(deviceCommand);
            if (this.h.size() > 16) {
                this.h.clear();
            }
            this.h.put(operationStruct, iBaseResponseCallback);
        }
    }

    private void b(OperationStruct operationStruct, StringBuilder sb) {
        String strB;
        String strD;
        if (operationStruct == null || sb == null) {
            return;
        }
        String strD2 = eeq.d(operationStruct.getOperationType());
        String strB2 = eeq.b(strD2.length() / 2);
        sb.append(eeq.d(1));
        sb.append(strB2);
        sb.append(strD2);
        e(operationStruct, sb);
        StringBuffer stringBuffer = new StringBuffer(16);
        if (operationStruct.getOperationType() == 3 || operationStruct.getOperationType() == 4) {
            Iterator<Integer> it = operationStruct.getMusicIndexs().iterator();
            while (it.hasNext()) {
                stringBuffer.append(eeq.e(it.next().intValue()));
            }
            strB = eeq.b(stringBuffer.length() / 2);
            strD = eeq.d(4);
        } else {
            strD = "";
            strB = "";
        }
        sb.append(strD);
        sb.append(strB);
        sb.append(stringBuffer.toString());
    }

    private void e(OperationStruct operationStruct, StringBuilder sb) {
        String strE;
        String strB;
        String strD;
        String strB2;
        String str;
        if (operationStruct == null || sb == null) {
            return;
        }
        boolean z = operationStruct.getOperationType() == 1 || operationStruct.getOperationType() == 2;
        boolean z2 = operationStruct.getOperationType() == 3 || operationStruct.getOperationType() == 4;
        String strD2 = "";
        if (!z && !z2) {
            strE = "";
            strB = strE;
            strD = strB;
        } else {
            strE = eeq.e(operationStruct.getFolderIndex());
            strB = eeq.b(strE.length() / 2);
            strD = eeq.d(2);
        }
        if (operationStruct.getOperationType() != 0 && operationStruct.getOperationType() != 2) {
            strB2 = "";
            str = strB2;
        } else {
            String strA = eeq.a(operationStruct.getFolderName());
            strB2 = eeq.b(strA.length() / 2);
            str = strA;
            strD2 = eeq.d(3);
        }
        sb.append(strD);
        sb.append(strB);
        sb.append(strE);
        sb.append(strD2);
        sb.append(strB2);
        sb.append(str);
    }

    public void e(MusicStruct musicStruct) {
        synchronized (d) {
            lzq.e(musicStruct);
        }
    }

    public byte[] b(int i) {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(eeq.d(1) + eeq.d(1) + eeq.d(i));
        String string = stringBuffer.toString();
        LogUtil.a("HwMusicControlManager", "package status Commond:", string);
        return eeq.c(string);
    }

    private void e(List<eew> list, int i) {
        int iA;
        if (list == null || list.size() == 0) {
            return;
        }
        LogUtil.a("HwMusicControlManager", "Enter handleMusicErrorMessage. commandId : ", Integer.valueOf(i));
        if (list.get(0) == null || (iA = lsk.a(list.get(0).b(), 16)) == -1 || iA == 100000) {
            return;
        }
        if (i == 4) {
            MusicControllerCallbackInterface musicControllerCallbackInterface = this.p;
            if (musicControllerCallbackInterface != null) {
                musicControllerCallbackInterface.onGetFolders(null, iA);
                this.p.onGetNegotiationData(null, iA);
                return;
            }
            return;
        }
        if (i == 5) {
            if (this.s) {
                IBaseResponseCallback iBaseResponseCallback = this.k;
                if (iBaseResponseCallback != null) {
                    iBaseResponseCallback.a(iA, null);
                    return;
                }
                return;
            }
            MusicControllerCallbackInterface musicControllerCallbackInterface2 = this.p;
            if (musicControllerCallbackInterface2 != null) {
                musicControllerCallbackInterface2.onGetFolders(null, iA);
                return;
            }
            return;
        }
        e(i, iA);
    }

    private void e(int i, int i2) {
        switch (i) {
            case 6:
            case 7:
                MusicControllerCallbackInterface musicControllerCallbackInterface = this.p;
                if (musicControllerCallbackInterface != null) {
                    musicControllerCallbackInterface.onGetFolders(null, i2);
                }
                break;
            case 8:
                if (this.h.size() > 0) {
                    Iterator<Map.Entry<OperationStruct, IBaseResponseCallback>> it = this.h.entrySet().iterator();
                    while (it.hasNext()) {
                        IBaseResponseCallback iBaseResponseCallback = this.h.get(it.next().getKey());
                        if (iBaseResponseCallback != null) {
                            iBaseResponseCallback.a(i2, "handleOperationMessage error");
                        }
                    }
                    this.h.clear();
                    break;
                }
                break;
            case 9:
                MusicControllerCallbackInterface musicControllerCallbackInterface2 = this.p;
                if (musicControllerCallbackInterface2 != null) {
                    musicControllerCallbackInterface2.onGetMusicFileInfo(0, null, i2);
                }
                break;
            default:
                LogUtil.j("HwMusicControlManager", "handleMusicErrorMessage Invalid type:", Integer.valueOf(i));
                break;
        }
    }

    private void d(int i, int i2) {
        if (this.r != null) {
            if (i2 != 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = i;
                this.r.sendMessage(messageObtain, ((long) i2) * 1000);
                return;
            }
            return;
        }
        this.r = HandlerCenter.b(new b(), "HwMusicControlManager");
        if (i2 != 0) {
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = i;
            this.r.sendMessage(messageObtain2, ((long) i2) * 1000);
        }
    }

    private void d(int i) {
        if (i == 4 || i == 5 || i == 6 || i == 7) {
            e(i);
        } else {
            LogUtil.j("HwMusicControlManager", "handleMusicErrorMessage Invalid type:");
        }
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwMusicControlManager", "Enter getAuthorizationStatus");
        synchronized (d) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(37);
            deviceCommand.setCommandID(15);
            this.aa.c(deviceCommand);
            this.m = iBaseResponseCallback;
            d(2002, 30);
        }
    }

    public void a() {
        LogUtil.a("HwMusicControlManager", "removeMusicPermissionCallback");
        this.m = null;
    }

    private void e(int i) {
        ExtendHandler extendHandler = this.r;
        if (extendHandler != null) {
            extendHandler.removeMessages(i);
        }
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        e(bArr, deviceInfo);
    }

    class b implements Handler.Callback {
        private b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            ReleaseLogUtil.d("DEVMGR_HwMusicControlManager", "what:", Integer.valueOf(message.what));
            int i = message.what;
            if (i != 4) {
                if (i == 5) {
                    if (lzl.this.s) {
                        if (lzl.this.k != null) {
                            lzl.this.k.a(100009, null);
                        }
                    } else if (lzl.this.p != null) {
                        lzl.this.p.onGetFolders(null, 100009);
                    }
                    return true;
                }
                if (i != 6 && i != 7) {
                    if (i == 2001) {
                        if (lzl.this.l != null) {
                            lzl.this.l.a(1, "");
                        }
                        return true;
                    }
                    if (i == 2002) {
                        if (lzl.this.m != null) {
                            lzl.this.m.a(0, 100009);
                        }
                        return true;
                    }
                    LogUtil.j("HwMusicControlManager", "handleMessage Invalid type:");
                    return false;
                }
            }
            if (lzl.this.p != null) {
                lzl.this.p.onGetFolders(null, 100009);
            }
            return true;
        }
    }

    public void c(final boolean z, final boolean z2) {
        LogUtil.a("HwMusicControlManager", "enter setMusicStatus result :", Boolean.valueOf(z));
        ThreadPoolManager.c().execute(new Runnable() { // from class: lzl.1
            @Override // java.lang.Runnable
            public void run() {
                String str;
                if (z) {
                    str = "true";
                } else {
                    str = "false";
                }
                if (z2) {
                    mhs.a().setSwitchSettingToLocal("music_control_status", str, 10000);
                }
                mhs.a().setSwitchSettingToDb("music_control_status", str);
            }
        });
        boolean zG = lzq.g();
        LogUtil.a("HwMusicControlManager", "setLocalMusicSwitch, isSupportSendSwitchStatus:", Boolean.valueOf(zG));
        if (zG) {
            mhs.a().sendSetSwitchSettingCmd(a(BaseApplication.getContext()).b(z ? 1 : 0), "", 37, 14);
        }
    }

    public boolean d() {
        String switchSettingFromLocal;
        return (!mir.a() || (switchSettingFromLocal = mhs.a().getSwitchSettingFromLocal("music_control_status", 10000)) == null || "false".equals(switchSettingFromLocal)) ? false : true;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
    }
}

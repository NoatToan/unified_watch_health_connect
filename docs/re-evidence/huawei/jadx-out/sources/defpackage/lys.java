package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.utils.ErrorCode;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes38.dex */
public class lys extends HwBaseManager implements BluetoothDataReceiveCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41156a = new Object();
    private static lys d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f41157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBaseResponseCallback f41158c;
    private Context e;
    private lvb g;

    private lys(Context context) {
        super(context);
        this.f41157b = new BroadcastReceiver() { // from class: lys.5
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (context2 != null) {
                    LogUtil.a("HwFitnessPostureManager", "mConnectStateChangedReceiver() action is ", intent.getAction());
                    if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                        DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                        if (lys.this.f41158c == null) {
                            LogUtil.j("HwFitnessPostureManager", "mCallback is null");
                            return;
                        }
                        if (deviceInfo != null) {
                            LogUtil.a("HwFitnessPostureManager", "mConnectStateChangedReceiver() status is ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                            int deviceConnectState = deviceInfo.getDeviceConnectState();
                            if (deviceConnectState == 2) {
                                lys.this.f41158c.a(100000, 100001);
                            } else if (deviceConnectState == 3) {
                                lys.this.f41158c.a(100000, Integer.valueOf(ErrorCode.HWID_IS_STOPED));
                            } else {
                                LogUtil.j("HwFitnessPostureManager", "mConnectStateChangedReceiver() default");
                            }
                        }
                    }
                }
            }
        };
        this.e = context;
        lvb lvbVarE = lvb.e();
        this.g = lvbVarE;
        if (lvbVarE != null) {
            lvbVarE.d(36, this);
        } else {
            LogUtil.j("HwFitnessPostureManager", "HWDeviceFontManager() mHwDeviceConfigManager is null");
        }
        BroadcastManagerUtil.c(this.e, this.f41157b, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    private void l(byte[] bArr) {
        byte b2 = bArr[1];
        if (b2 == 1) {
            this.f41158c.a(1, Integer.valueOf(h(bArr)));
            return;
        }
        switch (b2) {
            case 4:
                this.f41158c.a(4, c(bArr));
                break;
            case 5:
                this.f41158c.a(5, a(bArr));
                break;
            case 6:
                this.f41158c.a(6, e(bArr));
                break;
            case 7:
                this.f41158c.a(7, b(bArr));
                break;
            case 8:
                this.f41158c.a(8, Integer.valueOf(j(bArr)));
                break;
            case 9:
                this.f41158c.a(9, Integer.valueOf(f(bArr)));
                break;
            case 10:
                this.f41158c.a(10, g(bArr));
                break;
            case 11:
                this.f41158c.a(11, i(bArr));
                break;
            default:
                LogUtil.j("HwFitnessPostureManager", "responseCallbackCase default");
                break;
        }
    }

    public static lys b(Context context) {
        lys lysVar;
        synchronized (f41156a) {
            if (d == null) {
                LogUtil.j("HwFitnessPostureManager", "getInstance() context ", context);
                d = new lys(BaseApplication.getContext());
            }
            lysVar = d;
        }
        return lysVar;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 36;
    }

    public void a(int i, int i2, int i3) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(36);
        deviceCommand.setCommandID(i);
        StringBuffer stringBuffer = new StringBuffer(16);
        if (i != 7 && i != 5) {
            LogUtil.j("HwFitnessPostureManager", "sendRequireRecord() no match");
        } else {
            stringBuffer.append(e(1, i2, 2));
            stringBuffer.append(e(2, i3, 2));
        }
        deviceCommand.setDataLen(stringBuffer.length() / 2);
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        LogUtil.a("HwFitnessPostureManager", "sendRequireRecord(): Command ", eeq.d(deviceCommand.getServiceID()), eeq.d(deviceCommand.getCommandID()), eeq.e(deviceCommand.getDataContent()));
        lvb lvbVar = this.g;
        if (lvbVar == null) {
            LogUtil.j("HwFitnessPostureManager", "mHwDeviceConfigManager is null.");
        } else {
            lvbVar.c(deviceCommand);
        }
    }

    public void a(int i, int i2) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(36);
        deviceCommand.setCommandID(12);
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(e(1, i, 2));
        stringBuffer.append(e(127, i2, 2));
        deviceCommand.setDataLen(stringBuffer.length() / 2);
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        LogUtil.a("HwFitnessPostureManager", "sendReturnValue(): Command ", eeq.d(deviceCommand.getServiceID()), eeq.d(deviceCommand.getCommandID()), eeq.e(deviceCommand.getDataContent()));
        lvb lvbVar = this.g;
        if (lvbVar == null) {
            LogUtil.j("HwFitnessPostureManager", "mHwDeviceConfigManager is null.");
        } else {
            lvbVar.c(deviceCommand);
        }
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwFitnessPostureManager", "registerDataCallback");
        this.f41158c = iBaseResponseCallback;
    }

    public void e() {
        LogUtil.a("HwFitnessPostureManager", "unregisterDataCallback");
        this.f41158c = null;
    }

    private List<dsj> b(byte[] bArr) {
        LogUtil.a("HwFitnessPostureManager", "Enter resolveCourseRecordList");
        ArrayList arrayList = new ArrayList(10);
        if (bArr == null) {
            LogUtil.j("HwFitnessPostureManager", "resolveCourseRecordList dataContent is null");
            return new ArrayList(10);
        }
        String strE = eeq.e(bArr);
        try {
            Iterator<ees> it = new eet().b(strE.substring(4, strE.length())).b().iterator();
            while (it.hasNext()) {
                for (ees eesVar : it.next().b()) {
                    dsj dsjVar = new dsj();
                    List<eew> listE = eesVar.e();
                    List<ees> listB = eesVar.b();
                    c(listE, dsjVar);
                    ArrayList arrayList2 = new ArrayList(10);
                    Iterator<ees> it2 = listB.iterator();
                    while (it2.hasNext()) {
                        c(it2.next().b(), arrayList2);
                    }
                    dsjVar.a(arrayList2);
                    LogUtil.d("HwFitnessPostureManager", "courseRecord:", dsjVar.toString());
                    arrayList.add(dsjVar);
                }
            }
            return arrayList;
        } catch (eeu e) {
            LogUtil.e("HwFitnessPostureManager", "resolveCourseRecordList Exception : ", ExceptionUtils.c(e));
            return new ArrayList(10);
        }
    }

    private void c(List<ees> list, List<dsh> list2) {
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            List<eew> listE = it.next().e();
            dsh dshVar = new dsh();
            for (eew eewVar : listE) {
                if (eewVar != null) {
                    try {
                        int i = Integer.parseInt(eewVar.e(), 16);
                        LogUtil.d("HwFitnessPostureManager", "resolveCourseRecordList case2:", Integer.valueOf(i), ",value2:", eewVar.b());
                        switch (i) {
                            case 26:
                                dshVar.c(eeq.d(eewVar.b()));
                                break;
                            case 27:
                                dshVar.e(Integer.parseInt(eewVar.b(), 16));
                                break;
                            case 28:
                                dshVar.c(Integer.parseInt(eewVar.b(), 16));
                                break;
                            case 29:
                                c(Integer.parseInt(eewVar.b(), 16), dshVar);
                                break;
                            default:
                                Object[] objArr = new Object[1];
                                objArr[0] = "resolveCourseRecordListTlvChildFatherForEach default";
                                LogUtil.j("HwFitnessPostureManager", objArr);
                                break;
                        }
                    } catch (NumberFormatException e) {
                        LogUtil.e("HwFitnessPostureManager", "childFatherForEach Exception : ", ExceptionUtils.c(e));
                    }
                }
            }
            list2.add(dshVar);
        }
    }

    private void c(int i, dsh dshVar) {
        if (i == 0) {
            dshVar.a("beating");
        } else if (i == 1) {
            dshVar.a("timer");
        } else {
            LogUtil.d("HwFitnessPostureManager", "resolveCourseRecordListTlvChildFatherForEach unhandled type:", Integer.valueOf(i));
        }
    }

    private void c(List<eew> list, dsj dsjVar) {
        for (eew eewVar : list) {
            if (eewVar != null) {
                try {
                    int i = Integer.parseInt(eewVar.e(), 16);
                    LogUtil.d("HwFitnessPostureManager", "resolveCourseRecordList case is ", Integer.valueOf(i), ",tlv.getValue is ", eewVar.b());
                    switch (i) {
                        case 5:
                            dsjVar.e(eeq.d(eewVar.b()));
                            break;
                        case 6:
                            dsjVar.d(Integer.parseInt(eewVar.b(), 16));
                            break;
                        case 7:
                            dsjVar.c(eeq.d(eewVar.b()));
                            break;
                        case 8:
                            dsjVar.m(Integer.parseInt(eewVar.b(), 16));
                            break;
                        case 9:
                            dsjVar.i(Integer.parseInt(eewVar.b(), 16));
                            break;
                        case 10:
                            dsjVar.k(Integer.parseInt(eewVar.b(), 16));
                            break;
                        case 11:
                            dsjVar.n(Integer.parseInt(eewVar.b(), 16));
                            break;
                        case 12:
                            dsjVar.c(Integer.parseInt(eewVar.b(), 16));
                            break;
                        case 13:
                            dsjVar.a(Integer.parseInt(eewVar.b(), 16));
                            break;
                        case 14:
                            dsjVar.g(Integer.parseInt(eewVar.b(), 16));
                            break;
                        default:
                            a(i, eewVar, dsjVar);
                            break;
                    }
                } catch (NumberFormatException e) {
                    LogUtil.e("HwFitnessPostureManager", "resolveCourseRecordList Exception : ", ExceptionUtils.c(e));
                }
            }
        }
    }

    private void a(int i, eew eewVar, dsj dsjVar) {
        switch (i) {
            case 15:
                dsjVar.f(Integer.parseInt(eewVar.b(), 16));
                break;
            case 16:
                dsjVar.j(lsk.a(eewVar.b(), 16));
                break;
            case 17:
                dsjVar.e(lsk.a(eewVar.b(), 16));
                break;
            case 18:
                dsjVar.b(lsk.a(eewVar.b(), 16));
                break;
            case 19:
                dsjVar.h(lsk.a(eewVar.b(), 16));
                break;
            case 20:
                dsjVar.o(lsk.a(eewVar.b(), 16));
                break;
            case 21:
                dsjVar.d(Integer.parseInt(eewVar.b(), 16));
                break;
            case 22:
                dsjVar.l(lsk.a(eewVar.b(), 16));
                break;
            case 23:
                dsjVar.d(eeq.d(eewVar.b()));
                break;
            default:
                LogUtil.j("HwFitnessPostureManager", "resolveCourseRecordListForEachCase default");
                break;
        }
    }

    private dsj e(byte[] bArr) {
        dsj dsjVar = new dsj();
        if (bArr == null) {
            LogUtil.j("HwFitnessPostureManager", "resolveCourseRecord dataContent is null");
            return null;
        }
        String strE = eeq.e(bArr);
        try {
            ees eesVarB = new eet().b(strE.substring(4, strE.length()));
            List<eew> listE = eesVarB.e();
            List<ees> listB = eesVarB.b();
            for (eew eewVar : listE) {
                if (eewVar != null) {
                    try {
                        int i = Integer.parseInt(eewVar.e(), 16);
                        LogUtil.d("HwFitnessPostureManager", "resolveCourseRecord case is ", Integer.valueOf(i), ", value is ", eewVar.b());
                        if (i == 1) {
                            dsjVar.e(eeq.d(eewVar.b()));
                        } else if (i == 2) {
                            dsjVar.d(Integer.parseInt(eewVar.b(), 16));
                        } else {
                            b(i, eewVar, dsjVar);
                        }
                    } catch (NumberFormatException e) {
                        LogUtil.e("HwFitnessPostureManager", "resolveCourseRecord number exception : ", ExceptionUtils.c(e));
                    }
                }
            }
            dsjVar.a(a(listB));
            LogUtil.a("HwFitnessPostureManager", "courseRecord :", dsjVar.toString());
            return dsjVar;
        } catch (eeu e2) {
            LogUtil.e("HwFitnessPostureManager", "resolveCourseRecord Exception : ", ExceptionUtils.c(e2));
            return null;
        }
    }

    private void b(int i, eew eewVar, dsj dsjVar) {
        switch (i) {
            case 3:
                dsjVar.c(eeq.d(eewVar.b()));
                break;
            case 4:
                dsjVar.m(Integer.parseInt(eewVar.b(), 16));
                break;
            case 5:
                dsjVar.i(Integer.parseInt(eewVar.b(), 16));
                break;
            case 6:
                dsjVar.k(Integer.parseInt(eewVar.b(), 16));
                break;
            case 7:
                dsjVar.n(Integer.parseInt(eewVar.b(), 16));
                break;
            case 8:
                dsjVar.c(Integer.parseInt(eewVar.b(), 16));
                break;
            case 9:
                dsjVar.a(Integer.parseInt(eewVar.b(), 16));
                break;
            case 10:
                dsjVar.g(Integer.parseInt(eewVar.b(), 16));
                break;
            case 11:
                dsjVar.f(Integer.parseInt(eewVar.b(), 16));
                break;
            case 12:
                dsjVar.j(lsk.a(eewVar.b(), 16));
                break;
            case 13:
                dsjVar.e(lsk.a(eewVar.b(), 16));
                break;
            case 14:
                dsjVar.b(lsk.a(eewVar.b(), 16));
                break;
            case 15:
                dsjVar.h(lsk.a(eewVar.b(), 16));
                break;
            case 16:
                dsjVar.o(lsk.a(eewVar.b(), 16));
                break;
            default:
                e(i, eewVar, dsjVar);
                break;
        }
    }

    private void e(int i, eew eewVar, dsj dsjVar) {
        switch (i) {
            case 17:
                dsjVar.d(Integer.parseInt(eewVar.b(), 16));
                break;
            case 18:
                dsjVar.l(lsk.a(eewVar.b(), 16));
                break;
            case 19:
                dsjVar.d(eeq.d(eewVar.b()));
                break;
            default:
                LogUtil.j("HwFitnessPostureManager", "resolveCourseRecord default");
                break;
        }
    }

    private List<dsh> a(List<ees> list) {
        ArrayList arrayList = new ArrayList(10);
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            Iterator<ees> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                List<eew> listE = it2.next().e();
                dsh dshVar = new dsh();
                for (eew eewVar : listE) {
                    if (eewVar != null) {
                        e(eewVar, dshVar);
                    }
                }
                arrayList.add(dshVar);
            }
        }
        return arrayList;
    }

    private void e(eew eewVar, dsh dshVar) {
        try {
            int i = Integer.parseInt(eewVar.e(), 16);
            LogUtil.d("HwFitnessPostureManager", "resolveCourseRecord deviceActionList case is ", Integer.valueOf(i), ",value1 is ", eewVar.b());
            switch (i) {
                case 22:
                    dshVar.c(eeq.d(eewVar.b()));
                    break;
                case 23:
                    dshVar.e(Integer.parseInt(eewVar.b(), 16));
                    break;
                case 24:
                    dshVar.c(Integer.parseInt(eewVar.b(), 16));
                    break;
                case 25:
                    int i2 = Integer.parseInt(eewVar.b(), 16);
                    if (i2 == 0) {
                        dshVar.a("beating");
                    } else if (i2 != 1) {
                        LogUtil.d("HwFitnessPostureManager", "resolveCourseRecord unhandled type:", Integer.valueOf(i2));
                    } else {
                        dshVar.a("timer");
                    }
                    break;
                default:
                    Object[] objArr = new Object[1];
                    objArr[0] = "deviceActionList default";
                    LogUtil.j("HwFitnessPostureManager", objArr);
                    break;
            }
        } catch (NumberFormatException e) {
            LogUtil.e("HwFitnessPostureManager", "deviceActionListSwitch Exception : ", ExceptionUtils.c(e));
        }
    }

    private List<dsf> a(byte[] bArr) {
        LogUtil.a("HwFitnessPostureManager", "Enter resolvePostureRecordList");
        ArrayList arrayList = new ArrayList(10);
        if (bArr == null) {
            LogUtil.j("HwFitnessPostureManager", "resolvePostureRecordList dataContent is null");
            return arrayList;
        }
        String strE = eeq.e(bArr);
        try {
            Iterator<ees> it = new eet().b(strE.substring(4, strE.length())).b().iterator();
            while (it.hasNext()) {
                for (ees eesVar : it.next().b()) {
                    dsf dsfVar = new dsf();
                    for (eew eewVar : eesVar.e()) {
                        if (eewVar != null) {
                            try {
                                int i = Integer.parseInt(eewVar.e(), 16);
                                LogUtil.d("HwFitnessPostureManager", "resolvePostureRecordList case is ", Integer.valueOf(i), ",value is ", eewVar.b());
                                d(i, eewVar, dsfVar);
                            } catch (NumberFormatException e) {
                                LogUtil.e("HwFitnessPostureManager", "resolvePostureRecordList Exception : ", ExceptionUtils.c(e));
                            }
                        }
                    }
                    LogUtil.d("HwFitnessPostureManager", "postureRecord is ", dsfVar.toString());
                    arrayList.add(dsfVar);
                }
            }
            return arrayList;
        } catch (eeu e2) {
            LogUtil.e("HwFitnessPostureManager", "resolvePostureRecordList Exception : ", ExceptionUtils.c(e2));
            return arrayList;
        }
    }

    private void d(int i, eew eewVar, dsf dsfVar) {
        switch (i) {
            case 5:
                dsfVar.a(eeq.d(eewVar.b()));
                break;
            case 6:
                dsfVar.d(eeq.d(eewVar.b()));
                break;
            case 7:
                dsfVar.n(Integer.parseInt(eewVar.b(), 16));
                break;
            case 8:
                dsfVar.i(Integer.parseInt(eewVar.b(), 16));
                break;
            case 9:
                dsfVar.m(Integer.parseInt(eewVar.b(), 16));
                break;
            case 10:
                dsfVar.l(Integer.parseInt(eewVar.b(), 16));
                break;
            case 11:
                dsfVar.f(Integer.parseInt(eewVar.b(), 16));
                break;
            case 12:
                dsfVar.h(Integer.parseInt(eewVar.b(), 16));
                break;
            case 13:
                dsfVar.d(Integer.parseInt(eewVar.b(), 16));
                break;
            case 14:
                dsfVar.k(Integer.parseInt(eewVar.b(), 16));
                break;
            case 15:
                dsfVar.o(Integer.parseInt(eewVar.b(), 16));
                break;
            case 16:
                dsfVar.g(Integer.parseInt(eewVar.b(), 16));
                break;
            case 17:
                dsfVar.b(Integer.parseInt(eewVar.b(), 16));
                break;
            case 18:
                dsfVar.c(Integer.parseInt(eewVar.b(), 16));
                break;
            default:
                a(i, eewVar, dsfVar);
                break;
        }
    }

    private void a(int i, eew eewVar, dsf dsfVar) {
        switch (i) {
            case 19:
                dsfVar.j(Integer.parseInt(eewVar.b(), 16));
                break;
            case 20:
                dsfVar.p(Integer.parseInt(eewVar.b(), 16));
                break;
            case 21:
                dsfVar.a(Integer.parseInt(eewVar.b(), 16));
                break;
            case 22:
                dsfVar.a(Integer.parseInt(eewVar.b(), 16));
                break;
            case 23:
                dsfVar.e(Integer.parseInt(eewVar.b(), 16));
                break;
            case 24:
                dsfVar.e(eeq.d(eewVar.b()));
                break;
            default:
                LogUtil.j("HwFitnessPostureManager", "resolvePostureRecordList default");
                break;
        }
    }

    private dsf c(byte[] bArr) {
        LogUtil.a("HwFitnessPostureManager", "Enter resolvePostureRecord");
        dsf dsfVar = new dsf();
        if (bArr == null) {
            LogUtil.j("HwFitnessPostureManager", "resolvePostureRecord dataContent is null");
            return null;
        }
        String strE = eeq.e(bArr);
        try {
            for (eew eewVar : new eet().b(strE.substring(4, strE.length())).e()) {
                if (eewVar != null) {
                    try {
                        int i = Integer.parseInt(eewVar.e(), 16);
                        LogUtil.d("HwFitnessPostureManager", "resolvePostureRecord the case is ", Integer.valueOf(i), ",value2 is ", eewVar.b());
                        b(i, eewVar, dsfVar);
                    } catch (NumberFormatException e) {
                        LogUtil.e("HwFitnessPostureManager", "resolvePostureRecord Exception : ", ExceptionUtils.c(e));
                    }
                }
            }
            LogUtil.d("HwFitnessPostureManager", "postureRecord :", dsfVar.toString());
            return dsfVar;
        } catch (eeu e2) {
            LogUtil.e("HwFitnessPostureManager", "resolvePostureRecord Exception : ", ExceptionUtils.c(e2));
            return null;
        }
    }

    private void b(int i, eew eewVar, dsf dsfVar) {
        switch (i) {
            case 1:
                dsfVar.a(eeq.d(eewVar.b()));
                break;
            case 2:
                dsfVar.d(eeq.d(eewVar.b()));
                break;
            case 3:
                dsfVar.n(Integer.parseInt(eewVar.b(), 16));
                break;
            case 4:
                dsfVar.i(Integer.parseInt(eewVar.b(), 16));
                break;
            case 5:
                dsfVar.m(Integer.parseInt(eewVar.b(), 16));
                break;
            case 6:
                dsfVar.l(Integer.parseInt(eewVar.b(), 16));
                break;
            case 7:
                dsfVar.f(Integer.parseInt(eewVar.b(), 16));
                break;
            case 8:
                dsfVar.h(Integer.parseInt(eewVar.b(), 16));
                break;
            case 9:
                dsfVar.d(Integer.parseInt(eewVar.b(), 16));
                break;
            case 10:
                dsfVar.k(Integer.parseInt(eewVar.b(), 16));
                break;
            case 11:
                dsfVar.o(Integer.parseInt(eewVar.b(), 16));
                break;
            case 12:
                dsfVar.g(Integer.parseInt(eewVar.b(), 16));
                break;
            case 13:
                dsfVar.b(Integer.parseInt(eewVar.b(), 16));
                break;
            case 14:
                dsfVar.c(Integer.parseInt(eewVar.b(), 16));
                break;
            default:
                c(i, eewVar, dsfVar);
                break;
        }
    }

    private void c(int i, eew eewVar, dsf dsfVar) {
        switch (i) {
            case 15:
                dsfVar.j(Integer.parseInt(eewVar.b(), 16));
                break;
            case 16:
                dsfVar.p(Integer.parseInt(eewVar.b(), 16));
                break;
            case 17:
                dsfVar.a(Integer.parseInt(eewVar.b(), 16));
                break;
            case 18:
                dsfVar.a(Integer.parseInt(eewVar.b(), 16));
                break;
            case 19:
                dsfVar.e(Integer.parseInt(eewVar.b(), 16));
                break;
            case 20:
                dsfVar.e(eeq.d(eewVar.b()));
                break;
            default:
                LogUtil.j("HwFitnessPostureManager", "resolvePostureRecordCaseDefault default");
                break;
        }
    }

    private int f(byte[] bArr) {
        LogUtil.a("HwFitnessPostureManager", "Enter resolvePostureStatusValue");
        int i = WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100014;
        if (bArr == null) {
            LogUtil.j("HwFitnessPostureManager", "resolvePostureStatusValue dataContent is null");
            return WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100014;
        }
        String strE = eeq.e(bArr);
        try {
            List<eew> listE = new eet().b(strE.substring(4, strE.length())).e();
            if (listE != null) {
                for (eew eewVar : listE) {
                    if (eewVar != null) {
                        try {
                            i = Integer.parseInt(eewVar.b(), 16);
                            break;
                        } catch (NumberFormatException e) {
                            LogUtil.e("HwFitnessPostureManager", "resolvePostureStatusValue Exception : ", ExceptionUtils.c(e));
                        }
                    }
                }
            }
            return i;
        } catch (eeu e2) {
            LogUtil.e("HwFitnessPostureManager", "resolveWatchStatus Exception : ", ExceptionUtils.c(e2));
            return 0;
        }
    }

    private int j(byte[] bArr) {
        LogUtil.a("HwFitnessPostureManager", "Enter resolveWatchStatus");
        int i = 0;
        if (bArr == null) {
            LogUtil.j("HwFitnessPostureManager", "resolveWatchStatus dataContent is null");
            return 0;
        }
        String strE = eeq.e(bArr);
        try {
            List<eew> listE = new eet().b(strE.substring(4, strE.length())).e();
            if (listE == null) {
                return 0;
            }
            for (eew eewVar : listE) {
                if (eewVar != null) {
                    try {
                        if (Integer.parseInt(eewVar.e(), 16) == 1) {
                            i = Integer.parseInt(eewVar.b(), 16);
                        }
                    } catch (NumberFormatException e) {
                        LogUtil.e("HwFitnessPostureManager", "resolveWatchStatus Exception : ", ExceptionUtils.c(e));
                    }
                }
            }
            return i;
        } catch (eeu e2) {
            LogUtil.e("HwFitnessPostureManager", "resolveWatchStatus Exception : ", ExceptionUtils.c(e2));
            return 0;
        }
    }

    private int h(byte[] bArr) {
        LogUtil.a("HwFitnessPostureManager", "Enter resolvePostureVersionInfo");
        int i = -1;
        if (bArr == null) {
            LogUtil.j("HwFitnessPostureManager", "resolvePostureVersionInfo dataContent is null");
            return -1;
        }
        String strE = eeq.e(bArr);
        try {
            for (eew eewVar : new eet().b(strE.substring(4, strE.length())).e()) {
                if (eewVar != null) {
                    try {
                        int i2 = Integer.parseInt(eewVar.e(), 16);
                        if (i2 == 1) {
                            LogUtil.d("HwFitnessPostureManager", "version value is ", eewVar.b());
                            i = Integer.parseInt(eewVar.b(), 16);
                        } else if (i2 == 2) {
                            LogUtil.d("HwFitnessPostureManager", "mcu version value is ", eewVar.b());
                        } else {
                            LogUtil.j("HwFitnessPostureManager", "resolvePostureVersionInfo default");
                        }
                    } catch (NumberFormatException e) {
                        LogUtil.e("HwFitnessPostureManager", "resolvePostureVersionInfo Exception : ", ExceptionUtils.c(e));
                    }
                }
            }
            return i;
        } catch (eeu e2) {
            LogUtil.e("HwFitnessPostureManager", "resolvePostureVersionInfo Exception : ", ExceptionUtils.c(e2));
            return -1;
        }
    }

    private dsn g(byte[] bArr) {
        dsn dsnVar = new dsn();
        if (bArr == null) {
            LogUtil.j("HwFitnessPostureManager", "resolveReminder dataContent is null");
            return null;
        }
        String strE = eeq.e(bArr);
        try {
            for (eew eewVar : new eet().b(strE.substring(4, strE.length())).e()) {
                if (eewVar != null) {
                    try {
                        int i = Integer.parseInt(eewVar.e(), 16);
                        LogUtil.d("HwFitnessPostureManager", "resolveReminder case and value is ", Integer.valueOf(i), ",", eewVar.b());
                        if (i == 1) {
                            dsnVar.c(eeq.d(eewVar.b()));
                        } else if (i == 2) {
                            dsnVar.c(Integer.parseInt(eewVar.b(), 16));
                        } else if (i == 3) {
                            dsnVar.b(Integer.parseInt(eewVar.b(), 16));
                        } else if (i != 4) {
                            LogUtil.j("HwFitnessPostureManager", "resolveReminder default");
                        } else {
                            dsnVar.d(Integer.parseInt(eewVar.b(), 16));
                        }
                    } catch (NumberFormatException e) {
                        LogUtil.e("HwFitnessPostureManager", "resolveReminder Exception : ", ExceptionUtils.c(e));
                    }
                }
            }
            LogUtil.a("HwFitnessPostureManager", "postureReminder:", dsnVar.toString());
            return dsnVar;
        } catch (eeu e2) {
            LogUtil.e("HwFitnessPostureManager", "resolveReminder Exception : ", ExceptionUtils.c(e2));
            return null;
        }
    }

    private dsk i(byte[] bArr) {
        dsk dskVar = new dsk();
        if (bArr == null) {
            LogUtil.j("HwFitnessPostureManager", "resolveResult dataContent is null");
            return null;
        }
        String strE = eeq.e(bArr);
        try {
            for (eew eewVar : new eet().b(strE.substring(4, strE.length())).e()) {
                if (eewVar != null) {
                    try {
                        int i = Integer.parseInt(eewVar.e(), 16);
                        LogUtil.d("HwFitnessPostureManager", "resolveResult case and value is ", Integer.valueOf(i), ",", eewVar.b());
                        if (i == 1) {
                            dskVar.c(eeq.d(eewVar.b()));
                        } else if (i == 2) {
                            dskVar.e(Integer.parseInt(eewVar.b(), 16));
                        } else if (i == 3) {
                            dskVar.c(Integer.parseInt(eewVar.b(), 16));
                        } else if (i == 4) {
                            dskVar.d(Integer.parseInt(eewVar.b(), 16));
                        } else {
                            c(i, eewVar, dskVar);
                        }
                    } catch (NumberFormatException e) {
                        LogUtil.e("HwFitnessPostureManager", "resolveResult Exception : ", ExceptionUtils.c(e));
                    }
                }
            }
            LogUtil.a("HwFitnessPostureManager", "postureResult ", dskVar.toString());
            return dskVar;
        } catch (eeu e2) {
            LogUtil.e("HwFitnessPostureManager", "resolveResult Exception : ", ExceptionUtils.c(e2));
            return null;
        }
    }

    private void c(int i, eew eewVar, dsk dskVar) {
        if (i == 5) {
            dskVar.a(Integer.parseInt(eewVar.b(), 16));
        } else if (i == 6) {
            dskVar.b(Integer.parseInt(eewVar.b(), 16));
        } else {
            LogUtil.j("HwFitnessPostureManager", "resolveResult default");
        }
    }

    private String e(int i, int i2, int i3) {
        String strD;
        int i4 = 1;
        if (i3 == 0) {
            strD = eeq.d(i2);
        } else if (i3 == 1) {
            strD = eeq.e(i2);
            i4 = 2;
        } else if (i3 != 2) {
            LogUtil.j("HwFitnessPostureManager", "formTlvForIntType unknown valueType:", Integer.valueOf(i3));
            i4 = 0;
            strD = "";
        } else {
            strD = eeq.c(i2);
            i4 = 4;
        }
        String str = eeq.d(i) + eeq.d(i4) + strD;
        LogUtil.a("HwFitnessPostureManager", "formTlvForIntType() result:", str);
        return str;
    }

    private int d(byte[] bArr) {
        if (bArr == null) {
            LogUtil.j("HwFitnessPostureManager", "getErrorCode dataContent is null");
            return 100001;
        }
        String strE = eeq.e(bArr);
        try {
            int[] iArrE = e(new eet().b(strE.substring(4, strE.length())));
            LogUtil.a("HwFitnessPostureManager", "Error Code:", Integer.valueOf(iArrE[0]));
            int i = iArrE[0];
            if (i == 100000) {
                return 0;
            }
            return i;
        } catch (eeu e) {
            LogUtil.e("HwFitnessPostureManager", "getErrorCode Exception : ", ExceptionUtils.c(e));
            return 100001;
        }
    }

    private int[] e(ees eesVar) {
        List<eew> listE = eesVar.e();
        if (listE == null) {
            return new int[]{0};
        }
        int[] iArr = new int[listE.size()];
        for (eew eewVar : listE) {
            if (eewVar != null) {
                try {
                    if (Integer.parseInt(eewVar.e(), 16) == 127) {
                        iArr[0] = Integer.parseInt(eewVar.b(), 16);
                    }
                } catch (NumberFormatException e) {
                    LogUtil.e("HwFitnessPostureManager", "unTLVGetErrorCode Exception : ", ExceptionUtils.c(e));
                }
            }
        }
        return iArr;
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        if (i != 0 || bArr == null) {
            return;
        }
        if (bArr.length < 3) {
            LogUtil.j("HwFitnessPostureManager", "dataInfos length is less than 3.");
            return;
        }
        LogUtil.a("HwFitnessPostureManager", "onDataReceived data is ", eeq.e(bArr));
        IBaseResponseCallback iBaseResponseCallback = this.f41158c;
        if (iBaseResponseCallback == null) {
            LogUtil.j("HwFitnessPostureManager", "mCallback is null");
        } else if (bArr[2] == 127) {
            iBaseResponseCallback.a(127, Integer.valueOf(d(bArr)));
        } else {
            l(bArr);
        }
    }
}

package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionaryActionInterface;
import com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionaryStrategy;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mvp extends DictionaryStrategy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DictionaryActionInterface f42517c;

    private mvp() {
        this.f42517c = new mvm();
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionaryStrategy
    public <T> T execute(int i, Object... objArr) {
        LogUtil.a("DictionaryStrategyImpl", "execute type:", Integer.valueOf(i), ",objects:", objArr);
        if (objArr != null) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (objArr.length == 2) {
                            Object obj = objArr[0];
                            if (obj instanceof mva) {
                                Object obj2 = objArr[1];
                                if (obj2 instanceof HiDataOperateListener) {
                                    this.f42517c.insertToHiHealth((mva) obj, (HiDataOperateListener) obj2);
                                    return null;
                                }
                            }
                        }
                    } else {
                        return (T) d(i, objArr);
                    }
                } else if (objArr.length == 3) {
                    Object obj3 = objArr[0];
                    if ((obj3 instanceof Integer) && (objArr[1] instanceof DeviceInfo) && (objArr[2] instanceof HiDataReadResultListener)) {
                        this.f42517c.readHiHealthData(((Integer) obj3).intValue(), (DeviceInfo) objArr[1], (HiDataReadResultListener) objArr[2]);
                        return null;
                    }
                }
            } else if (objArr.length == 1) {
                Object obj4 = objArr[0];
                if (obj4 instanceof ees) {
                    return (T) execute(5, (ees) obj4);
                }
            }
        }
        return null;
    }

    private <T> T d(int i, Object[] objArr) {
        LogUtil.a("DictionaryStrategyImpl", "execute processOtherCase type:", Integer.valueOf(i));
        if (i == 4) {
            if (objArr.length != 3) {
                return null;
            }
            Object obj = objArr[0];
            if (!(obj instanceof Integer) || !(objArr[1] instanceof Long) || !(objArr[2] instanceof Long)) {
                return null;
            }
            return (T) this.f42517c.genCacheDicInfo(((Integer) obj).intValue(), ((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue());
        }
        if (i == 5) {
            if (objArr.length != 1) {
                return null;
            }
            Object obj2 = objArr[0];
            if (!(obj2 instanceof ees)) {
                return null;
            }
            return (T) this.f42517c.parsePointData((ees) obj2);
        }
        if (i == 6) {
            if (objArr.length != 2) {
                return null;
            }
            Object obj3 = objArr[0];
            if (!(obj3 instanceof mva)) {
                return null;
            }
            Object obj4 = objArr[1];
            if (!(obj4 instanceof mvi)) {
                return null;
            }
            return (T) Boolean.valueOf(this.f42517c.syncNextInfo((mva) obj3, (mvi) obj4));
        }
        LogUtil.j("DictionaryStrategyImpl", "execute default");
        return (T) c(i, objArr);
    }

    private <T> T c(int i, Object[] objArr) {
        LogUtil.a("DictionaryStrategyImpl", "execute processOtherCase type:", Integer.valueOf(i));
        if (i == 7) {
            if (objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof mvi) {
                    return (T) this.f42517c.buildSendMessage((mvi) obj);
                }
            }
            return null;
        }
        LogUtil.j("DictionaryStrategyImpl", "execute default");
        return null;
    }

    public static mvp a() {
        return b.d;
    }

    static class b {
        private static mvp d = new mvp();
    }
}

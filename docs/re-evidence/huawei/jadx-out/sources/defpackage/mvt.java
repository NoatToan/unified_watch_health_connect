package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionarySequenceInterface;
import com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionaryStrategy;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mvt extends DictionaryStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DictionarySequenceInterface f42521a;

    private mvt() {
        this.f42521a = new mvn();
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionaryStrategy
    public <T> T execute(int i, Object... objArr) {
        LogUtil.a("DictionarySequenceStrategyImpl", "execute type:", Integer.valueOf(i), ",objects:", objArr);
        if (objArr != null) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 5) {
                        if (objArr.length == 1) {
                            Object obj = objArr[0];
                            if (obj instanceof String) {
                                return (T) this.f42521a.parseSequenceData((String) obj);
                            }
                        }
                    } else {
                        return (T) e(i, objArr);
                    }
                } else if (objArr.length == 2) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof mvg) {
                        Object obj3 = objArr[1];
                        if (obj3 instanceof HiDataOperateListener) {
                            this.f42521a.insertToHiHealth((mvg) obj2, (HiDataOperateListener) obj3);
                            return null;
                        }
                    }
                }
            } else if (objArr.length == 3) {
                Object obj4 = objArr[0];
                if ((obj4 instanceof Integer) && (objArr[1] instanceof DeviceInfo) && (objArr[2] instanceof HiDataReadResultListener)) {
                    this.f42521a.readHiHealthData(((Integer) obj4).intValue(), (DeviceInfo) objArr[1], (HiDataReadResultListener) objArr[2]);
                }
            }
        }
        return null;
    }

    private <T> T e(int i, Object[] objArr) {
        LogUtil.a("DictionarySequenceStrategyImpl", "execute processOtherCase type:", Integer.valueOf(i));
        if (i != 4) {
            if (i != 6) {
                if (i == 7) {
                    if (objArr.length == 1) {
                        Object obj = objArr[0];
                        if (obj instanceof mvf) {
                            return (T) this.f42521a.buildSendMessage((mvf) obj);
                        }
                    }
                } else {
                    LogUtil.j("DictionarySequenceStrategyImpl", "execute default");
                    return null;
                }
            } else if (objArr.length == 2) {
                Object obj2 = objArr[0];
                if (obj2 instanceof mvg) {
                    Object obj3 = objArr[1];
                    if (obj3 instanceof mvf) {
                        return (T) Boolean.valueOf(this.f42521a.syncNextInfo((mvg) obj2, (mvf) obj3));
                    }
                }
            }
        } else if (objArr.length == 3) {
            Object obj4 = objArr[0];
            if ((obj4 instanceof Integer) && (objArr[1] instanceof Integer) && (objArr[2] instanceof Integer)) {
                return (T) this.f42521a.genCacheDicInfo(((Integer) obj4).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        return null;
    }

    public static mvt d() {
        return c.e;
    }

    static class c {
        private static mvt e = new mvt();
    }
}

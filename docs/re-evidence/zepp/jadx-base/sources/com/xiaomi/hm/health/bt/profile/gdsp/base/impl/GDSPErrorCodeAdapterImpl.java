package com.xiaomi.hm.health.bt.profile.gdsp.base.impl;

import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCodeAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016R2\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/impl/GDSPErrorCodeAdapterImpl;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCodeAdapter;", "", "code", "adapter2DeviceErrorCode", "errorCode", "adapter2AppErrorCode", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "appCode2DeviceCode", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GDSPErrorCodeAdapterImpl implements GDSPErrorCodeAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HashMap<Integer, Integer> appCode2DeviceCode;

    public GDSPErrorCodeAdapterImpl() {
        GDSPErrorCode gDSPErrorCode = GDSPErrorCode.SUCCESS;
        this.appCode2DeviceCode = r.hashMapOf(TuplesKt.to(0, Integer.valueOf(gDSPErrorCode.getCode())), TuplesKt.to(1, Integer.valueOf(GDSPErrorCode.PACKET_INDEX_ERROR.getCode())), TuplesKt.to(2, Integer.valueOf(GDSPErrorCode.OPERATION_FAILED.getCode())), TuplesKt.to(5, Integer.valueOf(GDSPErrorCode.BUSY.getCode())), TuplesKt.to(6, Integer.valueOf(GDSPErrorCode.MUSIC_ALIVE.getCode())), TuplesKt.to(7, Integer.valueOf(GDSPErrorCode.SPEECH_ALIVE.getCode())), TuplesKt.to(8, Integer.valueOf(GDSPErrorCode.CRC_MISMATCH.getCode())), TuplesKt.to(4, Integer.valueOf(gDSPErrorCode.getCode())));
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCodeAdapter
    public int adapter2AppErrorCode(int errorCode) {
        Integer num;
        Iterator<T> it2 = this.appCode2DeviceCode.entrySet().iterator();
        Object obj = null;
        Object obj2 = null;
        boolean z = false;
        while (true) {
            if (!it2.hasNext()) {
                if (!z) {
                    break;
                }
                obj = obj2;
                break;
            }
            Object next = it2.next();
            Integer num2 = (Integer) ((Map.Entry) next).getValue();
            if (num2 != null && num2.intValue() == errorCode) {
                if (z) {
                    break;
                }
                obj2 = next;
                z = true;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (num = (Integer) entry.getKey()) == null) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCodeAdapter
    public int adapter2DeviceErrorCode(int code) {
        Integer num = this.appCode2DeviceCode.get(Integer.valueOf(code));
        return num == null ? GDSPErrorCode.OPERATION_FAILED.getCode() : num.intValue();
    }
}

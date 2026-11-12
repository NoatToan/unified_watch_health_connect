package com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat;

import com.xiaomi.hm.health.bt.utils.ArraysUtil;
import java.io.Serializable;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes18.dex */
public class BleFirstbeatData implements Serializable {
    private static final long serialVersionUID = 1;
    public BleFirstbeat.Config firstbeatConfig;
    public List<BleFirstbeat> firstbeatList;

    public String toString() {
        return "<FirstbeatList: " + ArraysUtil.toString(this.firstbeatList) + ", FirstbeatConfig: " + this.firstbeatConfig + Typography.greater;
    }
}

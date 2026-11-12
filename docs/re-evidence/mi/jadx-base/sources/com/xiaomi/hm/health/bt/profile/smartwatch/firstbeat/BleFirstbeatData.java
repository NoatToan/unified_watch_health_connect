package com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat;

import defpackage.g9s;
import java.io.Serializable;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes11.dex */
public class BleFirstbeatData implements Serializable {
    private static final long serialVersionUID = 1;
    public BleFirstbeat.Config firstbeatConfig;
    public List<BleFirstbeat> firstbeatList;

    public String toString() {
        return "<FirstbeatList: " + g9s.a(this.firstbeatList) + ", FirstbeatConfig: " + this.firstbeatConfig + Typography.greater;
    }
}

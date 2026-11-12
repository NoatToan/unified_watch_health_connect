package com.xiaomi.hm.health.device.firmware;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.alipay.sdk.m.u.i;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class HMFwOnlineUpgradeInfo implements IHMFwUpgradeInfo, Comparable<HMFwOnlineUpgradeInfo> {
    public static final String CHANGE_LOG_SPLITTER = "###summary###";
    private static final String p = "HMFwOnlineUpgradeInfo";
    private HMDeviceSource a;
    private int b;
    private final Context c;
    private String d;
    private String e;
    private String f;
    private int g;
    private int h;
    private boolean i;
    private String j;
    private List<FwNode> k = new ArrayList(6);
    private int l = 0;
    private boolean m = false;
    private HMFirmwareType n = HMFirmwareType.FIRMWARE;
    private boolean o = false;

    public static class FwNode implements Comparable<FwNode> {
        private String a;
        public int fwType;

        public FwNode(int i, String str) {
            this.fwType = i;
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.fwType == ((FwNode) obj).fwType;
        }

        @Override // java.lang.Comparable
        public int compareTo(FwNode fwNode) {
            return this.fwType - fwNode.fwType;
        }
    }

    public HMFwOnlineUpgradeInfo(Context context) {
        this.c = context.getApplicationContext();
    }

    public String a() {
        if (this.k == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<FwNode> it2 = this.k.iterator();
        while (it2.hasNext()) {
            sb.append(HMFirmwareType.fromValue(it2.next().fwType));
            sb.append(" ");
        }
        return sb.toString();
    }

    public void addChildFw(HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo) {
        String str;
        if (this.n != HMFirmwareType.FIRMWARE_BATCH) {
            throw new UnsupportedOperationException("Unsupport add child fw to none batch fw");
        }
        HMDeviceSource hMDeviceSource = this.a;
        if (hMDeviceSource == null) {
            this.a = hMFwOnlineUpgradeInfo.a;
        } else if (hMFwOnlineUpgradeInfo.a != hMDeviceSource) {
            HMLog.i(p, "ERROR:Device source not match", new Object[0]);
            return;
        }
        this.k.add(new FwNode(hMFwOnlineUpgradeInfo.n.getValue() & 255, hMFwOnlineUpgradeInfo.d));
        this.i = this.i || hMFwOnlineUpgradeInfo.i;
        String str2 = "";
        if (this.f == null) {
            str = "";
        } else {
            str = this.f + ",";
        }
        this.f = str;
        this.f += this.n.name() + ":" + hMFwOnlineUpgradeInfo.f;
        if (this.e != null) {
            str2 = this.e + ",";
        }
        this.e = str2;
        this.e += this.n.name() + ":" + hMFwOnlineUpgradeInfo.e;
        if (this.j == null) {
            this.j = hMFwOnlineUpgradeInfo.j;
        }
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHMFwUpgradeInfo
    public boolean deleteFwFile() {
        boolean z;
        Iterator<FwNode> it2 = this.k.iterator();
        loop0: while (true) {
            while (true) {
                if (!it2.hasNext()) {
                    break loop0;
                }
                z = z && new File(it2.next().a).delete();
            }
        }
        if (this.d != null) {
            return z && new File(this.d).delete();
        }
        return z;
    }

    public boolean fwFileExist() {
        if (this.n != HMFirmwareType.FIRMWARE_BATCH) {
            HMLog.i(p, this.d, new Object[0]);
            return new File(this.d).exists();
        }
        for (FwNode fwNode : this.k) {
            if (!new File(fwNode.a).exists()) {
                HMLog.i(p, fwNode.a + " not exists", new Object[0]);
                return false;
            }
        }
        return true;
    }

    public int getBuildTime() {
        return this.l;
    }

    public String getChangeLog() {
        return this.j;
    }

    @NonNull
    public String getChangeLogForApp() {
        return getChangeLogForApp(this.j);
    }

    public String getChangeLogForDevice() {
        String str = this.j;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] strArrSplit = this.j.split(CHANGE_LOG_SPLITTER);
        if (strArrSplit.length <= 1) {
            return null;
        }
        return strArrSplit[1];
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHMFwUpgradeInfo
    public Context getContext() {
        return this.c;
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHMFwUpgradeInfo
    public HMDeviceSource getDeviceSource() {
        return this.a;
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHMFwUpgradeInfo
    public HMFirmwareType getFirmwareType() {
        return this.n;
    }

    public int getFlag() {
        return this.g;
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHMFwUpgradeInfo
    @Nullable
    public String getFwFilePath() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        if (this.n != HMFirmwareType.FIRMWARE_BATCH) {
            return null;
        }
        try {
            int value = HMFirmwareType.FIRMWARE_CHANGE_LOG.getValue() & 255;
            ArrayList arrayList = new ArrayList();
            String strDumpChangeLogImage = FwFileUtilsExtendKt.dumpChangeLogImage(getBuildTime(), getChangeLogForDevice(), this.c);
            if (strDumpChangeLogImage != null) {
                FwNode fwNode = new FwNode(value, strDumpChangeLogImage);
                this.k.remove(fwNode);
                this.k.add(fwNode);
            }
            Collections.sort(this.k);
            for (FwNode fwNode2 : this.k) {
                HMLog.i(p, "path: " + fwNode2.a + ", fwType: " + HMFirmwareType.fromValue(fwNode2.fwType), new Object[0]);
                arrayList.add(new MidongFwHeaderEncoder(fwNode2.a, HMFirmwareType.fromValue(fwNode2.fwType)));
            }
            MidongUihEncoder midongUihEncoder = new MidongUihEncoder(4, 0, 0, true);
            midongUihEncoder.setChildEncoder(arrayList);
            String path = midongUihEncoder.getPath();
            this.d = path;
            return path;
        } catch (Exception e) {
            HMLog.e(p, e, "getFwFilePath", new Object[0]);
            return null;
        }
    }

    public List<FwNode> getFwNodes() {
        return this.k;
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHMFwUpgradeInfo
    public int getFwType() {
        return this.b;
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHMFwUpgradeInfo
    public String getFwVersionName() {
        return this.e;
    }

    public int getLocalFlag() {
        return this.h;
    }

    public String getLocalVersion() {
        return this.f;
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHMFwUpgradeInfo
    public boolean isForceUpgrade() {
        return this.i;
    }

    public boolean isSilent() {
        return this.m;
    }

    public boolean isSupportPresetFirmwareInformation() {
        return this.o;
    }

    public void setBuildTime(int i) {
        this.l = i;
    }

    public void setDeviceSource(HMDeviceSource hMDeviceSource) {
        this.a = hMDeviceSource;
    }

    public void setFilePath(String str) {
        this.d = str;
    }

    public void setFirmwareType(HMFirmwareType hMFirmwareType) {
        this.n = hMFirmwareType;
    }

    public void setForceUpgrade(boolean z) {
        this.i = z;
    }

    public void setFwType(int i) {
        this.b = i;
    }

    public void setSilent(boolean z) {
        this.m = z;
    }

    public void setSupportPresetFirmwareInformation(boolean z) {
        this.o = z;
    }

    public void setmChangeLog(String str) {
        this.j = str;
    }

    public String toString() {
        return "HMFwUpgradeInfo{mDeviceSource=" + this.a + ", mFwType=" + this.b + ", mContext=" + this.c + ", mFwFilePath = " + this.d + ", isForceUpgrade = " + this.i + i.d;
    }

    @NonNull
    @VisibleForTesting
    public static String getChangeLogForApp(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            str = null;
        } else {
            String[] strArrSplit = str.split(CHANGE_LOG_SPLITTER);
            if (strArrSplit.length > 0) {
                str = strArrSplit[0];
            }
        }
        return TextUtils.isEmpty(str) ? "" : str;
    }

    @Override // java.lang.Comparable
    public int compareTo(HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo) {
        return (255 - hMFwOnlineUpgradeInfo.n.getValue()) & this.n.getValue() & 255;
    }

    public HMFwOnlineUpgradeInfo(Context context, HMDeviceSource hMDeviceSource, int i, String str, String str2, String str3, int i2, int i3, boolean z, String str4) {
        this.a = hMDeviceSource;
        this.b = i;
        this.d = str;
        this.c = context.getApplicationContext();
        this.e = str2;
        this.f = str3;
        this.g = i2;
        this.h = i3;
        this.i = z;
        this.j = str4;
    }
}

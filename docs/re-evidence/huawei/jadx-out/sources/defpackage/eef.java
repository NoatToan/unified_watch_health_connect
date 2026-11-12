package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eef extends eec {
    private List<eeg> mConfigInfoList = new ArrayList(5);

    public List<eeg> getConfigInfoList() {
        return this.mConfigInfoList;
    }

    public void setConfigInfoList(List<eeg> list) {
        this.mConfigInfoList = list;
    }

    private String getConfigInfoString() {
        List<eeg> list = this.mConfigInfoList;
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(5);
        Iterator<eeg> it = this.mConfigInfoList.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            sb.append(", ");
        }
        return sb.toString();
    }

    @Override // defpackage.eec
    public String toString() {
        return "SampleConfig {mSrcPkgName=" + getSrcPkgName() + ", mWearPkgName=" + getWearPkgName() + ", mCommandId=" + getCommandId() + ", mConfigInfoList=" + getConfigInfoString() + '}';
    }
}

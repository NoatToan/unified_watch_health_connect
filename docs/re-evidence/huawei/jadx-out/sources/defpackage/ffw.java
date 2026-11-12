package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ffw {

    @SerializedName("groupList")
    private List<ffx> mGroupLists;

    @SerializedName("version")
    private long mVersion;

    public long getVersion() {
        return this.mVersion;
    }

    public List<ffx> getGroupLists() {
        return this.mGroupLists;
    }
}

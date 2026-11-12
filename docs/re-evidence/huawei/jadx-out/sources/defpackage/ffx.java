package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.h5pro.jsmodules.complaint.ComplaintConstants;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ffx {

    @SerializedName("courseList")
    private List<ffy> mCourseInfoList;

    @SerializedName(ComplaintConstants.GROUP_NAME_PARAM_KEY)
    private String mGroupName;

    public String getGroupName() {
        return this.mGroupName;
    }

    public List<ffy> getCourseInfoList() {
        return this.mCourseInfoList;
    }
}

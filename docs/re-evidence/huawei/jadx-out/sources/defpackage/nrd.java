package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwonesdk.datastructure.request.DataType;
import com.huawei.hwonesdk.datastructure.request.SyncDataModel;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nrd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("syncTimeRange")
    nqp f43510a;

    @SerializedName("syncDataType")
    List<DataType> d;

    @SerializedName("syncDataModel")
    List<SyncDataModel> e;

    public List<DataType> e() {
        return this.d;
    }
}

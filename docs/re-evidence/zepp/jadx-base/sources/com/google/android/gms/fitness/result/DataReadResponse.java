package com.google.android.gms.fitness.result;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DataReadResponse extends Response<DataReadResult> {
    @RecentlyNonNull
    public List<Bucket> getBuckets() {
        return getResult().getBuckets();
    }

    @RecentlyNonNull
    public DataSet getDataSet(@RecentlyNonNull DataType dataType) {
        return getResult().getDataSet(dataType);
    }

    @RecentlyNonNull
    public List<DataSet> getDataSets() {
        return getResult().getDataSets();
    }

    @RecentlyNonNull
    public Status getStatus() {
        return getResult().getStatus();
    }

    @RecentlyNonNull
    public DataSet getDataSet(@RecentlyNonNull DataSource dataSource) {
        return getResult().getDataSet(dataSource);
    }
}

package com.google.android.gms.fitness.result;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SessionReadResponse extends Response<SessionReadResult> {
    @ShowFirstParty
    public SessionReadResponse() {
    }

    @RecentlyNonNull
    public List<DataSet> getDataSet(@RecentlyNonNull Session session, @RecentlyNonNull DataType dataType) {
        return getResult().getDataSet(session, dataType);
    }

    @RecentlyNonNull
    public List<Session> getSessions() {
        return getResult().getSessions();
    }

    @RecentlyNonNull
    public Status getStatus() {
        return getResult().getStatus();
    }

    @RecentlyNonNull
    public List<DataSet> getDataSet(@RecentlyNonNull Session session) {
        return getResult().getDataSet(session);
    }
}

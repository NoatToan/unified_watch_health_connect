package com.huami.passport.data.repository.datasource;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public class AccountDataStoreFactory {
    private final Context context;

    public AccountDataStoreFactory(@NonNull Context context) {
        this.context = context;
    }

    public AccountDataStore createDiskDataStore() {
        return new DiskAccountDataStore(this.context);
    }
}

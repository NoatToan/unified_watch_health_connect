package com.tekartik.sqflite.operation;

import com.tekartik.sqflite.SqlCommand;

/* JADX INFO: loaded from: classes18.dex */
public interface Operation extends OperationResult {
    <T> T getArgument(String str);

    boolean getContinueOnError();

    Boolean getInTransaction();

    String getMethod();

    boolean getNoResult();

    SqlCommand getSqlCommand();
}

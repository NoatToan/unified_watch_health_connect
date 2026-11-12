package com.ingenic.iwds.datatransactor;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class ParcelTransactor<T extends Parcelable> extends DataTransactor {
    /* JADX WARN: Multi-variable type inference failed */
    public ParcelTransactor(Context context, Parcelable.Creator<T> creator, DataTransactor.DataTransactorCallback dataTransactorCallback, String str) {
        super(context, dataTransactorCallback, str);
        this.m_parcelableCreator = creator;
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor
    public boolean isStarted() {
        return super.isStarted();
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor
    public void send(Object obj) {
        super.send(obj);
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor
    public void start() {
        super.start();
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor
    public void stop() {
        super.stop();
    }
}
